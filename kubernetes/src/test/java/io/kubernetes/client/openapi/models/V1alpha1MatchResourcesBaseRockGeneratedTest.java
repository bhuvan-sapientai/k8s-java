package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertAll;
import io.kubernetes.client.openapi.models.V1LabelSelector;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.not;
import io.kubernetes.client.openapi.models.V1alpha1NamedRuleWithOperations;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha1MatchResourcesBaseRockGeneratedTest {

    private V1alpha1MatchResources matchResources;

    @BeforeEach
    void setUp() {
        matchResources = new V1alpha1MatchResources();
    }

    //BaseRock generated method id: ${testConstructor}, hash: BE0E1557A8378C1700588AB962CDB094
    @Test
    void testConstructor() {
        assertThat(matchResources, is(notNullValue()));
    }

    //BaseRock generated method id: ${testExcludeResourceRules}, hash: BE16126A88CEB29CC4BEAC110CB2DBFB
    @Test
    void testExcludeResourceRules() {
        List<V1alpha1NamedRuleWithOperations> excludeResourceRules = new ArrayList<>();
        V1alpha1NamedRuleWithOperations rule = mock(V1alpha1NamedRuleWithOperations.class);
        excludeResourceRules.add(rule);
        matchResources.setExcludeResourceRules(excludeResourceRules);
        assertThat(matchResources.getExcludeResourceRules(), is(equalTo(excludeResourceRules)));
    }

    //BaseRock generated method id: ${testAddExcludeResourceRulesItem}, hash: B897ED5681EA00A6E87F98454E24D974
    @Test
    void testAddExcludeResourceRulesItem() {
        V1alpha1NamedRuleWithOperations rule = mock(V1alpha1NamedRuleWithOperations.class);
        matchResources.addExcludeResourceRulesItem(rule);
        assertThat(matchResources.getExcludeResourceRules(), hasSize(1));
        assertThat(matchResources.getExcludeResourceRules().get(0), is(equalTo(rule)));
    }

    //BaseRock generated method id: ${testMatchPolicy}, hash: 0695E048967026EE4C25FD407F5CC5B2
    @Test
    void testMatchPolicy() {
        String matchPolicy = "Exact";
        matchResources.setMatchPolicy(matchPolicy);
        assertThat(matchResources.getMatchPolicy(), is(equalTo(matchPolicy)));
    }

    //BaseRock generated method id: ${testNamespaceSelector}, hash: 9C37BAC020A78084EB365459E8D9EF1A
    @Test
    void testNamespaceSelector() {
        V1LabelSelector namespaceSelector = mock(V1LabelSelector.class);
        matchResources.setNamespaceSelector(namespaceSelector);
        assertThat(matchResources.getNamespaceSelector(), is(equalTo(namespaceSelector)));
    }

    //BaseRock generated method id: ${testObjectSelector}, hash: 0154E9DCA1DBFF27B19795DA5F2835B2
    @Test
    void testObjectSelector() {
        V1LabelSelector objectSelector = mock(V1LabelSelector.class);
        matchResources.setObjectSelector(objectSelector);
        assertThat(matchResources.getObjectSelector(), is(equalTo(objectSelector)));
    }

    //BaseRock generated method id: ${testResourceRules}, hash: ADB03D805BB0D74FB6115B66860A5825
    @Test
    void testResourceRules() {
        List<V1alpha1NamedRuleWithOperations> resourceRules = new ArrayList<>();
        V1alpha1NamedRuleWithOperations rule = mock(V1alpha1NamedRuleWithOperations.class);
        resourceRules.add(rule);
        matchResources.setResourceRules(resourceRules);
        assertThat(matchResources.getResourceRules(), is(equalTo(resourceRules)));
    }

    //BaseRock generated method id: ${testAddResourceRulesItem}, hash: 4B75074A742CDB9A7FE10A6895198416
    @Test
    void testAddResourceRulesItem() {
        V1alpha1NamedRuleWithOperations rule = mock(V1alpha1NamedRuleWithOperations.class);
        matchResources.addResourceRulesItem(rule);
        assertThat(matchResources.getResourceRules(), hasSize(1));
        assertThat(matchResources.getResourceRules().get(0), is(equalTo(rule)));
    }

    //BaseRock generated method id: ${testEquals}, hash: D67A2497093F697311D2B0F24ABF8DB9
    @Test
    void testEquals() {
        V1alpha1MatchResources matchResources1 = new V1alpha1MatchResources();
        V1alpha1MatchResources matchResources2 = new V1alpha1MatchResources();
        assertThat(matchResources1.equals(matchResources2), is(true));
        matchResources1.setMatchPolicy("Exact");
        assertThat(matchResources1.equals(matchResources2), is(false));
        matchResources2.setMatchPolicy("Exact");
        assertThat(matchResources1.equals(matchResources2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: D211335FD780E341FD6F3304FDE8627C
    @Test
    void testHashCode() {
        V1alpha1MatchResources matchResources1 = new V1alpha1MatchResources();
        V1alpha1MatchResources matchResources2 = new V1alpha1MatchResources();
        assertThat(matchResources1.hashCode(), is(equalTo(matchResources2.hashCode())));
        matchResources1.setMatchPolicy("Exact");
        assertThat(matchResources1.hashCode(), is(not(equalTo(matchResources2.hashCode()))));
        matchResources2.setMatchPolicy("Exact");
        assertThat(matchResources1.hashCode(), is(equalTo(matchResources2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 69F34750D18810C1ACABEAF9E5E6E44B
    @Test
    void testToString() {
        V1alpha1MatchResources matchResources = new V1alpha1MatchResources();
        matchResources.setMatchPolicy("Exact");
        String toString = matchResources.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("matchPolicy"), is(true));
        assertThat(toString.contains("Exact"), is(true));
    }

    //BaseRock generated method id: ${testMatchPolicyValues}, hash: 62045A7178744D1DD2AF7A0B972C559B
    @ParameterizedTest
    @ValueSource(strings = { "Exact", "Equivalent", "" })
    void testMatchPolicyValues(String matchPolicy) {
        matchResources.setMatchPolicy(matchPolicy);
        assertThat(matchResources.getMatchPolicy(), is(equalTo(matchPolicy)));
    }

    //BaseRock generated method id: ${testNullMatchPolicy}, hash: A29AA1B96F60F54EBDBD58031786A2BC
    @Test
    void testNullMatchPolicy() {
        matchResources.setMatchPolicy(null);
        assertThat(matchResources.getMatchPolicy(), is(nullValue()));
    }

    //BaseRock generated method id: ${testEmptyExcludeResourceRules}, hash: C654AF37EC229F0E8B82062BAB4CB78A
    @Test
    void testEmptyExcludeResourceRules() {
        matchResources.setExcludeResourceRules(new ArrayList<>());
        assertThat(matchResources.getExcludeResourceRules(), is(notNullValue()));
        assertThat(matchResources.getExcludeResourceRules(), hasSize(0));
    }

    //BaseRock generated method id: ${testEmptyResourceRules}, hash: 7D4D852622F8AAC8DD120CFECC110D50
    @Test
    void testEmptyResourceRules() {
        matchResources.setResourceRules(new ArrayList<>());
        assertThat(matchResources.getResourceRules(), is(notNullValue()));
        assertThat(matchResources.getResourceRules(), hasSize(0));
    }

    //BaseRock generated method id: ${testNullExcludeResourceRules}, hash: 920CA228DE5FEB67B9564A6911467F64
    @Test
    void testNullExcludeResourceRules() {
        matchResources.setExcludeResourceRules(null);
        assertThat(matchResources.getExcludeResourceRules(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNullResourceRules}, hash: F1F5C697CEBBC8E3D093FAAE94CD70A4
    @Test
    void testNullResourceRules() {
        matchResources.setResourceRules(null);
        assertThat(matchResources.getResourceRules(), is(nullValue()));
    }

    //BaseRock generated method id: ${testMultipleSettersAndGetters}, hash: 61B9350BC79C07343472A29CF72C1088
    @Test
    void testMultipleSettersAndGetters() {
        V1LabelSelector namespaceSelector = mock(V1LabelSelector.class);
        V1LabelSelector objectSelector = mock(V1LabelSelector.class);
        List<V1alpha1NamedRuleWithOperations> excludeResourceRules = new ArrayList<>();
        List<V1alpha1NamedRuleWithOperations> resourceRules = new ArrayList<>();
        matchResources.setMatchPolicy("Exact");
        matchResources.setNamespaceSelector(namespaceSelector);
        matchResources.setObjectSelector(objectSelector);
        matchResources.setExcludeResourceRules(excludeResourceRules);
        matchResources.setResourceRules(resourceRules);
        assertAll(() -> assertThat(matchResources.getMatchPolicy(), is(equalTo("Exact"))), () -> assertThat(matchResources.getNamespaceSelector(), is(equalTo(namespaceSelector))), () -> assertThat(matchResources.getObjectSelector(), is(equalTo(objectSelector))), () -> assertThat(matchResources.getExcludeResourceRules(), is(equalTo(excludeResourceRules))), () -> assertThat(matchResources.getResourceRules(), is(equalTo(resourceRules))));
    }
}
