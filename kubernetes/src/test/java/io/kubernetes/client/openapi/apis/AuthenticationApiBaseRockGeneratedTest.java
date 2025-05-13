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
class AuthenticationApiBaseRockGeneratedTest {

    @Mock
    private ApiClient mockApiClient;

    @Mock
    private Call mockCall;

    private AuthenticationApi authenticationApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        authenticationApi = new AuthenticationApi(mockApiClient);
    }

    //BaseRock generated method id: ${testConstructor}, hash: 43BE0AAC6C930961211BF1D191CAA37D
    @Test
    void testConstructor() {
        try (MockedStatic<Configuration> mockedConfiguration = mockStatic(Configuration.class)) {
            mockedConfiguration.when(Configuration::getDefaultApiClient).thenReturn(mockApiClient);
            AuthenticationApi api = new AuthenticationApi();
            assertThat(api, is(notNullValue()));
        }
    }

    //BaseRock generated method id: ${testGetApiClient}, hash: E674052DBA65F12CC2130E6B598C9FC0
    @Test
    void testGetApiClient() {
        assertThat(authenticationApi.getApiClient(), is(equalTo(mockApiClient)));
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: 114863A678F79043F17254DDCFC9E72B
    @Test
    void testSetApiClient() {
        ApiClient newApiClient = mock(ApiClient.class);
        authenticationApi.setApiClient(newApiClient);
        assertThat(authenticationApi.getApiClient(), is(equalTo(newApiClient)));
    }

    //BaseRock generated method id: ${testGetHostIndex}, hash: CC98EF69D0797427157CFEB91635F816
    @Test
    void testGetHostIndex() {
        assertThat(authenticationApi.getHostIndex(), is(equalTo(0)));
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: CF50630F6222461A0225207F4E843CE4
    @Test
    void testSetHostIndex() {
        int newHostIndex = 1;
        authenticationApi.setHostIndex(newHostIndex);
        assertThat(authenticationApi.getHostIndex(), is(equalTo(newHostIndex)));
    }

    //BaseRock generated method id: ${testGetCustomBaseUrl}, hash: 911AE5247DC1114D7CC7906754E45C2B
    @Test
    void testGetCustomBaseUrl() {
        assertThat(authenticationApi.getCustomBaseUrl(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: B9831982B12BF765631142E9537213E0
    @Test
    void testSetCustomBaseUrl() {
        String newCustomBaseUrl = "https://example.com";
        authenticationApi.setCustomBaseUrl(newCustomBaseUrl);
        assertThat(authenticationApi.getCustomBaseUrl(), is(equalTo(newCustomBaseUrl)));
    }

    //BaseRock generated method id: ${testGetAPIGroupCall}, hash: 3BDD19BEDE6F2700E23A9AEEB53C157F
    @Test
    void testGetAPIGroupCall() throws ApiException {
        doReturn(mockCall).when(mockApiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        AuthenticationApi.APIgetAPIGroupRequest request = authenticationApi.getAPIGroup();
        Call result = request.buildCall(null);
        assertThat(result, is(equalTo(mockCall)));
        verify(mockApiClient, times(1)).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
    }

    //BaseRock generated method id: ${testGetAPIGroupWithHttpInfo}, hash: E2E2D315262DBF17DB13717F7398CE07
    @Test
    void testGetAPIGroupWithHttpInfo() throws ApiException {
        V1APIGroup mockAPIGroup = mock(V1APIGroup.class);
        ApiResponse<V1APIGroup> mockResponse = new ApiResponse<>(200, new HashMap<>(), mockAPIGroup);
        doReturn(mockCall).when(mockApiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        doReturn(mockResponse).when(mockApiClient).execute(any(), any());
        ApiResponse<V1APIGroup> result = authenticationApi.getAPIGroup().executeWithHttpInfo();
        assertThat(result, is(equalTo(mockResponse)));
        verify(mockApiClient, times(1)).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        verify(mockApiClient, times(1)).execute(any(), any());
    }

    //BaseRock generated method id: ${testGetAPIGroupAsync}, hash: 1654C6F808FC7CCA4A2A504D4E4A87E1
    @Test
    void testGetAPIGroupAsync() throws ApiException {
        ApiCallback<V1APIGroup> mockCallback = mock(ApiCallback.class);
        doReturn(mockCall).when(mockApiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        doNothing().when(mockApiClient).executeAsync(any(), any(), any());
        authenticationApi.getAPIGroup().executeAsync(mockCallback);
        verify(mockApiClient, times(1)).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        verify(mockApiClient, times(1)).executeAsync(any(), any(), any());
    }

    //BaseRock generated method id: ${testGetAPIGroup}, hash: 55B14B600EDEAC8525AFFB89DF2455CE
    @Test
    void testGetAPIGroup() throws ApiException {
        V1APIGroup mockAPIGroup = mock(V1APIGroup.class);
        ApiResponse<V1APIGroup> mockResponse = new ApiResponse<>(200, new HashMap<>(), mockAPIGroup);
        doReturn(mockCall).when(mockApiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        doReturn(mockResponse).when(mockApiClient).execute(any(), any());
        V1APIGroup result = authenticationApi.getAPIGroup().execute();
        assertThat(result, is(equalTo(mockAPIGroup)));
        verify(mockApiClient, times(1)).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        verify(mockApiClient, times(1)).execute(any(), any());
    }

    //BaseRock generated method id: ${testGetAPIGroupRequestExecuteWithHttpInfo}, hash: 1D9223B3D591926B845F19C3805FC936
    @Test
    void testGetAPIGroupRequestExecuteWithHttpInfo() throws ApiException {
        V1APIGroup mockAPIGroup = mock(V1APIGroup.class);
        ApiResponse<V1APIGroup> mockResponse = new ApiResponse<>(200, new HashMap<>(), mockAPIGroup);
        doReturn(mockCall).when(mockApiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        doReturn(mockResponse).when(mockApiClient).execute(any(), any());
        ApiResponse<V1APIGroup> result = authenticationApi.getAPIGroup().executeWithHttpInfo();
        assertThat(result, is(equalTo(mockResponse)));
        verify(mockApiClient, times(1)).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        verify(mockApiClient, times(1)).execute(any(), any());
    }

    //BaseRock generated method id: ${testGetAPIGroupRequestExecuteAsync}, hash: 8155320F0E928C8A3F8F61B4B832E644
    @Test
    void testGetAPIGroupRequestExecuteAsync() throws ApiException {
        ApiCallback<V1APIGroup> mockCallback = mock(ApiCallback.class);
        doReturn(mockCall).when(mockApiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        doNothing().when(mockApiClient).executeAsync(any(), any(), any());
        authenticationApi.getAPIGroup().executeAsync(mockCallback);
        verify(mockApiClient, times(1)).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        verify(mockApiClient, times(1)).executeAsync(any(), any(), any());
    }

    //BaseRock generated method id: ${testApiExceptionHandling}, hash: E4B4F9833C89B229C828116CBE415189
    @Test
    void testApiExceptionHandling() throws ApiException {
        doReturn(mockCall).when(mockApiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        when(mockApiClient.execute(any(), any())).thenThrow(new ApiException());
        assertThrows(ApiException.class, () -> authenticationApi.getAPIGroup().execute());
    }
}
