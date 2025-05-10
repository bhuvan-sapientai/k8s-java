package io.kubernetes.client.extended.controller;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import io.kubernetes.client.informer.SharedInformerFactory;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.Answer;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.CountDownLatch;
import static org.mockito.Mockito.*;
import java.util.concurrent.Executors;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class ControllerManagerBaseRockGeneratedTest {

    @Mock
    private SharedInformerFactory mockInformerFactory;

    @Mock
    private Controller mockController1;

    @Mock
    private Controller mockController2;

    private ControllerManager controllerManager;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        controllerManager = new ControllerManager(mockInformerFactory, mockController1, mockController2);
    }

    //BaseRock generated method id: ${testShutdown}, hash: AFE4EBE1F5F86F046F78DB007C99FCE9
    @Test
    void testShutdown() {
        controllerManager.shutdown();
        verify(mockController1).shutdown();
        verify(mockController2).shutdown();
        verify(mockInformerFactory).stopAllRegisteredInformers();
    }

    //BaseRock generated method id: ${testRun}, hash: D9FCF7BA88AE613A9461B5AE1DD7A7BF
    @Test
    void testRun() throws InterruptedException {
        ExecutorService mockExecutorService = mock(ExecutorService.class);
        try (var executorServiceMock = mockStatic(Executors.class)) {
            executorServiceMock.when(() -> Executors.newFixedThreadPool(2)).thenReturn(mockExecutorService);
            doAnswer((Answer<Void>) invocation -> {
                Runnable runnable = invocation.getArgument(0);
                runnable.run();
                return null;
            }).when(mockExecutorService).submit(any(Runnable.class));
            controllerManager.run();
            verify(mockInformerFactory).startAllRegisteredInformers();
            verify(mockController1).run();
            verify(mockController2).run();
            verify(mockExecutorService, times(2)).submit(any(Runnable.class));
        }
    }

    //BaseRock generated method id: ${testRunWithNoControllers}, hash: 3456B96AFD2DA4DF93E596A055D5BBAD
    @Test
    void testRunWithNoControllers() {
        ControllerManager emptyManager = new ControllerManager(mockInformerFactory);
        assertThrows(RuntimeException.class, emptyManager::run);
    }

    //BaseRock generated method id: ${testRunWithExceptionInController}, hash: 728CF664921EC1E6C89AD1103D601E3C
    @Test
    void testRunWithExceptionInController() throws InterruptedException {
        ExecutorService mockExecutorService = mock(ExecutorService.class);
        try (var executorServiceMock = mockStatic(Executors.class)) {
            executorServiceMock.when(() -> Executors.newFixedThreadPool(2)).thenReturn(mockExecutorService);
            doThrow(new RuntimeException("Controller error")).when(mockController1).run();
            doAnswer((Answer<Void>) invocation -> {
                Runnable runnable = invocation.getArgument(0);
                runnable.run();
                return null;
            }).when(mockExecutorService).submit(any(Runnable.class));
            controllerManager.run();
            verify(mockInformerFactory).startAllRegisteredInformers();
            verify(mockController1).run();
            verify(mockController2).run();
            verify(mockExecutorService, times(2)).submit(any(Runnable.class));
        }
    }

    //BaseRock generated method id: ${testRunWithInterruptedException}, hash: C553354045BEBA42A3A1560865CD95F8
    @Disabled()
    @Test
    void testRunWithInterruptedException() throws InterruptedException {
        ExecutorService mockExecutorService = mock(ExecutorService.class);
        try (var executorServiceMock = mockStatic(Executors.class)) {
            executorServiceMock.when(() -> Executors.newFixedThreadPool(2)).thenReturn(mockExecutorService);
            CountDownLatch mockLatch = mock(CountDownLatch.class);
            doThrow(new InterruptedException("Test interruption")).when(mockLatch).await();
            doAnswer((Answer<Void>) invocation -> {
                Runnable runnable = invocation.getArgument(0);
                runnable.run();
                return null;
            }).when(mockExecutorService).submit(any(Runnable.class));
            try (var latchMock = mockStatic(CountDownLatch.class)) {
                latchMock.when(() -> new CountDownLatch(2)).thenReturn(mockLatch);
                controllerManager.run();
                verify(mockInformerFactory).startAllRegisteredInformers();
                verify(mockController1).run();
                verify(mockController2).run();
                verify(mockExecutorService, times(2)).submit(any(Runnable.class));
                verify(mockLatch).await();
            }
        }
    }
}
