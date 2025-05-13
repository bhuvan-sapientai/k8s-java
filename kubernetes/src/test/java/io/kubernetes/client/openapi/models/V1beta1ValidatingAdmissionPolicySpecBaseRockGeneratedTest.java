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
class V1beta1ValidatingAdmissionPolicySpecBaseRockGeneratedTest {

    @Mock
    private V1beta1AuditAnnotation mockAuditAnnotation;

    @Mock
    private V1beta1MatchCondition mockMatchCondition;

    @Mock
    private V1beta1MatchResources mockMatchConstraints;

    @Mock
    private V1beta1ParamKind mockParamKind;

    @Mock
    private V1beta1Validation mockValidation;

    @Mock
    private V1beta1Variable mockVariable;

    private V1beta1ValidatingAdmissionPolicySpec validatingAdmissionPolicySpec;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        validatingAdmissionPolicySpec = new V1beta1ValidatingAdmissionPolicySpec();
    }

    //BaseRock generated method id: ${testAuditAnnotations}, hash: 640B99278DFC61DF01C1DF8041ADA0C1
    @Test
    void testAuditAnnotations() {
        List<V1beta1AuditAnnotation> auditAnnotations = new ArrayList<>();
        auditAnnotations.add(mockAuditAnnotation);
        validatingAdmissionPolicySpec.setAuditAnnotations(auditAnnotations);
        assertEquals(auditAnnotations, validatingAdmissionPolicySpec.getAuditAnnotations());
        validatingAdmissionPolicySpec.addAuditAnnotationsItem(mockAuditAnnotation);
        assertEquals(2, validatingAdmissionPolicySpec.getAuditAnnotations().size());
    }

    //BaseRock generated method id: ${testFailurePolicy}, hash: F8C0B818C65677E5BDE88D3089F0A694
    @Test
    void testFailurePolicy() {
        String failurePolicy = "Fail";
        validatingAdmissionPolicySpec.setFailurePolicy(failurePolicy);
        assertEquals(failurePolicy, validatingAdmissionPolicySpec.getFailurePolicy());
    }

    //BaseRock generated method id: ${testMatchConditions}, hash: 8FEA9320B24CADFF5DD00650F80E0E0E
    @Test
    void testMatchConditions() {
        List<V1beta1MatchCondition> matchConditions = new ArrayList<>();
        matchConditions.add(mockMatchCondition);
        validatingAdmissionPolicySpec.setMatchConditions(matchConditions);
        assertEquals(matchConditions, validatingAdmissionPolicySpec.getMatchConditions());
        validatingAdmissionPolicySpec.addMatchConditionsItem(mockMatchCondition);
        assertEquals(2, validatingAdmissionPolicySpec.getMatchConditions().size());
    }

    //BaseRock generated method id: ${testMatchConstraints}, hash: 4F1E3FF2449A11E1BA736BA2945CBE47
    @Test
    void testMatchConstraints() {
        validatingAdmissionPolicySpec.setMatchConstraints(mockMatchConstraints);
        assertEquals(mockMatchConstraints, validatingAdmissionPolicySpec.getMatchConstraints());
    }

    //BaseRock generated method id: ${testParamKind}, hash: 50A5049F926BA7E8EE0AB10B2687CB36
    @Test
    void testParamKind() {
        validatingAdmissionPolicySpec.setParamKind(mockParamKind);
        assertEquals(mockParamKind, validatingAdmissionPolicySpec.getParamKind());
    }

    //BaseRock generated method id: ${testValidations}, hash: 6B1993382FE3874DB90CBE06C3EBADA6
    @Test
    void testValidations() {
        List<V1beta1Validation> validations = new ArrayList<>();
        validations.add(mockValidation);
        validatingAdmissionPolicySpec.setValidations(validations);
        assertEquals(validations, validatingAdmissionPolicySpec.getValidations());
        validatingAdmissionPolicySpec.addValidationsItem(mockValidation);
        assertEquals(2, validatingAdmissionPolicySpec.getValidations().size());
    }

    //BaseRock generated method id: ${testVariables}, hash: 3409161914ABA5398BCB9FD20AB3502C
    @Test
    void testVariables() {
        List<V1beta1Variable> variables = new ArrayList<>();
        variables.add(mockVariable);
        validatingAdmissionPolicySpec.setVariables(variables);
        assertEquals(variables, validatingAdmissionPolicySpec.getVariables());
        validatingAdmissionPolicySpec.addVariablesItem(mockVariable);
        assertEquals(2, validatingAdmissionPolicySpec.getVariables().size());
    }

    //BaseRock generated method id: ${testEquals}, hash: 22D3E574D6BA73829E5FBDD647C24B69
    @Test
    void testEquals() {
        V1beta1ValidatingAdmissionPolicySpec spec1 = new V1beta1ValidatingAdmissionPolicySpec();
        V1beta1ValidatingAdmissionPolicySpec spec2 = new V1beta1ValidatingAdmissionPolicySpec();
        assertTrue(spec1.equals(spec2));
        assertEquals(spec1.hashCode(), spec2.hashCode());
        spec1.setFailurePolicy("Fail");
        assertFalse(spec1.equals(spec2));
    }

    //BaseRock generated method id: ${testToString}, hash: 44EE17C514C4A0B8C4B059B30877499A
    @Test
    void testToString() {
        assertNotNull(validatingAdmissionPolicySpec.toString());
        assertTrue(validatingAdmissionPolicySpec.toString().contains("V1beta1ValidatingAdmissionPolicySpec"));
    }
}
