package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1CronJobStatus;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1CronJobSpec;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CronJobBaseRockGeneratedTest {

    private V1CronJob v1CronJob;

    @BeforeEach
    void setUp() {
        v1CronJob = new V1CronJob();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 6AD1E8514A01DDC4AADC7377F2094D04
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1CronJob.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1CronJob.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 6936D387637AAF401E3DA333683346BF
    @Test
    void testKind() {
        String kind = "CronJob";
        v1CronJob.setKind(kind);
        assertEquals(kind, v1CronJob.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: A289A9081D2D2239A4CC872B1A98C887
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1CronJob.setMetadata(metadata);
        assertEquals(metadata, v1CronJob.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: B6BEF90234F63DBD402CEAE292AAF74E
    @Test
    void testSpec() {
        V1CronJobSpec spec = mock(V1CronJobSpec.class);
        v1CronJob.setSpec(spec);
        assertEquals(spec, v1CronJob.getSpec());
    }

    //BaseRock generated method id: ${testStatus}, hash: DAA8B35E10A8FF1B393DCCD8D2184247
    @Test
    void testStatus() {
        V1CronJobStatus status = mock(V1CronJobStatus.class);
        v1CronJob.setStatus(status);
        assertEquals(status, v1CronJob.getStatus());
    }

    //BaseRock generated method id: ${testEquals}, hash: 0F4FE3F81D6EB150AAFE95F5F611AD67
    @Test
    void testEquals() {
        V1CronJob other = new V1CronJob();
        String apiVersion = "v1";
        String kind = "CronJob";
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1CronJobSpec spec = mock(V1CronJobSpec.class);
        V1CronJobStatus status = mock(V1CronJobStatus.class);
        other.setApiVersion(apiVersion);
        other.setKind(kind);
        other.setMetadata(metadata);
        other.setSpec(spec);
        other.setStatus(status);
        v1CronJob.setApiVersion(apiVersion);
        v1CronJob.setKind(kind);
        v1CronJob.setMetadata(metadata);
        v1CronJob.setSpec(spec);
        v1CronJob.setStatus(status);
        assertThat(v1CronJob, is(equalTo(other)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 79E1A0186828DC442132D8B68E27C3B7
    @Test
    void testHashCode() {
        v1CronJob.setApiVersion("v1");
        v1CronJob.setKind("CronJob");
        v1CronJob.setMetadata(mock(V1ObjectMeta.class));
        v1CronJob.setSpec(mock(V1CronJobSpec.class));
        v1CronJob.setStatus(mock(V1CronJobStatus.class));
        int hashCode = v1CronJob.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: F4DD575F482691434E14EF7A62EE8C42
    @Test
    void testToString() {
        v1CronJob.setApiVersion("v1");
        v1CronJob.setKind("CronJob");
        v1CronJob.setMetadata(mock(V1ObjectMeta.class));
        v1CronJob.setSpec(mock(V1CronJobSpec.class));
        v1CronJob.setStatus(mock(V1CronJobStatus.class));
        String toString = v1CronJob.toString();
        assertNotNull(toString);
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("spec"), is(true));
        assertThat(toString.contains("status"), is(true));
    }
}
