package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import io.kubernetes.client.openapi.models.V1APIServiceCondition;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import java.time.OffsetDateTime;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1APIServiceConditionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1APIServiceConditionConstructor}, hash: A84F07A62A51F2171244AE1630956847
    @Test
    void testV1APIServiceConditionConstructor() {
        V1APIServiceCondition condition = new V1APIServiceCondition();
        assertNotNull(condition);
    }

    //BaseRock generated method id: ${testLastTransitionTime}, hash: 924B857A7623FF40651C677E42D6B148
    @Test
    void testLastTransitionTime() {
        OffsetDateTime now = OffsetDateTime.now();
        V1APIServiceCondition condition = new V1APIServiceCondition().lastTransitionTime(now);
        assertEquals(now, condition.getLastTransitionTime());
    }

    //BaseRock generated method id: ${testMessage}, hash: 9ED5B783E8944166780938923EA7A5DD
    @Test
    void testMessage() {
        String message = "Test message";
        V1APIServiceCondition condition = new V1APIServiceCondition().message(message);
        assertEquals(message, condition.getMessage());
    }

    //BaseRock generated method id: ${testReason}, hash: 12A735003332B3B7D3587C1E4264B514
    @Test
    void testReason() {
        String reason = "TestReason";
        V1APIServiceCondition condition = new V1APIServiceCondition().reason(reason);
        assertEquals(reason, condition.getReason());
    }

    //BaseRock generated method id: ${testStatus}, hash: 7C8108DBD668FD249BB4BDCC23226FDF
    @Test
    void testStatus() {
        String status = "True";
        V1APIServiceCondition condition = new V1APIServiceCondition().status(status);
        assertEquals(status, condition.getStatus());
    }

    //BaseRock generated method id: ${testType}, hash: 1293C6A705C4C443CCC7A0D0B114E917
    @Test
    void testType() {
        String type = "Available";
        V1APIServiceCondition condition = new V1APIServiceCondition().type(type);
        assertEquals(type, condition.getType());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: DC07D764583715C5EE07D5894164D3C3
    @Test
    void testEqualsAndHashCode() {
        OffsetDateTime now = OffsetDateTime.now();
        V1APIServiceCondition condition1 = new V1APIServiceCondition().lastTransitionTime(now).message("Test").reason("TestReason").status("True").type("Available");
        V1APIServiceCondition condition2 = new V1APIServiceCondition().lastTransitionTime(now).message("Test").reason("TestReason").status("True").type("Available");
        assertThat(condition1, is(equalTo(condition2)));
        assertThat(condition1.hashCode(), is(equalTo(condition2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: EE3D5B2E216CC247AF67923AD44533DA
    @Test
    void testToString() {
        V1APIServiceCondition condition = new V1APIServiceCondition().lastTransitionTime(OffsetDateTime.parse("2023-01-01T00:00:00Z")).message("Test message").reason("TestReason").status("True").type("Available");
        String expectedString = "class V1APIServiceCondition {\n" + "    lastTransitionTime: 2023-01-01T00:00Z\n" + "    message: Test message\n" + "    reason: TestReason\n" + "    status: True\n" + "    type: Available\n" + "}";
        assertThat(condition.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testBuilder}, hash: BB53494ECD0D1C025D576D236FA88105
    @Test
    void testBuilder() {
        OffsetDateTime now = OffsetDateTime.now();
        V1APIServiceCondition condition = new V1APIServiceCondition().lastTransitionTime(now).message("Test message").reason("TestReason").status("True").type("Available");
        assertThat(condition, is(notNullValue()));
        assertThat(condition.getLastTransitionTime(), is(equalTo(now)));
        assertThat(condition.getMessage(), is(equalTo("Test message")));
        assertThat(condition.getReason(), is(equalTo("TestReason")));
        assertThat(condition.getStatus(), is(equalTo("True")));
        assertThat(condition.getType(), is(equalTo("Available")));
    }
}
