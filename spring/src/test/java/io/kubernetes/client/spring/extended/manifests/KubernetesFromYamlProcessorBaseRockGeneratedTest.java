package io.kubernetes.client.spring.extended.manifests;

import static org.mockito.Mockito.doReturn;
import java.nio.file.Files;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import java.io.File;
import org.mockito.Mock;
import java.lang.reflect.Field;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import java.nio.file.Paths;
import org.mockito.MockedStatic;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import io.kubernetes.client.spring.extended.manifests.annotation.FromYaml;
import java.io.IOException;
import org.springframework.util.ReflectionUtils;
import static org.hamcrest.Matchers.instanceOf;
import org.junit.jupiter.api.BeforeEach;
import java.nio.file.Path;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.springframework.beans.factory.ListableBeanFactory;
import io.kubernetes.client.util.Yaml;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import org.springframework.beans.factory.BeanCreationException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class KubernetesFromYamlProcessorBaseRockGeneratedTest {

    @Mock
    private ListableBeanFactory mockBeanFactory;

    private KubernetesFromYamlProcessor processor;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        processor = new KubernetesFromYamlProcessor();
        processor.setBeanFactory(mockBeanFactory);
    }

    //BaseRock generated method id: ${testPostProcessAfterInitializationWithFromYamlAnnotation}, hash: C76EC63CA4E6F4371198FD69D5E5687F
    @Test
    void testPostProcessAfterInitializationWithFromYamlAnnotation() throws Exception {
        String beanName = "testBean";
        Object bean = new Object();
        FromYaml mockFromYaml = mock(FromYaml.class);
        when(mockFromYaml.filePath()).thenReturn("test.yaml");
        when(mockBeanFactory.findAnnotationOnBean(beanName, FromYaml.class)).thenReturn(mockFromYaml);
        try (MockedStatic<Yaml> mockedYaml = mockStatic(Yaml.class);
            MockedStatic<Files> mockedFiles = mockStatic(Files.class);
            MockedStatic<Paths> mockedPaths = mockStatic(Paths.class)) {
            Path mockPath = mock(Path.class);
            mockedPaths.when(() -> Paths.get(anyString())).thenReturn(mockPath);
            mockedFiles.when(() -> Files.exists(mockPath)).thenReturn(true);
            mockedFiles.when(() -> Files.readAllBytes(mockPath)).thenReturn("test content".getBytes());
            Object mockLoadedObj = new Object();
            mockedYaml.when(() -> Yaml.load(anyString())).thenReturn(mockLoadedObj);
            Object result = processor.postProcessAfterInitialization(bean, beanName);
            assertThat(result, is(notNullValue()));
            assertThat(result, is(equalTo(mockLoadedObj)));
        }
    }

    //BaseRock generated method id: ${testPostProcessAfterInitializationWithoutFromYamlAnnotation}, hash: 70173D8C595C93C799349AF67C87B630
    @Test
    void testPostProcessAfterInitializationWithoutFromYamlAnnotation() throws Exception {
        String beanName = "testBean";
        Object bean = new Object();
        when(mockBeanFactory.findAnnotationOnBean(beanName, FromYaml.class)).thenReturn(null);
        Object result = processor.postProcessAfterInitialization(bean, beanName);
        assertThat(result, is(equalTo(bean)));
    }

    //BaseRock generated method id: ${testPostProcessAfterInitializationWithNoSuchBeanDefinitionException}, hash: 541B59DF4A7A88FE49FBD57CAECFCFCC
    @Test
    void testPostProcessAfterInitializationWithNoSuchBeanDefinitionException() throws Exception {
        String beanName = "testBean";
        Object bean = new Object();
        when(mockBeanFactory.findAnnotationOnBean(beanName, FromYaml.class)).thenThrow(new NoSuchBeanDefinitionException(beanName));
        Object result = processor.postProcessAfterInitialization(bean, beanName);
        assertThat(result, is(equalTo(bean)));
    }

    //BaseRock generated method id: ${testPostProcessAfterInitializationWithIncompatibleTypes}, hash: A1A81D436C8C4053FB9741D7E7AA5061
    @Disabled()
    @Test
    void testPostProcessAfterInitializationWithIncompatibleTypes() throws Exception {
        String beanName = "testBean";
        Object bean = new Object();
        FromYaml mockFromYaml = mock(FromYaml.class);
        when(mockFromYaml.filePath()).thenReturn("test.yaml");
        when(mockBeanFactory.findAnnotationOnBean(beanName, FromYaml.class)).thenReturn(mockFromYaml);
        try (MockedStatic<Yaml> mockedYaml = mockStatic(Yaml.class);
            MockedStatic<Files> mockedFiles = mockStatic(Files.class);
            MockedStatic<Paths> mockedPaths = mockStatic(Paths.class)) {
            Path mockPath = mock(Path.class);
            mockedPaths.when(() -> Paths.get(anyString())).thenReturn(mockPath);
            mockedFiles.when(() -> Files.exists(mockPath)).thenReturn(true);
            mockedFiles.when(() -> Files.readAllBytes(mockPath)).thenReturn("test content".getBytes());
            Object mockLoadedObj = "Incompatible type";
            mockedYaml.when(() -> Yaml.load(anyString())).thenReturn(mockLoadedObj);
            Object result = processor.postProcessAfterInitialization(bean, beanName);
            assertThat(result, is(equalTo(bean)));
        }
    }

    //BaseRock generated method id: ${testPostProcessAfterInitializationWithFieldAnnotation}, hash: E47DDED10550F493474E8762A57799F7
    @Test
    void testPostProcessAfterInitializationWithFieldAnnotation() throws Exception {
        class TestBean {

            @FromYaml(filePath = "test.yaml")
            private Object testField;
        }
        TestBean bean = new TestBean();
        String beanName = "testBean";
        when(mockBeanFactory.findAnnotationOnBean(beanName, FromYaml.class)).thenReturn(null);
        try (MockedStatic<Yaml> mockedYaml = mockStatic(Yaml.class);
            MockedStatic<Files> mockedFiles = mockStatic(Files.class);
            MockedStatic<Paths> mockedPaths = mockStatic(Paths.class);
            MockedStatic<ReflectionUtils> mockedReflectionUtils = mockStatic(ReflectionUtils.class)) {
            Path mockPath = mock(Path.class);
            mockedPaths.when(() -> Paths.get(anyString())).thenReturn(mockPath);
            mockedFiles.when(() -> Files.exists(mockPath)).thenReturn(true);
            mockedFiles.when(() -> Files.readAllBytes(mockPath)).thenReturn("test content".getBytes());
            Object mockLoadedObj = new Object();
            mockedYaml.when(() -> Yaml.load(anyString())).thenReturn(mockLoadedObj);
            Field testField = TestBean.class.getDeclaredField("testField");
            mockedReflectionUtils.when(() -> ReflectionUtils.makeAccessible(testField)).thenAnswer(invocation -> null);
            mockedReflectionUtils.when(() -> ReflectionUtils.setField(testField, bean, mockLoadedObj)).thenAnswer(invocation -> null);
            Object result = processor.postProcessAfterInitialization(bean, beanName);
            assertThat(result, is(equalTo(bean)));
        }
    }

    //BaseRock generated method id: ${testPostProcessAfterInitializationWithIOException}, hash: 48C54F2AD569B23EB7540A8760AC45EB
    @Test
    void testPostProcessAfterInitializationWithIOException() throws Exception {
        String beanName = "testBean";
        Object bean = new Object();
        FromYaml mockFromYaml = mock(FromYaml.class);
        when(mockFromYaml.filePath()).thenReturn("test.yaml");
        when(mockBeanFactory.findAnnotationOnBean(beanName, FromYaml.class)).thenReturn(mockFromYaml);
        try (MockedStatic<Files> mockedFiles = mockStatic(Files.class);
            MockedStatic<Paths> mockedPaths = mockStatic(Paths.class)) {
            Path mockPath = mock(Path.class);
            mockedPaths.when(() -> Paths.get(anyString())).thenReturn(mockPath);
            mockedFiles.when(() -> Files.exists(mockPath)).thenReturn(true);
            mockedFiles.when(() -> Files.readAllBytes(mockPath)).thenThrow(new IOException("Test IO Exception"));
            assertThrows(BeanCreationException.class, () -> processor.postProcessAfterInitialization(bean, beanName));
        }
    }

    //BaseRock generated method id: ${testPostProcessAfterInitializationWithYAMLException}, hash: CF3101BA64E1F3DAEE085BA7BBDE993B
    @Test
    void testPostProcessAfterInitializationWithYAMLException() throws Exception {
        String beanName = "testBean";
        Object bean = new Object();
        FromYaml mockFromYaml = mock(FromYaml.class);
        when(mockFromYaml.filePath()).thenReturn("test.yaml");
        when(mockBeanFactory.findAnnotationOnBean(beanName, FromYaml.class)).thenReturn(mockFromYaml);
        try (MockedStatic<Yaml> mockedYaml = mockStatic(Yaml.class);
            MockedStatic<Files> mockedFiles = mockStatic(Files.class);
            MockedStatic<Paths> mockedPaths = mockStatic(Paths.class)) {
            Path mockPath = mock(Path.class);
            mockedPaths.when(() -> Paths.get(anyString())).thenReturn(mockPath);
            mockedFiles.when(() -> Files.exists(mockPath)).thenReturn(true);
            mockedFiles.when(() -> Files.readAllBytes(mockPath)).thenReturn("test content".getBytes());
            mockedYaml.when(() -> Yaml.load(anyString())).thenThrow(new org.yaml.snakeyaml.error.YAMLException("Test YAML Exception"));
            assertThrows(BeanCreationException.class, () -> processor.postProcessAfterInitialization(bean, beanName));
        }
    }

    //BaseRock generated method id: ${testSetBeanFactory}, hash: 1B03C941DABE6C7DF21D3FAFB4F64FA9
    @Test
    void testSetBeanFactory() {
        ListableBeanFactory beanFactory = mock(ListableBeanFactory.class);
        processor.setBeanFactory(beanFactory);
        assertThat(processor, is(notNullValue()));
        assertThat(processor, is(instanceOf(KubernetesFromYamlProcessor.class)));
    }

    //BaseRock generated method id: ${testLoadFromYamlWithFileNotFound}, hash: 9DF4883656DE3891215DB5FBAAF26A2B
    @Disabled()
    @Test
    void testLoadFromYamlWithFileNotFound() {
        String nonExistentFilePath = "non_existent_file.yaml";
        try (MockedStatic<Files> mockedFiles = mockStatic(Files.class);
            MockedStatic<Paths> mockedPaths = mockStatic(Paths.class)) {
            Path mockPath = mock(Path.class);
            mockedPaths.when(() -> Paths.get(nonExistentFilePath)).thenReturn(mockPath);
            mockedFiles.when(() -> Files.exists(mockPath)).thenReturn(false);
            File mockClassPathFile = mock(File.class);
            Path mockClassPathPath = mock(Path.class);
            when(mockClassPathFile.toPath()).thenReturn(mockClassPathPath);
            mockedFiles.when(() -> Files.exists(mockClassPathPath)).thenReturn(false);
            FromYaml mockFromYaml = mock(FromYaml.class);
            when(mockFromYaml.filePath()).thenReturn(nonExistentFilePath);
            when(mockBeanFactory.findAnnotationOnBean(anyString(), eq(FromYaml.class))).thenReturn(mockFromYaml);
            assertThrows(BeanCreationException.class, () -> processor.postProcessAfterInitialization(new Object(), "testBean"));
        }
    }
}
