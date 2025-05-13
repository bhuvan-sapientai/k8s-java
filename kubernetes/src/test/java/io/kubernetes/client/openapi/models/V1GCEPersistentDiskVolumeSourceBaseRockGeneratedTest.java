package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1GCEPersistentDiskVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 79B95A986150B906E79D035F522BE6AF
    @Test
    void testConstructor() {
        V1GCEPersistentDiskVolumeSource volumeSource = new V1GCEPersistentDiskVolumeSource();
        assertThat(volumeSource, is(notNullValue()));
    }

    //BaseRock generated method id: ${testFsType}, hash: 239EE8E8C80C9F3852D4086A0343C202
    @Test
    void testFsType() {
        V1GCEPersistentDiskVolumeSource volumeSource = new V1GCEPersistentDiskVolumeSource();
        String fsType = "ext4";
        volumeSource.setFsType(fsType);
        assertEquals(fsType, volumeSource.getFsType());
    }

    //BaseRock generated method id: ${testPartition}, hash: 2F50F2F7873238AF087B17286793289A
    @Test
    void testPartition() {
        V1GCEPersistentDiskVolumeSource volumeSource = new V1GCEPersistentDiskVolumeSource();
        Integer partition = 1;
        volumeSource.setPartition(partition);
        assertEquals(partition, volumeSource.getPartition());
    }

    //BaseRock generated method id: ${testPdName}, hash: 6A3D73DEF51F7968FDCDE3091F8B9987
    @Test
    void testPdName() {
        V1GCEPersistentDiskVolumeSource volumeSource = new V1GCEPersistentDiskVolumeSource();
        String pdName = "test-pd";
        volumeSource.setPdName(pdName);
        assertEquals(pdName, volumeSource.getPdName());
    }

    //BaseRock generated method id: ${testReadOnly}, hash: 6FA3999A0F4AA4B524AEDE46A0D135F0
    @Test
    void testReadOnly() {
        V1GCEPersistentDiskVolumeSource volumeSource = new V1GCEPersistentDiskVolumeSource();
        volumeSource.setReadOnly(true);
        assertTrue(volumeSource.getReadOnly());
        volumeSource.setReadOnly(false);
        assertFalse(volumeSource.getReadOnly());
    }

    //BaseRock generated method id: ${testEquals}, hash: 7487B264A14DD00199B0E77338AF754F
    @Test
    void testEquals() {
        V1GCEPersistentDiskVolumeSource volumeSource1 = new V1GCEPersistentDiskVolumeSource().fsType("ext4").partition(1).pdName("test-pd").readOnly(true);
        V1GCEPersistentDiskVolumeSource volumeSource2 = new V1GCEPersistentDiskVolumeSource().fsType("ext4").partition(1).pdName("test-pd").readOnly(true);
        assertTrue(volumeSource1.equals(volumeSource2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 4DD3CF75B1B2724DB3F316F9FAFE6339
    @Test
    void testHashCode() {
        V1GCEPersistentDiskVolumeSource volumeSource1 = new V1GCEPersistentDiskVolumeSource().fsType("ext4").partition(1).pdName("test-pd").readOnly(true);
        V1GCEPersistentDiskVolumeSource volumeSource2 = new V1GCEPersistentDiskVolumeSource().fsType("ext4").partition(1).pdName("test-pd").readOnly(true);
        assertEquals(volumeSource1.hashCode(), volumeSource2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: D120DCBC9BF70909EF7ABAADBA8AA557
    @Test
    void testToString() {
        V1GCEPersistentDiskVolumeSource volumeSource = new V1GCEPersistentDiskVolumeSource().fsType("ext4").partition(1).pdName("test-pd").readOnly(true);
        String expectedString = "class V1GCEPersistentDiskVolumeSource {\n    fsType: ext4\n    partition: 1\n    pdName: test-pd\n    readOnly: true\n}";
        assertEquals(expectedString, volumeSource.toString());
    }

    //BaseRock generated method id: ${testBuilder}, hash: D3831BD25BB1185DD104E398C10A464B
    @Test
    void testBuilder() {
        V1GCEPersistentDiskVolumeSource volumeSource = new V1GCEPersistentDiskVolumeSource().fsType("ext4").partition(1).pdName("test-pd").readOnly(true);
        assertEquals("ext4", volumeSource.getFsType());
        assertEquals(Integer.valueOf(1), volumeSource.getPartition());
        assertEquals("test-pd", volumeSource.getPdName());
        assertTrue(volumeSource.getReadOnly());
    }

    //BaseRock generated method id: ${testNullValues}, hash: BC47C6B2823E7FF6E924BC3FE6B07653
    @Test
    void testNullValues() {
        V1GCEPersistentDiskVolumeSource volumeSource = new V1GCEPersistentDiskVolumeSource();
        assertNull(volumeSource.getFsType());
        assertNull(volumeSource.getPartition());
        assertNull(volumeSource.getPdName());
        assertNull(volumeSource.getReadOnly());
    }
}
