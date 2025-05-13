package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha1StorageVersionConditionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1alpha1StorageVersionConditionCreation}, hash: D15F9252E2651813AED5F39438CA6649
    @Test
    void testV1alpha1StorageVersionConditionCreation() {
        V1alpha1StorageVersionCondition condition = new V1alpha1StorageVersionCondition();
        assertNotNull(condition);
    }

    //BaseRock generated method id: ${testLastTransitionTime}, hash: 516C0CB6226309A5B30EC69D80E45DF6
    @Test
    void testLastTransitionTime() {
        OffsetDateTime now = OffsetDateTime.now();
        V1alpha1StorageVersionCondition condition = new V1alpha1StorageVersionCondition().lastTransitionTime(now);
        assertEquals(now, condition.getLastTransitionTime());
    }

    //BaseRock generated method id: ${testMessage}, hash: 1FD78272D067FD830ACE6A17D2271B64
    @Test
    void testMessage() {
        String message = "Test message";
        V1alpha1StorageVersionCondition condition = new V1alpha1StorageVersionCondition().message(message);
        assertEquals(message, condition.getMessage());
    }

    //BaseRock generated method id: ${testObservedGeneration}, hash: 9D63157D0295747E461EACA9713C40A2
    @Test
    void testObservedGeneration() {
        Long generation = 42L;
        V1alpha1StorageVersionCondition condition = new V1alpha1StorageVersionCondition().observedGeneration(generation);
        assertEquals(generation, condition.getObservedGeneration());
    }

    //BaseRock generated method id: ${testReason}, hash: 56E0B01ED30B59520EC6A6990A6D5904
    @Test
    void testReason() {
        String reason = "Test reason";
        V1alpha1StorageVersionCondition condition = new V1alpha1StorageVersionCondition().reason(reason);
        assertEquals(reason, condition.getReason());
    }

    //BaseRock generated method id: ${testStatus}, hash: BD654A16E9B1C727DFC5525509624D70
    @Test
    void testStatus() {
        String status = "True";
        V1alpha1StorageVersionCondition condition = new V1alpha1StorageVersionCondition().status(status);
        assertEquals(status, condition.getStatus());
    }

    //BaseRock generated method id: ${testType}, hash: 2E440999170C7A9EF89F0CC405CA139C
    @Test
    void testType() {
        String type = "Available";
        V1alpha1StorageVersionCondition condition = new V1alpha1StorageVersionCondition().type(type);
        assertEquals(type, condition.getType());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 2994399502870688931A0BFB67C14C71
    @Test
    void testEqualsAndHashCode() {
        OffsetDateTime now = OffsetDateTime.now();
        V1alpha1StorageVersionCondition condition1 = new V1alpha1StorageVersionCondition().lastTransitionTime(now).message("Test message").observedGeneration(42L).reason("Test reason").status("True").type("Available");
        V1alpha1StorageVersionCondition condition2 = new V1alpha1StorageVersionCondition().lastTransitionTime(now).message("Test message").observedGeneration(42L).reason("Test reason").status("True").type("Available");
        assertThat(condition1, is(equalTo(condition2)));
        assertThat(condition1.hashCode(), is(equalTo(condition2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: A4FBA0A9BCADECADC4D2D0A48500ED8F
    @Test
    void testToString() {
        OffsetDateTime now = OffsetDateTime.now();
        V1alpha1StorageVersionCondition condition = new V1alpha1StorageVersionCondition().lastTransitionTime(now).message("Test message").observedGeneration(42L).reason("Test reason").status("True").type("Available");
        String toString = condition.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("lastTransitionTime"), is(true));
        assertThat(toString.contains("message"), is(true));
        assertThat(toString.contains("observedGeneration"), is(true));
        assertThat(toString.contains("reason"), is(true));
        assertThat(toString.contains("status"), is(true));
        assertThat(toString.contains("type"), is(true));
    }
}
