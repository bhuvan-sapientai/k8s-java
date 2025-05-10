package io.kubernetes.client.extended.controller.reconciler;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class ResultBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructorWithRequeueOnly}, hash: E066481FF0CCE3C8E7C37F91F05BBFC2
    @Test
    void testConstructorWithRequeueOnly() {
        Result result = new Result(true);
        assertTrue(result.isRequeue());
        assertNull(result.getRequeueAfter());
    }

    //BaseRock generated method id: ${testConstructorWithRequeueAndDuration}, hash: CA6E121264DEF498D5D523128F0F569A
    @Test
    void testConstructorWithRequeueAndDuration() {
        Duration duration = Duration.ofSeconds(5);
        Result result = new Result(false, duration);
        assertFalse(result.isRequeue());
        assertEquals(duration, result.getRequeueAfter());
    }

    //BaseRock generated method id: ${testSetRequeue}, hash: 1E8DC8BD099342AB1FA16FC8AA7478DA
    @Test
    void testSetRequeue() {
        Result result = new Result(false);
        result.setRequeue(true);
        assertTrue(result.isRequeue());
    }

    //BaseRock generated method id: ${testSetRequeueAfter}, hash: 61742701B9C17EBF682C5F141AC71CE5
    @Test
    void testSetRequeueAfter() {
        Result result = new Result(true);
        Duration duration = Duration.ofMinutes(1);
        result.setRequeueAfter(duration);
        assertEquals(duration, result.getRequeueAfter());
    }

    //BaseRock generated method id: ${testToString}, hash: 27CDD20A5A738E0CF50E0E147A8CF9B8
    @Test
    void testToString() {
        Duration duration = Duration.ofHours(1);
        Result result = new Result(true, duration);
        String expected = "Result{requeue=true, requeueAfter=PT1H}";
        assertEquals(expected, result.toString());
    }

    //BaseRock generated method id: ${testEquals}, hash: 3441AD3131FC809801F9D4BA438D59C9
    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    void testEquals(boolean requeue) {
        Duration duration = Duration.ofDays(1);
        Result result1 = new Result(requeue, duration);
        Result result2 = new Result(requeue, duration);
        Result result3 = new Result(!requeue, duration);
        Result result4 = new Result(requeue, Duration.ofDays(2));
        assertEquals(result1, result2);
        assertNotEquals(result1, result3);
        assertNotEquals(result1, result4);
        assertNotEquals(result1, null);
        assertNotEquals(result1, new Object());
    }

    //BaseRock generated method id: ${testHashCode}, hash: 2983758EBC7215C5706BCD7BAD20A44C
    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    void testHashCode(boolean requeue) {
        Duration duration = Duration.ofDays(7);
        Result result1 = new Result(requeue, duration);
        Result result2 = new Result(requeue, duration);
        assertEquals(result1.hashCode(), result2.hashCode());
    }

    //BaseRock generated method id: ${testEqualsWithNullRequeueAfter}, hash: 87BD42023DA61AD083D00EEEAE18C15D
    @Test
    void testEqualsWithNullRequeueAfter() {
        Result result1 = new Result(true);
        Result result2 = new Result(true);
        assertEquals(result1, result2);
    }

    //BaseRock generated method id: ${testHashCodeWithNullRequeueAfter}, hash: 299AEAEC18AB0AA2868FFCDC834BE147
    @Test
    void testHashCodeWithNullRequeueAfter() {
        Result result = new Result(false);
        int expectedHashCode = 0;
        assertEquals(expectedHashCode, result.hashCode());
    }
}
