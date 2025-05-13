package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import io.kubernetes.client.openapi.models.V1Condition;
import io.kubernetes.client.openapi.models.V1beta1ServiceCIDRStatus;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1ServiceCIDRStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 96535055A96CA9CC3DECE87244F6E442
    @Test
    void testConstructor() {
        V1beta1ServiceCIDRStatus status = new V1beta1ServiceCIDRStatus();
        assertNotNull(status);
    }

    //BaseRock generated method id: ${testConditions}, hash: 8FE435281A87FC4AE61B0B17D378C3B9
    @Test
    void testConditions() {
        V1beta1ServiceCIDRStatus status = new V1beta1ServiceCIDRStatus();
        List<V1Condition> conditions = new ArrayList<>();
        V1Condition condition = mock(V1Condition.class);
        conditions.add(condition);
        status.conditions(conditions);
        assertEquals(conditions, status.getConditions());
    }

    //BaseRock generated method id: ${testAddConditionsItem}, hash: 6530CF91473A99FDE34FC33FCCDF0C9D
    @Test
    void testAddConditionsItem() {
        V1beta1ServiceCIDRStatus status = new V1beta1ServiceCIDRStatus();
        V1Condition condition = mock(V1Condition.class);
        status.addConditionsItem(condition);
        assertEquals(1, status.getConditions().size());
        assertEquals(condition, status.getConditions().get(0));
    }

    //BaseRock generated method id: ${testGetConditions}, hash: DD9E52EEDC915FC14B5FED623A5CCD27
    @Test
    void testGetConditions() {
        V1beta1ServiceCIDRStatus status = new V1beta1ServiceCIDRStatus();
        assertNotNull(status.getConditions());
        assertTrue(status.getConditions().isEmpty());
        List<V1Condition> conditions = new ArrayList<>();
        V1Condition condition = mock(V1Condition.class);
        conditions.add(condition);
        status.setConditions(conditions);
        assertNotNull(status.getConditions());
        assertEquals(1, status.getConditions().size());
        assertEquals(condition, status.getConditions().get(0));
    }

    //BaseRock generated method id: ${testSetConditions}, hash: 8E9DF02A7CDD8A71839C1165A7FC6FCA
    @Test
    void testSetConditions() {
        V1beta1ServiceCIDRStatus status = new V1beta1ServiceCIDRStatus();
        List<V1Condition> conditions = new ArrayList<>();
        V1Condition condition = mock(V1Condition.class);
        conditions.add(condition);
        status.setConditions(conditions);
        assertEquals(conditions, status.getConditions());
    }

    //BaseRock generated method id: ${testEquals}, hash: B21BB42B7394D0EE7A3D0390ACC5DC9A
    @Test
    void testEquals() {
        V1beta1ServiceCIDRStatus status1 = new V1beta1ServiceCIDRStatus();
        V1beta1ServiceCIDRStatus status2 = new V1beta1ServiceCIDRStatus();
        assertTrue(status1.equals(status2));
        List<V1Condition> conditions = new ArrayList<>();
        V1Condition condition = mock(V1Condition.class);
        conditions.add(condition);
        status1.setConditions(conditions);
        assertFalse(status1.equals(status2));
        status2.setConditions(conditions);
        assertTrue(status1.equals(status2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: BE8B4E4AE774019175D07DD3BD0EF258
    @Test
    void testHashCode() {
        V1beta1ServiceCIDRStatus status1 = new V1beta1ServiceCIDRStatus();
        V1beta1ServiceCIDRStatus status2 = new V1beta1ServiceCIDRStatus();
        assertEquals(status1.hashCode(), status2.hashCode());
        List<V1Condition> conditions = new ArrayList<>();
        V1Condition condition = mock(V1Condition.class);
        conditions.add(condition);
        status1.setConditions(conditions);
        assertNotEquals(status1.hashCode(), status2.hashCode());
        status2.setConditions(conditions);
        assertEquals(status1.hashCode(), status2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 3CD21DA9338956804EA37E458E82C725
    @Test
    void testToString() {
        V1beta1ServiceCIDRStatus status = new V1beta1ServiceCIDRStatus();
        assertNotNull(status.toString());
        List<V1Condition> conditions = new ArrayList<>();
        V1Condition condition = mock(V1Condition.class);
        when(condition.toString()).thenReturn("MockCondition");
        conditions.add(condition);
        status.setConditions(conditions);
        String statusString = status.toString();
        assertNotNull(statusString);
        assertTrue(statusString.contains("MockCondition"));
    }
}
