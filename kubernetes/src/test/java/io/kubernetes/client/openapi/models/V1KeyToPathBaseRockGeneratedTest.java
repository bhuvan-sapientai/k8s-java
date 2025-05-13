package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import com.google.gson.JsonPrimitive;
import org.junit.jupiter.api.BeforeEach;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import com.google.gson.JsonElement;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1KeyToPathBaseRockGeneratedTest {

    private V1KeyToPath v1KeyToPath;

    @BeforeEach
    void setUp() {
        v1KeyToPath = new V1KeyToPath();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 8D7A7544A7145CE902E011243C8F3A5A
    @Test
    void testConstructor() {
        assertNotNull(v1KeyToPath);
    }

    //BaseRock generated method id: ${testKey}, hash: 978EFFC50945AB682388A85DA7867E0E
    @Test
    void testKey() {
        String key = "testKey";
        assertEquals(v1KeyToPath, v1KeyToPath.key(key));
        assertEquals(key, v1KeyToPath.getKey());
    }

    //BaseRock generated method id: ${testMode}, hash: 613E368493FF6572E660188D3B2CD9BE
    @Test
    void testMode() {
        Integer mode = 511;
        assertEquals(v1KeyToPath, v1KeyToPath.mode(mode));
        assertEquals(mode, v1KeyToPath.getMode());
    }

    //BaseRock generated method id: ${testPath}, hash: 952EC1FA844B9B1B05BD4F5D0719E6A9
    @Test
    void testPath() {
        String path = "testPath";
        assertEquals(v1KeyToPath, v1KeyToPath.path(path));
        assertEquals(path, v1KeyToPath.getPath());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 35C8FD90C466804864427881B6F1EE6B
    @Test
    void testEqualsAndHashCode() {
        V1KeyToPath v1KeyToPath2 = new V1KeyToPath().key("testKey").mode(511).path("testPath");
        v1KeyToPath.key("testKey").mode(511).path("testPath");
        assertTrue(v1KeyToPath.equals(v1KeyToPath2) && v1KeyToPath2.equals(v1KeyToPath));
        assertEquals(v1KeyToPath.hashCode(), v1KeyToPath2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 48B3BE60CBE8BA88C9B6E14F179A9FB0
    @Test
    void testToString() {
        v1KeyToPath.key("testKey").mode(511).path("testPath");
        String expected = "class V1KeyToPath {\n    key: testKey\n    mode: 511\n    path: testPath\n}";
        assertEquals(expected, v1KeyToPath.toString());
    }

    //BaseRock generated method id: ${testRequiredFields}, hash: B68BF259FAAAABF6D5A464F9909B99F7
    @ParameterizedTest
    @ValueSource(strings = { "key", "path" })
    void testRequiredFields(String field) {
        try (MockedStatic<JsonElement> jsonElementMockedStatic = mockStatic(JsonElement.class)) {
            JsonObject jsonObject = mock(JsonObject.class);
            when(jsonObject.get(field)).thenReturn(null);
            JsonElement mockJsonElement = mock(JsonElement.class);
            when(mockJsonElement.getAsJsonObject()).thenReturn(jsonObject);
            assertThrows(IllegalArgumentException.class, () -> V1KeyToPath.validateJsonElement(mockJsonElement));
        }
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: B3C887A0EC90A74105422A272B82D848
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = mock(JsonObject.class);
        when(jsonObject.get("key")).thenReturn(new JsonPrimitive("testKey"));
        when(jsonObject.get("path")).thenReturn(new JsonPrimitive("testPath"));
        JsonElement mockJsonElement = mock(JsonElement.class);
        when(mockJsonElement.getAsJsonObject()).thenReturn(jsonObject);
        V1KeyToPath.validateJsonElement(mockJsonElement);
    }

    //BaseRock generated method id: ${testFromJson}, hash: BFB8B93C1644C0F7FEFDEA09CB1099C7
    @Test
    void testFromJson() throws IOException {
        String json = "{\"key\":\"testKey\",\"mode\":511,\"path\":\"testPath\"}";
        V1KeyToPath result = V1KeyToPath.fromJson(json);
        assertEquals("testKey", result.getKey());
        assertEquals(Integer.valueOf(511), result.getMode());
        assertEquals("testPath", result.getPath());
    }

    //BaseRock generated method id: ${testToJson}, hash: D201C0C72D170A501988E009060A46BE
    @Test
    void testToJson() {
        v1KeyToPath.key("testKey").mode(511).path("testPath");
        String expected = "{\"key\":\"testKey\",\"mode\":511,\"path\":\"testPath\"}";
        assertEquals(expected, v1KeyToPath.toJson());
    }
}
