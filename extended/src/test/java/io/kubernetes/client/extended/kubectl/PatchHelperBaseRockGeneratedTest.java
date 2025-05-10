package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.common.KubernetesObject;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.doThrow;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.util.generic.options.PatchOptions;
import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class PatchHelperBaseRockGeneratedTest {

    @Mock
    private GenericKubernetesApi<KubernetesObject, KubernetesListObject> genericApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    //BaseRock generated method id: ${testDryRunStrategyMergePatch}, hash: 6C1EEE94A5FBC4AF9577C7207DF15206
    @Test
    void testDryRunStrategyMergePatch() throws ApiException {
        String patch = "test-patch";
        String namespace = "test-namespace";
        String name = "test-name";
        KubernetesObject expectedObject = mock(KubernetesObject.class);
        KubernetesApiResponse<KubernetesObject> apiResponse = mock(KubernetesApiResponse.class);
        doReturn(apiResponse).when(genericApi).patch(eq(namespace), eq(name), eq(V1Patch.PATCH_FORMAT_STRATEGIC_MERGE_PATCH), any(V1Patch.class), any(PatchOptions.class));
        when(apiResponse.throwsApiException()).thenReturn(apiResponse);
        when(apiResponse.getObject()).thenReturn(expectedObject);
        KubernetesObject result = PatchHelper.dryRunStrategyMergePatch(genericApi, patch, namespace, name);
        assertThat(result, notNullValue());
        assertThat(result, equalTo(expectedObject));
    }

    //BaseRock generated method id: ${testDryRunStrategyMergePatchThrowsApiException}, hash: 826E316FAD97A966D3ED68A27C134547
    @Disabled()
    @Test
    void testDryRunStrategyMergePatchThrowsApiException() {
        String patch = "test-patch";
        String namespace = "test-namespace";
        String name = "test-name";
        doThrow(new ApiException("Test API Exception")).when(genericApi).patch(eq(namespace), eq(name), eq(V1Patch.PATCH_FORMAT_STRATEGIC_MERGE_PATCH), any(V1Patch.class), any(PatchOptions.class));
        assertThrows(ApiException.class, () -> PatchHelper.dryRunStrategyMergePatch(genericApi, patch, namespace, name));
    }
}
