package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import java.util.List;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.mockito.Mock;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1NodeAffinityBaseRockGeneratedTest {

    @Mock
    private V1NodeSelector mockNodeSelector;

    @Mock
    private V1PreferredSchedulingTerm mockPreferredSchedulingTerm;

    private V1NodeAffinity nodeAffinity;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        nodeAffinity = new V1NodeAffinity();
    }

    //BaseRock generated method id: ${testPreferredDuringSchedulingIgnoredDuringExecution}, hash: 13EA3B28A778F0EC34B0B0E9B3F77696
    @Test
    void testPreferredDuringSchedulingIgnoredDuringExecution() {
        List<V1PreferredSchedulingTerm> preferredTerms = new ArrayList<>();
        preferredTerms.add(mockPreferredSchedulingTerm);
        nodeAffinity.setPreferredDuringSchedulingIgnoredDuringExecution(preferredTerms);
        assertEquals(preferredTerms, nodeAffinity.getPreferredDuringSchedulingIgnoredDuringExecution());
    }

    //BaseRock generated method id: ${testAddPreferredDuringSchedulingIgnoredDuringExecutionItem}, hash: F2EB166C81E6BD47A454544E867C23BC
    @Test
    void testAddPreferredDuringSchedulingIgnoredDuringExecutionItem() {
        nodeAffinity.addPreferredDuringSchedulingIgnoredDuringExecutionItem(mockPreferredSchedulingTerm);
        List<V1PreferredSchedulingTerm> result = nodeAffinity.getPreferredDuringSchedulingIgnoredDuringExecution();
        assertEquals(1, result.size());
        assertEquals(mockPreferredSchedulingTerm, result.get(0));
    }

    //BaseRock generated method id: ${testRequiredDuringSchedulingIgnoredDuringExecution}, hash: 24C917C5EE45A575F2BBDE2B2C97C3DA
    @Test
    void testRequiredDuringSchedulingIgnoredDuringExecution() {
        nodeAffinity.setRequiredDuringSchedulingIgnoredDuringExecution(mockNodeSelector);
        assertEquals(mockNodeSelector, nodeAffinity.getRequiredDuringSchedulingIgnoredDuringExecution());
    }

    //BaseRock generated method id: ${testEquals}, hash: BEAA0711B9D27683D6DFBB2409F4EB50
    @Test
    void testEquals() {
        V1NodeAffinity nodeAffinity1 = new V1NodeAffinity().preferredDuringSchedulingIgnoredDuringExecution(new ArrayList<>()).requiredDuringSchedulingIgnoredDuringExecution(new V1NodeSelector());
        V1NodeAffinity nodeAffinity2 = new V1NodeAffinity().preferredDuringSchedulingIgnoredDuringExecution(new ArrayList<>()).requiredDuringSchedulingIgnoredDuringExecution(new V1NodeSelector());
        assertEquals(nodeAffinity1, nodeAffinity2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 5255075DE9AE99447FCA973B39A72749
    @Test
    void testHashCode() {
        V1NodeAffinity nodeAffinity1 = new V1NodeAffinity().preferredDuringSchedulingIgnoredDuringExecution(new ArrayList<>()).requiredDuringSchedulingIgnoredDuringExecution(new V1NodeSelector());
        V1NodeAffinity nodeAffinity2 = new V1NodeAffinity().preferredDuringSchedulingIgnoredDuringExecution(new ArrayList<>()).requiredDuringSchedulingIgnoredDuringExecution(new V1NodeSelector());
        assertEquals(nodeAffinity1.hashCode(), nodeAffinity2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 00BCDE875A9E6786BC6E341713C35CE1
    @Test
    void testToString() {
        V1NodeAffinity nodeAffinity = new V1NodeAffinity().preferredDuringSchedulingIgnoredDuringExecution(new ArrayList<>()).requiredDuringSchedulingIgnoredDuringExecution(new V1NodeSelector());
        String result = nodeAffinity.toString();
        assertTrue(result.contains("preferredDuringSchedulingIgnoredDuringExecution"));
        assertTrue(result.contains("requiredDuringSchedulingIgnoredDuringExecution"));
    }
}
