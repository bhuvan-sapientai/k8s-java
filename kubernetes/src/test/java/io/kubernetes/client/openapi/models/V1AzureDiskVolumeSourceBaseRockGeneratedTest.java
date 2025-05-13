package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1AzureDiskVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: FE254FCCF9CCF93C29A467FC6275A9AC
    @Test
    void testConstructor() {
        V1AzureDiskVolumeSource source = new V1AzureDiskVolumeSource();
        assertNotNull(source);
    }

    //BaseRock generated method id: ${testSetAndGetCachingMode}, hash: 1599FE8440E6DF42C1B58D0BB964F410
    @Test
    void testSetAndGetCachingMode() {
        V1AzureDiskVolumeSource source = new V1AzureDiskVolumeSource();
        String cachingMode = "ReadOnly";
        source.setCachingMode(cachingMode);
        assertEquals(cachingMode, source.getCachingMode());
    }

    //BaseRock generated method id: ${testSetAndGetCachingModeWithVariousValues}, hash: 3903218E5C76974BF234FCEC9997D75F
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "None", "ReadWrite" })
    void testSetAndGetCachingModeWithVariousValues(String cachingMode) {
        V1AzureDiskVolumeSource source = new V1AzureDiskVolumeSource();
        source.setCachingMode(cachingMode);
        assertEquals(cachingMode, source.getCachingMode());
    }

    //BaseRock generated method id: ${testSetAndGetDiskName}, hash: 82765D4779619FDB7E0D0BC6CA218389
    @Test
    void testSetAndGetDiskName() {
        V1AzureDiskVolumeSource source = new V1AzureDiskVolumeSource();
        String diskName = "testDisk";
        source.setDiskName(diskName);
        assertEquals(diskName, source.getDiskName());
    }

    //BaseRock generated method id: ${testSetAndGetDiskURI}, hash: B115B9BF4B0FA8D9B11F64FDE32802E2
    @Test
    void testSetAndGetDiskURI() {
        V1AzureDiskVolumeSource source = new V1AzureDiskVolumeSource();
        String diskURI = "https://example.com/disk";
        source.setDiskURI(diskURI);
        assertEquals(diskURI, source.getDiskURI());
    }

    //BaseRock generated method id: ${testSetAndGetFsType}, hash: C43A2816F085B462C1FE0606C2BEEB3A
    @Test
    void testSetAndGetFsType() {
        V1AzureDiskVolumeSource source = new V1AzureDiskVolumeSource();
        String fsType = "ext4";
        source.setFsType(fsType);
        assertEquals(fsType, source.getFsType());
    }

    //BaseRock generated method id: ${testSetAndGetFsTypeWithVariousValues}, hash: FAC503F28EDCFF1F6ECD7D923E6F7816
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "ntfs", "xfs" })
    void testSetAndGetFsTypeWithVariousValues(String fsType) {
        V1AzureDiskVolumeSource source = new V1AzureDiskVolumeSource();
        source.setFsType(fsType);
        assertEquals(fsType, source.getFsType());
    }

    //BaseRock generated method id: ${testSetAndGetKind}, hash: 8260EBF8F05115A18140C51494CAC693
    @Test
    void testSetAndGetKind() {
        V1AzureDiskVolumeSource source = new V1AzureDiskVolumeSource();
        String kind = "Shared";
        source.setKind(kind);
        assertEquals(kind, source.getKind());
    }

    //BaseRock generated method id: ${testSetAndGetKindWithVariousValues}, hash: 5820790E961D8C571A5BADA944D90E7E
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Dedicated", "Managed" })
    void testSetAndGetKindWithVariousValues(String kind) {
        V1AzureDiskVolumeSource source = new V1AzureDiskVolumeSource();
        source.setKind(kind);
        assertEquals(kind, source.getKind());
    }

    //BaseRock generated method id: ${testSetAndGetReadOnly}, hash: 6CDAFCEF16B029EB6BF5B671C797E29B
    @Test
    void testSetAndGetReadOnly() {
        V1AzureDiskVolumeSource source = new V1AzureDiskVolumeSource();
        source.setReadOnly(true);
        assertTrue(source.getReadOnly());
        source.setReadOnly(false);
        assertFalse(source.getReadOnly());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 22C929E39081FD5DBB6A839497153A1F
    @Test
    void testEqualsAndHashCode() {
        V1AzureDiskVolumeSource source1 = new V1AzureDiskVolumeSource().cachingMode("ReadOnly").diskName("disk1").diskURI("https://example.com/disk1").fsType("ext4").kind("Shared").readOnly(true);
        V1AzureDiskVolumeSource source2 = new V1AzureDiskVolumeSource().cachingMode("ReadOnly").diskName("disk1").diskURI("https://example.com/disk1").fsType("ext4").kind("Shared").readOnly(true);
        V1AzureDiskVolumeSource source3 = new V1AzureDiskVolumeSource().cachingMode("ReadWrite").diskName("disk2").diskURI("https://example.com/disk2").fsType("ntfs").kind("Dedicated").readOnly(false);
        assertEquals(source1, source2);
        assertNotEquals(source1, source3);
        assertEquals(source1.hashCode(), source2.hashCode());
        assertNotEquals(source1.hashCode(), source3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 57FEABA2E81A475D172AB5ADE78BA093
    @Test
    void testToString() {
        V1AzureDiskVolumeSource source = new V1AzureDiskVolumeSource().cachingMode("ReadOnly").diskName("testDisk").diskURI("https://example.com/testDisk").fsType("ext4").kind("Shared").readOnly(true);
        String toString = source.toString();
        assertThat(toString, containsString("cachingMode: ReadOnly"));
        assertThat(toString, containsString("diskName: testDisk"));
        assertThat(toString, containsString("diskURI: https://example.com/testDisk"));
        assertThat(toString, containsString("fsType: ext4"));
        assertThat(toString, containsString("kind: Shared"));
        assertThat(toString, containsString("readOnly: true"));
    }

    //BaseRock generated method id: ${testBuilder}, hash: D5BF5FAB6218B36E8A0961589A000256
    @Test
    void testBuilder() {
        V1AzureDiskVolumeSource source = new V1AzureDiskVolumeSource().cachingMode("ReadOnly").diskName("testDisk").diskURI("https://example.com/testDisk").fsType("ext4").kind("Shared").readOnly(true);
        assertEquals("ReadOnly", source.getCachingMode());
        assertEquals("testDisk", source.getDiskName());
        assertEquals("https://example.com/testDisk", source.getDiskURI());
        assertEquals("ext4", source.getFsType());
        assertEquals("Shared", source.getKind());
        assertTrue(source.getReadOnly());
    }
}
