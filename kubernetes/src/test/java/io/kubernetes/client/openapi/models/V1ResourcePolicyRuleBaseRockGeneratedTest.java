package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import org.junit.jupiter.api.Timeout;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Collections;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1ResourcePolicyRuleBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 9663AE669DF2FE40A27DE2462F07E2AA
    @Test
    void testConstructor() {
        V1ResourcePolicyRule rule = new V1ResourcePolicyRule();
        assertThat(rule, is(notNullValue()));
    }

    //BaseRock generated method id: ${testApiGroups}, hash: CE44AD86E94C59049E3C0AEF30166CAB
    @Disabled()
    @Test
    void testApiGroups() {
        V1ResourcePolicyRule rule = new V1ResourcePolicyRule();
        List<String> apiGroups = Arrays.asList("group1", "group2");
        rule.setApiGroups(apiGroups);
        assertEquals(apiGroups, rule.getApiGroups());
        rule.addApiGroupsItem("group3");
        assertEquals(3, rule.getApiGroups().size());
        assertTrue(rule.getApiGroups().containsAll(Arrays.asList("group1", "group2", "group3")));
    }

    //BaseRock generated method id: ${testClusterScope}, hash: 638BD223414E120C40142AB684BB7DCC
    @Test
    void testClusterScope() {
        V1ResourcePolicyRule rule = new V1ResourcePolicyRule();
        rule.setClusterScope(true);
        assertTrue(rule.getClusterScope());
        rule.setClusterScope(false);
        assertFalse(rule.getClusterScope());
    }

    //BaseRock generated method id: ${testNamespaces}, hash: 0806EEC9E694FE6EB6F038D3FC29D2A5
    @Disabled()
    @Test
    void testNamespaces() {
        V1ResourcePolicyRule rule = new V1ResourcePolicyRule();
        List<String> namespaces = Arrays.asList("namespace1", "namespace2");
        rule.setNamespaces(namespaces);
        assertEquals(namespaces, rule.getNamespaces());
        rule.addNamespacesItem("namespace3");
        assertEquals(3, rule.getNamespaces().size());
        assertTrue(rule.getNamespaces().containsAll(Arrays.asList("namespace1", "namespace2", "namespace3")));
    }

    //BaseRock generated method id: ${testResources}, hash: 290602ADE00E22CBDA68657382C50519
    @Disabled()
    @Test
    void testResources() {
        V1ResourcePolicyRule rule = new V1ResourcePolicyRule();
        List<String> resources = Arrays.asList("resource1", "resource2");
        rule.setResources(resources);
        assertEquals(resources, rule.getResources());
        rule.addResourcesItem("resource3");
        assertEquals(3, rule.getResources().size());
        assertTrue(rule.getResources().containsAll(Arrays.asList("resource1", "resource2", "resource3")));
    }

    //BaseRock generated method id: ${testVerbs}, hash: 773FF8ABFA3F00F446662F70E2276C14
    @Disabled()
    @Test
    void testVerbs() {
        V1ResourcePolicyRule rule = new V1ResourcePolicyRule();
        List<String> verbs = Arrays.asList("get", "post");
        rule.setVerbs(verbs);
        assertEquals(verbs, rule.getVerbs());
        rule.addVerbsItem("delete");
        assertEquals(3, rule.getVerbs().size());
        assertTrue(rule.getVerbs().containsAll(Arrays.asList("get", "post", "delete")));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: D53DC734F68C64065EEDAEE3889291D6
    @Test
    void testEqualsAndHashCode() {
        V1ResourcePolicyRule rule1 = new V1ResourcePolicyRule().apiGroups(Arrays.asList("group1")).clusterScope(true).namespaces(Arrays.asList("namespace1")).resources(Arrays.asList("resource1")).verbs(Arrays.asList("get"));
        V1ResourcePolicyRule rule2 = new V1ResourcePolicyRule().apiGroups(Arrays.asList("group1")).clusterScope(true).namespaces(Arrays.asList("namespace1")).resources(Arrays.asList("resource1")).verbs(Arrays.asList("get"));
        V1ResourcePolicyRule rule3 = new V1ResourcePolicyRule().apiGroups(Arrays.asList("group2")).clusterScope(false).namespaces(Arrays.asList("namespace2")).resources(Arrays.asList("resource2")).verbs(Arrays.asList("post"));
        assertAll(() -> assertEquals(rule1, rule2), () -> assertEquals(rule1.hashCode(), rule2.hashCode()), () -> assertNotEquals(rule1, rule3), () -> assertNotEquals(rule1.hashCode(), rule3.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 54997C9783C46A34ED324FDA87E46DC0
    @Test
    void testToString() {
        V1ResourcePolicyRule rule = new V1ResourcePolicyRule().apiGroups(Arrays.asList("group1")).clusterScope(true).namespaces(Arrays.asList("namespace1")).resources(Arrays.asList("resource1")).verbs(Arrays.asList("get"));
        String toString = rule.toString();
        assertAll(() -> assertTrue(toString.contains("apiGroups")), () -> assertTrue(toString.contains("clusterScope")), () -> assertTrue(toString.contains("namespaces")), () -> assertTrue(toString.contains("resources")), () -> assertTrue(toString.contains("verbs")));
    }

    //BaseRock generated method id: ${testWildcardApiGroups}, hash: D59ED3A99294760F5366A74289876054
    @ParameterizedTest
    @ValueSource(strings = { "*" })
    void testWildcardApiGroups(String wildcard) {
        V1ResourcePolicyRule rule = new V1ResourcePolicyRule().apiGroups(Collections.singletonList(wildcard));
        assertTrue(rule.getApiGroups().contains(wildcard));
    }

    //BaseRock generated method id: ${testWildcardResources}, hash: 7618ABEB70CA1224290560F68B7A1598
    @ParameterizedTest
    @ValueSource(strings = { "*" })
    void testWildcardResources(String wildcard) {
        V1ResourcePolicyRule rule = new V1ResourcePolicyRule().resources(Collections.singletonList(wildcard));
        assertTrue(rule.getResources().contains(wildcard));
    }

    //BaseRock generated method id: ${testWildcardVerbs}, hash: 09FB7F1065C32BA33837C6F1287252AB
    @ParameterizedTest
    @ValueSource(strings = { "*" })
    void testWildcardVerbs(String wildcard) {
        V1ResourcePolicyRule rule = new V1ResourcePolicyRule().verbs(Collections.singletonList(wildcard));
        assertTrue(rule.getVerbs().contains(wildcard));
    }

    //BaseRock generated method id: ${testNullValues}, hash: D7CF7B97D71969EE5570585B4098E196
    @Test
    void testNullValues() {
        V1ResourcePolicyRule rule = new V1ResourcePolicyRule();
        assertAll(() -> assertThat(rule.getApiGroups(), is(notNullValue())), () -> assertThat(rule.getClusterScope(), is(nullValue())), () -> assertThat(rule.getNamespaces(), is(notNullValue())), () -> assertThat(rule.getResources(), is(notNullValue())), () -> assertThat(rule.getVerbs(), is(notNullValue())));
    }

    //BaseRock generated method id: ${testRequiredFields}, hash: C0A19B1C4C9DAA10B014B1EBFB616C5A
    @Test
    void testRequiredFields() {
        V1ResourcePolicyRule rule = new V1ResourcePolicyRule();
        assertAll(() -> assertDoesNotThrow(() -> rule.setApiGroups(null)), () -> assertDoesNotThrow(() -> rule.setResources(null)), () -> assertDoesNotThrow(() -> rule.setVerbs(null)));
    }
}
