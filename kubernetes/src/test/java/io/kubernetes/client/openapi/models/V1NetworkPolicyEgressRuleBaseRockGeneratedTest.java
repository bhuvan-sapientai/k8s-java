package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.V1NetworkPolicyPeer;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import java.util.ArrayList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import io.kubernetes.client.openapi.models.V1NetworkPolicyPort;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1NetworkPolicyEgressRuleBaseRockGeneratedTest {

    //BaseRock generated method id: ${testDefaultConstructor}, hash: 75311D6D9F1A6FDAFFE30927D3A968EE
    @Test
    void testDefaultConstructor() {
        V1NetworkPolicyEgressRule rule = new V1NetworkPolicyEgressRule();
        assertNotNull(rule);
        assertThat(rule.getPorts(), is(empty()));
        assertThat(rule.getTo(), is(empty()));
    }

    //BaseRock generated method id: ${testSetAndGetPorts}, hash: AEC418B50AE68E870CBB84AEC7AB21F9
    @Test
    void testSetAndGetPorts() {
        V1NetworkPolicyEgressRule rule = new V1NetworkPolicyEgressRule();
        List<V1NetworkPolicyPort> ports = new ArrayList<>();
        ports.add(new V1NetworkPolicyPort());
        rule.setPorts(ports);
        assertThat(rule.getPorts(), is(ports));
    }

    //BaseRock generated method id: ${testSetAndGetTo}, hash: A1B19FB8FF8F294F4F8BC9DAF336F7A2
    @Test
    void testSetAndGetTo() {
        V1NetworkPolicyEgressRule rule = new V1NetworkPolicyEgressRule();
        List<V1NetworkPolicyPeer> to = new ArrayList<>();
        to.add(new V1NetworkPolicyPeer());
        rule.setTo(to);
        assertThat(rule.getTo(), is(to));
    }

    //BaseRock generated method id: ${testAddPortsItem}, hash: DE5827BE9E466D3AC4DD632360B79EB5
    @Test
    void testAddPortsItem() {
        V1NetworkPolicyEgressRule rule = new V1NetworkPolicyEgressRule();
        V1NetworkPolicyPort port = new V1NetworkPolicyPort();
        rule.addPortsItem(port);
        assertThat(rule.getPorts(), hasSize(1));
        assertThat(rule.getPorts().get(0), is(port));
    }

    //BaseRock generated method id: ${testAddToItem}, hash: 9F41391DEBBD4BC03B4FD0D766C6A7CC
    @Test
    void testAddToItem() {
        V1NetworkPolicyEgressRule rule = new V1NetworkPolicyEgressRule();
        V1NetworkPolicyPeer peer = new V1NetworkPolicyPeer();
        rule.addToItem(peer);
        assertThat(rule.getTo(), hasSize(1));
        assertThat(rule.getTo().get(0), is(peer));
    }

    //BaseRock generated method id: ${testEquals}, hash: E898008AF9F8AB16625AE74C3DBD21DA
    @Test
    void testEquals() {
        V1NetworkPolicyEgressRule rule1 = new V1NetworkPolicyEgressRule().ports(new ArrayList<>()).to(new ArrayList<>());
        V1NetworkPolicyEgressRule rule2 = new V1NetworkPolicyEgressRule().ports(new ArrayList<>()).to(new ArrayList<>());
        assertEquals(rule1, rule2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: B21595BB78263B509052DB15701ED370
    @Test
    void testHashCode() {
        V1NetworkPolicyEgressRule rule = new V1NetworkPolicyEgressRule().ports(new ArrayList<>()).to(new ArrayList<>());
        assertThat(rule.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: F6E08C712FE5F372566D7ED369AD267A
    @Test
    void testToString() {
        V1NetworkPolicyEgressRule rule = new V1NetworkPolicyEgressRule().ports(new ArrayList<>()).to(new ArrayList<>());
        String toString = rule.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("class V1NetworkPolicyEgressRule"), is(true));
        assertThat(toString.contains("ports"), is(true));
        assertThat(toString.contains("to"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: DC12AAF9DE7CC4F41541018BC2AF38C3
    @Test
    void testBuilder() {
        List<V1NetworkPolicyPort> ports = new ArrayList<>();
        ports.add(new V1NetworkPolicyPort());
        List<V1NetworkPolicyPeer> to = new ArrayList<>();
        to.add(new V1NetworkPolicyPeer());
        V1NetworkPolicyEgressRule rule = new V1NetworkPolicyEgressRule().ports(ports).to(to);
        assertThat(rule.getPorts(), is(ports));
        assertThat(rule.getTo(), is(to));
    }

    //BaseRock generated method id: ${testOpenApiFields}, hash: B0DB7E0567107EFC65AC992BFBB530BB
    @Test
    void testOpenApiFields() {
        assertThat(V1NetworkPolicyEgressRule.openapiFields, containsInAnyOrder("ports", "to"));
    }

    //BaseRock generated method id: ${testOpenApiRequiredFields}, hash: CDB792EDFFE6347DCDC139ED5F3FA410
    @Test
    void testOpenApiRequiredFields() {
        assertThat(V1NetworkPolicyEgressRule.openapiRequiredFields, is(empty()));
    }
}
