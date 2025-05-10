package io.kubernetes.client.spring.extended.manifests;

import io.kubernetes.client.openapi.ApiClient;
import java.net.HttpURLConnection;
import io.kubernetes.client.common.KubernetesObject;
import org.springframework.beans.BeansException;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import org.springframework.beans.factory.ListableBeanFactory;
import org.mockito.Mock;
import io.kubernetes.client.spring.extended.manifests.annotation.KubectlCreate;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.extended.kubectl.Kubectl;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.BeanFactory;
import static org.hamcrest.Matchers.*;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class KubernetesKubectlCreateProcessorBaseRockGeneratedTest {

    @Mock
    private ListableBeanFactory beanFactory;

    @Mock
    private ApiClient apiClient;

    @Mock
    private KubernetesObject kubernetesObject;

    private KubernetesKubectlCreateProcessor processor;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        processor = new KubernetesKubectlCreateProcessor();
        processor.setBeanFactory(beanFactory);
    }

    //BaseRock generated method id: ${testPostProcessAfterInitializationWithNonKubernetesObject}, hash: 8E96EAC4F5C7AC5FAB32E4C1DE4F39D0
    @Test
    void testPostProcessAfterInitializationWithNonKubernetesObject() {
        Object bean = new Object();
        String beanName = "testBean";
        Object result = processor.postProcessAfterInitialization(bean, beanName);
        assertThat(result, is(equalTo(bean)));
    }

    //BaseRock generated method id: ${testPostProcessAfterInitializationWithKubernetesObjectNoAnnotation}, hash: 217197922A7154DF1ACBE2030EC8A19D
    @Test
    void testPostProcessAfterInitializationWithKubernetesObjectNoAnnotation() {
        String beanName = "testBean";
        when(beanFactory.findAnnotationOnBean(beanName, KubectlCreate.class)).thenReturn(null);
        Object result = processor.postProcessAfterInitialization(kubernetesObject, beanName);
        assertThat(result, is(equalTo(kubernetesObject)));
    }

    //BaseRock generated method id: ${testPostProcessAfterInitializationWithKubernetesObjectAndAnnotation}, hash: DFFAB9C0D3C8EE1445E477BBBBCE2E56
    @Test
    void testPostProcessAfterInitializationWithKubernetesObjectAndAnnotation() throws KubectlException {
        String beanName = "testBean";
        KubectlCreate annotation = mock(KubectlCreate.class);
        when(beanFactory.findAnnotationOnBean(beanName, KubectlCreate.class)).thenReturn(annotation);
        try (MockedStatic<Kubectl> kubectlMockedStatic = mockStatic(Kubectl.class)) {
            io.kubernetes.client.extended.kubectl.KubectlCreate<KubernetesObject> kubectlCreate = mock(io.kubernetes.client.extended.kubectl.KubectlCreate.class);
            kubectlMockedStatic.when(() -> Kubectl.create(any())).thenReturn(kubectlCreate);
            when(kubectlCreate.apiClient(any())).thenReturn(kubectlCreate);
            when(kubectlCreate.resource(any())).thenReturn(kubectlCreate);
            when(kubectlCreate.execute()).thenReturn(kubernetesObject);
            Object result = processor.postProcessAfterInitialization(kubernetesObject, beanName);
            assertThat(result, is(equalTo(kubernetesObject)));
            verify(kubectlCreate).apiClient(any());
            verify(kubectlCreate).resource(kubernetesObject);
            verify(kubectlCreate).execute();
        }
    }

    //BaseRock generated method id: ${testPostProcessAfterInitializationWithKubectlException}, hash: 1D6D4C84332E34B9F86FB7125FF1CE91
    @Test
    void testPostProcessAfterInitializationWithKubectlException() throws KubectlException {
        String beanName = "testBean";
        KubectlCreate annotation = mock(KubectlCreate.class);
        when(beanFactory.findAnnotationOnBean(beanName, KubectlCreate.class)).thenReturn(annotation);
        try (MockedStatic<Kubectl> kubectlMockedStatic = mockStatic(Kubectl.class)) {
            io.kubernetes.client.extended.kubectl.KubectlCreate<KubernetesObject> kubectlCreate = mock(io.kubernetes.client.extended.kubectl.KubectlCreate.class);
            kubectlMockedStatic.when(() -> Kubectl.create(any())).thenReturn(kubectlCreate);
            when(kubectlCreate.apiClient(any())).thenReturn(kubectlCreate);
            when(kubectlCreate.resource(any())).thenReturn(kubectlCreate);
            when(kubectlCreate.execute()).thenThrow(new KubectlException("Test exception"));
            assertThrows(BeanCreationException.class, () -> processor.postProcessAfterInitialization(kubernetesObject, beanName));
        }
    }

    //BaseRock generated method id: ${testPostProcessAfterInitializationWithApiExceptionConflict}, hash: F37296BFE7C9C5345ACC198EBB9CC442
    @Test
    void testPostProcessAfterInitializationWithApiExceptionConflict() throws KubectlException {
        String beanName = "testBean";
        KubectlCreate annotation = mock(KubectlCreate.class);
        when(beanFactory.findAnnotationOnBean(beanName, KubectlCreate.class)).thenReturn(annotation);
        try (MockedStatic<Kubectl> kubectlMockedStatic = mockStatic(Kubectl.class)) {
            io.kubernetes.client.extended.kubectl.KubectlCreate<KubernetesObject> kubectlCreate = mock(io.kubernetes.client.extended.kubectl.KubectlCreate.class);
            kubectlMockedStatic.when(() -> Kubectl.create(any())).thenReturn(kubectlCreate);
            when(kubectlCreate.apiClient(any())).thenReturn(kubectlCreate);
            when(kubectlCreate.resource(any())).thenReturn(kubectlCreate);
            ApiException apiException = new ApiException("Conflict", null, HttpURLConnection.HTTP_CONFLICT, null, null);
            when(kubectlCreate.execute()).thenThrow(new KubectlException(apiException));
            Object result = processor.postProcessAfterInitialization(kubernetesObject, beanName);
            assertThat(result, is(equalTo(kubernetesObject)));
        }
    }

    //BaseRock generated method id: ${testCreate}, hash: 714BF31B167F0BB04E617891B77147ED
    @Test
    void testCreate() throws KubectlException {
        try (MockedStatic<Kubectl> kubectlMockedStatic = mockStatic(Kubectl.class)) {
            io.kubernetes.client.extended.kubectl.KubectlCreate<KubernetesObject> kubectlCreate = mock(io.kubernetes.client.extended.kubectl.KubectlCreate.class);
            kubectlMockedStatic.when(() -> Kubectl.create(any())).thenReturn(kubectlCreate);
            when(kubectlCreate.apiClient(any())).thenReturn(kubectlCreate);
            when(kubectlCreate.resource(any())).thenReturn(kubectlCreate);
            when(kubectlCreate.execute()).thenReturn(kubernetesObject);
            KubernetesObject result = processor.create(KubernetesObject.class, kubernetesObject);
            assertThat(result, is(equalTo(kubernetesObject)));
            verify(kubectlCreate).apiClient(any());
            verify(kubectlCreate).resource(kubernetesObject);
            verify(kubectlCreate).execute();
        }
    }

    //BaseRock generated method id: ${testSetBeanFactory}, hash: E6F6FAF8945532453E210B4F55705167
    @Test
    void testSetBeanFactory() {
        BeanFactory beanFactory = mock(ListableBeanFactory.class);
        processor.setBeanFactory(beanFactory);
        assertThat(processor, is(notNullValue()));
    }
}
