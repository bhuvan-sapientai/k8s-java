package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.google.gson.JsonObject;
import org.junit.jupiter.params.provider.CsvSource;
import com.google.gson.JsonElement;
import org.mockito.Mockito;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.Objects;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import java.util.HashSet;
import java.util.Set;
import io.kubernetes.client.openapi.models.V1PodOS;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PodOSBaseRockGeneratedTest {

    //BaseRock generated method id: ${testDefaultConstructor}, hash: F80E4FC44088184A5915F509E3B1819F
    @Test
    void testDefaultConstructor() {
        V1PodOS podOS = new V1PodOS();
        assertThat(podOS, is(notNullValue()));
        assertThat(podOS.getName(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNameConstructorMethod}, hash: 34FE8E06E4D0324B0BE15FBDB6E4F805
    @Test
    void testNameConstructorMethod() {
        String osName = "linux";
        V1PodOS podOS = new V1PodOS().name(osName);
        assertThat(podOS, is(notNullValue()));
        assertThat(podOS.getName(), is(equalTo(osName)));
    }

    //BaseRock generated method id: ${testSetAndGetName}, hash: 76F4B12838CB438C37C128D17838BE2D
    @ParameterizedTest
    @ValueSource(strings = { "linux", "windows", "solaris", "android" })
    void testSetAndGetName(String osName) {
        V1PodOS podOS = new V1PodOS();
        podOS.setName(osName);
        assertThat(podOS.getName(), is(equalTo(osName)));
    }

    //BaseRock generated method id: ${testEqualsWithSameInstance}, hash: E86438766C0A58376D65FA4B4B0AC364
    @Test
    void testEqualsWithSameInstance() {
        V1PodOS podOS = new V1PodOS().name("linux");
        assertTrue(podOS.equals(podOS));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: 1C5CAAC2D51C7C395F524F8BF34A4033
    @Test
    void testEqualsWithNull() {
        V1PodOS podOS = new V1PodOS().name("linux");
        assertFalse(podOS.equals(null));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 48FBE9AD1DD6B13B7ABCE3B4911D1699
    @Test
    void testEqualsWithDifferentClass() {
        V1PodOS podOS = new V1PodOS().name("linux");
        assertFalse(podOS.equals("Not a V1PodOS"));
    }

    //BaseRock generated method id: ${testEqualsWithSameValues}, hash: 949D2BAEE644A4453C1D8243A0B7A2B3
    @Test
    void testEqualsWithSameValues() {
        V1PodOS podOS1 = new V1PodOS().name("linux");
        V1PodOS podOS2 = new V1PodOS().name("linux");
        assertTrue(podOS1.equals(podOS2));
        assertTrue(podOS2.equals(podOS1));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentValues}, hash: 1E3D8DFF6A7F9F7C17BEF0EB76CBD1C2
    @Test
    void testEqualsWithDifferentValues() {
        V1PodOS podOS1 = new V1PodOS().name("linux");
        V1PodOS podOS2 = new V1PodOS().name("windows");
        assertFalse(podOS1.equals(podOS2));
        assertFalse(podOS2.equals(podOS1));
    }

    //BaseRock generated method id: ${testEqualsWithNullName}, hash: 57060A97D4696A17C97770A22C0EE9C5
    @Test
    void testEqualsWithNullName() {
        V1PodOS podOS1 = new V1PodOS();
        V1PodOS podOS2 = new V1PodOS();
        assertTrue(podOS1.equals(podOS2));
        // Only one has null name
        V1PodOS podOS3 = new V1PodOS().name("linux");
        assertFalse(podOS1.equals(podOS3));
        assertFalse(podOS3.equals(podOS1));
    }

    //BaseRock generated method id: ${testHashCodeConsistency}, hash: D628021F92904A3915324E6976927C26
    @Test
    void testHashCodeConsistency() {
        V1PodOS podOS = new V1PodOS().name("linux");
        int initialHashCode = podOS.hashCode();
        assertEquals(initialHashCode, podOS.hashCode());
    }

    //BaseRock generated method id: ${testHashCodeEquality}, hash: C3F0AB360FFB4C3782B96C83A381A547
    @Test
    void testHashCodeEquality() {
        V1PodOS podOS1 = new V1PodOS().name("linux");
        V1PodOS podOS2 = new V1PodOS().name("linux");
        assertEquals(podOS1.hashCode(), podOS2.hashCode());
    }

    //BaseRock generated method id: ${testHashCodeWithNullName}, hash: A908E16F742A26195F878C6D2C27C80D
    @Test
    void testHashCodeWithNullName() {
        V1PodOS podOS = new V1PodOS();
        // This should not throw NullPointerException
        int hashCode = podOS.hashCode();
        assertThat(hashCode, is(Objects.hash((Object) null)));
    }

    //BaseRock generated method id: ${testToString}, hash: 4783370A38399026623013AC3A05994A
    @Test
    void testToString() {
        V1PodOS podOS = new V1PodOS().name("linux");
        String stringRepresentation = podOS.toString();
        assertThat(stringRepresentation, is(notNullValue()));
        assertTrue(stringRepresentation.contains("class V1PodOS"));
        assertTrue(stringRepresentation.contains("name: linux"));
    }

    //BaseRock generated method id: ${testToStringWithNullName}, hash: 40B9908188032D0EB69D9427BEDE8B2E
    @Test
    void testToStringWithNullName() {
        V1PodOS podOS = new V1PodOS();
        String stringRepresentation = podOS.toString();
        assertThat(stringRepresentation, is(notNullValue()));
        assertTrue(stringRepresentation.contains("name: null"));
    }

    //BaseRock generated method id: ${testToIndentedString}, hash: 24D85929E12BD9347CD58E02A304DEBD
    @Test
    void testToIndentedString() throws Exception {
        V1PodOS podOS = new V1PodOS().name("linux");
        // Test indentation of a non-null value
        java.lang.reflect.Method method = V1PodOS.class.getDeclaredMethod("toIndentedString", Object.class);
        method.setAccessible(true);
        String indentedName = (String) method.invoke(podOS, "linux");
        assertThat(indentedName, is(equalTo("linux")));
        // Test indentation of a null value
        String indentedNull = (String) method.invoke(podOS, (Object) null);
        assertThat(indentedNull, is(equalTo("null")));
        // Test indentation of a multiline value
        String multilineValue = "line1\nline2\nline3";
        String indentedMultiline = (String) method.invoke(podOS, multilineValue);
        assertThat(indentedMultiline, is(equalTo("line1\n    line2\n    line3")));
    }

    //BaseRock generated method id: ${testOpenapiFieldsInitialization}, hash: 3612AB5E0A9CEA12E4B972A1D9C94306
    @Test
    void testOpenapiFieldsInitialization() {
        Set<String> fields = V1PodOS.openapiFields;
        assertThat(fields, is(notNullValue()));
        assertTrue(fields.contains("name"));
        assertEquals(1, fields.size());
    }

    //BaseRock generated method id: ${testOpenapiRequiredFieldsInitialization}, hash: C814B7E9DAA514B4A50DABEADD001D86
    @Test
    void testOpenapiRequiredFieldsInitialization() {
        Set<String> requiredFields = V1PodOS.openapiRequiredFields;
        assertThat(requiredFields, is(notNullValue()));
        assertTrue(requiredFields.contains("name"));
        assertEquals(1, requiredFields.size());
    }

    //BaseRock generated method id: ${testValidateJsonElementWithValidJson}, hash: EFD85DDFF539C39767448BA743833913
    @Test
    void testValidateJsonElementWithValidJson() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "linux");
        // This should not throw an exception
        V1PodOS.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testValidateJsonElementWithNullJson}, hash: D3C3CE19794D7D959560D7B6F3315864
    @Test
    void testValidateJsonElementWithNullJson() {
        JsonElement jsonElement = null;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> V1PodOS.validateJsonElement(jsonElement));
        assertTrue(exception.getMessage().contains("The required field(s) [name] in V1PodOS is not found in the empty JSON string"));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithMissingRequiredField}, hash: 79F0C3D93ABCE9FCA17885119B73EB54
    @Test
    void testValidateJsonElementWithMissingRequiredField() {
        JsonObject jsonObject = new JsonObject();
        // Missing required "name" field
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> V1PodOS.validateJsonElement(jsonObject));
        assertTrue(exception.getMessage().contains("The required field `name` is not found in the JSON string"));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithUnknownField}, hash: D661BC6F43EB1E8EE01AD6B064386A93
    @Test
    void testValidateJsonElementWithUnknownField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "linux");
        jsonObject.addProperty("unknownField", "value");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> V1PodOS.validateJsonElement(jsonObject));
        assertTrue(exception.getMessage().contains("The field `unknownField` in the JSON string is not defined in the `V1PodOS` properties"));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithNonPrimitiveName}, hash: DC87A90B68A563EB54941D90792B4F32
    @Test
    void testValidateJsonElementWithNonPrimitiveName() {
        JsonObject jsonObject = new JsonObject();
        JsonObject nameObject = new JsonObject();
        nameObject.addProperty("subfield", "value");
        jsonObject.add("name", nameObject);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> V1PodOS.validateJsonElement(jsonObject));
        assertTrue(exception.getMessage().contains("Expected the field `name` to be a primitive type in the JSON string"));
    }

    //BaseRock generated method id: ${testCustomTypeAdapterFactory}, hash: 09AF63DB3CC01780DE851AF813ECB1BC
    @Test
    void testCustomTypeAdapterFactory() {
        V1PodOS.CustomTypeAdapterFactory factory = new V1PodOS.CustomTypeAdapterFactory();
        assertThat(factory, is(notNullValue()));
        // Test with correct type
        assertTrue(factory.create(Mockito.mock(com.google.gson.Gson.class), com.google.gson.reflect.TypeToken.get(V1PodOS.class)) != null);
        // Test with incorrect type
        assertThat(factory.create(Mockito.mock(com.google.gson.Gson.class), com.google.gson.reflect.TypeToken.get(String.class)), is(nullValue()));
    }

    //BaseRock generated method id: ${testFromJsonWithValidJsonString}, hash: 0529CFC4052BA5A6988D0ED376B56D05
    @Test
    void testFromJsonWithValidJsonString() throws IOException {
        String jsonString = "{\"name\":\"linux\"}";
        V1PodOS podOS = V1PodOS.fromJson(jsonString);
        assertThat(podOS, is(notNullValue()));
        assertThat(podOS.getName(), is(equalTo("linux")));
    }

    //BaseRock generated method id: ${testFromJsonWithNullJsonString}, hash: 514F903603157AF96DC29B36DA341EB5
    @ParameterizedTest
    @NullSource
    void testFromJsonWithNullJsonString(String jsonString) throws IOException {
        V1PodOS podOS = V1PodOS.fromJson(jsonString);
        assertThat(podOS, is(nullValue()));
    }

    //BaseRock generated method id: ${testToJson}, hash: 6D44AC8082CA14E20C675041A93C1B30
    @Test
    void testToJson() {
        V1PodOS podOS = new V1PodOS().name("linux");
        String jsonString = podOS.toJson();
        assertThat(jsonString, is(notNullValue()));
        assertTrue(jsonString.contains("\"name\":\"linux\""));
    }

    //BaseRock generated method id: ${testJsonSerialization}, hash: 5563301747BD8D46196BD81CF0C3B0CF
    @ParameterizedTest
    @CsvSource({ "linux,linux", "windows,windows", "solaris,solaris" })
    void testJsonSerialization(String osName, String expectedName) throws IOException {
        V1PodOS podOS = new V1PodOS().name(osName);
        String jsonString = podOS.toJson();
        V1PodOS deserializedPodOS = V1PodOS.fromJson(jsonString);
        assertThat(deserializedPodOS, is(notNullValue()));
        assertThat(deserializedPodOS.getName(), is(equalTo(expectedName)));
    }
}
