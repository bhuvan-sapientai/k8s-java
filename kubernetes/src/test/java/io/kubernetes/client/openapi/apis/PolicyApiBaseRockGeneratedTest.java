package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiClient;
import org.junit.jupiter.api.BeforeEach;
import java.lang.reflect.Type;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.ApiResponse;
import org.mockito.Mock;
import io.kubernetes.client.openapi.models.V1APIGroup;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import io.kubernetes.client.openapi.ApiCallback;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import okhttp3.Call;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class PolicyApiBaseRockGeneratedTest {

    @Mock
    private ApiClient apiClient;

    @Mock
    private Call call;

    private PolicyApi policyApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        policyApi = new PolicyApi(apiClient);
    }

    //BaseRock generated method id: ${testGetAPIGroup}, hash: A36ABD889C1A5BA3E29616C365FA3DD6
    @Disabled
    @Test
    void testGetAPIGroup() throws ApiException {
        // Arrange
        //V1APIGroup expectedResponse = new V1APIGroup();
        //ApiResponse<V1APIGroup> apiResponse = new ApiResponse<>(200, new HashMap<>(), expectedResponse);
        //when(apiClient.buildCall(isNull(), eq("/apis/policy/"), eq("GET"), anyList(), anyList(), isNull(), anyMap(), anyMap(), anyMap(), any(String[].class), isNull())).thenReturn(call);
        //when(apiClient.execute(eq(call), any(Type.class))).thenReturn(apiResponse);
        // Act
        //V1APIGroup result = policyApi.getAPIGroup().execute();
        // Assert
        //assertNotNull(result);
        //assertEquals(expectedResponse, result);
        //verify(apiClient).buildCall(isNull(), eq("/apis/policy/"), eq("GET"), anyList(), anyList(), isNull(), anyMap(), anyMap(), anyMap(), any(String[].class), isNull());
        //verify(apiClient).execute(eq(call), any(Type.class));
    }

    //BaseRock generated method id: ${testGetAPIGroupAsync}, hash: 3517115B1704F60A637AE833CED810F4
    @Test
    void testGetAPIGroupAsync() throws ApiException {
        // Arrange
        ApiCallback<V1APIGroup> callback = mock(ApiCallback.class);
        when(apiClient.buildCall(isNull(), eq("/apis/policy/"), eq("GET"), anyList(), anyList(), isNull(), anyMap(), anyMap(), anyMap(), any(String[].class), eq(callback))).thenReturn(call);
        doNothing().when(apiClient).executeAsync(eq(call), any(Type.class), eq(callback));
        // Act
        policyApi.getAPIGroup().executeAsync(callback);
        // Assert
        verify(apiClient).buildCall(isNull(), eq("/apis/policy/"), eq("GET"), anyList(), anyList(), isNull(), anyMap(), anyMap(), anyMap(), any(String[].class), eq(callback));
        verify(apiClient).executeAsync(eq(call), any(Type.class), eq(callback));
    }

    //BaseRock generated method id: ${testGetAPIGroupWithHttpInfo}, hash: CF28C86D3F2466A335F7AB58B0627A89
    @Disabled
    @Test
    void testGetAPIGroupWithHttpInfo() throws ApiException {
        // Arrange
        //V1APIGroup expectedResponse = new V1APIGroup();
        //ApiResponse<V1APIGroup> expectedApiResponse = new ApiResponse<>(200, new HashMap<>(), expectedResponse);
        //when(apiClient.buildCall(isNull(), eq("/apis/policy/"), eq("GET"), anyList(), anyList(), isNull(), anyMap(), anyMap(), anyMap(), any(String[].class), isNull())).thenReturn(call);
        //when(apiClient.execute(eq(call), any(Type.class))).thenReturn(expectedApiResponse);
        // Act
        //ApiResponse<V1APIGroup> result = policyApi.getAPIGroup().executeWithHttpInfo();
        // Assert
        //assertNotNull(result);
        //assertEquals(expectedApiResponse.getStatusCode(), result.getStatusCode());
        //assertEquals(expectedApiResponse.getHeaders(), result.getHeaders());
        //assertEquals(expectedApiResponse.getData(), result.getData());
        //verify(apiClient).buildCall(isNull(), eq("/apis/policy/"), eq("GET"), anyList(), anyList(), isNull(), anyMap(), anyMap(), anyMap(), any(String[].class), isNull());
        //verify(apiClient).execute(eq(call), any(Type.class));
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: 0A9767F61ADB9B8C582EF02E60130339
    @Test
    void testSetApiClient() {
        // Arrange
        ApiClient newApiClient = mock(ApiClient.class);
        // Act
        policyApi.setApiClient(newApiClient);
        // Assert
        assertEquals(newApiClient, policyApi.getApiClient());
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: 84B88386E17FDA9435C28DE747350A30
    @Test
    void testSetHostIndex() {
        // Arrange
        int newHostIndex = 1;
        // Act
        policyApi.setHostIndex(newHostIndex);
        // Assert
        assertEquals(newHostIndex, policyApi.getHostIndex());
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: AAFB4F545BEDE389ED5B2CC9901274BE
    @Test
    void testSetCustomBaseUrl() {
        // Arrange
        String newCustomBaseUrl = "https://example.com/api";
        // Act
        policyApi.setCustomBaseUrl(newCustomBaseUrl);
        // Assert
        assertEquals(newCustomBaseUrl, policyApi.getCustomBaseUrl());
    }
}