package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1NamespaceCondition;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
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
class V1NamespaceConditionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1NamespaceConditionCreation}, hash: 1C1DF45B91A5C695605F43C8B1C6A1F3
    @Test
    void testV1NamespaceConditionCreation() {
        V1NamespaceCondition condition = new V1NamespaceCondition();
        assertNotNull(condition);
    }

    //BaseRock generated method id: ${testLastTransitionTime}, hash: EF14C0FD7A833FF53808D405ADF3BB6F
    @Test
    void testLastTransitionTime() {
        OffsetDateTime now = OffsetDateTime.now();
        V1NamespaceCondition condition = new V1NamespaceCondition().lastTransitionTime(now);
        assertEquals(now, condition.getLastTransitionTime());
    }

    //BaseRock generated method id: ${testMessage}, hash: 131FC2B8A65D7B2C6E996EFA2B670974
    @Test
    void testMessage() {
        String message = "Test message";
        V1NamespaceCondition condition = new V1NamespaceCondition().message(message);
        assertEquals(message, condition.getMessage());
    }

    //BaseRock generated method id: ${testReason}, hash: 48C2DC5BE007C4C300CAB3551F573600
    @Test
    void testReason() {
        String reason = "TestReason";
        V1NamespaceCondition condition = new V1NamespaceCondition().reason(reason);
        assertEquals(reason, condition.getReason());
    }

    //BaseRock generated method id: ${testStatus}, hash: 88A625598CC5D8E9A5CEEA62AA8BEADD
    @Test
    void testStatus() {
        String status = "True";
        V1NamespaceCondition condition = new V1NamespaceCondition().status(status);
        assertEquals(status, condition.getStatus());
    }

    //BaseRock generated method id: ${testType}, hash: 76B781C0787B61DC8B5B12FB9BFF6E08
    @Test
    void testType() {
        String type = "Ready";
        V1NamespaceCondition condition = new V1NamespaceCondition().type(type);
        assertEquals(type, condition.getType());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: CE964AB0C8453A4843A9838084939A25
    @Test
    void testEqualsAndHashCode() {
        OffsetDateTime now = OffsetDateTime.now();
        V1NamespaceCondition condition1 = new V1NamespaceCondition().lastTransitionTime(now).message("Test message").reason("TestReason").status("True").type("Ready");
        V1NamespaceCondition condition2 = new V1NamespaceCondition().lastTransitionTime(now).message("Test message").reason("TestReason").status("True").type("Ready");
        assertEquals(condition1, condition2);
        assertEquals(condition1.hashCode(), condition2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 88553D6274024A4CED6D68FECBFAAF12
    @Test
    void testToString() {
        V1NamespaceCondition condition = new V1NamespaceCondition().lastTransitionTime(OffsetDateTime.parse("2023-01-01T00:00:00Z")).message("Test message").reason("TestReason").status("True").type("Ready");
        String expectedString = "class V1NamespaceCondition {\n" + "    lastTransitionTime: 2023-01-01T00:00Z\n" + "    message: Test message\n" + "    reason: TestReason\n" + "    status: True\n" + "    type: Ready\n" + "}";
        assertEquals(expectedString, condition.toString());
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 282ABEFA236027654042508DA97D4A1C
    @Test
    void testBuilderPattern() {
        OffsetDateTime now = OffsetDateTime.now();
        V1NamespaceCondition condition = new V1NamespaceCondition().lastTransitionTime(now).message("Test message").reason("TestReason").status("True").type("Ready");
        assertEquals(now, condition.getLastTransitionTime());
        assertEquals("Test message", condition.getMessage());
        assertEquals("TestReason", condition.getReason());
        assertEquals("True", condition.getStatus());
        assertEquals("Ready", condition.getType());
    }
}
