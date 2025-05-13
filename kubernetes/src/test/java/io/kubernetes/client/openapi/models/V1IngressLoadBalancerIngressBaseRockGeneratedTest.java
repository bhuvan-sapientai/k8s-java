package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
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
class V1IngressLoadBalancerIngressBaseRockGeneratedTest {

    private V1IngressLoadBalancerIngress ingressLoadBalancerIngress;

    @Mock
    private V1IngressPortStatus mockPortStatus;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        ingressLoadBalancerIngress = new V1IngressLoadBalancerIngress();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 8F9B1B050F68150DED6F5E770DC4D72C
    @Test
    void testConstructor() {
        assertNotNull(ingressLoadBalancerIngress);
    }

    //BaseRock generated method id: ${testHostname}, hash: 39DBE0538B7EABC69AA4F28460B3D73E
    @ParameterizedTest
    @ValueSource(strings = { "example.com", "test.org" })
    void testHostname(String hostname) {
        ingressLoadBalancerIngress.setHostname(hostname);
        assertEquals(hostname, ingressLoadBalancerIngress.getHostname());
    }

    //BaseRock generated method id: ${testHostnameNullAndEmpty}, hash: 9C6FB8A58CD6FDFFBD1DF480C2F9CD30
    @ParameterizedTest
    @NullAndEmptySource
    void testHostnameNullAndEmpty(String hostname) {
        ingressLoadBalancerIngress.setHostname(hostname);
        assertEquals(hostname, ingressLoadBalancerIngress.getHostname());
    }

    //BaseRock generated method id: ${testIp}, hash: BEEBDA4025C4038C9BABF64E23CDA646
    @ParameterizedTest
    @ValueSource(strings = { "192.168.0.1", "10.0.0.1" })
    void testIp(String ip) {
        ingressLoadBalancerIngress.setIp(ip);
        assertEquals(ip, ingressLoadBalancerIngress.getIp());
    }

    //BaseRock generated method id: ${testIpNullAndEmpty}, hash: 6FCEC9A613E1BA2932051B4EBDEEE241
    @ParameterizedTest
    @NullAndEmptySource
    void testIpNullAndEmpty(String ip) {
        ingressLoadBalancerIngress.setIp(ip);
        assertEquals(ip, ingressLoadBalancerIngress.getIp());
    }

    //BaseRock generated method id: ${testPorts}, hash: BC40E555F6A8ABC1607225D58571BC8E
    @Test
    void testPorts() {
        List<V1IngressPortStatus> ports = new ArrayList<>();
        ports.add(mockPortStatus);
        ingressLoadBalancerIngress.setPorts(ports);
        assertEquals(ports, ingressLoadBalancerIngress.getPorts());
    }

    //BaseRock generated method id: ${testAddPortsItem}, hash: 6712D1494C19857DBF90E2F9B6305D9A
    @Test
    void testAddPortsItem() {
        ingressLoadBalancerIngress.addPortsItem(mockPortStatus);
        List<V1IngressPortStatus> ports = ingressLoadBalancerIngress.getPorts();
        assertNotNull(ports);
        assertEquals(1, ports.size());
        assertEquals(mockPortStatus, ports.get(0));
    }

    //BaseRock generated method id: ${testEquals}, hash: 4601CB3E680CEA1A7249DC37A350F466
    @Test
    void testEquals() {
        V1IngressLoadBalancerIngress ingress1 = new V1IngressLoadBalancerIngress().hostname("example.com").ip("192.168.0.1");
        V1IngressLoadBalancerIngress ingress2 = new V1IngressLoadBalancerIngress().hostname("example.com").ip("192.168.0.1");
        V1IngressLoadBalancerIngress ingress3 = new V1IngressLoadBalancerIngress().hostname("test.org").ip("10.0.0.1");
        assertEquals(ingress1, ingress2);
        assertNotEquals(ingress1, ingress3);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 73FE03507BB6932D7DF22BCD483FEC5B
    @Test
    void testHashCode() {
        V1IngressLoadBalancerIngress ingress1 = new V1IngressLoadBalancerIngress().hostname("example.com").ip("192.168.0.1");
        V1IngressLoadBalancerIngress ingress2 = new V1IngressLoadBalancerIngress().hostname("example.com").ip("192.168.0.1");
        assertEquals(ingress1.hashCode(), ingress2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: E85D76F4815AF9641013AAEC39216D3F
    @Test
    void testToString() {
        ingressLoadBalancerIngress.setHostname("example.com");
        ingressLoadBalancerIngress.setIp("192.168.0.1");
        String expected = "class V1IngressLoadBalancerIngress {\n    hostname: example.com\n    ip: 192.168.0.1\n    ports: []\n}";
        assertEquals(expected, ingressLoadBalancerIngress.toString());
    }
}
