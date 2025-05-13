package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1IngressRule;
import io.kubernetes.client.openapi.models.V1IngressTLS;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.V1IngressBackend;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1IngressSpecBaseRockGeneratedTest {

    private V1IngressSpec v1IngressSpec;

    @BeforeEach
    void setUp() {
        v1IngressSpec = new V1IngressSpec();
    }

    //BaseRock generated method id: ${testDefaultBackend}, hash: CCAADFB149921DECCBEA4CE91F21F8AC
    @Test
    void testDefaultBackend() {
        V1IngressBackend mockBackend = mock(V1IngressBackend.class);
        v1IngressSpec.setDefaultBackend(mockBackend);
        assertEquals(mockBackend, v1IngressSpec.getDefaultBackend());
    }

    //BaseRock generated method id: ${testIngressClassName}, hash: B4C6F7880C5475C24B612978A137CA3B
    @Test
    void testIngressClassName() {
        String className = "test-class";
        v1IngressSpec.setIngressClassName(className);
        assertEquals(className, v1IngressSpec.getIngressClassName());
    }

    //BaseRock generated method id: ${testRules}, hash: 5B4B08E2D9B0950D51FA8CCC7CE61F73
    @Test
    void testRules() {
        List<V1IngressRule> rules = new ArrayList<>();
        V1IngressRule rule1 = mock(V1IngressRule.class);
        V1IngressRule rule2 = mock(V1IngressRule.class);
        rules.add(rule1);
        rules.add(rule2);
        v1IngressSpec.setRules(rules);
        assertEquals(rules, v1IngressSpec.getRules());
        assertThat(v1IngressSpec.getRules(), hasSize(2));
        assertThat(v1IngressSpec.getRules(), containsInAnyOrder(rule1, rule2));
    }

    //BaseRock generated method id: ${testAddRulesItem}, hash: 59B93B472225E4221C31913130CB5E9D
    @Test
    void testAddRulesItem() {
        V1IngressRule rule = mock(V1IngressRule.class);
        v1IngressSpec.addRulesItem(rule);
        assertThat(v1IngressSpec.getRules(), hasSize(1));
        assertThat(v1IngressSpec.getRules().get(0), is(rule));
    }

    //BaseRock generated method id: ${testTls}, hash: 2C059B263F1AC97C2205E45883B1D2FF
    @Test
    void testTls() {
        List<V1IngressTLS> tls = new ArrayList<>();
        V1IngressTLS tls1 = mock(V1IngressTLS.class);
        V1IngressTLS tls2 = mock(V1IngressTLS.class);
        tls.add(tls1);
        tls.add(tls2);
        v1IngressSpec.setTls(tls);
        assertEquals(tls, v1IngressSpec.getTls());
        assertThat(v1IngressSpec.getTls(), hasSize(2));
        assertThat(v1IngressSpec.getTls(), containsInAnyOrder(tls1, tls2));
    }

    //BaseRock generated method id: ${testAddTlsItem}, hash: CCAF1131BC2A911BDE0222FFFE2EC568
    @Test
    void testAddTlsItem() {
        V1IngressTLS tls = mock(V1IngressTLS.class);
        v1IngressSpec.addTlsItem(tls);
        assertThat(v1IngressSpec.getTls(), hasSize(1));
        assertThat(v1IngressSpec.getTls().get(0), is(tls));
    }

    //BaseRock generated method id: ${testEquals}, hash: B949FE1C1A2F866D7D3F49E5CAD79BF4
    @Test
    void testEquals() {
        V1IngressSpec spec1 = new V1IngressSpec();
        V1IngressSpec spec2 = new V1IngressSpec();
        V1IngressBackend backend = mock(V1IngressBackend.class);
        spec1.setDefaultBackend(backend);
        spec2.setDefaultBackend(backend);
        spec1.setIngressClassName("test-class");
        spec2.setIngressClassName("test-class");
        List<V1IngressRule> rules = Arrays.asList(mock(V1IngressRule.class), mock(V1IngressRule.class));
        spec1.setRules(rules);
        spec2.setRules(rules);
        List<V1IngressTLS> tls = Arrays.asList(mock(V1IngressTLS.class), mock(V1IngressTLS.class));
        spec1.setTls(tls);
        spec2.setTls(tls);
        assertThat(spec1, is(equalTo(spec2)));
        assertThat(spec1.hashCode(), is(equalTo(spec2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: CC8354FA14DFCD3C80E9E3099F07BE67
    @Test
    void testToString() {
        V1IngressBackend backend = mock(V1IngressBackend.class);
        when(backend.toString()).thenReturn("MockBackend");
        v1IngressSpec.setDefaultBackend(backend);
        v1IngressSpec.setIngressClassName("test-class");
        V1IngressRule rule = mock(V1IngressRule.class);
        when(rule.toString()).thenReturn("MockRule");
        v1IngressSpec.addRulesItem(rule);
        V1IngressTLS tls = mock(V1IngressTLS.class);
        when(tls.toString()).thenReturn("MockTLS");
        v1IngressSpec.addTlsItem(tls);
        String result = v1IngressSpec.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("defaultBackend"), is(true));
        assertThat(result.contains("MockBackend"), is(true));
        assertThat(result.contains("ingressClassName"), is(true));
        assertThat(result.contains("test-class"), is(true));
        assertThat(result.contains("rules"), is(true));
        assertThat(result.contains("MockRule"), is(true));
        assertThat(result.contains("tls"), is(true));
        assertThat(result.contains("MockTLS"), is(true));
    }

    //BaseRock generated method id: ${testConstructor}, hash: 2ECCB27664E70A114B3F514B93854537
    @Test
    void testConstructor() {
        assertNotNull(new V1IngressSpec());
    }

    //BaseRock generated method id: ${testNullValues}, hash: BE31DBFFD6A5332954B76A77D2DA8A7D
    @Test
    void testNullValues() {
        assertThat(v1IngressSpec.getDefaultBackend(), is(nullValue()));
        assertThat(v1IngressSpec.getIngressClassName(), is(nullValue()));
        assertThat(v1IngressSpec.getRules(), is(notNullValue()));
        assertThat(v1IngressSpec.getRules(), hasSize(0));
        assertThat(v1IngressSpec.getTls(), is(notNullValue()));
        assertThat(v1IngressSpec.getTls(), hasSize(0));
    }
}
