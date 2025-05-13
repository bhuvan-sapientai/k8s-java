package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Timeout;
import com.google.gson.JsonPrimitive;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.google.gson.JsonObject;
import static org.hamcrest.Matchers.not;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import org.junit.jupiter.params.provider.NullSource;
import java.io.IOException;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1GlusterfsPersistentVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testDefaultConstructor}, hash: E66CACB4F4A7A65EA49C0696E328371F
    @Test
    void testDefaultConstructor() {
        V1GlusterfsPersistentVolumeSource volumeSource = new V1GlusterfsPersistentVolumeSource();
        assertThat(volumeSource, is(not(nullValue())));
        assertThat(volumeSource.getEndpoints(), is(nullValue()));
        assertThat(volumeSource.getEndpointsNamespace(), is(nullValue()));
        assertThat(volumeSource.getPath(), is(nullValue()));
        assertThat(volumeSource.getReadOnly(), is(nullValue()));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: A5D29662AAD294461C12F77C9FCA0693
    @Test
    void testBuilderPattern() {
        V1GlusterfsPersistentVolumeSource volumeSource = new V1GlusterfsPersistentVolumeSource().endpoints("glusterfs-cluster").endpointsNamespace("default").path("/data").readOnly(true);
        assertThat(volumeSource.getEndpoints(), equalTo("glusterfs-cluster"));
        assertThat(volumeSource.getEndpointsNamespace(), equalTo("default"));
        assertThat(volumeSource.getPath(), equalTo("/data"));
        assertThat(volumeSource.getReadOnly(), equalTo(true));
    }

    //BaseRock generated method id: ${testGettersAndSetters}, hash: 9CA165B689B5DD7D19A61B54948118AF
    @Test
    void testGettersAndSetters() {
        V1GlusterfsPersistentVolumeSource volumeSource = new V1GlusterfsPersistentVolumeSource();
        volumeSource.setEndpoints("glusterfs-endpoints");
        volumeSource.setEndpointsNamespace("kube-system");
        volumeSource.setPath("/glusterfs/volume1");
        volumeSource.setReadOnly(false);
        assertThat(volumeSource.getEndpoints(), equalTo("glusterfs-endpoints"));
        assertThat(volumeSource.getEndpointsNamespace(), equalTo("kube-system"));
        assertThat(volumeSource.getPath(), equalTo("/glusterfs/volume1"));
        assertThat(volumeSource.getReadOnly(), equalTo(false));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 1ED63E6D6A1821739D46F6B550EE80D0
    @Test
    void testEqualsWithSameObject() {
        V1GlusterfsPersistentVolumeSource volumeSource = new V1GlusterfsPersistentVolumeSource().endpoints("ep1").path("/path1");
        assertTrue(volumeSource.equals(volumeSource));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 5B74AB1A404F42CF4977631C74D27510
    @Test
    void testEqualsWithDifferentClass() {
        V1GlusterfsPersistentVolumeSource volumeSource = new V1GlusterfsPersistentVolumeSource().endpoints("ep1").path("/path1");
        assertFalse(volumeSource.equals("Not a V1GlusterfsPersistentVolumeSource"));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: 908EDE9EFAF57AF24C8FE8A61F1E0A96
    @Test
    void testEqualsWithNull() {
        V1GlusterfsPersistentVolumeSource volumeSource = new V1GlusterfsPersistentVolumeSource().endpoints("ep1").path("/path1");
        assertFalse(volumeSource.equals(null));
    }

    //BaseRock generated method id: ${testEqualsWithEqualObjects}, hash: 2A31015179E138B157CC3B3320AFC470
    @Test
    void testEqualsWithEqualObjects() {
        V1GlusterfsPersistentVolumeSource volumeSource1 = new V1GlusterfsPersistentVolumeSource().endpoints("endpoints-1").endpointsNamespace("namespace-1").path("/path/to/volume").readOnly(true);
        V1GlusterfsPersistentVolumeSource volumeSource2 = new V1GlusterfsPersistentVolumeSource().endpoints("endpoints-1").endpointsNamespace("namespace-1").path("/path/to/volume").readOnly(true);
        assertTrue(volumeSource1.equals(volumeSource2));
        assertTrue(volumeSource2.equals(volumeSource1));
        assertEquals(volumeSource1.hashCode(), volumeSource2.hashCode());
    }

    //BaseRock generated method id: ${testEqualsWithDifferentEndpoints}, hash: 3E8647988946FBDE148B704D11BE4056
    @Test
    void testEqualsWithDifferentEndpoints() {
        V1GlusterfsPersistentVolumeSource volumeSource1 = new V1GlusterfsPersistentVolumeSource().endpoints("endpoints-1").path("/path");
        V1GlusterfsPersistentVolumeSource volumeSource2 = new V1GlusterfsPersistentVolumeSource().endpoints("endpoints-2").path("/path");
        assertFalse(volumeSource1.equals(volumeSource2));
        assertNotEquals(volumeSource1.hashCode(), volumeSource2.hashCode());
    }

    //BaseRock generated method id: ${testEqualsWithDifferentEndpointsNamespace}, hash: 802DCA36A421B3ADE9208E403D218B0B
    @Test
    void testEqualsWithDifferentEndpointsNamespace() {
        V1GlusterfsPersistentVolumeSource volumeSource1 = new V1GlusterfsPersistentVolumeSource().endpoints("endpoints-1").endpointsNamespace("namespace-1").path("/path");
        V1GlusterfsPersistentVolumeSource volumeSource2 = new V1GlusterfsPersistentVolumeSource().endpoints("endpoints-1").endpointsNamespace("namespace-2").path("/path");
        assertFalse(volumeSource1.equals(volumeSource2));
        assertNotEquals(volumeSource1.hashCode(), volumeSource2.hashCode());
    }

    //BaseRock generated method id: ${testEqualsWithDifferentPath}, hash: 5EB7E0D0259E398D8AEB6C7F005F5055
    @Test
    void testEqualsWithDifferentPath() {
        V1GlusterfsPersistentVolumeSource volumeSource1 = new V1GlusterfsPersistentVolumeSource().endpoints("endpoints-1").path("/path1");
        V1GlusterfsPersistentVolumeSource volumeSource2 = new V1GlusterfsPersistentVolumeSource().endpoints("endpoints-1").path("/path2");
        assertFalse(volumeSource1.equals(volumeSource2));
        assertNotEquals(volumeSource1.hashCode(), volumeSource2.hashCode());
    }

    //BaseRock generated method id: ${testEqualsWithDifferentReadOnly}, hash: 3078CB60DE3E950651EA2FADFB0A8397
    @Test
    void testEqualsWithDifferentReadOnly() {
        V1GlusterfsPersistentVolumeSource volumeSource1 = new V1GlusterfsPersistentVolumeSource().endpoints("endpoints-1").path("/path").readOnly(true);
        V1GlusterfsPersistentVolumeSource volumeSource2 = new V1GlusterfsPersistentVolumeSource().endpoints("endpoints-1").path("/path").readOnly(false);
        assertFalse(volumeSource1.equals(volumeSource2));
        assertNotEquals(volumeSource1.hashCode(), volumeSource2.hashCode());
    }

    //BaseRock generated method id: ${testHashCode}, hash: 8286D5A1B7D60FD298CD5265C169681E
    @Test
    void testHashCode() {
        V1GlusterfsPersistentVolumeSource volumeSource = new V1GlusterfsPersistentVolumeSource().endpoints("test-endpoints").endpointsNamespace("test-namespace").path("/test/path").readOnly(true);
        int expectedHashCode = java.util.Objects.hash(volumeSource.getEndpoints(), volumeSource.getEndpointsNamespace(), volumeSource.getPath(), volumeSource.getReadOnly());
        assertEquals(expectedHashCode, volumeSource.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: E2D3828D837F76FCA1297298A4E75421
    @Test
    void testToString() {
        V1GlusterfsPersistentVolumeSource volumeSource = new V1GlusterfsPersistentVolumeSource().endpoints("glusterfs-endpoints").endpointsNamespace("default").path("/data").readOnly(true);
        String toString = volumeSource.toString();
        assertTrue(toString.contains("endpoints: glusterfs-endpoints"));
        assertTrue(toString.contains("endpointsNamespace: default"));
        assertTrue(toString.contains("path: /data"));
        assertTrue(toString.contains("readOnly: true"));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithValidJson}, hash: C6220EC456A2CB5B00848C1CD8D6EA77
    @Test
    void testValidateJsonElementWithValidJson() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("endpoints", "test-endpoints");
        jsonObject.addProperty("path", "/test/path");
        // Should not throw exception
        V1GlusterfsPersistentVolumeSource.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testValidateJsonElementWithMissingRequiredField}, hash: C4E3AC04310059F8A5E87FC4A53816DF
    @Test
    void testValidateJsonElementWithMissingRequiredField() {
        JsonObject jsonObject = new JsonObject();
        // Missing 'endpoints' field which is required
        jsonObject.addProperty("path", "/test/path");
        assertThrows(IllegalArgumentException.class, () -> {
            V1GlusterfsPersistentVolumeSource.validateJsonElement(jsonObject);
        });
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidFieldType}, hash: F953F0A13F2BB4E216396A6FE675EEE0
    @Test
    void testValidateJsonElementWithInvalidFieldType() {
        JsonObject jsonObject = new JsonObject();
        // 'endpoints' should be a primitive but is an object
        JsonObject nestedObject = new JsonObject();
        jsonObject.add("endpoints", nestedObject);
        jsonObject.addProperty("path", "/test/path");
        assertThrows(IllegalArgumentException.class, () -> {
            V1GlusterfsPersistentVolumeSource.validateJsonElement(jsonObject);
        });
    }

    //BaseRock generated method id: ${testValidateJsonElementWithUndefinedField}, hash: 1DEE3641990D99DBBE1B58738BF75DA3
    @Test
    void testValidateJsonElementWithUndefinedField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("endpoints", "test-endpoints");
        jsonObject.addProperty("path", "/test/path");
        // Adding undefined field
        jsonObject.addProperty("undefinedField", "some-value");
        assertThrows(IllegalArgumentException.class, () -> {
            V1GlusterfsPersistentVolumeSource.validateJsonElement(jsonObject);
        });
    }

    //BaseRock generated method id: ${testValidateJsonElementWithNullJsonElement}, hash: 203C44F7D203B83389800D5908758146
    @Test
    void testValidateJsonElementWithNullJsonElement() {
        assertThrows(IllegalArgumentException.class, () -> {
            V1GlusterfsPersistentVolumeSource.validateJsonElement(null);
        });
    }

    //BaseRock generated method id: ${testFromJsonSuccess}, hash: 6F398D75F2269A3A7AE1270C531B2B9D
    @Test
    void testFromJsonSuccess() throws IOException {
        String json = "{\"endpoints\":\"glusterfs-endpoints\",\"endpointsNamespace\":\"default\",\"path\":\"/data\",\"readOnly\":true}";
        V1GlusterfsPersistentVolumeSource result = V1GlusterfsPersistentVolumeSource.fromJson(json);
        assertThat(result, is(not(nullValue())));
        assertThat(result.getEndpoints(), equalTo("glusterfs-endpoints"));
        assertThat(result.getEndpointsNamespace(), equalTo("default"));
        assertThat(result.getPath(), equalTo("/data"));
        assertThat(result.getReadOnly(), equalTo(true));
    }

    //BaseRock generated method id: ${testToJson}, hash: 602A82B63CA1B83CE100C444B56E6D2B
    @Test
    void testToJson() {
        V1GlusterfsPersistentVolumeSource volumeSource = new V1GlusterfsPersistentVolumeSource().endpoints("glusterfs-endpoints").endpointsNamespace("default").path("/data").readOnly(true);
        String json = volumeSource.toJson();
        assertTrue(json.contains("\"endpoints\":\"glusterfs-endpoints\""));
        assertTrue(json.contains("\"endpointsNamespace\":\"default\""));
        assertTrue(json.contains("\"path\":\"/data\""));
        assertTrue(json.contains("\"readOnly\":true"));
    }

    //BaseRock generated method id: ${testSetEndpointsWithNull}, hash: 9FA2856DFAEBE1EE971FF7F3AFAC1CA8
    @ParameterizedTest
    @NullSource
    void testSetEndpointsWithNull(String value) {
        V1GlusterfsPersistentVolumeSource volumeSource = new V1GlusterfsPersistentVolumeSource();
        volumeSource.setEndpoints(value);
        assertThat(volumeSource.getEndpoints(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetEndpointsWithVariousValues}, hash: 167D09FFF001506C45C3CCCA768124AE
    @ParameterizedTest
    @ValueSource(strings = { "test-endpoint", "glusterfs-cluster", "" })
    void testSetEndpointsWithVariousValues(String value) {
        V1GlusterfsPersistentVolumeSource volumeSource = new V1GlusterfsPersistentVolumeSource();
        volumeSource.setEndpoints(value);
        assertThat(volumeSource.getEndpoints(), equalTo(value));
    }

    //BaseRock generated method id: ${testSetEndpointsNamespaceWithNull}, hash: 77A2F3603ADD3F6CDCF1AD074ABBFBDE
    @ParameterizedTest
    @NullSource
    void testSetEndpointsNamespaceWithNull(String value) {
        V1GlusterfsPersistentVolumeSource volumeSource = new V1GlusterfsPersistentVolumeSource();
        volumeSource.setEndpointsNamespace(value);
        assertThat(volumeSource.getEndpointsNamespace(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetEndpointsNamespaceWithVariousValues}, hash: D12DE58C75F095D7BBB214562CBC3D1D
    @ParameterizedTest
    @ValueSource(strings = { "default", "kube-system", "" })
    void testSetEndpointsNamespaceWithVariousValues(String value) {
        V1GlusterfsPersistentVolumeSource volumeSource = new V1GlusterfsPersistentVolumeSource();
        volumeSource.setEndpointsNamespace(value);
        assertThat(volumeSource.getEndpointsNamespace(), equalTo(value));
    }

    //BaseRock generated method id: ${testSetPathWithNull}, hash: E5F33AC3455DDB3FC8B5AA64C134CA84
    @ParameterizedTest
    @NullSource
    void testSetPathWithNull(String value) {
        V1GlusterfsPersistentVolumeSource volumeSource = new V1GlusterfsPersistentVolumeSource();
        volumeSource.setPath(value);
        assertThat(volumeSource.getPath(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetPathWithVariousValues}, hash: 25E98C199AD4F8D5CFB08660A5CF29BC
    @ParameterizedTest
    @ValueSource(strings = { "/data", "/glusterfs/volume1", "" })
    void testSetPathWithVariousValues(String value) {
        V1GlusterfsPersistentVolumeSource volumeSource = new V1GlusterfsPersistentVolumeSource();
        volumeSource.setPath(value);
        assertThat(volumeSource.getPath(), equalTo(value));
    }

    //BaseRock generated method id: ${testSetReadOnlyWithNull}, hash: F59D1ED658FF256446EDFC1B57FC7079
    @ParameterizedTest
    @NullSource
    void testSetReadOnlyWithNull(Boolean value) {
        V1GlusterfsPersistentVolumeSource volumeSource = new V1GlusterfsPersistentVolumeSource();
        volumeSource.setReadOnly(value);
        assertThat(volumeSource.getReadOnly(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetReadOnlyWithTrue}, hash: 9874335DB4B115665EA310DFA07165F1
    @Test
    void testSetReadOnlyWithTrue() {
        V1GlusterfsPersistentVolumeSource volumeSource = new V1GlusterfsPersistentVolumeSource();
        volumeSource.setReadOnly(true);
        assertThat(volumeSource.getReadOnly(), equalTo(true));
    }

    //BaseRock generated method id: ${testSetReadOnlyWithFalse}, hash: 9BC8FEE5451D4A672F599C1D6E58AD0B
    @Test
    void testSetReadOnlyWithFalse() {
        V1GlusterfsPersistentVolumeSource volumeSource = new V1GlusterfsPersistentVolumeSource();
        volumeSource.setReadOnly(false);
        assertThat(volumeSource.getReadOnly(), equalTo(false));
    }
}
