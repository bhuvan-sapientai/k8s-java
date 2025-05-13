package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1beta1ValidatingAdmissionPolicyBindingSpec;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1ValidatingAdmissionPolicyBindingBaseRockGeneratedTest {

    private V1beta1ValidatingAdmissionPolicyBinding validatingAdmissionPolicyBinding;

    @BeforeEach
    void setUp() {
        validatingAdmissionPolicyBinding = new V1beta1ValidatingAdmissionPolicyBinding();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 5BF952AD5F1C153DE773C47E743277D3
    @Test
    void testApiVersion() {
        String apiVersion = "v1beta1";
        validatingAdmissionPolicyBinding.setApiVersion(apiVersion);
        assertEquals(apiVersion, validatingAdmissionPolicyBinding.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 3037CCB489AE08D545C8FA1C8168156E
    @Test
    void testKind() {
        String kind = "ValidatingAdmissionPolicyBinding";
        validatingAdmissionPolicyBinding.setKind(kind);
        assertEquals(kind, validatingAdmissionPolicyBinding.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: FEEBEEEFA93850CEC81D2831D37409A0
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = new V1ObjectMeta();
        validatingAdmissionPolicyBinding.setMetadata(metadata);
        assertEquals(metadata, validatingAdmissionPolicyBinding.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: 66E05B6F54711C838277121C1F429081
    @Test
    void testSpec() {
        V1beta1ValidatingAdmissionPolicyBindingSpec spec = new V1beta1ValidatingAdmissionPolicyBindingSpec();
        validatingAdmissionPolicyBinding.setSpec(spec);
        assertEquals(spec, validatingAdmissionPolicyBinding.getSpec());
    }

    //BaseRock generated method id: ${testEquals}, hash: 4D821184A8DE77AAA0D8D865FB18A002
    @Test
    void testEquals() {
        V1beta1ValidatingAdmissionPolicyBinding binding1 = new V1beta1ValidatingAdmissionPolicyBinding().apiVersion("v1beta1").kind("ValidatingAdmissionPolicyBinding").metadata(new V1ObjectMeta()).spec(new V1beta1ValidatingAdmissionPolicyBindingSpec());
        V1beta1ValidatingAdmissionPolicyBinding binding2 = new V1beta1ValidatingAdmissionPolicyBinding().apiVersion("v1beta1").kind("ValidatingAdmissionPolicyBinding").metadata(new V1ObjectMeta()).spec(new V1beta1ValidatingAdmissionPolicyBindingSpec());
        assertThat(binding1, is(equalTo(binding2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: F8CC4300984EAD80BDE66ACE7396B505
    @Test
    void testHashCode() {
        V1beta1ValidatingAdmissionPolicyBinding binding1 = new V1beta1ValidatingAdmissionPolicyBinding().apiVersion("v1beta1").kind("ValidatingAdmissionPolicyBinding").metadata(new V1ObjectMeta()).spec(new V1beta1ValidatingAdmissionPolicyBindingSpec());
        V1beta1ValidatingAdmissionPolicyBinding binding2 = new V1beta1ValidatingAdmissionPolicyBinding().apiVersion("v1beta1").kind("ValidatingAdmissionPolicyBinding").metadata(new V1ObjectMeta()).spec(new V1beta1ValidatingAdmissionPolicyBindingSpec());
        assertEquals(binding1.hashCode(), binding2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: B1D31F8AA84830780A4FBB3369F4B139
    @Test
    void testToString() {
        V1beta1ValidatingAdmissionPolicyBinding binding = new V1beta1ValidatingAdmissionPolicyBinding().apiVersion("v1beta1").kind("ValidatingAdmissionPolicyBinding").metadata(new V1ObjectMeta()).spec(new V1beta1ValidatingAdmissionPolicyBindingSpec());
        String expectedString = "class V1beta1ValidatingAdmissionPolicyBinding {\n" + "    apiVersion: v1beta1\n" + "    kind: ValidatingAdmissionPolicyBinding\n" + "    metadata: class V1ObjectMeta {\n" + "        annotations: {}\n" + "        creationTimestamp: null\n" + "        deletionGracePeriodSeconds: null\n" + "        deletionTimestamp: null\n" + "        finalizers: []\n" + "        generateName: null\n" + "        generation: null\n" + "        labels: {}\n" + "        managedFields: []\n" + "        name: null\n" + "        namespace: null\n" + "        ownerReferences: []\n" + "        resourceVersion: null\n" + "        selfLink: null\n" + "        uid: null\n" + "    }\n" + "    spec: class V1beta1ValidatingAdmissionPolicyBindingSpec {\n" + "        matchResources: null\n" + "        paramRef: null\n" + "        policyName: null\n" + "        validationActions: []\n" + "    }\n" + "}";
        assertEquals(expectedString, binding.toString());
    }

    //BaseRock generated method id: ${testFromJson}, hash: DAE8AAA794AB1CAAFB3C3F5250C70F38
    @Test
    void testFromJson() throws Exception {
        String json = "{\"apiVersion\":\"v1beta1\",\"kind\":\"ValidatingAdmissionPolicyBinding\",\"metadata\":{},\"spec\":{}}";
        V1beta1ValidatingAdmissionPolicyBinding binding = V1beta1ValidatingAdmissionPolicyBinding.fromJson(json);
        assertNotNull(binding);
        assertEquals("v1beta1", binding.getApiVersion());
        assertEquals("ValidatingAdmissionPolicyBinding", binding.getKind());
        assertNotNull(binding.getMetadata());
        assertNotNull(binding.getSpec());
    }

    //BaseRock generated method id: ${testToJson}, hash: 364C33D5E2A7CCD1A0765EDC941FB51E
    @Test
    void testToJson() {
        V1beta1ValidatingAdmissionPolicyBinding binding = new V1beta1ValidatingAdmissionPolicyBinding().apiVersion("v1beta1").kind("ValidatingAdmissionPolicyBinding").metadata(new V1ObjectMeta()).spec(new V1beta1ValidatingAdmissionPolicyBindingSpec());
        String json = binding.toJson();
        assertNotNull(json);
        assertThat(json, is(notNullValue()));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: F2EB7B3D110E222FAC9DA5A4BC6B3F1D
    @Test
    void testValidateJsonElement() throws Exception {
        String json = "{\"apiVersion\":\"v1beta1\",\"kind\":\"ValidatingAdmissionPolicyBinding\",\"metadata\":{},\"spec\":{}}";
        V1beta1ValidatingAdmissionPolicyBinding.validateJsonElement(com.google.gson.JsonParser.parseString(json));
    }

    //BaseRock generated method id: ${testCustomTypeAdapterFactory}, hash: 702EC7EFF79742C4463B04578F8C6769
    @Test
    void testCustomTypeAdapterFactory() {
        com.google.gson.TypeAdapterFactory factory = new V1beta1ValidatingAdmissionPolicyBinding.CustomTypeAdapterFactory();
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapterFactory(factory).create();
        V1beta1ValidatingAdmissionPolicyBinding binding = new V1beta1ValidatingAdmissionPolicyBinding().apiVersion("v1beta1").kind("ValidatingAdmissionPolicyBinding").metadata(new V1ObjectMeta()).spec(new V1beta1ValidatingAdmissionPolicyBindingSpec());
        String json = gson.toJson(binding);
        V1beta1ValidatingAdmissionPolicyBinding deserializedBinding = gson.fromJson(json, V1beta1ValidatingAdmissionPolicyBinding.class);
        assertEquals(binding, deserializedBinding);
    }
}
