package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1ResourceRule;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1ResourceRuleBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1ResourceRuleConstructor}, hash: 7B78A3514CA926A16CDEEE32D82A74A9
    @Test
    void testV1ResourceRuleConstructor() {
        V1ResourceRule resourceRule = new V1ResourceRule();
        assertNotNull(resourceRule);
    }

    //BaseRock generated method id: ${testApiGroups}, hash: C4749D3AEE5A3396865633CAA2F282C4
    @Test
    void testApiGroups() {
        V1ResourceRule resourceRule = new V1ResourceRule();
        List<String> apiGroups = new ArrayList<>(Arrays.asList("apps", "batch"));
        resourceRule.setApiGroups(apiGroups);
        assertEquals(apiGroups, resourceRule.getApiGroups());
        resourceRule.addApiGroupsItem("networking");
        assertThat(resourceRule.getApiGroups(), containsInAnyOrder("apps", "batch", "networking"));
    }

    //BaseRock generated method id: ${testResourceNames}, hash: 8B1EAC8A6BA5E70C45D52958DC87D1C0
    @Test
    void testResourceNames() {
        V1ResourceRule resourceRule = new V1ResourceRule();
        List<String> resourceNames = new ArrayList<>(Arrays.asList("pod-1", "pod-2"));
        resourceRule.setResourceNames(resourceNames);
        assertEquals(resourceNames, resourceRule.getResourceNames());
        resourceRule.addResourceNamesItem("pod-3");
        assertThat(resourceRule.getResourceNames(), containsInAnyOrder("pod-1", "pod-2", "pod-3"));
    }

    //BaseRock generated method id: ${testResources}, hash: C3B6EBC8635BF4296B13A09A10374057
    @Test
    void testResources() {
        V1ResourceRule resourceRule = new V1ResourceRule();
        List<String> resources = new ArrayList<>(Arrays.asList("pods", "services"));
        resourceRule.setResources(resources);
        assertEquals(resources, resourceRule.getResources());
        resourceRule.addResourcesItem("configmaps");
        assertThat(resourceRule.getResources(), containsInAnyOrder("pods", "services", "configmaps"));
    }

    //BaseRock generated method id: ${testVerbs}, hash: 2BACD14592F89C530EABEF1B5A21F3C7
    @Test
    void testVerbs() {
        V1ResourceRule resourceRule = new V1ResourceRule();
        List<String> verbs = new ArrayList<>(Arrays.asList("get", "list", "watch"));
        resourceRule.setVerbs(verbs);
        assertEquals(verbs, resourceRule.getVerbs());
        resourceRule.addVerbsItem("create");
        assertThat(resourceRule.getVerbs(), containsInAnyOrder("get", "list", "watch", "create"));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 60C280FCB58B8654A90A6C85D76E5190
    @Test
    void testEqualsAndHashCode() {
        V1ResourceRule rule1 = new V1ResourceRule().apiGroups(Arrays.asList("apps")).resourceNames(Arrays.asList("deployment-1")).resources(Arrays.asList("deployments")).verbs(Arrays.asList("get", "list"));
        V1ResourceRule rule2 = new V1ResourceRule().apiGroups(Arrays.asList("apps")).resourceNames(Arrays.asList("deployment-1")).resources(Arrays.asList("deployments")).verbs(Arrays.asList("get", "list"));
        V1ResourceRule rule3 = new V1ResourceRule().apiGroups(Arrays.asList("core")).resourceNames(Arrays.asList("pod-1")).resources(Arrays.asList("pods")).verbs(Arrays.asList("create", "delete"));
        assertEquals(rule1, rule2);
        assertEquals(rule1.hashCode(), rule2.hashCode());
        assertThat(rule1.equals(rule3), is(false));
    }

    //BaseRock generated method id: ${testToString}, hash: 9AF08BAE9ACE3E01F9DC7F1D0DB4E919
    @Test
    void testToString() {
        V1ResourceRule resourceRule = new V1ResourceRule().apiGroups(Arrays.asList("apps")).resourceNames(Arrays.asList("deployment-1")).resources(Arrays.asList("deployments")).verbs(Arrays.asList("get", "list"));
        String toString = resourceRule.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("apiGroups"), is(true));
        assertThat(toString.contains("resourceNames"), is(true));
        assertThat(toString.contains("resources"), is(true));
        assertThat(toString.contains("verbs"), is(true));
    }

    //BaseRock generated method id: ${testEmptyLists}, hash: 20C1562702E6CC38FD425EFB2CD6B071
    @Test
    void testEmptyLists() {
        V1ResourceRule resourceRule = new V1ResourceRule();
        assertThat(resourceRule.getApiGroups(), is(empty()));
        assertThat(resourceRule.getResourceNames(), is(empty()));
        assertThat(resourceRule.getResources(), is(empty()));
        assertThat(resourceRule.getVerbs(), is(empty()));
    }

    //BaseRock generated method id: ${testNullLists}, hash: 0D614F11C29A3F81CFE93D9E5E7E9721
    @Disabled()
    @Test
    void testNullLists() {
        V1ResourceRule resourceRule = new V1ResourceRule();
        resourceRule.setApiGroups(null);
        resourceRule.setResourceNames(null);
        resourceRule.setResources(null);
        resourceRule.setVerbs(null);
        assertThat(resourceRule.getApiGroups(), is(notNullValue()));
        assertThat(resourceRule.getResourceNames(), is(notNullValue()));
        assertThat(resourceRule.getResources(), is(notNullValue()));
        assertThat(resourceRule.getVerbs(), is(notNullValue()));
        assertThat(resourceRule.getApiGroups(), is(empty()));
        assertThat(resourceRule.getResourceNames(), is(empty()));
        assertThat(resourceRule.getResources(), is(empty()));
        assertThat(resourceRule.getVerbs(), is(empty()));
    }

    //BaseRock generated method id: ${testAddItemToNullList}, hash: 6B42AE4CAEF0FB358FA790A93EB863E3
    @Test
    void testAddItemToNullList() {
        V1ResourceRule resourceRule = new V1ResourceRule();
        resourceRule.setApiGroups(null);
        resourceRule.setResourceNames(null);
        resourceRule.setResources(null);
        resourceRule.setVerbs(null);
        resourceRule.addApiGroupsItem("apps");
        resourceRule.addResourceNamesItem("deployment-1");
        resourceRule.addResourcesItem("deployments");
        resourceRule.addVerbsItem("get");
        assertThat(resourceRule.getApiGroups(), containsInAnyOrder("apps"));
        assertThat(resourceRule.getResourceNames(), containsInAnyOrder("deployment-1"));
        assertThat(resourceRule.getResources(), containsInAnyOrder("deployments"));
        assertThat(resourceRule.getVerbs(), containsInAnyOrder("get"));
    }
}
