package io.kubernetes.client.extended.leaderelection;

import java.net.HttpURLConnection;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.function.Consumer;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import io.kubernetes.client.openapi.models.V1OwnerReference;
import io.kubernetes.client.util.Threads;
import java.util.concurrent.*;
import java.time.Duration;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class LeaderElectorBaseRockGeneratedTest {

    @Mock
    private LeaderElectionConfig mockConfig;

    @Mock
    private Lock mockLock;

    @Mock
    private Consumer<Throwable> mockExceptionHandler;

    @Mock
    private Runnable mockStartLeadingHook;

    @Mock
    private Runnable mockStopLeadingHook;

    @Mock
    private Consumer<String> mockOnNewLeaderHook;

    private LeaderElector leaderElector;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        when(mockConfig.getLock()).thenReturn(mockLock);
        when(mockConfig.getLeaseDuration()).thenReturn(Duration.ofSeconds(15));
        when(mockConfig.getRenewDeadline()).thenReturn(Duration.ofSeconds(10));
        when(mockConfig.getRetryPeriod()).thenReturn(Duration.ofSeconds(2));
        leaderElector = new LeaderElector(mockConfig, mockExceptionHandler);
    }

    //BaseRock generated method id: ${testConstructorWithNullConfig}, hash: EDEDC07E88234606EF29D9A9A108102C
    @Test
    void testConstructorWithNullConfig() {
        assertThrows(IllegalArgumentException.class, () -> new LeaderElector(null));
    }

    //BaseRock generated method id: ${testConstructorWithInvalidConfig}, hash: 19F1527CAC10E4145E9F4830EF9CA8D8
    @Test
    void testConstructorWithInvalidConfig() {
        LeaderElectionConfig invalidConfig = mock(LeaderElectionConfig.class);
        when(invalidConfig.getLock()).thenReturn(null);
        when(invalidConfig.getLeaseDuration()).thenReturn(null);
        when(invalidConfig.getRenewDeadline()).thenReturn(null);
        when(invalidConfig.getRetryPeriod()).thenReturn(null);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new LeaderElector(invalidConfig));
        assertTrue(exception.getMessage().contains("Lock must be provided"));
        assertTrue(exception.getMessage().contains("LeaseDuration must be provided"));
        assertTrue(exception.getMessage().contains("RetryPeriod must be provided"));
        assertTrue(exception.getMessage().contains("RenewDeadline must be provided"));
    }

    //BaseRock generated method id: ${testRunAcquireLeadership}, hash: CDB088A47E899B9EA5726117AF0026F3
    @Test
    void testRunAcquireLeadership() throws Exception {
        when(mockLock.get()).thenThrow(new ApiException(HttpURLConnection.HTTP_NOT_FOUND, "Not found"));
        when(mockLock.create(any())).thenReturn(true);
        when(mockLock.update(any())).thenReturn(true);
        when(mockLock.identity()).thenReturn("test-identity");
        CountDownLatch latch = new CountDownLatch(1);
        doAnswer(invocation -> {
            latch.countDown();
            return null;
        }).when(mockStartLeadingHook).run();
        try (MockedStatic<Threads> mockedThreads = mockStatic(Threads.class)) {
            mockedThreads.when(() -> Threads.threadFactory(anyString())).thenReturn((ThreadFactory) r -> new Thread(r));
            ExecutorService mockExecutor = mock(ExecutorService.class);
            ScheduledExecutorService mockScheduledExecutor = mock(ScheduledExecutorService.class);
            doAnswer(invocation -> {
                Runnable runnable = invocation.getArgument(0);
                runnable.run();
                return mock(ScheduledFuture.class);
            }).when(mockScheduledExecutor).scheduleWithFixedDelay(any(Runnable.class), anyLong(), anyLong(), any());
            CompletableFuture.runAsync(() -> leaderElector.run(mockStartLeadingHook, mockStopLeadingHook, mockOnNewLeaderHook));
            assertTrue(latch.await(5, TimeUnit.SECONDS));
            verify(mockStartLeadingHook, timeout(5000)).run();
        }
    }

    //BaseRock generated method id: ${testRunFailToAcquireLeadership}, hash: 5C4A42818B92EA89832A70E97C6FA598
    @Disabled()
    @Test
    void testRunFailToAcquireLeadership() throws Exception {
        when(mockLock.get()).thenThrow(new ApiException(HttpURLConnection.HTTP_NOT_FOUND, "Not found"));
        when(mockLock.create(any())).thenReturn(false);
        try (MockedStatic<Threads> mockedThreads = mockStatic(Threads.class)) {
            mockedThreads.when(() -> Threads.threadFactory(anyString())).thenReturn((ThreadFactory) r -> new Thread(r));
            leaderElector.run(mockStartLeadingHook, mockStopLeadingHook, mockOnNewLeaderHook);
            verify(mockStartLeadingHook, never()).run();
            verify(mockStopLeadingHook, never()).run();
        }
    }

    //BaseRock generated method id: ${testRunRenewLeadership}, hash: 4660997D8354E59511EA87ED8FDD2320
    @Disabled()
    @Test
    void testRunRenewLeadership() throws Exception {
        LeaderElectionRecord record = new LeaderElectionRecord("test-identity", 15, new Date(), new Date(), 0);
        when(mockLock.get()).thenReturn(record);
        when(mockLock.update(any())).thenReturn(true);
        when(mockLock.identity()).thenReturn("test-identity");
        try (MockedStatic<Threads> mockedThreads = mockStatic(Threads.class)) {
            mockedThreads.when(() -> Threads.threadFactory(anyString())).thenReturn((ThreadFactory) r -> new Thread(r));
            ExecutorService mockExecutor = mock(ExecutorService.class);
            ScheduledExecutorService mockScheduledExecutor = mock(ScheduledExecutorService.class);
            when(mockExecutor.submit(any(Callable.class))).thenReturn(mock(Future.class));
            when(mockScheduledExecutor.scheduleWithFixedDelay(any(Runnable.class), anyLong(), anyLong(), any())).thenReturn(mock(ScheduledFuture.class));
            leaderElector.run(mockStartLeadingHook, mockStopLeadingHook, mockOnNewLeaderHook);
            verify(mockStartLeadingHook, timeout(5000)).run();
            verify(mockStopLeadingHook, timeout(5000)).run();
        }
    }

    //BaseRock generated method id: ${testRunFailToRenewLeadership}, hash: 524F9E5AC5EB7464B740DE2769C6CE94
    @Disabled()
    @Test
    void testRunFailToRenewLeadership() throws Exception {
        LeaderElectionRecord record = new LeaderElectionRecord("test-identity", 15, new Date(), new Date(), 0);
        when(mockLock.get()).thenReturn(record);
        when(mockLock.update(any())).thenReturn(false);
        when(mockLock.identity()).thenReturn("test-identity");
        try (MockedStatic<Threads> mockedThreads = mockStatic(Threads.class)) {
            mockedThreads.when(() -> Threads.threadFactory(anyString())).thenReturn((ThreadFactory) r -> new Thread(r));
            ExecutorService mockExecutor = mock(ExecutorService.class);
            ScheduledExecutorService mockScheduledExecutor = mock(ScheduledExecutorService.class);
            when(mockExecutor.submit(any(Callable.class))).thenReturn(CompletableFuture.completedFuture(false));
            when(mockScheduledExecutor.scheduleWithFixedDelay(any(Runnable.class), anyLong(), anyLong(), any())).thenAnswer(invocation -> {
                Runnable runnable = invocation.getArgument(0);
                runnable.run();
                return mock(ScheduledFuture.class);
            });
            leaderElector.run(mockStartLeadingHook, mockStopLeadingHook, mockOnNewLeaderHook);
            verify(mockStartLeadingHook, timeout(5000)).run();
            verify(mockStopLeadingHook, timeout(5000)).run();
        }
    }

    //BaseRock generated method id: ${testClose}, hash: A58E01FC57D1D12F3E02D46CF5A1CA8D
    @Test
    void testClose() throws Exception {
        LeaderElectionRecord record = new LeaderElectionRecord("test-identity", 15, new Date(), new Date(), 0);
        when(mockLock.get()).thenReturn(record);
        when(mockLock.update(any())).thenReturn(true);
        when(mockLock.identity()).thenReturn("test-identity");
        CountDownLatch latch = new CountDownLatch(2);
        doAnswer(invocation -> {
            latch.countDown();
            return true;
        }).when(mockLock).update(any());
        try (MockedStatic<Threads> mockedThreads = mockStatic(Threads.class)) {
            mockedThreads.when(() -> Threads.threadFactory(anyString())).thenReturn((ThreadFactory) r -> new Thread(r));
            CompletableFuture.runAsync(() -> leaderElector.run(mockStartLeadingHook, mockStopLeadingHook, mockOnNewLeaderHook));
            Thread.sleep(1000);
            leaderElector.close();
            assertTrue(latch.await(5, TimeUnit.SECONDS));
            verify(mockLock, timeout(5000).times(2)).update(any());
        }
    }
}
