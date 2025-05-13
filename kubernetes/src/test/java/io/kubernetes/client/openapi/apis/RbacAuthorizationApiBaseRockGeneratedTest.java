package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiClient;
import org.junit.jupiter.api.BeforeEach;
import java.lang.reflect.Type;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.openapi.Configuration;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.ApiResponse;
import org.mockito.Mock;
import org.junit.jupiter.api.Disabled;
import io.kubernetes.client.openapi.models.V1APIGroup;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import io.kubernetes.client.openapi.ApiCallback;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.*;
import okhttp3.Call;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class RbacAuthorizationApiBaseRockGeneratedTest {

    @Mock
    private ApiClient mockApiClient;

    @Mock
    private Call mockCall;

    private RbacAuthorizationApi rbacAuthorizationApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        rbacAuthorizationApi = new RbacAuthorizationApi(mockApiClient);
    }

    //BaseRock generated method id: ${testConstructor}, hash: 97F85E9B8B784FBB29664F998912AADA
    @Test
    void testConstructor() {
        try (MockedStatic<Configuration> mockedConfiguration = mockStatic(Configuration.class)) {
            ApiClient defaultApiClient = mock(ApiClient.class);
            mockedConfiguration.when(Configuration::getDefaultApiClient).thenReturn(defaultApiClient);
            RbacAuthorizationApi api = new RbacAuthorizationApi();
            assertEquals(defaultApiClient, api.getApiClient());
        }
    }

    //BaseRock generated method id: ${testGetApiClient}, hash: 5CBB946358DF7DCBAFB4549E508E0C17
    @Test
    void testGetApiClient() {
        assertEquals(mockApiClient, rbacAuthorizationApi.getApiClient());
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: 0BC670ACD9440BCD3F389A3E55B0DA91
    @Test
    void testSetApiClient() {
        ApiClient newApiClient = mock(ApiClient.class);
        rbacAuthorizationApi.setApiClient(newApiClient);
        assertEquals(newApiClient, rbacAuthorizationApi.getApiClient());
    }

    //BaseRock generated method id: ${testGetHostIndex}, hash: 21A8D83D67A8DC117F0BB21943DBF658
    @Test
    void testGetHostIndex() {
        assertEquals(0, rbacAuthorizationApi.getHostIndex());
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: 0EDC7E28F282E65886CAD3DF8A3C500E
    @Test
    void testSetHostIndex() {
        rbacAuthorizationApi.setHostIndex(1);
        assertEquals(1, rbacAuthorizationApi.getHostIndex());
    }

    //BaseRock generated method id: ${testGetCustomBaseUrl}, hash: 274A628B78BABE9676AEC62BC76B7144
    @Test
    void testGetCustomBaseUrl() {
        assertNull(rbacAuthorizationApi.getCustomBaseUrl());
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: 68DF71311BB99C013C8C9652BF84119B
    @Test
    void testSetCustomBaseUrl() {
        String customBaseUrl = "https://custom.api.com";
        rbacAuthorizationApi.setCustomBaseUrl(customBaseUrl);
        assertEquals(customBaseUrl, rbacAuthorizationApi.getCustomBaseUrl());
    }

    //BaseRock generated method id: ${testGetAPIGroup}, hash: DAC0B1DA755C1D1485BE8903287699EF
    @Disabled
    @Test
    void testGetAPIGroup() throws ApiException {
    }

    //BaseRock generated method id: ${testGetAPIGroupAsync}, hash: 246566374BD882FFC55AFAA577C4EF83
    @Test
    void testGetAPIGroupAsync() throws ApiException {
        ApiCallback<V1APIGroup> mockCallback = mock(ApiCallback.class);
        when(mockApiClient.buildCall(isNull(), eq("/apis/rbac.authorization.k8s.io/"), eq("GET"), anyList(), anyList(), isNull(), anyMap(), anyMap(), anyMap(), eq(new String[] { "BearerToken" }), eq(mockCallback))).thenReturn(mockCall);
        doNothing().when(mockApiClient).executeAsync(eq(mockCall), any(Type.class), eq(mockCallback));
        rbacAuthorizationApi.getAPIGroup().executeAsync(mockCallback);
        verify(mockApiClient).buildCall(isNull(), eq("/apis/rbac.authorization.k8s.io/"), eq("GET"), anyList(), anyList(), isNull(), anyMap(), anyMap(), anyMap(), eq(new String[] { "BearerToken" }), eq(mockCallback));
        verify(mockApiClient).executeAsync(eq(mockCall), any(Type.class), eq(mockCallback));
    }

    //BaseRock generated method id: ${testGetAPIGroupWithHttpInfo}, hash: CE801AF0656677CE8E62F3281E8E08D2
    @Disabled
    @Test
    void testGetAPIGroupWithHttpInfo() throws ApiException {
    }

    //BaseRock generated method id: ${testGetAPIGroupCall}, hash: 0327408C2782B2C1D5CA2173D642648D
    @Test
    void testGetAPIGroupCall() throws ApiException {
        ApiCallback<V1APIGroup> mockCallback = mock(ApiCallback.class);
        when(mockApiClient.buildCall(isNull(), eq("/apis/rbac.authorization.k8s.io/"), eq("GET"), anyList(), anyList(), isNull(), anyMap(), anyMap(), anyMap(), eq(new String[] { "BearerToken" }), eq(mockCallback))).thenReturn(mockCall);
        Call result = rbacAuthorizationApi.getAPIGroup().buildCall(mockCallback);
        assertEquals(mockCall, result);
        verify(mockApiClient).buildCall(isNull(), eq("/apis/rbac.authorization.k8s.io/"), eq("GET"), anyList(), anyList(), isNull(), anyMap(), anyMap(), anyMap(), eq(new String[] { "BearerToken" }), eq(mockCallback));
    }
}
