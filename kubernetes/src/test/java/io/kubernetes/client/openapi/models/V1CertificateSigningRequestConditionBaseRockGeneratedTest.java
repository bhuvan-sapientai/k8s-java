package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition;
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
class V1CertificateSigningRequestConditionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: A3A77C7CB61B2A41C820E5631D9975DF
    @Test
    void testConstructor() {
        V1CertificateSigningRequestCondition condition = new V1CertificateSigningRequestCondition();
        assertNotNull(condition);
    }

    //BaseRock generated method id: ${testLastTransitionTime}, hash: ED413043CF4EA6CD6F6581E881D48448
    @Test
    void testLastTransitionTime() {
        OffsetDateTime now = OffsetDateTime.now();
        V1CertificateSigningRequestCondition condition = new V1CertificateSigningRequestCondition().lastTransitionTime(now);
        assertEquals(now, condition.getLastTransitionTime());
    }

    //BaseRock generated method id: ${testLastUpdateTime}, hash: 138B379BE1DD824ABE011A4E55C3276D
    @Test
    void testLastUpdateTime() {
        OffsetDateTime now = OffsetDateTime.now();
        V1CertificateSigningRequestCondition condition = new V1CertificateSigningRequestCondition().lastUpdateTime(now);
        assertEquals(now, condition.getLastUpdateTime());
    }

    //BaseRock generated method id: ${testMessage}, hash: 4FF4EAB9FF2214C451C36211FDD324A9
    @Test
    void testMessage() {
        String message = "Test message";
        V1CertificateSigningRequestCondition condition = new V1CertificateSigningRequestCondition().message(message);
        assertEquals(message, condition.getMessage());
    }

    //BaseRock generated method id: ${testReason}, hash: 8BFB3E80EA8A032A4142A4B90896AB82
    @Test
    void testReason() {
        String reason = "Test reason";
        V1CertificateSigningRequestCondition condition = new V1CertificateSigningRequestCondition().reason(reason);
        assertEquals(reason, condition.getReason());
    }

    //BaseRock generated method id: ${testStatus}, hash: B81DDC2F082CD6F03D59C80D04163B80
    @Test
    void testStatus() {
        String status = "True";
        V1CertificateSigningRequestCondition condition = new V1CertificateSigningRequestCondition().status(status);
        assertEquals(status, condition.getStatus());
    }

    //BaseRock generated method id: ${testType}, hash: 05FCE47856116E30E976C545E46BC068
    @Test
    void testType() {
        String type = "Approved";
        V1CertificateSigningRequestCondition condition = new V1CertificateSigningRequestCondition().type(type);
        assertEquals(type, condition.getType());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: D3CFC65E24FEB1D98DA4080C1CFD6318
    @Test
    void testEqualsAndHashCode() {
        OffsetDateTime now = OffsetDateTime.now();
        V1CertificateSigningRequestCondition condition1 = new V1CertificateSigningRequestCondition().lastTransitionTime(now).lastUpdateTime(now).message("Test message").reason("Test reason").status("True").type("Approved");
        V1CertificateSigningRequestCondition condition2 = new V1CertificateSigningRequestCondition().lastTransitionTime(now).lastUpdateTime(now).message("Test message").reason("Test reason").status("True").type("Approved");
        assertThat(condition1, is(equalTo(condition2)));
        assertThat(condition1.hashCode(), is(equalTo(condition2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: F62C6B0A1AF2A318F40FADCC76CAAAFB
    @Test
    void testToString() {
        OffsetDateTime now = OffsetDateTime.now();
        V1CertificateSigningRequestCondition condition = new V1CertificateSigningRequestCondition().lastTransitionTime(now).lastUpdateTime(now).message("Test message").reason("Test reason").status("True").type("Approved");
        String toString = condition.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("lastTransitionTime"), is(true));
        assertThat(toString.contains("lastUpdateTime"), is(true));
        assertThat(toString.contains("message"), is(true));
        assertThat(toString.contains("reason"), is(true));
        assertThat(toString.contains("status"), is(true));
        assertThat(toString.contains("type"), is(true));
    }
}
