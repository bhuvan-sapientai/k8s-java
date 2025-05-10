package io.kubernetes.client.extended.workqueue.ratelimiter;

import io.github.bucket4j.Refill;
import io.github.bucket4j.Bucket;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import io.github.bucket4j.local.LocalBucket;
import io.github.bucket4j.Bandwidth;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;
import io.github.bucket4j.local.SynchronizationStrategy;
import org.junit.jupiter.api.Timeout;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;
import java.time.Duration;
import io.github.bucket4j.local.LocalBucketBuilder;
import org.mockito.MockedStatic;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class BucketRateLimiterBaseRockGeneratedTest {

    private BucketRateLimiter<String> bucketRateLimiter;

    private LocalBucket mockBucket;

    @BeforeEach
    void setUp() {
        mockBucket = mock(LocalBucket.class);
        try (MockedStatic<Bucket> mockedBucket = mockStatic(Bucket.class);
            MockedStatic<Bandwidth> mockedBandwidth = mockStatic(Bandwidth.class);
            MockedStatic<Refill> mockedRefill = mockStatic(Refill.class)) {
            Bandwidth mockBandwidth = mock(Bandwidth.class);
            Refill mockRefill = mock(Refill.class);
            mockedRefill.when(() -> Refill.greedy(1, Duration.ofSeconds(1))).thenReturn(mockRefill);
            mockedBandwidth.when(() -> Bandwidth.classic(1, mockRefill)).thenReturn(mockBandwidth);
            LocalBucketBuilder mockBuilder = mock(LocalBucketBuilder.class);
            when(mockBuilder.addLimit(mockBandwidth)).thenReturn(mockBuilder);
            when(mockBuilder.withSynchronizationStrategy(SynchronizationStrategy.SYNCHRONIZED)).thenReturn(mockBuilder);
            when(mockBuilder.build()).thenReturn(mockBucket);
            mockedBucket.when(Bucket::builder).thenReturn(mockBuilder);
            bucketRateLimiter = new BucketRateLimiter<>(1, 1, Duration.ofSeconds(1));
        }
    }

    //BaseRock generated method id: ${testConstructor}, hash: EF7F008957CA949878EA8E55ECAFC61F
    @Test
    void testConstructor() {
        assertNotNull(bucketRateLimiter);
    }

    //BaseRock generated method id: ${testWhen}, hash: 8DFF54A40E384EC01C8EDA4B02E7B088
    @Test
    void testWhen() {
        String item = "test";
        when(mockBucket.consumeIgnoringRateLimits(1)).thenReturn(1000000000L);
        Duration result = bucketRateLimiter.when(item);
        assertThat(result.getSeconds(), is(1L));
    }

    //BaseRock generated method id: ${testForget}, hash: 8238F1604D76534F95ED55BD5F12A2D3
    @Test
    void testForget() {
        String item = "test";
        bucketRateLimiter.forget(item);
    }

    //BaseRock generated method id: ${testNumRequeues}, hash: F6ADBECB39CBEA81AA0B3CC790D86D39
    @Test
    void testNumRequeues() {
        String item = "test";
        int result = bucketRateLimiter.numRequeues(item);
        assertEquals(0, result);
    }

    //BaseRock generated method id: ${testWhenWithZeroOverdraft}, hash: 9D282965E3DD77A6AF905DB68D0425D8
    @Test
    void testWhenWithZeroOverdraft() {
        String item = "test";
        when(mockBucket.consumeIgnoringRateLimits(1)).thenReturn(0L);
        Duration result = bucketRateLimiter.when(item);
        assertThat(result.toNanos(), is(0L));
    }

    //BaseRock generated method id: ${testWhenWithLargeOverdraft}, hash: F1D1F1FDDFD2F7606648EA567C5F3C40
    @Disabled()
    @Test
    void testWhenWithLargeOverdraft() {
        String item = "test";
        when(mockBucket.consumeIgnoringRateLimits(1)).thenReturn(Long.MAX_VALUE);
        Duration result = bucketRateLimiter.when(item);
        assertThat((double) result.getSeconds(), closeTo(292.0, 1.0));
    }
}
