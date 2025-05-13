package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.*;
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
class V1alpha1MutatingAdmissionPolicySpecBaseRockGeneratedTest {

    private V1alpha1MutatingAdmissionPolicySpec policySpec;

    @Mock
    private V1alpha1MatchResources mockMatchConstraints;

    @Mock
    private V1alpha1ParamKind mockParamKind;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        policySpec = new V1alpha1MutatingAdmissionPolicySpec();
    }

    //BaseRock generated method id: ${testSetAndGetFailurePolicy}, hash: 45727639C2B3D70B64C0D8A6C7133EBE
    @Test
    void testSetAndGetFailurePolicy() {
        String failurePolicy = "Ignore";
        policySpec.setFailurePolicy(failurePolicy);
        assertEquals(failurePolicy, policySpec.getFailurePolicy());
    }

    //BaseRock generated method id: ${testSetAndGetMatchConditions}, hash: 1D5E03F7F79D5B1D4A1BEB336E35E98C
    @Test
    void testSetAndGetMatchConditions() {
        List<V1alpha1MatchCondition> matchConditions = new ArrayList<>();
        V1alpha1MatchCondition condition = new V1alpha1MatchCondition();
        matchConditions.add(condition);
        policySpec.setMatchConditions(matchConditions);
        assertEquals(matchConditions, policySpec.getMatchConditions());
    }

    //BaseRock generated method id: ${testAddMatchConditionsItem}, hash: 3EC662583875EB817AD4E2B47EB53204
    @Test
    void testAddMatchConditionsItem() {
        V1alpha1MatchCondition condition = new V1alpha1MatchCondition();
        policySpec.addMatchConditionsItem(condition);
        assertTrue(policySpec.getMatchConditions().contains(condition));
    }

    //BaseRock generated method id: ${testSetAndGetMatchConstraints}, hash: 5DCD2546CCA6CA148B2B89F7BAB36542
    @Test
    void testSetAndGetMatchConstraints() {
        policySpec.setMatchConstraints(mockMatchConstraints);
        assertEquals(mockMatchConstraints, policySpec.getMatchConstraints());
    }

    //BaseRock generated method id: ${testSetAndGetMutations}, hash: DACA032042DFD7D1081B803659D78E4B
    @Test
    void testSetAndGetMutations() {
        List<V1alpha1Mutation> mutations = new ArrayList<>();
        V1alpha1Mutation mutation = new V1alpha1Mutation();
        mutations.add(mutation);
        policySpec.setMutations(mutations);
        assertEquals(mutations, policySpec.getMutations());
    }

    //BaseRock generated method id: ${testAddMutationsItem}, hash: AA8FCA9CF115E8ACA7F2CE59C2B72A5B
    @Test
    void testAddMutationsItem() {
        V1alpha1Mutation mutation = new V1alpha1Mutation();
        policySpec.addMutationsItem(mutation);
        assertTrue(policySpec.getMutations().contains(mutation));
    }

    //BaseRock generated method id: ${testSetAndGetParamKind}, hash: 49F86794FD4613F1A90442FB750016DF
    @Test
    void testSetAndGetParamKind() {
        policySpec.setParamKind(mockParamKind);
        assertEquals(mockParamKind, policySpec.getParamKind());
    }

    //BaseRock generated method id: ${testSetAndGetReinvocationPolicy}, hash: C0F51740CC166565BA6182FE96C6061E
    @Test
    void testSetAndGetReinvocationPolicy() {
        String reinvocationPolicy = "IfNeeded";
        policySpec.setReinvocationPolicy(reinvocationPolicy);
        assertEquals(reinvocationPolicy, policySpec.getReinvocationPolicy());
    }

    //BaseRock generated method id: ${testSetAndGetVariables}, hash: 86A1C0C3708835F1AD631FB1FF1602BE
    @Test
    void testSetAndGetVariables() {
        List<V1alpha1Variable> variables = new ArrayList<>();
        V1alpha1Variable variable = new V1alpha1Variable();
        variables.add(variable);
        policySpec.setVariables(variables);
        assertEquals(variables, policySpec.getVariables());
    }

    //BaseRock generated method id: ${testAddVariablesItem}, hash: B66EEB56317C3063CBC531A81195FFD5
    @Test
    void testAddVariablesItem() {
        V1alpha1Variable variable = new V1alpha1Variable();
        policySpec.addVariablesItem(variable);
        assertTrue(policySpec.getVariables().contains(variable));
    }

    //BaseRock generated method id: ${testEquals}, hash: 198C5111D8745899B443950AE7CB2E4A
    @Test
    void testEquals() {
        V1alpha1MutatingAdmissionPolicySpec spec1 = new V1alpha1MutatingAdmissionPolicySpec();
        V1alpha1MutatingAdmissionPolicySpec spec2 = new V1alpha1MutatingAdmissionPolicySpec();
        assertTrue(spec1.equals(spec2));
        spec1.setFailurePolicy("Ignore");
        assertFalse(spec1.equals(spec2));
        spec2.setFailurePolicy("Ignore");
        assertTrue(spec1.equals(spec2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: E09A18540291C5024A55CD8CB0CCDE64
    @Test
    void testHashCode() {
        V1alpha1MutatingAdmissionPolicySpec spec1 = new V1alpha1MutatingAdmissionPolicySpec();
        V1alpha1MutatingAdmissionPolicySpec spec2 = new V1alpha1MutatingAdmissionPolicySpec();
        assertEquals(spec1.hashCode(), spec2.hashCode());
        spec1.setFailurePolicy("Ignore");
        assertNotEquals(spec1.hashCode(), spec2.hashCode());
        spec2.setFailurePolicy("Ignore");
        assertEquals(spec1.hashCode(), spec2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 7DE73EA18D98E744432DAF87CDF4A9D4
    @Test
    void testToString() {
        V1alpha1MutatingAdmissionPolicySpec spec = new V1alpha1MutatingAdmissionPolicySpec().failurePolicy("Ignore").reinvocationPolicy("IfNeeded");
        String toString = spec.toString();
        assertTrue(toString.contains("failurePolicy: Ignore"));
        assertTrue(toString.contains("reinvocationPolicy: IfNeeded"));
    }
}
