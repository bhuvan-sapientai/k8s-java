package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1AggregationRule;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1PolicyRule;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1ClusterRole;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ClusterRoleBaseRockGeneratedTest {

    private V1ClusterRole v1ClusterRole;

    @BeforeEach
    void setUp() {
        v1ClusterRole = new V1ClusterRole();
    }

    //BaseRock generated method id: ${testGetAggregationRule}, hash: CC3D8E6755292D45EDA9B4B06092AFFA
    @Test
    void testGetAggregationRule() {
        V1AggregationRule aggregationRule = mock(V1AggregationRule.class);
        v1ClusterRole.setAggregationRule(aggregationRule);
        assertEquals(aggregationRule, v1ClusterRole.getAggregationRule());
    }

    //BaseRock generated method id: ${testSetAggregationRule}, hash: 1F1B7A7E31CA2B31ED12003289AADB0C
    @Test
    void testSetAggregationRule() {
        V1AggregationRule aggregationRule = mock(V1AggregationRule.class);
        v1ClusterRole.setAggregationRule(aggregationRule);
        assertThat(v1ClusterRole.getAggregationRule(), is(aggregationRule));
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 69AA3BBE377109D55A2E9F158F354E47
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1";
        v1ClusterRole.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1ClusterRole.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: 1050399788DD53EC9C1B09ED860BD7FF
    @Test
    void testSetApiVersion() {
        String apiVersion = "v1";
        v1ClusterRole.setApiVersion(apiVersion);
        assertThat(v1ClusterRole.getApiVersion(), is(apiVersion));
    }

    //BaseRock generated method id: ${testGetKind}, hash: AEE70836DEAFC8350DCE102DD41F1981
    @Test
    void testGetKind() {
        String kind = "ClusterRole";
        v1ClusterRole.setKind(kind);
        assertEquals(kind, v1ClusterRole.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: 27A4294CAE1BC7C0D0F62F2A80D4D313
    @Test
    void testSetKind() {
        String kind = "ClusterRole";
        v1ClusterRole.setKind(kind);
        assertThat(v1ClusterRole.getKind(), is(kind));
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: FD905131BA4B0A8F5AD189DCFA6AE070
    @Test
    void testGetMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1ClusterRole.setMetadata(metadata);
        assertEquals(metadata, v1ClusterRole.getMetadata());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: 3BC58A1A0545F55A25032EF247BB34AF
    @Test
    void testSetMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1ClusterRole.setMetadata(metadata);
        assertThat(v1ClusterRole.getMetadata(), is(metadata));
    }

    //BaseRock generated method id: ${testGetRules}, hash: 77D1154E7952AB8199426BBF156BEF29
    @Test
    void testGetRules() {
        List<V1PolicyRule> rules = new ArrayList<>();
        rules.add(mock(V1PolicyRule.class));
        v1ClusterRole.setRules(rules);
        assertEquals(rules, v1ClusterRole.getRules());
    }

    //BaseRock generated method id: ${testSetRules}, hash: AF257BB27C9CFF4D412F576D084CCC89
    @Test
    void testSetRules() {
        List<V1PolicyRule> rules = new ArrayList<>();
        rules.add(mock(V1PolicyRule.class));
        v1ClusterRole.setRules(rules);
        assertThat(v1ClusterRole.getRules(), is(rules));
    }

    //BaseRock generated method id: ${testAddRulesItem}, hash: 7AFC827F0825D364189711A1EDD31675
    @Test
    void testAddRulesItem() {
        V1PolicyRule rule = mock(V1PolicyRule.class);
        v1ClusterRole.addRulesItem(rule);
        assertThat(v1ClusterRole.getRules().size(), is(1));
        assertThat(v1ClusterRole.getRules().get(0), is(rule));
    }

    //BaseRock generated method id: ${testEquals}, hash: BB768622924F6DC48873F0BAD3F9EEFC
    @Test
    void testEquals() {
        V1ClusterRole role1 = new V1ClusterRole();
        V1ClusterRole role2 = new V1ClusterRole();
        role1.setApiVersion("v1");
        role2.setApiVersion("v1");
        role1.setKind("ClusterRole");
        role2.setKind("ClusterRole");
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        role1.setMetadata(metadata);
        role2.setMetadata(metadata);
        V1AggregationRule aggregationRule = mock(V1AggregationRule.class);
        role1.setAggregationRule(aggregationRule);
        role2.setAggregationRule(aggregationRule);
        List<V1PolicyRule> rules = new ArrayList<>();
        rules.add(mock(V1PolicyRule.class));
        role1.setRules(rules);
        role2.setRules(rules);
        assertThat(role1, equalTo(role2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 638B9B3F2DF96C5213ACF8E1D2A4691C
    @Test
    void testHashCode() {
        V1ClusterRole role1 = new V1ClusterRole();
        V1ClusterRole role2 = new V1ClusterRole();
        role1.setApiVersion("v1");
        role2.setApiVersion("v1");
        role1.setKind("ClusterRole");
        role2.setKind("ClusterRole");
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        role1.setMetadata(metadata);
        role2.setMetadata(metadata);
        V1AggregationRule aggregationRule = mock(V1AggregationRule.class);
        role1.setAggregationRule(aggregationRule);
        role2.setAggregationRule(aggregationRule);
        List<V1PolicyRule> rules = new ArrayList<>();
        rules.add(mock(V1PolicyRule.class));
        role1.setRules(rules);
        role2.setRules(rules);
        assertThat(role1.hashCode(), equalTo(role2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: EF320364358E36B66060D5371E00874B
    @Test
    void testToString() {
        V1ClusterRole role = new V1ClusterRole();
        role.setApiVersion("v1");
        role.setKind("ClusterRole");
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        role.setMetadata(metadata);
        V1AggregationRule aggregationRule = mock(V1AggregationRule.class);
        role.setAggregationRule(aggregationRule);
        List<V1PolicyRule> rules = new ArrayList<>();
        rules.add(mock(V1PolicyRule.class));
        role.setRules(rules);
        String result = role.toString();
        assertNotNull(result);
        assertThat(result.contains("apiVersion"), is(true));
        assertThat(result.contains("kind"), is(true));
        assertThat(result.contains("metadata"), is(true));
        assertThat(result.contains("aggregationRule"), is(true));
        assertThat(result.contains("rules"), is(true));
    }

    //BaseRock generated method id: ${testConstructor}, hash: 3689139938435E78235061F210ECBC08
    @Test
    void testConstructor() {
        V1ClusterRole role = new V1ClusterRole();
        assertNotNull(role);
        assertThat(role.getRules(), notNullValue());
        assertThat(role.getRules().size(), is(0));
    }

    //BaseRock generated method id: ${testAggregationRuleMethod}, hash: FEAD2009301D8F0E5883E6C8403FF903
    @Test
    void testAggregationRuleMethod() {
        V1AggregationRule aggregationRule = mock(V1AggregationRule.class);
        V1ClusterRole result = v1ClusterRole.aggregationRule(aggregationRule);
        assertThat(result, is(v1ClusterRole));
        assertThat(result.getAggregationRule(), is(aggregationRule));
    }

    //BaseRock generated method id: ${testApiVersionMethod}, hash: 4C3904A199D35FA2A9063A7A22C2183B
    @Test
    void testApiVersionMethod() {
        String apiVersion = "v1";
        V1ClusterRole result = v1ClusterRole.apiVersion(apiVersion);
        assertThat(result, is(v1ClusterRole));
        assertThat(result.getApiVersion(), is(apiVersion));
    }

    //BaseRock generated method id: ${testKindMethod}, hash: 22EBB62BFD27E493DAC54B14DDF1065E
    @Test
    void testKindMethod() {
        String kind = "ClusterRole";
        V1ClusterRole result = v1ClusterRole.kind(kind);
        assertThat(result, is(v1ClusterRole));
        assertThat(result.getKind(), is(kind));
    }

    //BaseRock generated method id: ${testMetadataMethod}, hash: 75F289F80C0E55677F4C20BBB4FCFC39
    @Test
    void testMetadataMethod() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1ClusterRole result = v1ClusterRole.metadata(metadata);
        assertThat(result, is(v1ClusterRole));
        assertThat(result.getMetadata(), is(metadata));
    }

    //BaseRock generated method id: ${testRulesMethod}, hash: 4A10D29EDAA0F1D80C92E16FFAE3FEF3
    @Test
    void testRulesMethod() {
        List<V1PolicyRule> rules = new ArrayList<>();
        rules.add(mock(V1PolicyRule.class));
        V1ClusterRole result = v1ClusterRole.rules(rules);
        assertThat(result, is(v1ClusterRole));
        assertThat(result.getRules(), is(rules));
    }

    //BaseRock generated method id: ${testAddRulesItemMethod}, hash: 202F053C4B62B376CA1D1C986017B6D2
    @Test
    void testAddRulesItemMethod() {
        V1PolicyRule rule = mock(V1PolicyRule.class);
        V1ClusterRole result = v1ClusterRole.addRulesItem(rule);
        assertThat(result, is(v1ClusterRole));
        assertThat(result.getRules().size(), is(1));
        assertThat(result.getRules().get(0), is(rule));
    }
}
