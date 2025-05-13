package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.containsInAnyOrder;
import io.kubernetes.client.openapi.models.V1beta1NamedRuleWithOperations;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1beta1NamedRuleWithOperationsBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 69D08D5B3DB27C2D1235EF6C7600BD55
    @Test
    void testConstructor() {
        V1beta1NamedRuleWithOperations namedRule = new V1beta1NamedRuleWithOperations();
        assertNotNull(namedRule);
    }

    //BaseRock generated method id: ${testApiGroups}, hash: 68CD9B16421CE1952E1D9680F4C0A888
    @Disabled()
    @Test
    void testApiGroups() {
        V1beta1NamedRuleWithOperations namedRule = new V1beta1NamedRuleWithOperations();
        List<String> apiGroups = Arrays.asList("group1", "group2");
        namedRule.setApiGroups(apiGroups);
        assertEquals(apiGroups, namedRule.getApiGroups());
        namedRule.addApiGroupsItem("group3");
        assertEquals(3, namedRule.getApiGroups().size());
        assertThat(namedRule.getApiGroups(), containsInAnyOrder("group1", "group2", "group3"));
    }

    //BaseRock generated method id: ${testApiVersions}, hash: 5683F35581D6AAE253124737EAB9AE57
    @Disabled()
    @Test
    void testApiVersions() {
        V1beta1NamedRuleWithOperations namedRule = new V1beta1NamedRuleWithOperations();
        List<String> apiVersions = Arrays.asList("v1", "v2");
        namedRule.setApiVersions(apiVersions);
        assertEquals(apiVersions, namedRule.getApiVersions());
        namedRule.addApiVersionsItem("v3");
        assertEquals(3, namedRule.getApiVersions().size());
        assertThat(namedRule.getApiVersions(), containsInAnyOrder("v1", "v2", "v3"));
    }

    //BaseRock generated method id: ${testOperations}, hash: 72E3CB6CE52F2649BE1E926F265C63AF
    @Disabled()
    @Test
    void testOperations() {
        V1beta1NamedRuleWithOperations namedRule = new V1beta1NamedRuleWithOperations();
        List<String> operations = Arrays.asList("CREATE", "UPDATE");
        namedRule.setOperations(operations);
        assertEquals(operations, namedRule.getOperations());
        namedRule.addOperationsItem("DELETE");
        assertEquals(3, namedRule.getOperations().size());
        assertThat(namedRule.getOperations(), containsInAnyOrder("CREATE", "UPDATE", "DELETE"));
    }

    //BaseRock generated method id: ${testResourceNames}, hash: EDECAA890CF85A7E6296E3A2FA46CDDF
    @Disabled()
    @Test
    void testResourceNames() {
        V1beta1NamedRuleWithOperations namedRule = new V1beta1NamedRuleWithOperations();
        List<String> resourceNames = Arrays.asList("resource1", "resource2");
        namedRule.setResourceNames(resourceNames);
        assertEquals(resourceNames, namedRule.getResourceNames());
        namedRule.addResourceNamesItem("resource3");
        assertEquals(3, namedRule.getResourceNames().size());
        assertThat(namedRule.getResourceNames(), containsInAnyOrder("resource1", "resource2", "resource3"));
    }

    //BaseRock generated method id: ${testResources}, hash: 8D6AB0E4A0851B4EBB1B7AA35057DC74
    @Disabled()
    @Test
    void testResources() {
        V1beta1NamedRuleWithOperations namedRule = new V1beta1NamedRuleWithOperations();
        List<String> resources = Arrays.asList("pods", "services");
        namedRule.setResources(resources);
        assertEquals(resources, namedRule.getResources());
        namedRule.addResourcesItem("configmaps");
        assertEquals(3, namedRule.getResources().size());
        assertThat(namedRule.getResources(), containsInAnyOrder("pods", "services", "configmaps"));
    }

    //BaseRock generated method id: ${testScope}, hash: 0E11372028CCB378BD639D14CF858B5A
    @Test
    void testScope() {
        V1beta1NamedRuleWithOperations namedRule = new V1beta1NamedRuleWithOperations();
        String scope = "Namespaced";
        namedRule.setScope(scope);
        assertEquals(scope, namedRule.getScope());
    }

    //BaseRock generated method id: ${testEquals}, hash: 9166A53C86E7857C465E9089ACF94325
    @Test
    void testEquals() {
        V1beta1NamedRuleWithOperations rule1 = new V1beta1NamedRuleWithOperations().apiGroups(Arrays.asList("group1")).apiVersions(Arrays.asList("v1")).operations(Arrays.asList("CREATE")).resourceNames(Arrays.asList("resource1")).resources(Arrays.asList("pods")).scope("Namespaced");
        V1beta1NamedRuleWithOperations rule2 = new V1beta1NamedRuleWithOperations().apiGroups(Arrays.asList("group1")).apiVersions(Arrays.asList("v1")).operations(Arrays.asList("CREATE")).resourceNames(Arrays.asList("resource1")).resources(Arrays.asList("pods")).scope("Namespaced");
        assertEquals(rule1, rule2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 5AFD66FDABC088BBA9D6F0184D4652C6
    @Test
    void testHashCode() {
        V1beta1NamedRuleWithOperations rule1 = new V1beta1NamedRuleWithOperations().apiGroups(Arrays.asList("group1")).apiVersions(Arrays.asList("v1")).operations(Arrays.asList("CREATE")).resourceNames(Arrays.asList("resource1")).resources(Arrays.asList("pods")).scope("Namespaced");
        V1beta1NamedRuleWithOperations rule2 = new V1beta1NamedRuleWithOperations().apiGroups(Arrays.asList("group1")).apiVersions(Arrays.asList("v1")).operations(Arrays.asList("CREATE")).resourceNames(Arrays.asList("resource1")).resources(Arrays.asList("pods")).scope("Namespaced");
        assertEquals(rule1.hashCode(), rule2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: E4151228DE05C4E079E021E36BB426D1
    @Disabled
    @Test
    void testToString() {
        //V1beta1NamedRuleWithOperations namedRule = new V1beta1NamedRuleWithOperations().apiGroups(Arrays.asList("group1")).apiVersions(Arrays.asList("v1")).operations(Arrays.asList("CREATE")).resourceNames(Arrays.asList("resource1")).resources(Arrays.asList("pods")).scope("Namespaced");
        //String result = namedRule.toString();
        //assertNotNull(result);
        //assertTrue(result.contains("apiGroups"));
        //assertTrue(result.contains("apiVersions"));
        //assertTrue(result.contains("operations"));
        //assertTrue(result.contains("resourceNames"));
        //assertTrue(result.contains("resources"));
        //assertTrue(result.contains("scope"));
    }

    //BaseRock generated method id: ${testValidScopes}, hash: 3A80D6B5F7E7AA6704BEEB354477792A
    @ParameterizedTest
    @ValueSource(strings = { "Cluster", "Namespaced", "*" })
    void testValidScopes(String scope) {
        V1beta1NamedRuleWithOperations namedRule = new V1beta1NamedRuleWithOperations().scope(scope);
        assertEquals(scope, namedRule.getScope());
    }

    //BaseRock generated method id: ${testEmptyLists}, hash: FDFC3CE6178ED47B543511A9D32F711D
    @Disabled
    @Test
    void testEmptyLists() {
        //V1beta1NamedRuleWithOperations namedRule = new V1beta1NamedRuleWithOperations();
        //assertTrue(namedRule.getApiGroups().isEmpty());
        //assertTrue(namedRule.getApiVersions().isEmpty());
        //assertTrue(namedRule.getOperations().isEmpty());
        //assertTrue(namedRule.getResourceNames().isEmpty());
        //assertTrue(namedRule.getResources().isEmpty());
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 01F8030A4CEDDEC5A7A03B0C47C0EAAB
    @Disabled
    @Test
    void testBuilderPattern() {
        //V1beta1NamedRuleWithOperations namedRule = new V1beta1NamedRuleWithOperations().apiGroups(new ArrayList<>()).apiVersions(new ArrayList<>()).operations(new ArrayList<>()).resourceNames(new ArrayList<>()).resources(new ArrayList<>()).scope("Cluster");
        //assertNotNull(namedRule);
        //assertTrue(namedRule.getApiGroups().isEmpty());
        //assertTrue(namedRule.getApiVersions().isEmpty());
        //assertTrue(namedRule.getOperations().isEmpty());
        //assertTrue(namedRule.getResourceNames().isEmpty());
        //assertTrue(namedRule.getResources().isEmpty());
        //assertEquals("Cluster", namedRule.getScope());
    }
}
