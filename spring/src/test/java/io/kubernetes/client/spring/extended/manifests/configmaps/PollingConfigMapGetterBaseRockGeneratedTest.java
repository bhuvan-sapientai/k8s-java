package io.kubernetes.client.spring.extended.manifests.configmaps;

// import io.kubernetes.client.openapi.ApiClient;
// import org.junit.jupiter.api.BeforeEach;
// import static org.mockito.ArgumentMatchers.any;
// import org.junit.jupiter.api.Test;
// import io.kubernetes.client.apimachinery.NamespaceName;
// import io.kubernetes.client.openapi.apis.CoreV1Api;
// import io.kubernetes.client.openapi.models.V1ConfigMap;
// import org.mockito.Mock;
// import org.junit.jupiter.api.Timeout;
// import static org.hamcrest.Matchers.notNullValue;
// import io.kubernetes.client.openapi.ApiException;
// import com.github.benmanes.caffeine.cache.Caffeine;
// import org.mockito.MockitoAnnotations;
// import static org.hamcrest.MatcherAssert.assertThat;
// import static org.mockito.ArgumentMatchers.anyString;
// import java.util.function.Function;
// import java.time.Duration;
// import com.github.benmanes.caffeine.cache.Cache;
// import org.mockito.MockedStatic;
// import static org.mockito.Mockito.*;
// import static org.hamcrest.Matchers.is;
// import static org.hamcrest.Matchers.startsWith;
// import static org.hamcrest.Matchers.endsWith;
// import static org.mockito.ArgumentMatchers.any;
// import static org.mockito.ArgumentMatchers.eq;

// @Timeout(10)
class PollingConfigMapGetterBaseRockGeneratedTest {

//     @Mock
//     private ApiClient apiClient;

//     @Mock
//     private CoreV1Api coreV1Api;

//     @Mock
//     private Cache<NamespaceName, V1ConfigMap> cacheMock;

//     private PollingConfigMapGetter pollingConfigMapGetter;

//     @BeforeEach
//     void setUp() {
//         MockitoAnnotations.openMocks(this);
//         pollingConfigMapGetter = new PollingConfigMapGetter();
//         pollingConfigMapGetter.apiClient = apiClient;
//     }

//     //BaseRock generated method id: ${testGet}, hash: F41ACC9BCBA7D367BC1FDD17F2D7D556
//     @Test
//     void testGet() throws ApiException {
//         String namespace = "test-namespace";
//         String name = "test-name";
//         V1ConfigMap expectedConfigMap = new V1ConfigMap();
//         try (MockedStatic<Caffeine> mockedCaffeine = mockStatic(Caffeine.class)) {
//             Caffeine<Object, Object> caffeine = mock(Caffeine.class);
//             mockedCaffeine.when(Caffeine::newBuilder).thenReturn(caffeine);
//             when(caffeine.expireAfterWrite(any(Duration.class))).thenReturn(caffeine);
//             when(caffeine.build()).thenReturn(cacheMock);
//             CoreV1Api.APIreadNamespacedConfigMapRequest apiRequest = mock(CoreV1Api.APIreadNamespacedConfigMapRequest.class);
//             when(coreV1Api.readNamespacedConfigMap(anyString(), anyString())).thenReturn(apiRequest);
//             when(apiRequest.execute()).thenReturn(expectedConfigMap);
//             doReturn(coreV1Api).when(apiClient).adapt(CoreV1Api.class);
//             when(cacheMock.get(any(NamespaceName.class), any(Function.class))).thenReturn(expectedConfigMap);
//             V1ConfigMap result = pollingConfigMapGetter.get(namespace, name);
//             assertThat(result, is(notNullValue()));
//             assertThat(result, is(expectedConfigMap));
//             verify(cacheMock, times(1)).get(any(NamespaceName.class), any(Function.class));
//         }
//     }

//     //BaseRock generated method id: ${testGetCacheHit}, hash: BF67F5C524717B78AB7123E13FFE7D4D
//     @Test
//     void testGetCacheHit() throws ApiException {
//         String namespace = "test-namespace";
//         String name = "test-name";
//         V1ConfigMap expectedConfigMap = new V1ConfigMap();
//         try (MockedStatic<Caffeine> mockedCaffeine = mockStatic(Caffeine.class)) {
//             Caffeine<Object, Object> caffeine = mock(Caffeine.class);
//             mockedCaffeine.when(Caffeine::newBuilder).thenReturn(caffeine);
//             when(caffeine.expireAfterWrite(any(Duration.class))).thenReturn(caffeine);
//             when(caffeine.build()).thenReturn(cacheMock);
//             when(cacheMock.get(any(NamespaceName.class), any(Function.class))).thenReturn(expectedConfigMap);
//             V1ConfigMap result = pollingConfigMapGetter.get(namespace, name);
//             assertThat(result, is(notNullValue()));
//             assertThat(result, is(expectedConfigMap));
//             verify(cacheMock, times(1)).get(any(NamespaceName.class), any(Function.class));
//             verify(apiClient, times(0)).adapt(CoreV1Api.class);
//         }
//     }

//     //BaseRock generated method id: ${testGetApiException}, hash: 758A0374ADD8B1D2E5B04BE91E4D074A
//     @Test
//     void testGetApiException() throws ApiException {
//         String namespace = "test-namespace";
//         String name = "test-name";
//         ApiException apiException = new ApiException("API Error");
//         try (MockedStatic<Caffeine> mockedCaffeine = mockStatic(Caffeine.class)) {
//             Caffeine<Object, Object> caffeine = mock(Caffeine.class);
//             mockedCaffeine.when(Caffeine::newBuilder).thenReturn(caffeine);
//             when(caffeine.expireAfterWrite(any(Duration.class))).thenReturn(caffeine);
//             when(caffeine.build()).thenReturn(cacheMock);
//             CoreV1Api.APIreadNamespacedConfigMapRequest apiRequest = mock(CoreV1Api.APIreadNamespacedConfigMapRequest.class);
//             when(coreV1Api.readNamespacedConfigMap(anyString(), anyString())).thenReturn(apiRequest);
//             when(apiRequest.execute()).thenThrow(apiException);
//             doReturn(coreV1Api).when(apiClient).adapt(CoreV1Api.class);
//             when(cacheMock.get(any(NamespaceName.class), any(Function.class))).thenThrow(new IllegalStateException(apiException));
//             try {
//                 pollingConfigMapGetter.get(namespace, name);
//             } catch (IllegalStateException e) {
//                 assertThat(e.getCause(), is(apiException));
//             }
//             verify(cacheMock, times(1)).get(any(NamespaceName.class), any(Function.class));
//         }
//     }
}