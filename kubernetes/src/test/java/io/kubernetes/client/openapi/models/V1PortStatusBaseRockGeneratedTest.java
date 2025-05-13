package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import com.google.gson.Gson;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import com.google.gson.reflect.TypeToken;
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
class V1PortStatusBaseRockGeneratedTest {

    private V1PortStatus v1PortStatus;

    @BeforeEach
    void setUp() {
        v1PortStatus = new V1PortStatus();
    }

    //BaseRock generated method id: ${testConstructor}, hash: C7A521A1D31496931CF2DE53AEA34E7B
    @Test
    void testConstructor() {
        assertNotNull(v1PortStatus);
    }

    //BaseRock generated method id: ${testError}, hash: 183842AA522343D808F3FBDA4FFAEB71
    @Test
    void testError() {
        String error = "TestError";
        v1PortStatus.setError(error);
        assertEquals(error, v1PortStatus.getError());
    }

    //BaseRock generated method id: ${testPort}, hash: 3C616F6031A2A96470BC17AFF3743902
    @Test
    void testPort() {
        Integer port = 8080;
        v1PortStatus.setPort(port);
        assertEquals(port, v1PortStatus.getPort());
    }

    //BaseRock generated method id: ${testProtocol}, hash: 55EF1285807D30249D4D71AC5874EA78
    @Test
    void testProtocol() {
        String protocol = "TCP";
        v1PortStatus.setProtocol(protocol);
        assertEquals(protocol, v1PortStatus.getProtocol());
    }

    //BaseRock generated method id: ${testEquals}, hash: 7E02B6D7CD3004E2F53FA2EEFBB4B490
    @Test
    void testEquals() {
        V1PortStatus status1 = new V1PortStatus().error("Error1").port(8080).protocol("TCP");
        V1PortStatus status2 = new V1PortStatus().error("Error1").port(8080).protocol("TCP");
        V1PortStatus status3 = new V1PortStatus().error("Error2").port(8081).protocol("UDP");
        assertTrue(status1.equals(status2));
        assertFalse(status1.equals(status3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 79FACFAFDE17B8E982D3538C9AB604E6
    @Test
    void testHashCode() {
        V1PortStatus status1 = new V1PortStatus().error("Error1").port(8080).protocol("TCP");
        V1PortStatus status2 = new V1PortStatus().error("Error1").port(8080).protocol("TCP");
        assertEquals(status1.hashCode(), status2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 36EA229AF2F154C3E871A0515F287104
    @Test
    void testToString() {
        v1PortStatus.setError("TestError");
        v1PortStatus.setPort(8080);
        v1PortStatus.setProtocol("TCP");
        String expected = "class V1PortStatus {\n    error: TestError\n    port: 8080\n    protocol: TCP\n}";
        assertEquals(expected, v1PortStatus.toString());
    }

    //BaseRock generated method id: ${testValidProtocols}, hash: B6C3134F53507AA75C49AD3543864030
    @ParameterizedTest
    @ValueSource(strings = { "TCP", "UDP", "SCTP" })
    void testValidProtocols(String protocol) {
        v1PortStatus.setProtocol(protocol);
        assertEquals(protocol, v1PortStatus.getProtocol());
    }

    //BaseRock generated method id: ${testToJson}, hash: D0CECFBB2CFFE6E637F355790592DD88
    @Test
    void testToJson() throws IOException {
        v1PortStatus.setError("TestError");
        v1PortStatus.setPort(8080);
        v1PortStatus.setProtocol("TCP");
        String json = v1PortStatus.toJson();
        V1PortStatus fromJson = JSON.getGson().fromJson(json, V1PortStatus.class);
        assertEquals(v1PortStatus, fromJson);
    }

    //BaseRock generated method id: ${testFromJson}, hash: C888C430174F3FA16E4B9DC4D07E16AC
    @Test
    void testFromJson() throws IOException {
        String json = "{\"error\":\"TestError\",\"port\":8080,\"protocol\":\"TCP\"}";
        V1PortStatus fromJson = V1PortStatus.fromJson(json);
        assertEquals("TestError", fromJson.getError());
        assertEquals(Integer.valueOf(8080), fromJson.getPort());
        assertEquals("TCP", fromJson.getProtocol());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 1C0BC01FBDC99F97415A8C51131B3B84
    @Test
    void testValidateJsonElement() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("error", "TestError");
        jsonObject.addProperty("port", 8080);
        jsonObject.addProperty("protocol", "TCP");
        assertDoesNotThrow(() -> V1PortStatus.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementMissingRequiredField}, hash: DD1E0E9A65AB62C11680E113BD5635C5
    @Test
    void testValidateJsonElementMissingRequiredField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("error", "TestError");
        jsonObject.addProperty("protocol", "TCP");
        assertThrows(IllegalArgumentException.class, () -> V1PortStatus.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementInvalidFieldType}, hash: 72E5EE615C4C29F4E748FC1DA4535330
    @Disabled()
    @Test
    void testValidateJsonElementInvalidFieldType() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("error", "TestError");
        jsonObject.addProperty("port", "NotAnInteger");
        jsonObject.addProperty("protocol", "TCP");
        assertThrows(IllegalArgumentException.class, () -> V1PortStatus.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testCustomTypeAdapterFactory}, hash: D5057E081A539CB515EE2614947606F3
    @Test
    void testCustomTypeAdapterFactory() {
        try (MockedStatic<JSON> jsonMock = mockStatic(JSON.class)) {
            Gson mockGson = mock(Gson.class);
            jsonMock.when(JSON::getGson).thenReturn(mockGson);
            V1PortStatus.CustomTypeAdapterFactory factory = new V1PortStatus.CustomTypeAdapterFactory();
            assertNotNull(factory.create(mockGson, TypeToken.get(V1PortStatus.class)));
        }
    }
}
