package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1DeploymentStatus;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1DeploymentSpec;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import com.google.gson.JsonPrimitive;
import java.util.HashSet;
import com.google.gson.JsonArray;
import org.junit.jupiter.api.Assertions;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1DeploymentBaseRockGeneratedTest {

    //BaseRock generated method id: ${testDefaultConstructor}, hash: A207D0435732746ECADBF12451BDF8AA
    @Test
    void testDefaultConstructor() {
        V1Deployment deployment = new V1Deployment();
        assertThat(deployment, is(notNullValue()));
        assertThat(deployment.getApiVersion(), is(nullValue()));
        assertThat(deployment.getKind(), is(nullValue()));
        assertThat(deployment.getMetadata(), is(nullValue()));
        assertThat(deployment.getSpec(), is(nullValue()));
        assertThat(deployment.getStatus(), is(nullValue()));
    }

    //BaseRock generated method id: ${testApiVersionGetterAndSetter}, hash: E48CD5E01138431E3A5B132FF4556CB0
    @Test
    void testApiVersionGetterAndSetter() {
        V1Deployment deployment = new V1Deployment();
        String apiVersion = "apps/v1";
        deployment.setApiVersion(apiVersion);
        assertThat(deployment.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testApiVersionBuilderPattern}, hash: 9C1EAAA0890C18A55ED305AE97BF626E
    @Test
    void testApiVersionBuilderPattern() {
        String apiVersion = "apps/v1";
        V1Deployment deployment = new V1Deployment().apiVersion(apiVersion);
        assertThat(deployment.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testKindGetterAndSetter}, hash: D8A3565082D4783858691DFB85D1D1FE
    @Test
    void testKindGetterAndSetter() {
        V1Deployment deployment = new V1Deployment();
        String kind = "Deployment";
        deployment.setKind(kind);
        assertThat(deployment.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testKindBuilderPattern}, hash: 01F52604FC47012B6F01B21E4A492F69
    @Test
    void testKindBuilderPattern() {
        String kind = "Deployment";
        V1Deployment deployment = new V1Deployment().kind(kind);
        assertThat(deployment.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testMetadataGetterAndSetter}, hash: EAF2285BAB6C1F8818212EEBF90F273A
    @Test
    void testMetadataGetterAndSetter() {
        V1Deployment deployment = new V1Deployment();
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        deployment.setMetadata(metadata);
        assertThat(deployment.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testMetadataBuilderPattern}, hash: EB83CDB51A150CD793E225322A1FBBBE
    @Test
    void testMetadataBuilderPattern() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1Deployment deployment = new V1Deployment().metadata(metadata);
        assertThat(deployment.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testSpecGetterAndSetter}, hash: 25F5DBE3A89DDFBB665DDD0C23F1E395
    @Test
    void testSpecGetterAndSetter() {
        V1Deployment deployment = new V1Deployment();
        V1DeploymentSpec spec = mock(V1DeploymentSpec.class);
        deployment.setSpec(spec);
        assertThat(deployment.getSpec(), is(equalTo(spec)));
    }

    //BaseRock generated method id: ${testSpecBuilderPattern}, hash: 417B90E4430DBE6A87ACE94C8514C9D3
    @Test
    void testSpecBuilderPattern() {
        V1DeploymentSpec spec = mock(V1DeploymentSpec.class);
        V1Deployment deployment = new V1Deployment().spec(spec);
        assertThat(deployment.getSpec(), is(equalTo(spec)));
    }

    //BaseRock generated method id: ${testStatusGetterAndSetter}, hash: BA719A59D49538A5DCEE9D5DEFE7F8A8
    @Test
    void testStatusGetterAndSetter() {
        V1Deployment deployment = new V1Deployment();
        V1DeploymentStatus status = mock(V1DeploymentStatus.class);
        deployment.setStatus(status);
        assertThat(deployment.getStatus(), is(equalTo(status)));
    }

    //BaseRock generated method id: ${testStatusBuilderPattern}, hash: E66EC746503046F1FD0698F009A52F70
    @Test
    void testStatusBuilderPattern() {
        V1DeploymentStatus status = mock(V1DeploymentStatus.class);
        V1Deployment deployment = new V1Deployment().status(status);
        assertThat(deployment.getStatus(), is(equalTo(status)));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: F392FC9E890555B1DFE781874E69C0AA
    @Test
    void testEqualsWithSameObject() {
        V1Deployment deployment = new V1Deployment().apiVersion("apps/v1").kind("Deployment").metadata(mock(V1ObjectMeta.class)).spec(mock(V1DeploymentSpec.class)).status(mock(V1DeploymentStatus.class));
        assertTrue(deployment.equals(deployment));
    }

    //BaseRock generated method id: ${testEqualsWithNullObject}, hash: 30694FDEB55EF8931B31AC764AECBCF8
    @Test
    void testEqualsWithNullObject() {
        V1Deployment deployment = new V1Deployment();
        assertFalse(deployment.equals(null));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 6019498B0F82E10A2A8B8F55E79C5795
    @Test
    void testEqualsWithDifferentClass() {
        V1Deployment deployment = new V1Deployment();
        assertFalse(deployment.equals("Not a V1Deployment"));
    }

    //BaseRock generated method id: ${testEqualsWithEqualObjects}, hash: 1ED932D4BB0601612B8903E5524933CA
    @Test
    void testEqualsWithEqualObjects() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1DeploymentSpec spec = mock(V1DeploymentSpec.class);
        V1DeploymentStatus status = mock(V1DeploymentStatus.class);
        V1Deployment deployment1 = new V1Deployment().apiVersion("apps/v1").kind("Deployment").metadata(metadata).spec(spec).status(status);
        V1Deployment deployment2 = new V1Deployment().apiVersion("apps/v1").kind("Deployment").metadata(metadata).spec(spec).status(status);
        assertTrue(deployment1.equals(deployment2));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentApiVersion}, hash: 05D63A5819EE48FCB316108803D19154
    @Test
    void testEqualsWithDifferentApiVersion() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1DeploymentSpec spec = mock(V1DeploymentSpec.class);
        V1DeploymentStatus status = mock(V1DeploymentStatus.class);
        V1Deployment deployment1 = new V1Deployment().apiVersion("apps/v1").kind("Deployment").metadata(metadata).spec(spec).status(status);
        V1Deployment deployment2 = new V1Deployment().apiVersion("apps/v2").kind("Deployment").metadata(metadata).spec(spec).status(status);
        assertFalse(deployment1.equals(deployment2));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentKind}, hash: CB89FF7D43C121CD953C933D681AB881
    @Test
    void testEqualsWithDifferentKind() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1DeploymentSpec spec = mock(V1DeploymentSpec.class);
        V1DeploymentStatus status = mock(V1DeploymentStatus.class);
        V1Deployment deployment1 = new V1Deployment().apiVersion("apps/v1").kind("Deployment").metadata(metadata).spec(spec).status(status);
        V1Deployment deployment2 = new V1Deployment().apiVersion("apps/v1").kind("OtherKind").metadata(metadata).spec(spec).status(status);
        assertFalse(deployment1.equals(deployment2));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentMetadata}, hash: 4FD8F55FAA1CAD4C25734BFF3AF44610
    @Test
    void testEqualsWithDifferentMetadata() {
        V1DeploymentSpec spec = mock(V1DeploymentSpec.class);
        V1DeploymentStatus status = mock(V1DeploymentStatus.class);
        V1Deployment deployment1 = new V1Deployment().apiVersion("apps/v1").kind("Deployment").metadata(mock(V1ObjectMeta.class)).spec(spec).status(status);
        V1Deployment deployment2 = new V1Deployment().apiVersion("apps/v1").kind("Deployment").metadata(mock(V1ObjectMeta.class)).spec(spec).status(status);
        assertFalse(deployment1.equals(deployment2));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentSpec}, hash: 646B860D2903EC9EE297FFD5E7DE0C13
    @Test
    void testEqualsWithDifferentSpec() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1DeploymentStatus status = mock(V1DeploymentStatus.class);
        V1Deployment deployment1 = new V1Deployment().apiVersion("apps/v1").kind("Deployment").metadata(metadata).spec(mock(V1DeploymentSpec.class)).status(status);
        V1Deployment deployment2 = new V1Deployment().apiVersion("apps/v1").kind("Deployment").metadata(metadata).spec(mock(V1DeploymentSpec.class)).status(status);
        assertFalse(deployment1.equals(deployment2));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentStatus}, hash: F0F5301ADCBE1D975CDDB981F8CEDCF2
    @Test
    void testEqualsWithDifferentStatus() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1DeploymentSpec spec = mock(V1DeploymentSpec.class);
        V1Deployment deployment1 = new V1Deployment().apiVersion("apps/v1").kind("Deployment").metadata(metadata).spec(spec).status(mock(V1DeploymentStatus.class));
        V1Deployment deployment2 = new V1Deployment().apiVersion("apps/v1").kind("Deployment").metadata(metadata).spec(spec).status(mock(V1DeploymentStatus.class));
        assertFalse(deployment1.equals(deployment2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 652A1ABDE9B126E4F7C583CF6BF8D598
    @Test
    void testHashCode() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1DeploymentSpec spec = mock(V1DeploymentSpec.class);
        V1DeploymentStatus status = mock(V1DeploymentStatus.class);
        V1Deployment deployment1 = new V1Deployment().apiVersion("apps/v1").kind("Deployment").metadata(metadata).spec(spec).status(status);
        V1Deployment deployment2 = new V1Deployment().apiVersion("apps/v1").kind("Deployment").metadata(metadata).spec(spec).status(status);
        assertEquals(deployment1.hashCode(), deployment2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 8D597A5141C1306F902B39954A69D1C7
    @Test
    void testToString() {
        V1Deployment deployment = new V1Deployment().apiVersion("apps/v1").kind("Deployment").metadata(mock(V1ObjectMeta.class)).spec(mock(V1DeploymentSpec.class)).status(mock(V1DeploymentStatus.class));
        String toString = deployment.toString();
        assertTrue(toString.contains("apiVersion: apps/v1"));
        assertTrue(toString.contains("kind: Deployment"));
        assertTrue(toString.contains("metadata:"));
        assertTrue(toString.contains("spec:"));
        assertTrue(toString.contains("status:"));
    }

    //BaseRock generated method id: ${testToIndentedStringWithNull}, hash: E68D5C22F4E9FCB4D91A56A8411DE070
    @Test
    void testToIndentedStringWithNull() {
        V1Deployment deployment = new V1Deployment();
        String toString = deployment.toString();
        assertTrue(toString.contains("apiVersion: null"));
        assertTrue(toString.contains("kind: null"));
        assertTrue(toString.contains("metadata: null"));
        assertTrue(toString.contains("spec: null"));
        assertTrue(toString.contains("status: null"));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithValidJson}, hash: AA611364DCF1A45A5BA74E3BF1AABB77
    @Test
    void testValidateJsonElementWithValidJson() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiVersion", "apps/v1");
        jsonObject.addProperty("kind", "Deployment");
        jsonObject.add("metadata", new JsonObject());
        JsonObject spec = new JsonObject();
        spec.add("selector", new JsonObject());
        spec.add("template", new JsonObject());
        jsonObject.add("spec", spec);
        jsonObject.add("status", new JsonObject());
        V1Deployment.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testValidateJsonElementWithNullJson}, hash: 6750DBBDB2435B691965A1C1ED0D8E1A
    @Disabled()
    @Test
    void testValidateJsonElementWithNullJson() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            V1Deployment.validateJsonElement(null);
        });
    }

    //BaseRock generated method id: ${testOpenapiFieldsInitialization}, hash: 90D845ECA403FC51AFCF11E72DEE7DA4
    @Test
    void testOpenapiFieldsInitialization() {
        HashSet<String> fields = V1Deployment.openapiFields;
        assertTrue(fields.contains("apiVersion"));
        assertTrue(fields.contains("kind"));
        assertTrue(fields.contains("metadata"));
        assertTrue(fields.contains("spec"));
        assertTrue(fields.contains("status"));
    }

    //BaseRock generated method id: ${testFromJsonWithValidJson}, hash: EF0808532754A97D64155D95EFCB4E49
    @Test
    void testFromJsonWithValidJson() throws IOException {
        String json = "{\"apiVersion\":\"apps/v1\",\"kind\":\"Deployment\"}";
        V1Deployment deployment = V1Deployment.fromJson(json);
        assertThat(deployment.getApiVersion(), is(equalTo("apps/v1")));
        assertThat(deployment.getKind(), is(equalTo("Deployment")));
    }

    //BaseRock generated method id: ${testToJson}, hash: 764427831468B314EDD985526AA2AA25
    @Test
    void testToJson() {
        V1Deployment deployment = new V1Deployment().apiVersion("apps/v1").kind("Deployment");
        String json = deployment.toJson();
        assertTrue(json.contains("\"apiVersion\":\"apps/v1\""));
        assertTrue(json.contains("\"kind\":\"Deployment\""));
    }

    //BaseRock generated method id: ${testCustomTypeAdapterFactory}, hash: E066CAC76B12D0A3E5C5B35BE2364E4C
    @Test
    void testCustomTypeAdapterFactory() {
        V1Deployment deployment = new V1Deployment().apiVersion("apps/v1").kind("Deployment");
        String json = deployment.toJson();
        assertThat(json, is(notNullValue()));
        try {
            V1Deployment deserialized = V1Deployment.fromJson(json);
            assertThat(deserialized.getApiVersion(), is(equalTo("apps/v1")));
            assertThat(deserialized.getKind(), is(equalTo("Deployment")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidApiVersion}, hash: 37C0D20F6EE2B2393D3930F6F8486C43
    @Test
    void testValidateJsonElementWithInvalidApiVersion() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("apiVersion", new JsonObject());
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            V1Deployment.validateJsonElement(jsonObject);
        });
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidKind}, hash: DB723FDECFD9BA223C68664386896CF5
    @Test
    void testValidateJsonElementWithInvalidKind() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("kind", new JsonArray());
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            V1Deployment.validateJsonElement(jsonObject);
        });
    }

    //BaseRock generated method id: ${testValidateJsonElementWithUnknownField}, hash: 7593E7B274EDA4726A91D09739953540
    @Test
    void testValidateJsonElementWithUnknownField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("unknownField", "value");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            V1Deployment.validateJsonElement(jsonObject);
        });
    }
}
