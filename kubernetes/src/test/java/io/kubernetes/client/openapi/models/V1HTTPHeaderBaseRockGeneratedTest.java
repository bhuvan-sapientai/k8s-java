package io.kubernetes.client.openapi.models;

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
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1HTTPHeaderBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: E04565B05E7828C46E7BF4111CF55008
    @Test
    void testConstructor() {
        V1HTTPHeader header = new V1HTTPHeader();
        assertNotNull(header);
    }

    //BaseRock generated method id: ${testNameSetter}, hash: 756046AFA88AB06640802E9051D4A4F1
    @Test
    void testNameSetter() {
        V1HTTPHeader header = new V1HTTPHeader();
        header.setName("Content-Type");
        assertEquals("Content-Type", header.getName());
    }

    //BaseRock generated method id: ${testValueSetter}, hash: C265168AB758306F50571C7EFA9A1511
    @Test
    void testValueSetter() {
        V1HTTPHeader header = new V1HTTPHeader();
        header.setValue("application/json");
        assertEquals("application/json", header.getValue());
    }

    //BaseRock generated method id: ${testNameGetter}, hash: 0762179B4BE484F9DB14F710A61745F9
    @Test
    void testNameGetter() {
        V1HTTPHeader header = new V1HTTPHeader();
        header.setName("Accept");
        assertEquals("Accept", header.getName());
    }

    //BaseRock generated method id: ${testValueGetter}, hash: 1216A99B3CAD217E275ADEE6BBEB145C
    @Test
    void testValueGetter() {
        V1HTTPHeader header = new V1HTTPHeader();
        header.setValue("text/html");
        assertEquals("text/html", header.getValue());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 6431E2A7FA53D72BB75539C7CF3EE060
    @Test
    void testEqualsWithSameObject() {
        V1HTTPHeader header = new V1HTTPHeader().name("Authorization").value("Bearer token");
        assertTrue(header.equals(header));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 24D1A9C3A3D99C5B7776A4A964B1CDA0
    @Test
    void testEqualsWithDifferentClass() {
        V1HTTPHeader header = new V1HTTPHeader().name("Authorization").value("Bearer token");
        assertFalse(header.equals("Not a V1HTTPHeader"));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObjects}, hash: EA55FBDBF2933FBC5DF34ED3E4BAF146
    @Test
    void testEqualsWithDifferentObjects() {
        V1HTTPHeader header1 = new V1HTTPHeader().name("Authorization").value("Bearer token1");
        V1HTTPHeader header2 = new V1HTTPHeader().name("Authorization").value("Bearer token2");
        assertFalse(header1.equals(header2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: C6798A0D73425396E85D2029E5B4D33C
    @Test
    void testHashCode() {
        V1HTTPHeader header1 = new V1HTTPHeader().name("Authorization").value("Bearer token");
        V1HTTPHeader header2 = new V1HTTPHeader().name("Authorization").value("Bearer token");
        assertEquals(header1.hashCode(), header2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 316541D636741F680D48922FEDB1D4E6
    @Test
    void testToString() {
        V1HTTPHeader header = new V1HTTPHeader().name("Content-Type").value("application/json");
        String expected = "class V1HTTPHeader {\n    name: Content-Type\n    value: application/json\n}";
        assertEquals(expected, header.toString());
    }

    //BaseRock generated method id: ${testBuilder}, hash: F67373A00D4B8F8ED886BB2871F05DA4
    @Test
    void testBuilder() {
        V1HTTPHeader header = new V1HTTPHeader().name("Accept").value("application/xml");
        assertEquals("Accept", header.getName());
        assertEquals("application/xml", header.getValue());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 2448F1060BFFCC3B0518C3955592F26A
    @ParameterizedTest
    @ValueSource(strings = { "name", "value" })
    void testValidateJsonElement(String field) throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "Content-Type");
        jsonObject.addProperty("value", "application/json");
        try (MockedStatic<V1HTTPHeader> mockedStatic = mockStatic(V1HTTPHeader.class)) {
            mockedStatic.when(() -> V1HTTPHeader.validateJsonElement(any(JsonElement.class))).thenCallRealMethod();
            assertDoesNotThrow(() -> V1HTTPHeader.validateJsonElement(jsonObject));
            jsonObject.remove(field);
            assertThrows(IllegalArgumentException.class, () -> V1HTTPHeader.validateJsonElement(jsonObject));
        }
    }

    //BaseRock generated method id: ${testFromJson}, hash: 38E7C994A3E8DC834968B1B01698C3D9
    @Test
    void testFromJson() throws IOException {
        String json = "{\"name\":\"Content-Type\",\"value\":\"application/json\"}";
        V1HTTPHeader header = V1HTTPHeader.fromJson(json);
        assertEquals("Content-Type", header.getName());
        assertEquals("application/json", header.getValue());
    }

    //BaseRock generated method id: ${testToJson}, hash: DC2DE14BA87ED93BFE4179E0C117D8B3
    @Test
    void testToJson() {
        V1HTTPHeader header = new V1HTTPHeader().name("Content-Type").value("application/json");
        String json = header.toJson();
        assertTrue(json.contains("\"name\":\"Content-Type\""));
        assertTrue(json.contains("\"value\":\"application/json\""));
    }
}
