package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import io.kubernetes.client.openapi.models.V1EndpointAddress;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import java.util.ArrayList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import io.kubernetes.client.openapi.models.CoreV1EndpointPort;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1EndpointSubsetBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1EndpointSubsetConstructor}, hash: 5A10C6A2BEC304316730F97E7F3400A0
    @Test
    void testV1EndpointSubsetConstructor() {
        V1EndpointSubset endpointSubset = new V1EndpointSubset();
        assertNotNull(endpointSubset);
    }

    //BaseRock generated method id: ${testAddresses}, hash: 808B66F9AC4D86508D322D1B69C1781B
    @Test
    void testAddresses() {
        V1EndpointSubset endpointSubset = new V1EndpointSubset();
        List<V1EndpointAddress> addresses = new ArrayList<>();
        V1EndpointAddress address = new V1EndpointAddress();
        addresses.add(address);
        endpointSubset.setAddresses(addresses);
        assertEquals(addresses, endpointSubset.getAddresses());
        endpointSubset.addAddressesItem(new V1EndpointAddress());
        assertEquals(2, endpointSubset.getAddresses().size());
    }

    //BaseRock generated method id: ${testNotReadyAddresses}, hash: 3EA81A7F4222E22E35060717AF7607B2
    @Test
    void testNotReadyAddresses() {
        V1EndpointSubset endpointSubset = new V1EndpointSubset();
        List<V1EndpointAddress> notReadyAddresses = new ArrayList<>();
        V1EndpointAddress address = new V1EndpointAddress();
        notReadyAddresses.add(address);
        endpointSubset.setNotReadyAddresses(notReadyAddresses);
        assertEquals(notReadyAddresses, endpointSubset.getNotReadyAddresses());
        endpointSubset.addNotReadyAddressesItem(new V1EndpointAddress());
        assertEquals(2, endpointSubset.getNotReadyAddresses().size());
    }

    //BaseRock generated method id: ${testPorts}, hash: D7E3846E8F2D776C38F73068FF2BDE34
    @Test
    void testPorts() {
        V1EndpointSubset endpointSubset = new V1EndpointSubset();
        List<CoreV1EndpointPort> ports = new ArrayList<>();
        CoreV1EndpointPort port = new CoreV1EndpointPort();
        ports.add(port);
        endpointSubset.setPorts(ports);
        assertEquals(ports, endpointSubset.getPorts());
        endpointSubset.addPortsItem(new CoreV1EndpointPort());
        assertEquals(2, endpointSubset.getPorts().size());
    }

    //BaseRock generated method id: ${testEquals}, hash: 5D06DC953CCDEF774C34D122A94C4E70
    @Test
    void testEquals() {
        V1EndpointSubset subset1 = new V1EndpointSubset().addresses(new ArrayList<>()).notReadyAddresses(new ArrayList<>()).ports(new ArrayList<>());
        V1EndpointSubset subset2 = new V1EndpointSubset().addresses(new ArrayList<>()).notReadyAddresses(new ArrayList<>()).ports(new ArrayList<>());
        assertEquals(subset1, subset2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 8EFA7CF41D097612F0139C0878D507AD
    @Test
    void testHashCode() {
        V1EndpointSubset subset1 = new V1EndpointSubset().addresses(new ArrayList<>()).notReadyAddresses(new ArrayList<>()).ports(new ArrayList<>());
        V1EndpointSubset subset2 = new V1EndpointSubset().addresses(new ArrayList<>()).notReadyAddresses(new ArrayList<>()).ports(new ArrayList<>());
        assertEquals(subset1.hashCode(), subset2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 7F0A5AC3258F0EAABB3D79094FFC3894
    @Test
    void testToString() {
        V1EndpointSubset subset = new V1EndpointSubset().addresses(new ArrayList<>()).notReadyAddresses(new ArrayList<>()).ports(new ArrayList<>());
        String result = subset.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result.contains("addresses"), is(true));
        assertThat(result.contains("notReadyAddresses"), is(true));
        assertThat(result.contains("ports"), is(true));
    }

    //BaseRock generated method id: ${testAddressesWithNull}, hash: BCAE0FC47F4CE3E8FEC8265216127A30
    @Test
    void testAddressesWithNull() {
        V1EndpointSubset subset = new V1EndpointSubset();
        subset.setAddresses(null);
        assertThat(subset.getAddresses(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNotReadyAddressesWithNull}, hash: 647AA3D160C60138ECAEEFF5FA2465D3
    @Test
    void testNotReadyAddressesWithNull() {
        V1EndpointSubset subset = new V1EndpointSubset();
        subset.setNotReadyAddresses(null);
        assertThat(subset.getNotReadyAddresses(), is(nullValue()));
    }

    //BaseRock generated method id: ${testPortsWithNull}, hash: D481EF98EC909319641D47EA72F13C9D
    @Test
    void testPortsWithNull() {
        V1EndpointSubset subset = new V1EndpointSubset();
        subset.setPorts(null);
        assertThat(subset.getPorts(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAddressesWithEmptyList}, hash: 6F95C456775CF3470D49656BB4572651
    @Test
    void testAddressesWithEmptyList() {
        V1EndpointSubset subset = new V1EndpointSubset();
        subset.setAddresses(new ArrayList<>());
        assertThat(subset.getAddresses(), is(empty()));
    }

    //BaseRock generated method id: ${testNotReadyAddressesWithEmptyList}, hash: 23765EBF81DE3E5DFA0EFCFE0C74C6F7
    @Test
    void testNotReadyAddressesWithEmptyList() {
        V1EndpointSubset subset = new V1EndpointSubset();
        subset.setNotReadyAddresses(new ArrayList<>());
        assertThat(subset.getNotReadyAddresses(), is(empty()));
    }

    //BaseRock generated method id: ${testPortsWithEmptyList}, hash: D3B778EE2DDACD33D4756704B0A39B09
    @Test
    void testPortsWithEmptyList() {
        V1EndpointSubset subset = new V1EndpointSubset();
        subset.setPorts(new ArrayList<>());
        assertThat(subset.getPorts(), is(empty()));
    }

    //BaseRock generated method id: ${testAddMultipleAddresses}, hash: EFFC05E98583E2540574D279CBA01576
    @Test
    void testAddMultipleAddresses() {
        V1EndpointSubset subset = new V1EndpointSubset();
        V1EndpointAddress address1 = new V1EndpointAddress();
        V1EndpointAddress address2 = new V1EndpointAddress();
        V1EndpointAddress address3 = new V1EndpointAddress();
        subset.addAddressesItem(address1);
        subset.addAddressesItem(address2);
        subset.addAddressesItem(address3);
        assertThat(subset.getAddresses(), containsInAnyOrder(address1, address2, address3));
    }

    //BaseRock generated method id: ${testAddMultipleNotReadyAddresses}, hash: DA8710C6EC5ADD23F99DDD67CB8346DA
    @Test
    void testAddMultipleNotReadyAddresses() {
        V1EndpointSubset subset = new V1EndpointSubset();
        V1EndpointAddress address1 = new V1EndpointAddress();
        V1EndpointAddress address2 = new V1EndpointAddress();
        V1EndpointAddress address3 = new V1EndpointAddress();
        subset.addNotReadyAddressesItem(address1);
        subset.addNotReadyAddressesItem(address2);
        subset.addNotReadyAddressesItem(address3);
        assertThat(subset.getNotReadyAddresses(), containsInAnyOrder(address1, address2, address3));
    }

    //BaseRock generated method id: ${testAddMultiplePorts}, hash: 987EA0E9C3CEAF42235E3948281B2A74
    @Test
    void testAddMultiplePorts() {
        V1EndpointSubset subset = new V1EndpointSubset();
        CoreV1EndpointPort port1 = new CoreV1EndpointPort();
        CoreV1EndpointPort port2 = new CoreV1EndpointPort();
        CoreV1EndpointPort port3 = new CoreV1EndpointPort();
        subset.addPortsItem(port1);
        subset.addPortsItem(port2);
        subset.addPortsItem(port3);
        assertThat(subset.getPorts(), containsInAnyOrder(port1, port2, port3));
    }
}
