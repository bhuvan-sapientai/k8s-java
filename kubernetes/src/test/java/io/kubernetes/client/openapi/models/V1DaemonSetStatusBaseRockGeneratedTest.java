package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1DaemonSetCondition;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1DaemonSetStatusBaseRockGeneratedTest {

    private V1DaemonSetStatus v1DaemonSetStatus;

    @BeforeEach
    void setUp() {
        v1DaemonSetStatus = new V1DaemonSetStatus();
    }

    //BaseRock generated method id: ${testCollisionCount}, hash: FE9114628FE644DE187E7FDB930E62BF
    @Test
    void testCollisionCount() {
        Integer collisionCount = 5;
        v1DaemonSetStatus.setCollisionCount(collisionCount);
        assertEquals(collisionCount, v1DaemonSetStatus.getCollisionCount());
    }

    //BaseRock generated method id: ${testConditions}, hash: BD06DA8B59CFB1A170B81846C42224CD
    @Test
    void testConditions() {
        List<V1DaemonSetCondition> conditions = new ArrayList<>();
        V1DaemonSetCondition condition = mock(V1DaemonSetCondition.class);
        conditions.add(condition);
        v1DaemonSetStatus.setConditions(conditions);
        assertEquals(conditions, v1DaemonSetStatus.getConditions());
    }

    //BaseRock generated method id: ${testAddConditionsItem}, hash: CFBB70395DFCD0319276B3E84D2AF5C9
    @Test
    void testAddConditionsItem() {
        V1DaemonSetCondition condition = mock(V1DaemonSetCondition.class);
        v1DaemonSetStatus.addConditionsItem(condition);
        assertThat(v1DaemonSetStatus.getConditions(), hasSize(1));
        assertThat(v1DaemonSetStatus.getConditions().get(0), is(condition));
    }

    //BaseRock generated method id: ${testCurrentNumberScheduled}, hash: B9709F86E5BAD72B76F3325C18994E7C
    @Test
    void testCurrentNumberScheduled() {
        Integer currentNumberScheduled = 10;
        v1DaemonSetStatus.setCurrentNumberScheduled(currentNumberScheduled);
        assertEquals(currentNumberScheduled, v1DaemonSetStatus.getCurrentNumberScheduled());
    }

    //BaseRock generated method id: ${testDesiredNumberScheduled}, hash: 11C79CC39A9562CBAF6B35B84AF561D7
    @Test
    void testDesiredNumberScheduled() {
        Integer desiredNumberScheduled = 15;
        v1DaemonSetStatus.setDesiredNumberScheduled(desiredNumberScheduled);
        assertEquals(desiredNumberScheduled, v1DaemonSetStatus.getDesiredNumberScheduled());
    }

    //BaseRock generated method id: ${testNumberAvailable}, hash: 805D25C0E2B400F5F02CD90E886D4587
    @Test
    void testNumberAvailable() {
        Integer numberAvailable = 8;
        v1DaemonSetStatus.setNumberAvailable(numberAvailable);
        assertEquals(numberAvailable, v1DaemonSetStatus.getNumberAvailable());
    }

    //BaseRock generated method id: ${testNumberMisscheduled}, hash: D0ED247055CE7CCEE8BAEBA8B52B1C89
    @Test
    void testNumberMisscheduled() {
        Integer numberMisscheduled = 2;
        v1DaemonSetStatus.setNumberMisscheduled(numberMisscheduled);
        assertEquals(numberMisscheduled, v1DaemonSetStatus.getNumberMisscheduled());
    }

    //BaseRock generated method id: ${testNumberReady}, hash: 5E5488F9AB11A5E34959412AC27DF2E6
    @Test
    void testNumberReady() {
        Integer numberReady = 7;
        v1DaemonSetStatus.setNumberReady(numberReady);
        assertEquals(numberReady, v1DaemonSetStatus.getNumberReady());
    }

    //BaseRock generated method id: ${testNumberUnavailable}, hash: D2227624A9A4094C0FBD64F7C5DB0514
    @Test
    void testNumberUnavailable() {
        Integer numberUnavailable = 3;
        v1DaemonSetStatus.setNumberUnavailable(numberUnavailable);
        assertEquals(numberUnavailable, v1DaemonSetStatus.getNumberUnavailable());
    }

    //BaseRock generated method id: ${testObservedGeneration}, hash: A7630D107AE3EBD9A3D9A2A4E50687C0
    @Test
    void testObservedGeneration() {
        Long observedGeneration = 100L;
        v1DaemonSetStatus.setObservedGeneration(observedGeneration);
        assertEquals(observedGeneration, v1DaemonSetStatus.getObservedGeneration());
    }

    //BaseRock generated method id: ${testUpdatedNumberScheduled}, hash: FB1B16BB3DF0681520FBAF66C21B59AE
    @Test
    void testUpdatedNumberScheduled() {
        Integer updatedNumberScheduled = 12;
        v1DaemonSetStatus.setUpdatedNumberScheduled(updatedNumberScheduled);
        assertEquals(updatedNumberScheduled, v1DaemonSetStatus.getUpdatedNumberScheduled());
    }

    //BaseRock generated method id: ${testEquals}, hash: 2469767B6C98DEEBC321D7D58230AB16
    @Test
    void testEquals() {
        V1DaemonSetStatus status1 = new V1DaemonSetStatus().collisionCount(1).currentNumberScheduled(2).desiredNumberScheduled(3).numberAvailable(4).numberMisscheduled(5).numberReady(6).numberUnavailable(7).observedGeneration(8L).updatedNumberScheduled(9);
        V1DaemonSetStatus status2 = new V1DaemonSetStatus().collisionCount(1).currentNumberScheduled(2).desiredNumberScheduled(3).numberAvailable(4).numberMisscheduled(5).numberReady(6).numberUnavailable(7).observedGeneration(8L).updatedNumberScheduled(9);
        assertThat(status1.equals(status2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 2548E10153DD8A706A531DE8629A9CF1
    @Test
    void testHashCode() {
        V1DaemonSetStatus status1 = new V1DaemonSetStatus().collisionCount(1).currentNumberScheduled(2).desiredNumberScheduled(3).numberAvailable(4).numberMisscheduled(5).numberReady(6).numberUnavailable(7).observedGeneration(8L).updatedNumberScheduled(9);
        V1DaemonSetStatus status2 = new V1DaemonSetStatus().collisionCount(1).currentNumberScheduled(2).desiredNumberScheduled(3).numberAvailable(4).numberMisscheduled(5).numberReady(6).numberUnavailable(7).observedGeneration(8L).updatedNumberScheduled(9);
        assertThat(status1.hashCode(), is(status2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: E3854F9BBCA348220D637DE2416DA8C8
    @Test
    void testToString() {
        V1DaemonSetStatus status = new V1DaemonSetStatus().collisionCount(1).currentNumberScheduled(2).desiredNumberScheduled(3).numberAvailable(4).numberMisscheduled(5).numberReady(6).numberUnavailable(7).observedGeneration(8L).updatedNumberScheduled(9);
        String expectedString = "class V1DaemonSetStatus {\n" + "    collisionCount: 1\n" + "    conditions: []\n" + "    currentNumberScheduled: 2\n" + "    desiredNumberScheduled: 3\n" + "    numberAvailable: 4\n" + "    numberMisscheduled: 5\n" + "    numberReady: 6\n" + "    numberUnavailable: 7\n" + "    observedGeneration: 8\n" + "    updatedNumberScheduled: 9\n" + "}";
        assertThat(status.toString(), is(expectedString));
    }

    //BaseRock generated method id: ${testBuilder}, hash: FA8D071F37DB119D5FEAB0A15BD7E148
    @Test
    void testBuilder() {
        V1DaemonSetStatus status = new V1DaemonSetStatus().collisionCount(1).currentNumberScheduled(2).desiredNumberScheduled(3).numberAvailable(4).numberMisscheduled(5).numberReady(6).numberUnavailable(7).observedGeneration(8L).updatedNumberScheduled(9);
        assertThat(status, is(notNullValue()));
        assertThat(status.getCollisionCount(), is(1));
        assertThat(status.getCurrentNumberScheduled(), is(2));
        assertThat(status.getDesiredNumberScheduled(), is(3));
        assertThat(status.getNumberAvailable(), is(4));
        assertThat(status.getNumberMisscheduled(), is(5));
        assertThat(status.getNumberReady(), is(6));
        assertThat(status.getNumberUnavailable(), is(7));
        assertThat(status.getObservedGeneration(), is(8L));
        assertThat(status.getUpdatedNumberScheduled(), is(9));
    }

    //BaseRock generated method id: ${testNullValues}, hash: 6B35B5B1F7ABE30C35AC46B1E754B5FB
    @Test
    void testNullValues() {
        V1DaemonSetStatus status = new V1DaemonSetStatus();
        assertThat(status.getCollisionCount(), is(nullValue()));
        assertThat(status.getConditions(), is(new ArrayList<>()));
        assertThat(status.getCurrentNumberScheduled(), is(nullValue()));
        assertThat(status.getDesiredNumberScheduled(), is(nullValue()));
        assertThat(status.getNumberAvailable(), is(nullValue()));
        assertThat(status.getNumberMisscheduled(), is(nullValue()));
        assertThat(status.getNumberReady(), is(nullValue()));
        assertThat(status.getNumberUnavailable(), is(nullValue()));
        assertThat(status.getObservedGeneration(), is(nullValue()));
        assertThat(status.getUpdatedNumberScheduled(), is(nullValue()));
    }

    //BaseRock generated method id: ${testConditionsListManipulation}, hash: 1E342818AEFA63A277CC014E0F9743F8
    @Test
    void testConditionsListManipulation() {
        V1DaemonSetStatus status = new V1DaemonSetStatus();
        V1DaemonSetCondition condition1 = mock(V1DaemonSetCondition.class);
        V1DaemonSetCondition condition2 = mock(V1DaemonSetCondition.class);
        status.addConditionsItem(condition1);
        status.addConditionsItem(condition2);
        assertThat(status.getConditions(), hasSize(2));
        assertThat(status.getConditions().get(0), is(condition1));
        assertThat(status.getConditions().get(1), is(condition2));
        List<V1DaemonSetCondition> newConditions = new ArrayList<>();
        V1DaemonSetCondition condition3 = mock(V1DaemonSetCondition.class);
        newConditions.add(condition3);
        status.setConditions(newConditions);
        assertThat(status.getConditions(), hasSize(1));
        assertThat(status.getConditions().get(0), is(condition3));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObjects}, hash: 78B53CA2F67BD4AB6D98094C3B14A3D5
    @Test
    void testEqualsWithDifferentObjects() {
        V1DaemonSetStatus status1 = new V1DaemonSetStatus().collisionCount(1).currentNumberScheduled(2).desiredNumberScheduled(3);
        V1DaemonSetStatus status2 = new V1DaemonSetStatus().collisionCount(1).currentNumberScheduled(2).desiredNumberScheduled(4);
        assertThat(status1.equals(status2), is(false));
    }

    //BaseRock generated method id: ${testHashCodeConsistency}, hash: 5116BD70EA9DE263960E936BCD63919C
    @Test
    void testHashCodeConsistency() {
        V1DaemonSetStatus status = new V1DaemonSetStatus().collisionCount(1).currentNumberScheduled(2).desiredNumberScheduled(3);
        int initialHashCode = status.hashCode();
        int secondHashCode = status.hashCode();
        assertThat(initialHashCode, is(equalTo(secondHashCode)));
    }
}
