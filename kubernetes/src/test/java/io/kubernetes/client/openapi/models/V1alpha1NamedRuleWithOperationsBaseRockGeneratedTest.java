package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.containsInAnyOrder;
import io.kubernetes.client.openapi.models.V1alpha1NamedRuleWithOperations;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1alpha1NamedRuleWithOperationsBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1alpha1NamedRuleWithOperationsConstructor}, hash: F76D50C3D65FA4FFAADF12B5F4D3D37E
    @Test
    void testV1alpha1NamedRuleWithOperationsConstructor() {
        V1alpha1NamedRuleWithOperations namedRule = new V1alpha1NamedRuleWithOperations();
        assertNotNull(namedRule);
    }

    //BaseRock generated method id: ${testApiGroups}, hash: D2D045C4659ACB462DFD5B8D29A2B5B4
    @Disabled()
    @Test
    void testApiGroups() {
        V1alpha1NamedRuleWithOperations namedRule = new V1alpha1NamedRuleWithOperations();
        List<String> apiGroups = Arrays.asList("group1", "group2");
        namedRule.setApiGroups(apiGroups);
        assertEquals(apiGroups, namedRule.getApiGroups());
        namedRule.addApiGroupsItem("group3");
        assertEquals(3, namedRule.getApiGroups().size());
        assertThat(namedRule.getApiGroups(), containsInAnyOrder("group1", "group2", "group3"));
    }

    //BaseRock generated method id: ${testApiVersions}, hash: 9FD54ABDF094FC8D53A6EC40E3B5A7DC
    @Disabled()
    @Test
    void testApiVersions() {
        V1alpha1NamedRuleWithOperations namedRule = new V1alpha1NamedRuleWithOperations();
        List<String> apiVersions = Arrays.asList("v1", "v2");
        namedRule.setApiVersions(apiVersions);
        assertEquals(apiVersions, namedRule.getApiVersions());
        namedRule.addApiVersionsItem("v3");
        assertEquals(3, namedRule.getApiVersions().size());
        assertThat(namedRule.getApiVersions(), containsInAnyOrder("v1", "v2", "v3"));
    }

    //BaseRock generated method id: ${testOperations}, hash: F6C8F025D823AECF3872862429816EDD
    @Disabled()
    @Test
    void testOperations() {
        V1alpha1NamedRuleWithOperations namedRule = new V1alpha1NamedRuleWithOperations();
        List<String> operations = Arrays.asList("CREATE", "UPDATE");
        namedRule.setOperations(operations);
        assertEquals(operations, namedRule.getOperations());
        namedRule.addOperationsItem("DELETE");
        assertEquals(3, namedRule.getOperations().size());
        assertThat(namedRule.getOperations(), containsInAnyOrder("CREATE", "UPDATE", "DELETE"));
    }

    //BaseRock generated method id: ${testResourceNames}, hash: 414AE4F73743809C985ABC4D44F06224
    @Disabled()
    @Test
    void testResourceNames() {
        V1alpha1NamedRuleWithOperations namedRule = new V1alpha1NamedRuleWithOperations();
        List<String> resourceNames = Arrays.asList("resource1", "resource2");
        namedRule.setResourceNames(resourceNames);
        assertEquals(resourceNames, namedRule.getResourceNames());
        namedRule.addResourceNamesItem("resource3");
        assertEquals(3, namedRule.getResourceNames().size());
        assertThat(namedRule.getResourceNames(), containsInAnyOrder("resource1", "resource2", "resource3"));
    }

    //BaseRock generated method id: ${testResources}, hash: 9D1CC8FD700E53118AAAE38E467C2CCE
    @Disabled()
    @Test
    void testResources() {
        V1alpha1NamedRuleWithOperations namedRule = new V1alpha1NamedRuleWithOperations();
        List<String> resources = Arrays.asList("pods", "services");
        namedRule.setResources(resources);
        assertEquals(resources, namedRule.getResources());
        namedRule.addResourcesItem("configmaps");
        assertEquals(3, namedRule.getResources().size());
        assertThat(namedRule.getResources(), containsInAnyOrder("pods", "services", "configmaps"));
    }

    //BaseRock generated method id: ${testScope}, hash: E7BE177F37142D3EF02A036531638FB6
    @Test
    void testScope() {
        V1alpha1NamedRuleWithOperations namedRule = new V1alpha1NamedRuleWithOperations();
        String scope = "Namespaced";
        namedRule.setScope(scope);
        assertEquals(scope, namedRule.getScope());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 4DDCE277DED71EC21F6276D527F7B28B
    @Test
    void testEqualsAndHashCode() {
        V1alpha1NamedRuleWithOperations rule1 = new V1alpha1NamedRuleWithOperations().apiGroups(Arrays.asList("group1")).apiVersions(Arrays.asList("v1")).operations(Arrays.asList("CREATE")).resourceNames(Arrays.asList("resource1")).resources(Arrays.asList("pods")).scope("Namespaced");
        V1alpha1NamedRuleWithOperations rule2 = new V1alpha1NamedRuleWithOperations().apiGroups(Arrays.asList("group1")).apiVersions(Arrays.asList("v1")).operations(Arrays.asList("CREATE")).resourceNames(Arrays.asList("resource1")).resources(Arrays.asList("pods")).scope("Namespaced");
        assertThat(rule1, is(equalTo(rule2)));
        assertThat(rule1.hashCode(), is(equalTo(rule2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 92632565EE5D04F6CACDB8A3E58F652E
    @Test
    void testToString() {
        V1alpha1NamedRuleWithOperations namedRule = new V1alpha1NamedRuleWithOperations().apiGroups(Arrays.asList("group1")).apiVersions(Arrays.asList("v1")).operations(Arrays.asList("CREATE")).resourceNames(Arrays.asList("resource1")).resources(Arrays.asList("pods")).scope("Namespaced");
        String toString = namedRule.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("apiGroups"), is(true));
        assertThat(toString.contains("apiVersions"), is(true));
        assertThat(toString.contains("operations"), is(true));
        assertThat(toString.contains("resourceNames"), is(true));
        assertThat(toString.contains("resources"), is(true));
        assertThat(toString.contains("scope"), is(true));
    }

    //BaseRock generated method id: ${testValidScopes}, hash: 25D1740FEC60211C45AA31FD4628D4A1
    @ParameterizedTest
    @ValueSource(strings = { "Cluster", "Namespaced", "*" })
    void testValidScopes(String scope) {
        V1alpha1NamedRuleWithOperations namedRule = new V1alpha1NamedRuleWithOperations().scope(scope);
        assertEquals(scope, namedRule.getScope());
    }

    //BaseRock generated method id: ${testEmptyLists}, hash: 2300199C8AC84692A280C5A2C206CCE0
    @Test
    void testEmptyLists() {
        V1alpha1NamedRuleWithOperations namedRule = new V1alpha1NamedRuleWithOperations();
        assertThat(namedRule.getApiGroups(), is(notNullValue()));
        assertThat(namedRule.getApiGroups(), hasSize(0));
        assertThat(namedRule.getApiVersions(), is(notNullValue()));
        assertThat(namedRule.getApiVersions(), hasSize(0));
        assertThat(namedRule.getOperations(), is(notNullValue()));
        assertThat(namedRule.getOperations(), hasSize(0));
        assertThat(namedRule.getResourceNames(), is(notNullValue()));
        assertThat(namedRule.getResourceNames(), hasSize(0));
        assertThat(namedRule.getResources(), is(notNullValue()));
        assertThat(namedRule.getResources(), hasSize(0));
    }

    //BaseRock generated method id: ${testFluentInterface}, hash: A50CF6E70DE8CED7930B6CF598B6367C
    @Test
    void testFluentInterface() {
        V1alpha1NamedRuleWithOperations namedRule = new V1alpha1NamedRuleWithOperations().apiGroups(new ArrayList<>()).apiVersions(new ArrayList<>()).operations(new ArrayList<>()).resourceNames(new ArrayList<>()).resources(new ArrayList<>()).scope("Cluster");
        assertThat(namedRule, is(notNullValue()));
        assertThat(namedRule.getApiGroups(), is(notNullValue()));
        assertThat(namedRule.getApiVersions(), is(notNullValue()));
        assertThat(namedRule.getOperations(), is(notNullValue()));
        assertThat(namedRule.getResourceNames(), is(notNullValue()));
        assertThat(namedRule.getResources(), is(notNullValue()));
        assertEquals("Cluster", namedRule.getScope());
    }
}
