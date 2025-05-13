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
import io.kubernetes.client.openapi.models.V1RuleWithOperations;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1RuleWithOperationsBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1RuleWithOperationsConstructor}, hash: 32970A273FF3DEB028228547D24964D1
    @Test
    void testV1RuleWithOperationsConstructor() {
        V1RuleWithOperations ruleWithOperations = new V1RuleWithOperations();
        assertNotNull(ruleWithOperations);
    }

    //BaseRock generated method id: ${testApiGroups}, hash: C0C6C9EB5A480EA91B4C7509A4E7536C
    @Test
    void testApiGroups() {
        V1RuleWithOperations ruleWithOperations = new V1RuleWithOperations();
        List<String> apiGroups = new ArrayList<>(Arrays.asList("group1", "group2"));
        ruleWithOperations.setApiGroups(apiGroups);
        assertEquals(apiGroups, ruleWithOperations.getApiGroups());
        ruleWithOperations.addApiGroupsItem("group3");
        assertThat(ruleWithOperations.getApiGroups(), hasSize(3));
        assertThat(ruleWithOperations.getApiGroups(), containsInAnyOrder("group1", "group2", "group3"));
    }

    //BaseRock generated method id: ${testApiVersions}, hash: EE968F695FF87EB20446F3CF7A7B83D7
    @Test
    void testApiVersions() {
        V1RuleWithOperations ruleWithOperations = new V1RuleWithOperations();
        List<String> apiVersions = new ArrayList<>(Arrays.asList("v1", "v2"));
        ruleWithOperations.setApiVersions(apiVersions);
        assertEquals(apiVersions, ruleWithOperations.getApiVersions());
        ruleWithOperations.addApiVersionsItem("v3");
        assertThat(ruleWithOperations.getApiVersions(), hasSize(3));
        assertThat(ruleWithOperations.getApiVersions(), containsInAnyOrder("v1", "v2", "v3"));
    }

    //BaseRock generated method id: ${testOperations}, hash: E3BC9C81B293EAD11758B693339969A5
    @Test
    void testOperations() {
        V1RuleWithOperations ruleWithOperations = new V1RuleWithOperations();
        List<String> operations = new ArrayList<>(Arrays.asList("CREATE", "UPDATE"));
        ruleWithOperations.setOperations(operations);
        assertEquals(operations, ruleWithOperations.getOperations());
        ruleWithOperations.addOperationsItem("DELETE");
        assertThat(ruleWithOperations.getOperations(), hasSize(3));
        assertThat(ruleWithOperations.getOperations(), containsInAnyOrder("CREATE", "UPDATE", "DELETE"));
    }

    //BaseRock generated method id: ${testResources}, hash: 673866147714AFECEB5984C4F8C8B95D
    @Test
    void testResources() {
        V1RuleWithOperations ruleWithOperations = new V1RuleWithOperations();
        List<String> resources = new ArrayList<>(Arrays.asList("pods", "services"));
        ruleWithOperations.setResources(resources);
        assertEquals(resources, ruleWithOperations.getResources());
        ruleWithOperations.addResourcesItem("deployments");
        assertThat(ruleWithOperations.getResources(), hasSize(3));
        assertThat(ruleWithOperations.getResources(), containsInAnyOrder("pods", "services", "deployments"));
    }

    //BaseRock generated method id: ${testScope}, hash: 0BF9F558261CD22AA7D5F7FEAB125761
    @Test
    void testScope() {
        V1RuleWithOperations ruleWithOperations = new V1RuleWithOperations();
        String scope = "Namespaced";
        ruleWithOperations.setScope(scope);
        assertEquals(scope, ruleWithOperations.getScope());
    }

    //BaseRock generated method id: ${testValidScopes}, hash: 31B872851181E1BE19B7D9C45A5F277B
    @ParameterizedTest
    @ValueSource(strings = { "Cluster", "Namespaced", "*" })
    void testValidScopes(String scope) {
        V1RuleWithOperations ruleWithOperations = new V1RuleWithOperations();
        ruleWithOperations.setScope(scope);
        assertEquals(scope, ruleWithOperations.getScope());
    }

    //BaseRock generated method id: ${testEquals}, hash: BD9F35EE3DA5730B5711EB23C7A893B7
    @Test
    void testEquals() {
        V1RuleWithOperations rule1 = new V1RuleWithOperations().apiGroups(Arrays.asList("group1")).apiVersions(Arrays.asList("v1")).operations(Arrays.asList("CREATE")).resources(Arrays.asList("pods")).scope("Namespaced");
        V1RuleWithOperations rule2 = new V1RuleWithOperations().apiGroups(Arrays.asList("group1")).apiVersions(Arrays.asList("v1")).operations(Arrays.asList("CREATE")).resources(Arrays.asList("pods")).scope("Namespaced");
        assertThat(rule1, is(equalTo(rule2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: DE8CE24E29F0541916583DC793766EBE
    @Test
    void testHashCode() {
        V1RuleWithOperations rule = new V1RuleWithOperations().apiGroups(Arrays.asList("group1")).apiVersions(Arrays.asList("v1")).operations(Arrays.asList("CREATE")).resources(Arrays.asList("pods")).scope("Namespaced");
        assertThat(rule.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 06E2E3BCFB2C98B35DA79E66D25D1E2B
    @Test
    void testToString() {
        V1RuleWithOperations rule = new V1RuleWithOperations().apiGroups(Arrays.asList("group1")).apiVersions(Arrays.asList("v1")).operations(Arrays.asList("CREATE")).resources(Arrays.asList("pods")).scope("Namespaced");
        String toString = rule.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("apiGroups"), is(true));
        assertThat(toString.contains("apiVersions"), is(true));
        assertThat(toString.contains("operations"), is(true));
        assertThat(toString.contains("resources"), is(true));
        assertThat(toString.contains("scope"), is(true));
    }
}
