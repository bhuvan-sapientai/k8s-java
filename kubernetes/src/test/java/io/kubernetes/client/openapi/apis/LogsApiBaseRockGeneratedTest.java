package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiClient;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.openapi.Configuration;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.ApiResponse;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import io.kubernetes.client.openapi.ApiCallback;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import io.kubernetes.client.openapi.Pair;
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
class LogsApiBaseRockGeneratedTest {

    @Mock
    private ApiClient apiClient;

    @Mock
    private Call call;

    private LogsApi logsApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        logsApi = new LogsApi(apiClient);
    }

    //BaseRock generated method id: ${testConstructor}, hash: F3D3874C28E924B65E5AF009C4B77467
    @Test
    void testConstructor() {
        try (var mockedConfiguration = mockStatic(Configuration.class)) {
            mockedConfiguration.when(Configuration::getDefaultApiClient).thenReturn(apiClient);
            LogsApi api = new LogsApi();
            assertNotNull(api);
        }
    }

    //BaseRock generated method id: ${testGetApiClient}, hash: 594CCF2BFCD8C1CEEDD055B098C0C2EF
    @Test
    void testGetApiClient() {
        assertEquals(apiClient, logsApi.getApiClient());
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: 3DB7E2621C00E43109799D44986DC1FC
    @Test
    void testSetApiClient() {
        ApiClient newApiClient = mock(ApiClient.class);
        logsApi.setApiClient(newApiClient);
        assertEquals(newApiClient, logsApi.getApiClient());
    }

    //BaseRock generated method id: ${testGetHostIndex}, hash: 6E155C74101EDFA29B85D234A222315A
    @Test
    void testGetHostIndex() {
        assertEquals(0, logsApi.getHostIndex());
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: 570DC743168948BFB53A973D897DDD7A
    @Test
    void testSetHostIndex() {
        int newIndex = 1;
        logsApi.setHostIndex(newIndex);
        assertEquals(newIndex, logsApi.getHostIndex());
    }

    //BaseRock generated method id: ${testGetCustomBaseUrl}, hash: 35718456769ACE9FA6EF0EF48EE276BE
    @Test
    void testGetCustomBaseUrl() {
        assertNull(logsApi.getCustomBaseUrl());
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: 37C4B9BFEB1BBF8644A39BE6491F2D4F
    @Test
    void testSetCustomBaseUrl() {
        String newUrl = "https://example.com";
        logsApi.setCustomBaseUrl(newUrl);
        assertEquals(newUrl, logsApi.getCustomBaseUrl());
    }

    //BaseRock generated method id: ${testLogFileHandler}, hash: D72341183B18B6F75C64AAEF8249C8DF
    @Test
    void testLogFileHandler() throws ApiException {
        String logpath = "test/log.txt";
        when(apiClient.escapeString(logpath)).thenReturn(logpath);
        when(apiClient.buildCall(isNull(), contains(logpath), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any())).thenReturn(call);
        doReturn(new ApiResponse<Void>(200, new HashMap<>())).when(apiClient).execute(eq(call));
        LogsApi.APIlogFileHandlerRequest request = logsApi.logFileHandler(logpath);
        assertNotNull(request);
        request.execute();
        verify(apiClient).escapeString(logpath);
        verify(apiClient).buildCall(isNull(), contains(logpath), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any());
        verify(apiClient).execute(eq(call));
    }

    //BaseRock generated method id: ${testLogFileHandlerAsync}, hash: 0488A86CBECBE9AE6F9D6D27F4209F8A
    @Test
    void testLogFileHandlerAsync() throws ApiException {
        String logpath = "test/log.txt";
        ApiCallback<Void> callback = mock(ApiCallback.class);
        when(apiClient.escapeString(logpath)).thenReturn(logpath);
        when(apiClient.buildCall(isNull(), contains(logpath), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any())).thenReturn(call);
        LogsApi.APIlogFileHandlerRequest request = logsApi.logFileHandler(logpath);
        assertNotNull(request);
        request.executeAsync(callback);
        verify(apiClient).escapeString(logpath);
        verify(apiClient).buildCall(isNull(), contains(logpath), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any());
        verify(apiClient).executeAsync(eq(call), eq(callback));
    }

    //BaseRock generated method id: ${testLogFileHandlerValidateBeforeCall}, hash: E03A3790331C2496550D7BD3BC571193
    @Test
    void testLogFileHandlerValidateBeforeCall() throws ApiException {
        String logpath = "test/log.txt";
        when(apiClient.escapeString(logpath)).thenReturn(logpath);
        when(apiClient.buildCall(isNull(), contains(logpath), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any())).thenReturn(call);
        LogsApi.APIlogFileHandlerRequest request = logsApi.logFileHandler(logpath);
        assertNotNull(request);
        assertDoesNotThrow(() -> request.buildCall(null));
        verify(apiClient).escapeString(logpath);
        verify(apiClient).buildCall(isNull(), contains(logpath), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any());
    }

    //BaseRock generated method id: ${testLogFileHandlerValidateBeforeCallNullLogpath}, hash: 98B5D40C62FEC6F7D1A8BF8EAA4BDDD8
    @Disabled()
    @Test
    void testLogFileHandlerValidateBeforeCallNullLogpath() {
        ApiException exception = assertThrows(ApiException.class, () -> logsApi.logFileHandler(null).buildCall(null));
        assertEquals("Missing the required parameter 'logpath' when calling logFileHandler(Async)", exception.getMessage());
    }

    //BaseRock generated method id: ${testLogFileListHandler}, hash: 6013BAD707129385D4898BB776F8534C
    @Test
    void testLogFileListHandler() throws ApiException {
        when(apiClient.buildCall(isNull(), eq("/logs/"), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any())).thenReturn(call);
        doReturn(new ApiResponse<Void>(200, new HashMap<>())).when(apiClient).execute(eq(call));
        LogsApi.APIlogFileListHandlerRequest request = logsApi.logFileListHandler();
        assertNotNull(request);
        request.execute();
        verify(apiClient).buildCall(isNull(), eq("/logs/"), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any());
        verify(apiClient).execute(eq(call));
    }

    //BaseRock generated method id: ${testLogFileListHandlerAsync}, hash: 61420DD1DDA368E541039B104DFE3569
    @Test
    void testLogFileListHandlerAsync() throws ApiException {
        ApiCallback<Void> callback = mock(ApiCallback.class);
        when(apiClient.buildCall(isNull(), eq("/logs/"), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any())).thenReturn(call);
        LogsApi.APIlogFileListHandlerRequest request = logsApi.logFileListHandler();
        assertNotNull(request);
        request.executeAsync(callback);
        verify(apiClient).buildCall(isNull(), eq("/logs/"), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any());
        verify(apiClient).executeAsync(eq(call), eq(callback));
    }

    //BaseRock generated method id: ${testLogFileListHandlerValidateBeforeCall}, hash: 38DE517462E78B4162F06D7941FB546F
    @Test
    void testLogFileListHandlerValidateBeforeCall() throws ApiException {
        when(apiClient.buildCall(isNull(), eq("/logs/"), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any())).thenReturn(call);
        LogsApi.APIlogFileListHandlerRequest request = logsApi.logFileListHandler();
        assertNotNull(request);
        assertDoesNotThrow(() -> request.buildCall(null));
        verify(apiClient).buildCall(isNull(), eq("/logs/"), eq("GET"), any(), any(), isNull(), any(), any(), any(), any(), any());
    }
}
