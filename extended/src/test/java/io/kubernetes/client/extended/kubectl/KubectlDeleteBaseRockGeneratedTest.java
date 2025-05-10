package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.util.generic.options.DeleteOptions;
import io.kubernetes.client.common.KubernetesObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.ModelMapper;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import io.kubernetes.client.common.KubernetesListObject;
import org.apache.commons.lang3.StringUtils;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class KubectlDeleteBaseRockGeneratedTest {

    @Mock
    private GenericKubernetesApi<KubernetesObject, KubernetesListObject> genericApi;

    @Mock
    private KubernetesApiResponse<KubernetesObject> apiResponse;

    private KubectlDelete<KubernetesObject> kubectlDelete;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        kubectlDelete = new KubectlDelete<>(KubernetesObject.class);
        kubectlDelete.deleteOptions(new DeleteOptions());
    }

    //BaseRock generated method id: ${testExecuteNamespacedSuccess}, hash: AD6A1CB755BA96288D90A54520A72C8A
    @Disabled()
    @Test
    void testExecuteNamespacedSuccess() throws KubectlException, ApiException {
        String namespace = "test-namespace";
        String name = "test-name";
        KubernetesObject expectedObject = mock(KubernetesObject.class);
        try (MockedStatic<ModelMapper> modelMapperMock = mockStatic(ModelMapper.class)) {
            modelMapperMock.when(() -> ModelMapper.isNamespaced(KubernetesObject.class)).thenReturn(true);
            kubectlDelete.namespace(namespace).name(name);
            doReturn(genericApi).when(kubectlDelete).getGenericApi();
            doReturn(apiResponse).when(genericApi).delete(eq(namespace), eq(name), any(DeleteOptions.class));
            doReturn(apiResponse).when(apiResponse).throwsApiException();
            doReturn(expectedObject).when(apiResponse).getObject();
            KubernetesObject result = kubectlDelete.execute();
            assertThat(result, is(equalTo(expectedObject)));
            verify(genericApi).delete(eq(namespace), eq(name), any(DeleteOptions.class));
        }
    }

    //BaseRock generated method id: ${testExecuteClusterSuccess}, hash: F0FAEE1E3E94DCEB6B17A7845627B33F
    @Disabled()
    @Test
    void testExecuteClusterSuccess() throws KubectlException, ApiException {
        String name = "test-name";
        KubernetesObject expectedObject = mock(KubernetesObject.class);
        try (MockedStatic<ModelMapper> modelMapperMock = mockStatic(ModelMapper.class)) {
            modelMapperMock.when(() -> ModelMapper.isNamespaced(KubernetesObject.class)).thenReturn(false);
            kubectlDelete.name(name);
            doReturn(genericApi).when(kubectlDelete).getGenericApi();
            doReturn(apiResponse).when(genericApi).delete(eq(name), any(DeleteOptions.class));
            doReturn(apiResponse).when(apiResponse).throwsApiException();
            doReturn(expectedObject).when(apiResponse).getObject();
            KubernetesObject result = kubectlDelete.execute();
            assertThat(result, is(equalTo(expectedObject)));
            verify(genericApi).delete(eq(name), any(DeleteOptions.class));
        }
    }

    //BaseRock generated method id: ${testExecuteIgnoreNotFound}, hash: 6FA7DB2B54EA10DBB9AEFCB1A7944BAE
    @Disabled()
    @Test
    void testExecuteIgnoreNotFound() throws KubectlException, ApiException {
        String name = "test-name";
        ApiException apiException = new ApiException(404, "Not Found");
        try (MockedStatic<ModelMapper> modelMapperMock = mockStatic(ModelMapper.class)) {
            modelMapperMock.when(() -> ModelMapper.isNamespaced(KubernetesObject.class)).thenReturn(false);
            kubectlDelete.name(name).ignoreNotFound(true);
            doReturn(genericApi).when(kubectlDelete).getGenericApi();
            doReturn(apiResponse).when(genericApi).delete(eq(name), any(DeleteOptions.class));
            doThrow(apiException).when(apiResponse).throwsApiException();
            KubernetesObject result = kubectlDelete.execute();
            assertThat(result, is(nullValue()));
            verify(genericApi).delete(eq(name), any(DeleteOptions.class));
        }
    }

    //BaseRock generated method id: ${testExecuteApiException}, hash: 1DC1F73EF4A23A347DE55A8EB1F58F50
    @Disabled()
    @Test
    void testExecuteApiException() throws KubectlException, ApiException {
        String name = "test-name";
        ApiException apiException = new ApiException(500, "Internal Server Error");
        try (MockedStatic<ModelMapper> modelMapperMock = mockStatic(ModelMapper.class)) {
            modelMapperMock.when(() -> ModelMapper.isNamespaced(KubernetesObject.class)).thenReturn(false);
            kubectlDelete.name(name);
            doReturn(genericApi).when(kubectlDelete).getGenericApi();
            doReturn(apiResponse).when(genericApi).delete(eq(name), any(DeleteOptions.class));
            doThrow(apiException).when(apiResponse).throwsApiException();
            assertThrows(KubectlException.class, () -> kubectlDelete.execute());
            verify(genericApi).delete(eq(name), any(DeleteOptions.class));
        }
    }

    //BaseRock generated method id: ${testExecuteMissingName}, hash: C098EBE21F5B31F3970EF43945DD8CFE
    @Test
    void testExecuteMissingName() {
        assertThrows(KubectlException.class, () -> kubectlDelete.execute());
    }

    //BaseRock generated method id: ${testIsNamespacedTrue}, hash: B3B0A0327D1463575A03D03850ABF50D
    @Test
    void testIsNamespacedTrue() {
        try (MockedStatic<ModelMapper> modelMapperMock = mockStatic(ModelMapper.class);
            MockedStatic<StringUtils> stringUtilsMock = mockStatic(StringUtils.class)) {
            modelMapperMock.when(() -> ModelMapper.isNamespaced(KubernetesObject.class)).thenReturn(true);
            stringUtilsMock.when(() -> StringUtils.isEmpty(anyString())).thenReturn(false);
            kubectlDelete.namespace("test-namespace");
            boolean result = kubectlDelete.isNamespaced(KubernetesObject.class);
            assertThat(result, is(true));
        }
    }

    //BaseRock generated method id: ${testIsNamespacedFalse}, hash: 026D92A89FE423877FAC5DE7F81977C8
    @Disabled()
    @Test
    void testIsNamespacedFalse() {
        try (MockedStatic<ModelMapper> modelMapperMock = mockStatic(ModelMapper.class);
            MockedStatic<StringUtils> stringUtilsMock = mockStatic(StringUtils.class)) {
            modelMapperMock.when(() -> ModelMapper.isNamespaced(KubernetesObject.class)).thenReturn(false);
            stringUtilsMock.when(() -> StringUtils.isEmpty(anyString())).thenReturn(true);
            boolean result = kubectlDelete.isNamespaced(KubernetesObject.class);
            assertThat(result, is(false));
        }
    }

    //BaseRock generated method id: ${testDeleteOptionsMethod}, hash: 96CE1A8C6689B976140524FE2E5AFF9D
    @Test
    void testDeleteOptionsMethod() {
        DeleteOptions deleteOptions = new DeleteOptions();
        KubectlDelete<KubernetesObject> result = kubectlDelete.deleteOptions(deleteOptions);
        assertThat(result, is(equalTo(kubectlDelete)));
    }

    //BaseRock generated method id: ${testIgnoreNotFoundMethod}, hash: 14A48545DD9F1E061EA560A373C84F5D
    @Test
    void testIgnoreNotFoundMethod() {
        KubectlDelete<KubernetesObject> result = kubectlDelete.ignoreNotFound(true);
        assertThat(result, is(equalTo(kubectlDelete)));
    }
}
