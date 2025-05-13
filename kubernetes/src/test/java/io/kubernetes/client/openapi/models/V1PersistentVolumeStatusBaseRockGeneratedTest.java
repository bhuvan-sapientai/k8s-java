package io.kubernetes.client.openapi.models;

import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import io.kubernetes.client.openapi.models.V1PersistentVolumeStatus;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
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
class V1PersistentVolumeStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1PersistentVolumeStatusConstructor}, hash: A51012E4FC896F925BC6F97DB250858D
    @Test
    void testV1PersistentVolumeStatusConstructor() {
        V1PersistentVolumeStatus status = new V1PersistentVolumeStatus();
        assertNotNull(status);
    }

    //BaseRock generated method id: ${testLastPhaseTransitionTime}, hash: 416B425BE7D0FC9A6B0987209F2F137C
    @Test
    void testLastPhaseTransitionTime() {
        V1PersistentVolumeStatus status = new V1PersistentVolumeStatus();
        OffsetDateTime time = OffsetDateTime.now();
        status.setLastPhaseTransitionTime(time);
        assertEquals(time, status.getLastPhaseTransitionTime());
    }

    //BaseRock generated method id: ${testMessage}, hash: 70129C3C19349F6738A2033497C96CC6
    @Test
    void testMessage() {
        V1PersistentVolumeStatus status = new V1PersistentVolumeStatus();
        String message = "Test message";
        status.setMessage(message);
        assertEquals(message, status.getMessage());
    }

    //BaseRock generated method id: ${testPhase}, hash: 54DBAB22D2A5DD61A917AFFA9790D6B4
    @Test
    void testPhase() {
        V1PersistentVolumeStatus status = new V1PersistentVolumeStatus();
        String phase = "Available";
        status.setPhase(phase);
        assertEquals(phase, status.getPhase());
    }

    //BaseRock generated method id: ${testReason}, hash: BEFF1A280CBC9CECE434A54FB1028805
    @Test
    void testReason() {
        V1PersistentVolumeStatus status = new V1PersistentVolumeStatus();
        String reason = "Test reason";
        status.setReason(reason);
        assertEquals(reason, status.getReason());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: A1F8B58C8A031B1FA36C5A1DDE7EA72B
    @Test
    void testEqualsAndHashCode() {
        V1PersistentVolumeStatus status1 = new V1PersistentVolumeStatus().lastPhaseTransitionTime(OffsetDateTime.now()).message("Test message").phase("Available").reason("Test reason");
        V1PersistentVolumeStatus status2 = new V1PersistentVolumeStatus().lastPhaseTransitionTime(status1.getLastPhaseTransitionTime()).message("Test message").phase("Available").reason("Test reason");
        assertAll(() -> assertThat(status1, is(equalTo(status2))), () -> assertThat(status1.hashCode(), is(equalTo(status2.hashCode()))));
    }

    //BaseRock generated method id: ${testToString}, hash: 3E05592ED2C3A010B36C2BB43465C11D
    @Test
    void testToString() {
        V1PersistentVolumeStatus status = new V1PersistentVolumeStatus().lastPhaseTransitionTime(OffsetDateTime.now()).message("Test message").phase("Available").reason("Test reason");
        String toString = status.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("lastPhaseTransitionTime"), is(true));
        assertThat(toString.contains("message"), is(true));
        assertThat(toString.contains("phase"), is(true));
        assertThat(toString.contains("reason"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: F0DEBD6273AA17AC3A239ACEFB3A1215
    @Test
    void testBuilder() {
        OffsetDateTime time = OffsetDateTime.now();
        V1PersistentVolumeStatus status = new V1PersistentVolumeStatus().lastPhaseTransitionTime(time).message("Test message").phase("Available").reason("Test reason");
        assertAll(() -> assertEquals(time, status.getLastPhaseTransitionTime()), () -> assertEquals("Test message", status.getMessage()), () -> assertEquals("Available", status.getPhase()), () -> assertEquals("Test reason", status.getReason()));
    }
}
