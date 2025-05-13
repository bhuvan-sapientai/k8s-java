package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1HostAlias;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1HostAliasBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1HostAliasConstructor}, hash: E0D7F17323045EEA25CF99BC1296A327
    @Test
    void testV1HostAliasConstructor() {
        V1HostAlias hostAlias = new V1HostAlias();
        assertNotNull(hostAlias);
    }

    //BaseRock generated method id: ${testHostnames}, hash: 27D3829DD214E3CF32E61B35B74AF4EE
    @Test
    void testHostnames() {
        V1HostAlias hostAlias = new V1HostAlias();
        List<String> hostnames = Arrays.asList("host1.example.com", "host2.example.com");
        hostAlias.setHostnames(hostnames);
        assertEquals(hostnames, hostAlias.getHostnames());
    }

    //BaseRock generated method id: ${testAddHostnamesItem}, hash: 2BC0DAE3443CF10CEB4B4B238B1A168D
    @Test
    void testAddHostnamesItem() {
        V1HostAlias hostAlias = new V1HostAlias();
        String hostname = "host.example.com";
        hostAlias.addHostnamesItem(hostname);
        assertThat(hostAlias.getHostnames(), hasSize(1));
        assertThat(hostAlias.getHostnames().get(0), is(equalTo(hostname)));
    }

    //BaseRock generated method id: ${testAddHostnamesItemToExistingList}, hash: 82ECBBB727BE8E3EDF73F29564F898C8
    @Test
    void testAddHostnamesItemToExistingList() {
        V1HostAlias hostAlias = new V1HostAlias();
        List<String> initialHostnames = new ArrayList<>(Arrays.asList("host1.example.com", "host2.example.com"));
        hostAlias.setHostnames(initialHostnames);
        String newHostname = "host3.example.com";
        hostAlias.addHostnamesItem(newHostname);
        assertThat(hostAlias.getHostnames(), hasSize(3));
        assertThat(hostAlias.getHostnames(), containsInAnyOrder("host1.example.com", "host2.example.com", "host3.example.com"));
    }

    //BaseRock generated method id: ${testSetAndGetIp}, hash: 0F1D89D0AB36259F5A9A734922EE6FDA
    @Test
    void testSetAndGetIp() {
        V1HostAlias hostAlias = new V1HostAlias();
        String ip = "192.168.1.1";
        hostAlias.setIp(ip);
        assertEquals(ip, hostAlias.getIp());
    }

    //BaseRock generated method id: ${testSetAndGetIpWithDifferentValues}, hash: 7D9DF38F17F3F925E2D41A297F6CD7CF
    @ParameterizedTest
    @ValueSource(strings = { "192.168.1.1", "10.0.0.1", "172.16.0.1" })
    void testSetAndGetIpWithDifferentValues(String ip) {
        V1HostAlias hostAlias = new V1HostAlias();
        hostAlias.setIp(ip);
        assertEquals(ip, hostAlias.getIp());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: CC7B85B07DBEF97D7BEC0619D6254E7C
    @Test
    void testEqualsAndHashCode() {
        V1HostAlias hostAlias1 = new V1HostAlias().hostnames(Arrays.asList("host1.example.com", "host2.example.com")).ip("192.168.1.1");
        V1HostAlias hostAlias2 = new V1HostAlias().hostnames(Arrays.asList("host1.example.com", "host2.example.com")).ip("192.168.1.1");
        V1HostAlias hostAlias3 = new V1HostAlias().hostnames(Arrays.asList("host3.example.com")).ip("10.0.0.1");
        assertThat(hostAlias1, is(equalTo(hostAlias2)));
        assertThat(hostAlias1.hashCode(), is(equalTo(hostAlias2.hashCode())));
        assertThat(hostAlias1, is(notNullValue()));
        assertThat(hostAlias1.equals(hostAlias3), is(false));
    }

    //BaseRock generated method id: ${testToString}, hash: 050E1C68A0F02488D2E3B2C578CC0B47
    @Test
    void testToString() {
        V1HostAlias hostAlias = new V1HostAlias().hostnames(Arrays.asList("host1.example.com", "host2.example.com")).ip("192.168.1.1");
        String expectedToString = "class V1HostAlias {\n    hostnames: [host1.example.com, host2.example.com]\n    ip: 192.168.1.1\n}";
        assertEquals(expectedToString, hostAlias.toString());
    }

    //BaseRock generated method id: ${testSetNullHostnames}, hash: 0163AA4295548AE45691B8D476834C3F
    @Disabled()
    @Test
    void testSetNullHostnames() {
        V1HostAlias hostAlias = new V1HostAlias();
        hostAlias.setHostnames(null);
        assertThat(hostAlias.getHostnames(), is(notNullValue()));
        assertThat(hostAlias.getHostnames(), hasSize(0));
    }

    //BaseRock generated method id: ${testSetNullIp}, hash: 20024FCCA096C153ED50FE4AD8402BA7
    @Test
    void testSetNullIp() {
        V1HostAlias hostAlias = new V1HostAlias();
        hostAlias.setIp(null);
        assertThat(hostAlias.getIp(), is(equalTo(null)));
    }
}
