package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1DaemonSetSpec;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1DaemonSetStatus;
import static org.hamcrest.Matchers.startsWith;
import java.io.IOException;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1DaemonSetBaseRockGeneratedTest {

    private V1DaemonSet v1DaemonSet;

    @BeforeEach
    void setUp() {
        v1DaemonSet = new V1DaemonSet();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 24D25AB0E9E21B790CC539BCB6275E70
    @Test
    void testApiVersion() {
        String apiVersion = "apps/v1";
        v1DaemonSet.setApiVersion(apiVersion);
        assertThat(v1DaemonSet.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testKind}, hash: E1298E8F1F285DE63A28F782A3BDD51E
    @Test
    void testKind() {
        String kind = "DaemonSet";
        v1DaemonSet.setKind(kind);
        assertThat(v1DaemonSet.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testMetadata}, hash: 71CE6924E300C7CD4391B22B28A2C024
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1DaemonSet.setMetadata(metadata);
        assertThat(v1DaemonSet.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testSpec}, hash: 0A45A59A75B5AD25D4BD2F8CB0626C40
    @Test
    void testSpec() {
        V1DaemonSetSpec spec = mock(V1DaemonSetSpec.class);
        v1DaemonSet.setSpec(spec);
        assertThat(v1DaemonSet.getSpec(), is(equalTo(spec)));
    }

    //BaseRock generated method id: ${testStatus}, hash: 1776A294439BA874E77E211ED67493E8
    @Test
    void testStatus() {
        V1DaemonSetStatus status = mock(V1DaemonSetStatus.class);
        v1DaemonSet.setStatus(status);
        assertThat(v1DaemonSet.getStatus(), is(equalTo(status)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 2A1495C2BBE4D368275D548EA1EE2898
    @Test
    void testEquals() {
        V1DaemonSet other = new V1DaemonSet();
        other.setApiVersion("apps/v1");
        other.setKind("DaemonSet");
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        other.setMetadata(metadata);
        V1DaemonSetSpec spec = mock(V1DaemonSetSpec.class);
        other.setSpec(spec);
        V1DaemonSetStatus status = mock(V1DaemonSetStatus.class);
        other.setStatus(status);
        v1DaemonSet.setApiVersion("apps/v1");
        v1DaemonSet.setKind("DaemonSet");
        v1DaemonSet.setMetadata(metadata);
        v1DaemonSet.setSpec(spec);
        v1DaemonSet.setStatus(status);
        assertThat(v1DaemonSet.equals(other), is(true));
        assertThat(v1DaemonSet.equals(v1DaemonSet), is(true));
        assertThat(v1DaemonSet.equals(null), is(false));
        assertThat(v1DaemonSet.equals(new Object()), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: E5BB2016CEFD97402A78E689A794D822
    @Test
    void testHashCode() {
        v1DaemonSet.setApiVersion("apps/v1");
        v1DaemonSet.setKind("DaemonSet");
        v1DaemonSet.setMetadata(mock(V1ObjectMeta.class));
        v1DaemonSet.setSpec(mock(V1DaemonSetSpec.class));
        v1DaemonSet.setStatus(mock(V1DaemonSetStatus.class));
        int hashCode = v1DaemonSet.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 060B5ADEAD896678A98A1F949657381B
    @Test
    void testToString() {
        v1DaemonSet.setApiVersion("apps/v1");
        v1DaemonSet.setKind("DaemonSet");
        v1DaemonSet.setMetadata(mock(V1ObjectMeta.class));
        v1DaemonSet.setSpec(mock(V1DaemonSetSpec.class));
        v1DaemonSet.setStatus(mock(V1DaemonSetStatus.class));
        String toString = v1DaemonSet.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("spec"), is(true));
        assertThat(toString.contains("status"), is(true));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 16E1B15D9584DC4C4ECA202E5F1036EF
    @Disabled()
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty("apiVersion", "apps/v1");
        jsonObj.addProperty("kind", "DaemonSet");
        JsonObject metadataObj = new JsonObject();
        jsonObj.add("metadata", metadataObj);
        JsonObject specObj = new JsonObject();
        JsonObject templateObj = new JsonObject();
        specObj.add("template", templateObj);
        JsonObject selectorObj = new JsonObject();
        specObj.add("selector", selectorObj);
        jsonObj.add("spec", specObj);
        JsonObject statusObj = new JsonObject();
        jsonObj.add("status", statusObj);
        V1DaemonSet.validateJsonElement(jsonObj);
    }

    //BaseRock generated method id: ${testFromJson}, hash: 5230B1DCEF1B483904D402B9C56EBDBD
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"apps/v1\",\"kind\":\"DaemonSet\"}";
        V1DaemonSet fromJson = V1DaemonSet.fromJson(json);
        assertThat(fromJson, is(notNullValue()));
        assertThat(fromJson.getApiVersion(), is(equalTo("apps/v1")));
        assertThat(fromJson.getKind(), is(equalTo("DaemonSet")));
    }

    //BaseRock generated method id: ${testToJson}, hash: 79BC0A1FFDA3C331F767D735337DE725
    @Test
    void testToJson() {
        v1DaemonSet.setApiVersion("apps/v1");
        v1DaemonSet.setKind("DaemonSet");
        String json = v1DaemonSet.toJson();
        assertThat(json, is(notNullValue()));
        assertThat(json, startsWith("{"));
        assertThat(json, endsWith("}"));
        assertThat(json.contains("\"apiVersion\":\"apps/v1\""), is(true));
        assertThat(json.contains("\"kind\":\"DaemonSet\""), is(true));
    }
}
