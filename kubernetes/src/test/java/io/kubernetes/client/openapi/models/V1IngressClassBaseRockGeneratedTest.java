package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1IngressClassSpec;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1IngressClassBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1IngressClassConstructor}, hash: 13B8E6399FE533FD92265E05D314BEF3
    @Test
    void testV1IngressClassConstructor() {
        V1IngressClass v1IngressClass = new V1IngressClass();
        assertNotNull(v1IngressClass);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: FCCCAFACF628FA8BE5410B87414D8866
    @Test
    void testApiVersion() {
        V1IngressClass v1IngressClass = new V1IngressClass();
        String apiVersion = "networking.k8s.io/v1";
        v1IngressClass.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1IngressClass.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 8220368A645219A4EC29FA67D3FC71B9
    @Test
    void testKind() {
        V1IngressClass v1IngressClass = new V1IngressClass();
        String kind = "IngressClass";
        v1IngressClass.setKind(kind);
        assertEquals(kind, v1IngressClass.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: D078B22FF7F8AAA834FC9E6476EFE55C
    @Test
    void testMetadata() {
        V1IngressClass v1IngressClass = new V1IngressClass();
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1IngressClass.setMetadata(metadata);
        assertEquals(metadata, v1IngressClass.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: F75141F89E04A9BEF3DF374F81ADCF24
    @Test
    void testSpec() {
        V1IngressClass v1IngressClass = new V1IngressClass();
        V1IngressClassSpec spec = mock(V1IngressClassSpec.class);
        v1IngressClass.setSpec(spec);
        assertEquals(spec, v1IngressClass.getSpec());
    }

    //BaseRock generated method id: ${testEquals}, hash: 66410AC395DCD63F69E5A9149F46436F
    @Test
    void testEquals() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1IngressClassSpec spec = mock(V1IngressClassSpec.class);
        V1IngressClass v1IngressClass1 = new V1IngressClass().apiVersion("networking.k8s.io/v1").kind("IngressClass").metadata(metadata).spec(spec);
        V1IngressClass v1IngressClass2 = new V1IngressClass().apiVersion("networking.k8s.io/v1").kind("IngressClass").metadata(metadata).spec(spec);
        assertThat(v1IngressClass1, is(equalTo(v1IngressClass2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 15C3E7DF87A1FCE87E3BA0D3DEF2AFBA
    @Test
    void testHashCode() {
        V1IngressClass v1IngressClass = new V1IngressClass().apiVersion("networking.k8s.io/v1").kind("IngressClass").metadata(mock(V1ObjectMeta.class)).spec(mock(V1IngressClassSpec.class));
        assertThat(v1IngressClass.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 52922FFAFD7986C82CEE99F17F918FC5
    @Test
    void testToString() {
        V1IngressClass v1IngressClass = new V1IngressClass().apiVersion("networking.k8s.io/v1").kind("IngressClass").metadata(mock(V1ObjectMeta.class)).spec(mock(V1IngressClassSpec.class));
        String toString = v1IngressClass.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("spec"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 5084DBC285F9DB44DE6B9834A8DFED6B
    @Test
    void testBuilder() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1IngressClassSpec spec = mock(V1IngressClassSpec.class);
        V1IngressClass v1IngressClass = new V1IngressClass().apiVersion("networking.k8s.io/v1").kind("IngressClass").metadata(metadata).spec(spec);
        assertThat(v1IngressClass.getApiVersion(), is("networking.k8s.io/v1"));
        assertThat(v1IngressClass.getKind(), is("IngressClass"));
        assertThat(v1IngressClass.getMetadata(), is(metadata));
        assertThat(v1IngressClass.getSpec(), is(spec));
    }
}
