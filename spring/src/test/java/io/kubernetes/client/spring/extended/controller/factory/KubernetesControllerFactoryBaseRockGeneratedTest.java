package io.kubernetes.client.spring.extended.controller.factory;

import io.kubernetes.client.extended.workqueue.DefaultRateLimitingQueue;
import io.kubernetes.client.extended.controller.builder.ControllerBuilder;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesReconciler;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.extended.controller.Controller;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesReconcilerWatches;
import org.mockito.Mock;
import io.kubernetes.client.informer.SharedInformerFactory;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.extended.controller.builder.DefaultControllerBuilder;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import io.kubernetes.client.common.KubernetesObject;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.spring.extended.controller.annotation.KubernetesReconcilerWatch;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.extended.controller.reconciler.Reconciler;
import java.util.function.Function;
import static org.hamcrest.Matchers.*;
import org.springframework.beans.factory.BeanCreationException;
import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.extended.controller.builder.ControllerWatchBuilder;
import io.kubernetes.client.extended.workqueue.RateLimitingQueue;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class KubernetesControllerFactoryBaseRockGeneratedTest {

    @Mock
    private SharedInformerFactory mockSharedInformerFactory;

    @Mock
    private Reconciler mockReconciler;

    @Mock
    private KubernetesReconciler mockKubernetesReconciler;

    @Mock
    private KubernetesReconcilerWatches mockKubernetesReconcilerWatches;

    @Mock
    private KubernetesReconcilerWatch mockKubernetesReconcilerWatch;

    @Mock
    private DefaultControllerBuilder mockDefaultControllerBuilder;

    @Mock
    private ControllerWatchBuilder<KubernetesObject> mockControllerWatchBuilder;

    @Mock
    private Controller mockController;

    private KubernetesControllerFactory kubernetesControllerFactory;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        kubernetesControllerFactory = new KubernetesControllerFactory(mockSharedInformerFactory, mockReconciler);
    }

    //BaseRock generated method id: ${testGetObject}, hash: B06563A0B16D25A1B3EA87973B6B4090
    @Disabled()
    @Test
    void testGetObject() throws Exception {
        try (MockedStatic<ControllerBuilder> mockedControllerBuilder = mockStatic(ControllerBuilder.class)) {
            mockedControllerBuilder.when(() -> ControllerBuilder.defaultBuilder(any())).thenReturn(mockDefaultControllerBuilder);
            doReturn(Reconciler.class).when(mockReconciler).getClass();
            doReturn(mockKubernetesReconciler).when(mockReconciler).getClass().getAnnotation(KubernetesReconciler.class);
            doReturn("testReconciler").when(mockKubernetesReconciler).value();
            doReturn(mockKubernetesReconcilerWatches).when(mockKubernetesReconciler).watches();
            doReturn(new KubernetesReconcilerWatch[] { mockKubernetesReconcilerWatch }).when(mockKubernetesReconcilerWatches).value();
            doReturn(KubernetesObject.class).when(mockKubernetesReconcilerWatch).apiTypeClass();
            doReturn(TestWorkQueueKeyFunc.class).when(mockKubernetesReconcilerWatch).workQueueKeyFunc();
            doReturn(1000L).when(mockKubernetesReconcilerWatch).resyncPeriodMillis();
            doReturn(mockDefaultControllerBuilder).when(mockDefaultControllerBuilder).withWorkQueue(any());
            doReturn(mockDefaultControllerBuilder).when(mockDefaultControllerBuilder).watch(any());
            doReturn(mockDefaultControllerBuilder).when(mockDefaultControllerBuilder).withWorkerCount(anyInt());
            doReturn(mockDefaultControllerBuilder).when(mockDefaultControllerBuilder).withReconciler(any());
            doReturn(mockDefaultControllerBuilder).when(mockDefaultControllerBuilder).withName(anyString());
            doReturn(mockController).when(mockDefaultControllerBuilder).build();
            mockedControllerBuilder.when(() -> ControllerBuilder.controllerWatchBuilder(any(), any())).thenReturn(mockControllerWatchBuilder);
            doReturn(mockControllerWatchBuilder).when(mockControllerWatchBuilder).withOnAddFilter(any());
            doReturn(mockControllerWatchBuilder).when(mockControllerWatchBuilder).withOnUpdateFilter(any());
            doReturn(mockControllerWatchBuilder).when(mockControllerWatchBuilder).withOnDeleteFilter(any());
            doReturn(mockControllerWatchBuilder).when(mockControllerWatchBuilder).withWorkQueueKeyFunc(any());
            doReturn(mockControllerWatchBuilder).when(mockControllerWatchBuilder).withResyncPeriod(any());
            doReturn(null).when(mockControllerWatchBuilder).build();
            Controller result = kubernetesControllerFactory.getObject();
            assertThat(result, is(notNullValue()));
            assertThat(result, is(instanceOf(Controller.class)));
            verify(mockDefaultControllerBuilder).withWorkQueue(any(DefaultRateLimitingQueue.class));
            verify(mockDefaultControllerBuilder).watch(any());
            verify(mockDefaultControllerBuilder).withWorkerCount(anyInt());
            verify(mockDefaultControllerBuilder).withReconciler(mockReconciler);
            verify(mockDefaultControllerBuilder).withName("testReconciler");
            verify(mockDefaultControllerBuilder).build();
        }
    }

    //BaseRock generated method id: ${testGetObjectType}, hash: 27C6FDB8B70781F4282DE87A558D653E
    @Test
    void testGetObjectType() {
        Class<?> result = kubernetesControllerFactory.getObjectType();
        assertThat(result, is(Controller.class));
    }

    //BaseRock generated method id: ${testGetObjectWithExceptionInWorkQueueKeyFunc}, hash: A4B570589347719AB8C4FA2FCCF876F2
    @Disabled()
    @Test
    void testGetObjectWithExceptionInWorkQueueKeyFunc() throws Exception {
        try (MockedStatic<ControllerBuilder> mockedControllerBuilder = mockStatic(ControllerBuilder.class)) {
            mockedControllerBuilder.when(() -> ControllerBuilder.defaultBuilder(any())).thenReturn(mockDefaultControllerBuilder);
            doReturn(Reconciler.class).when(mockReconciler).getClass();
            doReturn(mockKubernetesReconciler).when(mockReconciler).getClass().getAnnotation(KubernetesReconciler.class);
            doReturn("testReconciler").when(mockKubernetesReconciler).value();
            doReturn(mockKubernetesReconcilerWatches).when(mockKubernetesReconciler).watches();
            doReturn(new KubernetesReconcilerWatch[] { mockKubernetesReconcilerWatch }).when(mockKubernetesReconcilerWatches).value();
            doReturn(KubernetesObject.class).when(mockKubernetesReconcilerWatch).apiTypeClass();
            doReturn(ExceptionThrowingWorkQueueKeyFunc.class).when(mockKubernetesReconcilerWatch).workQueueKeyFunc();
            doReturn(mockDefaultControllerBuilder).when(mockDefaultControllerBuilder).withWorkQueue(any());
            BeanCreationException exception = assertThrows(BeanCreationException.class, () -> {
                kubernetesControllerFactory.getObject();
            });
            assertThat(exception.getMessage(), is("Failed instantiating controller watch: Test Exception"));
        }
    }

    private static class TestWorkQueueKeyFunc implements Function<KubernetesObject, Request> {

        @Override
        public Request apply(KubernetesObject kubernetesObject) {
            return new Request("test", "test");
        }
    }

    private static class ExceptionThrowingWorkQueueKeyFunc implements Function<KubernetesObject, Request> {

        public ExceptionThrowingWorkQueueKeyFunc(RateLimitingQueue<Request> queue) throws Exception {
            throw new Exception("Test Exception");
        }

        @Override
        public Request apply(KubernetesObject kubernetesObject) {
            return null;
        }
    }
}
