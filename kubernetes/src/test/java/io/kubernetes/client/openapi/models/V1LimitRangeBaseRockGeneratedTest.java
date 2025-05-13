package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1LimitRangeBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1LimitRangeConstructor}, hash: EBF4AD34610E6CB4225A790617F87AA7
    @Test
    void testV1LimitRangeConstructor() {
        V1LimitRange limitRange = new V1LimitRange();
        assertNotNull(limitRange);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: DA30CC2C021F3CA316AA7F454BF5BDEB
    @Test
    void testApiVersion() {
        V1LimitRange limitRange = new V1LimitRange();
        String apiVersion = "v1";
        limitRange.setApiVersion(apiVersion);
        assertEquals(apiVersion, limitRange.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: EDE527357F1FA30995F82C39B26503F7
    @Test
    void testKind() {
        V1LimitRange limitRange = new V1LimitRange();
        String kind = "LimitRange";
        limitRange.setKind(kind);
        assertEquals(kind, limitRange.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: C6BA8CADBEF48CAD32CAB48992C0EFAB
    @Test
    void testMetadata() {
        V1LimitRange limitRange = new V1LimitRange();
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        limitRange.setMetadata(metadata);
        assertThat(limitRange.getMetadata(), is(metadata));
    }

    //BaseRock generated method id: ${testSpec}, hash: A5F81FC2C82F7DB13F69740CAB92D4B9
    @Test
    void testSpec() {
        V1LimitRange limitRange = new V1LimitRange();
        V1LimitRangeSpec spec = mock(V1LimitRangeSpec.class);
        limitRange.setSpec(spec);
        assertThat(limitRange.getSpec(), is(spec));
    }

    //BaseRock generated method id: ${testEquals}, hash: AA5C934AB759206B9E07E7E81A7D94C9
    @Test
    void testEquals() {
        V1ObjectMeta metadata1 = new V1ObjectMeta();
        V1LimitRangeSpec spec1 = new V1LimitRangeSpec();
        V1ObjectMeta metadata2 = new V1ObjectMeta();
        V1LimitRangeSpec spec2 = new V1LimitRangeSpec();
        V1LimitRange limitRange1 = new V1LimitRange().apiVersion("v1").kind("LimitRange").metadata(metadata1).spec(spec1);
        V1LimitRange limitRange2 = new V1LimitRange().apiVersion("v1").kind("LimitRange").metadata(metadata2).spec(spec2);
        assertThat(limitRange1.equals(limitRange2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 834CAD7BB21616A5CF21F2024E712EB2
    @Test
    void testHashCode() {
        V1LimitRange limitRange = new V1LimitRange().apiVersion("v1").kind("LimitRange").metadata(new V1ObjectMeta()).spec(new V1LimitRangeSpec());
        assertThat(limitRange.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 561FCE709148B5EE197AF17F70413AD7
    @Test
    void testToString() {
        V1LimitRange limitRange = new V1LimitRange().apiVersion("v1").kind("LimitRange").metadata(new V1ObjectMeta()).spec(new V1LimitRangeSpec());
        String toString = limitRange.toString();
        assertThat(toString, notNullValue());
        assertThat(toString, containsString("apiVersion"));
        assertThat(toString, containsString("kind"));
        assertThat(toString, containsString("metadata"));
        assertThat(toString, containsString("spec"));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 3BAD0BA001C9F42DD47C177E2DAF0235
    @Test
    void testBuilder() {
        V1ObjectMeta metadata = new V1ObjectMeta();
        V1LimitRangeSpec spec = new V1LimitRangeSpec();
        V1LimitRange limitRange = new V1LimitRange().apiVersion("v1").kind("LimitRange").metadata(metadata).spec(spec);
        assertThat(limitRange.getApiVersion(), equalTo("v1"));
        assertThat(limitRange.getKind(), equalTo("LimitRange"));
        assertThat(limitRange.getMetadata(), is(metadata));
        assertThat(limitRange.getSpec(), is(spec));
    }
}
