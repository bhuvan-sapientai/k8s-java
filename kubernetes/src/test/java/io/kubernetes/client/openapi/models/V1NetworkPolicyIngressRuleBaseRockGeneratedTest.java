package io.kubernetes.client.openapi.models;

import java.util.List;
import io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.V1NetworkPolicyPeer;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import java.util.ArrayList;
import static org.hamcrest.Matchers.not;
import io.kubernetes.client.openapi.models.V1NetworkPolicyPort;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1NetworkPolicyIngressRuleBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1NetworkPolicyIngressRuleConstructor}, hash: 5CE99B0E82CE8FA4ACC6FE50271E49BC
    @Test
    void testV1NetworkPolicyIngressRuleConstructor() {
        V1NetworkPolicyIngressRule ingressRule = new V1NetworkPolicyIngressRule();
        assertNotNull(ingressRule);
    }

    //BaseRock generated method id: ${testSetAndGetFrom}, hash: 152E3CCE353B01A72F7317468FAA5102
    @Test
    void testSetAndGetFrom() {
        V1NetworkPolicyIngressRule ingressRule = new V1NetworkPolicyIngressRule();
        List<V1NetworkPolicyPeer> from = new ArrayList<>();
        from.add(new V1NetworkPolicyPeer());
        ingressRule.setFrom(from);
        assertThat(ingressRule.getFrom(), is(equalTo(from)));
    }

    //BaseRock generated method id: ${testSetAndGetPorts}, hash: 0F38F60E67532A60580BC5437BFD4081
    @Test
    void testSetAndGetPorts() {
        V1NetworkPolicyIngressRule ingressRule = new V1NetworkPolicyIngressRule();
        List<V1NetworkPolicyPort> ports = new ArrayList<>();
        ports.add(new V1NetworkPolicyPort());
        ingressRule.setPorts(ports);
        assertThat(ingressRule.getPorts(), is(equalTo(ports)));
    }

    //BaseRock generated method id: ${testAddFromItem}, hash: 00E8E777931F109C588B0392CCFA8837
    @Test
    void testAddFromItem() {
        V1NetworkPolicyIngressRule ingressRule = new V1NetworkPolicyIngressRule();
        V1NetworkPolicyPeer peer = new V1NetworkPolicyPeer();
        ingressRule.addFromItem(peer);
        assertThat(ingressRule.getFrom(), hasSize(1));
        assertThat(ingressRule.getFrom(), contains(peer));
    }

    //BaseRock generated method id: ${testAddPortsItem}, hash: 0B8D055E71E25229EDB2B968BE2CB3F1
    @Test
    void testAddPortsItem() {
        V1NetworkPolicyIngressRule ingressRule = new V1NetworkPolicyIngressRule();
        V1NetworkPolicyPort port = new V1NetworkPolicyPort();
        ingressRule.addPortsItem(port);
        assertThat(ingressRule.getPorts(), hasSize(1));
        assertThat(ingressRule.getPorts(), contains(port));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 5D91AEC017968F7C48EA0FFB045CE673
    @Test
    void testEqualsAndHashCode() {
        V1NetworkPolicyIngressRule rule1 = new V1NetworkPolicyIngressRule().from(new ArrayList<>()).ports(new ArrayList<>());
        V1NetworkPolicyIngressRule rule2 = new V1NetworkPolicyIngressRule().from(new ArrayList<>()).ports(new ArrayList<>());
        V1NetworkPolicyIngressRule rule3 = new V1NetworkPolicyIngressRule().from(new ArrayList<>()).addPortsItem(new V1NetworkPolicyPort());
        assertEquals(rule1, rule2);
        assertEquals(rule1.hashCode(), rule2.hashCode());
        assertThat(rule1, is(not(equalTo(rule3))));
    }

    //BaseRock generated method id: ${testToString}, hash: D984A5FF355FC9DB18A8182452E68542
    @Test
    void testToString() {
        V1NetworkPolicyIngressRule ingressRule = new V1NetworkPolicyIngressRule().from(new ArrayList<>()).ports(new ArrayList<>());
        String toString = ingressRule.toString();
        assertThat(toString, notNullValue());
        assertThat(toString, startsWith("class V1NetworkPolicyIngressRule"));
        assertThat(toString, endsWith("}"));
        assertThat(toString.contains("from"), is(true));
        assertThat(toString.contains("ports"), is(true));
    }

    //BaseRock generated method id: ${testFromWithNullList}, hash: DD88FCEC6411CA324E352866C15F652A
    @Test
    void testFromWithNullList() {
        V1NetworkPolicyIngressRule ingressRule = new V1NetworkPolicyIngressRule();
        ingressRule.setFrom(null);
        assertThat(ingressRule.getFrom(), is(nullValue()));
    }

    //BaseRock generated method id: ${testPortsWithNullList}, hash: 0F91FF4BCA8AF35CC1102C340017C9F2
    @Test
    void testPortsWithNullList() {
        V1NetworkPolicyIngressRule ingressRule = new V1NetworkPolicyIngressRule();
        ingressRule.setPorts(null);
        assertThat(ingressRule.getPorts(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAddFromItemToNullList}, hash: F7D7DA36BB391FB3D4F66F7C9EABF0DD
    @Test
    void testAddFromItemToNullList() {
        V1NetworkPolicyIngressRule ingressRule = new V1NetworkPolicyIngressRule();
        V1NetworkPolicyPeer peer = new V1NetworkPolicyPeer();
        ingressRule.addFromItem(peer);
        assertThat(ingressRule.getFrom(), hasSize(1));
        assertThat(ingressRule.getFrom(), contains(peer));
    }

    //BaseRock generated method id: ${testAddPortsItemToNullList}, hash: 14CD562D8188012FF767D64C272B8B41
    @Test
    void testAddPortsItemToNullList() {
        V1NetworkPolicyIngressRule ingressRule = new V1NetworkPolicyIngressRule();
        V1NetworkPolicyPort port = new V1NetworkPolicyPort();
        ingressRule.addPortsItem(port);
        assertThat(ingressRule.getPorts(), hasSize(1));
        assertThat(ingressRule.getPorts(), contains(port));
    }

    //BaseRock generated method id: ${testEmptyLists}, hash: 678C54A9BF04B17D22C66DA69C5563FA
    @Test
    void testEmptyLists() {
        V1NetworkPolicyIngressRule ingressRule = new V1NetworkPolicyIngressRule().from(new ArrayList<>()).ports(new ArrayList<>());
        assertThat(ingressRule.getFrom(), is(empty()));
        assertThat(ingressRule.getPorts(), is(empty()));
    }
}
