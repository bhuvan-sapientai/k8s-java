package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiClient;
import org.junit.jupiter.api.BeforeEach;
import java.lang.reflect.Type;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.openapi.Configuration;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.ApiResponse;
import org.mockito.Mock;
import io.kubernetes.client.openapi.models.V1APIGroup;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import io.kubernetes.client.openapi.ApiCallback;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.*;
import okhttp3.Call;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class ResourceApiBaseRockGeneratedTest {

    @Mock
    private ApiClient apiClient;

    @Mock
    private Call call;

    private ResourceApi resourceApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        resourceApi = new ResourceApi(apiClient);
    }

    //BaseRock generated method id: ${testGetAPIGroup}, hash: 8C64BF1B7337BA04755E5218E5933A84
    @Disabled
    @Test
    void testGetAPIGroup() throws ApiException {
        // Arrange
        //V1APIGroup expectedResponse = new V1APIGroup();
        //ApiResponse<V1APIGroup> apiResponse = new ApiResponse<>(200, new HashMap<>(), expectedResponse);
        //when(apiClient.buildCall(any(), any(), any(), any(), any(), any(), any(), any(), any(), any(), any())).thenReturn(call);
        //when(apiClient.execute(any(Call.class), any(Type.class))).thenReturn(apiResponse);
        // Act
        //V1APIGroup result = resourceApi.getAPIGroup().execute();
        // Assert
        //assertEquals(expectedResponse, result);
        //verify(apiClient).buildCall(any(), eq("/apis/resource.k8s.io/"), eq("GET"), any(), any(), any(), any(), any(), any(), any(), any());
        //verify(apiClient).execute(eq(call), any(Type.class));
    }

    //BaseRock generated method id: ${testGetAPIGroupAsync}, hash: FDB86C919C1A366E7BBCEFC7FFCD6697
    @Test
    void testGetAPIGroupAsync() throws ApiException {
        // Arrange
        ApiCallback<V1APIGroup> mockCallback = mock(ApiCallback.class);
        when(apiClient.buildCall(any(), any(), any(), any(), any(), any(), any(), any(), any(), any(), any())).thenReturn(call);
        doNothing().when(apiClient).executeAsync(any(Call.class), any(Type.class), any(ApiCallback.class));
        // Act
        resourceApi.getAPIGroup().executeAsync(mockCallback);
        // Assert
        verify(apiClient).buildCall(any(), eq("/apis/resource.k8s.io/"), eq("GET"), any(), any(), any(), any(), any(), any(), any(), any());
        verify(apiClient).executeAsync(eq(call), any(Type.class), eq(mockCallback));
    }

    //BaseRock generated method id: ${testGetAPIGroupWithHttpInfo}, hash: 5B02E9C9BDF422FFF30BCE2512E7EA98
    @Disabled
    @Test
    void testGetAPIGroupWithHttpInfo() throws ApiException {
        // Arrange
        //V1APIGroup expectedResponse = new V1APIGroup();
        //ApiResponse<V1APIGroup> expectedApiResponse = new ApiResponse<>(200, new HashMap<>(), expectedResponse);
        //when(apiClient.buildCall(any(), any(), any(), any(), any(), any(), any(), any(), any(), any(), any())).thenReturn(call);
        //when(apiClient.execute(any(Call.class), any(Type.class))).thenReturn(expectedApiResponse);
        // Act
        //ApiResponse<V1APIGroup> result = resourceApi.getAPIGroup().executeWithHttpInfo();
        // Assert
        //assertEquals(expectedApiResponse, result);
        //verify(apiClient).buildCall(any(), eq("/apis/resource.k8s.io/"), eq("GET"), any(), any(), any(), any(), any(), any(), any(), any());
        //verify(apiClient).execute(eq(call), any(Type.class));
    }

    //BaseRock generated method id: ${testGetApiClient}, hash: 41C977D90AFAD0F77E15F53EBDBC3F5A
    @Test
    void testGetApiClient() {
        // Act
        ApiClient result = resourceApi.getApiClient();
        // Assert
        assertEquals(apiClient, result);
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: D44DC551AF13ED2BC463C23073DFD3AC
    @Test
    void testSetApiClient() {
        // Arrange
        ApiClient newApiClient = mock(ApiClient.class);
        // Act
        resourceApi.setApiClient(newApiClient);
        // Assert
        assertEquals(newApiClient, resourceApi.getApiClient());
    }

    //BaseRock generated method id: ${testGetHostIndex}, hash: 38E726985A00B5E3C3D4314E987ABCB6
    @Test
    void testGetHostIndex() {
        // Act
        int result = resourceApi.getHostIndex();
        // Assert
        assertEquals(0, result);
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: 3B47D9CF6545F259279950EA75CCE5B7
    @Test
    void testSetHostIndex() {
        // Arrange
        int newHostIndex = 1;
        // Act
        resourceApi.setHostIndex(newHostIndex);
        // Assert
        assertEquals(newHostIndex, resourceApi.getHostIndex());
    }

    //BaseRock generated method id: ${testGetCustomBaseUrl}, hash: 0EA87C31E07EABA7A742C4AF1F61436B
    @Test
    void testGetCustomBaseUrl() {
        // Act
        String result = resourceApi.getCustomBaseUrl();
        // Assert
        assertNull(result);
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: 2B27E795E4699B049E08FB3EF10CB962
    @Test
    void testSetCustomBaseUrl() {
        // Arrange
        String newCustomBaseUrl = "https://api.example.com";
        // Act
        resourceApi.setCustomBaseUrl(newCustomBaseUrl);
        // Assert
        assertEquals(newCustomBaseUrl, resourceApi.getCustomBaseUrl());
    }

    //BaseRock generated method id: ${testConstructorWithDefaultApiClient}, hash: 9A0E9ED7BF93E48FFE30A9A372905146
    @Test
    void testConstructorWithDefaultApiClient() {
        try (MockedStatic<Configuration> mockedConfiguration = mockStatic(Configuration.class)) {
            // Arrange
            ApiClient defaultApiClient = mock(ApiClient.class);
            mockedConfiguration.when(Configuration::getDefaultApiClient).thenReturn(defaultApiClient);
            // Act
            ResourceApi newResourceApi = new ResourceApi();
            // Assert
            assertEquals(defaultApiClient, newResourceApi.getApiClient());
        }
    }
}