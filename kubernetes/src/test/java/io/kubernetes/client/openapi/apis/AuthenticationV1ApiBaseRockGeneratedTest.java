package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1TokenReview;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.openapi.Configuration;
import org.junit.jupiter.api.Test;
import com.google.gson.reflect.TypeToken;
import org.mockito.Mock;
import io.kubernetes.client.openapi.models.V1APIResourceList;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
import io.kubernetes.client.openapi.Pair;
import java.util.HashMap;
import okhttp3.Call;
import io.kubernetes.client.openapi.models.V1SelfSubjectReview;
import java.util.List;
import java.lang.reflect.Type;
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
class AuthenticationV1ApiBaseRockGeneratedTest {

    @Mock
    private ApiClient mockApiClient;

    private AuthenticationV1Api authenticationV1Api;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        authenticationV1Api = new AuthenticationV1Api(mockApiClient);
    }

    //BaseRock generated method id: ${testCreateSelfSubjectReview}, hash: C5DB1E1D68D9C82A5CBD2AE47F75906E
    @Test
    void testCreateSelfSubjectReview() throws ApiException {
        V1SelfSubjectReview body = mock(V1SelfSubjectReview.class);
        String dryRun = "All";
        String fieldManager = "test-manager";
        String fieldValidation = "Strict";
        String pretty = "true";
        Call mockCall = mock(Call.class);
        ApiResponse<V1SelfSubjectReview> expectedResponse = new ApiResponse<>(200, null, body);
        when(mockApiClient.buildCall(any(), any(), eq("POST"), any(), any(), any(), any(), any(), any(), any(), any())).thenReturn(mockCall);
        doReturn(expectedResponse).when(mockApiClient).execute(any(Call.class), any(Type.class));
        V1SelfSubjectReview result = authenticationV1Api.createSelfSubjectReview(body).dryRun(dryRun).fieldManager(fieldManager).fieldValidation(fieldValidation).pretty(pretty).execute();
        assertEquals(body, result);
        verify(mockApiClient).buildCall(any(), eq("/apis/authentication.k8s.io/v1/selfsubjectreviews"), eq("POST"), any(), any(), eq(body), any(), any(), any(), any(), any());
    }

    //BaseRock generated method id: ${testCreateTokenReview}, hash: 85AE5E84A60D776071B8700200F922C0
    @Test
    void testCreateTokenReview() throws ApiException {
        V1TokenReview body = mock(V1TokenReview.class);
        String dryRun = "All";
        String fieldManager = "test-manager";
        String fieldValidation = "Strict";
        String pretty = "true";
        Call mockCall = mock(Call.class);
        ApiResponse<V1TokenReview> expectedResponse = new ApiResponse<>(200, null, body);
        when(mockApiClient.buildCall(any(), any(), eq("POST"), any(), any(), any(), any(), any(), any(), any(), any())).thenReturn(mockCall);
        doReturn(expectedResponse).when(mockApiClient).execute(any(Call.class), any(Type.class));
        V1TokenReview result = authenticationV1Api.createTokenReview(body).dryRun(dryRun).fieldManager(fieldManager).fieldValidation(fieldValidation).pretty(pretty).execute();
        assertEquals(body, result);
        verify(mockApiClient).buildCall(any(), eq("/apis/authentication.k8s.io/v1/tokenreviews"), eq("POST"), any(), any(), eq(body), any(), any(), any(), any(), any());
    }

    //BaseRock generated method id: ${testGetAPIResources}, hash: 1609D93C15E31211A37B57422A67C299
    @Test
    void testGetAPIResources() throws ApiException {
        V1APIResourceList expectedResult = new V1APIResourceList();
        Call mockCall = mock(Call.class);
        ApiResponse<V1APIResourceList> expectedResponse = new ApiResponse<>(200, null, expectedResult);
        when(mockApiClient.buildCall(any(), any(), eq("GET"), any(), any(), any(), any(), any(), any(), any(), any())).thenReturn(mockCall);
        doReturn(expectedResponse).when(mockApiClient).execute(any(Call.class), any(Type.class));
        V1APIResourceList result = authenticationV1Api.getAPIResources().execute();
        assertEquals(expectedResult, result);
        verify(mockApiClient).buildCall(any(), eq("/apis/authentication.k8s.io/v1/"), eq("GET"), any(), any(), any(), any(), any(), any(), any(), any());
    }

    //BaseRock generated method id: ${testSetApiClient}, hash: 9EECC831F3FE07A69256766DBD4D86E5
    @Test
    void testSetApiClient() {
        ApiClient newApiClient = mock(ApiClient.class);
        authenticationV1Api.setApiClient(newApiClient);
        assertEquals(newApiClient, authenticationV1Api.getApiClient());
    }

    //BaseRock generated method id: ${testSetCustomBaseUrl}, hash: CB9BC7200630B60AC6102A1604A45209
    @Test
    void testSetCustomBaseUrl() {
        String customBaseUrl = "https://custom.api.com";
        authenticationV1Api.setCustomBaseUrl(customBaseUrl);
        assertEquals(customBaseUrl, authenticationV1Api.getCustomBaseUrl());
    }

    //BaseRock generated method id: ${testGetApiClient}, hash: 1DC4B0EF8AF4EA0B545110377E0C08C4
    @Test
    void testGetApiClient() {
        assertEquals(mockApiClient, authenticationV1Api.getApiClient());
    }

    //BaseRock generated method id: ${testSetHostIndex}, hash: 425C5D5726540818659720AB6FF0034A
    @Test
    void testSetHostIndex() {
        int hostIndex = 1;
        authenticationV1Api.setHostIndex(hostIndex);
        assertEquals(hostIndex, authenticationV1Api.getHostIndex());
    }

    //BaseRock generated method id: ${testConstructorWithDefaultApiClient}, hash: FE90C4774AA82E791F9999898158F81E
    @Test
    void testConstructorWithDefaultApiClient() {
        try (var mocked = mockStatic(Configuration.class)) {
            ApiClient defaultApiClient = mock(ApiClient.class);
            mocked.when(Configuration::getDefaultApiClient).thenReturn(defaultApiClient);
            AuthenticationV1Api api = new AuthenticationV1Api();
            assertEquals(defaultApiClient, api.getApiClient());
        }
    }
}
