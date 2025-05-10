package io.kubernetes.client.extended.controller.builder;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.extended.workqueue.WorkQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.function.BiPredicate;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import java.util.function.Predicate;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.function.Function;
import static org.hamcrest.Matchers.*;
import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.extended.controller.Controllers;
import static org.junit.jupiter.api.Assertions.*;
import io.kubernetes.client.extended.controller.DefaultControllerWatch;
import java.time.Duration;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class ControllerWatchBuilderBaseRockGeneratedTest {

    @Mock
    private WorkQueue<Request> mockWorkQueue;

    @Mock
    private Function<TestApiType, Request> mockWorkKeyGenerator;

    @Mock
    private Predicate<TestApiType> mockOnAddFilter;

    @Mock
    private BiPredicate<TestApiType, TestApiType> mockOnUpdateFilter;

    @Mock
    private BiPredicate<TestApiType, Boolean> mockOnDeleteFilter;

    private ControllerWatchBuilder<TestApiType> controllerWatchBuilder;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        controllerWatchBuilder = new ControllerWatchBuilder<>(TestApiType.class, mockWorkQueue);
    }

    //BaseRock generated method id: ${testConstructor}, hash: 1716715DCDA578B07D2755C83657DFCD
    @Test
    void testConstructor() {
        assertNotNull(controllerWatchBuilder);
    }

    //BaseRock generated method id: ${testWithOnAddFilter}, hash: 26C3DE90B05C1E89F9E9D77403FCF038
    @Test
    void testWithOnAddFilter() {
        ControllerWatchBuilder<TestApiType> result = controllerWatchBuilder.withOnAddFilter(mockOnAddFilter);
        assertSame(controllerWatchBuilder, result);
    }

    //BaseRock generated method id: ${testWithOnUpdateFilter}, hash: A2F98E62912A3A02E8E84947838477DB
    @Test
    void testWithOnUpdateFilter() {
        ControllerWatchBuilder<TestApiType> result = controllerWatchBuilder.withOnUpdateFilter(mockOnUpdateFilter);
        assertSame(controllerWatchBuilder, result);
    }

    //BaseRock generated method id: ${testWithOnDeleteFilter}, hash: 1465A652474F0C1CB8ED7BC800B12312
    @Test
    void testWithOnDeleteFilter() {
        ControllerWatchBuilder<TestApiType> result = controllerWatchBuilder.withOnDeleteFilter(mockOnDeleteFilter);
        assertSame(controllerWatchBuilder, result);
    }

    //BaseRock generated method id: ${testWithWorkQueueKeyFunc}, hash: BDEB5961C7802D9921EE9D907D2769F1
    @Test
    void testWithWorkQueueKeyFunc() {
        ControllerWatchBuilder<TestApiType> result = controllerWatchBuilder.withWorkQueueKeyFunc(mockWorkKeyGenerator);
        assertSame(controllerWatchBuilder, result);
    }

    //BaseRock generated method id: ${testWithResyncPeriod}, hash: 540BA4DD5832D8D0232B2B03EAAC40F8
    @Test
    void testWithResyncPeriod() {
        Duration resyncPeriod = Duration.ofMinutes(5);
        ControllerWatchBuilder<TestApiType> result = controllerWatchBuilder.withResyncPeriod(resyncPeriod);
        assertSame(controllerWatchBuilder, result);
    }

    //BaseRock generated method id: ${testBuild}, hash: 9093136DFD59FCC8203D9BB677BDDCF4
    @Test
    void testBuild() {
        try (MockedStatic<Controllers> controllersMockedStatic = mockStatic(Controllers.class)) {
            controllersMockedStatic.when(Controllers::defaultReflectiveKeyFunc).thenReturn(mockWorkKeyGenerator);
            controllerWatchBuilder.withOnAddFilter(mockOnAddFilter).withOnUpdateFilter(mockOnUpdateFilter).withOnDeleteFilter(mockOnDeleteFilter).withResyncPeriod(Duration.ofMinutes(5));
            DefaultControllerWatch<TestApiType> result = controllerWatchBuilder.build();
            assertNotNull(result);
            assertEquals(TestApiType.class, result.getApiTypeClass());
            assertEquals(Duration.ofMinutes(5), result.getResyncPeriod());
            assertEquals(mockOnAddFilter, result.getOnAddFilterPredicate());
            assertEquals(mockOnUpdateFilter, result.getOnUpdateFilterPredicate());
            assertEquals(mockOnDeleteFilter, result.getOnDeleteFilterPredicate());
        }
    }

    //BaseRock generated method id: ${testBuildWithDefaultWorkKeyGenerator}, hash: 5401B13BB7151D11F189DC9A02CA9D2D
    @Test
    void testBuildWithDefaultWorkKeyGenerator() {
        try (MockedStatic<Controllers> controllersMockedStatic = mockStatic(Controllers.class)) {
            Function<TestApiType, Request> defaultWorkKeyGenerator = mock(Function.class);
            controllersMockedStatic.when(Controllers::defaultReflectiveKeyFunc).thenReturn(defaultWorkKeyGenerator);
            DefaultControllerWatch<TestApiType> result = controllerWatchBuilder.build();
            assertNotNull(result);
        }
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
