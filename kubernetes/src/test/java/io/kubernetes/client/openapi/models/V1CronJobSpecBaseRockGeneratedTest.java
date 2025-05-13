package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1JobTemplateSpec;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.mockito.Mockito.when;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CronJobSpecBaseRockGeneratedTest {

    private V1CronJobSpec v1CronJobSpec;

    @BeforeEach
    void setUp() {
        v1CronJobSpec = new V1CronJobSpec();
    }

    //BaseRock generated method id: ${testConstructor}, hash: BBD52D61B8932E31D99972465B9BCC5D
    @Test
    void testConstructor() {
        assertThat(v1CronJobSpec, is(notNullValue()));
    }

    //BaseRock generated method id: ${testConcurrencyPolicy}, hash: 05ACE5C3C601B7C0E85CB57868D52559
    @Test
    void testConcurrencyPolicy() {
        String concurrencyPolicy = "Allow";
        v1CronJobSpec.concurrencyPolicy(concurrencyPolicy);
        assertThat(v1CronJobSpec.getConcurrencyPolicy(), is(equalTo(concurrencyPolicy)));
    }

    //BaseRock generated method id: ${testFailedJobsHistoryLimit}, hash: 75C40B8287B6011898A5F91540594016
    @Test
    void testFailedJobsHistoryLimit() {
        Integer failedJobsHistoryLimit = 5;
        v1CronJobSpec.failedJobsHistoryLimit(failedJobsHistoryLimit);
        assertThat(v1CronJobSpec.getFailedJobsHistoryLimit(), is(equalTo(failedJobsHistoryLimit)));
    }

    //BaseRock generated method id: ${testJobTemplate}, hash: 2F938F0C069EA3A8D40DEBA06FCE733F
    @Test
    void testJobTemplate() {
        V1JobTemplateSpec jobTemplate = mock(V1JobTemplateSpec.class);
        v1CronJobSpec.jobTemplate(jobTemplate);
        assertThat(v1CronJobSpec.getJobTemplate(), is(equalTo(jobTemplate)));
    }

    //BaseRock generated method id: ${testSchedule}, hash: 24B5082EBDEFD7F52631E7C7BF947780
    @Test
    void testSchedule() {
        String schedule = "* * * * *";
        v1CronJobSpec.schedule(schedule);
        assertThat(v1CronJobSpec.getSchedule(), is(equalTo(schedule)));
    }

    //BaseRock generated method id: ${testStartingDeadlineSeconds}, hash: 365B6C98E527C4EF4090268A6E86C81B
    @Test
    void testStartingDeadlineSeconds() {
        Long startingDeadlineSeconds = 60L;
        v1CronJobSpec.startingDeadlineSeconds(startingDeadlineSeconds);
        assertThat(v1CronJobSpec.getStartingDeadlineSeconds(), is(equalTo(startingDeadlineSeconds)));
    }

    //BaseRock generated method id: ${testSuccessfulJobsHistoryLimit}, hash: 76296CE848A8AB8CB575500DB62FA73A
    @Test
    void testSuccessfulJobsHistoryLimit() {
        Integer successfulJobsHistoryLimit = 3;
        v1CronJobSpec.successfulJobsHistoryLimit(successfulJobsHistoryLimit);
        assertThat(v1CronJobSpec.getSuccessfulJobsHistoryLimit(), is(equalTo(successfulJobsHistoryLimit)));
    }

    //BaseRock generated method id: ${testSuspend}, hash: 39554EED277FC27FB9A3AC98F5DF2F99
    @Test
    void testSuspend() {
        Boolean suspend = true;
        v1CronJobSpec.suspend(suspend);
        assertThat(v1CronJobSpec.getSuspend(), is(equalTo(suspend)));
    }

    //BaseRock generated method id: ${testTimeZone}, hash: C0221BF7EEE542208E674F1523CBC438
    @Test
    void testTimeZone() {
        String timeZone = "UTC";
        v1CronJobSpec.timeZone(timeZone);
        assertThat(v1CronJobSpec.getTimeZone(), is(equalTo(timeZone)));
    }

    //BaseRock generated method id: ${testEquals}, hash: E6C80C83A82292F85AF354651F845C60
    @Test
    void testEquals() {
        V1JobTemplateSpec jobTemplate1 = mock(V1JobTemplateSpec.class);
        V1JobTemplateSpec jobTemplate2 = mock(V1JobTemplateSpec.class);
        V1CronJobSpec spec1 = new V1CronJobSpec().concurrencyPolicy("Allow").failedJobsHistoryLimit(5).jobTemplate(jobTemplate1).schedule("* * * * *").startingDeadlineSeconds(60L).successfulJobsHistoryLimit(3).suspend(true).timeZone("UTC");
        V1CronJobSpec spec2 = new V1CronJobSpec().concurrencyPolicy("Allow").failedJobsHistoryLimit(5).jobTemplate(// Use the same jobTemplate instance
        jobTemplate1).schedule("* * * * *").startingDeadlineSeconds(60L).successfulJobsHistoryLimit(3).suspend(true).timeZone("UTC");
        assertThat(spec1.equals(spec2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 2A7AFB0ACD5A4A00133C5B53F5B704B5
    @Test
    void testHashCode() {
        V1JobTemplateSpec jobTemplate = mock(V1JobTemplateSpec.class);
        V1CronJobSpec spec = new V1CronJobSpec().concurrencyPolicy("Allow").failedJobsHistoryLimit(5).jobTemplate(jobTemplate).schedule("* * * * *").startingDeadlineSeconds(60L).successfulJobsHistoryLimit(3).suspend(true).timeZone("UTC");
        int hashCode1 = spec.hashCode();
        int hashCode2 = spec.hashCode();
        assertThat(hashCode1, is(equalTo(hashCode2)));
    }

    //BaseRock generated method id: ${testToString}, hash: 4F3433281DBCDDB6BF42008A308FC527
    @Test
    void testToString() {
        V1JobTemplateSpec jobTemplate = mock(V1JobTemplateSpec.class);
        when(jobTemplate.toString()).thenReturn("MockedJobTemplateSpec");
        v1CronJobSpec.concurrencyPolicy("Allow").failedJobsHistoryLimit(5).jobTemplate(jobTemplate).schedule("* * * * *").startingDeadlineSeconds(60L).successfulJobsHistoryLimit(3).suspend(true).timeZone("UTC");
        String expected = "class V1CronJobSpec {\n" + "    concurrencyPolicy: Allow\n" + "    failedJobsHistoryLimit: 5\n" + "    jobTemplate: MockedJobTemplateSpec\n" + "    schedule: * * * * *\n" + "    startingDeadlineSeconds: 60\n" + "    successfulJobsHistoryLimit: 3\n" + "    suspend: true\n" + "    timeZone: UTC\n" + "}";
        assertThat(v1CronJobSpec.toString(), is(equalTo(expected)));
    }

    //BaseRock generated method id: ${testValidConcurrencyPolicies}, hash: C11DAB2A157EE35B00D90FCE4842E6F4
    @ParameterizedTest
    @ValueSource(strings = { "Allow", "Forbid", "Replace" })
    void testValidConcurrencyPolicies(String policy) {
        v1CronJobSpec.concurrencyPolicy(policy);
        assertThat(v1CronJobSpec.getConcurrencyPolicy(), is(equalTo(policy)));
    }

    //BaseRock generated method id: ${testNullConcurrencyPolicy}, hash: 52B81D50CF72761D3F6761552683EB58
    @Test
    void testNullConcurrencyPolicy() {
        v1CronJobSpec.concurrencyPolicy(null);
        assertThat(v1CronJobSpec.getConcurrencyPolicy(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNegativeFailedJobsHistoryLimit}, hash: 51CB1CC8FDB2C352D5F312F50299C6C1
    @Test
    void testNegativeFailedJobsHistoryLimit() {
        v1CronJobSpec.failedJobsHistoryLimit(-1);
        assertThat(v1CronJobSpec.getFailedJobsHistoryLimit(), is(equalTo(-1)));
    }

    //BaseRock generated method id: ${testZeroFailedJobsHistoryLimit}, hash: 37E1526E30575232EB5C37147F3DFE55
    @Test
    void testZeroFailedJobsHistoryLimit() {
        v1CronJobSpec.failedJobsHistoryLimit(0);
        assertThat(v1CronJobSpec.getFailedJobsHistoryLimit(), is(equalTo(0)));
    }

    //BaseRock generated method id: ${testNullJobTemplate}, hash: 57A52D9181A993C1A414DD5BFCE7C870
    @Test
    void testNullJobTemplate() {
        v1CronJobSpec.jobTemplate(null);
        assertThat(v1CronJobSpec.getJobTemplate(), is(nullValue()));
    }

    //BaseRock generated method id: ${testEmptySchedule}, hash: 1D7D546FED4910E534AE3A8AB12E7D1A
    @Test
    void testEmptySchedule() {
        v1CronJobSpec.schedule("");
        assertThat(v1CronJobSpec.getSchedule(), is(equalTo("")));
    }

    //BaseRock generated method id: ${testNegativeStartingDeadlineSeconds}, hash: B0158502D7AE5CE447FB017A4EE15CD7
    @Test
    void testNegativeStartingDeadlineSeconds() {
        v1CronJobSpec.startingDeadlineSeconds(-1L);
        assertThat(v1CronJobSpec.getStartingDeadlineSeconds(), is(equalTo(-1L)));
    }

    //BaseRock generated method id: ${testZeroStartingDeadlineSeconds}, hash: 47B12748269AC5CCDD7A6DAA2938D643
    @Test
    void testZeroStartingDeadlineSeconds() {
        v1CronJobSpec.startingDeadlineSeconds(0L);
        assertThat(v1CronJobSpec.getStartingDeadlineSeconds(), is(equalTo(0L)));
    }

    //BaseRock generated method id: ${testNegativeSuccessfulJobsHistoryLimit}, hash: ABEC57BDFCB737DA868CC5CC1FB847B9
    @Test
    void testNegativeSuccessfulJobsHistoryLimit() {
        v1CronJobSpec.successfulJobsHistoryLimit(-1);
        assertThat(v1CronJobSpec.getSuccessfulJobsHistoryLimit(), is(equalTo(-1)));
    }

    //BaseRock generated method id: ${testZeroSuccessfulJobsHistoryLimit}, hash: A67323E4D150983157442652944357DF
    @Test
    void testZeroSuccessfulJobsHistoryLimit() {
        v1CronJobSpec.successfulJobsHistoryLimit(0);
        assertThat(v1CronJobSpec.getSuccessfulJobsHistoryLimit(), is(equalTo(0)));
    }

    //BaseRock generated method id: ${testNullSuspend}, hash: BB72D1F4CD91BEEF2B2F6C0818A44139
    @Test
    void testNullSuspend() {
        v1CronJobSpec.suspend(null);
        assertThat(v1CronJobSpec.getSuspend(), is(nullValue()));
    }

    //BaseRock generated method id: ${testEmptyTimeZone}, hash: 27A1D509BBFFD38A05EBA6F8827CBB29
    @Test
    void testEmptyTimeZone() {
        v1CronJobSpec.timeZone("");
        assertThat(v1CronJobSpec.getTimeZone(), is(equalTo("")));
    }
}
