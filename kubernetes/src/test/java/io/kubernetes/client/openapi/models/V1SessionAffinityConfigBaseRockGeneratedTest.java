package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import java.util.HashSet;
import org.mockito.MockitoAnnotations;
import com.google.gson.JsonObject;
import static org.junit.jupiter.api.Assertions.*;
import com.google.gson.JsonElement;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1SessionAffinityConfigBaseRockGeneratedTest {

    private V1SessionAffinityConfig sessionAffinityConfig;

    @Mock
    private V1ClientIPConfig mockClientIPConfig;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        sessionAffinityConfig = new V1SessionAffinityConfig();
    }

    //BaseRock generated method id: ${testClientIP}, hash: EE7CF724D6CF9E80A86683EA7BB09C3C
    @Test
    void testClientIP() {
        assertNull(sessionAffinityConfig.getClientIP());
        sessionAffinityConfig.setClientIP(mockClientIPConfig);
        assertEquals(mockClientIPConfig, sessionAffinityConfig.getClientIP());
    }

    //BaseRock generated method id: ${testEquals}, hash: E5F9A9DE9AFEDDDD70F63246AA174FDE
    @Test
    void testEquals() {
        V1SessionAffinityConfig config1 = new V1SessionAffinityConfig().clientIP(mockClientIPConfig);
        V1SessionAffinityConfig config2 = new V1SessionAffinityConfig().clientIP(mockClientIPConfig);
        V1SessionAffinityConfig config3 = new V1SessionAffinityConfig();
        assertTrue(config1.equals(config2));
        assertTrue(config2.equals(config1));
        assertFalse(config1.equals(config3));
        assertFalse(config1.equals(null));
        assertFalse(config1.equals(new Object()));
    }

    //BaseRock generated method id: ${testHashCode}, hash: EDEBF2FB4B0FD403F4C3651CFFB34378
    @Test
    void testHashCode() {
        V1SessionAffinityConfig config1 = new V1SessionAffinityConfig().clientIP(mockClientIPConfig);
        V1SessionAffinityConfig config2 = new V1SessionAffinityConfig().clientIP(mockClientIPConfig);
        V1SessionAffinityConfig config3 = new V1SessionAffinityConfig();
        assertEquals(config1.hashCode(), config2.hashCode());
        assertNotEquals(config1.hashCode(), config3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 7D87287590CC8CD13B8A4E0982CAF61D
    @Test
    void testToString() {
        V1SessionAffinityConfig config = new V1SessionAffinityConfig().clientIP(mockClientIPConfig);
        String result = config.toString();
        assertTrue(result.contains("class V1SessionAffinityConfig"));
        assertTrue(result.contains("clientIP:"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: DB9234F9DA24E41B886693774D9BE669
    @Test
    void testValidateJsonElement() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("clientIP", new JsonObject());
        assertDoesNotThrow(() -> V1SessionAffinityConfig.validateJsonElement(jsonObject));
        jsonObject.add("invalidField", new JsonObject());
        assertThrows(IllegalArgumentException.class, () -> V1SessionAffinityConfig.validateJsonElement(jsonObject));
        assertThrows(NullPointerException.class, () -> V1SessionAffinityConfig.validateJsonElement(null));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 65CA58EAA784438EB91826E5990AEB04
    @Test
    void testFromJson() throws IOException {
        String json = "{\"clientIP\":{}}";
        V1SessionAffinityConfig result = V1SessionAffinityConfig.fromJson(json);
        assertNotNull(result);
        assertNotNull(result.getClientIP());
    }

    //BaseRock generated method id: ${testToJson}, hash: 587A3E04AF0B2EA0F30C3DEA462F9A1B
    @Test
    void testToJson() {
        V1SessionAffinityConfig config = new V1SessionAffinityConfig().clientIP(new V1ClientIPConfig());
        String json = config.toJson();
        assertTrue(json.contains("\"clientIP\":"));
    }

    //BaseRock generated method id: ${testConstructor}, hash: F2DBF8BB2DDF1A6AD5D6E7CA692EF6AB
    @Test
    void testConstructor() {
        V1SessionAffinityConfig config = new V1SessionAffinityConfig();
        assertNotNull(config);
        assertNull(config.getClientIP());
    }

    //BaseRock generated method id: ${testSetClientIP}, hash: CECD393A885317E2F6494061E52475F1
    @Test
    void testSetClientIP() {
        V1SessionAffinityConfig config = new V1SessionAffinityConfig();
        config.setClientIP(mockClientIPConfig);
        assertEquals(mockClientIPConfig, config.getClientIP());
    }

    //BaseRock generated method id: ${testOpenApiFields}, hash: 206305BBF4396C8B30C64C35C76D18A3
    @Test
    void testOpenApiFields() {
        HashSet<String> fields = V1SessionAffinityConfig.openapiFields;
        assertNotNull(fields);
        assertTrue(fields.contains("clientIP"));
    }

    //BaseRock generated method id: ${testOpenApiRequiredFields}, hash: 86B135F72575B926C8F36198863D38E8
    @Test
    void testOpenApiRequiredFields() {
        HashSet<String> requiredFields = V1SessionAffinityConfig.openapiRequiredFields;
        assertNotNull(requiredFields);
        assertTrue(requiredFields.isEmpty());
    }
}
