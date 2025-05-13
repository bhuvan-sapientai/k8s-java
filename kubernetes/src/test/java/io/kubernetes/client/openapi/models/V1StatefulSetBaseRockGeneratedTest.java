package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1StatefulSetStatus;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1StatefulSetSpec;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1StatefulSetBaseRockGeneratedTest {

    private V1StatefulSet v1StatefulSet;

    @BeforeEach
    void setUp() {
        v1StatefulSet = new V1StatefulSet();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 732A9030211E61DFEB36CE09FE3AB0FD
    @Test
    void testApiVersion() {
        String apiVersion = "apps/v1";
        v1StatefulSet.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1StatefulSet.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: A5FDD9F9E98DFC07C8D738AA8A8A0AD1
    @Test
    void testKind() {
        String kind = "StatefulSet";
        v1StatefulSet.setKind(kind);
        assertEquals(kind, v1StatefulSet.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 7E632AB3A78E84442D309006FF387E6F
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1StatefulSet.setMetadata(metadata);
        assertThat(v1StatefulSet.getMetadata(), is(metadata));
    }

    //BaseRock generated method id: ${testSpec}, hash: DB235447BDC2C6247551B0416A1A27E1
    @Test
    void testSpec() {
        V1StatefulSetSpec spec = mock(V1StatefulSetSpec.class);
        v1StatefulSet.setSpec(spec);
        assertThat(v1StatefulSet.getSpec(), is(spec));
    }

    //BaseRock generated method id: ${testStatus}, hash: 23F0D6983ED31EC37AA363DD2D31BC14
    @Test
    void testStatus() {
        V1StatefulSetStatus status = mock(V1StatefulSetStatus.class);
        v1StatefulSet.setStatus(status);
        assertThat(v1StatefulSet.getStatus(), is(status));
    }

    //BaseRock generated method id: ${testEquals}, hash: 2F75BBE2DF3E64E4835330BE6E1B284A
    @Test
    void testEquals() {
        V1StatefulSet other = new V1StatefulSet();
        other.setApiVersion("apps/v1");
        other.setKind("StatefulSet");
        other.setMetadata(v1StatefulSet.getMetadata());
        other.setSpec(v1StatefulSet.getSpec());
        other.setStatus(v1StatefulSet.getStatus());
        v1StatefulSet.setApiVersion("apps/v1");
        v1StatefulSet.setKind("StatefulSet");
        assertThat(v1StatefulSet, is(equalTo(other)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 7C7478FD904E40D9810B4687803EAE6B
    @Test
    void testHashCode() {
        v1StatefulSet.setApiVersion("apps/v1");
        v1StatefulSet.setKind("StatefulSet");
        v1StatefulSet.setMetadata(mock(V1ObjectMeta.class));
        v1StatefulSet.setSpec(mock(V1StatefulSetSpec.class));
        v1StatefulSet.setStatus(mock(V1StatefulSetStatus.class));
        int hashCode = v1StatefulSet.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 2D1982FE640BEC846BA89F963EB0356A
    @Test
    void testToString() {
        v1StatefulSet.setApiVersion("apps/v1");
        v1StatefulSet.setKind("StatefulSet");
        v1StatefulSet.setMetadata(mock(V1ObjectMeta.class));
        v1StatefulSet.setSpec(mock(V1StatefulSetSpec.class));
        v1StatefulSet.setStatus(mock(V1StatefulSetStatus.class));
        String toString = v1StatefulSet.toString();
        assertNotNull(toString);
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("spec"), is(true));
        assertThat(toString.contains("status"), is(true));
    }
}
