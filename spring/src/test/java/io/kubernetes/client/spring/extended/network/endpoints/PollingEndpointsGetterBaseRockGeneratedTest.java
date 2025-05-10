package io.kubernetes.client.spring.extended.network.endpoints;

// import io.kubernetes.client.openapi.ApiClient;
// import io.kubernetes.client.openapi.models.V1Endpoints;
// import static org.mockito.Mockito.doReturn;
// import static org.mockito.ArgumentMatchers.any;
// import static org.hamcrest.Matchers.endsWith;
// import org.junit.jupiter.api.Test;
// import io.kubernetes.client.openapi.apis.CoreV1Api;
// import org.mockito.Mock;
// import io.kubernetes.client.openapi.ApiException;
// import org.mockito.MockitoAnnotations;
// import static org.hamcrest.MatcherAssert.assertThat;
// import static org.mockito.ArgumentMatchers.anyString;
// import static org.mockito.Mockito.when;
// import static org.mockito.Mockito.times;
// import org.mockito.MockedStatic;
// import org.junit.jupiter.api.BeforeEach;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import io.kubernetes.client.apimachinery.NamespaceName;
// import static org.mockito.ArgumentMatchers.eq;
// import static org.junit.jupiter.api.Assertions.assertThrows;
// import org.junit.jupiter.api.Timeout;
// import static org.mockito.Mockito.mock;
// import com.github.benmanes.caffeine.cache.Caffeine;
// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.mockito.Mockito.mockStatic;
// import java.time.Duration;
// import com.github.benmanes.caffeine.cache.Cache;
// import static org.mockito.Mockito.verify;
// import static org.hamcrest.Matchers.startsWith;
// import static org.hamcrest.Matchers.is;
// import static org.hamcrest.Matchers.startsWith;
// import static org.hamcrest.Matchers.endsWith;
// import static org.mockito.ArgumentMatchers.any;
// import static org.mockito.ArgumentMatchers.eq;

// @Timeout(10)
class PollingEndpointsGetterBaseRockGeneratedTest {

//     @Mock
//     private ApiClient apiClient;

//     @Mock
//     private CoreV1Api coreV1Api;

//     @Mock
//     private Cache<NamespaceName, V1Endpoints> cache;

//     private PollingEndpointsGetter pollingEndpointsGetter;

//     @BeforeEach
//     void setUp() {
//         MockitoAnnotations.openMocks(this);
//         pollingEndpointsGetter = new PollingEndpointsGetter(apiClient);
//     }

//     //BaseRock generated method id: ${testGet}, hash: 10366EFC5907BEF7A4855EF9F953403B
//     @Test
//     void testGet() throws ApiException {
//         String namespace = "test-namespace";
//         String name = "test-name";
//         V1Endpoints expectedEndpoints = new V1Endpoints();
//         try (MockedStatic<Caffeine> mockedCaffeine = mockStatic(Caffeine.class)) {
//             Caffeine<Object, Object> caffeine = mock(Caffeine.class);
//             mockedCaffeine.when(Caffeine::newBuilder).thenReturn(caffeine);
//             when(caffeine.expireAfterWrite(any(Duration.class))).thenReturn(caffeine);
//             when(caffeine.build()).thenReturn(cache);
//             CoreV1Api.APIreadNamespacedEndpointsRequest request = mock(CoreV1Api.APIreadNamespacedEndpointsRequest.class);
//             when(apiClient.getApiClient()).thenReturn(apiClient);
//             doReturn(coreV1Api).when(apiClient).adapt(CoreV1Api.class);
//             when(coreV1Api.readNamespacedEndpoints(anyString(), anyString())).thenReturn(request);
//             when(request.execute()).thenReturn(expectedEndpoints);
//             when(cache.get(any(NamespaceName.class), any())).thenReturn(expectedEndpoints);
//             V1Endpoints result = pollingEndpointsGetter.get(namespace, name);
//             assertNotNull(result);
//             assertEquals(expectedEndpoints, result);
//             verify(cache, times(1)).get(any(NamespaceName.class), any());
//         }
//     }

//     //BaseRock generated method id: ${testGetWithApiException}, hash: 76B1F264A7A480538C2E033722B3A34E
//     @Test
//     void testGetWithApiException() throws ApiException {
//         String namespace = "test-namespace";
//         String name = "test-name";
//         try (MockedStatic<Caffeine> mockedCaffeine = mockStatic(Caffeine.class)) {
//             Caffeine<Object, Object> caffeine = mock(Caffeine.class);
//             mockedCaffeine.when(Caffeine::newBuilder).thenReturn(caffeine);
//             when(caffeine.expireAfterWrite(any(Duration.class))).thenReturn(caffeine);
//             when(caffeine.build()).thenReturn(cache);
//             when(apiClient.getApiClient()).thenReturn(apiClient);
//             doReturn(coreV1Api).when(apiClient).adapt(CoreV1Api.class);
//             when(cache.get(any(NamespaceName.class), any())).thenThrow(new ApiException("API Error"));
//             assertThrows(IllegalStateException.class, () -> pollingEndpointsGetter.get(namespace, name));
//             verify(cache, times(1)).get(any(NamespaceName.class), any());
//         }
//     }

//     //BaseRock generated method id: ${testConstructor}, hash: 41FEF8C4359B12D4D8A84E005C7DD944
//     @Test
//     void testConstructor() {
//         assertNotNull(pollingEndpointsGetter);
//     }
}