package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.V1beta1ValidatingAdmissionPolicySpec;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1beta1ValidatingAdmissionPolicyStatus;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1ValidatingAdmissionPolicyBaseRockGeneratedTest {

    private V1beta1ValidatingAdmissionPolicy validatingAdmissionPolicy;

    @BeforeEach
    void setUp() {
        validatingAdmissionPolicy = new V1beta1ValidatingAdmissionPolicy();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: ED2A62BBAC1BF6DA432C8A5DDAFF2A0F
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1beta1";
        validatingAdmissionPolicy.setApiVersion(apiVersion);
        assertEquals(apiVersion, validatingAdmissionPolicy.getApiVersion());
    }

    //BaseRock generated method id: ${testGetKind}, hash: 86B9D0FAEDFF63F51E45553778AEFA45
    @Test
    void testGetKind() {
        String kind = "ValidatingAdmissionPolicy";
        validatingAdmissionPolicy.setKind(kind);
        assertEquals(kind, validatingAdmissionPolicy.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: E58CE05F7B45CD6701B3B0BEF2A55E6E
    @Test
    void testGetMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        validatingAdmissionPolicy.setMetadata(metadata);
        assertThat(validatingAdmissionPolicy.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testGetSpec}, hash: 5EEAB44154E797618A849D56B0114574
    @Test
    void testGetSpec() {
        V1beta1ValidatingAdmissionPolicySpec spec = mock(V1beta1ValidatingAdmissionPolicySpec.class);
        validatingAdmissionPolicy.setSpec(spec);
        assertThat(validatingAdmissionPolicy.getSpec(), is(equalTo(spec)));
    }

    //BaseRock generated method id: ${testGetStatus}, hash: EE2990A02BEAB26C3A31C1207F7F7C6E
    @Test
    void testGetStatus() {
        V1beta1ValidatingAdmissionPolicyStatus status = mock(V1beta1ValidatingAdmissionPolicyStatus.class);
        validatingAdmissionPolicy.setStatus(status);
        assertThat(validatingAdmissionPolicy.getStatus(), is(equalTo(status)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 8563F3E47501BECCC0CA4E2B15B3216F
    @Test
    void testEquals() {
        V1ObjectMeta metadata = new V1ObjectMeta();
        V1beta1ValidatingAdmissionPolicySpec spec = new V1beta1ValidatingAdmissionPolicySpec();
        V1beta1ValidatingAdmissionPolicyStatus status = new V1beta1ValidatingAdmissionPolicyStatus();
        V1beta1ValidatingAdmissionPolicy policy1 = new V1beta1ValidatingAdmissionPolicy().apiVersion("v1beta1").kind("ValidatingAdmissionPolicy").metadata(metadata).spec(spec).status(status);
        V1beta1ValidatingAdmissionPolicy policy2 = new V1beta1ValidatingAdmissionPolicy().apiVersion("v1beta1").kind("ValidatingAdmissionPolicy").metadata(metadata).spec(spec).status(status);
        assertThat(policy1, is(equalTo(policy2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 1B46ACC285B7A46D91D08922434931AD
    @Test
    void testHashCode() {
        V1beta1ValidatingAdmissionPolicy policy = new V1beta1ValidatingAdmissionPolicy().apiVersion("v1beta1").kind("ValidatingAdmissionPolicy").metadata(new V1ObjectMeta()).spec(new V1beta1ValidatingAdmissionPolicySpec()).status(new V1beta1ValidatingAdmissionPolicyStatus());
        int hashCode = policy.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: CC9DC65DE6EFB3F42870373199D156F0
    @Test
    void testToString() {
        V1beta1ValidatingAdmissionPolicy policy = new V1beta1ValidatingAdmissionPolicy().apiVersion("v1beta1").kind("ValidatingAdmissionPolicy").metadata(new V1ObjectMeta()).spec(new V1beta1ValidatingAdmissionPolicySpec()).status(new V1beta1ValidatingAdmissionPolicyStatus());
        String toString = policy.toString();
        assertNotNull(toString);
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("spec"), is(true));
        assertThat(toString.contains("status"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 23194A55792AF7B80C91D613DAE86B90
    @Test
    void testBuilder() {
        V1ObjectMeta metadata = new V1ObjectMeta();
        V1beta1ValidatingAdmissionPolicySpec spec = new V1beta1ValidatingAdmissionPolicySpec();
        V1beta1ValidatingAdmissionPolicyStatus status = new V1beta1ValidatingAdmissionPolicyStatus();
        V1beta1ValidatingAdmissionPolicy policy = new V1beta1ValidatingAdmissionPolicy().apiVersion("v1beta1").kind("ValidatingAdmissionPolicy").metadata(metadata).spec(spec).status(status);
        assertThat(policy.getApiVersion(), is(equalTo("v1beta1")));
        assertThat(policy.getKind(), is(equalTo("ValidatingAdmissionPolicy")));
        assertThat(policy.getMetadata(), is(equalTo(metadata)));
        assertThat(policy.getSpec(), is(equalTo(spec)));
        assertThat(policy.getStatus(), is(equalTo(status)));
    }
}
