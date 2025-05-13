package io.kubernetes.client.openapi.models;

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
import io.kubernetes.client.openapi.models.V1Condition;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1beta1TypeChecking;
import java.util.ArrayList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1ValidatingAdmissionPolicyStatusBaseRockGeneratedTest {

    private V1beta1ValidatingAdmissionPolicyStatus status;

    @BeforeEach
    void setUp() {
        status = new V1beta1ValidatingAdmissionPolicyStatus();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 9438689FA9EC88C1FCE2B1836C4FC623
    @Test
    void testConstructor() {
        assertThat(status, is(notNullValue()));
    }

    //BaseRock generated method id: ${testConditions}, hash: 2EAA4639FE868715E8B6E46F1CC8B85F
    @Test
    void testConditions() {
        List<V1Condition> conditions = new ArrayList<>();
        V1Condition condition = mock(V1Condition.class);
        conditions.add(condition);
        status.setConditions(conditions);
        assertEquals(conditions, status.getConditions());
        status.addConditionsItem(condition);
        assertThat(status.getConditions(), hasSize(2));
        assertThat(status.getConditions(), containsInAnyOrder(condition, condition));
    }

    //BaseRock generated method id: ${testObservedGeneration}, hash: 3C62B6CB99DCE4DC0718A14E0198B98F
    @Test
    void testObservedGeneration() {
        Long generation = 123L;
        status.setObservedGeneration(generation);
        assertEquals(generation, status.getObservedGeneration());
    }

    //BaseRock generated method id: ${testTypeChecking}, hash: D9103028F14239B116EA16DE4DC28304
    @Test
    void testTypeChecking() {
        V1beta1TypeChecking typeChecking = mock(V1beta1TypeChecking.class);
        status.setTypeChecking(typeChecking);
        assertEquals(typeChecking, status.getTypeChecking());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 3601A5B29C83D5B3A5E8E46BBD802C83
    @Test
    void testEqualsAndHashCode() {
        V1beta1ValidatingAdmissionPolicyStatus status1 = new V1beta1ValidatingAdmissionPolicyStatus().conditions(new ArrayList<>()).observedGeneration(1L).typeChecking(new V1beta1TypeChecking());
        V1beta1ValidatingAdmissionPolicyStatus status2 = new V1beta1ValidatingAdmissionPolicyStatus().conditions(new ArrayList<>()).observedGeneration(1L).typeChecking(new V1beta1TypeChecking());
        assertThat(status1, equalTo(status2));
        assertThat(status1.hashCode(), equalTo(status2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 9A714250A6F9699E13E2DDF7F817F132
    @Test
    void testToString() {
        V1beta1ValidatingAdmissionPolicyStatus status = new V1beta1ValidatingAdmissionPolicyStatus().conditions(new ArrayList<>()).observedGeneration(1L).typeChecking(new V1beta1TypeChecking());
        String toString = status.toString();
        assertThat(toString, notNullValue());
        assertThat(toString, startsWith("class V1beta1ValidatingAdmissionPolicyStatus {"));
        assertThat(toString, endsWith("}"));
        assertThat(toString.contains("conditions"), is(true));
        assertThat(toString.contains("observedGeneration"), is(true));
        assertThat(toString.contains("typeChecking"), is(true));
    }

    //BaseRock generated method id: ${testSetNullValues}, hash: EE66FFA4627B3DB2B83957F7A20A9F58
    @Test
    void testSetNullValues() {
        status.setConditions(null);
        status.setObservedGeneration(null);
        status.setTypeChecking(null);
        assertThat(status.getConditions(), is(nullValue()));
        assertThat(status.getObservedGeneration(), is(nullValue()));
        assertThat(status.getTypeChecking(), is(nullValue()));
    }
}
