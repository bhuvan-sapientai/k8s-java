package io.kubernetes.client.extended.kubectl;

import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.mockito.Mock;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.ModelMapper;
import org.mockito.MockitoAnnotations;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import io.kubernetes.client.util.annotations.Annotations;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import java.util.HashMap;
import io.kubernetes.client.common.KubernetesObject;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.ParameterizedTest;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.common.KubernetesListObject;
import org.apache.commons.lang3.StringUtils;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class KubectlAnnotateBaseRockGeneratedTest {

    @Mock
    private GenericKubernetesApi<KubernetesObject, KubernetesListObject> genericApi;

    @Mock
    private KubernetesApiResponse<KubernetesObject> apiResponse;

    @Mock
    private KubernetesObject kubernetesObject;

    @Mock
    private V1ObjectMeta objectMeta;

    private KubectlAnnotate<KubernetesObject> kubectlAnnotate;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        kubectlAnnotate = spy(new KubectlAnnotate<>(KubernetesObject.class));
        kubectlAnnotate.name("testName");
        when(kubernetesObject.getMetadata()).thenReturn(objectMeta);
    }

    //BaseRock generated method id: ${testAddAnnotation}, hash: E15184D7DD1050805FFD6608010C3201
    @Disabled
    @Test
    void testAddAnnotation() throws KubectlException {
        //doReturn(genericApi).when(kubectlAnnotate).getGenericApi();
        //when(genericApi.get(anyString())).thenReturn(apiResponse);
        //when(apiResponse.throwsApiException()).thenReturn(apiResponse);
        //when(apiResponse.getObject()).thenReturn(kubernetesObject);
        //when(genericApi.update(any())).thenReturn(apiResponse);
        //kubectlAnnotate.addAnnotation("key", "value");
        //KubernetesObject result = assertDoesNotThrow(() -> kubectlAnnotate.execute());
        //assertNotNull(result);
    }

    //BaseRock generated method id: ${testExecuteNamespaced}, hash: 3CF9765A3E1D45585C2C6325B9C581EB
    @Test
    void testExecuteNamespaced() throws KubectlException, ApiException {
        try (MockedStatic<ModelMapper> modelMapperMockedStatic = mockStatic(ModelMapper.class)) {
            modelMapperMockedStatic.when(() -> ModelMapper.isNamespaced(any())).thenReturn(true);
            kubectlAnnotate.namespace("testNamespace");
            when(genericApi.get(anyString(), anyString())).thenReturn(apiResponse);
            when(apiResponse.throwsApiException()).thenReturn(apiResponse);
            when(apiResponse.getObject()).thenReturn(kubernetesObject);
            doReturn(genericApi).when(kubectlAnnotate).getGenericApi();
            when(genericApi.update(any())).thenReturn(apiResponse);
            KubernetesObject result = kubectlAnnotate.execute();
            verify(genericApi).get("testNamespace", "testName");
            verify(genericApi).update(kubernetesObject);
            assertEquals(kubernetesObject, result);
        }
    }

    //BaseRock generated method id: ${testExecuteClusterScoped}, hash: E2FD5ED82BB7E5A012B30C551A9B1EBE
    @Test
    void testExecuteClusterScoped() throws KubectlException, ApiException {
        try (MockedStatic<ModelMapper> modelMapperMockedStatic = mockStatic(ModelMapper.class)) {
            modelMapperMockedStatic.when(() -> ModelMapper.isNamespaced(any())).thenReturn(false);
            when(genericApi.get(anyString())).thenReturn(apiResponse);
            when(apiResponse.throwsApiException()).thenReturn(apiResponse);
            when(apiResponse.getObject()).thenReturn(kubernetesObject);
            doReturn(genericApi).when(kubectlAnnotate).getGenericApi();
            when(genericApi.update(any())).thenReturn(apiResponse);
            KubernetesObject result = kubectlAnnotate.execute();
            verify(genericApi).get("testName");
            verify(genericApi).update(kubernetesObject);
            assertEquals(kubernetesObject, result);
        }
    }

    //BaseRock generated method id: ${testExecuteThrowsKubectlException}, hash: E72A40422A71084B420741B30AF2CA96
    @Disabled
    @Test
    void testExecuteThrowsKubectlException() throws ApiException {
        /*try (MockedStatic<ModelMapper> modelMapperMockedStatic = mockStatic(ModelMapper.class)) {
    modelMapperMockedStatic.when(() -> ModelMapper.isNamespaced(any())).thenReturn(true);
    kubectlAnnotate.namespace("testNamespace");
    doReturn(genericApi).when(kubectlAnnotate).getGenericApi();
    when(genericApi.get(anyString(), anyString())).thenThrow(new ApiException());
    assertThrows(KubectlException.class, () -> kubectlAnnotate.execute());
}*/
    }

    //BaseRock generated method id: ${testIsNamespacedTrue}, hash: B544757AE680AAB1C6E7DE42ED514862
    @Test
    void testIsNamespacedTrue() {
        try (MockedStatic<ModelMapper> modelMapperMockedStatic = mockStatic(ModelMapper.class)) {
            modelMapperMockedStatic.when(() -> ModelMapper.isNamespaced(any())).thenReturn(true);
            assertTrue(kubectlAnnotate.isNamespaced(KubernetesObject.class));
        }
    }

    //BaseRock generated method id: ${testIsNamespacedFalse}, hash: 3F35B8EDD46A1F14EBE5E3B832190086
    @Test
    void testIsNamespacedFalse() {
        try (MockedStatic<ModelMapper> modelMapperMockedStatic = mockStatic(ModelMapper.class)) {
            modelMapperMockedStatic.when(() -> ModelMapper.isNamespaced(any())).thenReturn(false);
            assertFalse(kubectlAnnotate.isNamespaced(KubernetesObject.class));
        }
    }

    //BaseRock generated method id: ${testIsNamespacedNull}, hash: 017B1A79D56262CBF89C856BFF654B37
    @Test
    void testIsNamespacedNull() {
        try (MockedStatic<ModelMapper> modelMapperMockedStatic = mockStatic(ModelMapper.class)) {
            modelMapperMockedStatic.when(() -> ModelMapper.isNamespaced(any())).thenReturn(null);
            assertFalse(kubectlAnnotate.isNamespaced(KubernetesObject.class));
        }
    }

    //BaseRock generated method id: ${testIsNamespacedWithNamespace}, hash: 3C6CBD0B7FCD702C37C7A44DC3782448
    @ParameterizedTest
    @ValueSource(strings = { "namespace1", "namespace2", "" })
    void testIsNamespacedWithNamespace(String namespace) {
        try (MockedStatic<ModelMapper> modelMapperMockedStatic = mockStatic(ModelMapper.class);
            MockedStatic<StringUtils> stringUtilsMockedStatic = mockStatic(StringUtils.class)) {
            modelMapperMockedStatic.when(() -> ModelMapper.isNamespaced(any())).thenReturn(false);
            stringUtilsMockedStatic.when(() -> StringUtils.isEmpty(namespace)).thenReturn(namespace.isEmpty());
            kubectlAnnotate.namespace(namespace);
            assertEquals(!namespace.isEmpty(), kubectlAnnotate.isNamespaced(KubernetesObject.class));
        }
    }

    //BaseRock generated method id: ${testExecuteWithoutName}, hash: 92A3D1F9D49FDF38669102D2C50AE0FE
    @Test
    void testExecuteWithoutName() {
        KubectlAnnotate<KubernetesObject> kubectlAnnotateWithoutName = new KubectlAnnotate<>(KubernetesObject.class);
        assertThrows(KubectlException.class, kubectlAnnotateWithoutName::execute);
    }

    //BaseRock generated method id: ${testExecuteAddsAnnotations}, hash: AA00ADB18D429488ED15F3433BDA3843
    @Test
    void testExecuteAddsAnnotations() throws KubectlException, ApiException {
        try (MockedStatic<ModelMapper> modelMapperMockedStatic = mockStatic(ModelMapper.class);
            MockedStatic<Annotations> annotationsMockedStatic = mockStatic(Annotations.class)) {
            modelMapperMockedStatic.when(() -> ModelMapper.isNamespaced(any())).thenReturn(true);
            kubectlAnnotate.namespace("testNamespace");
            kubectlAnnotate.addAnnotation("key", "value");
            when(genericApi.get(anyString(), anyString())).thenReturn(apiResponse);
            when(apiResponse.throwsApiException()).thenReturn(apiResponse);
            when(apiResponse.getObject()).thenReturn(kubernetesObject);
            doReturn(genericApi).when(kubectlAnnotate).getGenericApi();
            when(genericApi.update(any())).thenReturn(apiResponse);
            kubectlAnnotate.execute();
            Map<String, String> expectedAnnotations = new HashMap<>();
            expectedAnnotations.put("key", "value");
            annotationsMockedStatic.verify(() -> Annotations.addAnnotations(kubernetesObject, expectedAnnotations));
        }
    }
}