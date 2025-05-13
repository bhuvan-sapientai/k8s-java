package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1DaemonSetCondition;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import java.time.OffsetDateTime;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1DaemonSetConditionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1DaemonSetConditionCreation}, hash: 2C568A861F4314B9C928A673E1A4464A
    @Test
    void testV1DaemonSetConditionCreation() {
        V1DaemonSetCondition condition = new V1DaemonSetCondition();
        assertThat(condition, is(notNullValue()));
    }

    //BaseRock generated method id: ${testLastTransitionTime}, hash: 76E55CA0D4DAF28C283E23F05809635B
    @Test
    void testLastTransitionTime() {
        V1DaemonSetCondition condition = new V1DaemonSetCondition();
        OffsetDateTime now = OffsetDateTime.now();
        condition.setLastTransitionTime(now);
        assertEquals(now, condition.getLastTransitionTime());
    }

    //BaseRock generated method id: ${testMessage}, hash: D53E0B6786682756D15EB47E107A02ED
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Test message", "Another message" })
    void testMessage(String message) {
        V1DaemonSetCondition condition = new V1DaemonSetCondition();
        condition.setMessage(message);
        assertEquals(message, condition.getMessage());
    }

    //BaseRock generated method id: ${testReason}, hash: 4616A0D6B722FA2EF766BBF8ACCCA69C
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Test reason", "Another reason" })
    void testReason(String reason) {
        V1DaemonSetCondition condition = new V1DaemonSetCondition();
        condition.setReason(reason);
        assertEquals(reason, condition.getReason());
    }

    //BaseRock generated method id: ${testStatus}, hash: 018376ADE13BE810AB85CC9F2AA2F53E
    @ParameterizedTest
    @ValueSource(strings = { "True", "False", "Unknown" })
    void testStatus(String status) {
        V1DaemonSetCondition condition = new V1DaemonSetCondition();
        condition.setStatus(status);
        assertEquals(status, condition.getStatus());
    }

    //BaseRock generated method id: ${testType}, hash: EAF00791CBFC1C42AE3416BA6964511D
    @ParameterizedTest
    @ValueSource(strings = { "Available", "Progressing", "ReplicaFailure" })
    void testType(String type) {
        V1DaemonSetCondition condition = new V1DaemonSetCondition();
        condition.setType(type);
        assertEquals(type, condition.getType());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 687B792EDB1336C902515F2422F74869
    @Test
    void testEqualsAndHashCode() {
        V1DaemonSetCondition condition1 = new V1DaemonSetCondition().lastTransitionTime(OffsetDateTime.now()).message("Test message").reason("Test reason").status("True").type("Available");
        V1DaemonSetCondition condition2 = new V1DaemonSetCondition().lastTransitionTime(condition1.getLastTransitionTime()).message("Test message").reason("Test reason").status("True").type("Available");
        assertEquals(condition1, condition2);
        assertEquals(condition1.hashCode(), condition2.hashCode());
        condition2.setStatus("False");
        assertNotEquals(condition1, condition2);
        assertNotEquals(condition1.hashCode(), condition2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: A42A8F9E9CC3C912B727AA2AC4BE351D
    @Test
    void testToString() {
        V1DaemonSetCondition condition = new V1DaemonSetCondition().lastTransitionTime(OffsetDateTime.now()).message("Test message").reason("Test reason").status("True").type("Available");
        String toString = condition.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("lastTransitionTime"), is(true));
        assertThat(toString.contains("message"), is(true));
        assertThat(toString.contains("reason"), is(true));
        assertThat(toString.contains("status"), is(true));
        assertThat(toString.contains("type"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 50561EB4871FC94AA0FA124DE09141B1
    @Test
    void testBuilder() {
        OffsetDateTime now = OffsetDateTime.now();
        V1DaemonSetCondition condition = new V1DaemonSetCondition().lastTransitionTime(now).message("Test message").reason("Test reason").status("True").type("Available");
        assertEquals(now, condition.getLastTransitionTime());
        assertEquals("Test message", condition.getMessage());
        assertEquals("Test reason", condition.getReason());
        assertEquals("True", condition.getStatus());
        assertEquals("Available", condition.getType());
    }

    //BaseRock generated method id: ${testNullLastTransitionTime}, hash: AB10163AC5A8B094CBBFE91AB32D49D2
    @Test
    void testNullLastTransitionTime() {
        V1DaemonSetCondition condition = new V1DaemonSetCondition();
        condition.setLastTransitionTime(null);
        assertThat(condition.getLastTransitionTime(), is(nullValue()));
    }
}
