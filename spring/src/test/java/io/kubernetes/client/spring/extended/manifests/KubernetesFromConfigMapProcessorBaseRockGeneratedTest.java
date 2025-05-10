package io.kubernetes.client.spring.extended.manifests;

import org.springframework.context.ApplicationContext;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1ConfigMap;
import org.mockito.Mock;
import com.github.benmanes.caffeine.cache.LoadingCache;
import java.lang.reflect.Field;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import io.kubernetes.client.spring.extended.manifests.annotation.FromConfigMap;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import java.util.HashMap;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.spring.extended.manifests.configmaps.ConfigMapGetter;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import com.github.benmanes.caffeine.cache.Caffeine;
import static org.hamcrest.Matchers.*;
import org.springframework.beans.factory.BeanCreationException;
import java.time.Duration;
import java.util.concurrent.ConcurrentHashMap;
import io.kubernetes.client.spring.extended.manifests.config.KubernetesManifestsProperties;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 10, unit = java.util.concurrent.TimeUnit.SECONDS)
class KubernetesFromConfigMapProcessorBaseRockGeneratedTest {

    @Mock
    private ApplicationContext mockApplicationContext;

    @Mock
    private KubernetesManifestsProperties mockManifestsProperties;

    @Mock
    private ConfigMapGetter mockConfigMapGetter;

    @Mock
    private AutowireCapableBeanFactory mockAutowireCapableBeanFactory;

    private KubernetesFromConfigMapProcessor processor;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        processor = new KubernetesFromConfigMapProcessor();
        processor.setApplicationContext(mockApplicationContext);
        when(mockApplicationContext.getAutowireCapableBeanFactory()).thenReturn(mockAutowireCapableBeanFactory);
        // Set the manifestsProperties field using reflection
        try {
            Field manifestsPropertiesField = KubernetesFromConfigMapProcessor.class.getDeclaredField("manifestsProperties");
            manifestsPropertiesField.setAccessible(true);
            manifestsPropertiesField.set(processor, mockManifestsProperties);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException("Failed to set manifestsProperties field", e);
        }
    }

    //BaseRock generated method id: ${testPostProcessAfterInitialization}, hash: F95302D5CDB056542BAED77CD84137A7
    @Disabled()
    @Test
    void testPostProcessAfterInitialization() throws Exception {
        // Arrange
        TestBean testBean = new TestBean();
        String beanName = "testBean";
        when(mockManifestsProperties.getRefreshInterval()).thenReturn(Duration.ofSeconds(5));
        when(mockAutowireCapableBeanFactory.getBean(eq(ConfigMapGetter.class))).thenReturn(mockConfigMapGetter);
        V1ConfigMap mockConfigMap = mock(V1ConfigMap.class);
        Map<String, String> configData = new HashMap<>();
        configData.put("key1", "value1");
        configData.put("key2", "value2");
        when(mockConfigMap.getData()).thenReturn(configData);
        when(mockConfigMapGetter.get(anyString(), anyString())).thenReturn(mockConfigMap);
        try (MockedStatic<Caffeine> mockedCaffeine = mockStatic(Caffeine.class)) {
            Caffeine mockCaffeineBuilder = mock(Caffeine.class);
            when(Caffeine.newBuilder()).thenReturn(mockCaffeineBuilder);
            when(mockCaffeineBuilder.expireAfterWrite(any(Duration.class))).thenReturn(mockCaffeineBuilder);
            LoadingCache mockLoadingCache = mock(LoadingCache.class);
            when(mockCaffeineBuilder.build(any())).thenReturn(mockLoadingCache);
            when(mockLoadingCache.asMap()).thenReturn(new ConcurrentHashMap<>(configData));
            // Act
            Object result = processor.postProcessAfterInitialization(testBean, beanName);
            // Assert
            assertThat(result, is(notNullValue()));
            assertThat(result, is(instanceOf(TestBean.class)));
            TestBean processedBean = (TestBean) result;
            assertThat(processedBean.configData, is(notNullValue()));
            assertThat(processedBean.configData, hasEntry("key1", "value1"));
            assertThat(processedBean.configData, hasEntry("key2", "value2"));
            verify(mockManifestsProperties, times(2)).getRefreshInterval();
            verify(mockApplicationContext).getAutowireCapableBeanFactory();
            verify(mockAutowireCapableBeanFactory).getBean(eq(ConfigMapGetter.class));
            verify(mockConfigMapGetter).get(anyString(), anyString());
        }
    }

    //BaseRock generated method id: ${testPostProcessAfterInitializationWithNullConfigMap}, hash: F15B8A601158A77F9E4D3633CD0A8E9D
    @Disabled()
    @Test
    void testPostProcessAfterInitializationWithNullConfigMap() throws Exception {
        // Arrange
        TestBean testBean = new TestBean();
        String beanName = "testBean";
        when(mockManifestsProperties.getRefreshInterval()).thenReturn(Duration.ofSeconds(5));
        when(mockAutowireCapableBeanFactory.getBean(eq(ConfigMapGetter.class))).thenReturn(mockConfigMapGetter);
        when(mockConfigMapGetter.get(anyString(), anyString())).thenReturn(null);
        try (MockedStatic<Caffeine> mockedCaffeine = mockStatic(Caffeine.class)) {
            Caffeine mockCaffeineBuilder = mock(Caffeine.class);
            when(Caffeine.newBuilder()).thenReturn(mockCaffeineBuilder);
            when(mockCaffeineBuilder.expireAfterWrite(any(Duration.class))).thenReturn(mockCaffeineBuilder);
            LoadingCache mockLoadingCache = mock(LoadingCache.class);
            when(mockCaffeineBuilder.build(any())).thenReturn(mockLoadingCache);
            when(mockLoadingCache.asMap()).thenReturn(new ConcurrentHashMap<>());
            // Act
            Object result = processor.postProcessAfterInitialization(testBean, beanName);
            // Assert
            assertThat(result, is(notNullValue()));
            assertThat(result, is(instanceOf(TestBean.class)));
            TestBean processedBean = (TestBean) result;
            assertThat(processedBean.configData, is(notNullValue()));
            assertThat(processedBean.configData.isEmpty(), is(true));
            verify(mockManifestsProperties, times(2)).getRefreshInterval();
            verify(mockApplicationContext).getAutowireCapableBeanFactory();
            verify(mockAutowireCapableBeanFactory).getBean(eq(ConfigMapGetter.class));
            verify(mockConfigMapGetter).get(anyString(), anyString());
        }
    }

    //BaseRock generated method id: ${testPostProcessAfterInitializationWithConfigMapGetterNotFound}, hash: 9DFC41F038312D6A30D34776CF3E385B
    @Disabled()
    @Test
    void testPostProcessAfterInitializationWithConfigMapGetterNotFound() {
        // Arrange
        TestBean testBean = new TestBean();
        String beanName = "testBean";
        when(mockManifestsProperties.getRefreshInterval()).thenReturn(Duration.ofSeconds(5));
        when(mockAutowireCapableBeanFactory.getBean(eq(ConfigMapGetter.class))).thenThrow(new org.springframework.beans.factory.NoSuchBeanDefinitionException(ConfigMapGetter.class));
        doReturn(ConfigMapGetter.class).when(mockAutowireCapableBeanFactory).createBean(eq(ConfigMapGetter.class));
        // Act & Assert
        assertThrows(BeanCreationException.class, () -> processor.postProcessAfterInitialization(testBean, beanName));
    }

    //BaseRock generated method id: ${testSetApplicationContext}, hash: C440E373E3AA3640F7D7F7791D631882
    @Test
    void testSetApplicationContext() {
        // Arrange
        ApplicationContext mockContext = mock(ApplicationContext.class);
        // Act
        processor.setApplicationContext(mockContext);
        // Assert
        Field applicationContextField = null;
        try {
            applicationContextField = KubernetesFromConfigMapProcessor.class.getDeclaredField("applicationContext");
            applicationContextField.setAccessible(true);
            ApplicationContext resultContext = (ApplicationContext) applicationContextField.get(processor);
            assertThat(resultContext, is(equalTo(mockContext)));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException("Failed to access applicationContext field", e);
        } finally {
            if (applicationContextField != null) {
                applicationContextField.setAccessible(false);
            }
        }
    }

    private static class TestBean {

        @FromConfigMap(namespace = "test-namespace", name = "test-config-map")
        private Map<String, String> configData;
    }
}
