package io.kubernetes.client.openapi.apis;

import java.util.List;
import java.lang.reflect.Type;
import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.openapi.*;
import java.util.Map;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import com.google.gson.reflect.TypeToken;
import org.mockito.Mock;
import org.junit.jupiter.api.Disabled;
import io.kubernetes.client.openapi.models.V1APIGroup;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.ArrayList;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import java.util.HashMap;
import okhttp3.Call;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class BatchApiBaseRockGeneratedTest {

    @Mock
    private ApiClient mockApiClient;

    @Mock
    private Call mockCall;

    private BatchApi batchApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        batchApi = new BatchApi(mockApiClient);
    }

    //BaseRock generated method id: ${testConstructor}, hash: EF02824A35AAA6B2EB6EDE8E5B7E7291
    @Test
    void testConstructor() {
        try (MockedStatic<Configuration> mockedConfiguration = mockStatic(Configuration.class)) {
            mockedConfiguration.when(Configuration::getDefaultApiClient).thenReturn(mockApiClient);
            BatchApi api = new BatchApi();
            assertNotNull(api);
            assertEquals(mockApiClient, api.getApiClient());
        }
    }

    //BaseRock generated method id: ${testGetApiClient}, hash: 92336585A82461DFD8DC9A9E27622B66
    @Test
    void testGetApiClient() {
        assertEquals(mockApiClient, batchApi.getApiClient());
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: E6DA63B5CB8F2E6D49CB4A75B4A7D09C
    @Test
    void testSetApiClient() {
        ApiClient newApiClient = mock(ApiClient.class);
        batchApi.setApiClient(newApiClient);
        assertEquals(newApiClient, batchApi.getApiClient());
    }

    //BaseRock generated method id: ${testGetHostIndex}, hash: 3D57716CB4AD7EE4D12E9173DD91E717
    @Test
    void testGetHostIndex() {
        assertEquals(0, batchApi.getHostIndex());
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: C01B522BF16C752B179B4382FF55A450
    @Test
    void testSetHostIndex() {
        int newIndex = 1;
        batchApi.setHostIndex(newIndex);
        assertEquals(newIndex, batchApi.getHostIndex());
    }

    //BaseRock generated method id: ${testGetCustomBaseUrl}, hash: F4C2BBF7EFAFB142E48253F4B2312BFD
    @Test
    void testGetCustomBaseUrl() {
        assertNull(batchApi.getCustomBaseUrl());
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: F52EAD72D501BBA2BF8CEF8C13BFE841
    @Test
    void testSetCustomBaseUrl() {
        String newUrl = "https://example.com";
        batchApi.setCustomBaseUrl(newUrl);
        assertEquals(newUrl, batchApi.getCustomBaseUrl());
    }

    //BaseRock generated method id: ${testGetAPIGroup}, hash: DAC0B1DA755C1D1485BE8903287699EF
    @Disabled
    @Test
    void testGetAPIGroup() throws ApiException {
    }

    //BaseRock generated method id: ${testGetAPIGroupExecuteWithHttpInfo}, hash: FB4CF6ECE6C1475AAAEAA105A893124B
    @Disabled
    @Test
    void testGetAPIGroupExecuteWithHttpInfo() throws ApiException {
    }

    //BaseRock generated method id: ${testGetAPIGroupExecuteAsync}, hash: BC1333EC59154F94970520FDB110AEB8
    @Test
    void testGetAPIGroupExecuteAsync() throws ApiException {
        ApiCallback<V1APIGroup> mockCallback = mock(ApiCallback.class);
        when(mockApiClient.buildCall(any(), any(), any(), any(), any(), any(), any(), any(), any(), any(), any())).thenReturn(mockCall);
        doNothing().when(mockApiClient).executeAsync(eq(mockCall), any(Type.class), eq(mockCallback));
        Call result = batchApi.getAPIGroup().executeAsync(mockCallback);
        assertNotNull(result);
        assertEquals(mockCall, result);
        verify(mockApiClient).executeAsync(eq(mockCall), any(Type.class), eq(mockCallback));
    }
}
