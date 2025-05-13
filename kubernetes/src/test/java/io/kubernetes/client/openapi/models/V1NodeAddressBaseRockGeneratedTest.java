package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
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
class V1NodeAddressBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 0C490CC3E58872AF6DF8CDB9FDABDFD7
    @Test
    void testConstructor() {
        V1NodeAddress address = new V1NodeAddress();
        assertNotNull(address);
    }

    //BaseRock generated method id: ${testAddressGetter}, hash: 7D22976A4A6AD8FB783592A79BA17DD2
    @Test
    void testAddressGetter() {
        V1NodeAddress address = new V1NodeAddress().address("192.168.1.1");
        assertEquals("192.168.1.1", address.getAddress());
    }

    //BaseRock generated method id: ${testAddressSetter}, hash: 7C9B265D8709AB3E4570D864EABAD58F
    @Test
    void testAddressSetter() {
        V1NodeAddress address = new V1NodeAddress();
        address.setAddress("10.0.0.1");
        assertEquals("10.0.0.1", address.getAddress());
    }

    //BaseRock generated method id: ${testTypeGetter}, hash: E43EA507E6B424CA10FEF84CEA1DD4C8
    @Test
    void testTypeGetter() {
        V1NodeAddress address = new V1NodeAddress().type("ExternalIP");
        assertEquals("ExternalIP", address.getType());
    }

    //BaseRock generated method id: ${testTypeSetter}, hash: D71080EF33D95A293F8B6069DE6EC045
    @Test
    void testTypeSetter() {
        V1NodeAddress address = new V1NodeAddress();
        address.setType("InternalIP");
        assertEquals("InternalIP", address.getType());
    }

    //BaseRock generated method id: ${testEquals}, hash: 1BBF7F224F4A0A93E84C567E611835BC
    @Test
    void testEquals() {
        V1NodeAddress address1 = new V1NodeAddress().address("192.168.1.1").type("ExternalIP");
        V1NodeAddress address2 = new V1NodeAddress().address("192.168.1.1").type("ExternalIP");
        V1NodeAddress address3 = new V1NodeAddress().address("10.0.0.1").type("InternalIP");
        assertTrue(address1.equals(address2));
        assertFalse(address1.equals(address3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 4F6BFDD481DF19C499DF95E9FCD12EEA
    @Test
    void testHashCode() {
        V1NodeAddress address1 = new V1NodeAddress().address("192.168.1.1").type("ExternalIP");
        V1NodeAddress address2 = new V1NodeAddress().address("192.168.1.1").type("ExternalIP");
        V1NodeAddress address3 = new V1NodeAddress().address("10.0.0.1").type("InternalIP");
        assertEquals(address1.hashCode(), address2.hashCode());
        assertNotEquals(address1.hashCode(), address3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: ED82E0DBAD4464606B678AE57B3D29B8
    @Test
    void testToString() {
        V1NodeAddress address = new V1NodeAddress().address("192.168.1.1").type("ExternalIP");
        String expectedString = "class V1NodeAddress {\n    address: 192.168.1.1\n    type: ExternalIP\n}";
        assertEquals(expectedString, address.toString());
    }

    //BaseRock generated method id: ${testValidAddressTypes}, hash: 19A6BD6A5E40EB773E0788B858013F71
    @ParameterizedTest
    @ValueSource(strings = { "Hostname", "ExternalIP", "InternalIP" })
    void testValidAddressTypes(String type) {
        V1NodeAddress address = new V1NodeAddress().type(type);
        assertEquals(type, address.getType());
    }

    //BaseRock generated method id: ${testNullAddress}, hash: 98971DCBC1D3CE9A76BDD71F8C015955
    @Test
    void testNullAddress() {
        V1NodeAddress address = new V1NodeAddress();
        assertNull(address.getAddress());
    }

    //BaseRock generated method id: ${testNullType}, hash: EC588EE7DADF9BFF84D2B97AE1EF1E6F
    @Test
    void testNullType() {
        V1NodeAddress address = new V1NodeAddress();
        assertNull(address.getType());
    }
}
