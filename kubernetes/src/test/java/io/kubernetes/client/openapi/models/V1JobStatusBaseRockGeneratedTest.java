package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.OffsetDateTime;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1JobStatusBaseRockGeneratedTest {

    private V1JobStatus jobStatus;

    @BeforeEach
    void setUp() {
        jobStatus = new V1JobStatus();
    }

    //BaseRock generated method id: ${testActiveGetterAndSetter}, hash: A026153D26793D4065F6EF4B0414E075
    @Test
    void testActiveGetterAndSetter() {
        Integer active = 5;
        jobStatus.setActive(active);
        assertEquals(active, jobStatus.getActive());
    }

    //BaseRock generated method id: ${testCompletedIndexesGetterAndSetter}, hash: 3164339DFCAF174F2E284CA0958EAE60
    @Test
    void testCompletedIndexesGetterAndSetter() {
        String completedIndexes = "1,3-5,7";
        jobStatus.setCompletedIndexes(completedIndexes);
        assertEquals(completedIndexes, jobStatus.getCompletedIndexes());
    }

    //BaseRock generated method id: ${testCompletionTimeGetterAndSetter}, hash: 10898B288A1D930A16CF6B011A94CA3A
    @Test
    void testCompletionTimeGetterAndSetter() {
        OffsetDateTime completionTime = OffsetDateTime.now();
        jobStatus.setCompletionTime(completionTime);
        assertEquals(completionTime, jobStatus.getCompletionTime());
    }

    //BaseRock generated method id: ${testConditionsGetterAndSetter}, hash: 4B56DBF71580D6382C337B1A075DD625
    @Test
    void testConditionsGetterAndSetter() {
        List<V1JobCondition> conditions = new ArrayList<>();
        V1JobCondition condition = mock(V1JobCondition.class);
        conditions.add(condition);
        jobStatus.setConditions(conditions);
        assertEquals(conditions, jobStatus.getConditions());
    }

    //BaseRock generated method id: ${testAddConditionsItem}, hash: 3233F23FD3C64AFB8ED2DE5B7B0FBABA
    @Test
    void testAddConditionsItem() {
        V1JobCondition condition = mock(V1JobCondition.class);
        jobStatus.addConditionsItem(condition);
        assertTrue(jobStatus.getConditions().contains(condition));
    }

    //BaseRock generated method id: ${testFailedGetterAndSetter}, hash: 5E70C9E398A961404715985F502729E6
    @Test
    void testFailedGetterAndSetter() {
        Integer failed = 2;
        jobStatus.setFailed(failed);
        assertEquals(failed, jobStatus.getFailed());
    }

    //BaseRock generated method id: ${testFailedIndexesGetterAndSetter}, hash: 63122C6692D6C5A7DA4F06C8B8247AF0
    @Test
    void testFailedIndexesGetterAndSetter() {
        String failedIndexes = "2,6";
        jobStatus.setFailedIndexes(failedIndexes);
        assertEquals(failedIndexes, jobStatus.getFailedIndexes());
    }

    //BaseRock generated method id: ${testReadyGetterAndSetter}, hash: 5602408A60856560CC820444BDF5C7AB
    @Test
    void testReadyGetterAndSetter() {
        Integer ready = 3;
        jobStatus.setReady(ready);
        assertEquals(ready, jobStatus.getReady());
    }

    //BaseRock generated method id: ${testStartTimeGetterAndSetter}, hash: 15241CF82A419CA9040DE07E1FB3F897
    @Test
    void testStartTimeGetterAndSetter() {
        OffsetDateTime startTime = OffsetDateTime.now();
        jobStatus.setStartTime(startTime);
        assertEquals(startTime, jobStatus.getStartTime());
    }

    //BaseRock generated method id: ${testSucceededGetterAndSetter}, hash: 1FE1B1C2EAB8335129DA3D7AC8AF882E
    @Test
    void testSucceededGetterAndSetter() {
        Integer succeeded = 4;
        jobStatus.setSucceeded(succeeded);
        assertEquals(succeeded, jobStatus.getSucceeded());
    }

    //BaseRock generated method id: ${testTerminatingGetterAndSetter}, hash: E5F081B9C527A26E8F2F8A8B8667E852
    @Test
    void testTerminatingGetterAndSetter() {
        Integer terminating = 1;
        jobStatus.setTerminating(terminating);
        assertEquals(terminating, jobStatus.getTerminating());
    }

    //BaseRock generated method id: ${testUncountedTerminatedPodsGetterAndSetter}, hash: A51626B3EBCA3B34768ECE7D2ECC927C
    @Test
    void testUncountedTerminatedPodsGetterAndSetter() {
        V1UncountedTerminatedPods uncountedTerminatedPods = mock(V1UncountedTerminatedPods.class);
        jobStatus.setUncountedTerminatedPods(uncountedTerminatedPods);
        assertEquals(uncountedTerminatedPods, jobStatus.getUncountedTerminatedPods());
    }

    //BaseRock generated method id: ${testEquals}, hash: CF7DB73712D221E6680BE8933EACA048
    @Test
    void testEquals() {
        V1JobStatus jobStatus1 = new V1JobStatus().active(1).completedIndexes("1,2").completionTime(OffsetDateTime.now()).failed(2).failedIndexes("3,4").ready(3).startTime(OffsetDateTime.now()).succeeded(4).terminating(5);
        V1JobStatus jobStatus2 = new V1JobStatus().active(1).completedIndexes("1,2").completionTime(jobStatus1.getCompletionTime()).failed(2).failedIndexes("3,4").ready(3).startTime(jobStatus1.getStartTime()).succeeded(4).terminating(5);
        assertEquals(jobStatus1, jobStatus2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: D38C8C2C97CAE02C12274C7ADC68C44E
    @Test
    void testHashCode() {
        V1JobStatus jobStatus1 = new V1JobStatus().active(1).completedIndexes("1,2").failed(2).failedIndexes("3,4").ready(3).succeeded(4).terminating(5);
        V1JobStatus jobStatus2 = new V1JobStatus().active(1).completedIndexes("1,2").failed(2).failedIndexes("3,4").ready(3).succeeded(4).terminating(5);
        assertEquals(jobStatus1.hashCode(), jobStatus2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 4D46A0E61D955CFB30B2F544169950DF
    @Test
    void testToString() {
        V1JobStatus jobStatus = new V1JobStatus().active(1).completedIndexes("1,2").failed(2).failedIndexes("3,4").ready(3).succeeded(4).terminating(5);
        String expected = "class V1JobStatus {\n" + "    active: 1\n" + "    completedIndexes: 1,2\n" + "    completionTime: null\n" + "    conditions: []\n" + "    failed: 2\n" + "    failedIndexes: 3,4\n" + "    ready: 3\n" + "    startTime: null\n" + "    succeeded: 4\n" + "    terminating: 5\n" + "    uncountedTerminatedPods: null\n" + "}";
        assertEquals(expected, jobStatus.toString());
    }

    //BaseRock generated method id: ${testActiveWithDifferentValues}, hash: 3B4A139C1D21E2820F3FEF68D4FEA55D
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 10, 100 })
    void testActiveWithDifferentValues(int value) {
        jobStatus.setActive(value);
        assertEquals(value, jobStatus.getActive());
    }

    //BaseRock generated method id: ${testNullValues}, hash: 33E84020A6BB22CF80AFEF621E05F187
    @Test
    void testNullValues() {
        assertNull(jobStatus.getActive());
        assertNull(jobStatus.getCompletedIndexes());
        assertNull(jobStatus.getCompletionTime());
        assertNotNull(jobStatus.getConditions());
        assertTrue(jobStatus.getConditions().isEmpty());
        assertNull(jobStatus.getFailed());
        assertNull(jobStatus.getFailedIndexes());
        assertNull(jobStatus.getReady());
        assertNull(jobStatus.getStartTime());
        assertNull(jobStatus.getSucceeded());
        assertNull(jobStatus.getTerminating());
        assertNull(jobStatus.getUncountedTerminatedPods());
    }
}
