package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import com.google.gson.Gson;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import java.util.HashSet;
import java.util.Set;
import org.mockito.MockitoAnnotations;
import com.google.gson.JsonObject;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import io.kubernetes.client.openapi.JSON;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1TypedObjectReferenceBaseRockGeneratedTest {

    private V1TypedObjectReference v1TypedObjectReference;

    @Mock
    private JSON jsonMock;

    @Mock
    private Gson gsonMock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        v1TypedObjectReference = new V1TypedObjectReference();
    }

    //BaseRock generated method id: ${testV1TypedObjectReference}, hash: AE05191E4D48D8AE12FD0FC13374E1C9
    @Test
    void testV1TypedObjectReference() {
        assertNotNull(v1TypedObjectReference);
    }

    //BaseRock generated method id: ${testApiGroup}, hash: D77BE99D2A93AFA1FBA358F6FE66F59F
    @Test
    void testApiGroup() {
        String apiGroup = "test-api-group";
        v1TypedObjectReference.setApiGroup(apiGroup);
        assertEquals(apiGroup, v1TypedObjectReference.getApiGroup());
    }

    //BaseRock generated method id: ${testKind}, hash: 67CDA2FA804FE691908696793FC6EE3E
    @Test
    void testKind() {
        String kind = "test-kind";
        v1TypedObjectReference.setKind(kind);
        assertEquals(kind, v1TypedObjectReference.getKind());
    }

    //BaseRock generated method id: ${testName}, hash: 0C14A61305A0C50864832F9F32EE708F
    @Test
    void testName() {
        String name = "test-name";
        v1TypedObjectReference.setName(name);
        assertEquals(name, v1TypedObjectReference.getName());
    }

    //BaseRock generated method id: ${testNamespace}, hash: 6F3D64F358FBFCEA3637BB0FA2602B6C
    @Test
    void testNamespace() {
        String namespace = "test-namespace";
        v1TypedObjectReference.setNamespace(namespace);
        assertEquals(namespace, v1TypedObjectReference.getNamespace());
    }

    //BaseRock generated method id: ${testEquals}, hash: 5431A57AAFCE44D1E846A142636EBCF0
    @Test
    void testEquals() {
        V1TypedObjectReference other = new V1TypedObjectReference().apiGroup("test-api-group").kind("test-kind").name("test-name").namespace("test-namespace");
        v1TypedObjectReference.setApiGroup("test-api-group");
        v1TypedObjectReference.setKind("test-kind");
        v1TypedObjectReference.setName("test-name");
        v1TypedObjectReference.setNamespace("test-namespace");
        assertTrue(v1TypedObjectReference.equals(other));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 565C9096DBC3DF9153E49968C8BF1C69
    @Test
    void testHashCode() {
        V1TypedObjectReference other = new V1TypedObjectReference().apiGroup("test-api-group").kind("test-kind").name("test-name").namespace("test-namespace");
        v1TypedObjectReference.setApiGroup("test-api-group");
        v1TypedObjectReference.setKind("test-kind");
        v1TypedObjectReference.setName("test-name");
        v1TypedObjectReference.setNamespace("test-namespace");
        assertEquals(v1TypedObjectReference.hashCode(), other.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 1A96CDCD5DB6DEB5474D8C8DC6C327B0
    @Test
    void testToString() {
        v1TypedObjectReference.setApiGroup("test-api-group");
        v1TypedObjectReference.setKind("test-kind");
        v1TypedObjectReference.setName("test-name");
        v1TypedObjectReference.setNamespace("test-namespace");
        String expected = "class V1TypedObjectReference {\n" + "    apiGroup: test-api-group\n" + "    kind: test-kind\n" + "    name: test-name\n" + "    namespace: test-namespace\n" + "}";
        assertEquals(expected, v1TypedObjectReference.toString());
    }

    //BaseRock generated method id: ${testToJson}, hash: 60AA014886DC1B0EC5DC812F07262E12
    @Test
    void testToJson() throws IOException {
        v1TypedObjectReference.setApiGroup("test-api-group");
        v1TypedObjectReference.setKind("test-kind");
        v1TypedObjectReference.setName("test-name");
        v1TypedObjectReference.setNamespace("test-namespace");
        try (MockedStatic<JSON> jsonStaticMock = mockStatic(JSON.class)) {
            jsonStaticMock.when(JSON::getGson).thenReturn(gsonMock);
            when(gsonMock.toJson(v1TypedObjectReference)).thenReturn("mocked json");
            assertEquals("mocked json", v1TypedObjectReference.toJson());
        }
    }

    //BaseRock generated method id: ${testFromJson}, hash: C2A644C1156F273890E21889C9744B3D
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiGroup\":\"test-api-group\",\"kind\":\"test-kind\",\"name\":\"test-name\",\"namespace\":\"test-namespace\"}";
        try (MockedStatic<JSON> jsonStaticMock = mockStatic(JSON.class)) {
            jsonStaticMock.when(JSON::getGson).thenReturn(gsonMock);
            when(gsonMock.fromJson(json, V1TypedObjectReference.class)).thenReturn(v1TypedObjectReference);
            V1TypedObjectReference result = V1TypedObjectReference.fromJson(json);
            assertNotNull(result);
            assertEquals(v1TypedObjectReference, result);
        }
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 2D406A9097DC6BBF16AFEB9BFD9D9A69
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("kind", "test-kind");
        jsonObject.addProperty("name", "test-name");
        assertDoesNotThrow(() -> V1TypedObjectReference.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementMissingRequiredField}, hash: 643E8B72CB322D7ECE4F1805A83351A7
    @Test
    void testValidateJsonElementMissingRequiredField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("kind", "test-kind");
        assertThrows(IllegalArgumentException.class, () -> V1TypedObjectReference.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementInvalidFieldType}, hash: DF15A12FDD05A9A7B6AF1D6170AD5CD2
    @ParameterizedTest
    @ValueSource(strings = { "apiGroup", "kind", "name", "namespace" })
    void testValidateJsonElementInvalidFieldType(String fieldName) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("kind", "test-kind");
        jsonObject.addProperty("name", "test-name");
        jsonObject.add(fieldName, new JsonObject());
        assertThrows(IllegalArgumentException.class, () -> V1TypedObjectReference.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementAdditionalField}, hash: 7A4B401B01A650E68559DC4FE499D204
    @Test
    void testValidateJsonElementAdditionalField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("kind", "test-kind");
        jsonObject.addProperty("name", "test-name");
        jsonObject.addProperty("additionalField", "value");
        assertThrows(IllegalArgumentException.class, () -> V1TypedObjectReference.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testOpenapiRequiredFields}, hash: 8A4A32CB8087B117ECF0D43018CF3C7F
    @Test
    void testOpenapiRequiredFields() {
        Set<String> requiredFields = V1TypedObjectReference.openapiRequiredFields;
        assertNotNull(requiredFields);
        assertEquals(2, requiredFields.size());
        assertTrue(requiredFields.contains("kind"));
        assertTrue(requiredFields.contains("name"));
    }

    //BaseRock generated method id: ${testOpenapiFields}, hash: F1BA5F4E35EDCDFABBAA11AFF3CEADE4
    @Test
    void testOpenapiFields() {
        Set<String> fields = V1TypedObjectReference.openapiFields;
        assertNotNull(fields);
        assertEquals(4, fields.size());
        assertTrue(fields.contains("apiGroup"));
        assertTrue(fields.contains("kind"));
        assertTrue(fields.contains("name"));
        assertTrue(fields.contains("namespace"));
    }
}
