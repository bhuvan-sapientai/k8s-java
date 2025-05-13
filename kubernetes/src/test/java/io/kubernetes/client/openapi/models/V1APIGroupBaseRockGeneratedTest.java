package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.V1APIGroup;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1APIGroupBaseRockGeneratedTest {

    private V1APIGroup v1APIGroup;

    @BeforeEach
    void setUp() {
        v1APIGroup = new V1APIGroup();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: E320BDB418CBC8C1F87259E10F6E0896
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1APIGroup.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1APIGroup.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 8A5E5D6A98EE49DB8FD10A8AC56186FD
    @Test
    void testKind() {
        String kind = "APIGroup";
        v1APIGroup.setKind(kind);
        assertEquals(kind, v1APIGroup.getKind());
    }

    //BaseRock generated method id: ${testName}, hash: 2C0D0FB687D7C64568C84E2031C01728
    @Test
    void testName() {
        String name = "test-group";
        v1APIGroup.setName(name);
        assertEquals(name, v1APIGroup.getName());
    }

    //BaseRock generated method id: ${testPreferredVersion}, hash: E81B3EFCC8D68986E20874BA7142D48D
    @Test
    void testPreferredVersion() {
        V1GroupVersionForDiscovery preferredVersion = mock(V1GroupVersionForDiscovery.class);
        v1APIGroup.setPreferredVersion(preferredVersion);
        assertEquals(preferredVersion, v1APIGroup.getPreferredVersion());
    }

    //BaseRock generated method id: ${testServerAddressByClientCIDRs}, hash: 363CFB5AA73D2C6C1BD83C99F35B3526
    @Test
    void testServerAddressByClientCIDRs() {
        List<V1ServerAddressByClientCIDR> serverAddressList = new ArrayList<>();
        V1ServerAddressByClientCIDR serverAddress1 = mock(V1ServerAddressByClientCIDR.class);
        V1ServerAddressByClientCIDR serverAddress2 = mock(V1ServerAddressByClientCIDR.class);
        serverAddressList.add(serverAddress1);
        serverAddressList.add(serverAddress2);
        v1APIGroup.setServerAddressByClientCIDRs(serverAddressList);
        assertThat(v1APIGroup.getServerAddressByClientCIDRs(), hasSize(2));
        assertThat(v1APIGroup.getServerAddressByClientCIDRs(), containsInAnyOrder(serverAddress1, serverAddress2));
    }

    //BaseRock generated method id: ${testVersions}, hash: D5BB315103557EE204DCE415326E849F
    @Test
    void testVersions() {
        List<V1GroupVersionForDiscovery> versionsList = new ArrayList<>();
        V1GroupVersionForDiscovery version1 = mock(V1GroupVersionForDiscovery.class);
        V1GroupVersionForDiscovery version2 = mock(V1GroupVersionForDiscovery.class);
        versionsList.add(version1);
        versionsList.add(version2);
        v1APIGroup.setVersions(versionsList);
        assertThat(v1APIGroup.getVersions(), hasSize(2));
        assertThat(v1APIGroup.getVersions(), containsInAnyOrder(version1, version2));
    }

    //BaseRock generated method id: ${testEquals}, hash: AB850585F42A980A378F7D00AE626ECA
    @Test
    void testEquals() {
        V1APIGroup group1 = new V1APIGroup().apiVersion("v1").kind("APIGroup").name("test-group");
        V1APIGroup group2 = new V1APIGroup().apiVersion("v1").kind("APIGroup").name("test-group");
        assertThat(group1, is(equalTo(group2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: D220DC63872AD7CA0E75E758ADF15143
    @Test
    void testHashCode() {
        V1APIGroup group1 = new V1APIGroup().apiVersion("v1").kind("APIGroup").name("test-group");
        V1APIGroup group2 = new V1APIGroup().apiVersion("v1").kind("APIGroup").name("test-group");
        assertThat(group1.hashCode(), is(equalTo(group2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: B36F3B11A8732569A4C9D0B1EAAB76A5
    @Test
    void testToString() {
        V1APIGroup group = new V1APIGroup().apiVersion("v1").kind("APIGroup").name("test-group");
        String expectedString = "class V1APIGroup {\n" + "    apiVersion: v1\n" + "    kind: APIGroup\n" + "    name: test-group\n" + "    preferredVersion: null\n" + "    serverAddressByClientCIDRs: []\n" + "    versions: []\n" + "}";
        assertThat(group.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 677026A16A6ACA3C01905235C7735ECE
    @Test
    void testBuilder() {
        V1GroupVersionForDiscovery preferredVersion = mock(V1GroupVersionForDiscovery.class);
        List<V1ServerAddressByClientCIDR> serverAddressList = new ArrayList<>();
        List<V1GroupVersionForDiscovery> versionsList = new ArrayList<>();
        V1APIGroup group = new V1APIGroup().apiVersion("v1").kind("APIGroup").name("test-group").preferredVersion(preferredVersion).serverAddressByClientCIDRs(serverAddressList).versions(versionsList);
        assertThat(group, is(notNullValue()));
        assertThat(group.getApiVersion(), is(equalTo("v1")));
        assertThat(group.getKind(), is(equalTo("APIGroup")));
        assertThat(group.getName(), is(equalTo("test-group")));
        assertThat(group.getPreferredVersion(), is(equalTo(preferredVersion)));
        assertThat(group.getServerAddressByClientCIDRs(), is(equalTo(serverAddressList)));
        assertThat(group.getVersions(), is(equalTo(versionsList)));
    }

    //BaseRock generated method id: ${testAddServerAddressByClientCIDRsItem}, hash: E9984C8C9B3D83218035F5304532028E
    @Test
    void testAddServerAddressByClientCIDRsItem() {
        V1ServerAddressByClientCIDR serverAddress = mock(V1ServerAddressByClientCIDR.class);
        v1APIGroup.addServerAddressByClientCIDRsItem(serverAddress);
        assertNotNull(v1APIGroup.getServerAddressByClientCIDRs());
        assertThat(v1APIGroup.getServerAddressByClientCIDRs(), hasSize(1));
        assertThat(v1APIGroup.getServerAddressByClientCIDRs().get(0), is(equalTo(serverAddress)));
    }

    //BaseRock generated method id: ${testAddVersionsItem}, hash: 842ED7FBC7E4C16FE770F88D17CDB689
    @Test
    void testAddVersionsItem() {
        V1GroupVersionForDiscovery version = mock(V1GroupVersionForDiscovery.class);
        v1APIGroup.addVersionsItem(version);
        assertNotNull(v1APIGroup.getVersions());
        assertThat(v1APIGroup.getVersions(), hasSize(1));
        assertThat(v1APIGroup.getVersions().get(0), is(equalTo(version)));
    }
}
