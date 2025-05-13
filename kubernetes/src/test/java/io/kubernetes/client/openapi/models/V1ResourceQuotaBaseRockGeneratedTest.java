package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import com.google.gson.JsonObject;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.*;
import com.google.gson.JsonElement;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ResourceQuotaBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1ResourceQuotaConstructor}, hash: 213CDE624B84390985D844FE8108DD3D
    @Test
    void testV1ResourceQuotaConstructor() {
        V1ResourceQuota resourceQuota = new V1ResourceQuota();
        assertNotNull(resourceQuota);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 2EC78BBBD98DEB17B230B12CCF0CEBA8
    @Test
    void testApiVersion() {
        V1ResourceQuota resourceQuota = new V1ResourceQuota();
        String apiVersion = "v1";
        resourceQuota.setApiVersion(apiVersion);
        assertEquals(apiVersion, resourceQuota.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: B48267C468E6192A9E1134F6F9CA768D
    @Test
    void testKind() {
        V1ResourceQuota resourceQuota = new V1ResourceQuota();
        String kind = "ResourceQuota";
        resourceQuota.setKind(kind);
        assertEquals(kind, resourceQuota.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: AC391771E828B3FC45997E52138835C4
    @Test
    void testMetadata() {
        V1ResourceQuota resourceQuota = new V1ResourceQuota();
        V1ObjectMeta metadata = new V1ObjectMeta();
        resourceQuota.setMetadata(metadata);
        assertEquals(metadata, resourceQuota.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: 0809420EC702651513C19B152B20ED55
    @Test
    void testSpec() {
        V1ResourceQuota resourceQuota = new V1ResourceQuota();
        V1ResourceQuotaSpec spec = new V1ResourceQuotaSpec();
        resourceQuota.setSpec(spec);
        assertEquals(spec, resourceQuota.getSpec());
    }

    //BaseRock generated method id: ${testStatus}, hash: BBC0F629F980FB41004A69553386A606
    @Test
    void testStatus() {
        V1ResourceQuota resourceQuota = new V1ResourceQuota();
        V1ResourceQuotaStatus status = new V1ResourceQuotaStatus();
        resourceQuota.setStatus(status);
        assertEquals(status, resourceQuota.getStatus());
    }

    //BaseRock generated method id: ${testEquals}, hash: A9E60CBE0818C8D70430A73C67E54022
    @Test
    void testEquals() {
        V1ResourceQuota resourceQuota1 = new V1ResourceQuota().apiVersion("v1").kind("ResourceQuota").metadata(new V1ObjectMeta()).spec(new V1ResourceQuotaSpec()).status(new V1ResourceQuotaStatus());
        V1ResourceQuota resourceQuota2 = new V1ResourceQuota().apiVersion("v1").kind("ResourceQuota").metadata(new V1ObjectMeta()).spec(new V1ResourceQuotaSpec()).status(new V1ResourceQuotaStatus());
        assertThat(resourceQuota1, is(equalTo(resourceQuota2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: BA1D89992562BEC11AD17BCB3425F130
    @Test
    void testHashCode() {
        V1ResourceQuota resourceQuota1 = new V1ResourceQuota().apiVersion("v1").kind("ResourceQuota").metadata(new V1ObjectMeta()).spec(new V1ResourceQuotaSpec()).status(new V1ResourceQuotaStatus());
        V1ResourceQuota resourceQuota2 = new V1ResourceQuota().apiVersion("v1").kind("ResourceQuota").metadata(new V1ObjectMeta()).spec(new V1ResourceQuotaSpec()).status(new V1ResourceQuotaStatus());
        assertEquals(resourceQuota1.hashCode(), resourceQuota2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 9EFD9007766650D4CC72F3F2A0DE3733
    @Test
    void testToString() {
        V1ResourceQuota resourceQuota = new V1ResourceQuota().apiVersion("v1").kind("ResourceQuota").metadata(new V1ObjectMeta()).spec(new V1ResourceQuotaSpec()).status(new V1ResourceQuotaStatus());
        String toString = resourceQuota.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString, containsString("apiVersion"));
        assertThat(toString, containsString("kind"));
        assertThat(toString, containsString("metadata"));
        assertThat(toString, containsString("spec"));
        assertThat(toString, containsString("status"));
    }

    //BaseRock generated method id: ${testBuilder}, hash: F032521FBCBC91060F52326CD6480B6F
    @Test
    void testBuilder() {
        V1ResourceQuota resourceQuota = new V1ResourceQuota().apiVersion("v1").kind("ResourceQuota").metadata(new V1ObjectMeta()).spec(new V1ResourceQuotaSpec()).status(new V1ResourceQuotaStatus());
        assertThat(resourceQuota, is(notNullValue()));
        assertEquals("v1", resourceQuota.getApiVersion());
        assertEquals("ResourceQuota", resourceQuota.getKind());
        assertThat(resourceQuota.getMetadata(), is(notNullValue()));
        assertThat(resourceQuota.getSpec(), is(notNullValue()));
        assertThat(resourceQuota.getStatus(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToIndentedString}, hash: 48849C649CD0331F9BF68325C4D6ACBC
    @Test
    void testToIndentedString() {
        V1ResourceQuota resourceQuota = new V1ResourceQuota().apiVersion("v1").kind("ResourceQuota").metadata(new V1ObjectMeta()).spec(new V1ResourceQuotaSpec()).status(new V1ResourceQuotaStatus());
        String indentedString = resourceQuota.toString();
        assertThat(indentedString, is(notNullValue()));
        assertThat(indentedString, containsString("apiVersion: v1"));
        assertThat(indentedString, containsString("kind: ResourceQuota"));
        assertThat(indentedString, containsString("metadata:"));
        assertThat(indentedString, containsString("spec:"));
        assertThat(indentedString, containsString("status:"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: DD6CA2773D906202CE7F20267FF9C6FE
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiVersion", "v1");
        jsonObject.addProperty("kind", "ResourceQuota");
        JsonElement jsonElement = jsonObject;
        V1ResourceQuota.validateJsonElement(jsonElement);
    }

    //BaseRock generated method id: ${testFromJson}, hash: 0B3777CA0C061271641373D6F24A555B
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"ResourceQuota\",\"metadata\":{},\"spec\":{},\"status\":{}}";
        V1ResourceQuota resourceQuota = V1ResourceQuota.fromJson(json);
        assertThat(resourceQuota, is(notNullValue()));
        assertEquals("v1", resourceQuota.getApiVersion());
        assertEquals("ResourceQuota", resourceQuota.getKind());
        assertThat(resourceQuota.getMetadata(), is(notNullValue()));
        assertThat(resourceQuota.getSpec(), is(notNullValue()));
        assertThat(resourceQuota.getStatus(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToJson}, hash: AF2F5A5014572C1C7AEA3A8583FB7671
    @Test
    void testToJson() {
        V1ResourceQuota resourceQuota = new V1ResourceQuota().apiVersion("v1").kind("ResourceQuota").metadata(new V1ObjectMeta()).spec(new V1ResourceQuotaSpec()).status(new V1ResourceQuotaStatus());
        String json = resourceQuota.toJson();
        assertThat(json, is(notNullValue()));
        assertThat(json, containsString("\"apiVersion\":\"v1\""));
        assertThat(json, containsString("\"kind\":\"ResourceQuota\""));
        assertThat(json, containsString("\"metadata\":"));
        assertThat(json, containsString("\"spec\":"));
        assertThat(json, containsString("\"status\":"));
    }
}
