package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonObject;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1NonResourceAttributesBaseRockGeneratedTest {

    private V1NonResourceAttributes attributes;

    @BeforeEach
    void setUp() {
        attributes = new V1NonResourceAttributes();
    }

    //BaseRock generated method id: ${testConstructor}, hash: C7B2B61221DB033973200C1C67AECE81
    @Test
    void testConstructor() {
        assertNotNull(attributes);
    }

    //BaseRock generated method id: ${testPath}, hash: AAF6961419169EA7798F382EAA9C6A0F
    @ParameterizedTest
    @ValueSource(strings = { "path1", "path2", "/api/v1" })
    void testPath(String path) {
        V1NonResourceAttributes result = attributes.path(path);
        assertEquals(path, attributes.getPath());
        assertSame(attributes, result);
    }

    //BaseRock generated method id: ${testPathEdgeCases}, hash: 405C14F9B735F8B7EB09274A79C4BF8D
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { " " })
    void testPathEdgeCases(String path) {
        V1NonResourceAttributes result = attributes.path(path);
        assertEquals(path, attributes.getPath());
        assertSame(attributes, result);
    }

    //BaseRock generated method id: ${testVerb}, hash: 10BEFBCAD3E435C99FA78569922858AD
    @ParameterizedTest
    @ValueSource(strings = { "GET", "POST", "PUT", "DELETE" })
    void testVerb(String verb) {
        V1NonResourceAttributes result = attributes.verb(verb);
        assertEquals(verb, attributes.getVerb());
        assertSame(attributes, result);
    }

    //BaseRock generated method id: ${testVerbEdgeCases}, hash: 598C98C44CD639E55D258D1AF6438DF6
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { " " })
    void testVerbEdgeCases(String verb) {
        V1NonResourceAttributes result = attributes.verb(verb);
        assertEquals(verb, attributes.getVerb());
        assertSame(attributes, result);
    }

    //BaseRock generated method id: ${testEquals}, hash: E878F19B4F64601AC92F7FD3D310FB65
    @Test
    void testEquals() {
        V1NonResourceAttributes attr1 = new V1NonResourceAttributes().path("/api").verb("GET");
        V1NonResourceAttributes attr2 = new V1NonResourceAttributes().path("/api").verb("GET");
        V1NonResourceAttributes attr3 = new V1NonResourceAttributes().path("/api/v1").verb("POST");
        assertTrue(attr1.equals(attr2));
        assertTrue(attr2.equals(attr1));
        assertFalse(attr1.equals(attr3));
        assertFalse(attr1.equals(null));
        assertFalse(attr1.equals(new Object()));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 84D15C7E6E9C77B08582AC6055FCA404
    @Test
    void testHashCode() {
        V1NonResourceAttributes attr1 = new V1NonResourceAttributes().path("/api").verb("GET");
        V1NonResourceAttributes attr2 = new V1NonResourceAttributes().path("/api").verb("GET");
        V1NonResourceAttributes attr3 = new V1NonResourceAttributes().path("/api/v1").verb("POST");
        assertEquals(attr1.hashCode(), attr2.hashCode());
        assertNotEquals(attr1.hashCode(), attr3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 337F1ED549A562E7BDCD014F4613E3CF
    @Test
    void testToString() {
        V1NonResourceAttributes attr = new V1NonResourceAttributes().path("/api").verb("GET");
        String result = attr.toString();
        assertTrue(result.contains("path: /api"));
        assertTrue(result.contains("verb: GET"));
    }

    //BaseRock generated method id: ${testToIndentedString}, hash: 2DACA018C3534E4319661C623406ED01
    @Test
    void testToIndentedString() {
        V1NonResourceAttributes attr = new V1NonResourceAttributes().path("/api").verb("GET");
        String result = attr.toString();
        assertTrue(result.contains("    path: /api"));
        assertTrue(result.contains("    verb: GET"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 7AD08A946DBB1C794AB864BEEC56F9E7
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("path", "/api");
        jsonObject.addProperty("verb", "GET");
        try (MockedStatic<V1NonResourceAttributes> mockedStatic = mockStatic(V1NonResourceAttributes.class)) {
            V1NonResourceAttributes.validateJsonElement(jsonObject);
            mockedStatic.verify(() -> V1NonResourceAttributes.validateJsonElement(jsonObject));
        }
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidField}, hash: BC37A18E707075507240CB28785C13D7
    @Test
    void testValidateJsonElementWithInvalidField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("invalidField", "value");
        assertThrows(IllegalArgumentException.class, () -> V1NonResourceAttributes.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithNonPrimitiveFields}, hash: 9CC287CC7E7F654CE31EE9A9FA8D079C
    @Test
    void testValidateJsonElementWithNonPrimitiveFields() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("path", new JsonObject());
        jsonObject.add("verb", new JsonObject());
        assertThrows(IllegalArgumentException.class, () -> V1NonResourceAttributes.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 6DE06A97D125850795A87278FF1CDE59
    @Test
    void testFromJson() throws IOException {
        String json = "{\"path\":\"/api\",\"verb\":\"GET\"}";
        V1NonResourceAttributes result = V1NonResourceAttributes.fromJson(json);
        assertEquals("/api", result.getPath());
        assertEquals("GET", result.getVerb());
    }

    //BaseRock generated method id: ${testToJson}, hash: EA6E9BC87AD6ADB1A8C3DC289B944BBE
    @Test
    void testToJson() {
        V1NonResourceAttributes attr = new V1NonResourceAttributes().path("/api").verb("GET");
        String json = attr.toJson();
        assertTrue(json.contains("\"path\":\"/api\""));
        assertTrue(json.contains("\"verb\":\"GET\""));
    }
}
