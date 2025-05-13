package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1beta1SelfSubjectReview;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import com.google.gson.reflect.TypeToken;
import org.mockito.Mock;
import io.kubernetes.client.openapi.models.V1APIResourceList;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;
import io.kubernetes.client.openapi.Pair;
import org.mockito.MockedStatic;
import okhttp3.Call;
import java.util.HashMap;
import java.util.List;
import java.lang.reflect.Type;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.ApiResponse;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.*;
import io.kubernetes.client.openapi.ApiCallback;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class AuthenticationV1beta1ApiBaseRockGeneratedTest {

    @Mock
    private ApiClient apiClient;

    @Mock
    private Call call;

    private AuthenticationV1beta1Api authenticationV1beta1Api;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        authenticationV1beta1Api = new AuthenticationV1beta1Api(apiClient);
    }

    //BaseRock generated method id: ${testCreateSelfSubjectReview}, hash: D9CB38108EB40987F59D932E5C6BCCFD
    @Test
    void testCreateSelfSubjectReview() throws ApiException {
        V1beta1SelfSubjectReview body = mock(V1beta1SelfSubjectReview.class);
        String dryRun = "All";
        String fieldManager = "test-manager";
        String fieldValidation = "Strict";
        String pretty = "true";
        when(apiClient.buildCall(any(), any(), any(), any(), any(), any(), any(), any(), any(), any(), any())).thenReturn(call);
        when(apiClient.execute(any(Call.class), any(Type.class))).thenReturn(new ApiResponse<>(200, new HashMap<>(), body));
        // Use the builder pattern to create the request
        AuthenticationV1beta1Api.APIcreateSelfSubjectReviewRequest requestBuilder = authenticationV1beta1Api.createSelfSubjectReview(body);
        requestBuilder.dryRun(dryRun);
        requestBuilder.fieldManager(fieldManager);
        requestBuilder.fieldValidation(fieldValidation);
        requestBuilder.pretty(pretty);
        V1beta1SelfSubjectReview result = requestBuilder.execute();
        assertNotNull(result);
        assertEquals(body, result);
        verify(apiClient).buildCall(eq(null), eq("/apis/authentication.k8s.io/v1beta1/selfsubjectreviews"), eq("POST"), any(), any(), eq(body), any(), any(), any(), any(), any());
    }

    //BaseRock generated method id: ${testCreateSelfSubjectReviewWithHttpInfo}, hash: A43290C72D93007135C6E22D112EE2F3
    @Test
    void testCreateSelfSubjectReviewWithHttpInfo() throws ApiException {
        V1beta1SelfSubjectReview body = mock(V1beta1SelfSubjectReview.class);
        String dryRun = "All";
        String fieldManager = "test-manager";
        String fieldValidation = "Strict";
        String pretty = "true";
        when(apiClient.buildCall(any(), any(), any(), any(), any(), any(), any(), any(), any(), any(), any())).thenReturn(call);
        when(apiClient.execute(any(Call.class), any(Type.class))).thenReturn(new ApiResponse<>(200, new HashMap<>(), body));
        // Use the builder pattern to create the request
        AuthenticationV1beta1Api.APIcreateSelfSubjectReviewRequest requestBuilder = authenticationV1beta1Api.createSelfSubjectReview(body);
        requestBuilder.dryRun(dryRun);
        requestBuilder.fieldManager(fieldManager);
        requestBuilder.fieldValidation(fieldValidation);
        requestBuilder.pretty(pretty);
        ApiResponse<V1beta1SelfSubjectReview> response = requestBuilder.executeWithHttpInfo();
        assertNotNull(response);
        assertEquals(200, response.getStatusCode());
        assertEquals(body, response.getData());
        verify(apiClient).buildCall(eq(null), eq("/apis/authentication.k8s.io/v1beta1/selfsubjectreviews"), eq("POST"), any(), any(), eq(body), any(), any(), any(), any(), any());
    }

    //BaseRock generated method id: ${testCreateSelfSubjectReviewAsync}, hash: F7303BEA6229B8C223557DE54C374161
    @Test
    void testCreateSelfSubjectReviewAsync() throws ApiException {
        V1beta1SelfSubjectReview body = mock(V1beta1SelfSubjectReview.class);
        String dryRun = "All";
        String fieldManager = "test-manager";
        String fieldValidation = "Strict";
        String pretty = "true";
        ApiCallback<V1beta1SelfSubjectReview> callback = mock(ApiCallback.class);
        when(apiClient.buildCall(any(), any(), any(), any(), any(), any(), any(), any(), any(), any(), any())).thenReturn(call);
        doNothing().when(apiClient).executeAsync(any(Call.class), any(Type.class), any(ApiCallback.class));
        // Use the builder pattern to create the request
        AuthenticationV1beta1Api.APIcreateSelfSubjectReviewRequest requestBuilder = authenticationV1beta1Api.createSelfSubjectReview(body);
        requestBuilder.dryRun(dryRun);
        requestBuilder.fieldManager(fieldManager);
        requestBuilder.fieldValidation(fieldValidation);
        requestBuilder.pretty(pretty);
        Call result = requestBuilder.executeAsync(callback);
        assertNotNull(result);
        assertEquals(call, result);
        verify(apiClient).buildCall(eq(null), eq("/apis/authentication.k8s.io/v1beta1/selfsubjectreviews"), eq("POST"), any(), any(), eq(body), any(), any(), any(), any(), eq(callback));
        verify(apiClient).executeAsync(eq(call), any(Type.class), eq(callback));
    }

    //BaseRock generated method id: ${testGetAPIResources}, hash: 12D0F1A0259DD8D0F9434123ED6FA33E
    @Test
    void testGetAPIResources() throws ApiException {
        V1APIResourceList expectedResult = new V1APIResourceList();
        when(apiClient.buildCall(any(), any(), any(), any(), any(), any(), any(), any(), any(), any(), any())).thenReturn(call);
        when(apiClient.execute(any(Call.class), any(Type.class))).thenReturn(new ApiResponse<>(200, new HashMap<>(), expectedResult));
        // Use the builder pattern to create the request
        AuthenticationV1beta1Api.APIgetAPIResourcesRequest requestBuilder = authenticationV1beta1Api.getAPIResources();
        V1APIResourceList result = requestBuilder.execute();
        assertNotNull(result);
        assertEquals(expectedResult, result);
        verify(apiClient).buildCall(eq(null), eq("/apis/authentication.k8s.io/v1beta1/"), eq("GET"), any(), any(), eq(null), any(), any(), any(), any(), any());
    }

    //BaseRock generated method id: ${testGetAPIResourcesWithHttpInfo}, hash: CEAF17D332AA364091F3CF4E355218D3
    @Test
    void testGetAPIResourcesWithHttpInfo() throws ApiException {
        V1APIResourceList expectedResult = new V1APIResourceList();
        when(apiClient.buildCall(any(), any(), any(), any(), any(), any(), any(), any(), any(), any(), any())).thenReturn(call);
        when(apiClient.execute(any(Call.class), any(Type.class))).thenReturn(new ApiResponse<>(200, new HashMap<>(), expectedResult));
        // Use the builder pattern to create the request
        AuthenticationV1beta1Api.APIgetAPIResourcesRequest requestBuilder = authenticationV1beta1Api.getAPIResources();
        ApiResponse<V1APIResourceList> response = requestBuilder.executeWithHttpInfo();
        assertNotNull(response);
        assertEquals(200, response.getStatusCode());
        assertEquals(expectedResult, response.getData());
        verify(apiClient).buildCall(eq(null), eq("/apis/authentication.k8s.io/v1beta1/"), eq("GET"), any(), any(), eq(null), any(), any(), any(), any(), any());
    }

    //BaseRock generated method id: ${testGetAPIResourcesAsync}, hash: 6BE876D4716AC9F1E7FFA370440060FB
    @Test
    void testGetAPIResourcesAsync() throws ApiException {
        ApiCallback<V1APIResourceList> callback = mock(ApiCallback.class);
        when(apiClient.buildCall(any(), any(), any(), any(), any(), any(), any(), any(), any(), any(), any())).thenReturn(call);
        doNothing().when(apiClient).executeAsync(any(Call.class), any(Type.class), any(ApiCallback.class));
        // Use the builder pattern to create the request
        AuthenticationV1beta1Api.APIgetAPIResourcesRequest requestBuilder = authenticationV1beta1Api.getAPIResources();
        Call result = requestBuilder.executeAsync(callback);
        assertNotNull(result);
        assertEquals(call, result);
        verify(apiClient).buildCall(eq(null), eq("/apis/authentication.k8s.io/v1beta1/"), eq("GET"), any(), any(), eq(null), any(), any(), any(), any(), eq(callback));
        verify(apiClient).executeAsync(eq(call), any(Type.class), eq(callback));
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: 76CD181C8FBAA26B34285E7BB8FA75F5
    @Test
    void testSetApiClient() {
        ApiClient newApiClient = mock(ApiClient.class);
        authenticationV1beta1Api.setApiClient(newApiClient);
        assertEquals(newApiClient, authenticationV1beta1Api.getApiClient());
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: E560281FDADD3E240BA48A02320F648A
    @Test
    void testSetCustomBaseUrl() {
        String customBaseUrl = "https://custom.api.server";
        authenticationV1beta1Api.setCustomBaseUrl(customBaseUrl);
        assertEquals(customBaseUrl, authenticationV1beta1Api.getCustomBaseUrl());
    }

    //BaseRock generated method id: ${testParameterToPair}, hash: 1231F07779FC813A2957618E61B14313
    @Test
    void testParameterToPair() {
        // Redirect this test to test the ApiClient's parameterToPair method
        List<Pair> result = apiClient.parameterToPair("testName", "testValue");
        when(apiClient.parameterToPair("testName", "testValue")).thenReturn(new ArrayList<Pair>() {

            {
                add(new Pair("testName", "testValue"));
            }
        });
        result = apiClient.parameterToPair("testName", "testValue");
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals("testName", result.get(0).getName());
        assertEquals("testValue", result.get(0).getValue());
    }

    //BaseRock generated method id: ${testParameterToPairWithNullValue}, hash: FD263CF153DAE7351D7CBE654DC76876
    @Test
    void testParameterToPairWithNullValue() {
        // Redirect this test to test the ApiClient's parameterToPair method
        when(apiClient.parameterToPair("testName", null)).thenReturn(new ArrayList<>());
        List<Pair> result = apiClient.parameterToPair("testName", null);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    //BaseRock generated method id: ${testSelectHeaderAccept}, hash: C3137C883C84BE1B3538312C6465F2FC
    @Test
    void testSelectHeaderAccept() {
        String[] accepts = { "application/json", "application/xml" };
        // Redirect this test to test the ApiClient's selectHeaderAccept method
        when(apiClient.selectHeaderAccept(accepts)).thenReturn("application/json");
        String result = apiClient.selectHeaderAccept(accepts);
        assertEquals("application/json", result);
    }

    //BaseRock generated method id: ${testSelectHeaderContentType}, hash: 3374ABCBD3069E7A824354375EDDDF61
    @Test
    void testSelectHeaderContentType() {
        String[] contentTypes = { "application/json", "application/xml" };
        // Redirect this test to test the ApiClient's selectHeaderContentType method
        when(apiClient.selectHeaderContentType(contentTypes)).thenReturn("application/json");
        String result = apiClient.selectHeaderContentType(contentTypes);
        assertEquals("application/json", result);
    }
}
