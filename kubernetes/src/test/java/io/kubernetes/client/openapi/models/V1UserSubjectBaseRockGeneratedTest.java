package io.kubernetes.client.openapi.models;

import com.google.gson.Gson;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
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
class V1UserSubjectBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 31D2B73B49354D73024090E1C35CCE8A
    @Test
    void testConstructor() {
        V1UserSubject userSubject = new V1UserSubject();
        assertNotNull(userSubject);
    }

    //BaseRock generated method id: ${testNameSetter}, hash: 6352F36B7E803879382E84E557C10164
    @Test
    void testNameSetter() {
        V1UserSubject userSubject = new V1UserSubject();
        userSubject.setName("testUser");
        assertEquals("testUser", userSubject.getName());
    }

    //BaseRock generated method id: ${testNameGetter}, hash: 0FAC6C85B6D308B0E77E0F2E36CF7A31
    @Test
    void testNameGetter() {
        V1UserSubject userSubject = new V1UserSubject();
        userSubject.setName("testUser");
        assertEquals("testUser", userSubject.getName());
    }

    //BaseRock generated method id: ${testEquals}, hash: ED25B4569B3FFA29E5571F770CE54127
    @Test
    void testEquals() {
        V1UserSubject userSubject1 = new V1UserSubject().name("testUser");
        V1UserSubject userSubject2 = new V1UserSubject().name("testUser");
        V1UserSubject userSubject3 = new V1UserSubject().name("otherUser");
        assertTrue(userSubject1.equals(userSubject2));
        assertFalse(userSubject1.equals(userSubject3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 21D062BCFF255A4D55D3B4CF5326B2FC
    @Test
    void testHashCode() {
        V1UserSubject userSubject1 = new V1UserSubject().name("testUser");
        V1UserSubject userSubject2 = new V1UserSubject().name("testUser");
        assertEquals(userSubject1.hashCode(), userSubject2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: B7E7067D6F1492A03CDCC590C06AB848
    @Test
    void testToString() {
        V1UserSubject userSubject = new V1UserSubject().name("testUser");
        String expected = "class V1UserSubject {\n    name: testUser\n}";
        assertEquals(expected, userSubject.toString());
    }

    //BaseRock generated method id: ${testNameFluentSetter}, hash: E9C6EC9E194CF1A62B96BBD2EAD3071D
    @ParameterizedTest
    @ValueSource(strings = { "user1", "user2", "*" })
    void testNameFluentSetter(String name) {
        V1UserSubject userSubject = new V1UserSubject().name(name);
        assertEquals(name, userSubject.getName());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 7441F6B95629C3AAA47340C1E9ABC0AF
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "testUser");
        try (MockedStatic<V1UserSubject> mockedStatic = mockStatic(V1UserSubject.class)) {
            V1UserSubject.validateJsonElement(jsonObject);
            mockedStatic.verify(() -> V1UserSubject.validateJsonElement(jsonObject));
        }
    }

    //BaseRock generated method id: ${testValidateJsonElementMissingRequired}, hash: 62B8128DF7310ABB59434BC55D89D0E1
    @Test
    void testValidateJsonElementMissingRequired() {
        JsonObject jsonObject = new JsonObject();
        assertThrows(IllegalArgumentException.class, () -> V1UserSubject.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testFromJson}, hash: E0F94556F4CDF3162815E51572FBE43A
    @Test
    void testFromJson() throws IOException {
        String json = "{\"name\":\"testUser\"}";
        try (MockedStatic<JSON> mockedStatic = mockStatic(JSON.class)) {
            Gson mockGson = mock(Gson.class);
            when(JSON.getGson()).thenReturn(mockGson);
            when(mockGson.fromJson(eq(json), eq(V1UserSubject.class))).thenReturn(new V1UserSubject().name("testUser"));
            V1UserSubject result = V1UserSubject.fromJson(json);
            assertEquals("testUser", result.getName());
        }
    }

    //BaseRock generated method id: ${testToJson}, hash: F3E968F30D8361CBB8EC9896F9CB4D90
    @Test
    void testToJson() {
        V1UserSubject userSubject = new V1UserSubject().name("testUser");
        try (MockedStatic<JSON> mockedStatic = mockStatic(JSON.class)) {
            Gson mockGson = mock(Gson.class);
            when(JSON.getGson()).thenReturn(mockGson);
            when(mockGson.toJson(userSubject)).thenReturn("{\"name\":\"testUser\"}");
            String result = userSubject.toJson();
            assertEquals("{\"name\":\"testUser\"}", result);
        }
    }

    //BaseRock generated method id: ${testCustomTypeAdapterFactory}, hash: 70830786D97492A4DCD240FA721D95A1
    @Test
    void testCustomTypeAdapterFactory() {
        V1UserSubject.CustomTypeAdapterFactory factory = new V1UserSubject.CustomTypeAdapterFactory();
        assertNotNull(factory);
    }
}
