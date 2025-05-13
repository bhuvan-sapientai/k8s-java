package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PersistentVolumeClaimConditionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1PersistentVolumeClaimCondition}, hash: 04599808FCD0E79EA74699210CDA7981
    @Test
    void testV1PersistentVolumeClaimCondition() {
        V1PersistentVolumeClaimCondition condition = new V1PersistentVolumeClaimCondition();
        assertNotNull(condition);
    }

    //BaseRock generated method id: ${testLastProbeTime}, hash: 519014C8258B9C701DC614A15A5DFA19
    @Test
    void testLastProbeTime() {
        OffsetDateTime now = OffsetDateTime.now();
        V1PersistentVolumeClaimCondition condition = new V1PersistentVolumeClaimCondition().lastProbeTime(now);
        assertEquals(now, condition.getLastProbeTime());
    }

    //BaseRock generated method id: ${testLastTransitionTime}, hash: 72CFB9714112A798F16A4E420047AB51
    @Test
    void testLastTransitionTime() {
        OffsetDateTime now = OffsetDateTime.now();
        V1PersistentVolumeClaimCondition condition = new V1PersistentVolumeClaimCondition().lastTransitionTime(now);
        assertEquals(now, condition.getLastTransitionTime());
    }

    //BaseRock generated method id: ${testMessage}, hash: BBE61301219741BC7817334F0B7BD42A
    @Test
    void testMessage() {
        String message = "Test message";
        V1PersistentVolumeClaimCondition condition = new V1PersistentVolumeClaimCondition().message(message);
        assertEquals(message, condition.getMessage());
    }

    //BaseRock generated method id: ${testReason}, hash: 60F12BC63A7537EE89858A92D06857C3
    @Test
    void testReason() {
        String reason = "Test reason";
        V1PersistentVolumeClaimCondition condition = new V1PersistentVolumeClaimCondition().reason(reason);
        assertEquals(reason, condition.getReason());
    }

    //BaseRock generated method id: ${testStatus}, hash: A10AF58944043051EC810115F5158667
    @Test
    void testStatus() {
        String status = "True";
        V1PersistentVolumeClaimCondition condition = new V1PersistentVolumeClaimCondition().status(status);
        assertEquals(status, condition.getStatus());
    }

    //BaseRock generated method id: ${testType}, hash: 7E2FA36613F4B1040248262688CA234C
    @Test
    void testType() {
        String type = "Resizing";
        V1PersistentVolumeClaimCondition condition = new V1PersistentVolumeClaimCondition().type(type);
        assertEquals(type, condition.getType());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: D072FC42159129EF251B99D3C60E9162
    @Test
    void testEqualsAndHashCode() {
        OffsetDateTime now = OffsetDateTime.now();
        V1PersistentVolumeClaimCondition condition1 = new V1PersistentVolumeClaimCondition().lastProbeTime(now).lastTransitionTime(now).message("Test message").reason("Test reason").status("True").type("Resizing");
        V1PersistentVolumeClaimCondition condition2 = new V1PersistentVolumeClaimCondition().lastProbeTime(now).lastTransitionTime(now).message("Test message").reason("Test reason").status("True").type("Resizing");
        assertThat(condition1, is(equalTo(condition2)));
        assertThat(condition1.hashCode(), is(equalTo(condition2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: B13FF291DC8E45B8A8F4F67E99BBDAD4
    @Test
    void testToString() {
        V1PersistentVolumeClaimCondition condition = new V1PersistentVolumeClaimCondition().lastProbeTime(OffsetDateTime.now()).lastTransitionTime(OffsetDateTime.now()).message("Test message").reason("Test reason").status("True").type("Resizing");
        String toString = condition.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("lastProbeTime"), is(true));
        assertThat(toString.contains("lastTransitionTime"), is(true));
        assertThat(toString.contains("message"), is(true));
        assertThat(toString.contains("reason"), is(true));
        assertThat(toString.contains("status"), is(true));
        assertThat(toString.contains("type"), is(true));
    }
}
