package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
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
import io.kubernetes.client.openapi.models.V1alpha1ClusterTrustBundleSpec;
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
class V1alpha1ClusterTrustBundleBaseRockGeneratedTest {

    private V1alpha1ClusterTrustBundle clusterTrustBundle;

    @BeforeEach
    void setUp() {
        clusterTrustBundle = new V1alpha1ClusterTrustBundle();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: BECAFF67BDF7F4B9BBD705AF46CBA80B
    @Test
    void testApiVersion() {
        String apiVersion = "v1alpha1";
        clusterTrustBundle.setApiVersion(apiVersion);
        assertEquals(apiVersion, clusterTrustBundle.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: A2E5C1A91A052EFC3CEF72FA0670520B
    @Test
    void testKind() {
        String kind = "ClusterTrustBundle";
        clusterTrustBundle.setKind(kind);
        assertEquals(kind, clusterTrustBundle.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 7AADD4F91694898943EAFF182C1A76E0
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        clusterTrustBundle.setMetadata(metadata);
        assertEquals(metadata, clusterTrustBundle.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: F23EADB09C7A917136B7911B6478D12D
    @Test
    void testSpec() {
        V1alpha1ClusterTrustBundleSpec spec = mock(V1alpha1ClusterTrustBundleSpec.class);
        clusterTrustBundle.setSpec(spec);
        assertEquals(spec, clusterTrustBundle.getSpec());
    }

    //BaseRock generated method id: ${testEquals}, hash: EDA9966DEAF065EC8E4B2109EB42AA58
    @Test
    void testEquals() {
        V1alpha1ClusterTrustBundle bundle1 = new V1alpha1ClusterTrustBundle().apiVersion("v1alpha1").kind("ClusterTrustBundle").metadata(new V1ObjectMeta()).spec(new V1alpha1ClusterTrustBundleSpec().trustBundle("testBundle"));
        V1alpha1ClusterTrustBundle bundle2 = new V1alpha1ClusterTrustBundle().apiVersion("v1alpha1").kind("ClusterTrustBundle").metadata(new V1ObjectMeta()).spec(new V1alpha1ClusterTrustBundleSpec().trustBundle("testBundle"));
        assertThat(bundle1, is(equalTo(bundle2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 3E9935E135E261718DA21293D9B381C4
    @Test
    void testHashCode() {
        V1alpha1ClusterTrustBundle bundle = new V1alpha1ClusterTrustBundle().apiVersion("v1alpha1").kind("ClusterTrustBundle").metadata(new V1ObjectMeta()).spec(new V1alpha1ClusterTrustBundleSpec().trustBundle("testBundle"));
        int hashCode = bundle.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 627C90FDD805EE982921C95D0CA74E38
    @Test
    void testToString() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        when(metadata.toString()).thenReturn("MockedMetadata");
        V1alpha1ClusterTrustBundleSpec spec = mock(V1alpha1ClusterTrustBundleSpec.class);
        when(spec.toString()).thenReturn("MockedSpec");
        V1alpha1ClusterTrustBundle bundle = new V1alpha1ClusterTrustBundle().apiVersion("v1alpha1").kind("ClusterTrustBundle").metadata(metadata).spec(spec);
        String result = bundle.toString();
        assertNotNull(result);
        assertThat(result.contains("apiVersion: v1alpha1"), is(true));
        assertThat(result.contains("kind: ClusterTrustBundle"), is(true));
        assertThat(result.contains("metadata: MockedMetadata"), is(true));
        assertThat(result.contains("spec: MockedSpec"), is(true));
    }

    //BaseRock generated method id: ${testToJson}, hash: DDBB811F7238EE82403691C50897BE06
    @Test
    void testToJson() throws Exception {
        V1ObjectMeta metadata = new V1ObjectMeta();
        V1alpha1ClusterTrustBundleSpec spec = new V1alpha1ClusterTrustBundleSpec().trustBundle("testBundle");
        V1alpha1ClusterTrustBundle bundle = new V1alpha1ClusterTrustBundle().apiVersion("v1alpha1").kind("ClusterTrustBundle").metadata(metadata).spec(spec);
        String json = bundle.toJson();
        assertNotNull(json);
        assertThat(json.contains("\"apiVersion\":\"v1alpha1\""), is(true));
        assertThat(json.contains("\"kind\":\"ClusterTrustBundle\""), is(true));
        assertThat(json.contains("\"trustBundle\":\"testBundle\""), is(true));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 470A095D6B82BA7EF02E9B75CA3A2307
    @Test
    void testFromJson() throws Exception {
        String json = "{\"apiVersion\":\"v1alpha1\",\"kind\":\"ClusterTrustBundle\",\"metadata\":{},\"spec\":{\"trustBundle\":\"testBundle\"}}";
        V1alpha1ClusterTrustBundle bundle = V1alpha1ClusterTrustBundle.fromJson(json);
        assertNotNull(bundle);
        assertEquals("v1alpha1", bundle.getApiVersion());
        assertEquals("ClusterTrustBundle", bundle.getKind());
        assertNotNull(bundle.getMetadata());
        assertNotNull(bundle.getSpec());
        assertEquals("testBundle", bundle.getSpec().getTrustBundle());
    }
}
