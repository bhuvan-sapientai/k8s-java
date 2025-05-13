package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V2ObjectMetricSource;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.openapi.models.V2PodsMetricSource;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V2ContainerResourceMetricSource;
import io.kubernetes.client.openapi.models.V2ExternalMetricSource;
import io.kubernetes.client.openapi.models.V2ResourceMetricSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V2MetricSpecBaseRockGeneratedTest {

    private V2MetricSpec v2MetricSpec;

    @BeforeEach
    void setUp() {
        v2MetricSpec = new V2MetricSpec();
    }

    //BaseRock generated method id: ${testSetAndGetContainerResource}, hash: 3FB0C01BE4FAA14CD4165CDF5D2541D0
    @Test
    void testSetAndGetContainerResource() {
        V2ContainerResourceMetricSource containerResource = mock(V2ContainerResourceMetricSource.class);
        v2MetricSpec.setContainerResource(containerResource);
        assertThat(v2MetricSpec.getContainerResource(), is(equalTo(containerResource)));
    }

    //BaseRock generated method id: ${testSetAndGetExternal}, hash: A0788EF404A2CC111B14918C9EB1F738
    @Test
    void testSetAndGetExternal() {
        V2ExternalMetricSource external = mock(V2ExternalMetricSource.class);
        v2MetricSpec.setExternal(external);
        assertThat(v2MetricSpec.getExternal(), is(equalTo(external)));
    }

    //BaseRock generated method id: ${testSetAndGetObject}, hash: 2F2D40706F721BCFCEBEECF3BDBF26F0
    @Test
    void testSetAndGetObject() {
        V2ObjectMetricSource object = mock(V2ObjectMetricSource.class);
        v2MetricSpec.setObject(object);
        assertThat(v2MetricSpec.getObject(), is(equalTo(object)));
    }

    //BaseRock generated method id: ${testSetAndGetPods}, hash: 08AAE5C2F839CEE6A38F55DC40ECE9C2
    @Test
    void testSetAndGetPods() {
        V2PodsMetricSource pods = mock(V2PodsMetricSource.class);
        v2MetricSpec.setPods(pods);
        assertThat(v2MetricSpec.getPods(), is(equalTo(pods)));
    }

    //BaseRock generated method id: ${testSetAndGetResource}, hash: CBA2FD66FB74D1F69EA54FB14F7544E6
    @Test
    void testSetAndGetResource() {
        V2ResourceMetricSource resource = mock(V2ResourceMetricSource.class);
        v2MetricSpec.setResource(resource);
        assertThat(v2MetricSpec.getResource(), is(equalTo(resource)));
    }

    //BaseRock generated method id: ${testSetAndGetType}, hash: 4BE21DB45DB5F566198490907A6B3948
    @Test
    void testSetAndGetType() {
        String type = "test-type";
        v2MetricSpec.setType(type);
        assertThat(v2MetricSpec.getType(), is(equalTo(type)));
    }

    //BaseRock generated method id: ${testEquals}, hash: B8286A1722D0E8E55D6B9813FC4686EB
    @Test
    void testEquals() {
        V2MetricSpec spec1 = new V2MetricSpec().containerResource(mock(V2ContainerResourceMetricSource.class)).external(mock(V2ExternalMetricSource.class))._object(mock(V2ObjectMetricSource.class)).pods(mock(V2PodsMetricSource.class)).resource(mock(V2ResourceMetricSource.class)).type("test-type");
        V2MetricSpec spec2 = new V2MetricSpec().containerResource(spec1.getContainerResource()).external(spec1.getExternal())._object(spec1.getObject()).pods(spec1.getPods()).resource(spec1.getResource()).type(spec1.getType());
        assertThat(spec1.equals(spec2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: D4BC63FAEEBD4BD580F31C3BC90E9BD4
    @Test
    void testHashCode() {
        V2MetricSpec spec1 = new V2MetricSpec().containerResource(mock(V2ContainerResourceMetricSource.class)).external(mock(V2ExternalMetricSource.class))._object(mock(V2ObjectMetricSource.class)).pods(mock(V2PodsMetricSource.class)).resource(mock(V2ResourceMetricSource.class)).type("test-type");
        V2MetricSpec spec2 = new V2MetricSpec().containerResource(spec1.getContainerResource()).external(spec1.getExternal())._object(spec1.getObject()).pods(spec1.getPods()).resource(spec1.getResource()).type(spec1.getType());
        assertThat(spec1.hashCode(), is(equalTo(spec2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 6A78122B41EC16AEC09C17BDFD33C971
    @Test
    void testToString() {
        V2MetricSpec spec = new V2MetricSpec().containerResource(mock(V2ContainerResourceMetricSource.class)).external(mock(V2ExternalMetricSource.class))._object(mock(V2ObjectMetricSource.class)).pods(mock(V2PodsMetricSource.class)).resource(mock(V2ResourceMetricSource.class)).type("test-type");
        String result = spec.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("containerResource"), is(true));
        assertThat(result.contains("external"), is(true));
        assertThat(result.contains("_object"), is(true));
        assertThat(result.contains("pods"), is(true));
        assertThat(result.contains("resource"), is(true));
        assertThat(result.contains("type"), is(true));
    }

    //BaseRock generated method id: ${testNullType}, hash: A030F930771F248CA95CBB263CF45148
    @Disabled()
    @Test
    void testNullType() {
        assertThrows(NullPointerException.class, () -> new V2MetricSpec().type(null));
    }
}
