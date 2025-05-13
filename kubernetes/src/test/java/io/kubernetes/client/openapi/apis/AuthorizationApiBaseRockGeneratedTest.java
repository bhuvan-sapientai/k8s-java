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
import static org.mockito.Mockito.doThrow;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import io.kubernetes.client.openapi.Pair;
import org.mockito.MockedStatic;
import java.util.HashMap;
import okhttp3.Call;
import io.kubernetes.client.openapi.apis.AuthorizationApi;
import java.util.List;
import static org.mockito.Mockito.doNothing;
import java.lang.reflect.Type;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.ApiResponse;
import io.kubernetes.client.openapi.models.V1APIGroup;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import io.kubernetes.client.openapi.ApiCallback;
import java.util.ArrayList;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class AuthorizationApiBaseRockGeneratedTest {

    @Mock
    private ApiClient mockApiClient;

    @Mock
    private Call mockCall;

    private AuthorizationApi authorizationApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        authorizationApi = new AuthorizationApi(mockApiClient);
    }

    //BaseRock generated method id: ${testConstructor}, hash: D88C4B140DDC32CF01B54D5B95FAACB1
    @Test
    void testConstructor() {
        try (MockedStatic<Configuration> mockedConfiguration = mockStatic(Configuration.class)) {
            mockedConfiguration.when(Configuration::getDefaultApiClient).thenReturn(mockApiClient);
            AuthorizationApi api = new AuthorizationApi();
            assertThat(api, is(notNullValue()));
        }
    }

    //BaseRock generated method id: ${testGetApiClient}, hash: FF112C4D47A536D250EA53EABDDB9502
    @Test
    void testGetApiClient() {
        assertThat(authorizationApi.getApiClient(), is(equalTo(mockApiClient)));
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: 0E7424515565351036772EE84CD06632
    @Test
    void testSetApiClient() {
        ApiClient newApiClient = mock(ApiClient.class);
        authorizationApi.setApiClient(newApiClient);
        assertThat(authorizationApi.getApiClient(), is(equalTo(newApiClient)));
    }

    //BaseRock generated method id: ${testGetHostIndex}, hash: FD4DB47E36E06DE7BB968F115A43514B
    @Test
    void testGetHostIndex() {
        assertThat(authorizationApi.getHostIndex(), is(equalTo(0)));
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: 7ECBDE052516ECDA4A34F75743B400D2
    @Test
    void testSetHostIndex() {
        int newHostIndex = 1;
        authorizationApi.setHostIndex(newHostIndex);
        assertThat(authorizationApi.getHostIndex(), is(equalTo(newHostIndex)));
    }

    //BaseRock generated method id: ${testGetCustomBaseUrl}, hash: 33D59039515E5E57FCC379108FBECAEB
    @Test
    void testGetCustomBaseUrl() {
        assertThat(authorizationApi.getCustomBaseUrl(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: 91199FA08607FD14228FDABE501A943E
    @Test
    void testSetCustomBaseUrl() {
        String newCustomBaseUrl = "https://example.com";
        authorizationApi.setCustomBaseUrl(newCustomBaseUrl);
        assertThat(authorizationApi.getCustomBaseUrl(), is(equalTo(newCustomBaseUrl)));
    }

    //BaseRock generated method id: ${testGetAPIGroupCall}, hash: 3205F278A50F767ECDA61369A5AEAAC2
    @Test
    void testGetAPIGroupCall() throws ApiException {
        doReturn(mockCall).when(mockApiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        AuthorizationApi.APIgetAPIGroupRequest request = authorizationApi.getAPIGroup();
        Call result = request.buildCall(null);
        assertThat(result, is(equalTo(mockCall)));
        verify(mockApiClient, times(1)).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
    }

    //BaseRock generated method id: ${testGetAPIGroupWithHttpInfo}, hash: 573724ADB120821360F21B368E2682C9
    @Test
    void testGetAPIGroupWithHttpInfo() throws ApiException {
        V1APIGroup mockAPIGroup = mock(V1APIGroup.class);
        ApiResponse<V1APIGroup> mockResponse = new ApiResponse<>(200, new HashMap<>(), mockAPIGroup);
        doReturn(mockCall).when(mockApiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        doReturn(mockResponse).when(mockApiClient).execute(any(Call.class), any(Type.class));
        ApiResponse<V1APIGroup> result = authorizationApi.getAPIGroup().executeWithHttpInfo();
        assertThat(result, is(equalTo(mockResponse)));
        verify(mockApiClient, times(1)).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        verify(mockApiClient, times(1)).execute(any(Call.class), any(Type.class));
    }

    //BaseRock generated method id: ${testGetAPIGroupAsync}, hash: D9810CA106842BE2F10DC18914AF8F7F
    @Test
    void testGetAPIGroupAsync() throws ApiException {
        ApiCallback<V1APIGroup> mockCallback = mock(ApiCallback.class);
        doReturn(mockCall).when(mockApiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        doNothing().when(mockApiClient).executeAsync(any(Call.class), any(Type.class), any(ApiCallback.class));
        authorizationApi.getAPIGroup().executeAsync(mockCallback);
        verify(mockApiClient, times(1)).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        verify(mockApiClient, times(1)).executeAsync(any(Call.class), any(Type.class), any(ApiCallback.class));
    }

    //BaseRock generated method id: ${testGetAPIGroup}, hash: A5BB5E73C4DE77EB2D3CB0646804E518
    @Test
    void testGetAPIGroup() throws ApiException {
        V1APIGroup mockAPIGroup = mock(V1APIGroup.class);
        ApiResponse<V1APIGroup> mockResponse = new ApiResponse<>(200, new HashMap<>(), mockAPIGroup);
        doReturn(mockCall).when(mockApiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        doReturn(mockResponse).when(mockApiClient).execute(any(Call.class), any(Type.class));
        V1APIGroup result = authorizationApi.getAPIGroup().execute();
        assertThat(result, is(equalTo(mockAPIGroup)));
        verify(mockApiClient, times(1)).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        verify(mockApiClient, times(1)).execute(any(Call.class), any(Type.class));
    }

    //BaseRock generated method id: ${testGetAPIGroupExecuteWithHttpInfo}, hash: A9E77EB9FB7FD593FBFD7F186D1CF963
    @Test
    void testGetAPIGroupExecuteWithHttpInfo() throws ApiException {
        V1APIGroup mockAPIGroup = mock(V1APIGroup.class);
        ApiResponse<V1APIGroup> mockResponse = new ApiResponse<>(200, new HashMap<>(), mockAPIGroup);
        doReturn(mockCall).when(mockApiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        doReturn(mockResponse).when(mockApiClient).execute(any(Call.class), any(Type.class));
        ApiResponse<V1APIGroup> result = authorizationApi.getAPIGroup().executeWithHttpInfo();
        assertThat(result, is(equalTo(mockResponse)));
        verify(mockApiClient, times(1)).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        verify(mockApiClient, times(1)).execute(any(Call.class), any(Type.class));
    }

    //BaseRock generated method id: ${testGetAPIGroupExecuteAsync}, hash: D641E8E6C1601072EBD239B612C75F34
    @Test
    void testGetAPIGroupExecuteAsync() throws ApiException {
        ApiCallback<V1APIGroup> mockCallback = mock(ApiCallback.class);
        doReturn(mockCall).when(mockApiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        doNothing().when(mockApiClient).executeAsync(any(Call.class), any(Type.class), any(ApiCallback.class));
        authorizationApi.getAPIGroup().executeAsync(mockCallback);
        verify(mockApiClient, times(1)).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        verify(mockApiClient, times(1)).executeAsync(any(Call.class), any(Type.class), any(ApiCallback.class));
    }

    //BaseRock generated method id: ${testGetAPIGroupThrowsApiException}, hash: 1B1C3AF2C024E7A13896A7B926DEA730
    @Test
    void testGetAPIGroupThrowsApiException() throws ApiException {
        doReturn(mockCall).when(mockApiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        doThrow(new ApiException()).when(mockApiClient).execute(any(Call.class), any(Type.class));
        assertThrows(ApiException.class, () -> authorizationApi.getAPIGroup().execute());
    }
}
