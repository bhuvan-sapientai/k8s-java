package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1ObjectReference;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1EndpointAddressBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1EndpointAddressConstructor}, hash: 64D7C25E7F7511F8FF89102B3EBB114E
    @Test
    void testV1EndpointAddressConstructor() {
        V1EndpointAddress address = new V1EndpointAddress();
        assertThat(address, is(notNullValue()));
    }

    //BaseRock generated method id: ${testHostname}, hash: E105A87A7F84BC197BA9C762FBCB94BF
    @Test
    void testHostname() {
        V1EndpointAddress address = new V1EndpointAddress();
        String hostname = "test-hostname";
        address.setHostname(hostname);
        assertEquals(hostname, address.getHostname());
    }

    //BaseRock generated method id: ${testHostnameWithDifferentValues}, hash: A355036C771010D4EEC1C1F0EF594D45
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "test", "another-test" })
    void testHostnameWithDifferentValues(String hostname) {
        V1EndpointAddress address = new V1EndpointAddress();
        address.setHostname(hostname);
        assertEquals(hostname, address.getHostname());
    }

    //BaseRock generated method id: ${testIp}, hash: E3C5139060715F7FF910BEFE55F6E64A
    @Test
    void testIp() {
        V1EndpointAddress address = new V1EndpointAddress();
        String ip = "192.168.0.1";
        address.setIp(ip);
        assertEquals(ip, address.getIp());
    }

    //BaseRock generated method id: ${testNodeName}, hash: 5A02E08EDFDDA9EA52BA224FD1ACDABC
    @Test
    void testNodeName() {
        V1EndpointAddress address = new V1EndpointAddress();
        String nodeName = "test-node";
        address.setNodeName(nodeName);
        assertEquals(nodeName, address.getNodeName());
    }

    //BaseRock generated method id: ${testTargetRef}, hash: 62F5D3F2E9558242288ED166167818FA
    @Test
    void testTargetRef() {
        V1EndpointAddress address = new V1EndpointAddress();
        V1ObjectReference targetRef = new V1ObjectReference();
        address.setTargetRef(targetRef);
        assertEquals(targetRef, address.getTargetRef());
    }

    //BaseRock generated method id: ${testEquals}, hash: 542880DED65ECE4A64BA9F731F631FA4
    @Test
    void testEquals() {
        V1EndpointAddress address1 = new V1EndpointAddress().hostname("test-host").ip("192.168.0.1").nodeName("test-node");
        V1EndpointAddress address2 = new V1EndpointAddress().hostname("test-host").ip("192.168.0.1").nodeName("test-node");
        V1EndpointAddress address3 = new V1EndpointAddress().hostname("other-host").ip("192.168.0.2").nodeName("other-node");
        assertThat(address1.equals(address2), is(true));
        assertThat(address1.equals(address3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 8E0C0A5EDD5A02D5E7D2C9FC8A4986B7
    @Test
    void testHashCode() {
        V1EndpointAddress address1 = new V1EndpointAddress().hostname("test-host").ip("192.168.0.1").nodeName("test-node");
        V1EndpointAddress address2 = new V1EndpointAddress().hostname("test-host").ip("192.168.0.1").nodeName("test-node");
        assertThat(address1.hashCode(), equalTo(address2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 60DE20EAC70E2E4DBAFAFA98FDA08A9E
    @Test
    void testToString() {
        V1EndpointAddress address = new V1EndpointAddress().hostname("test-host").ip("192.168.0.1").nodeName("test-node");
        String expectedString = "class V1EndpointAddress {\n" + "    hostname: test-host\n" + "    ip: 192.168.0.1\n" + "    nodeName: test-node\n" + "    targetRef: null\n" + "}";
        assertEquals(expectedString, address.toString());
    }

    //BaseRock generated method id: ${testSetNullValues}, hash: 4A4BAED4009F497B213564671A82CD43
    @Test
    void testSetNullValues() {
        V1EndpointAddress address = new V1EndpointAddress();
        address.setHostname(null);
        assertNull(address.getHostname());
        address.setNodeName(null);
        assertNull(address.getNodeName());
        address.setTargetRef(null);
        assertNull(address.getTargetRef());
    }

    //BaseRock generated method id: ${testSetEmptyValues}, hash: 740678ED23F01BB76432CB6365E4ED0B
    @Test
    void testSetEmptyValues() {
        V1EndpointAddress address = new V1EndpointAddress();
        address.setHostname("");
        assertEquals("", address.getHostname());
        address.setIp("");
        assertEquals("", address.getIp());
        address.setNodeName("");
        assertEquals("", address.getNodeName());
    }

    //BaseRock generated method id: ${testIpValidation}, hash: 417FF0AFEC8517E1F0F21D24CCC4553A
    @Test
    void testIpValidation() {
        V1EndpointAddress address = new V1EndpointAddress();
        address.setIp(null);
        assertNull(address.getIp());
    }
}
