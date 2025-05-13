package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1PodAffinityTerm;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PodAffinityBaseRockGeneratedTest {

    private V1PodAffinity v1PodAffinity;

    @BeforeEach
    void setUp() {
        v1PodAffinity = new V1PodAffinity();
    }

    //BaseRock generated method id: ${testConstructor}, hash: A24FAE5B831F7A4F848E44A727297E12
    @Test
    void testConstructor() {
        assertThat(v1PodAffinity, is(notNullValue()));
    }

    //BaseRock generated method id: ${testPreferredDuringSchedulingIgnoredDuringExecution}, hash: 552E18EE4CB336C963695DFA9DF5D382
    @Test
    void testPreferredDuringSchedulingIgnoredDuringExecution() {
        List<V1WeightedPodAffinityTerm> preferredTerms = new ArrayList<>();
        V1WeightedPodAffinityTerm term1 = mock(V1WeightedPodAffinityTerm.class);
        V1WeightedPodAffinityTerm term2 = mock(V1WeightedPodAffinityTerm.class);
        preferredTerms.add(term1);
        preferredTerms.add(term2);
        v1PodAffinity.setPreferredDuringSchedulingIgnoredDuringExecution(preferredTerms);
        assertThat(v1PodAffinity.getPreferredDuringSchedulingIgnoredDuringExecution(), is(equalTo(preferredTerms)));
        assertThat(v1PodAffinity.getPreferredDuringSchedulingIgnoredDuringExecution(), hasSize(2));
    }

    //BaseRock generated method id: ${testAddPreferredDuringSchedulingIgnoredDuringExecutionItem}, hash: 7F30569288E74EEEC2C992017081829E
    @Test
    void testAddPreferredDuringSchedulingIgnoredDuringExecutionItem() {
        V1WeightedPodAffinityTerm term = mock(V1WeightedPodAffinityTerm.class);
        v1PodAffinity.addPreferredDuringSchedulingIgnoredDuringExecutionItem(term);
        assertThat(v1PodAffinity.getPreferredDuringSchedulingIgnoredDuringExecution(), hasSize(1));
        assertThat(v1PodAffinity.getPreferredDuringSchedulingIgnoredDuringExecution().get(0), is(equalTo(term)));
    }

    //BaseRock generated method id: ${testRequiredDuringSchedulingIgnoredDuringExecution}, hash: 1C4A77DBCFC957DFF47FFF209DD6FD43
    @Test
    void testRequiredDuringSchedulingIgnoredDuringExecution() {
        List<V1PodAffinityTerm> requiredTerms = new ArrayList<>();
        V1PodAffinityTerm term1 = mock(V1PodAffinityTerm.class);
        V1PodAffinityTerm term2 = mock(V1PodAffinityTerm.class);
        requiredTerms.add(term1);
        requiredTerms.add(term2);
        v1PodAffinity.setRequiredDuringSchedulingIgnoredDuringExecution(requiredTerms);
        assertThat(v1PodAffinity.getRequiredDuringSchedulingIgnoredDuringExecution(), is(equalTo(requiredTerms)));
        assertThat(v1PodAffinity.getRequiredDuringSchedulingIgnoredDuringExecution(), hasSize(2));
    }

    //BaseRock generated method id: ${testAddRequiredDuringSchedulingIgnoredDuringExecutionItem}, hash: 02F2D736EEB279E26998AE9C7F11A450
    @Test
    void testAddRequiredDuringSchedulingIgnoredDuringExecutionItem() {
        V1PodAffinityTerm term = mock(V1PodAffinityTerm.class);
        v1PodAffinity.addRequiredDuringSchedulingIgnoredDuringExecutionItem(term);
        assertThat(v1PodAffinity.getRequiredDuringSchedulingIgnoredDuringExecution(), hasSize(1));
        assertThat(v1PodAffinity.getRequiredDuringSchedulingIgnoredDuringExecution().get(0), is(equalTo(term)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 67332D225BF329CBCCFBA8D97D4D96D1
    @Test
    void testEquals() {
        V1PodAffinity podAffinity1 = new V1PodAffinity();
        V1PodAffinity podAffinity2 = new V1PodAffinity();
        assertTrue(podAffinity1.equals(podAffinity2));
        assertEquals(podAffinity1.hashCode(), podAffinity2.hashCode());
        List<V1WeightedPodAffinityTerm> preferredTerms = new ArrayList<>();
        preferredTerms.add(mock(V1WeightedPodAffinityTerm.class));
        podAffinity1.setPreferredDuringSchedulingIgnoredDuringExecution(preferredTerms);
        assertFalse(podAffinity1.equals(podAffinity2));
        assertNotEquals(podAffinity1.hashCode(), podAffinity2.hashCode());
        podAffinity2.setPreferredDuringSchedulingIgnoredDuringExecution(preferredTerms);
        assertTrue(podAffinity1.equals(podAffinity2));
        assertEquals(podAffinity1.hashCode(), podAffinity2.hashCode());
        List<V1PodAffinityTerm> requiredTerms = new ArrayList<>();
        requiredTerms.add(mock(V1PodAffinityTerm.class));
        podAffinity1.setRequiredDuringSchedulingIgnoredDuringExecution(requiredTerms);
        assertFalse(podAffinity1.equals(podAffinity2));
        assertNotEquals(podAffinity1.hashCode(), podAffinity2.hashCode());
        podAffinity2.setRequiredDuringSchedulingIgnoredDuringExecution(requiredTerms);
        assertTrue(podAffinity1.equals(podAffinity2));
        assertEquals(podAffinity1.hashCode(), podAffinity2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: E608168169DFE666B3C32B0F4991BFCF
    @Test
    void testToString() {
        V1WeightedPodAffinityTerm preferredTerm = mock(V1WeightedPodAffinityTerm.class);
        when(preferredTerm.toString()).thenReturn("preferredTerm");
        V1PodAffinityTerm requiredTerm = mock(V1PodAffinityTerm.class);
        when(requiredTerm.toString()).thenReturn("requiredTerm");
        v1PodAffinity.setPreferredDuringSchedulingIgnoredDuringExecution(Arrays.asList(preferredTerm));
        v1PodAffinity.setRequiredDuringSchedulingIgnoredDuringExecution(Arrays.asList(requiredTerm));
        String toString = v1PodAffinity.toString();
        assertThat(toString, containsString("class V1PodAffinity {"));
        assertThat(toString, containsString("preferredDuringSchedulingIgnoredDuringExecution: [preferredTerm]"));
        assertThat(toString, containsString("requiredDuringSchedulingIgnoredDuringExecution: [requiredTerm]"));
        assertThat(toString, containsString("}"));
    }
}
