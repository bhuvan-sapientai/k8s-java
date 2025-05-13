package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiClient;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
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
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class SchedulingApiBaseRockGeneratedTest {

    @Mock
    private ApiClient mockApiClient;

    @Mock
    private Call mockCall;

    private SchedulingApi schedulingApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        schedulingApi = new SchedulingApi(mockApiClient);
    }

    //BaseRock generated method id: ${testConstructor}, hash: A0CC6E233141C9302DA3EBF94B5B5EA9
    @Test
    void testConstructor() {
        SchedulingApi api = new SchedulingApi();
        assertNotNull(api);
    }

    //BaseRock generated method id: ${testGetApiClient}, hash: 171255C69F3878F98F97A23F9A2713BA
    @Test
    void testGetApiClient() {
        assertEquals(mockApiClient, schedulingApi.getApiClient());
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: 7D60C1DE4B4D40A0FBAF9AB337C341AE
    @Test
    void testSetApiClient() {
        ApiClient newApiClient = mock(ApiClient.class);
        schedulingApi.setApiClient(newApiClient);
        assertEquals(newApiClient, schedulingApi.getApiClient());
    }

    //BaseRock generated method id: ${testGetHostIndex}, hash: C4E06096690943145EA12CCD033CB0E9
    @Test
    void testGetHostIndex() {
        assertEquals(0, schedulingApi.getHostIndex());
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: D4AD39D874D0365B8F2AD752F0C6473D
    @Test
    void testSetHostIndex() {
        schedulingApi.setHostIndex(1);
        assertEquals(1, schedulingApi.getHostIndex());
    }

    //BaseRock generated method id: ${testGetCustomBaseUrl}, hash: F7456D92A10DDFAEFA854317E25ABDF1
    @Test
    void testGetCustomBaseUrl() {
        assertNull(schedulingApi.getCustomBaseUrl());
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: 1DA4622D8A21A40825012FA410D60355
    @Test
    void testSetCustomBaseUrl() {
        String customBaseUrl = "https://custom.api.url";
        schedulingApi.setCustomBaseUrl(customBaseUrl);
        assertEquals(customBaseUrl, schedulingApi.getCustomBaseUrl());
    }

    //BaseRock generated method id: ${testGetAPIGroup}, hash: 26E665DC37105011D29FA36882AAD07C
    @Disabled
    @Test
    void testGetAPIGroup() throws ApiException {
        //V1APIGroup mockApiGroup = mock(V1APIGroup.class);
        //ApiResponse<V1APIGroup> mockResponse = new ApiResponse<>(200, new HashMap<>(), mockApiGroup);
        //when(mockApiClient.execute(any(), eq(V1APIGroup.class))).thenReturn(mockResponse);
        //when(mockApiClient.buildCall(isNull(), eq("/apis/scheduling.k8s.io/"), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any())).thenReturn(mockCall);
        //SchedulingApi.APIgetAPIGroupRequest request = schedulingApi.getAPIGroup();
        //V1APIGroup result = request.execute();
        //assertNotNull(result);
        //assertEquals(mockApiGroup, result);
        //verify(mockApiClient).execute(any(), eq(V1APIGroup.class));
    }

    //BaseRock generated method id: ${testGetAPIGroupExecuteWithHttpInfo}, hash: 133604D8751CBA5BA673A98BE4C73D85
    @Disabled
    @Test
    void testGetAPIGroupExecuteWithHttpInfo() throws ApiException {
        //V1APIGroup mockApiGroup = mock(V1APIGroup.class);
        //ApiResponse<V1APIGroup> mockResponse = new ApiResponse<>(200, new HashMap<>(), mockApiGroup);
        //when(mockApiClient.execute(any(), eq(V1APIGroup.class))).thenReturn(mockResponse);
        //when(mockApiClient.buildCall(isNull(), eq("/apis/scheduling.k8s.io/"), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any())).thenReturn(mockCall);
        //SchedulingApi.APIgetAPIGroupRequest request = schedulingApi.getAPIGroup();
        //ApiResponse<V1APIGroup> result = request.executeWithHttpInfo();
        //assertNotNull(result);
        //assertEquals(200, result.getStatusCode());
        //assertEquals(mockApiGroup, result.getData());
        //verify(mockApiClient).execute(any(), eq(V1APIGroup.class));
    }
}