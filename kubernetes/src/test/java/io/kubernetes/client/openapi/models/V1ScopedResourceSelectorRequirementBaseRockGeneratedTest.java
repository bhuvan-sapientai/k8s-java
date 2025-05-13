package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.containsInAnyOrder;
import io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ScopedResourceSelectorRequirementBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 0ACBC7EE40E2220BD16977AA2197249A
    @Test
    void testConstructor() {
        V1ScopedResourceSelectorRequirement requirement = new V1ScopedResourceSelectorRequirement();
        assertThat(requirement, is(notNullValue()));
    }

    //BaseRock generated method id: ${testOperator}, hash: E6576C752868AE2950C861AC97E4C44E
    @Test
    void testOperator() {
        V1ScopedResourceSelectorRequirement requirement = new V1ScopedResourceSelectorRequirement();
        String operator = "In";
        requirement.setOperator(operator);
        assertThat(requirement.getOperator(), is(equalTo(operator)));
    }

    //BaseRock generated method id: ${testScopeName}, hash: 66BF3F86BAD79629945826CC063E18C0
    @Test
    void testScopeName() {
        V1ScopedResourceSelectorRequirement requirement = new V1ScopedResourceSelectorRequirement();
        String scopeName = "ResourceQuota";
        requirement.setScopeName(scopeName);
        assertThat(requirement.getScopeName(), is(equalTo(scopeName)));
    }

    //BaseRock generated method id: ${testValues}, hash: 0C16FB6A3E7B1F49FD3D6AD51EBB4236
    @Test
    void testValues() {
        V1ScopedResourceSelectorRequirement requirement = new V1ScopedResourceSelectorRequirement();
        List<String> values = Arrays.asList("value1", "value2");
        requirement.setValues(values);
        assertThat(requirement.getValues(), is(equalTo(values)));
    }

    //BaseRock generated method id: ${testAddValuesItem}, hash: 4A480843F587C09FA0B7F9C51D5394E8
    @Test
    void testAddValuesItem() {
        V1ScopedResourceSelectorRequirement requirement = new V1ScopedResourceSelectorRequirement();
        String value = "newValue";
        requirement.addValuesItem(value);
        assertThat(requirement.getValues(), hasSize(1));
        assertThat(requirement.getValues().get(0), is(equalTo(value)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 9851FDC77CFEEB4FC94AC82303446BF0
    @Test
    void testEqualsAndHashCode() {
        V1ScopedResourceSelectorRequirement requirement1 = new V1ScopedResourceSelectorRequirement().operator("In").scopeName("ResourceQuota").addValuesItem("value1");
        V1ScopedResourceSelectorRequirement requirement2 = new V1ScopedResourceSelectorRequirement().operator("In").scopeName("ResourceQuota").addValuesItem("value1");
        assertThat(requirement1, is(equalTo(requirement2)));
        assertThat(requirement1.hashCode(), is(equalTo(requirement2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 6799434D3DF973E49A718A5EEE9EEEE2
    @Test
    void testToString() {
        V1ScopedResourceSelectorRequirement requirement = new V1ScopedResourceSelectorRequirement().operator("In").scopeName("ResourceQuota").addValuesItem("value1");
        String expectedString = "class V1ScopedResourceSelectorRequirement {\n" + "    operator: In\n" + "    scopeName: ResourceQuota\n" + "    values: [value1]\n" + "}";
        assertThat(requirement.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testValidOperators}, hash: EC77600550E44D3CCFFFBF5D212FD913
    @ParameterizedTest
    @ValueSource(strings = { "In", "NotIn", "Exists", "DoesNotExist" })
    void testValidOperators(String operator) {
        V1ScopedResourceSelectorRequirement requirement = new V1ScopedResourceSelectorRequirement().operator(operator);
        assertThat(requirement.getOperator(), is(equalTo(operator)));
    }

    //BaseRock generated method id: ${testMultipleValues}, hash: 6C8DE9CB405EBF8A6B869DF10EB85D8A
    @Test
    void testMultipleValues() {
        V1ScopedResourceSelectorRequirement requirement = new V1ScopedResourceSelectorRequirement();
        requirement.addValuesItem("value1");
        requirement.addValuesItem("value2");
        requirement.addValuesItem("value3");
        assertThat(requirement.getValues(), hasSize(3));
        assertThat(requirement.getValues(), containsInAnyOrder("value1", "value2", "value3"));
    }

    //BaseRock generated method id: ${testNullOperator}, hash: 78A7541EAB9026D7DE6C5E0664FA1F81
    @Test
    void testNullOperator() {
        V1ScopedResourceSelectorRequirement requirement = new V1ScopedResourceSelectorRequirement();
        requirement.setOperator(null);
        assertNull(requirement.getOperator());
    }

    //BaseRock generated method id: ${testNullScopeName}, hash: 6721C0D89F6D1A0FF1812BD5945325D7
    @Test
    void testNullScopeName() {
        V1ScopedResourceSelectorRequirement requirement = new V1ScopedResourceSelectorRequirement();
        requirement.setScopeName(null);
        assertNull(requirement.getScopeName());
    }

    //BaseRock generated method id: ${testEmptyValues}, hash: F7A04DDBDEDFC433083DE50EDB94CB5F
    @Test
    void testEmptyValues() {
        V1ScopedResourceSelectorRequirement requirement = new V1ScopedResourceSelectorRequirement();
        requirement.setValues(Arrays.asList());
        assertThat(requirement.getValues(), hasSize(0));
    }
}
