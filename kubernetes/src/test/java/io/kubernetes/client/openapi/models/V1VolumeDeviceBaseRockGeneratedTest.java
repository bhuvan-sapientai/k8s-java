package io.kubernetes.client.openapi.models;

import com.google.gson.JsonParseException;
import org.junit.jupiter.api.BeforeEach;
import com.google.gson.Gson;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import com.google.gson.JsonDeserializationContext;
import org.junit.jupiter.params.provider.NullAndEmptySource;
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
class V1VolumeDeviceBaseRockGeneratedTest {

    private V1VolumeDevice v1VolumeDevice;

    @Mock
    private Gson gsonMock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        v1VolumeDevice = new V1VolumeDevice();
    }

    //BaseRock generated method id: ${testV1VolumeDeviceConstructor}, hash: 08FE95D0477834E4342BEF05F3AE7A60
    @Test
    void testV1VolumeDeviceConstructor() {
        assertNotNull(v1VolumeDevice);
    }

    //BaseRock generated method id: ${testGetDevicePath}, hash: 1943429E56682545EF59FD66939B1503
    @Test
    void testGetDevicePath() {
        String devicePath = "test/device/path";
        v1VolumeDevice.setDevicePath(devicePath);
        assertEquals(devicePath, v1VolumeDevice.getDevicePath());
    }

    //BaseRock generated method id: ${testSetDevicePath}, hash: EDA218A06B4169CFB2FD098B75328C7C
    @Test
    void testSetDevicePath() {
        String devicePath = "test/device/path";
        v1VolumeDevice.setDevicePath(devicePath);
        assertEquals(devicePath, v1VolumeDevice.getDevicePath());
    }

    //BaseRock generated method id: ${testGetName}, hash: B50A71F74538E38E6B55C69B28968EE7
    @Test
    void testGetName() {
        String name = "testName";
        v1VolumeDevice.setName(name);
        assertEquals(name, v1VolumeDevice.getName());
    }

    //BaseRock generated method id: ${testSetName}, hash: 7A556EAF337A7433A05A4C82D3B4B1B4
    @Test
    void testSetName() {
        String name = "testName";
        v1VolumeDevice.setName(name);
        assertEquals(name, v1VolumeDevice.getName());
    }

    //BaseRock generated method id: ${testEquals}, hash: 454C4EE73D432A8DB20AAD46B92B9115
    @Test
    void testEquals() {
        V1VolumeDevice device1 = new V1VolumeDevice().devicePath("path1").name("name1");
        V1VolumeDevice device2 = new V1VolumeDevice().devicePath("path1").name("name1");
        V1VolumeDevice device3 = new V1VolumeDevice().devicePath("path2").name("name2");
        assertTrue(device1.equals(device2));
        assertFalse(device1.equals(device3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: B4CE8A932CA502CC7246E71ABB85146E
    @Test
    void testHashCode() {
        V1VolumeDevice device1 = new V1VolumeDevice().devicePath("path1").name("name1");
        V1VolumeDevice device2 = new V1VolumeDevice().devicePath("path1").name("name1");
        V1VolumeDevice device3 = new V1VolumeDevice().devicePath("path2").name("name2");
        assertEquals(device1.hashCode(), device2.hashCode());
        assertNotEquals(device1.hashCode(), device3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 292B910B89344776EC0FA4489C0CC5B2
    @Test
    void testToString() {
        v1VolumeDevice.setDevicePath("test/device/path");
        v1VolumeDevice.setName("testName");
        String expected = "class V1VolumeDevice {\n    devicePath: test/device/path\n    name: testName\n}";
        assertEquals(expected, v1VolumeDevice.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 4A030BAB59ADDCED8331D8423D8AE796
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("devicePath", "test/device/path");
        jsonObject.addProperty("name", "testName");
        assertDoesNotThrow(() -> V1VolumeDevice.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementMissingRequiredField}, hash: 4CD1B8829207F69DF8976A2B103FF0E6
    @Test
    void testValidateJsonElementMissingRequiredField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("devicePath", "test/device/path");
        assertThrows(IllegalArgumentException.class, () -> V1VolumeDevice.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 76B4475FAC207257F9874AF9F033B3D4
    @Test
    void testFromJson() throws IOException {
        String json = "{\"devicePath\":\"test/device/path\",\"name\":\"testName\"}";
        try (MockedStatic<JSON> jsonMockedStatic = mockStatic(JSON.class)) {
            jsonMockedStatic.when(JSON::getGson).thenReturn(gsonMock);
            when(gsonMock.fromJson(json, V1VolumeDevice.class)).thenReturn(new V1VolumeDevice().devicePath("test/device/path").name("testName"));
            V1VolumeDevice result = V1VolumeDevice.fromJson(json);
            assertEquals("test/device/path", result.getDevicePath());
            assertEquals("testName", result.getName());
        }
    }

    //BaseRock generated method id: ${testToJson}, hash: B7ABAC6CC8A03D0CC94D111E6068E995
    @Test
    void testToJson() {
        v1VolumeDevice.setDevicePath("test/device/path");
        v1VolumeDevice.setName("testName");
        try (MockedStatic<JSON> jsonMockedStatic = mockStatic(JSON.class)) {
            jsonMockedStatic.when(JSON::getGson).thenReturn(gsonMock);
            when(gsonMock.toJson(v1VolumeDevice)).thenReturn("{\"devicePath\":\"test/device/path\",\"name\":\"testName\"}");
            String result = v1VolumeDevice.toJson();
            assertEquals("{\"devicePath\":\"test/device/path\",\"name\":\"testName\"}", result);
        }
    }

    //BaseRock generated method id: ${testDevicePathBuilder}, hash: 186A77E2365B84884DCF727D868513AE
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "devicePath", "name" })
    void testDevicePathBuilder(String value) {
        V1VolumeDevice device = new V1VolumeDevice().devicePath(value);
        assertEquals(value, device.getDevicePath());
    }

    //BaseRock generated method id: ${testNameBuilder}, hash: 2BB8A3DB01A76857512CB66B3E20606D
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "testName", "anotherName" })
    void testNameBuilder(String value) {
        V1VolumeDevice device = new V1VolumeDevice().name(value);
        assertEquals(value, device.getName());
    }
}
