package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.common.KubernetesObject;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.Discovery;
import io.kubernetes.client.util.generic.options.UpdateOptions;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
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
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class KubectlReplaceBaseRockGeneratedTest {

    @Mock
    private GenericKubernetesApi<KubernetesObject, KubernetesListObject> genericApi;

    @Mock
    private KubernetesObject updateObject;

    @Mock
    private KubernetesApiResponse<KubernetesObject> apiResponse;

    private KubectlReplace<KubernetesObject> kubectlReplace;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        kubectlReplace = new KubectlReplace<>(KubernetesObject.class);
        kubectlReplace.resource(updateObject);
    }

    //BaseRock generated method id: ${testExecuteNamespaced}, hash: F5C6E4F37146AACD4652C1B49904ED30
    @Test
    void testExecuteNamespaced() throws KubectlException, ApiException {
        try (MockedStatic<ModelMapper> modelMapperMock = mockStatic(ModelMapper.class)) {
            modelMapperMock.when(() -> ModelMapper.isNamespaced(KubernetesObject.class)).thenReturn(true);
            modelMapperMock.when(() -> ModelMapper.refresh(any(Discovery.class))).thenReturn(null);
            doReturn(apiResponse).when(genericApi).update(any(), any(UpdateOptions.class));
            when(apiResponse.throwsApiException()).thenReturn(apiResponse);
            when(apiResponse.getObject()).thenReturn(updateObject);
            KubectlReplace<KubernetesObject> spyKubectlReplace = spy(kubectlReplace);
            doReturn(genericApi).when(spyKubectlReplace).getGenericApi();
            KubernetesObject result = spyKubectlReplace.execute();
            assertThat(result, is(notNullValue()));
            assertThat(result, is(equalTo(updateObject)));
        }
    }

    //BaseRock generated method id: ${testExecuteNonNamespaced}, hash: 41DC97321A9667F8729108206E73D19D
    @Test
    void testExecuteNonNamespaced() throws KubectlException, ApiException {
        try (MockedStatic<ModelMapper> modelMapperMock = mockStatic(ModelMapper.class)) {
            modelMapperMock.when(() -> ModelMapper.isNamespaced(KubernetesObject.class)).thenReturn(false);
            modelMapperMock.when(() -> ModelMapper.refresh(any(Discovery.class))).thenReturn(null);
            doReturn(apiResponse).when(genericApi).update(any(), any(UpdateOptions.class));
            when(apiResponse.throwsApiException()).thenReturn(apiResponse);
            when(apiResponse.getObject()).thenReturn(updateObject);
            KubectlReplace<KubernetesObject> spyKubectlReplace = spy(kubectlReplace);
            doReturn(genericApi).when(spyKubectlReplace).getGenericApi();
            KubernetesObject result = spyKubectlReplace.execute();
            assertThat(result, is(notNullValue()));
            assertThat(result, is(equalTo(updateObject)));
        }
    }

    //BaseRock generated method id: ${testExecuteThrowsApiException}, hash: 57D968415092CB38826A6AD806732293
    @Test
    void testExecuteThrowsApiException() throws ApiException, KubectlException {
        try (MockedStatic<ModelMapper> modelMapperMock = mockStatic(ModelMapper.class)) {
            modelMapperMock.when(() -> ModelMapper.isNamespaced(KubernetesObject.class)).thenReturn(true);
            modelMapperMock.when(() -> ModelMapper.refresh(any(Discovery.class))).thenReturn(null);
            doReturn(apiResponse).when(genericApi).update(any(), any(UpdateOptions.class));
            when(apiResponse.throwsApiException()).thenThrow(new ApiException("API Exception"));
            KubectlReplace<KubernetesObject> spyKubectlReplace = spy(kubectlReplace);
            doReturn(genericApi).when(spyKubectlReplace).getGenericApi();
            assertThrows(KubectlException.class, () -> spyKubectlReplace.execute());
        }
    }

    //BaseRock generated method id: ${testExecuteWithNullUpdateObject}, hash: 0ACCCE0666D9E0786C72E8A38CC951DB
    @Test
    void testExecuteWithNullUpdateObject() {
        kubectlReplace.resource(null);
        assertThrows(KubectlException.class, () -> kubectlReplace.execute());
    }

    //BaseRock generated method id: ${testIsNamespaced}, hash: 043D86FBD4F0DF6CC54F23DAEB28A371
    @Test
    void testIsNamespaced() {
        try (MockedStatic<ModelMapper> modelMapperMock = mockStatic(ModelMapper.class);
            MockedStatic<StringUtils> stringUtilsMock = mockStatic(StringUtils.class)) {
            modelMapperMock.when(() -> ModelMapper.isNamespaced(KubernetesObject.class)).thenReturn(true);
            stringUtilsMock.when(() -> StringUtils.isEmpty(any())).thenReturn(false);
            boolean result = kubectlReplace.isNamespaced(KubernetesObject.class);
            assertThat(result, is(true));
        }
    }

    //BaseRock generated method id: ${testIsNamespacedWithNullModelMapper}, hash: 0A04E602B0335C04BCB1AE3E526519CB
    @Test
    void testIsNamespacedWithNullModelMapper() {
        try (MockedStatic<ModelMapper> modelMapperMock = mockStatic(ModelMapper.class);
            MockedStatic<StringUtils> stringUtilsMock = mockStatic(StringUtils.class)) {
            modelMapperMock.when(() -> ModelMapper.isNamespaced(KubernetesObject.class)).thenReturn(null);
            stringUtilsMock.when(() -> StringUtils.isEmpty(any())).thenReturn(true);
            boolean result = kubectlReplace.isNamespaced(KubernetesObject.class);
            assertThat(result, is(false));
        }
    }

    //BaseRock generated method id: ${testResource}, hash: AA7DFA5259E59DC67BE63DA574E14B48
    @Test
    void testResource() {
        KubectlReplace<KubernetesObject> result = kubectlReplace.resource(updateObject);
        assertThat(result, is(notNullValue()));
        assertThat(result, is(equalTo(kubectlReplace)));
    }

    //BaseRock generated method id: ${testOptions}, hash: 443D4691C0CB5EEC73146FE0EAE34FEF
    @Test
    void testOptions() {
        UpdateOptions options = new UpdateOptions();
        KubectlReplace<KubernetesObject> result = kubectlReplace.options(options);
        assertThat(result, is(notNullValue()));
        assertThat(result, is(equalTo(kubectlReplace)));
    }
}
