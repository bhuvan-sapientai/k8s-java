package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiClient;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.ApiResponse;
import org.mockito.Mock;
import org.junit.jupiter.api.Disabled;
import io.kubernetes.client.openapi.models.V1APIGroup;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import io.kubernetes.client.openapi.ApiCallback;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import okhttp3.Call;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class DiscoveryApiBaseRockGeneratedTest {

    @Mock
    private ApiClient mockApiClient;

    @Mock
    private Call mockCall;

    private DiscoveryApi discoveryApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        discoveryApi = new DiscoveryApi(mockApiClient);
    }

    //BaseRock generated method id: ${testGetAPIGroup}, hash: DAC0B1DA755C1D1485BE8903287699EF
    @Disabled
    @Test
    void testGetAPIGroup() throws ApiException {
        // Arrange
        //V1APIGroup expectedApiGroup = new V1APIGroup();
        //ApiResponse<V1APIGroup> expectedResponse = new ApiResponse<>(200, new HashMap<>(), expectedApiGroup);
        //when(mockApiClient.buildCall(anyString(), anyString(), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any())).thenReturn(mockCall);
        //when(mockApiClient.execute(any(Call.class), any())).thenReturn(expectedResponse);
        // Act
        //V1APIGroup result = discoveryApi.getAPIGroup().execute();
        // Assert
        //assertNotNull(result);
        //assertEquals(expectedApiGroup, result);
        //verify(mockApiClient).buildCall(anyString(), eq("/apis/discovery.k8s.io/"), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any());
        //verify(mockApiClient).execute(eq(mockCall), any());
    }

    //BaseRock generated method id: ${testGetAPIGroupAsync}, hash: 8FFE85793098067CDD02A418F4B09635
    @Test
    void testGetAPIGroupAsync() throws ApiException {
        // Arrange
        ApiCallback<V1APIGroup> mockCallback = mock(ApiCallback.class);
        when(mockApiClient.buildCall(eq(null), eq("/apis/discovery.k8s.io/"), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any())).thenReturn(mockCall);
        doNothing().when(mockApiClient).executeAsync(eq(mockCall), any(), eq(mockCallback));
        // Act
        Call result = discoveryApi.getAPIGroup().executeAsync(mockCallback);
        // Assert
        assertNotNull(result);
        assertEquals(mockCall, result);
        verify(mockApiClient).buildCall(eq(null), eq("/apis/discovery.k8s.io/"), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any());
        verify(mockApiClient).executeAsync(eq(mockCall), any(), eq(mockCallback));
    }

    //BaseRock generated method id: ${testGetAPIGroupWithHttpInfo}, hash: CE801AF0656677CE8E62F3281E8E08D2
    @Disabled
    @Test
    void testGetAPIGroupWithHttpInfo() throws ApiException {
        // Arrange
        //V1APIGroup expectedApiGroup = new V1APIGroup();
        //ApiResponse<V1APIGroup> expectedResponse = new ApiResponse<>(200, new HashMap<>(), expectedApiGroup);
        //when(mockApiClient.buildCall(anyString(), anyString(), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any())).thenReturn(mockCall);
        //when(mockApiClient.execute(any(Call.class), any())).thenReturn(expectedResponse);
        // Act
        //ApiResponse<V1APIGroup> result = discoveryApi.getAPIGroup().executeWithHttpInfo();
        // Assert
        //assertNotNull(result);
        //assertEquals(expectedResponse.getStatusCode(), result.getStatusCode());
        //assertEquals(expectedResponse.getHeaders(), result.getHeaders());
        //assertEquals(expectedResponse.getData(), result.getData());
        //verify(mockApiClient).buildCall(anyString(), eq("/apis/discovery.k8s.io/"), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any());
        //verify(mockApiClient).execute(eq(mockCall), any());
    }

    //BaseRock generated method id: ${testGetApiClient}, hash: DB8788A0FCE5D8F862775A49FDC0305E
    @Test
    void testGetApiClient() {
        // Act
        ApiClient result = discoveryApi.getApiClient();
        // Assert
        assertNotNull(result);
        assertEquals(mockApiClient, result);
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: F6F671CC307109BA60A572709C6D8B67
    @Test
    void testSetApiClient() {
        // Arrange
        ApiClient newApiClient = mock(ApiClient.class);
        // Act
        discoveryApi.setApiClient(newApiClient);
        // Assert
        assertEquals(newApiClient, discoveryApi.getApiClient());
    }

    //BaseRock generated method id: ${testGetHostIndex}, hash: A9334023C0FF79980ED468360C1B007F
    @Test
    void testGetHostIndex() {
        // Act
        int result = discoveryApi.getHostIndex();
        // Assert
        assertEquals(0, result);
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: 5C7C2700E1235C0EA334C8A39CB54100
    @Test
    void testSetHostIndex() {
        // Arrange
        int newHostIndex = 1;
        // Act
        discoveryApi.setHostIndex(newHostIndex);
        // Assert
        assertEquals(newHostIndex, discoveryApi.getHostIndex());
    }

    //BaseRock generated method id: ${testGetCustomBaseUrl}, hash: FCC89E6E384A23F6939DAA9B8EA59616
    @Test
    void testGetCustomBaseUrl() {
        // Act
        String result = discoveryApi.getCustomBaseUrl();
        // Assert
        assertNull(result);
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: 906CD92DB0E1F077DDBCB0B295026A9B
    @Test
    void testSetCustomBaseUrl() {
        // Arrange
        String newCustomBaseUrl = "https://api.example.com";
        // Act
        discoveryApi.setCustomBaseUrl(newCustomBaseUrl);
        // Assert
        assertEquals(newCustomBaseUrl, discoveryApi.getCustomBaseUrl());
    }
}
