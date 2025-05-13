package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.V1ClusterTrustBundleProjection;
import io.kubernetes.client.openapi.models.V1LabelSelector;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ClusterTrustBundleProjectionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: ABC0B101699F89297FC5CED3202C1FDE
    @Test
    void testConstructor() {
        V1ClusterTrustBundleProjection projection = new V1ClusterTrustBundleProjection();
        assertThat(projection, is(notNullValue()));
    }

    //BaseRock generated method id: ${testLabelSelector}, hash: 83D1A0D41418E6841DFB2085D4B57DE2
    @Test
    void testLabelSelector() {
        V1ClusterTrustBundleProjection projection = new V1ClusterTrustBundleProjection();
        V1LabelSelector labelSelector = mock(V1LabelSelector.class);
        projection.setLabelSelector(labelSelector);
        assertEquals(labelSelector, projection.getLabelSelector());
    }

    //BaseRock generated method id: ${testName}, hash: B69C61BFD8288CA1FB28C0638A14A4D8
    @Test
    void testName() {
        V1ClusterTrustBundleProjection projection = new V1ClusterTrustBundleProjection();
        String name = "test-name";
        projection.setName(name);
        assertEquals(name, projection.getName());
    }

    //BaseRock generated method id: ${testOptional}, hash: 1D133F62AAC548B930E8A71228123E08
    @Test
    void testOptional() {
        V1ClusterTrustBundleProjection projection = new V1ClusterTrustBundleProjection();
        projection.setOptional(true);
        assertTrue(projection.getOptional());
        projection.setOptional(false);
        assertFalse(projection.getOptional());
    }

    //BaseRock generated method id: ${testPath}, hash: 30D19090917EF75BCEA9CAD7BF169040
    @Test
    void testPath() {
        V1ClusterTrustBundleProjection projection = new V1ClusterTrustBundleProjection();
        String path = "/test/path";
        projection.setPath(path);
        assertEquals(path, projection.getPath());
    }

    //BaseRock generated method id: ${testSignerName}, hash: A760A2C434848CD4C92B6BD964A121BF
    @Test
    void testSignerName() {
        V1ClusterTrustBundleProjection projection = new V1ClusterTrustBundleProjection();
        String signerName = "test-signer";
        projection.setSignerName(signerName);
        assertEquals(signerName, projection.getSignerName());
    }

    //BaseRock generated method id: ${testEquals}, hash: DFBF64907AD5539CA8B53BD1B13BD85F
    @Test
    void testEquals() {
        V1ClusterTrustBundleProjection projection1 = new V1ClusterTrustBundleProjection().labelSelector(new V1LabelSelector()).name("name1").optional(true).path("/path1").signerName("signer1");
        V1ClusterTrustBundleProjection projection2 = new V1ClusterTrustBundleProjection().labelSelector(new V1LabelSelector()).name("name1").optional(true).path("/path1").signerName("signer1");
        assertTrue(projection1.equals(projection2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 4C7F0C237E56313759EA97D9EA8CAEF7
    @Test
    void testHashCode() {
        V1ClusterTrustBundleProjection projection1 = new V1ClusterTrustBundleProjection().labelSelector(new V1LabelSelector()).name("name1").optional(true).path("/path1").signerName("signer1");
        V1ClusterTrustBundleProjection projection2 = new V1ClusterTrustBundleProjection().labelSelector(new V1LabelSelector()).name("name1").optional(true).path("/path1").signerName("signer1");
        assertEquals(projection1.hashCode(), projection2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: EE64EB3DD51177629875F67166008F57
    @Test
    void testToString() {
        V1ClusterTrustBundleProjection projection = new V1ClusterTrustBundleProjection().labelSelector(new V1LabelSelector()).name("test-name").optional(true).path("/test/path").signerName("test-signer");
        String toString = projection.toString();
        assertTrue(toString.contains("labelSelector"));
        assertTrue(toString.contains("name"));
        assertTrue(toString.contains("optional"));
        assertTrue(toString.contains("path"));
        assertTrue(toString.contains("signerName"));
    }

    //BaseRock generated method id: ${testNullValues}, hash: 09E5D47EE673DE1FE9DC20B13C267C1F
    @Test
    void testNullValues() {
        V1ClusterTrustBundleProjection projection = new V1ClusterTrustBundleProjection();
        assertNull(projection.getLabelSelector());
        assertNull(projection.getName());
        assertNull(projection.getOptional());
        assertNull(projection.getPath());
        assertNull(projection.getSignerName());
    }
}
