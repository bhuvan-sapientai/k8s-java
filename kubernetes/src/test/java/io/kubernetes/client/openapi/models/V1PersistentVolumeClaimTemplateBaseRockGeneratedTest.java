package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpec;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import static org.hamcrest.Matchers.*;
import com.google.gson.JsonElement;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PersistentVolumeClaimTemplateBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: F9406E88FA92F9C100FBF1B627373B5B
    @Test
    void testConstructor() {
        V1PersistentVolumeClaimTemplate template = new V1PersistentVolumeClaimTemplate();
        assertThat(template, is(notNullValue()));
    }

    //BaseRock generated method id: ${testMetadataSetter}, hash: 4AD7A7CA3C8761715130D27815B2355E
    @Test
    void testMetadataSetter() {
        V1PersistentVolumeClaimTemplate template = new V1PersistentVolumeClaimTemplate();
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        template.setMetadata(metadata);
        assertThat(template.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testSpecSetter}, hash: 5C849AED3025D88901B8A0D0158C5913
    @Test
    void testSpecSetter() {
        V1PersistentVolumeClaimTemplate template = new V1PersistentVolumeClaimTemplate();
        V1PersistentVolumeClaimSpec spec = mock(V1PersistentVolumeClaimSpec.class);
        template.setSpec(spec);
        assertThat(template.getSpec(), is(equalTo(spec)));
    }

    //BaseRock generated method id: ${testMetadataGetter}, hash: 47CCA08ABB9BF301C6B0B518E9D817AA
    @Test
    void testMetadataGetter() {
        V1PersistentVolumeClaimTemplate template = new V1PersistentVolumeClaimTemplate();
        assertThat(template.getMetadata(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSpecGetter}, hash: 265EAEEE939F8F1BA3E4E05A1528D5BA
    @Test
    void testSpecGetter() {
        V1PersistentVolumeClaimTemplate template = new V1PersistentVolumeClaimTemplate();
        assertThat(template.getSpec(), is(nullValue()));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 8CD80346F73AADBB22DCC08641027A57
    @Test
    void testEqualsWithSameObject() {
        V1PersistentVolumeClaimTemplate template = new V1PersistentVolumeClaimTemplate();
        assertThat(template.equals(template), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: E7E2AE2A42C94566A43C94433C9C3CE2
    @Test
    void testEqualsWithDifferentClass() {
        V1PersistentVolumeClaimTemplate template = new V1PersistentVolumeClaimTemplate();
        assertThat(template.equals(new Object()), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObjects}, hash: 3FF16482BAB65F76464C5552A903AA23
    @Test
    void testEqualsWithDifferentObjects() {
        V1PersistentVolumeClaimTemplate template1 = new V1PersistentVolumeClaimTemplate();
        V1PersistentVolumeClaimTemplate template2 = new V1PersistentVolumeClaimTemplate();
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1PersistentVolumeClaimSpec spec = mock(V1PersistentVolumeClaimSpec.class);
        template1.setMetadata(metadata);
        template1.setSpec(spec);
        assertThat(template1.equals(template2), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: D7662D5A3141C1C3C43C55D52C5C4A09
    @Test
    void testHashCode() {
        V1PersistentVolumeClaimTemplate template = new V1PersistentVolumeClaimTemplate();
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1PersistentVolumeClaimSpec spec = mock(V1PersistentVolumeClaimSpec.class);
        template.setMetadata(metadata);
        template.setSpec(spec);
        assertThat(template.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 06A2B21068F5F24B27E0EBEA1C693755
    @Test
    void testToString() {
        V1PersistentVolumeClaimTemplate template = new V1PersistentVolumeClaimTemplate();
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1PersistentVolumeClaimSpec spec = mock(V1PersistentVolumeClaimSpec.class);
        template.setMetadata(metadata);
        template.setSpec(spec);
        String result = template.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result, containsString("metadata"));
        assertThat(result, containsString("spec"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: A34A56A38CC21AF8D4CE9001552B3465
    @Test
    void testValidateJsonElement() {
        JsonElement jsonElement = mock(JsonElement.class);
        JsonObject jsonObject = mock(JsonObject.class);
        when(jsonElement.isJsonNull()).thenReturn(false);
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        when(jsonObject.entrySet()).thenReturn(new java.util.HashSet<>());
        when(jsonObject.get("spec")).thenReturn(null);
        assertThrows(IllegalArgumentException.class, () -> {
            V1PersistentVolumeClaimTemplate.validateJsonElement(jsonElement);
        });
    }

    //BaseRock generated method id: ${testFromJson}, hash: 4CB44668E702CC273B4BBEC395A8C15D
    @Test
    void testFromJson() throws IOException {
        String jsonString = "{\"spec\":{}}";
        assertThat(V1PersistentVolumeClaimTemplate.fromJson(jsonString), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToJson}, hash: 276795D19C432BB2E40C83E2F971B33C
    @Test
    void testToJson() {
        V1PersistentVolumeClaimTemplate template = new V1PersistentVolumeClaimTemplate();
        assertThat(template.toJson(), is(notNullValue()));
    }
}
