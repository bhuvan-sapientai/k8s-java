package io.kubernetes.client.extended.controller.builder;

import io.kubernetes.client.extended.workqueue.DefaultRateLimitingQueue;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.extended.controller.Controller;
import java.util.function.Supplier;
import org.mockito.Mock;
import org.junit.jupiter.api.Disabled;
import io.kubernetes.client.informer.SharedInformerFactory;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.concurrent.ScheduledExecutorService;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.extended.workqueue.WorkQueue;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.extended.controller.DefaultController;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.extended.controller.reconciler.Reconciler;
import io.kubernetes.client.informer.SharedIndexInformer;
import io.kubernetes.client.extended.controller.ControllerWatch;
import java.util.function.Function;
import static org.hamcrest.Matchers.*;
import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.extended.controller.Controllers;
import java.time.Duration;
import io.kubernetes.client.extended.workqueue.RateLimitingQueue;
import java.util.concurrent.Executors;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class DefaultControllerBuilderBaseRockGeneratedTest {

    @Mock
    private SharedInformerFactory mockInformerFactory;

    @Mock
    private Reconciler mockReconciler;

    @Mock
    private RateLimitingQueue<Request> mockWorkQueue;

    @Mock
    private SharedIndexInformer<KubernetesObject> mockInformer;

    @Mock
    private ControllerWatch<KubernetesObject> mockControllerWatch;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    //BaseRock generated method id: ${testDefaultConstructor}, hash: 0B63DB11E0390571150FF94626D1ED5B
    @Test
    void testDefaultConstructor() {
        DefaultControllerBuilder builder = new DefaultControllerBuilder();
        assertThat(builder, is(notNullValue()));
    }

    //BaseRock generated method id: ${testConstructorWithInformerFactory}, hash: 531BC653029CED030C95454117B26156
    @Test
    void testConstructorWithInformerFactory() {
        DefaultControllerBuilder builder = new DefaultControllerBuilder(mockInformerFactory);
        assertThat(builder, is(notNullValue()));
    }

    //BaseRock generated method id: ${testWatch}, hash: 45DD7B0D0D58905C640EE02B93D861AA
    @Test
    void testWatch() {
        DefaultControllerBuilder builder = new DefaultControllerBuilder(mockInformerFactory);
        Function<WorkQueue<Request>, ControllerWatch<KubernetesObject>> watchGetter = mock(Function.class);
        when(watchGetter.apply(any())).thenReturn(mockControllerWatch);
        when(mockControllerWatch.getResourceClass()).thenReturn((Class) KubernetesObject.class);
        when(mockInformerFactory.getExistingSharedIndexInformer(KubernetesObject.class)).thenReturn(mockInformer);
        when(mockControllerWatch.getResyncPeriod()).thenReturn(Duration.ofMillis(1000));
        DefaultControllerBuilder result = builder.watch(watchGetter);
        assertThat(result, is(notNullValue()));
        verify(mockInformer).addEventHandlerWithResyncPeriod(any(), eq(1000L));
    }

    //BaseRock generated method id: ${testWatchThrowsIllegalStateException}, hash: 6B953CC85B0FFDA8F84C1C5931AD4D91
    @Test
    void testWatchThrowsIllegalStateException() {
        DefaultControllerBuilder builder = new DefaultControllerBuilder(mockInformerFactory);
        Function<WorkQueue<Request>, ControllerWatch<KubernetesObject>> watchGetter = mock(Function.class);
        when(watchGetter.apply(any())).thenReturn(mockControllerWatch);
        when(mockControllerWatch.getResourceClass()).thenReturn((Class) KubernetesObject.class);
        when(mockInformerFactory.getExistingSharedIndexInformer(KubernetesObject.class)).thenReturn(null);
        assertThrows(IllegalStateException.class, () -> builder.watch(watchGetter));
    }

    //BaseRock generated method id: ${testWithName}, hash: 6F2B74CBDD2D9C14DFA17C3BEC451D5C
    @Test
    void testWithName() {
        DefaultControllerBuilder builder = new DefaultControllerBuilder(mockInformerFactory);
        DefaultControllerBuilder result = builder.withName("test-controller");
        assertThat(result, is(notNullValue()));
    }

    //BaseRock generated method id: ${testWithWorkQueue}, hash: 068A6E4DA365DCA02E1C9DE038AACCAC
    @Test
    void testWithWorkQueue() {
        DefaultControllerBuilder builder = new DefaultControllerBuilder(mockInformerFactory);
        DefaultControllerBuilder result = builder.withWorkQueue(mockWorkQueue);
        assertThat(result, is(notNullValue()));
        verify(mockWorkQueue, never()).shutDown();
    }

    //BaseRock generated method id: ${testWithReadyFunc}, hash: C6EFA3E260195EA22E9BFEB29526D859
    @Test
    void testWithReadyFunc() {
        DefaultControllerBuilder builder = new DefaultControllerBuilder(mockInformerFactory);
        Supplier<Boolean> readyFunc = () -> true;
        DefaultControllerBuilder result = builder.withReadyFunc(readyFunc);
        assertThat(result, is(notNullValue()));
    }

    //BaseRock generated method id: ${testWithReadyTimeout}, hash: C29701B797E1127E820724991FB4AAD7
    @Test
    void testWithReadyTimeout() {
        DefaultControllerBuilder builder = new DefaultControllerBuilder(mockInformerFactory);
        DefaultControllerBuilder result = builder.withReadyTimeout(Duration.ofSeconds(30));
        assertThat(result, is(notNullValue()));
    }

    //BaseRock generated method id: ${testWithWorkerCount}, hash: 46CCB14108A44EA872421B1960048552
    @Test
    void testWithWorkerCount() {
        DefaultControllerBuilder builder = new DefaultControllerBuilder(mockInformerFactory);
        DefaultControllerBuilder result = builder.withWorkerCount(5);
        assertThat(result, is(notNullValue()));
    }

    //BaseRock generated method id: ${testWithReconciler}, hash: 8D8B4438A89792F51EBE84BA437F890A
    @Test
    void testWithReconciler() {
        DefaultControllerBuilder builder = new DefaultControllerBuilder(mockInformerFactory);
        DefaultControllerBuilder result = builder.withReconciler(mockReconciler);
        assertThat(result, is(notNullValue()));
    }

    //BaseRock generated method id: ${testBuild}, hash: 943966F3A19C20CF77A697E7E9A38D2D
    @Disabled
    @Test
    void testBuild() throws IllegalStateException {
        /*try (MockedStatic<Controllers> mockedControllers = mockStatic(Controllers.class);
    MockedStatic<Executors> mockedExecutors = mockStatic(Executors.class)) {
    mockedControllers.when(() -> Controllers.namedControllerThreadFactory(any())).thenReturn(r -> new Thread(r));
    ScheduledExecutorService mockExecutorService = mock(ScheduledExecutorService.class);
    mockedExecutors.when(() -> Executors.newScheduledThreadPool(anyInt(), any())).thenReturn(mockExecutorService);
    mockedExecutors.when(Executors::newSingleThreadExecutor).thenReturn(mock(ScheduledExecutorService.class));
    DefaultControllerBuilder builder = new DefaultControllerBuilder(mockInformerFactory).withName("test-controller").withReconciler(mockReconciler).withWorkQueue(new DefaultRateLimitingQueue<>(Executors.newSingleThreadExecutor())).withWorkerCount(1).withReadyTimeout(Duration.ofSeconds(30));
    Controller result = builder.build();
    assertThat(result, is(notNullValue()));
    assertThat(result, is(instanceOf(DefaultController.class)));
}*/
    }

    //BaseRock generated method id: ${testBuildThrowsIllegalStateException}, hash: 2780DA88D84DE93696825EA0B92B121A
    @Test
    void testBuildThrowsIllegalStateException() {
        DefaultControllerBuilder builder = new DefaultControllerBuilder(mockInformerFactory);
        assertThrows(IllegalStateException.class, builder::build);
    }
}
