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
import static org.mockito.Mockito.*;
import okhttp3.Call;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class ApiregistrationApiBaseRockGeneratedTest {

    @Mock
    private ApiClient mockApiClient;

    private ApiregistrationApi apiregistrationApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        apiregistrationApi = new ApiregistrationApi(mockApiClient);
    }

    //BaseRock generated method id: ${testConstructor}, hash: 0D443982E5C3F70D58C4B7803C49B90B
    @Test
    void testConstructor() {
        ApiregistrationApi api = new ApiregistrationApi();
        assertNotNull(api);
        assertEquals(Configuration.getDefaultApiClient(), api.getApiClient());
    }

    //BaseRock generated method id: ${testGetApiClient}, hash: EAC2D17B381121081F8DEC46E5ECA208
    @Test
    void testGetApiClient() {
        assertEquals(mockApiClient, apiregistrationApi.getApiClient());
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: 3F0528734805E035741A0541E3644E3B
    @Test
    void testSetApiClient() {
        ApiClient newApiClient = mock(ApiClient.class);
        apiregistrationApi.setApiClient(newApiClient);
        assertEquals(newApiClient, apiregistrationApi.getApiClient());
    }

    //BaseRock generated method id: ${testGetHostIndex}, hash: 80BDB4BEB6D54FEEB1911F6B9C23A093
    @Test
    void testGetHostIndex() {
        assertEquals(0, apiregistrationApi.getHostIndex());
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: BDF031F41A46CD037F5360DC9785B21B
    @Test
    void testSetHostIndex() {
        apiregistrationApi.setHostIndex(1);
        assertEquals(1, apiregistrationApi.getHostIndex());
    }

    //BaseRock generated method id: ${testGetCustomBaseUrl}, hash: 8B21156E61F6923A2E15A2DB372A3EA0
    @Test
    void testGetCustomBaseUrl() {
        assertNull(apiregistrationApi.getCustomBaseUrl());
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: 09D23AB091C8BFE1C882C0A2614A1BDD
    @Test
    void testSetCustomBaseUrl() {
        String customBaseUrl = "https://custom.api.url";
        apiregistrationApi.setCustomBaseUrl(customBaseUrl);
        assertEquals(customBaseUrl, apiregistrationApi.getCustomBaseUrl());
    }

    //BaseRock generated method id: ${testGetAPIGroup}, hash: 7217899E5625C972F83BF1850A52DF33
    @Disabled
    @Test
    void testGetAPIGroup() throws ApiException {
        //V1APIGroup mockApiGroup = mock(V1APIGroup.class);
        //ApiResponse<V1APIGroup> mockResponse = new ApiResponse<>(200, new HashMap<>(), mockApiGroup);
        //when(mockApiClient.execute(any(Call.class), eq(V1APIGroup.class))).thenReturn(mockResponse);
        //V1APIGroup result = apiregistrationApi.getAPIGroup().execute();
        //assertNotNull(result);
        //assertEquals(mockApiGroup, result);
        //verify(mockApiClient).execute(any(Call.class), eq(V1APIGroup.class));
    }

    //BaseRock generated method id: ${testGetAPIGroupExecuteWithHttpInfo}, hash: EE0FD020F121CE8E32D631C337E6A528
    @Disabled
    @Test
    void testGetAPIGroupExecuteWithHttpInfo() throws ApiException {
        //V1APIGroup mockApiGroup = mock(V1APIGroup.class);
        //ApiResponse<V1APIGroup> mockResponse = new ApiResponse<>(200, new HashMap<>(), mockApiGroup);
        //when(mockApiClient.execute(any(Call.class), eq(V1APIGroup.class))).thenReturn(mockResponse);
        //ApiResponse<V1APIGroup> result = apiregistrationApi.getAPIGroup().executeWithHttpInfo();
        //assertNotNull(result);
        //assertEquals(200, result.getStatusCode());
        //assertEquals(mockApiGroup, result.getData());
        //verify(mockApiClient).execute(any(Call.class), eq(V1APIGroup.class));
    }
}