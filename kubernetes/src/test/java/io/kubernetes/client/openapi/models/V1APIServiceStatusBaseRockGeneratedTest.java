package io.kubernetes.client.openapi.models;

import java.util.List;
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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import io.kubernetes.client.openapi.models.V1APIServiceCondition;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import java.util.ArrayList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import io.kubernetes.client.openapi.models.V1APIServiceStatus;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1APIServiceStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 310A75766E815205A51CBF3FF83E130A
    @Test
    void testConstructor() {
        V1APIServiceStatus status = new V1APIServiceStatus();
        assertNotNull(status);
        assertThat(status.getConditions(), is(empty()));
    }

    //BaseRock generated method id: ${testSetAndGetConditions}, hash: 2A26E96F81C4D64A15DEB7190DCECFAD
    @Test
    void testSetAndGetConditions() {
        V1APIServiceStatus status = new V1APIServiceStatus();
        List<V1APIServiceCondition> conditions = new ArrayList<>();
        conditions.add(new V1APIServiceCondition());
        status.setConditions(conditions);
        assertThat(status.getConditions(), is(notNullValue()));
        assertThat(status.getConditions(), hasSize(1));
    }

    //BaseRock generated method id: ${testAddConditionsItem}, hash: F406EA9D82B2D37DC7E08678F121E501
    @Test
    void testAddConditionsItem() {
        V1APIServiceStatus status = new V1APIServiceStatus();
        V1APIServiceCondition condition = new V1APIServiceCondition();
        status.addConditionsItem(condition);
        assertThat(status.getConditions(), is(notNullValue()));
        assertThat(status.getConditions(), hasSize(1));
        assertThat(status.getConditions().get(0), is(equalTo(condition)));
    }

    //BaseRock generated method id: ${testAddConditionsItemToExistingList}, hash: 889355A7A91BA1AB5187C80B7BE3C315
    @Test
    void testAddConditionsItemToExistingList() {
        V1APIServiceStatus status = new V1APIServiceStatus();
        List<V1APIServiceCondition> initialConditions = new ArrayList<>();
        initialConditions.add(new V1APIServiceCondition());
        status.setConditions(initialConditions);
        V1APIServiceCondition newCondition = new V1APIServiceCondition();
        status.addConditionsItem(newCondition);
        assertThat(status.getConditions(), hasSize(2));
        assertThat(status.getConditions(), containsInAnyOrder(initialConditions.get(0), newCondition));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 317F798F72AF18F837D55885ED3E0159
    @Test
    void testEqualsAndHashCode() {
        V1APIServiceStatus status1 = new V1APIServiceStatus();
        V1APIServiceStatus status2 = new V1APIServiceStatus();
        assertEquals(status1, status2);
        assertEquals(status1.hashCode(), status2.hashCode());
        List<V1APIServiceCondition> conditions = new ArrayList<>();
        conditions.add(new V1APIServiceCondition());
        status1.setConditions(conditions);
        assertThat(status1.equals(status2), is(false));
        assertThat(status1.hashCode() == status2.hashCode(), is(false));
        status2.setConditions(conditions);
        assertEquals(status1, status2);
        assertEquals(status1.hashCode(), status2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 9898951C71593881C52995B109524240
    @Test
    void testToString() {
        V1APIServiceStatus status = new V1APIServiceStatus();
        List<V1APIServiceCondition> conditions = new ArrayList<>();
        conditions.add(new V1APIServiceCondition());
        status.setConditions(conditions);
        String toString = status.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("conditions"), is(true));
    }

    //BaseRock generated method id: ${testConditionsWithNull}, hash: 6CFF5DDC1B7378030C4144A49C359C5E
    @Test
    void testConditionsWithNull() {
        V1APIServiceStatus status = new V1APIServiceStatus();
        status.setConditions(null);
        assertThat(status.getConditions(), is(nullValue()));
    }

    //BaseRock generated method id: ${testConditionsWithEmptyList}, hash: 9C9F0D91468189D11B402C39C3507A1F
    @Test
    void testConditionsWithEmptyList() {
        V1APIServiceStatus status = new V1APIServiceStatus();
        status.setConditions(new ArrayList<>());
        assertThat(status.getConditions(), is(empty()));
    }

    //BaseRock generated method id: ${testAddConditionsItemToNullList}, hash: 37C71A9A911A8AF1C2ECE0D5B0080147
    @Test
    void testAddConditionsItemToNullList() {
        V1APIServiceStatus status = new V1APIServiceStatus();
        V1APIServiceCondition condition = new V1APIServiceCondition();
        status.addConditionsItem(condition);
        assertThat(status.getConditions(), is(notNullValue()));
        assertThat(status.getConditions(), hasSize(1));
        assertThat(status.getConditions().get(0), is(equalTo(condition)));
    }
}
