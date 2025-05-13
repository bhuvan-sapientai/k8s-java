package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import static org.hamcrest.Matchers.is;
import io.kubernetes.client.openapi.models.V1ContainerStateTerminated;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ContainerStateTerminatedBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: A9F95232960D947D0E78F12E2C2538FC
    @Test
    void testConstructor() {
        V1ContainerStateTerminated terminated = new V1ContainerStateTerminated();
        assertThat(terminated, is(notNullValue()));
    }

    //BaseRock generated method id: ${testContainerID}, hash: 2C51A3BDAA6F10324DF1BEC6BC3F79C9
    @Test
    void testContainerID() {
        V1ContainerStateTerminated terminated = new V1ContainerStateTerminated();
        String containerID = "docker://abc123";
        terminated.setContainerID(containerID);
        assertEquals(containerID, terminated.getContainerID());
    }

    //BaseRock generated method id: ${testExitCode}, hash: C58A287F5F63C6553C198305184C7AC6
    @Test
    void testExitCode() {
        V1ContainerStateTerminated terminated = new V1ContainerStateTerminated();
        Integer exitCode = 0;
        terminated.setExitCode(exitCode);
        assertEquals(exitCode, terminated.getExitCode());
    }

    //BaseRock generated method id: ${testFinishedAt}, hash: A1CD6CADA34BDF95640CAB3625EDFB35
    @Test
    void testFinishedAt() {
        V1ContainerStateTerminated terminated = new V1ContainerStateTerminated();
        OffsetDateTime finishedAt = OffsetDateTime.now();
        terminated.setFinishedAt(finishedAt);
        assertEquals(finishedAt, terminated.getFinishedAt());
    }

    //BaseRock generated method id: ${testMessage}, hash: DEA1EA3E21CE22132940325700DC383A
    @Test
    void testMessage() {
        V1ContainerStateTerminated terminated = new V1ContainerStateTerminated();
        String message = "Container exited normally";
        terminated.setMessage(message);
        assertEquals(message, terminated.getMessage());
    }

    //BaseRock generated method id: ${testReason}, hash: 6011D704ABEEB7C5BE792FC8A4CA3705
    @Test
    void testReason() {
        V1ContainerStateTerminated terminated = new V1ContainerStateTerminated();
        String reason = "Completed";
        terminated.setReason(reason);
        assertEquals(reason, terminated.getReason());
    }

    //BaseRock generated method id: ${testSignal}, hash: B4F14EEBEBA9670BDE6CF1A98CD3A86C
    @Test
    void testSignal() {
        V1ContainerStateTerminated terminated = new V1ContainerStateTerminated();
        Integer signal = 9;
        terminated.setSignal(signal);
        assertEquals(signal, terminated.getSignal());
    }

    //BaseRock generated method id: ${testStartedAt}, hash: D0F24FE21D939A76C9294EA41275B836
    @Test
    void testStartedAt() {
        V1ContainerStateTerminated terminated = new V1ContainerStateTerminated();
        OffsetDateTime startedAt = OffsetDateTime.now();
        terminated.setStartedAt(startedAt);
        assertEquals(startedAt, terminated.getStartedAt());
    }

    //BaseRock generated method id: ${testEquals}, hash: ED979E7212FDE02E34B1B6D447838756
    @Test
    void testEquals() {
        V1ContainerStateTerminated terminated1 = new V1ContainerStateTerminated().containerID("docker://abc123").exitCode(0).finishedAt(OffsetDateTime.now()).message("Container exited normally").reason("Completed").signal(9).startedAt(OffsetDateTime.now());
        V1ContainerStateTerminated terminated2 = new V1ContainerStateTerminated().containerID("docker://abc123").exitCode(0).finishedAt(terminated1.getFinishedAt()).message("Container exited normally").reason("Completed").signal(9).startedAt(terminated1.getStartedAt());
        assertThat(terminated1, is(equalTo(terminated2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: F1BE6E085C853EC0D494719E38161E45
    @Test
    void testHashCode() {
        V1ContainerStateTerminated terminated1 = new V1ContainerStateTerminated().containerID("docker://abc123").exitCode(0).finishedAt(OffsetDateTime.now()).message("Container exited normally").reason("Completed").signal(9).startedAt(OffsetDateTime.now());
        V1ContainerStateTerminated terminated2 = new V1ContainerStateTerminated().containerID("docker://abc123").exitCode(0).finishedAt(terminated1.getFinishedAt()).message("Container exited normally").reason("Completed").signal(9).startedAt(terminated1.getStartedAt());
        assertEquals(terminated1.hashCode(), terminated2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 509C5664D956069C828238C06BCD3CC8
    @Test
    void testToString() {
        V1ContainerStateTerminated terminated = new V1ContainerStateTerminated().containerID("docker://abc123").exitCode(0).finishedAt(OffsetDateTime.now()).message("Container exited normally").reason("Completed").signal(9).startedAt(OffsetDateTime.now());
        String toString = terminated.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("containerID"), is(true));
        assertThat(toString.contains("exitCode"), is(true));
        assertThat(toString.contains("finishedAt"), is(true));
        assertThat(toString.contains("message"), is(true));
        assertThat(toString.contains("reason"), is(true));
        assertThat(toString.contains("signal"), is(true));
        assertThat(toString.contains("startedAt"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 387C6AE283F3A0AC97CAD6683E167E5E
    @Test
    void testBuilder() {
        V1ContainerStateTerminated terminated = new V1ContainerStateTerminated().containerID("docker://abc123").exitCode(0).finishedAt(OffsetDateTime.now()).message("Container exited normally").reason("Completed").signal(9).startedAt(OffsetDateTime.now());
        assertThat(terminated, is(notNullValue()));
        assertEquals("docker://abc123", terminated.getContainerID());
        assertEquals(Integer.valueOf(0), terminated.getExitCode());
        assertThat(terminated.getFinishedAt(), is(notNullValue()));
        assertEquals("Container exited normally", terminated.getMessage());
        assertEquals("Completed", terminated.getReason());
        assertEquals(Integer.valueOf(9), terminated.getSignal());
        assertThat(terminated.getStartedAt(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testNullValues}, hash: 9DEB6291BDA16526280A9206FFA4E244
    @Test
    void testNullValues() {
        V1ContainerStateTerminated terminated = new V1ContainerStateTerminated();
        assertNull(terminated.getContainerID());
        assertNull(terminated.getExitCode());
        assertNull(terminated.getFinishedAt());
        assertNull(terminated.getMessage());
        assertNull(terminated.getReason());
        assertNull(terminated.getSignal());
        assertNull(terminated.getStartedAt());
    }
}
