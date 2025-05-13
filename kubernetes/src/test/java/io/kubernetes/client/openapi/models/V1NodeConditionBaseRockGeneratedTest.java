package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import io.kubernetes.client.openapi.models.V1NodeCondition;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1NodeConditionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1NodeConditionConstructor}, hash: 7C856325FB22766B4EB78BC441087903
    @Test
    void testV1NodeConditionConstructor() {
        V1NodeCondition condition = new V1NodeCondition();
        assertNotNull(condition);
    }

    //BaseRock generated method id: ${testLastHeartbeatTime}, hash: 82FDBD3E454BB491739CB4D36A097E1D
    @Test
    void testLastHeartbeatTime() {
        V1NodeCondition condition = new V1NodeCondition();
        OffsetDateTime now = OffsetDateTime.now();
        condition.setLastHeartbeatTime(now);
        assertEquals(now, condition.getLastHeartbeatTime());
    }

    //BaseRock generated method id: ${testLastTransitionTime}, hash: 2237B21AF4D92542F8586F3B1398CE3C
    @Test
    void testLastTransitionTime() {
        V1NodeCondition condition = new V1NodeCondition();
        OffsetDateTime now = OffsetDateTime.now();
        condition.setLastTransitionTime(now);
        assertEquals(now, condition.getLastTransitionTime());
    }

    //BaseRock generated method id: ${testMessage}, hash: D116ED30C531C26E213BF94D3BA9364B
    @Test
    void testMessage() {
        V1NodeCondition condition = new V1NodeCondition();
        String message = "Test message";
        condition.setMessage(message);
        assertEquals(message, condition.getMessage());
    }

    //BaseRock generated method id: ${testReason}, hash: D16493CCBA9BD428886BE08FE876FDED
    @Test
    void testReason() {
        V1NodeCondition condition = new V1NodeCondition();
        String reason = "Test reason";
        condition.setReason(reason);
        assertEquals(reason, condition.getReason());
    }

    //BaseRock generated method id: ${testStatus}, hash: 65E59567BB39EC2356BD2047154C93E3
    @Test
    void testStatus() {
        V1NodeCondition condition = new V1NodeCondition();
        String status = "True";
        condition.setStatus(status);
        assertEquals(status, condition.getStatus());
    }

    //BaseRock generated method id: ${testType}, hash: 85CE0B0560B07C4F0C6AABC88696B1E7
    @Test
    void testType() {
        V1NodeCondition condition = new V1NodeCondition();
        String type = "Ready";
        condition.setType(type);
        assertEquals(type, condition.getType());
    }

    //BaseRock generated method id: ${testEquals}, hash: 52791391F14AA32C35768344DE90D6B9
    @Test
    void testEquals() {
        V1NodeCondition condition1 = new V1NodeCondition().lastHeartbeatTime(OffsetDateTime.now()).lastTransitionTime(OffsetDateTime.now()).message("Test message").reason("Test reason").status("True").type("Ready");
        V1NodeCondition condition2 = new V1NodeCondition().lastHeartbeatTime(condition1.getLastHeartbeatTime()).lastTransitionTime(condition1.getLastTransitionTime()).message(condition1.getMessage()).reason(condition1.getReason()).status(condition1.getStatus()).type(condition1.getType());
        assertThat(condition1, is(equalTo(condition2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: C830F913F50131927EA9F648DF48C57F
    @Test
    void testHashCode() {
        V1NodeCondition condition = new V1NodeCondition().lastHeartbeatTime(OffsetDateTime.now()).lastTransitionTime(OffsetDateTime.now()).message("Test message").reason("Test reason").status("True").type("Ready");
        assertThat(condition.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 40CFC58CD8F9DD1D0E81A2C48AD2C196
    @Test
    void testToString() {
        V1NodeCondition condition = new V1NodeCondition().lastHeartbeatTime(OffsetDateTime.now()).lastTransitionTime(OffsetDateTime.now()).message("Test message").reason("Test reason").status("True").type("Ready");
        String toString = condition.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("lastHeartbeatTime"), is(true));
        assertThat(toString.contains("lastTransitionTime"), is(true));
        assertThat(toString.contains("message"), is(true));
        assertThat(toString.contains("reason"), is(true));
        assertThat(toString.contains("status"), is(true));
        assertThat(toString.contains("type"), is(true));
    }
}
