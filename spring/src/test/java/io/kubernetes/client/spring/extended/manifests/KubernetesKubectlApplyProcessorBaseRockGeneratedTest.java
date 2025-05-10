package io.kubernetes.client.spring.extended.manifests;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.common.KubernetesObject;
import org.springframework.beans.BeansException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import org.springframework.beans.factory.ListableBeanFactory;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.extended.kubectl.KubectlApply;
import org.mockito.MockitoAnnotations;
import io.kubernetes.client.extended.kubectl.Kubectl;
import org.springframework.beans.factory.BeanCreationException;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class KubernetesKubectlApplyProcessorBaseRockGeneratedTest {

    @Mock
    private ListableBeanFactory beanFactory;

    @Mock
    private ApiClient apiClient;

    @Mock
    private KubernetesObject kubernetesObject;

    @Mock
    private KubectlApply<KubernetesObject> kubectlApply;

    private KubernetesKubectlApplyProcessor processor;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        processor = new KubernetesKubectlApplyProcessor();
        processor.setBeanFactory(beanFactory);
    }

    //BaseRock generated method id: ${testPostProcessAfterInitializationWithNonKubernetesObject}, hash: 81649B43D6C8C86621A244AC7D15D39F
    @Test
    void testPostProcessAfterInitializationWithNonKubernetesObject() {
        Object bean = new Object();
        String beanName = "testBean";
        Object result = processor.postProcessAfterInitialization(bean, beanName);
        assertSame(bean, result);
    }

    //BaseRock generated method id: ${testPostProcessAfterInitializationWithKubernetesObjectButNoAnnotation}, hash: 31C7E92CA807DC8ADD4B2C970C801AEB
    @Test
    void testPostProcessAfterInitializationWithKubernetesObjectButNoAnnotation() {
        String beanName = "testBean";
        when(beanFactory.findAnnotationOnBean(beanName, io.kubernetes.client.spring.extended.manifests.annotation.KubectlApply.class)).thenReturn(null);
        Object result = processor.postProcessAfterInitialization(kubernetesObject, beanName);
        assertSame(kubernetesObject, result);
    }

    //BaseRock generated method id: ${testPostProcessAfterInitializationWithKubernetesObjectAndAnnotation}, hash: 45D7451110A8553E978B5E1CB5E20636
    @Test
    void testPostProcessAfterInitializationWithKubernetesObjectAndAnnotation() throws KubectlException {
        String beanName = "testBean";
        when(beanFactory.findAnnotationOnBean(beanName, io.kubernetes.client.spring.extended.manifests.annotation.KubectlApply.class)).thenReturn(mock(io.kubernetes.client.spring.extended.manifests.annotation.KubectlApply.class));
        try (MockedStatic<Kubectl> kubectlMockedStatic = mockStatic(Kubectl.class)) {
            kubectlMockedStatic.when(() -> Kubectl.apply(any())).thenReturn(kubectlApply);
            when(kubectlApply.apiClient(any())).thenReturn(kubectlApply);
            when(kubectlApply.resource(any())).thenReturn(kubectlApply);
            when(kubectlApply.execute()).thenReturn(kubernetesObject);
            Object result = processor.postProcessAfterInitialization(kubernetesObject, beanName);
            assertSame(kubernetesObject, result);
            verify(kubectlApply).apiClient(any());
            verify(kubectlApply).resource(kubernetesObject);
            verify(kubectlApply).execute();
        }
    }

    //BaseRock generated method id: ${testPostProcessAfterInitializationWithKubectlException}, hash: 7AB00CD52D157AB74EC04F04531EE7A6
    @Test
    void testPostProcessAfterInitializationWithKubectlException() throws KubectlException {
        String beanName = "testBean";
        when(beanFactory.findAnnotationOnBean(beanName, io.kubernetes.client.spring.extended.manifests.annotation.KubectlApply.class)).thenReturn(mock(io.kubernetes.client.spring.extended.manifests.annotation.KubectlApply.class));
        try (MockedStatic<Kubectl> kubectlMockedStatic = mockStatic(Kubectl.class)) {
            kubectlMockedStatic.when(() -> Kubectl.apply(any())).thenReturn(kubectlApply);
            when(kubectlApply.apiClient(any())).thenReturn(kubectlApply);
            when(kubectlApply.resource(any())).thenReturn(kubectlApply);
            when(kubectlApply.execute()).thenThrow(new KubectlException("Test exception"));
            assertThrows(BeanCreationException.class, () -> processor.postProcessAfterInitialization(kubernetesObject, beanName));
        }
    }

    //BaseRock generated method id: ${testApply}, hash: 959BCA7DBE57F9C744EB376AB1C4D42A
    @Test
    void testApply() throws KubectlException {
        try (MockedStatic<Kubectl> kubectlMockedStatic = mockStatic(Kubectl.class)) {
            kubectlMockedStatic.when(() -> Kubectl.apply(any())).thenReturn(kubectlApply);
            when(kubectlApply.apiClient(any())).thenReturn(kubectlApply);
            when(kubectlApply.resource(any())).thenReturn(kubectlApply);
            when(kubectlApply.execute()).thenReturn(kubernetesObject);
            KubernetesObject result = processor.apply(KubernetesObject.class, kubernetesObject);
            assertSame(kubernetesObject, result);
            verify(kubectlApply).apiClient(any());
            verify(kubectlApply).resource(kubernetesObject);
            verify(kubectlApply).execute();
        }
    }

    //BaseRock generated method id: ${testSetBeanFactory}, hash: 693E5E5ADCDD56D8AE1869ADCB7217D1
    @Test
    void testSetBeanFactory() throws KubectlException {
        ListableBeanFactory newBeanFactory = mock(ListableBeanFactory.class);
        processor.setBeanFactory(newBeanFactory);
        when(newBeanFactory.findAnnotationOnBean(anyString(), eq(io.kubernetes.client.spring.extended.manifests.annotation.KubectlApply.class))).thenReturn(mock(io.kubernetes.client.spring.extended.manifests.annotation.KubectlApply.class));
        try (MockedStatic<Kubectl> kubectlMockedStatic = mockStatic(Kubectl.class)) {
            kubectlMockedStatic.when(() -> Kubectl.apply(any())).thenReturn(kubectlApply);
            when(kubectlApply.apiClient(any())).thenReturn(kubectlApply);
            when(kubectlApply.resource(any())).thenReturn(kubectlApply);
            when(kubectlApply.execute()).thenReturn(kubernetesObject);
            processor.postProcessAfterInitialization(kubernetesObject, "testBean");
        }
        verify(newBeanFactory).findAnnotationOnBean(anyString(), eq(io.kubernetes.client.spring.extended.manifests.annotation.KubectlApply.class));
    }

    //BaseRock generated method id: ${testSetBeanFactoryWithNonListableBeanFactory}, hash: 340C6673E035A7C61D8D16BBCFC69E53
    @Test
    void testSetBeanFactoryWithNonListableBeanFactory() {
        assertThrows(ClassCastException.class, () -> processor.setBeanFactory(mock(org.springframework.beans.factory.BeanFactory.class)));
    }
}
