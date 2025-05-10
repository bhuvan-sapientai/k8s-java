package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.openapi.ApiClient;
import static org.mockito.Mockito.doReturn;
import io.kubernetes.client.util.generic.options.CreateOptions;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.util.Namespaces;
import org.mockito.Mock;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.ModelMapper;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;
import io.kubernetes.client.util.Strings;
import org.mockito.MockedStatic;
import java.util.HashMap;
import io.kubernetes.client.common.KubernetesObject;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import org.junit.jupiter.api.Timeout;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class KubectlCreateBaseRockGeneratedTest {

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

    private KubectlCreate<KubernetesObject> kubectlCreate;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        kubectlCreate = new KubectlCreate<>(KubernetesObject.class);
        kubectlCreate.apiClient(apiClient);
    }

    //BaseRock generated method id: ${testExecuteNamespacedObject}, hash: 00BF1CE0FB03BF64DEA644FA414441A6
    @Disabled
    @Test
    void testExecuteNamespacedObject() throws KubectlException, ApiException {
        /*try (MockedStatic<ModelMapper> modelMapperMockedStatic = mockStatic(ModelMapper.class);
    MockedStatic<Strings> stringsMockedStatic = mockStatic(Strings.class)) {
    modelMapperMockedStatic.when(() -> ModelMapper.isNamespaced(KubernetesObject.class)).thenReturn(true);
    stringsMockedStatic.when(() -> Strings.isNullOrEmpty(any())).thenReturn(false);
    when(kubernetesObject.getMetadata()).thenReturn(objectMeta);
    when(objectMeta.getNamespace()).thenReturn("test-namespace");
    doReturn(genericApi).when(apiClient).getGenericApi(eq(KubernetesObject.class), eq(KubernetesListObject.class));
    when(genericApi.create(eq("test-namespace"), eq(kubernetesObject), any(CreateOptions.class))).thenReturn(apiResponse);
    when(apiResponse.throwsApiException()).thenReturn(apiResponse);
    when(apiResponse.getObject()).thenReturn(kubernetesObject);
    kubectlCreate.resource(kubernetesObject);
    KubernetesObject result = kubectlCreate.execute();
    assert result == kubernetesObject;
}*/
    }

    //BaseRock generated method id: ${testExecuteClusterScopedObject}, hash: A244CB563D39A7DECF75AC4C1FCCF820
    @Disabled
    @Test
    void testExecuteClusterScopedObject() throws KubectlException, ApiException {
        /*try (MockedStatic<ModelMapper> modelMapperMockedStatic = mockStatic(ModelMapper.class);
    MockedStatic<Strings> stringsMockedStatic = mockStatic(Strings.class)) {
    modelMapperMockedStatic.when(() -> ModelMapper.isNamespaced(KubernetesObject.class)).thenReturn(false);
    when(kubernetesObject.getMetadata()).thenReturn(objectMeta);
    when(objectMeta.getNamespace()).thenReturn(null);
    doReturn(genericApi).when(apiClient).getGenericApi(eq(KubernetesObject.class), eq(KubernetesListObject.class));
    when(genericApi.create(eq(kubernetesObject), any(CreateOptions.class))).thenReturn(apiResponse);
    when(apiResponse.throwsApiException()).thenReturn(apiResponse);
    when(apiResponse.getObject()).thenReturn(kubernetesObject);
    kubectlCreate.resource(kubernetesObject);
    KubernetesObject result = kubectlCreate.execute();
    assert result == kubernetesObject;
}*/
    }

    //BaseRock generated method id: ${testExecuteWithDefaultNamespace}, hash: CE3BB2F4C305F1167FE565031AAA1DD8
    @Disabled
    @Test
    void testExecuteWithDefaultNamespace() throws KubectlException, ApiException {
        /*try (MockedStatic<ModelMapper> modelMapperMockedStatic = mockStatic(ModelMapper.class);
    MockedStatic<Strings> stringsMockedStatic = mockStatic(Strings.class);
    MockedStatic<Namespaces> namespacesMockedStatic = mockStatic(Namespaces.class)) {
    modelMapperMockedStatic.when(() -> ModelMapper.isNamespaced(KubernetesObject.class)).thenReturn(true);
    stringsMockedStatic.when(() -> Strings.isNullOrEmpty(any())).thenReturn(true);
    namespacesMockedStatic.when(Namespaces::NAMESPACE_DEFAULT).thenReturn("default");
    when(kubernetesObject.getMetadata()).thenReturn(objectMeta);
    when(objectMeta.getNamespace()).thenReturn(null);
    doReturn(genericApi).when(apiClient).getGenericApi(eq(KubernetesObject.class), eq(KubernetesListObject.class));
    when(genericApi.create(eq("default"), eq(kubernetesObject), any(CreateOptions.class))).thenReturn(apiResponse);
    when(apiResponse.throwsApiException()).thenReturn(apiResponse);
    when(apiResponse.getObject()).thenReturn(kubernetesObject);
    kubectlCreate.resource(kubernetesObject);
    KubernetesObject result = kubectlCreate.execute();
    assert result == kubernetesObject;
}*/
    }

    //BaseRock generated method id: ${testExecuteWithSpecifiedNamespace}, hash: ED5ADDA865CEBD5FBA45756BDF2E9DFE
    @Disabled
    @Test
    void testExecuteWithSpecifiedNamespace() throws KubectlException, ApiException {
        /*try (MockedStatic<ModelMapper> modelMapperMockedStatic = mockStatic(ModelMapper.class)) {
    modelMapperMockedStatic.when(() -> ModelMapper.isNamespaced(KubernetesObject.class)).thenReturn(true);
    when(kubernetesObject.getMetadata()).thenReturn(objectMeta);
    when(objectMeta.getNamespace()).thenReturn("test-namespace");
    doReturn(genericApi).when(apiClient).getGenericApi(eq(KubernetesObject.class), eq(KubernetesListObject.class));
    when(genericApi.create(eq("specified-namespace"), eq(kubernetesObject), any(CreateOptions.class))).thenReturn(apiResponse);
    when(apiResponse.throwsApiException()).thenReturn(apiResponse);
    when(apiResponse.getObject()).thenReturn(kubernetesObject);
    kubectlCreate.namespace("specified-namespace");
    kubectlCreate.resource(kubernetesObject);
    KubernetesObject result = kubectlCreate.execute();
    assert result == kubernetesObject;
}*/
    }

    //BaseRock generated method id: ${testExecuteThrowsKubectlException}, hash: 84B82DAA949A349F1373D2913F9EB041
    @Disabled
    @Test
    void testExecuteThrowsKubectlException() throws ApiException {
        /*try (MockedStatic<ModelMapper> modelMapperMockedStatic = mockStatic(ModelMapper.class)) {
    modelMapperMockedStatic.when(() -> ModelMapper.isNamespaced(KubernetesObject.class)).thenReturn(true);
    when(kubernetesObject.getMetadata()).thenReturn(objectMeta);
    when(objectMeta.getNamespace()).thenReturn("test-namespace");
    doReturn(genericApi).when(apiClient).getGenericApi(eq(KubernetesObject.class), eq(KubernetesListObject.class));
    when(genericApi.create(eq("test-namespace"), eq(kubernetesObject), any(CreateOptions.class))).thenThrow(new ApiException("API error"));
    kubectlCreate.resource(kubernetesObject);
    try {
        kubectlCreate.execute();
        assert false : "Expected KubectlException";
    } catch (KubectlException e) {
        assert e.getCause() instanceof ApiException;
    }
}*/
    }

    //BaseRock generated method id: ${testResourceMethod}, hash: 9ED56826CEB29F8DFF2D03AAFA93AEB6
    @Test
    void testResourceMethod() {
        KubectlCreate<KubernetesObject> result = kubectlCreate.resource(kubernetesObject);
        assert result == kubectlCreate;
    }

    //BaseRock generated method id: ${testNameMethod}, hash: EDE96DDFE76DECEC04BA5ECF3017F19A
    @Test
    void testNameMethod() {
        KubectlCreate<KubernetesObject> result = kubectlCreate.name("test-name");
        assert result == kubectlCreate;
    }

    //BaseRock generated method id: ${testNamespaceMethod}, hash: 531656F42AE51DE94914EF884A6E4350
    @Test
    void testNamespaceMethod() {
        KubectlCreate<KubernetesObject> result = kubectlCreate.namespace("test-namespace");
        assert result == kubectlCreate;
    }

    //BaseRock generated method id: ${testApiClientMethod}, hash: 4AE4263BDFDB0C0B5B110808D0F95AC7
    @Test
    void testApiClientMethod() {
        KubectlCreate<KubernetesObject> result = kubectlCreate.apiClient(new ApiClient());
        assert result == kubectlCreate;
    }

    //BaseRock generated method id: ${testSkipDiscoveryMethod}, hash: 36594C9EE0B831236BE3FB4AD28A3C78
    @Test
    void testSkipDiscoveryMethod() {
        KubectlCreate<KubernetesObject> result = kubectlCreate.skipDiscovery();
        assert result == kubectlCreate;
    }
}