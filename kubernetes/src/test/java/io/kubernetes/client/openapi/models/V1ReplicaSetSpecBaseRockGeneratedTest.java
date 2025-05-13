package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1LabelSelector;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class V1ReplicaSetSpecBaseRockGeneratedTest {

    private V1ReplicaSetSpec v1ReplicaSetSpec;

    @BeforeEach
    void setUp() {
        v1ReplicaSetSpec = new V1ReplicaSetSpec();
    }

    //BaseRock generated method id: ${testConstructor}, hash: E4E78E2F6855A564566870803B0B8AB9
    @Test
    void testConstructor() {
        assertNotNull(v1ReplicaSetSpec);
    }

    //BaseRock generated method id: ${testMinReadySeconds}, hash: 6CED538BF4A44222371E40457C201517
    @Test
    void testMinReadySeconds() {
        Integer minReadySeconds = 30;
        v1ReplicaSetSpec.setMinReadySeconds(minReadySeconds);
        assertEquals(minReadySeconds, v1ReplicaSetSpec.getMinReadySeconds());
    }

    //BaseRock generated method id: ${testReplicas}, hash: F93A24A2887D5E80ECF0CD1E4263ED5D
    @Test
    void testReplicas() {
        Integer replicas = 3;
        v1ReplicaSetSpec.setReplicas(replicas);
        assertEquals(replicas, v1ReplicaSetSpec.getReplicas());
    }

    //BaseRock generated method id: ${testSelector}, hash: 152C3724B37C868A8DA8C2C7B3A6CC5E
    @Test
    void testSelector() {
        V1LabelSelector selector = new V1LabelSelector();
        v1ReplicaSetSpec.setSelector(selector);
        assertEquals(selector, v1ReplicaSetSpec.getSelector());
    }

    //BaseRock generated method id: ${testTemplate}, hash: 9A66FB655281D9C4CC58548688F5E546
    @Test
    void testTemplate() {
        V1PodTemplateSpec template = new V1PodTemplateSpec();
        v1ReplicaSetSpec.setTemplate(template);
        assertEquals(template, v1ReplicaSetSpec.getTemplate());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 2C5398DD6A8E9D7E76C28B4349014D89
    @Test
    void testEqualsAndHashCode() {
        V1ReplicaSetSpec spec1 = new V1ReplicaSetSpec().minReadySeconds(30).replicas(3).selector(new V1LabelSelector()).template(new V1PodTemplateSpec());
        V1ReplicaSetSpec spec2 = new V1ReplicaSetSpec().minReadySeconds(30).replicas(3).selector(new V1LabelSelector()).template(new V1PodTemplateSpec());
        assertEquals(spec1, spec2);
        assertEquals(spec1.hashCode(), spec2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 7B033A2EB01B567CE31C5F125222CE21
    @Test
    void testToString() {
        v1ReplicaSetSpec.setMinReadySeconds(30);
        v1ReplicaSetSpec.setReplicas(3);
        v1ReplicaSetSpec.setSelector(new V1LabelSelector());
        v1ReplicaSetSpec.setTemplate(new V1PodTemplateSpec());
        String toString = v1ReplicaSetSpec.toString();
        assertThat(toString, containsString("minReadySeconds"));
        assertThat(toString, containsString("replicas"));
        assertThat(toString, containsString("selector"));
        assertThat(toString, containsString("template"));
    }

    //BaseRock generated method id: ${testMinReadySecondsWithDifferentValues}, hash: E13DD5255B216E397390C52D8EF9CAEE
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 10, 100 })
    void testMinReadySecondsWithDifferentValues(int minReadySeconds) {
        v1ReplicaSetSpec.setMinReadySeconds(minReadySeconds);
        assertEquals(minReadySeconds, v1ReplicaSetSpec.getMinReadySeconds());
    }

    //BaseRock generated method id: ${testReplicasWithDifferentValues}, hash: B2A52004A12C38A0AFF8231C7E662B6C
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 10, 100 })
    void testReplicasWithDifferentValues(int replicas) {
        v1ReplicaSetSpec.setReplicas(replicas);
        assertEquals(replicas, v1ReplicaSetSpec.getReplicas());
    }

    //BaseRock generated method id: ${testNullValues}, hash: 025599F6074CE5E7E76A4359407DC5C5
    @Test
    void testNullValues() {
        v1ReplicaSetSpec.setMinReadySeconds(null);
        v1ReplicaSetSpec.setReplicas(null);
        v1ReplicaSetSpec.setTemplate(null);
        assertNull(v1ReplicaSetSpec.getMinReadySeconds());
        assertNull(v1ReplicaSetSpec.getReplicas());
        assertNull(v1ReplicaSetSpec.getTemplate());
    }
}
