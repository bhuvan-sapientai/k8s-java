package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import io.kubernetes.client.common.KubernetesObject;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1SecretBaseRockGeneratedTest {

    private V1Secret v1Secret;

    @BeforeEach
    void setUp() {
        v1Secret = new V1Secret();
    }

    //BaseRock generated method id: ${testV1Secret}, hash: CCB1DEDC76857F3C20C71E73BFBB76E9
    @Test
    void testV1Secret() {
        assertNotNull(v1Secret);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: C0143E93AA8ECF862A5C0F6BCA1E4123
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1Secret.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1Secret.getApiVersion());
    }

    //BaseRock generated method id: ${testData}, hash: 813D0CC64432A64330D81C7B4081C045
    @Test
    void testData() {
        Map<String, byte[]> data = new HashMap<>();
        data.put("key1", "value1".getBytes());
        data.put("key2", "value2".getBytes());
        v1Secret.setData(data);
        assertEquals(data, v1Secret.getData());
    }

    //BaseRock generated method id: ${testPutDataItem}, hash: D43CCBE8F2DB3E6571F71E06B29C639D
    @Test
    void testPutDataItem() {
        String key = "testKey";
        byte[] value = "testValue".getBytes();
        v1Secret.putDataItem(key, value);
        assertArrayEquals(value, v1Secret.getData().get(key));
    }

    //BaseRock generated method id: ${testImmutable}, hash: 043710822250C93D4270D8E46F628E6E
    @Test
    void testImmutable() {
        v1Secret.setImmutable(true);
        assertTrue(v1Secret.getImmutable());
        v1Secret.setImmutable(false);
        assertFalse(v1Secret.getImmutable());
    }

    //BaseRock generated method id: ${testKind}, hash: 3111B18E0F210FD284006D090E74F567
    @Test
    void testKind() {
        String kind = "Secret";
        v1Secret.setKind(kind);
        assertEquals(kind, v1Secret.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 5A65823274DB84C1B87D0C7F45FD5F41
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1Secret.setMetadata(metadata);
        assertEquals(metadata, v1Secret.getMetadata());
    }

    //BaseRock generated method id: ${testStringData}, hash: E9BAB4C5F072D32F5E9165130701EB13
    @Test
    void testStringData() {
        Map<String, String> stringData = new HashMap<>();
        stringData.put("key1", "value1");
        stringData.put("key2", "value2");
        v1Secret.setStringData(stringData);
        assertEquals(stringData, v1Secret.getStringData());
    }

    //BaseRock generated method id: ${testPutStringDataItem}, hash: AD3558110D7132C78E2856E2A545CF46
    @Test
    void testPutStringDataItem() {
        String key = "testKey";
        String value = "testValue";
        v1Secret.putStringDataItem(key, value);
        assertEquals(value, v1Secret.getStringData().get(key));
    }

    //BaseRock generated method id: ${testType}, hash: B23B14E15CEB332C83CEA8F3626AC5CC
    @Test
    void testType() {
        String type = "Opaque";
        v1Secret.setType(type);
        assertEquals(type, v1Secret.getType());
    }

    //BaseRock generated method id: ${testEquals}, hash: 3D3A702251AAE629A7CD10CC05AD4DCF
    @Test
    void testEquals() {
        V1Secret secret1 = new V1Secret();
        V1Secret secret2 = new V1Secret();
        assertTrue(secret1.equals(secret2));
        secret1.setApiVersion("v1");
        secret2.setApiVersion("v1");
        Map<String, byte[]> data = new HashMap<>();
        data.put("key", "value".getBytes());
        secret1.setData(data);
        secret2.setData(data);
        secret1.setImmutable(true);
        secret2.setImmutable(true);
        secret1.setKind("Secret");
        secret2.setKind("Secret");
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        secret1.setMetadata(metadata);
        secret2.setMetadata(metadata);
        Map<String, String> stringData = new HashMap<>();
        stringData.put("key", "value");
        secret1.setStringData(stringData);
        secret2.setStringData(stringData);
        secret1.setType("Opaque");
        secret2.setType("Opaque");
        assertTrue(secret1.equals(secret2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 9A4976857CDA3656450AA47E0A1582B5
    @Test
    void testHashCode() {
        V1Secret secret1 = new V1Secret();
        V1Secret secret2 = new V1Secret();
        assertEquals(secret1.hashCode(), secret2.hashCode());
        secret1.setApiVersion("v1");
        secret2.setApiVersion("v1");
        Map<String, byte[]> data = new HashMap<>();
        data.put("key", "value".getBytes());
        secret1.setData(data);
        secret2.setData(data);
        secret1.setImmutable(true);
        secret2.setImmutable(true);
        secret1.setKind("Secret");
        secret2.setKind("Secret");
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        secret1.setMetadata(metadata);
        secret2.setMetadata(metadata);
        Map<String, String> stringData = new HashMap<>();
        stringData.put("key", "value");
        secret1.setStringData(stringData);
        secret2.setStringData(stringData);
        secret1.setType("Opaque");
        secret2.setType("Opaque");
        assertEquals(secret1.hashCode(), secret2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: B7C069667617A91E6A80F06DCD1B219D
    @Disabled()
    @Test
    void testToString() {
        V1Secret secret = new V1Secret().apiVersion("v1").kind("Secret").type("Opaque");
        Map<String, byte[]> data = new HashMap<>();
        byte[] value = "value".getBytes();
        data.put("key", value);
        secret.setData(data);
        Map<String, String> stringData = new HashMap<>();
        stringData.put("key", "value");
        secret.setStringData(stringData);
        String expected = "class V1Secret {\n" + "    apiVersion: v1\n" + "    data: {key=" + Arrays.toString(value) + "}\n" + "    immutable: null\n" + "    kind: Secret\n" + "    metadata: null\n" + "    stringData: {key=value}\n" + "    type: Opaque\n" + "}";
        assertEquals(expected, secret.toString());
    }

    //BaseRock generated method id: ${testImplementsKubernetesObject}, hash: BE05312D5FA416174067F9126CA2D81C
    @Test
    void testImplementsKubernetesObject() {
        assertTrue(v1Secret instanceof KubernetesObject);
    }
}
