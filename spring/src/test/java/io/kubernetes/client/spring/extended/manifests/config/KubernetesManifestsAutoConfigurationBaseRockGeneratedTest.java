package io.kubernetes.client.spring.extended.manifests.config;

import io.kubernetes.client.spring.extended.manifests.KubernetesKubectlApplyProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.context.annotation.Bean;
import io.kubernetes.client.spring.extended.manifests.KubernetesFromConfigMapProcessor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.mockito.Mock;
import io.kubernetes.client.spring.extended.manifests.KubernetesKubectlCreateProcessor;
import org.springframework.context.annotation.Configuration;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import io.kubernetes.client.spring.extended.manifests.KubernetesFromYamlProcessor;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class KubernetesManifestsAutoConfigurationBaseRockGeneratedTest {

    @Mock
    private KubernetesManifestsProperties kubernetesManifestsProperties;

    private KubernetesManifestsAutoConfiguration kubernetesManifestsAutoConfiguration;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        kubernetesManifestsAutoConfiguration = new KubernetesManifestsAutoConfiguration();
    }

    //BaseRock generated method id: ${testClassAnnotations}, hash: 048FCD47DA69C47302089CC5964E79E3
    @Test
    void testClassAnnotations() {
        Class<?> clazz = KubernetesManifestsAutoConfiguration.class;
        assertTrue(clazz.isAnnotationPresent(Configuration.class));
        assertTrue(clazz.isAnnotationPresent(ConditionalOnKubernetesManifestsEnabled.class));
        assertTrue(clazz.isAnnotationPresent(EnableConfigurationProperties.class));
        EnableConfigurationProperties enableConfigurationProperties = clazz.getAnnotation(EnableConfigurationProperties.class);
        assertArrayEquals(new Class[] { KubernetesManifestsProperties.class }, enableConfigurationProperties.value());
        Configuration configuration = clazz.getAnnotation(Configuration.class);
        assertFalse(configuration.proxyBeanMethods());
    }

    //BaseRock generated method id: ${testKubernetesFromYamlProcessor}, hash: F88DC4EFC46BB680FF7277F27C2AA78B
    @Test
    void testKubernetesFromYamlProcessor() {
        Bean beanAnnotation = null;
        ConditionalOnMissingBean conditionalOnMissingBeanAnnotation = null;
        try {
            beanAnnotation = KubernetesManifestsAutoConfiguration.class.getDeclaredMethod("kubernetesFromYamlProcessor").getAnnotation(Bean.class);
            conditionalOnMissingBeanAnnotation = KubernetesManifestsAutoConfiguration.class.getDeclaredMethod("kubernetesFromYamlProcessor").getAnnotation(ConditionalOnMissingBean.class);
        } catch (NoSuchMethodException e) {
            fail("Method kubernetesFromYamlProcessor not found");
        }
        assertNotNull(beanAnnotation);
        assertNotNull(conditionalOnMissingBeanAnnotation);
        KubernetesFromYamlProcessor processor = kubernetesManifestsAutoConfiguration.kubernetesFromYamlProcessor();
        assertNotNull(processor);
        assertTrue(processor instanceof KubernetesFromYamlProcessor);
    }

    //BaseRock generated method id: ${testKubernetesFromConfigMapProcessor}, hash: 70EB8637712CD99271CD1FCAA0FECA20
    @Test
    void testKubernetesFromConfigMapProcessor() {
        Bean beanAnnotation = null;
        ConditionalOnMissingBean conditionalOnMissingBeanAnnotation = null;
        try {
            beanAnnotation = KubernetesManifestsAutoConfiguration.class.getDeclaredMethod("kubernetesFromConfigMapProcessor").getAnnotation(Bean.class);
            conditionalOnMissingBeanAnnotation = KubernetesManifestsAutoConfiguration.class.getDeclaredMethod("kubernetesFromConfigMapProcessor").getAnnotation(ConditionalOnMissingBean.class);
        } catch (NoSuchMethodException e) {
            fail("Method kubernetesFromConfigMapProcessor not found");
        }
        assertNotNull(beanAnnotation);
        assertNotNull(conditionalOnMissingBeanAnnotation);
        KubernetesFromConfigMapProcessor processor = kubernetesManifestsAutoConfiguration.kubernetesFromConfigMapProcessor();
        assertNotNull(processor);
        assertTrue(processor instanceof KubernetesFromConfigMapProcessor);
    }

    //BaseRock generated method id: ${testKubernetesKubectlCreateProcessor}, hash: 8D51988FC456C22DCC5C5406BB2E85E4
    @Test
    void testKubernetesKubectlCreateProcessor() {
        Bean beanAnnotation = null;
        ConditionalOnMissingBean conditionalOnMissingBeanAnnotation = null;
        try {
            beanAnnotation = KubernetesManifestsAutoConfiguration.class.getDeclaredMethod("kubernetesKubectlCreateProcessor").getAnnotation(Bean.class);
            conditionalOnMissingBeanAnnotation = KubernetesManifestsAutoConfiguration.class.getDeclaredMethod("kubernetesKubectlCreateProcessor").getAnnotation(ConditionalOnMissingBean.class);
        } catch (NoSuchMethodException e) {
            fail("Method kubernetesKubectlCreateProcessor not found");
        }
        assertNotNull(beanAnnotation);
        assertNotNull(conditionalOnMissingBeanAnnotation);
        KubernetesKubectlCreateProcessor processor = kubernetesManifestsAutoConfiguration.kubernetesKubectlCreateProcessor();
        assertNotNull(processor);
        assertTrue(processor instanceof KubernetesKubectlCreateProcessor);
    }

    //BaseRock generated method id: ${testKubernetesKubectlApplyProcessor}, hash: 0804124A39416C035564F909FD0C7D02
    @Test
    void testKubernetesKubectlApplyProcessor() {
        Bean beanAnnotation = null;
        ConditionalOnMissingBean conditionalOnMissingBeanAnnotation = null;
        try {
            beanAnnotation = KubernetesManifestsAutoConfiguration.class.getDeclaredMethod("kubernetesKubectlApplyProcessor").getAnnotation(Bean.class);
            conditionalOnMissingBeanAnnotation = KubernetesManifestsAutoConfiguration.class.getDeclaredMethod("kubernetesKubectlApplyProcessor").getAnnotation(ConditionalOnMissingBean.class);
        } catch (NoSuchMethodException e) {
            fail("Method kubernetesKubectlApplyProcessor not found");
        }
        assertNotNull(beanAnnotation);
        assertNotNull(conditionalOnMissingBeanAnnotation);
        KubernetesKubectlApplyProcessor processor = kubernetesManifestsAutoConfiguration.kubernetesKubectlApplyProcessor();
        assertNotNull(processor);
        assertTrue(processor instanceof KubernetesKubectlApplyProcessor);
    }
}
