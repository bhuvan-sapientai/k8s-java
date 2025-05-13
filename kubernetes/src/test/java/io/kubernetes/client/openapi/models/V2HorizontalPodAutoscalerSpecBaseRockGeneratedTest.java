package io.kubernetes.client.openapi.models;

import java.util.List;
import io.kubernetes.client.openapi.models.V2MetricSpec;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehavior;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpec;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import io.kubernetes.client.openapi.models.V2CrossVersionObjectReference;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V2HorizontalPodAutoscalerSpecBaseRockGeneratedTest {

    private V2HorizontalPodAutoscalerSpec spec;

    @BeforeEach
    void setUp() {
        spec = new V2HorizontalPodAutoscalerSpec();
    }

    //BaseRock generated method id: ${testBehavior}, hash: 85504C66A364AC25C01C1C52ABDCE20D
    @Test
    void testBehavior() {
        V2HorizontalPodAutoscalerBehavior behavior = mock(V2HorizontalPodAutoscalerBehavior.class);
        spec.setBehavior(behavior);
        assertEquals(behavior, spec.getBehavior());
    }

    //BaseRock generated method id: ${testMaxReplicas}, hash: 79FFED216B1F729CC430D37FC06F981F
    @Test
    void testMaxReplicas() {
        spec.setMaxReplicas(5);
        assertEquals(5, spec.getMaxReplicas());
    }

    //BaseRock generated method id: ${testMetrics}, hash: D2A5D5B60DCD8AE10B18BCC5E4816B4D
    @Test
    void testMetrics() {
        List<V2MetricSpec> metrics = new ArrayList<>();
        V2MetricSpec metricSpec = mock(V2MetricSpec.class);
        metrics.add(metricSpec);
        spec.setMetrics(metrics);
        assertEquals(metrics, spec.getMetrics());
    }

    //BaseRock generated method id: ${testAddMetricsItem}, hash: E1150574DF5393AC0D9C1262E4A77F75
    @Test
    void testAddMetricsItem() {
        V2MetricSpec metricSpec = mock(V2MetricSpec.class);
        spec.addMetricsItem(metricSpec);
        List<V2MetricSpec> metrics = spec.getMetrics();
        assertNotNull(metrics);
        assertEquals(1, metrics.size());
        assertTrue(metrics.contains(metricSpec));
    }

    //BaseRock generated method id: ${testMinReplicas}, hash: 9C682A8820D28647942A2B3DC9661CE4
    @Test
    void testMinReplicas() {
        spec.setMinReplicas(2);
        assertEquals(2, spec.getMinReplicas());
    }

    //BaseRock generated method id: ${testScaleTargetRef}, hash: AA8DC680FF19C8C76EBC622BB0EECA3D
    @Test
    void testScaleTargetRef() {
        V2CrossVersionObjectReference scaleTargetRef = mock(V2CrossVersionObjectReference.class);
        spec.setScaleTargetRef(scaleTargetRef);
        assertEquals(scaleTargetRef, spec.getScaleTargetRef());
    }

    //BaseRock generated method id: ${testEquals}, hash: F5AF2EE6A8BE1285060A9E6FC88C06FF
    @Test
    void testEquals() {
        V2HorizontalPodAutoscalerSpec spec1 = new V2HorizontalPodAutoscalerSpec();
        V2HorizontalPodAutoscalerSpec spec2 = new V2HorizontalPodAutoscalerSpec();
        assertTrue(spec1.equals(spec2));
        assertTrue(spec2.equals(spec1));
        spec1.setMaxReplicas(5);
        assertFalse(spec1.equals(spec2));
        spec2.setMaxReplicas(5);
        assertTrue(spec1.equals(spec2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 8C9426E3783502C7B9589FE80BF7F042
    @Test
    void testHashCode() {
        V2HorizontalPodAutoscalerSpec spec1 = new V2HorizontalPodAutoscalerSpec();
        V2HorizontalPodAutoscalerSpec spec2 = new V2HorizontalPodAutoscalerSpec();
        assertEquals(spec1.hashCode(), spec2.hashCode());
        spec1.setMaxReplicas(5);
        assertNotEquals(spec1.hashCode(), spec2.hashCode());
        spec2.setMaxReplicas(5);
        assertEquals(spec1.hashCode(), spec2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 7E1408B8AC0A76AD5796DB45EFF04BA6
    @Test
    void testToString() {
        V2HorizontalPodAutoscalerSpec spec = new V2HorizontalPodAutoscalerSpec().behavior(mock(V2HorizontalPodAutoscalerBehavior.class)).maxReplicas(5).minReplicas(2).scaleTargetRef(mock(V2CrossVersionObjectReference.class));
        String toString = spec.toString();
        assertTrue(toString.contains("behavior"));
        assertTrue(toString.contains("maxReplicas"));
        assertTrue(toString.contains("minReplicas"));
        assertTrue(toString.contains("scaleTargetRef"));
    }

    //BaseRock generated method id: ${testMaxReplicasWithDifferentValues}, hash: 5AD5AE07EDCC1B76CB5789E3A533A0E5
    @ParameterizedTest
    @ValueSource(ints = { 1, 5, 10 })
    void testMaxReplicasWithDifferentValues(int maxReplicas) {
        spec.setMaxReplicas(maxReplicas);
        assertEquals(maxReplicas, spec.getMaxReplicas());
    }

    //BaseRock generated method id: ${testNullBehavior}, hash: 10427821FC3E8CBBE2989B70D38C24ED
    @Test
    void testNullBehavior() {
        spec.setBehavior(null);
        assertNull(spec.getBehavior());
    }

    //BaseRock generated method id: ${testNullMetrics}, hash: 49CA6841B4C3CD5A1D1480B1FE477E60
    @Test
    void testNullMetrics() {
        spec.setMetrics(null);
        assertNull(spec.getMetrics());
    }

    //BaseRock generated method id: ${testNullMinReplicas}, hash: 6A645B302714FC776C37EE8D16D3CBE4
    @Test
    void testNullMinReplicas() {
        spec.setMinReplicas(null);
        assertNull(spec.getMinReplicas());
    }

    //BaseRock generated method id: ${testConstructorWithBuilder}, hash: 8A2BB07142F28C8919E4C1237E5B4EAD
    @Test
    void testConstructorWithBuilder() {
        V2HorizontalPodAutoscalerBehavior behavior = mock(V2HorizontalPodAutoscalerBehavior.class);
        V2CrossVersionObjectReference scaleTargetRef = mock(V2CrossVersionObjectReference.class);
        List<V2MetricSpec> metrics = new ArrayList<>();
        metrics.add(mock(V2MetricSpec.class));
        V2HorizontalPodAutoscalerSpec spec = new V2HorizontalPodAutoscalerSpec().behavior(behavior).maxReplicas(5).metrics(metrics).minReplicas(2).scaleTargetRef(scaleTargetRef);
        assertEquals(behavior, spec.getBehavior());
        assertEquals(5, spec.getMaxReplicas());
        assertEquals(metrics, spec.getMetrics());
        assertEquals(2, spec.getMinReplicas());
        assertEquals(scaleTargetRef, spec.getScaleTargetRef());
    }
}
