package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.V1ParamRef;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1MatchResources;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ValidatingAdmissionPolicyBindingSpecBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 2A5F2E6498388DDDDA9017AC689DA519
    @Test
    void testConstructor() {
        V1ValidatingAdmissionPolicyBindingSpec spec = new V1ValidatingAdmissionPolicyBindingSpec();
        assertThat(spec, is(notNullValue()));
    }

    //BaseRock generated method id: ${testMatchResources}, hash: A92AC2F0DF12C924185F7388C9DDE802
    @Test
    void testMatchResources() {
        V1ValidatingAdmissionPolicyBindingSpec spec = new V1ValidatingAdmissionPolicyBindingSpec();
        V1MatchResources matchResources = mock(V1MatchResources.class);
        spec.setMatchResources(matchResources);
        assertThat(spec.getMatchResources(), is(equalTo(matchResources)));
    }

    //BaseRock generated method id: ${testParamRef}, hash: D62BF50CCDF8FD6856CE4E193A55B221
    @Test
    void testParamRef() {
        V1ValidatingAdmissionPolicyBindingSpec spec = new V1ValidatingAdmissionPolicyBindingSpec();
        V1ParamRef paramRef = mock(V1ParamRef.class);
        spec.setParamRef(paramRef);
        assertThat(spec.getParamRef(), is(equalTo(paramRef)));
    }

    //BaseRock generated method id: ${testPolicyName}, hash: ECF303A92A8286E63E1DEA67024A93D5
    @Test
    void testPolicyName() {
        V1ValidatingAdmissionPolicyBindingSpec spec = new V1ValidatingAdmissionPolicyBindingSpec();
        String policyName = "testPolicy";
        spec.setPolicyName(policyName);
        assertThat(spec.getPolicyName(), is(equalTo(policyName)));
    }

    //BaseRock generated method id: ${testValidationActions}, hash: C421F297408FB1DC6690648EC1719B4C
    @Test
    void testValidationActions() {
        V1ValidatingAdmissionPolicyBindingSpec spec = new V1ValidatingAdmissionPolicyBindingSpec();
        List<String> validationActions = new ArrayList<>();
        validationActions.add("Deny");
        validationActions.add("Warn");
        spec.setValidationActions(validationActions);
        assertThat(spec.getValidationActions(), is(equalTo(validationActions)));
    }

    //BaseRock generated method id: ${testAddValidationActionsItem}, hash: 6961DF928E6F6A52C02FC80D26A78E91
    @Test
    void testAddValidationActionsItem() {
        V1ValidatingAdmissionPolicyBindingSpec spec = new V1ValidatingAdmissionPolicyBindingSpec();
        String validationAction = "Audit";
        spec.addValidationActionsItem(validationAction);
        assertThat(spec.getValidationActions(), hasSize(1));
        assertThat(spec.getValidationActions().get(0), is(equalTo(validationAction)));
    }

    //BaseRock generated method id: ${testAddValidationActionsItemWithDifferentValues}, hash: D77AB161DE7B8598C3FDA7B1B1F29113
    @ParameterizedTest
    @ValueSource(strings = { "Deny", "Warn", "Audit" })
    void testAddValidationActionsItemWithDifferentValues(String validationAction) {
        V1ValidatingAdmissionPolicyBindingSpec spec = new V1ValidatingAdmissionPolicyBindingSpec();
        spec.addValidationActionsItem(validationAction);
        assertThat(spec.getValidationActions(), hasSize(1));
        assertThat(spec.getValidationActions().get(0), is(equalTo(validationAction)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 5D853109BD2A8E3445E1C6BDFD36C50F
    @Test
    void testEqualsAndHashCode() {
        V1ValidatingAdmissionPolicyBindingSpec spec1 = new V1ValidatingAdmissionPolicyBindingSpec().matchResources(mock(V1MatchResources.class)).paramRef(mock(V1ParamRef.class)).policyName("testPolicy").addValidationActionsItem("Deny");
        V1ValidatingAdmissionPolicyBindingSpec spec2 = new V1ValidatingAdmissionPolicyBindingSpec().matchResources(spec1.getMatchResources()).paramRef(spec1.getParamRef()).policyName(spec1.getPolicyName()).addValidationActionsItem("Deny");
        assertThat(spec1, is(equalTo(spec2)));
        assertThat(spec1.hashCode(), is(equalTo(spec2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: BF70B95A55618337DF3642438ABA1F30
    @Test
    void testToString() {
        V1ValidatingAdmissionPolicyBindingSpec spec = new V1ValidatingAdmissionPolicyBindingSpec().matchResources(mock(V1MatchResources.class)).paramRef(mock(V1ParamRef.class)).policyName("testPolicy").addValidationActionsItem("Deny");
        String toString = spec.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("matchResources"), is(true));
        assertThat(toString.contains("paramRef"), is(true));
        assertThat(toString.contains("policyName"), is(true));
        assertThat(toString.contains("validationActions"), is(true));
    }

    //BaseRock generated method id: ${testNullValues}, hash: B08256FFA8F127B82C983D343A57D05E
    @Test
    void testNullValues() {
        V1ValidatingAdmissionPolicyBindingSpec spec = new V1ValidatingAdmissionPolicyBindingSpec();
        assertThat(spec.getMatchResources(), is(nullValue()));
        assertThat(spec.getParamRef(), is(nullValue()));
        assertThat(spec.getPolicyName(), is(nullValue()));
        assertThat(spec.getValidationActions(), is(notNullValue()));
        assertThat(spec.getValidationActions(), hasSize(0));
    }

    //BaseRock generated method id: ${testAddValidationActionsItemWithNullList}, hash: B605BCD521A27A3680180C997F342779
    @Test
    void testAddValidationActionsItemWithNullList() {
        V1ValidatingAdmissionPolicyBindingSpec spec = new V1ValidatingAdmissionPolicyBindingSpec();
        spec.setValidationActions(null);
        spec.addValidationActionsItem("Deny");
        assertThat(spec.getValidationActions(), is(notNullValue()));
        assertThat(spec.getValidationActions(), hasSize(1));
        assertThat(spec.getValidationActions().get(0), is(equalTo("Deny")));
    }

    //BaseRock generated method id: ${testSetNullValidationActions}, hash: 194A2101F1E213A2F87A322EC9BCB298
    @Test
    void testSetNullValidationActions() {
        V1ValidatingAdmissionPolicyBindingSpec spec = new V1ValidatingAdmissionPolicyBindingSpec();
        spec.setValidationActions(null);
        assertThat(spec.getValidationActions(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAddNullValidationActionsItem}, hash: 8F1A655ABD8C995FF9895FE0BDC326E1
    @Test
    void testAddNullValidationActionsItem() {
        V1ValidatingAdmissionPolicyBindingSpec spec = new V1ValidatingAdmissionPolicyBindingSpec();
        spec.addValidationActionsItem(null);
        assertThat(spec.getValidationActions(), hasSize(1));
        assertThat(spec.getValidationActions().get(0), is(nullValue()));
    }
}
