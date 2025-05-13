package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import io.kubernetes.client.openapi.models.V1PodFailurePolicyOnExitCodesRequirement;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PodFailurePolicyOnExitCodesRequirementBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 3D9EE5015779C7E06B93850B30BE1E44
    @Test
    void testConstructor() {
        V1PodFailurePolicyOnExitCodesRequirement requirement = new V1PodFailurePolicyOnExitCodesRequirement();
        assertThat(requirement, is(notNullValue()));
    }

    //BaseRock generated method id: ${testContainerName}, hash: 4C6A92052DB12112F5B4B32358FC9F6C
    @Test
    void testContainerName() {
        V1PodFailurePolicyOnExitCodesRequirement requirement = new V1PodFailurePolicyOnExitCodesRequirement();
        String containerName = "test-container";
        requirement.setContainerName(containerName);
        assertThat(requirement.getContainerName(), is(equalTo(containerName)));
    }

    //BaseRock generated method id: ${testOperator}, hash: 1FF6E967255AA09C4615DC84000E0EF4
    @Test
    void testOperator() {
        V1PodFailurePolicyOnExitCodesRequirement requirement = new V1PodFailurePolicyOnExitCodesRequirement();
        String operator = "In";
        requirement.setOperator(operator);
        assertThat(requirement.getOperator(), is(equalTo(operator)));
    }

    //BaseRock generated method id: ${testValues}, hash: 63A87FB5CC19F1AB54E47E0FF26A69D1
    @Test
    void testValues() {
        V1PodFailurePolicyOnExitCodesRequirement requirement = new V1PodFailurePolicyOnExitCodesRequirement();
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        requirement.setValues(values);
        assertThat(requirement.getValues(), hasSize(2));
        assertThat(requirement.getValues(), containsInAnyOrder(1, 2));
    }

    //BaseRock generated method id: ${testAddValuesItem}, hash: 399AA5AEAB5B614120F88DFEEE1CE7A3
    @Test
    void testAddValuesItem() {
        V1PodFailurePolicyOnExitCodesRequirement requirement = new V1PodFailurePolicyOnExitCodesRequirement();
        requirement.addValuesItem(1);
        assertThat(requirement.getValues(), hasSize(1));
        assertThat(requirement.getValues().get(0), is(equalTo(1)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: C824F4876F480F4E0C9529CE0BC82EFB
    @Test
    void testEqualsAndHashCode() {
        V1PodFailurePolicyOnExitCodesRequirement requirement1 = new V1PodFailurePolicyOnExitCodesRequirement().containerName("container1").operator("In").addValuesItem(1);
        V1PodFailurePolicyOnExitCodesRequirement requirement2 = new V1PodFailurePolicyOnExitCodesRequirement().containerName("container1").operator("In").addValuesItem(1);
        assertThat(requirement1, is(equalTo(requirement2)));
        assertThat(requirement1.hashCode(), is(equalTo(requirement2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 610EC4585FC6C1DF17235ABC9611728E
    @Test
    void testToString() {
        V1PodFailurePolicyOnExitCodesRequirement requirement = new V1PodFailurePolicyOnExitCodesRequirement().containerName("container1").operator("In").addValuesItem(1);
        String expectedString = "class V1PodFailurePolicyOnExitCodesRequirement {\n" + "    containerName: container1\n" + "    operator: In\n" + "    values: [1]\n" + "}";
        assertThat(requirement.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testValidOperators}, hash: C67CCEA52C456E8A1033A78BC61BA4F9
    @ParameterizedTest
    @ValueSource(strings = { "In", "NotIn" })
    void testValidOperators(String operator) {
        V1PodFailurePolicyOnExitCodesRequirement requirement = new V1PodFailurePolicyOnExitCodesRequirement();
        requirement.setOperator(operator);
        assertThat(requirement.getOperator(), is(equalTo(operator)));
    }

    //BaseRock generated method id: ${testNullContainerName}, hash: C377A9A8D31264FDB247ACDFA796CA63
    @Test
    void testNullContainerName() {
        V1PodFailurePolicyOnExitCodesRequirement requirement = new V1PodFailurePolicyOnExitCodesRequirement();
        requirement.setContainerName(null);
        assertThat(requirement.getContainerName(), is(nullValue()));
    }

    //BaseRock generated method id: ${testEmptyValues}, hash: C626C4C6070C97B23C84067CA80F47CF
    @Test
    void testEmptyValues() {
        V1PodFailurePolicyOnExitCodesRequirement requirement = new V1PodFailurePolicyOnExitCodesRequirement();
        requirement.setValues(new ArrayList<>());
        assertThat(requirement.getValues(), hasSize(0));
    }

    //BaseRock generated method id: ${testAddMultipleValuesItems}, hash: 075C61B63F6F34F405A0B31751976C9F
    @Test
    void testAddMultipleValuesItems() {
        V1PodFailurePolicyOnExitCodesRequirement requirement = new V1PodFailurePolicyOnExitCodesRequirement();
        requirement.addValuesItem(1).addValuesItem(2).addValuesItem(3);
        assertThat(requirement.getValues(), hasSize(3));
        assertThat(requirement.getValues(), containsInAnyOrder(1, 2, 3));
    }

    //BaseRock generated method id: ${testSetNullValues}, hash: B6E686444BA9C16E0293758EAD7FCCB3
    @Test
    void testSetNullValues() {
        V1PodFailurePolicyOnExitCodesRequirement requirement = new V1PodFailurePolicyOnExitCodesRequirement();
        requirement.setValues(null);
        assertThat(requirement.getValues(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAddNullValuesItem}, hash: F91A5226D92B9D4FBCB39ACA8EAF968B
    @Test
    void testAddNullValuesItem() {
        V1PodFailurePolicyOnExitCodesRequirement requirement = new V1PodFailurePolicyOnExitCodesRequirement();
        requirement.addValuesItem(null);
        assertThat(requirement.getValues(), hasSize(1));
        assertThat(requirement.getValues().get(0), is(nullValue()));
    }
}
