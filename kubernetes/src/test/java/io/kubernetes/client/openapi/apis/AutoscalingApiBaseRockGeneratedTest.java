package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiClient;
import static org.mockito.Mockito.doReturn;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.function.Consumer;
import static org.mockito.ArgumentMatchers.anyString;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.mockito.Mockito.times;
import static org.hamcrest.CoreMatchers.notNullValue;
import io.kubernetes.client.openapi.Pair;
import org.mockito.MockedStatic;
import okhttp3.Call;
import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.lang.reflect.Type;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyList;
import io.kubernetes.client.openapi.ApiResponse;
import io.kubernetes.client.openapi.models.V1APIGroup;
import org.junit.jupiter.api.Timeout;
import static org.mockito.Mockito.mockStatic;
import io.kubernetes.client.openapi.ApiCallback;
import java.util.ArrayList;
import static org.mockito.ArgumentMatchers.anyMap;
import org.mockito.ArgumentCaptor;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class AutoscalingApiBaseRockGeneratedTest {

    @Mock
    private ApiClient apiClient;

    @Mock
    private Call call;

    @Mock
    private ApiResponse<V1APIGroup> apiResponse;

    @Mock
    private V1APIGroup apiGroup;

    private AutoscalingApi autoscalingApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        autoscalingApi = new AutoscalingApi(apiClient);
    }

    //BaseRock generated method id: ${testDefaultConstructor}, hash: AD48CBF14A1856932148E3AFA25E2327
    @Test
    void testDefaultConstructor() {
        try (MockedStatic<io.kubernetes.client.openapi.Configuration> mockedConfiguration = mockStatic(io.kubernetes.client.openapi.Configuration.class)) {
            ApiClient defaultApiClient = new ApiClient();
            mockedConfiguration.when(io.kubernetes.client.openapi.Configuration::getDefaultApiClient).thenReturn(defaultApiClient);
            AutoscalingApi api = new AutoscalingApi();
            assertThat(api, notNullValue());
            assertThat(api.getApiClient(), equalTo(defaultApiClient));
        }
    }

    //BaseRock generated method id: ${testParameterizedConstructor}, hash: 898217F42239BA2D168E9E015418F1B9
    @Test
    void testParameterizedConstructor() {
        assertThat(autoscalingApi, notNullValue());
        assertThat(autoscalingApi.getApiClient(), equalTo(apiClient));
    }

    //BaseRock generated method id: ${testGetApiClient}, hash: 3591E81997EDB9E5D071513AAF5C5B8E
    @Test
    void testGetApiClient() {
        assertThat(autoscalingApi.getApiClient(), equalTo(apiClient));
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: D30C8773D46724FA5BCA12590CED612A
    @Test
    void testSetApiClient() {
        ApiClient newApiClient = new ApiClient();
        autoscalingApi.setApiClient(newApiClient);
        assertThat(autoscalingApi.getApiClient(), equalTo(newApiClient));
    }

    //BaseRock generated method id: ${testGetHostIndex}, hash: 433C18051817FA9491C3D4AA6152FD4B
    @Test
    void testGetHostIndex() {
        assertThat(autoscalingApi.getHostIndex(), is(0));
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: E00BD8BBEE26AABB5343CCAF9E691870
    @Test
    void testSetHostIndex() {
        int newHostIndex = 5;
        autoscalingApi.setHostIndex(newHostIndex);
        assertThat(autoscalingApi.getHostIndex(), is(newHostIndex));
    }

    //BaseRock generated method id: ${testGetCustomBaseUrl}, hash: C234E7CBD11EDADC51C490F927293823
    @Test
    void testGetCustomBaseUrl() {
        assertThat(autoscalingApi.getCustomBaseUrl(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: 519CB451D5DD2CFA1DEAA031AA7C0762
    @Test
    void testSetCustomBaseUrl() {
        String newCustomBaseUrl = "https://example.com";
        autoscalingApi.setCustomBaseUrl(newCustomBaseUrl);
        assertThat(autoscalingApi.getCustomBaseUrl(), is(equalTo(newCustomBaseUrl)));
    }

    //BaseRock generated method id: ${testGetAPIGroupCallWithCustomBaseUrl}, hash: 8EF97DDBDDBF510998A6A6B10D331E47
    @Disabled()
    @Test
    void testGetAPIGroupCallWithCustomBaseUrl() throws ApiException {
        String customBaseUrl = "https://example.com";
        autoscalingApi.setCustomBaseUrl(customBaseUrl);
        String[] accepts = new String[] { "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" };
        String[] contentTypes = new String[] {};
        String headerAccept = "application/json";
        String headerContentType = null;
        String[] authNames = new String[] { "BearerToken" };
        doReturn(headerAccept).when(apiClient).selectHeaderAccept(accepts);
        doReturn(headerContentType).when(apiClient).selectHeaderContentType(contentTypes);
        doReturn(call).when(apiClient).buildCall(eq(customBaseUrl), eq("/apis/autoscaling/"), eq("GET"), anyList(), anyList(), eq(null), anyMap(), anyMap(), anyMap(), eq(authNames), any(ApiCallback.class));
        AutoscalingApi.APIgetAPIGroupRequest request = autoscalingApi.getAPIGroup();
        Call result = request.buildCall(null);
        assertThat(result, equalTo(call));
        verify(apiClient).buildCall(eq(customBaseUrl), eq("/apis/autoscaling/"), eq("GET"), anyList(), anyList(), eq(null), anyMap(), anyMap(), anyMap(), eq(authNames), any(ApiCallback.class));
    }

    //BaseRock generated method id: ${testAPIgetAPIGroupRequest_buildCall}, hash: A828EE7E4584D5D49F7C813F93157AF2
    @Test
    void testAPIgetAPIGroupRequest_buildCall() throws ApiException {
        doReturn(call).when(apiClient).buildCall(any(), eq("/apis/autoscaling/"), eq("GET"), anyList(), anyList(), any(), anyMap(), anyMap(), anyMap(), any(), any());
        AutoscalingApi.APIgetAPIGroupRequest request = autoscalingApi.getAPIGroup();
        Call result = request.buildCall(null);
        assertThat(result, equalTo(call));
        verify(apiClient).buildCall(any(), eq("/apis/autoscaling/"), eq("GET"), anyList(), anyList(), any(), anyMap(), anyMap(), anyMap(), any(), any());
    }

    //BaseRock generated method id: ${testAPIgetAPIGroupRequest_execute}, hash: DD83BBE4A8CF69A54C40B07F4701EE75
    @Test
    void testAPIgetAPIGroupRequest_execute() throws ApiException {
        doReturn(call).when(apiClient).buildCall(any(), eq("/apis/autoscaling/"), eq("GET"), anyList(), anyList(), any(), anyMap(), anyMap(), anyMap(), any(), any());
        doReturn(apiResponse).when(apiClient).execute(eq(call), any(Type.class));
        doReturn(apiGroup).when(apiResponse).getData();
        AutoscalingApi.APIgetAPIGroupRequest request = autoscalingApi.getAPIGroup();
        V1APIGroup result = request.execute();
        assertThat(result, equalTo(apiGroup));
        verify(apiClient).execute(eq(call), any(Type.class));
    }

    //BaseRock generated method id: ${testAPIgetAPIGroupRequest_executeWithHttpInfo}, hash: 5332228C8F1DE816ADD4199BE41E4A7C
    @Test
    void testAPIgetAPIGroupRequest_executeWithHttpInfo() throws ApiException {
        doReturn(call).when(apiClient).buildCall(any(), eq("/apis/autoscaling/"), eq("GET"), anyList(), anyList(), any(), anyMap(), anyMap(), anyMap(), any(), any());
        doReturn(apiResponse).when(apiClient).execute(eq(call), any(Type.class));
        doReturn(apiGroup).when(apiResponse).getData();
        AutoscalingApi.APIgetAPIGroupRequest request = autoscalingApi.getAPIGroup();
        ApiResponse<V1APIGroup> result = request.executeWithHttpInfo();
        assertThat(result, equalTo(apiResponse));
        verify(apiClient).execute(eq(call), any(Type.class));
    }

    //BaseRock generated method id: ${testAPIgetAPIGroupRequest_executeAsync}, hash: 0BEB44A4F5D4C57ECE5B652530E34A77
    @Test
    void testAPIgetAPIGroupRequest_executeAsync() throws ApiException {
        doReturn(call).when(apiClient).buildCall(any(), eq("/apis/autoscaling/"), eq("GET"), anyList(), anyList(), any(), anyMap(), anyMap(), anyMap(), any(), any());
        ApiCallback<V1APIGroup> callback = new ApiCallback<V1APIGroup>() {

            @Override
            public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
            }

            @Override
            public void onSuccess(V1APIGroup result, int statusCode, Map<String, List<String>> responseHeaders) {
            }

            @Override
            public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {
            }

            @Override
            public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {
            }
        };
        AutoscalingApi.APIgetAPIGroupRequest request = autoscalingApi.getAPIGroup();
        Call result = request.executeAsync(callback);
        assertThat(result, equalTo(call));
        verify(apiClient).executeAsync(eq(call), any(Type.class), eq(callback));
    }

    //BaseRock generated method id: ${testGetAPIGroup_APIgetAPIGroupRequest}, hash: DDE41EB94E8FCC3150857A7A29A865EF
    @Test
    void testGetAPIGroup_APIgetAPIGroupRequest() {
        AutoscalingApi.APIgetAPIGroupRequest result = autoscalingApi.getAPIGroup();
        assertThat(result, notNullValue());
        assertThat(result, instanceOf(AutoscalingApi.APIgetAPIGroupRequest.class));
    }

    private final String headerAccept = "application/json";

    private final String headerContentType = null;
}
