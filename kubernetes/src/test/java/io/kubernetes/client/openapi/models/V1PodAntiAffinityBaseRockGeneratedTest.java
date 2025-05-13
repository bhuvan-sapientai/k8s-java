package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import io.kubernetes.client.openapi.models.V1PodAntiAffinity;
import io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.ArrayList;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.NullSource;
import io.kubernetes.client.openapi.models.V1PodAffinityTerm;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PodAntiAffinityBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1PodAntiAffinityConstructor}, hash: A5C4D9A773C570CFA51A102BCB84D417
    @Test
    void testV1PodAntiAffinityConstructor() {
        V1PodAntiAffinity podAntiAffinity = new V1PodAntiAffinity();
        assertNotNull(podAntiAffinity);
        assertNotNull(podAntiAffinity.getPreferredDuringSchedulingIgnoredDuringExecution());
        assertNotNull(podAntiAffinity.getRequiredDuringSchedulingIgnoredDuringExecution());
        assertTrue(podAntiAffinity.getPreferredDuringSchedulingIgnoredDuringExecution().isEmpty());
        assertTrue(podAntiAffinity.getRequiredDuringSchedulingIgnoredDuringExecution().isEmpty());
    }

    //BaseRock generated method id: ${testPreferredDuringSchedulingIgnoredDuringExecution}, hash: 7BD0F81491D289AEAEBB4DC40267BB59
    @Test
    void testPreferredDuringSchedulingIgnoredDuringExecution() {
        V1PodAntiAffinity podAntiAffinity = new V1PodAntiAffinity();
        List<V1WeightedPodAffinityTerm> terms = new ArrayList<>();
        terms.add(new V1WeightedPodAffinityTerm());
        podAntiAffinity.setPreferredDuringSchedulingIgnoredDuringExecution(terms);
        assertEquals(terms, podAntiAffinity.getPreferredDuringSchedulingIgnoredDuringExecution());
    }

    //BaseRock generated method id: ${testAddPreferredDuringSchedulingIgnoredDuringExecutionItem}, hash: EFB933802099A238A113464A70A2909E
    @Test
    void testAddPreferredDuringSchedulingIgnoredDuringExecutionItem() {
        V1PodAntiAffinity podAntiAffinity = new V1PodAntiAffinity();
        V1WeightedPodAffinityTerm term = new V1WeightedPodAffinityTerm();
        podAntiAffinity.addPreferredDuringSchedulingIgnoredDuringExecutionItem(term);
        assertEquals(1, podAntiAffinity.getPreferredDuringSchedulingIgnoredDuringExecution().size());
        assertEquals(term, podAntiAffinity.getPreferredDuringSchedulingIgnoredDuringExecution().get(0));
    }

    //BaseRock generated method id: ${testRequiredDuringSchedulingIgnoredDuringExecution}, hash: 66AB47AEC755196391C3EF03BEE0AA67
    @Test
    void testRequiredDuringSchedulingIgnoredDuringExecution() {
        V1PodAntiAffinity podAntiAffinity = new V1PodAntiAffinity();
        List<V1PodAffinityTerm> terms = new ArrayList<>();
        terms.add(new V1PodAffinityTerm());
        podAntiAffinity.setRequiredDuringSchedulingIgnoredDuringExecution(terms);
        assertEquals(terms, podAntiAffinity.getRequiredDuringSchedulingIgnoredDuringExecution());
    }

    //BaseRock generated method id: ${testAddRequiredDuringSchedulingIgnoredDuringExecutionItem}, hash: 8A7195B3A0CDC8E20623406ABB31C55A
    @Test
    void testAddRequiredDuringSchedulingIgnoredDuringExecutionItem() {
        V1PodAntiAffinity podAntiAffinity = new V1PodAntiAffinity();
        V1PodAffinityTerm term = new V1PodAffinityTerm();
        podAntiAffinity.addRequiredDuringSchedulingIgnoredDuringExecutionItem(term);
        assertEquals(1, podAntiAffinity.getRequiredDuringSchedulingIgnoredDuringExecution().size());
        assertEquals(term, podAntiAffinity.getRequiredDuringSchedulingIgnoredDuringExecution().get(0));
    }

    //BaseRock generated method id: ${testEquals}, hash: CC65EF6577B2D62286F7FA80B06B4CB4
    @Test
    void testEquals() {
        V1PodAntiAffinity podAntiAffinity1 = new V1PodAntiAffinity().preferredDuringSchedulingIgnoredDuringExecution(new ArrayList<>()).requiredDuringSchedulingIgnoredDuringExecution(new ArrayList<>());
        V1PodAntiAffinity podAntiAffinity2 = new V1PodAntiAffinity().preferredDuringSchedulingIgnoredDuringExecution(new ArrayList<>()).requiredDuringSchedulingIgnoredDuringExecution(new ArrayList<>());
        assertEquals(podAntiAffinity1, podAntiAffinity2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 529C3DBB52B0CDFDC3132AAE27C96868
    @Test
    void testHashCode() {
        V1PodAntiAffinity podAntiAffinity1 = new V1PodAntiAffinity().preferredDuringSchedulingIgnoredDuringExecution(new ArrayList<>()).requiredDuringSchedulingIgnoredDuringExecution(new ArrayList<>());
        V1PodAntiAffinity podAntiAffinity2 = new V1PodAntiAffinity().preferredDuringSchedulingIgnoredDuringExecution(new ArrayList<>()).requiredDuringSchedulingIgnoredDuringExecution(new ArrayList<>());
        assertEquals(podAntiAffinity1.hashCode(), podAntiAffinity2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: BF527ED4B46CA85DE29AA19EB30049A1
    @Test
    void testToString() {
        V1PodAntiAffinity podAntiAffinity = new V1PodAntiAffinity().preferredDuringSchedulingIgnoredDuringExecution(new ArrayList<>()).requiredDuringSchedulingIgnoredDuringExecution(new ArrayList<>());
        String toString = podAntiAffinity.toString();
        assertThat(toString, containsString("preferredDuringSchedulingIgnoredDuringExecution"));
        assertThat(toString, containsString("requiredDuringSchedulingIgnoredDuringExecution"));
    }

    //BaseRock generated method id: ${testNullAndEmptyInputForPreferredDuringSchedulingIgnoredDuringExecution}, hash: 4A047B18910E174709ADD50D124633B5
    @ParameterizedTest
    @NullSource
    @ValueSource(strings = { "", "  " })
    void testNullAndEmptyInputForPreferredDuringSchedulingIgnoredDuringExecution(String input) {
        V1PodAntiAffinity podAntiAffinity = new V1PodAntiAffinity();
        assertDoesNotThrow(() -> podAntiAffinity.setPreferredDuringSchedulingIgnoredDuringExecution(null));
        assertNull(podAntiAffinity.getPreferredDuringSchedulingIgnoredDuringExecution());
    }

    //BaseRock generated method id: ${testNullAndEmptyInputForRequiredDuringSchedulingIgnoredDuringExecution}, hash: A2241737D6861677CF36043426C0D313
    @ParameterizedTest
    @NullSource
    @ValueSource(strings = { "", "  " })
    void testNullAndEmptyInputForRequiredDuringSchedulingIgnoredDuringExecution(String input) {
        V1PodAntiAffinity podAntiAffinity = new V1PodAntiAffinity();
        assertDoesNotThrow(() -> podAntiAffinity.setRequiredDuringSchedulingIgnoredDuringExecution(null));
        assertNull(podAntiAffinity.getRequiredDuringSchedulingIgnoredDuringExecution());
    }
}
