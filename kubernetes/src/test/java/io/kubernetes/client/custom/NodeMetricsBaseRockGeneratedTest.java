package io.kubernetes.client.custom;

import io.kubernetes.client.common.KubernetesObject;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.instanceOf;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.HashMap;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class NodeMetricsBaseRockGeneratedTest {

    private NodeMetrics nodeMetrics;

    @BeforeEach
    void setUp() {
        nodeMetrics = new NodeMetrics();
    }

    //BaseRock generated method id: ${testNodeMetricsImplementsKubernetesObject}, hash: 3705FA79A73783883379ED9EB1C54F88
    @Test
    void testNodeMetricsImplementsKubernetesObject() {
        assertThat(nodeMetrics, is(instanceOf(KubernetesObject.class)));
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 13A689528942D9781B754AFD33341BDE
    @Test
    void testGetMetadata() {
        V1ObjectMeta metadata = new V1ObjectMeta();
        nodeMetrics.setMetadata(metadata);
        assertEquals(metadata, nodeMetrics.getMetadata());
    }

    //BaseRock generated method id: ${testGetSetTimestamp}, hash: C4AC14D00BEAE480C3A6BA0AE4B04681
    @Test
    void testGetSetTimestamp() {
        String timestamp = "2023-05-01T12:00:00Z";
        nodeMetrics.setTimestamp(timestamp);
        assertEquals(timestamp, nodeMetrics.getTimestamp());
    }

    //BaseRock generated method id: ${testGetSetWindow}, hash: 2E260157F11824C3E2D1827FF10EF1DA
    @Test
    void testGetSetWindow() {
        String window = "5m";
        nodeMetrics.setWindow(window);
        assertEquals(window, nodeMetrics.getWindow());
    }

    //BaseRock generated method id: ${testGetSetKind}, hash: B0DB1EB2B897F8847B710ECC2219C565
    @Test
    void testGetSetKind() {
        String kind = "NodeMetrics";
        nodeMetrics.setKind(kind);
        assertEquals(kind, nodeMetrics.getKind());
    }

    //BaseRock generated method id: ${testGetSetApiVersion}, hash: 6AFD2AC0BA8830006CF11733F408181F
    @Test
    void testGetSetApiVersion() {
        String apiVersion = "metrics.k8s.io/v1beta1";
        nodeMetrics.setApiVersion(apiVersion);
        assertEquals(apiVersion, nodeMetrics.getApiVersion());
    }

    //BaseRock generated method id: ${testGetSetUsage}, hash: 69B915889D588C76853F5F442D453E04
    @Test
    void testGetSetUsage() {
        Map<String, Quantity> usage = new HashMap<>();
        usage.put("cpu", new Quantity("100m"));
        usage.put("memory", new Quantity("1Gi"));
        nodeMetrics.setUsage(usage);
        assertEquals(usage, nodeMetrics.getUsage());
    }

    //BaseRock generated method id: ${testUsageInitializedEmpty}, hash: B6A6F459E61A4349E9D1E8640CACA3A8
    @Test
    void testUsageInitializedEmpty() {
        assertNotNull(nodeMetrics.getUsage());
        assertTrue(nodeMetrics.getUsage().isEmpty());
    }

    //BaseRock generated method id: ${testMetadataInitialized}, hash: F592DA234E9D5BCC0B2B71863A7B6D04
    @Test
    void testMetadataInitialized() {
        assertNotNull(nodeMetrics.getMetadata());
    }

    //BaseRock generated method id: ${testConstructor}, hash: 067FEA92C9B4258005511FB3D5B91250
    @Test
    void testConstructor() {
        NodeMetrics metrics = new NodeMetrics();
        assertNotNull(metrics);
        assertNotNull(metrics.getMetadata());
        assertNotNull(metrics.getUsage());
        assertTrue(metrics.getUsage().isEmpty());
    }

    //BaseRock generated method id: ${testSetAllProperties}, hash: 60E24A2657E31692497B9F5939FF2FA4
    @Test
    void testSetAllProperties() {
        V1ObjectMeta metadata = new V1ObjectMeta();
        String timestamp = "2023-05-01T12:00:00Z";
        String window = "5m";
        String kind = "NodeMetrics";
        String apiVersion = "metrics.k8s.io/v1beta1";
        Map<String, Quantity> usage = new HashMap<>();
        usage.put("cpu", new Quantity("100m"));
        nodeMetrics.setMetadata(metadata);
        nodeMetrics.setTimestamp(timestamp);
        nodeMetrics.setWindow(window);
        nodeMetrics.setKind(kind);
        nodeMetrics.setApiVersion(apiVersion);
        nodeMetrics.setUsage(usage);
        assertEquals(metadata, nodeMetrics.getMetadata());
        assertEquals(timestamp, nodeMetrics.getTimestamp());
        assertEquals(window, nodeMetrics.getWindow());
        assertEquals(kind, nodeMetrics.getKind());
        assertEquals(apiVersion, nodeMetrics.getApiVersion());
        assertEquals(usage, nodeMetrics.getUsage());
    }

    //BaseRock generated method id: ${testUsageMapOperations}, hash: F0B823B270ABC1707F72137A09E357DB
    @Test
    void testUsageMapOperations() {
        Map<String, Quantity> usage = new HashMap<>();
        usage.put("cpu", new Quantity("100m"));
        usage.put("memory", new Quantity("1Gi"));
        nodeMetrics.setUsage(usage);
        assertEquals(2, nodeMetrics.getUsage().size());
        assertTrue(nodeMetrics.getUsage().containsKey("cpu"));
        assertTrue(nodeMetrics.getUsage().containsKey("memory"));
        assertEquals(new Quantity("100m"), nodeMetrics.getUsage().get("cpu"));
        assertEquals(new Quantity("1Gi"), nodeMetrics.getUsage().get("memory"));
        nodeMetrics.getUsage().put("disk", new Quantity("10Gi"));
        assertEquals(3, nodeMetrics.getUsage().size());
        assertTrue(nodeMetrics.getUsage().containsKey("disk"));
        assertEquals(new Quantity("10Gi"), nodeMetrics.getUsage().get("disk"));
        nodeMetrics.getUsage().remove("cpu");
        assertEquals(2, nodeMetrics.getUsage().size());
        assertFalse(nodeMetrics.getUsage().containsKey("cpu"));
    }

    //BaseRock generated method id: ${testNullValues}, hash: 1CC03D8C9ADBD64A34887CD2522F5074
    @Test
    void testNullValues() {
        nodeMetrics.setMetadata(null);
        assertNull(nodeMetrics.getMetadata());
        nodeMetrics.setTimestamp(null);
        assertNull(nodeMetrics.getTimestamp());
        nodeMetrics.setWindow(null);
        assertNull(nodeMetrics.getWindow());
        nodeMetrics.setKind(null);
        assertNull(nodeMetrics.getKind());
        nodeMetrics.setApiVersion(null);
        assertNull(nodeMetrics.getApiVersion());
        nodeMetrics.setUsage(null);
        assertNull(nodeMetrics.getUsage());
    }
}
