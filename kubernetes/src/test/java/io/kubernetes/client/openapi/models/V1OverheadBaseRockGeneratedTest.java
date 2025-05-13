package io.kubernetes.client.openapi.models;

import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.custom.Quantity;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1Overhead;
import static org.hamcrest.Matchers.hasEntry;
import java.util.HashMap;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1OverheadBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1OverheadConstructor}, hash: 1DEBC7DA42AB5338CFFF24E7F250BDB3
    @Test
    void testV1OverheadConstructor() {
        V1Overhead overhead = new V1Overhead();
        assertNotNull(overhead);
    }

    //BaseRock generated method id: ${testPodFixedSetter}, hash: 99321F490256C861E5C4E67DEBB418C9
    @Test
    void testPodFixedSetter() {
        V1Overhead overhead = new V1Overhead();
        Map<String, Quantity> podFixed = new HashMap<>();
        podFixed.put("cpu", new Quantity("100m"));
        podFixed.put("memory", new Quantity("128Mi"));
        overhead.setPodFixed(podFixed);
        assertEquals(podFixed, overhead.getPodFixed());
    }

    //BaseRock generated method id: ${testPodFixedGetter}, hash: F1BD70A6FC410D5A82DB9388773CF5F1
    @Test
    void testPodFixedGetter() {
        V1Overhead overhead = new V1Overhead();
        Map<String, Quantity> podFixed = new HashMap<>();
        podFixed.put("cpu", new Quantity("100m"));
        podFixed.put("memory", new Quantity("128Mi"));
        overhead.setPodFixed(podFixed);
        Map<String, Quantity> retrievedPodFixed = overhead.getPodFixed();
        assertThat(retrievedPodFixed, is(notNullValue()));
        assertThat(retrievedPodFixed.size(), is(2));
        assertThat(retrievedPodFixed, hasEntry("cpu", new Quantity("100m")));
        assertThat(retrievedPodFixed, hasEntry("memory", new Quantity("128Mi")));
    }

    //BaseRock generated method id: ${testPutPodFixedItem}, hash: 458E3E5EB12122A2096B9DFA3621597C
    @Test
    void testPutPodFixedItem() {
        V1Overhead overhead = new V1Overhead();
        overhead.putPodFixedItem("cpu", new Quantity("100m"));
        Map<String, Quantity> podFixed = overhead.getPodFixed();
        assertThat(podFixed, is(notNullValue()));
        assertThat(podFixed.size(), is(1));
        assertThat(podFixed, hasEntry("cpu", new Quantity("100m")));
    }

    //BaseRock generated method id: ${testEquals}, hash: 3D65CFA977A86AA641D871249ED2FFBB
    @Test
    void testEquals() {
        V1Overhead overhead1 = new V1Overhead();
        V1Overhead overhead2 = new V1Overhead();
        Map<String, Quantity> podFixed = new HashMap<>();
        podFixed.put("cpu", new Quantity("100m"));
        podFixed.put("memory", new Quantity("128Mi"));
        overhead1.setPodFixed(podFixed);
        overhead2.setPodFixed(podFixed);
        assertThat(overhead1, is(equalTo(overhead2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 820E5530C6EAE38D18FCF40B158C29B2
    @Test
    void testHashCode() {
        V1Overhead overhead1 = new V1Overhead();
        V1Overhead overhead2 = new V1Overhead();
        Map<String, Quantity> podFixed = new HashMap<>();
        podFixed.put("cpu", new Quantity("100m"));
        podFixed.put("memory", new Quantity("128Mi"));
        overhead1.setPodFixed(podFixed);
        overhead2.setPodFixed(podFixed);
        assertThat(overhead1.hashCode(), is(equalTo(overhead2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 8FBC9F26DA3E7D3B1B7AE85A1CAC1F7C
    @Test
    void testToString() {
        V1Overhead overhead = new V1Overhead();
        Map<String, Quantity> podFixed = new HashMap<>();
        podFixed.put("cpu", new Quantity("100m"));
        podFixed.put("memory", new Quantity("128Mi"));
        overhead.setPodFixed(podFixed);
        String toString = overhead.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("class V1Overhead"), is(true));
        assertThat(toString.contains("podFixed"), is(true));
    }
}
