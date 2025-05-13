package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1LabelSelectorRequirementBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 401C629777546002EE9549553B031900
    @Test
    void testConstructor() {
        V1LabelSelectorRequirement requirement = new V1LabelSelectorRequirement();
        assertNotNull(requirement);
    }

    //BaseRock generated method id: ${testKey}, hash: 1A81EAC33B4D11E0DF6851AF39510FEF
    @Test
    void testKey() {
        V1LabelSelectorRequirement requirement = new V1LabelSelectorRequirement();
        String key = "testKey";
        requirement.setKey(key);
        assertEquals(key, requirement.getKey());
    }

    //BaseRock generated method id: ${testOperator}, hash: 8C952ABFE12F880B3D92E36D006E81D3
    @Test
    void testOperator() {
        V1LabelSelectorRequirement requirement = new V1LabelSelectorRequirement();
        String operator = "In";
        requirement.setOperator(operator);
        assertEquals(operator, requirement.getOperator());
    }

    //BaseRock generated method id: ${testValues}, hash: C9954FD2382C1EC76800B3FC4C4DAAFF
    @Test
    void testValues() {
        V1LabelSelectorRequirement requirement = new V1LabelSelectorRequirement();
        List<String> values = new ArrayList<>();
        values.add("value1");
        values.add("value2");
        requirement.setValues(values);
        assertEquals(values, requirement.getValues());
    }

    //BaseRock generated method id: ${testAddValuesItem}, hash: ABE542E512678B1591ADC20935E88067
    @Test
    void testAddValuesItem() {
        V1LabelSelectorRequirement requirement = new V1LabelSelectorRequirement();
        String value = "testValue";
        requirement.addValuesItem(value);
        assertTrue(requirement.getValues().contains(value));
    }

    //BaseRock generated method id: ${testEquals}, hash: BCF67E9704B0B6A3AF88E86379D07D6D
    @Test
    void testEquals() {
        V1LabelSelectorRequirement req1 = new V1LabelSelectorRequirement().key("key1").operator("In").addValuesItem("value1");
        V1LabelSelectorRequirement req2 = new V1LabelSelectorRequirement().key("key1").operator("In").addValuesItem("value1");
        V1LabelSelectorRequirement req3 = new V1LabelSelectorRequirement().key("key2").operator("NotIn").addValuesItem("value2");
        assertTrue(req1.equals(req2));
        assertFalse(req1.equals(req3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 81AA984EF90DA3854D7D86B49FA3EE06
    @Test
    void testHashCode() {
        V1LabelSelectorRequirement req1 = new V1LabelSelectorRequirement().key("key1").operator("In").addValuesItem("value1");
        V1LabelSelectorRequirement req2 = new V1LabelSelectorRequirement().key("key1").operator("In").addValuesItem("value1");
        assertEquals(req1.hashCode(), req2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: D404721BC0F734E95289069773D02A6A
    @Test
    void testToString() {
        V1LabelSelectorRequirement requirement = new V1LabelSelectorRequirement().key("testKey").operator("In").addValuesItem("value1").addValuesItem("value2");
        String expectedString = "class V1LabelSelectorRequirement {\n" + "    key: testKey\n" + "    operator: In\n" + "    values: [value1, value2]\n" + "}";
        assertEquals(expectedString, requirement.toString());
    }

    //BaseRock generated method id: ${testValidOperators}, hash: D887659CEA5A7ACBF102DEE35693CF3D
    @ParameterizedTest
    @ValueSource(strings = { "In", "NotIn", "Exists", "DoesNotExist" })
    void testValidOperators(String operator) {
        V1LabelSelectorRequirement requirement = new V1LabelSelectorRequirement();
        requirement.setOperator(operator);
        assertEquals(operator, requirement.getOperator());
    }

    //BaseRock generated method id: ${testEmptyValues}, hash: 981045C067625F9870A84F60787F794D
    @Test
    void testEmptyValues() {
        V1LabelSelectorRequirement requirement = new V1LabelSelectorRequirement();
        assertTrue(requirement.getValues().isEmpty());
    }

    //BaseRock generated method id: ${testNullKey}, hash: E97CDF249C67ED69E6F10C00AE1D25EA
    @Test
    void testNullKey() {
        V1LabelSelectorRequirement requirement = new V1LabelSelectorRequirement();
        assertNull(requirement.getKey());
    }

    //BaseRock generated method id: ${testNullOperator}, hash: 8DCF950C625A05EF06EE13C03F372ADB
    @Test
    void testNullOperator() {
        V1LabelSelectorRequirement requirement = new V1LabelSelectorRequirement();
        assertNull(requirement.getOperator());
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: 1A4DFE12FD9015C12B0C9ACD8E2740E3
    @Test
    void testEqualsWithNull() {
        V1LabelSelectorRequirement requirement = new V1LabelSelectorRequirement();
        assertFalse(requirement.equals(null));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 33DC0BB8E1CBFBE7B89529275A9F8D47
    @Test
    void testEqualsWithDifferentClass() {
        V1LabelSelectorRequirement requirement = new V1LabelSelectorRequirement();
        assertFalse(requirement.equals("Not a V1LabelSelectorRequirement"));
    }

    //BaseRock generated method id: ${testHashCodeConsistency}, hash: 5125BC98956211AC3709F360374D58E4
    @Test
    void testHashCodeConsistency() {
        V1LabelSelectorRequirement requirement = new V1LabelSelectorRequirement().key("testKey").operator("In").addValuesItem("value1");
        int initialHashCode = requirement.hashCode();
        assertEquals(initialHashCode, requirement.hashCode());
        requirement.addValuesItem("value2");
        assertNotEquals(initialHashCode, requirement.hashCode());
    }
}
