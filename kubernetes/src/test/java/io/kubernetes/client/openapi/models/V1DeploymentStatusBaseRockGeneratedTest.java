package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import io.kubernetes.client.openapi.models.V1DeploymentCondition;
import java.util.List;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import io.kubernetes.client.openapi.models.V1DeploymentStatus;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.hamcrest.CoreMatchers.nullValue;
import org.junit.jupiter.api.Timeout;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.ArrayList;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.CoreMatchers.notNullValue;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.params.provider.NullSource;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
public class V1DeploymentStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testDefaultConstructor}, hash: 793FD36D23B76D2609BFD9C9C1FDE508
    @Test
    public void testDefaultConstructor() {
        // Act
        V1DeploymentStatus deploymentStatus = new V1DeploymentStatus();
        // Assert
        assertThat(deploymentStatus, is(notNullValue()));
        assertThat(deploymentStatus.getAvailableReplicas(), is(nullValue()));
        assertThat(deploymentStatus.getCollisionCount(), is(nullValue()));
        assertThat(deploymentStatus.getConditions(), is(notNullValue()));
        assertThat(deploymentStatus.getConditions(), is(empty()));
        assertThat(deploymentStatus.getObservedGeneration(), is(nullValue()));
        assertThat(deploymentStatus.getReadyReplicas(), is(nullValue()));
        assertThat(deploymentStatus.getReplicas(), is(nullValue()));
        assertThat(deploymentStatus.getUnavailableReplicas(), is(nullValue()));
        assertThat(deploymentStatus.getUpdatedReplicas(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAvailableReplicasGetterAndSetter}, hash: 3991A4D238784C3EC623134D7CAAD900
    @Test
    public void testAvailableReplicasGetterAndSetter() {
        // Arrange
        V1DeploymentStatus deploymentStatus = new V1DeploymentStatus();
        Integer availableReplicas = 5;
        // Act
        deploymentStatus.setAvailableReplicas(availableReplicas);
        // Assert
        assertThat(deploymentStatus.getAvailableReplicas(), is(equalTo(availableReplicas)));
    }

    //BaseRock generated method id: ${testAvailableReplicasFluentSetter}, hash: 7527818E66BD009202BA7281FE18D6F3
    @Test
    public void testAvailableReplicasFluentSetter() {
        // Arrange
        V1DeploymentStatus deploymentStatus = new V1DeploymentStatus();
        Integer availableReplicas = 5;
        // Act
        V1DeploymentStatus result = deploymentStatus.availableReplicas(availableReplicas);
        // Assert
        assertThat(result, is(sameInstance(deploymentStatus)));
        assertThat(deploymentStatus.getAvailableReplicas(), is(equalTo(availableReplicas)));
    }

    //BaseRock generated method id: ${testCollisionCountGetterAndSetter}, hash: EBE1BD64C134352C5CDF532C1BA0607A
    @Test
    public void testCollisionCountGetterAndSetter() {
        // Arrange
        V1DeploymentStatus deploymentStatus = new V1DeploymentStatus();
        Integer collisionCount = 3;
        // Act
        deploymentStatus.setCollisionCount(collisionCount);
        // Assert
        assertThat(deploymentStatus.getCollisionCount(), is(equalTo(collisionCount)));
    }

    //BaseRock generated method id: ${testCollisionCountFluentSetter}, hash: DD8755FA5BF604067E579C42E21BFA37
    @Test
    public void testCollisionCountFluentSetter() {
        // Arrange
        V1DeploymentStatus deploymentStatus = new V1DeploymentStatus();
        Integer collisionCount = 3;
        // Act
        V1DeploymentStatus result = deploymentStatus.collisionCount(collisionCount);
        // Assert
        assertThat(result, is(sameInstance(deploymentStatus)));
        assertThat(deploymentStatus.getCollisionCount(), is(equalTo(collisionCount)));
    }

    //BaseRock generated method id: ${testConditionsGetterAndSetter}, hash: 19BA7B4DE5BBE624A4A1484B45F2F771
    @Test
    public void testConditionsGetterAndSetter() {
        // Arrange
        V1DeploymentStatus deploymentStatus = new V1DeploymentStatus();
        List<V1DeploymentCondition> conditions = new ArrayList<>();
        V1DeploymentCondition condition = mock(V1DeploymentCondition.class);
        conditions.add(condition);
        // Act
        deploymentStatus.setConditions(conditions);
        // Assert
        assertThat(deploymentStatus.getConditions(), is(equalTo(conditions)));
    }

    //BaseRock generated method id: ${testConditionsFluentSetter}, hash: 06647160E73C6C1BD805281B34611B36
    @Test
    public void testConditionsFluentSetter() {
        // Arrange
        V1DeploymentStatus deploymentStatus = new V1DeploymentStatus();
        List<V1DeploymentCondition> conditions = new ArrayList<>();
        V1DeploymentCondition condition = mock(V1DeploymentCondition.class);
        conditions.add(condition);
        // Act
        V1DeploymentStatus result = deploymentStatus.conditions(conditions);
        // Assert
        assertThat(result, is(sameInstance(deploymentStatus)));
        assertThat(deploymentStatus.getConditions(), is(equalTo(conditions)));
    }

    //BaseRock generated method id: ${testAddConditionsItem}, hash: 8D8D121BC9C8F41D9E2CCE2E766003DE
    @Test
    public void testAddConditionsItem() {
        // Arrange
        V1DeploymentStatus deploymentStatus = new V1DeploymentStatus();
        V1DeploymentCondition condition1 = mock(V1DeploymentCondition.class);
        V1DeploymentCondition condition2 = mock(V1DeploymentCondition.class);
        // Act
        deploymentStatus.addConditionsItem(condition1);
        deploymentStatus.addConditionsItem(condition2);
        // Assert
        assertThat(deploymentStatus.getConditions().size(), is(equalTo(2)));
        assertThat(deploymentStatus.getConditions().get(0), is(equalTo(condition1)));
        assertThat(deploymentStatus.getConditions().get(1), is(equalTo(condition2)));
    }

    //BaseRock generated method id: ${testAddConditionsItemWithNullInitialConditions}, hash: 01D19084B6DA552E515C811417E2D765
    @Test
    public void testAddConditionsItemWithNullInitialConditions() {
        // Arrange
        V1DeploymentStatus deploymentStatus = new V1DeploymentStatus();
        deploymentStatus.setConditions(null);
        V1DeploymentCondition condition = mock(V1DeploymentCondition.class);
        // Act
        V1DeploymentStatus result = deploymentStatus.addConditionsItem(condition);
        // Assert
        assertThat(result, is(sameInstance(deploymentStatus)));
        assertThat(deploymentStatus.getConditions().size(), is(equalTo(1)));
        assertThat(deploymentStatus.getConditions().get(0), is(equalTo(condition)));
    }

    //BaseRock generated method id: ${testObservedGenerationGetterAndSetter}, hash: 4D3B1A736F598A82A07AD8BD44F2F636
    @Test
    public void testObservedGenerationGetterAndSetter() {
        // Arrange
        V1DeploymentStatus deploymentStatus = new V1DeploymentStatus();
        Long observedGeneration = 10L;
        // Act
        deploymentStatus.setObservedGeneration(observedGeneration);
        // Assert
        assertThat(deploymentStatus.getObservedGeneration(), is(equalTo(observedGeneration)));
    }

    //BaseRock generated method id: ${testObservedGenerationFluentSetter}, hash: CCA0C7B6E34F6B680C05BE4382CCCF12
    @Test
    public void testObservedGenerationFluentSetter() {
        // Arrange
        V1DeploymentStatus deploymentStatus = new V1DeploymentStatus();
        Long observedGeneration = 10L;
        // Act
        V1DeploymentStatus result = deploymentStatus.observedGeneration(observedGeneration);
        // Assert
        assertThat(result, is(sameInstance(deploymentStatus)));
        assertThat(deploymentStatus.getObservedGeneration(), is(equalTo(observedGeneration)));
    }

    //BaseRock generated method id: ${testReadyReplicasGetterAndSetter}, hash: 9E33897B042419368CBCA5D5410A202A
    @Test
    public void testReadyReplicasGetterAndSetter() {
        // Arrange
        V1DeploymentStatus deploymentStatus = new V1DeploymentStatus();
        Integer readyReplicas = 7;
        // Act
        deploymentStatus.setReadyReplicas(readyReplicas);
        // Assert
        assertThat(deploymentStatus.getReadyReplicas(), is(equalTo(readyReplicas)));
    }

    //BaseRock generated method id: ${testReadyReplicasFluentSetter}, hash: F33C3E72677AED317748E19BD74B01E7
    @Test
    public void testReadyReplicasFluentSetter() {
        // Arrange
        V1DeploymentStatus deploymentStatus = new V1DeploymentStatus();
        Integer readyReplicas = 7;
        // Act
        V1DeploymentStatus result = deploymentStatus.readyReplicas(readyReplicas);
        // Assert
        assertThat(result, is(sameInstance(deploymentStatus)));
        assertThat(deploymentStatus.getReadyReplicas(), is(equalTo(readyReplicas)));
    }

    //BaseRock generated method id: ${testReplicasGetterAndSetter}, hash: 4A93911F6E0069CCFC72F6F1EA8F2C1A
    @Test
    public void testReplicasGetterAndSetter() {
        // Arrange
        V1DeploymentStatus deploymentStatus = new V1DeploymentStatus();
        Integer replicas = 9;
        // Act
        deploymentStatus.setReplicas(replicas);
        // Assert
        assertThat(deploymentStatus.getReplicas(), is(equalTo(replicas)));
    }

    //BaseRock generated method id: ${testReplicasFluentSetter}, hash: 4E234D14E7D29E83CDEF5E482BF29978
    @Test
    public void testReplicasFluentSetter() {
        // Arrange
        V1DeploymentStatus deploymentStatus = new V1DeploymentStatus();
        Integer replicas = 9;
        // Act
        V1DeploymentStatus result = deploymentStatus.replicas(replicas);
        // Assert
        assertThat(result, is(sameInstance(deploymentStatus)));
        assertThat(deploymentStatus.getReplicas(), is(equalTo(replicas)));
    }

    //BaseRock generated method id: ${testUnavailableReplicasGetterAndSetter}, hash: E1193B79052AD5FEDC4937ABB8DE3837
    @Test
    public void testUnavailableReplicasGetterAndSetter() {
        // Arrange
        V1DeploymentStatus deploymentStatus = new V1DeploymentStatus();
        Integer unavailableReplicas = 2;
        // Act
        deploymentStatus.setUnavailableReplicas(unavailableReplicas);
        // Assert
        assertThat(deploymentStatus.getUnavailableReplicas(), is(equalTo(unavailableReplicas)));
    }

    //BaseRock generated method id: ${testUnavailableReplicasFluentSetter}, hash: 19557A4092D20835D52FE0DEBD0833B4
    @Test
    public void testUnavailableReplicasFluentSetter() {
        // Arrange
        V1DeploymentStatus deploymentStatus = new V1DeploymentStatus();
        Integer unavailableReplicas = 2;
        // Act
        V1DeploymentStatus result = deploymentStatus.unavailableReplicas(unavailableReplicas);
        // Assert
        assertThat(result, is(sameInstance(deploymentStatus)));
        assertThat(deploymentStatus.getUnavailableReplicas(), is(equalTo(unavailableReplicas)));
    }

    //BaseRock generated method id: ${testUpdatedReplicasGetterAndSetter}, hash: 7E91C7E6C656E006F98A8CE308F4A6B4
    @Test
    public void testUpdatedReplicasGetterAndSetter() {
        // Arrange
        V1DeploymentStatus deploymentStatus = new V1DeploymentStatus();
        Integer updatedReplicas = 6;
        // Act
        deploymentStatus.setUpdatedReplicas(updatedReplicas);
        // Assert
        assertThat(deploymentStatus.getUpdatedReplicas(), is(equalTo(updatedReplicas)));
    }

    //BaseRock generated method id: ${testUpdatedReplicasFluentSetter}, hash: 6B13ABAEB43205EA571AD6C426B098E1
    @Test
    public void testUpdatedReplicasFluentSetter() {
        // Arrange
        V1DeploymentStatus deploymentStatus = new V1DeploymentStatus();
        Integer updatedReplicas = 6;
        // Act
        V1DeploymentStatus result = deploymentStatus.updatedReplicas(updatedReplicas);
        // Assert
        assertThat(result, is(sameInstance(deploymentStatus)));
        assertThat(deploymentStatus.getUpdatedReplicas(), is(equalTo(updatedReplicas)));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: EA5DEADC7AE5DF264BEDCCDB48AAA912
    @Test
    public void testEqualsWithSameObject() {
        // Arrange
        V1DeploymentStatus deploymentStatus = new V1DeploymentStatus().availableReplicas(5).collisionCount(3).observedGeneration(10L).readyReplicas(7).replicas(9).unavailableReplicas(2).updatedReplicas(6);
        // Assert
        assertTrue(deploymentStatus.equals(deploymentStatus));
    }

    //BaseRock generated method id: ${testEqualsWithEqualObject}, hash: FE8CCF3542B147B75EEF9BC1556F2255
    @Test
    public void testEqualsWithEqualObject() {
        // Arrange
        V1DeploymentStatus deploymentStatus1 = new V1DeploymentStatus().availableReplicas(5).collisionCount(3).observedGeneration(10L).readyReplicas(7).replicas(9).unavailableReplicas(2).updatedReplicas(6);
        V1DeploymentStatus deploymentStatus2 = new V1DeploymentStatus().availableReplicas(5).collisionCount(3).observedGeneration(10L).readyReplicas(7).replicas(9).unavailableReplicas(2).updatedReplicas(6);
        // Assert
        assertTrue(deploymentStatus1.equals(deploymentStatus2));
        assertTrue(deploymentStatus2.equals(deploymentStatus1));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 524F13AFF0BB345F408D17D57AFB7C10
    @Test
    public void testEqualsWithDifferentObject() {
        // Arrange
        V1DeploymentStatus deploymentStatus = new V1DeploymentStatus().availableReplicas(5).collisionCount(3).observedGeneration(10L).readyReplicas(7).replicas(9).unavailableReplicas(2).updatedReplicas(6);
        // Assert
        assertFalse(deploymentStatus.equals("Not a deployment status"));
    }

    //BaseRock generated method id: ${testEqualsWithNullObject}, hash: 4A5B6ED51E276A54F00C4E1A7EAC510F
    @Test
    public void testEqualsWithNullObject() {
        // Arrange
        V1DeploymentStatus deploymentStatus = new V1DeploymentStatus().availableReplicas(5).collisionCount(3).observedGeneration(10L).readyReplicas(7).replicas(9).unavailableReplicas(2).updatedReplicas(6);
        // Assert
        assertFalse(deploymentStatus.equals(null));
    }

    //BaseRock generated method id: ${testEqualsDifferentAvailableReplicas}, hash: 3470525780FBD4B43EE59487E077EC86
    @Test
    public void testEqualsDifferentAvailableReplicas() {
        // Arrange
        V1DeploymentStatus deploymentStatus1 = new V1DeploymentStatus().availableReplicas(5);
        V1DeploymentStatus deploymentStatus2 = new V1DeploymentStatus().availableReplicas(6);
        // Assert
        assertFalse(deploymentStatus1.equals(deploymentStatus2));
    }

    //BaseRock generated method id: ${testEqualsDifferentCollisionCount}, hash: 782861BBC3C99BCF17B9F5107A7EE9F5
    @Test
    public void testEqualsDifferentCollisionCount() {
        // Arrange
        V1DeploymentStatus deploymentStatus1 = new V1DeploymentStatus().collisionCount(3);
        V1DeploymentStatus deploymentStatus2 = new V1DeploymentStatus().collisionCount(4);
        // Assert
        assertFalse(deploymentStatus1.equals(deploymentStatus2));
    }

    //BaseRock generated method id: ${testEqualsDifferentConditions}, hash: C7B2ED75EA7BC15332AC94265F9D8841
    @Test
    public void testEqualsDifferentConditions() {
        // Arrange
        V1DeploymentCondition condition1 = mock(V1DeploymentCondition.class);
        V1DeploymentCondition condition2 = mock(V1DeploymentCondition.class);
        V1DeploymentStatus deploymentStatus1 = new V1DeploymentStatus().addConditionsItem(condition1);
        V1DeploymentStatus deploymentStatus2 = new V1DeploymentStatus().addConditionsItem(condition2);
        // Assert
        assertFalse(deploymentStatus1.equals(deploymentStatus2));
    }

    //BaseRock generated method id: ${testEqualsDifferentObservedGeneration}, hash: 4BFC806EF4F7115F717959CDF33B3132
    @Test
    public void testEqualsDifferentObservedGeneration() {
        // Arrange
        V1DeploymentStatus deploymentStatus1 = new V1DeploymentStatus().observedGeneration(10L);
        V1DeploymentStatus deploymentStatus2 = new V1DeploymentStatus().observedGeneration(11L);
        // Assert
        assertFalse(deploymentStatus1.equals(deploymentStatus2));
    }

    //BaseRock generated method id: ${testEqualsDifferentReadyReplicas}, hash: 05DD19E9E38E2C0B79AEF85996BDBC8B
    @Test
    public void testEqualsDifferentReadyReplicas() {
        // Arrange
        V1DeploymentStatus deploymentStatus1 = new V1DeploymentStatus().readyReplicas(7);
        V1DeploymentStatus deploymentStatus2 = new V1DeploymentStatus().readyReplicas(8);
        // Assert
        assertFalse(deploymentStatus1.equals(deploymentStatus2));
    }

    //BaseRock generated method id: ${testEqualsDifferentReplicas}, hash: 997F2BD25DF1125DAC063CCDE4681C05
    @Test
    public void testEqualsDifferentReplicas() {
        // Arrange
        V1DeploymentStatus deploymentStatus1 = new V1DeploymentStatus().replicas(9);
        V1DeploymentStatus deploymentStatus2 = new V1DeploymentStatus().replicas(10);
        // Assert
        assertFalse(deploymentStatus1.equals(deploymentStatus2));
    }

    //BaseRock generated method id: ${testEqualsDifferentUnavailableReplicas}, hash: EC3F657A102C3AAC649D3A1A394B99C0
    @Test
    public void testEqualsDifferentUnavailableReplicas() {
        // Arrange
        V1DeploymentStatus deploymentStatus1 = new V1DeploymentStatus().unavailableReplicas(2);
        V1DeploymentStatus deploymentStatus2 = new V1DeploymentStatus().unavailableReplicas(3);
        // Assert
        assertFalse(deploymentStatus1.equals(deploymentStatus2));
    }

    //BaseRock generated method id: ${testEqualsDifferentUpdatedReplicas}, hash: CF6C405C542F538C00A4CAD40F60F8F3
    @Test
    public void testEqualsDifferentUpdatedReplicas() {
        // Arrange
        V1DeploymentStatus deploymentStatus1 = new V1DeploymentStatus().updatedReplicas(6);
        V1DeploymentStatus deploymentStatus2 = new V1DeploymentStatus().updatedReplicas(7);
        // Assert
        assertFalse(deploymentStatus1.equals(deploymentStatus2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 8CDD15476143588D9C4D25A223767E9A
    @Test
    public void testHashCode() {
        // Arrange
        V1DeploymentStatus deploymentStatus1 = new V1DeploymentStatus().availableReplicas(5).collisionCount(3).observedGeneration(10L).readyReplicas(7).replicas(9).unavailableReplicas(2).updatedReplicas(6);
        V1DeploymentStatus deploymentStatus2 = new V1DeploymentStatus().availableReplicas(5).collisionCount(3).observedGeneration(10L).readyReplicas(7).replicas(9).unavailableReplicas(2).updatedReplicas(6);
        // Assert
        assertEquals(deploymentStatus1.hashCode(), deploymentStatus2.hashCode());
    }

    //BaseRock generated method id: ${testHashCodeDifferentValues}, hash: 8F6A842754E69785801F289296AF05FE
    @Test
    public void testHashCodeDifferentValues() {
        // Arrange
        V1DeploymentStatus deploymentStatus1 = new V1DeploymentStatus().availableReplicas(5);
        V1DeploymentStatus deploymentStatus2 = new V1DeploymentStatus().availableReplicas(6);
        // Assert
        assertNotEquals(deploymentStatus1.hashCode(), deploymentStatus2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: D9134431BFB7E10E4AA23D3370624E6D
    @Test
    public void testToString() {
        // Arrange
        V1DeploymentStatus deploymentStatus = new V1DeploymentStatus().availableReplicas(5).collisionCount(3).observedGeneration(10L).readyReplicas(7).replicas(9).unavailableReplicas(2).updatedReplicas(6);
        // Act
        String result = deploymentStatus.toString();
        // Assert
        assertThat(result, is(notNullValue()));
        assertTrue(result.contains("availableReplicas: 5"));
        assertTrue(result.contains("collisionCount: 3"));
        assertTrue(result.contains("observedGeneration: 10"));
        assertTrue(result.contains("readyReplicas: 7"));
        assertTrue(result.contains("replicas: 9"));
        assertTrue(result.contains("unavailableReplicas: 2"));
        assertTrue(result.contains("updatedReplicas: 6"));
    }

    //BaseRock generated method id: ${testNullValuesOnFields}, hash: 497F09706143F5FEBA5AB1AFCE9E5448
    @ParameterizedTest
    @NullSource
    public void testNullValuesOnFields(Integer value) {
        // Arrange & Act
        V1DeploymentStatus deploymentStatus = new V1DeploymentStatus().availableReplicas(value).collisionCount(value).readyReplicas(value).replicas(value).unavailableReplicas(value).updatedReplicas(value);
        // Assert
        assertThat(deploymentStatus.getAvailableReplicas(), is(nullValue()));
        assertThat(deploymentStatus.getCollisionCount(), is(nullValue()));
        assertThat(deploymentStatus.getReadyReplicas(), is(nullValue()));
        assertThat(deploymentStatus.getReplicas(), is(nullValue()));
        assertThat(deploymentStatus.getUnavailableReplicas(), is(nullValue()));
        assertThat(deploymentStatus.getUpdatedReplicas(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNullObservedGeneration}, hash: 1B391E497D8A839AEB78EDE9C9971A00
    @Test
    public void testNullObservedGeneration() {
        // Arrange & Act
        V1DeploymentStatus deploymentStatus = new V1DeploymentStatus().observedGeneration(null);
        // Assert
        assertThat(deploymentStatus.getObservedGeneration(), is(nullValue()));
    }
}
