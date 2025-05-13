package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1HostIPBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 7AC9A07FA3DBC750B26110C0A81BBED9
    @Test
    void testConstructor() {
        V1HostIP hostIP = new V1HostIP();
        assertNotNull(hostIP);
    }

    //BaseRock generated method id: ${testIpSetter}, hash: 3FB39EB157C2D6478341335DE23B7B32
    @Test
    void testIpSetter() {
        V1HostIP hostIP = new V1HostIP();
        hostIP.setIp("192.168.1.1");
        assertEquals("192.168.1.1", hostIP.getIp());
    }

    //BaseRock generated method id: ${testIpGetter}, hash: C496A86B363A9CE09CC02EC29A651E6C
    @Test
    void testIpGetter() {
        V1HostIP hostIP = new V1HostIP();
        hostIP.setIp("10.0.0.1");
        assertEquals("10.0.0.1", hostIP.getIp());
    }

    //BaseRock generated method id: ${testFluentSetter}, hash: E90E5692626D8A296C62A65B6891BE3C
    @Test
    void testFluentSetter() {
        V1HostIP hostIP = new V1HostIP().ip("172.16.0.1");
        assertEquals("172.16.0.1", hostIP.getIp());
    }

    //BaseRock generated method id: ${testMultipleIpAddresses}, hash: BEBAF5F8AE11EF85D1B592E59062EAC3
    @ParameterizedTest
    @ValueSource(strings = { "192.168.0.1", "10.0.0.1", "172.16.0.1" })
    void testMultipleIpAddresses(String ipAddress) {
        V1HostIP hostIP = new V1HostIP().ip(ipAddress);
        assertEquals(ipAddress, hostIP.getIp());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 314D3D2B8A7C22EC46D2D44AFA1A5EFD
    @Test
    void testEqualsWithSameObject() {
        V1HostIP hostIP = new V1HostIP().ip("192.168.1.1");
        assertTrue(hostIP.equals(hostIP));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: A1F97EE35D7CD1CFFBCFF39A310C48AE
    @Test
    void testEqualsWithDifferentObject() {
        V1HostIP hostIP1 = new V1HostIP().ip("192.168.1.1");
        V1HostIP hostIP2 = new V1HostIP().ip("192.168.1.1");
        assertTrue(hostIP1.equals(hostIP2));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentIp}, hash: 8C363440B52640B812F1812652F05DB1
    @Test
    void testEqualsWithDifferentIp() {
        V1HostIP hostIP1 = new V1HostIP().ip("192.168.1.1");
        V1HostIP hostIP2 = new V1HostIP().ip("10.0.0.1");
        assertFalse(hostIP1.equals(hostIP2));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: 52E2CF53C28551F13BAAB20BBBF94F8E
    @Test
    void testEqualsWithNull() {
        V1HostIP hostIP = new V1HostIP().ip("192.168.1.1");
        assertFalse(hostIP.equals(null));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 6C4066D8939E58BCD265CFA5F1028A71
    @Test
    void testEqualsWithDifferentClass() {
        V1HostIP hostIP = new V1HostIP().ip("192.168.1.1");
        assertFalse(hostIP.equals("192.168.1.1"));
    }

    //BaseRock generated method id: ${testHashCode}, hash: DE9F85E719C36E8EEE53F1078F0DEBC9
    @Test
    void testHashCode() {
        V1HostIP hostIP1 = new V1HostIP().ip("192.168.1.1");
        V1HostIP hostIP2 = new V1HostIP().ip("192.168.1.1");
        assertEquals(hostIP1.hashCode(), hostIP2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: C2A5DA4BD86799BF46354B2DA545E746
    @Test
    void testToString() {
        V1HostIP hostIP = new V1HostIP().ip("192.168.1.1");
        String expected = "class V1HostIP {\n    ip: 192.168.1.1\n}";
        assertEquals(expected, hostIP.toString());
    }

    //BaseRock generated method id: ${testSetNullIp}, hash: 506651A372DF70121B33EBCABACD6D0D
    @Test
    void testSetNullIp() {
        V1HostIP hostIP = new V1HostIP();
        hostIP.setIp(null);
        assertNull(hostIP.getIp());
    }
}
