package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSource;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import io.kubernetes.client.openapi.models.V1SecretReference;
import java.util.HashMap;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CSIPersistentVolumeSourceBaseRockGeneratedTest {

    private V1CSIPersistentVolumeSource v1CSIPersistentVolumeSource;

    @BeforeEach
    void setUp() {
        v1CSIPersistentVolumeSource = new V1CSIPersistentVolumeSource();
    }

    //BaseRock generated method id: ${testControllerExpandSecretRef}, hash: 0815CA7458E3C861E340C770F41A36BB
    @Test
    void testControllerExpandSecretRef() {
        V1SecretReference secretRef = mock(V1SecretReference.class);
        v1CSIPersistentVolumeSource.setControllerExpandSecretRef(secretRef);
        assertEquals(secretRef, v1CSIPersistentVolumeSource.getControllerExpandSecretRef());
    }

    //BaseRock generated method id: ${testControllerPublishSecretRef}, hash: 92FC0C0585B5186C8E63E5C1E3A338AF
    @Test
    void testControllerPublishSecretRef() {
        V1SecretReference secretRef = mock(V1SecretReference.class);
        v1CSIPersistentVolumeSource.setControllerPublishSecretRef(secretRef);
        assertEquals(secretRef, v1CSIPersistentVolumeSource.getControllerPublishSecretRef());
    }

    //BaseRock generated method id: ${testDriver}, hash: 08BE9103545476C9FE2E41380DF4F594
    @Test
    void testDriver() {
        String driver = "test-driver";
        v1CSIPersistentVolumeSource.setDriver(driver);
        assertEquals(driver, v1CSIPersistentVolumeSource.getDriver());
    }

    //BaseRock generated method id: ${testFsType}, hash: D248BE276B46758E4023C3D46979B2F5
    @Test
    void testFsType() {
        String fsType = "ext4";
        v1CSIPersistentVolumeSource.setFsType(fsType);
        assertEquals(fsType, v1CSIPersistentVolumeSource.getFsType());
    }

    //BaseRock generated method id: ${testNodeExpandSecretRef}, hash: CF8E1119104912D7F97FE4043000E994
    @Test
    void testNodeExpandSecretRef() {
        V1SecretReference secretRef = mock(V1SecretReference.class);
        v1CSIPersistentVolumeSource.setNodeExpandSecretRef(secretRef);
        assertEquals(secretRef, v1CSIPersistentVolumeSource.getNodeExpandSecretRef());
    }

    //BaseRock generated method id: ${testNodePublishSecretRef}, hash: 8C09A8A70CEA46ED2416D6E964E7B622
    @Test
    void testNodePublishSecretRef() {
        V1SecretReference secretRef = mock(V1SecretReference.class);
        v1CSIPersistentVolumeSource.setNodePublishSecretRef(secretRef);
        assertEquals(secretRef, v1CSIPersistentVolumeSource.getNodePublishSecretRef());
    }

    //BaseRock generated method id: ${testNodeStageSecretRef}, hash: C631CA0489B9172FD6201ACD00088D08
    @Test
    void testNodeStageSecretRef() {
        V1SecretReference secretRef = mock(V1SecretReference.class);
        v1CSIPersistentVolumeSource.setNodeStageSecretRef(secretRef);
        assertEquals(secretRef, v1CSIPersistentVolumeSource.getNodeStageSecretRef());
    }

    //BaseRock generated method id: ${testReadOnly}, hash: 8B44027D3D2F55C7941C5ED106A11368
    @Test
    void testReadOnly() {
        v1CSIPersistentVolumeSource.setReadOnly(true);
        assertTrue(v1CSIPersistentVolumeSource.getReadOnly());
        v1CSIPersistentVolumeSource.setReadOnly(false);
        assertFalse(v1CSIPersistentVolumeSource.getReadOnly());
    }

    //BaseRock generated method id: ${testVolumeAttributes}, hash: 47BF7C076274648F9448F119DC026DA3
    @Test
    void testVolumeAttributes() {
        Map<String, String> attributes = new HashMap<>();
        attributes.put("key1", "value1");
        attributes.put("key2", "value2");
        v1CSIPersistentVolumeSource.setVolumeAttributes(attributes);
        assertEquals(attributes, v1CSIPersistentVolumeSource.getVolumeAttributes());
    }

    //BaseRock generated method id: ${testVolumeHandle}, hash: 75523B80FA15EB4DA62A75D3DC56C7C7
    @Test
    void testVolumeHandle() {
        String volumeHandle = "test-volume-handle";
        v1CSIPersistentVolumeSource.setVolumeHandle(volumeHandle);
        assertEquals(volumeHandle, v1CSIPersistentVolumeSource.getVolumeHandle());
    }

    //BaseRock generated method id: ${testEquals}, hash: 53E4BAB921ABAAD16328DF011D2BC7BF
    @Test
    void testEquals() {
        V1CSIPersistentVolumeSource source1 = new V1CSIPersistentVolumeSource().driver("driver1").volumeHandle("handle1");
        V1CSIPersistentVolumeSource source2 = new V1CSIPersistentVolumeSource().driver("driver1").volumeHandle("handle1");
        V1CSIPersistentVolumeSource source3 = new V1CSIPersistentVolumeSource().driver("driver2").volumeHandle("handle2");
        assertTrue(source1.equals(source2));
        assertFalse(source1.equals(source3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 0F35F2026E3C44DDB7F85932F4FF436A
    @Test
    void testHashCode() {
        V1CSIPersistentVolumeSource source1 = new V1CSIPersistentVolumeSource().driver("driver1").volumeHandle("handle1");
        V1CSIPersistentVolumeSource source2 = new V1CSIPersistentVolumeSource().driver("driver1").volumeHandle("handle1");
        assertEquals(source1.hashCode(), source2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 1BDEF6B15F5BE72729374133E649E045
    @Test
    void testToString() {
        V1CSIPersistentVolumeSource source = new V1CSIPersistentVolumeSource().driver("test-driver").volumeHandle("test-handle");
        String toString = source.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("driver"), is(true));
        assertThat(toString.contains("test-driver"), is(true));
        assertThat(toString.contains("volumeHandle"), is(true));
        assertThat(toString.contains("test-handle"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: C566FD9D214DD46071181BFAA9A72C5C
    @Test
    void testBuilder() {
        V1CSIPersistentVolumeSource source = new V1CSIPersistentVolumeSource().driver("test-driver").volumeHandle("test-handle").fsType("ext4").readOnly(true);
        assertThat(source, is(notNullValue()));
        assertThat(source.getDriver(), is(equalTo("test-driver")));
        assertThat(source.getVolumeHandle(), is(equalTo("test-handle")));
        assertThat(source.getFsType(), is(equalTo("ext4")));
        assertThat(source.getReadOnly(), is(true));
    }

    //BaseRock generated method id: ${testNullValues}, hash: C5A71E59A5FE1C58F8D622B3091274D8
    @Test
    void testNullValues() {
        V1CSIPersistentVolumeSource source = new V1CSIPersistentVolumeSource();
        assertNull(source.getDriver());
        assertNull(source.getVolumeHandle());
        assertNull(source.getFsType());
        assertNull(source.getReadOnly());
        assertNull(source.getControllerExpandSecretRef());
        assertNull(source.getControllerPublishSecretRef());
        assertNull(source.getNodeExpandSecretRef());
        assertNull(source.getNodePublishSecretRef());
        assertNull(source.getNodeStageSecretRef());
    }
}
