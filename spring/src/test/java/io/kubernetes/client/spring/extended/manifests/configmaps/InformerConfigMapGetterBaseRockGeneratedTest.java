package io.kubernetes.client.spring.extended.manifests.configmaps;

import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.informer.cache.Lister;
import io.kubernetes.client.spring.extended.manifests.configmaps.ConfigMapGetter;
import io.kubernetes.client.openapi.models.V1ConfigMap;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;
import org.springframework.test.util.ReflectionTestUtils;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class InformerConfigMapGetterBaseRockGeneratedTest {

    @Mock
    private Lister<V1ConfigMap> configMapLister;

    private InformerConfigMapGetter informerConfigMapGetter;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        informerConfigMapGetter = new InformerConfigMapGetter();
        ReflectionTestUtils.setField(informerConfigMapGetter, "configMapLister", configMapLister);
    }

    //BaseRock generated method id: ${testGet}, hash: 3A1E5A1F10BBFBBE481E06922213981A
    @Test
    void testGet() {
        String namespace = "test-namespace";
        String name = "test-name";
        V1ConfigMap expectedConfigMap = new V1ConfigMap();
        Lister<V1ConfigMap> namespaceLister = mock(Lister.class);
        when(configMapLister.namespace(namespace)).thenReturn(namespaceLister);
        doReturn(expectedConfigMap).when(namespaceLister).get(name);
        V1ConfigMap result = informerConfigMapGetter.get(namespace, name);
        assertNotNull(result);
        assertSame(expectedConfigMap, result);
        verify(configMapLister).namespace(namespace);
        verify(namespaceLister).get(name);
    }

    //BaseRock generated method id: ${testGetWhenConfigMapNotFound}, hash: C772C7A974880AC28CF7321313CAB9B3
    @Test
    void testGetWhenConfigMapNotFound() {
        String namespace = "non-existent-namespace";
        String name = "non-existent-name";
        Lister<V1ConfigMap> namespaceLister = mock(Lister.class);
        when(configMapLister.namespace(namespace)).thenReturn(namespaceLister);
        doReturn(null).when(namespaceLister).get(name);
        V1ConfigMap result = informerConfigMapGetter.get(namespace, name);
        assertNull(result);
        verify(configMapLister).namespace(namespace);
        verify(namespaceLister).get(name);
    }

    //BaseRock generated method id: ${testInformerConfigMapGetterImplementsConfigMapGetter}, hash: 29BDA7B6E625878541E57ACAE660F6F2
    @Test
    void testInformerConfigMapGetterImplementsConfigMapGetter() {
        assertTrue(informerConfigMapGetter instanceof ConfigMapGetter);
    }
}
