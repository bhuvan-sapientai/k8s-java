package io.kubernetes.client.extended.workqueue;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import java.util.function.Supplier;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import java.util.concurrent.ExecutorService;
import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class DefaultDelayingQueueBaseRockGeneratedTest {

    @Mock
    private ExecutorService mockExecutorService;

    @Mock
    private Supplier<Long> mockTimeSource;

    private DefaultDelayingQueue<String> defaultDelayingQueue;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        defaultDelayingQueue = new DefaultDelayingQueue<>(mockExecutorService);
        defaultDelayingQueue.injectTimeSource(mockTimeSource);
    }

    //BaseRock generated method id: ${testConstructorWithExecutorService}, hash: 867623487719FDE8561FD64970E2A04D
    @Test
    void testConstructorWithExecutorService() {
        verify(mockExecutorService).submit(any(Runnable.class));
    }

    //BaseRock generated method id: ${testDefaultConstructor}, hash: A0A30829C7B7AE1F52AB765DA86DD22D
    @Test
    void testDefaultConstructor() {
        DefaultDelayingQueue<String> queue = new DefaultDelayingQueue<>();
        assertNotNull(queue);
    }

    //BaseRock generated method id: ${testAddAfterWithZeroDuration}, hash: 6E4902C88807D2B4CDCB1651FBA8EB7A
    @Test
    void testAddAfterWithZeroDuration() {
        String item = "test";
        defaultDelayingQueue.addAfter(item, Duration.ZERO);
        assertEquals(1, defaultDelayingQueue.length());
    }

    //BaseRock generated method id: ${testAddAfterWithNonZeroDuration}, hash: 00DA6E480F15FBE504705A5A7A24A1D9
    @Test
    void testAddAfterWithNonZeroDuration() {
        String item = "test";
        Duration duration = Duration.ofSeconds(1);
        when(mockTimeSource.get()).thenReturn(0L);
        defaultDelayingQueue.addAfter(item, duration);
        assertEquals(0, defaultDelayingQueue.length());
    }

    //BaseRock generated method id: ${testAddAfterWhenShuttingDown}, hash: 9C8BEFDCBBE82C1F19722671446BDE87
    @Test
    void testAddAfterWhenShuttingDown() {
        defaultDelayingQueue.shutDown();
        String item = "test";
        Duration duration = Duration.ofSeconds(1);
        defaultDelayingQueue.addAfter(item, duration);
        assertEquals(0, defaultDelayingQueue.length());
    }

    //BaseRock generated method id: ${testHeartBeatInterval}, hash: 22F06A3890930F966FE60F938A3F8D9B
    @Test
    void testHeartBeatInterval() {
        assertEquals(Duration.ofSeconds(10), DefaultDelayingQueue.heartBeatInterval);
    }

    //BaseRock generated method id: ${testAddAfterWithMultipleItems}, hash: A3EFBEFC3A84F9D0C10AA4FE2F837505
    @Test
    void testAddAfterWithMultipleItems() {
        when(mockTimeSource.get()).thenReturn(0L);
        defaultDelayingQueue.addAfter("item1", Duration.ofSeconds(1));
        defaultDelayingQueue.addAfter("item2", Duration.ofSeconds(2));
        defaultDelayingQueue.addAfter("item3", Duration.ZERO);
        assertEquals(1, defaultDelayingQueue.length());
    }

    //BaseRock generated method id: ${testShutDown}, hash: 7A2FF72214C2CE981916999EE824B05E
    @Test
    void testShutDown() {
        assertFalse(defaultDelayingQueue.isShuttingDown());
        defaultDelayingQueue.shutDown();
        assertTrue(defaultDelayingQueue.isShuttingDown());
    }

    //BaseRock generated method id: ${testAddAfterWithNegativeDuration}, hash: A213A85CB73474ACAB1ADE894A365D95
    @Test
    void testAddAfterWithNegativeDuration() {
        String item = "test";
        Duration duration = Duration.ofSeconds(-1);
        when(mockTimeSource.get()).thenReturn(0L);
        defaultDelayingQueue.addAfter(item, duration);
        assertEquals(0, defaultDelayingQueue.length());
    }
}
