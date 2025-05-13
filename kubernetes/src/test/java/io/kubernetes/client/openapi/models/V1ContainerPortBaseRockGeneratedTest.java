package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1ContainerPort;
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
class V1ContainerPortBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 2AC923749EDF8A7CA4243E0B27B1A884
    @Test
    void testConstructor() {
        V1ContainerPort containerPort = new V1ContainerPort();
        assertNotNull(containerPort);
    }

    //BaseRock generated method id: ${testContainerPort}, hash: 3BD36FC650213B8EB1DC620854BB50A8
    @Test
    void testContainerPort() {
        V1ContainerPort containerPort = new V1ContainerPort().containerPort(8080);
        assertEquals(8080, containerPort.getContainerPort());
    }

    //BaseRock generated method id: ${testValidContainerPorts}, hash: 22B0E255EE293D670A106F12A9D42A50
    @ParameterizedTest
    @ValueSource(ints = { 1, 8080, 65535 })
    void testValidContainerPorts(int port) {
        V1ContainerPort containerPort = new V1ContainerPort().containerPort(port);
        assertEquals(port, containerPort.getContainerPort());
    }

    //BaseRock generated method id: ${testHostIP}, hash: CDD1125606E96462ABCAF3BE476FE78B
    @Test
    void testHostIP() {
        V1ContainerPort containerPort = new V1ContainerPort().hostIP("192.168.1.1");
        assertEquals("192.168.1.1", containerPort.getHostIP());
    }

    //BaseRock generated method id: ${testHostPort}, hash: 39071DF3087F02FA155EE9C592AD87B8
    @Test
    void testHostPort() {
        V1ContainerPort containerPort = new V1ContainerPort().hostPort(9090);
        assertEquals(9090, containerPort.getHostPort());
    }

    //BaseRock generated method id: ${testName}, hash: AC16742064170AC9CA2CC9C541462F09
    @Test
    void testName() {
        V1ContainerPort containerPort = new V1ContainerPort().name("http");
        assertEquals("http", containerPort.getName());
    }

    //BaseRock generated method id: ${testProtocol}, hash: 7B1BB3737204BE475F364C31AB099212
    @Test
    void testProtocol() {
        V1ContainerPort containerPort = new V1ContainerPort().protocol("TCP");
        assertEquals("TCP", containerPort.getProtocol());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 7A68FBBE20244ED6DE0A53FC974950FF
    @Test
    void testEqualsAndHashCode() {
        V1ContainerPort port1 = new V1ContainerPort().containerPort(8080).hostIP("192.168.1.1").hostPort(9090).name("http").protocol("TCP");
        V1ContainerPort port2 = new V1ContainerPort().containerPort(8080).hostIP("192.168.1.1").hostPort(9090).name("http").protocol("TCP");
        V1ContainerPort port3 = new V1ContainerPort().containerPort(8081).hostIP("192.168.1.2").hostPort(9091).name("https").protocol("UDP");
        assertTrue(port1.equals(port2) && port2.equals(port1));
        assertEquals(port1.hashCode(), port2.hashCode());
        assertFalse(port1.equals(port3));
        assertNotEquals(port1.hashCode(), port3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: C361A8B378F9D221ADB53BB3E715DBE4
    @Test
    void testToString() {
        V1ContainerPort containerPort = new V1ContainerPort().containerPort(8080).hostIP("192.168.1.1").hostPort(9090).name("http").protocol("TCP");
        String expectedString = "class V1ContainerPort {\n" + "    containerPort: 8080\n" + "    hostIP: 192.168.1.1\n" + "    hostPort: 9090\n" + "    name: http\n" + "    protocol: TCP\n" + "}";
        assertEquals(expectedString, containerPort.toString());
    }
}
