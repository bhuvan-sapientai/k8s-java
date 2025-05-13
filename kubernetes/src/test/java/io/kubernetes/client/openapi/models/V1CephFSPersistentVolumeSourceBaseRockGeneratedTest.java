package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CephFSPersistentVolumeSourceBaseRockGeneratedTest {

    private V1CephFSPersistentVolumeSource cephFSPersistentVolumeSource;

    @BeforeEach
    void setUp() {
        cephFSPersistentVolumeSource = new V1CephFSPersistentVolumeSource();
    }

    //BaseRock generated method id: ${testConstructor}, hash: E59AEC4287C16C737DD93F12DFBA03D2
    @Test
    void testConstructor() {
        assertNotNull(cephFSPersistentVolumeSource);
    }

    //BaseRock generated method id: ${testMonitors}, hash: 48E76B50B9589C131AC36B60C96B16B9
    @Test
    void testMonitors() {
        List<String> monitors = new ArrayList<>();
        monitors.add("monitor1");
        monitors.add("monitor2");
        cephFSPersistentVolumeSource.setMonitors(monitors);
        assertEquals(monitors, cephFSPersistentVolumeSource.getMonitors());
    }

    //BaseRock generated method id: ${testAddMonitorsItem}, hash: 5440213B55460F875468E88043B187A9
    @Test
    void testAddMonitorsItem() {
        String monitor = "monitor1";
        cephFSPersistentVolumeSource.addMonitorsItem(monitor);
        assertTrue(cephFSPersistentVolumeSource.getMonitors().contains(monitor));
    }

    //BaseRock generated method id: ${testPath}, hash: 0A6A6CA8AD50199521E557279790578E
    @ParameterizedTest
    @ValueSource(strings = { "path1", "path2", "" })
    void testPath(String path) {
        cephFSPersistentVolumeSource.setPath(path);
        assertEquals(path, cephFSPersistentVolumeSource.getPath());
    }

    //BaseRock generated method id: ${testReadOnly}, hash: BCFA20A7CAF4B99A3CF27FC4057E3FE7
    @Test
    void testReadOnly() {
        cephFSPersistentVolumeSource.setReadOnly(true);
        assertTrue(cephFSPersistentVolumeSource.getReadOnly());
        cephFSPersistentVolumeSource.setReadOnly(false);
        assertFalse(cephFSPersistentVolumeSource.getReadOnly());
    }

    //BaseRock generated method id: ${testSecretFile}, hash: 4731E342D1D3E1B0450425CE6D8B85AF
    @ParameterizedTest
    @ValueSource(strings = { "secretFile1", "secretFile2", "" })
    void testSecretFile(String secretFile) {
        cephFSPersistentVolumeSource.setSecretFile(secretFile);
        assertEquals(secretFile, cephFSPersistentVolumeSource.getSecretFile());
    }

    //BaseRock generated method id: ${testSecretRef}, hash: F2DC1A024C2EA9DF4B0441712C3471FA
    @Test
    void testSecretRef() {
        V1SecretReference secretRef = new V1SecretReference();
        cephFSPersistentVolumeSource.setSecretRef(secretRef);
        assertEquals(secretRef, cephFSPersistentVolumeSource.getSecretRef());
    }

    //BaseRock generated method id: ${testUser}, hash: 9109FBA4B16B894FA05ABCA5EC3F01C3
    @ParameterizedTest
    @ValueSource(strings = { "user1", "user2", "" })
    void testUser(String user) {
        cephFSPersistentVolumeSource.setUser(user);
        assertEquals(user, cephFSPersistentVolumeSource.getUser());
    }

    //BaseRock generated method id: ${testEquals}, hash: AF601D6E16975B7C9A91AA22CD943855
    @Test
    void testEquals() {
        V1CephFSPersistentVolumeSource source1 = new V1CephFSPersistentVolumeSource();
        V1CephFSPersistentVolumeSource source2 = new V1CephFSPersistentVolumeSource();
        assertTrue(source1.equals(source2));
        assertTrue(source2.equals(source1));
        source1.setPath("path1");
        assertFalse(source1.equals(source2));
        source2.setPath("path1");
        assertTrue(source1.equals(source2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 886798DFB1FBE0B90D4C43519CE77BF0
    @Test
    void testHashCode() {
        V1CephFSPersistentVolumeSource source1 = new V1CephFSPersistentVolumeSource();
        V1CephFSPersistentVolumeSource source2 = new V1CephFSPersistentVolumeSource();
        assertEquals(source1.hashCode(), source2.hashCode());
        source1.setPath("path1");
        assertNotEquals(source1.hashCode(), source2.hashCode());
        source2.setPath("path1");
        assertEquals(source1.hashCode(), source2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 3528971B77FE7E9DD680081917319B93
    @Test
    void testToString() {
        String toString = cephFSPersistentVolumeSource.toString();
        assertTrue(toString.contains("V1CephFSPersistentVolumeSource"));
        assertTrue(toString.contains("monitors"));
        assertTrue(toString.contains("path"));
        assertTrue(toString.contains("readOnly"));
        assertTrue(toString.contains("secretFile"));
        assertTrue(toString.contains("secretRef"));
        assertTrue(toString.contains("user"));
    }

    //BaseRock generated method id: ${testSetMonitorsWithNullAndEmpty}, hash: C325B42AD74F229E7BFC0802F7FAEC34
    @ParameterizedTest
    @NullAndEmptySource
    void testSetMonitorsWithNullAndEmpty(List<String> monitors) {
        cephFSPersistentVolumeSource.setMonitors(monitors);
        List<String> result = cephFSPersistentVolumeSource.getMonitors();
        assertTrue(result == null || result.isEmpty());
    }

    //BaseRock generated method id: ${testAddMonitorsItemWithNull}, hash: 001CC3A52BDCFA88A6210CB996C65FB9
    @Test
    void testAddMonitorsItemWithNull() {
        cephFSPersistentVolumeSource.addMonitorsItem(null);
        assertTrue(cephFSPersistentVolumeSource.getMonitors().contains(null));
    }

    //BaseRock generated method id: ${testSetPathWithNull}, hash: 9D215F04B42722CF639ACE601D00CD43
    @Test
    void testSetPathWithNull() {
        cephFSPersistentVolumeSource.setPath(null);
        assertNull(cephFSPersistentVolumeSource.getPath());
    }

    //BaseRock generated method id: ${testSetReadOnlyWithNull}, hash: 5B74B17E13C9EC38D0CBADDBF4666714
    @Test
    void testSetReadOnlyWithNull() {
        cephFSPersistentVolumeSource.setReadOnly(null);
        assertNull(cephFSPersistentVolumeSource.getReadOnly());
    }

    //BaseRock generated method id: ${testSetSecretFileWithNull}, hash: 49788C22BE64168B5ACD50B14C89FC1B
    @Test
    void testSetSecretFileWithNull() {
        cephFSPersistentVolumeSource.setSecretFile(null);
        assertNull(cephFSPersistentVolumeSource.getSecretFile());
    }

    //BaseRock generated method id: ${testSetSecretRefWithNull}, hash: 7E875321A8581CA5A2BBA39516B6BE45
    @Test
    void testSetSecretRefWithNull() {
        cephFSPersistentVolumeSource.setSecretRef(null);
        assertNull(cephFSPersistentVolumeSource.getSecretRef());
    }

    //BaseRock generated method id: ${testSetUserWithNull}, hash: 480EF0AB4A8F9B500099E1E719CD1EB2
    @Test
    void testSetUserWithNull() {
        cephFSPersistentVolumeSource.setUser(null);
        assertNull(cephFSPersistentVolumeSource.getUser());
    }
}
