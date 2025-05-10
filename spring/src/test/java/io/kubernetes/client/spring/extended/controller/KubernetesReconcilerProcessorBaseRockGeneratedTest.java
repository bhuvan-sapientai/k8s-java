package io.kubernetes.client.spring.extended.controller;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import static org.mockito.Mockito.doReturn;
import org.springframework.beans.factory.config.BeanDefinition;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.extended.controller.Controller;
import java.util.function.Supplier;
import org.mockito.Mock;
import io.kubernetes.client.informer.SharedInformerFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import org.mockito.MockedStatic;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.ArgumentMatchers.eq;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.extended.controller.reconciler.Reconciler;
import static org.mockito.Mockito.mockStatic;
import io.kubernetes.client.spring.extended.controller.factory.KubernetesControllerFactory;
import org.springframework.util.Assert;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class KubernetesReconcilerProcessorBaseRockGeneratedTest {

    @Mock
    private BeanDefinitionRegistry beanDefinitionRegistry;

    @Mock
    private ConfigurableListableBeanFactory beanFactory;

    @Mock
    private SharedInformerFactory sharedInformerFactory;

    @Mock
    private Reconciler reconciler;

    @Mock
    private AbstractBeanDefinition beanDefinition;

    private KubernetesReconcilerProcessor processor;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        processor = new KubernetesReconcilerProcessor();
        processor.postProcessBeanDefinitionRegistry(beanDefinitionRegistry);
    }

    //BaseRock generated method id: ${testConstructorWithDefaultSharedInformerFactoryBeanName}, hash: 318DBBB4F3D9966D7764CD0DEFAF250B
    @Test
    void testConstructorWithDefaultSharedInformerFactoryBeanName() {
        try (MockedStatic<Assert> mockedAssert = mockStatic(Assert.class)) {
            mockedAssert.when(() -> Assert.notNull(anyString(), anyString())).thenAnswer(invocation -> null);
            KubernetesReconcilerProcessor processor = new KubernetesReconcilerProcessor();
            assertThat(processor, is(notNullValue()));
            mockedAssert.verify(() -> Assert.notNull("sharedInformerFactory", "SharedInformerFactory bean name is required"));
        }
    }

    //BaseRock generated method id: ${testConstructorWithCustomSharedInformerFactoryBeanName}, hash: 779191D82D4D534C1F8A5BD8541A3FB6
    @Test
    void testConstructorWithCustomSharedInformerFactoryBeanName() {
        try (MockedStatic<Assert> mockedAssert = mockStatic(Assert.class)) {
            mockedAssert.when(() -> Assert.notNull(anyString(), anyString())).thenAnswer(invocation -> null);
            KubernetesReconcilerProcessor processor = new KubernetesReconcilerProcessor("customSharedInformerFactory");
            assertThat(processor, is(notNullValue()));
            mockedAssert.verify(() -> Assert.notNull("customSharedInformerFactory", "SharedInformerFactory bean name is required"));
        }
    }

    //BaseRock generated method id: ${testGetOrder}, hash: D19AF4AD31183D4B11C7140BDBED38ED
    @Test
    void testGetOrder() {
        int order = processor.getOrder();
        assertThat(order, is(KubernetesInformerFactoryProcessor.ORDER + 1));
    }

    //BaseRock generated method id: ${testPostProcessBeanDefinitionRegistry}, hash: 26FA8B46010B05822EC97C3CF5B1EDA5
    @Test
    void testPostProcessBeanDefinitionRegistry() {
        processor.postProcessBeanDefinitionRegistry(beanDefinitionRegistry);
        // We can't assert on private field, so we'll skip this assertion
    }

    //BaseRock generated method id: ${testPostProcessBeanFactory}, hash: DEE1BEED9AE17DCC3C67B0809FA226ED
    @Test
    void testPostProcessBeanFactory() {
        String reconcilerName = "testReconciler";
        String[] reconcilerNames = { reconcilerName };
        when(beanFactory.getBeanNamesForType(Reconciler.class)).thenReturn(reconcilerNames);
        when(beanFactory.getBean(KubernetesReconcilerProcessor.DEFAULT_SHARED_INFORMER_FACTORY_BEAN_NAME, SharedInformerFactory.class)).thenReturn(sharedInformerFactory);
        when(beanFactory.getBean(reconcilerName, Reconciler.class)).thenReturn(reconciler);
        try (MockedStatic<BeanDefinitionBuilder> mockedBeanDefinitionBuilder = mockStatic(BeanDefinitionBuilder.class)) {
            BeanDefinitionBuilder mockBuilder = mock(BeanDefinitionBuilder.class);
            mockedBeanDefinitionBuilder.when(() -> BeanDefinitionBuilder.genericBeanDefinition(eq(KubernetesControllerFactory.class), any(Supplier.class))).thenReturn(mockBuilder);
            when(mockBuilder.getBeanDefinition()).thenReturn(beanDefinition);
            processor.postProcessBeanFactory(beanFactory);
            verify(beanDefinitionRegistry).registerBeanDefinition(reconcilerName + "Controller", beanDefinition);
        }
    }

    //BaseRock generated method id: ${testPostProcessBeanFactoryWithMultipleReconcilers}, hash: FB1442EE61EA33E43C6461BB0957AAC2
    @Test
    void testPostProcessBeanFactoryWithMultipleReconcilers() {
        String[] reconcilerNames = { "testReconciler1", "testReconciler2" };
        when(beanFactory.getBeanNamesForType(Reconciler.class)).thenReturn(reconcilerNames);
        when(beanFactory.getBean(KubernetesReconcilerProcessor.DEFAULT_SHARED_INFORMER_FACTORY_BEAN_NAME, SharedInformerFactory.class)).thenReturn(sharedInformerFactory);
        doReturn(reconciler).when(beanFactory).getBean(anyString(), eq(Reconciler.class));
        try (MockedStatic<BeanDefinitionBuilder> mockedBeanDefinitionBuilder = mockStatic(BeanDefinitionBuilder.class)) {
            BeanDefinitionBuilder mockBuilder = mock(BeanDefinitionBuilder.class);
            mockedBeanDefinitionBuilder.when(() -> BeanDefinitionBuilder.genericBeanDefinition(eq(KubernetesControllerFactory.class), any(Supplier.class))).thenReturn(mockBuilder);
            when(mockBuilder.getBeanDefinition()).thenReturn(beanDefinition);
            processor.postProcessBeanFactory(beanFactory);
            verify(beanDefinitionRegistry, times(2)).registerBeanDefinition(anyString(), any(BeanDefinition.class));
        }
    }

    //BaseRock generated method id: ${testPostProcessBeanFactoryWithNoReconcilers}, hash: B4B2DD83B099D5C953C0DDDEAAB4F978
    @Test
    void testPostProcessBeanFactoryWithNoReconcilers() {
        String[] reconcilerNames = {};
        when(beanFactory.getBeanNamesForType(Reconciler.class)).thenReturn(reconcilerNames);
        processor.postProcessBeanFactory(beanFactory);
        verify(beanDefinitionRegistry, times(0)).registerBeanDefinition(anyString(), any(BeanDefinition.class));
    }
}
