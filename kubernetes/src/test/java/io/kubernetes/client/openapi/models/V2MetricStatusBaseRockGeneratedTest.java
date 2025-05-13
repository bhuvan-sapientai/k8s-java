package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V2ResourceMetricStatus;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import io.kubernetes.client.openapi.models.V2ExternalMetricStatus;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatus;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V2ObjectMetricStatus;
import io.kubernetes.client.openapi.models.V2PodsMetricStatus;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V2MetricStatusBaseRockGeneratedTest {

    private V2MetricStatus v2MetricStatus;

    @BeforeEach
    void setUp() {
        v2MetricStatus = new V2MetricStatus();
    }

    //BaseRock generated method id: ${testContainerResource}, hash: 76255A9DA9620005BC1E0328176534C2
    @Test
    void testContainerResource() {
        V2ContainerResourceMetricStatus containerResource = mock(V2ContainerResourceMetricStatus.class);
        v2MetricStatus.setContainerResource(containerResource);
        assertEquals(containerResource, v2MetricStatus.getContainerResource());
    }

    //BaseRock generated method id: ${testExternal}, hash: 193691D1DCE6547125B8F78F5A7BB106
    @Test
    void testExternal() {
        V2ExternalMetricStatus external = mock(V2ExternalMetricStatus.class);
        v2MetricStatus.setExternal(external);
        assertEquals(external, v2MetricStatus.getExternal());
    }

    //BaseRock generated method id: ${testObject}, hash: B0CA21AB9A18A69C9371A763EDD9B374
    @Test
    void testObject() {
        V2ObjectMetricStatus object = mock(V2ObjectMetricStatus.class);
        v2MetricStatus.setObject(object);
        assertEquals(object, v2MetricStatus.getObject());
    }

    //BaseRock generated method id: ${testPods}, hash: 0A53E5DF795FC8D8C79ED30C251D251B
    @Test
    void testPods() {
        V2PodsMetricStatus pods = mock(V2PodsMetricStatus.class);
        v2MetricStatus.setPods(pods);
        assertEquals(pods, v2MetricStatus.getPods());
    }

    //BaseRock generated method id: ${testResource}, hash: 522AA367569242141F729ED915968F73
    @Test
    void testResource() {
        V2ResourceMetricStatus resource = mock(V2ResourceMetricStatus.class);
        v2MetricStatus.setResource(resource);
        assertEquals(resource, v2MetricStatus.getResource());
    }

    //BaseRock generated method id: ${testType}, hash: 74E704DC6890F8A90504ADFD021449FD
    @Test
    void testType() {
        String type = "TestType";
        v2MetricStatus.setType(type);
        assertEquals(type, v2MetricStatus.getType());
    }

    //BaseRock generated method id: ${testEquals}, hash: 2894848F823EB0A8CE3AF5B24BE56FEA
    @Test
    void testEquals() {
        V2ContainerResourceMetricStatus containerResource = mock(V2ContainerResourceMetricStatus.class);
        V2ExternalMetricStatus external = mock(V2ExternalMetricStatus.class);
        V2ObjectMetricStatus object = mock(V2ObjectMetricStatus.class);
        V2PodsMetricStatus pods = mock(V2PodsMetricStatus.class);
        V2ResourceMetricStatus resource = mock(V2ResourceMetricStatus.class);
        String type = "TestType";
        V2MetricStatus status1 = new V2MetricStatus().containerResource(containerResource).external(external)._object(object).pods(pods).resource(resource).type(type);
        V2MetricStatus status2 = new V2MetricStatus().containerResource(containerResource).external(external)._object(object).pods(pods).resource(resource).type(type);
        assertThat(status1, is(equalTo(status2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 50EB99428F1C98549DCB1B647F7F0EFB
    @Test
    void testHashCode() {
        V2MetricStatus status = new V2MetricStatus().containerResource(mock(V2ContainerResourceMetricStatus.class)).external(mock(V2ExternalMetricStatus.class))._object(mock(V2ObjectMetricStatus.class)).pods(mock(V2PodsMetricStatus.class)).resource(mock(V2ResourceMetricStatus.class)).type("TestType");
        assertThat(status.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 394EAFAE37D29A897BDEEB927F198952
    @Test
    void testToString() {
        V2MetricStatus status = new V2MetricStatus().containerResource(mock(V2ContainerResourceMetricStatus.class)).external(mock(V2ExternalMetricStatus.class))._object(mock(V2ObjectMetricStatus.class)).pods(mock(V2PodsMetricStatus.class)).resource(mock(V2ResourceMetricStatus.class)).type("TestType");
        String result = status.toString();
        assertNotNull(result);
        assertThat(result.contains("containerResource"), is(true));
        assertThat(result.contains("external"), is(true));
        assertThat(result.contains("_object"), is(true));
        assertThat(result.contains("pods"), is(true));
        assertThat(result.contains("resource"), is(true));
        assertThat(result.contains("type"), is(true));
    }
}
