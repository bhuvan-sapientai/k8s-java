package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiClient;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.openapi.Configuration;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.ApiResponse;
import org.mockito.Mock;
import io.kubernetes.client.openapi.models.V1APIGroup;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.ApiException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.*;
import okhttp3.Call;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class NodeApiBaseRockGeneratedTest {

    @Mock
    private ApiClient apiClient;

    @Mock
    private Call call;

    private NodeApi nodeApi;

    @BeforeEach
    void setUp() {
        nodeApi = new NodeApi(apiClient);
    }

    //BaseRock generated method id: ${testConstructor}, hash: 65B5357B0A6DC0679F529A33F4CF0693
    @Test
    void testConstructor() {
        try (MockedStatic<Configuration> mockedConfiguration = mockStatic(Configuration.class)) {
            mockedConfiguration.when(Configuration::getDefaultApiClient).thenReturn(apiClient);
            NodeApi api = new NodeApi();
            assertNotNull(api);
            assertEquals(apiClient, api.getApiClient());
        }
    }

    //BaseRock generated method id: ${testGetApiClient}, hash: 5AA15F315C70BEA3F7603D7D9F240FEA
    @Test
    void testGetApiClient() {
        assertEquals(apiClient, nodeApi.getApiClient());
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: 5FE43BEBB661092CC1CA4DD0A783622F
    @Test
    void testSetApiClient() {
        ApiClient newApiClient = mock(ApiClient.class);
        nodeApi.setApiClient(newApiClient);
        assertEquals(newApiClient, nodeApi.getApiClient());
    }

    //BaseRock generated method id: ${testGetHostIndex}, hash: F4B121FAAA7CDE4E35B426D6045115A2
    @Test
    void testGetHostIndex() {
        assertEquals(0, nodeApi.getHostIndex());
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: 30C0396119C38D30D1E517AC8C843BB0
    @Test
    void testSetHostIndex() {
        int newIndex = 1;
        nodeApi.setHostIndex(newIndex);
        assertEquals(newIndex, nodeApi.getHostIndex());
    }

    //BaseRock generated method id: ${testGetCustomBaseUrl}, hash: 716F47621E451B513A3F9EFEB3B84456
    @Test
    void testGetCustomBaseUrl() {
        assertNull(nodeApi.getCustomBaseUrl());
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: E2E1935471C06E6DDF777C1BD7D716EB
    @Test
    void testSetCustomBaseUrl() {
        String newUrl = "https://example.com";
        nodeApi.setCustomBaseUrl(newUrl);
        assertEquals(newUrl, nodeApi.getCustomBaseUrl());
    }

    //BaseRock generated method id: ${testGetAPIGroup}, hash: AE65C66F68EDCE849C272399ADAB1561
    @Disabled
    @Test
    void testGetAPIGroup() throws ApiException {
        //V1APIGroup apiGroup = new V1APIGroup();
        //ApiResponse<V1APIGroup> expectedResponse = new ApiResponse<>(200, new HashMap<>(), apiGroup);
        //when(apiClient.execute(any(), eq(V1APIGroup.class))).thenReturn(expectedResponse);
        //when(apiClient.buildCall(anyString(), anyString(), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any())).thenReturn(call);
        //NodeApi.APIgetAPIGroupRequest request = nodeApi.getAPIGroup();
        //assertNotNull(request);
        //V1APIGroup result = request.execute();
        //assertNotNull(result);
        //assertEquals(apiGroup, result);
        //ApiResponse<V1APIGroup> httpResponse = request.executeWithHttpInfo();
        //assertNotNull(httpResponse);
        //assertEquals(expectedResponse.getStatusCode(), httpResponse.getStatusCode());
        //assertEquals(expectedResponse.getData(), httpResponse.getData());
    }
}