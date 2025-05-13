package io.kubernetes.client.openapi.models;

import java.util.List;
import io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1Endpoint;
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
class V1EndpointSliceBaseRockGeneratedTest {

    private V1EndpointSlice endpointSlice;

    @BeforeEach
    void setUp() {
        endpointSlice = new V1EndpointSlice();
    }

    //BaseRock generated method id: ${testAddressType}, hash: 7BF538FE092BCA6F8F450F16087BD5B5
    @Test
    void testAddressType() {
        String addressType = "IPv4";
        endpointSlice.setAddressType(addressType);
        assertEquals(addressType, endpointSlice.getAddressType());
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 53C4207506804AC2679F3A5121F7D1B6
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        endpointSlice.setApiVersion(apiVersion);
        assertEquals(apiVersion, endpointSlice.getApiVersion());
    }

    //BaseRock generated method id: ${testEndpoints}, hash: C936BC9B72C91534FF28194E16C7D719
    @Test
    void testEndpoints() {
        List<V1Endpoint> endpoints = new ArrayList<>();
        V1Endpoint endpoint = mock(V1Endpoint.class);
        endpoints.add(endpoint);
        endpointSlice.setEndpoints(endpoints);
        assertEquals(endpoints, endpointSlice.getEndpoints());
    }

    //BaseRock generated method id: ${testAddEndpointsItem}, hash: 184284B6D8C2D6B4027061D1A1CC5308
    @Test
    void testAddEndpointsItem() {
        V1Endpoint endpoint = mock(V1Endpoint.class);
        endpointSlice.addEndpointsItem(endpoint);
        assertTrue(endpointSlice.getEndpoints().contains(endpoint));
    }

    //BaseRock generated method id: ${testKind}, hash: 9C05EDEEE1DF7BB00081AB8CF29AA990
    @Test
    void testKind() {
        String kind = "EndpointSlice";
        endpointSlice.setKind(kind);
        assertEquals(kind, endpointSlice.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 2D8793F3093B4DEDA04121C1F41FD7B2
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        endpointSlice.setMetadata(metadata);
        assertEquals(metadata, endpointSlice.getMetadata());
    }

    //BaseRock generated method id: ${testPorts}, hash: C91A17978EC719C042FC4AC138FCC1B1
    @Test
    void testPorts() {
        List<DiscoveryV1EndpointPort> ports = new ArrayList<>();
        DiscoveryV1EndpointPort port = mock(DiscoveryV1EndpointPort.class);
        ports.add(port);
        endpointSlice.setPorts(ports);
        assertEquals(ports, endpointSlice.getPorts());
    }

    //BaseRock generated method id: ${testAddPortsItem}, hash: 401D6193088EE5600269BC23C2851778
    @Test
    void testAddPortsItem() {
        DiscoveryV1EndpointPort port = mock(DiscoveryV1EndpointPort.class);
        endpointSlice.addPortsItem(port);
        assertTrue(endpointSlice.getPorts().contains(port));
    }

    //BaseRock generated method id: ${testEquals}, hash: A5A620C8B8599B804D317ABB016206A8
    @Test
    void testEquals() {
        V1EndpointSlice slice1 = new V1EndpointSlice().addressType("IPv4").apiVersion("v1").kind("EndpointSlice");
        V1EndpointSlice slice2 = new V1EndpointSlice().addressType("IPv4").apiVersion("v1").kind("EndpointSlice");
        assertEquals(slice1, slice2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: C6E89299CB361EBE02F41DBE2C021B60
    @Test
    void testHashCode() {
        V1EndpointSlice slice1 = new V1EndpointSlice().addressType("IPv4").apiVersion("v1").kind("EndpointSlice");
        V1EndpointSlice slice2 = new V1EndpointSlice().addressType("IPv4").apiVersion("v1").kind("EndpointSlice");
        assertEquals(slice1.hashCode(), slice2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 129BD18EC2E92A8F2674D848BD4E9F79
    @Test
    void testToString() {
        V1EndpointSlice slice = new V1EndpointSlice().addressType("IPv4").apiVersion("v1").kind("EndpointSlice");
        String expected = "class V1EndpointSlice {\n" + "    addressType: IPv4\n" + "    apiVersion: v1\n" + "    endpoints: []\n" + "    kind: EndpointSlice\n" + "    metadata: null\n" + "    ports: []\n" + "}";
        assertEquals(expected, slice.toString());
    }

    //BaseRock generated method id: ${testValidAddressTypes}, hash: BA1A4CDA5CA928F282799490F7A6DEF7
    @ParameterizedTest
    @ValueSource(strings = { "IPv4", "IPv6", "FQDN" })
    void testValidAddressTypes(String addressType) {
        endpointSlice.setAddressType(addressType);
        assertEquals(addressType, endpointSlice.getAddressType());
    }

    //BaseRock generated method id: ${testConstructor}, hash: 9E3732086625FBA621B734E4F321C705
    @Test
    void testConstructor() {
        assertNotNull(new V1EndpointSlice());
    }
}
