package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpec;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerStatus;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1HorizontalPodAutoscalerBaseRockGeneratedTest {

    private V1HorizontalPodAutoscaler v1HorizontalPodAutoscaler;

    @BeforeEach
    void setUp() {
        v1HorizontalPodAutoscaler = new V1HorizontalPodAutoscaler();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: FE9A799D9151BD0CA557FCFA7FC9A5DA
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1HorizontalPodAutoscaler.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1HorizontalPodAutoscaler.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 7B06BD807F77C7A38183C1E743D90D3C
    @Test
    void testKind() {
        String kind = "HorizontalPodAutoscaler";
        v1HorizontalPodAutoscaler.setKind(kind);
        assertEquals(kind, v1HorizontalPodAutoscaler.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 9AD58E3F1CE282E0AA856B61A266B9D8
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1HorizontalPodAutoscaler.setMetadata(metadata);
        assertEquals(metadata, v1HorizontalPodAutoscaler.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: C9EAF2F4FBB31F5F3500DA6656353262
    @Test
    void testSpec() {
        V1HorizontalPodAutoscalerSpec spec = mock(V1HorizontalPodAutoscalerSpec.class);
        v1HorizontalPodAutoscaler.setSpec(spec);
        assertEquals(spec, v1HorizontalPodAutoscaler.getSpec());
    }

    //BaseRock generated method id: ${testStatus}, hash: 6D15541A9956FC45646F55907FC109C4
    @Test
    void testStatus() {
        V1HorizontalPodAutoscalerStatus status = mock(V1HorizontalPodAutoscalerStatus.class);
        v1HorizontalPodAutoscaler.setStatus(status);
        assertEquals(status, v1HorizontalPodAutoscaler.getStatus());
    }

    //BaseRock generated method id: ${testEquals}, hash: E19E23D750CE474A4813851B5D0B73B2
    @Test
    void testEquals() {
        V1HorizontalPodAutoscaler other = new V1HorizontalPodAutoscaler();
        String apiVersion = "v1";
        String kind = "HorizontalPodAutoscaler";
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1HorizontalPodAutoscalerSpec spec = mock(V1HorizontalPodAutoscalerSpec.class);
        V1HorizontalPodAutoscalerStatus status = mock(V1HorizontalPodAutoscalerStatus.class);
        other.setApiVersion(apiVersion);
        other.setKind(kind);
        other.setMetadata(metadata);
        other.setSpec(spec);
        other.setStatus(status);
        v1HorizontalPodAutoscaler.setApiVersion(apiVersion);
        v1HorizontalPodAutoscaler.setKind(kind);
        v1HorizontalPodAutoscaler.setMetadata(metadata);
        v1HorizontalPodAutoscaler.setSpec(spec);
        v1HorizontalPodAutoscaler.setStatus(status);
        assertThat(v1HorizontalPodAutoscaler, is(equalTo(other)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 74C44BDBEE42E81F83980DB090FCB353
    @Test
    void testHashCode() {
        v1HorizontalPodAutoscaler.setApiVersion("v1");
        v1HorizontalPodAutoscaler.setKind("HorizontalPodAutoscaler");
        v1HorizontalPodAutoscaler.setMetadata(mock(V1ObjectMeta.class));
        v1HorizontalPodAutoscaler.setSpec(mock(V1HorizontalPodAutoscalerSpec.class));
        v1HorizontalPodAutoscaler.setStatus(mock(V1HorizontalPodAutoscalerStatus.class));
        int hashCode = v1HorizontalPodAutoscaler.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: F6B4FA9128351C5B13F6D55D0C8BE02E
    @Test
    void testToString() {
        v1HorizontalPodAutoscaler.setApiVersion("v1");
        v1HorizontalPodAutoscaler.setKind("HorizontalPodAutoscaler");
        v1HorizontalPodAutoscaler.setMetadata(mock(V1ObjectMeta.class));
        v1HorizontalPodAutoscaler.setSpec(mock(V1HorizontalPodAutoscalerSpec.class));
        v1HorizontalPodAutoscaler.setStatus(mock(V1HorizontalPodAutoscalerStatus.class));
        String toString = v1HorizontalPodAutoscaler.toString();
        assertNotNull(toString);
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("spec"), is(true));
        assertThat(toString.contains("status"), is(true));
    }

    //BaseRock generated method id: ${testConstructor}, hash: EFB1620D03DAEC6993074122ADF683C7
    @Test
    void testConstructor() {
        assertNotNull(new V1HorizontalPodAutoscaler());
    }
}
