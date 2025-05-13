package io.kubernetes.client.openapi.models;

import static org.junit.jupiter.api.Assertions.assertAll;
import io.kubernetes.client.openapi.models.V1alpha1MutatingAdmissionPolicySpec;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha1MutatingAdmissionPolicyBaseRockGeneratedTest {

    private V1alpha1MutatingAdmissionPolicy policy;

    @BeforeEach
    void setUp() {
        policy = new V1alpha1MutatingAdmissionPolicy();
    }

    //BaseRock generated method id: ${testConstructor}, hash: E0763912D0D04C796342D4ECC13735FE
    @Test
    void testConstructor() {
        assertThat(policy, is(notNullValue()));
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 035EF7A4EB5CD6E742B7A867778FD56F
    @Test
    void testApiVersion() {
        String apiVersion = "v1alpha1";
        policy.setApiVersion(apiVersion);
        assertThat(policy.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testKind}, hash: 7F816D20EBCE18D1E3610E52B2D842DC
    @Test
    void testKind() {
        String kind = "MutatingAdmissionPolicy";
        policy.setKind(kind);
        assertThat(policy.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testMetadata}, hash: 4F8C34CEF898EA4775CC5FCAD7339671
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        policy.setMetadata(metadata);
        assertThat(policy.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testSpec}, hash: 68FE09E6E2973D4D0BF5AF9F80A6F3E1
    @Test
    void testSpec() {
        V1alpha1MutatingAdmissionPolicySpec spec = mock(V1alpha1MutatingAdmissionPolicySpec.class);
        policy.setSpec(spec);
        assertThat(policy.getSpec(), is(equalTo(spec)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 0DCF1043437B3F59F7371E628AA3412F
    @Test
    void testEquals() {
        V1alpha1MutatingAdmissionPolicy policy1 = new V1alpha1MutatingAdmissionPolicy().apiVersion("v1alpha1").kind("MutatingAdmissionPolicy").metadata(new V1ObjectMeta()).spec(new V1alpha1MutatingAdmissionPolicySpec());
        V1alpha1MutatingAdmissionPolicy policy2 = new V1alpha1MutatingAdmissionPolicy().apiVersion("v1alpha1").kind("MutatingAdmissionPolicy").metadata(new V1ObjectMeta()).spec(new V1alpha1MutatingAdmissionPolicySpec());
        assertThat(policy1.equals(policy2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 2161E1829EEF6E1E7BA3DE3F1A4E55F0
    @Test
    void testHashCode() {
        V1alpha1MutatingAdmissionPolicy policy1 = new V1alpha1MutatingAdmissionPolicy().apiVersion("v1alpha1").kind("MutatingAdmissionPolicy").metadata(new V1ObjectMeta()).spec(new V1alpha1MutatingAdmissionPolicySpec());
        V1alpha1MutatingAdmissionPolicy policy2 = new V1alpha1MutatingAdmissionPolicy().apiVersion("v1alpha1").kind("MutatingAdmissionPolicy").metadata(new V1ObjectMeta()).spec(new V1alpha1MutatingAdmissionPolicySpec());
        assertThat(policy1.hashCode(), is(equalTo(policy2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 9E0ECEFC7898904974D58B4E0776730A
    @Test
    void testToString() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        when(metadata.toString()).thenReturn("metadata");
        V1alpha1MutatingAdmissionPolicySpec spec = mock(V1alpha1MutatingAdmissionPolicySpec.class);
        when(spec.toString()).thenReturn("spec");
        V1alpha1MutatingAdmissionPolicy policy = new V1alpha1MutatingAdmissionPolicy().apiVersion("v1alpha1").kind("MutatingAdmissionPolicy").metadata(metadata).spec(spec);
        String expected = "class V1alpha1MutatingAdmissionPolicy {\n" + "    apiVersion: v1alpha1\n" + "    kind: MutatingAdmissionPolicy\n" + "    metadata: metadata\n" + "    spec: spec\n" + "}";
        assertThat(policy.toString(), is(equalTo(expected)));
    }

    //BaseRock generated method id: ${testBuilderMethods}, hash: 56300C0802218A30C8319017B41137C7
    @Test
    void testBuilderMethods() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1alpha1MutatingAdmissionPolicySpec spec = mock(V1alpha1MutatingAdmissionPolicySpec.class);
        V1alpha1MutatingAdmissionPolicy policy = new V1alpha1MutatingAdmissionPolicy().apiVersion("v1alpha1").kind("MutatingAdmissionPolicy").metadata(metadata).spec(spec);
        assertAll(() -> assertThat(policy.getApiVersion(), is(equalTo("v1alpha1"))), () -> assertThat(policy.getKind(), is(equalTo("MutatingAdmissionPolicy"))), () -> assertThat(policy.getMetadata(), is(equalTo(metadata))), () -> assertThat(policy.getSpec(), is(equalTo(spec))));
    }
}
