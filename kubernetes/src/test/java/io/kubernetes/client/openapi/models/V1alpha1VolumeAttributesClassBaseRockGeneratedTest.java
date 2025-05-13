package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import com.google.gson.JsonObject;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import static org.mockito.Mockito.*;
import java.io.IOException;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1alpha1VolumeAttributesClassBaseRockGeneratedTest {

    @Mock
    private V1ObjectMeta mockMetadata;

    private V1alpha1VolumeAttributesClass volumeAttributesClass;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        volumeAttributesClass = new V1alpha1VolumeAttributesClass();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 19A05B5D310F1626AF263399961F3115
    @Test
    void testGetApiVersion() {
        assertNull(volumeAttributesClass.getApiVersion());
        String apiVersion = "v1alpha1";
        volumeAttributesClass.setApiVersion(apiVersion);
        assertEquals(apiVersion, volumeAttributesClass.getApiVersion());
    }

    //BaseRock generated method id: ${testGetDriverName}, hash: 07F3E629AAFBD0062BEB169AB092C1A6
    @Test
    void testGetDriverName() {
        assertNull(volumeAttributesClass.getDriverName());
        String driverName = "test-driver";
        volumeAttributesClass.setDriverName(driverName);
        assertEquals(driverName, volumeAttributesClass.getDriverName());
    }

    //BaseRock generated method id: ${testGetKind}, hash: 2CF4D97814C0A13DD5FA353B9E7279F4
    @Test
    void testGetKind() {
        assertNull(volumeAttributesClass.getKind());
        String kind = "VolumeAttributesClass";
        volumeAttributesClass.setKind(kind);
        assertEquals(kind, volumeAttributesClass.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 1FBAF670703B8388F0601F72DF9BBBAE
    @Test
    void testGetMetadata() {
        assertNull(volumeAttributesClass.getMetadata());
        volumeAttributesClass.setMetadata(mockMetadata);
        assertEquals(mockMetadata, volumeAttributesClass.getMetadata());
    }

    //BaseRock generated method id: ${testGetParameters}, hash: D930A913758EC4E09975EF66DD4C41CC
    @Test
    void testGetParameters() {
        Map<String, String> parameters = volumeAttributesClass.getParameters();
        assertNotNull(parameters);
        assertTrue(parameters.isEmpty());
    }

    //BaseRock generated method id: ${testSetParameters}, hash: 7D6DA90CCB9926D2756AFD9E3E56AB8B
    @Test
    void testSetParameters() {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("key1", "value1");
        parameters.put("key2", "value2");
        volumeAttributesClass.setParameters(parameters);
        assertEquals(parameters, volumeAttributesClass.getParameters());
    }

    //BaseRock generated method id: ${testPutParametersItem}, hash: AFD67DB02021D8CB6470BA233C5CE2C3
    @Test
    void testPutParametersItem() {
        String key = "testKey";
        String value = "testValue";
        volumeAttributesClass.putParametersItem(key, value);
        Map<String, String> parameters = volumeAttributesClass.getParameters();
        assertTrue(parameters.containsKey(key));
        assertEquals(value, parameters.get(key));
    }

    //BaseRock generated method id: ${testEquals}, hash: C71C22EB5A4CFCCBF06EB488A17F43F8
    @Test
    void testEquals() {
        V1alpha1VolumeAttributesClass obj1 = new V1alpha1VolumeAttributesClass().apiVersion("v1").driverName("driver1").kind("VolumeAttributesClass").metadata(mockMetadata);
        V1alpha1VolumeAttributesClass obj2 = new V1alpha1VolumeAttributesClass().apiVersion("v1").driverName("driver1").kind("VolumeAttributesClass").metadata(mockMetadata);
        V1alpha1VolumeAttributesClass obj3 = new V1alpha1VolumeAttributesClass().apiVersion("v2").driverName("driver2").kind("OtherKind").metadata(mock(V1ObjectMeta.class));
        assertTrue(obj1.equals(obj2));
        assertFalse(obj1.equals(obj3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 079EF66BA33163FCC5F42E17D9BC7F1D
    @Test
    void testHashCode() {
        V1alpha1VolumeAttributesClass obj1 = new V1alpha1VolumeAttributesClass().apiVersion("v1").driverName("driver1").kind("VolumeAttributesClass").metadata(mockMetadata);
        V1alpha1VolumeAttributesClass obj2 = new V1alpha1VolumeAttributesClass().apiVersion("v1").driverName("driver1").kind("VolumeAttributesClass").metadata(mockMetadata);
        assertEquals(obj1.hashCode(), obj2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 7F3339E087E13878A2BA1E5EFA75B0E9
    @Test
    void testToString() {
        V1alpha1VolumeAttributesClass obj = new V1alpha1VolumeAttributesClass().apiVersion("v1").driverName("driver1").kind("VolumeAttributesClass").metadata(mockMetadata);
        String result = obj.toString();
        assertTrue(result.contains("apiVersion"));
        assertTrue(result.contains("driverName"));
        assertTrue(result.contains("kind"));
        assertTrue(result.contains("metadata"));
        assertTrue(result.contains("parameters"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 7CF9B93D1F41EC795D0BB7B9E745973F
    @Disabled()
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "valid_json" })
    void testValidateJsonElement(String json) throws IOException {
        JsonElement jsonElement = json == null ? null : mock(JsonElement.class);
        JsonObject jsonObject = mock(JsonObject.class);
        if (jsonElement != null) {
            when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
            when(jsonObject.entrySet()).thenReturn(new HashMap<String, JsonElement>().entrySet());
            when(jsonObject.get("driverName")).thenReturn(mock(JsonElement.class));
            when(jsonObject.get("driverName").isJsonPrimitive()).thenReturn(true);
        }
        if (json == null || json.isEmpty()) {
            assertThrows(IllegalArgumentException.class, () -> V1alpha1VolumeAttributesClass.validateJsonElement(jsonElement));
        } else {
            assertDoesNotThrow(() -> V1alpha1VolumeAttributesClass.validateJsonElement(jsonElement));
        }
    }

    //BaseRock generated method id: ${testFromJson}, hash: D7A70565BA122CC878CB7F1FC8682A9A
    @Test
    void testFromJson() throws IOException {
        String jsonString = "{\"apiVersion\":\"v1\",\"driverName\":\"test-driver\",\"kind\":\"VolumeAttributesClass\"}";
        V1alpha1VolumeAttributesClass result = V1alpha1VolumeAttributesClass.fromJson(jsonString);
        assertNotNull(result);
        assertEquals("v1", result.getApiVersion());
        assertEquals("test-driver", result.getDriverName());
        assertEquals("VolumeAttributesClass", result.getKind());
    }

    //BaseRock generated method id: ${testToJson}, hash: B1CC70B18A7B6934A404829148B70025
    @Test
    void testToJson() {
        V1alpha1VolumeAttributesClass obj = new V1alpha1VolumeAttributesClass().apiVersion("v1").driverName("test-driver").kind("VolumeAttributesClass");
        String jsonString = obj.toJson();
        assertTrue(jsonString.contains("\"apiVersion\":\"v1\""));
        assertTrue(jsonString.contains("\"driverName\":\"test-driver\""));
        assertTrue(jsonString.contains("\"kind\":\"VolumeAttributesClass\""));
    }
}
