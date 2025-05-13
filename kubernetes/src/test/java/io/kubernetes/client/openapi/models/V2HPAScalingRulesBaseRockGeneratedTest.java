package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.V2HPAScalingPolicy;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import io.kubernetes.client.openapi.models.V2HPAScalingRules;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V2HPAScalingRulesBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV2HPAScalingRulesConstructor}, hash: 70A89C2FFA8D591C123FB86A607BBC07
    @Test
    void testV2HPAScalingRulesConstructor() {
        V2HPAScalingRules rules = new V2HPAScalingRules();
        assertNotNull(rules);
    }

    //BaseRock generated method id: ${testSetAndGetPolicies}, hash: 27233D5B180C5977F7F7CD4808818037
    @Test
    void testSetAndGetPolicies() {
        V2HPAScalingRules rules = new V2HPAScalingRules();
        List<V2HPAScalingPolicy> policies = new ArrayList<>();
        policies.add(new V2HPAScalingPolicy());
        rules.setPolicies(policies);
        assertEquals(policies, rules.getPolicies());
    }

    //BaseRock generated method id: ${testAddPoliciesItem}, hash: A06DFED69FA97999853BD2CDF7A7A797
    @Test
    void testAddPoliciesItem() {
        V2HPAScalingRules rules = new V2HPAScalingRules();
        V2HPAScalingPolicy policy = new V2HPAScalingPolicy();
        rules.addPoliciesItem(policy);
        assertThat(rules.getPolicies(), hasSize(1));
        assertThat(rules.getPolicies().get(0), is(policy));
    }

    //BaseRock generated method id: ${testSetAndGetSelectPolicy}, hash: D24C943D4B73A336C4167B2DA5262258
    @Test
    void testSetAndGetSelectPolicy() {
        V2HPAScalingRules rules = new V2HPAScalingRules();
        String selectPolicy = "Max";
        rules.setSelectPolicy(selectPolicy);
        assertEquals(selectPolicy, rules.getSelectPolicy());
    }

    //BaseRock generated method id: ${testSetAndGetStabilizationWindowSeconds}, hash: CF7F48B488AD700601352C7C9B68B605
    @Test
    void testSetAndGetStabilizationWindowSeconds() {
        V2HPAScalingRules rules = new V2HPAScalingRules();
        Integer stabilizationWindowSeconds = 300;
        rules.setStabilizationWindowSeconds(stabilizationWindowSeconds);
        assertEquals(stabilizationWindowSeconds, rules.getStabilizationWindowSeconds());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: E2A8AE48C67CC22DF5C5E192A51E7F9A
    @Test
    void testEqualsAndHashCode() {
        V2HPAScalingRules rules1 = new V2HPAScalingRules().policies(new ArrayList<>()).selectPolicy("Max").stabilizationWindowSeconds(300);
        V2HPAScalingRules rules2 = new V2HPAScalingRules().policies(new ArrayList<>()).selectPolicy("Max").stabilizationWindowSeconds(300);
        V2HPAScalingRules rules3 = new V2HPAScalingRules().policies(new ArrayList<>()).selectPolicy("Min").stabilizationWindowSeconds(600);
        assertThat(rules1, equalTo(rules2));
        assertThat(rules1.hashCode(), equalTo(rules2.hashCode()));
        assertThat(rules1, not(equalTo(rules3)));
    }

    //BaseRock generated method id: ${testToString}, hash: CC540801DA53584ED99D222287627DF8
    @Test
    void testToString() {
        V2HPAScalingRules rules = new V2HPAScalingRules().policies(new ArrayList<>()).selectPolicy("Max").stabilizationWindowSeconds(300);
        String expected = "class V2HPAScalingRules {\n" + "    policies: []\n" + "    selectPolicy: Max\n" + "    stabilizationWindowSeconds: 300\n" + "}";
        assertEquals(expected, rules.toString());
    }

    //BaseRock generated method id: ${testValidStabilizationWindowSeconds}, hash: A5068E6E3408631E4E0902A7C1FEF557
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 10, 3600 })
    void testValidStabilizationWindowSeconds(int seconds) {
        V2HPAScalingRules rules = new V2HPAScalingRules().stabilizationWindowSeconds(seconds);
        assertEquals(seconds, rules.getStabilizationWindowSeconds());
    }

    //BaseRock generated method id: ${testNullPolicies}, hash: 87D546F73EDEECE865F48932EE07B168
    @Test
    void testNullPolicies() {
        V2HPAScalingRules rules = new V2HPAScalingRules();
        assertThat(rules.getPolicies(), is(notNullValue()));
        assertThat(rules.getPolicies(), is(empty()));
    }

    //BaseRock generated method id: ${testNullSelectPolicy}, hash: 7C5D923C10CB06FBF84A2117B272CD41
    @Test
    void testNullSelectPolicy() {
        V2HPAScalingRules rules = new V2HPAScalingRules();
        assertThat(rules.getSelectPolicy(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNullStabilizationWindowSeconds}, hash: CA7D7FF4C7069321B0EA64881BABCE87
    @Test
    void testNullStabilizationWindowSeconds() {
        V2HPAScalingRules rules = new V2HPAScalingRules();
        assertThat(rules.getStabilizationWindowSeconds(), is(nullValue()));
    }

    //BaseRock generated method id: ${testMultiplePolicies}, hash: F8939A0EE38F1F2D1C500E91559405AD
    @Test
    void testMultiplePolicies() {
        V2HPAScalingRules rules = new V2HPAScalingRules();
        V2HPAScalingPolicy policy1 = new V2HPAScalingPolicy();
        V2HPAScalingPolicy policy2 = new V2HPAScalingPolicy();
        rules.addPoliciesItem(policy1);
        rules.addPoliciesItem(policy2);
        assertThat(rules.getPolicies(), hasSize(2));
        assertThat(rules.getPolicies(), containsInAnyOrder(policy1, policy2));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 8DAF52C1B98309C82C34414070811B65
    @Test
    void testBuilderPattern() {
        V2HPAScalingRules rules = new V2HPAScalingRules().policies(new ArrayList<>()).selectPolicy("Min").stabilizationWindowSeconds(600);
        assertThat(rules.getPolicies(), is(notNullValue()));
        assertThat(rules.getPolicies(), hasSize(0));
        assertEquals("Min", rules.getSelectPolicy());
        assertEquals(600, rules.getStabilizationWindowSeconds());
    }
}
