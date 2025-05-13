package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import io.kubernetes.client.openapi.models.V1PodFailurePolicy;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import io.kubernetes.client.openapi.models.V1PodFailurePolicyRule;
import java.util.ArrayList;
import com.google.gson.JsonElement;
import static org.hamcrest.Matchers.containsInAnyOrder;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PodFailurePolicyBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1PodFailurePolicyConstructor}, hash: 9EC19D52FC7AD47273817F9A2D947629
    @Test
    void testV1PodFailurePolicyConstructor() {
        V1PodFailurePolicy policy = new V1PodFailurePolicy();
        assertThat(policy, is(notNullValue()));
        assertThat(policy.getRules(), is(notNullValue()));
        assertThat(policy.getRules(), hasSize(0));
    }

    //BaseRock generated method id: ${testRules}, hash: BDD0C3BBD8255473280EB59A5CE58411
    @Test
    void testRules() {
        V1PodFailurePolicy policy = new V1PodFailurePolicy();
        List<V1PodFailurePolicyRule> rules = new ArrayList<>();
        rules.add(new V1PodFailurePolicyRule());
        rules.add(new V1PodFailurePolicyRule());
        policy.setRules(rules);
        assertThat(policy.getRules(), is(equalTo(rules)));
        assertThat(policy.getRules(), hasSize(2));
    }

    //BaseRock generated method id: ${testAddRulesItem}, hash: D6B417900807CE84FFA99D908A30FD4C
    @Test
    void testAddRulesItem() {
        V1PodFailurePolicy policy = new V1PodFailurePolicy();
        V1PodFailurePolicyRule rule1 = new V1PodFailurePolicyRule();
        V1PodFailurePolicyRule rule2 = new V1PodFailurePolicyRule();
        policy.addRulesItem(rule1);
        policy.addRulesItem(rule2);
        assertThat(policy.getRules(), hasSize(2));
        assertThat(policy.getRules(), containsInAnyOrder(rule1, rule2));
    }

    //BaseRock generated method id: ${testEquals}, hash: 24B84D09E144EA327D5B8327D512C6AB
    @Test
    void testEquals() {
        V1PodFailurePolicy policy1 = new V1PodFailurePolicy();
        V1PodFailurePolicy policy2 = new V1PodFailurePolicy();
        assertEquals(policy1, policy2);
        List<V1PodFailurePolicyRule> rules = new ArrayList<>();
        rules.add(new V1PodFailurePolicyRule());
        policy1.setRules(rules);
        assertThat(policy1.equals(policy2), is(false));
        policy2.setRules(rules);
        assertEquals(policy1, policy2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 3B564EB3AD6507BE60B111806248869C
    @Test
    void testHashCode() {
        V1PodFailurePolicy policy1 = new V1PodFailurePolicy();
        V1PodFailurePolicy policy2 = new V1PodFailurePolicy();
        assertEquals(policy1.hashCode(), policy2.hashCode());
        List<V1PodFailurePolicyRule> rules = new ArrayList<>();
        rules.add(new V1PodFailurePolicyRule());
        policy1.setRules(rules);
        assertThat(policy1.hashCode() == policy2.hashCode(), is(false));
        policy2.setRules(rules);
        assertEquals(policy1.hashCode(), policy2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: E3C2DF75F56FB15CD55D20E62F6F5FAC
    @Test
    void testToString() {
        V1PodFailurePolicy policy = new V1PodFailurePolicy();
        List<V1PodFailurePolicyRule> rules = new ArrayList<>();
        rules.add(new V1PodFailurePolicyRule());
        policy.setRules(rules);
        String result = policy.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result.contains("class V1PodFailurePolicy"), is(true));
        assertThat(result.contains("rules:"), is(true));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 49C33716F23AED12A8F28031B89E5B92
    @Test
    void testValidateJsonElement() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("rules", "[]");
        JsonElement jsonElement = jsonObject;
        assertThrows(IllegalArgumentException.class, () -> V1PodFailurePolicy.validateJsonElement(jsonElement));
    }
}
