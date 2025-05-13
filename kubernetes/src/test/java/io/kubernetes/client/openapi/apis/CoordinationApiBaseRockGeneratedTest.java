package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiClient;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import org.junit.jupiter.api.Test;
import com.google.gson.reflect.TypeToken;
import org.mockito.Mock;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;
import io.kubernetes.client.openapi.Pair;
import java.util.HashMap;
import okhttp3.Call;
import java.util.List;
import java.lang.reflect.Type;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.ApiResponse;
import io.kubernetes.client.openapi.models.V1APIGroup;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.ApiCallback;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class CoordinationApiBaseRockGeneratedTest {

    @Mock
    private ApiClient mockApiClient;

    @Mock
    private Call mockCall;

    private CoordinationApi coordinationApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        coordinationApi = new CoordinationApi(mockApiClient);
    }

    //BaseRock generated method id: ${testGetAPIGroup}, hash: AE5E9B9C74B85FA2B8FC2BB9732CB495
    @Disabled
    @Test
    void testGetAPIGroup() throws ApiException {
        // Arrange
        //V1APIGroup expectedResponse = new V1APIGroup();
        //ApiResponse<V1APIGroup> apiResponse = new ApiResponse<>(200, new HashMap<>(), expectedResponse);
        //when(mockApiClient.execute(any(Call.class), any(Type.class))).thenReturn(apiResponse);
        //when(mockApiClient.buildCall(any(), any(), any(), any(), any(), any(), any(), any(), any(), any(), any())).thenReturn(mockCall);
        // Act
        //V1APIGroup result = coordinationApi.getAPIGroup().execute();
        // Assert
        //assertNotNull(result);
        //assertEquals(expectedResponse, result);
        //verify(mockApiClient).buildCall(eq(null), eq("/apis/coordination.k8s.io/"), eq("GET"), any(), any(), eq(null), any(), any(), any(), any(), any());
        //verify(mockApiClient).execute(any(Call.class), any(Type.class));
    }

    //BaseRock generated method id: ${testGetAPIGroupAsync}, hash: 9A297C60294700B0D83C39A81348B66B
    @Test
    void testGetAPIGroupAsync() throws ApiException {
        // Arrange
        ApiCallback<V1APIGroup> mockCallback = mock(ApiCallback.class);
        when(mockApiClient.buildCall(any(), any(), any(), any(), any(), any(), any(), any(), any(), any(), any())).thenReturn(mockCall);
        // Act
        okhttp3.Call result = coordinationApi.getAPIGroup().executeAsync(mockCallback);
        // Assert
        assertNotNull(result);
        assertEquals(mockCall, result);
        verify(mockApiClient).buildCall(eq(null), eq("/apis/coordination.k8s.io/"), eq("GET"), any(), any(), eq(null), any(), any(), any(), any(), any());
        verify(mockApiClient).executeAsync(eq(mockCall), any(Type.class), eq(mockCallback));
    }

    //BaseRock generated method id: ${testGetAPIGroupWithHttpInfo}, hash: ED2B3AE78F97BEC9F84302BA43782E14
    @Disabled
    @Test
    void testGetAPIGroupWithHttpInfo() throws ApiException {
        // Arrange
        //V1APIGroup expectedResponse = new V1APIGroup();
        //ApiResponse<V1APIGroup> apiResponse = new ApiResponse<>(200, new HashMap<>(), expectedResponse);
        //when(mockApiClient.execute(any(Call.class), any(Type.class))).thenReturn(apiResponse);
        //when(mockApiClient.buildCall(any(), any(), any(), any(), any(), any(), any(), any(), any(), any(), any())).thenReturn(mockCall);
        // Act
        //ApiResponse<V1APIGroup> result = coordinationApi.getAPIGroup().executeWithHttpInfo();
        // Assert
        //assertNotNull(result);
        //assertEquals(apiResponse, result);
        //verify(mockApiClient).buildCall(eq(null), eq("/apis/coordination.k8s.io/"), eq("GET"), any(), any(), eq(null), any(), any(), any(), any(), any());
        //verify(mockApiClient).execute(any(Call.class), any(Type.class));
    }

    //BaseRock generated method id: ${testGetApiClient}, hash: BDAD4EFF77B75BE386F381418B425523
    @Test
    void testGetApiClient() {
        // Act
        ApiClient result = coordinationApi.getApiClient();
        // Assert
        assertNotNull(result);
        assertEquals(mockApiClient, result);
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: C776333347BB251BB52DB06C21EC9482
    @Test
    void testSetApiClient() {
        // Arrange
        ApiClient newApiClient = mock(ApiClient.class);
        // Act
        coordinationApi.setApiClient(newApiClient);
        // Assert
        assertEquals(newApiClient, coordinationApi.getApiClient());
    }

    //BaseRock generated method id: ${testGetHostIndex}, hash: ACE7A0A0B12F0A28015B43DF0ED4D636
    @Test
    void testGetHostIndex() {
        // Act
        int result = coordinationApi.getHostIndex();
        // Assert
        assertEquals(0, result);
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: BEA3C28C5959BF671081AC33FE02F1F9
    @Test
    void testSetHostIndex() {
        // Arrange
        int newHostIndex = 1;
        // Act
        coordinationApi.setHostIndex(newHostIndex);
        // Assert
        assertEquals(newHostIndex, coordinationApi.getHostIndex());
    }

    //BaseRock generated method id: ${testGetCustomBaseUrl}, hash: 5251194566988224ACFB3D9C3E16AD8B
    @Test
    void testGetCustomBaseUrl() {
        // Act
        String result = coordinationApi.getCustomBaseUrl();
        // Assert
        assertNull(result);
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: 4D5A7D36BD536385E33A3D79D356B408
    @Test
    void testSetCustomBaseUrl() {
        // Arrange
        String newCustomBaseUrl = "https://example.com";
        // Act
        coordinationApi.setCustomBaseUrl(newCustomBaseUrl);
        // Assert
        assertEquals(newCustomBaseUrl, coordinationApi.getCustomBaseUrl());
    }
}