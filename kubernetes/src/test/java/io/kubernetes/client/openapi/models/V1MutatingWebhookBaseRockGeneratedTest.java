package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.empty;
import io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig;
import java.util.Arrays;
import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.kubernetes.client.openapi.models.V1MatchCondition;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1RuleWithOperations;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1MutatingWebhookBaseRockGeneratedTest {

    private V1MutatingWebhook v1MutatingWebhook;

    @BeforeEach
    void setUp() {
        v1MutatingWebhook = new V1MutatingWebhook();
    }

    //BaseRock generated method id: ${testAdmissionReviewVersions}, hash: 0DA56C26D19A1DD2F1E0E74A05260817
    @Test
    void testAdmissionReviewVersions() {
        List<String> versions = Arrays.asList("v1", "v1beta1");
        v1MutatingWebhook.setAdmissionReviewVersions(versions);
        assertThat(v1MutatingWebhook.getAdmissionReviewVersions(), is(versions));
    }

    //BaseRock generated method id: ${testClientConfig}, hash: 6A4C7BC0869D5957238FD6DA6F25916A
    @Test
    void testClientConfig() {
        AdmissionregistrationV1WebhookClientConfig clientConfig = mock(AdmissionregistrationV1WebhookClientConfig.class);
        v1MutatingWebhook.setClientConfig(clientConfig);
        assertThat(v1MutatingWebhook.getClientConfig(), is(clientConfig));
    }

    //BaseRock generated method id: ${testFailurePolicy}, hash: 75B625750922ACD75A4A5A054778B9AD
    @Test
    void testFailurePolicy() {
        String failurePolicy = "Ignore";
        v1MutatingWebhook.setFailurePolicy(failurePolicy);
        assertThat(v1MutatingWebhook.getFailurePolicy(), is(failurePolicy));
    }

    //BaseRock generated method id: ${testMatchConditions}, hash: F5407C45A8DF6EC4D159E6C82BA29A6F
    @Test
    void testMatchConditions() {
        List<V1MatchCondition> matchConditions = new ArrayList<>();
        V1MatchCondition condition = mock(V1MatchCondition.class);
        matchConditions.add(condition);
        v1MutatingWebhook.setMatchConditions(matchConditions);
        assertThat(v1MutatingWebhook.getMatchConditions(), is(matchConditions));
    }

    //BaseRock generated method id: ${testMatchPolicy}, hash: A1FB4F507A9917C7E330CC7AA21C7FB0
    @Test
    void testMatchPolicy() {
        String matchPolicy = "Equivalent";
        v1MutatingWebhook.setMatchPolicy(matchPolicy);
        assertThat(v1MutatingWebhook.getMatchPolicy(), is(matchPolicy));
    }

    //BaseRock generated method id: ${testName}, hash: 5EEEC6945A469D7A795817DBCA1FA53B
    @Test
    void testName() {
        String name = "test-webhook";
        v1MutatingWebhook.setName(name);
        assertThat(v1MutatingWebhook.getName(), is(name));
    }

    //BaseRock generated method id: ${testNamespaceSelector}, hash: 86A34EC3E00E547CAE5C0846AB36AF4E
    @Test
    void testNamespaceSelector() {
        V1LabelSelector namespaceSelector = mock(V1LabelSelector.class);
        v1MutatingWebhook.setNamespaceSelector(namespaceSelector);
        assertThat(v1MutatingWebhook.getNamespaceSelector(), is(namespaceSelector));
    }

    //BaseRock generated method id: ${testObjectSelector}, hash: 3AEAFF23C780613BB7569B8209EFAD26
    @Test
    void testObjectSelector() {
        V1LabelSelector objectSelector = mock(V1LabelSelector.class);
        v1MutatingWebhook.setObjectSelector(objectSelector);
        assertThat(v1MutatingWebhook.getObjectSelector(), is(objectSelector));
    }

    //BaseRock generated method id: ${testReinvocationPolicy}, hash: 5FBC3A3D87B4DE5669D63CA78C315B07
    @Test
    void testReinvocationPolicy() {
        String reinvocationPolicy = "Never";
        v1MutatingWebhook.setReinvocationPolicy(reinvocationPolicy);
        assertThat(v1MutatingWebhook.getReinvocationPolicy(), is(reinvocationPolicy));
    }

    //BaseRock generated method id: ${testRules}, hash: D509500DB84486BDCD49F5C1758249B5
    @Test
    void testRules() {
        List<V1RuleWithOperations> rules = new ArrayList<>();
        V1RuleWithOperations rule = mock(V1RuleWithOperations.class);
        rules.add(rule);
        v1MutatingWebhook.setRules(rules);
        assertThat(v1MutatingWebhook.getRules(), is(rules));
    }

    //BaseRock generated method id: ${testSideEffects}, hash: AFA14402E4A2B893B397888E6BE6E41C
    @Test
    void testSideEffects() {
        String sideEffects = "None";
        v1MutatingWebhook.setSideEffects(sideEffects);
        assertThat(v1MutatingWebhook.getSideEffects(), is(sideEffects));
    }

    //BaseRock generated method id: ${testTimeoutSeconds}, hash: F97D99349E3B5C0B59EBFFE6D2639F74
    @Test
    void testTimeoutSeconds() {
        Integer timeoutSeconds = 30;
        v1MutatingWebhook.setTimeoutSeconds(timeoutSeconds);
        assertThat(v1MutatingWebhook.getTimeoutSeconds(), is(timeoutSeconds));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: DDBF9152CFADA927B27FEC271D4825F8
    @Test
    void testEqualsAndHashCode() {
        AdmissionregistrationV1WebhookClientConfig clientConfig = mock(AdmissionregistrationV1WebhookClientConfig.class);
        V1MutatingWebhook webhook1 = new V1MutatingWebhook().admissionReviewVersions(Arrays.asList("v1")).clientConfig(clientConfig).name("test-webhook");
        V1MutatingWebhook webhook2 = new V1MutatingWebhook().admissionReviewVersions(Arrays.asList("v1")).clientConfig(clientConfig).name("test-webhook");
        assertThat(webhook1, is(equalTo(webhook2)));
        assertThat(webhook1.hashCode(), is(equalTo(webhook2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 7DF527D37E9117EEF3573A2405275A06
    @Test
    void testToString() {
        V1MutatingWebhook webhook = new V1MutatingWebhook().admissionReviewVersions(Arrays.asList("v1")).clientConfig(mock(AdmissionregistrationV1WebhookClientConfig.class)).name("test-webhook");
        String toString = webhook.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("admissionReviewVersions"), is(true));
        assertThat(toString.contains("clientConfig"), is(true));
        assertThat(toString.contains("name"), is(true));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 149A1F0C695A019F6E7CCF987B158740
    @Test
    void testBuilderPattern() {
        V1MutatingWebhook webhook = new V1MutatingWebhook().admissionReviewVersions(Arrays.asList("v1")).clientConfig(mock(AdmissionregistrationV1WebhookClientConfig.class)).failurePolicy("Ignore").matchPolicy("Equivalent").name("test-webhook").namespaceSelector(mock(V1LabelSelector.class)).objectSelector(mock(V1LabelSelector.class)).reinvocationPolicy("Never").sideEffects("None").timeoutSeconds(30);
        assertThat(webhook.getAdmissionReviewVersions(), contains("v1"));
        assertThat(webhook.getClientConfig(), notNullValue());
        assertThat(webhook.getFailurePolicy(), is("Ignore"));
        assertThat(webhook.getMatchPolicy(), is("Equivalent"));
        assertThat(webhook.getName(), is("test-webhook"));
        assertThat(webhook.getNamespaceSelector(), notNullValue());
        assertThat(webhook.getObjectSelector(), notNullValue());
        assertThat(webhook.getReinvocationPolicy(), is("Never"));
        assertThat(webhook.getSideEffects(), is("None"));
        assertThat(webhook.getTimeoutSeconds(), is(30));
    }

    //BaseRock generated method id: ${testRequiredFields}, hash: 8A100C55E1A8CEDFDF17BAC49E9D4F0B
    @Test
    void testRequiredFields() {
        V1MutatingWebhook webhook = new V1MutatingWebhook();
        webhook.admissionReviewVersions(Arrays.asList("v1"));
        webhook.clientConfig(mock(AdmissionregistrationV1WebhookClientConfig.class));
        webhook.name("test-webhook");
        webhook.sideEffects("None");
        // Should not throw an exception
        // webhook.validate() method is not available, so we can't test validation
    }

    //BaseRock generated method id: ${testAddMethods}, hash: 168CC65B1260574974B53122D9805DB0
    @Test
    void testAddMethods() {
        V1MutatingWebhook webhook = new V1MutatingWebhook();
        webhook.addAdmissionReviewVersionsItem("v1");
        assertThat(webhook.getAdmissionReviewVersions(), contains("v1"));
        V1MatchCondition matchCondition = mock(V1MatchCondition.class);
        webhook.addMatchConditionsItem(matchCondition);
        assertThat(webhook.getMatchConditions(), contains(matchCondition));
        V1RuleWithOperations rule = mock(V1RuleWithOperations.class);
        webhook.addRulesItem(rule);
        assertThat(webhook.getRules(), contains(rule));
    }

    //BaseRock generated method id: ${testNullFields}, hash: 87E47722662A4E3B290EFA15346F9A01
    @Test
    void testNullFields() {
        V1MutatingWebhook webhook = new V1MutatingWebhook();
        assertThat(webhook.getFailurePolicy(), nullValue());
        assertThat(webhook.getMatchPolicy(), nullValue());
        assertThat(webhook.getNamespaceSelector(), nullValue());
        assertThat(webhook.getObjectSelector(), nullValue());
        assertThat(webhook.getReinvocationPolicy(), nullValue());
        assertThat(webhook.getTimeoutSeconds(), nullValue());
    }

    //BaseRock generated method id: ${testEmptyLists}, hash: A395BD6CD1192056534B3291D7F66477
    @Test
    void testEmptyLists() {
        V1MutatingWebhook webhook = new V1MutatingWebhook();
        assertThat(webhook.getAdmissionReviewVersions(), is(empty()));
        assertThat(webhook.getMatchConditions(), is(empty()));
        assertThat(webhook.getRules(), is(empty()));
    }

    //BaseRock generated method id: ${testListModification}, hash: B6A82F3C803197DAE4C41ED15C48AA43
    @Test
    void testListModification() {
        V1MutatingWebhook webhook = new V1MutatingWebhook();
        List<String> versions = new ArrayList<>(Arrays.asList("v1", "v2"));
        webhook.setAdmissionReviewVersions(versions);
        assertThat(webhook.getAdmissionReviewVersions(), hasSize(2));
        List<V1MatchCondition> conditions = new ArrayList<>();
        conditions.add(mock(V1MatchCondition.class));
        webhook.setMatchConditions(conditions);
        assertThat(webhook.getMatchConditions(), hasSize(1));
        List<V1RuleWithOperations> rules = new ArrayList<>();
        rules.add(mock(V1RuleWithOperations.class));
        webhook.setRules(rules);
        assertThat(webhook.getRules(), hasSize(1));
    }
}
