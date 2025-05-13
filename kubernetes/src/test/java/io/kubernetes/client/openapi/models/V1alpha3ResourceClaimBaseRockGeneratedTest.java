package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1alpha3ResourceClaimStatus;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.V1alpha3ResourceClaimSpec;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha3ResourceClaimBaseRockGeneratedTest {

    private V1alpha3ResourceClaim v1alpha3ResourceClaim;

    @BeforeEach
    void setUp() {
        v1alpha3ResourceClaim = new V1alpha3ResourceClaim();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 7909D23F0E74EB6ED4092D5DD9DDC834
    @Test
    void testApiVersion() {
        String apiVersion = "v1alpha3";
        v1alpha3ResourceClaim.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1alpha3ResourceClaim.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: C6EA1DBB5B6BF9E2DAE4A7EB2C7B0A4B
    @Test
    void testKind() {
        String kind = "ResourceClaim";
        v1alpha3ResourceClaim.setKind(kind);
        assertEquals(kind, v1alpha3ResourceClaim.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 85543D72DAFF46F10355F5E34B908002
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1alpha3ResourceClaim.setMetadata(metadata);
        assertEquals(metadata, v1alpha3ResourceClaim.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: 942DD9E4C7025E7DEFF45D5193C9C363
    @Test
    void testSpec() {
        V1alpha3ResourceClaimSpec spec = mock(V1alpha3ResourceClaimSpec.class);
        v1alpha3ResourceClaim.setSpec(spec);
        assertEquals(spec, v1alpha3ResourceClaim.getSpec());
    }

    //BaseRock generated method id: ${testStatus}, hash: 1D878BF2D2CBE00902D19C593225C344
    @Test
    void testStatus() {
        V1alpha3ResourceClaimStatus status = mock(V1alpha3ResourceClaimStatus.class);
        v1alpha3ResourceClaim.setStatus(status);
        assertEquals(status, v1alpha3ResourceClaim.getStatus());
    }

    //BaseRock generated method id: ${testEquals}, hash: CE59F2B8B67CEA4C703D6768B94E8D34
    @Test
    void testEquals() {
        V1alpha3ResourceClaim other = new V1alpha3ResourceClaim();
        String apiVersion = "v1alpha3";
        String kind = "ResourceClaim";
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1alpha3ResourceClaimSpec spec = mock(V1alpha3ResourceClaimSpec.class);
        V1alpha3ResourceClaimStatus status = mock(V1alpha3ResourceClaimStatus.class);
        v1alpha3ResourceClaim.setApiVersion(apiVersion);
        v1alpha3ResourceClaim.setKind(kind);
        v1alpha3ResourceClaim.setMetadata(metadata);
        v1alpha3ResourceClaim.setSpec(spec);
        v1alpha3ResourceClaim.setStatus(status);
        other.setApiVersion(apiVersion);
        other.setKind(kind);
        other.setMetadata(metadata);
        other.setSpec(spec);
        other.setStatus(status);
        assertThat(v1alpha3ResourceClaim.equals(other), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 0540B047B6F4C75973696A6E93B04136
    @Test
    void testHashCode() {
        v1alpha3ResourceClaim.setApiVersion("v1alpha3");
        v1alpha3ResourceClaim.setKind("ResourceClaim");
        v1alpha3ResourceClaim.setMetadata(mock(V1ObjectMeta.class));
        v1alpha3ResourceClaim.setSpec(mock(V1alpha3ResourceClaimSpec.class));
        v1alpha3ResourceClaim.setStatus(mock(V1alpha3ResourceClaimStatus.class));
        assertThat(v1alpha3ResourceClaim.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: E741C1C30B642C19E67EABC1382D92C4
    @Test
    void testToString() {
        v1alpha3ResourceClaim.setApiVersion("v1alpha3");
        v1alpha3ResourceClaim.setKind("ResourceClaim");
        v1alpha3ResourceClaim.setMetadata(mock(V1ObjectMeta.class));
        v1alpha3ResourceClaim.setSpec(mock(V1alpha3ResourceClaimSpec.class));
        v1alpha3ResourceClaim.setStatus(mock(V1alpha3ResourceClaimStatus.class));
        String result = v1alpha3ResourceClaim.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result.contains("apiVersion"), is(true));
        assertThat(result.contains("kind"), is(true));
        assertThat(result.contains("metadata"), is(true));
        assertThat(result.contains("spec"), is(true));
        assertThat(result.contains("status"), is(true));
    }
}
