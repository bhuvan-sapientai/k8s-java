package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import com.google.gson.JsonSyntaxException;
import io.kubernetes.client.openapi.models.V1ServicePort;
import io.kubernetes.client.custom.IntOrString;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ServicePortBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: CADD02EA26DD572F98B9922EAAE2CD8E
    @Test
    void testConstructor() {
        V1ServicePort servicePort = new V1ServicePort();
        assertNotNull(servicePort);
    }

    //BaseRock generated method id: ${testAppProtocol}, hash: 3B459FB44D55E6E37F838813EE9A3517
    @Test
    void testAppProtocol() {
        V1ServicePort servicePort = new V1ServicePort();
        String appProtocol = "HTTP";
        servicePort.setAppProtocol(appProtocol);
        assertEquals(appProtocol, servicePort.getAppProtocol());
    }

    //BaseRock generated method id: ${testName}, hash: 773706FB3BD26E49AA6A316B8BC039CE
    @Test
    void testName() {
        V1ServicePort servicePort = new V1ServicePort();
        String name = "test-port";
        servicePort.setName(name);
        assertEquals(name, servicePort.getName());
    }

    //BaseRock generated method id: ${testNodePort}, hash: 424E68645597FFE558815B5B5B003688
    @Test
    void testNodePort() {
        V1ServicePort servicePort = new V1ServicePort();
        Integer nodePort = 30000;
        servicePort.setNodePort(nodePort);
        assertEquals(nodePort, servicePort.getNodePort());
    }

    //BaseRock generated method id: ${testPort}, hash: E13E184BEAA8DB6C76C7FC60C96F96E5
    @Test
    void testPort() {
        V1ServicePort servicePort = new V1ServicePort();
        Integer port = 8080;
        servicePort.setPort(port);
        assertEquals(port, servicePort.getPort());
    }

    //BaseRock generated method id: ${testProtocol}, hash: 8F499B96DC005224148815BB7D1A8351
    @Test
    void testProtocol() {
        V1ServicePort servicePort = new V1ServicePort();
        String protocol = "TCP";
        servicePort.setProtocol(protocol);
        assertEquals(protocol, servicePort.getProtocol());
    }

    //BaseRock generated method id: ${testTargetPort}, hash: 737B6205950F0AF8A587C6B1293D4504
    @Test
    void testTargetPort() {
        V1ServicePort servicePort = new V1ServicePort();
        IntOrString targetPort = new IntOrString(8080);
        servicePort.setTargetPort(targetPort);
        assertEquals(targetPort, servicePort.getTargetPort());
    }

    //BaseRock generated method id: ${testEquals}, hash: E621845117BF9F963D97E3C27340EA01
    @Test
    void testEquals() {
        V1ServicePort servicePort1 = new V1ServicePort().appProtocol("HTTP").name("test-port").nodePort(30000).port(8080).protocol("TCP").targetPort(new IntOrString(8080));
        V1ServicePort servicePort2 = new V1ServicePort().appProtocol("HTTP").name("test-port").nodePort(30000).port(8080).protocol("TCP").targetPort(new IntOrString(8080));
        assertThat(servicePort1, is(equalTo(servicePort2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 9B4EB9935E7F12B7C661C6E401A4ED58
    @Test
    void testHashCode() {
        V1ServicePort servicePort1 = new V1ServicePort().appProtocol("HTTP").name("test-port").nodePort(30000).port(8080).protocol("TCP").targetPort(new IntOrString(8080));
        V1ServicePort servicePort2 = new V1ServicePort().appProtocol("HTTP").name("test-port").nodePort(30000).port(8080).protocol("TCP").targetPort(new IntOrString(8080));
        assertEquals(servicePort1.hashCode(), servicePort2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 079547DBEB2D0953CF7265C8CAF50ED0
    @Test
    void testToString() {
        V1ServicePort servicePort = new V1ServicePort().appProtocol("HTTP").name("test-port").nodePort(30000).port(8080).protocol("TCP").targetPort(new IntOrString(8080));
        String expected = "class V1ServicePort {\n" + "    appProtocol: HTTP\n" + "    name: test-port\n" + "    nodePort: 30000\n" + "    port: 8080\n" + "    protocol: TCP\n" + "    targetPort: 8080\n" + "}";
        assertEquals(expected, servicePort.toString());
    }

    //BaseRock generated method id: ${testAppProtocolWithDifferentValues}, hash: DA18430E4F92F81351F0A3EA9A2991F8
    @ParameterizedTest
    @ValueSource(strings = { "HTTP", "HTTPS", "TCP", "UDP" })
    void testAppProtocolWithDifferentValues(String protocol) {
        V1ServicePort servicePort = new V1ServicePort();
        servicePort.setAppProtocol(protocol);
        assertEquals(protocol, servicePort.getAppProtocol());
    }

    //BaseRock generated method id: ${testPortRequired}, hash: B2A1975D48AC9DB8678E456DE375D9C7
    @Test
    void testPortRequired() {
        V1ServicePort servicePort = new V1ServicePort();
        assertThrows(IllegalArgumentException.class, () -> {
            io.kubernetes.client.openapi.JSON.getGson().fromJson(servicePort.toJson(), V1ServicePort.class);
        });
    }

    //BaseRock generated method id: ${testValidServicePort}, hash: 8C9B62CE03C1C07CCD801AF407F9F126
    @Test
    void testValidServicePort() {
        V1ServicePort servicePort = new V1ServicePort().port(8080);
        assertThat(servicePort, is(notNullValue()));
    }
}
