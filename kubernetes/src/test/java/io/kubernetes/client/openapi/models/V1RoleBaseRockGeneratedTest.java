package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.V1PolicyRule;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1RoleBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1RoleConstructor}, hash: 3D07AD7B6983D8517990587CB3CDADFE
    @Test
    void testV1RoleConstructor() {
        V1Role v1Role = new V1Role();
        assertThat(v1Role, is(notNullValue()));
    }

    //BaseRock generated method id: ${testApiVersion}, hash: BB53B308EF9E465F79E57DC4FA5EA6C4
    @Test
    void testApiVersion() {
        V1Role v1Role = new V1Role();
        String apiVersion = "v1";
        v1Role.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1Role.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 7ECD32BE987E8E7534669EE4BA806FFF
    @Test
    void testKind() {
        V1Role v1Role = new V1Role();
        String kind = "Role";
        v1Role.setKind(kind);
        assertEquals(kind, v1Role.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: D05039816C1BC0BE2194B18C3D17622E
    @Test
    void testMetadata() {
        V1Role v1Role = new V1Role();
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1Role.setMetadata(metadata);
        assertThat(v1Role.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testRules}, hash: 1A992672A0A24ED592CDFE3B9437D542
    @Test
    void testRules() {
        V1Role v1Role = new V1Role();
        List<V1PolicyRule> rules = new ArrayList<>();
        V1PolicyRule rule = mock(V1PolicyRule.class);
        rules.add(rule);
        v1Role.setRules(rules);
        assertThat(v1Role.getRules(), is(equalTo(rules)));
    }

    //BaseRock generated method id: ${testAddRulesItem}, hash: 0F2BE03E4DD37D967F26AEABC7B21C79
    @Test
    void testAddRulesItem() {
        V1Role v1Role = new V1Role();
        V1PolicyRule rule = mock(V1PolicyRule.class);
        v1Role.addRulesItem(rule);
        assertThat(v1Role.getRules(), hasSize(1));
        assertThat(v1Role.getRules().get(0), is(equalTo(rule)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 6C7B95E29F477EAA68FBA0F929220B25
    @Test
    void testEquals() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        List<V1PolicyRule> rules = new ArrayList<>();
        V1Role v1Role1 = new V1Role().apiVersion("v1").kind("Role").metadata(metadata).rules(rules);
        V1Role v1Role2 = new V1Role().apiVersion("v1").kind("Role").metadata(metadata).rules(rules);
        assertThat(v1Role1.equals(v1Role2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: C5047E31FABE4E326A2222544020AADB
    @Test
    void testHashCode() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        List<V1PolicyRule> rules = new ArrayList<>();
        V1Role v1Role1 = new V1Role().apiVersion("v1").kind("Role").metadata(metadata).rules(rules);
        V1Role v1Role2 = new V1Role().apiVersion("v1").kind("Role").metadata(metadata).rules(rules);
        assertEquals(v1Role1.hashCode(), v1Role2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 0CD257BE2434C6E79E12C3645C7F2EEA
    @Test
    void testToString() {
        V1Role v1Role = new V1Role().apiVersion("v1").kind("Role").metadata(mock(V1ObjectMeta.class)).rules(new ArrayList<>());
        String toString = v1Role.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("rules"), is(true));
    }

    //BaseRock generated method id: ${testSetNullApiVersion}, hash: 1814F8039F4E2A554A6D097D747D29FC
    @Test
    void testSetNullApiVersion() {
        V1Role v1Role = new V1Role();
        v1Role.setApiVersion(null);
        assertNull(v1Role.getApiVersion());
    }

    //BaseRock generated method id: ${testSetNullKind}, hash: 571BD390BC48A2CD1C78D8E9235A6722
    @Test
    void testSetNullKind() {
        V1Role v1Role = new V1Role();
        v1Role.setKind(null);
        assertNull(v1Role.getKind());
    }

    //BaseRock generated method id: ${testSetNullMetadata}, hash: 7FF85BBA62196D9797C855AE9009E7D5
    @Test
    void testSetNullMetadata() {
        V1Role v1Role = new V1Role();
        v1Role.setMetadata(null);
        assertNull(v1Role.getMetadata());
    }

    //BaseRock generated method id: ${testSetNullRules}, hash: D9CDCB9EE56A1A31055E181EE563189C
    @Test
    void testSetNullRules() {
        V1Role v1Role = new V1Role();
        v1Role.setRules(null);
        assertThat(v1Role.getRules(), is(nullValue()));
    }
}
