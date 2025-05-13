package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.OffsetDateTime;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V2HorizontalPodAutoscalerConditionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: A95A802CAD69255DD17BE68F6F0432DA
    @Test
    void testConstructor() {
        V2HorizontalPodAutoscalerCondition condition = new V2HorizontalPodAutoscalerCondition();
        assertNotNull(condition);
    }

    //BaseRock generated method id: ${testLastTransitionTime}, hash: 6F0EB5CB5470575ABDA9DAEA0CA2E1FD
    @Test
    void testLastTransitionTime() {
        V2HorizontalPodAutoscalerCondition condition = new V2HorizontalPodAutoscalerCondition();
        OffsetDateTime now = OffsetDateTime.now();
        condition.setLastTransitionTime(now);
        assertEquals(now, condition.getLastTransitionTime());
    }

    //BaseRock generated method id: ${testMessage}, hash: 8B545CFAB1D85C753FA5303C7BAD3815
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Test message", "Another test message" })
    void testMessage(String message) {
        V2HorizontalPodAutoscalerCondition condition = new V2HorizontalPodAutoscalerCondition();
        condition.setMessage(message);
        assertEquals(message, condition.getMessage());
    }

    //BaseRock generated method id: ${testReason}, hash: 7EAB2E9E8CB72E6BC81206FD453EC7FE
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "TestReason", "AnotherTestReason" })
    void testReason(String reason) {
        V2HorizontalPodAutoscalerCondition condition = new V2HorizontalPodAutoscalerCondition();
        condition.setReason(reason);
        assertEquals(reason, condition.getReason());
    }

    //BaseRock generated method id: ${testStatus}, hash: F683D355512EC3329091EE4F153783FB
    @ParameterizedTest
    @ValueSource(strings = { "True", "False", "Unknown" })
    void testStatus(String status) {
        V2HorizontalPodAutoscalerCondition condition = new V2HorizontalPodAutoscalerCondition();
        condition.setStatus(status);
        assertEquals(status, condition.getStatus());
    }

    //BaseRock generated method id: ${testType}, hash: EB6A444678C7AA212B2F45BBD18B8B0C
    @ParameterizedTest
    @ValueSource(strings = { "TestType", "AnotherTestType" })
    void testType(String type) {
        V2HorizontalPodAutoscalerCondition condition = new V2HorizontalPodAutoscalerCondition();
        condition.setType(type);
        assertEquals(type, condition.getType());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: ABD660B41BE95F5010115820D40DC112
    @Test
    void testEqualsAndHashCode() {
        V2HorizontalPodAutoscalerCondition condition1 = new V2HorizontalPodAutoscalerCondition().lastTransitionTime(OffsetDateTime.now()).message("Test message").reason("TestReason").status("True").type("TestType");
        V2HorizontalPodAutoscalerCondition condition2 = new V2HorizontalPodAutoscalerCondition().lastTransitionTime(condition1.getLastTransitionTime()).message("Test message").reason("TestReason").status("True").type("TestType");
        assertEquals(condition1, condition2);
        assertEquals(condition1.hashCode(), condition2.hashCode());
        condition2.setStatus("False");
        assertNotEquals(condition1, condition2);
        assertNotEquals(condition1.hashCode(), condition2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 1815FFA893B56EDD856D0B1A41C1B56C
    @Test
    void testToString() {
        V2HorizontalPodAutoscalerCondition condition = new V2HorizontalPodAutoscalerCondition().lastTransitionTime(OffsetDateTime.now()).message("Test message").reason("TestReason").status("True").type("TestType");
        String toString = condition.toString();
        assertThat(toString, containsString("lastTransitionTime"));
        assertThat(toString, containsString("message"));
        assertThat(toString, containsString("reason"));
        assertThat(toString, containsString("status"));
        assertThat(toString, containsString("type"));
    }

    //BaseRock generated method id: ${testBuilder}, hash: EDAB6ECF8BA5AEC6AE4FA4EC48AE30D0
    @Test
    void testBuilder() {
        OffsetDateTime now = OffsetDateTime.now();
        V2HorizontalPodAutoscalerCondition condition = new V2HorizontalPodAutoscalerCondition().lastTransitionTime(now).message("Test message").reason("TestReason").status("True").type("TestType");
        assertEquals(now, condition.getLastTransitionTime());
        assertEquals("Test message", condition.getMessage());
        assertEquals("TestReason", condition.getReason());
        assertEquals("True", condition.getStatus());
        assertEquals("TestType", condition.getType());
    }
}
