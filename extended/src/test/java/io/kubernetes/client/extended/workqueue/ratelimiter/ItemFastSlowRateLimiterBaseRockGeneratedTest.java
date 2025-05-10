package io.kubernetes.client.extended.workqueue.ratelimiter;

import io.kubernetes.client.extended.workqueue.ratelimiter.ItemFastSlowRateLimiter;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class ItemFastSlowRateLimiterBaseRockGeneratedTest {

    private ItemFastSlowRateLimiter<String> rateLimiter;

    private static final Duration FAST_DELAY = Duration.ofSeconds(1);

    private static final Duration SLOW_DELAY = Duration.ofSeconds(5);

    private static final int MAX_FAST_ATTEMPTS = 3;

    @BeforeEach
    void setUp() {
        rateLimiter = new ItemFastSlowRateLimiter<>(FAST_DELAY, SLOW_DELAY, MAX_FAST_ATTEMPTS);
    }

    //BaseRock generated method id: ${testWhenWithinFastAttempts}, hash: 1C1FE1E1485A2CB065068DEBA0B16DAB
    @Test
    void testWhenWithinFastAttempts() {
        String item = "testItem";
        for (int i = 0; i < MAX_FAST_ATTEMPTS; i++) {
            Duration delay = rateLimiter.when(item);
            assertThat(delay, is(equalTo(FAST_DELAY)));
        }
    }

    //BaseRock generated method id: ${testWhenExceedsFastAttempts}, hash: 414074E334AE1B8AB98AD5F4181A3A79
    @Test
    void testWhenExceedsFastAttempts() {
        String item = "testItem";
        for (int i = 0; i < MAX_FAST_ATTEMPTS; i++) {
            rateLimiter.when(item);
        }
        Duration delay = rateLimiter.when(item);
        assertThat(delay, is(equalTo(SLOW_DELAY)));
    }

    //BaseRock generated method id: ${testForget}, hash: 6ECED04826A88F15AC52240FD9FFED84
    @Test
    void testForget() {
        String item = "testItem";
        rateLimiter.when(item);
        rateLimiter.forget(item);
        assertThat(rateLimiter.numRequeues(item), is(equalTo(0)));
    }

    //BaseRock generated method id: ${testNumRequeues}, hash: 59634E35DC4376C5D9BDC722E52A8E71
    @Test
    void testNumRequeues() {
        String item = "testItem";
        for (int i = 0; i < 5; i++) {
            rateLimiter.when(item);
        }
        assertThat(rateLimiter.numRequeues(item), is(equalTo(5)));
    }

    //BaseRock generated method id: ${testMultipleItems}, hash: E6E1D14D0EA8B0AFE8E1764D12C072A0
    @Test
    void testMultipleItems() {
        String item1 = "item1";
        String item2 = "item2";
        for (int i = 0; i < MAX_FAST_ATTEMPTS; i++) {
            assertThat(rateLimiter.when(item1), is(equalTo(FAST_DELAY)));
            assertThat(rateLimiter.when(item2), is(equalTo(FAST_DELAY)));
        }
        assertThat(rateLimiter.when(item1), is(equalTo(SLOW_DELAY)));
        assertThat(rateLimiter.when(item2), is(equalTo(SLOW_DELAY)));
        assertThat(rateLimiter.numRequeues(item1), is(equalTo(MAX_FAST_ATTEMPTS + 1)));
        assertThat(rateLimiter.numRequeues(item2), is(equalTo(MAX_FAST_ATTEMPTS + 1)));
    }

    //BaseRock generated method id: ${testForgetMultipleItems}, hash: 0C430362902A8D1D5A465BCE691F3730
    @Test
    void testForgetMultipleItems() {
        String item1 = "item1";
        String item2 = "item2";
        rateLimiter.when(item1);
        rateLimiter.when(item2);
        rateLimiter.forget(item1);
        assertThat(rateLimiter.numRequeues(item1), is(equalTo(0)));
        assertThat(rateLimiter.numRequeues(item2), is(equalTo(1)));
        rateLimiter.forget(item2);
        assertThat(rateLimiter.numRequeues(item2), is(equalTo(0)));
    }

    //BaseRock generated method id: ${testConstructor}, hash: 5C5AA6D52EF2322F290EA3E1F0BBBCCD
    @Test
    void testConstructor() {
        assertNotNull(rateLimiter);
    }

    //BaseRock generated method id: ${testWhenWithNullItem}, hash: 515B2116C3F6B9FC71E0AEE395F4D6A9
    @Test
    void testWhenWithNullItem() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            rateLimiter.when(null);
        });
    }

    //BaseRock generated method id: ${testForgetWithNullItem}, hash: 2CD70B4C1762597FCEEC5A0CE134BAF1
    @Test
    void testForgetWithNullItem() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            rateLimiter.forget(null);
        });
    }

    //BaseRock generated method id: ${testNumRequeuesWithNullItem}, hash: 3FBB8138F112A77926827A025C9E834F
    @Test
    void testNumRequeuesWithNullItem() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            rateLimiter.numRequeues(null);
        });
    }
}
