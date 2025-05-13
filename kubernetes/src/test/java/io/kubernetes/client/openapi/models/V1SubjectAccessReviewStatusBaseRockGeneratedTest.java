package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatus;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1SubjectAccessReviewStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 05CFC7314A80F3F9A20BD8DEF7F81AE7
    @Test
    void testConstructor() {
        V1SubjectAccessReviewStatus status = new V1SubjectAccessReviewStatus();
        assertNotNull(status);
    }

    //BaseRock generated method id: ${testAllowedGetter}, hash: AD3EC8D71C42A73669AE30C7317A06BF
    @Test
    void testAllowedGetter() {
        V1SubjectAccessReviewStatus status = new V1SubjectAccessReviewStatus();
        assertThat(status.getAllowed(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAllowedSetter}, hash: 31D16BEBA928C5243BE54B15015CF199
    @Test
    void testAllowedSetter() {
        V1SubjectAccessReviewStatus status = new V1SubjectAccessReviewStatus();
        status.setAllowed(true);
        assertTrue(status.getAllowed());
    }

    //BaseRock generated method id: ${testAllowedFluentSetter}, hash: 70CC23977295F8765D2AFF721D8BCDAC
    @Test
    void testAllowedFluentSetter() {
        V1SubjectAccessReviewStatus status = new V1SubjectAccessReviewStatus().allowed(true);
        assertTrue(status.getAllowed());
    }

    //BaseRock generated method id: ${testDeniedGetter}, hash: 2117F753D4A34F6205AAA0CE538C0E81
    @Test
    void testDeniedGetter() {
        V1SubjectAccessReviewStatus status = new V1SubjectAccessReviewStatus();
        assertThat(status.getDenied(), is(nullValue()));
    }

    //BaseRock generated method id: ${testDeniedSetter}, hash: 45F44486C66B420778D2B9E6A2AF1504
    @Test
    void testDeniedSetter() {
        V1SubjectAccessReviewStatus status = new V1SubjectAccessReviewStatus();
        status.setDenied(true);
        assertTrue(status.getDenied());
    }

    //BaseRock generated method id: ${testDeniedFluentSetter}, hash: D28EE9477A249E5C710290116DC59786
    @Test
    void testDeniedFluentSetter() {
        V1SubjectAccessReviewStatus status = new V1SubjectAccessReviewStatus().denied(true);
        assertTrue(status.getDenied());
    }

    //BaseRock generated method id: ${testEvaluationErrorGetter}, hash: 4778326230C3FFEA346CDD807AE078A7
    @Test
    void testEvaluationErrorGetter() {
        V1SubjectAccessReviewStatus status = new V1SubjectAccessReviewStatus();
        assertThat(status.getEvaluationError(), is(nullValue()));
    }

    //BaseRock generated method id: ${testEvaluationErrorSetter}, hash: C4957D506D338858D121905AAD97A84F
    @Test
    void testEvaluationErrorSetter() {
        V1SubjectAccessReviewStatus status = new V1SubjectAccessReviewStatus();
        status.setEvaluationError("Some error");
        assertEquals("Some error", status.getEvaluationError());
    }

    //BaseRock generated method id: ${testEvaluationErrorFluentSetter}, hash: F0FB6A49643593257E05B395D7B6A2ED
    @Test
    void testEvaluationErrorFluentSetter() {
        V1SubjectAccessReviewStatus status = new V1SubjectAccessReviewStatus().evaluationError("Some error");
        assertEquals("Some error", status.getEvaluationError());
    }

    //BaseRock generated method id: ${testReasonGetter}, hash: E0AA686CC218A1952FE2E687CF3CDB06
    @Test
    void testReasonGetter() {
        V1SubjectAccessReviewStatus status = new V1SubjectAccessReviewStatus();
        assertThat(status.getReason(), is(nullValue()));
    }

    //BaseRock generated method id: ${testReasonSetter}, hash: 191FDBF960CF1B2670FD229E993F2634
    @Test
    void testReasonSetter() {
        V1SubjectAccessReviewStatus status = new V1SubjectAccessReviewStatus();
        status.setReason("Some reason");
        assertEquals("Some reason", status.getReason());
    }

    //BaseRock generated method id: ${testReasonFluentSetter}, hash: 4601DB2D83DB3CACC3B07C49E10728AD
    @Test
    void testReasonFluentSetter() {
        V1SubjectAccessReviewStatus status = new V1SubjectAccessReviewStatus().reason("Some reason");
        assertEquals("Some reason", status.getReason());
    }

    //BaseRock generated method id: ${testEquals}, hash: F09997BBEDD36EBCC45F03868DDE2866
    @Test
    void testEquals() {
        V1SubjectAccessReviewStatus status1 = new V1SubjectAccessReviewStatus().allowed(true).denied(false).evaluationError("Error").reason("Reason");
        V1SubjectAccessReviewStatus status2 = new V1SubjectAccessReviewStatus().allowed(true).denied(false).evaluationError("Error").reason("Reason");
        assertTrue(status1.equals(status2));
        assertTrue(status2.equals(status1));
    }

    //BaseRock generated method id: ${testNotEquals}, hash: 5BB51F40A8B904E9771731FCDBA87784
    @Test
    void testNotEquals() {
        V1SubjectAccessReviewStatus status1 = new V1SubjectAccessReviewStatus().allowed(true).denied(false).evaluationError("Error").reason("Reason");
        V1SubjectAccessReviewStatus status2 = new V1SubjectAccessReviewStatus().allowed(false).denied(true).evaluationError("Different Error").reason("Different Reason");
        assertFalse(status1.equals(status2));
        assertFalse(status2.equals(status1));
    }

    //BaseRock generated method id: ${testHashCode}, hash: C3B751BACCE1A0CCD36E626BA318FEBA
    @Test
    void testHashCode() {
        V1SubjectAccessReviewStatus status1 = new V1SubjectAccessReviewStatus().allowed(true).denied(false).evaluationError("Error").reason("Reason");
        V1SubjectAccessReviewStatus status2 = new V1SubjectAccessReviewStatus().allowed(true).denied(false).evaluationError("Error").reason("Reason");
        assertEquals(status1.hashCode(), status2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: A586130DAC6F47854C5FC8DE855EFE44
    @Test
    void testToString() {
        V1SubjectAccessReviewStatus status = new V1SubjectAccessReviewStatus().allowed(true).denied(false).evaluationError("Error").reason("Reason");
        String expectedString = "class V1SubjectAccessReviewStatus {\n" + "    allowed: true\n" + "    denied: false\n" + "    evaluationError: Error\n" + "    reason: Reason\n" + "}";
        assertEquals(expectedString, status.toString());
    }
}
