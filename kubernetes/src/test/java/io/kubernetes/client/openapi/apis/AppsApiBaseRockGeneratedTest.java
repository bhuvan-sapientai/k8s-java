package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiClient;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.lang.reflect.Type;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import java.util.Map;
import io.kubernetes.client.openapi.Configuration;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import io.kubernetes.client.openapi.ApiResponse;
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
class AppsApiBaseRockGeneratedTest {

    @Mock
    private ApiClient mockApiClient;

    @Mock
    private Call mockCall;

    private AppsApi appsApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        appsApi = new AppsApi(mockApiClient);
    }

    //BaseRock generated method id: ${testGetAPIGroup}, hash: DAC0B1DA755C1D1485BE8903287699EF
    @Disabled
    @Test
    void testGetAPIGroup() throws ApiException {
        // Arrange
        //V1APIGroup expectedResponse = new V1APIGroup();
        //ApiResponse<V1APIGroup> apiResponse = new ApiResponse<>(200, new HashMap<>(), expectedResponse);
        //when(mockApiClient.execute(any(Call.class), any(Type.class))).thenReturn(apiResponse);
        //when(mockApiClient.buildCall(anyString(), anyString(), anyString(), any(List.class), any(List.class), any(), any(Map.class), any(Map.class), any(Map.class), any(String[].class), any())).thenReturn(mockCall);
        // Act
        //V1APIGroup result = appsApi.getAPIGroup().execute();
        // Assert
        //assertNotNull(result);
        //assertEquals(expectedResponse, result);
        //verify(mockApiClient).buildCall(eq(null), eq("/apis/apps/"), eq("GET"), any(List.class), any(List.class), isNull(), any(Map.class), any(Map.class), any(Map.class), eq(new String[] { "BearerToken" }), isNull());
        //verify(mockApiClient).execute(eq(mockCall), any(Type.class));
    }

    //BaseRock generated method id: ${testGetAPIGroupAsync}, hash: B7DCAE31C8D1C4D985D69162506A3F71
    @Disabled()
    @Test
    void testGetAPIGroupAsync() throws ApiException {
        // Arrange
        ApiCallback<V1APIGroup> mockCallback = mock(ApiCallback.class);
        doReturn(mockCall).when(mockApiClient).buildCall(anyString(), anyString(), anyString(), any(List.class), any(List.class), any(), any(Map.class), any(Map.class), any(Map.class), any(String[].class), any());
        doNothing().when(mockApiClient).executeAsync(any(Call.class), any(Type.class), any(ApiCallback.class));
        // Act
        okhttp3.Call result = appsApi.getAPIGroup().executeAsync(mockCallback);
        // Assert
        assertNotNull(result);
        assertEquals(mockCall, result);
        verify(mockApiClient).buildCall(eq(null), eq("/apis/apps/"), eq("GET"), any(List.class), any(List.class), isNull(), any(Map.class), any(Map.class), any(Map.class), eq(new String[] { "BearerToken" }), eq(mockCallback));
        verify(mockApiClient).executeAsync(eq(mockCall), any(Type.class), eq(mockCallback));
    }

    //BaseRock generated method id: ${testGetAPIGroupValidateBeforeCall}, hash: 45D8307873AA329831D12A479A33C505
    @Disabled()
    @Test
    void testGetAPIGroupValidateBeforeCall() throws ApiException {
        // Arrange
        doReturn(mockCall).when(mockApiClient).buildCall(anyString(), anyString(), anyString(), any(List.class), any(List.class), any(), any(Map.class), any(Map.class), any(Map.class), any(String[].class), any());
        // Act
        Call result = appsApi.getAPIGroup().buildCall(null);
        // Assert
        assertNotNull(result);
        assertEquals(mockCall, result);
        verify(mockApiClient).buildCall(eq(null), eq("/apis/apps/"), eq("GET"), any(List.class), any(List.class), isNull(), any(Map.class), any(Map.class), any(Map.class), eq(new String[] { "BearerToken" }), isNull());
    }

    //BaseRock generated method id: ${testConstructor}, hash: C56CE518C97F9A4806AFC61347792DCB
    @Test
    void testConstructor() {
        // Arrange & Act
        AppsApi defaultAppsApi = new AppsApi();
        // Assert
        assertNotNull(defaultAppsApi);
        assertEquals(Configuration.getDefaultApiClient(), defaultAppsApi.getApiClient());
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: D0168623A5CAB0FD6C6E6DDE63E8E5CC
    @Test
    void testSetApiClient() {
        // Arrange
        ApiClient newApiClient = mock(ApiClient.class);
        // Act
        appsApi.setApiClient(newApiClient);
        // Assert
        assertEquals(newApiClient, appsApi.getApiClient());
    }

    //BaseRock generated method id: ${testGetHostIndex}, hash: C688611CE54483E5274D690B2B1DFCFD
    @Test
    void testGetHostIndex() {
        // Arrange & Act
        int result = appsApi.getHostIndex();
        // Assert
        assertEquals(0, result);
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: BC12DE9BDE18664EB5E4DBA34D0948E1
    @Test
    void testSetHostIndex() {
        // Arrange
        int newHostIndex = 1;
        // Act
        appsApi.setHostIndex(newHostIndex);
        // Assert
        assertEquals(newHostIndex, appsApi.getHostIndex());
    }

    //BaseRock generated method id: ${testGetCustomBaseUrl}, hash: D823912D012972B33D3FB8591A579443
    @Test
    void testGetCustomBaseUrl() {
        // Arrange & Act
        String result = appsApi.getCustomBaseUrl();
        // Assert
        assertNull(result);
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: E8054C62C38AE8D7652CFBF4E90A98D9
    @Test
    void testSetCustomBaseUrl() {
        // Arrange
        String newCustomBaseUrl = "https://custom.base.url";
        // Act
        appsApi.setCustomBaseUrl(newCustomBaseUrl);
        // Assert
        assertEquals(newCustomBaseUrl, appsApi.getCustomBaseUrl());
    }
}
