package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import com.google.gson.Gson;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import java.util.HashSet;
import java.util.Set;
import static org.hamcrest.MatcherAssert.assertThat;
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
class V1LocalVolumeSourceBaseRockGeneratedTest {

    private V1LocalVolumeSource v1LocalVolumeSource;

    @BeforeEach
    void setUp() {
        v1LocalVolumeSource = new V1LocalVolumeSource();
    }

    //BaseRock generated method id: ${testFsType}, hash: E9E4FC351B102A3C6FC8ACB799552784
    @Test
    void testFsType() {
        String fsType = "ext4";
        v1LocalVolumeSource.setFsType(fsType);
        assertEquals(fsType, v1LocalVolumeSource.getFsType());
    }

    //BaseRock generated method id: ${testPath}, hash: 01B49A1EC6450997C5FE86FFA40F1EE2
    @Test
    void testPath() {
        String path = "/mnt/data";
        v1LocalVolumeSource.setPath(path);
        assertEquals(path, v1LocalVolumeSource.getPath());
    }

    //BaseRock generated method id: ${testEquals}, hash: F0F8081949FB032EBD0AADC32AF4DAC2
    @Test
    void testEquals() {
        V1LocalVolumeSource other = new V1LocalVolumeSource();
        assertTrue(v1LocalVolumeSource.equals(v1LocalVolumeSource));
        assertTrue(v1LocalVolumeSource.equals(other));
        v1LocalVolumeSource.setFsType("ext4");
        v1LocalVolumeSource.setPath("/mnt/data");
        other.setFsType("ext4");
        other.setPath("/mnt/data");
        assertTrue(v1LocalVolumeSource.equals(other));
        other.setPath("/mnt/other");
        assertFalse(v1LocalVolumeSource.equals(other));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 0DB16AA14713BBACAEBC4296A2DA57D9
    @Test
    void testHashCode() {
        V1LocalVolumeSource other = new V1LocalVolumeSource();
        assertEquals(v1LocalVolumeSource.hashCode(), other.hashCode());
        v1LocalVolumeSource.setFsType("ext4");
        v1LocalVolumeSource.setPath("/mnt/data");
        other.setFsType("ext4");
        other.setPath("/mnt/data");
        assertEquals(v1LocalVolumeSource.hashCode(), other.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 8EBAEF480BC2C4EAD84196AF66ED1B19
    @Test
    void testToString() {
        v1LocalVolumeSource.setFsType("ext4");
        v1LocalVolumeSource.setPath("/mnt/data");
        String expected = "class V1LocalVolumeSource {\n    fsType: ext4\n    path: /mnt/data\n}";
        assertEquals(expected, v1LocalVolumeSource.toString());
    }

    //BaseRock generated method id: ${testOpenapiFields}, hash: 2C2AAA1692C4130CDDA3DBF505000D16
    @ParameterizedTest
    @ValueSource(strings = { "fsType", "path" })
    void testOpenapiFields(String field) {
        assertTrue(V1LocalVolumeSource.openapiFields.contains(field));
    }

    //BaseRock generated method id: ${testOpenapiRequiredFields}, hash: 1D03A3CA11255B4B96AA7B71AC631E53
    @Test
    void testOpenapiRequiredFields() {
        Set<String> requiredFields = new HashSet<>();
        requiredFields.add("path");
        assertEquals(requiredFields, V1LocalVolumeSource.openapiRequiredFields);
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: AFBE726844263BC08FFEE19DD2463C0E
    @Test
    void testValidateJsonElement() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("fsType", "ext4");
        jsonObject.addProperty("path", "/mnt/data");
        assertDoesNotThrow(() -> V1LocalVolumeSource.validateJsonElement(jsonObject));
        jsonObject.remove("path");
        assertThrows(IllegalArgumentException.class, () -> V1LocalVolumeSource.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testFromJson}, hash: B38E4CD8E3F1FF3B5AB31501F5DAA51B
    @Test
    void testFromJson() throws IOException {
        String json = "{\"fsType\":\"ext4\",\"path\":\"/mnt/data\"}";
        try (MockedStatic<JSON> jsonMock = mockStatic(JSON.class)) {
            Gson mockGson = mock(Gson.class);
            when(JSON.getGson()).thenReturn(mockGson);
            when(mockGson.fromJson(json, V1LocalVolumeSource.class)).thenReturn(v1LocalVolumeSource);
            V1LocalVolumeSource result = V1LocalVolumeSource.fromJson(json);
            assertSame(v1LocalVolumeSource, result);
        }
    }

    //BaseRock generated method id: ${testToJson}, hash: A24AADB155A3D940A0566BE4FE902199
    @Test
    void testToJson() {
        String expectedJson = "{\"fsType\":\"ext4\",\"path\":\"/mnt/data\"}";
        try (MockedStatic<JSON> jsonMock = mockStatic(JSON.class)) {
            Gson mockGson = mock(Gson.class);
            when(JSON.getGson()).thenReturn(mockGson);
            when(mockGson.toJson(v1LocalVolumeSource)).thenReturn(expectedJson);
            String result = v1LocalVolumeSource.toJson();
            assertEquals(expectedJson, result);
        }
    }
}
