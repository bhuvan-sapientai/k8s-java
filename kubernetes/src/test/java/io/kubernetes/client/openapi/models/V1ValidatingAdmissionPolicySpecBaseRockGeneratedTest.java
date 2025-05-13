package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1Validation;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1MatchResources;
import static org.hamcrest.Matchers.containsInAnyOrder;
import io.kubernetes.client.openapi.models.V1ParamKind;
import java.util.Arrays;
import io.kubernetes.client.openapi.models.V1MatchCondition;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1ValidatingAdmissionPolicySpec;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.V1Variable;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1AuditAnnotation;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ValidatingAdmissionPolicySpecBaseRockGeneratedTest {

    private V1ValidatingAdmissionPolicySpec validatingAdmissionPolicySpec;

    @BeforeEach
    void setUp() {
        validatingAdmissionPolicySpec = new V1ValidatingAdmissionPolicySpec();
    }

    //BaseRock generated method id: ${testAuditAnnotations}, hash: AB64C9F36E3CD8DF4F2C1AC1ADA87F61
    @Test
    void testAuditAnnotations() {
        List<V1AuditAnnotation> auditAnnotations = new ArrayList<>();
        V1AuditAnnotation annotation1 = mock(V1AuditAnnotation.class);
        V1AuditAnnotation annotation2 = mock(V1AuditAnnotation.class);
        auditAnnotations.add(annotation1);
        auditAnnotations.add(annotation2);
        validatingAdmissionPolicySpec.setAuditAnnotations(auditAnnotations);
        assertThat(validatingAdmissionPolicySpec.getAuditAnnotations(), is(notNullValue()));
        assertThat(validatingAdmissionPolicySpec.getAuditAnnotations(), hasSize(2));
        assertThat(validatingAdmissionPolicySpec.getAuditAnnotations(), containsInAnyOrder(annotation1, annotation2));
    }

    //BaseRock generated method id: ${testFailurePolicy}, hash: F8C0B818C65677E5BDE88D3089F0A694
    @Test
    void testFailurePolicy() {
        String failurePolicy = "Fail";
        validatingAdmissionPolicySpec.setFailurePolicy(failurePolicy);
        assertEquals(failurePolicy, validatingAdmissionPolicySpec.getFailurePolicy());
    }

    //BaseRock generated method id: ${testMatchConditions}, hash: 5B914B83AD439B33C4049AD2684276C5
    @Test
    void testMatchConditions() {
        List<V1MatchCondition> matchConditions = new ArrayList<>();
        V1MatchCondition condition1 = mock(V1MatchCondition.class);
        V1MatchCondition condition2 = mock(V1MatchCondition.class);
        matchConditions.add(condition1);
        matchConditions.add(condition2);
        validatingAdmissionPolicySpec.setMatchConditions(matchConditions);
        assertThat(validatingAdmissionPolicySpec.getMatchConditions(), is(notNullValue()));
        assertThat(validatingAdmissionPolicySpec.getMatchConditions(), hasSize(2));
        assertThat(validatingAdmissionPolicySpec.getMatchConditions(), containsInAnyOrder(condition1, condition2));
    }

    //BaseRock generated method id: ${testMatchConstraints}, hash: 8D6976BCDA3BE51DDD704AEA30A93114
    @Test
    void testMatchConstraints() {
        V1MatchResources matchConstraints = mock(V1MatchResources.class);
        validatingAdmissionPolicySpec.setMatchConstraints(matchConstraints);
        assertEquals(matchConstraints, validatingAdmissionPolicySpec.getMatchConstraints());
    }

    //BaseRock generated method id: ${testParamKind}, hash: 62401CA97D7BB43061A315D7E8230313
    @Test
    void testParamKind() {
        V1ParamKind paramKind = mock(V1ParamKind.class);
        validatingAdmissionPolicySpec.setParamKind(paramKind);
        assertEquals(paramKind, validatingAdmissionPolicySpec.getParamKind());
    }

    //BaseRock generated method id: ${testValidations}, hash: A42498E56A45E7E6A57C04646A833C8A
    @Test
    void testValidations() {
        List<V1Validation> validations = new ArrayList<>();
        V1Validation validation1 = mock(V1Validation.class);
        V1Validation validation2 = mock(V1Validation.class);
        validations.add(validation1);
        validations.add(validation2);
        validatingAdmissionPolicySpec.setValidations(validations);
        assertThat(validatingAdmissionPolicySpec.getValidations(), is(notNullValue()));
        assertThat(validatingAdmissionPolicySpec.getValidations(), hasSize(2));
        assertThat(validatingAdmissionPolicySpec.getValidations(), containsInAnyOrder(validation1, validation2));
    }

    //BaseRock generated method id: ${testVariables}, hash: 44A60D95ED68C82EAB0E2EF3A00DF2B2
    @Test
    void testVariables() {
        List<V1Variable> variables = new ArrayList<>();
        V1Variable variable1 = mock(V1Variable.class);
        V1Variable variable2 = mock(V1Variable.class);
        variables.add(variable1);
        variables.add(variable2);
        validatingAdmissionPolicySpec.setVariables(variables);
        assertThat(validatingAdmissionPolicySpec.getVariables(), is(notNullValue()));
        assertThat(validatingAdmissionPolicySpec.getVariables(), hasSize(2));
        assertThat(validatingAdmissionPolicySpec.getVariables(), containsInAnyOrder(variable1, variable2));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 096E5C3125D7656EC6807DC0D811920E
    @Test
    void testEqualsAndHashCode() {
        V1ValidatingAdmissionPolicySpec spec1 = new V1ValidatingAdmissionPolicySpec().auditAnnotations(Arrays.asList(new V1AuditAnnotation().key("key1").valueExpression("exp1"))).failurePolicy("Fail").matchConditions(Arrays.asList(new V1MatchCondition().name("condition1").expression("exp1"))).matchConstraints(new V1MatchResources()).paramKind(new V1ParamKind().apiVersion("v1").kind("Kind")).validations(Arrays.asList(new V1Validation().expression("exp1"))).variables(Arrays.asList(new V1Variable().name("var1").expression("exp1")));
        V1ValidatingAdmissionPolicySpec spec2 = new V1ValidatingAdmissionPolicySpec().auditAnnotations(Arrays.asList(new V1AuditAnnotation().key("key1").valueExpression("exp1"))).failurePolicy("Fail").matchConditions(Arrays.asList(new V1MatchCondition().name("condition1").expression("exp1"))).matchConstraints(new V1MatchResources()).paramKind(new V1ParamKind().apiVersion("v1").kind("Kind")).validations(Arrays.asList(new V1Validation().expression("exp1"))).variables(Arrays.asList(new V1Variable().name("var1").expression("exp1")));
        assertThat(spec1, equalTo(spec2));
        assertThat(spec1.hashCode(), equalTo(spec2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: AE82391B8E0D6A950FC781F04B35D47E
    @Test
    void testToString() {
        V1ValidatingAdmissionPolicySpec spec = new V1ValidatingAdmissionPolicySpec().auditAnnotations(Arrays.asList(new V1AuditAnnotation().key("key1").valueExpression("exp1"))).failurePolicy("Fail").matchConditions(Arrays.asList(new V1MatchCondition().name("condition1").expression("exp1"))).matchConstraints(new V1MatchResources()).paramKind(new V1ParamKind().apiVersion("v1").kind("Kind")).validations(Arrays.asList(new V1Validation().expression("exp1"))).variables(Arrays.asList(new V1Variable().name("var1").expression("exp1")));
        String result = spec.toString();
        assertNotNull(result);
        assertThat(result.contains("auditAnnotations"), is(true));
        assertThat(result.contains("failurePolicy"), is(true));
        assertThat(result.contains("matchConditions"), is(true));
        assertThat(result.contains("matchConstraints"), is(true));
        assertThat(result.contains("paramKind"), is(true));
        assertThat(result.contains("validations"), is(true));
        assertThat(result.contains("variables"), is(true));
    }
}
