package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;
import java.time.OffsetDateTime;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ConditionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: C7530F7015096B254DF7961CA858F775
    @Test
    void testConstructor() {
        V1Condition condition = new V1Condition();
        assertNotNull(condition);
    }

    //BaseRock generated method id: ${testLastTransitionTime}, hash: 244E8BC254A02B11E6AFF746A75C9696
    @Test
    void testLastTransitionTime() {
        OffsetDateTime now = OffsetDateTime.now();
        V1Condition condition = new V1Condition().lastTransitionTime(now);
        assertEquals(now, condition.getLastTransitionTime());
    }

    //BaseRock generated method id: ${testMessage}, hash: 4EA1B57DC06261415C14F15B0AD9CBB5
    @Test
    void testMessage() {
        String message = "Test message";
        V1Condition condition = new V1Condition().message(message);
        assertEquals(message, condition.getMessage());
    }

    //BaseRock generated method id: ${testObservedGeneration}, hash: 8C0C6568B87FAFA8C85E3D7E5DDFA327
    @Test
    void testObservedGeneration() {
        Long generation = 42L;
        V1Condition condition = new V1Condition().observedGeneration(generation);
        assertEquals(generation, condition.getObservedGeneration());
    }

    //BaseRock generated method id: ${testReason}, hash: AEC933B3750655826B387903850F3F36
    @Test
    void testReason() {
        String reason = "TestReason";
        V1Condition condition = new V1Condition().reason(reason);
        assertEquals(reason, condition.getReason());
    }

    //BaseRock generated method id: ${testStatus}, hash: 6AB7CBC73807E7F11E42A1B94C4BF9D9
    @ParameterizedTest
    @ValueSource(strings = { "True", "False", "Unknown" })
    void testStatus(String status) {
        V1Condition condition = new V1Condition().status(status);
        assertEquals(status, condition.getStatus());
    }

    //BaseRock generated method id: ${testType}, hash: 0138A61FE07F20CC8C8E49247823A61B
    @Test
    void testType() {
        String type = "TestType";
        V1Condition condition = new V1Condition().type(type);
        assertEquals(type, condition.getType());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 61D8D1299D04C0E67774C1C6BD908372
    @Test
    void testEqualsAndHashCode() {
        OffsetDateTime now = OffsetDateTime.now();
        V1Condition condition1 = new V1Condition().lastTransitionTime(now).message("Test").observedGeneration(1L).reason("TestReason").status("True").type("TestType");
        V1Condition condition2 = new V1Condition().lastTransitionTime(now).message("Test").observedGeneration(1L).reason("TestReason").status("True").type("TestType");
        assertThat(condition1, is(equalTo(condition2)));
        assertThat(condition1.hashCode(), is(equalTo(condition2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 92E86D61607242B8B354CABAF802CF4A
    @Test
    void testToString() {
        OffsetDateTime now = OffsetDateTime.now();
        V1Condition condition = new V1Condition().lastTransitionTime(now).message("Test").observedGeneration(1L).reason("TestReason").status("True").type("TestType");
        String toString = condition.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString, containsString("lastTransitionTime"));
        assertThat(toString, containsString("message"));
        assertThat(toString, containsString("observedGeneration"));
        assertThat(toString, containsString("reason"));
        assertThat(toString, containsString("status"));
        assertThat(toString, containsString("type"));
    }

    //BaseRock generated method id: ${testRequiredFields}, hash: 5C4EA16CA29286A866CB91E835CF1D1E
    @Test
    void testRequiredFields() {
        V1Condition condition = new V1Condition();
        assertDoesNotThrow(() -> condition.getLastTransitionTime());
        assertDoesNotThrow(() -> condition.getMessage());
        assertDoesNotThrow(() -> condition.getReason());
        assertDoesNotThrow(() -> condition.getStatus());
        assertDoesNotThrow(() -> condition.getType());
    }
}
