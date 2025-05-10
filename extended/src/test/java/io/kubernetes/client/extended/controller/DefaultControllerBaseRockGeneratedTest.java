package io.kubernetes.client.extended.controller;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.prometheus.client.CollectorRegistry;
import io.kubernetes.client.extended.wait.Wait;
import java.util.function.Supplier;
import org.mockito.Mock;
import io.kubernetes.client.extended.controller.reconciler.Result;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.extended.controller.reconciler.Reconciler;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.concurrent.ScheduledExecutorService;
import io.kubernetes.client.extended.controller.reconciler.Request;
import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import io.kubernetes.client.extended.workqueue.RateLimitingQueue;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class DefaultControllerBaseRockGeneratedTest {

    @Mock
    private Reconciler reconciler;

    @Mock
    private RateLimitingQueue<Request> workQueue;

    @Mock
    private ScheduledExecutorService workerThreadPool;

    @Mock
    private Supplier<Boolean> readyFunc;

    private DefaultController controller;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        controller = new DefaultController("testController", reconciler, workQueue, readyFunc);
        controller.setWorkerCount(1);
        controller.setWorkerThreadPool(workerThreadPool);
    }

    //BaseRock generated method id: ${testConstructor}, hash: F82968C7C90E82D939252E2B9B294A6D
    @Test
    void testConstructor() {
        assertThat(controller, is(notNullValue()));
        assertEquals("testController", controller.getName());
        assertEquals(reconciler, controller.getReconciler());
        assertEquals(workQueue, controller.getWorkQueue());
    }

    //BaseRock generated method id: ${testRun}, hash: 8DA657977FCAD3D56978D553552532B5
    @Disabled()
    @Test
    void testRun() throws InterruptedException {
        try (var waitMock = mockStatic(Wait.class)) {
            waitMock.when(() -> Wait.poll(any(Duration.class), any(Duration.class), any(Duration.class), any())).thenReturn(true);
            doReturn(false).when(workQueue).isShuttingDown();
            doReturn(new Request("test")).when(workQueue).get();
            doReturn(new Result(false)).when(reconciler).reconcile(any());
            doAnswer(invocation -> {
                Runnable runnable = invocation.getArgument(0);
                runnable.run();
                return null;
            }).when(workerThreadPool).scheduleWithFixedDelay(any(Runnable.class), anyLong(), anyLong(), any(TimeUnit.class));
            controller.run();
            verify(workQueue, times(1)).get();
            verify(reconciler, times(1)).reconcile(any());
            verify(workQueue, times(1)).done(any());
        }
    }

    //BaseRock generated method id: ${testShutdown}, hash: 8B2B80F810B03C7D3D47DCAC81320C7F
    @Test
    void testShutdown() {
        controller.shutdown();
        verify(workQueue).shutDown();
        verify(workerThreadPool).shutdown();
    }

    //BaseRock generated method id: ${testPreFlightCheckFail}, hash: A55C529AF9F24CCC9780150CB368ED30
    @Test
    void testPreFlightCheckFail() {
        controller.setWorkerCount(0);
        assertFalse(invokePreFlightCheck());
    }

    //BaseRock generated method id: ${testPreFlightCheckSuccess}, hash: F2C413D4A42926C932B9214B3BD4AA0E
    @Disabled()
    @Test
    void testPreFlightCheckSuccess() {
        try (var waitMock = mockStatic(Wait.class)) {
            waitMock.when(() -> Wait.poll(any(Duration.class), any(Duration.class), any(Duration.class), any())).thenReturn(true);
            assertTrue(invokePreFlightCheck());
        }
    }

    //BaseRock generated method id: ${testWorker}, hash: C38EB541125A8E9C052D4E513F7B3372
    @Test
    void testWorker() throws InterruptedException {
        doReturn(false, true).when(workQueue).isShuttingDown();
        Request request = new Request("test");
        doReturn(request).when(workQueue).get();
        doReturn(new Result(true)).when(reconciler).reconcile(request);
        invokeWorker();
        verify(workQueue).get();
        verify(reconciler).reconcile(request);
        verify(workQueue).addRateLimited(request);
        verify(workQueue).done(request);
    }

    //BaseRock generated method id: ${testWorkerWithRequeueAfter}, hash: C00B62C97076046DD6022BF18BD43ADB
    @Test
    void testWorkerWithRequeueAfter() throws InterruptedException {
        doReturn(false, true).when(workQueue).isShuttingDown();
        Request request = new Request("test");
        doReturn(request).when(workQueue).get();
        doReturn(new Result(true, Duration.ofSeconds(5))).when(reconciler).reconcile(request);
        invokeWorker();
        verify(workQueue).get();
        verify(reconciler).reconcile(request);
        verify(workQueue).addAfter(eq(request), eq(Duration.ofSeconds(5)));
        verify(workQueue).done(request);
    }

    //BaseRock generated method id: ${testWorkerWithException}, hash: DCC3ABC0B207E660CAF164D87249956B
    @Test
    void testWorkerWithException() throws InterruptedException {
        doReturn(false, true).when(workQueue).isShuttingDown();
        Request request = new Request("test");
        doReturn(request).when(workQueue).get();
        doThrow(new RuntimeException("Test exception")).when(reconciler).reconcile(request);
        invokeWorker();
        verify(workQueue).get();
        verify(reconciler).reconcile(request);
        verify(workQueue).addRateLimited(request);
        verify(workQueue).done(request);
    }

    //BaseRock generated method id: ${testSettersAndGetters}, hash: F885B902DAB5C598FF6CB590BA52EEE0
    @Test
    void testSettersAndGetters() {
        int workerCount = 5;
        Duration readyTimeout = Duration.ofMinutes(1);
        Duration readyCheckInternal = Duration.ofSeconds(30);
        controller.setWorkerCount(workerCount);
        controller.setReadyTimeout(readyTimeout);
        controller.setReadyCheckInternal(readyCheckInternal);
        assertEquals(workerCount, controller.getWorkerCount());
        assertEquals(readyTimeout, controller.getReadyTimeout());
        assertEquals(readyCheckInternal, controller.getReadyCheckInternal());
    }

    private boolean invokePreFlightCheck() {
        try {
            java.lang.reflect.Method method = DefaultController.class.getDeclaredMethod("preFlightCheck");
            method.setAccessible(true);
            return (boolean) method.invoke(controller);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void invokeWorker() {
        try {
            java.lang.reflect.Method method = DefaultController.class.getDeclaredMethod("worker");
            method.setAccessible(true);
            method.invoke(controller);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
