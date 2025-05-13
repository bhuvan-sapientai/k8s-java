package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1NodeAffinity;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1PodAntiAffinity;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.V1PodAffinity;
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
class V1AffinityBaseRockGeneratedTest {

    private V1Affinity v1Affinity;

    @BeforeEach
    void setUp() {
        v1Affinity = new V1Affinity();
    }

    //BaseRock generated method id: ${testNodeAffinity}, hash: 8D15D48F4808C5C05C269BBC172C907D
    @Test
    void testNodeAffinity() {
        V1NodeAffinity nodeAffinity = mock(V1NodeAffinity.class);
        v1Affinity.setNodeAffinity(nodeAffinity);
        assertEquals(nodeAffinity, v1Affinity.getNodeAffinity());
    }

    //BaseRock generated method id: ${testPodAffinity}, hash: D9CA7CB3849401206690392E9C5BDCEC
    @Test
    void testPodAffinity() {
        V1PodAffinity podAffinity = mock(V1PodAffinity.class);
        v1Affinity.setPodAffinity(podAffinity);
        assertEquals(podAffinity, v1Affinity.getPodAffinity());
    }

    //BaseRock generated method id: ${testPodAntiAffinity}, hash: D8A1DD9DE5B389C5B26A406352BD4A33
    @Test
    void testPodAntiAffinity() {
        V1PodAntiAffinity podAntiAffinity = mock(V1PodAntiAffinity.class);
        v1Affinity.setPodAntiAffinity(podAntiAffinity);
        assertEquals(podAntiAffinity, v1Affinity.getPodAntiAffinity());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 0B3732A3A104E2441BDD6C98E35BDCFB
    @Test
    void testEqualsAndHashCode() {
        V1NodeAffinity nodeAffinity = mock(V1NodeAffinity.class);
        V1PodAffinity podAffinity = mock(V1PodAffinity.class);
        V1PodAntiAffinity podAntiAffinity = mock(V1PodAntiAffinity.class);
        V1Affinity affinity1 = new V1Affinity().nodeAffinity(nodeAffinity).podAffinity(podAffinity).podAntiAffinity(podAntiAffinity);
        V1Affinity affinity2 = new V1Affinity().nodeAffinity(nodeAffinity).podAffinity(podAffinity).podAntiAffinity(podAntiAffinity);
        assertThat(affinity1, equalTo(affinity2));
        assertThat(affinity1.hashCode(), is(affinity2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 27C39126807D444B42D0046BBB777ACE
    @Test
    void testToString() {
        V1NodeAffinity nodeAffinity = mock(V1NodeAffinity.class);
        V1PodAffinity podAffinity = mock(V1PodAffinity.class);
        V1PodAntiAffinity podAntiAffinity = mock(V1PodAntiAffinity.class);
        when(nodeAffinity.toString()).thenReturn("mockNodeAffinity");
        when(podAffinity.toString()).thenReturn("mockPodAffinity");
        when(podAntiAffinity.toString()).thenReturn("mockPodAntiAffinity");
        v1Affinity.setNodeAffinity(nodeAffinity);
        v1Affinity.setPodAffinity(podAffinity);
        v1Affinity.setPodAntiAffinity(podAntiAffinity);
        String expected = "class V1Affinity {\n" + "    nodeAffinity: mockNodeAffinity\n" + "    podAffinity: mockPodAffinity\n" + "    podAntiAffinity: mockPodAntiAffinity\n" + "}";
        assertEquals(expected, v1Affinity.toString());
    }

    //BaseRock generated method id: ${testBuilder}, hash: 4ED1631B926652276D65252957E1EB56
    @Test
    void testBuilder() {
        V1NodeAffinity nodeAffinity = mock(V1NodeAffinity.class);
        V1PodAffinity podAffinity = mock(V1PodAffinity.class);
        V1PodAntiAffinity podAntiAffinity = mock(V1PodAntiAffinity.class);
        V1Affinity affinity = new V1Affinity().nodeAffinity(nodeAffinity).podAffinity(podAffinity).podAntiAffinity(podAntiAffinity);
        assertThat(affinity.getNodeAffinity(), is(nodeAffinity));
        assertThat(affinity.getPodAffinity(), is(podAffinity));
        assertThat(affinity.getPodAntiAffinity(), is(podAntiAffinity));
    }

    //BaseRock generated method id: ${testNoArgsConstructor}, hash: A05DE01DB284A8C9701B36B4EEC93073
    @Test
    void testNoArgsConstructor() {
        V1Affinity affinity = new V1Affinity();
        assertNotNull(affinity);
        assertThat(affinity.getNodeAffinity(), is(nullValue()));
        assertThat(affinity.getPodAffinity(), is(nullValue()));
        assertThat(affinity.getPodAntiAffinity(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetNodeAffinity}, hash: 351807DDBE21B1CD7540EC0704C47A2A
    @Test
    void testSetAndGetNodeAffinity() {
        V1NodeAffinity nodeAffinity = mock(V1NodeAffinity.class);
        v1Affinity.setNodeAffinity(nodeAffinity);
        assertThat(v1Affinity.getNodeAffinity(), is(notNullValue()));
        assertThat(v1Affinity.getNodeAffinity(), is(nodeAffinity));
    }

    //BaseRock generated method id: ${testSetAndGetPodAffinity}, hash: 8113E2A7DC0637905632404172DE0BB3
    @Test
    void testSetAndGetPodAffinity() {
        V1PodAffinity podAffinity = mock(V1PodAffinity.class);
        v1Affinity.setPodAffinity(podAffinity);
        assertThat(v1Affinity.getPodAffinity(), is(notNullValue()));
        assertThat(v1Affinity.getPodAffinity(), is(podAffinity));
    }

    //BaseRock generated method id: ${testSetAndGetPodAntiAffinity}, hash: 28BC98BF9F5407F81A65825F2DF2BA1A
    @Test
    void testSetAndGetPodAntiAffinity() {
        V1PodAntiAffinity podAntiAffinity = mock(V1PodAntiAffinity.class);
        v1Affinity.setPodAntiAffinity(podAntiAffinity);
        assertThat(v1Affinity.getPodAntiAffinity(), is(notNullValue()));
        assertThat(v1Affinity.getPodAntiAffinity(), is(podAntiAffinity));
    }
}
