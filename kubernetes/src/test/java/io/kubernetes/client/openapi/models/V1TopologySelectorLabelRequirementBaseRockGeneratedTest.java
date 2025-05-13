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
import io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement;
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
class V1TopologySelectorLabelRequirementBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 1B27F5A980B46A6607393EE604F8B5BF
    @Test
    void testConstructor() {
        V1TopologySelectorLabelRequirement requirement = new V1TopologySelectorLabelRequirement();
        assertThat(requirement, is(notNullValue()));
    }

    //BaseRock generated method id: ${testGetterAndSetter}, hash: D36155E6FFD7BFD10B8C2D3AF336B53F
    @Test
    void testGetterAndSetter() {
        V1TopologySelectorLabelRequirement requirement = new V1TopologySelectorLabelRequirement();
        requirement.setKey("region");
        assertThat(requirement.getKey(), is(equalTo("region")));
        List<String> values = Arrays.asList("us-east", "us-west");
        requirement.setValues(values);
        assertThat(requirement.getValues(), is(equalTo(values)));
    }

    //BaseRock generated method id: ${testBuilder}, hash: B43B9070A1AFC57F6A03294A4749BD0D
    @Test
    void testBuilder() {
        V1TopologySelectorLabelRequirement requirement = new V1TopologySelectorLabelRequirement().key("zone").addValuesItem("zone-1").addValuesItem("zone-2");
        assertThat(requirement.getKey(), is(equalTo("zone")));
        assertThat(requirement.getValues(), hasSize(2));
        assertThat(requirement.getValues(), containsInAnyOrder("zone-1", "zone-2"));
    }

    //BaseRock generated method id: ${testKeyWithDifferentValues}, hash: FAB783EEB32383BAE992A4B598540CA1
    @ParameterizedTest
    @ValueSource(strings = { "key1", "key2", "key3" })
    void testKeyWithDifferentValues(String key) {
        V1TopologySelectorLabelRequirement requirement = new V1TopologySelectorLabelRequirement().key(key);
        assertThat(requirement.getKey(), is(equalTo(key)));
    }

    //BaseRock generated method id: ${testAddMultipleValues}, hash: 1E59F4860321CA625B8BE248B0E4D7ED
    @Test
    void testAddMultipleValues() {
        V1TopologySelectorLabelRequirement requirement = new V1TopologySelectorLabelRequirement().addValuesItem("value1").addValuesItem("value2").addValuesItem("value3");
        assertThat(requirement.getValues(), hasSize(3));
        assertThat(requirement.getValues(), containsInAnyOrder("value1", "value2", "value3"));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 28654E1C72C1049A46269B0E7B307A54
    @Test
    void testEqualsAndHashCode() {
        V1TopologySelectorLabelRequirement requirement1 = new V1TopologySelectorLabelRequirement().key("key").addValuesItem("value1").addValuesItem("value2");
        V1TopologySelectorLabelRequirement requirement2 = new V1TopologySelectorLabelRequirement().key("key").addValuesItem("value1").addValuesItem("value2");
        assertThat(requirement1, is(equalTo(requirement2)));
        assertThat(requirement1.hashCode(), is(equalTo(requirement2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 8E2810419CA7BDEBD3BD89E4262AF6E3
    @Test
    void testToString() {
        V1TopologySelectorLabelRequirement requirement = new V1TopologySelectorLabelRequirement().key("region").addValuesItem("us-east").addValuesItem("us-west");
        String expectedString = "class V1TopologySelectorLabelRequirement {\n    key: region\n    values: [us-east, us-west]\n}";
        assertThat(requirement.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testSetNullKey}, hash: 51B3F1963A73ABF4F88E1568937712C4
    @Test
    void testSetNullKey() {
        V1TopologySelectorLabelRequirement requirement = new V1TopologySelectorLabelRequirement();
        assertDoesNotThrow(() -> requirement.setKey(null));
    }

    //BaseRock generated method id: ${testSetNullValues}, hash: E9B4BA4165FADD0C6B8D668C4B7D6B90
    @Test
    void testSetNullValues() {
        V1TopologySelectorLabelRequirement requirement = new V1TopologySelectorLabelRequirement();
        assertDoesNotThrow(() -> requirement.setValues(null));
    }
}
