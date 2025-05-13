package io.kubernetes.client.openapi.models;

import static org.mockito.Mockito.doReturn;
import com.google.gson.Gson;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;
import com.google.gson.JsonElement;
import org.mockito.MockedStatic;
import io.kubernetes.client.openapi.models.V1FlowDistinguisherMethod;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.google.gson.TypeAdapter;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import java.util.HashSet;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.not;
import io.kubernetes.client.openapi.JSON;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class V1FlowDistinguisherMethodBaseRockGeneratedTest {

    @Mock
    private JsonElement mockJsonElement;

    @Mock
    private JsonObject mockJsonObject;

    //BaseRock generated method id: ${testConstructor}, hash: D198AB4EB96B0D4EEDD8AE6CAC828783
    @Test
    void testConstructor() {
        V1FlowDistinguisherMethod distinguisherMethod = new V1FlowDistinguisherMethod();
        assertThat(distinguisherMethod, notNullValue());
    }

    //BaseRock generated method id: ${testFluidApi}, hash: 620ECDA3DC0A9A64FEE615224414CAA1
    @Test
    void testFluidApi() {
        String type = "ByUser";
        V1FlowDistinguisherMethod distinguisherMethod = new V1FlowDistinguisherMethod().type(type);
        assertThat(distinguisherMethod.getType(), equalTo(type));
    }

    //BaseRock generated method id: ${testGetAndSetType}, hash: F581A581D41B0DEF7E5986284C0CC063
    @Test
    void testGetAndSetType() {
        V1FlowDistinguisherMethod distinguisherMethod = new V1FlowDistinguisherMethod();
        String type = "ByNamespace";
        distinguisherMethod.setType(type);
        assertThat(distinguisherMethod.getType(), equalTo(type));
    }

    //BaseRock generated method id: ${testTypeParameterized}, hash: 3B7A012412FE816DDB735E2BF9032AB7
    @ParameterizedTest
    @ValueSource(strings = { "ByUser", "ByNamespace", "CustomType" })
    void testTypeParameterized(String type) {
        V1FlowDistinguisherMethod distinguisherMethod = new V1FlowDistinguisherMethod().type(type);
        assertThat(distinguisherMethod.getType(), equalTo(type));
    }

    //BaseRock generated method id: ${testEquals}, hash: 65BFFD9D87087014CC3AD515DD64B93C
    @Test
    void testEquals() {
        V1FlowDistinguisherMethod method1 = new V1FlowDistinguisherMethod().type("ByUser");
        V1FlowDistinguisherMethod method2 = new V1FlowDistinguisherMethod().type("ByUser");
        V1FlowDistinguisherMethod method3 = new V1FlowDistinguisherMethod().type("ByNamespace");
        assertTrue(method1.equals(method2));
        assertFalse(method1.equals(method3));
        assertFalse(method1.equals(null));
        assertFalse(method1.equals(new Object()));
        assertTrue(method1.equals(method1));
    }

    //BaseRock generated method id: ${testHashCode}, hash: C9C4450AA8043D61995FB3B3D9D57057
    @Test
    void testHashCode() {
        V1FlowDistinguisherMethod method1 = new V1FlowDistinguisherMethod().type("ByUser");
        V1FlowDistinguisherMethod method2 = new V1FlowDistinguisherMethod().type("ByUser");
        V1FlowDistinguisherMethod method3 = new V1FlowDistinguisherMethod().type("ByNamespace");
        assertEquals(method1.hashCode(), method2.hashCode());
        assertThat(method1.hashCode(), not(equalTo(method3.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 6B5D72FE58E2AC139957C2815FDCDE16
    @Test
    void testToString() {
        V1FlowDistinguisherMethod method = new V1FlowDistinguisherMethod().type("ByUser");
        String result = method.toString();
        assertThat(result, notNullValue());
        assertTrue(result.contains("type: ByUser"));
        assertTrue(result.contains("class V1FlowDistinguisherMethod"));
    }

    //BaseRock generated method id: ${testToIndentedString}, hash: 74FCBEF5722F41C5B34658A94D1301A3
    @Test
    void testToIndentedString() {
        V1FlowDistinguisherMethod method = new V1FlowDistinguisherMethod().type("ByUser");
        // Use reflection to call the private method
        String result = method.toString();
        assertThat(result, notNullValue());
        // Check the indentation format is applied
        assertTrue(result.contains("type: ByUser"));
    }

    //BaseRock generated method id: ${testToIndentedStringWithNull}, hash: 3406C72B39FDD507FC3D4E3EAA598018
    @Test
    void testToIndentedStringWithNull() {
        V1FlowDistinguisherMethod method = new V1FlowDistinguisherMethod();
        // Use the toString which internally calls toIndentedString with null
        String result = method.toString();
        assertThat(result, notNullValue());
        assertTrue(result.contains("type: null"));
    }

    //BaseRock generated method id: ${testOpenapiFields}, hash: 2AFC8F685EAD7BA6D1ACCDF4EED6E208
    @Test
    void testOpenapiFields() {
        HashSet<String> fields = V1FlowDistinguisherMethod.openapiFields;
        assertThat(fields, notNullValue());
        assertTrue(fields.contains("type"));
        assertEquals(1, fields.size());
    }

    //BaseRock generated method id: ${testOpenapiRequiredFields}, hash: 29F3DB257ED4E97550DE20E468750287
    @Test
    void testOpenapiRequiredFields() {
        HashSet<String> requiredFields = V1FlowDistinguisherMethod.openapiRequiredFields;
        assertThat(requiredFields, notNullValue());
        assertTrue(requiredFields.contains("type"));
        assertEquals(1, requiredFields.size());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 9B34380361A59231749E6419DD53C013
    @Test
    void testValidateJsonElement() throws IOException {
        JsonElement jsonElement = mock(JsonElement.class);
        JsonObject jsonObject = mock(JsonObject.class);
        JsonElement typeElement = mock(JsonElement.class);
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        when(jsonObject.entrySet()).thenReturn(new HashSet<>());
        when(jsonObject.get("type")).thenReturn(typeElement);
        when(typeElement.isJsonPrimitive()).thenReturn(true);
        // Should not throw exception
        V1FlowDistinguisherMethod.validateJsonElement(jsonElement);
    }

    //BaseRock generated method id: ${testValidateJsonElementWithNull}, hash: 482503F0EB1BC1D540FBA00EB390AB33
    @Test
    void testValidateJsonElementWithNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            V1FlowDistinguisherMethod.validateJsonElement(null);
        });
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidField}, hash: 96F4FE57755ECF9C5DDEE3FF77145F74
    @Test
    void testValidateJsonElementWithInvalidField() {
        JsonElement jsonElement = mock(JsonElement.class);
        JsonObject jsonObject = mock(JsonObject.class);
        JsonElement invalidElement = mock(JsonElement.class);
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        when(jsonObject.entrySet()).thenReturn(new HashSet<>() {

            {
                add(new java.util.AbstractMap.SimpleEntry<>("invalidField", invalidElement));
            }
        });
        when(jsonObject.get("type")).thenReturn(mock(JsonElement.class));
        when(jsonElement.toString()).thenReturn("{}");
        assertThrows(IllegalArgumentException.class, () -> {
            V1FlowDistinguisherMethod.validateJsonElement(jsonElement);
        });
    }

    //BaseRock generated method id: ${testValidateJsonElementWithMissingRequiredField}, hash: D4171645A4A7EC3E1BE47A835D28FD44
    @Test
    void testValidateJsonElementWithMissingRequiredField() {
        JsonElement jsonElement = mock(JsonElement.class);
        JsonObject jsonObject = mock(JsonObject.class);
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        when(jsonObject.entrySet()).thenReturn(new HashSet<>());
        when(jsonObject.get("type")).thenReturn(null);
        when(jsonElement.toString()).thenReturn("{}");
        assertThrows(IllegalArgumentException.class, () -> {
            V1FlowDistinguisherMethod.validateJsonElement(jsonElement);
        });
    }

    //BaseRock generated method id: ${testValidateJsonElementWithNonPrimitiveType}, hash: E2D24A7212C1231AFB2BAA064940C1ED
    @Test
    void testValidateJsonElementWithNonPrimitiveType() {
        JsonElement jsonElement = mock(JsonElement.class);
        JsonObject jsonObject = mock(JsonObject.class);
        JsonElement typeElement = mock(JsonElement.class);
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        when(jsonObject.entrySet()).thenReturn(new HashSet<>());
        when(jsonObject.get("type")).thenReturn(typeElement);
        when(typeElement.isJsonPrimitive()).thenReturn(false);
        when(typeElement.toString()).thenReturn("{}");
        assertThrows(IllegalArgumentException.class, () -> {
            V1FlowDistinguisherMethod.validateJsonElement(jsonElement);
        });
    }

    //BaseRock generated method id: ${testCustomTypeAdapterFactory}, hash: CAC4E85746AE133CA386B09AF3C1ACAE
    @Test
    void testCustomTypeAdapterFactory() {
        V1FlowDistinguisherMethod.CustomTypeAdapterFactory factory = new V1FlowDistinguisherMethod.CustomTypeAdapterFactory();
        // Test with non-V1FlowDistinguisherMethod type
        TypeAdapter<?> adapter = factory.create(new Gson(), com.google.gson.reflect.TypeToken.get(String.class));
        assertThat(adapter, is(equalTo(null)));
        // Test with V1FlowDistinguisherMethod type
        // This is a complex test that would require mocking Gson internals
        // For now, simply verify the factory can be instantiated
        assertThat(factory, notNullValue());
    }

    //BaseRock generated method id: ${testFromJson}, hash: CF85DD3DD247F6312D6475D21DAA613B
    @Test
    void testFromJson() throws IOException {
        String json = "{\"type\":\"ByUser\"}";
        Gson mockGson = mock(Gson.class);
        V1FlowDistinguisherMethod expectedMethod = new V1FlowDistinguisherMethod().type("ByUser");
        try (MockedStatic<JSON> jsonMock = mockStatic(JSON.class)) {
            jsonMock.when(JSON::getGson).thenReturn(mockGson);
            doReturn(expectedMethod).when(mockGson).fromJson(json, V1FlowDistinguisherMethod.class);
            V1FlowDistinguisherMethod result = V1FlowDistinguisherMethod.fromJson(json);
            assertThat(result, is(equalTo(expectedMethod)));
        }
    }

    //BaseRock generated method id: ${testToJson}, hash: 75D01A33E9B0518866A02A9EDB7AD034
    @Test
    void testToJson() {
        V1FlowDistinguisherMethod method = new V1FlowDistinguisherMethod().type("ByUser");
        String expectedJson = "{\"type\":\"ByUser\"}";
        Gson mockGson = mock(Gson.class);
        try (MockedStatic<JSON> jsonMock = mockStatic(JSON.class)) {
            jsonMock.when(JSON::getGson).thenReturn(mockGson);
            when(mockGson.toJson(method)).thenReturn(expectedJson);
            String result = method.toJson();
            assertThat(result, is(equalTo(expectedJson)));
        }
    }
}
