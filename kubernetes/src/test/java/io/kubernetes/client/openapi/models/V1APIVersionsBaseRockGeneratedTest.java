package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import io.kubernetes.client.openapi.models.V1APIVersions;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.ArrayList;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1APIVersionsBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1APIVersionsConstructor}, hash: 57B31B0334839477DB24A0C2494DA3AB
    @Test
    void testV1APIVersionsConstructor() {
        V1APIVersions v1APIVersions = new V1APIVersions();
        assertNotNull(v1APIVersions);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 7FAC2217639C3E6795CC7B2B820E610A
    @Test
    void testApiVersion() {
        V1APIVersions v1APIVersions = new V1APIVersions();
        String apiVersion = "v1";
        v1APIVersions.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1APIVersions.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: C36BEEA7F622C8B7396AA4CCD85FBCBF
    @Test
    void testKind() {
        V1APIVersions v1APIVersions = new V1APIVersions();
        String kind = "APIVersions";
        v1APIVersions.setKind(kind);
        assertEquals(kind, v1APIVersions.getKind());
    }

    //BaseRock generated method id: ${testServerAddressByClientCIDRs}, hash: BC59E1CB05AECA645E221D5892D8D5C1
    @Test
    void testServerAddressByClientCIDRs() {
        V1APIVersions v1APIVersions = new V1APIVersions();
        List<V1ServerAddressByClientCIDR> serverAddressList = new ArrayList<>();
        V1ServerAddressByClientCIDR serverAddress = new V1ServerAddressByClientCIDR();
        serverAddress.setClientCIDR("192.168.0.0/16");
        serverAddress.setServerAddress("10.0.0.1");
        serverAddressList.add(serverAddress);
        v1APIVersions.setServerAddressByClientCIDRs(serverAddressList);
        assertThat(v1APIVersions.getServerAddressByClientCIDRs(), hasSize(1));
        assertThat(v1APIVersions.getServerAddressByClientCIDRs().get(0).getClientCIDR(), is("192.168.0.0/16"));
        assertThat(v1APIVersions.getServerAddressByClientCIDRs().get(0).getServerAddress(), is("10.0.0.1"));
    }

    //BaseRock generated method id: ${testVersions}, hash: 8F25880AED886B42757BACB64A49D44D
    @Test
    void testVersions() {
        V1APIVersions v1APIVersions = new V1APIVersions();
        List<String> versions = new ArrayList<>();
        versions.add("v1");
        versions.add("v2");
        v1APIVersions.setVersions(versions);
        assertThat(v1APIVersions.getVersions(), hasSize(2));
        assertThat(v1APIVersions.getVersions().get(0), is("v1"));
        assertThat(v1APIVersions.getVersions().get(1), is("v2"));
    }

    //BaseRock generated method id: ${testEquals}, hash: B0C39DF9F7F7EDE25C8A2C7DA9DCC91E
    @Test
    void testEquals() {
        V1APIVersions v1APIVersions1 = new V1APIVersions().apiVersion("v1").kind("APIVersions").serverAddressByClientCIDRs(new ArrayList<>()).versions(new ArrayList<>());
        V1APIVersions v1APIVersions2 = new V1APIVersions().apiVersion("v1").kind("APIVersions").serverAddressByClientCIDRs(new ArrayList<>()).versions(new ArrayList<>());
        assertThat(v1APIVersions1.equals(v1APIVersions2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 91776C393E957D1E08AB36D2CF463C0E
    @Test
    void testHashCode() {
        V1APIVersions v1APIVersions1 = new V1APIVersions().apiVersion("v1").kind("APIVersions").serverAddressByClientCIDRs(new ArrayList<>()).versions(new ArrayList<>());
        V1APIVersions v1APIVersions2 = new V1APIVersions().apiVersion("v1").kind("APIVersions").serverAddressByClientCIDRs(new ArrayList<>()).versions(new ArrayList<>());
        assertThat(v1APIVersions1.hashCode(), equalTo(v1APIVersions2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 052A009DA3C23860F092385D7B388CB4
    @Test
    void testToString() {
        V1APIVersions v1APIVersions = new V1APIVersions().apiVersion("v1").kind("APIVersions").serverAddressByClientCIDRs(new ArrayList<>()).versions(new ArrayList<>());
        String toString = v1APIVersions.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("serverAddressByClientCIDRs"), is(true));
        assertThat(toString.contains("versions"), is(true));
    }
}
