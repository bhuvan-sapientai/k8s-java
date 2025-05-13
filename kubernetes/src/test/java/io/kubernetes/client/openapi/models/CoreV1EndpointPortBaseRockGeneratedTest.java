package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.nullValue;
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
import org.junit.jupiter.params.provider.CsvSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import io.kubernetes.client.openapi.models.CoreV1EndpointPort;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class CoreV1EndpointPortBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: E37F881ABC681D490E416E9C21BB273F
    @Test
    void testConstructor() {
        CoreV1EndpointPort endpointPort = new CoreV1EndpointPort();
        assertNotNull(endpointPort);
    }

    //BaseRock generated method id: ${testAppProtocol}, hash: CE2DEA89B1688C5AF5FFFE17CA3961D3
    @Test
    void testAppProtocol() {
        CoreV1EndpointPort endpointPort = new CoreV1EndpointPort();
        String appProtocol = "http";
        endpointPort.setAppProtocol(appProtocol);
        assertEquals(appProtocol, endpointPort.getAppProtocol());
    }

    //BaseRock generated method id: ${testName}, hash: BAED36A97EBC8E00053E3B8A8B7F8EDA
    @Test
    void testName() {
        CoreV1EndpointPort endpointPort = new CoreV1EndpointPort();
        String name = "test-port";
        endpointPort.setName(name);
        assertEquals(name, endpointPort.getName());
    }

    //BaseRock generated method id: ${testPort}, hash: C29C01D07D12B1F38E1BCBF10FA88F83
    @Test
    void testPort() {
        CoreV1EndpointPort endpointPort = new CoreV1EndpointPort();
        Integer port = 8080;
        endpointPort.setPort(port);
        assertEquals(port, endpointPort.getPort());
    }

    //BaseRock generated method id: ${testProtocol}, hash: 327B8710D6C89903B1E583891CF8EDE6
    @Test
    void testProtocol() {
        CoreV1EndpointPort endpointPort = new CoreV1EndpointPort();
        String protocol = "TCP";
        endpointPort.setProtocol(protocol);
        assertEquals(protocol, endpointPort.getProtocol());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 1D40EB8DA4B7662E9195A0BAB47DF2AB
    @Test
    void testEqualsWithSameObject() {
        CoreV1EndpointPort endpointPort = new CoreV1EndpointPort().appProtocol("http").name("test-port").port(8080).protocol("TCP");
        assertThat(endpointPort.equals(endpointPort), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: CE92C4C91F1BA25FBD7F615C7DB8C5BB
    @Test
    void testEqualsWithDifferentObject() {
        CoreV1EndpointPort endpointPort1 = new CoreV1EndpointPort().appProtocol("http").name("test-port-1").port(8080).protocol("TCP");
        CoreV1EndpointPort endpointPort2 = new CoreV1EndpointPort().appProtocol("https").name("test-port-2").port(8443).protocol("UDP");
        assertThat(endpointPort1.equals(endpointPort2), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: EC95105AFB08730BD764C5B26E21F7A2
    @Test
    void testHashCode() {
        CoreV1EndpointPort endpointPort1 = new CoreV1EndpointPort().appProtocol("http").name("test-port").port(8080).protocol("TCP");
        CoreV1EndpointPort endpointPort2 = new CoreV1EndpointPort().appProtocol("http").name("test-port").port(8080).protocol("TCP");
        assertThat(endpointPort1.hashCode(), equalTo(endpointPort2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 92A91BE077AAF99B1FE334CCB14A8106
    @Test
    void testToString() {
        CoreV1EndpointPort endpointPort = new CoreV1EndpointPort().appProtocol("http").name("test-port").port(8080).protocol("TCP");
        String expectedString = "class CoreV1EndpointPort {\n" + "    appProtocol: http\n" + "    name: test-port\n" + "    port: 8080\n" + "    protocol: TCP\n" + "}";
        assertThat(endpointPort.toString(), equalTo(expectedString));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: C46411CC78970A5F482E82F609E33580
    @ParameterizedTest
    @CsvSource({ "http,test-port,8080,TCP", "https,secure-port,443,UDP", "grpc,grpc-port,9000,SCTP" })
    void testBuilderPattern(String appProtocol, String name, int port, String protocol) {
        CoreV1EndpointPort endpointPort = new CoreV1EndpointPort().appProtocol(appProtocol).name(name).port(port).protocol(protocol);
        assertThat(endpointPort.getAppProtocol(), equalTo(appProtocol));
        assertThat(endpointPort.getName(), equalTo(name));
        assertThat(endpointPort.getPort(), equalTo(port));
        assertThat(endpointPort.getProtocol(), equalTo(protocol));
    }

    //BaseRock generated method id: ${testNullAppProtocol}, hash: 65C37460F10185D82692D97976F3504B
    @Test
    void testNullAppProtocol() {
        CoreV1EndpointPort endpointPort = new CoreV1EndpointPort();
        endpointPort.setAppProtocol(null);
        assertThat(endpointPort.getAppProtocol(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNullName}, hash: 3D36829AAC817730B3DAF908029C5011
    @Test
    void testNullName() {
        CoreV1EndpointPort endpointPort = new CoreV1EndpointPort();
        endpointPort.setName(null);
        assertThat(endpointPort.getName(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNullProtocol}, hash: E31D24B8ACDEA33F605E20A7983A995B
    @Test
    void testNullProtocol() {
        CoreV1EndpointPort endpointPort = new CoreV1EndpointPort();
        endpointPort.setProtocol(null);
        assertThat(endpointPort.getProtocol(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNullPort}, hash: 81B12EB60B04FB0603F960116DAA4152
    @Test
    void testNullPort() {
        CoreV1EndpointPort endpointPort = new CoreV1EndpointPort();
        assertThat(endpointPort.getPort(), is(nullValue()));
    }
}
