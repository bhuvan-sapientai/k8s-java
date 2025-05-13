package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1FlowSchemaCondition;
import java.time.OffsetDateTime;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1FlowSchemaConditionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1FlowSchemaConditionConstructor}, hash: C3154A2A9C4043BDB6E6EE949C6A41EC
    @Test
    void testV1FlowSchemaConditionConstructor() {
        V1FlowSchemaCondition condition = new V1FlowSchemaCondition();
        assertNotNull(condition);
    }

    //BaseRock generated method id: ${testLastTransitionTime}, hash: 28967BFC88E40F535585AB6C06170347
    @Test
    void testLastTransitionTime() {
        V1FlowSchemaCondition condition = new V1FlowSchemaCondition();
        OffsetDateTime now = OffsetDateTime.now();
        condition.setLastTransitionTime(now);
        assertEquals(now, condition.getLastTransitionTime());
    }

    //BaseRock generated method id: ${testMessage}, hash: B76984EB0C50C29D319219E947F72990
    @Test
    void testMessage() {
        V1FlowSchemaCondition condition = new V1FlowSchemaCondition();
        String message = "Test message";
        condition.setMessage(message);
        assertEquals(message, condition.getMessage());
    }

    //BaseRock generated method id: ${testReason}, hash: 748693F3675170685EE22939688F4DF6
    @Test
    void testReason() {
        V1FlowSchemaCondition condition = new V1FlowSchemaCondition();
        String reason = "TestReason";
        condition.setReason(reason);
        assertEquals(reason, condition.getReason());
    }

    //BaseRock generated method id: ${testStatus}, hash: DC5CCE5F7A23859101DC27CD881CF557
    @Test
    void testStatus() {
        V1FlowSchemaCondition condition = new V1FlowSchemaCondition();
        String status = "True";
        condition.setStatus(status);
        assertEquals(status, condition.getStatus());
    }

    //BaseRock generated method id: ${testType}, hash: 53DCE6E6B95F30533872870489A5DA83
    @Test
    void testType() {
        V1FlowSchemaCondition condition = new V1FlowSchemaCondition();
        String type = "TestType";
        condition.setType(type);
        assertEquals(type, condition.getType());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 08EB21EACD50FBD17D045A156C5CECB4
    @Test
    void testEqualsAndHashCode() {
        V1FlowSchemaCondition condition1 = new V1FlowSchemaCondition().lastTransitionTime(OffsetDateTime.now()).message("Test message").reason("TestReason").status("True").type("TestType");
        V1FlowSchemaCondition condition2 = new V1FlowSchemaCondition().lastTransitionTime(condition1.getLastTransitionTime()).message("Test message").reason("TestReason").status("True").type("TestType");
        assertThat(condition1, is(equalTo(condition2)));
        assertThat(condition1.hashCode(), is(equalTo(condition2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 5B6511D2B561AE2BCB0FA3BFD08AC2C0
    @Test
    void testToString() {
        V1FlowSchemaCondition condition = new V1FlowSchemaCondition().lastTransitionTime(OffsetDateTime.now()).message("Test message").reason("TestReason").status("True").type("TestType");
        String toString = condition.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("lastTransitionTime"), is(true));
        assertThat(toString.contains("message"), is(true));
        assertThat(toString.contains("reason"), is(true));
        assertThat(toString.contains("status"), is(true));
        assertThat(toString.contains("type"), is(true));
    }
}
