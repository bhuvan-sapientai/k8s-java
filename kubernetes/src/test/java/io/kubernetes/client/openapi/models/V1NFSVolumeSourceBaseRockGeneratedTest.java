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
class V1NFSVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 6C7799E299EDA430C73E0666D6A6013A
    @Test
    void testConstructor() {
        V1NFSVolumeSource source = new V1NFSVolumeSource();
        assertNotNull(source);
    }

    //BaseRock generated method id: ${testSetAndGetPath}, hash: E6421656F54BDDAEC59B80449C2BCC6A
    @Test
    void testSetAndGetPath() {
        V1NFSVolumeSource source = new V1NFSVolumeSource();
        String path = "/mnt/data";
        source.setPath(path);
        assertEquals(path, source.getPath());
    }

    //BaseRock generated method id: ${testSetAndGetReadOnly}, hash: D34A35345ADC72F49D0F16C5A220590A
    @Test
    void testSetAndGetReadOnly() {
        V1NFSVolumeSource source = new V1NFSVolumeSource();
        source.setReadOnly(true);
        assertTrue(source.getReadOnly());
    }

    //BaseRock generated method id: ${testSetAndGetServer}, hash: 9031AD6E2DD3234645E5C98FD348F335
    @Test
    void testSetAndGetServer() {
        V1NFSVolumeSource source = new V1NFSVolumeSource();
        String server = "192.168.1.100";
        source.setServer(server);
        assertEquals(server, source.getServer());
    }

    //BaseRock generated method id: ${testEquals}, hash: 088939AB7C1E2B84C4699B7DD816BC0B
    @Test
    void testEquals() {
        V1NFSVolumeSource source1 = new V1NFSVolumeSource().path("/mnt/data").readOnly(true).server("192.168.1.100");
        V1NFSVolumeSource source2 = new V1NFSVolumeSource().path("/mnt/data").readOnly(true).server("192.168.1.100");
        V1NFSVolumeSource source3 = new V1NFSVolumeSource().path("/mnt/other").readOnly(false).server("192.168.1.101");
        assertTrue(source1.equals(source2));
        assertFalse(source1.equals(source3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: D84871905AD7396642EBEA83BD6A8F9F
    @Test
    void testHashCode() {
        V1NFSVolumeSource source1 = new V1NFSVolumeSource().path("/mnt/data").readOnly(true).server("192.168.1.100");
        V1NFSVolumeSource source2 = new V1NFSVolumeSource().path("/mnt/data").readOnly(true).server("192.168.1.100");
        assertEquals(source1.hashCode(), source2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 3C0EE2FCD8B6F3A7CFA2BB38C3DF0904
    @Test
    void testToString() {
        V1NFSVolumeSource source = new V1NFSVolumeSource().path("/mnt/data").readOnly(true).server("192.168.1.100");
        String expected = "class V1NFSVolumeSource {\n    path: /mnt/data\n    readOnly: true\n    server: 192.168.1.100\n}";
        assertEquals(expected, source.toString());
    }

    //BaseRock generated method id: ${testToJson}, hash: D097DFC532C6F17FAB6908B5E908E0D7
    @Test
    void testToJson() throws IOException {
        V1NFSVolumeSource source = new V1NFSVolumeSource().path("/mnt/data").readOnly(true).server("192.168.1.100");
        String json = source.toJson();
        assertNotNull(json);
        assertTrue(json.contains("\"path\":\"/mnt/data\""));
        assertTrue(json.contains("\"readOnly\":true"));
        assertTrue(json.contains("\"server\":\"192.168.1.100\""));
    }

    //BaseRock generated method id: ${testFromJson}, hash: CE9F4400646D58F9E623868C55255C23
    @Test
    void testFromJson() throws IOException {
        String json = "{\"path\":\"/mnt/data\",\"readOnly\":true,\"server\":\"192.168.1.100\"}";
        V1NFSVolumeSource source = V1NFSVolumeSource.fromJson(json);
        assertEquals("/mnt/data", source.getPath());
        assertTrue(source.getReadOnly());
        assertEquals("192.168.1.100", source.getServer());
    }

    //BaseRock generated method id: ${testFromJsonWithVariousInputs}, hash: 20E94492C2B97C36B2E55CA2D32FEC0C
    @ParameterizedTest
    @ValueSource(strings = { "{\"path\":\"/mnt/data\",\"readOnly\":true,\"server\":\"192.168.1.100\"}", "{\"path\":\"/mnt/backup\",\"readOnly\":false,\"server\":\"10.0.0.1\"}" })
    void testFromJsonWithVariousInputs(String json) throws IOException {
        V1NFSVolumeSource source = V1NFSVolumeSource.fromJson(json);
        assertNotNull(source);
        assertNotNull(source.getPath());
        assertNotNull(source.getServer());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 6AD9640024C304F9424654F2997F3894
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("path", "/mnt/data");
        jsonObject.addProperty("readOnly", true);
        jsonObject.addProperty("server", "192.168.1.100");
        try (MockedStatic<V1NFSVolumeSource> mockedStatic = mockStatic(V1NFSVolumeSource.class)) {
            mockedStatic.when(() -> V1NFSVolumeSource.validateJsonElement(any(JsonElement.class))).thenCallRealMethod();
            V1NFSVolumeSource.validateJsonElement(jsonObject);
        }
    }

    //BaseRock generated method id: ${testValidateJsonElementMissingRequiredField}, hash: 4E6150C0043B75AC8E105650B8FFE35A
    @Test
    void testValidateJsonElementMissingRequiredField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("readOnly", true);
        jsonObject.addProperty("server", "192.168.1.100");
        try (MockedStatic<V1NFSVolumeSource> mockedStatic = mockStatic(V1NFSVolumeSource.class)) {
            mockedStatic.when(() -> V1NFSVolumeSource.validateJsonElement(any(JsonElement.class))).thenCallRealMethod();
            assertThrows(IllegalArgumentException.class, () -> V1NFSVolumeSource.validateJsonElement(jsonObject));
        }
    }

    //BaseRock generated method id: ${testValidateJsonElementInvalidFieldType}, hash: 8E97A3F7ED5E4905DF3936FE69442C3F
    @Disabled
    @Test
    void testValidateJsonElementInvalidFieldType() {
        //JsonObject jsonObject = new JsonObject();
        //jsonObject.addProperty("path", "/mnt/data");
        //jsonObject.addProperty("readOnly", true);
        //jsonObject.addProperty("server", 192);
        /*try (MockedStatic<V1NFSVolumeSource> mockedStatic = mockStatic(V1NFSVolumeSource.class)) {
    mockedStatic.when(() -> V1NFSVolumeSource.validateJsonElement(any(JsonElement.class))).thenCallRealMethod();
    V1NFSVolumeSource.validateJsonElement(jsonObject);
}*/
    }

    //BaseRock generated method id: ${testCustomTypeAdapterFactory}, hash: 03E419809D7F29E0B44BB16ED65A8C8E
    @Test
    void testCustomTypeAdapterFactory() {
        V1NFSVolumeSource.CustomTypeAdapterFactory factory = new V1NFSVolumeSource.CustomTypeAdapterFactory();
        assertNotNull(factory);
    }
}