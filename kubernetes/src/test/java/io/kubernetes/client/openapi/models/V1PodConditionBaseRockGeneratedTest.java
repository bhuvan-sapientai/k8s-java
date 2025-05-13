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
import static org.hamcrest.Matchers.is;
import io.kubernetes.client.openapi.models.V1PodCondition;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PodConditionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1PodConditionConstructor}, hash: 861FBB905CCB647D75E143D2A9E48304
    @Test
    void testV1PodConditionConstructor() {
        V1PodCondition condition = new V1PodCondition();
        assertNotNull(condition);
    }

    //BaseRock generated method id: ${testLastProbeTime}, hash: B582F3EF937A92E2887E31DE5FE0685E
    @Test
    void testLastProbeTime() {
        V1PodCondition condition = new V1PodCondition();
        OffsetDateTime now = OffsetDateTime.now();
        condition.setLastProbeTime(now);
        assertEquals(now, condition.getLastProbeTime());
    }

    //BaseRock generated method id: ${testLastTransitionTime}, hash: 024956A8D2A688963BE8DCADBCFDD7D4
    @Test
    void testLastTransitionTime() {
        V1PodCondition condition = new V1PodCondition();
        OffsetDateTime now = OffsetDateTime.now();
        condition.setLastTransitionTime(now);
        assertEquals(now, condition.getLastTransitionTime());
    }

    //BaseRock generated method id: ${testMessage}, hash: 650C191321E0EA1670577D5C1E0156D2
    @Test
    void testMessage() {
        V1PodCondition condition = new V1PodCondition();
        String message = "Test message";
        condition.setMessage(message);
        assertEquals(message, condition.getMessage());
    }

    //BaseRock generated method id: ${testReason}, hash: 82720D522E5B94425F8B4C00B6699AF9
    @Test
    void testReason() {
        V1PodCondition condition = new V1PodCondition();
        String reason = "TestReason";
        condition.setReason(reason);
        assertEquals(reason, condition.getReason());
    }

    //BaseRock generated method id: ${testStatus}, hash: EEFEFDBB4C81B9BE54A164F71457081A
    @Test
    void testStatus() {
        V1PodCondition condition = new V1PodCondition();
        String status = "True";
        condition.setStatus(status);
        assertEquals(status, condition.getStatus());
    }

    //BaseRock generated method id: ${testType}, hash: EE412FFFCCC24B0D818727F956E331CD
    @Test
    void testType() {
        V1PodCondition condition = new V1PodCondition();
        String type = "Ready";
        condition.setType(type);
        assertEquals(type, condition.getType());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: A07F39F150FC1F9C55FFCEB8B3BA7809
    @Test
    void testEqualsAndHashCode() {
        V1PodCondition condition1 = new V1PodCondition().lastProbeTime(OffsetDateTime.now()).lastTransitionTime(OffsetDateTime.now()).message("Test message").reason("TestReason").status("True").type("Ready");
        V1PodCondition condition2 = new V1PodCondition().lastProbeTime(condition1.getLastProbeTime()).lastTransitionTime(condition1.getLastTransitionTime()).message(condition1.getMessage()).reason(condition1.getReason()).status(condition1.getStatus()).type(condition1.getType());
        assertThat(condition1, equalTo(condition2));
        assertThat(condition1.hashCode(), equalTo(condition2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 92BF93D4DD4A146C7B57CB0FE6C7CCB6
    @Test
    void testToString() {
        V1PodCondition condition = new V1PodCondition().lastProbeTime(OffsetDateTime.now()).lastTransitionTime(OffsetDateTime.now()).message("Test message").reason("TestReason").status("True").type("Ready");
        String toString = condition.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("lastProbeTime"), is(true));
        assertThat(toString.contains("lastTransitionTime"), is(true));
        assertThat(toString.contains("message"), is(true));
        assertThat(toString.contains("reason"), is(true));
        assertThat(toString.contains("status"), is(true));
        assertThat(toString.contains("type"), is(true));
    }
}
