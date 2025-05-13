package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import io.kubernetes.client.openapi.models.V1IngressTLS;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1IngressTLSBaseRockGeneratedTest {

    //BaseRock generated method id: ${testDefaultConstructor}, hash: 065B056B2B65DA311E97899B17EBB297
    @Test
    void testDefaultConstructor() {
        V1IngressTLS ingressTLS = new V1IngressTLS();
        assertThat(ingressTLS, is(notNullValue()));
        assertThat(ingressTLS.getHosts(), is(notNullValue()));
        assertThat(ingressTLS.getHosts(), hasSize(0));
        assertThat(ingressTLS.getSecretName(), is(nullValue()));
    }

    //BaseRock generated method id: ${testHostsGetter}, hash: FBB21B0A146C6CBA954237F2D1E08108
    @Test
    void testHostsGetter() {
        V1IngressTLS ingressTLS = new V1IngressTLS();
        List<String> hosts = new ArrayList<>(Arrays.asList("host1.example.com", "host2.example.com"));
        ingressTLS.setHosts(hosts);
        assertThat(ingressTLS.getHosts(), is(equalTo(hosts)));
    }

    //BaseRock generated method id: ${testHostsSetter}, hash: 931FF85D0659C99FB6346C271EE0C427
    @Test
    void testHostsSetter() {
        V1IngressTLS ingressTLS = new V1IngressTLS();
        List<String> hosts = new ArrayList<>(Arrays.asList("host1.example.com", "host2.example.com"));
        ingressTLS.setHosts(hosts);
        assertThat(ingressTLS.getHosts(), is(equalTo(hosts)));
    }

    //BaseRock generated method id: ${testSecretNameGetter}, hash: 506141250FA3D7B88E74D0CDDEE92997
    @Test
    void testSecretNameGetter() {
        V1IngressTLS ingressTLS = new V1IngressTLS();
        String secretName = "my-secret";
        ingressTLS.setSecretName(secretName);
        assertThat(ingressTLS.getSecretName(), is(equalTo(secretName)));
    }

    //BaseRock generated method id: ${testSecretNameSetter}, hash: 08DC689FEE4BE1B44EC96280D8BC5CA2
    @Test
    void testSecretNameSetter() {
        V1IngressTLS ingressTLS = new V1IngressTLS();
        String secretName = "my-secret";
        ingressTLS.setSecretName(secretName);
        assertThat(ingressTLS.getSecretName(), is(equalTo(secretName)));
    }

    //BaseRock generated method id: ${testHostsMethod}, hash: A32B0416DDAE197E73697012D8CBBA41
    @Test
    void testHostsMethod() {
        V1IngressTLS ingressTLS = new V1IngressTLS();
        List<String> hosts = new ArrayList<>(Arrays.asList("host1.example.com", "host2.example.com"));
        V1IngressTLS result = ingressTLS.hosts(hosts);
        assertThat(result, is(equalTo(ingressTLS)));
        assertThat(result.getHosts(), is(equalTo(hosts)));
    }

    //BaseRock generated method id: ${testAddHostsItemMethod}, hash: DFEE1094613EC78F39E02AC46F0F95F5
    @Test
    void testAddHostsItemMethod() {
        V1IngressTLS ingressTLS = new V1IngressTLS();
        String host = "host.example.com";
        V1IngressTLS result = ingressTLS.addHostsItem(host);
        assertThat(result, is(equalTo(ingressTLS)));
        assertThat(result.getHosts(), contains(host));
    }

    //BaseRock generated method id: ${testSecretNameMethod}, hash: 91AA104AC34FEFE6296C6135B3C3240D
    @Test
    void testSecretNameMethod() {
        V1IngressTLS ingressTLS = new V1IngressTLS();
        String secretName = "my-secret";
        V1IngressTLS result = ingressTLS.secretName(secretName);
        assertThat(result, is(equalTo(ingressTLS)));
        assertThat(result.getSecretName(), is(equalTo(secretName)));
    }

    //BaseRock generated method id: ${testEqualsMethod}, hash: BD9B0D677BCD9DC70C79C9A75BE1751B
    @Test
    void testEqualsMethod() {
        V1IngressTLS ingressTLS1 = new V1IngressTLS().hosts(Arrays.asList("host1.example.com", "host2.example.com")).secretName("my-secret");
        V1IngressTLS ingressTLS2 = new V1IngressTLS().hosts(Arrays.asList("host1.example.com", "host2.example.com")).secretName("my-secret");
        V1IngressTLS ingressTLS3 = new V1IngressTLS().hosts(Arrays.asList("host3.example.com")).secretName("other-secret");
        assertTrue(ingressTLS1.equals(ingressTLS2));
        assertTrue(ingressTLS2.equals(ingressTLS1));
        assertFalse(ingressTLS1.equals(ingressTLS3));
        assertFalse(ingressTLS1.equals(null));
        assertFalse(ingressTLS1.equals(new Object()));
    }

    //BaseRock generated method id: ${testHashCodeMethod}, hash: 692CA607AE75F04D7650A3876D1CD07D
    @Test
    void testHashCodeMethod() {
        V1IngressTLS ingressTLS1 = new V1IngressTLS().hosts(Arrays.asList("host1.example.com", "host2.example.com")).secretName("my-secret");
        V1IngressTLS ingressTLS2 = new V1IngressTLS().hosts(Arrays.asList("host1.example.com", "host2.example.com")).secretName("my-secret");
        V1IngressTLS ingressTLS3 = new V1IngressTLS().hosts(Arrays.asList("host3.example.com")).secretName("other-secret");
        assertEquals(ingressTLS1.hashCode(), ingressTLS2.hashCode());
        assertFalse(ingressTLS1.hashCode() == ingressTLS3.hashCode());
    }

    //BaseRock generated method id: ${testToStringMethod}, hash: 79BF4F1BB6423A5ACE8E369369D08735
    @Test
    void testToStringMethod() {
        V1IngressTLS ingressTLS = new V1IngressTLS().hosts(Arrays.asList("host1.example.com", "host2.example.com")).secretName("my-secret");
        String result = ingressTLS.toString();
        assertThat(result, is(notNullValue()));
        assertTrue(result.contains("hosts"));
        assertTrue(result.contains("host1.example.com"));
        assertTrue(result.contains("host2.example.com"));
        assertTrue(result.contains("secretName"));
        assertTrue(result.contains("my-secret"));
    }

    //BaseRock generated method id: ${testSecretNameWithDifferentValues}, hash: 11D36AF10999D583F4356234FAC4A209
    @ParameterizedTest
    @ValueSource(strings = { "", "test-secret", "my-long-secret-name-123" })
    void testSecretNameWithDifferentValues(String secretName) {
        V1IngressTLS ingressTLS = new V1IngressTLS().secretName(secretName);
        assertThat(ingressTLS.getSecretName(), is(equalTo(secretName)));
    }

    //BaseRock generated method id: ${testAddMultipleHostsItems}, hash: 832EA8A3EF2CE8DB38C654DFA5FC255C
    @Test
    void testAddMultipleHostsItems() {
        V1IngressTLS ingressTLS = new V1IngressTLS();
        ingressTLS.addHostsItem("host1.example.com").addHostsItem("host2.example.com").addHostsItem("host3.example.com");
        assertThat(ingressTLS.getHosts(), hasSize(3));
        assertThat(ingressTLS.getHosts(), contains("host1.example.com", "host2.example.com", "host3.example.com"));
    }

    //BaseRock generated method id: ${testSetEmptyHosts}, hash: 9E92AEC56BE85EBD460E715180928FD1
    @Test
    void testSetEmptyHosts() {
        V1IngressTLS ingressTLS = new V1IngressTLS();
        ingressTLS.setHosts(new ArrayList<>());
        assertThat(ingressTLS.getHosts(), is(notNullValue()));
        assertThat(ingressTLS.getHosts(), hasSize(0));
    }

    //BaseRock generated method id: ${testSetNullHosts}, hash: 8A157E1E7CA72947AECDB3518E0ED9A5
    @Test
    void testSetNullHosts() {
        V1IngressTLS ingressTLS = new V1IngressTLS();
        ingressTLS.setHosts(null);
        assertThat(ingressTLS.getHosts(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetNullSecretName}, hash: 9A1A420CF83D6DB036A1C79061DF220F
    @Test
    void testSetNullSecretName() {
        V1IngressTLS ingressTLS = new V1IngressTLS();
        ingressTLS.setSecretName(null);
        assertThat(ingressTLS.getSecretName(), is(nullValue()));
    }
}
