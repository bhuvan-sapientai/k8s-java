package io.kubernetes.client.extended.workqueue;

import static org.mockito.Mockito.doReturn;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import io.kubernetes.client.extended.workqueue.ratelimiter.DefaultControllerRateLimiter;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import java.util.concurrent.ExecutorService;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.extended.workqueue.DefaultDelayingQueue;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.extended.workqueue.ratelimiter.RateLimiter;
import java.time.Duration;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class DefaultRateLimitingQueueBaseRockGeneratedTest {

    @Mock
    private ExecutorService mockExecutorService;

    @Mock
    private RateLimiter<String> mockRateLimiter;

    private DefaultRateLimitingQueue<String> defaultRateLimitingQueue;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        defaultRateLimitingQueue = new DefaultRateLimitingQueue<>(mockExecutorService, mockRateLimiter);
    }

    //BaseRock generated method id: ${testDefaultConstructor}, hash: CDAAA5BECD51270CF1C62C5C0DF95C52
    @Test
    void testDefaultConstructor() {
        DefaultRateLimitingQueue<String> queue = new DefaultRateLimitingQueue<>();
        assertThat(queue, is(notNullValue()));
    }

    //BaseRock generated method id: ${testConstructorWithExecutorService}, hash: 69D00E8FAA971866F59AFD58FAEA562E
    @Test
    void testConstructorWithExecutorService() {
        DefaultRateLimitingQueue<String> queue = new DefaultRateLimitingQueue<>(mockExecutorService);
        assertThat(queue, is(notNullValue()));
    }

    //BaseRock generated method id: ${testConstructorWithExecutorServiceAndRateLimiter}, hash: 87068358CFAD062F36B3DAFD54A46680
    @Test
    void testConstructorWithExecutorServiceAndRateLimiter() {
        assertThat(defaultRateLimitingQueue, is(notNullValue()));
    }

    //BaseRock generated method id: ${testNumRequeues}, hash: 4961377C10360514EDF6FD60394A1EA6
    @Test
    void testNumRequeues() {
        String item = "testItem";
        when(mockRateLimiter.numRequeues(item)).thenReturn(5);
        int result = defaultRateLimitingQueue.numRequeues(item);
        assertEquals(5, result);
        verify(mockRateLimiter, times(1)).numRequeues(item);
    }

    //BaseRock generated method id: ${testForget}, hash: 3DA181594631607999E426ED5468524F
    @Test
    void testForget() {
        String item = "testItem";
        defaultRateLimitingQueue.forget(item);
        verify(mockRateLimiter, times(1)).forget(item);
    }

    //BaseRock generated method id: ${testAddRateLimited}, hash: D40C031196E8FC01CCB1B99E7EEC12C6
    @Test
    void testAddRateLimited() {
        String item = "testItem";
        Duration whenDuration = Duration.ofSeconds(10);
        when(mockRateLimiter.when(item)).thenReturn(whenDuration);
        defaultRateLimitingQueue.addRateLimited(item);
        verify(mockRateLimiter, times(1)).when(item);
    }

    //BaseRock generated method id: ${testAddRateLimitedWithNullItem}, hash: 13F37987FE637EA1D653B65B88552202
    @Test
    void testAddRateLimitedWithNullItem() {
        defaultRateLimitingQueue.addRateLimited(null);
        verify(mockRateLimiter, times(1)).when(null);
    }

    //BaseRock generated method id: ${testAddRateLimitedWithNegativeDuration}, hash: E446D3737A2C7029409B87EEA09E9447
    @Test
    void testAddRateLimitedWithNegativeDuration() {
        String item = "testItem";
        when(mockRateLimiter.when(item)).thenReturn(Duration.ofSeconds(-10));
        defaultRateLimitingQueue.addRateLimited(item);
        verify(mockRateLimiter, times(1)).when(item);
    }

    //BaseRock generated method id: ${testAddRateLimitedWithZeroDuration}, hash: 526B2744388E805E589B680FFFED9B30
    @Test
    void testAddRateLimitedWithZeroDuration() {
        String item = "testItem";
        when(mockRateLimiter.when(item)).thenReturn(Duration.ZERO);
        defaultRateLimitingQueue.addRateLimited(item);
        verify(mockRateLimiter, times(1)).when(item);
    }

    //BaseRock generated method id: ${testInheritanceFromDefaultDelayingQueue}, hash: DAAFD3B6239E9CE3B1F952D6027BCFF6
    @Test
    void testInheritanceFromDefaultDelayingQueue() {
        assertThat(defaultRateLimitingQueue instanceof DefaultDelayingQueue, is(true));
    }

    //BaseRock generated method id: ${testRateLimiterInitialization}, hash: A72BE6C6A3A2AFDF4A9F8A1A98EA4324
    @Test
    void testRateLimiterInitialization() {
        DefaultRateLimitingQueue<String> queue = new DefaultRateLimitingQueue<>();
        assertThat(queue, is(notNullValue()));
        RateLimiter<String> rateLimiter = mock(RateLimiter.class);
        doReturn(Duration.ofSeconds(1)).when(rateLimiter).when(any());
        queue.addRateLimited("test");
        verify(rateLimiter, times(0)).when(any());
    }
}
