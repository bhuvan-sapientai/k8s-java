package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1NamespaceCondition;
import java.util.List;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1NamespaceStatus;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1NamespaceStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1NamespaceStatusConstructor}, hash: FCE9FE830F9A9667F5CE532E88245DEB
    @Test
    void testV1NamespaceStatusConstructor() {
        V1NamespaceStatus status = new V1NamespaceStatus();
        assertNotNull(status);
    }

    //BaseRock generated method id: ${testConditions}, hash: F6336B482C219024C62193474364B3FB
    @Test
    void testConditions() {
        V1NamespaceStatus status = new V1NamespaceStatus();
        List<V1NamespaceCondition> conditions = new ArrayList<>();
        V1NamespaceCondition condition = new V1NamespaceCondition();
        conditions.add(condition);
        status.setConditions(conditions);
        assertEquals(conditions, status.getConditions());
        status.addConditionsItem(new V1NamespaceCondition());
        assertThat(status.getConditions(), hasSize(2));
    }

    //BaseRock generated method id: ${testPhase}, hash: 3821388B68609CD4FA94B0186B951FF9
    @Test
    void testPhase() {
        V1NamespaceStatus status = new V1NamespaceStatus();
        String phase = "Active";
        status.setPhase(phase);
        assertEquals(phase, status.getPhase());
    }

    //BaseRock generated method id: ${testEquals}, hash: AE28F39FE89B72F525E0A70361984742
    @Test
    void testEquals() {
        V1NamespaceStatus status1 = new V1NamespaceStatus().conditions(new ArrayList<>()).phase("Active");
        V1NamespaceStatus status2 = new V1NamespaceStatus().conditions(new ArrayList<>()).phase("Active");
        V1NamespaceStatus status3 = new V1NamespaceStatus().conditions(new ArrayList<>()).phase("Terminating");
        assertThat(status1.equals(status2), is(true));
        assertThat(status1.equals(status3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 953D6890A70C2ED4FD46675BEC70FE7B
    @Test
    void testHashCode() {
        V1NamespaceStatus status1 = new V1NamespaceStatus().conditions(new ArrayList<>()).phase("Active");
        V1NamespaceStatus status2 = new V1NamespaceStatus().conditions(new ArrayList<>()).phase("Active");
        assertEquals(status1.hashCode(), status2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: F178A3BB97512A84AE9344933F94160C
    @Test
    void testToString() {
        V1NamespaceStatus status = new V1NamespaceStatus().conditions(new ArrayList<>()).phase("Active");
        String toString = status.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("conditions"), is(true));
        assertThat(toString.contains("phase"), is(true));
    }

    //BaseRock generated method id: ${testConditionsWithNull}, hash: 92CDFA9729E57E58473B6B563E130EAC
    @Test
    void testConditionsWithNull() {
        V1NamespaceStatus status = new V1NamespaceStatus();
        status.setConditions(null);
        assertThat(status.getConditions(), nullValue());
    }

    //BaseRock generated method id: ${testPhaseWithNull}, hash: 19ABCE2211592E50DF749C584642FA2B
    @Test
    void testPhaseWithNull() {
        V1NamespaceStatus status = new V1NamespaceStatus();
        status.setPhase(null);
        assertThat(status.getPhase(), nullValue());
    }

    //BaseRock generated method id: ${testAddConditionsItemWithNull}, hash: 8207DD2B79C098338056045EF5949E44
    @Test
    void testAddConditionsItemWithNull() {
        V1NamespaceStatus status = new V1NamespaceStatus();
        status.addConditionsItem(null);
        assertThat(status.getConditions(), hasSize(1));
        assertThat(status.getConditions().get(0), nullValue());
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: 162C7F487DC585ED69551D69E5E7E8F5
    @Test
    void testEqualsWithNull() {
        V1NamespaceStatus status = new V1NamespaceStatus();
        assertThat(status.equals(null), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: FD9276A27AA8F3C26157290AAFC6DDCD
    @Test
    void testEqualsWithDifferentClass() {
        V1NamespaceStatus status = new V1NamespaceStatus();
        assertThat(status.equals("Not a V1NamespaceStatus"), is(false));
    }

    //BaseRock generated method id: ${testConditionsItemOrder}, hash: 69424FF2EBE74B6ECA28F0D1A5C4D92D
    @Test
    void testConditionsItemOrder() {
        V1NamespaceStatus status = new V1NamespaceStatus();
        V1NamespaceCondition condition1 = new V1NamespaceCondition().type("Type1");
        V1NamespaceCondition condition2 = new V1NamespaceCondition().type("Type2");
        status.addConditionsItem(condition1);
        status.addConditionsItem(condition2);
        assertThat(status.getConditions(), containsInAnyOrder(equalTo(condition1), equalTo(condition2)));
    }
}
