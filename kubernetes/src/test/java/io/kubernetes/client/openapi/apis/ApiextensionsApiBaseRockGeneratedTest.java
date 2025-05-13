package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiClient;
import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.openapi.Configuration;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.ApiResponse;
import org.mockito.Mock;
import io.kubernetes.client.openapi.models.V1APIGroup;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.*;
import okhttp3.Call;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class ApiextensionsApiBaseRockGeneratedTest {

    @Mock
    private ApiClient apiClient;

    @Mock
    private Call call;

    private ApiextensionsApi apiextensionsApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        apiextensionsApi = new ApiextensionsApi(apiClient);
    }

    //BaseRock generated method id: ${testConstructor}, hash: 0EF83B0DEE290FCFBC6AAFC744394452
    @Test
    void testConstructor() {
        try (MockedStatic<Configuration> mockedConfiguration = mockStatic(Configuration.class)) {
            mockedConfiguration.when(Configuration::getDefaultApiClient).thenReturn(apiClient);
            ApiextensionsApi api = new ApiextensionsApi();
            assertNotNull(api);
            assertEquals(apiClient, api.getApiClient());
        }
    }

    //BaseRock generated method id: ${testGetApiClient}, hash: 43D7B28AE526F9BDDBE578C6E889E0D9
    @Test
    void testGetApiClient() {
        assertEquals(apiClient, apiextensionsApi.getApiClient());
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: 1A9598A584B52F2C217D88B7CBFA0159
    @Test
    void testSetApiClient() {
        ApiClient newApiClient = mock(ApiClient.class);
        apiextensionsApi.setApiClient(newApiClient);
        assertEquals(newApiClient, apiextensionsApi.getApiClient());
    }

    //BaseRock generated method id: ${testGetHostIndex}, hash: BA98E022B9A465FF2B6D3FAE4AEF169D
    @Test
    void testGetHostIndex() {
        assertEquals(0, apiextensionsApi.getHostIndex());
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: A615996DBBC30712B17D8CF18E148AD2
    @Test
    void testSetHostIndex() {
        int newIndex = 1;
        apiextensionsApi.setHostIndex(newIndex);
        assertEquals(newIndex, apiextensionsApi.getHostIndex());
    }

    //BaseRock generated method id: ${testGetCustomBaseUrl}, hash: 5A36AE6F37DC0DB02F16DEDEAF51EA08
    @Test
    void testGetCustomBaseUrl() {
        assertNull(apiextensionsApi.getCustomBaseUrl());
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: 4D60F142C7CBA082D62670BFC52AB99C
    @Test
    void testSetCustomBaseUrl() {
        String newUrl = "https://example.com";
        apiextensionsApi.setCustomBaseUrl(newUrl);
        assertEquals(newUrl, apiextensionsApi.getCustomBaseUrl());
    }

    //BaseRock generated method id: ${testGetAPIGroup}, hash: 063101140D79BA11656EF03C25B77505
    @Test
    void testGetAPIGroup() throws ApiException {
        V1APIGroup apiGroup = new V1APIGroup();
        ApiResponse<V1APIGroup> expectedResponse = new ApiResponse<>(200, new HashMap<>(), apiGroup);
        when(apiClient.buildCall(isNull(), eq("/apis/apiextensions.k8s.io/"), eq("GET"), anyList(), anyList(), isNull(), anyMap(), anyMap(), anyMap(), eq(new String[] { "BearerToken" }), isNull())).thenReturn(call);
        doReturn(expectedResponse).when(apiClient).execute(eq(call), any(Class.class));
        V1APIGroup result = apiextensionsApi.getAPIGroup().execute();
        assertNotNull(result);
        assertEquals(apiGroup, result);
    }

    //BaseRock generated method id: ${testGetAPIGroupExecuteWithHttpInfo}, hash: 6009975F84800B5E540C7EED75B25540
    @Test
    void testGetAPIGroupExecuteWithHttpInfo() throws ApiException {
        V1APIGroup apiGroup = new V1APIGroup();
        ApiResponse<V1APIGroup> expectedResponse = new ApiResponse<>(200, new HashMap<>(), apiGroup);
        when(apiClient.buildCall(isNull(), eq("/apis/apiextensions.k8s.io/"), eq("GET"), anyList(), anyList(), isNull(), anyMap(), anyMap(), anyMap(), eq(new String[] { "BearerToken" }), isNull())).thenReturn(call);
        doReturn(expectedResponse).when(apiClient).execute(eq(call), any(Class.class));
        ApiResponse<V1APIGroup> result = apiextensionsApi.getAPIGroup().executeWithHttpInfo();
        assertNotNull(result);
        assertEquals(expectedResponse.getStatusCode(), result.getStatusCode());
        assertEquals(expectedResponse.getData(), result.getData());
    }

    //BaseRock generated method id: ${testGetAPIGroupExecuteAsync}, hash: 4B3CFFD13B9FE65A90CE0A514DDC8FDC
    @Test
    void testGetAPIGroupExecuteAsync() throws ApiException {
        when(apiClient.buildCall(isNull(), eq("/apis/apiextensions.k8s.io/"), eq("GET"), anyList(), anyList(), isNull(), anyMap(), anyMap(), anyMap(), eq(new String[] { "BearerToken" }), any())).thenReturn(call);
        doNothing().when(apiClient).executeAsync(eq(call), any(), any());
        apiextensionsApi.getAPIGroup().executeAsync(mock(io.kubernetes.client.openapi.ApiCallback.class));
        verify(apiClient).executeAsync(eq(call), any(), any());
    }
}
