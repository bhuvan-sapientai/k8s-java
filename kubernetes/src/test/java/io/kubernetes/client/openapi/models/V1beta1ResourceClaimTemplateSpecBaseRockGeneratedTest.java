package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import java.util.HashSet;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import com.google.gson.JsonElement;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1beta1ResourceClaimTemplateSpecBaseRockGeneratedTest {

    @Mock
    private V1ObjectMeta mockMetadata;

    @Mock
    private V1beta1ResourceClaimSpec mockSpec;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    //BaseRock generated method id: ${testConstructor}, hash: 89C765CC1F0BCCF29FE884FB8DBC6F65
    @Test
    void testConstructor() {
        V1beta1ResourceClaimTemplateSpec spec = new V1beta1ResourceClaimTemplateSpec();
        assertNotNull(spec);
    }

    //BaseRock generated method id: ${testMetadataSetter}, hash: 17973112D9777C38C6FF69DEF98CD78D
    @Test
    void testMetadataSetter() {
        V1beta1ResourceClaimTemplateSpec spec = new V1beta1ResourceClaimTemplateSpec();
        spec.setMetadata(mockMetadata);
        assertEquals(mockMetadata, spec.getMetadata());
    }

    //BaseRock generated method id: ${testSpecSetter}, hash: 403959D99BA352F69C6120983479B9BB
    @Test
    void testSpecSetter() {
        V1beta1ResourceClaimTemplateSpec spec = new V1beta1ResourceClaimTemplateSpec();
        spec.setSpec(mockSpec);
        assertEquals(mockSpec, spec.getSpec());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 02E279F5E47FB4A902A397E6E61B6B4A
    @Test
    void testEqualsWithSameObject() {
        V1beta1ResourceClaimTemplateSpec spec = new V1beta1ResourceClaimTemplateSpec();
        assertTrue(spec.equals(spec));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 0EE2D1F77ABD81774FBAE2ABF1D14263
    @Test
    void testEqualsWithDifferentClass() {
        V1beta1ResourceClaimTemplateSpec spec = new V1beta1ResourceClaimTemplateSpec();
        assertFalse(spec.equals(new Object()));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObjects}, hash: 2A5FDFC2569E9CE55014A15F83BAD080
    @Test
    void testEqualsWithDifferentObjects() {
        V1beta1ResourceClaimTemplateSpec spec1 = new V1beta1ResourceClaimTemplateSpec().metadata(mockMetadata).spec(mockSpec);
        V1beta1ResourceClaimTemplateSpec spec2 = new V1beta1ResourceClaimTemplateSpec().metadata(mock(V1ObjectMeta.class)).spec(mock(V1beta1ResourceClaimSpec.class));
        assertFalse(spec1.equals(spec2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 403E9B9B75D779D0B4538FED7C9DE3CE
    @Test
    void testHashCode() {
        V1beta1ResourceClaimTemplateSpec spec1 = new V1beta1ResourceClaimTemplateSpec().metadata(mockMetadata).spec(mockSpec);
        V1beta1ResourceClaimTemplateSpec spec2 = new V1beta1ResourceClaimTemplateSpec().metadata(mockMetadata).spec(mockSpec);
        assertEquals(spec1.hashCode(), spec2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: CFEEC26FA855F51782FC3EFE26120ED1
    @Test
    void testToString() {
        V1beta1ResourceClaimTemplateSpec spec = new V1beta1ResourceClaimTemplateSpec().metadata(mockMetadata).spec(mockSpec);
        String result = spec.toString();
        assertThat(result, containsString("metadata"));
        assertThat(result, containsString("spec"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: EF3E36D32A3E176EA27A889713CCCC99
    @Disabled()
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = mock(JsonObject.class);
        JsonElement jsonElement = mock(JsonElement.class);
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        HashSet<Map.Entry<String, JsonElement>> entrySet = new HashSet<>();
        when(jsonObject.entrySet()).thenReturn(entrySet);
        JsonElement specElement = mock(JsonElement.class);
        when(jsonObject.get("spec")).thenReturn(specElement);
        assertDoesNotThrow(() -> V1beta1ResourceClaimTemplateSpec.validateJsonElement(jsonElement));
    }

    //BaseRock generated method id: ${testFromJson}, hash: AF000B118BC5919782DE427ACBE85A3C
    @Test
    void testFromJson() throws IOException {
        String json = "{\"metadata\":{},\"spec\":{}}";
        V1beta1ResourceClaimTemplateSpec result = V1beta1ResourceClaimTemplateSpec.fromJson(json);
        assertNotNull(result);
        assertNotNull(result.getMetadata());
        assertNotNull(result.getSpec());
    }

    //BaseRock generated method id: ${testToJson}, hash: 49BBBA0658CB04909956B31CCB8A140B
    @Test
    void testToJson() {
        V1beta1ResourceClaimTemplateSpec spec = new V1beta1ResourceClaimTemplateSpec().metadata(new V1ObjectMeta()).spec(new V1beta1ResourceClaimSpec());
        String json = spec.toJson();
        assertNotNull(json);
        assertThat(json, containsString("metadata"));
        assertThat(json, containsString("spec"));
    }
}
