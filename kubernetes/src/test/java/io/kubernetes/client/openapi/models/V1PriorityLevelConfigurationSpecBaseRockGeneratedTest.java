package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ExemptPriorityLevelConfiguration;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import com.google.gson.JsonPrimitive;
import io.kubernetes.client.openapi.models.V1PriorityLevelConfigurationSpec;
import java.util.HashSet;
import java.util.Set;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.google.gson.JsonObject;
import static org.hamcrest.Matchers.not;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import org.junit.jupiter.params.provider.NullSource;
import java.io.IOException;
import static org.hamcrest.Matchers.is;
import io.kubernetes.client.openapi.models.V1LimitedPriorityLevelConfiguration;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PriorityLevelConfigurationSpecBaseRockGeneratedTest {

    //BaseRock generated method id: ${testDefaultConstructor}, hash: FEA6DB90F35365EE4079FE5D79190C5D
    @Test
    void testDefaultConstructor() {
        V1PriorityLevelConfigurationSpec spec = new V1PriorityLevelConfigurationSpec();
        assertThat(spec, is(notNullValue()));
        assertThat(spec.getExempt(), is(nullValue()));
        assertThat(spec.getLimited(), is(nullValue()));
        assertThat(spec.getType(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetExempt}, hash: 214070759937F095EECA82E810E05EE2
    @Test
    void testSetAndGetExempt() {
        // Setup
        V1PriorityLevelConfigurationSpec spec = new V1PriorityLevelConfigurationSpec();
        V1ExemptPriorityLevelConfiguration exempt = new V1ExemptPriorityLevelConfiguration();
        // Test setter with fluent interface
        V1PriorityLevelConfigurationSpec result = spec.exempt(exempt);
        // Verify fluent interface returns the same instance
        assertThat(result, is(spec));
        // Verify getter returns the set value
        assertThat(spec.getExempt(), is(exempt));
        // Test regular setter
        V1ExemptPriorityLevelConfiguration newExempt = new V1ExemptPriorityLevelConfiguration();
        spec.setExempt(newExempt);
        // Verify getter returns the updated value
        assertThat(spec.getExempt(), is(newExempt));
    }

    //BaseRock generated method id: ${testSetAndGetLimited}, hash: 7BF0C57BEB77F0788A02FF1373E0A2B2
    @Test
    void testSetAndGetLimited() {
        // Setup
        V1PriorityLevelConfigurationSpec spec = new V1PriorityLevelConfigurationSpec();
        V1LimitedPriorityLevelConfiguration limited = new V1LimitedPriorityLevelConfiguration();
        // Test setter with fluent interface
        V1PriorityLevelConfigurationSpec result = spec.limited(limited);
        // Verify fluent interface returns the same instance
        assertThat(result, is(spec));
        // Verify getter returns the set value
        assertThat(spec.getLimited(), is(limited));
        // Test regular setter
        V1LimitedPriorityLevelConfiguration newLimited = new V1LimitedPriorityLevelConfiguration();
        spec.setLimited(newLimited);
        // Verify getter returns the updated value
        assertThat(spec.getLimited(), is(newLimited));
    }

    //BaseRock generated method id: ${testSetAndGetType}, hash: 415C01DE0908FCD834257870BBD33C6B
    @Test
    void testSetAndGetType() {
        // Setup
        V1PriorityLevelConfigurationSpec spec = new V1PriorityLevelConfigurationSpec();
        String type = "Limited";
        // Test setter with fluent interface
        V1PriorityLevelConfigurationSpec result = spec.type(type);
        // Verify fluent interface returns the same instance
        assertThat(result, is(spec));
        // Verify getter returns the set value
        assertThat(spec.getType(), is(type));
        // Test regular setter
        String newType = "Exempt";
        spec.setType(newType);
        // Verify getter returns the updated value
        assertThat(spec.getType(), is(newType));
    }

    //BaseRock generated method id: ${testEquals}, hash: 46F9734CAA6F47109EF4F75AABAC994C
    @Test
    void testEquals() {
        // Setup
        V1PriorityLevelConfigurationSpec spec1 = new V1PriorityLevelConfigurationSpec().exempt(new V1ExemptPriorityLevelConfiguration()).limited(new V1LimitedPriorityLevelConfiguration()).type("Limited");
        V1PriorityLevelConfigurationSpec spec2 = new V1PriorityLevelConfigurationSpec().exempt(new V1ExemptPriorityLevelConfiguration()).limited(new V1LimitedPriorityLevelConfiguration()).type("Limited");
        V1PriorityLevelConfigurationSpec spec3 = new V1PriorityLevelConfigurationSpec().exempt(new V1ExemptPriorityLevelConfiguration()).limited(new V1LimitedPriorityLevelConfiguration()).type("Exempt");
        // Test equality with identical objects
        assertTrue(spec1.equals(spec1));
        // Test equality with equivalent objects
        assertTrue(spec1.equals(spec2));
        assertTrue(spec2.equals(spec1));
        // Test inequality with different objects
        assertFalse(spec1.equals(spec3));
        assertFalse(spec3.equals(spec1));
        // Test inequality with null
        assertFalse(spec1.equals(null));
        // Test inequality with different class
        assertFalse(spec1.equals("not a spec"));
    }

    //BaseRock generated method id: ${testHashCode}, hash: F48548913021824D30BA23D418425808
    @Test
    void testHashCode() {
        // Setup
        V1ExemptPriorityLevelConfiguration exempt = new V1ExemptPriorityLevelConfiguration();
        V1LimitedPriorityLevelConfiguration limited = new V1LimitedPriorityLevelConfiguration();
        String type = "Limited";
        V1PriorityLevelConfigurationSpec spec1 = new V1PriorityLevelConfigurationSpec().exempt(exempt).limited(limited).type(type);
        V1PriorityLevelConfigurationSpec spec2 = new V1PriorityLevelConfigurationSpec().exempt(exempt).limited(limited).type(type);
        V1PriorityLevelConfigurationSpec spec3 = new V1PriorityLevelConfigurationSpec().exempt(exempt).limited(limited).type("Exempt");
        // Test hash codes for equal objects
        assertEquals(spec1.hashCode(), spec2.hashCode());
        // Test hash codes for different objects
        assertThat(spec1.hashCode(), is(not(equalTo(spec3.hashCode()))));
    }

    //BaseRock generated method id: ${testToString}, hash: 6EDC55C77215F89F2C8560BACB6F951E
    @Test
    void testToString() {
        // Setup
        V1PriorityLevelConfigurationSpec spec = new V1PriorityLevelConfigurationSpec().exempt(new V1ExemptPriorityLevelConfiguration()).limited(new V1LimitedPriorityLevelConfiguration()).type("Limited");
        // Test toString method
        String result = spec.toString();
        // Verify result contains expected fields
        assertThat(result, notNullValue());
        assertTrue(result.contains("exempt"));
        assertTrue(result.contains("limited"));
        assertTrue(result.contains("type"));
        assertTrue(result.contains("Limited"));
    }

    //BaseRock generated method id: ${testOpenApiFields}, hash: 8DA71FBCBE0AFA8635165F3431571AC2
    @Test
    void testOpenApiFields() {
        // Test that the openapiFields set contains the expected fields
        Set<String> expectedFields = new HashSet<>();
        expectedFields.add("exempt");
        expectedFields.add("limited");
        expectedFields.add("type");
        assertThat(V1PriorityLevelConfigurationSpec.openapiFields, is(equalTo(expectedFields)));
    }

    //BaseRock generated method id: ${testOpenApiRequiredFields}, hash: 90F220A811C77CDA89BECA38B94C80F1
    @Test
    void testOpenApiRequiredFields() {
        // Test that the openapiRequiredFields set contains the expected fields
        Set<String> expectedRequiredFields = new HashSet<>();
        expectedRequiredFields.add("type");
        assertThat(V1PriorityLevelConfigurationSpec.openapiRequiredFields, is(equalTo(expectedRequiredFields)));
    }

    //BaseRock generated method id: ${testValidateJsonElementValid}, hash: 250CD5E688E054481A36F13721FB5080
    @Test
    void testValidateJsonElementValid() throws IOException {
        // Setup valid JsonElement
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", "Limited");
        JsonObject exemptObject = new JsonObject();
        jsonObject.add("exempt", exemptObject);
        JsonObject limitedObject = new JsonObject();
        jsonObject.add("limited", limitedObject);
        // This should not throw an exception for valid JSON
        V1PriorityLevelConfigurationSpec.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testValidateJsonElementMissingRequiredField}, hash: A1A6EB57471C7B5A4DBBC04354F83E68
    @Test
    void testValidateJsonElementMissingRequiredField() {
        // Setup invalid JsonElement (missing required 'type' field)
        JsonObject jsonObject = new JsonObject();
        JsonObject exemptObject = new JsonObject();
        jsonObject.add("exempt", exemptObject);
        JsonObject limitedObject = new JsonObject();
        jsonObject.add("limited", limitedObject);
        // This should throw an exception for missing required field
        assertThrows(IllegalArgumentException.class, () -> {
            V1PriorityLevelConfigurationSpec.validateJsonElement(jsonObject);
        });
    }

    //BaseRock generated method id: ${testValidateJsonElementUnknownField}, hash: DCF0B8EBC5AA6342777962389D3C3273
    @Test
    void testValidateJsonElementUnknownField() {
        // Setup invalid JsonElement (with unknown field)
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", "Limited");
        jsonObject.addProperty("unknownField", "value");
        // This should throw an exception for unknown field
        assertThrows(IllegalArgumentException.class, () -> {
            V1PriorityLevelConfigurationSpec.validateJsonElement(jsonObject);
        });
    }

    //BaseRock generated method id: ${testValidateJsonElementNullWithRequiredFields}, hash: C47A6C29F85388D8E3F4B19746967ACF
    @Test
    void testValidateJsonElementNullWithRequiredFields() {
        // This should throw an exception for null JSON with required fields
        assertThrows(IllegalArgumentException.class, () -> {
            V1PriorityLevelConfigurationSpec.validateJsonElement(null);
        });
    }

    //BaseRock generated method id: ${testValidateJsonElementTypeNotPrimitive}, hash: CE660CC2C115958190B138DE9B7CAFDB
    @Test
    void testValidateJsonElementTypeNotPrimitive() {
        // Setup invalid JsonElement (type is not a primitive)
        JsonObject jsonObject = new JsonObject();
        JsonObject typeObject = new JsonObject();
        jsonObject.add("type", typeObject);
        // This should throw an exception for non-primitive type
        assertThrows(IllegalArgumentException.class, () -> {
            V1PriorityLevelConfigurationSpec.validateJsonElement(jsonObject);
        });
    }

    //BaseRock generated method id: ${testExemptWithNull}, hash: E957C95CED69ACD48640CA32A7202027
    @ParameterizedTest
    @NullSource
    void testExemptWithNull(V1ExemptPriorityLevelConfiguration exempt) {
        V1PriorityLevelConfigurationSpec spec = new V1PriorityLevelConfigurationSpec();
        spec.exempt(exempt);
        assertThat(spec.getExempt(), is(nullValue()));
    }

    //BaseRock generated method id: ${testLimitedWithNull}, hash: 1B367D3E19EA57977FF0C86E49F86DCE
    @ParameterizedTest
    @NullSource
    void testLimitedWithNull(V1LimitedPriorityLevelConfiguration limited) {
        V1PriorityLevelConfigurationSpec spec = new V1PriorityLevelConfigurationSpec();
        spec.limited(limited);
        assertThat(spec.getLimited(), is(nullValue()));
    }

    //BaseRock generated method id: ${testTypeWithDifferentValues}, hash: 48B66D391443F3C7CFC418921712A04B
    @ParameterizedTest
    @ValueSource(strings = { "Limited", "Exempt", "" })
    void testTypeWithDifferentValues(String type) {
        V1PriorityLevelConfigurationSpec spec = new V1PriorityLevelConfigurationSpec();
        spec.type(type);
        assertThat(spec.getType(), is(equalTo(type)));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 73F85F4A93AA78C6F6E583D92A28D5E2
    @Test
    void testFromJson() throws IOException {
        // Setup
        String json = "{\"type\":\"Limited\",\"exempt\":{},\"limited\":{}}";
        // Test
        V1PriorityLevelConfigurationSpec spec = V1PriorityLevelConfigurationSpec.fromJson(json);
        // Verify
        assertThat(spec, is(notNullValue()));
        assertThat(spec.getType(), is(equalTo("Limited")));
        assertThat(spec.getExempt(), is(notNullValue()));
        assertThat(spec.getLimited(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToJson}, hash: 2079E44F07D4737ADBCE615F90C8E7AC
    @Test
    void testToJson() {
        // Setup
        V1PriorityLevelConfigurationSpec spec = new V1PriorityLevelConfigurationSpec().type("Limited").exempt(new V1ExemptPriorityLevelConfiguration()).limited(new V1LimitedPriorityLevelConfiguration());
        // Test
        String json = spec.toJson();
        // Verify
        assertThat(json, is(notNullValue()));
        assertTrue(json.contains("\"type\":\"Limited\""));
        assertTrue(json.contains("\"exempt\":"));
        assertTrue(json.contains("\"limited\":"));
    }

    //BaseRock generated method id: ${testCustomTypeAdapterFactory}, hash: 81334856DB1B50040FEAC6A82246F2C9
    @Test
    void testCustomTypeAdapterFactory() {
        // Just verify the class exists and can be instantiated
        V1PriorityLevelConfigurationSpec.CustomTypeAdapterFactory factory = new V1PriorityLevelConfigurationSpec.CustomTypeAdapterFactory();
        assertThat(factory, is(notNullValue()));
    }
}
