package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiClient;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.openapi.Configuration;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.junit.jupiter.api.Disabled;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import static org.mockito.ArgumentMatchers.*;
import io.kubernetes.client.openapi.Pair;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.*;
import okhttp3.Call;
import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.ApiResponse;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.ApiCallback;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class OpenidApiBaseRockGeneratedTest {

    @Mock
    private ApiClient apiClient;

    @Mock
    private Call call;

    private OpenidApi openidApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        openidApi = new OpenidApi(apiClient);
    }

    //BaseRock generated method id: ${testGetServiceAccountIssuerOpenIDKeyset}, hash: 988B0B0B8F05A6E8052461CF3CE18035
    @Disabled
    @Test
    void testGetServiceAccountIssuerOpenIDKeyset() throws ApiException {
        //String expectedResponse = "test response";
        //ApiResponse<String> apiResponse = new ApiResponse<>(200, new HashMap<>(), expectedResponse);
        //when(apiClient.buildCall(anyString(), anyString(), eq("GET"), anyList(), anyList(), isNull(), anyMap(), anyMap(), anyMap(), any(String[].class), any())).thenReturn(call);
        //when(apiClient.execute(any(Call.class), any())).thenReturn(apiResponse);
        //String response = openidApi.getServiceAccountIssuerOpenIDKeyset().execute();
        //assertEquals(expectedResponse, response);
        //verify(apiClient).buildCall(isNull(), eq("/openid/v1/jwks"), eq("GET"), anyList(), anyList(), isNull(), anyMap(), anyMap(), anyMap(), any(String[].class), isNull());
        //verify(apiClient).execute(eq(call), any());
    }

    //BaseRock generated method id: ${testGetServiceAccountIssuerOpenIDKeysetWithHttpInfo}, hash: 23C4F81FF08D470192035994E6735044
    @Disabled
    @Test
    void testGetServiceAccountIssuerOpenIDKeysetWithHttpInfo() throws ApiException {
        //String expectedResponse = "test response";
        //ApiResponse<String> apiResponse = new ApiResponse<>(200, new HashMap<>(), expectedResponse);
        //when(apiClient.buildCall(anyString(), anyString(), eq("GET"), anyList(), anyList(), isNull(), anyMap(), anyMap(), anyMap(), any(String[].class), any())).thenReturn(call);
        //when(apiClient.execute(any(Call.class), any())).thenReturn(apiResponse);
        //ApiResponse<String> response = openidApi.getServiceAccountIssuerOpenIDKeyset().executeWithHttpInfo();
        //assertEquals(apiResponse, response);
        //verify(apiClient).buildCall(isNull(), eq("/openid/v1/jwks"), eq("GET"), anyList(), anyList(), isNull(), anyMap(), anyMap(), anyMap(), any(String[].class), isNull());
        //verify(apiClient).execute(eq(call), any());
    }

    //BaseRock generated method id: ${testGetServiceAccountIssuerOpenIDKeysetAsync}, hash: DD5FB7EECEC28E20CE8CA69CD9CACE64
    @Test
    void testGetServiceAccountIssuerOpenIDKeysetAsync() throws ApiException {
        ApiCallback<String> callback = mock(ApiCallback.class);
        when(apiClient.buildCall(isNull(), eq("/openid/v1/jwks"), eq("GET"), anyList(), anyList(), isNull(), anyMap(), anyMap(), anyMap(), any(String[].class), any())).thenReturn(call);
        doNothing().when(apiClient).executeAsync(eq(call), any(), eq(callback));
        openidApi.getServiceAccountIssuerOpenIDKeyset().executeAsync(callback);
        verify(apiClient).buildCall(isNull(), eq("/openid/v1/jwks"), eq("GET"), anyList(), anyList(), isNull(), anyMap(), anyMap(), anyMap(), any(String[].class), eq(callback));
        verify(apiClient).executeAsync(eq(call), any(), eq(callback));
    }

    //BaseRock generated method id: ${testGetApiClient}, hash: 5D6D93562D797FBCC512918E41672D20
    @Test
    void testGetApiClient() {
        assertEquals(apiClient, openidApi.getApiClient());
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: 6166C8C0EF07FBD59CC811861F993D42
    @Test
    void testSetApiClient() {
        ApiClient newApiClient = mock(ApiClient.class);
        openidApi.setApiClient(newApiClient);
        assertEquals(newApiClient, openidApi.getApiClient());
    }

    //BaseRock generated method id: ${testGetHostIndex}, hash: D6C816F06BCDA3732D37030E72D4FD92
    @Test
    void testGetHostIndex() {
        assertEquals(0, openidApi.getHostIndex());
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: B0566D6902153AB99703585FF7E293A4
    @Test
    void testSetHostIndex() {
        int newHostIndex = 1;
        openidApi.setHostIndex(newHostIndex);
        assertEquals(newHostIndex, openidApi.getHostIndex());
    }

    //BaseRock generated method id: ${testGetCustomBaseUrl}, hash: 2A5B1DCB5DF237231649D0BA53223D23
    @Test
    void testGetCustomBaseUrl() {
        assertNull(openidApi.getCustomBaseUrl());
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: A8B55E989F151DBDE786695742A687C5
    @Test
    void testSetCustomBaseUrl() {
        String newCustomBaseUrl = "https://example.com";
        openidApi.setCustomBaseUrl(newCustomBaseUrl);
        assertEquals(newCustomBaseUrl, openidApi.getCustomBaseUrl());
    }

    //BaseRock generated method id: ${testOpenidApiConstructor}, hash: 9513E8D844B2885C4B0026009ED374BF
    @Test
    void testOpenidApiConstructor() {
        try (MockedStatic<Configuration> mockedConfiguration = mockStatic(Configuration.class)) {
            ApiClient defaultApiClient = mock(ApiClient.class);
            mockedConfiguration.when(Configuration::getDefaultApiClient).thenReturn(defaultApiClient);
            OpenidApi api = new OpenidApi();
            assertEquals(defaultApiClient, api.getApiClient());
        }
    }
}
