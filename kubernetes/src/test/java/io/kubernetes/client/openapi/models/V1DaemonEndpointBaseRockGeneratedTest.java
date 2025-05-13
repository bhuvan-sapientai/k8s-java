package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
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
class V1DaemonEndpointBaseRockGeneratedTest {

    private V1DaemonEndpoint daemonEndpoint;

    @BeforeEach
    void setUp() {
        daemonEndpoint = new V1DaemonEndpoint();
    }

    //BaseRock generated method id: ${testConstructor}, hash: E4615D31436B6CC0B1DF1ECBAA18C37D
    @Test
    void testConstructor() {
        assertNotNull(daemonEndpoint);
    }

    //BaseRock generated method id: ${testPort}, hash: 666CBC04DBC379E76823206B9D9F27A9
    @Test
    void testPort() {
        Integer port = 8080;
        daemonEndpoint.setPort(port);
        assertEquals(port, daemonEndpoint.getPort());
    }

    //BaseRock generated method id: ${testPortEdgeCases}, hash: 97B088E7F981CBFCC4A7BC816A7F4BA9
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 65535 })
    void testPortEdgeCases(int port) {
        daemonEndpoint.setPort(port);
        assertEquals(port, daemonEndpoint.getPort());
    }

    //BaseRock generated method id: ${testEquals}, hash: 7BCB4B866AA8F6C1D19A79CE73EFBD4C
    @Test
    void testEquals() {
        V1DaemonEndpoint endpoint1 = new V1DaemonEndpoint().port(8080);
        V1DaemonEndpoint endpoint2 = new V1DaemonEndpoint().port(8080);
        V1DaemonEndpoint endpoint3 = new V1DaemonEndpoint().port(9090);
        assertTrue(endpoint1.equals(endpoint2));
        assertFalse(endpoint1.equals(endpoint3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 7D2B407E4E4FEC2C79E0F7611C610FA2
    @Test
    void testHashCode() {
        V1DaemonEndpoint endpoint1 = new V1DaemonEndpoint().port(8080);
        V1DaemonEndpoint endpoint2 = new V1DaemonEndpoint().port(8080);
        assertEquals(endpoint1.hashCode(), endpoint2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 00C1BD1552BDFA69F42811832238B335
    @Test
    void testToString() {
        V1DaemonEndpoint endpoint = new V1DaemonEndpoint().port(8080);
        String expectedString = "class V1DaemonEndpoint {\n    port: 8080\n}";
        assertEquals(expectedString, endpoint.toString());
    }

    //BaseRock generated method id: ${testToJson}, hash: 08A19E4B65EE470BD1D0E97CA672B58F
    @Test
    void testToJson() throws IOException {
        V1DaemonEndpoint endpoint = new V1DaemonEndpoint().port(8080);
        try (MockedStatic<JSON> jsonMock = mockStatic(JSON.class)) {
            Gson mockGson = mock(Gson.class);
            when(JSON.getGson()).thenReturn(mockGson);
            when(mockGson.toJson(endpoint)).thenReturn("{\"Port\":8080}");
            String json = endpoint.toJson();
            assertEquals("{\"Port\":8080}", json);
        }
    }

    //BaseRock generated method id: ${testFromJson}, hash: FED9834763E0330BA436482112C17F6A
    @Test
    void testFromJson() throws IOException {
        String json = "{\"Port\":8080}";
        try (MockedStatic<JSON> jsonMock = mockStatic(JSON.class)) {
            Gson mockGson = mock(Gson.class);
            when(JSON.getGson()).thenReturn(mockGson);
            when(mockGson.fromJson(json, V1DaemonEndpoint.class)).thenReturn(new V1DaemonEndpoint().port(8080));
            V1DaemonEndpoint endpoint = V1DaemonEndpoint.fromJson(json);
            assertNotNull(endpoint);
            assertEquals(8080, endpoint.getPort());
        }
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: D1BC68ABCEE378A6709B29D03596D8BE
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("Port", 8080);
        assertDoesNotThrow(() -> V1DaemonEndpoint.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementMissingRequiredField}, hash: 0D232726C0A11924CCF887DB67DEB9FC
    @Test
    void testValidateJsonElementMissingRequiredField() {
        JsonObject jsonObject = new JsonObject();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            V1DaemonEndpoint.validateJsonElement(jsonObject);
        });
        String expectedMessage = "The required field `Port` is not found in the JSON string";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithExtraField}, hash: 73598C6DBF336ED2E6FF60E23129049F
    @Test
    void testValidateJsonElementWithExtraField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("Port", 8080);
        jsonObject.addProperty("ExtraField", "extra");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            V1DaemonEndpoint.validateJsonElement(jsonObject);
        });
        String expectedMessage = "The field `ExtraField` in the JSON string is not defined in the `V1DaemonEndpoint` properties";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    //BaseRock generated method id: ${testValidateJsonElementNullJsonElement}, hash: C1844ACAEB0294D896CA04952FA57A55
    @Test
    void testValidateJsonElementNullJsonElement() {
        assertThrows(IllegalArgumentException.class, () -> {
            V1DaemonEndpoint.validateJsonElement(null);
        });
    }
}
