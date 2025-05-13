package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import io.kubernetes.client.openapi.models.V1LabelSelector;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1NetworkPolicySpecBaseRockGeneratedTest {

    private V1NetworkPolicySpec v1NetworkPolicySpec;

    @BeforeEach
    void setUp() {
        v1NetworkPolicySpec = new V1NetworkPolicySpec();
    }

    //BaseRock generated method id: ${testEgressSetter}, hash: 4B1CCBE0FB3691609C38BCBDA602EC32
    @Test
    void testEgressSetter() {
        List<V1NetworkPolicyEgressRule> egressRules = new ArrayList<>();
        V1NetworkPolicyEgressRule rule = mock(V1NetworkPolicyEgressRule.class);
        egressRules.add(rule);
        v1NetworkPolicySpec.setEgress(egressRules);
        assertThat(v1NetworkPolicySpec.getEgress(), is(egressRules));
    }

    //BaseRock generated method id: ${testEgressGetter}, hash: 6A32F05E15F21E3495811871F06E7CEF
    @Test
    void testEgressGetter() {
        List<V1NetworkPolicyEgressRule> egressRules = new ArrayList<>();
        V1NetworkPolicyEgressRule rule = mock(V1NetworkPolicyEgressRule.class);
        egressRules.add(rule);
        v1NetworkPolicySpec.setEgress(egressRules);
        List<V1NetworkPolicyEgressRule> result = v1NetworkPolicySpec.getEgress();
        assertThat(result, is(notNullValue()));
        assertThat(result, hasSize(1));
        assertThat(result.get(0), is(rule));
    }

    //BaseRock generated method id: ${testAddEgressItem}, hash: 7665A72AF9AFBD34098C8212484C91C5
    @Test
    void testAddEgressItem() {
        V1NetworkPolicyEgressRule rule = mock(V1NetworkPolicyEgressRule.class);
        v1NetworkPolicySpec.addEgressItem(rule);
        List<V1NetworkPolicyEgressRule> result = v1NetworkPolicySpec.getEgress();
        assertThat(result, is(notNullValue()));
        assertThat(result, hasSize(1));
        assertThat(result.get(0), is(rule));
    }

    //BaseRock generated method id: ${testIngressSetter}, hash: 9DD208B081470C6A53BE73AEE56D1A03
    @Test
    void testIngressSetter() {
        List<V1NetworkPolicyIngressRule> ingressRules = new ArrayList<>();
        V1NetworkPolicyIngressRule rule = mock(V1NetworkPolicyIngressRule.class);
        ingressRules.add(rule);
        v1NetworkPolicySpec.setIngress(ingressRules);
        assertThat(v1NetworkPolicySpec.getIngress(), is(ingressRules));
    }

    //BaseRock generated method id: ${testIngressGetter}, hash: E4CBC8929B7AB67C3283AAFE38515735
    @Test
    void testIngressGetter() {
        List<V1NetworkPolicyIngressRule> ingressRules = new ArrayList<>();
        V1NetworkPolicyIngressRule rule = mock(V1NetworkPolicyIngressRule.class);
        ingressRules.add(rule);
        v1NetworkPolicySpec.setIngress(ingressRules);
        List<V1NetworkPolicyIngressRule> result = v1NetworkPolicySpec.getIngress();
        assertThat(result, is(notNullValue()));
        assertThat(result, hasSize(1));
        assertThat(result.get(0), is(rule));
    }

    //BaseRock generated method id: ${testAddIngressItem}, hash: 4014BEE413F822228BC0F1B1700DF1E9
    @Test
    void testAddIngressItem() {
        V1NetworkPolicyIngressRule rule = mock(V1NetworkPolicyIngressRule.class);
        v1NetworkPolicySpec.addIngressItem(rule);
        List<V1NetworkPolicyIngressRule> result = v1NetworkPolicySpec.getIngress();
        assertThat(result, is(notNullValue()));
        assertThat(result, hasSize(1));
        assertThat(result.get(0), is(rule));
    }

    //BaseRock generated method id: ${testPodSelectorSetter}, hash: CD1740E2A0D2EC4913D26713C97A5789
    @Test
    void testPodSelectorSetter() {
        V1LabelSelector podSelector = mock(V1LabelSelector.class);
        v1NetworkPolicySpec.setPodSelector(podSelector);
        assertThat(v1NetworkPolicySpec.getPodSelector(), is(podSelector));
    }

    //BaseRock generated method id: ${testPodSelectorGetter}, hash: 856EB208DE94B8629BFADC8FA4404B21
    @Test
    void testPodSelectorGetter() {
        V1LabelSelector podSelector = mock(V1LabelSelector.class);
        v1NetworkPolicySpec.setPodSelector(podSelector);
        V1LabelSelector result = v1NetworkPolicySpec.getPodSelector();
        assertThat(result, is(notNullValue()));
        assertThat(result, is(podSelector));
    }

    //BaseRock generated method id: ${testPolicyTypesSetter}, hash: B7391C58AC67A2764FF8942EEA2BC073
    @Test
    void testPolicyTypesSetter() {
        List<String> policyTypes = Arrays.asList("Ingress", "Egress");
        v1NetworkPolicySpec.setPolicyTypes(policyTypes);
        assertThat(v1NetworkPolicySpec.getPolicyTypes(), is(policyTypes));
    }

    //BaseRock generated method id: ${testPolicyTypesGetter}, hash: 080A206A39991C9A978B9841CA1ECD14
    @Test
    void testPolicyTypesGetter() {
        List<String> policyTypes = Arrays.asList("Ingress", "Egress");
        v1NetworkPolicySpec.setPolicyTypes(policyTypes);
        List<String> result = v1NetworkPolicySpec.getPolicyTypes();
        assertThat(result, is(notNullValue()));
        assertThat(result, hasSize(2));
        assertThat(result, containsInAnyOrder("Ingress", "Egress"));
    }

    //BaseRock generated method id: ${testAddPolicyTypesItem}, hash: 39B0D37C6C51A17F9E47967B40B6C58C
    @Test
    void testAddPolicyTypesItem() {
        String policyType = "Ingress";
        v1NetworkPolicySpec.addPolicyTypesItem(policyType);
        List<String> result = v1NetworkPolicySpec.getPolicyTypes();
        assertThat(result, is(notNullValue()));
        assertThat(result, hasSize(1));
        assertThat(result.get(0), is(policyType));
    }

    //BaseRock generated method id: ${testEquals}, hash: AA855176D0AB843C16EEEF349DEE0652
    @Test
    void testEquals() {
        V1NetworkPolicySpec spec1 = new V1NetworkPolicySpec();
        V1NetworkPolicySpec spec2 = new V1NetworkPolicySpec();
        V1LabelSelector podSelector = mock(V1LabelSelector.class);
        spec1.setPodSelector(podSelector);
        spec2.setPodSelector(podSelector);
        List<V1NetworkPolicyEgressRule> egressRules = new ArrayList<>();
        V1NetworkPolicyEgressRule egressRule = mock(V1NetworkPolicyEgressRule.class);
        egressRules.add(egressRule);
        spec1.setEgress(egressRules);
        spec2.setEgress(egressRules);
        List<V1NetworkPolicyIngressRule> ingressRules = new ArrayList<>();
        V1NetworkPolicyIngressRule ingressRule = mock(V1NetworkPolicyIngressRule.class);
        ingressRules.add(ingressRule);
        spec1.setIngress(ingressRules);
        spec2.setIngress(ingressRules);
        List<String> policyTypes = Arrays.asList("Ingress", "Egress");
        spec1.setPolicyTypes(policyTypes);
        spec2.setPolicyTypes(policyTypes);
        assertThat(spec1.equals(spec2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 8B7660145FF9647E43F1F13D2DED7654
    @Test
    void testHashCode() {
        V1NetworkPolicySpec spec1 = new V1NetworkPolicySpec();
        V1NetworkPolicySpec spec2 = new V1NetworkPolicySpec();
        V1LabelSelector podSelector = mock(V1LabelSelector.class);
        spec1.setPodSelector(podSelector);
        spec2.setPodSelector(podSelector);
        List<V1NetworkPolicyEgressRule> egressRules = new ArrayList<>();
        V1NetworkPolicyEgressRule egressRule = mock(V1NetworkPolicyEgressRule.class);
        egressRules.add(egressRule);
        spec1.setEgress(egressRules);
        spec2.setEgress(egressRules);
        List<V1NetworkPolicyIngressRule> ingressRules = new ArrayList<>();
        V1NetworkPolicyIngressRule ingressRule = mock(V1NetworkPolicyIngressRule.class);
        ingressRules.add(ingressRule);
        spec1.setIngress(ingressRules);
        spec2.setIngress(ingressRules);
        List<String> policyTypes = Arrays.asList("Ingress", "Egress");
        spec1.setPolicyTypes(policyTypes);
        spec2.setPolicyTypes(policyTypes);
        assertThat(spec1.hashCode(), is(equalTo(spec2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 37EB4C1DAA86A175FE364BEEFCC25F5F
    @Test
    void testToString() {
        V1NetworkPolicySpec spec = new V1NetworkPolicySpec();
        V1LabelSelector podSelector = mock(V1LabelSelector.class);
        when(podSelector.toString()).thenReturn("podSelector");
        spec.setPodSelector(podSelector);
        List<V1NetworkPolicyEgressRule> egressRules = new ArrayList<>();
        V1NetworkPolicyEgressRule egressRule = mock(V1NetworkPolicyEgressRule.class);
        when(egressRule.toString()).thenReturn("egressRule");
        egressRules.add(egressRule);
        spec.setEgress(egressRules);
        List<V1NetworkPolicyIngressRule> ingressRules = new ArrayList<>();
        V1NetworkPolicyIngressRule ingressRule = mock(V1NetworkPolicyIngressRule.class);
        when(ingressRule.toString()).thenReturn("ingressRule");
        ingressRules.add(ingressRule);
        spec.setIngress(ingressRules);
        List<String> policyTypes = Arrays.asList("Ingress", "Egress");
        spec.setPolicyTypes(policyTypes);
        String result = spec.toString();
        assertNotNull(result);
        assertEquals("class V1NetworkPolicySpec {\n    egress: [egressRule]\n    ingress: [ingressRule]\n    podSelector: podSelector\n    policyTypes: [Ingress, Egress]\n}", result);
    }
}
