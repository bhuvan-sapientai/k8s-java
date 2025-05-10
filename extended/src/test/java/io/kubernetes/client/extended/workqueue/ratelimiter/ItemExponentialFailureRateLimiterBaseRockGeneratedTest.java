package io.kubernetes.client.extended.workqueue.ratelimiter;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.time.Duration;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class ItemExponentialFailureRateLimiterBaseRockGeneratedTest {

    private ItemExponentialFailureRateLimiter<String> rateLimiter;

    private static final Duration BASE_DELAY = Duration.ofMillis(10);

    private static final Duration MAX_DELAY = Duration.ofSeconds(1);

    @BeforeEach
    void setUp() {
        rateLimiter = new ItemExponentialFailureRateLimiter<>(BASE_DELAY, MAX_DELAY);
    }

    //BaseRock generated method id: ${testConstructor}, hash: 5C5AA6D52EF2322F290EA3E1F0BBBCCD
    @Test
    void testConstructor() {
        assertNotNull(rateLimiter);
    }

    //BaseRock generated method id: ${testWhenFirstFailure}, hash: 0E4DD09E25B62FCBCF929194D57E708E
    @Test
    void testWhenFirstFailure() {
        Duration delay = rateLimiter.when("item1");
        assertEquals(BASE_DELAY, delay);
    }

    //BaseRock generated method id: ${testWhenMultipleFailures}, hash: 43D62F9B6FC8A1DF057AD8E0AFAA6C7F
    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3, 4, 5 })
    void testWhenMultipleFailures(int failures) {
        String item = "item";
        Duration expectedDelay = BASE_DELAY;
        for (int i = 0; i < failures; i++) {
            Duration actualDelay = rateLimiter.when(item);
            assertEquals(expectedDelay.toMillis(), actualDelay.toMillis(), 1.0);
            expectedDelay = expectedDelay.multipliedBy(2);
        }
    }

    //BaseRock generated method id: ${testWhenMaxDelayReached}, hash: 874A65DD6CDE8BCBA812242EFF4E0B4A
    @Test
    void testWhenMaxDelayReached() {
        String item = "maxDelayItem";
        for (int i = 0; i < 10; i++) {
            rateLimiter.when(item);
        }
        Duration delay = rateLimiter.when(item);
        assertEquals(MAX_DELAY, delay);
    }

    //BaseRock generated method id: ${testForget}, hash: 49F33123F78A714C201605EA02681EAF
    @Test
    void testForget() {
        String item = "forgetItem";
        rateLimiter.when(item);
        rateLimiter.when(item);
        rateLimiter.forget(item);
        Duration delay = rateLimiter.when(item);
        assertEquals(BASE_DELAY, delay);
    }

    //BaseRock generated method id: ${testNumRequeues}, hash: E2E48239BD27DA045A84400E1D71605F
    @Test
    void testNumRequeues() {
        String item = "requeueItem";
        for (int i = 0; i < 5; i++) {
            rateLimiter.when(item);
        }
        int numRequeues = rateLimiter.numRequeues(item);
        assertEquals(5, numRequeues);
    }

    //BaseRock generated method id: ${testNumRequeuesForNonExistentItem}, hash: C9E2F1F7562FF156B71F230DDD46AC1D
    @Test
    void testNumRequeuesForNonExistentItem() {
        int numRequeues = rateLimiter.numRequeues("nonExistentItem");
        assertEquals(0, numRequeues);
    }

    //BaseRock generated method id: ${testWhenWithDifferentItems}, hash: 020AB80180C93DFF6ACC685CDF2B6180
    @Test
    void testWhenWithDifferentItems() {
        Duration delay1 = rateLimiter.when("item1");
        Duration delay2 = rateLimiter.when("item2");
        Duration delay3 = rateLimiter.when("item3");
        assertEquals(BASE_DELAY, delay1);
        assertEquals(BASE_DELAY, delay2);
        assertEquals(BASE_DELAY, delay3);
    }

    //BaseRock generated method id: ${testForgetNonExistentItem}, hash: 3DC7EF275985AA4AC31C2EC538725EEC
    @Test
    void testForgetNonExistentItem() {
        rateLimiter.forget("nonExistentItem");
        Duration delay = rateLimiter.when("nonExistentItem");
        assertEquals(BASE_DELAY, delay);
    }
}
