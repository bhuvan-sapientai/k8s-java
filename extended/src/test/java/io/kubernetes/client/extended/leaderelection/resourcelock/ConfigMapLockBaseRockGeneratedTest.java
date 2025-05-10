package io.kubernetes.client.extended.leaderelection.resourcelock;

import io.kubernetes.client.openapi.ApiClient;
import java.net.HttpURLConnection;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import java.util.Date;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1ConfigMap;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.extended.leaderelection.LeaderElectionRecord;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import io.kubernetes.client.openapi.models.V1OwnerReference;
import io.kubernetes.client.openapi.JSON;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class ConfigMapLockBaseRockGeneratedTest {

    @Mock
    private CoreV1Api mockCoreV1Client;

    @Mock
    private ApiClient mockApiClient;

    @Mock
    private JSON mockJson;

    private ConfigMapLock configMapLock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        try (MockedStatic<Configuration> mockedConfiguration = mockStatic(Configuration.class)) {
            mockedConfiguration.when(Configuration::getDefaultApiClient).thenReturn(mockApiClient);
            configMapLock = new ConfigMapLock("namespace", "name", "identity", mockApiClient);
        }
        when(mockApiClient.getJSON()).thenReturn(mockJson);
    }

    //BaseRock generated method id: ${testGet}, hash: 7F9269D2C52A7A74B8B705DB46DA59C4
    @Test
    void testGet() throws ApiException {
        V1ConfigMap mockConfigMap = mock(V1ConfigMap.class);
        V1ObjectMeta mockMetadata = mock(V1ObjectMeta.class);
        Map<String, String> annotations = new HashMap<>();
        annotations.put("control-plane.alpha.kubernetes.io/leader", "{}");
        when(mockCoreV1Client.readNamespacedConfigMap(anyString(), anyString(), anyString(), anyBoolean(), anyBoolean())).thenReturn(mockConfigMap);
        when(mockConfigMap.getMetadata()).thenReturn(mockMetadata);
        when(mockMetadata.getAnnotations()).thenReturn(annotations);
        when(mockJson.deserialize(anyString(), eq(LeaderElectionRecord.class))).thenReturn(new LeaderElectionRecord());
        LeaderElectionRecord result = configMapLock.get();
        assertThat(result, is(notNullValue()));
        verify(mockCoreV1Client).readNamespacedConfigMap("name", "namespace", null, null, null);
    }

    //BaseRock generated method id: ${testCreate}, hash: FFD916CE06503A4A6EA0EA0DDD991BC6
    @Test
    void testCreate() throws ApiException {
        LeaderElectionRecord record = new LeaderElectionRecord();
        V1ConfigMap createdConfigMap = mock(V1ConfigMap.class);
        when(mockJson.serialize(any())).thenReturn("{}");
        when(mockCoreV1Client.createNamespacedConfigMap(anyString(), any(), anyString(), anyString(), anyString(), anyBoolean())).thenReturn(createdConfigMap);
        boolean result = configMapLock.create(record);
        assertTrue(result);
        verify(mockCoreV1Client).createNamespacedConfigMap(eq("namespace"), any(), isNull(), isNull(), isNull(), isNull());
    }

    //BaseRock generated method id: ${testCreateWithConflict}, hash: E13D0C8F9967073A6A826571A77342A4
    @Test
    void testCreateWithConflict() throws ApiException {
        LeaderElectionRecord record = new LeaderElectionRecord();
        when(mockJson.serialize(any())).thenReturn("{}");
        doThrow(new ApiException(HttpURLConnection.HTTP_CONFLICT, "Conflict")).when(mockCoreV1Client).createNamespacedConfigMap(anyString(), any(), anyString(), anyString(), anyString(), anyBoolean());
        boolean result = configMapLock.create(record);
        assertFalse(result);
    }

    //BaseRock generated method id: ${testUpdate}, hash: CAA776FABAFF681878168D43B36BC063
    @Test
    void testUpdate() throws ApiException {
        LeaderElectionRecord record = new LeaderElectionRecord();
        V1ConfigMap configMap = mock(V1ConfigMap.class);
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1ConfigMap replacedConfigMap = mock(V1ConfigMap.class);
        when(configMap.getMetadata()).thenReturn(metadata);
        when(mockJson.serialize(any())).thenReturn("{}");
        when(mockCoreV1Client.replaceNamespacedConfigMap(anyString(), anyString(), any(), anyString(), anyString(), anyString(), anyBoolean())).thenReturn(replacedConfigMap);
        boolean result = configMapLock.update(record);
        assertTrue(result);
        verify(mockCoreV1Client).replaceNamespacedConfigMap(eq("name"), eq("namespace"), any(), isNull(), isNull(), isNull(), isNull());
    }

    //BaseRock generated method id: ${testUpdateWithConflict}, hash: 00B0C90B695B968F9FD98FF1971B08D6
    @Test
    void testUpdateWithConflict() throws ApiException {
        LeaderElectionRecord record = new LeaderElectionRecord();
        V1ConfigMap configMap = mock(V1ConfigMap.class);
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        when(configMap.getMetadata()).thenReturn(metadata);
        when(mockJson.serialize(any())).thenReturn("{}");
        doThrow(new ApiException(HttpURLConnection.HTTP_CONFLICT, "Conflict")).when(mockCoreV1Client).replaceNamespacedConfigMap(anyString(), anyString(), any(), anyString(), anyString(), anyString(), anyBoolean());
        boolean result = configMapLock.update(record);
        assertFalse(result);
    }

    //BaseRock generated method id: ${testIdentity}, hash: 455A908D250E1B3A7374911CF2A1565E
    @Test
    void testIdentity() {
        String result = configMapLock.identity();
        assertThat(result, is("identity"));
    }

    //BaseRock generated method id: ${testDescribe}, hash: 4A845EFD958FD1D032FD96D2A8E86F7A
    @Test
    void testDescribe() {
        String result = configMapLock.describe();
        assertThat(result, is("namespace/name"));
    }

    //BaseRock generated method id: ${testGetWithEmptyAnnotations}, hash: 7937F027E6C7E242C462425A4149D416
    @Test
    void testGetWithEmptyAnnotations() throws ApiException {
        V1ConfigMap mockConfigMap = mock(V1ConfigMap.class);
        V1ObjectMeta mockMetadata = mock(V1ObjectMeta.class);
        when(mockCoreV1Client.readNamespacedConfigMap(anyString(), anyString(), anyString(), anyBoolean(), anyBoolean())).thenReturn(mockConfigMap);
        when(mockConfigMap.getMetadata()).thenReturn(mockMetadata);
        when(mockMetadata.getAnnotations()).thenReturn(null);
        LeaderElectionRecord result = configMapLock.get();
        assertThat(result, is(notNullValue()));
        verify(mockMetadata).setAnnotations(any());
    }

    //BaseRock generated method id: ${testCreateWithOwnerReference}, hash: 8A8C4BA0D970B83AAA3146863B9E9A37
    @Test
    void testCreateWithOwnerReference() throws ApiException {
        LeaderElectionRecord record = new LeaderElectionRecord("holder", 60, new Date(), new Date(), 1, new V1OwnerReference());
        V1ConfigMap createdConfigMap = mock(V1ConfigMap.class);
        when(mockJson.serialize(any())).thenReturn("{}");
        when(mockCoreV1Client.createNamespacedConfigMap(anyString(), any(), anyString(), anyString(), anyString(), anyBoolean())).thenReturn(createdConfigMap);
        boolean result = configMapLock.create(record);
        assertTrue(result);
        verify(mockCoreV1Client).createNamespacedConfigMap(eq("namespace"), any(), isNull(), isNull(), isNull(), isNull());
    }

    //BaseRock generated method id: ${testUpdateWithApiException}, hash: 3E8C4A439BE28A2C07141168A0BB4E0B
    @Test
    void testUpdateWithApiException() throws ApiException {
        LeaderElectionRecord record = new LeaderElectionRecord();
        V1ConfigMap configMap = mock(V1ConfigMap.class);
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        when(configMap.getMetadata()).thenReturn(metadata);
        when(mockJson.serialize(any())).thenReturn("{}");
        doThrow(new ApiException("API Error")).when(mockCoreV1Client).replaceNamespacedConfigMap(anyString(), anyString(), any(), anyString(), anyString(), anyString(), anyBoolean());
        boolean result = configMapLock.update(record);
        assertFalse(result);
    }
}
