package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1alpha2LeaseCandidateSpec;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import java.util.HashSet;
import org.mockito.MockitoAnnotations;
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

@Timeout(10)
class V1alpha2LeaseCandidateBaseRockGeneratedTest {

    @Mock
    private V1ObjectMeta mockMetadata;

    @Mock
    private V1alpha2LeaseCandidateSpec mockSpec;

    private V1alpha2LeaseCandidate leaseCandidate;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        leaseCandidate = new V1alpha2LeaseCandidate();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 33FEB3285D5DD71E08925174FA687F3D
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1alpha2";
        leaseCandidate.setApiVersion(apiVersion);
        assertEquals(apiVersion, leaseCandidate.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: ED4D4EECD6C0EA8B41D584AD79BD2EF3
    @Test
    void testSetApiVersion() {
        String apiVersion = "v1alpha2";
        leaseCandidate.setApiVersion(apiVersion);
        assertEquals(apiVersion, leaseCandidate.getApiVersion());
    }

    //BaseRock generated method id: ${testGetKind}, hash: A3D2B01297E4AB78F48B17F14C79E332
    @Test
    void testGetKind() {
        String kind = "LeaseCandidate";
        leaseCandidate.setKind(kind);
        assertEquals(kind, leaseCandidate.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: 2002872B50FE93CABFDD0B5530AABD11
    @Test
    void testSetKind() {
        String kind = "LeaseCandidate";
        leaseCandidate.setKind(kind);
        assertEquals(kind, leaseCandidate.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 0E715015FC3F94DACE69902D04AA6BC4
    @Test
    void testGetMetadata() {
        leaseCandidate.setMetadata(mockMetadata);
        assertEquals(mockMetadata, leaseCandidate.getMetadata());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: 911078AC369CB3160A014AFD8599D769
    @Test
    void testSetMetadata() {
        leaseCandidate.setMetadata(mockMetadata);
        assertEquals(mockMetadata, leaseCandidate.getMetadata());
    }

    //BaseRock generated method id: ${testGetSpec}, hash: 012F862B50125F0E61BB7564448E7EC9
    @Test
    void testGetSpec() {
        leaseCandidate.setSpec(mockSpec);
        assertEquals(mockSpec, leaseCandidate.getSpec());
    }

    //BaseRock generated method id: ${testSetSpec}, hash: DEFFCF5897552241E46A2CB0D2F4DC52
    @Test
    void testSetSpec() {
        leaseCandidate.setSpec(mockSpec);
        assertEquals(mockSpec, leaseCandidate.getSpec());
    }

    //BaseRock generated method id: ${testEquals}, hash: BE7A15387E30B8D84DF8F0E9B57B9F42
    @Test
    void testEquals() {
        V1alpha2LeaseCandidate candidate1 = new V1alpha2LeaseCandidate().apiVersion("v1alpha2").kind("LeaseCandidate").metadata(mockMetadata).spec(mockSpec);
        V1alpha2LeaseCandidate candidate2 = new V1alpha2LeaseCandidate().apiVersion("v1alpha2").kind("LeaseCandidate").metadata(mockMetadata).spec(mockSpec);
        assertEquals(candidate1, candidate2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 83D8693F3198AAE35E62507DC9BAA052
    @Test
    void testHashCode() {
        V1alpha2LeaseCandidate candidate1 = new V1alpha2LeaseCandidate().apiVersion("v1alpha2").kind("LeaseCandidate").metadata(mockMetadata).spec(mockSpec);
        V1alpha2LeaseCandidate candidate2 = new V1alpha2LeaseCandidate().apiVersion("v1alpha2").kind("LeaseCandidate").metadata(mockMetadata).spec(mockSpec);
        assertEquals(candidate1.hashCode(), candidate2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 8F43076A01794A6508B6F584384C88EF
    @Test
    void testToString() {
        V1alpha2LeaseCandidate candidate = new V1alpha2LeaseCandidate().apiVersion("v1alpha2").kind("LeaseCandidate").metadata(mockMetadata).spec(mockSpec);
        String expectedString = "class V1alpha2LeaseCandidate {\n" + "    apiVersion: v1alpha2\n" + "    kind: LeaseCandidate\n" + "    metadata: " + mockMetadata + "\n" + "    spec: " + mockSpec + "\n" + "}";
        assertEquals(expectedString, candidate.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 55678CBFBAE17E195EEE3F88F48343C3
    @Test
    void testValidateJsonElement() throws IOException {
        JsonElement mockJsonElement = mock(JsonElement.class);
        JsonObject mockJsonObject = mock(JsonObject.class);
        when(mockJsonElement.getAsJsonObject()).thenReturn(mockJsonObject);
        when(mockJsonObject.entrySet()).thenReturn(new HashSet<>());
        assertDoesNotThrow(() -> V1alpha2LeaseCandidate.validateJsonElement(mockJsonElement));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 6192D1F91E14BA754A19280F3E6487C9
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1alpha2\",\"kind\":\"LeaseCandidate\"}";
        V1alpha2LeaseCandidate result = V1alpha2LeaseCandidate.fromJson(json);
        assertNotNull(result);
        assertEquals("v1alpha2", result.getApiVersion());
        assertEquals("LeaseCandidate", result.getKind());
    }

    //BaseRock generated method id: ${testToJson}, hash: EA2975D983C9D6F652B4E69B686DC0A7
    @Test
    void testToJson() {
        V1alpha2LeaseCandidate candidate = new V1alpha2LeaseCandidate().apiVersion("v1alpha2").kind("LeaseCandidate");
        String json = candidate.toJson();
        assertTrue(json.contains("\"apiVersion\":\"v1alpha2\""));
        assertTrue(json.contains("\"kind\":\"LeaseCandidate\""));
    }
}
