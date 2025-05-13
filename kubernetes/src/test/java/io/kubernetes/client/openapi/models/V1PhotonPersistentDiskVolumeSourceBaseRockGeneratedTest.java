package io.kubernetes.client.openapi.models;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.hamcrest.Matchers.not;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1PhotonPersistentDiskVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 7F97C1237AE75D1A0C5670F15FD3B4B4
    @Test
    void testConstructor() {
        V1PhotonPersistentDiskVolumeSource volumeSource = new V1PhotonPersistentDiskVolumeSource();
        assertNotNull(volumeSource);
    }

    //BaseRock generated method id: ${testSetAndGetFsType}, hash: 6DAD9E909B40B16B279CA644B2C782D1
    @Test
    void testSetAndGetFsType() {
        V1PhotonPersistentDiskVolumeSource volumeSource = new V1PhotonPersistentDiskVolumeSource();
        String fsType = "ext4";
        volumeSource.setFsType(fsType);
        assertEquals(fsType, volumeSource.getFsType());
    }

    //BaseRock generated method id: ${testSetAndGetFsTypeWithVariousValues}, hash: 3EEC4722D58AA5AA45AC5C58F72C9668
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "ext3", "xfs", "ntfs" })
    void testSetAndGetFsTypeWithVariousValues(String fsType) {
        V1PhotonPersistentDiskVolumeSource volumeSource = new V1PhotonPersistentDiskVolumeSource();
        volumeSource.setFsType(fsType);
        assertEquals(fsType, volumeSource.getFsType());
    }

    //BaseRock generated method id: ${testSetAndGetPdID}, hash: 968EA58C64AAFD63BE3EC5830EA3B7CE
    @Test
    void testSetAndGetPdID() {
        V1PhotonPersistentDiskVolumeSource volumeSource = new V1PhotonPersistentDiskVolumeSource();
        String pdID = "disk-001";
        volumeSource.setPdID(pdID);
        assertEquals(pdID, volumeSource.getPdID());
    }

    //BaseRock generated method id: ${testSetAndGetPdIDWithVariousValues}, hash: 36AC52BC5C65D13CCE475D8086D5FE40
    @ParameterizedTest
    @ValueSource(strings = { "disk-001", "disk-002", "disk-003" })
    void testSetAndGetPdIDWithVariousValues(String pdID) {
        V1PhotonPersistentDiskVolumeSource volumeSource = new V1PhotonPersistentDiskVolumeSource();
        volumeSource.setPdID(pdID);
        assertEquals(pdID, volumeSource.getPdID());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 804604AFBA36C72982B80C88D04A1A52
    @Test
    void testEqualsAndHashCode() {
        V1PhotonPersistentDiskVolumeSource volumeSource1 = new V1PhotonPersistentDiskVolumeSource().fsType("ext4").pdID("disk-001");
        V1PhotonPersistentDiskVolumeSource volumeSource2 = new V1PhotonPersistentDiskVolumeSource().fsType("ext4").pdID("disk-001");
        V1PhotonPersistentDiskVolumeSource volumeSource3 = new V1PhotonPersistentDiskVolumeSource().fsType("xfs").pdID("disk-002");
        assertAll(() -> assertEquals(volumeSource1, volumeSource2), () -> assertEquals(volumeSource1.hashCode(), volumeSource2.hashCode()), () -> assertThat(volumeSource1, is(equalTo(volumeSource2))), () -> assertThat(volumeSource1, is(not(equalTo(volumeSource3)))));
    }

    //BaseRock generated method id: ${testToString}, hash: 498CFF89057CD26970E50B227A4776CA
    @Test
    void testToString() {
        V1PhotonPersistentDiskVolumeSource volumeSource = new V1PhotonPersistentDiskVolumeSource().fsType("ext4").pdID("disk-001");
        String toString = volumeSource.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("fsType"), is(true));
        assertThat(toString.contains("pdID"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 755D3D45BE63DD90AD25A175B7000ABD
    @Test
    void testBuilder() {
        V1PhotonPersistentDiskVolumeSource volumeSource = new V1PhotonPersistentDiskVolumeSource().fsType("ext4").pdID("disk-001");
        assertAll(() -> assertEquals("ext4", volumeSource.getFsType()), () -> assertEquals("disk-001", volumeSource.getPdID()));
    }

    //BaseRock generated method id: ${testBuilderWithNullValues}, hash: 327DC6F2460B8210FAFB3179B815684C
    @Test
    void testBuilderWithNullValues() {
        V1PhotonPersistentDiskVolumeSource volumeSource = new V1PhotonPersistentDiskVolumeSource().fsType(null).pdID(null);
        assertAll(() -> assertNull(volumeSource.getFsType()), () -> assertNull(volumeSource.getPdID()));
    }

    //BaseRock generated method id: ${testInvalidPdIDThrowsException}, hash: E4183008778EF955F038EA3B2F32A1FB
    @Disabled()
    @Test
    void testInvalidPdIDThrowsException() {
        V1PhotonPersistentDiskVolumeSource volumeSource = new V1PhotonPersistentDiskVolumeSource();
        assertThrows(NullPointerException.class, () -> volumeSource.setPdID(null));
    }
}
