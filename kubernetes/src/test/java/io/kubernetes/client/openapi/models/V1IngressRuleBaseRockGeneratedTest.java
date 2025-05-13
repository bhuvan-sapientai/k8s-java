package io.kubernetes.client.openapi.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import io.kubernetes.client.openapi.models.V1IngressRule;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1IngressRuleBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1IngressRuleConstructor}, hash: 35F0E66D8A2C04DC4194FDC7F911AE11
    @Test
    void testV1IngressRuleConstructor() {
        V1IngressRule ingressRule = new V1IngressRule();
        assertNotNull(ingressRule);
    }

    //BaseRock generated method id: ${testSetAndGetHost}, hash: E6E7ADEEA7C940719FFFC8D2E9066959
    @ParameterizedTest
    @ValueSource(strings = { "example.com", "test.org", "subdomain.example.com" })
    void testSetAndGetHost(String host) {
        V1IngressRule ingressRule = new V1IngressRule();
        ingressRule.setHost(host);
        assertEquals(host, ingressRule.getHost());
    }

    //BaseRock generated method id: ${testSetAndGetHostWithNullAndEmpty}, hash: 49504B24824F10C3C7174378E2751D59
    @ParameterizedTest
    @NullAndEmptySource
    void testSetAndGetHostWithNullAndEmpty(String host) {
        V1IngressRule ingressRule = new V1IngressRule();
        ingressRule.setHost(host);
        assertEquals(host, ingressRule.getHost());
    }

    //BaseRock generated method id: ${testSetAndGetHttp}, hash: 1D281D67B65DFBC03E2EA6A8A442CA1A
    @Test
    void testSetAndGetHttp() {
        V1IngressRule ingressRule = new V1IngressRule();
        V1HTTPIngressRuleValue httpIngressRuleValue = mock(V1HTTPIngressRuleValue.class);
        ingressRule.setHttp(httpIngressRuleValue);
        assertEquals(httpIngressRuleValue, ingressRule.getHttp());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: BE1056ADE8130FE7B986AA640BA7A0B0
    @Test
    void testEqualsAndHashCode() {
        V1IngressRule rule1 = new V1IngressRule().host("example.com");
        V1IngressRule rule2 = new V1IngressRule().host("example.com");
        V1IngressRule rule3 = new V1IngressRule().host("different.com");
        assertThat(rule1, is(equalTo(rule2)));
        assertThat(rule1.hashCode(), is(equalTo(rule2.hashCode())));
        assertThat(rule1, is(notNullValue()));
        assertThat(rule1.equals(rule3), is(false));
    }

    //BaseRock generated method id: ${testToString}, hash: 423EFEDAEE16E450380BC86865403A53
    @Test
    void testToString() {
        V1IngressRule ingressRule = new V1IngressRule().host("example.com").http(mock(V1HTTPIngressRuleValue.class));
        String toString = ingressRule.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("host"), is(true));
        assertThat(toString.contains("http"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 199DBAEDC5E4FD1FC1F91883208D93F6
    @Test
    void testBuilder() {
        String host = "example.com";
        V1HTTPIngressRuleValue http = mock(V1HTTPIngressRuleValue.class);
        V1IngressRule ingressRule = new V1IngressRule().host(host).http(http);
        assertEquals(host, ingressRule.getHost());
        assertEquals(http, ingressRule.getHttp());
    }
}
