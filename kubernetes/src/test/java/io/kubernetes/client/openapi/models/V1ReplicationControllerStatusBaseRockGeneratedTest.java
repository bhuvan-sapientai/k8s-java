package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.openapi.models.V1ReplicationControllerCondition;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ReplicationControllerStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: D5D5185AD34F8392E6B45262D31C595C
    @Test
    void testConstructor() {
        V1ReplicationControllerStatus status = new V1ReplicationControllerStatus();
        assertNotNull(status);
    }

    //BaseRock generated method id: ${testGetSetAvailableReplicas}, hash: C9365790811CBDC494260772953781CA
    @Test
    void testGetSetAvailableReplicas() {
        V1ReplicationControllerStatus status = new V1ReplicationControllerStatus();
        status.setAvailableReplicas(5);
        assertEquals(5, status.getAvailableReplicas());
    }

    //BaseRock generated method id: ${testGetSetConditions}, hash: 6FAD4B67075B021A50C34FE3442BAB83
    @Test
    void testGetSetConditions() {
        V1ReplicationControllerStatus status = new V1ReplicationControllerStatus();
        List<V1ReplicationControllerCondition> conditions = new ArrayList<>();
        conditions.add(mock(V1ReplicationControllerCondition.class));
        status.setConditions(conditions);
        assertThat(status.getConditions(), is(equalTo(conditions)));
    }

    //BaseRock generated method id: ${testAddConditionsItem}, hash: FE0778B2B21A92102C0D232BC12293D5
    @Test
    void testAddConditionsItem() {
        V1ReplicationControllerStatus status = new V1ReplicationControllerStatus();
        V1ReplicationControllerCondition condition = mock(V1ReplicationControllerCondition.class);
        status.addConditionsItem(condition);
        assertThat(status.getConditions(), hasSize(1));
        assertThat(status.getConditions().get(0), is(equalTo(condition)));
    }

    //BaseRock generated method id: ${testGetSetFullyLabeledReplicas}, hash: 8C13C2E987E5E24545EEE8F9588A3AC8
    @Test
    void testGetSetFullyLabeledReplicas() {
        V1ReplicationControllerStatus status = new V1ReplicationControllerStatus();
        status.setFullyLabeledReplicas(3);
        assertEquals(3, status.getFullyLabeledReplicas());
    }

    //BaseRock generated method id: ${testGetSetObservedGeneration}, hash: 6B199C2055CA9126506C1494B2742F21
    @Test
    void testGetSetObservedGeneration() {
        V1ReplicationControllerStatus status = new V1ReplicationControllerStatus();
        status.setObservedGeneration(10L);
        assertEquals(10L, status.getObservedGeneration());
    }

    //BaseRock generated method id: ${testGetSetReadyReplicas}, hash: 4AE977517868832EBAE0547F607F04A7
    @Test
    void testGetSetReadyReplicas() {
        V1ReplicationControllerStatus status = new V1ReplicationControllerStatus();
        status.setReadyReplicas(7);
        assertEquals(7, status.getReadyReplicas());
    }

    //BaseRock generated method id: ${testGetSetReplicas}, hash: 7428E5B75A28CC0EDAA4494F880057A6
    @Test
    void testGetSetReplicas() {
        V1ReplicationControllerStatus status = new V1ReplicationControllerStatus();
        status.setReplicas(4);
        assertEquals(4, status.getReplicas());
    }

    //BaseRock generated method id: ${testAvailableReplicasWithDifferentValues}, hash: 77B446E73AF77CA3108945311D8B67A8
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 5, 10 })
    void testAvailableReplicasWithDifferentValues(int replicaCount) {
        V1ReplicationControllerStatus status = new V1ReplicationControllerStatus();
        status.setAvailableReplicas(replicaCount);
        assertEquals(replicaCount, status.getAvailableReplicas());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 64B1FFBB260A93BF606D56D3803D23FC
    @Test
    void testEqualsAndHashCode() {
        V1ReplicationControllerStatus status1 = new V1ReplicationControllerStatus().availableReplicas(1).fullyLabeledReplicas(2).observedGeneration(3L).readyReplicas(4).replicas(5);
        V1ReplicationControllerStatus status2 = new V1ReplicationControllerStatus().availableReplicas(1).fullyLabeledReplicas(2).observedGeneration(3L).readyReplicas(4).replicas(5);
        assertEquals(status1, status2);
        assertEquals(status1.hashCode(), status2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 91C5265F96A68A3BA866CDB7E309E1BB
    @Test
    void testToString() {
        V1ReplicationControllerStatus status = new V1ReplicationControllerStatus().availableReplicas(1).fullyLabeledReplicas(2).observedGeneration(3L).readyReplicas(4).replicas(5);
        String toString = status.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("availableReplicas"), is(true));
        assertThat(toString.contains("fullyLabeledReplicas"), is(true));
        assertThat(toString.contains("observedGeneration"), is(true));
        assertThat(toString.contains("readyReplicas"), is(true));
        assertThat(toString.contains("replicas"), is(true));
    }
}
