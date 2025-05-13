package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1LabelSelector;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.empty;
import java.util.ArrayList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import io.kubernetes.client.openapi.models.V1beta1NamedRuleWithOperations;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1MatchResourcesBaseRockGeneratedTest {

    private V1beta1MatchResources matchResources;

    @BeforeEach
    void setUp() {
        matchResources = new V1beta1MatchResources();
    }

    //BaseRock generated method id: ${testExcludeResourceRules}, hash: 61C080EEE3BD7C5AA5F0E3B74AAB1BC9
    @Test
    void testExcludeResourceRules() {
        List<V1beta1NamedRuleWithOperations> excludeRules = new ArrayList<>();
        V1beta1NamedRuleWithOperations rule1 = mock(V1beta1NamedRuleWithOperations.class);
        V1beta1NamedRuleWithOperations rule2 = mock(V1beta1NamedRuleWithOperations.class);
        excludeRules.add(rule1);
        excludeRules.add(rule2);
        matchResources.setExcludeResourceRules(excludeRules);
        assertThat(matchResources.getExcludeResourceRules(), hasSize(2));
        assertThat(matchResources.getExcludeResourceRules(), containsInAnyOrder(rule1, rule2));
    }

    //BaseRock generated method id: ${testAddExcludeResourceRulesItem}, hash: A22B7D18B267B32839BC799EB44E6825
    @Test
    void testAddExcludeResourceRulesItem() {
        V1beta1NamedRuleWithOperations rule = mock(V1beta1NamedRuleWithOperations.class);
        matchResources.addExcludeResourceRulesItem(rule);
        assertThat(matchResources.getExcludeResourceRules(), hasSize(1));
        assertThat(matchResources.getExcludeResourceRules().get(0), is(rule));
    }

    //BaseRock generated method id: ${testMatchPolicy}, hash: 53EEF459E76792CC90F92FAEFF785C18
    @Test
    void testMatchPolicy() {
        String policy = "Exact";
        matchResources.setMatchPolicy(policy);
        assertThat(matchResources.getMatchPolicy(), is(policy));
    }

    //BaseRock generated method id: ${testNamespaceSelector}, hash: DFF7FE90C3DA3FBB0F65B5B400836A65
    @Test
    void testNamespaceSelector() {
        V1LabelSelector selector = mock(V1LabelSelector.class);
        matchResources.setNamespaceSelector(selector);
        assertThat(matchResources.getNamespaceSelector(), is(selector));
    }

    //BaseRock generated method id: ${testObjectSelector}, hash: E1B694A7F38ED211CD02F54CDEC9DAF6
    @Test
    void testObjectSelector() {
        V1LabelSelector selector = mock(V1LabelSelector.class);
        matchResources.setObjectSelector(selector);
        assertThat(matchResources.getObjectSelector(), is(selector));
    }

    //BaseRock generated method id: ${testResourceRules}, hash: 70CE780B5953F755CA9010F7F4731448
    @Test
    void testResourceRules() {
        List<V1beta1NamedRuleWithOperations> resourceRules = new ArrayList<>();
        V1beta1NamedRuleWithOperations rule1 = mock(V1beta1NamedRuleWithOperations.class);
        V1beta1NamedRuleWithOperations rule2 = mock(V1beta1NamedRuleWithOperations.class);
        resourceRules.add(rule1);
        resourceRules.add(rule2);
        matchResources.setResourceRules(resourceRules);
        assertThat(matchResources.getResourceRules(), hasSize(2));
        assertThat(matchResources.getResourceRules(), containsInAnyOrder(rule1, rule2));
    }

    //BaseRock generated method id: ${testAddResourceRulesItem}, hash: E45E773A2EECC43970B61491FBE23E80
    @Test
    void testAddResourceRulesItem() {
        V1beta1NamedRuleWithOperations rule = mock(V1beta1NamedRuleWithOperations.class);
        matchResources.addResourceRulesItem(rule);
        assertThat(matchResources.getResourceRules(), hasSize(1));
        assertThat(matchResources.getResourceRules().get(0), is(rule));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 9F37684FD209A5BC205CE9CCA803CE1B
    @Test
    void testEqualsAndHashCode() {
        V1beta1MatchResources matchResources1 = new V1beta1MatchResources();
        V1beta1MatchResources matchResources2 = new V1beta1MatchResources();
        assertThat(matchResources1, is(equalTo(matchResources2)));
        assertEquals(matchResources1.hashCode(), matchResources2.hashCode());
        matchResources1.setMatchPolicy("Exact");
        matchResources2.setMatchPolicy("Equivalent");
        assertNotEquals(matchResources1, matchResources2);
        assertNotEquals(matchResources1.hashCode(), matchResources2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: D877F3A7025FCA2D371809BF9D3DA2AF
    @Test
    void testToString() {
        V1beta1MatchResources matchResources = new V1beta1MatchResources().matchPolicy("Exact").namespaceSelector(new V1LabelSelector()).objectSelector(new V1LabelSelector());
        String toString = matchResources.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("matchPolicy"), is(true));
        assertThat(toString.contains("namespaceSelector"), is(true));
        assertThat(toString.contains("objectSelector"), is(true));
    }

    //BaseRock generated method id: ${testDefaultConstructor}, hash: C768D82C67D3C8D9101448D04E65F790
    @Test
    void testDefaultConstructor() {
        V1beta1MatchResources matchResources = new V1beta1MatchResources();
        assertNotNull(matchResources);
        assertThat(matchResources.getExcludeResourceRules(), is(empty()));
        assertThat(matchResources.getMatchPolicy(), is(nullValue()));
        assertThat(matchResources.getNamespaceSelector(), is(nullValue()));
        assertThat(matchResources.getObjectSelector(), is(nullValue()));
        assertThat(matchResources.getResourceRules(), is(empty()));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 0C56D0FCFEA3362C49F2AD9060117B34
    @Test
    void testBuilderPattern() {
        V1LabelSelector namespaceSelector = mock(V1LabelSelector.class);
        V1LabelSelector objectSelector = mock(V1LabelSelector.class);
        List<V1beta1NamedRuleWithOperations> excludeRules = new ArrayList<>();
        List<V1beta1NamedRuleWithOperations> resourceRules = new ArrayList<>();
        V1beta1MatchResources matchResources = new V1beta1MatchResources().excludeResourceRules(excludeRules).matchPolicy("Exact").namespaceSelector(namespaceSelector).objectSelector(objectSelector).resourceRules(resourceRules);
        assertThat(matchResources.getExcludeResourceRules(), is(excludeRules));
        assertThat(matchResources.getMatchPolicy(), is("Exact"));
        assertThat(matchResources.getNamespaceSelector(), is(namespaceSelector));
        assertThat(matchResources.getObjectSelector(), is(objectSelector));
        assertThat(matchResources.getResourceRules(), is(resourceRules));
    }
}
