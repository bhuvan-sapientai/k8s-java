package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.V1SecretReference;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CinderPersistentVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 9F4D3038959C985B35A421F22A7FEEF8
    @Test
    void testConstructor() {
        V1CinderPersistentVolumeSource source = new V1CinderPersistentVolumeSource();
        assertNotNull(source);
    }

    //BaseRock generated method id: ${testFsType}, hash: B5C006D7AAC63F5D9808F990D89291DE
    @Test
    void testFsType() {
        V1CinderPersistentVolumeSource source = new V1CinderPersistentVolumeSource();
        String fsType = "ext4";
        source.setFsType(fsType);
        assertEquals(fsType, source.getFsType());
    }

    //BaseRock generated method id: ${testFsTypeWithDifferentValues}, hash: 458EA46E182E8B7D34AD7A735097BBDB
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "xfs", "ntfs" })
    void testFsTypeWithDifferentValues(String fsType) {
        V1CinderPersistentVolumeSource source = new V1CinderPersistentVolumeSource();
        source.setFsType(fsType);
        assertEquals(fsType, source.getFsType());
    }

    //BaseRock generated method id: ${testReadOnly}, hash: 1D5B3C68A4C2D7CDD4E5BE7F4A64B3BB
    @Test
    void testReadOnly() {
        V1CinderPersistentVolumeSource source = new V1CinderPersistentVolumeSource();
        source.setReadOnly(true);
        assertTrue(source.getReadOnly());
        source.setReadOnly(false);
        assertFalse(source.getReadOnly());
    }

    //BaseRock generated method id: ${testSecretRef}, hash: 7A026A56251FF38D21E9061636285826
    @Test
    void testSecretRef() {
        V1CinderPersistentVolumeSource source = new V1CinderPersistentVolumeSource();
        V1SecretReference secretRef = new V1SecretReference();
        source.setSecretRef(secretRef);
        assertEquals(secretRef, source.getSecretRef());
    }

    //BaseRock generated method id: ${testVolumeID}, hash: 50E7900052BB94884C446E6622CA2127
    @Test
    void testVolumeID() {
        V1CinderPersistentVolumeSource source = new V1CinderPersistentVolumeSource();
        String volumeID = "test-volume-id";
        source.setVolumeID(volumeID);
        assertEquals(volumeID, source.getVolumeID());
    }

    //BaseRock generated method id: ${testEquals}, hash: 43394CEF05460EEC23675BF07C9C4AF6
    @Test
    void testEquals() {
        V1CinderPersistentVolumeSource source1 = new V1CinderPersistentVolumeSource().fsType("ext4").readOnly(true).secretRef(new V1SecretReference()).volumeID("volume-1");
        V1CinderPersistentVolumeSource source2 = new V1CinderPersistentVolumeSource().fsType("ext4").readOnly(true).secretRef(new V1SecretReference()).volumeID("volume-1");
        assertEquals(source1, source2);
        source2.setVolumeID("volume-2");
        assertNotEquals(source1, source2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: E0A93599EFE88D6F9AFE888EB5215962
    @Test
    void testHashCode() {
        V1CinderPersistentVolumeSource source1 = new V1CinderPersistentVolumeSource().fsType("ext4").readOnly(true).secretRef(new V1SecretReference()).volumeID("volume-1");
        V1CinderPersistentVolumeSource source2 = new V1CinderPersistentVolumeSource().fsType("ext4").readOnly(true).secretRef(new V1SecretReference()).volumeID("volume-1");
        assertEquals(source1.hashCode(), source2.hashCode());
        source2.setVolumeID("volume-2");
        assertNotEquals(source1.hashCode(), source2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: A584FC22978E1D0A739CA656D3B0BAA4
    @Test
    void testToString() {
        V1CinderPersistentVolumeSource source = new V1CinderPersistentVolumeSource().fsType("ext4").readOnly(true).secretRef(new V1SecretReference()).volumeID("volume-1");
        String toString = source.toString();
        assertTrue(toString.contains("fsType"));
        assertTrue(toString.contains("readOnly"));
        assertTrue(toString.contains("secretRef"));
        assertTrue(toString.contains("volumeID"));
    }
}
