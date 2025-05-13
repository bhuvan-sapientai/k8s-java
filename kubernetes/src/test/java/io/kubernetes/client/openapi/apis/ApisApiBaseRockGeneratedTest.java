package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiClient;
import static org.mockito.Mockito.doReturn;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import io.kubernetes.client.openapi.Configuration;
import org.junit.jupiter.api.Test;
import com.google.gson.reflect.TypeToken;
import org.mockito.Mock;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1APIGroupList;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import io.kubernetes.client.openapi.Pair;
import org.mockito.MockedStatic;
import java.util.HashMap;
import okhttp3.Call;
import java.util.List;
import static org.mockito.Mockito.doNothing;
import java.lang.reflect.Type;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.ApiResponse;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import io.kubernetes.client.openapi.ApiCallback;
import java.util.ArrayList;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class ApisApiBaseRockGeneratedTest {

    @Mock
    private ApiClient mockApiClient;

    @Mock
    private Call mockCall;

    private ApisApi apisApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        apisApi = new ApisApi(mockApiClient);
    }

    //BaseRock generated method id: ${testConstructor}, hash: FE4DC33D9CB23673E9AAFA83B9D8F155
    @Test
    void testConstructor() {
        try (MockedStatic<Configuration> mockedConfiguration = mockStatic(Configuration.class)) {
            mockedConfiguration.when(Configuration::getDefaultApiClient).thenReturn(mockApiClient);
            ApisApi api = new ApisApi();
            assertThat(api, is(notNullValue()));
        }
    }

    //BaseRock generated method id: ${testGetApiClient}, hash: 08FA65856DD50A926E63F8AED634E6A3
    @Test
    void testGetApiClient() {
        assertThat(apisApi.getApiClient(), is(equalTo(mockApiClient)));
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: 14009D784DA063B0015305244330FE81
    @Test
    void testSetApiClient() {
        ApiClient newApiClient = mock(ApiClient.class);
        apisApi.setApiClient(newApiClient);
        assertThat(apisApi.getApiClient(), is(equalTo(newApiClient)));
    }

    //BaseRock generated method id: ${testGetHostIndex}, hash: 8402BBF19C0FF6AB3941ADBD6960F91C
    @Test
    void testGetHostIndex() {
        assertThat(apisApi.getHostIndex(), is(equalTo(0)));
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: 58D1C52274988157F733C11F6AB84A4F
    @Test
    void testSetHostIndex() {
        int newIndex = 1;
        apisApi.setHostIndex(newIndex);
        assertThat(apisApi.getHostIndex(), is(equalTo(newIndex)));
    }

    //BaseRock generated method id: ${testGetCustomBaseUrl}, hash: B8D0185ED696512809D9B201CA67BCB4
    @Test
    void testGetCustomBaseUrl() {
        assertThat(apisApi.getCustomBaseUrl(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: 024A71C515433E9EFD630E74AD9E095B
    @Test
    void testSetCustomBaseUrl() {
        String newUrl = "https://example.com";
        apisApi.setCustomBaseUrl(newUrl);
        assertThat(apisApi.getCustomBaseUrl(), is(equalTo(newUrl)));
    }

    //BaseRock generated method id: ${testGetAPIVersionsCall}, hash: 6BA169441AA84C7091FAECE15A5A4D94
    @Test
    void testGetAPIVersionsCall() throws ApiException {
        doReturn(mockCall).when(mockApiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        Call result = apisApi.getAPIVersions().buildCall(null);
        assertThat(result, is(equalTo(mockCall)));
        verify(mockApiClient, times(1)).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
    }

    //BaseRock generated method id: ${testGetAPIVersionsWithHttpInfo}, hash: F5A9B9594EDD86F26915DEE8B48E46C6
    @Test
    void testGetAPIVersionsWithHttpInfo() throws ApiException {
        V1APIGroupList mockResponse = mock(V1APIGroupList.class);
        ApiResponse<V1APIGroupList> expectedResponse = new ApiResponse<>(200, new HashMap<>(), mockResponse);
        doReturn(mockCall).when(mockApiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        doReturn(expectedResponse).when(mockApiClient).execute(any(), any());
        ApiResponse<V1APIGroupList> result = apisApi.getAPIVersions().executeWithHttpInfo();
        assertThat(result, is(equalTo(expectedResponse)));
        verify(mockApiClient, times(1)).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        verify(mockApiClient, times(1)).execute(any(), any());
    }

    //BaseRock generated method id: ${testGetAPIVersionsAsync}, hash: E1C0DE52EF498272A108A10A7067A7A8
    @Test
    void testGetAPIVersionsAsync() throws ApiException {
        doReturn(mockCall).when(mockApiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        doNothing().when(mockApiClient).executeAsync(any(Call.class), any(Type.class), any(ApiCallback.class));
        ApiCallback<V1APIGroupList> mockCallback = mock(ApiCallback.class);
        apisApi.getAPIVersions().executeAsync(mockCallback);
        verify(mockApiClient, times(1)).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        verify(mockApiClient, times(1)).executeAsync(any(Call.class), any(Type.class), any(ApiCallback.class));
    }

    //BaseRock generated method id: ${testGetAPIVersions}, hash: 7BCB762771005EDD22F4CC23BD764202
    @Test
    void testGetAPIVersions() throws ApiException {
        V1APIGroupList mockResponse = mock(V1APIGroupList.class);
        ApiResponse<V1APIGroupList> expectedResponse = new ApiResponse<>(200, new HashMap<>(), mockResponse);
        doReturn(mockCall).when(mockApiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        doReturn(expectedResponse).when(mockApiClient).execute(any(), any());
        V1APIGroupList result = apisApi.getAPIVersions().execute();
        assertThat(result, is(equalTo(mockResponse)));
        verify(mockApiClient, times(1)).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        verify(mockApiClient, times(1)).execute(any(), any());
    }

    //BaseRock generated method id: ${testGetAPIVersionsWithHttpInfoExecute}, hash: F37B71721D24A6C690FAAEABA9291716
    @Test
    void testGetAPIVersionsWithHttpInfoExecute() throws ApiException {
        V1APIGroupList mockResponse = mock(V1APIGroupList.class);
        ApiResponse<V1APIGroupList> expectedResponse = new ApiResponse<>(200, new HashMap<>(), mockResponse);
        doReturn(mockCall).when(mockApiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        doReturn(expectedResponse).when(mockApiClient).execute(any(), any());
        ApiResponse<V1APIGroupList> result = apisApi.getAPIVersions().executeWithHttpInfo();
        assertThat(result, is(equalTo(expectedResponse)));
        verify(mockApiClient, times(1)).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        verify(mockApiClient, times(1)).execute(any(), any());
    }

    //BaseRock generated method id: ${testGetAPIVersionsExecuteAsync}, hash: 6E5362CEE05253A8284191C1185BE82C
    @Test
    void testGetAPIVersionsExecuteAsync() throws ApiException {
        doReturn(mockCall).when(mockApiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        doNothing().when(mockApiClient).executeAsync(any(Call.class), any(Type.class), any(ApiCallback.class));
        ApiCallback<V1APIGroupList> mockCallback = mock(ApiCallback.class);
        apisApi.getAPIVersions().executeAsync(mockCallback);
        verify(mockApiClient, times(1)).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        verify(mockApiClient, times(1)).executeAsync(any(Call.class), any(Type.class), any(ApiCallback.class));
    }

    //BaseRock generated method id: ${testGetAPIVersionsCallThrowsApiException}, hash: BEC02474423FAAD23ECB3045A4CCAC86
    @Test
    void testGetAPIVersionsCallThrowsApiException() throws ApiException {
        doReturn(mockCall).when(mockApiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        when(mockApiClient.execute(any(), any())).thenThrow(new ApiException());
        assertThrows(ApiException.class, () -> apisApi.getAPIVersions().executeWithHttpInfo());
        verify(mockApiClient, times(1)).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        verify(mockApiClient, times(1)).execute(any(), any());
    }
}
