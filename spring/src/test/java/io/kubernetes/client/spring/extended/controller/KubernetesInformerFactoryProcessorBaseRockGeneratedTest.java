package io.kubernetes.client.spring.extended.controller;

import io.kubernetes.client.openapi.ApiClient;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import static org.mockito.Mockito.doReturn;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.junit.jupiter.api.Disabled;
import io.kubernetes.client.informer.SharedInformerFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import okhttp3.OkHttpClient;
import org.springframework.test.util.ReflectionTestUtils;
import static org.mockito.Mockito.times;
import org.mockito.MockedStatic;
import io.kubernetes.client.common.KubernetesObject;
import static org.mockito.ArgumentMatchers.anyLong;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.core.ResolvableType;
import io.kubernetes.client.informer.cache.Lister;
import io.kubernetes.client.spring.extended.controller.config.KubernetesInformerProperties;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesInformer;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.informer.SharedIndexInformer;
import static org.mockito.Mockito.mockStatic;
import io.kubernetes.client.informer.cache.Indexer;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.annotation.AnnotatedElementUtils;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesInformers;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import java.time.Duration;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(value = 10, unit = java.util.concurrent.TimeUnit.SECONDS)
class KubernetesInformerFactoryProcessorBaseRockGeneratedTest {

    @Mock
    private KubernetesInformerProperties informerProperties;

    @Mock
    private ConfigurableListableBeanFactory beanFactory;

    @Mock
    private BeanDefinitionRegistry registry;

    @Mock
    private ApiClient apiClient;

    @Mock
    private SharedInformerFactory sharedInformerFactory;

    private KubernetesInformerFactoryProcessor processor;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        processor = new KubernetesInformerFactoryProcessor();
        ReflectionTestUtils.setField(processor, "informerProperties", informerProperties);
        processor.setBeanFactory(beanFactory);
    }

    //BaseRock generated method id: ${testPostProcessBeanFactory}, hash: BDEDC85FDF5A1E54989160C9B25FAEF4
    @Test
    void testPostProcessBeanFactory() {
        processor.postProcessBeanFactory(beanFactory);
        // No assertions needed as the method is empty
    }

    //BaseRock generated method id: ${testGetOrder}, hash: 46CBAD5D239A50889C8C6226C3A10409
    @Test
    void testGetOrder() {
        assertThat(processor.getOrder(), is(0));
    }

    //BaseRock generated method id: ${testPostProcessBeanDefinitionRegistry}, hash: 476C9D7FC785AA80F86F7C926C6B7320
    @Disabled()
    @Test
    void testPostProcessBeanDefinitionRegistry() {
        try (MockedStatic<AnnotatedElementUtils> annotatedElementUtilsMock = mockStatic(AnnotatedElementUtils.class)) {
            when(registry.getBeanDefinitionNames()).thenReturn(new String[] { "testBean" });
            when(beanFactory.getType("testBean")).thenReturn((Class) TestClass.class);
            KubernetesInformers kubernetesInformers = mock(KubernetesInformers.class);
            KubernetesInformer kubernetesInformer = mock(KubernetesInformer.class);
            when(kubernetesInformers.value()).thenReturn(new KubernetesInformer[] { kubernetesInformer });
            annotatedElementUtilsMock.when(() -> AnnotatedElementUtils.getMergedAnnotation(TestClass.class, KubernetesInformers.class)).thenReturn(kubernetesInformers);
            when(kubernetesInformer.apiTypeClass()).thenReturn((Class) TestApiType.class);
            when(registry.getBeanDefinition(anyString())).thenReturn(mock(RootBeanDefinition.class));
            processor.postProcessBeanDefinitionRegistry(registry);
            verify(registry, times(2)).registerBeanDefinition(anyString(), any(RootBeanDefinition.class));
        }
    }

    //BaseRock generated method id: ${testRegisterInformer}, hash: 80E106696A5E09AB20F315C373FB708D
    @Disabled()
    @Test
    void testRegisterInformer() {
        KubernetesInformer kubernetesInformer = mock(KubernetesInformer.class);
        when(kubernetesInformer.apiTypeClass()).thenReturn((Class) TestApiType.class);
        processor.postProcessBeanDefinitionRegistry(registry);
        verify(registry).registerBeanDefinition(anyString(), any(RootBeanDefinition.class));
    }

    //BaseRock generated method id: ${testRegisterLister}, hash: B13C12E1C613A24BB72EEC5E4BC631E3
    @Disabled()
    @Test
    void testRegisterLister() {
        KubernetesInformer kubernetesInformer = mock(KubernetesInformer.class);
        when(kubernetesInformer.apiTypeClass()).thenReturn((Class) TestApiType.class);
        processor.postProcessBeanDefinitionRegistry(registry);
        verify(registry).registerBeanDefinition(anyString(), any(RootBeanDefinition.class));
    }

    //BaseRock generated method id: ${testLister}, hash: 206689E937D96A8A78222AB484D75114
    @Disabled()
    @Test
    void testLister() {
        KubernetesInformer kubernetesInformer = mock(KubernetesInformer.class);
        when(kubernetesInformer.apiTypeClass()).thenReturn((Class) TestApiType.class);
        SharedIndexInformer<TestApiType> sharedIndexInformer = mock(SharedIndexInformer.class);
        when(beanFactory.getBean(anyString(), eq(SharedIndexInformer.class))).thenReturn(sharedIndexInformer);
        Indexer<TestApiType> indexer = mock(Indexer.class);
        when(sharedIndexInformer.getIndexer()).thenReturn(indexer);
        processor.postProcessBeanDefinitionRegistry(registry);
        verify(beanFactory).getBean(anyString(), eq(SharedIndexInformer.class));
    }

    //BaseRock generated method id: ${testInformer}, hash: 974330D5162EDD507502EBA819A906AB
    @Disabled()
    @Test
    void testInformer() {
        KubernetesInformer kubernetesInformer = mock(KubernetesInformer.class);
        when(kubernetesInformer.apiTypeClass()).thenReturn((Class) TestApiType.class);
        when(kubernetesInformer.resyncPeriodMillis()).thenReturn(1000L);
        when(kubernetesInformer.namespace()).thenReturn("default");
        when(beanFactory.getBean(ApiClient.class)).thenReturn(apiClient);
        when(beanFactory.getBean(SharedInformerFactory.class)).thenReturn(sharedInformerFactory);
        OkHttpClient httpClient = mock(OkHttpClient.class);
        when(apiClient.getHttpClient()).thenReturn(httpClient);
        when(httpClient.readTimeoutMillis()).thenReturn(30000);
        when(informerProperties.getClientReadTimeout()).thenReturn(Duration.ofSeconds(60));
        OkHttpClient.Builder builder = mock(OkHttpClient.Builder.class);
        when(httpClient.newBuilder()).thenReturn(builder);
        when(builder.readTimeout(any(Duration.class))).thenReturn(builder);
        when(builder.build()).thenReturn(httpClient);
        GenericKubernetesApi genericApi = mock(GenericKubernetesApi.class);
        try (MockedStatic<GenericKubernetesApi> genericApiMock = mockStatic(GenericKubernetesApi.class)) {
            genericApiMock.when(() -> new GenericKubernetesApi(any(), any(), any(), any(), any(), eq(apiClient))).thenReturn(genericApi);
            SharedIndexInformer<TestApiType> sharedIndexInformer = mock(SharedIndexInformer.class);
            when(sharedInformerFactory.sharedIndexInformerFor(any(), eq(TestApiType.class), anyLong(), anyString())).thenReturn(sharedIndexInformer);
            processor.postProcessBeanDefinitionRegistry(registry);
            verify(apiClient).setHttpClient(any());
            verify(sharedInformerFactory).sharedIndexInformerFor(any(), eq(TestApiType.class), anyLong(), anyString());
        }
    }

    //BaseRock generated method id: ${testSetBeanFactory}, hash: 9F13F84438C45D2A2A57AAE72F767686
    @Test
    void testSetBeanFactory() {
        ConfigurableListableBeanFactory testBeanFactory = mock(ConfigurableListableBeanFactory.class);
        processor.setBeanFactory(testBeanFactory);
        // Cannot assert private field directly
    }

    private static class TestClass {
    }

    private static class TestApiType implements KubernetesObject {

        @Override
        public String getApiVersion() {
            return null;
        }

        @Override
        public String getKind() {
            return null;
        }

        @Override
        public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata() {
            return null;
        }
    }
}
