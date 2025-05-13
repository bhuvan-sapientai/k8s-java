package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1NamedRuleWithOperations;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1NamedRuleWithOperationsBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1NamedRuleWithOperationsConstructor}, hash: 37CFCB01AB44A6C98295BD282105FD72
    @Test
    void testV1NamedRuleWithOperationsConstructor() {
        V1NamedRuleWithOperations namedRule = new V1NamedRuleWithOperations();
        assertNotNull(namedRule);
    }

    //BaseRock generated method id: ${testApiGroups}, hash: 09F45BF84EFF548CCC4D6EFB0E9ACE73
    @Disabled()
    @Test
    void testApiGroups() {
        V1NamedRuleWithOperations namedRule = new V1NamedRuleWithOperations();
        List<String> apiGroups = Arrays.asList("group1", "group2");
        namedRule.setApiGroups(apiGroups);
        assertEquals(apiGroups, namedRule.getApiGroups());
        namedRule.addApiGroupsItem("group3");
        assertThat(namedRule.getApiGroups(), hasSize(3));
        assertThat(namedRule.getApiGroups(), containsInAnyOrder("group1", "group2", "group3"));
    }

    //BaseRock generated method id: ${testApiVersions}, hash: 68D8BFB9D5EC3FC5B011C566C7268642
    @Test
    void testApiVersions() {
        V1NamedRuleWithOperations namedRule = new V1NamedRuleWithOperations();
        List<String> apiVersions = new ArrayList<>(Arrays.asList("v1", "v2"));
        namedRule.setApiVersions(apiVersions);
        assertEquals(apiVersions, namedRule.getApiVersions());
        namedRule.addApiVersionsItem("v3");
        assertThat(namedRule.getApiVersions(), hasSize(3));
        assertThat(namedRule.getApiVersions(), containsInAnyOrder("v1", "v2", "v3"));
    }

    //BaseRock generated method id: ${testOperations}, hash: 68C79ED10984F018D6AAFDA09262730B
    @Test
    void testOperations() {
        V1NamedRuleWithOperations namedRule = new V1NamedRuleWithOperations();
        List<String> operations = new ArrayList<>(Arrays.asList("CREATE", "UPDATE"));
        namedRule.setOperations(operations);
        assertEquals(operations, namedRule.getOperations());
        namedRule.addOperationsItem("DELETE");
        assertThat(namedRule.getOperations(), hasSize(3));
        assertThat(namedRule.getOperations(), containsInAnyOrder("CREATE", "UPDATE", "DELETE"));
    }

    //BaseRock generated method id: ${testResourceNames}, hash: A9FBFAD05A66B9FA162DBEAFED64C48B
    @Test
    void testResourceNames() {
        V1NamedRuleWithOperations namedRule = new V1NamedRuleWithOperations();
        List<String> resourceNames = new ArrayList<>(Arrays.asList("resource1", "resource2"));
        namedRule.setResourceNames(resourceNames);
        assertEquals(resourceNames, namedRule.getResourceNames());
        namedRule.addResourceNamesItem("resource3");
        assertThat(namedRule.getResourceNames(), hasSize(3));
        assertThat(namedRule.getResourceNames(), containsInAnyOrder("resource1", "resource2", "resource3"));
    }

    //BaseRock generated method id: ${testResources}, hash: 69D25B3F478653031AE303891DBB439C
    @Test
    void testResources() {
        V1NamedRuleWithOperations namedRule = new V1NamedRuleWithOperations();
        List<String> resources = new ArrayList<>(Arrays.asList("pods", "services"));
        namedRule.setResources(resources);
        assertEquals(resources, namedRule.getResources());
        namedRule.addResourcesItem("configmaps");
        assertThat(namedRule.getResources(), hasSize(3));
        assertThat(namedRule.getResources(), containsInAnyOrder("pods", "services", "configmaps"));
    }

    //BaseRock generated method id: ${testScope}, hash: 31892289C3CF6311181086D5CEAE58D5
    @Test
    void testScope() {
        V1NamedRuleWithOperations namedRule = new V1NamedRuleWithOperations();
        String scope = "Namespaced";
        namedRule.setScope(scope);
        assertEquals(scope, namedRule.getScope());
    }

    //BaseRock generated method id: ${testEquals}, hash: 2F294B88FC34CE020D7B417CAA970DB6
    @Test
    void testEquals() {
        V1NamedRuleWithOperations rule1 = new V1NamedRuleWithOperations().apiGroups(Arrays.asList("group1")).apiVersions(Arrays.asList("v1")).operations(Arrays.asList("CREATE")).resourceNames(Arrays.asList("resource1")).resources(Arrays.asList("pods")).scope("Namespaced");
        V1NamedRuleWithOperations rule2 = new V1NamedRuleWithOperations().apiGroups(Arrays.asList("group1")).apiVersions(Arrays.asList("v1")).operations(Arrays.asList("CREATE")).resourceNames(Arrays.asList("resource1")).resources(Arrays.asList("pods")).scope("Namespaced");
        assertThat(rule1, is(equalTo(rule2)));
        assertThat(rule1.hashCode(), is(equalTo(rule2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: ADE4BB5CE2980317236F68681C951770
    @Test
    void testToString() {
        V1NamedRuleWithOperations namedRule = new V1NamedRuleWithOperations().apiGroups(Arrays.asList("group1")).apiVersions(Arrays.asList("v1")).operations(Arrays.asList("CREATE")).resourceNames(Arrays.asList("resource1")).resources(Arrays.asList("pods")).scope("Namespaced");
        String toString = namedRule.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("apiGroups"), is(true));
        assertThat(toString.contains("apiVersions"), is(true));
        assertThat(toString.contains("operations"), is(true));
        assertThat(toString.contains("resourceNames"), is(true));
        assertThat(toString.contains("resources"), is(true));
        assertThat(toString.contains("scope"), is(true));
    }

    //BaseRock generated method id: ${testValidScopes}, hash: 9FED98879A49F81DAD5C81C87E54459D
    @ParameterizedTest
    @ValueSource(strings = { "Cluster", "Namespaced", "*" })
    void testValidScopes(String scope) {
        V1NamedRuleWithOperations namedRule = new V1NamedRuleWithOperations().scope(scope);
        assertThat(namedRule.getScope(), is(equalTo(scope)));
    }

    //BaseRock generated method id: ${testEmptyLists}, hash: 2DE0466D7294DFFE6F7AC05701416561
    @Test
    void testEmptyLists() {
        V1NamedRuleWithOperations namedRule = new V1NamedRuleWithOperations();
        assertThat(namedRule.getApiGroups(), is(empty()));
        assertThat(namedRule.getApiVersions(), is(empty()));
        assertThat(namedRule.getOperations(), is(empty()));
        assertThat(namedRule.getResourceNames(), is(empty()));
        assertThat(namedRule.getResources(), is(empty()));
    }

    //BaseRock generated method id: ${testNullScope}, hash: 85F822B123330071B982BAABD9EE9C0E
    @Test
    void testNullScope() {
        V1NamedRuleWithOperations namedRule = new V1NamedRuleWithOperations();
        assertThat(namedRule.getScope(), is(nullValue()));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: BB6834B4372AF46F42790D99FDCB80E5
    @Test
    void testBuilderPattern() {
        V1NamedRuleWithOperations namedRule = new V1NamedRuleWithOperations().apiGroups(new ArrayList<>()).apiVersions(new ArrayList<>()).operations(new ArrayList<>()).resourceNames(new ArrayList<>()).resources(new ArrayList<>()).scope("Cluster");
        assertThat(namedRule, notNullValue());
        assertThat(namedRule.getApiGroups(), notNullValue());
        assertThat(namedRule.getApiVersions(), notNullValue());
        assertThat(namedRule.getOperations(), notNullValue());
        assertThat(namedRule.getResourceNames(), notNullValue());
        assertThat(namedRule.getResources(), notNullValue());
        assertThat(namedRule.getScope(), is("Cluster"));
    }
}
