package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullSource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CephFSVolumeSourceBaseRockGeneratedTest {

    private V1CephFSVolumeSource volumeSource;

    @BeforeEach
    void setUp() {
        volumeSource = new V1CephFSVolumeSource();
    }

    //BaseRock generated method id: ${testConstructor}, hash: A58447994BB135D14229312E7150C97A
    @Test
    void testConstructor() {
        assertNotNull(volumeSource);
    }

    //BaseRock generated method id: ${testMonitors}, hash: AF45A15D550D12C7ACF122FEF3BA4321
    @Test
    void testMonitors() {
        List<String> monitors = new ArrayList<>();
        monitors.add("monitor1");
        monitors.add("monitor2");
        volumeSource.setMonitors(monitors);
        assertEquals(monitors, volumeSource.getMonitors());
    }

    //BaseRock generated method id: ${testAddMonitorsItem}, hash: 03469AADCAB47A18C9E8603664C12D64
    @Test
    void testAddMonitorsItem() {
        String monitor = "monitor1";
        volumeSource.addMonitorsItem(monitor);
        assertTrue(volumeSource.getMonitors().contains(monitor));
    }

    //BaseRock generated method id: ${testPath}, hash: ADFB0384373511BC7A2CCD2858E6E36E
    @ParameterizedTest
    @ValueSource(strings = { "path1", "path2" })
    void testPath(String path) {
        volumeSource.setPath(path);
        assertEquals(path, volumeSource.getPath());
    }

    //BaseRock generated method id: ${testReadOnly}, hash: 5DC9E180BEDFD379D520EAFF14631080
    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    void testReadOnly(boolean readOnly) {
        volumeSource.setReadOnly(readOnly);
        assertEquals(readOnly, volumeSource.getReadOnly());
    }

    //BaseRock generated method id: ${testSecretFile}, hash: 2FAFAB99FB990176B7D02F39B9AAF513
    @ParameterizedTest
    @ValueSource(strings = { "secretFile1", "secretFile2" })
    void testSecretFile(String secretFile) {
        volumeSource.setSecretFile(secretFile);
        assertEquals(secretFile, volumeSource.getSecretFile());
    }

    //BaseRock generated method id: ${testSecretRef}, hash: 188C570B1C54EF24FB532DC61B6CF7B9
    @Test
    void testSecretRef() {
        V1LocalObjectReference secretRef = new V1LocalObjectReference();
        secretRef.name("secretName");
        volumeSource.setSecretRef(secretRef);
        assertEquals(secretRef, volumeSource.getSecretRef());
    }

    //BaseRock generated method id: ${testUser}, hash: A1B7B4EE439E0B57E08B522DB32FE96B
    @ParameterizedTest
    @ValueSource(strings = { "user1", "user2" })
    void testUser(String user) {
        volumeSource.setUser(user);
        assertEquals(user, volumeSource.getUser());
    }

    //BaseRock generated method id: ${testEquals}, hash: A73E56D7D0AAD75EFE0A286453522933
    @Test
    void testEquals() {
        V1CephFSVolumeSource volumeSource1 = new V1CephFSVolumeSource();
        V1CephFSVolumeSource volumeSource2 = new V1CephFSVolumeSource();
        assertTrue(volumeSource1.equals(volumeSource2));
        volumeSource1.setPath("path1");
        assertFalse(volumeSource1.equals(volumeSource2));
        volumeSource2.setPath("path1");
        assertTrue(volumeSource1.equals(volumeSource2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 68CA70FDF459E8F67121B9B266A69EBE
    @Test
    void testHashCode() {
        V1CephFSVolumeSource volumeSource1 = new V1CephFSVolumeSource();
        V1CephFSVolumeSource volumeSource2 = new V1CephFSVolumeSource();
        assertEquals(volumeSource1.hashCode(), volumeSource2.hashCode());
        volumeSource1.setPath("path1");
        assertNotEquals(volumeSource1.hashCode(), volumeSource2.hashCode());
        volumeSource2.setPath("path1");
        assertEquals(volumeSource1.hashCode(), volumeSource2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 9DC9DE651851A0E9BD1A47DDE42FCEE1
    @Test
    void testToString() {
        volumeSource.setPath("path1");
        volumeSource.setUser("user1");
        String toString = volumeSource.toString();
        assertTrue(toString.contains("path: path1"));
        assertTrue(toString.contains("user: user1"));
    }

    //BaseRock generated method id: ${testPathEdgeCases}, hash: 565A36A4F13033A3667441DFB34C31DC
    @ParameterizedTest
    @NullSource
    @ValueSource(strings = { "path1", "" })
    void testPathEdgeCases(String path) {
        volumeSource.setPath(path);
        assertEquals(path, volumeSource.getPath());
    }

    //BaseRock generated method id: ${testUserEdgeCases}, hash: 067AB2E6C1ADAEF3608A8BE8C513CD1C
    @ParameterizedTest
    @NullSource
    @ValueSource(strings = { "user1", "" })
    void testUserEdgeCases(String user) {
        volumeSource.setUser(user);
        assertEquals(user, volumeSource.getUser());
    }

    //BaseRock generated method id: ${testMonitorsNull}, hash: E7CE10B9EDB49565743356B694E40323
    @Test
    void testMonitorsNull() {
        assertDoesNotThrow(() -> volumeSource.setMonitors(null));
        assertNull(volumeSource.getMonitors());
    }

    //BaseRock generated method id: ${testAddMonitorsItemNull}, hash: DEB0FE02582916CC6AF84A8D68A431CA
    @Test
    void testAddMonitorsItemNull() {
        assertDoesNotThrow(() -> volumeSource.addMonitorsItem(null));
        assertTrue(volumeSource.getMonitors().contains(null));
    }
}
