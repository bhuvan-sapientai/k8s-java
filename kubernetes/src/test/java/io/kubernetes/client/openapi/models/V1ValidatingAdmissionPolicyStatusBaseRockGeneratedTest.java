package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1TypeChecking;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.V1Condition;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import io.kubernetes.client.openapi.models.V1ValidatingAdmissionPolicyStatus;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ValidatingAdmissionPolicyStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1ValidatingAdmissionPolicyStatusConstructor}, hash: 6C91635B16DB406CA2FDE4719C88C1C9
    @Test
    void testV1ValidatingAdmissionPolicyStatusConstructor() {
        V1ValidatingAdmissionPolicyStatus status = new V1ValidatingAdmissionPolicyStatus();
        assertNotNull(status);
    }

    //BaseRock generated method id: ${testSetAndGetConditions}, hash: EC3B3C3D5312DA92086D77CDBBF12C9E
    @Test
    void testSetAndGetConditions() {
        V1ValidatingAdmissionPolicyStatus status = new V1ValidatingAdmissionPolicyStatus();
        List<V1Condition> conditions = new ArrayList<>();
        V1Condition condition = mock(V1Condition.class);
        conditions.add(condition);
        status.setConditions(conditions);
        assertEquals(conditions, status.getConditions());
    }

    //BaseRock generated method id: ${testAddConditionsItem}, hash: D8D0B6A272045349E725B1FCE317970A
    @Test
    void testAddConditionsItem() {
        V1ValidatingAdmissionPolicyStatus status = new V1ValidatingAdmissionPolicyStatus();
        V1Condition condition = mock(V1Condition.class);
        status.addConditionsItem(condition);
        assertThat(status.getConditions(), hasSize(1));
        assertThat(status.getConditions(), containsInAnyOrder(condition));
    }

    //BaseRock generated method id: ${testSetAndGetObservedGeneration}, hash: 186B7DBB2C1B87482B0B52B56BF77FCE
    @Test
    void testSetAndGetObservedGeneration() {
        V1ValidatingAdmissionPolicyStatus status = new V1ValidatingAdmissionPolicyStatus();
        Long observedGeneration = 123L;
        status.setObservedGeneration(observedGeneration);
        assertEquals(observedGeneration, status.getObservedGeneration());
    }

    //BaseRock generated method id: ${testSetAndGetTypeChecking}, hash: B8E36C8FDD96568B2B48CFF6EA54E574
    @Test
    void testSetAndGetTypeChecking() {
        V1ValidatingAdmissionPolicyStatus status = new V1ValidatingAdmissionPolicyStatus();
        V1TypeChecking typeChecking = mock(V1TypeChecking.class);
        status.setTypeChecking(typeChecking);
        assertEquals(typeChecking, status.getTypeChecking());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 913B6F503FECBEFD88569BF7127B779E
    @Test
    void testEqualsAndHashCode() {
        V1ValidatingAdmissionPolicyStatus status1 = new V1ValidatingAdmissionPolicyStatus().conditions(new ArrayList<>()).observedGeneration(123L).typeChecking(new V1TypeChecking());
        V1ValidatingAdmissionPolicyStatus status2 = new V1ValidatingAdmissionPolicyStatus().conditions(new ArrayList<>()).observedGeneration(123L).typeChecking(new V1TypeChecking());
        assertEquals(status1, status2);
        assertEquals(status1.hashCode(), status2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: A2F29B99FDB51A30C668295A63E98ADA
    @Test
    void testToString() {
        V1ValidatingAdmissionPolicyStatus status = new V1ValidatingAdmissionPolicyStatus().conditions(new ArrayList<>()).observedGeneration(123L).typeChecking(mock(V1TypeChecking.class));
        String toString = status.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("conditions"), equalTo(true));
        assertThat(toString.contains("observedGeneration"), equalTo(true));
        assertThat(toString.contains("typeChecking"), equalTo(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: A1995AF89EE20130B37A2860624DE49D
    @Test
    void testBuilder() {
        List<V1Condition> conditions = new ArrayList<>();
        conditions.add(mock(V1Condition.class));
        Long observedGeneration = 123L;
        V1TypeChecking typeChecking = mock(V1TypeChecking.class);
        V1ValidatingAdmissionPolicyStatus status = new V1ValidatingAdmissionPolicyStatus().conditions(conditions).observedGeneration(observedGeneration).typeChecking(typeChecking);
        assertThat(status.getConditions(), equalTo(conditions));
        assertThat(status.getObservedGeneration(), equalTo(observedGeneration));
        assertThat(status.getTypeChecking(), equalTo(typeChecking));
    }

    //BaseRock generated method id: ${testBuilderWithNullValues}, hash: B3B67D6FFB3C2C4E3371F5D2509F3D57
    @Test
    void testBuilderWithNullValues() {
        V1ValidatingAdmissionPolicyStatus status = new V1ValidatingAdmissionPolicyStatus().conditions(null).observedGeneration(null).typeChecking(null);
        assertThat(status.getConditions(), nullValue());
        assertThat(status.getObservedGeneration(), nullValue());
        assertThat(status.getTypeChecking(), nullValue());
    }
}
