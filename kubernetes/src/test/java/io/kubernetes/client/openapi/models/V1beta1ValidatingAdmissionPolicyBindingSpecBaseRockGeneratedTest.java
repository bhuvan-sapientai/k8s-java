package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import io.kubernetes.client.openapi.models.V1beta1MatchResources;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1beta1ParamRef;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1ValidatingAdmissionPolicyBindingSpecBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: D1F52AF82DADB0B8C72C57137681BBFD
    @Test
    void testConstructor() {
        V1beta1ValidatingAdmissionPolicyBindingSpec spec = new V1beta1ValidatingAdmissionPolicyBindingSpec();
        assertThat(spec, is(notNullValue()));
    }

    //BaseRock generated method id: ${testMatchResources}, hash: 46E8D534713B4D53E7291CF1A83B900A
    @Test
    void testMatchResources() {
        V1beta1ValidatingAdmissionPolicyBindingSpec spec = new V1beta1ValidatingAdmissionPolicyBindingSpec();
        V1beta1MatchResources matchResources = new V1beta1MatchResources();
        spec.setMatchResources(matchResources);
        assertEquals(matchResources, spec.getMatchResources());
    }

    //BaseRock generated method id: ${testParamRef}, hash: 67450D2A2E3C25C77BB2616AAF9AE7B6
    @Test
    void testParamRef() {
        V1beta1ValidatingAdmissionPolicyBindingSpec spec = new V1beta1ValidatingAdmissionPolicyBindingSpec();
        V1beta1ParamRef paramRef = new V1beta1ParamRef();
        spec.setParamRef(paramRef);
        assertEquals(paramRef, spec.getParamRef());
    }

    //BaseRock generated method id: ${testPolicyName}, hash: 2936B8A2A95FEC8A20D485DFE373AD8E
    @Test
    void testPolicyName() {
        V1beta1ValidatingAdmissionPolicyBindingSpec spec = new V1beta1ValidatingAdmissionPolicyBindingSpec();
        String policyName = "testPolicy";
        spec.setPolicyName(policyName);
        assertEquals(policyName, spec.getPolicyName());
    }

    //BaseRock generated method id: ${testValidationActions}, hash: A07519F87F2472D08DB3B86C481C31D3
    @Test
    void testValidationActions() {
        V1beta1ValidatingAdmissionPolicyBindingSpec spec = new V1beta1ValidatingAdmissionPolicyBindingSpec();
        List<String> actions = Arrays.asList("Deny", "Warn", "Audit");
        spec.setValidationActions(actions);
        assertThat(spec.getValidationActions(), containsInAnyOrder(actions.toArray()));
    }

    //BaseRock generated method id: ${testAddValidationActionsItem}, hash: 7006DF094E147F67A5F1EBECB0569062
    @Test
    void testAddValidationActionsItem() {
        V1beta1ValidatingAdmissionPolicyBindingSpec spec = new V1beta1ValidatingAdmissionPolicyBindingSpec();
        String action = "Deny";
        spec.addValidationActionsItem(action);
        assertThat(spec.getValidationActions(), hasSize(1));
        assertThat(spec.getValidationActions().get(0), is(equalTo(action)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 01D1E271CA9979D32DCAA921D9B77BBA
    @Test
    void testEquals() {
        V1beta1ValidatingAdmissionPolicyBindingSpec spec1 = new V1beta1ValidatingAdmissionPolicyBindingSpec().matchResources(new V1beta1MatchResources()).paramRef(new V1beta1ParamRef()).policyName("testPolicy").validationActions(Arrays.asList("Deny", "Warn"));
        V1beta1ValidatingAdmissionPolicyBindingSpec spec2 = new V1beta1ValidatingAdmissionPolicyBindingSpec().matchResources(new V1beta1MatchResources()).paramRef(new V1beta1ParamRef()).policyName("testPolicy").validationActions(Arrays.asList("Deny", "Warn"));
        assertEquals(spec1, spec2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: F8869814D9CAD8A7A8918C4B4A75F9AE
    @Test
    void testHashCode() {
        V1beta1ValidatingAdmissionPolicyBindingSpec spec1 = new V1beta1ValidatingAdmissionPolicyBindingSpec().matchResources(new V1beta1MatchResources()).paramRef(new V1beta1ParamRef()).policyName("testPolicy").validationActions(Arrays.asList("Deny", "Warn"));
        V1beta1ValidatingAdmissionPolicyBindingSpec spec2 = new V1beta1ValidatingAdmissionPolicyBindingSpec().matchResources(new V1beta1MatchResources()).paramRef(new V1beta1ParamRef()).policyName("testPolicy").validationActions(Arrays.asList("Deny", "Warn"));
        assertEquals(spec1.hashCode(), spec2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 014C39C4BEDFB422A2F123F377BDB666
    @Test
    void testToString() {
        V1beta1ValidatingAdmissionPolicyBindingSpec spec = new V1beta1ValidatingAdmissionPolicyBindingSpec().matchResources(new V1beta1MatchResources()).paramRef(new V1beta1ParamRef()).policyName("testPolicy").validationActions(Arrays.asList("Deny", "Warn"));
        String toString = spec.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("matchResources"), is(true));
        assertThat(toString.contains("paramRef"), is(true));
        assertThat(toString.contains("policyName"), is(true));
        assertThat(toString.contains("validationActions"), is(true));
    }

    //BaseRock generated method id: ${testValidationActionsWithDifferentValues}, hash: 49211E7E412F6E0EDECD93BBCBA718A0
    @ParameterizedTest
    @ValueSource(strings = { "Deny", "Warn", "Audit" })
    void testValidationActionsWithDifferentValues(String action) {
        V1beta1ValidatingAdmissionPolicyBindingSpec spec = new V1beta1ValidatingAdmissionPolicyBindingSpec();
        spec.addValidationActionsItem(action);
        assertThat(spec.getValidationActions(), hasSize(1));
        assertThat(spec.getValidationActions().get(0), is(equalTo(action)));
    }

    //BaseRock generated method id: ${testNullValidationActions}, hash: 5FC3A58D66721ECFADE33069C8F68D9A
    @Test
    void testNullValidationActions() {
        V1beta1ValidatingAdmissionPolicyBindingSpec spec = new V1beta1ValidatingAdmissionPolicyBindingSpec();
        spec.setValidationActions(null);
        assertThat(spec.getValidationActions(), is(nullValue()));
    }

    //BaseRock generated method id: ${testEmptyValidationActions}, hash: 284F91F19AB906F45D0B789CB047B327
    @Test
    void testEmptyValidationActions() {
        V1beta1ValidatingAdmissionPolicyBindingSpec spec = new V1beta1ValidatingAdmissionPolicyBindingSpec();
        spec.setValidationActions(new ArrayList<>());
        assertThat(spec.getValidationActions(), hasSize(0));
    }

    //BaseRock generated method id: ${testAddValidationActionsItemToNull}, hash: 3943406BF8B95BC430886FF29F2917AF
    @Test
    void testAddValidationActionsItemToNull() {
        V1beta1ValidatingAdmissionPolicyBindingSpec spec = new V1beta1ValidatingAdmissionPolicyBindingSpec();
        spec.setValidationActions(null);
        spec.addValidationActionsItem("Deny");
        assertThat(spec.getValidationActions(), hasSize(1));
        assertThat(spec.getValidationActions().get(0), is(equalTo("Deny")));
    }

    //BaseRock generated method id: ${testNullMatchResources}, hash: 9CD5A8BC1BBE1377F57E988896706B56
    @Test
    void testNullMatchResources() {
        V1beta1ValidatingAdmissionPolicyBindingSpec spec = new V1beta1ValidatingAdmissionPolicyBindingSpec();
        spec.setMatchResources(null);
        assertThat(spec.getMatchResources(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNullParamRef}, hash: 51CAC14FEF09079FE8B1EC80C05680BC
    @Test
    void testNullParamRef() {
        V1beta1ValidatingAdmissionPolicyBindingSpec spec = new V1beta1ValidatingAdmissionPolicyBindingSpec();
        spec.setParamRef(null);
        assertThat(spec.getParamRef(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNullPolicyName}, hash: 0E757D78CC66020918225000AEDECEE6
    @Test
    void testNullPolicyName() {
        V1beta1ValidatingAdmissionPolicyBindingSpec spec = new V1beta1ValidatingAdmissionPolicyBindingSpec();
        spec.setPolicyName(null);
        assertThat(spec.getPolicyName(), is(nullValue()));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObjects}, hash: B1321AE89B5EFFE6C0645A9E8A3E21E7
    @Test
    void testEqualsWithDifferentObjects() {
        V1beta1ValidatingAdmissionPolicyBindingSpec spec = new V1beta1ValidatingAdmissionPolicyBindingSpec();
        assertThat(spec.equals(new Object()), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: A06332D18642DC214710E39EBE46D824
    @Test
    void testEqualsWithNull() {
        V1beta1ValidatingAdmissionPolicyBindingSpec spec = new V1beta1ValidatingAdmissionPolicyBindingSpec();
        assertThat(spec.equals(null), is(false));
    }

    //BaseRock generated method id: ${testHashCodeConsistency}, hash: 8E72466E34C4B4905BEDBE930EB39EEF
    @Test
    void testHashCodeConsistency() {
        V1beta1ValidatingAdmissionPolicyBindingSpec spec = new V1beta1ValidatingAdmissionPolicyBindingSpec().matchResources(new V1beta1MatchResources()).paramRef(new V1beta1ParamRef()).policyName("testPolicy").validationActions(new ArrayList<>(Arrays.asList("Deny", "Warn")));
        int initialHashCode = spec.hashCode();
        assertThat(spec.hashCode(), is(equalTo(initialHashCode)));
        spec.addValidationActionsItem("Audit");
        assertThat(spec.hashCode(), is(not(equalTo(initialHashCode))));
    }

    //BaseRock generated method id: ${testToStringNullFields}, hash: C4E7A60EBC231CD4D2EFE3EF0F6A71EE
    @Test
    void testToStringNullFields() {
        V1beta1ValidatingAdmissionPolicyBindingSpec spec = new V1beta1ValidatingAdmissionPolicyBindingSpec();
        String toString = spec.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("null"), is(true));
    }
}
