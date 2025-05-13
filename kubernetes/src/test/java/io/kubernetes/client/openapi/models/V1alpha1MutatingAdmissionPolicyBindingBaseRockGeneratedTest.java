package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import io.kubernetes.client.openapi.models.V1alpha1MutatingAdmissionPolicyBindingSpec;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha1MutatingAdmissionPolicyBindingBaseRockGeneratedTest {

    @Mock
    private V1ObjectMeta mockMetadata;

    @Mock
    private V1alpha1MutatingAdmissionPolicyBindingSpec mockSpec;

    //BaseRock generated method id: ${testConstructor}, hash: 1F5F813F0A2ED48A7667FDAEB9394383
    @Test
    void testConstructor() {
        V1alpha1MutatingAdmissionPolicyBinding binding = new V1alpha1MutatingAdmissionPolicyBinding();
        assertNotNull(binding);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 7A365E612276981C7265F68C51DCAD52
    @Test
    void testApiVersion() {
        V1alpha1MutatingAdmissionPolicyBinding binding = new V1alpha1MutatingAdmissionPolicyBinding();
        String apiVersion = "v1alpha1";
        binding.setApiVersion(apiVersion);
        assertEquals(apiVersion, binding.getApiVersion());
    }

    //BaseRock generated method id: ${testApiVersionWithDifferentValues}, hash: B6944CAFE97649ED7DB0423552B984C2
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "v1", "v2" })
    void testApiVersionWithDifferentValues(String apiVersion) {
        V1alpha1MutatingAdmissionPolicyBinding binding = new V1alpha1MutatingAdmissionPolicyBinding();
        binding.setApiVersion(apiVersion);
        assertEquals(apiVersion, binding.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: A907F120E24E3BBCF3BEB2E7B1D4587A
    @Test
    void testKind() {
        V1alpha1MutatingAdmissionPolicyBinding binding = new V1alpha1MutatingAdmissionPolicyBinding();
        String kind = "MutatingAdmissionPolicyBinding";
        binding.setKind(kind);
        assertEquals(kind, binding.getKind());
    }

    //BaseRock generated method id: ${testKindWithDifferentValues}, hash: B5003C357EA54C2A991D2B54F8B72090
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "CustomKind", "TestKind" })
    void testKindWithDifferentValues(String kind) {
        V1alpha1MutatingAdmissionPolicyBinding binding = new V1alpha1MutatingAdmissionPolicyBinding();
        binding.setKind(kind);
        assertEquals(kind, binding.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: C5B917D09316B43DE375953408DA8FBE
    @Test
    void testMetadata() {
        V1alpha1MutatingAdmissionPolicyBinding binding = new V1alpha1MutatingAdmissionPolicyBinding();
        binding.setMetadata(mockMetadata);
        assertEquals(mockMetadata, binding.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: 53B21FA6ABF9ABAFB3FD5B598939BA2B
    @Test
    void testSpec() {
        V1alpha1MutatingAdmissionPolicyBinding binding = new V1alpha1MutatingAdmissionPolicyBinding();
        binding.setSpec(mockSpec);
        assertEquals(mockSpec, binding.getSpec());
    }

    //BaseRock generated method id: ${testEquals}, hash: 7F0DE1F565340145FD81F19368CE8715
    @Test
    void testEquals() {
        V1alpha1MutatingAdmissionPolicyBinding binding1 = new V1alpha1MutatingAdmissionPolicyBinding().apiVersion("v1alpha1").kind("MutatingAdmissionPolicyBinding").metadata(mockMetadata).spec(mockSpec);
        V1alpha1MutatingAdmissionPolicyBinding binding2 = new V1alpha1MutatingAdmissionPolicyBinding().apiVersion("v1alpha1").kind("MutatingAdmissionPolicyBinding").metadata(mockMetadata).spec(mockSpec);
        assertEquals(binding1, binding2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 6A433507BC6E5B0983964B5FF9D6B507
    @Test
    void testHashCode() {
        V1alpha1MutatingAdmissionPolicyBinding binding1 = new V1alpha1MutatingAdmissionPolicyBinding().apiVersion("v1alpha1").kind("MutatingAdmissionPolicyBinding").metadata(mockMetadata).spec(mockSpec);
        V1alpha1MutatingAdmissionPolicyBinding binding2 = new V1alpha1MutatingAdmissionPolicyBinding().apiVersion("v1alpha1").kind("MutatingAdmissionPolicyBinding").metadata(mockMetadata).spec(mockSpec);
        assertEquals(binding1.hashCode(), binding2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 3585C74BB41A31E796A3E1C10F94E27C
    @Test
    void testToString() {
        V1alpha1MutatingAdmissionPolicyBinding binding = new V1alpha1MutatingAdmissionPolicyBinding().apiVersion("v1alpha1").kind("MutatingAdmissionPolicyBinding").metadata(mockMetadata).spec(mockSpec);
        String expectedString = "class V1alpha1MutatingAdmissionPolicyBinding {\n" + "    apiVersion: v1alpha1\n" + "    kind: MutatingAdmissionPolicyBinding\n" + "    metadata: " + mockMetadata + "\n" + "    spec: " + mockSpec + "\n" + "}";
        assertEquals(expectedString, binding.toString());
    }

    //BaseRock generated method id: ${testBuilder}, hash: 8ACF639EA5A84E6A5B2CC4891A5AD567
    @Test
    void testBuilder() {
        V1alpha1MutatingAdmissionPolicyBinding binding = new V1alpha1MutatingAdmissionPolicyBinding().apiVersion("v1alpha1").kind("MutatingAdmissionPolicyBinding").metadata(mockMetadata).spec(mockSpec);
        assertEquals("v1alpha1", binding.getApiVersion());
        assertEquals("MutatingAdmissionPolicyBinding", binding.getKind());
        assertEquals(mockMetadata, binding.getMetadata());
        assertEquals(mockSpec, binding.getSpec());
    }
}
