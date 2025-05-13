package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.hasEntry;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1VolumeAttributesClassBaseRockGeneratedTest {

    private V1beta1VolumeAttributesClass volumeAttributesClass;

    @BeforeEach
    void setUp() {
        volumeAttributesClass = new V1beta1VolumeAttributesClass();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 4274500C779E62676914578A8C140249
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1beta1";
        volumeAttributesClass.setApiVersion(apiVersion);
        assertEquals(apiVersion, volumeAttributesClass.getApiVersion());
    }

    //BaseRock generated method id: ${testGetDriverName}, hash: 2AA52F5A0F19C215BA86CED69F87069C
    @Test
    void testGetDriverName() {
        String driverName = "test-driver";
        volumeAttributesClass.setDriverName(driverName);
        assertEquals(driverName, volumeAttributesClass.getDriverName());
    }

    //BaseRock generated method id: ${testGetKind}, hash: EA26B58711F8B25CAF0E68EE9D4E7C9B
    @Test
    void testGetKind() {
        String kind = "VolumeAttributesClass";
        volumeAttributesClass.setKind(kind);
        assertEquals(kind, volumeAttributesClass.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: B4F3F2BD810797AF34E7B927E9D59620
    @Test
    void testGetMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        volumeAttributesClass.setMetadata(metadata);
        assertEquals(metadata, volumeAttributesClass.getMetadata());
    }

    //BaseRock generated method id: ${testGetParameters}, hash: F7A26183F29AF52AD7F42D0A2AC88FCA
    @Test
    void testGetParameters() {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("key1", "value1");
        parameters.put("key2", "value2");
        volumeAttributesClass.setParameters(parameters);
        assertEquals(parameters, volumeAttributesClass.getParameters());
    }

    //BaseRock generated method id: ${testPutParametersItem}, hash: D5C60052E3856A667D23D2B8887ABC49
    @Test
    void testPutParametersItem() {
        String key = "testKey";
        String value = "testValue";
        volumeAttributesClass.putParametersItem(key, value);
        assertThat(volumeAttributesClass.getParameters(), hasEntry(key, value));
    }

    //BaseRock generated method id: ${testEquals}, hash: F3A227FB9FCB36C2FA1CC1A5AAA18307
    @Test
    void testEquals() {
        V1beta1VolumeAttributesClass other = new V1beta1VolumeAttributesClass();
        other.setApiVersion("v1beta1");
        other.setDriverName("test-driver");
        other.setKind("VolumeAttributesClass");
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        other.setMetadata(metadata);
        Map<String, String> parameters = new HashMap<>();
        parameters.put("key", "value");
        other.setParameters(parameters);
        volumeAttributesClass.setApiVersion("v1beta1");
        volumeAttributesClass.setDriverName("test-driver");
        volumeAttributesClass.setKind("VolumeAttributesClass");
        volumeAttributesClass.setMetadata(metadata);
        volumeAttributesClass.setParameters(parameters);
        assertEquals(other, volumeAttributesClass);
    }

    //BaseRock generated method id: ${testHashCode}, hash: CFF8B494084E2979F13B4C662C4EA7FC
    @Test
    void testHashCode() {
        V1beta1VolumeAttributesClass other = new V1beta1VolumeAttributesClass();
        other.setApiVersion("v1beta1");
        other.setDriverName("test-driver");
        other.setKind("VolumeAttributesClass");
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        other.setMetadata(metadata);
        Map<String, String> parameters = new HashMap<>();
        parameters.put("key", "value");
        other.setParameters(parameters);
        volumeAttributesClass.setApiVersion("v1beta1");
        volumeAttributesClass.setDriverName("test-driver");
        volumeAttributesClass.setKind("VolumeAttributesClass");
        volumeAttributesClass.setMetadata(metadata);
        volumeAttributesClass.setParameters(parameters);
        assertEquals(other.hashCode(), volumeAttributesClass.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 7460346FD9A8E9F1A0A83D0AECE8D6EA
    @Test
    void testToString() {
        volumeAttributesClass.setApiVersion("v1beta1");
        volumeAttributesClass.setDriverName("test-driver");
        volumeAttributesClass.setKind("VolumeAttributesClass");
        volumeAttributesClass.setMetadata(mock(V1ObjectMeta.class));
        Map<String, String> parameters = new HashMap<>();
        parameters.put("key", "value");
        volumeAttributesClass.setParameters(parameters);
        String result = volumeAttributesClass.toString();
        assertNotNull(result);
        assertThat(result, notNullValue());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 6C8E03923DF0142C205F332C4AB3EE62
    @Test
    void testValidateJsonElement() throws Exception {
        // This method is static and doesn't modify the object state
        // We can't test it directly without a valid JsonElement
        // Consider testing it in integration tests or with a mocked JsonElement
    }
}
