package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatus;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpec;
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
class V1PersistentVolumeClaimBaseRockGeneratedTest {

    private V1PersistentVolumeClaim persistentVolumeClaim;

    @BeforeEach
    void setUp() {
        persistentVolumeClaim = new V1PersistentVolumeClaim();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: BD9943BDDB05591091C12CB543537B25
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        persistentVolumeClaim.setApiVersion(apiVersion);
        assertEquals(apiVersion, persistentVolumeClaim.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: EB4FF59A0C48E769617843976D598458
    @Test
    void testKind() {
        String kind = "PersistentVolumeClaim";
        persistentVolumeClaim.setKind(kind);
        assertEquals(kind, persistentVolumeClaim.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 135D1B0DFE1BFEFAEB1C0884374088FD
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        persistentVolumeClaim.setMetadata(metadata);
        assertThat(persistentVolumeClaim.getMetadata(), is(metadata));
    }

    //BaseRock generated method id: ${testSpec}, hash: 774BB1ED2B3ACEF565AC086C2FA176EC
    @Test
    void testSpec() {
        V1PersistentVolumeClaimSpec spec = mock(V1PersistentVolumeClaimSpec.class);
        persistentVolumeClaim.setSpec(spec);
        assertThat(persistentVolumeClaim.getSpec(), is(spec));
    }

    //BaseRock generated method id: ${testStatus}, hash: F6AD27370ECA18215122DF1F773AC271
    @Test
    void testStatus() {
        V1PersistentVolumeClaimStatus status = mock(V1PersistentVolumeClaimStatus.class);
        persistentVolumeClaim.setStatus(status);
        assertThat(persistentVolumeClaim.getStatus(), is(status));
    }

    //BaseRock generated method id: ${testEquals}, hash: 9315707E9870B66EB01717DB3CFDBAFD
    @Test
    void testEquals() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1PersistentVolumeClaimSpec spec = mock(V1PersistentVolumeClaimSpec.class);
        V1PersistentVolumeClaimStatus status = mock(V1PersistentVolumeClaimStatus.class);
        V1PersistentVolumeClaim claim1 = new V1PersistentVolumeClaim().apiVersion("v1").kind("PersistentVolumeClaim").metadata(metadata).spec(spec).status(status);
        V1PersistentVolumeClaim claim2 = new V1PersistentVolumeClaim().apiVersion("v1").kind("PersistentVolumeClaim").metadata(metadata).spec(spec).status(status);
        assertThat(claim1, is(equalTo(claim2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 235205798C9002B194B3714580DD51E1
    @Test
    void testHashCode() {
        V1PersistentVolumeClaim claim = new V1PersistentVolumeClaim().apiVersion("v1").kind("PersistentVolumeClaim").metadata(mock(V1ObjectMeta.class)).spec(mock(V1PersistentVolumeClaimSpec.class)).status(mock(V1PersistentVolumeClaimStatus.class));
        int hashCode = claim.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 0A49F5E043B92AB74C0EF484DDA38AE6
    @Test
    void testToString() {
        V1PersistentVolumeClaim claim = new V1PersistentVolumeClaim().apiVersion("v1").kind("PersistentVolumeClaim").metadata(mock(V1ObjectMeta.class)).spec(mock(V1PersistentVolumeClaimSpec.class)).status(mock(V1PersistentVolumeClaimStatus.class));
        String toString = claim.toString();
        assertNotNull(toString);
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("spec"), is(true));
        assertThat(toString.contains("status"), is(true));
    }
}
