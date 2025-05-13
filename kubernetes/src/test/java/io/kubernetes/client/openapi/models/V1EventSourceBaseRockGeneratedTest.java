package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1EventSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1EventSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 4E93B6CB75945388AC9512914E44E5B1
    @Test
    void testConstructor() {
        V1EventSource eventSource = new V1EventSource();
        assertNotNull(eventSource);
    }

    //BaseRock generated method id: ${testComponentGetter}, hash: A0C9A00F7849275F3B4548AD175FAAB5
    @Test
    void testComponentGetter() {
        V1EventSource eventSource = new V1EventSource();
        assertThat(eventSource.getComponent(), is(nullValue()));
    }

    //BaseRock generated method id: ${testComponentSetter}, hash: 7669FE8BEEC892408B9E20D7D3A0FF39
    @Test
    void testComponentSetter() {
        V1EventSource eventSource = new V1EventSource();
        String component = "testComponent";
        eventSource.setComponent(component);
        assertEquals(component, eventSource.getComponent());
    }

    //BaseRock generated method id: ${testHostGetter}, hash: A39B2D3F86C9B26FD246E827B7A6D4A8
    @Test
    void testHostGetter() {
        V1EventSource eventSource = new V1EventSource();
        assertThat(eventSource.getHost(), is(nullValue()));
    }

    //BaseRock generated method id: ${testHostSetter}, hash: 3727A02D072992597BFB2D124E67E7EF
    @Test
    void testHostSetter() {
        V1EventSource eventSource = new V1EventSource();
        String host = "testHost";
        eventSource.setHost(host);
        assertEquals(host, eventSource.getHost());
    }

    //BaseRock generated method id: ${testComponentFluentSetter}, hash: 23038B13BFEC1AE644A48D92076039CD
    @Test
    void testComponentFluentSetter() {
        V1EventSource eventSource = new V1EventSource();
        String component = "testComponent";
        V1EventSource result = eventSource.component(component);
        assertEquals(component, result.getComponent());
        assertEquals(eventSource, result);
    }

    //BaseRock generated method id: ${testHostFluentSetter}, hash: 2E62ADF11584770B99ADC66658750142
    @Test
    void testHostFluentSetter() {
        V1EventSource eventSource = new V1EventSource();
        String host = "testHost";
        V1EventSource result = eventSource.host(host);
        assertEquals(host, result.getHost());
        assertEquals(eventSource, result);
    }

    //BaseRock generated method id: ${testEquals}, hash: 277C6ED2650C30392F90F66B1FBCD161
    @Test
    void testEquals() {
        V1EventSource eventSource1 = new V1EventSource().component("comp1").host("host1");
        V1EventSource eventSource2 = new V1EventSource().component("comp1").host("host1");
        V1EventSource eventSource3 = new V1EventSource().component("comp2").host("host2");
        assertEquals(eventSource1, eventSource2);
        assertThat(eventSource1.equals(eventSource3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: C01571377CDD67D9FC4B9663EC7867F5
    @Test
    void testHashCode() {
        V1EventSource eventSource1 = new V1EventSource().component("comp1").host("host1");
        V1EventSource eventSource2 = new V1EventSource().component("comp1").host("host1");
        assertEquals(eventSource1.hashCode(), eventSource2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 4F88D9D96C2D164DDE1FCA3A596AA120
    @Test
    void testToString() {
        V1EventSource eventSource = new V1EventSource().component("testComponent").host("testHost");
        String expected = "class V1EventSource {\n    component: testComponent\n    host: testHost\n}";
        assertEquals(expected, eventSource.toString());
    }
}
