package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import io.kubernetes.client.openapi.models.V1PolicyRulesWithSubjects;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1NonResourcePolicyRule;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.FlowcontrolV1Subject;
import static org.hamcrest.Matchers.containsInAnyOrder;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1ResourcePolicyRule;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import java.util.ArrayList;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1PolicyRulesWithSubjectsBaseRockGeneratedTest {

    private V1PolicyRulesWithSubjects policyRulesWithSubjects;

    @BeforeEach
    void setUp() {
        policyRulesWithSubjects = new V1PolicyRulesWithSubjects();
    }

    //BaseRock generated method id: ${testNonResourceRules}, hash: 3E2E3317BBFB8F88E135BB8737A53A79
    @Test
    void testNonResourceRules() {
        List<V1NonResourcePolicyRule> nonResourceRules = new ArrayList<>();
        V1NonResourcePolicyRule rule1 = mock(V1NonResourcePolicyRule.class);
        V1NonResourcePolicyRule rule2 = mock(V1NonResourcePolicyRule.class);
        nonResourceRules.add(rule1);
        nonResourceRules.add(rule2);
        policyRulesWithSubjects.setNonResourceRules(nonResourceRules);
        assertEquals(nonResourceRules, policyRulesWithSubjects.getNonResourceRules());
        policyRulesWithSubjects.addNonResourceRulesItem(mock(V1NonResourcePolicyRule.class));
        assertThat(policyRulesWithSubjects.getNonResourceRules(), hasSize(3));
    }

    //BaseRock generated method id: ${testResourceRules}, hash: E071152C009B6115472D43C54E815FDE
    @Test
    void testResourceRules() {
        List<V1ResourcePolicyRule> resourceRules = new ArrayList<>();
        V1ResourcePolicyRule rule1 = mock(V1ResourcePolicyRule.class);
        V1ResourcePolicyRule rule2 = mock(V1ResourcePolicyRule.class);
        resourceRules.add(rule1);
        resourceRules.add(rule2);
        policyRulesWithSubjects.setResourceRules(resourceRules);
        assertEquals(resourceRules, policyRulesWithSubjects.getResourceRules());
        policyRulesWithSubjects.addResourceRulesItem(mock(V1ResourcePolicyRule.class));
        assertThat(policyRulesWithSubjects.getResourceRules(), hasSize(3));
    }

    //BaseRock generated method id: ${testSubjects}, hash: 1442EDEDCD4EF0A86B8D5DD452834283
    @Test
    void testSubjects() {
        List<FlowcontrolV1Subject> subjects = new ArrayList<>();
        FlowcontrolV1Subject subject1 = mock(FlowcontrolV1Subject.class);
        FlowcontrolV1Subject subject2 = mock(FlowcontrolV1Subject.class);
        subjects.add(subject1);
        subjects.add(subject2);
        policyRulesWithSubjects.setSubjects(subjects);
        assertEquals(subjects, policyRulesWithSubjects.getSubjects());
        policyRulesWithSubjects.addSubjectsItem(mock(FlowcontrolV1Subject.class));
        assertThat(policyRulesWithSubjects.getSubjects(), hasSize(3));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: EFBB2791CECD53D6F11F5923EC829FC6
    @Disabled()
    @Test
    void testEqualsAndHashCode() {
        V1PolicyRulesWithSubjects policyRules1 = new V1PolicyRulesWithSubjects().nonResourceRules(Arrays.asList(new V1NonResourcePolicyRule())).resourceRules(Arrays.asList(new V1ResourcePolicyRule())).subjects(Arrays.asList(new FlowcontrolV1Subject()));
        V1PolicyRulesWithSubjects policyRules2 = new V1PolicyRulesWithSubjects().nonResourceRules(Arrays.asList(new V1NonResourcePolicyRule())).resourceRules(Arrays.asList(new V1ResourcePolicyRule())).subjects(Arrays.asList(new FlowcontrolV1Subject()));
        assertEquals(policyRules1, policyRules2);
        assertEquals(policyRules1.hashCode(), policyRules2.hashCode());
        policyRules2.addSubjectsItem(new FlowcontrolV1Subject());
        assertNotEquals(policyRules1, policyRules2);
        assertNotEquals(policyRules1.hashCode(), policyRules2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 670EFC5C38B633AF37D933957FF2A8B6
    @Test
    void testToString() {
        V1PolicyRulesWithSubjects policyRules = new V1PolicyRulesWithSubjects().nonResourceRules(Arrays.asList(new V1NonResourcePolicyRule())).resourceRules(Arrays.asList(new V1ResourcePolicyRule())).subjects(Arrays.asList(new FlowcontrolV1Subject()));
        String toString = policyRules.toString();
        assertThat(toString, notNullValue());
        assertTrue(toString.contains("nonResourceRules"));
        assertTrue(toString.contains("resourceRules"));
        assertTrue(toString.contains("subjects"));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 64D95F5273150747AFEDDC0A65095970
    @Test
    void testBuilder() {
        V1NonResourcePolicyRule nonResourceRule = new V1NonResourcePolicyRule();
        V1ResourcePolicyRule resourceRule = new V1ResourcePolicyRule();
        FlowcontrolV1Subject subject = new FlowcontrolV1Subject();
        V1PolicyRulesWithSubjects policyRules = new V1PolicyRulesWithSubjects().nonResourceRules(Arrays.asList(nonResourceRule)).resourceRules(Arrays.asList(resourceRule)).subjects(Arrays.asList(subject));
        assertThat(policyRules.getNonResourceRules(), containsInAnyOrder(nonResourceRule));
        assertThat(policyRules.getResourceRules(), containsInAnyOrder(resourceRule));
        assertThat(policyRules.getSubjects(), containsInAnyOrder(subject));
    }

    //BaseRock generated method id: ${testNoArgsConstructor}, hash: 34E059EE3819A8883481E890D50E54D1
    @Test
    void testNoArgsConstructor() {
        V1PolicyRulesWithSubjects policyRules = new V1PolicyRulesWithSubjects();
        assertThat(policyRules, is(notNullValue()));
        assertThat(policyRules.getNonResourceRules(), is(new ArrayList<>()));
        assertThat(policyRules.getResourceRules(), is(new ArrayList<>()));
        assertThat(policyRules.getSubjects(), is(new ArrayList<>()));
    }
}
