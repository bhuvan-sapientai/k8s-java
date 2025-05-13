package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1AWSElasticBlockStoreVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: FFD281B5A6083B538899524F8CECB8E3
    @Test
    void testConstructor() {
        V1AWSElasticBlockStoreVolumeSource volumeSource = new V1AWSElasticBlockStoreVolumeSource();
        assertNotNull(volumeSource);
    }

    //BaseRock generated method id: ${testFsType}, hash: D0C7F6577F26D11728C0F1B44388B984
    @Test
    void testFsType() {
        V1AWSElasticBlockStoreVolumeSource volumeSource = new V1AWSElasticBlockStoreVolumeSource();
        String fsType = "ext4";
        volumeSource.setFsType(fsType);
        assertEquals(fsType, volumeSource.getFsType());
    }

    //BaseRock generated method id: ${testPartition}, hash: 629428113A078F81E849DCAF7A106AE7
    @Test
    void testPartition() {
        V1AWSElasticBlockStoreVolumeSource volumeSource = new V1AWSElasticBlockStoreVolumeSource();
        Integer partition = 1;
        volumeSource.setPartition(partition);
        assertEquals(partition, volumeSource.getPartition());
    }

    //BaseRock generated method id: ${testReadOnly}, hash: 2C4FF3B30206586F56933EBF1B92A777
    @Test
    void testReadOnly() {
        V1AWSElasticBlockStoreVolumeSource volumeSource = new V1AWSElasticBlockStoreVolumeSource();
        Boolean readOnly = true;
        volumeSource.setReadOnly(readOnly);
        assertEquals(readOnly, volumeSource.getReadOnly());
    }

    //BaseRock generated method id: ${testVolumeID}, hash: 8CB0889C563E1C3E83160468473C8B10
    @Test
    void testVolumeID() {
        V1AWSElasticBlockStoreVolumeSource volumeSource = new V1AWSElasticBlockStoreVolumeSource();
        String volumeID = "vol-12345";
        volumeSource.setVolumeID(volumeID);
        assertEquals(volumeID, volumeSource.getVolumeID());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 694B981BCAF57EEB1A0249526F3F85E1
    @Test
    void testEqualsAndHashCode() {
        V1AWSElasticBlockStoreVolumeSource volumeSource1 = new V1AWSElasticBlockStoreVolumeSource().fsType("ext4").partition(1).readOnly(true).volumeID("vol-12345");
        V1AWSElasticBlockStoreVolumeSource volumeSource2 = new V1AWSElasticBlockStoreVolumeSource().fsType("ext4").partition(1).readOnly(true).volumeID("vol-12345");
        assertEquals(volumeSource1, volumeSource2);
        assertEquals(volumeSource1.hashCode(), volumeSource2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 4DC5F85017A9816B0790391DCF422D25
    @Test
    void testToString() {
        V1AWSElasticBlockStoreVolumeSource volumeSource = new V1AWSElasticBlockStoreVolumeSource().fsType("ext4").partition(1).readOnly(true).volumeID("vol-12345");
        String expected = "class V1AWSElasticBlockStoreVolumeSource {\n" + "    fsType: ext4\n" + "    partition: 1\n" + "    readOnly: true\n" + "    volumeID: vol-12345\n" + "}";
        assertEquals(expected, volumeSource.toString());
    }

    //BaseRock generated method id: ${testDifferentFsTypes}, hash: AF1109B0BA2249C912FE700F94823C1F
    @ParameterizedTest
    @ValueSource(strings = { "ext4", "xfs", "ntfs" })
    void testDifferentFsTypes(String fsType) {
        V1AWSElasticBlockStoreVolumeSource volumeSource = new V1AWSElasticBlockStoreVolumeSource();
        volumeSource.setFsType(fsType);
        assertEquals(fsType, volumeSource.getFsType());
    }

    //BaseRock generated method id: ${testNullFsType}, hash: 4B47C1B44D45E3AFD7B6233792FA8524
    @Test
    void testNullFsType() {
        V1AWSElasticBlockStoreVolumeSource volumeSource = new V1AWSElasticBlockStoreVolumeSource();
        volumeSource.setFsType(null);
        assertNull(volumeSource.getFsType());
    }

    //BaseRock generated method id: ${testNullPartition}, hash: 4FC767FBD9191963147D0BE56154FE5C
    @Test
    void testNullPartition() {
        V1AWSElasticBlockStoreVolumeSource volumeSource = new V1AWSElasticBlockStoreVolumeSource();
        volumeSource.setPartition(null);
        assertNull(volumeSource.getPartition());
    }

    //BaseRock generated method id: ${testNullReadOnly}, hash: CB5BE715B7AC58D0E8CCD697A9BC7BA6
    @Test
    void testNullReadOnly() {
        V1AWSElasticBlockStoreVolumeSource volumeSource = new V1AWSElasticBlockStoreVolumeSource();
        volumeSource.setReadOnly(null);
        assertNull(volumeSource.getReadOnly());
    }

    //BaseRock generated method id: ${testNonNullVolumeID}, hash: 9656501F6063FC1FADD63E279DB096B2
    @Disabled()
    @Test
    void testNonNullVolumeID() {
        V1AWSElasticBlockStoreVolumeSource volumeSource = new V1AWSElasticBlockStoreVolumeSource();
        assertThrows(IllegalArgumentException.class, () -> volumeSource.volumeID(null));
    }
}
