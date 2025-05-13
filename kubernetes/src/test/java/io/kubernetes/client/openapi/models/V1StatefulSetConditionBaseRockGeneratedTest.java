package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import java.time.OffsetDateTime;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1StatefulSetConditionBaseRockGeneratedTest {

    private V1StatefulSetCondition condition;

    @BeforeEach
    void setUp() {
        condition = new V1StatefulSetCondition();
    }

    //BaseRock generated method id: ${testConstructor}, hash: D39BC8A8A311EB7E60BA6D327EE7175F
    @Test
    void testConstructor() {
        assertNotNull(condition);
    }

    //BaseRock generated method id: ${testLastTransitionTime}, hash: 681B7C71A805C9BB2C6281F0E22196F5
    @Test
    void testLastTransitionTime() {
        OffsetDateTime now = OffsetDateTime.now();
        condition.setLastTransitionTime(now);
        assertEquals(now, condition.getLastTransitionTime());
    }

    //BaseRock generated method id: ${testMessage}, hash: 783E71C7A26DF26B3F9CD4C1DF52A9F9
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Test message" })
    void testMessage(String message) {
        condition.setMessage(message);
        assertEquals(message, condition.getMessage());
    }

    //BaseRock generated method id: ${testReason}, hash: 141AB44EA862E9204076D2510EB3693B
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Test reason" })
    void testReason(String reason) {
        condition.setReason(reason);
        assertEquals(reason, condition.getReason());
    }

    //BaseRock generated method id: ${testStatus}, hash: 91FCD24BD190B92B8CE9F7230255C9F8
    @ParameterizedTest
    @ValueSource(strings = { "True", "False", "Unknown" })
    void testStatus(String status) {
        condition.setStatus(status);
        assertEquals(status, condition.getStatus());
    }

    //BaseRock generated method id: ${testType}, hash: 64B693D87FE83FBB417456551FD7428B
    @ParameterizedTest
    @ValueSource(strings = { "Available", "Progressing" })
    void testType(String type) {
        condition.setType(type);
        assertEquals(type, condition.getType());
    }

    //BaseRock generated method id: ${testEquals}, hash: 6BA01C3B6FB634795E494FBB06245505
    @Test
    void testEquals() {
        V1StatefulSetCondition condition1 = new V1StatefulSetCondition().lastTransitionTime(OffsetDateTime.now()).message("Test message").reason("Test reason").status("True").type("Available");
        V1StatefulSetCondition condition2 = new V1StatefulSetCondition().lastTransitionTime(condition1.getLastTransitionTime()).message(condition1.getMessage()).reason(condition1.getReason()).status(condition1.getStatus()).type(condition1.getType());
        assertEquals(condition1, condition2);
        assertEquals(condition1.hashCode(), condition2.hashCode());
    }

    //BaseRock generated method id: ${testNotEquals}, hash: F74E2A0014E1B749A5B3E20664734E92
    @Test
    void testNotEquals() {
        V1StatefulSetCondition condition1 = new V1StatefulSetCondition().lastTransitionTime(OffsetDateTime.now()).message("Test message 1").reason("Test reason 1").status("True").type("Available");
        V1StatefulSetCondition condition2 = new V1StatefulSetCondition().lastTransitionTime(OffsetDateTime.now().plusDays(1)).message("Test message 2").reason("Test reason 2").status("False").type("Progressing");
        assertNotEquals(condition1, condition2);
        assertNotEquals(condition1.hashCode(), condition2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 389EE0B35E47BFC4026AF96A8500B687
    @Test
    void testToString() {
        V1StatefulSetCondition condition = new V1StatefulSetCondition().lastTransitionTime(OffsetDateTime.parse("2023-01-01T00:00:00Z")).message("Test message").reason("Test reason").status("True").type("Available");
        String expected = "class V1StatefulSetCondition {\n" + "    lastTransitionTime: 2023-01-01T00:00Z\n" + "    message: Test message\n" + "    reason: Test reason\n" + "    status: True\n" + "    type: Available\n" + "}";
        assertEquals(expected, condition.toString());
    }
}
