package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ReplicaSetCondition;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.openapi.models.V1ReplicaSetStatus;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ReplicaSetStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1ReplicaSetStatusConstructor}, hash: CA1F2270EE4DC3A99AEA2EA935578055
    @Test
    void testV1ReplicaSetStatusConstructor() {
        V1ReplicaSetStatus status = new V1ReplicaSetStatus();
        assertNotNull(status);
    }

    //BaseRock generated method id: ${testSetAndGetAvailableReplicas}, hash: 69BAA98E28B9FCC1D4442D563CECBF3E
    @Test
    void testSetAndGetAvailableReplicas() {
        V1ReplicaSetStatus status = new V1ReplicaSetStatus();
        status.setAvailableReplicas(5);
        assertEquals(5, status.getAvailableReplicas());
    }

    //BaseRock generated method id: ${testSetAndGetConditions}, hash: 25DF832C9DBBC21E6BB856AF0B745026
    @Test
    void testSetAndGetConditions() {
        V1ReplicaSetStatus status = new V1ReplicaSetStatus();
        List<V1ReplicaSetCondition> conditions = new ArrayList<>();
        conditions.add(mock(V1ReplicaSetCondition.class));
        status.setConditions(conditions);
        assertThat(status.getConditions(), hasSize(1));
    }

    //BaseRock generated method id: ${testAddConditionsItem}, hash: 7B9F47C95274280E4D2DF8655224D5C6
    @Test
    void testAddConditionsItem() {
        V1ReplicaSetStatus status = new V1ReplicaSetStatus();
        V1ReplicaSetCondition condition = mock(V1ReplicaSetCondition.class);
        status.addConditionsItem(condition);
        assertThat(status.getConditions(), hasSize(1));
    }

    //BaseRock generated method id: ${testSetAndGetFullyLabeledReplicas}, hash: 0E40026020282813C177F10C402196C2
    @Test
    void testSetAndGetFullyLabeledReplicas() {
        V1ReplicaSetStatus status = new V1ReplicaSetStatus();
        status.setFullyLabeledReplicas(3);
        assertEquals(3, status.getFullyLabeledReplicas());
    }

    //BaseRock generated method id: ${testSetAndGetObservedGeneration}, hash: DD6369F1AA61F33EE9FFAE868D18C1CB
    @Test
    void testSetAndGetObservedGeneration() {
        V1ReplicaSetStatus status = new V1ReplicaSetStatus();
        status.setObservedGeneration(10L);
        assertEquals(10L, status.getObservedGeneration());
    }

    //BaseRock generated method id: ${testSetAndGetReadyReplicas}, hash: 70B37B53616EEA169F210DEEF0A56573
    @Test
    void testSetAndGetReadyReplicas() {
        V1ReplicaSetStatus status = new V1ReplicaSetStatus();
        status.setReadyReplicas(7);
        assertEquals(7, status.getReadyReplicas());
    }

    //BaseRock generated method id: ${testSetAndGetReplicas}, hash: A5854FAA39D7BD7E0ABF102982D89ED9
    @Test
    void testSetAndGetReplicas() {
        V1ReplicaSetStatus status = new V1ReplicaSetStatus();
        status.setReplicas(4);
        assertEquals(4, status.getReplicas());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: E758A2DB1C6D2741B440887A7E5F4726
    @Test
    void testEqualsAndHashCode() {
        V1ReplicaSetStatus status1 = new V1ReplicaSetStatus().availableReplicas(5).fullyLabeledReplicas(3).observedGeneration(10L).readyReplicas(7).replicas(4);
        V1ReplicaSetStatus status2 = new V1ReplicaSetStatus().availableReplicas(5).fullyLabeledReplicas(3).observedGeneration(10L).readyReplicas(7).replicas(4);
        assertThat(status1, is(equalTo(status2)));
        assertThat(status1.hashCode(), is(equalTo(status2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: CAF7078E32D6E5464EE6ACECE6C649FB
    @Test
    void testToString() {
        V1ReplicaSetStatus status = new V1ReplicaSetStatus().availableReplicas(5).fullyLabeledReplicas(3).observedGeneration(10L).readyReplicas(7).replicas(4);
        String expectedString = "class V1ReplicaSetStatus {\n" + "    availableReplicas: 5\n" + "    conditions: []\n" + "    fullyLabeledReplicas: 3\n" + "    observedGeneration: 10\n" + "    readyReplicas: 7\n" + "    replicas: 4\n" + "}";
        assertThat(status.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testAvailableReplicasWithDifferentValues}, hash: 906542ECAFA3D7923204BD833D182CB0
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 5, 10 })
    void testAvailableReplicasWithDifferentValues(int replicas) {
        V1ReplicaSetStatus status = new V1ReplicaSetStatus().availableReplicas(replicas);
        assertThat(status.getAvailableReplicas(), is(equalTo(replicas)));
    }

    //BaseRock generated method id: ${testNullConditions}, hash: E8813AC91D79E065B64FA9B5C319B188
    @Test
    void testNullConditions() {
        V1ReplicaSetStatus status = new V1ReplicaSetStatus();
        assertThat(status.getConditions(), is(notNullValue()));
        assertThat(status.getConditions(), hasSize(0));
    }

    //BaseRock generated method id: ${testEmptyConditions}, hash: 05B86BEFB9DB07C1A029D2057842C60E
    @Test
    void testEmptyConditions() {
        V1ReplicaSetStatus status = new V1ReplicaSetStatus().conditions(new ArrayList<>());
        assertThat(status.getConditions(), is(notNullValue()));
        assertThat(status.getConditions(), hasSize(0));
    }

    //BaseRock generated method id: ${testMultipleConditions}, hash: 328F462AD4BE62EDF3C75CE9DDACE6A7
    @Test
    void testMultipleConditions() {
        List<V1ReplicaSetCondition> conditions = new ArrayList<>();
        conditions.add(mock(V1ReplicaSetCondition.class));
        conditions.add(mock(V1ReplicaSetCondition.class));
        conditions.add(mock(V1ReplicaSetCondition.class));
        V1ReplicaSetStatus status = new V1ReplicaSetStatus().conditions(conditions);
        assertThat(status.getConditions(), hasSize(3));
    }

    //BaseRock generated method id: ${testObservedGenerationWithDifferentValues}, hash: E1D46B495E8A46A84DA68548137580F1
    @ParameterizedTest
    @ValueSource(longs = { 0L, 1L, 100L, 1000000L })
    void testObservedGenerationWithDifferentValues(long generation) {
        V1ReplicaSetStatus status = new V1ReplicaSetStatus().observedGeneration(generation);
        assertThat(status.getObservedGeneration(), is(equalTo(generation)));
    }

    //BaseRock generated method id: ${testNegativeReplicas}, hash: 8C93B659282C8D9C48505F1B5CABC8A2
    @Test
    void testNegativeReplicas() {
        V1ReplicaSetStatus status = new V1ReplicaSetStatus().replicas(-1);
        assertThat(status.getReplicas(), is(equalTo(-1)));
    }

    //BaseRock generated method id: ${testLargeNumberOfReplicas}, hash: 3C4795E06FD6B4822C3F2FCF3221995D
    @Test
    void testLargeNumberOfReplicas() {
        V1ReplicaSetStatus status = new V1ReplicaSetStatus().replicas(Integer.MAX_VALUE);
        assertThat(status.getReplicas(), is(equalTo(Integer.MAX_VALUE)));
    }

    //BaseRock generated method id: ${testDoubleCloseToComparison}, hash: FFAE8AB5B5E1ED7B309420EAAA31E016
    @Test
    void testDoubleCloseToComparison() {
        double expectedValue = 10.0;
        double actualValue = 10.00001;
        assertThat(actualValue, is(closeTo(expectedValue, 0.00001)));
    }
}
