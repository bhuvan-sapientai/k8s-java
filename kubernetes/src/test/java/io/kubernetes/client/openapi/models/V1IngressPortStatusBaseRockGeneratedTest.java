package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1IngressPortStatus;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1IngressPortStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 5CB7860D7EF54C9A2533DC32A6EFF288
    @Test
    void testConstructor() {
        V1IngressPortStatus status = new V1IngressPortStatus();
        assertNotNull(status);
    }

    //BaseRock generated method id: ${testErrorGetterAndSetter}, hash: 347E2B9AC69C565DD702551A54C44CC4
    @Test
    void testErrorGetterAndSetter() {
        V1IngressPortStatus status = new V1IngressPortStatus();
        String error = "TestError";
        status.setError(error);
        assertEquals(error, status.getError());
    }

    //BaseRock generated method id: ${testPortGetterAndSetter}, hash: 323D3E6B52AB09DC712272656C453339
    @Test
    void testPortGetterAndSetter() {
        V1IngressPortStatus status = new V1IngressPortStatus();
        Integer port = 8080;
        status.setPort(port);
        assertEquals(port, status.getPort());
    }

    //BaseRock generated method id: ${testProtocolGetterAndSetter}, hash: B0B08FF60D71493F555084F3347544A3
    @Test
    void testProtocolGetterAndSetter() {
        V1IngressPortStatus status = new V1IngressPortStatus();
        String protocol = "TCP";
        status.setProtocol(protocol);
        assertEquals(protocol, status.getProtocol());
    }

    //BaseRock generated method id: ${testErrorMethod}, hash: 056554989C65B4408E66D701A5687D30
    @Test
    void testErrorMethod() {
        V1IngressPortStatus status = new V1IngressPortStatus();
        String error = "TestError";
        V1IngressPortStatus result = status.error(error);
        assertEquals(error, result.getError());
        assertSame(status, result);
    }

    //BaseRock generated method id: ${testPortMethod}, hash: 0B1AD2E4458DDF9BAE9C92EEB052B4FD
    @Test
    void testPortMethod() {
        V1IngressPortStatus status = new V1IngressPortStatus();
        Integer port = 8080;
        V1IngressPortStatus result = status.port(port);
        assertEquals(port, result.getPort());
        assertSame(status, result);
    }

    //BaseRock generated method id: ${testProtocolMethod}, hash: 9B9EFD3D7B32E47D20CA5B22C6413571
    @Test
    void testProtocolMethod() {
        V1IngressPortStatus status = new V1IngressPortStatus();
        String protocol = "TCP";
        V1IngressPortStatus result = status.protocol(protocol);
        assertEquals(protocol, result.getProtocol());
        assertSame(status, result);
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 6D5522E3F2B3CB373EBF45FD5309D6EB
    @Test
    void testEqualsAndHashCode() {
        V1IngressPortStatus status1 = new V1IngressPortStatus().error("Error1").port(8080).protocol("TCP");
        V1IngressPortStatus status2 = new V1IngressPortStatus().error("Error1").port(8080).protocol("TCP");
        V1IngressPortStatus status3 = new V1IngressPortStatus().error("Error2").port(8081).protocol("UDP");
        assertTrue(status1.equals(status2) && status2.equals(status1));
        assertEquals(status1.hashCode(), status2.hashCode());
        assertFalse(status1.equals(status3));
        assertNotEquals(status1.hashCode(), status3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: F0797E3CF3D9450545CD1B4AD96366D0
    @Test
    void testToString() {
        V1IngressPortStatus status = new V1IngressPortStatus().error("TestError").port(8080).protocol("TCP");
        String toString = status.toString();
        assertThat(toString, containsString("error: TestError"));
        assertThat(toString, containsString("port: 8080"));
        assertThat(toString, containsString("protocol: TCP"));
    }

    //BaseRock generated method id: ${testValidProtocols}, hash: 565CA9FB9DABE62645C78DA4C61B6DC1
    @ParameterizedTest
    @ValueSource(strings = { "TCP", "UDP", "SCTP" })
    void testValidProtocols(String protocol) {
        V1IngressPortStatus status = new V1IngressPortStatus().protocol(protocol);
        assertEquals(protocol, status.getProtocol());
    }

    //BaseRock generated method id: ${testNullValues}, hash: 04649E715A179AD2E980863F55536AFC
    @Test
    void testNullValues() {
        V1IngressPortStatus status = new V1IngressPortStatus();
        assertNull(status.getError());
        assertNull(status.getPort());
        assertNull(status.getProtocol());
    }
}
