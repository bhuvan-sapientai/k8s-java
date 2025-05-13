package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class DiscoveryV1EndpointPortBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 3E9C8C4CD3151B6A0AB448B62E2A1A5F
    @Test
    void testConstructor() {
        DiscoveryV1EndpointPort port = new DiscoveryV1EndpointPort();
        assertNotNull(port);
    }

    //BaseRock generated method id: ${testAppProtocol}, hash: 42835B8976A2A2A096701C7737D0D59C
    @Test
    void testAppProtocol() {
        DiscoveryV1EndpointPort port = new DiscoveryV1EndpointPort();
        String appProtocol = "http";
        port.setAppProtocol(appProtocol);
        assertEquals(appProtocol, port.getAppProtocol());
    }

    //BaseRock generated method id: ${testName}, hash: F6B2E8C8577C329FE291A78E72EB855C
    @Test
    void testName() {
        DiscoveryV1EndpointPort port = new DiscoveryV1EndpointPort();
        String name = "test-port";
        port.setName(name);
        assertEquals(name, port.getName());
    }

    //BaseRock generated method id: ${testPort}, hash: 861011C8B9C8ACF352FBEB03211E3CA8
    @Test
    void testPort() {
        DiscoveryV1EndpointPort port = new DiscoveryV1EndpointPort();
        Integer portNumber = 8080;
        port.setPort(portNumber);
        assertEquals(portNumber, port.getPort());
    }

    //BaseRock generated method id: ${testProtocol}, hash: 083280F5691FEFBF057C90C03267E15C
    @Test
    void testProtocol() {
        DiscoveryV1EndpointPort port = new DiscoveryV1EndpointPort();
        String protocol = "TCP";
        port.setProtocol(protocol);
        assertEquals(protocol, port.getProtocol());
    }

    //BaseRock generated method id: ${testEquals}, hash: 21AFBD9040C6C392BD2278D31FECDBCC
    @Test
    void testEquals() {
        DiscoveryV1EndpointPort port1 = new DiscoveryV1EndpointPort().appProtocol("http").name("test-port").port(8080).protocol("TCP");
        DiscoveryV1EndpointPort port2 = new DiscoveryV1EndpointPort().appProtocol("http").name("test-port").port(8080).protocol("TCP");
        assertThat(port1, is(equalTo(port2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: B4A9671CD5D39EE980A6C5F45C93AA45
    @Test
    void testHashCode() {
        DiscoveryV1EndpointPort port1 = new DiscoveryV1EndpointPort().appProtocol("http").name("test-port").port(8080).protocol("TCP");
        DiscoveryV1EndpointPort port2 = new DiscoveryV1EndpointPort().appProtocol("http").name("test-port").port(8080).protocol("TCP");
        assertEquals(port1.hashCode(), port2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 40D1522E742BC70F5B62728395752C58
    @Test
    void testToString() {
        DiscoveryV1EndpointPort port = new DiscoveryV1EndpointPort().appProtocol("http").name("test-port").port(8080).protocol("TCP");
        String expectedString = "class DiscoveryV1EndpointPort {\n" + "    appProtocol: http\n" + "    name: test-port\n" + "    port: 8080\n" + "    protocol: TCP\n" + "}";
        assertEquals(expectedString, port.toString());
    }

    //BaseRock generated method id: ${testAppProtocolWithDifferentValues}, hash: B9F7738CADD6E415F43D01ED18CF9E9F
    @ParameterizedTest
    @ValueSource(strings = { "http", "https", "ftp" })
    void testAppProtocolWithDifferentValues(String protocol) {
        DiscoveryV1EndpointPort port = new DiscoveryV1EndpointPort();
        port.setAppProtocol(protocol);
        assertEquals(protocol, port.getAppProtocol());
    }

    //BaseRock generated method id: ${testPortWithDifferentValues}, hash: C41F39D5977A52E0CDFA4C2B851ADCAB
    @ParameterizedTest
    @ValueSource(ints = { 80, 443, 8080, 8443 })
    void testPortWithDifferentValues(int portNumber) {
        DiscoveryV1EndpointPort port = new DiscoveryV1EndpointPort();
        port.setPort(portNumber);
        assertEquals(portNumber, port.getPort());
    }

    //BaseRock generated method id: ${testProtocolWithDifferentValues}, hash: EA740BE89B95D332389B7F55E8C52F4F
    @ParameterizedTest
    @ValueSource(strings = { "TCP", "UDP", "SCTP" })
    void testProtocolWithDifferentValues(String protocol) {
        DiscoveryV1EndpointPort port = new DiscoveryV1EndpointPort();
        port.setProtocol(protocol);
        assertEquals(protocol, port.getProtocol());
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: ED56F2DB6F0C66D24E7D0C1A7999ED61
    @Test
    void testBuilderPattern() {
        DiscoveryV1EndpointPort port = new DiscoveryV1EndpointPort().appProtocol("http").name("test-port").port(8080).protocol("TCP");
        assertThat(port, is(notNullValue()));
        assertEquals("http", port.getAppProtocol());
        assertEquals("test-port", port.getName());
        assertEquals(Integer.valueOf(8080), port.getPort());
        assertEquals("TCP", port.getProtocol());
    }
}
