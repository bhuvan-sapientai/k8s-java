package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.V1ValidatingAdmissionPolicyBindingSpec;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import com.google.gson.JsonElement;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ValidatingAdmissionPolicyBindingBaseRockGeneratedTest {

    private V1ValidatingAdmissionPolicyBinding policyBinding;

    @BeforeEach
    void setUp() {
        policyBinding = new V1ValidatingAdmissionPolicyBinding();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 76861A6272DA6E3B27CEED65DEEB2A84
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        policyBinding.setApiVersion(apiVersion);
        assertEquals(apiVersion, policyBinding.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: D49DA95BF3DBB00B0DD3116FB3704934
    @Test
    void testKind() {
        String kind = "ValidatingAdmissionPolicyBinding";
        policyBinding.setKind(kind);
        assertEquals(kind, policyBinding.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 12BD100062ECF548FCA9145C2C6451FC
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        policyBinding.setMetadata(metadata);
        assertEquals(metadata, policyBinding.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: 56936F83974A3810C1C2C307B096BD94
    @Test
    void testSpec() {
        V1ValidatingAdmissionPolicyBindingSpec spec = mock(V1ValidatingAdmissionPolicyBindingSpec.class);
        policyBinding.setSpec(spec);
        assertEquals(spec, policyBinding.getSpec());
    }

    //BaseRock generated method id: ${testEquals}, hash: E67B532E5A5F4A872DD8853BC292BC19
    @Test
    void testEquals() {
        V1ValidatingAdmissionPolicyBinding policyBinding1 = new V1ValidatingAdmissionPolicyBinding().apiVersion("v1").kind("ValidatingAdmissionPolicyBinding").metadata(new V1ObjectMeta().name("test")).spec(new V1ValidatingAdmissionPolicyBindingSpec().policyName("testPolicy"));
        V1ValidatingAdmissionPolicyBinding policyBinding2 = new V1ValidatingAdmissionPolicyBinding().apiVersion("v1").kind("ValidatingAdmissionPolicyBinding").metadata(new V1ObjectMeta().name("test")).spec(new V1ValidatingAdmissionPolicyBindingSpec().policyName("testPolicy"));
        assertThat(policyBinding1.equals(policyBinding2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 3B9426219C05359DA53E6B860087131F
    @Test
    void testHashCode() {
        V1ValidatingAdmissionPolicyBinding policyBinding1 = new V1ValidatingAdmissionPolicyBinding().apiVersion("v1").kind("ValidatingAdmissionPolicyBinding").metadata(new V1ObjectMeta().name("test")).spec(new V1ValidatingAdmissionPolicyBindingSpec().policyName("testPolicy"));
        V1ValidatingAdmissionPolicyBinding policyBinding2 = new V1ValidatingAdmissionPolicyBinding().apiVersion("v1").kind("ValidatingAdmissionPolicyBinding").metadata(new V1ObjectMeta().name("test")).spec(new V1ValidatingAdmissionPolicyBindingSpec().policyName("testPolicy"));
        assertEquals(policyBinding1.hashCode(), policyBinding2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 8660937685CBA04080C6BF3BDC2062A4
    @Test
    void testToString() {
        V1ValidatingAdmissionPolicyBinding policyBinding = new V1ValidatingAdmissionPolicyBinding().apiVersion("v1").kind("ValidatingAdmissionPolicyBinding").metadata(mock(V1ObjectMeta.class)).spec(mock(V1ValidatingAdmissionPolicyBindingSpec.class));
        String toString = policyBinding.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("spec"), is(true));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 42806C76F56652711FB8A5DA8ED6FBE9
    @Test
    void testValidateJsonElement() throws Exception {
        JsonElement jsonElement = mock(JsonElement.class);
        when(jsonElement.getAsJsonObject()).thenReturn(mock(com.google.gson.JsonObject.class));
        when(jsonElement.getAsJsonObject().entrySet()).thenReturn(new HashMap<String, JsonElement>().entrySet());
        V1ValidatingAdmissionPolicyBinding.validateJsonElement(jsonElement);
    }

    //BaseRock generated method id: ${testFromJson}, hash: 1F425E79B3DCE59B5E431721AD586D0B
    @Test
    void testFromJson() throws Exception {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"ValidatingAdmissionPolicyBinding\"}";
        V1ValidatingAdmissionPolicyBinding result = V1ValidatingAdmissionPolicyBinding.fromJson(json);
        assertThat(result, notNullValue());
        assertEquals("v1", result.getApiVersion());
        assertEquals("ValidatingAdmissionPolicyBinding", result.getKind());
    }

    //BaseRock generated method id: ${testToJson}, hash: 0BBED25B72A06218C622675AC8C56FAE
    @Test
    void testToJson() {
        V1ValidatingAdmissionPolicyBinding policyBinding = new V1ValidatingAdmissionPolicyBinding().apiVersion("v1").kind("ValidatingAdmissionPolicyBinding");
        String json = policyBinding.toJson();
        assertThat(json, notNullValue());
        assertThat(json.contains("\"apiVersion\":\"v1\""), is(true));
        assertThat(json.contains("\"kind\":\"ValidatingAdmissionPolicyBinding\""), is(true));
    }
}
