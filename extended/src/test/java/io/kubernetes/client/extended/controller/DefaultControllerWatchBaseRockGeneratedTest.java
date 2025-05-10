package io.kubernetes.client.extended.controller;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.extended.workqueue.WorkQueue;
import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import java.util.function.BiPredicate;
import org.mockito.Mock;
import io.kubernetes.client.informer.ResourceEventHandler;
import org.junit.jupiter.api.Timeout;
import java.util.function.Predicate;
import org.mockito.MockitoAnnotations;
import java.util.function.Function;
import io.kubernetes.client.extended.controller.reconciler.Request;
import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class DefaultControllerWatchBaseRockGeneratedTest {

    @Mock
    private WorkQueue<Request> mockWorkQueue;

    @Mock
    private Function<TestApiType, Request> mockWorkKeyGenerator;

    @Mock
    private TestApiType mockApiType;

    @Mock
    private Request mockRequest;

    private DefaultControllerWatch<TestApiType> defaultControllerWatch;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        defaultControllerWatch = new DefaultControllerWatch<>(TestApiType.class, mockWorkQueue, mockWorkKeyGenerator, Duration.ofSeconds(30));
    }

    //BaseRock generated method id: ${testConstructor}, hash: 20583C27E3809CA4D5429DEDC9FD1F22
    @Test
    void testConstructor() {
        assertNotNull(defaultControllerWatch);
        assertEquals(TestApiType.class, defaultControllerWatch.getApiTypeClass());
        assertEquals(Duration.ofSeconds(30), defaultControllerWatch.getResyncPeriod());
    }

    //BaseRock generated method id: ${testSetAndGetOnAddFilterPredicate}, hash: 31D5FF5A2AEAEABD208EE19D3EEE204D
    @Test
    void testSetAndGetOnAddFilterPredicate() {
        Predicate<TestApiType> predicate = obj -> true;
        defaultControllerWatch.setOnAddFilterPredicate(predicate);
        assertEquals(predicate, defaultControllerWatch.getOnAddFilterPredicate());
    }

    //BaseRock generated method id: ${testSetAndGetOnUpdateFilterPredicate}, hash: D23606BD1B546FFF744F7FB8E65F7C08
    @Test
    void testSetAndGetOnUpdateFilterPredicate() {
        BiPredicate<TestApiType, TestApiType> predicate = (oldObj, newObj) -> true;
        defaultControllerWatch.setOnUpdateFilterPredicate(predicate);
        assertEquals(predicate, defaultControllerWatch.getOnUpdateFilterPredicate());
    }

    //BaseRock generated method id: ${testSetAndGetOnDeleteFilterPredicate}, hash: 65C5984E5C99023EA6F5F233DB71E755
    @Test
    void testSetAndGetOnDeleteFilterPredicate() {
        BiPredicate<TestApiType, Boolean> predicate = (obj, deletedFinalStateUnknown) -> true;
        defaultControllerWatch.setOnDeleteFilterPredicate(predicate);
        assertEquals(predicate, defaultControllerWatch.getOnDeleteFilterPredicate());
    }

    //BaseRock generated method id: ${testGetResourceClass}, hash: C90A19D218A717947A4DD62A6E3E4F18
    @Test
    void testGetResourceClass() {
        assertEquals(TestApiType.class, defaultControllerWatch.getResourceClass());
    }

    //BaseRock generated method id: ${testGetResourceEventHandler}, hash: 1394E3083B242446D6245244011958C5
    @Test
    void testGetResourceEventHandler() {
        ResourceEventHandler<TestApiType> handler = defaultControllerWatch.getResourceEventHandler();
        assertNotNull(handler);
        when(mockWorkKeyGenerator.apply(mockApiType)).thenReturn(mockRequest);
        handler.onAdd(mockApiType);
        verify(mockWorkQueue).add(mockRequest);
        handler.onUpdate(mockApiType, mockApiType);
        verify(mockWorkQueue, times(2)).add(mockRequest);
        handler.onDelete(mockApiType, false);
        verify(mockWorkQueue, times(3)).add(mockRequest);
    }

    //BaseRock generated method id: ${testGetResourceEventHandlerWithFilters}, hash: 0D87AED9F77F3E348E04FC2471A207AE
    @Test
    void testGetResourceEventHandlerWithFilters() {
        defaultControllerWatch.setOnAddFilterPredicate(obj -> false);
        defaultControllerWatch.setOnUpdateFilterPredicate((oldObj, newObj) -> false);
        defaultControllerWatch.setOnDeleteFilterPredicate((obj, deletedFinalStateUnknown) -> false);
        ResourceEventHandler<TestApiType> handler = defaultControllerWatch.getResourceEventHandler();
        handler.onAdd(mockApiType);
        handler.onUpdate(mockApiType, mockApiType);
        handler.onDelete(mockApiType, false);
        verify(mockWorkQueue, never()).add(any());
    }

    //BaseRock generated method id: ${testGetResourceEventHandlerWithNullRequest}, hash: 2AD11CD6E1B6ACA0B81A812B3DBDBDDC
    @Test
    void testGetResourceEventHandlerWithNullRequest() {
        when(mockWorkKeyGenerator.apply(mockApiType)).thenReturn(null);
        ResourceEventHandler<TestApiType> handler = defaultControllerWatch.getResourceEventHandler();
        handler.onAdd(mockApiType);
        handler.onUpdate(mockApiType, mockApiType);
        handler.onDelete(mockApiType, false);
        verify(mockWorkQueue, never()).add(any());
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
        public V1ObjectMeta getMetadata() {
            return null;
        }
    }
}
