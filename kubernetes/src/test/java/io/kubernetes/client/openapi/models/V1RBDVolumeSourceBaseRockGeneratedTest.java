package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1LocalObjectReference;
import io.kubernetes.client.openapi.models.V1RBDVolumeSource;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertAll;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1RBDVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1RBDVolumeSourceConstructor}, hash: 2EAE1801419AB0BE1FB4A89E1BEC3BCC
    @Test
    void testV1RBDVolumeSourceConstructor() {
        V1RBDVolumeSource v1RBDVolumeSource = new V1RBDVolumeSource();
        assertThat(v1RBDVolumeSource, is(notNullValue()));
    }

    //BaseRock generated method id: ${testFsType}, hash: 7573A7E4568ADE562991A51A1239B931
    @Test
    void testFsType() {
        V1RBDVolumeSource v1RBDVolumeSource = new V1RBDVolumeSource();
        String fsType = "ext4";
        v1RBDVolumeSource.setFsType(fsType);
        assertEquals(fsType, v1RBDVolumeSource.getFsType());
    }

    //BaseRock generated method id: ${testImage}, hash: B621EDB4E956C9CEF680AB50B191F2BC
    @Test
    void testImage() {
        V1RBDVolumeSource v1RBDVolumeSource = new V1RBDVolumeSource();
        String image = "testImage";
        v1RBDVolumeSource.setImage(image);
        assertEquals(image, v1RBDVolumeSource.getImage());
    }

    //BaseRock generated method id: ${testKeyring}, hash: 1CB1A2D2549DAB9A109041CDB166FC70
    @Test
    void testKeyring() {
        V1RBDVolumeSource v1RBDVolumeSource = new V1RBDVolumeSource();
        String keyring = "/etc/ceph/keyring";
        v1RBDVolumeSource.setKeyring(keyring);
        assertEquals(keyring, v1RBDVolumeSource.getKeyring());
    }

    //BaseRock generated method id: ${testMonitors}, hash: 1886CE3071D1CD5A6D9164F8721DA922
    @Test
    void testMonitors() {
        V1RBDVolumeSource v1RBDVolumeSource = new V1RBDVolumeSource();
        List<String> monitors = new ArrayList<>();
        monitors.add("monitor1");
        monitors.add("monitor2");
        v1RBDVolumeSource.setMonitors(monitors);
        assertThat(v1RBDVolumeSource.getMonitors(), hasSize(2));
        assertEquals(monitors, v1RBDVolumeSource.getMonitors());
    }

    //BaseRock generated method id: ${testPool}, hash: 02F4B216AC2AFFA3C3621C07E4A6DA15
    @Test
    void testPool() {
        V1RBDVolumeSource v1RBDVolumeSource = new V1RBDVolumeSource();
        String pool = "testPool";
        v1RBDVolumeSource.setPool(pool);
        assertEquals(pool, v1RBDVolumeSource.getPool());
    }

    //BaseRock generated method id: ${testReadOnly}, hash: 5BEF2076E8DAFBC8CFF15D6163971B60
    @Test
    void testReadOnly() {
        V1RBDVolumeSource v1RBDVolumeSource = new V1RBDVolumeSource();
        v1RBDVolumeSource.setReadOnly(true);
        assertTrue(v1RBDVolumeSource.getReadOnly());
        v1RBDVolumeSource.setReadOnly(false);
        assertFalse(v1RBDVolumeSource.getReadOnly());
    }

    //BaseRock generated method id: ${testSecretRef}, hash: 71EBC796B62C8C28C435BB4006122044
    @Test
    void testSecretRef() {
        V1RBDVolumeSource v1RBDVolumeSource = new V1RBDVolumeSource();
        V1LocalObjectReference secretRef = new V1LocalObjectReference();
        secretRef.setName("testSecret");
        v1RBDVolumeSource.setSecretRef(secretRef);
        assertEquals(secretRef, v1RBDVolumeSource.getSecretRef());
    }

    //BaseRock generated method id: ${testUser}, hash: C40224728DC7B5CB536CB3B61C81540C
    @Test
    void testUser() {
        V1RBDVolumeSource v1RBDVolumeSource = new V1RBDVolumeSource();
        String user = "testUser";
        v1RBDVolumeSource.setUser(user);
        assertEquals(user, v1RBDVolumeSource.getUser());
    }

    //BaseRock generated method id: ${testEquals}, hash: 4CFAC83EDECFCBFA91F581A9342CA290
    @Test
    void testEquals() {
        V1RBDVolumeSource v1 = new V1RBDVolumeSource().fsType("ext4").image("image1").keyring("/etc/ceph/keyring").pool("pool1").readOnly(true).user("user1");
        v1.setMonitors(List.of("monitor1", "monitor2"));
        V1RBDVolumeSource v2 = new V1RBDVolumeSource().fsType("ext4").image("image1").keyring("/etc/ceph/keyring").pool("pool1").readOnly(true).user("user1");
        v2.setMonitors(List.of("monitor1", "monitor2"));
        assertTrue(v1.equals(v2));
        assertTrue(v2.equals(v1));
    }

    //BaseRock generated method id: ${testNotEquals}, hash: 80EA5479D3445EF58C41BC391D016EF5
    @Test
    void testNotEquals() {
        V1RBDVolumeSource v1 = new V1RBDVolumeSource().fsType("ext4").image("image1").keyring("/etc/ceph/keyring").pool("pool1").readOnly(true).user("user1");
        v1.setMonitors(List.of("monitor1", "monitor2"));
        V1RBDVolumeSource v2 = new V1RBDVolumeSource().fsType("ext3").image("image2").keyring("/etc/ceph/keyring2").pool("pool2").readOnly(false).user("user2");
        v2.setMonitors(List.of("monitor3", "monitor4"));
        assertFalse(v1.equals(v2));
        assertFalse(v2.equals(v1));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 402A2B7C6E4C3DA297CE5905424DA5AD
    @Test
    void testHashCode() {
        V1RBDVolumeSource v1 = new V1RBDVolumeSource().fsType("ext4").image("image1").keyring("/etc/ceph/keyring").pool("pool1").readOnly(true).user("user1");
        v1.setMonitors(List.of("monitor1", "monitor2"));
        V1RBDVolumeSource v2 = new V1RBDVolumeSource().fsType("ext4").image("image1").keyring("/etc/ceph/keyring").pool("pool1").readOnly(true).user("user1");
        v2.setMonitors(List.of("monitor1", "monitor2"));
        assertEquals(v1.hashCode(), v2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 5A61116A0D6BADDA3BADFE544BF9F35D
    @Test
    void testToString() {
        V1RBDVolumeSource v1RBDVolumeSource = new V1RBDVolumeSource().fsType("ext4").image("image1").keyring("/etc/ceph/keyring").pool("pool1").readOnly(true).user("user1");
        v1RBDVolumeSource.setMonitors(List.of("monitor1", "monitor2"));
        String expectedString = "class V1RBDVolumeSource {\n" + "    fsType: ext4\n" + "    image: image1\n" + "    keyring: /etc/ceph/keyring\n" + "    monitors: [monitor1, monitor2]\n" + "    pool: pool1\n" + "    readOnly: true\n" + "    secretRef: null\n" + "    user: user1\n" + "}";
        assertEquals(expectedString, v1RBDVolumeSource.toString());
    }

    //BaseRock generated method id: ${testValidFsTypes}, hash: B15735585D5743AB3C9B4AA8797EC3F2
    @ParameterizedTest
    @ValueSource(strings = { "ext4", "xfs", "ntfs" })
    void testValidFsTypes(String fsType) {
        V1RBDVolumeSource v1RBDVolumeSource = new V1RBDVolumeSource();
        v1RBDVolumeSource.setFsType(fsType);
        assertEquals(fsType, v1RBDVolumeSource.getFsType());
    }

    //BaseRock generated method id: ${testNullFsType}, hash: E3D574F9A8292CAACE9506DA2D3A0DBF
    @Test
    void testNullFsType() {
        V1RBDVolumeSource v1RBDVolumeSource = new V1RBDVolumeSource();
        v1RBDVolumeSource.setFsType(null);
        assertThat(v1RBDVolumeSource.getFsType(), is(nullValue()));
    }

    //BaseRock generated method id: ${testEmptyMonitors}, hash: 3CD34A7F71128523EA6F410B4A398F88
    @Test
    void testEmptyMonitors() {
        V1RBDVolumeSource v1RBDVolumeSource = new V1RBDVolumeSource();
        v1RBDVolumeSource.setMonitors(new ArrayList<>());
        assertThat(v1RBDVolumeSource.getMonitors(), hasSize(0));
    }

    //BaseRock generated method id: ${testNullMonitors}, hash: 95B581467931E63DFF4BB8517225FD6F
    @Test
    void testNullMonitors() {
        V1RBDVolumeSource v1RBDVolumeSource = new V1RBDVolumeSource();
        v1RBDVolumeSource.setMonitors(null);
        assertThat(v1RBDVolumeSource.getMonitors(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAddMonitorItem}, hash: DD7B82309AFAD666AD44585B007FB5C6
    @Test
    void testAddMonitorItem() {
        V1RBDVolumeSource v1RBDVolumeSource = new V1RBDVolumeSource();
        v1RBDVolumeSource.addMonitorsItem("monitor1");
        assertThat(v1RBDVolumeSource.getMonitors(), hasSize(1));
        assertEquals("monitor1", v1RBDVolumeSource.getMonitors().get(0));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 923E77D1584EC5182D5A41E0D7DFE43F
    @Test
    void testBuilder() {
        V1RBDVolumeSource v1RBDVolumeSource = new V1RBDVolumeSource().fsType("ext4").image("image1").keyring("/etc/ceph/keyring").pool("pool1").readOnly(true).user("user1");
        v1RBDVolumeSource.setMonitors(List.of("monitor1", "monitor2"));
        assertAll(() -> assertEquals("ext4", v1RBDVolumeSource.getFsType()), () -> assertEquals("image1", v1RBDVolumeSource.getImage()), () -> assertEquals("/etc/ceph/keyring", v1RBDVolumeSource.getKeyring()), () -> assertThat(v1RBDVolumeSource.getMonitors(), hasSize(2)), () -> assertEquals("pool1", v1RBDVolumeSource.getPool()), () -> assertTrue(v1RBDVolumeSource.getReadOnly()), () -> assertEquals("user1", v1RBDVolumeSource.getUser()));
    }

    //BaseRock generated method id: ${testNullImage}, hash: 9C893F2E728BEF82939126A636DFEC8B
    @Test
    void testNullImage() {
        V1RBDVolumeSource v1RBDVolumeSource = new V1RBDVolumeSource();
        v1RBDVolumeSource.setImage(null);
        assertThat(v1RBDVolumeSource.getImage(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNullSecretRef}, hash: 4B1DB442E049E6373EFBDA4B2716162D
    @Test
    void testNullSecretRef() {
        V1RBDVolumeSource v1RBDVolumeSource = new V1RBDVolumeSource();
        v1RBDVolumeSource.setSecretRef(null);
        assertThat(v1RBDVolumeSource.getSecretRef(), is(nullValue()));
    }
}
