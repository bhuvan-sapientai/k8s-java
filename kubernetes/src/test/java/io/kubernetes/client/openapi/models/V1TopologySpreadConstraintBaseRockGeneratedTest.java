package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.io.IOException;
import java.util.Arrays;
import io.kubernetes.client.openapi.models.V1LabelSelector;
import java.util.List;
import io.kubernetes.client.openapi.models.V1TopologySpreadConstraint;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import com.google.gson.JsonPrimitive;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonArray;
import org.junit.jupiter.params.provider.NullSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1TopologySpreadConstraintBaseRockGeneratedTest {

    //BaseRock generated method id: ${testDefaultConstructor}, hash: 37CCB5B9BEC75855DFEEE66C92478411
    @Test
    void testDefaultConstructor() {
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint();
        assertNotNull(constraint);
        assertThat(constraint.getLabelSelector(), is(nullValue()));
        assertThat(constraint.getMatchLabelKeys(), notNullValue());
        assertThat(constraint.getMatchLabelKeys(), hasSize(0));
        assertThat(constraint.getMaxSkew(), is(nullValue()));
        assertThat(constraint.getMinDomains(), is(nullValue()));
        assertThat(constraint.getNodeAffinityPolicy(), is(nullValue()));
        assertThat(constraint.getNodeTaintsPolicy(), is(nullValue()));
        assertThat(constraint.getTopologyKey(), is(nullValue()));
        assertThat(constraint.getWhenUnsatisfiable(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetLabelSelector}, hash: 6B62762C081093AF6FDC2D6FE02685B6
    @Test
    void testSetAndGetLabelSelector() {
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint();
        V1LabelSelector labelSelector = new V1LabelSelector();
        constraint.setLabelSelector(labelSelector);
        assertThat(constraint.getLabelSelector(), is(equalTo(labelSelector)));
    }

    //BaseRock generated method id: ${testLabelSelectorFluentSetter}, hash: 869391BAE93440DA47F3EC9589259AC2
    @Test
    void testLabelSelectorFluentSetter() {
        V1LabelSelector labelSelector = new V1LabelSelector();
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint().labelSelector(labelSelector);
        assertThat(constraint.getLabelSelector(), is(equalTo(labelSelector)));
    }

    //BaseRock generated method id: ${testSetAndGetMatchLabelKeys}, hash: 8897B361C2F5F5564C0ADB7AF4C2630A
    @Test
    void testSetAndGetMatchLabelKeys() {
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint();
        List<String> matchLabelKeys = Arrays.asList("app", "environment");
        constraint.setMatchLabelKeys(matchLabelKeys);
        assertThat(constraint.getMatchLabelKeys(), is(equalTo(matchLabelKeys)));
    }

    //BaseRock generated method id: ${testMatchLabelKeysFluentSetter}, hash: 2C03715929695490DB839DDAD217BD03
    @Test
    void testMatchLabelKeysFluentSetter() {
        List<String> matchLabelKeys = Arrays.asList("app", "environment");
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint().matchLabelKeys(matchLabelKeys);
        assertThat(constraint.getMatchLabelKeys(), is(equalTo(matchLabelKeys)));
    }

    //BaseRock generated method id: ${testAddMatchLabelKeysItem}, hash: 6BDE3F5FE1A4C5B2483688A6C84963B8
    @Test
    void testAddMatchLabelKeysItem() {
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint();
        constraint.addMatchLabelKeysItem("app");
        constraint.addMatchLabelKeysItem("environment");
        assertThat(constraint.getMatchLabelKeys(), hasSize(2));
        assertThat(constraint.getMatchLabelKeys().get(0), is(equalTo("app")));
        assertThat(constraint.getMatchLabelKeys().get(1), is(equalTo("environment")));
    }

    //BaseRock generated method id: ${testAddMatchLabelKeysItemWhenNull}, hash: 86DF976EDA2D3973CB6BF87A032174E5
    @Test
    void testAddMatchLabelKeysItemWhenNull() {
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint();
        constraint.setMatchLabelKeys(null);
        constraint.addMatchLabelKeysItem("app");
        assertThat(constraint.getMatchLabelKeys(), hasSize(1));
        assertThat(constraint.getMatchLabelKeys().get(0), is(equalTo("app")));
    }

    //BaseRock generated method id: ${testSetAndGetMaxSkew}, hash: 50E5C1E8063CCBBD427A65360183A9C4
    @Test
    void testSetAndGetMaxSkew() {
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint();
        Integer maxSkew = 2;
        constraint.setMaxSkew(maxSkew);
        assertThat(constraint.getMaxSkew(), is(equalTo(maxSkew)));
    }

    //BaseRock generated method id: ${testMaxSkewFluentSetter}, hash: E59EC3D52FA3F4AF7B1DA96E025FD9E5
    @Test
    void testMaxSkewFluentSetter() {
        Integer maxSkew = 2;
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint().maxSkew(maxSkew);
        assertThat(constraint.getMaxSkew(), is(equalTo(maxSkew)));
    }

    //BaseRock generated method id: ${testSetAndGetMinDomains}, hash: DCA80D838AFF81E06DB8C360F8C24230
    @Test
    void testSetAndGetMinDomains() {
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint();
        Integer minDomains = 3;
        constraint.setMinDomains(minDomains);
        assertThat(constraint.getMinDomains(), is(equalTo(minDomains)));
    }

    //BaseRock generated method id: ${testMinDomainsFluentSetter}, hash: C22AF9D436E91621B1B2C55475C23FE5
    @Test
    void testMinDomainsFluentSetter() {
        Integer minDomains = 3;
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint().minDomains(minDomains);
        assertThat(constraint.getMinDomains(), is(equalTo(minDomains)));
    }

    //BaseRock generated method id: ${testSetAndGetNodeAffinityPolicy}, hash: DBBAC95F23631FA383021DC5C8C3B498
    @Test
    void testSetAndGetNodeAffinityPolicy() {
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint();
        String nodeAffinityPolicy = "Honor";
        constraint.setNodeAffinityPolicy(nodeAffinityPolicy);
        assertThat(constraint.getNodeAffinityPolicy(), is(equalTo(nodeAffinityPolicy)));
    }

    //BaseRock generated method id: ${testNodeAffinityPolicyFluentSetter}, hash: 98F1535FAA8A0288BDBBF6759DBA38EA
    @Test
    void testNodeAffinityPolicyFluentSetter() {
        String nodeAffinityPolicy = "Honor";
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint().nodeAffinityPolicy(nodeAffinityPolicy);
        assertThat(constraint.getNodeAffinityPolicy(), is(equalTo(nodeAffinityPolicy)));
    }

    //BaseRock generated method id: ${testSetAndGetNodeTaintsPolicy}, hash: 2CDC6206AC89D16F3008BDD154579749
    @Test
    void testSetAndGetNodeTaintsPolicy() {
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint();
        String nodeTaintsPolicy = "Ignore";
        constraint.setNodeTaintsPolicy(nodeTaintsPolicy);
        assertThat(constraint.getNodeTaintsPolicy(), is(equalTo(nodeTaintsPolicy)));
    }

    //BaseRock generated method id: ${testNodeTaintsPolicyFluentSetter}, hash: B4FFCF9DDA39FC319C0D54EA08397DE6
    @Test
    void testNodeTaintsPolicyFluentSetter() {
        String nodeTaintsPolicy = "Ignore";
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint().nodeTaintsPolicy(nodeTaintsPolicy);
        assertThat(constraint.getNodeTaintsPolicy(), is(equalTo(nodeTaintsPolicy)));
    }

    //BaseRock generated method id: ${testSetAndGetTopologyKey}, hash: D9FBB38B8328B81603551746C676400E
    @Test
    void testSetAndGetTopologyKey() {
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint();
        String topologyKey = "kubernetes.io/hostname";
        constraint.setTopologyKey(topologyKey);
        assertThat(constraint.getTopologyKey(), is(equalTo(topologyKey)));
    }

    //BaseRock generated method id: ${testTopologyKeyFluentSetter}, hash: 6C5B5D4851625F5357C1E116903EA29D
    @Test
    void testTopologyKeyFluentSetter() {
        String topologyKey = "kubernetes.io/hostname";
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint().topologyKey(topologyKey);
        assertThat(constraint.getTopologyKey(), is(equalTo(topologyKey)));
    }

    //BaseRock generated method id: ${testSetAndGetWhenUnsatisfiable}, hash: F8463C8657ED91DD2AF7BFF665C1AF9A
    @Test
    void testSetAndGetWhenUnsatisfiable() {
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint();
        String whenUnsatisfiable = "DoNotSchedule";
        constraint.setWhenUnsatisfiable(whenUnsatisfiable);
        assertThat(constraint.getWhenUnsatisfiable(), is(equalTo(whenUnsatisfiable)));
    }

    //BaseRock generated method id: ${testWhenUnsatisfiableFluentSetter}, hash: 154780E3803B965CFB6E2ABC53F9812A
    @Test
    void testWhenUnsatisfiableFluentSetter() {
        String whenUnsatisfiable = "DoNotSchedule";
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint().whenUnsatisfiable(whenUnsatisfiable);
        assertThat(constraint.getWhenUnsatisfiable(), is(equalTo(whenUnsatisfiable)));
    }

    //BaseRock generated method id: ${testToString}, hash: BBD8AA3423E5D5437F9B15A3FA585B16
    @Test
    void testToString() {
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint().labelSelector(new V1LabelSelector()).maxSkew(1).topologyKey("kubernetes.io/hostname").whenUnsatisfiable("DoNotSchedule");
        String result = constraint.toString();
        assertNotNull(result);
        assertTrue(result.contains("labelSelector"));
        assertTrue(result.contains("maxSkew"));
        assertTrue(result.contains("topologyKey"));
        assertTrue(result.contains("whenUnsatisfiable"));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 4D398A063E3B90C9B321950A19846A50
    @Test
    void testEqualsWithSameObject() {
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint().labelSelector(new V1LabelSelector()).maxSkew(1).topologyKey("kubernetes.io/hostname").whenUnsatisfiable("DoNotSchedule");
        assertEquals(constraint, constraint);
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 4548F59EB6C18D462AF0A38A4CAF0665
    @Test
    void testEqualsWithDifferentClass() {
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint();
        assertNotEquals(constraint, new Object());
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: 5295E0FCE39840F1252BD82D0C4F743A
    @Test
    void testEqualsWithNull() {
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint();
        assertNotEquals(constraint, null);
    }

    //BaseRock generated method id: ${testEqualsWithEquivalentObjects}, hash: 646F68E25EBCDAF3D9D585429733168A
    @Test
    void testEqualsWithEquivalentObjects() {
        V1LabelSelector labelSelector1 = new V1LabelSelector();
        V1LabelSelector labelSelector2 = new V1LabelSelector();
        V1TopologySpreadConstraint constraint1 = new V1TopologySpreadConstraint().labelSelector(labelSelector1).maxSkew(1).topologyKey("kubernetes.io/hostname").whenUnsatisfiable("DoNotSchedule");
        V1TopologySpreadConstraint constraint2 = new V1TopologySpreadConstraint().labelSelector(labelSelector2).maxSkew(1).topologyKey("kubernetes.io/hostname").whenUnsatisfiable("DoNotSchedule");
        assertEquals(constraint1, constraint2);
        assertEquals(constraint1.hashCode(), constraint2.hashCode());
    }

    //BaseRock generated method id: ${testEqualsWithDifferentLabelSelector}, hash: A722532DDFD1D32F4D95051A974BB149
    @Test
    void testEqualsWithDifferentLabelSelector() {
        V1TopologySpreadConstraint constraint1 = new V1TopologySpreadConstraint().labelSelector(new V1LabelSelector()).maxSkew(1).topologyKey("kubernetes.io/hostname").whenUnsatisfiable("DoNotSchedule");
        V1TopologySpreadConstraint constraint2 = new V1TopologySpreadConstraint().maxSkew(1).topologyKey("kubernetes.io/hostname").whenUnsatisfiable("DoNotSchedule");
        assertNotEquals(constraint1, constraint2);
        assertNotEquals(constraint1.hashCode(), constraint2.hashCode());
    }

    //BaseRock generated method id: ${testEqualsWithDifferentMatchLabelKeys}, hash: ACCC6B7FEE9D89A9F2D11825A0E5EC3B
    @Test
    void testEqualsWithDifferentMatchLabelKeys() {
        List<String> keys1 = new ArrayList<>();
        keys1.add("app");
        List<String> keys2 = new ArrayList<>();
        keys2.add("environment");
        V1TopologySpreadConstraint constraint1 = new V1TopologySpreadConstraint().matchLabelKeys(keys1).maxSkew(1).topologyKey("kubernetes.io/hostname").whenUnsatisfiable("DoNotSchedule");
        V1TopologySpreadConstraint constraint2 = new V1TopologySpreadConstraint().matchLabelKeys(keys2).maxSkew(1).topologyKey("kubernetes.io/hostname").whenUnsatisfiable("DoNotSchedule");
        assertNotEquals(constraint1, constraint2);
        assertNotEquals(constraint1.hashCode(), constraint2.hashCode());
    }

    //BaseRock generated method id: ${testEqualsWithDifferentMaxSkew}, hash: 32BE750B5EC5E47A8155070A7E289153
    @Test
    void testEqualsWithDifferentMaxSkew() {
        V1TopologySpreadConstraint constraint1 = new V1TopologySpreadConstraint().maxSkew(1).topologyKey("kubernetes.io/hostname").whenUnsatisfiable("DoNotSchedule");
        V1TopologySpreadConstraint constraint2 = new V1TopologySpreadConstraint().maxSkew(2).topologyKey("kubernetes.io/hostname").whenUnsatisfiable("DoNotSchedule");
        assertNotEquals(constraint1, constraint2);
        assertNotEquals(constraint1.hashCode(), constraint2.hashCode());
    }

    //BaseRock generated method id: ${testEqualsWithDifferentMinDomains}, hash: F22A9AB4BF6D6FFB6C83FFE60462CFBD
    @Test
    void testEqualsWithDifferentMinDomains() {
        V1TopologySpreadConstraint constraint1 = new V1TopologySpreadConstraint().maxSkew(1).minDomains(2).topologyKey("kubernetes.io/hostname").whenUnsatisfiable("DoNotSchedule");
        V1TopologySpreadConstraint constraint2 = new V1TopologySpreadConstraint().maxSkew(1).minDomains(3).topologyKey("kubernetes.io/hostname").whenUnsatisfiable("DoNotSchedule");
        assertNotEquals(constraint1, constraint2);
        assertNotEquals(constraint1.hashCode(), constraint2.hashCode());
    }

    //BaseRock generated method id: ${testEqualsWithDifferentNodeAffinityPolicy}, hash: 59742A319CFC734B8AB8777D9F90DCE6
    @Test
    void testEqualsWithDifferentNodeAffinityPolicy() {
        V1TopologySpreadConstraint constraint1 = new V1TopologySpreadConstraint().maxSkew(1).nodeAffinityPolicy("Honor").topologyKey("kubernetes.io/hostname").whenUnsatisfiable("DoNotSchedule");
        V1TopologySpreadConstraint constraint2 = new V1TopologySpreadConstraint().maxSkew(1).nodeAffinityPolicy("Ignore").topologyKey("kubernetes.io/hostname").whenUnsatisfiable("DoNotSchedule");
        assertNotEquals(constraint1, constraint2);
        assertNotEquals(constraint1.hashCode(), constraint2.hashCode());
    }

    //BaseRock generated method id: ${testEqualsWithDifferentNodeTaintsPolicy}, hash: F7A8C44BEBCEA4004E64FD7E5E944B23
    @Test
    void testEqualsWithDifferentNodeTaintsPolicy() {
        V1TopologySpreadConstraint constraint1 = new V1TopologySpreadConstraint().maxSkew(1).nodeTaintsPolicy("Honor").topologyKey("kubernetes.io/hostname").whenUnsatisfiable("DoNotSchedule");
        V1TopologySpreadConstraint constraint2 = new V1TopologySpreadConstraint().maxSkew(1).nodeTaintsPolicy("Ignore").topologyKey("kubernetes.io/hostname").whenUnsatisfiable("DoNotSchedule");
        assertNotEquals(constraint1, constraint2);
        assertNotEquals(constraint1.hashCode(), constraint2.hashCode());
    }

    //BaseRock generated method id: ${testEqualsWithDifferentTopologyKey}, hash: B4450A5A742070AB9DCD50A31A37EE9F
    @Test
    void testEqualsWithDifferentTopologyKey() {
        V1TopologySpreadConstraint constraint1 = new V1TopologySpreadConstraint().maxSkew(1).topologyKey("kubernetes.io/hostname").whenUnsatisfiable("DoNotSchedule");
        V1TopologySpreadConstraint constraint2 = new V1TopologySpreadConstraint().maxSkew(1).topologyKey("topology.kubernetes.io/zone").whenUnsatisfiable("DoNotSchedule");
        assertNotEquals(constraint1, constraint2);
        assertNotEquals(constraint1.hashCode(), constraint2.hashCode());
    }

    //BaseRock generated method id: ${testEqualsWithDifferentWhenUnsatisfiable}, hash: 8130895C4248C0AD3574BEAFA9039CEF
    @Test
    void testEqualsWithDifferentWhenUnsatisfiable() {
        V1TopologySpreadConstraint constraint1 = new V1TopologySpreadConstraint().maxSkew(1).topologyKey("kubernetes.io/hostname").whenUnsatisfiable("DoNotSchedule");
        V1TopologySpreadConstraint constraint2 = new V1TopologySpreadConstraint().maxSkew(1).topologyKey("kubernetes.io/hostname").whenUnsatisfiable("ScheduleAnyway");
        assertNotEquals(constraint1, constraint2);
        assertNotEquals(constraint1.hashCode(), constraint2.hashCode());
    }

    //BaseRock generated method id: ${testHashCodeConsistency}, hash: B7C86AA29479DA229D5B62293A350291
    @Test
    void testHashCodeConsistency() {
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint().labelSelector(new V1LabelSelector()).maxSkew(1).topologyKey("kubernetes.io/hostname").whenUnsatisfiable("DoNotSchedule");
        int hashCode1 = constraint.hashCode();
        int hashCode2 = constraint.hashCode();
        assertEquals(hashCode1, hashCode2);
    }

    //BaseRock generated method id: ${testCompleteFluentApi}, hash: 97558AD1A9742D1A0D8BB66AC650EDD3
    @Test
    void testCompleteFluentApi() {
        V1LabelSelector labelSelector = new V1LabelSelector();
        List<String> matchLabelKeys = Arrays.asList("app", "environment");
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint().labelSelector(labelSelector).matchLabelKeys(matchLabelKeys).maxSkew(1).minDomains(3).nodeAffinityPolicy("Honor").nodeTaintsPolicy("Ignore").topologyKey("kubernetes.io/hostname").whenUnsatisfiable("DoNotSchedule");
        assertThat(constraint.getLabelSelector(), is(equalTo(labelSelector)));
        assertThat(constraint.getMatchLabelKeys(), is(equalTo(matchLabelKeys)));
        assertThat(constraint.getMaxSkew(), is(equalTo(1)));
        assertThat(constraint.getMinDomains(), is(equalTo(3)));
        assertThat(constraint.getNodeAffinityPolicy(), is(equalTo("Honor")));
        assertThat(constraint.getNodeTaintsPolicy(), is(equalTo("Ignore")));
        assertThat(constraint.getTopologyKey(), is(equalTo("kubernetes.io/hostname")));
        assertThat(constraint.getWhenUnsatisfiable(), is(equalTo("DoNotSchedule")));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 21EAA6ED806E16D836E624570ADA2527
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("maxSkew", 1);
        jsonObject.addProperty("topologyKey", "kubernetes.io/hostname");
        jsonObject.addProperty("whenUnsatisfiable", "DoNotSchedule");
        // This should not throw an exception
        V1TopologySpreadConstraint.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testValidateJsonElementWithLabelSelector}, hash: 8B0EB34C4836C7E5D77C86EE96AF2AA7
    @Test
    void testValidateJsonElementWithLabelSelector() throws IOException {
        JsonObject labelSelectorObject = new JsonObject();
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("labelSelector", labelSelectorObject);
        jsonObject.addProperty("maxSkew", 1);
        jsonObject.addProperty("topologyKey", "kubernetes.io/hostname");
        jsonObject.addProperty("whenUnsatisfiable", "DoNotSchedule");
        // This should not throw an exception
        V1TopologySpreadConstraint.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testValidateJsonElementWithMatchLabelKeys}, hash: 02CCEC7BAD44F8DD3A5DDA27BF4A7655
    @Test
    void testValidateJsonElementWithMatchLabelKeys() throws IOException {
        JsonArray matchLabelKeysArray = new JsonArray();
        matchLabelKeysArray.add("app");
        matchLabelKeysArray.add("environment");
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("matchLabelKeys", matchLabelKeysArray);
        jsonObject.addProperty("maxSkew", 1);
        jsonObject.addProperty("topologyKey", "kubernetes.io/hostname");
        jsonObject.addProperty("whenUnsatisfiable", "DoNotSchedule");
        // This should not throw an exception
        V1TopologySpreadConstraint.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testToJson}, hash: C0276EAE0E74AB5FC0BC40A59A4B3DD7
    @Test
    void testToJson() {
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint().labelSelector(new V1LabelSelector()).maxSkew(1).topologyKey("kubernetes.io/hostname").whenUnsatisfiable("DoNotSchedule");
        String json = constraint.toJson();
        assertNotNull(json);
        assertTrue(json.contains("labelSelector"));
        assertTrue(json.contains("maxSkew"));
        assertTrue(json.contains("topologyKey"));
        assertTrue(json.contains("whenUnsatisfiable"));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 961CD8285DD72A9ECBF8D5CC0CD53DC7
    @Test
    void testFromJson() throws IOException {
        String json = "{\"labelSelector\":{},\"maxSkew\":1,\"topologyKey\":\"kubernetes.io/hostname\",\"whenUnsatisfiable\":\"DoNotSchedule\"}";
        V1TopologySpreadConstraint constraint = V1TopologySpreadConstraint.fromJson(json);
        assertNotNull(constraint);
        assertNotNull(constraint.getLabelSelector());
        assertEquals(Integer.valueOf(1), constraint.getMaxSkew());
        assertEquals("kubernetes.io/hostname", constraint.getTopologyKey());
        assertEquals("DoNotSchedule", constraint.getWhenUnsatisfiable());
    }

    //BaseRock generated method id: ${testNullLabelSelector}, hash: B6D50AAC71E82EB744E906DCC24EBA9B
    @ParameterizedTest
    @NullSource
    void testNullLabelSelector(V1LabelSelector labelSelector) {
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint();
        constraint.setLabelSelector(labelSelector);
        assertThat(constraint.getLabelSelector(), is(nullValue()));
    }

    //BaseRock generated method id: ${testCustomToIndentedString}, hash: 5A39F4F74D461390744C52ED1B3A7146
    @Test
    void testCustomToIndentedString() {
        V1TopologySpreadConstraint constraint = new V1TopologySpreadConstraint().maxSkew(1).topologyKey("kubernetes.io/hostname").whenUnsatisfiable("DoNotSchedule");
        // Access private method through public toString which uses it
        String result = constraint.toString();
        assertNotNull(result);
        assertTrue(result.contains("maxSkew: 1"));
        assertTrue(result.contains("topologyKey: kubernetes.io/hostname"));
        assertTrue(result.contains("whenUnsatisfiable: DoNotSchedule"));
    }
}
