package io.kubernetes.client.custom;

import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import java.io.StringReader;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.stream.JsonReader;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.hamcrest.Matchers.not;
import static org.junit.jupiter.api.Assertions.*;
import java.io.StringWriter;
import org.junit.jupiter.params.provider.ValueSource;
import java.io.IOException;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class IntOrStringBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructorWithString}, hash: D2EC54707E680AC0B311D861EE9878EF
    @Test
    void testConstructorWithString() {
        IntOrString intOrString = new IntOrString("test");
        assertFalse(intOrString.isInteger());
        assertEquals("test", intOrString.getStrValue());
    }

    //BaseRock generated method id: ${testConstructorWithInt}, hash: 7B9971A1D5E0A7F12A280705AEA8A1E9
    @Test
    void testConstructorWithInt() {
        IntOrString intOrString = new IntOrString(42);
        assertTrue(intOrString.isInteger());
        assertEquals(42, intOrString.getIntValue());
    }

    //BaseRock generated method id: ${testIsInteger}, hash: 3DDAABE3C99E028D9693B5D7E032399F
    @Test
    void testIsInteger() {
        IntOrString stringValue = new IntOrString("test");
        IntOrString intValue = new IntOrString(42);
        assertFalse(stringValue.isInteger());
        assertTrue(intValue.isInteger());
    }

    //BaseRock generated method id: ${testGetStrValue}, hash: 78C377A39B8986FAE3828C54C43E9E29
    @Test
    void testGetStrValue() {
        IntOrString intOrString = new IntOrString("test");
        assertEquals("test", intOrString.getStrValue());
    }

    //BaseRock generated method id: ${testGetStrValueThrowsException}, hash: 4035AC613846B07FE59C8E3815BAFA83
    @Test
    void testGetStrValueThrowsException() {
        IntOrString intOrString = new IntOrString(42);
        assertThrows(IllegalStateException.class, intOrString::getStrValue);
    }

    //BaseRock generated method id: ${testGetIntValue}, hash: 675A0CC4050844F093F68CACFBBE0042
    @Test
    void testGetIntValue() {
        IntOrString intOrString = new IntOrString(42);
        assertEquals(42, intOrString.getIntValue());
    }

    //BaseRock generated method id: ${testGetIntValueThrowsException}, hash: B5D8853535AD33A4799798450CC1FDF7
    @Test
    void testGetIntValueThrowsException() {
        IntOrString intOrString = new IntOrString("test");
        assertThrows(IllegalStateException.class, intOrString::getIntValue);
    }

    //BaseRock generated method id: ${testToString}, hash: 97E69396AE3CE97DE43225661EFCEA81
    @Test
    void testToString() {
        IntOrString stringValue = new IntOrString("test");
        IntOrString intValue = new IntOrString(42);
        assertEquals("test", stringValue.toString());
        assertEquals("42", intValue.toString());
    }

    //BaseRock generated method id: ${testEquals}, hash: D4C7BA50C72C59B2E828B0047E24C213
    @Test
    void testEquals() {
        IntOrString value1 = new IntOrString("test");
        IntOrString value2 = new IntOrString("test");
        IntOrString value3 = new IntOrString(42);
        IntOrString value4 = new IntOrString(42);
        IntOrString value5 = new IntOrString("other");
        assertTrue(value1.equals(value2));
        assertTrue(value3.equals(value4));
        assertFalse(value1.equals(value3));
        assertFalse(value1.equals(value5));
        assertFalse(value1.equals(null));
        assertFalse(value1.equals("test"));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 820D5287ACEFCC3D637975E8F3C03305
    @Test
    void testHashCode() {
        IntOrString value1 = new IntOrString("test");
        IntOrString value2 = new IntOrString("test");
        IntOrString value3 = new IntOrString(42);
        assertEquals(value1.hashCode(), value2.hashCode());
        assertNotEquals(value1.hashCode(), value3.hashCode());
    }

    //BaseRock generated method id: ${testIntOrStringAdapterWrite}, hash: F28D9CC04D865B17804B417282B5FF2E
    @Test
    void testIntOrStringAdapterWrite() throws IOException {
        IntOrString.IntOrStringAdapter adapter = new IntOrString.IntOrStringAdapter();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        adapter.write(jsonWriter, new IntOrString(42));
        assertEquals("42", stringWriter.toString());
        stringWriter = new StringWriter();
        jsonWriter = new JsonWriter(stringWriter);
        adapter.write(jsonWriter, new IntOrString("test"));
        assertEquals("\"test\"", stringWriter.toString());
    }

    //BaseRock generated method id: ${testIntOrStringAdapterRead}, hash: 752C960DD6E6A62E3CB1F3B59BF9BB68
    @Test
    void testIntOrStringAdapterRead() throws IOException {
        IntOrString.IntOrStringAdapter adapter = new IntOrString.IntOrStringAdapter();
        JsonReader jsonReader = new JsonReader(new StringReader("42"));
        IntOrString result = adapter.read(jsonReader);
        assertTrue(result.isInteger());
        assertEquals(42, result.getIntValue());
        jsonReader = new JsonReader(new StringReader("\"test\""));
        result = adapter.read(jsonReader);
        assertFalse(result.isInteger());
        assertEquals("test", result.getStrValue());
    }

    //BaseRock generated method id: ${testIntOrStringAdapterReadThrowsException}, hash: 7B04DB430BEB55A969339A68152F5506
    @Test
    void testIntOrStringAdapterReadThrowsException() {
        IntOrString.IntOrStringAdapter adapter = new IntOrString.IntOrStringAdapter();
        JsonReader jsonReader = new JsonReader(new StringReader("true"));
        assertThrows(IllegalStateException.class, () -> adapter.read(jsonReader));
    }

    //BaseRock generated method id: ${testIntOrStringWithVariousIntValues}, hash: 8BB36F43CC538F5236FC39382FE2B17D
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, -1, Integer.MAX_VALUE, Integer.MIN_VALUE })
    void testIntOrStringWithVariousIntValues(int value) {
        IntOrString intOrString = new IntOrString(value);
        assertTrue(intOrString.isInteger());
        assertEquals(value, intOrString.getIntValue());
        assertEquals(String.valueOf(value), intOrString.toString());
    }

    //BaseRock generated method id: ${testIntOrStringWithVariousStringValues}, hash: 6AD6F927926B9B68D1DED694E3CDEFDA
    @ParameterizedTest
    @ValueSource(strings = { "", "test", "123", "!@#$%^&*()" })
    void testIntOrStringWithVariousStringValues(String value) {
        IntOrString intOrString = new IntOrString(value);
        assertFalse(intOrString.isInteger());
        assertEquals(value, intOrString.getStrValue());
        assertEquals(value, intOrString.toString());
    }

    //BaseRock generated method id: ${testJsonSerializationDeserialization}, hash: 22CC04BF27DC8EA6306943A1462C55A8
    @Test
    void testJsonSerializationDeserialization() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        IntOrString intValue = new IntOrString(42);
        String jsonInt = objectMapper.writeValueAsString(intValue);
        IntOrString deserializedInt = objectMapper.readValue(jsonInt, IntOrString.class);
        assertEquals(intValue, deserializedInt);
        IntOrString strValue = new IntOrString("test");
        String jsonStr = objectMapper.writeValueAsString(strValue);
        IntOrString deserializedStr = objectMapper.readValue(jsonStr, IntOrString.class);
        assertEquals(strValue, deserializedStr);
    }

    //BaseRock generated method id: ${testGsonSerializationDeserialization}, hash: E431C9271E8C036A28C35F126C2D3C82
    @Test
    void testGsonSerializationDeserialization() {
        Gson gson = new Gson();
        IntOrString intValue = new IntOrString(42);
        String jsonInt = gson.toJson(intValue);
        IntOrString deserializedInt = gson.fromJson(jsonInt, IntOrString.class);
        assertEquals(intValue, deserializedInt);
        IntOrString strValue = new IntOrString("test");
        String jsonStr = gson.toJson(strValue);
        IntOrString deserializedStr = gson.fromJson(jsonStr, IntOrString.class);
        assertEquals(strValue, deserializedStr);
    }
}
