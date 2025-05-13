package io.kubernetes.client.openapi.models;

import java.util.List;
import io.kubernetes.client.openapi.models.V1Scheduling;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1Toleration;
import java.util.ArrayList;
import static org.hamcrest.Matchers.hasEntry;
import java.util.HashMap;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1SchedulingBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1SchedulingConstructor}, hash: 3EEFBFF5D9DF519B3C44339037CFAC26
    @Test
    void testV1SchedulingConstructor() {
        V1Scheduling scheduling = new V1Scheduling();
        assertNotNull(scheduling);
    }

    //BaseRock generated method id: ${testNodeSelector}, hash: EE4E4D4B4DA0EE3B4D533479CDB902A6
    @Test
    void testNodeSelector() {
        V1Scheduling scheduling = new V1Scheduling();
        Map<String, String> nodeSelector = new HashMap<>();
        nodeSelector.put("key", "value");
        scheduling.setNodeSelector(nodeSelector);
        assertEquals(nodeSelector, scheduling.getNodeSelector());
        scheduling.putNodeSelectorItem("newKey", "newValue");
        assertThat(scheduling.getNodeSelector(), hasEntry("newKey", "newValue"));
    }

    //BaseRock generated method id: ${testTolerations}, hash: 6F944C3BBA70E97B0894C067645DAEED
    @Test
    void testTolerations() {
        V1Scheduling scheduling = new V1Scheduling();
        List<V1Toleration> tolerations = new ArrayList<>();
        V1Toleration toleration = mock(V1Toleration.class);
        tolerations.add(toleration);
        scheduling.setTolerations(tolerations);
        assertEquals(tolerations, scheduling.getTolerations());
        V1Toleration newToleration = mock(V1Toleration.class);
        scheduling.addTolerationsItem(newToleration);
        assertThat(scheduling.getTolerations(), hasSize(2));
    }

    //BaseRock generated method id: ${testEquals}, hash: 5D33C1D04C4C24E768FF28495FCC5E3E
    @Test
    void testEquals() {
        V1Scheduling scheduling1 = new V1Scheduling();
        V1Scheduling scheduling2 = new V1Scheduling();
        Map<String, String> nodeSelector = new HashMap<>();
        nodeSelector.put("key", "value");
        scheduling1.setNodeSelector(nodeSelector);
        scheduling2.setNodeSelector(nodeSelector);
        List<V1Toleration> tolerations = new ArrayList<>();
        V1Toleration toleration = mock(V1Toleration.class);
        tolerations.add(toleration);
        scheduling1.setTolerations(tolerations);
        scheduling2.setTolerations(tolerations);
        assertThat(scheduling1, is(equalTo(scheduling2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 878326AEF26ED00EEF1084ED4DAD933C
    @Test
    void testHashCode() {
        V1Scheduling scheduling = new V1Scheduling();
        Map<String, String> nodeSelector = new HashMap<>();
        nodeSelector.put("key", "value");
        scheduling.setNodeSelector(nodeSelector);
        List<V1Toleration> tolerations = new ArrayList<>();
        V1Toleration toleration = mock(V1Toleration.class);
        tolerations.add(toleration);
        scheduling.setTolerations(tolerations);
        assertThat(scheduling.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: C07975705CC175B826E37FEF9AC84A08
    @Test
    void testToString() {
        V1Scheduling scheduling = new V1Scheduling();
        Map<String, String> nodeSelector = new HashMap<>();
        nodeSelector.put("key", "value");
        scheduling.setNodeSelector(nodeSelector);
        List<V1Toleration> tolerations = new ArrayList<>();
        V1Toleration toleration = mock(V1Toleration.class);
        tolerations.add(toleration);
        scheduling.setTolerations(tolerations);
        String result = scheduling.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("nodeSelector"), is(true));
        assertThat(result.contains("tolerations"), is(true));
    }
}
