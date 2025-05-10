package io.kubernetes.client.extended.controller;

import io.kubernetes.client.common.KubernetesObject;
import java.util.concurrent.ThreadFactory;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import java.util.function.Function;
import io.kubernetes.client.extended.controller.reconciler.Request;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.NullSource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class ControllersBaseRockGeneratedTest {

    @Mock
    private KubernetesObject mockKubernetesObject;

    @Mock
    private V1ObjectMeta mockObjectMeta;

    //BaseRock generated method id: ${testDefaultReflectiveKeyFunc}, hash: 2DF0186CA165819BA2FBF266C6CF59BB
    @Test
    void testDefaultReflectiveKeyFunc() {
        MockitoAnnotations.openMocks(this);
        when(mockKubernetesObject.getMetadata()).thenReturn(mockObjectMeta);
        when(mockObjectMeta.getNamespace()).thenReturn("test-namespace");
        when(mockObjectMeta.getName()).thenReturn("test-name");
        Function<KubernetesObject, Request> keyFunc = Controllers.defaultReflectiveKeyFunc();
        Request result = keyFunc.apply(mockKubernetesObject);
        assertNotNull(result);
        assertEquals("test-namespace", result.getNamespace());
        assertEquals("test-name", result.getName());
    }

    //BaseRock generated method id: ${testNamedControllerThreadFactory}, hash: EA78302DC545EEBE1BD6C63D7ADEAA61
    @ParameterizedTest
    @NullSource
    @ValueSource(strings = { "test-controller", "another-controller" })
    void testNamedControllerThreadFactory(String controllerName) {
        ThreadFactory factory = Controllers.namedControllerThreadFactory(controllerName);
        assertNotNull(factory);
        Thread thread = factory.newThread(() -> {
        });
        assertNotNull(thread);
        if (controllerName != null) {
            assertTrue(thread.getName().startsWith(controllerName));
        } else {
            assertTrue(thread.getName().startsWith("null"));
        }
    }

    //BaseRock generated method id: ${testControllerClassInstantiation}, hash: 7412FE549066344CBDE811C45585F769
    @Test
    void testControllerClassInstantiation() {
        assertNotNull(new Controllers());
    }
}
