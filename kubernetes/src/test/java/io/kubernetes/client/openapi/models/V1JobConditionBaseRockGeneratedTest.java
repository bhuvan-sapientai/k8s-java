package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1JobCondition;
import java.time.OffsetDateTime;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1JobConditionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1JobConditionConstructor}, hash: 3342718680E264965D6420CFDFE8B288
    @Test
    void testV1JobConditionConstructor() {
        V1JobCondition jobCondition = new V1JobCondition();
        assertThat(jobCondition, notNullValue());
    }

    //BaseRock generated method id: ${testLastProbeTime}, hash: 21EFBA87C41A26C58332400905D0ACE2
    @Test
    void testLastProbeTime() {
        V1JobCondition jobCondition = new V1JobCondition();
        OffsetDateTime now = OffsetDateTime.now();
        jobCondition.setLastProbeTime(now);
        assertEquals(now, jobCondition.getLastProbeTime());
    }

    //BaseRock generated method id: ${testLastTransitionTime}, hash: 84A88878FCD913CDD38D0226AF4EB558
    @Test
    void testLastTransitionTime() {
        V1JobCondition jobCondition = new V1JobCondition();
        OffsetDateTime now = OffsetDateTime.now();
        jobCondition.setLastTransitionTime(now);
        assertEquals(now, jobCondition.getLastTransitionTime());
    }

    //BaseRock generated method id: ${testMessage}, hash: 19F16B1AE33B5AF6DAC259490F102F62
    @Test
    void testMessage() {
        V1JobCondition jobCondition = new V1JobCondition();
        String message = "Test message";
        jobCondition.setMessage(message);
        assertEquals(message, jobCondition.getMessage());
    }

    //BaseRock generated method id: ${testReason}, hash: E9433194FFFB514E8ACA3A5B4F65BD91
    @Test
    void testReason() {
        V1JobCondition jobCondition = new V1JobCondition();
        String reason = "Test reason";
        jobCondition.setReason(reason);
        assertEquals(reason, jobCondition.getReason());
    }

    //BaseRock generated method id: ${testStatus}, hash: A0B93892098D4FF010FA44FABE22533B
    @Test
    void testStatus() {
        V1JobCondition jobCondition = new V1JobCondition();
        String status = "True";
        jobCondition.setStatus(status);
        assertEquals(status, jobCondition.getStatus());
    }

    //BaseRock generated method id: ${testType}, hash: D59D19406649918359762B8608EA3A60
    @Test
    void testType() {
        V1JobCondition jobCondition = new V1JobCondition();
        String type = "Complete";
        jobCondition.setType(type);
        assertEquals(type, jobCondition.getType());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 1CE4C9B8D486C2BCCB71717FF223BF4C
    @Test
    void testEqualsAndHashCode() {
        V1JobCondition jobCondition1 = new V1JobCondition().lastProbeTime(OffsetDateTime.now()).lastTransitionTime(OffsetDateTime.now()).message("Test message").reason("Test reason").status("True").type("Complete");
        V1JobCondition jobCondition2 = new V1JobCondition().lastProbeTime(jobCondition1.getLastProbeTime()).lastTransitionTime(jobCondition1.getLastTransitionTime()).message("Test message").reason("Test reason").status("True").type("Complete");
        assertThat(jobCondition1, equalTo(jobCondition2));
        assertThat(jobCondition1.hashCode(), equalTo(jobCondition2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 5F1E02CFF868E35C8B32EA5D0B900044
    @Test
    void testToString() {
        V1JobCondition jobCondition = new V1JobCondition().lastProbeTime(OffsetDateTime.now()).lastTransitionTime(OffsetDateTime.now()).message("Test message").reason("Test reason").status("True").type("Complete");
        String toStringResult = jobCondition.toString();
        assertThat(toStringResult, notNullValue());
        assertThat(toStringResult.contains("lastProbeTime"), equalTo(true));
        assertThat(toStringResult.contains("lastTransitionTime"), equalTo(true));
        assertThat(toStringResult.contains("message"), equalTo(true));
        assertThat(toStringResult.contains("reason"), equalTo(true));
        assertThat(toStringResult.contains("status"), equalTo(true));
        assertThat(toStringResult.contains("type"), equalTo(true));
    }

    //BaseRock generated method id: ${testNullFields}, hash: 9067D27F2AA0C80114C16DB6B1DECE60
    @Test
    void testNullFields() {
        V1JobCondition jobCondition = new V1JobCondition();
        assertNull(jobCondition.getLastProbeTime());
        assertNull(jobCondition.getLastTransitionTime());
        assertNull(jobCondition.getMessage());
        assertNull(jobCondition.getReason());
        assertNull(jobCondition.getStatus());
        assertNull(jobCondition.getType());
    }
}
