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
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
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
class V1LoadBalancerIngressBaseRockGeneratedTest {

    private V1LoadBalancerIngress v1LoadBalancerIngress;

    @BeforeEach
    void setUp() {
        v1LoadBalancerIngress = new V1LoadBalancerIngress();
    }

    //BaseRock generated method id: ${testV1LoadBalancerIngressInstantiation}, hash: D0B2FC0526EC20195D08AE3200F61D68
    @Test
    void testV1LoadBalancerIngressInstantiation() {
        assertNotNull(v1LoadBalancerIngress);
    }

    //BaseRock generated method id: ${testHostname}, hash: 716D0E6FF76FC9F92ABAFF13F9B1D2CC
    @ParameterizedTest
    @ValueSource(strings = { "example.com", "test.org" })
    void testHostname(String hostname) {
        v1LoadBalancerIngress.setHostname(hostname);
        assertEquals(hostname, v1LoadBalancerIngress.getHostname());
    }

    //BaseRock generated method id: ${testHostnameFluentSetter}, hash: 0A02516CC8B38D3A443F1257C5CAB795
    @Test
    void testHostnameFluentSetter() {
        V1LoadBalancerIngress result = v1LoadBalancerIngress.hostname("example.com");
        assertSame(v1LoadBalancerIngress, result);
        assertEquals("example.com", v1LoadBalancerIngress.getHostname());
    }

    //BaseRock generated method id: ${testIp}, hash: 78860926AA5AF2A23167B1E79C7D8BDA
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "192.168.1.1", "10.0.0.1" })
    void testIp(String ip) {
        v1LoadBalancerIngress.setIp(ip);
        assertEquals(ip, v1LoadBalancerIngress.getIp());
    }

    //BaseRock generated method id: ${testIpFluentSetter}, hash: 6254D03685B319FDDAA6ECA558EC5A2B
    @Test
    void testIpFluentSetter() {
        V1LoadBalancerIngress result = v1LoadBalancerIngress.ip("192.168.1.1");
        assertSame(v1LoadBalancerIngress, result);
        assertEquals("192.168.1.1", v1LoadBalancerIngress.getIp());
    }

    //BaseRock generated method id: ${testIpMode}, hash: D31C72133CB67AB2E504F35243201084
    @ParameterizedTest
    @ValueSource(strings = { "VIP", "Proxy" })
    void testIpMode(String ipMode) {
        v1LoadBalancerIngress.setIpMode(ipMode);
        assertEquals(ipMode, v1LoadBalancerIngress.getIpMode());
    }

    //BaseRock generated method id: ${testIpModeFluentSetter}, hash: 1E92E41661E12EE1969246D1E3C2388D
    @Test
    void testIpModeFluentSetter() {
        V1LoadBalancerIngress result = v1LoadBalancerIngress.ipMode("VIP");
        assertSame(v1LoadBalancerIngress, result);
        assertEquals("VIP", v1LoadBalancerIngress.getIpMode());
    }

    //BaseRock generated method id: ${testPorts}, hash: 1EBE723A162E49650CE1E0396B63ACB8
    @Test
    void testPorts() {
        List<V1PortStatus> ports = new ArrayList<>();
        V1PortStatus port1 = new V1PortStatus();
        V1PortStatus port2 = new V1PortStatus();
        ports.add(port1);
        ports.add(port2);
        v1LoadBalancerIngress.setPorts(ports);
        assertEquals(ports, v1LoadBalancerIngress.getPorts());
    }

    //BaseRock generated method id: ${testPortsFluentSetter}, hash: F224ABF8FC49379B734F9E3EA901DF8E
    @Test
    void testPortsFluentSetter() {
        List<V1PortStatus> ports = new ArrayList<>();
        V1PortStatus port1 = new V1PortStatus();
        V1PortStatus port2 = new V1PortStatus();
        ports.add(port1);
        ports.add(port2);
        V1LoadBalancerIngress result = v1LoadBalancerIngress.ports(ports);
        assertSame(v1LoadBalancerIngress, result);
        assertEquals(ports, v1LoadBalancerIngress.getPorts());
    }

    //BaseRock generated method id: ${testAddPortsItem}, hash: 49DC2DB52B2F2F2906E345B8B9ADD6A5
    @Test
    void testAddPortsItem() {
        V1PortStatus port = new V1PortStatus();
        V1LoadBalancerIngress result = v1LoadBalancerIngress.addPortsItem(port);
        assertSame(v1LoadBalancerIngress, result);
        assertTrue(v1LoadBalancerIngress.getPorts().contains(port));
    }

    //BaseRock generated method id: ${testEquals}, hash: 872C69D4244BC4C671589300CB336EEC
    @Test
    void testEquals() {
        V1LoadBalancerIngress ingress1 = new V1LoadBalancerIngress().hostname("example.com").ip("192.168.1.1").ipMode("VIP");
        V1LoadBalancerIngress ingress2 = new V1LoadBalancerIngress().hostname("example.com").ip("192.168.1.1").ipMode("VIP");
        V1LoadBalancerIngress ingress3 = new V1LoadBalancerIngress().hostname("test.org").ip("10.0.0.1").ipMode("Proxy");
        assertEquals(ingress1, ingress2);
        assertNotEquals(ingress1, ingress3);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 2CC03BFAC13B2F062F57A419F1AA3D44
    @Test
    void testHashCode() {
        V1LoadBalancerIngress ingress1 = new V1LoadBalancerIngress().hostname("example.com").ip("192.168.1.1").ipMode("VIP");
        V1LoadBalancerIngress ingress2 = new V1LoadBalancerIngress().hostname("example.com").ip("192.168.1.1").ipMode("VIP");
        assertEquals(ingress1.hashCode(), ingress2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: B772DFD61E7EAE68BC32002DCCF4E2B5
    @Test
    void testToString() {
        v1LoadBalancerIngress.hostname("example.com").ip("192.168.1.1").ipMode("VIP");
        String expected = "class V1LoadBalancerIngress {\n    hostname: example.com\n    ip: 192.168.1.1\n    ipMode: VIP\n    ports: []\n}";
        assertEquals(expected, v1LoadBalancerIngress.toString());
    }
}
