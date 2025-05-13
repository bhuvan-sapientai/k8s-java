package io.kubernetes.client.openapi.models;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import io.kubernetes.client.openapi.models.V1LocalObjectReference;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import java.util.HashSet;
import java.util.Set;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1StorageOSVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1StorageOSVolumeSourceConstructor}, hash: 5DF19AF9F38D1C666F134307D52973E8
    @Test
    void testV1StorageOSVolumeSourceConstructor() {
        V1StorageOSVolumeSource v1StorageOSVolumeSource = new V1StorageOSVolumeSource();
        assertThat(v1StorageOSVolumeSource, is(notNullValue()));
    }

    //BaseRock generated method id: ${testFsType}, hash: 96CAA819ECF7634C224A20CF723C4276
    @Test
    void testFsType() {
        V1StorageOSVolumeSource v1StorageOSVolumeSource = new V1StorageOSVolumeSource();
        String fsType = "ext4";
        v1StorageOSVolumeSource.setFsType(fsType);
        assertEquals(fsType, v1StorageOSVolumeSource.getFsType());
    }

    //BaseRock generated method id: ${testReadOnly}, hash: 7441160630017DB606686FB9F55EF4C1
    @Test
    void testReadOnly() {
        V1StorageOSVolumeSource v1StorageOSVolumeSource = new V1StorageOSVolumeSource();
        v1StorageOSVolumeSource.setReadOnly(true);
        assertTrue(v1StorageOSVolumeSource.getReadOnly());
        v1StorageOSVolumeSource.setReadOnly(false);
        assertFalse(v1StorageOSVolumeSource.getReadOnly());
    }

    //BaseRock generated method id: ${testSecretRef}, hash: 38AA3FCBA60228A91F4050C5B9A6F528
    @Test
    void testSecretRef() {
        V1StorageOSVolumeSource v1StorageOSVolumeSource = new V1StorageOSVolumeSource();
        V1LocalObjectReference secretRef = new V1LocalObjectReference();
        v1StorageOSVolumeSource.setSecretRef(secretRef);
        assertEquals(secretRef, v1StorageOSVolumeSource.getSecretRef());
    }

    //BaseRock generated method id: ${testVolumeName}, hash: 91C32198C2EE5F636E0F286482E6AA7D
    @Test
    void testVolumeName() {
        V1StorageOSVolumeSource v1StorageOSVolumeSource = new V1StorageOSVolumeSource();
        String volumeName = "testVolume";
        v1StorageOSVolumeSource.setVolumeName(volumeName);
        assertEquals(volumeName, v1StorageOSVolumeSource.getVolumeName());
    }

    //BaseRock generated method id: ${testVolumeNamespace}, hash: 4A6F525F41004C28FB8E32605C95D799
    @Test
    void testVolumeNamespace() {
        V1StorageOSVolumeSource v1StorageOSVolumeSource = new V1StorageOSVolumeSource();
        String volumeNamespace = "testNamespace";
        v1StorageOSVolumeSource.setVolumeNamespace(volumeNamespace);
        assertEquals(volumeNamespace, v1StorageOSVolumeSource.getVolumeNamespace());
    }

    //BaseRock generated method id: ${testEquals}, hash: DA943FA27960147E084BE2FD5BB6FE20
    @Test
    void testEquals() {
        V1StorageOSVolumeSource v1 = new V1StorageOSVolumeSource().fsType("ext4").readOnly(true).secretRef(new V1LocalObjectReference()).volumeName("vol1").volumeNamespace("ns1");
        V1StorageOSVolumeSource v2 = new V1StorageOSVolumeSource().fsType("ext4").readOnly(true).secretRef(new V1LocalObjectReference()).volumeName("vol1").volumeNamespace("ns1");
        V1StorageOSVolumeSource v3 = new V1StorageOSVolumeSource().fsType("xfs").readOnly(false).secretRef(new V1LocalObjectReference()).volumeName("vol2").volumeNamespace("ns2");
        assertTrue(v1.equals(v2));
        assertTrue(v2.equals(v1));
        assertFalse(v1.equals(v3));
        assertFalse(v3.equals(v1));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 6547189D32E7889AC4C8303B3E691682
    @Test
    void testHashCode() {
        V1StorageOSVolumeSource v1 = new V1StorageOSVolumeSource().fsType("ext4").readOnly(true).secretRef(new V1LocalObjectReference()).volumeName("vol1").volumeNamespace("ns1");
        V1StorageOSVolumeSource v2 = new V1StorageOSVolumeSource().fsType("ext4").readOnly(true).secretRef(new V1LocalObjectReference()).volumeName("vol1").volumeNamespace("ns1");
        V1StorageOSVolumeSource v3 = new V1StorageOSVolumeSource().fsType("xfs").readOnly(false).secretRef(new V1LocalObjectReference()).volumeName("vol2").volumeNamespace("ns2");
        assertEquals(v1.hashCode(), v2.hashCode());
        assertNotEquals(v1.hashCode(), v3.hashCode());
        Set<V1StorageOSVolumeSource> set = new HashSet<>();
        set.add(v1);
        assertTrue(set.contains(v2));
        assertFalse(set.contains(v3));
    }

    //BaseRock generated method id: ${testToString}, hash: 41CBF88E6605FBC40369E88D1DF61126
    @Test
    void testToString() {
        V1StorageOSVolumeSource v1StorageOSVolumeSource = new V1StorageOSVolumeSource().fsType("ext4").readOnly(true).secretRef(new V1LocalObjectReference()).volumeName("testVolume").volumeNamespace("testNamespace");
        String expectedString = "class V1StorageOSVolumeSource {\n" + "    fsType: ext4\n" + "    readOnly: true\n" + "    secretRef: class V1LocalObjectReference {\n" + "        name: null\n" + "    }\n" + "    volumeName: testVolume\n" + "    volumeNamespace: testNamespace\n" + "}";
        assertEquals(expectedString, v1StorageOSVolumeSource.toString());
    }

    //BaseRock generated method id: ${testDifferentFsTypes}, hash: 758305D2F28766C1869E7CB23A012810
    @ParameterizedTest
    @ValueSource(strings = { "ext4", "xfs", "ntfs" })
    void testDifferentFsTypes(String fsType) {
        V1StorageOSVolumeSource v1StorageOSVolumeSource = new V1StorageOSVolumeSource();
        v1StorageOSVolumeSource.setFsType(fsType);
        assertEquals(fsType, v1StorageOSVolumeSource.getFsType());
    }

    //BaseRock generated method id: ${testNullValues}, hash: 6FA7FFB0D2CD0D51E2FCD5F07E83C3B0
    @Test
    void testNullValues() {
        V1StorageOSVolumeSource v1StorageOSVolumeSource = new V1StorageOSVolumeSource();
        assertAll(() -> assertNull(v1StorageOSVolumeSource.getFsType()), () -> assertNull(v1StorageOSVolumeSource.getReadOnly()), () -> assertNull(v1StorageOSVolumeSource.getSecretRef()), () -> assertNull(v1StorageOSVolumeSource.getVolumeName()), () -> assertNull(v1StorageOSVolumeSource.getVolumeNamespace()));
    }

    //BaseRock generated method id: ${testBuilder}, hash: A22826377DEF36F8099CEBBFB90160D0
    @Test
    void testBuilder() {
        V1StorageOSVolumeSource v1StorageOSVolumeSource = new V1StorageOSVolumeSource().fsType("ext4").readOnly(true).secretRef(new V1LocalObjectReference()).volumeName("testVolume").volumeNamespace("testNamespace");
        assertThat(v1StorageOSVolumeSource.getFsType(), is(equalTo("ext4")));
        assertThat(v1StorageOSVolumeSource.getReadOnly(), is(true));
        assertThat(v1StorageOSVolumeSource.getSecretRef(), is(notNullValue()));
        assertThat(v1StorageOSVolumeSource.getVolumeName(), is(equalTo("testVolume")));
        assertThat(v1StorageOSVolumeSource.getVolumeNamespace(), is(equalTo("testNamespace")));
    }
}
