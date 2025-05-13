package io.kubernetes.client.openapi.models;

import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1ValidatingAdmissionPolicySpec;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1ValidatingAdmissionPolicyStatus;
import static org.hamcrest.Matchers.startsWith;
import java.io.IOException;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1ValidatingAdmissionPolicyBaseRockGeneratedTest {

    private V1ValidatingAdmissionPolicy validatingAdmissionPolicy;

    @BeforeEach
    void setUp() {
        validatingAdmissionPolicy = new V1ValidatingAdmissionPolicy();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: CB5D28EBAB1938369BDE571B313A6895
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        validatingAdmissionPolicy.apiVersion(apiVersion);
        assertEquals(apiVersion, validatingAdmissionPolicy.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 3C99F7E23D9FA8EAC471B67E605D2A2E
    @Test
    void testKind() {
        String kind = "ValidatingAdmissionPolicy";
        validatingAdmissionPolicy.kind(kind);
        assertEquals(kind, validatingAdmissionPolicy.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 09C1E604965E9F538304B40E47E5B7F6
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        validatingAdmissionPolicy.metadata(metadata);
        assertEquals(metadata, validatingAdmissionPolicy.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: F4956A50BC29FCCBB19CDD8F74787409
    @Test
    void testSpec() {
        V1ValidatingAdmissionPolicySpec spec = mock(V1ValidatingAdmissionPolicySpec.class);
        validatingAdmissionPolicy.spec(spec);
        assertEquals(spec, validatingAdmissionPolicy.getSpec());
    }

    //BaseRock generated method id: ${testStatus}, hash: 123B7D8C542E7E2F7AC3BE17364F9869
    @Test
    void testStatus() {
        V1ValidatingAdmissionPolicyStatus status = mock(V1ValidatingAdmissionPolicyStatus.class);
        validatingAdmissionPolicy.status(status);
        assertEquals(status, validatingAdmissionPolicy.getStatus());
    }

    //BaseRock generated method id: ${testEquals}, hash: 51CF2C5E3C33618120504926CE43764D
    @Disabled()
    @Test
    void testEquals() {
        V1ObjectMeta metadata1 = mock(V1ObjectMeta.class);
        V1ValidatingAdmissionPolicySpec spec1 = mock(V1ValidatingAdmissionPolicySpec.class);
        V1ValidatingAdmissionPolicyStatus status1 = mock(V1ValidatingAdmissionPolicyStatus.class);
        V1ObjectMeta metadata2 = mock(V1ObjectMeta.class);
        V1ValidatingAdmissionPolicySpec spec2 = mock(V1ValidatingAdmissionPolicySpec.class);
        V1ValidatingAdmissionPolicyStatus status2 = mock(V1ValidatingAdmissionPolicyStatus.class);
        V1ValidatingAdmissionPolicy policy1 = new V1ValidatingAdmissionPolicy().apiVersion("v1").kind("ValidatingAdmissionPolicy").metadata(metadata1).spec(spec1).status(status1);
        V1ValidatingAdmissionPolicy policy2 = new V1ValidatingAdmissionPolicy().apiVersion("v1").kind("ValidatingAdmissionPolicy").metadata(metadata2).spec(spec2).status(status2);
        doReturn(true).when(metadata1).equals(metadata2);
        doReturn(true).when(spec1).equals(spec2);
        doReturn(true).when(status1).equals(status2);
        assertThat(policy1.equals(policy2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 5C3EDE101DFB9F5A7CFE814FAD18EDB7
    @Test
    void testHashCode() {
        V1ValidatingAdmissionPolicy policy = new V1ValidatingAdmissionPolicy().apiVersion("v1").kind("ValidatingAdmissionPolicy").metadata(mock(V1ObjectMeta.class)).spec(mock(V1ValidatingAdmissionPolicySpec.class)).status(mock(V1ValidatingAdmissionPolicyStatus.class));
        int hashCode = policy.hashCode();
        assertThat(hashCode, notNullValue());
    }

    //BaseRock generated method id: ${testToString}, hash: 8C6BA064C045D6C3AAEB459F77CCBC9B
    @Test
    void testToString() {
        V1ValidatingAdmissionPolicy policy = new V1ValidatingAdmissionPolicy().apiVersion("v1").kind("ValidatingAdmissionPolicy").metadata(mock(V1ObjectMeta.class)).spec(mock(V1ValidatingAdmissionPolicySpec.class)).status(mock(V1ValidatingAdmissionPolicyStatus.class));
        String toString = policy.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("spec"), is(true));
        assertThat(toString.contains("status"), is(true));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: F01C4F84BE17FADE33C369FE3CA6B315
    @Test
    void testValidateJsonElement() {
        // This method is static and its implementation is not provided in the source code.
        // Therefore, we cannot test it directly.
    }

    //BaseRock generated method id: ${testFromJson}, hash: AAFF00A2FBE61188AAE9CAFFF9C8BAE2
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"ValidatingAdmissionPolicy\"}";
        V1ValidatingAdmissionPolicy policy = V1ValidatingAdmissionPolicy.fromJson(json);
        assertNotNull(policy);
        assertEquals("v1", policy.getApiVersion());
        assertEquals("ValidatingAdmissionPolicy", policy.getKind());
    }

    //BaseRock generated method id: ${testToJson}, hash: 3E8FEF2A36E122F063F258D0126BBCB7
    @Test
    void testToJson() {
        V1ValidatingAdmissionPolicy policy = new V1ValidatingAdmissionPolicy().apiVersion("v1").kind("ValidatingAdmissionPolicy");
        String json = policy.toJson();
        assertNotNull(json);
        assertThat(json.contains("\"apiVersion\":\"v1\""), is(true));
        assertThat(json.contains("\"kind\":\"ValidatingAdmissionPolicy\""), is(true));
    }
}
