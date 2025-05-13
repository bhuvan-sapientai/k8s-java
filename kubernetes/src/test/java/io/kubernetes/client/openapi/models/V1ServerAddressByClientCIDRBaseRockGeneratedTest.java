package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ServerAddressByClientCIDRBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 14B339A06EB7EAE8DC5A3FD705C4747D
    @Test
    void testConstructor() {
        V1ServerAddressByClientCIDR serverAddress = new V1ServerAddressByClientCIDR();
        assertThat(serverAddress, is(notNullValue()));
    }

    //BaseRock generated method id: ${testClientCIDRSetter}, hash: 93525AEBDDEAF3ADC92884F77CC98A70
    @Test
    void testClientCIDRSetter() {
        V1ServerAddressByClientCIDR serverAddress = new V1ServerAddressByClientCIDR();
        serverAddress.setClientCIDR("192.168.0.0/16");
        assertThat(serverAddress.getClientCIDR(), is(equalTo("192.168.0.0/16")));
    }

    //BaseRock generated method id: ${testServerAddressSetter}, hash: 190879A50214B79A940C2E395BD86BD9
    @Test
    void testServerAddressSetter() {
        V1ServerAddressByClientCIDR serverAddress = new V1ServerAddressByClientCIDR();
        serverAddress.setServerAddress("10.0.0.1:8080");
        assertThat(serverAddress.getServerAddress(), is(equalTo("10.0.0.1:8080")));
    }

    //BaseRock generated method id: ${testClientCIDRChained}, hash: C07C333E8BEB2C012F47D55ABD343C2C
    @Test
    void testClientCIDRChained() {
        V1ServerAddressByClientCIDR serverAddress = new V1ServerAddressByClientCIDR().clientCIDR("172.16.0.0/12");
        assertThat(serverAddress.getClientCIDR(), is(equalTo("172.16.0.0/12")));
    }

    //BaseRock generated method id: ${testServerAddressChained}, hash: 44929D5CC935BDF60DCE77F36DEBDAC3
    @Test
    void testServerAddressChained() {
        V1ServerAddressByClientCIDR serverAddress = new V1ServerAddressByClientCIDR().serverAddress("192.168.1.1:443");
        assertThat(serverAddress.getServerAddress(), is(equalTo("192.168.1.1:443")));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 61762456EF70B6DF1C5DC6989A339D74
    @Test
    void testEqualsWithSameObject() {
        V1ServerAddressByClientCIDR serverAddress = new V1ServerAddressByClientCIDR().clientCIDR("10.0.0.0/8").serverAddress("192.168.0.1:8080");
        assertThat(serverAddress.equals(serverAddress), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 466819B37AD1EC4EFE6BC9C1E0B886D1
    @Test
    void testEqualsWithDifferentObject() {
        V1ServerAddressByClientCIDR serverAddress1 = new V1ServerAddressByClientCIDR().clientCIDR("10.0.0.0/8").serverAddress("192.168.0.1:8080");
        V1ServerAddressByClientCIDR serverAddress2 = new V1ServerAddressByClientCIDR().clientCIDR("10.0.0.0/8").serverAddress("192.168.0.1:8080");
        assertThat(serverAddress1.equals(serverAddress2), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: ABFE1C6D7BE1EA3143E4C7F968965E7E
    @Test
    void testEqualsWithDifferentClass() {
        V1ServerAddressByClientCIDR serverAddress = new V1ServerAddressByClientCIDR().clientCIDR("10.0.0.0/8").serverAddress("192.168.0.1:8080");
        assertThat(serverAddress.equals("Not a V1ServerAddressByClientCIDR"), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 88AF5E679E4B7EC2B359FC1B98F41556
    @Test
    void testHashCode() {
        V1ServerAddressByClientCIDR serverAddress1 = new V1ServerAddressByClientCIDR().clientCIDR("10.0.0.0/8").serverAddress("192.168.0.1:8080");
        V1ServerAddressByClientCIDR serverAddress2 = new V1ServerAddressByClientCIDR().clientCIDR("10.0.0.0/8").serverAddress("192.168.0.1:8080");
        assertThat(serverAddress1.hashCode(), is(equalTo(serverAddress2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: A2DC5E6E4A5ABDAB3F5FA02E3DEB1F6C
    @Test
    void testToString() {
        V1ServerAddressByClientCIDR serverAddress = new V1ServerAddressByClientCIDR().clientCIDR("10.0.0.0/8").serverAddress("192.168.0.1:8080");
        String expected = "class V1ServerAddressByClientCIDR {\n    clientCIDR: 10.0.0.0/8\n    serverAddress: 192.168.0.1:8080\n}";
        assertThat(serverAddress.toString(), is(equalTo(expected)));
    }

    //BaseRock generated method id: ${testDifferentClientCIDRs}, hash: 0F81DCB87AAB5BA7C513DDB7C87619A9
    @ParameterizedTest
    @ValueSource(strings = { "0.0.0.0/0", "192.168.0.0/16", "10.0.0.0/8", "172.16.0.0/12" })
    void testDifferentClientCIDRs(String cidr) {
        V1ServerAddressByClientCIDR serverAddress = new V1ServerAddressByClientCIDR().clientCIDR(cidr);
        assertThat(serverAddress.getClientCIDR(), is(equalTo(cidr)));
    }

    //BaseRock generated method id: ${testDifferentServerAddresses}, hash: 564BBEE15566D53BF245898A65B5CEA6
    @ParameterizedTest
    @ValueSource(strings = { "192.168.0.1:80", "10.0.0.1:443", "172.16.0.1:8080", "example.com:8443" })
    void testDifferentServerAddresses(String address) {
        V1ServerAddressByClientCIDR serverAddress = new V1ServerAddressByClientCIDR().serverAddress(address);
        assertThat(serverAddress.getServerAddress(), is(equalTo(address)));
    }

    //BaseRock generated method id: ${testNullClientCIDR}, hash: 7468FDA7C73B0437015556403FDDAA8D
    @Test
    void testNullClientCIDR() {
        V1ServerAddressByClientCIDR serverAddress = new V1ServerAddressByClientCIDR();
        assertDoesNotThrow(() -> serverAddress.clientCIDR(null));
    }

    //BaseRock generated method id: ${testNullServerAddress}, hash: C255774F5C5F4CFD6D7F70F683D3A349
    @Test
    void testNullServerAddress() {
        V1ServerAddressByClientCIDR serverAddress = new V1ServerAddressByClientCIDR();
        assertDoesNotThrow(() -> serverAddress.serverAddress(null));
    }
}
