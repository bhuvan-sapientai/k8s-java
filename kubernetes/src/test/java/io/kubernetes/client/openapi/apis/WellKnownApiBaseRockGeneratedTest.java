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
import io.kubernetes.client.openapi.ProgressRequestBody;
import io.kubernetes.client.openapi.Pair;
import org.mockito.MockedStatic;
import java.util.HashMap;
import java.util.List;
import io.kubernetes.client.openapi.ProgressResponseBody;
import java.lang.reflect.Type;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
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
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class WellKnownApiBaseRockGeneratedTest {

    @Mock
    private ApiClient mockApiClient;

    private WellKnownApi wellKnownApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        wellKnownApi = new WellKnownApi(mockApiClient);
    }

    //BaseRock generated method id: ${testConstructor}, hash: A00DDD024532DB484070EE134CDFF71E
    @Test
    void testConstructor() {
        try (MockedStatic<Configuration> mockedConfiguration = mockStatic(Configuration.class)) {
            ApiClient defaultApiClient = mock(ApiClient.class);
            mockedConfiguration.when(Configuration::getDefaultApiClient).thenReturn(defaultApiClient);
            WellKnownApi api = new WellKnownApi();
            assertThat(api, is(notNullValue()));
        }
    }

    //BaseRock generated method id: ${testGetApiClient}, hash: 12366F65DFD47CC29352F11C7AC9BB4D
    @Test
    void testGetApiClient() {
        assertThat(wellKnownApi.getApiClient(), is(mockApiClient));
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: F23A038C48B1A0FBBBD035AD939F1B0C
    @Test
    void testSetApiClient() {
        ApiClient newApiClient = mock(ApiClient.class);
        wellKnownApi.setApiClient(newApiClient);
        assertThat(wellKnownApi.getApiClient(), is(newApiClient));
    }

    //BaseRock generated method id: ${testGetHostIndex}, hash: F16CF34216CBF8B684EC9BAE31759359
    @Test
    void testGetHostIndex() {
        assertThat(wellKnownApi.getHostIndex(), is(0));
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: F8DF19F066281106AFF1AC8E9CD01E90
    @Test
    void testSetHostIndex() {
        wellKnownApi.setHostIndex(1);
        assertThat(wellKnownApi.getHostIndex(), is(1));
    }

    //BaseRock generated method id: ${testGetCustomBaseUrl}, hash: 352CDA4CDE6E09220136FD95E1DA20C4
    @Disabled()
    @Test
    void testGetCustomBaseUrl() {
        assertThat(wellKnownApi.getCustomBaseUrl(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: CA4A3B7BBB49D55E44D67969BBCB382B
    @Test
    void testSetCustomBaseUrl() {
        String customBaseUrl = "https://example.com";
        wellKnownApi.setCustomBaseUrl(customBaseUrl);
        assertThat(wellKnownApi.getCustomBaseUrl(), is(customBaseUrl));
    }

    //BaseRock generated method id: ${testGetServiceAccountIssuerOpenIDConfiguration}, hash: E52A70756D07AFF1526F5173421D48AF
    @Test
    void testGetServiceAccountIssuerOpenIDConfiguration() throws ApiException {
        String mockResponse = "Mock Response";
        okhttp3.Call mockCall = mock(okhttp3.Call.class);
        doReturn(mockCall).when(mockApiClient).buildCall(eq(null), eq("/.well-known/openid-configuration"), eq("GET"), any(), any(), eq(null), any(), any(), any(), eq(new String[] { "BearerToken" }), any());
        ApiResponse<String> mockApiResponse = new ApiResponse<>(200, new HashMap<>(), mockResponse);
        doReturn(mockApiResponse).when(mockApiClient).execute(any(), any());
        String result = wellKnownApi.getServiceAccountIssuerOpenIDConfiguration().execute();
        assertThat(result, is(mockResponse));
        verify(mockApiClient, times(1)).buildCall(eq(null), eq("/.well-known/openid-configuration"), eq("GET"), any(), any(), eq(null), any(), any(), any(), eq(new String[] { "BearerToken" }), any());
        verify(mockApiClient, times(1)).execute(any(), any());
    }

    //BaseRock generated method id: ${testGetServiceAccountIssuerOpenIDConfigurationAsync}, hash: 8F6F5790379531D2CB96480DF767DE72
    @Test
    void testGetServiceAccountIssuerOpenIDConfigurationAsync() throws ApiException {
        ApiCallback<String> mockCallback = mock(ApiCallback.class);
        okhttp3.Call mockCall = mock(okhttp3.Call.class);
        doReturn(mockCall).when(mockApiClient).buildCall(eq(null), eq("/.well-known/openid-configuration"), eq("GET"), any(), any(), eq(null), any(), any(), any(), eq(new String[] { "BearerToken" }), any());
        wellKnownApi.getServiceAccountIssuerOpenIDConfiguration().executeAsync(mockCallback);
        verify(mockApiClient, times(1)).buildCall(eq(null), eq("/.well-known/openid-configuration"), eq("GET"), any(), any(), eq(null), any(), any(), any(), eq(new String[] { "BearerToken" }), any());
        verify(mockApiClient, times(1)).executeAsync(any(), any(), eq(mockCallback));
    }

    //BaseRock generated method id: ${testGetServiceAccountIssuerOpenIDConfigurationCall}, hash: 76AEEEEA21A26820261A0DD934A0292F
    @Test
    void testGetServiceAccountIssuerOpenIDConfigurationCall() throws ApiException {
        okhttp3.Call mockCall = mock(okhttp3.Call.class);
        doReturn(mockCall).when(mockApiClient).buildCall(eq(null), eq("/.well-known/openid-configuration"), eq("GET"), any(), any(), eq(null), any(), any(), any(), eq(new String[] { "BearerToken" }), any());
        okhttp3.Call result = wellKnownApi.getServiceAccountIssuerOpenIDConfiguration().buildCall(null);
        assertThat(result, is(mockCall));
        verify(mockApiClient, times(1)).buildCall(eq(null), eq("/.well-known/openid-configuration"), eq("GET"), any(), any(), eq(null), any(), any(), any(), eq(new String[] { "BearerToken" }), any());
    }
}
