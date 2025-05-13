package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiClient;
import org.junit.jupiter.api.BeforeEach;
import java.lang.reflect.Type;
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
class NetworkingApiBaseRockGeneratedTest {

    @Mock
    private ApiClient mockApiClient;

    @Mock
    private Call mockCall;

    private NetworkingApi networkingApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        networkingApi = new NetworkingApi(mockApiClient);
    }

    //BaseRock generated method id: ${testGetAPIGroup}, hash: DAC0B1DA755C1D1485BE8903287699EF
    @Disabled
    @Test
    void testGetAPIGroup() throws ApiException {
        // Arrange
        //V1APIGroup expectedApiGroup = new V1APIGroup();
        //ApiResponse<V1APIGroup> expectedResponse = new ApiResponse<>(200, new HashMap<>(), expectedApiGroup);
        //when(mockApiClient.execute(any(Call.class), any(Type.class))).thenReturn(expectedResponse);
        //when(mockApiClient.buildCall(anyString(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any())).thenReturn(mockCall);
        // Act
        //V1APIGroup result = networkingApi.getAPIGroup().execute();
        // Assert
        //assertNotNull(result);
        //assertEquals(expectedApiGroup, result);
        //verify(mockApiClient).buildCall(eq(null), eq("/apis/networking.k8s.io/"), eq("GET"), any(), any(), eq(null), any(), any(), any(), any(), any());
        //verify(mockApiClient).execute(any(Call.class), any(Type.class));
    }

    //BaseRock generated method id: ${testGetAPIGroupAsync}, hash: 4A0DA589071FF10CE45B67B11DD50B8E
    @Disabled
    @Test
    void testGetAPIGroupAsync() throws ApiException {
        // Arrange
        //ApiCallback<V1APIGroup> mockCallback = mock(ApiCallback.class);
        //when(mockApiClient.buildCall(anyString(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any())).thenReturn(mockCall);
        // Act
        //okhttp3.Call result = networkingApi.getAPIGroup().executeAsync(mockCallback);
        // Assert
        //assertNotNull(result);
        //assertEquals(mockCall, result);
        //verify(mockApiClient).buildCall(eq(null), eq("/apis/networking.k8s.io/"), eq("GET"), any(), any(), eq(null), any(), any(), any(), any(), any());
        //verify(mockApiClient).executeAsync(eq(mockCall), any(Type.class), eq(mockCallback));
    }

    //BaseRock generated method id: ${testGetAPIGroupValidateBeforeCall}, hash: 7B86FD3B9E1A35184C7C4DF65D56B5C2
    @Test
    void testGetAPIGroupValidateBeforeCall() throws ApiException {
        // Arrange
        when(mockApiClient.buildCall(eq(null), eq("/apis/networking.k8s.io/"), eq("GET"), any(), any(), eq(null), any(), any(), any(), any(), any())).thenReturn(mockCall);
        // Act
        Call result = networkingApi.getAPIGroup().buildCall(null);
        // Assert
        assertNotNull(result);
        assertEquals(mockCall, result);
        verify(mockApiClient).buildCall(eq(null), eq("/apis/networking.k8s.io/"), eq("GET"), any(), any(), eq(null), any(), any(), any(), any(), any());
    }

    //BaseRock generated method id: ${testGetAPIGroupWithHttpInfo}, hash: CE801AF0656677CE8E62F3281E8E08D2
    @Disabled
    @Test
    void testGetAPIGroupWithHttpInfo() throws ApiException {
        // Arrange
        //V1APIGroup expectedApiGroup = new V1APIGroup();
        //ApiResponse<V1APIGroup> expectedResponse = new ApiResponse<>(200, new HashMap<>(), expectedApiGroup);
        //when(mockApiClient.execute(any(Call.class), any(Type.class))).thenReturn(expectedResponse);
        //when(mockApiClient.buildCall(anyString(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any())).thenReturn(mockCall);
        // Act
        //ApiResponse<V1APIGroup> result = networkingApi.getAPIGroup().executeWithHttpInfo();
        // Assert
        //assertNotNull(result);
        //assertEquals(expectedResponse, result);
        //verify(mockApiClient).buildCall(eq(null), eq("/apis/networking.k8s.io/"), eq("GET"), any(), any(), eq(null), any(), any(), any(), any(), any());
        //verify(mockApiClient).execute(any(Call.class), any(Type.class));
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: DAE4CC0D691144BA3712E0C58E5F5D58
    @Test
    void testSetApiClient() {
        // Arrange
        ApiClient newApiClient = mock(ApiClient.class);
        // Act
        networkingApi.setApiClient(newApiClient);
        // Assert
        assertEquals(newApiClient, networkingApi.getApiClient());
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: E18298D64294A6A4FDBD973A4E71F511
    @Test
    void testSetHostIndex() {
        // Arrange
        int newHostIndex = 1;
        // Act
        networkingApi.setHostIndex(newHostIndex);
        // Assert
        assertEquals(newHostIndex, networkingApi.getHostIndex());
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: B179C33132FFBBF6D105CDADD8F031BF
    @Test
    void testSetCustomBaseUrl() {
        // Arrange
        String newCustomBaseUrl = "https://custom.api.url";
        // Act
        networkingApi.setCustomBaseUrl(newCustomBaseUrl);
        // Assert
        assertEquals(newCustomBaseUrl, networkingApi.getCustomBaseUrl());
    }
}
