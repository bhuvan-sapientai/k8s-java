package io.kubernetes.client.openapi.models;

import com.google.gson.Gson;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import java.util.Collections;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import com.google.gson.JsonObject;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import com.google.gson.JsonElement;
import io.kubernetes.client.openapi.JSON;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1ConfigMapEnvSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: A648555613C91E4CAED532DAC007DF14
    @Test
    void testConstructor() {
        V1ConfigMapEnvSource configMapEnvSource = new V1ConfigMapEnvSource();
        assertNotNull(configMapEnvSource);
    }

    //BaseRock generated method id: ${testName}, hash: A67DCFA953F15BBFE34398E87A7731C4
    @Test
    void testName() {
        V1ConfigMapEnvSource configMapEnvSource = new V1ConfigMapEnvSource();
        String name = "test-name";
        assertEquals(configMapEnvSource, configMapEnvSource.name(name));
        assertEquals(name, configMapEnvSource.getName());
    }

    //BaseRock generated method id: ${testSetName}, hash: 0484CD0C00497CAB793011C91A0F7C18
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "name1", "name2" })
    void testSetName(String name) {
        V1ConfigMapEnvSource configMapEnvSource = new V1ConfigMapEnvSource();
        configMapEnvSource.setName(name);
        assertEquals(name, configMapEnvSource.getName());
    }

    //BaseRock generated method id: ${testOptional}, hash: 4EA46C08A573EBC2CA0F59C4AA858228
    @Test
    void testOptional() {
        V1ConfigMapEnvSource configMapEnvSource = new V1ConfigMapEnvSource();
        Boolean optional = true;
        assertEquals(configMapEnvSource, configMapEnvSource.optional(optional));
        assertEquals(optional, configMapEnvSource.getOptional());
    }

    //BaseRock generated method id: ${testSetOptional}, hash: 6C8BCAA44C9A509A980AFAAE5DD2FADC
    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    void testSetOptional(Boolean optional) {
        V1ConfigMapEnvSource configMapEnvSource = new V1ConfigMapEnvSource();
        configMapEnvSource.setOptional(optional);
        assertEquals(optional, configMapEnvSource.getOptional());
    }

    //BaseRock generated method id: ${testEquals}, hash: DDC0AFE95ED0C60A13989940ECA6B1B0
    @Test
    void testEquals() {
        V1ConfigMapEnvSource configMapEnvSource1 = new V1ConfigMapEnvSource().name("name1").optional(true);
        V1ConfigMapEnvSource configMapEnvSource2 = new V1ConfigMapEnvSource().name("name1").optional(true);
        V1ConfigMapEnvSource configMapEnvSource3 = new V1ConfigMapEnvSource().name("name2").optional(false);
        assertTrue(configMapEnvSource1.equals(configMapEnvSource2));
        assertFalse(configMapEnvSource1.equals(configMapEnvSource3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: C2A613A92D36AB3324BC7B20AA6FA1A0
    @Test
    void testHashCode() {
        V1ConfigMapEnvSource configMapEnvSource1 = new V1ConfigMapEnvSource().name("name1").optional(true);
        V1ConfigMapEnvSource configMapEnvSource2 = new V1ConfigMapEnvSource().name("name1").optional(true);
        V1ConfigMapEnvSource configMapEnvSource3 = new V1ConfigMapEnvSource().name("name2").optional(false);
        assertEquals(configMapEnvSource1.hashCode(), configMapEnvSource2.hashCode());
        assertNotEquals(configMapEnvSource1.hashCode(), configMapEnvSource3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 1956D18CC0975A8586AD60B4343E92EE
    @Test
    void testToString() {
        V1ConfigMapEnvSource configMapEnvSource = new V1ConfigMapEnvSource().name("test-name").optional(true);
        String expected = "class V1ConfigMapEnvSource {\n    name: test-name\n    optional: true\n}";
        assertEquals(expected, configMapEnvSource.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 2DAA0260E1E03DD73FF19089C96386D4
    @Disabled()
    @Test
    void testValidateJsonElement() throws IOException {
        try (MockedStatic<V1ConfigMapEnvSource> mockedStatic = mockStatic(V1ConfigMapEnvSource.class)) {
            JsonElement jsonElement = mock(JsonElement.class);
            JsonObject jsonObject = mock(JsonObject.class);
            when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
            when(jsonObject.entrySet()).thenReturn(Collections.emptySet());
            mockedStatic.when(() -> V1ConfigMapEnvSource.validateJsonElement(jsonElement)).thenCallRealMethod();
            V1ConfigMapEnvSource.validateJsonElement(jsonElement);
            verify(jsonElement, times(1)).getAsJsonObject();
            verify(jsonObject, times(1)).entrySet();
        }
    }

    //BaseRock generated method id: ${testFromJson}, hash: 3B851A0CD4FEDC17A0AD6387424727C7
    @Test
    void testFromJson() throws IOException {
        String json = "{\"name\":\"test-name\",\"optional\":true}";
        try (MockedStatic<JSON> mockedStatic = mockStatic(JSON.class)) {
            Gson gsonMock = mock(Gson.class);
            when(JSON.getGson()).thenReturn(gsonMock);
            when(gsonMock.fromJson(json, V1ConfigMapEnvSource.class)).thenReturn(new V1ConfigMapEnvSource().name("test-name").optional(true));
            V1ConfigMapEnvSource result = V1ConfigMapEnvSource.fromJson(json);
            assertEquals("test-name", result.getName());
            assertTrue(result.getOptional());
        }
    }

    //BaseRock generated method id: ${testToJson}, hash: D4F4AC6016C7B14A669C4ADFF54E4050
    @Test
    void testToJson() {
        V1ConfigMapEnvSource configMapEnvSource = new V1ConfigMapEnvSource().name("test-name").optional(true);
        try (MockedStatic<JSON> mockedStatic = mockStatic(JSON.class)) {
            Gson gsonMock = mock(Gson.class);
            when(JSON.getGson()).thenReturn(gsonMock);
            when(gsonMock.toJson(configMapEnvSource)).thenReturn("{\"name\":\"test-name\",\"optional\":true}");
            String result = configMapEnvSource.toJson();
            assertEquals("{\"name\":\"test-name\",\"optional\":true}", result);
        }
    }
}
