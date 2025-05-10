package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.openapi.ApiClient;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.util.Namespaces;
import org.mockito.Mock;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import org.mockito.MockitoAnnotations;
import io.kubernetes.client.util.generic.options.PatchOptions;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.*;
import io.kubernetes.client.common.KubernetesObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.common.KubernetesListObject;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class KubectlApplyBaseRockGeneratedTest {

    @Mock
    private ApiClient apiClient;

    @Mock
    private GenericKubernetesApi<KubernetesObject, KubernetesListObject> genericApi;

    @Mock
    private KubernetesApiResponse<KubernetesObject> apiResponse;

    @Mock
    private KubernetesObject kubernetesObject;

    @Mock
    private V1ObjectMeta objectMeta;

    @Mock
    private JSON json;

    private KubectlApply<KubernetesObject> kubectlApply;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        kubectlApply = new KubectlApply<>(KubernetesObject.class);
        kubectlApply.apiClient(apiClient);
    }

    //BaseRock generated method id: ${testFieldManager}, hash: 9FDD871B4DB2ADF13F8D0DF6100A3799
    @Test
    void testFieldManager() {
        String fieldManager = "test-field-manager";
        KubectlApply<KubernetesObject> result = kubectlApply.fieldManager(fieldManager);
        assertEquals(kubectlApply, result);
    }

    //BaseRock generated method id: ${testForceConflict}, hash: 85838FC8042B1A18997DE9CF05391BE9
    @Test
    void testForceConflict() {
        KubectlApply<KubernetesObject> result = kubectlApply.forceConflict(true);
        assertEquals(kubectlApply, result);
    }

    //BaseRock generated method id: ${testResource}, hash: 4B5015903B4667B9F981AC264C385BAC
    @Test
    void testResource() {
        KubectlApply<KubernetesObject> result = kubectlApply.resource(kubernetesObject);
        assertEquals(kubectlApply, result);
    }

    //BaseRock generated method id: ${testExecute_NamespacedObject}, hash: 475FF3408086FD5F96AB9823120A20F1
    @Disabled()
    @Test
    void testExecute_NamespacedObject() throws KubectlException, ApiException {
        when(kubernetesObject.getMetadata()).thenReturn(objectMeta);
        when(objectMeta.getNamespace()).thenReturn("default");
        when(objectMeta.getName()).thenReturn("test-object");
        when(apiClient.getJSON()).thenReturn(json);
        when(json.serialize(any())).thenReturn("{}");
        try (MockedStatic<Namespaces> namespaceMock = mockStatic(Namespaces.class)) {
            namespaceMock.when(Namespaces::getPodNamespace).thenReturn("default");
            kubectlApply.resource(kubernetesObject);
            doReturn(apiResponse).when(genericApi).patch(anyString(), anyString(), anyString(), any(V1Patch.class), any(PatchOptions.class));
            when(apiResponse.throwsApiException()).thenReturn(apiResponse);
            when(apiResponse.getObject()).thenReturn(kubernetesObject);
            KubernetesObject result = kubectlApply.execute();
            assertEquals(kubernetesObject, result);
            verify(genericApi).patch(eq("default"), eq("test-object"), eq(V1Patch.PATCH_FORMAT_APPLY_YAML), any(V1Patch.class), any(PatchOptions.class));
        }
    }

    //BaseRock generated method id: ${testExecute_ClusterScopedObject}, hash: B3939A242547216631CE41A28B5AB4FE
    @Disabled()
    @Test
    void testExecute_ClusterScopedObject() throws KubectlException, ApiException {
        when(kubernetesObject.getMetadata()).thenReturn(objectMeta);
        when(objectMeta.getName()).thenReturn("test-object");
        when(apiClient.getJSON()).thenReturn(json);
        when(json.serialize(any())).thenReturn("{}");
        kubectlApply.resource(kubernetesObject);
        doReturn(apiResponse).when(genericApi).patch(anyString(), anyString(), any(V1Patch.class), any(PatchOptions.class));
        when(apiResponse.throwsApiException()).thenReturn(apiResponse);
        when(apiResponse.getObject()).thenReturn(kubernetesObject);
        KubernetesObject result = kubectlApply.execute();
        assertEquals(kubernetesObject, result);
        verify(genericApi).patch(eq("test-object"), eq(V1Patch.PATCH_FORMAT_APPLY_YAML), any(V1Patch.class), any(PatchOptions.class));
    }

    //BaseRock generated method id: ${testExecute_ApiException}, hash: 6DEB44FB2E5BA357066D9CEE5EF3F5B7
    @Disabled()
    @Test
    void testExecute_ApiException() throws ApiException {
        when(kubernetesObject.getMetadata()).thenReturn(objectMeta);
        when(objectMeta.getNamespace()).thenReturn("default");
        when(objectMeta.getName()).thenReturn("test-object");
        when(apiClient.getJSON()).thenReturn(json);
        when(json.serialize(any())).thenReturn("{}");
        kubectlApply.resource(kubernetesObject);
        ApiException apiException = new ApiException("Test exception");
        doThrow(apiException).when(genericApi).patch(anyString(), anyString(), anyString(), any(V1Patch.class), any(PatchOptions.class));
        assertThrows(KubectlException.class, () -> kubectlApply.execute());
    }

    //BaseRock generated method id: ${testExecute_EmptyFieldManager}, hash: C9E7EBF35B164CC1E60D523833E83F51
    @Disabled()
    @ParameterizedTest
    @ValueSource(strings = { "", " " })
    void testExecute_EmptyFieldManager(String fieldManager) {
        kubectlApply.fieldManager(fieldManager);
        kubectlApply.resource(kubernetesObject);
        assertThrows(KubectlException.class, () -> kubectlApply.execute());
    }

    //BaseRock generated method id: ${testExecute_NullFieldManager}, hash: 1C785A7C7E5A29072167F865E02DF2D4
    @Test
    void testExecute_NullFieldManager() {
        kubectlApply.fieldManager(null);
        kubectlApply.resource(kubernetesObject);
        assertThrows(KubectlException.class, () -> kubectlApply.execute());
    }
}
