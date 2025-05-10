package io.kubernetes.client.extended.workqueue.ratelimiter;

import org.junit.jupiter.api.Timeout;
import java.util.Arrays;
import static org.mockito.Mockito.doReturn;
import org.mockito.MockitoAnnotations;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class MaxOfRateLimiterBaseRockGeneratedTest {

    @Mock
    private RateLimiter<String> rateLimiter1;

    @Mock
    private RateLimiter<String> rateLimiter2;

    private MaxOfRateLimiter<String> maxOfRateLimiter;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        maxOfRateLimiter = new MaxOfRateLimiter<>(rateLimiter1, rateLimiter2);
    }

    //BaseRock generated method id: ${testWhenWithMaxDuration}, hash: 6D92D2F22CC98E886C46E9C71D3B3743
    @Test
    void testWhenWithMaxDuration() {
        String item = "testItem";
        Duration duration1 = Duration.ofSeconds(5);
        Duration duration2 = Duration.ofSeconds(10);
        doReturn(duration1).when(rateLimiter1).when(item);
        doReturn(duration2).when(rateLimiter2).when(item);
        Duration result = maxOfRateLimiter.when(item);
        assertEquals(duration2, result);
    }

    //BaseRock generated method id: ${testWhenWithEqualDurations}, hash: BA1A5D41B3484D0F649DF21295EC6B4F
    @Test
    void testWhenWithEqualDurations() {
        String item = "testItem";
        Duration duration = Duration.ofSeconds(5);
        doReturn(duration).when(rateLimiter1).when(item);
        doReturn(duration).when(rateLimiter2).when(item);
        Duration result = maxOfRateLimiter.when(item);
        assertEquals(duration, result);
    }

    //BaseRock generated method id: ${testWhenWithZeroDuration}, hash: 46C000588F5194ABBEF29FC412CA1605
    @Test
    void testWhenWithZeroDuration() {
        String item = "testItem";
        Duration zeroDuration = Duration.ZERO;
        Duration positiveDuration = Duration.ofSeconds(5);
        doReturn(zeroDuration).when(rateLimiter1).when(item);
        doReturn(positiveDuration).when(rateLimiter2).when(item);
        Duration result = maxOfRateLimiter.when(item);
        assertEquals(positiveDuration, result);
    }

    //BaseRock generated method id: ${testForget}, hash: F10DDF9627C6C2A8B474A5BD7071DD70
    @Test
    void testForget() {
        String item = "testItem";
        maxOfRateLimiter.forget(item);
        verify(rateLimiter1).forget(item);
        verify(rateLimiter2).forget(item);
    }

    //BaseRock generated method id: ${testNumRequeuesWithMaxValue}, hash: 841C7DDF1B44ACB3BAAB1AFBE80BB1B8
    @Test
    void testNumRequeuesWithMaxValue() {
        String item = "testItem";
        int count1 = 3;
        int count2 = 5;
        doReturn(count1).when(rateLimiter1).numRequeues(item);
        doReturn(count2).when(rateLimiter2).numRequeues(item);
        int result = maxOfRateLimiter.numRequeues(item);
        assertEquals(count2, result);
    }

    //BaseRock generated method id: ${testNumRequeuesWithEqualValues}, hash: 67B1C2D4CF338D66CA0DAF44253FA236
    @Test
    void testNumRequeuesWithEqualValues() {
        String item = "testItem";
        int count = 3;
        doReturn(count).when(rateLimiter1).numRequeues(item);
        doReturn(count).when(rateLimiter2).numRequeues(item);
        int result = maxOfRateLimiter.numRequeues(item);
        assertEquals(count, result);
    }

    //BaseRock generated method id: ${testNumRequeuesWithZeroValue}, hash: 6F96893D2BD8E2B8223E0C725E51A9CD
    @Test
    void testNumRequeuesWithZeroValue() {
        String item = "testItem";
        int zeroCount = 0;
        int positiveCount = 3;
        doReturn(zeroCount).when(rateLimiter1).numRequeues(item);
        doReturn(positiveCount).when(rateLimiter2).numRequeues(item);
        int result = maxOfRateLimiter.numRequeues(item);
        assertEquals(positiveCount, result);
    }

    //BaseRock generated method id: ${testConstructorWithList}, hash: E22C68DA4CD2AA829ED33FB2FD1EC35B
    @Test
    void testConstructorWithList() {
        List<RateLimiter<String>> rateLimiters = Arrays.asList(rateLimiter1, rateLimiter2);
        MaxOfRateLimiter<String> maxOfRateLimiter = new MaxOfRateLimiter<>(rateLimiters);
        String item = "testItem";
        Duration duration1 = Duration.ofSeconds(5);
        Duration duration2 = Duration.ofSeconds(10);
        doReturn(duration1).when(rateLimiter1).when(item);
        doReturn(duration2).when(rateLimiter2).when(item);
        Duration result = maxOfRateLimiter.when(item);
        assertEquals(duration2, result);
    }
}
