package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiClient;
import static org.mockito.Mockito.doReturn;
import io.kubernetes.client.openapi.models.VersionInfo;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.openapi.Configuration;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
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
import static org.mockito.ArgumentMatchers.anyList;
import io.kubernetes.client.openapi.ApiResponse;
import org.junit.jupiter.api.Timeout;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mockStatic;
import io.kubernetes.client.openapi.ApiCallback;
import java.util.ArrayList;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class VersionApiBaseRockGeneratedTest {

    @Mock
    private ApiClient apiClient;

    private VersionApi versionApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        versionApi = new VersionApi(apiClient);
    }

    //BaseRock generated method id: ${testConstructor}, hash: 9E65E29542BA5363DEB272CD2A42F288
    @Test
    void testConstructor() {
        try (MockedStatic<Configuration> mockedConfiguration = mockStatic(Configuration.class)) {
            ApiClient defaultApiClient = mock(ApiClient.class);
            mockedConfiguration.when(Configuration::getDefaultApiClient).thenReturn(defaultApiClient);
            VersionApi api = new VersionApi();
            assertNotNull(api);
            assertEquals(defaultApiClient, api.getApiClient());
        }
    }

    //BaseRock generated method id: ${testGetApiClient}, hash: B5EDF756D1A59AB1DE681C37FF912A8B
    @Test
    void testGetApiClient() {
        assertEquals(apiClient, versionApi.getApiClient());
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: 2AA512BF58030F8E40FCE0865A1618C2
    @Test
    void testSetApiClient() {
        ApiClient newApiClient = mock(ApiClient.class);
        versionApi.setApiClient(newApiClient);
        assertEquals(newApiClient, versionApi.getApiClient());
    }

    //BaseRock generated method id: ${testGetHostIndex}, hash: 5E9F8C65B34AFB85DEA22EF562901CB6
    @Test
    void testGetHostIndex() {
        assertEquals(0, versionApi.getHostIndex());
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: 7BF0F913A6831F333E0E3D96972093D5
    @Test
    void testSetHostIndex() {
        versionApi.setHostIndex(1);
        assertEquals(1, versionApi.getHostIndex());
    }

    //BaseRock generated method id: ${testGetCustomBaseUrl}, hash: BAFF767C9F05951F04C313938765C7C8
    @Test
    void testGetCustomBaseUrl() {
        assertEquals(null, versionApi.getCustomBaseUrl());
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: 97DCDA010CEC088022B19B67EFD3D094
    @Test
    void testSetCustomBaseUrl() {
        String customBaseUrl = "https://custom.api.url";
        versionApi.setCustomBaseUrl(customBaseUrl);
        assertEquals(customBaseUrl, versionApi.getCustomBaseUrl());
    }

    //BaseRock generated method id: ${testGetCode}, hash: 6CDA85C9C39A23EB507D30BA2F1CEA11
    @Disabled()
    @Test
    void testGetCode() throws ApiException {
        VersionInfo versionInfo = new VersionInfo();
        Call call = mock(Call.class);
        ApiResponse<VersionInfo> apiResponse = new ApiResponse<>(200, new HashMap<>(), versionInfo);
        doReturn("application/json").when(apiClient).selectHeaderAccept(any());
        doReturn("").when(apiClient).selectHeaderContentType(any());
        doReturn(call).when(apiClient).buildCall(anyString(), anyString(), anyString(), anyList(), anyList(), any(), anyMap(), anyMap(), anyMap(), any(), any());
        doReturn(apiResponse).when(apiClient).execute(any(Call.class), any(Type.class));
        VersionApi.APIgetCodeRequest request = versionApi.getCode();
        assertNotNull(request);
        VersionInfo result = request.execute();
        assertNotNull(result);
        assertEquals(versionInfo, result);
        verify(apiClient, times(1)).selectHeaderAccept(any());
        verify(apiClient, times(1)).selectHeaderContentType(any());
        verify(apiClient, times(1)).buildCall(anyString(), anyString(), anyString(), anyList(), anyList(), any(), anyMap(), anyMap(), anyMap(), any(), any());
        verify(apiClient, times(1)).execute(any(Call.class), any(Type.class));
    }

    //BaseRock generated method id: ${testGetCodeWithHttpInfo}, hash: 2A1B4CAC6557EC74A77894F62C4C9A9E
    @Disabled()
    @Test
    void testGetCodeWithHttpInfo() throws ApiException {
        VersionInfo versionInfo = new VersionInfo();
        Call call = mock(Call.class);
        ApiResponse<VersionInfo> apiResponse = new ApiResponse<>(200, new HashMap<>(), versionInfo);
        doReturn("application/json").when(apiClient).selectHeaderAccept(any());
        doReturn("").when(apiClient).selectHeaderContentType(any());
        doReturn(call).when(apiClient).buildCall(anyString(), anyString(), anyString(), anyList(), anyList(), any(), anyMap(), anyMap(), anyMap(), any(), any());
        doReturn(apiResponse).when(apiClient).execute(any(Call.class), any(Type.class));
        VersionApi.APIgetCodeRequest request = versionApi.getCode();
        assertNotNull(request);
        ApiResponse<VersionInfo> result = request.executeWithHttpInfo();
        assertNotNull(result);
        assertEquals(200, result.getStatusCode());
        assertEquals(versionInfo, result.getData());
        verify(apiClient, times(1)).selectHeaderAccept(any());
        verify(apiClient, times(1)).selectHeaderContentType(any());
        verify(apiClient, times(1)).buildCall(anyString(), anyString(), anyString(), anyList(), anyList(), any(), anyMap(), anyMap(), anyMap(), any(), any());
        verify(apiClient, times(1)).execute(any(Call.class), any(Type.class));
    }

    //BaseRock generated method id: ${testGetCodeAsync}, hash: 5FC8419B0EEF5BB41CA529C45463176D
    @Disabled()
    @Test
    void testGetCodeAsync() throws ApiException {
        VersionInfo versionInfo = new VersionInfo();
        Call call = mock(Call.class);
        doReturn("application/json").when(apiClient).selectHeaderAccept(any());
        doReturn("").when(apiClient).selectHeaderContentType(any());
        doReturn(call).when(apiClient).buildCall(anyString(), anyString(), anyString(), anyList(), anyList(), any(), anyMap(), anyMap(), anyMap(), any(), any());
        doReturn(null).when(apiClient).executeAsync(any(Call.class), any(Type.class), any());
        ApiCallback<VersionInfo> callback = mock(ApiCallback.class);
        VersionApi.APIgetCodeRequest request = versionApi.getCode();
        assertNotNull(request);
        request.executeAsync(callback);
        verify(apiClient, times(1)).selectHeaderAccept(any());
        verify(apiClient, times(1)).selectHeaderContentType(any());
        verify(apiClient, times(1)).buildCall(anyString(), anyString(), anyString(), anyList(), anyList(), any(), anyMap(), anyMap(), anyMap(), any(), any());
        verify(apiClient, times(1)).executeAsync(any(Call.class), any(Type.class), any());
    }

    //BaseRock generated method id: ${testBuildCallForGetCode}, hash: 121D85898873131A895F3334CBD19271
    @Disabled()
    @Test
    void testBuildCallForGetCode() throws ApiException {
        Call expectedCall = mock(Call.class);
        doReturn("application/json").when(apiClient).selectHeaderAccept(any());
        doReturn("").when(apiClient).selectHeaderContentType(any());
        doReturn(expectedCall).when(apiClient).buildCall(anyString(), anyString(), anyString(), anyList(), anyList(), any(), anyMap(), anyMap(), anyMap(), any(), any());
        VersionApi.APIgetCodeRequest request = versionApi.getCode();
        assertNotNull(request);
        Call actualCall = request.buildCall(null);
        assertNotNull(actualCall);
        assertEquals(expectedCall, actualCall);
        verify(apiClient, times(1)).selectHeaderAccept(any());
        verify(apiClient, times(1)).selectHeaderContentType(any());
        verify(apiClient, times(1)).buildCall(anyString(), anyString(), anyString(), anyList(), anyList(), any(), anyMap(), anyMap(), anyMap(), any(), any());
    }
}
