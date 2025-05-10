package io.kubernetes.client.extended.leaderelection.resourcelock;

import io.kubernetes.client.openapi.ApiClient;
import java.net.HttpURLConnection;
import io.kubernetes.client.openapi.models.V1Endpoints;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import java.util.Date;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.extended.leaderelection.LeaderElectionRecord;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import io.kubernetes.client.openapi.models.V1OwnerReference;
import static org.junit.jupiter.api.Assertions.*;
import io.kubernetes.client.openapi.JSON;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class EndpointsLockBaseRockGeneratedTest {

    @Mock
    private CoreV1Api mockCoreV1Client;

    @Mock
    private ApiClient mockApiClient;

    @Mock
    private JSON mockJson;

    private EndpointsLock endpointsLock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        when(mockCoreV1Client.getApiClient()).thenReturn(mockApiClient);
        when(mockApiClient.getJSON()).thenReturn(mockJson);
        endpointsLock = new EndpointsLock("testNamespace", "testName", "testIdentity", mockApiClient);
    }

    //BaseRock generated method id: ${testGet}, hash: 7207CA3E4F77B93B42A5D35FBC09BEFF
    @Test
    void testGet() throws ApiException {
        V1Endpoints mockEndpoints = mock(V1Endpoints.class);
        V1ObjectMeta mockMetadata = mock(V1ObjectMeta.class);
        Map<String, String> annotations = new HashMap<>();
        annotations.put("control-plane.alpha.kubernetes.io/leader", "{\"holderIdentity\":\"testIdentity\"}");
        when(mockCoreV1Client.readNamespacedEndpoints(anyString(), anyString(), any(), any(), any())).thenReturn(mockEndpoints);
        when(mockEndpoints.getMetadata()).thenReturn(mockMetadata);
        when(mockMetadata.getAnnotations()).thenReturn(annotations);
        when(mockJson.deserialize(anyString(), eq(LeaderElectionRecord.class))).thenReturn(new LeaderElectionRecord("testIdentity", 15, new Date(), new Date(), 1));
        LeaderElectionRecord result = endpointsLock.get();
        assertNotNull(result);
        assertEquals("testIdentity", result.getHolderIdentity());
        verify(mockCoreV1Client).readNamespacedEndpoints("testName", "testNamespace", null, null, null);
    }

    //BaseRock generated method id: ${testGetWithEmptyAnnotations}, hash: C003D2EB827ABCEB3D5D8D949955F255
    @Test
    void testGetWithEmptyAnnotations() throws ApiException {
        V1Endpoints mockEndpoints = mock(V1Endpoints.class);
        V1ObjectMeta mockMetadata = mock(V1ObjectMeta.class);
        when(mockCoreV1Client.readNamespacedEndpoints(anyString(), anyString(), any(), any(), any())).thenReturn(mockEndpoints);
        when(mockEndpoints.getMetadata()).thenReturn(mockMetadata);
        when(mockMetadata.getAnnotations()).thenReturn(null);
        LeaderElectionRecord result = endpointsLock.get();
        assertNotNull(result);
        assertNull(result.getHolderIdentity());
    }

    //BaseRock generated method id: ${testCreate}, hash: 8AEB4FAC60A6A8D0E09A3C52D167986B
    @Test
    void testCreate() throws ApiException {
        LeaderElectionRecord record = new LeaderElectionRecord("testIdentity", 15, new Date(), new Date(), 1);
        V1Endpoints mockEndpoints = mock(V1Endpoints.class);
        when(mockJson.serialize(any())).thenReturn("serializedRecord");
        when(mockCoreV1Client.createNamespacedEndpoints(anyString(), any(), any(), any(), any(), any())).thenReturn(mockEndpoints);
        boolean result = endpointsLock.create(record);
        assertTrue(result);
        verify(mockCoreV1Client).createNamespacedEndpoints(eq("testNamespace"), any(), null, null, null, null);
    }

    //BaseRock generated method id: ${testCreateWithConflict}, hash: E9489BA7EAD542F9A68E91E2B5F6CF53
    @Test
    void testCreateWithConflict() throws ApiException {
        LeaderElectionRecord record = new LeaderElectionRecord("testIdentity", 15, new Date(), new Date(), 1);
        when(mockJson.serialize(any())).thenReturn("serializedRecord");
        when(mockCoreV1Client.createNamespacedEndpoints(anyString(), any(), any(), any(), any(), any())).thenThrow(new ApiException(HttpURLConnection.HTTP_CONFLICT, "Conflict"));
        boolean result = endpointsLock.create(record);
        assertFalse(result);
    }

    //BaseRock generated method id: ${testUpdate}, hash: D01AEB17086D132C7FE9A3C425A5DC22
    @Test
    void testUpdate() throws ApiException {
        LeaderElectionRecord record = new LeaderElectionRecord("testIdentity", 15, new Date(), new Date(), 1);
        V1Endpoints mockEndpoints = mock(V1Endpoints.class);
        V1ObjectMeta mockMetadata = mock(V1ObjectMeta.class);
        when(mockEndpoints.getMetadata()).thenReturn(mockMetadata);
        when(mockJson.serialize(any())).thenReturn("serializedRecord");
        when(mockCoreV1Client.replaceNamespacedEndpoints(anyString(), anyString(), any(), any(), any(), any(), any())).thenReturn(mockEndpoints);
        boolean result = endpointsLock.update(record);
        assertTrue(result);
        verify(mockCoreV1Client).replaceNamespacedEndpoints(eq("testName"), eq("testNamespace"), any(), null, null, null, null);
    }

    //BaseRock generated method id: ${testUpdateWithConflict}, hash: 3FAB258C486F96F1ECA4ADD35472C618
    @Test
    void testUpdateWithConflict() throws ApiException {
        LeaderElectionRecord record = new LeaderElectionRecord("testIdentity", 15, new Date(), new Date(), 1);
        V1Endpoints mockEndpoints = mock(V1Endpoints.class);
        V1ObjectMeta mockMetadata = mock(V1ObjectMeta.class);
        when(mockEndpoints.getMetadata()).thenReturn(mockMetadata);
        when(mockJson.serialize(any())).thenReturn("serializedRecord");
        when(mockCoreV1Client.replaceNamespacedEndpoints(anyString(), anyString(), any(), any(), any(), any(), any())).thenThrow(new ApiException(HttpURLConnection.HTTP_CONFLICT, "Conflict"));
        boolean result = endpointsLock.update(record);
        assertFalse(result);
    }

    //BaseRock generated method id: ${testIdentity}, hash: 21E34A5F08D9621B560D1FEEB6933981
    @Test
    void testIdentity() {
        assertEquals("testIdentity", endpointsLock.identity());
    }

    //BaseRock generated method id: ${testDescribe}, hash: 3163EEB2E8C5AEE4E3430DABA64FFC57
    @Test
    void testDescribe() {
        assertEquals("testNamespace/testName", endpointsLock.describe());
    }

    //BaseRock generated method id: ${testCreateWithOwnerReference}, hash: 87FC5BA16F75EE7A4EF025EE3A49775D
    @Test
    void testCreateWithOwnerReference() throws ApiException {
        V1OwnerReference ownerReference = new V1OwnerReference();
        LeaderElectionRecord record = new LeaderElectionRecord("testIdentity", 15, new Date(), new Date(), 1, ownerReference);
        V1Endpoints mockEndpoints = mock(V1Endpoints.class);
        when(mockJson.serialize(any())).thenReturn("serializedRecord");
        when(mockCoreV1Client.createNamespacedEndpoints(anyString(), any(), any(), any(), any(), any())).thenReturn(mockEndpoints);
        boolean result = endpointsLock.create(record);
        assertTrue(result);
        verify(mockCoreV1Client).createNamespacedEndpoints(eq("testNamespace"), argThat(endpoints -> endpoints.getMetadata().getOwnerReferences() != null && endpoints.getMetadata().getOwnerReferences().size() == 1 && endpoints.getMetadata().getOwnerReferences().get(0).equals(ownerReference)), null, null, null, null);
    }

    //BaseRock generated method id: ${testConstructorWithDefaultApiClient}, hash: DCE9CC50BB7418D30B59B08CA84A2779
    @Test
    void testConstructorWithDefaultApiClient() {
        EndpointsLock lock = new EndpointsLock("testNamespace", "testName", "testIdentity");
        assertNotNull(lock);
    }
}
