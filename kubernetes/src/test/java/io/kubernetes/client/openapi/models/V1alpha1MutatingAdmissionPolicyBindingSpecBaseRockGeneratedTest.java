package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1alpha1ParamRef;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1alpha1MatchResources;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import java.util.HashSet;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import static org.junit.jupiter.api.Assertions.*;
import com.google.gson.JsonElement;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1alpha1MutatingAdmissionPolicyBindingSpecBaseRockGeneratedTest {

    @Mock
    private V1alpha1MatchResources mockMatchResources;

    @Mock
    private V1alpha1ParamRef mockParamRef;

    private V1alpha1MutatingAdmissionPolicyBindingSpec specUnderTest;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        specUnderTest = new V1alpha1MutatingAdmissionPolicyBindingSpec();
    }

    //BaseRock generated method id: ${testSetAndGetMatchResources}, hash: 55453F622DFA41D17136421EB221BAC6
    @Test
    void testSetAndGetMatchResources() {
        specUnderTest.setMatchResources(mockMatchResources);
        assertEquals(mockMatchResources, specUnderTest.getMatchResources());
    }

    //BaseRock generated method id: ${testSetAndGetParamRef}, hash: 4E861952B43DC91DE9B2D9E32BFEE9D4
    @Test
    void testSetAndGetParamRef() {
        specUnderTest.setParamRef(mockParamRef);
        assertEquals(mockParamRef, specUnderTest.getParamRef());
    }

    //BaseRock generated method id: ${testSetAndGetPolicyName}, hash: A42E33220EB6D49CC23D06A1565327A0
    @Test
    void testSetAndGetPolicyName() {
        String policyName = "testPolicy";
        specUnderTest.setPolicyName(policyName);
        assertEquals(policyName, specUnderTest.getPolicyName());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: DF5584DE9C647B13B097DDC0009D3AAC
    @Test
    void testEqualsWithSameObject() {
        assertTrue(specUnderTest.equals(specUnderTest));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 73AEB081441D0124110EC0D9C53A5F07
    @Test
    void testEqualsWithDifferentObject() {
        V1alpha1MutatingAdmissionPolicyBindingSpec otherSpec = new V1alpha1MutatingAdmissionPolicyBindingSpec();
        assertTrue(specUnderTest.equals(otherSpec));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentValues}, hash: 84C9F3552E2919426054F82A566EEC0C
    @Test
    void testEqualsWithDifferentValues() {
        V1alpha1MutatingAdmissionPolicyBindingSpec otherSpec = new V1alpha1MutatingAdmissionPolicyBindingSpec().matchResources(mockMatchResources).paramRef(mockParamRef).policyName("differentPolicy");
        assertFalse(specUnderTest.equals(otherSpec));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 076BFE58324EA9BB00F8AD1F7D9F0BD6
    @Test
    void testHashCode() {
        V1alpha1MutatingAdmissionPolicyBindingSpec sameSpec = new V1alpha1MutatingAdmissionPolicyBindingSpec();
        assertEquals(specUnderTest.hashCode(), sameSpec.hashCode());
        sameSpec.setMatchResources(mockMatchResources);
        assertNotEquals(specUnderTest.hashCode(), sameSpec.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: CFD3AA48F2F1CD73005D790DCBD02128
    @Test
    void testToString() {
        String expectedString = "class V1alpha1MutatingAdmissionPolicyBindingSpec {\n    matchResources: null\n    paramRef: null\n    policyName: null\n}";
        assertEquals(expectedString, specUnderTest.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 94CE6C2C13734118D7A2545A9C5E7D0D
    @Disabled()
    @Test
    void testValidateJsonElement() throws IOException {
        assertDoesNotThrow(() -> V1alpha1MutatingAdmissionPolicyBindingSpec.validateJsonElement(null));
        JsonElement mockJsonElement = mock(JsonElement.class);
        JsonObject mockJsonObject = mock(JsonObject.class);
        when(mockJsonElement.getAsJsonObject()).thenReturn(mockJsonObject);
        when(mockJsonObject.entrySet()).thenReturn(new HashSet<>());
        assertDoesNotThrow(() -> V1alpha1MutatingAdmissionPolicyBindingSpec.validateJsonElement(mockJsonElement));
        verify(mockJsonElement).getAsJsonObject();
        verify(mockJsonObject).entrySet();
    }
}
