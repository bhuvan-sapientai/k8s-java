package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ReplicaSetCondition;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ReplicaSetConditionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1ReplicaSetConditionConstructor}, hash: CD6A75CD2D9347109061E595CB7E48C5
    @Test
    void testV1ReplicaSetConditionConstructor() {
        V1ReplicaSetCondition condition = new V1ReplicaSetCondition();
        assertThat(condition, is(notNullValue()));
    }

    //BaseRock generated method id: ${testLastTransitionTime}, hash: F6034B28B5F1D46071D517AC5558D9D6
    @Test
    void testLastTransitionTime() {
        V1ReplicaSetCondition condition = new V1ReplicaSetCondition();
        OffsetDateTime now = OffsetDateTime.now();
        condition.setLastTransitionTime(now);
        assertEquals(now, condition.getLastTransitionTime());
    }

    //BaseRock generated method id: ${testMessage}, hash: 062AB3CFC3DD9A2856CFCC62864DAF9D
    @Test
    void testMessage() {
        V1ReplicaSetCondition condition = new V1ReplicaSetCondition();
        String message = "Test message";
        condition.setMessage(message);
        assertEquals(message, condition.getMessage());
    }

    //BaseRock generated method id: ${testReason}, hash: A567E08CBB26C0A584A0CB66E2D381FC
    @Test
    void testReason() {
        V1ReplicaSetCondition condition = new V1ReplicaSetCondition();
        String reason = "Test reason";
        condition.setReason(reason);
        assertEquals(reason, condition.getReason());
    }

    //BaseRock generated method id: ${testStatus}, hash: 1AD6DBAC8109AB65AA3F7B83B6E6B6B1
    @Test
    void testStatus() {
        V1ReplicaSetCondition condition = new V1ReplicaSetCondition();
        String status = "True";
        condition.setStatus(status);
        assertEquals(status, condition.getStatus());
    }

    //BaseRock generated method id: ${testType}, hash: 3E33C07EDACE42AF2AA5DCB43C1A514D
    @Test
    void testType() {
        V1ReplicaSetCondition condition = new V1ReplicaSetCondition();
        String type = "Available";
        condition.setType(type);
        assertEquals(type, condition.getType());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: DCB99710BC2B8AE77D057B0DA915FF78
    @Test
    void testEqualsAndHashCode() {
        V1ReplicaSetCondition condition1 = new V1ReplicaSetCondition().lastTransitionTime(OffsetDateTime.now()).message("Test message").reason("Test reason").status("True").type("Available");
        V1ReplicaSetCondition condition2 = new V1ReplicaSetCondition().lastTransitionTime(condition1.getLastTransitionTime()).message("Test message").reason("Test reason").status("True").type("Available");
        assertThat(condition1, equalTo(condition2));
        assertThat(condition1.hashCode(), equalTo(condition2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 67B47BC294B8B23CEC2E40BCB135A1C9
    @Test
    void testToString() {
        V1ReplicaSetCondition condition = new V1ReplicaSetCondition().lastTransitionTime(OffsetDateTime.now()).message("Test message").reason("Test reason").status("True").type("Available");
        String toString = condition.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("lastTransitionTime"), is(true));
        assertThat(toString.contains("message"), is(true));
        assertThat(toString.contains("reason"), is(true));
        assertThat(toString.contains("status"), is(true));
        assertThat(toString.contains("type"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: D084FE6CE310126A7DBDD3FD47E76A5D
    @Test
    void testBuilder() {
        OffsetDateTime now = OffsetDateTime.now();
        V1ReplicaSetCondition condition = new V1ReplicaSetCondition().lastTransitionTime(now).message("Test message").reason("Test reason").status("True").type("Available");
        assertThat(condition.getLastTransitionTime(), equalTo(now));
        assertThat(condition.getMessage(), equalTo("Test message"));
        assertThat(condition.getReason(), equalTo("Test reason"));
        assertThat(condition.getStatus(), equalTo("True"));
        assertThat(condition.getType(), equalTo("Available"));
    }

    //BaseRock generated method id: ${testNullValues}, hash: A77A35C54731DE1302C6CD7CCF96FCB3
    @Test
    void testNullValues() {
        V1ReplicaSetCondition condition = new V1ReplicaSetCondition();
        assertNull(condition.getLastTransitionTime());
        assertNull(condition.getMessage());
        assertNull(condition.getReason());
        assertNull(condition.getStatus());
        assertNull(condition.getType());
    }
}
