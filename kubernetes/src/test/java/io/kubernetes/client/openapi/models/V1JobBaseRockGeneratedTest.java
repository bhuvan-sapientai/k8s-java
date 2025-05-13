package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1JobStatus;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1JobSpec;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1JobBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1JobConstructor}, hash: 8D55B1852EBC1A7ACD2A073DFD6B55CD
    @Test
    void testV1JobConstructor() {
        V1Job v1Job = new V1Job();
        assertThat(v1Job, is(notNullValue()));
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 8763FAD8514C0DAC5E7458D75484785F
    @Test
    void testApiVersion() {
        V1Job v1Job = new V1Job();
        String apiVersion = "v1";
        v1Job.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1Job.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: CC746ECAC53098F3C12B8978E9B972FE
    @Test
    void testKind() {
        V1Job v1Job = new V1Job();
        String kind = "Job";
        v1Job.setKind(kind);
        assertEquals(kind, v1Job.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: D1D1152B7FE5B1DF9A302DA15FA9FB25
    @Test
    void testMetadata() {
        V1Job v1Job = new V1Job();
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1Job.setMetadata(metadata);
        assertEquals(metadata, v1Job.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: EC087C778A923EB0ED0383112552DA2A
    @Test
    void testSpec() {
        V1Job v1Job = new V1Job();
        V1JobSpec spec = mock(V1JobSpec.class);
        v1Job.setSpec(spec);
        assertEquals(spec, v1Job.getSpec());
    }

    //BaseRock generated method id: ${testStatus}, hash: 8AE3F7322AC021014AA6915452A218B7
    @Test
    void testStatus() {
        V1Job v1Job = new V1Job();
        V1JobStatus status = mock(V1JobStatus.class);
        v1Job.setStatus(status);
        assertEquals(status, v1Job.getStatus());
    }

    //BaseRock generated method id: ${testEquals}, hash: 5683BA27F6CBE338202B3C5A7971CF91
    @Test
    void testEquals() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1JobSpec spec = mock(V1JobSpec.class);
        V1JobStatus status = mock(V1JobStatus.class);
        V1Job v1Job1 = new V1Job().apiVersion("v1").kind("Job").metadata(metadata).spec(spec).status(status);
        V1Job v1Job2 = new V1Job().apiVersion("v1").kind("Job").metadata(metadata).spec(spec).status(status);
        assertEquals(v1Job1, v1Job2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 14A8140CD5A209DD73F8D14293CB2380
    @Test
    void testHashCode() {
        V1Job v1Job = new V1Job().apiVersion("v1").kind("Job").metadata(mock(V1ObjectMeta.class)).spec(mock(V1JobSpec.class)).status(mock(V1JobStatus.class));
        assertThat(v1Job.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: C00D13F3F09DC55C773CEF6D0DAE6856
    @Test
    void testToString() {
        V1Job v1Job = new V1Job().apiVersion("v1").kind("Job").metadata(mock(V1ObjectMeta.class)).spec(mock(V1JobSpec.class)).status(mock(V1JobStatus.class));
        String toString = v1Job.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("spec"), is(true));
        assertThat(toString.contains("status"), is(true));
    }
}
