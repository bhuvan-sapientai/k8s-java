package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import com.google.gson.Gson;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import com.google.gson.JsonObject;
import static org.junit.jupiter.api.Assertions.*;
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
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1IngressServiceBackendBaseRockGeneratedTest {

    private V1IngressServiceBackend v1IngressServiceBackend;

    @Mock
    private V1ServiceBackendPort mockPort;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        v1IngressServiceBackend = new V1IngressServiceBackend();
    }

    //BaseRock generated method id: ${testName}, hash: 7F64B05EB9AE39DFB695C633367513FD
    @Test
    void testName() {
        String name = "test-name";
        v1IngressServiceBackend.setName(name);
        assertEquals(name, v1IngressServiceBackend.getName());
    }

    //BaseRock generated method id: ${testPort}, hash: 70FC71EA7AA5C805A93641E20251E59A
    @Test
    void testPort() {
        v1IngressServiceBackend.setPort(mockPort);
        assertEquals(mockPort, v1IngressServiceBackend.getPort());
    }

    //BaseRock generated method id: ${testEquals}, hash: FE0CAC70904F60059D1417DB9E638EB2
    @Test
    void testEquals() {
        V1IngressServiceBackend other = new V1IngressServiceBackend();
        assertTrue(v1IngressServiceBackend.equals(v1IngressServiceBackend));
        assertTrue(v1IngressServiceBackend.equals(other));
        v1IngressServiceBackend.setName("test");
        assertFalse(v1IngressServiceBackend.equals(other));
        other.setName("test");
        assertTrue(v1IngressServiceBackend.equals(other));
        v1IngressServiceBackend.setPort(mockPort);
        assertFalse(v1IngressServiceBackend.equals(other));
        other.setPort(mockPort);
        assertTrue(v1IngressServiceBackend.equals(other));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 748180747B6298CA46FA632FF7E2EDBF
    @Test
    void testHashCode() {
        V1IngressServiceBackend other = new V1IngressServiceBackend();
        assertEquals(v1IngressServiceBackend.hashCode(), other.hashCode());
        v1IngressServiceBackend.setName("test");
        assertNotEquals(v1IngressServiceBackend.hashCode(), other.hashCode());
        other.setName("test");
        assertEquals(v1IngressServiceBackend.hashCode(), other.hashCode());
        v1IngressServiceBackend.setPort(mockPort);
        assertNotEquals(v1IngressServiceBackend.hashCode(), other.hashCode());
        other.setPort(mockPort);
        assertEquals(v1IngressServiceBackend.hashCode(), other.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 38DC17039BADC82CBFD6FAFF911132E6
    @Disabled()
    @Test
    void testToString() {
        String name = "test-name";
        v1IngressServiceBackend.setName(name);
        v1IngressServiceBackend.setPort(mockPort);
        String result = v1IngressServiceBackend.toString();
        assertTrue(result.contains("name=" + name));
        assertTrue(result.contains("port=" + mockPort));
    }

    //BaseRock generated method id: ${testToJson}, hash: 24A28A08AD64E04952610460382C3B94
    @Test
    void testToJson() throws IOException {
        String name = "test-name";
        v1IngressServiceBackend.setName(name);
        v1IngressServiceBackend.setPort(mockPort);
        try (MockedStatic<JSON> jsonMockedStatic = mockStatic(JSON.class)) {
            Gson mockGson = mock(Gson.class);
            jsonMockedStatic.when(JSON::getGson).thenReturn(mockGson);
            doReturn("{\"name\":\"test-name\"}").when(mockGson).toJson(v1IngressServiceBackend);
            String json = v1IngressServiceBackend.toJson();
            assertEquals("{\"name\":\"test-name\"}", json);
            verify(mockGson).toJson(v1IngressServiceBackend);
        }
    }

    //BaseRock generated method id: ${testFromJson}, hash: 1490B770981EC8BEAF534F611E187FB0
    @Test
    void testFromJson() throws IOException {
        String json = "{\"name\":\"test-name\"}";
        try (MockedStatic<JSON> jsonMockedStatic = mockStatic(JSON.class)) {
            Gson mockGson = mock(Gson.class);
            jsonMockedStatic.when(JSON::getGson).thenReturn(mockGson);
            doReturn(new V1IngressServiceBackend().name("test-name")).when(mockGson).fromJson(anyString(), eq(V1IngressServiceBackend.class));
            V1IngressServiceBackend result = V1IngressServiceBackend.fromJson(json);
            assertNotNull(result);
            assertEquals("test-name", result.getName());
            verify(mockGson).fromJson(json, V1IngressServiceBackend.class);
        }
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: AE43C98DF75EA385843925090D69F6B9
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "test-name");
        try (MockedStatic<V1ServiceBackendPort> v1ServiceBackendPortMockedStatic = mockStatic(V1ServiceBackendPort.class)) {
            v1ServiceBackendPortMockedStatic.when(() -> V1ServiceBackendPort.validateJsonElement(any())).thenAnswer(invocation -> null);
            assertDoesNotThrow(() -> V1IngressServiceBackend.validateJsonElement(jsonObject));
            v1ServiceBackendPortMockedStatic.verify(() -> V1ServiceBackendPort.validateJsonElement(any()), never());
        }
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidName}, hash: 7281CAFA5E6E0A1C03EC51C52C593FE3
    @Test
    void testValidateJsonElementWithInvalidName() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("name", new JsonObject());
        assertThrows(IllegalArgumentException.class, () -> V1IngressServiceBackend.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithPort}, hash: E41B12EF6C5B6AAFF7A7AAC2A84FC0FB
    @Test
    void testValidateJsonElementWithPort() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "test-name");
        jsonObject.add("port", new JsonObject());
        try (MockedStatic<V1ServiceBackendPort> v1ServiceBackendPortMockedStatic = mockStatic(V1ServiceBackendPort.class)) {
            v1ServiceBackendPortMockedStatic.when(() -> V1ServiceBackendPort.validateJsonElement(any())).thenAnswer(invocation -> null);
            assertDoesNotThrow(() -> V1IngressServiceBackend.validateJsonElement(jsonObject));
            v1ServiceBackendPortMockedStatic.verify(() -> V1ServiceBackendPort.validateJsonElement(any(JsonElement.class)), times(1));
        }
    }

    //BaseRock generated method id: ${testValidateJsonElementWithMissingRequiredField}, hash: 80B714C832374774AD84BE94B5A7F4A1
    @Test
    void testValidateJsonElementWithMissingRequiredField() {
        JsonObject jsonObject = new JsonObject();
        assertThrows(IllegalArgumentException.class, () -> V1IngressServiceBackend.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithExtraField}, hash: 85A28E9F27BDB1329FA18E31779A1891
    @Test
    void testValidateJsonElementWithExtraField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "test-name");
        jsonObject.addProperty("extraField", "extra");
        assertThrows(IllegalArgumentException.class, () -> V1IngressServiceBackend.validateJsonElement(jsonObject));
    }
}
