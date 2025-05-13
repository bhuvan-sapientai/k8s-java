package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ServiceStatus;
import io.kubernetes.client.openapi.models.V1LoadBalancerStatus;
import java.util.List;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1Condition;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.ArrayList;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ServiceStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1ServiceStatusConstructor}, hash: 7299B5B22828514E07DD6C2DDF9A69A5
    @Test
    void testV1ServiceStatusConstructor() {
        V1ServiceStatus status = new V1ServiceStatus();
        assertNotNull(status);
    }

    //BaseRock generated method id: ${testConditions}, hash: 54F422213EAC0F84664892B9D07B9812
    @Test
    void testConditions() {
        V1ServiceStatus status = new V1ServiceStatus();
        List<V1Condition> conditions = new ArrayList<>();
        V1Condition condition = mock(V1Condition.class);
        conditions.add(condition);
        status.setConditions(conditions);
        assertEquals(conditions, status.getConditions());
        V1Condition anotherCondition = mock(V1Condition.class);
        status.addConditionsItem(anotherCondition);
        assertEquals(2, status.getConditions().size());
    }

    //BaseRock generated method id: ${testLoadBalancer}, hash: 2A7E11E3A82B1F9A3BB36C531ECF27E0
    @Test
    void testLoadBalancer() {
        V1ServiceStatus status = new V1ServiceStatus();
        V1LoadBalancerStatus loadBalancer = mock(V1LoadBalancerStatus.class);
        status.setLoadBalancer(loadBalancer);
        assertEquals(loadBalancer, status.getLoadBalancer());
    }

    //BaseRock generated method id: ${testEquals}, hash: 4F847B26BAA97184A682BA93C767FE8C
    @Test
    void testEquals() {
        V1ServiceStatus status1 = new V1ServiceStatus().conditions(new ArrayList<>()).loadBalancer(new V1LoadBalancerStatus());
        V1ServiceStatus status2 = new V1ServiceStatus().conditions(new ArrayList<>()).loadBalancer(new V1LoadBalancerStatus());
        V1ServiceStatus status3 = new V1ServiceStatus().conditions(null).loadBalancer(null);
        assertThat(status1.equals(status2), is(true));
        assertThat(status1.equals(status3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: F94176128CBD2A7CE68F62117B37AAAF
    @Test
    void testHashCode() {
        V1ServiceStatus status1 = new V1ServiceStatus().conditions(new ArrayList<>()).loadBalancer(new V1LoadBalancerStatus());
        V1ServiceStatus status2 = new V1ServiceStatus().conditions(new ArrayList<>()).loadBalancer(new V1LoadBalancerStatus());
        assertThat(status1.hashCode(), equalTo(status2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: D62E85C0270BE8E683756158BB76BCFC
    @Test
    void testToString() {
        V1ServiceStatus status = new V1ServiceStatus().conditions(new ArrayList<>()).loadBalancer(new V1LoadBalancerStatus());
        String result = status.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("conditions"), is(true));
        assertThat(result.contains("loadBalancer"), is(true));
    }

    //BaseRock generated method id: ${testSetNullConditions}, hash: 9851703BE2B94DC46C252FF33B85DB41
    @Test
    void testSetNullConditions() {
        V1ServiceStatus status = new V1ServiceStatus();
        status.setConditions(null);
        assertThat(status.getConditions(), nullValue());
    }

    //BaseRock generated method id: ${testSetNullLoadBalancer}, hash: 535754FA3813DE8671FB1F1ECFC2CA6F
    @Test
    void testSetNullLoadBalancer() {
        V1ServiceStatus status = new V1ServiceStatus();
        status.setLoadBalancer(null);
        assertThat(status.getLoadBalancer(), nullValue());
    }
}
