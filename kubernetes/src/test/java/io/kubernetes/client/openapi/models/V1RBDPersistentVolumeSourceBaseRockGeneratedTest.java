package io.kubernetes.client.openapi.models;

import static org.junit.jupiter.api.Assertions.assertAll;
import java.util.Arrays;
import java.util.List;
import io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSource;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import io.kubernetes.client.openapi.models.V1SecretReference;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1RBDPersistentVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1RBDPersistentVolumeSourceConstructor}, hash: FEE912BE7B31038E21EFF73036BA7BA4
    @Test
    void testV1RBDPersistentVolumeSourceConstructor() {
        V1RBDPersistentVolumeSource source = new V1RBDPersistentVolumeSource();
        assertNotNull(source);
    }

    //BaseRock generated method id: ${testFsType}, hash: 34DFDD28CA1FCA9DFBD4DB15CD954DE3
    @Test
    void testFsType() {
        V1RBDPersistentVolumeSource source = new V1RBDPersistentVolumeSource();
        String fsType = "ext4";
        source.setFsType(fsType);
        assertEquals(fsType, source.getFsType());
    }

    //BaseRock generated method id: ${testImage}, hash: 340FA2F523B9DD022CC6803A221D86CA
    @Test
    void testImage() {
        V1RBDPersistentVolumeSource source = new V1RBDPersistentVolumeSource();
        String image = "test-image";
        source.setImage(image);
        assertEquals(image, source.getImage());
    }

    //BaseRock generated method id: ${testKeyring}, hash: EF982DDC0546D8DF3897388B2F491E19
    @Test
    void testKeyring() {
        V1RBDPersistentVolumeSource source = new V1RBDPersistentVolumeSource();
        String keyring = "/etc/ceph/keyring";
        source.setKeyring(keyring);
        assertEquals(keyring, source.getKeyring());
    }

    //BaseRock generated method id: ${testMonitors}, hash: 09C05BEB93BB920A9BC6C63053C68831
    @Test
    void testMonitors() {
        V1RBDPersistentVolumeSource source = new V1RBDPersistentVolumeSource();
        List<String> monitors = Arrays.asList("monitor1", "monitor2");
        source.setMonitors(monitors);
        assertEquals(monitors, source.getMonitors());
    }

    //BaseRock generated method id: ${testPool}, hash: D762BD1E32B96A1568B9A1A1F872057B
    @Test
    void testPool() {
        V1RBDPersistentVolumeSource source = new V1RBDPersistentVolumeSource();
        String pool = "test-pool";
        source.setPool(pool);
        assertEquals(pool, source.getPool());
    }

    //BaseRock generated method id: ${testReadOnly}, hash: B326449B9EF735CC811CC2B622DD8155
    @Test
    void testReadOnly() {
        V1RBDPersistentVolumeSource source = new V1RBDPersistentVolumeSource();
        source.setReadOnly(true);
        assertTrue(source.getReadOnly());
        source.setReadOnly(false);
        assertFalse(source.getReadOnly());
    }

    //BaseRock generated method id: ${testSecretRef}, hash: F544A6E9385C58DD89F8E4A3CE864344
    @Test
    void testSecretRef() {
        V1RBDPersistentVolumeSource source = new V1RBDPersistentVolumeSource();
        V1SecretReference secretRef = new V1SecretReference();
        source.setSecretRef(secretRef);
        assertEquals(secretRef, source.getSecretRef());
    }

    //BaseRock generated method id: ${testUser}, hash: 49253B9F124CEB79EDC27525090908FE
    @Test
    void testUser() {
        V1RBDPersistentVolumeSource source = new V1RBDPersistentVolumeSource();
        String user = "test-user";
        source.setUser(user);
        assertEquals(user, source.getUser());
    }

    //BaseRock generated method id: ${testBuilder}, hash: F0503D5F2D100834D32DDE7F7E417958
    @Test
    void testBuilder() {
        List<String> monitors = Arrays.asList("monitor1", "monitor2");
        V1SecretReference secretRef = new V1SecretReference();
        V1RBDPersistentVolumeSource source = new V1RBDPersistentVolumeSource().fsType("ext4").image("test-image").keyring("/etc/ceph/keyring").monitors(monitors).pool("test-pool").readOnly(true).secretRef(secretRef).user("test-user");
        assertAll(() -> assertEquals("ext4", source.getFsType()), () -> assertEquals("test-image", source.getImage()), () -> assertEquals("/etc/ceph/keyring", source.getKeyring()), () -> assertEquals(monitors, source.getMonitors()), () -> assertEquals("test-pool", source.getPool()), () -> assertTrue(source.getReadOnly()), () -> assertEquals(secretRef, source.getSecretRef()), () -> assertEquals("test-user", source.getUser()));
    }

    //BaseRock generated method id: ${testAddMonitorsItem}, hash: 154DBF504A957B093932699C77421E85
    @Test
    void testAddMonitorsItem() {
        V1RBDPersistentVolumeSource source = new V1RBDPersistentVolumeSource();
        source.addMonitorsItem("monitor1");
        source.addMonitorsItem("monitor2");
        List<String> monitors = source.getMonitors();
        assertThat(monitors, hasSize(2));
        assertThat(monitors, is(Arrays.asList("monitor1", "monitor2")));
    }

    //BaseRock generated method id: ${testDifferentFsTypes}, hash: 325574CF6BC7E3559F0E5FFCCA40120B
    @ParameterizedTest
    @ValueSource(strings = { "ext4", "xfs", "ntfs" })
    void testDifferentFsTypes(String fsType) {
        V1RBDPersistentVolumeSource source = new V1RBDPersistentVolumeSource();
        source.setFsType(fsType);
        assertEquals(fsType, source.getFsType());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 926F81CB8E0B77D6DF51EFD996CAE0BB
    @Test
    void testEqualsAndHashCode() {
        V1RBDPersistentVolumeSource source1 = new V1RBDPersistentVolumeSource().fsType("ext4").image("test-image").monitors(Arrays.asList("monitor1", "monitor2"));
        V1RBDPersistentVolumeSource source2 = new V1RBDPersistentVolumeSource().fsType("ext4").image("test-image").monitors(Arrays.asList("monitor1", "monitor2"));
        V1RBDPersistentVolumeSource source3 = new V1RBDPersistentVolumeSource().fsType("xfs").image("other-image").monitors(Arrays.asList("monitor3", "monitor4"));
        assertAll(() -> assertTrue(source1.equals(source2) && source2.equals(source1)), () -> assertEquals(source1.hashCode(), source2.hashCode()), () -> assertFalse(source1.equals(source3) || source3.equals(source1)), () -> assertFalse(source1.hashCode() == source3.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 932C1CAE4D344A6F4761A9204551DB99
    @Test
    void testToString() {
        V1RBDPersistentVolumeSource source = new V1RBDPersistentVolumeSource().fsType("ext4").image("test-image").monitors(Arrays.asList("monitor1", "monitor2"));
        String toString = source.toString();
        assertThat(toString, containsString("fsType"));
        assertThat(toString, containsString("image"));
        assertThat(toString, containsString("monitors"));
    }

    //BaseRock generated method id: ${testNullValues}, hash: 30718D77A54F5D8A4C03DED6BCBD58C5
    @Test
    void testNullValues() {
        V1RBDPersistentVolumeSource source = new V1RBDPersistentVolumeSource();
        assertAll(() -> assertThat(source.getFsType(), is(nullValue())), () -> assertThat(source.getImage(), is(nullValue())), () -> assertThat(source.getKeyring(), is(nullValue())), () -> assertThat(source.getMonitors(), is(notNullValue())), () -> assertThat(source.getPool(), is(nullValue())), () -> assertThat(source.getReadOnly(), is(nullValue())), () -> assertThat(source.getSecretRef(), is(nullValue())), () -> assertThat(source.getUser(), is(nullValue())));
    }

    //BaseRock generated method id: ${testEmptyMonitors}, hash: 84DF1FFB04F472DFDC1BFC17BD77AD5D
    @Test
    void testEmptyMonitors() {
        V1RBDPersistentVolumeSource source = new V1RBDPersistentVolumeSource();
        source.setMonitors(new ArrayList<>());
        assertThat(source.getMonitors(), hasSize(0));
    }
}
