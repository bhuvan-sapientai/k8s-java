package io.kubernetes.client.openapi.models;

import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1PodSpec;
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import java.util.HashMap;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PodTemplateSpecBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1PodTemplateSpecConstructor}, hash: AE428EFABEA5CF1B3191B0B39E6015CC
    @Test
    void testV1PodTemplateSpecConstructor() {
        V1PodTemplateSpec podTemplateSpec = new V1PodTemplateSpec();
        assertNotNull(podTemplateSpec);
    }

    //BaseRock generated method id: ${testSetAndGetMetadata}, hash: 2BAD84FCFDDCF72DB7C1895F6FFAC4B0
    @Test
    void testSetAndGetMetadata() {
        V1PodTemplateSpec podTemplateSpec = new V1PodTemplateSpec();
        V1ObjectMeta metadata = new V1ObjectMeta();
        podTemplateSpec.setMetadata(metadata);
        assertEquals(metadata, podTemplateSpec.getMetadata());
    }

    //BaseRock generated method id: ${testSetAndGetSpec}, hash: 416E4653EE67FC87A7F635D60686265E
    @Test
    void testSetAndGetSpec() {
        V1PodTemplateSpec podTemplateSpec = new V1PodTemplateSpec();
        V1PodSpec spec = new V1PodSpec();
        podTemplateSpec.setSpec(spec);
        assertEquals(spec, podTemplateSpec.getSpec());
    }

    //BaseRock generated method id: ${testEquals}, hash: F41A020265832A11FAA2D50C1AB39098
    @Test
    void testEquals() {
        V1PodTemplateSpec spec1 = new V1PodTemplateSpec().metadata(new V1ObjectMeta().name("test")).spec(new V1PodSpec());
        V1PodTemplateSpec spec2 = new V1PodTemplateSpec().metadata(new V1ObjectMeta().name("test")).spec(new V1PodSpec());
        V1PodTemplateSpec spec3 = new V1PodTemplateSpec().metadata(new V1ObjectMeta().name("different")).spec(new V1PodSpec());
        assertThat(spec1.equals(spec2), is(true));
        assertThat(spec1.equals(spec3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: BD8CA4F40745B7F1B47796B333A8EC34
    @Test
    void testHashCode() {
        V1PodTemplateSpec spec1 = new V1PodTemplateSpec().metadata(new V1ObjectMeta().name("test")).spec(new V1PodSpec());
        V1PodTemplateSpec spec2 = new V1PodTemplateSpec().metadata(new V1ObjectMeta().name("test")).spec(new V1PodSpec());
        assertThat(spec1.hashCode(), equalTo(spec2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: C80581D3B40AF3607ABE69B6D84C093D
    @Test
    void testToString() {
        V1PodTemplateSpec spec = new V1PodTemplateSpec().metadata(new V1ObjectMeta().name("test")).spec(new V1PodSpec());
        String result = spec.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("metadata"), is(true));
        assertThat(result.contains("spec"), is(true));
    }

    //BaseRock generated method id: ${testbuilder}, hash: 76F31A303933BD3CB761E9283D1BC866
    @Test
    void testbuilder() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        when(metadata.getName()).thenReturn("test-pod");
        V1PodSpec podSpec = mock(V1PodSpec.class);
        when(podSpec.getRestartPolicy()).thenReturn("Always");
        V1PodTemplateSpec spec = new V1PodTemplateSpec().metadata(metadata).spec(podSpec);
        assertThat(spec, notNullValue());
        assertThat(spec.getMetadata().getName(), equalTo("test-pod"));
        assertThat(spec.getSpec().getRestartPolicy(), equalTo("Always"));
    }

    //BaseRock generated method id: ${testToJsonAndFromJson}, hash: 61E7ED3002DC2215E43356F7973186EB
    @Test
    void testToJsonAndFromJson() throws Exception {
        V1ObjectMeta metadata = new V1ObjectMeta().name("test-pod");
        V1PodSpec podSpec = new V1PodSpec().restartPolicy("Always");
        V1PodTemplateSpec originalSpec = new V1PodTemplateSpec().metadata(metadata).spec(podSpec);
        String json = originalSpec.toJson();
        assertThat(json, notNullValue());
        V1PodTemplateSpec deserializedSpec = V1PodTemplateSpec.fromJson(json);
        assertThat(deserializedSpec, notNullValue());
        assertThat(deserializedSpec.getMetadata().getName(), equalTo("test-pod"));
        assertThat(deserializedSpec.getSpec().getRestartPolicy(), equalTo("Always"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 0935E822423404BA7D1784CEEB6187C7
    @Test
    void testValidateJsonElement() throws Exception {
        V1ObjectMeta metadata = new V1ObjectMeta().name("test-pod");
        V1PodSpec podSpec = new V1PodSpec().restartPolicy("Always");
        V1PodTemplateSpec spec = new V1PodTemplateSpec().metadata(metadata).spec(podSpec);
        String json = spec.toJson();
        V1PodTemplateSpec.validateJsonElement(io.kubernetes.client.openapi.JSON.getGson().fromJson(json, com.google.gson.JsonElement.class));
    }

    //BaseRock generated method id: ${testGetOpenAPIFields}, hash: EE333A5E1097EA6662E21463E3F3AD48
    @Test
    void testGetOpenAPIFields() {
        assertThat(V1PodTemplateSpec.openapiFields, notNullValue());
        assertThat(V1PodTemplateSpec.openapiFields.contains("metadata"), is(true));
        assertThat(V1PodTemplateSpec.openapiFields.contains("spec"), is(true));
    }

    //BaseRock generated method id: ${testGetOpenAPIRequiredFields}, hash: 3EEC6681294562625D0EA293F3EA5A13
    @Test
    void testGetOpenAPIRequiredFields() {
        assertThat(V1PodTemplateSpec.openapiRequiredFields, notNullValue());
        assertThat(V1PodTemplateSpec.openapiRequiredFields.isEmpty(), is(true));
    }
}
