package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1LabelSelector;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1NamedRuleWithOperations;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1MatchResources;
import java.util.ArrayList;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1MatchResourcesBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 04E059DF8A7C1F77EC933D3FA2043D50
    @Test
    void testConstructor() {
        V1MatchResources matchResources = new V1MatchResources();
        assertNotNull(matchResources);
    }

    //BaseRock generated method id: ${testExcludeResourceRules}, hash: 849F958BAFF236255FA3482945AAD609
    @Test
    void testExcludeResourceRules() {
        V1MatchResources matchResources = new V1MatchResources();
        List<V1NamedRuleWithOperations> rules = new ArrayList<>();
        V1NamedRuleWithOperations rule = mock(V1NamedRuleWithOperations.class);
        rules.add(rule);
        matchResources.setExcludeResourceRules(rules);
        assertEquals(rules, matchResources.getExcludeResourceRules());
        V1NamedRuleWithOperations newRule = mock(V1NamedRuleWithOperations.class);
        matchResources.addExcludeResourceRulesItem(newRule);
        assertThat(matchResources.getExcludeResourceRules(), hasSize(2));
        assertThat(matchResources.getExcludeResourceRules(), containsInAnyOrder(rule, newRule));
    }

    //BaseRock generated method id: ${testMatchPolicy}, hash: 94AD76020840A47FB691BA6A9A6DD726
    @Test
    void testMatchPolicy() {
        V1MatchResources matchResources = new V1MatchResources();
        String policy = "Equivalent";
        matchResources.setMatchPolicy(policy);
        assertEquals(policy, matchResources.getMatchPolicy());
    }

    //BaseRock generated method id: ${testNamespaceSelector}, hash: 12A1F2C1BACEB766614072D78ADB8C4D
    @Test
    void testNamespaceSelector() {
        V1MatchResources matchResources = new V1MatchResources();
        V1LabelSelector selector = mock(V1LabelSelector.class);
        matchResources.setNamespaceSelector(selector);
        assertEquals(selector, matchResources.getNamespaceSelector());
    }

    //BaseRock generated method id: ${testObjectSelector}, hash: FB07BD14EF608E8759EA468BD7A111B1
    @Test
    void testObjectSelector() {
        V1MatchResources matchResources = new V1MatchResources();
        V1LabelSelector selector = mock(V1LabelSelector.class);
        matchResources.setObjectSelector(selector);
        assertEquals(selector, matchResources.getObjectSelector());
    }

    //BaseRock generated method id: ${testResourceRules}, hash: 829B588AE7D271F8FA8C9C7A50FA94B8
    @Test
    void testResourceRules() {
        V1MatchResources matchResources = new V1MatchResources();
        List<V1NamedRuleWithOperations> rules = new ArrayList<>();
        V1NamedRuleWithOperations rule = mock(V1NamedRuleWithOperations.class);
        rules.add(rule);
        matchResources.setResourceRules(rules);
        assertEquals(rules, matchResources.getResourceRules());
        V1NamedRuleWithOperations newRule = mock(V1NamedRuleWithOperations.class);
        matchResources.addResourceRulesItem(newRule);
        assertThat(matchResources.getResourceRules(), hasSize(2));
        assertThat(matchResources.getResourceRules(), containsInAnyOrder(rule, newRule));
    }

    //BaseRock generated method id: ${testEquals}, hash: A64E93EB5D00B0207B4D863AE2A82356
    @Test
    void testEquals() {
        V1MatchResources matchResources1 = new V1MatchResources().excludeResourceRules(new ArrayList<>()).matchPolicy("Equivalent").namespaceSelector(new V1LabelSelector()).objectSelector(new V1LabelSelector()).resourceRules(new ArrayList<>());
        V1MatchResources matchResources2 = new V1MatchResources().excludeResourceRules(new ArrayList<>()).matchPolicy("Equivalent").namespaceSelector(new V1LabelSelector()).objectSelector(new V1LabelSelector()).resourceRules(new ArrayList<>());
        assertThat(matchResources1.equals(matchResources2), is(true));
        assertThat(matchResources1.equals(matchResources1), is(true));
        assertThat(matchResources1.equals(null), is(false));
        assertThat(matchResources1.equals(new Object()), is(false));
        matchResources2.setMatchPolicy("Exact");
        assertThat(matchResources1.equals(matchResources2), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 3249CAA21D9E363128AF6F2737CD85F5
    @Test
    void testHashCode() {
        V1MatchResources matchResources1 = new V1MatchResources().excludeResourceRules(new ArrayList<>()).matchPolicy("Equivalent").namespaceSelector(new V1LabelSelector()).objectSelector(new V1LabelSelector()).resourceRules(new ArrayList<>());
        V1MatchResources matchResources2 = new V1MatchResources().excludeResourceRules(new ArrayList<>()).matchPolicy("Equivalent").namespaceSelector(new V1LabelSelector()).objectSelector(new V1LabelSelector()).resourceRules(new ArrayList<>());
        assertThat(matchResources1.hashCode(), equalTo(matchResources2.hashCode()));
        matchResources2.setMatchPolicy("Exact");
        assertThat(matchResources1.hashCode(), is(not(equalTo(matchResources2.hashCode()))));
    }

    //BaseRock generated method id: ${testToString}, hash: 2A989382FC37283786BA581DDCF58569
    @Test
    void testToString() {
        V1MatchResources matchResources = new V1MatchResources().excludeResourceRules(new ArrayList<>()).matchPolicy("Equivalent").namespaceSelector(new V1LabelSelector()).objectSelector(new V1LabelSelector()).resourceRules(new ArrayList<>());
        String toString = matchResources.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("excludeResourceRules"), is(true));
        assertThat(toString.contains("matchPolicy"), is(true));
        assertThat(toString.contains("namespaceSelector"), is(true));
        assertThat(toString.contains("objectSelector"), is(true));
        assertThat(toString.contains("resourceRules"), is(true));
    }

    //BaseRock generated method id: ${testSettersAndGetters}, hash: F7C66A40B52DFF201711B87D9E69B41D
    @Test
    void testSettersAndGetters() {
        V1MatchResources matchResources = new V1MatchResources();
        List<V1NamedRuleWithOperations> excludeRules = new ArrayList<>();
        matchResources.setExcludeResourceRules(excludeRules);
        assertThat(matchResources.getExcludeResourceRules(), is(excludeRules));
        String matchPolicy = "Exact";
        matchResources.setMatchPolicy(matchPolicy);
        assertThat(matchResources.getMatchPolicy(), is(matchPolicy));
        V1LabelSelector namespaceSelector = new V1LabelSelector();
        matchResources.setNamespaceSelector(namespaceSelector);
        assertThat(matchResources.getNamespaceSelector(), is(namespaceSelector));
        V1LabelSelector objectSelector = new V1LabelSelector();
        matchResources.setObjectSelector(objectSelector);
        assertThat(matchResources.getObjectSelector(), is(objectSelector));
        List<V1NamedRuleWithOperations> resourceRules = new ArrayList<>();
        matchResources.setResourceRules(resourceRules);
        assertThat(matchResources.getResourceRules(), is(resourceRules));
    }

    //BaseRock generated method id: ${testNullValues}, hash: BABE240814B07E57170C4D114267957C
    @Test
    void testNullValues() {
        V1MatchResources matchResources = new V1MatchResources();
        assertThat(matchResources.getExcludeResourceRules(), is(notNullValue()));
        assertThat(matchResources.getExcludeResourceRules(), hasSize(0));
        assertThat(matchResources.getMatchPolicy(), is(nullValue()));
        assertThat(matchResources.getNamespaceSelector(), is(nullValue()));
        assertThat(matchResources.getObjectSelector(), is(nullValue()));
        assertThat(matchResources.getResourceRules(), is(notNullValue()));
        assertThat(matchResources.getResourceRules(), hasSize(0));
    }
}
