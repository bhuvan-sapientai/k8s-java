package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1alpha1ClusterTrustBundleSpecBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 6BA778F87555BFB65C860F6E1F6710AF
    @Test
    void testConstructor() {
        V1alpha1ClusterTrustBundleSpec spec = new V1alpha1ClusterTrustBundleSpec();
        assertNotNull(spec);
    }

    //BaseRock generated method id: ${testSetAndGetSignerName}, hash: 97A5D2BBC47DA463680E0673904A2558
    @Test
    void testSetAndGetSignerName() {
        V1alpha1ClusterTrustBundleSpec spec = new V1alpha1ClusterTrustBundleSpec();
        String signerName = "test-signer";
        spec.setSignerName(signerName);
        assertEquals(signerName, spec.getSignerName());
    }

    //BaseRock generated method id: ${testSetAndGetSignerNameWithVariousValues}, hash: 6D7282E978EEBD0894BCE94D8A1F5303
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "signer1", "signer2" })
    void testSetAndGetSignerNameWithVariousValues(String signerName) {
        V1alpha1ClusterTrustBundleSpec spec = new V1alpha1ClusterTrustBundleSpec();
        spec.setSignerName(signerName);
        assertEquals(signerName, spec.getSignerName());
    }

    //BaseRock generated method id: ${testSetAndGetTrustBundle}, hash: FB8EF63372ADFFCA0396181B311516C8
    @Test
    void testSetAndGetTrustBundle() {
        V1alpha1ClusterTrustBundleSpec spec = new V1alpha1ClusterTrustBundleSpec();
        String trustBundle = "-----BEGIN CERTIFICATE-----\nMIIDIjCCAougAwIBAgIBATANBgkqhkiG9w0BAQsFADCBoDELMAkGA1UEBhMCVVMx\n-----END CERTIFICATE-----";
        spec.setTrustBundle(trustBundle);
        assertEquals(trustBundle, spec.getTrustBundle());
    }

    //BaseRock generated method id: ${testSetAndGetTrustBundleWithVariousValues}, hash: B066D6CD2064F4143D41F34F78C86ABE
    @ParameterizedTest
    @ValueSource(strings = { "-----BEGIN CERTIFICATE-----\nMIIDIjCCAougAwIBAgIBATANBgkqhkiG9w0BAQsFADCBoDELMAkGA1UEBhMCVVMx\n-----END CERTIFICATE-----", "-----BEGIN CERTIFICATE-----\nMIIDIjCCAougAwIBAgIBATANBgkqhkiG9w0BAQsFADCBoDELMAkGA1UEBhMCVVMx\n-----END CERTIFICATE-----\n-----BEGIN CERTIFICATE-----\nMIIDIjCCAougAwIBAgIBATANBgkqhkiG9w0BAQsFADCBoDELMAkGA1UEBhMCVVMx\n-----END CERTIFICATE-----" })
    void testSetAndGetTrustBundleWithVariousValues(String trustBundle) {
        V1alpha1ClusterTrustBundleSpec spec = new V1alpha1ClusterTrustBundleSpec();
        spec.setTrustBundle(trustBundle);
        assertEquals(trustBundle, spec.getTrustBundle());
    }

    //BaseRock generated method id: ${testSetTrustBundleWithNull}, hash: C1B7AD31B6640B237E4F8399F07BC17B
    @Test
    void testSetTrustBundleWithNull() {
        V1alpha1ClusterTrustBundleSpec spec = new V1alpha1ClusterTrustBundleSpec();
        spec.setTrustBundle(null);
        assertNull(spec.getTrustBundle());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 72286B7ADDCE7685270276BA199EEC88
    @Test
    void testEqualsWithSameObject() {
        V1alpha1ClusterTrustBundleSpec spec = new V1alpha1ClusterTrustBundleSpec();
        assertTrue(spec.equals(spec));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 34B19EE249BCFBAE8494E9BFB4A26565
    @Test
    void testEqualsWithDifferentObject() {
        V1alpha1ClusterTrustBundleSpec spec1 = new V1alpha1ClusterTrustBundleSpec();
        V1alpha1ClusterTrustBundleSpec spec2 = new V1alpha1ClusterTrustBundleSpec();
        assertTrue(spec1.equals(spec2));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObjectType}, hash: D673E05CCC5EB4EC94CCFCA7B1CBD0A1
    @Test
    void testEqualsWithDifferentObjectType() {
        V1alpha1ClusterTrustBundleSpec spec = new V1alpha1ClusterTrustBundleSpec();
        assertFalse(spec.equals("not a spec"));
    }

    //BaseRock generated method id: ${testHashCode}, hash: AC8CAB3FAE16F32AD3760189EC7E75E2
    @Test
    void testHashCode() {
        V1alpha1ClusterTrustBundleSpec spec1 = new V1alpha1ClusterTrustBundleSpec();
        V1alpha1ClusterTrustBundleSpec spec2 = new V1alpha1ClusterTrustBundleSpec();
        assertEquals(spec1.hashCode(), spec2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 34890D5FD091E0E20F33F444725F8CFB
    @Disabled()
    @Test
    void testToString() {
        V1alpha1ClusterTrustBundleSpec spec = new V1alpha1ClusterTrustBundleSpec().signerName("test-signer").trustBundle("-----BEGIN CERTIFICATE-----\nMIIDIjCCAougAwIBAgIBATANBgkqhkiG9w0BAQsFADCBoDELMAkGA1UEBhMCVVMx\n-----END CERTIFICATE-----");
        String expectedString = "class V1alpha1ClusterTrustBundleSpec {\n    signerName: test-signer\n    trustBundle: -----BEGIN CERTIFICATE-----\nMIIDIjCCAougAwIBAgIBATANBgkqhkiG9w0BAQsFADCBoDELMAkGA1UEBhMCVVMx\n-----END CERTIFICATE-----\n}";
        assertEquals(expectedString, spec.toString().replaceAll("\\s+", " ").trim());
    }
}
