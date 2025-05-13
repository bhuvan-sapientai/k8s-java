package io.kubernetes.client.openapi.models;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.hasEntry;
import java.util.HashMap;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ConfigMapBaseRockGeneratedTest {

    private V1ConfigMap v1ConfigMap;

    @BeforeEach
    void setUp() {
        v1ConfigMap = new V1ConfigMap();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: C3692FF6003ABBCE4CDF4F24858E4264
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1ConfigMap.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1ConfigMap.getApiVersion());
    }

    //BaseRock generated method id: ${testBinaryData}, hash: 89DECC44749474319AA4E0E45711DCC9
    @Test
    void testBinaryData() {
        Map<String, byte[]> binaryData = new HashMap<>();
        byte[] value = "test".getBytes();
        binaryData.put("key", value);
        v1ConfigMap.setBinaryData(binaryData);
        assertEquals(binaryData, v1ConfigMap.getBinaryData());
    }

    //BaseRock generated method id: ${testPutBinaryDataItem}, hash: 2BB4850843B1C4E04CCA513E13D0D4F1
    @Test
    void testPutBinaryDataItem() {
        String key = "testKey";
        byte[] value = "testValue".getBytes();
        v1ConfigMap.putBinaryDataItem(key, value);
        assertThat(v1ConfigMap.getBinaryData(), hasEntry(key, value));
    }

    //BaseRock generated method id: ${testData}, hash: E75085BECCDA4E8FF3174A4C6CE02061
    @Test
    void testData() {
        Map<String, String> data = new HashMap<>();
        data.put("key", "value");
        v1ConfigMap.setData(data);
        assertEquals(data, v1ConfigMap.getData());
    }

    //BaseRock generated method id: ${testPutDataItem}, hash: 404F32B45CC01FBA909C02D2A94F4856
    @Test
    void testPutDataItem() {
        String key = "testKey";
        String value = "testValue";
        v1ConfigMap.putDataItem(key, value);
        assertThat(v1ConfigMap.getData(), hasEntry(key, value));
    }

    //BaseRock generated method id: ${testImmutable}, hash: ABA37DBDA2AA97F4ABF24F3282E27D1D
    @Test
    void testImmutable() {
        v1ConfigMap.setImmutable(true);
        assertTrue(v1ConfigMap.getImmutable());
        v1ConfigMap.setImmutable(false);
        assertFalse(v1ConfigMap.getImmutable());
    }

    //BaseRock generated method id: ${testKind}, hash: C3B74F4123C8A62EAC71F4F43E0043F9
    @Test
    void testKind() {
        String kind = "ConfigMap";
        v1ConfigMap.setKind(kind);
        assertEquals(kind, v1ConfigMap.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 362EA768B8664482381611179F1BFB3A
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1ConfigMap.setMetadata(metadata);
        assertEquals(metadata, v1ConfigMap.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: 494655F35AEC6BE1DE94F0AC016DB268
    @Test
    void testEquals() {
        V1ConfigMap configMap1 = new V1ConfigMap().apiVersion("v1").kind("ConfigMap").immutable(true);
        V1ConfigMap configMap2 = new V1ConfigMap().apiVersion("v1").kind("ConfigMap").immutable(true);
        V1ConfigMap configMap3 = new V1ConfigMap().apiVersion("v2").kind("ConfigMap").immutable(false);
        assertTrue(configMap1.equals(configMap2));
        assertFalse(configMap1.equals(configMap3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 90CDF6B38EF843B697D2DCD7ED0A5BB6
    @Test
    void testHashCode() {
        V1ConfigMap configMap1 = new V1ConfigMap().apiVersion("v1").kind("ConfigMap").immutable(true);
        V1ConfigMap configMap2 = new V1ConfigMap().apiVersion("v1").kind("ConfigMap").immutable(true);
        assertEquals(configMap1.hashCode(), configMap2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: A9D4F067181704947B9E21248C921058
    @Test
    void testToString() {
        v1ConfigMap.setApiVersion("v1");
        v1ConfigMap.setKind("ConfigMap");
        v1ConfigMap.setImmutable(true);
        String expectedString = "class V1ConfigMap {\n" + "    apiVersion: v1\n" + "    binaryData: {}\n" + "    data: {}\n" + "    immutable: true\n" + "    kind: ConfigMap\n" + "    metadata: null\n" + "}";
        assertEquals(expectedString, v1ConfigMap.toString());
    }

    //BaseRock generated method id: ${testV1ConfigMapBuilder}, hash: 6D945192B48F3BB333D60B5D13E621BD
    @Test
    void testV1ConfigMapBuilder() {
        V1ConfigMap configMap = new V1ConfigMap().apiVersion("v1").kind("ConfigMap").immutable(true).putBinaryDataItem("binaryKey", "binaryValue".getBytes()).putDataItem("dataKey", "dataValue");
        assertEquals("v1", configMap.getApiVersion());
        assertEquals("ConfigMap", configMap.getKind());
        assertTrue(configMap.getImmutable());
        assertArrayEquals("binaryValue".getBytes(), configMap.getBinaryData().get("binaryKey"));
        assertEquals("dataValue", configMap.getData().get("dataKey"));
    }

    //BaseRock generated method id: ${testNullValues}, hash: 3B948BE6FB8D2E1543D6D04EC8C86B80
    @Test
    void testNullValues() {
        assertThat(v1ConfigMap.getApiVersion(), is(nullValue()));
        assertThat(v1ConfigMap.getBinaryData(), is(notNullValue()));
        assertThat(v1ConfigMap.getData(), is(notNullValue()));
        assertThat(v1ConfigMap.getImmutable(), is(nullValue()));
        assertThat(v1ConfigMap.getKind(), is(nullValue()));
        assertThat(v1ConfigMap.getMetadata(), is(nullValue()));
    }

    //BaseRock generated method id: ${testEmptyConstructor}, hash: 3139C623B7ADB9D5AD8D11571D75C41A
    @Test
    void testEmptyConstructor() {
        V1ConfigMap configMap = new V1ConfigMap();
        assertNotNull(configMap);
        assertTrue(configMap.getBinaryData().isEmpty());
        assertTrue(configMap.getData().isEmpty());
    }
}
