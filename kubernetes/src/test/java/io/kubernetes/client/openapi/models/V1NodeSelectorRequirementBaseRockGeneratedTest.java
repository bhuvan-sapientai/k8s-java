package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.V1NodeSelectorRequirement;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1NodeSelectorRequirementBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: F90EDBF4B258726F501761621DF51421
    @Test
    void testConstructor() {
        V1NodeSelectorRequirement requirement = new V1NodeSelectorRequirement();
        assertThat(requirement, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetKey}, hash: 2160EAA63AF026B45894B8EAB6E423DE
    @Test
    void testSetAndGetKey() {
        V1NodeSelectorRequirement requirement = new V1NodeSelectorRequirement();
        requirement.setKey("testKey");
        assertThat(requirement.getKey(), is(equalTo("testKey")));
    }

    //BaseRock generated method id: ${testSetAndGetOperator}, hash: AD62CDF3DC4A297C94B0061D0DCF11EB
    @Test
    void testSetAndGetOperator() {
        V1NodeSelectorRequirement requirement = new V1NodeSelectorRequirement();
        requirement.setOperator("In");
        assertThat(requirement.getOperator(), is(equalTo("In")));
    }

    //BaseRock generated method id: ${testSetAndGetValues}, hash: 87E45BD2A46573C3F7AB5D5AF6721421
    @Test
    void testSetAndGetValues() {
        V1NodeSelectorRequirement requirement = new V1NodeSelectorRequirement();
        List<String> values = Arrays.asList("value1", "value2");
        requirement.setValues(values);
        assertThat(requirement.getValues(), is(equalTo(values)));
    }

    //BaseRock generated method id: ${testAddValuesItem}, hash: 1DEF80F5D59948C18CDF3A2AF49B28EB
    @Test
    void testAddValuesItem() {
        V1NodeSelectorRequirement requirement = new V1NodeSelectorRequirement();
        requirement.addValuesItem("value1");
        requirement.addValuesItem("value2");
        assertThat(requirement.getValues(), hasSize(2));
        assertThat(requirement.getValues(), containsInAnyOrder("value1", "value2"));
    }

    //BaseRock generated method id: ${testEquals}, hash: 1C6B29BD03F8263010ED40F09FD2F817
    @Test
    void testEquals() {
        V1NodeSelectorRequirement requirement1 = new V1NodeSelectorRequirement().key("testKey").operator("In").values(Arrays.asList("value1", "value2"));
        V1NodeSelectorRequirement requirement2 = new V1NodeSelectorRequirement().key("testKey").operator("In").values(Arrays.asList("value1", "value2"));
        assertThat(requirement1.equals(requirement2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 7894D771551A0BCAAC1340CAEFD6712C
    @Test
    void testHashCode() {
        V1NodeSelectorRequirement requirement1 = new V1NodeSelectorRequirement().key("testKey").operator("In").values(Arrays.asList("value1", "value2"));
        V1NodeSelectorRequirement requirement2 = new V1NodeSelectorRequirement().key("testKey").operator("In").values(Arrays.asList("value1", "value2"));
        assertThat(requirement1.hashCode(), is(equalTo(requirement2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 0DE43397A5326E5577D0C1554DCEADB0
    @Test
    void testToString() {
        V1NodeSelectorRequirement requirement = new V1NodeSelectorRequirement().key("testKey").operator("In").values(Arrays.asList("value1", "value2"));
        String expectedString = "class V1NodeSelectorRequirement {\n    key: testKey\n    operator: In\n    values: [value1, value2]\n}";
        assertThat(requirement.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testValidOperators}, hash: E6C12466047584AC6CF576B62AA03AFD
    @ParameterizedTest
    @ValueSource(strings = { "In", "NotIn", "Exists", "DoesNotExist", "Gt", "Lt" })
    void testValidOperators(String operator) {
        V1NodeSelectorRequirement requirement = new V1NodeSelectorRequirement().key("testKey").operator(operator);
        assertThat(requirement.getOperator(), is(equalTo(operator)));
    }

    //BaseRock generated method id: ${testNullKey}, hash: D7A70B062E57558FD3B10B9E3DFA9860
    @Test
    void testNullKey() {
        V1NodeSelectorRequirement requirement = new V1NodeSelectorRequirement();
        assertDoesNotThrow(() -> requirement.setKey(null));
    }

    //BaseRock generated method id: ${testNullOperator}, hash: 1D624E99E1B02F0A9E87BEF4EF093D12
    @Test
    void testNullOperator() {
        V1NodeSelectorRequirement requirement = new V1NodeSelectorRequirement();
        assertDoesNotThrow(() -> requirement.setOperator(null));
    }

    //BaseRock generated method id: ${testEmptyValues}, hash: C88DCC9126F06F0EEC6B9BB4594D00FF
    @Test
    void testEmptyValues() {
        V1NodeSelectorRequirement requirement = new V1NodeSelectorRequirement().key("testKey").operator("Exists");
        assertThat(requirement.getValues(), is(notNullValue()));
        assertThat(requirement.getValues(), hasSize(0));
    }
}
