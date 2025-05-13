package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.V1PolicyRule;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import java.util.ArrayList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1PolicyRuleBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 87AEEE0432C015FE16ACF47A432279BD
    @Test
    void testConstructor() {
        V1PolicyRule policyRule = new V1PolicyRule();
        assertNotNull(policyRule);
    }

    //BaseRock generated method id: ${testApiGroups}, hash: B27AD1BF7C6F79516CA541BEC4AF4582
    @Disabled()
    @Test
    void testApiGroups() {
        V1PolicyRule policyRule = new V1PolicyRule();
        List<String> apiGroups = Arrays.asList("group1", "group2");
        policyRule.setApiGroups(apiGroups);
        assertEquals(apiGroups, policyRule.getApiGroups());
        policyRule.addApiGroupsItem("group3");
        assertThat(policyRule.getApiGroups(), hasSize(3));
        assertThat(policyRule.getApiGroups(), containsInAnyOrder("group1", "group2", "group3"));
    }

    //BaseRock generated method id: ${testNonResourceURLs}, hash: E5EE5D696DFA809B60F1F2D42A371E8B
    @Disabled()
    @Test
    void testNonResourceURLs() {
        V1PolicyRule policyRule = new V1PolicyRule();
        List<String> nonResourceURLs = Arrays.asList("/api", "/healthz");
        policyRule.setNonResourceURLs(nonResourceURLs);
        assertEquals(nonResourceURLs, policyRule.getNonResourceURLs());
        policyRule.addNonResourceURLsItem("/metrics");
        assertThat(policyRule.getNonResourceURLs(), hasSize(3));
        assertThat(policyRule.getNonResourceURLs(), containsInAnyOrder("/api", "/healthz", "/metrics"));
    }

    //BaseRock generated method id: ${testResourceNames}, hash: A3753C95696B3D339779326E7EAD8A19
    @Disabled()
    @Test
    void testResourceNames() {
        V1PolicyRule policyRule = new V1PolicyRule();
        List<String> resourceNames = Arrays.asList("pod1", "pod2");
        policyRule.setResourceNames(resourceNames);
        assertEquals(resourceNames, policyRule.getResourceNames());
        policyRule.addResourceNamesItem("pod3");
        assertThat(policyRule.getResourceNames(), hasSize(3));
        assertThat(policyRule.getResourceNames(), containsInAnyOrder("pod1", "pod2", "pod3"));
    }

    //BaseRock generated method id: ${testResources}, hash: 21A7C4FCC574A3D380F3FEBA42B4527A
    @Disabled()
    @Test
    void testResources() {
        V1PolicyRule policyRule = new V1PolicyRule();
        List<String> resources = Arrays.asList("pods", "services");
        policyRule.setResources(resources);
        assertEquals(resources, policyRule.getResources());
        policyRule.addResourcesItem("configmaps");
        assertThat(policyRule.getResources(), hasSize(3));
        assertThat(policyRule.getResources(), containsInAnyOrder("pods", "services", "configmaps"));
    }

    //BaseRock generated method id: ${testVerbs}, hash: AC87764F266D5A78BC4D9314EA9553F2
    @Disabled()
    @Test
    void testVerbs() {
        V1PolicyRule policyRule = new V1PolicyRule();
        List<String> verbs = Arrays.asList("get", "list");
        policyRule.setVerbs(verbs);
        assertEquals(verbs, policyRule.getVerbs());
        policyRule.addVerbsItem("watch");
        assertThat(policyRule.getVerbs(), hasSize(3));
        assertThat(policyRule.getVerbs(), containsInAnyOrder("get", "list", "watch"));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 9B3F6F344AD266C1FE2E95BA8498F69A
    @Test
    void testEqualsAndHashCode() {
        V1PolicyRule policyRule1 = new V1PolicyRule().apiGroups(Arrays.asList("group1")).nonResourceURLs(Arrays.asList("/api")).resourceNames(Arrays.asList("pod1")).resources(Arrays.asList("pods")).verbs(Arrays.asList("get"));
        V1PolicyRule policyRule2 = new V1PolicyRule().apiGroups(Arrays.asList("group1")).nonResourceURLs(Arrays.asList("/api")).resourceNames(Arrays.asList("pod1")).resources(Arrays.asList("pods")).verbs(Arrays.asList("get"));
        assertEquals(policyRule1, policyRule2);
        assertEquals(policyRule1.hashCode(), policyRule2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: FB26FD71F9F6E353ABBD09C5DDEA23F6
    @Test
    void testToString() {
        V1PolicyRule policyRule = new V1PolicyRule().apiGroups(Arrays.asList("group1")).nonResourceURLs(Arrays.asList("/api")).resourceNames(Arrays.asList("pod1")).resources(Arrays.asList("pods")).verbs(Arrays.asList("get"));
        String toString = policyRule.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("apiGroups"), is(true));
        assertThat(toString.contains("nonResourceURLs"), is(true));
        assertThat(toString.contains("resourceNames"), is(true));
        assertThat(toString.contains("resources"), is(true));
        assertThat(toString.contains("verbs"), is(true));
    }

    //BaseRock generated method id: ${testEmptyLists}, hash: 71C6FBEDD2C10A629BF73F73B76D4CC0
    @Disabled()
    @Test
    void testEmptyLists() {
        V1PolicyRule policyRule = new V1PolicyRule();
        assertThat(policyRule.getApiGroups(), is(nullValue()));
        assertThat(policyRule.getNonResourceURLs(), is(nullValue()));
        assertThat(policyRule.getResourceNames(), is(nullValue()));
        assertThat(policyRule.getResources(), is(nullValue()));
        assertThat(policyRule.getVerbs(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNullLists}, hash: 0A5CAE266373115072B31209E72C141F
    @Test
    void testNullLists() {
        V1PolicyRule policyRule = new V1PolicyRule();
        policyRule.setApiGroups(null);
        policyRule.setNonResourceURLs(null);
        policyRule.setResourceNames(null);
        policyRule.setResources(null);
        policyRule.setVerbs(null);
        assertThat(policyRule.getApiGroups(), is(nullValue()));
        assertThat(policyRule.getNonResourceURLs(), is(nullValue()));
        assertThat(policyRule.getResourceNames(), is(nullValue()));
        assertThat(policyRule.getResources(), is(nullValue()));
        assertThat(policyRule.getVerbs(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAddItemToNullList}, hash: C00E255BE137C5AFE1CDD99135D7AA60
    @Test
    void testAddItemToNullList() {
        V1PolicyRule policyRule = new V1PolicyRule();
        policyRule.setApiGroups(null);
        policyRule.addApiGroupsItem("group1");
        assertThat(policyRule.getApiGroups(), is(notNullValue()));
        assertThat(policyRule.getApiGroups(), hasSize(1));
        assertThat(policyRule.getApiGroups(), containsInAnyOrder("group1"));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 1C97F51CFD52130AFDF6768D8875F1AA
    @Test
    void testBuilderPattern() {
        V1PolicyRule policyRule = new V1PolicyRule().apiGroups(new ArrayList<>()).nonResourceURLs(new ArrayList<>()).resourceNames(new ArrayList<>()).resources(new ArrayList<>()).verbs(new ArrayList<>());
        assertNotNull(policyRule.getApiGroups());
        assertNotNull(policyRule.getNonResourceURLs());
        assertNotNull(policyRule.getResourceNames());
        assertNotNull(policyRule.getResources());
        assertNotNull(policyRule.getVerbs());
    }
}
