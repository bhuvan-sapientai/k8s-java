package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiClient;
import static org.mockito.Mockito.doReturn;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import io.kubernetes.client.openapi.Configuration;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1APIVersions;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import io.kubernetes.client.openapi.Pair;
import org.mockito.MockedStatic;
import java.util.HashMap;
import okhttp3.Call;
import java.util.List;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.instanceOf;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.ApiResponse;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import io.kubernetes.client.openapi.ApiCallback;
import java.util.ArrayList;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class CoreApiBaseRockGeneratedTest {

    @Mock
    private ApiClient mockApiClient;

    @Mock
    private Call mockCall;

    private CoreApi coreApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        coreApi = new CoreApi(mockApiClient);
    }

    //BaseRock generated method id: ${testConstructorWithDefaultApiClient}, hash: BF94EF5DF6EB056846BE92B7CD7B1DCF
    @Test
    void testConstructorWithDefaultApiClient() {
        try (MockedStatic<Configuration> mockedConfiguration = mockStatic(Configuration.class)) {
            ApiClient defaultApiClient = mock(ApiClient.class);
            mockedConfiguration.when(Configuration::getDefaultApiClient).thenReturn(defaultApiClient);
            CoreApi api = new CoreApi();
            assertThat(api, notNullValue());
            assertThat(api.getApiClient(), equalTo(defaultApiClient));
        }
    }

    //BaseRock generated method id: ${testConstructorWithCustomApiClient}, hash: BE0C9A23B1DBE5BB33BCC0A00D54EC2B
    @Test
    void testConstructorWithCustomApiClient() {
        ApiClient customApiClient = mock(ApiClient.class);
        CoreApi api = new CoreApi(customApiClient);
        assertThat(api, notNullValue());
        assertThat(api.getApiClient(), equalTo(customApiClient));
    }

    //BaseRock generated method id: ${testGetApiClient}, hash: A3A5FBEDBC2D2FCDDCFF2AEF9E155BE7
    @Test
    void testGetApiClient() {
        assertThat(coreApi.getApiClient(), equalTo(mockApiClient));
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: 1A91081B0DEDFFABA5CC6A129529AE09
    @Test
    void testSetApiClient() {
        ApiClient newApiClient = mock(ApiClient.class);
        coreApi.setApiClient(newApiClient);
        assertThat(coreApi.getApiClient(), equalTo(newApiClient));
    }

    //BaseRock generated method id: ${testGetHostIndex}, hash: 9D8479A5983DAD94922F7D88A402C6EA
    @Test
    void testGetHostIndex() {
        assertThat(coreApi.getHostIndex(), equalTo(0));
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: 38160173406FCFCF44B1C3C5689A732B
    @Test
    void testSetHostIndex() {
        int newHostIndex = 1;
        coreApi.setHostIndex(newHostIndex);
        assertThat(coreApi.getHostIndex(), equalTo(newHostIndex));
    }

    //BaseRock generated method id: ${testGetCustomBaseUrl}, hash: B9621DA6D46DE14A949631F17C199630
    @Test
    void testGetCustomBaseUrl() {
        assertThat(coreApi.getCustomBaseUrl(), equalTo(null));
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: 6638C6E7F82DA37B5D881A86D9572BC8
    @Test
    void testSetCustomBaseUrl() {
        String newCustomBaseUrl = "https://example.com";
        coreApi.setCustomBaseUrl(newCustomBaseUrl);
        assertThat(coreApi.getCustomBaseUrl(), equalTo(newCustomBaseUrl));
    }

    //BaseRock generated method id: ${testGetAPIVersions}, hash: 55B5F241534F273CDF3796D241457581
    @Test
    void testGetAPIVersions() throws ApiException {
        V1APIVersions mockV1APIVersions = mock(V1APIVersions.class);
        ApiResponse<V1APIVersions> mockResponse = new ApiResponse<>(200, new HashMap<>(), mockV1APIVersions);
        doReturn(mockCall).when(mockApiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        doReturn(mockResponse).when(mockApiClient).execute(any(), any());
        V1APIVersions result = coreApi.getAPIVersions().execute();
        assertThat(result, equalTo(mockV1APIVersions));
        verify(mockApiClient, times(1)).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        verify(mockApiClient, times(1)).execute(any(), any());
    }

    //BaseRock generated method id: ${testGetAPIVersionsExecuteWithHttpInfo}, hash: 831F1C7EC218F954B1BC39D5EB3CA0E6
    @Test
    void testGetAPIVersionsExecuteWithHttpInfo() throws ApiException {
        V1APIVersions mockV1APIVersions = mock(V1APIVersions.class);
        ApiResponse<V1APIVersions> mockResponse = new ApiResponse<>(200, new HashMap<>(), mockV1APIVersions);
        doReturn(mockCall).when(mockApiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        doReturn(mockResponse).when(mockApiClient).execute(any(), any());
        ApiResponse<V1APIVersions> result = coreApi.getAPIVersions().executeWithHttpInfo();
        assertThat(result, notNullValue());
        assertThat(result.getData(), equalTo(mockV1APIVersions));
        verify(mockApiClient, times(1)).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        verify(mockApiClient, times(1)).execute(any(), any());
    }

    //BaseRock generated method id: ${testGetAPIVersionsExecuteAsync}, hash: D1CD1057FC18A79B73A120B179771031
    @Test
    void testGetAPIVersionsExecuteAsync() throws ApiException {
        ApiCallback<V1APIVersions> mockCallback = mock(ApiCallback.class);
        doReturn(mockCall).when(mockApiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        doNothing().when(mockApiClient).executeAsync(any(), any(), eq(mockCallback));
        coreApi.getAPIVersions().executeAsync(mockCallback);
        verify(mockApiClient, times(1)).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        verify(mockApiClient, times(1)).executeAsync(any(), any(), eq(mockCallback));
    }

    //BaseRock generated method id: ${testAPIgetAPIVersionsRequest}, hash: F68BBEAF77F00B96659DB0EDFE7BAD08
    @Test
    void testAPIgetAPIVersionsRequest() {
        CoreApi.APIgetAPIVersionsRequest request = coreApi.getAPIVersions();
        assertThat(request, notNullValue());
        assertThat(request, instanceOf(CoreApi.APIgetAPIVersionsRequest.class));
    }
}
