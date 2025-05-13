package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import static org.mockito.Mockito.*;
import io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig;
import java.io.IOException;
import java.util.Arrays;
import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.kubernetes.client.openapi.models.V1MatchCondition;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1RuleWithOperations;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonArray;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ValidatingWebhookBaseRockGeneratedTest {

    @Mock
    private AdmissionregistrationV1WebhookClientConfig mockClientConfig;

    @Mock
    private V1LabelSelector mockNamespaceSelector;

    @Mock
    private V1LabelSelector mockObjectSelector;

    private V1ValidatingWebhook validatingWebhook;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        validatingWebhook = new V1ValidatingWebhook();
    }

    //BaseRock generated method id: ${testConstructor}, hash: E34D45185B3536A6BC599FF19CB1A182
    @Test
    void testConstructor() {
        assertNotNull(validatingWebhook);
        assertNotNull(validatingWebhook.getAdmissionReviewVersions());
        assertTrue(validatingWebhook.getAdmissionReviewVersions().isEmpty());
        assertNotNull(validatingWebhook.getMatchConditions());
        assertTrue(validatingWebhook.getMatchConditions().isEmpty());
        assertNotNull(validatingWebhook.getRules());
        assertTrue(validatingWebhook.getRules().isEmpty());
    }

    //BaseRock generated method id: ${testAdmissionReviewVersions}, hash: C7A003C724B828C1A1CD646549CBD30D
    @Test
    void testAdmissionReviewVersions() {
        List<String> versions = Arrays.asList("v1", "v1beta1");
        validatingWebhook.setAdmissionReviewVersions(versions);
        assertEquals(versions, validatingWebhook.getAdmissionReviewVersions());
    }

    //BaseRock generated method id: ${testAddAdmissionReviewVersionsItem}, hash: 08207009D9A7772365FA762AA20D481E
    @Test
    void testAddAdmissionReviewVersionsItem() {
        String version = "v1";
        validatingWebhook.addAdmissionReviewVersionsItem(version);
        assertTrue(validatingWebhook.getAdmissionReviewVersions().contains(version));
    }

    //BaseRock generated method id: ${testClientConfig}, hash: 62A9A88090B3F8AC2152D093034D65D6
    @Test
    void testClientConfig() {
        validatingWebhook.setClientConfig(mockClientConfig);
        assertEquals(mockClientConfig, validatingWebhook.getClientConfig());
    }

    //BaseRock generated method id: ${testFailurePolicy}, hash: 803BF94387F29FCCFFE04D83F0A6BA63
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Ignore", "Fail" })
    void testFailurePolicy(String failurePolicy) {
        validatingWebhook.setFailurePolicy(failurePolicy);
        assertEquals(failurePolicy, validatingWebhook.getFailurePolicy());
    }

    //BaseRock generated method id: ${testMatchConditions}, hash: A9292D8DF64591660FCAC5F229416F4D
    @Test
    void testMatchConditions() {
        List<V1MatchCondition> conditions = new ArrayList<>();
        conditions.add(new V1MatchCondition());
        validatingWebhook.setMatchConditions(conditions);
        assertEquals(conditions, validatingWebhook.getMatchConditions());
    }

    //BaseRock generated method id: ${testAddMatchConditionsItem}, hash: BF916F30B06C748A4FBF0BAF9FC549F8
    @Test
    void testAddMatchConditionsItem() {
        V1MatchCondition condition = new V1MatchCondition();
        validatingWebhook.addMatchConditionsItem(condition);
        assertTrue(validatingWebhook.getMatchConditions().contains(condition));
    }

    //BaseRock generated method id: ${testMatchPolicy}, hash: 85E1DF26795C74BE8C348DE6DF96D4AE
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Exact", "Equivalent" })
    void testMatchPolicy(String matchPolicy) {
        validatingWebhook.setMatchPolicy(matchPolicy);
        assertEquals(matchPolicy, validatingWebhook.getMatchPolicy());
    }

    //BaseRock generated method id: ${testName}, hash: B4873E55129B21DC5F7E90AF4AC28E29
    @Test
    void testName() {
        String name = "test-webhook";
        validatingWebhook.setName(name);
        assertEquals(name, validatingWebhook.getName());
    }

    //BaseRock generated method id: ${testNamespaceSelector}, hash: ADB5F48AF84DDBC287D62A6FA8531820
    @Test
    void testNamespaceSelector() {
        validatingWebhook.setNamespaceSelector(mockNamespaceSelector);
        assertEquals(mockNamespaceSelector, validatingWebhook.getNamespaceSelector());
    }

    //BaseRock generated method id: ${testObjectSelector}, hash: 92B1E064D310A5C3E90B6F8F8B6B9B3B
    @Test
    void testObjectSelector() {
        validatingWebhook.setObjectSelector(mockObjectSelector);
        assertEquals(mockObjectSelector, validatingWebhook.getObjectSelector());
    }

    //BaseRock generated method id: ${testRules}, hash: FCD128E4675EC8CC7B408DFF0BCA311C
    @Test
    void testRules() {
        List<V1RuleWithOperations> rules = new ArrayList<>();
        rules.add(new V1RuleWithOperations());
        validatingWebhook.setRules(rules);
        assertEquals(rules, validatingWebhook.getRules());
    }

    //BaseRock generated method id: ${testAddRulesItem}, hash: 2F9FF7F7C324DB7461B03770A0DDD9F2
    @Test
    void testAddRulesItem() {
        V1RuleWithOperations rule = new V1RuleWithOperations();
        validatingWebhook.addRulesItem(rule);
        assertTrue(validatingWebhook.getRules().contains(rule));
    }

    //BaseRock generated method id: ${testSideEffects}, hash: 490F11E47BE45EA2821521CCAA607249
    @ParameterizedTest
    @ValueSource(strings = { "None", "NoneOnDryRun" })
    void testSideEffects(String sideEffects) {
        validatingWebhook.setSideEffects(sideEffects);
        assertEquals(sideEffects, validatingWebhook.getSideEffects());
    }

    //BaseRock generated method id: ${testTimeoutSeconds}, hash: BB11B7265195ACDF844D6AD1ADF10556
    @ParameterizedTest
    @ValueSource(ints = { 1, 10, 30 })
    void testTimeoutSeconds(int timeoutSeconds) {
        validatingWebhook.setTimeoutSeconds(timeoutSeconds);
        assertEquals(timeoutSeconds, validatingWebhook.getTimeoutSeconds());
    }

    //BaseRock generated method id: ${testEquals}, hash: 9F8DC86627C580759A96EC04262DA21B
    @Test
    void testEquals() {
        V1ValidatingWebhook webhook1 = new V1ValidatingWebhook().name("webhook1").sideEffects("None");
        V1ValidatingWebhook webhook2 = new V1ValidatingWebhook().name("webhook1").sideEffects("None");
        V1ValidatingWebhook webhook3 = new V1ValidatingWebhook().name("webhook2").sideEffects("NoneOnDryRun");
        assertEquals(webhook1, webhook2);
        assertNotEquals(webhook1, webhook3);
    }

    //BaseRock generated method id: ${testHashCode}, hash: B03FCE190520B497CDBBB911CE1BCE9B
    @Test
    void testHashCode() {
        V1ValidatingWebhook webhook1 = new V1ValidatingWebhook().name("webhook1").sideEffects("None");
        V1ValidatingWebhook webhook2 = new V1ValidatingWebhook().name("webhook1").sideEffects("None");
        assertEquals(webhook1.hashCode(), webhook2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: CD46A1F91046E622390080D13C3C4A67
    @Test
    void testToString() {
        V1ValidatingWebhook webhook = new V1ValidatingWebhook().name("test-webhook").sideEffects("None");
        String expected = "class V1ValidatingWebhook {\n" + "    admissionReviewVersions: []\n" + "    clientConfig: null\n" + "    failurePolicy: null\n" + "    matchConditions: []\n" + "    matchPolicy: null\n" + "    name: test-webhook\n" + "    namespaceSelector: null\n" + "    objectSelector: null\n" + "    rules: []\n" + "    sideEffects: None\n" + "    timeoutSeconds: null\n" + "}";
        assertEquals(expected, webhook.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 6FCC0C4F9387A54CFF00D135834AB8CB
    @Test
    void testValidateJsonElement() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "test-webhook");
        jsonObject.addProperty("sideEffects", "None");
        JsonArray admissionReviewVersions = new JsonArray();
        admissionReviewVersions.add("v1");
        jsonObject.add("admissionReviewVersions", admissionReviewVersions);
        jsonObject.add("clientConfig", new JsonObject());
        assertDoesNotThrow(() -> V1ValidatingWebhook.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementMissingRequiredFields}, hash: FEE2E7CD0CD5C8F3BC14ECEED018D8C4
    @Test
    void testValidateJsonElementMissingRequiredFields() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "test-webhook");
        assertThrows(IllegalArgumentException.class, () -> V1ValidatingWebhook.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementInvalidField}, hash: D5C008D678DF830D690E9EC8EAE3AEF3
    @Test
    void testValidateJsonElementInvalidField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "test-webhook");
        jsonObject.addProperty("sideEffects", "None");
        JsonArray admissionReviewVersions = new JsonArray();
        admissionReviewVersions.add("v1");
        jsonObject.add("admissionReviewVersions", admissionReviewVersions);
        jsonObject.add("clientConfig", new JsonObject());
        jsonObject.addProperty("invalidField", "value");
        assertThrows(IllegalArgumentException.class, () -> V1ValidatingWebhook.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 37C627D50D34AA36CA743C6E8BC51C1E
    @Test
    void testFromJson() throws IOException {
        String json = "{\"name\":\"test-webhook\",\"sideEffects\":\"None\",\"admissionReviewVersions\":[\"v1\"],\"clientConfig\":{}}";
        V1ValidatingWebhook webhook = V1ValidatingWebhook.fromJson(json);
        assertNotNull(webhook);
        assertEquals("test-webhook", webhook.getName());
        assertEquals("None", webhook.getSideEffects());
        assertEquals(1, webhook.getAdmissionReviewVersions().size());
        assertEquals("v1", webhook.getAdmissionReviewVersions().get(0));
        assertNotNull(webhook.getClientConfig());
    }

    //BaseRock generated method id: ${testToJson}, hash: AE288C461F4776BF99EEBD40DEAC89B2
    @Test
    void testToJson() {
        V1ValidatingWebhook webhook = new V1ValidatingWebhook().name("test-webhook").sideEffects("None").addAdmissionReviewVersionsItem("v1").clientConfig(new AdmissionregistrationV1WebhookClientConfig());
        String json = webhook.toJson();
        assertNotNull(json);
        assertTrue(json.contains("\"name\":\"test-webhook\""));
        assertTrue(json.contains("\"sideEffects\":\"None\""));
        assertTrue(json.contains("\"admissionReviewVersions\":[\"v1\"]"));
        assertTrue(json.contains("\"clientConfig\":{}"));
    }
}
