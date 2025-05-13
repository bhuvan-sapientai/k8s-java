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
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1ServiceBackendPortBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 88B0FCF6A46EDB89E308FA155322C5B4
    @Test
    void testConstructor() {
        V1ServiceBackendPort port = new V1ServiceBackendPort();
        assertNotNull(port);
    }

    //BaseRock generated method id: ${testNameSetter}, hash: 3EBF41312763268FC55954050A134A23
    @Test
    void testNameSetter() {
        V1ServiceBackendPort port = new V1ServiceBackendPort();
        port.setName("test-name");
        assertEquals("test-name", port.getName());
    }

    //BaseRock generated method id: ${testNameGetter}, hash: DCA43606DE6B9C333A12C711067166F6
    @Test
    void testNameGetter() {
        V1ServiceBackendPort port = new V1ServiceBackendPort();
        assertNull(port.getName());
        port.setName("test-name");
        assertEquals("test-name", port.getName());
    }

    //BaseRock generated method id: ${testNumberSetter}, hash: 813C928929AC6BDDFBAE4C85250F7EA4
    @Test
    void testNumberSetter() {
        V1ServiceBackendPort port = new V1ServiceBackendPort();
        port.setNumber(8080);
        assertEquals(8080, port.getNumber());
    }

    //BaseRock generated method id: ${testNumberGetter}, hash: 8539F96F81A2BAEEF8503E5320D2F310
    @Test
    void testNumberGetter() {
        V1ServiceBackendPort port = new V1ServiceBackendPort();
        assertNull(port.getNumber());
        port.setNumber(8080);
        assertEquals(8080, port.getNumber());
    }

    //BaseRock generated method id: ${testEquals}, hash: 783BC4E253B22FED58FF3260329374A0
    @Test
    void testEquals() {
        V1ServiceBackendPort port1 = new V1ServiceBackendPort().name("test").number(8080);
        V1ServiceBackendPort port2 = new V1ServiceBackendPort().name("test").number(8080);
        V1ServiceBackendPort port3 = new V1ServiceBackendPort().name("other").number(9090);
        assertTrue(port1.equals(port2));
        assertFalse(port1.equals(port3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 710E88995A7783005D9C2364A2B23D93
    @Test
    void testHashCode() {
        V1ServiceBackendPort port1 = new V1ServiceBackendPort().name("test").number(8080);
        V1ServiceBackendPort port2 = new V1ServiceBackendPort().name("test").number(8080);
        assertEquals(port1.hashCode(), port2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 781231B0682CB4F765CAA883DB787B8D
    @Test
    void testToString() {
        V1ServiceBackendPort port = new V1ServiceBackendPort().name("test").number(8080);
        String expected = "class V1ServiceBackendPort {\n    name: test\n    number: 8080\n}";
        assertEquals(expected, port.toString());
    }

    //BaseRock generated method id: ${testToJson}, hash: 41D9B3350F72009382B28BBB28F82F66
    @Test
    void testToJson() throws IOException {
        V1ServiceBackendPort port = new V1ServiceBackendPort().name("test").number(8080);
        try (MockedStatic<JSON> jsonMock = mockStatic(JSON.class)) {
            Gson mockGson = mock(Gson.class);
            jsonMock.when(JSON::getGson).thenReturn(mockGson);
            when(mockGson.toJson(any(V1ServiceBackendPort.class))).thenReturn("{\"name\":\"test\",\"number\":8080}");
            assertEquals("{\"name\":\"test\",\"number\":8080}", port.toJson());
        }
    }

    //BaseRock generated method id: ${testFromJson}, hash: 6719BE6AA05367146395A6EAD5956631
    @Test
    void testFromJson() throws IOException {
        String json = "{\"name\":\"test\",\"number\":8080}";
        try (MockedStatic<JSON> jsonMock = mockStatic(JSON.class)) {
            Gson mockGson = mock(Gson.class);
            jsonMock.when(JSON::getGson).thenReturn(mockGson);
            V1ServiceBackendPort mockPort = new V1ServiceBackendPort().name("test").number(8080);
            when(mockGson.fromJson(anyString(), eq(V1ServiceBackendPort.class))).thenReturn(mockPort);
            V1ServiceBackendPort port = V1ServiceBackendPort.fromJson(json);
            assertEquals("test", port.getName());
            assertEquals(Integer.valueOf(8080), port.getNumber());
        }
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 54F48CE8DBD4B6A77D04F7DEB3AC55AC
    @ParameterizedTest
    @ValueSource(strings = { "name", "number" })
    void testValidateJsonElement(String field) throws IOException {
        JsonObject jsonObject = new JsonObject();
        if (field.equals("name")) {
            jsonObject.addProperty(field, "test");
        } else {
            jsonObject.addProperty(field, 8080);
        }
        assertDoesNotThrow(() -> V1ServiceBackendPort.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidField}, hash: 169CC52EC9A34E1A5652808F317C43D5
    @Test
    void testValidateJsonElementWithInvalidField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("invalidField", "value");
        assertThrows(IllegalArgumentException.class, () -> V1ServiceBackendPort.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithNonPrimitiveName}, hash: 490D5FE295A87EE2FEEFB61DBCBB9535
    @Test
    void testValidateJsonElementWithNonPrimitiveName() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("name", new JsonObject());
        assertThrows(IllegalArgumentException.class, () -> V1ServiceBackendPort.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithNullJsonElement}, hash: 9864440242FC27BA2C6E194254C9A699
    @Disabled()
    @Test
    void testValidateJsonElementWithNullJsonElement() {
        assertDoesNotThrow(() -> V1ServiceBackendPort.validateJsonElement(null));
    }
}
