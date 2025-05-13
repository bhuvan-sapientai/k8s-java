package io.kubernetes.client.openapi.models;

import java.util.Map;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1LocalObjectReference;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import io.kubernetes.client.openapi.models.V1CSIVolumeSource;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1CSIVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 5045FBD4F2D2D7E61B0C2F92A8346812
    @Test
    void testConstructor() {
        V1CSIVolumeSource volumeSource = new V1CSIVolumeSource();
        assertNotNull(volumeSource);
    }

    //BaseRock generated method id: ${testDriver}, hash: 0E4C29CE4D904D448123B57A3266F078
    @Test
    void testDriver() {
        V1CSIVolumeSource volumeSource = new V1CSIVolumeSource();
        String driver = "test-driver";
        volumeSource.setDriver(driver);
        assertEquals(driver, volumeSource.getDriver());
    }

    //BaseRock generated method id: ${testFsType}, hash: F5CADEDC7B3CD7BC808DB4A992734FFF
    @Test
    void testFsType() {
        V1CSIVolumeSource volumeSource = new V1CSIVolumeSource();
        String fsType = "ext4";
        volumeSource.setFsType(fsType);
        assertEquals(fsType, volumeSource.getFsType());
    }

    //BaseRock generated method id: ${testNodePublishSecretRef}, hash: E9EDD1425F13DA741960731FF7A234DA
    @Test
    void testNodePublishSecretRef() {
        V1CSIVolumeSource volumeSource = new V1CSIVolumeSource();
        V1LocalObjectReference secretRef = new V1LocalObjectReference();
        volumeSource.setNodePublishSecretRef(secretRef);
        assertEquals(secretRef, volumeSource.getNodePublishSecretRef());
    }

    //BaseRock generated method id: ${testReadOnly}, hash: B0A0F9BF0E9020ECFC01C8EADD0B7433
    @Test
    void testReadOnly() {
        V1CSIVolumeSource volumeSource = new V1CSIVolumeSource();
        volumeSource.setReadOnly(true);
        assertEquals(true, volumeSource.getReadOnly());
    }

    //BaseRock generated method id: ${testVolumeAttributes}, hash: 56BDBFC4101ABF23CDD335E9443CB85D
    @Test
    void testVolumeAttributes() {
        V1CSIVolumeSource volumeSource = new V1CSIVolumeSource();
        Map<String, String> attributes = new HashMap<>();
        attributes.put("key1", "value1");
        attributes.put("key2", "value2");
        volumeSource.setVolumeAttributes(attributes);
        assertEquals(attributes, volumeSource.getVolumeAttributes());
    }

    //BaseRock generated method id: ${testBuilder}, hash: 6C796F29BB19583334D4C0E618902CEE
    @Test
    void testBuilder() {
        String driver = "test-driver";
        String fsType = "ext4";
        V1LocalObjectReference secretRef = new V1LocalObjectReference();
        boolean readOnly = true;
        Map<String, String> attributes = new HashMap<>();
        attributes.put("key", "value");
        V1CSIVolumeSource volumeSource = new V1CSIVolumeSource().driver(driver).fsType(fsType).nodePublishSecretRef(secretRef).readOnly(readOnly).volumeAttributes(attributes);
        assertEquals(driver, volumeSource.getDriver());
        assertEquals(fsType, volumeSource.getFsType());
        assertEquals(secretRef, volumeSource.getNodePublishSecretRef());
        assertEquals(readOnly, volumeSource.getReadOnly());
        assertEquals(attributes, volumeSource.getVolumeAttributes());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 16B69C121D50F4EB9BD27B4914F03A6E
    @Test
    void testEqualsAndHashCode() {
        V1CSIVolumeSource volumeSource1 = new V1CSIVolumeSource().driver("driver1").fsType("ext4").readOnly(true);
        V1CSIVolumeSource volumeSource2 = new V1CSIVolumeSource().driver("driver1").fsType("ext4").readOnly(true);
        V1CSIVolumeSource volumeSource3 = new V1CSIVolumeSource().driver("driver2").fsType("xfs").readOnly(false);
        assertThat(volumeSource1, equalTo(volumeSource2));
        assertThat(volumeSource1.hashCode(), is(volumeSource2.hashCode()));
        assertThat(volumeSource1, is(notNullValue()));
        assertThat(volumeSource1.equals(volumeSource3), is(false));
    }

    //BaseRock generated method id: ${testToString}, hash: 5BFD935E72F1ADB45ECAFF1419407EE5
    @Test
    void testToString() {
        V1CSIVolumeSource volumeSource = new V1CSIVolumeSource().driver("test-driver").fsType("ext4").readOnly(true);
        String toString = volumeSource.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("driver"), is(true));
        assertThat(toString.contains("fsType"), is(true));
        assertThat(toString.contains("readOnly"), is(true));
    }

    //BaseRock generated method id: ${testSetDriverNull}, hash: C7C1E22A23FAD9B0D73D01516E020B4E
    @Disabled()
    @Test
    void testSetDriverNull() {
        V1CSIVolumeSource volumeSource = new V1CSIVolumeSource();
        assertThrows(NullPointerException.class, () -> volumeSource.setDriver(null));
    }

    //BaseRock generated method id: ${testPutVolumeAttributesItem}, hash: E8311F02A26F287974F7C2B770DE2F6D
    @Test
    void testPutVolumeAttributesItem() {
        V1CSIVolumeSource volumeSource = new V1CSIVolumeSource();
        volumeSource.putVolumeAttributesItem("key", "value");
        Map<String, String> attributes = volumeSource.getVolumeAttributes();
        assertThat(attributes, notNullValue());
        assertThat(attributes.get("key"), equalTo("value"));
    }
}
