package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiClient;
import static org.mockito.Mockito.doReturn;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import io.kubernetes.client.openapi.Configuration;
import org.junit.jupiter.api.Test;
import com.google.gson.reflect.TypeToken;
import io.kubernetes.client.openapi.models.V1APIResourceList;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import io.kubernetes.client.openapi.models.V1SubjectAccessReview;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.Pair;
import java.util.HashMap;
import okhttp3.Call;
import java.util.List;
import java.lang.reflect.Type;
import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.openapi.models.V1SelfSubjectRulesReview;
import java.util.Map;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.ApiResponse;
import io.kubernetes.client.openapi.models.V1LocalSubjectAccessReview;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.V1SelfSubjectAccessReview;
import io.kubernetes.client.openapi.ApiCallback;
import java.util.ArrayList;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
public class // Other test methods remain unchanged
AuthorizationV1ApiBaseRockGeneratedTest {

    private ApiClient apiClient;

    private AuthorizationV1Api authorizationV1Api;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        apiClient = mock(ApiClient.class);
        authorizationV1Api = new AuthorizationV1Api(apiClient);
    }

    //BaseRock generated method id: ${testCreateNamespacedLocalSubjectAccessReview}, hash: 333A27234BE20F9B0D623F8FDC66C4E8
    @Test
    public void testCreateNamespacedLocalSubjectAccessReview() throws ApiException {
        // Setup mock objects
        String namespace = "default";
        V1LocalSubjectAccessReview body = mock(V1LocalSubjectAccessReview.class);
        Call mockCall = mock(Call.class);
        ApiResponse<V1LocalSubjectAccessReview> mockResponse = new ApiResponse<>(200, new HashMap<>(), body);
        // Setup mock behaviors
        doReturn(mockCall).when(apiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        doReturn(mockResponse).when(apiClient).execute(any(Call.class), any(Type.class));
        when(apiClient.escapeString(namespace)).thenReturn(namespace);
        // Execute the method
        V1LocalSubjectAccessReview result = authorizationV1Api.createNamespacedLocalSubjectAccessReview(namespace, body).dryRun("All").fieldManager("manager").fieldValidation("Strict").pretty("true").execute();
        // Verify the result
        assertThat(result, equalTo(body));
        // Verify interactions
        verify(apiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        verify(apiClient).execute(any(Call.class), any(Type.class));
    }

    //BaseRock generated method id: ${testCreateNamespacedLocalSubjectAccessReviewWithHttpInfo}, hash: D1B1AC92DCD333D8F0AE38F48BC19864
    @Test
    public void testCreateNamespacedLocalSubjectAccessReviewWithHttpInfo() throws ApiException {
        // Setup mock objects
        String namespace = "default";
        V1LocalSubjectAccessReview body = mock(V1LocalSubjectAccessReview.class);
        Call mockCall = mock(Call.class);
        ApiResponse<V1LocalSubjectAccessReview> mockResponse = new ApiResponse<>(200, new HashMap<>(), body);
        // Setup mock behaviors
        doReturn(mockCall).when(apiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        doReturn(mockResponse).when(apiClient).execute(any(Call.class), any(Type.class));
        when(apiClient.escapeString(namespace)).thenReturn(namespace);
        // Execute the method
        ApiResponse<V1LocalSubjectAccessReview> result = authorizationV1Api.createNamespacedLocalSubjectAccessReview(namespace, body).dryRun("All").fieldManager("manager").fieldValidation("Strict").pretty("true").executeWithHttpInfo();
        // Verify the result
        assertThat(result, equalTo(mockResponse));
        // Verify interactions
        verify(apiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        verify(apiClient).execute(any(Call.class), any(Type.class));
    }

    //BaseRock generated method id: ${testCreateNamespacedLocalSubjectAccessReviewAsync}, hash: 7820C8C6FE62483AFA0AA37D7BEBC0F7
    @Test
    public void testCreateNamespacedLocalSubjectAccessReviewAsync() throws ApiException {
        // Setup mock objects
        String namespace = "default";
        V1LocalSubjectAccessReview body = mock(V1LocalSubjectAccessReview.class);
        Call mockCall = mock(Call.class);
        ApiCallback<V1LocalSubjectAccessReview> callback = mock(ApiCallback.class);
        // Setup mock behaviors
        doReturn(mockCall).when(apiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        when(apiClient.escapeString(namespace)).thenReturn(namespace);
        // Execute the method
        Call result = authorizationV1Api.createNamespacedLocalSubjectAccessReview(namespace, body).dryRun("All").fieldManager("manager").fieldValidation("Strict").pretty("true").executeAsync(callback);
        // Verify the result
        assertThat(result, equalTo(mockCall));
        // Verify interactions
        verify(apiClient).buildCall(any(), anyString(), anyString(), any(), any(), any(), any(), any(), any(), any(), any());
        verify(apiClient).executeAsync(any(Call.class), any(Type.class), any(ApiCallback.class));
    }
}
