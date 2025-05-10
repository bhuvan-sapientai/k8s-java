package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.openapi.ApiClient;
import static org.mockito.Mockito.doReturn;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.junit.jupiter.api.Disabled;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.ModelMapper;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import org.mockito.MockitoAnnotations;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import io.kubernetes.client.util.labels.Labels;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.times;
import org.mockito.MockedStatic;
import io.kubernetes.client.common.KubernetesObject;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import org.junit.jupiter.api.Timeout;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import io.kubernetes.client.common.KubernetesListObject;
import org.apache.commons.lang3.StringUtils;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class KubectlLabelBaseRockGeneratedTest {

    @Mock
    private GenericKubernetesApi<KubernetesObject, KubernetesListObject> genericApi;

    @Mock
    private KubernetesApiResponse<KubernetesObject> apiResponse;

    @Mock
    private KubernetesObject kubernetesObject;

    private KubectlLabel<KubernetesObject> kubectlLabel;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        kubectlLabel = new KubectlLabel<>(KubernetesObject.class);
        kubectlLabel.apiClient(mock(ApiClient.class));
    }

    //BaseRock generated method id: ${testAddLabel}, hash: 478EBF1FC0CC9242BB7DB83A990FC959
    @Test
    void testAddLabel() {
        String key = "testKey";
        String value = "testValue";
        KubectlLabel<KubernetesObject> result = kubectlLabel.addLabel(key, value);
        assertEquals(kubectlLabel, result);
    }

    //BaseRock generated method id: ${testDeleteLabel}, hash: 7C40DAF07FB639A63975AB71EF250278
    @Test
    void testDeleteLabel() {
        String key = "testKey";
        String value = "testValue";
        kubectlLabel.addLabel(key, value);
        KubectlLabel<KubernetesObject> result = kubectlLabel.deleteLabel(key);
        assertEquals(kubectlLabel, result);
    }

    //BaseRock generated method id: ${testExecuteNamespaced}, hash: 3CD0EB05F22E024A6B88C206FE070790
    @Disabled()
    @Test
    void testExecuteNamespaced() throws KubectlException, ApiException {
        String namespace = "testNamespace";
        String name = "testName";
        kubectlLabel.namespace(namespace).name(name);
        try (MockedStatic<ModelMapper> modelMapperMock = mockStatic(ModelMapper.class)) {
            modelMapperMock.when(() -> ModelMapper.isNamespaced(KubernetesObject.class)).thenReturn(true);
            modelMapperMock.when(() -> ModelMapper.getGroupVersionResourceByClass(KubernetesObject.class)).thenReturn(new io.kubernetes.client.apimachinery.GroupVersionResource("", "v1", "kubernetesObjects"));
            doReturn(genericApi).when(kubectlLabel).getGenericApi();
            doReturn(apiResponse).when(genericApi).get(anyString(), anyString());
            doReturn(apiResponse).when(apiResponse).throwsApiException();
            doReturn(kubernetesObject).when(apiResponse).getObject();
            try (MockedStatic<Labels> labelsMock = mockStatic(Labels.class)) {
                labelsMock.when(() -> Labels.addLabels(any(), any())).thenReturn(kubernetesObject);
                doReturn(apiResponse).when(genericApi).update(any());
                KubernetesObject result = kubectlLabel.execute();
                verify(genericApi, times(1)).get(namespace, name);
                verify(genericApi, times(1)).update(kubernetesObject);
                assertEquals(kubernetesObject, result);
            }
        }
    }

    //BaseRock generated method id: ${testExecuteClusterScoped}, hash: D94EBCBC7AC6A6E6BF4172CB055D79C9
    @Disabled()
    @Test
    void testExecuteClusterScoped() throws KubectlException, ApiException {
        String name = "testName";
        kubectlLabel.name(name);
        try (MockedStatic<ModelMapper> modelMapperMock = mockStatic(ModelMapper.class)) {
            modelMapperMock.when(() -> ModelMapper.isNamespaced(KubernetesObject.class)).thenReturn(false);
            modelMapperMock.when(() -> ModelMapper.getGroupVersionResourceByClass(KubernetesObject.class)).thenReturn(new io.kubernetes.client.apimachinery.GroupVersionResource("", "v1", "kubernetesObjects"));
            doReturn(genericApi).when(kubectlLabel).getGenericApi();
            doReturn(apiResponse).when(genericApi).get(anyString());
            doReturn(apiResponse).when(apiResponse).throwsApiException();
            doReturn(kubernetesObject).when(apiResponse).getObject();
            try (MockedStatic<Labels> labelsMock = mockStatic(Labels.class)) {
                labelsMock.when(() -> Labels.addLabels(any(), any())).thenReturn(kubernetesObject);
                doReturn(apiResponse).when(genericApi).update(any());
                KubernetesObject result = kubectlLabel.execute();
                verify(genericApi, times(1)).get(name);
                verify(genericApi, times(1)).update(kubernetesObject);
                assertEquals(kubernetesObject, result);
            }
        }
    }

    //BaseRock generated method id: ${testExecuteWithoutName}, hash: 6CE641FD22C89F9D73314246DC7679BE
    @Test
    void testExecuteWithoutName() {
        kubectlLabel.name(null);
        KubectlException exception = assertThrows(KubectlException.class, () -> kubectlLabel.execute());
        assertEquals("missing name argument", exception.getMessage());
    }

    //BaseRock generated method id: ${testIsNamespacedWithNamespacedClass}, hash: 960F0244CB5FEA96BF2954EFCA863DB4
    @Test
    void testIsNamespacedWithNamespacedClass() {
        try (MockedStatic<ModelMapper> modelMapperMock = mockStatic(ModelMapper.class)) {
            modelMapperMock.when(() -> ModelMapper.isNamespaced(KubernetesObject.class)).thenReturn(true);
            assertTrue(kubectlLabel.isNamespaced(KubernetesObject.class));
        }
    }

    //BaseRock generated method id: ${testIsNamespacedWithNonNamespacedClass}, hash: 3E5B4ACDBD629A612146B80607D1A023
    @Test
    void testIsNamespacedWithNonNamespacedClass() {
        try (MockedStatic<ModelMapper> modelMapperMock = mockStatic(ModelMapper.class)) {
            modelMapperMock.when(() -> ModelMapper.isNamespaced(KubernetesObject.class)).thenReturn(false);
            assertFalse(kubectlLabel.isNamespaced(KubernetesObject.class));
        }
    }

    //BaseRock generated method id: ${testIsNamespacedWithNonNamespacedClassButNamespaceProvided}, hash: CD974D6407E2EF8355F57859CE32B4F1
    @Test
    void testIsNamespacedWithNonNamespacedClassButNamespaceProvided() {
        kubectlLabel.namespace("testNamespace");
        try (MockedStatic<ModelMapper> modelMapperMock = mockStatic(ModelMapper.class)) {
            modelMapperMock.when(() -> ModelMapper.isNamespaced(KubernetesObject.class)).thenReturn(false);
            assertTrue(kubectlLabel.isNamespaced(KubernetesObject.class));
        }
    }

    //BaseRock generated method id: ${testIsNamespacedWithUnknownClass}, hash: CA5AF30F5B2C9D7C0C3F091A9155B107
    @Test
    void testIsNamespacedWithUnknownClass() {
        try (MockedStatic<ModelMapper> modelMapperMock = mockStatic(ModelMapper.class)) {
            modelMapperMock.when(() -> ModelMapper.isNamespaced(KubernetesObject.class)).thenReturn(null);
            assertFalse(kubectlLabel.isNamespaced(KubernetesObject.class));
        }
    }

    //BaseRock generated method id: ${testExecuteApiException}, hash: CE48ED232F4BED1955BF272333C0E98A
    @Disabled
    @Test
    void testExecuteApiException() throws ApiException {
    }

    //BaseRock generated method id: ${testExecuteUpdateApiException}, hash: 447AFC85DE8697FC90D7B702D41FE563
    @Disabled
    @Test
    void testExecuteUpdateApiException() throws ApiException {
    }

    //BaseRock generated method id: ${testConstructor}, hash: 97C233BC633450EDB1CAC053151814F0
    @Test
    void testConstructor() {
        KubectlLabel<KubernetesObject> label = new KubectlLabel<>(KubernetesObject.class);
        assertTrue(label instanceof KubectlLabel);
    }

    //BaseRock generated method id: ${testIsNamespacedWithEmptyNamespace}, hash: 3CBAA46A231E860C766C118381AA16B8
    @Test
    void testIsNamespacedWithEmptyNamespace() {
        try (MockedStatic<ModelMapper> modelMapperMock = mockStatic(ModelMapper.class);
            MockedStatic<StringUtils> stringUtilsMock = mockStatic(StringUtils.class)) {
            modelMapperMock.when(() -> ModelMapper.isNamespaced(KubernetesObject.class)).thenReturn(false);
            stringUtilsMock.when(() -> StringUtils.isEmpty(null)).thenReturn(true);
            assertFalse(kubectlLabel.isNamespaced(KubernetesObject.class));
        }
    }
}
