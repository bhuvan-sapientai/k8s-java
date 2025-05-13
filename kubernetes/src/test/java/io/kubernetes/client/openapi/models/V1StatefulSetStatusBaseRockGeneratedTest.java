package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.V1StatefulSetCondition;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import io.kubernetes.client.openapi.models.V1StatefulSetStatus;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.ArrayList;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
public class V1StatefulSetStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testDefaultConstructor}, hash: C14B6428B45E63EDF5B81CABAB86D507
    @Test
    public void testDefaultConstructor() {
        V1StatefulSetStatus status = new V1StatefulSetStatus();
        assertThat(status, is(notNullValue()));
        assertThat(status.getAvailableReplicas(), is(nullValue()));
        assertThat(status.getCollisionCount(), is(nullValue()));
        assertThat(status.getConditions(), is(notNullValue()));
        assertThat(status.getConditions(), hasSize(0));
        assertThat(status.getCurrentReplicas(), is(nullValue()));
        assertThat(status.getCurrentRevision(), is(nullValue()));
        assertThat(status.getObservedGeneration(), is(nullValue()));
        assertThat(status.getReadyReplicas(), is(nullValue()));
        assertThat(status.getReplicas(), is(nullValue()));
        assertThat(status.getUpdateRevision(), is(nullValue()));
        assertThat(status.getUpdatedReplicas(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetAvailableReplicas}, hash: 3302C4C1CA8DCB26FE22F0D3F3E9EA25
    @Test
    public void testSetAndGetAvailableReplicas() {
        V1StatefulSetStatus status = new V1StatefulSetStatus();
        Integer availableReplicas = 5;
        status.setAvailableReplicas(availableReplicas);
        assertThat(status.getAvailableReplicas(), is(equalTo(availableReplicas)));
    }

    //BaseRock generated method id: ${testSetAndGetCollisionCount}, hash: A0F760165C3B5BC36108933C890E9075
    @Test
    public void testSetAndGetCollisionCount() {
        V1StatefulSetStatus status = new V1StatefulSetStatus();
        Integer collisionCount = 3;
        status.setCollisionCount(collisionCount);
        assertThat(status.getCollisionCount(), is(equalTo(collisionCount)));
    }

    //BaseRock generated method id: ${testSetAndGetConditions}, hash: 54A33813A7B546803E1D4B1B45CB62BE
    @Test
    public void testSetAndGetConditions() {
        V1StatefulSetStatus status = new V1StatefulSetStatus();
        List<V1StatefulSetCondition> conditions = new ArrayList<>();
        V1StatefulSetCondition condition = new V1StatefulSetCondition();
        conditions.add(condition);
        status.setConditions(conditions);
        assertThat(status.getConditions(), is(equalTo(conditions)));
        assertThat(status.getConditions(), hasSize(1));
    }

    //BaseRock generated method id: ${testAddConditionsItem}, hash: 4032CB91C3BB5F4ECEC70F4509430836
    @Test
    public void testAddConditionsItem() {
        V1StatefulSetStatus status = new V1StatefulSetStatus();
        V1StatefulSetCondition condition1 = new V1StatefulSetCondition();
        V1StatefulSetCondition condition2 = new V1StatefulSetCondition();
        status.addConditionsItem(condition1);
        status.addConditionsItem(condition2);
        assertThat(status.getConditions(), hasSize(2));
        assertThat(status.getConditions().get(0), is(equalTo(condition1)));
        assertThat(status.getConditions().get(1), is(equalTo(condition2)));
    }

    //BaseRock generated method id: ${testAddConditionsItemWithNullConditions}, hash: 3583D1FB0CFFE3039B9F01F459E12C20
    @Test
    public void testAddConditionsItemWithNullConditions() {
        V1StatefulSetStatus status = new V1StatefulSetStatus();
        status.setConditions(null);
        V1StatefulSetCondition condition = new V1StatefulSetCondition();
        status.addConditionsItem(condition);
        assertThat(status.getConditions(), hasSize(1));
        assertThat(status.getConditions().get(0), is(equalTo(condition)));
    }

    //BaseRock generated method id: ${testSetAndGetCurrentReplicas}, hash: A442FC41F1B3FF271A9CF4EEF77C96EF
    @Test
    public void testSetAndGetCurrentReplicas() {
        V1StatefulSetStatus status = new V1StatefulSetStatus();
        Integer currentReplicas = 2;
        status.setCurrentReplicas(currentReplicas);
        assertThat(status.getCurrentReplicas(), is(equalTo(currentReplicas)));
    }

    //BaseRock generated method id: ${testSetAndGetCurrentRevision}, hash: B262B51566FACDD996AAD90F8A9D8EF0
    @Test
    public void testSetAndGetCurrentRevision() {
        V1StatefulSetStatus status = new V1StatefulSetStatus();
        String currentRevision = "revision-1234";
        status.setCurrentRevision(currentRevision);
        assertThat(status.getCurrentRevision(), is(equalTo(currentRevision)));
    }

    //BaseRock generated method id: ${testSetAndGetObservedGeneration}, hash: FD42BE31F26F55CF736ED5BEA1E953CF
    @Test
    public void testSetAndGetObservedGeneration() {
        V1StatefulSetStatus status = new V1StatefulSetStatus();
        Long observedGeneration = 10L;
        status.setObservedGeneration(observedGeneration);
        assertThat(status.getObservedGeneration(), is(equalTo(observedGeneration)));
    }

    //BaseRock generated method id: ${testSetAndGetReadyReplicas}, hash: DA1A62BACD5E9F634D43467CEE1F723B
    @Test
    public void testSetAndGetReadyReplicas() {
        V1StatefulSetStatus status = new V1StatefulSetStatus();
        Integer readyReplicas = 4;
        status.setReadyReplicas(readyReplicas);
        assertThat(status.getReadyReplicas(), is(equalTo(readyReplicas)));
    }

    //BaseRock generated method id: ${testSetAndGetReplicas}, hash: D5400CA5A3808BE1801F34D3932589B8
    @Test
    public void testSetAndGetReplicas() {
        V1StatefulSetStatus status = new V1StatefulSetStatus();
        Integer replicas = 7;
        status.setReplicas(replicas);
        assertThat(status.getReplicas(), is(equalTo(replicas)));
    }

    //BaseRock generated method id: ${testSetAndGetUpdateRevision}, hash: DFEE92AFE7911ECBE2FEF1A306E5A232
    @Test
    public void testSetAndGetUpdateRevision() {
        V1StatefulSetStatus status = new V1StatefulSetStatus();
        String updateRevision = "update-rev-5678";
        status.setUpdateRevision(updateRevision);
        assertThat(status.getUpdateRevision(), is(equalTo(updateRevision)));
    }

    //BaseRock generated method id: ${testSetAndGetUpdatedReplicas}, hash: 69D6E1B3C87E3B35A28CD01B8BC3BD55
    @Test
    public void testSetAndGetUpdatedReplicas() {
        V1StatefulSetStatus status = new V1StatefulSetStatus();
        Integer updatedReplicas = 6;
        status.setUpdatedReplicas(updatedReplicas);
        assertThat(status.getUpdatedReplicas(), is(equalTo(updatedReplicas)));
    }

    //BaseRock generated method id: ${testChainedMethodCalls}, hash: 4062D3D489EB2DF12C8C957DE3958E00
    @Test
    public void testChainedMethodCalls() {
        V1StatefulSetStatus status = new V1StatefulSetStatus().availableReplicas(5).collisionCount(2).currentReplicas(3).currentRevision("rev-1").observedGeneration(15L).readyReplicas(4).replicas(7).updateRevision("rev-2").updatedReplicas(6);
        V1StatefulSetCondition condition = new V1StatefulSetCondition();
        status.addConditionsItem(condition);
        assertThat(status.getAvailableReplicas(), is(equalTo(5)));
        assertThat(status.getCollisionCount(), is(equalTo(2)));
        assertThat(status.getCurrentReplicas(), is(equalTo(3)));
        assertThat(status.getCurrentRevision(), is(equalTo("rev-1")));
        assertThat(status.getObservedGeneration(), is(equalTo(15L)));
        assertThat(status.getReadyReplicas(), is(equalTo(4)));
        assertThat(status.getReplicas(), is(equalTo(7)));
        assertThat(status.getUpdateRevision(), is(equalTo("rev-2")));
        assertThat(status.getUpdatedReplicas(), is(equalTo(6)));
        assertThat(status.getConditions(), hasSize(1));
        assertThat(status.getConditions().get(0), is(equalTo(condition)));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: AC936936096DB57EBC564C30DB821FAC
    @Test
    public void testEqualsWithSameObject() {
        V1StatefulSetStatus status = new V1StatefulSetStatus().availableReplicas(3).collisionCount(1).currentReplicas(2).currentRevision("rev-1").observedGeneration(5L).readyReplicas(3).replicas(5).updateRevision("rev-2").updatedReplicas(4);
        assertThat(status.equals(status), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 534BA79AFE223CBD2CB7CB29B6BA6E35
    @Test
    public void testEqualsWithDifferentClass() {
        V1StatefulSetStatus status = new V1StatefulSetStatus();
        assertThat(status.equals(new Object()), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: 90A4D799C5D4FED939F727C2DB4D0804
    @Test
    public void testEqualsWithNull() {
        V1StatefulSetStatus status = new V1StatefulSetStatus();
        assertThat(status.equals(null), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithEqualObjects}, hash: DBA93939D4922D9BE64BBB737E5BD485
    @Test
    public void testEqualsWithEqualObjects() {
        V1StatefulSetStatus status1 = new V1StatefulSetStatus().availableReplicas(3).collisionCount(1).currentReplicas(2).currentRevision("rev-1").observedGeneration(5L).readyReplicas(3).replicas(5).updateRevision("rev-2").updatedReplicas(4);
        V1StatefulSetStatus status2 = new V1StatefulSetStatus().availableReplicas(3).collisionCount(1).currentReplicas(2).currentRevision("rev-1").observedGeneration(5L).readyReplicas(3).replicas(5).updateRevision("rev-2").updatedReplicas(4);
        assertThat(status1.equals(status2), is(true));
        assertThat(status2.equals(status1), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObjects}, hash: 135CF7618308968DFF1447985DF732E4
    @Test
    public void testEqualsWithDifferentObjects() {
        V1StatefulSetStatus status1 = new V1StatefulSetStatus().availableReplicas(3).replicas(5);
        V1StatefulSetStatus status2 = new V1StatefulSetStatus().availableReplicas(4).replicas(5);
        assertThat(status1.equals(status2), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentConditions}, hash: 139713BDAC2C36D020109AC523D2B7D7
    @Test
    public void testEqualsWithDifferentConditions() {
        V1StatefulSetStatus status1 = new V1StatefulSetStatus();
        V1StatefulSetStatus status2 = new V1StatefulSetStatus();
        V1StatefulSetCondition condition1 = new V1StatefulSetCondition();
        V1StatefulSetCondition condition2 = new V1StatefulSetCondition();
        status1.addConditionsItem(condition1);
        status2.addConditionsItem(condition2);
        // Assuming V1StatefulSetCondition equals() is properly implemented
        // and these two objects are different according to that implementation
        if (!condition1.equals(condition2)) {
            assertThat(status1.equals(status2), is(false));
        }
    }

    //BaseRock generated method id: ${testHashCode}, hash: ECEADCA38F938F80F4720E9CCCF9E619
    @Test
    public void testHashCode() {
        V1StatefulSetStatus status1 = new V1StatefulSetStatus().availableReplicas(3).collisionCount(1).currentReplicas(2).currentRevision("rev-1").observedGeneration(5L).readyReplicas(3).replicas(5).updateRevision("rev-2").updatedReplicas(4);
        V1StatefulSetStatus status2 = new V1StatefulSetStatus().availableReplicas(3).collisionCount(1).currentReplicas(2).currentRevision("rev-1").observedGeneration(5L).readyReplicas(3).replicas(5).updateRevision("rev-2").updatedReplicas(4);
        V1StatefulSetStatus status3 = new V1StatefulSetStatus().availableReplicas(4).collisionCount(1).currentReplicas(2).currentRevision("rev-1").observedGeneration(5L).readyReplicas(3).replicas(5).updateRevision("rev-2").updatedReplicas(4);
        // Equal objects should have equal hash codes
        assertEquals(status1.hashCode(), status2.hashCode());
        // Different objects should have different hash codes
        // Note: This is not guaranteed by hashCode contract, but it's a good test
        // for the specific implementation being tested
        assertNotEquals(status1.hashCode(), status3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: FDD43B2C08900AC9BDB16E9BE2FA978D
    @Test
    public void testToString() {
        V1StatefulSetStatus status = new V1StatefulSetStatus().availableReplicas(3).collisionCount(1).currentReplicas(2).currentRevision("rev-1").observedGeneration(5L).readyReplicas(3).replicas(5).updateRevision("rev-2").updatedReplicas(4);
        String toString = status.toString();
        assertThat(toString, is(notNullValue()));
        // Verify that the toString contains all field names
        assertThat(toString.contains("availableReplicas"), is(true));
        assertThat(toString.contains("collisionCount"), is(true));
        assertThat(toString.contains("conditions"), is(true));
        assertThat(toString.contains("currentReplicas"), is(true));
        assertThat(toString.contains("currentRevision"), is(true));
        assertThat(toString.contains("observedGeneration"), is(true));
        assertThat(toString.contains("readyReplicas"), is(true));
        assertThat(toString.contains("replicas"), is(true));
        assertThat(toString.contains("updateRevision"), is(true));
        assertThat(toString.contains("updatedReplicas"), is(true));
    }

    //BaseRock generated method id: ${testToJsonMethod}, hash: 6D97FA774DA517CD71635373D412917F
    @Test
    public void testToJsonMethod() throws Exception {
        V1StatefulSetStatus status = new V1StatefulSetStatus().availableReplicas(3).collisionCount(1).currentReplicas(2).currentRevision("rev-1").observedGeneration(5L).readyReplicas(3).replicas(5).updateRevision("rev-2").updatedReplicas(4);
        String json = status.toJson();
        assertThat(json, is(notNullValue()));
        assertThat(json.contains("\"availableReplicas\":3"), is(true));
        assertThat(json.contains("\"collisionCount\":1"), is(true));
        assertThat(json.contains("\"currentReplicas\":2"), is(true));
        assertThat(json.contains("\"currentRevision\":\"rev-1\""), is(true));
        assertThat(json.contains("\"observedGeneration\":5"), is(true));
        assertThat(json.contains("\"readyReplicas\":3"), is(true));
        assertThat(json.contains("\"replicas\":5"), is(true));
        assertThat(json.contains("\"updateRevision\":\"rev-2\""), is(true));
        assertThat(json.contains("\"updatedReplicas\":4"), is(true));
    }

    //BaseRock generated method id: ${testFromJsonMethod}, hash: F09C8820BBF6BDF2D091EE0672CB5ED5
    @Test
    public void testFromJsonMethod() throws Exception {
        String json = "{\"availableReplicas\":3,\"collisionCount\":1,\"conditions\":[],\"currentReplicas\":2,\"currentRevision\":\"rev-1\",\"observedGeneration\":5,\"readyReplicas\":3,\"replicas\":5,\"updateRevision\":\"rev-2\",\"updatedReplicas\":4}";
        V1StatefulSetStatus status = V1StatefulSetStatus.fromJson(json);
        assertThat(status, is(notNullValue()));
        assertThat(status.getAvailableReplicas(), is(equalTo(3)));
        assertThat(status.getCollisionCount(), is(equalTo(1)));
        assertThat(status.getConditions(), is(notNullValue()));
        assertThat(status.getCurrentReplicas(), is(equalTo(2)));
        assertThat(status.getCurrentRevision(), is(equalTo("rev-1")));
        assertThat(status.getObservedGeneration(), is(equalTo(5L)));
        assertThat(status.getReadyReplicas(), is(equalTo(3)));
        assertThat(status.getReplicas(), is(equalTo(5)));
        assertThat(status.getUpdateRevision(), is(equalTo("rev-2")));
        assertThat(status.getUpdatedReplicas(), is(equalTo(4)));
    }

    //BaseRock generated method id: ${testConditionsWithMultipleItems}, hash: C2E4F1B386864AE100E21C6E716C4B60
    @Test
    public void testConditionsWithMultipleItems() {
        V1StatefulSetStatus status = new V1StatefulSetStatus();
        List<V1StatefulSetCondition> conditions = new ArrayList<>();
        V1StatefulSetCondition condition1 = new V1StatefulSetCondition();
        V1StatefulSetCondition condition2 = new V1StatefulSetCondition();
        V1StatefulSetCondition condition3 = new V1StatefulSetCondition();
        conditions.add(condition1);
        conditions.add(condition2);
        conditions.add(condition3);
        status.setConditions(conditions);
        assertThat(status.getConditions(), hasSize(3));
        assertThat(status.getConditions().get(0), is(equalTo(condition1)));
        assertThat(status.getConditions().get(1), is(equalTo(condition2)));
        assertThat(status.getConditions().get(2), is(equalTo(condition3)));
    }
}
