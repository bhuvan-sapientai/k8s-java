package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1FieldSelectorRequirement;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1FieldSelectorRequirementBaseRockGeneratedTest {

    private V1FieldSelectorRequirement fieldSelectorRequirement;

    @BeforeEach
    void setUp() {
        fieldSelectorRequirement = new V1FieldSelectorRequirement();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 433CA2831072345C2A5256333E270013
    @Test
    void testConstructor() {
        assertNotNull(fieldSelectorRequirement);
    }

    //BaseRock generated method id: ${testGetKey}, hash: C5EF6B43B0D4CF730AF4533D28D89AF4
    @Test
    void testGetKey() {
        String key = "testKey";
        fieldSelectorRequirement.setKey(key);
        assertEquals(key, fieldSelectorRequirement.getKey());
    }

    //BaseRock generated method id: ${testSetKey}, hash: CE6616AF8A7F5B2EE623A8B6049E0C45
    @Test
    void testSetKey() {
        String key = "newKey";
        fieldSelectorRequirement.setKey(key);
        assertEquals(key, fieldSelectorRequirement.getKey());
    }

    //BaseRock generated method id: ${testGetOperator}, hash: 085A4E18AF74A9BFD08B77F0E3C8583D
    @Test
    void testGetOperator() {
        String operator = "In";
        fieldSelectorRequirement.setOperator(operator);
        assertEquals(operator, fieldSelectorRequirement.getOperator());
    }

    //BaseRock generated method id: ${testSetOperator}, hash: 5AA63E7092938AC1D3292204BB0903F5
    @Test
    void testSetOperator() {
        String operator = "NotIn";
        fieldSelectorRequirement.setOperator(operator);
        assertEquals(operator, fieldSelectorRequirement.getOperator());
    }

    //BaseRock generated method id: ${testGetValues}, hash: B9C8251AAC2B7C3D4AD506D72EB84EA0
    @Test
    void testGetValues() {
        List<String> values = Arrays.asList("value1", "value2");
        fieldSelectorRequirement.setValues(values);
        assertEquals(values, fieldSelectorRequirement.getValues());
    }

    //BaseRock generated method id: ${testSetValues}, hash: 4F3B13FF2D5D9994E52817F2CA113C0C
    @Test
    void testSetValues() {
        List<String> values = Arrays.asList("value3", "value4");
        fieldSelectorRequirement.setValues(values);
        assertEquals(values, fieldSelectorRequirement.getValues());
    }

    //BaseRock generated method id: ${testAddValuesItem}, hash: 4EA3B8E399817071231227197637880D
    @Test
    void testAddValuesItem() {
        String value = "newValue";
        fieldSelectorRequirement.addValuesItem(value);
        assertTrue(fieldSelectorRequirement.getValues().contains(value));
    }

    //BaseRock generated method id: ${testAddValuesItemToNull}, hash: 043D2692D2521DFB2A46781803BA411D
    @Test
    void testAddValuesItemToNull() {
        fieldSelectorRequirement.setValues(null);
        String value = "newValue";
        fieldSelectorRequirement.addValuesItem(value);
        assertNotNull(fieldSelectorRequirement.getValues());
        assertTrue(fieldSelectorRequirement.getValues().contains(value));
    }

    //BaseRock generated method id: ${testEquals}, hash: 9CD1441EA96FE19198F0F425838B39FB
    @Test
    void testEquals() {
        V1FieldSelectorRequirement requirement1 = new V1FieldSelectorRequirement().key("key1").operator("In").values(Arrays.asList("value1", "value2"));
        V1FieldSelectorRequirement requirement2 = new V1FieldSelectorRequirement().key("key1").operator("In").values(Arrays.asList("value1", "value2"));
        assertEquals(requirement1, requirement2);
    }

    //BaseRock generated method id: ${testNotEquals}, hash: 56889F025F071A3503DD070C42A5B3B0
    @Test
    void testNotEquals() {
        V1FieldSelectorRequirement requirement1 = new V1FieldSelectorRequirement().key("key1").operator("In").values(Arrays.asList("value1", "value2"));
        V1FieldSelectorRequirement requirement2 = new V1FieldSelectorRequirement().key("key2").operator("NotIn").values(Arrays.asList("value3", "value4"));
        assertNotEquals(requirement1, requirement2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: CD3144ED90DE16407A60469EF4BBBA1A
    @Test
    void testHashCode() {
        V1FieldSelectorRequirement requirement1 = new V1FieldSelectorRequirement().key("key1").operator("In").values(Arrays.asList("value1", "value2"));
        V1FieldSelectorRequirement requirement2 = new V1FieldSelectorRequirement().key("key1").operator("In").values(Arrays.asList("value1", "value2"));
        assertEquals(requirement1.hashCode(), requirement2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: B48662B7094A7A8C825B2C6C00DE93EC
    @Test
    void testToString() {
        V1FieldSelectorRequirement requirement = new V1FieldSelectorRequirement().key("testKey").operator("In").values(Arrays.asList("value1", "value2"));
        String expectedString = "class V1FieldSelectorRequirement {\n    key: testKey\n    operator: In\n    values: [value1, value2]\n}";
        assertEquals(expectedString, requirement.toString());
    }

    //BaseRock generated method id: ${testValidOperators}, hash: 5768BF43E0FAF447F5649F3031971CFC
    @ParameterizedTest
    @ValueSource(strings = { "In", "NotIn", "Exists", "DoesNotExist" })
    void testValidOperators(String operator) {
        fieldSelectorRequirement.setOperator(operator);
        assertEquals(operator, fieldSelectorRequirement.getOperator());
    }

    //BaseRock generated method id: ${testEmptyValuesForExistsOperator}, hash: C0F7DE8622600910598207F43DBC1337
    @Test
    void testEmptyValuesForExistsOperator() {
        fieldSelectorRequirement.setOperator("Exists");
        fieldSelectorRequirement.setValues(new ArrayList<>());
        assertTrue(fieldSelectorRequirement.getValues().isEmpty());
    }

    //BaseRock generated method id: ${testEmptyValuesForDoesNotExistOperator}, hash: 93FC24A792FF110268638964C7AB5B8A
    @Test
    void testEmptyValuesForDoesNotExistOperator() {
        fieldSelectorRequirement.setOperator("DoesNotExist");
        fieldSelectorRequirement.setValues(new ArrayList<>());
        assertTrue(fieldSelectorRequirement.getValues().isEmpty());
    }

    //BaseRock generated method id: ${testNonEmptyValuesForInOperator}, hash: 9886A5A3AB7C4F985026604CD8EA06E4
    @Test
    void testNonEmptyValuesForInOperator() {
        fieldSelectorRequirement.setOperator("In");
        fieldSelectorRequirement.setValues(Arrays.asList("value1", "value2"));
        assertFalse(fieldSelectorRequirement.getValues().isEmpty());
    }

    //BaseRock generated method id: ${testNonEmptyValuesForNotInOperator}, hash: 89BA80CA89BD72F8A871F6DDC00925E5
    @Test
    void testNonEmptyValuesForNotInOperator() {
        fieldSelectorRequirement.setOperator("NotIn");
        fieldSelectorRequirement.setValues(Arrays.asList("value1", "value2"));
        assertFalse(fieldSelectorRequirement.getValues().isEmpty());
    }
}
