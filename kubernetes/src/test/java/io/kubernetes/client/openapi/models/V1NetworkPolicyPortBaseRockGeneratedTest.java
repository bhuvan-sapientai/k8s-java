package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.custom.IntOrString;
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
class V1NetworkPolicyPortBaseRockGeneratedTest {

    private V1NetworkPolicyPort v1NetworkPolicyPort;

    @BeforeEach
    void setUp() {
        v1NetworkPolicyPort = new V1NetworkPolicyPort();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 7CF6BDB9305D42AB4EC3A32D8891DAAC
    @Test
    void testConstructor() {
        assertNotNull(v1NetworkPolicyPort);
    }

    //BaseRock generated method id: ${testEndPort}, hash: 12A7A3E15B9EE877254DFD3D33E8EB37
    @Test
    void testEndPort() {
        Integer endPort = 8080;
        assertEquals(v1NetworkPolicyPort, v1NetworkPolicyPort.endPort(endPort));
        assertEquals(endPort, v1NetworkPolicyPort.getEndPort());
    }

    //BaseRock generated method id: ${testPort}, hash: D57DD8DF6816D14CC40ADBFB8D28CCDE
    @Test
    void testPort() {
        IntOrString port = new IntOrString(8080);
        assertEquals(v1NetworkPolicyPort, v1NetworkPolicyPort.port(port));
        assertEquals(port, v1NetworkPolicyPort.getPort());
    }

    //BaseRock generated method id: ${testProtocol}, hash: 8379F68A2BBA820CC0EF1ABBACA1A47B
    @Test
    void testProtocol() {
        String protocol = "TCP";
        assertEquals(v1NetworkPolicyPort, v1NetworkPolicyPort.protocol(protocol));
        assertEquals(protocol, v1NetworkPolicyPort.getProtocol());
    }

    //BaseRock generated method id: ${testEquals}, hash: 09FD613EF19232E1E9AAE8F8D38381CD
    @Test
    void testEquals() {
        V1NetworkPolicyPort other = new V1NetworkPolicyPort().endPort(8080).port(new IntOrString(8080)).protocol("TCP");
        v1NetworkPolicyPort.endPort(8080).port(new IntOrString(8080)).protocol("TCP");
        assertTrue(v1NetworkPolicyPort.equals(other));
        assertTrue(v1NetworkPolicyPort.equals(v1NetworkPolicyPort));
        assertFalse(v1NetworkPolicyPort.equals(null));
        assertFalse(v1NetworkPolicyPort.equals(new Object()));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 667E62E8F2DC7647A2FE57B7BA5FA332
    @Test
    void testHashCode() {
        V1NetworkPolicyPort other = new V1NetworkPolicyPort().endPort(8080).port(new IntOrString(8080)).protocol("TCP");
        v1NetworkPolicyPort.endPort(8080).port(new IntOrString(8080)).protocol("TCP");
        assertEquals(other.hashCode(), v1NetworkPolicyPort.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: D040C1553ABDF74F19ABA16B99250E74
    @Test
    void testToString() {
        v1NetworkPolicyPort.endPort(8080).port(new IntOrString(8080)).protocol("TCP");
        String expected = "class V1NetworkPolicyPort {\n    endPort: 8080\n    port: 8080\n    protocol: TCP\n}";
        assertEquals(expected, v1NetworkPolicyPort.toString());
    }

    //BaseRock generated method id: ${testEndPortValidValues}, hash: 40FA0183AA6BCFEE754735C8D70424BF
    @ParameterizedTest
    @ValueSource(ints = { 1, 1000, 65535 })
    void testEndPortValidValues(int endPort) {
        v1NetworkPolicyPort.endPort(endPort);
        assertEquals(endPort, v1NetworkPolicyPort.getEndPort());
    }

    //BaseRock generated method id: ${testPortWithString}, hash: 3625BE9863BF5B1CEB856227F8AB7814
    @Test
    void testPortWithString() {
        String portName = "http";
        IntOrString port = new IntOrString(portName);
        v1NetworkPolicyPort.port(port);
        assertEquals(portName, v1NetworkPolicyPort.getPort().getStrValue());
    }

    //BaseRock generated method id: ${testProtocolValidValues}, hash: B6B92DA3D1B94C6A1E484ACE1C1CAF02
    @ParameterizedTest
    @ValueSource(strings = { "TCP", "UDP", "SCTP" })
    void testProtocolValidValues(String protocol) {
        v1NetworkPolicyPort.protocol(protocol);
        assertEquals(protocol, v1NetworkPolicyPort.getProtocol());
    }

    //BaseRock generated method id: ${testSetEndPort}, hash: F8B9BA299DD11F33D48D840567924B9E
    @Test
    void testSetEndPort() {
        Integer endPort = 8080;
        v1NetworkPolicyPort.setEndPort(endPort);
        assertEquals(endPort, v1NetworkPolicyPort.getEndPort());
    }

    //BaseRock generated method id: ${testSetPort}, hash: B105161ED08924BE94CFA02699155773
    @Test
    void testSetPort() {
        IntOrString port = new IntOrString(8080);
        v1NetworkPolicyPort.setPort(port);
        assertEquals(port, v1NetworkPolicyPort.getPort());
    }

    //BaseRock generated method id: ${testSetProtocol}, hash: 84C376FF4608C43EC9A7D57B129FA666
    @Test
    void testSetProtocol() {
        String protocol = "TCP";
        v1NetworkPolicyPort.setProtocol(protocol);
        assertEquals(protocol, v1NetworkPolicyPort.getProtocol());
    }
}
