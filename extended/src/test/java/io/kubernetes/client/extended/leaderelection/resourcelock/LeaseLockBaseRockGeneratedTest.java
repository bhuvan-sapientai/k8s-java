package io.kubernetes.client.extended.leaderelection.resourcelock;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1Lease;
import static org.mockito.Mockito.doReturn;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import io.kubernetes.client.extended.leaderelection.LeaderElectionRecord;
import io.kubernetes.client.openapi.ApiException;
import static org.mockito.Mockito.doThrow;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import org.mockito.MockedStatic;
import io.kubernetes.client.openapi.apis.CoordinationV1Api;
import java.net.HttpURLConnection;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import java.util.Collections;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import io.kubernetes.client.openapi.models.V1LeaseSpec;
import io.kubernetes.client.openapi.models.V1OwnerReference;
import java.time.OffsetDateTime;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class LeaseLockBaseRockGeneratedTest {

    @Mock
    private CoordinationV1Api coordinationV1Api;

    @Mock
    private ApiClient apiClient;

    private LeaseLock leaseLock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        leaseLock = new LeaseLock("test-namespace", "test-name", "test-identity", apiClient);
    }

    //BaseRock generated method id: ${testConstructorWithDefaultApiClient}, hash: 4EC42ACBF7652560FBC7D5B593209D2F
    @Test
    void testConstructorWithDefaultApiClient() {
        try (MockedStatic<Configuration> mockedConfiguration = mockStatic(Configuration.class)) {
            mockedConfiguration.when(Configuration::getDefaultApiClient).thenReturn(apiClient);
            LeaseLock leaseLock = new LeaseLock("test-namespace", "test-name", "test-identity");
            assertThat(leaseLock, is(notNullValue()));
        }
    }

    //BaseRock generated method id: ${testGet}, hash: 3F84CFB805CC6A0FD939F299F15D2B3C
    @Test
    void testGet() throws ApiException, NoSuchFieldException, IllegalAccessException {
        V1Lease mockLease = mock(V1Lease.class);
        V1LeaseSpec mockLeaseSpec = mock(V1LeaseSpec.class);
        CoordinationV1Api.APIreadNamespacedLeaseRequest readRequest = mock(CoordinationV1Api.APIreadNamespacedLeaseRequest.class);
        doReturn(readRequest).when(coordinationV1Api).readNamespacedLease(anyString(), anyString());
        doReturn(mockLease).when(readRequest).execute();
        when(mockLease.getSpec()).thenReturn(mockLeaseSpec);
        when(mockLeaseSpec.getAcquireTime()).thenReturn(OffsetDateTime.now());
        when(mockLeaseSpec.getRenewTime()).thenReturn(OffsetDateTime.now());
        when(mockLeaseSpec.getHolderIdentity()).thenReturn("test-holder");
        when(mockLeaseSpec.getLeaseTransitions()).thenReturn(1);
        when(mockLeaseSpec.getLeaseDurationSeconds()).thenReturn(60);
        java.lang.reflect.Field field = LeaseLock.class.getDeclaredField("coordinationV1Api");
        field.setAccessible(true);
        field.set(leaseLock, coordinationV1Api);
        LeaderElectionRecord result = leaseLock.get();
        assertThat(result, is(notNullValue()));
        assertThat(result.getHolderIdentity(), is(equalTo("test-holder")));
        assertThat(result.getLeaderTransitions(), is(equalTo(1)));
        assertThat(result.getLeaseDurationSeconds(), is(equalTo(60)));
    }

    //BaseRock generated method id: ${testGetThrowsApiException}, hash: 9864BA35AD72F12AA153BAB4AB60931C
    @Test
    void testGetThrowsApiException() throws Exception {
        CoordinationV1Api.APIreadNamespacedLeaseRequest readRequest = mock(CoordinationV1Api.APIreadNamespacedLeaseRequest.class);
        doReturn(readRequest).when(coordinationV1Api).readNamespacedLease(anyString(), anyString());
        doThrow(new ApiException("API Error")).when(readRequest).execute();
        java.lang.reflect.Field field = LeaseLock.class.getDeclaredField("coordinationV1Api");
        field.setAccessible(true);
        field.set(leaseLock, coordinationV1Api);
        assertThrows(ApiException.class, () -> leaseLock.get());
    }

    //BaseRock generated method id: ${testCreate}, hash: 3BFBDEA67AC822FC4842966CA61E6CAE
    @Test
    void testCreate() throws Exception {
        V1Lease mockLease = mock(V1Lease.class);
        LeaderElectionRecord record = new LeaderElectionRecord();
        record.setHolderIdentity("test-holder");
        record.setLeaseDurationSeconds(60);
        record.setLeaderTransitions(1);
        record.setAcquireTime(new Date());
        record.setRenewTime(new Date());
        record.setOwnerReference(new V1OwnerReference());
        CoordinationV1Api.APIcreateNamespacedLeaseRequest createRequest = mock(CoordinationV1Api.APIcreateNamespacedLeaseRequest.class);
        doReturn(createRequest).when(coordinationV1Api).createNamespacedLease(anyString(), any(V1Lease.class));
        doReturn(mockLease).when(createRequest).execute();
        java.lang.reflect.Field field = LeaseLock.class.getDeclaredField("coordinationV1Api");
        field.setAccessible(true);
        field.set(leaseLock, coordinationV1Api);
        boolean result = leaseLock.create(record);
        assertTrue(result);
        verify(coordinationV1Api, times(1)).createNamespacedLease(anyString(), any(V1Lease.class));
    }

    //BaseRock generated method id: ${testCreateWithConflict}, hash: 79BC4191748AF0B7C074406A29B91DA1
    @Test
    void testCreateWithConflict() throws Exception {
        LeaderElectionRecord record = new LeaderElectionRecord();
        ApiException apiException = new ApiException(HttpURLConnection.HTTP_CONFLICT, "Conflict");
        CoordinationV1Api.APIcreateNamespacedLeaseRequest createRequest = mock(CoordinationV1Api.APIcreateNamespacedLeaseRequest.class);
        doReturn(createRequest).when(coordinationV1Api).createNamespacedLease(anyString(), any(V1Lease.class));
        doThrow(apiException).when(createRequest).execute();
        java.lang.reflect.Field field = LeaseLock.class.getDeclaredField("coordinationV1Api");
        field.setAccessible(true);
        field.set(leaseLock, coordinationV1Api);
        boolean result = leaseLock.create(record);
        assertFalse(result);
    }

    //BaseRock generated method id: ${testUpdate}, hash: 49C4A392CEA05F9C2AE90570574E382E
    @Disabled()
    @Test
    void testUpdate() throws Exception {
        V1Lease mockLease = mock(V1Lease.class);
        LeaderElectionRecord record = new LeaderElectionRecord();
        record.setHolderIdentity("test-holder");
        record.setLeaseDurationSeconds(60);
        record.setLeaderTransitions(1);
        record.setAcquireTime(new Date());
        record.setRenewTime(new Date());
        CoordinationV1Api.APIreplaceNamespacedLeaseRequest replaceRequest = mock(CoordinationV1Api.APIreplaceNamespacedLeaseRequest.class);
        doReturn(replaceRequest).when(coordinationV1Api).replaceNamespacedLease(anyString(), anyString(), any(V1Lease.class));
        doReturn(mockLease).when(replaceRequest).execute();
        java.lang.reflect.Field field = LeaseLock.class.getDeclaredField("coordinationV1Api");
        field.setAccessible(true);
        field.set(leaseLock, coordinationV1Api);
        boolean result = leaseLock.update(record);
        assertTrue(result);
        verify(coordinationV1Api, times(1)).replaceNamespacedLease(anyString(), anyString(), any(V1Lease.class));
    }

    //BaseRock generated method id: ${testUpdateWithConflict}, hash: 784D3AF84090433B626FB109282AC746
    @Disabled()
    @Test
    void testUpdateWithConflict() throws Exception {
        LeaderElectionRecord record = new LeaderElectionRecord();
        ApiException apiException = new ApiException(HttpURLConnection.HTTP_CONFLICT, "Conflict");
        CoordinationV1Api.APIreplaceNamespacedLeaseRequest replaceRequest = mock(CoordinationV1Api.APIreplaceNamespacedLeaseRequest.class);
        doReturn(replaceRequest).when(coordinationV1Api).replaceNamespacedLease(anyString(), anyString(), any(V1Lease.class));
        doThrow(apiException).when(replaceRequest).execute();
        java.lang.reflect.Field field = LeaseLock.class.getDeclaredField("coordinationV1Api");
        field.setAccessible(true);
        field.set(leaseLock, coordinationV1Api);
        boolean result = leaseLock.update(record);
        assertFalse(result);
    }

    //BaseRock generated method id: ${testIdentity}, hash: 6C9E097CA556ECECF6B36487EB77B060
    @Test
    void testIdentity() {
        String result = leaseLock.identity();
        assertThat(result, is(equalTo("test-identity")));
    }

    //BaseRock generated method id: ${testDescribe}, hash: 8566B39CE24757AB9547B2B5B36F6344
    @Test
    void testDescribe() {
        String result = leaseLock.describe();
        assertThat(result, is(equalTo("test-namespace/test-name")));
    }
}
