package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1beta1SelfSubjectReviewStatus;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import java.util.Map;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import java.util.Set;
import org.mockito.MockitoAnnotations;
import com.google.gson.JsonObject;
import static org.junit.jupiter.api.Assertions.*;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1beta1SelfSubjectReviewBaseRockGeneratedTest {

    @Mock
    private V1ObjectMeta mockMetadata;

    @Mock
    private V1beta1SelfSubjectReviewStatus mockStatus;

    private V1beta1SelfSubjectReview subject;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        subject = new V1beta1SelfSubjectReview();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 8420B6FCC69164C5DC46107308053B2F
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1beta1";
        subject.setApiVersion(apiVersion);
        assertEquals(apiVersion, subject.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: 905305FB85AEDB9B405B39A3B361B008
    @Test
    void testSetApiVersion() {
        String apiVersion = "v1beta1";
        subject.setApiVersion(apiVersion);
        assertEquals(apiVersion, subject.getApiVersion());
    }

    //BaseRock generated method id: ${testGetKind}, hash: 30CD7BA80D7F32A5D14B30E920B81D19
    @Test
    void testGetKind() {
        String kind = "SelfSubjectReview";
        subject.setKind(kind);
        assertEquals(kind, subject.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: B4D3220F1C9900E57BF78B482A8D71DD
    @Test
    void testSetKind() {
        String kind = "SelfSubjectReview";
        subject.setKind(kind);
        assertEquals(kind, subject.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 840076DAC84BD974E4F000B68E2CD6F3
    @Test
    void testGetMetadata() {
        subject.setMetadata(mockMetadata);
        assertEquals(mockMetadata, subject.getMetadata());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: 58AF8A1F9C34AFFB1AE7D537806C3137
    @Test
    void testSetMetadata() {
        subject.setMetadata(mockMetadata);
        assertEquals(mockMetadata, subject.getMetadata());
    }

    //BaseRock generated method id: ${testGetStatus}, hash: 36CBE1F30691A4BD18F33F1DC6AF563B
    @Test
    void testGetStatus() {
        subject.setStatus(mockStatus);
        assertEquals(mockStatus, subject.getStatus());
    }

    //BaseRock generated method id: ${testSetStatus}, hash: 2DF278788F327F8DAE41F33B31DE1261
    @Test
    void testSetStatus() {
        subject.setStatus(mockStatus);
        assertEquals(mockStatus, subject.getStatus());
    }

    //BaseRock generated method id: ${testEquals}, hash: ED0FF734E73C578A76874E4FA1D9188B
    @Test
    void testEquals() {
        V1beta1SelfSubjectReview other = new V1beta1SelfSubjectReview();
        other.setApiVersion("v1beta1");
        other.setKind("SelfSubjectReview");
        other.setMetadata(mockMetadata);
        other.setStatus(mockStatus);
        subject.setApiVersion("v1beta1");
        subject.setKind("SelfSubjectReview");
        subject.setMetadata(mockMetadata);
        subject.setStatus(mockStatus);
        assertTrue(subject.equals(other));
    }

    //BaseRock generated method id: ${testHashCode}, hash: E1118134D442827F9511BF51A9E0E986
    @Test
    void testHashCode() {
        subject.setApiVersion("v1beta1");
        subject.setKind("SelfSubjectReview");
        subject.setMetadata(mockMetadata);
        subject.setStatus(mockStatus);
        int expectedHashCode = subject.hashCode();
        assertEquals(expectedHashCode, subject.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 9030143B820FE4AF6483D4D80DCB43AC
    @Test
    void testToString() {
        subject.setApiVersion("v1beta1");
        subject.setKind("SelfSubjectReview");
        subject.setMetadata(mockMetadata);
        subject.setStatus(mockStatus);
        String expectedString = "class V1beta1SelfSubjectReview {\n    apiVersion: v1beta1\n    kind: SelfSubjectReview\n    metadata: " + mockMetadata + "\n    status: " + mockStatus + "\n}";
        assertEquals(expectedString, subject.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: E5685F646AED04DC83DD23BD5C8DB800
    @Disabled()
    @Test
    void testValidateJsonElement() throws IOException {
        JsonElement mockJsonElement = mock(JsonElement.class);
        JsonObject mockJsonObject = mock(JsonObject.class);
        Set<Map.Entry<String, JsonElement>> mockEntrySet = mock(Set.class);
        when(mockJsonElement.isJsonNull()).thenReturn(false);
        when(mockJsonElement.getAsJsonObject()).thenReturn(mockJsonObject);
        when(mockJsonObject.entrySet()).thenReturn(mockEntrySet);
        when(mockEntrySet.iterator()).thenReturn(mock(java.util.Iterator.class));
        // Add null check before calling getAsJsonObject()
        when(mockJsonElement.isJsonObject()).thenReturn(true);
        assertDoesNotThrow(() -> V1beta1SelfSubjectReview.validateJsonElement(mockJsonElement));
        JsonElement mockJsonNull = mock(JsonElement.class);
        when(mockJsonNull.isJsonNull()).thenReturn(true);
        assertDoesNotThrow(() -> V1beta1SelfSubjectReview.validateJsonElement(mockJsonNull));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 6D734F1DC24CE0AAEAA84D5A2072B915
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1beta1\",\"kind\":\"SelfSubjectReview\"}";
        V1beta1SelfSubjectReview result = V1beta1SelfSubjectReview.fromJson(json);
        assertNotNull(result);
        assertEquals("v1beta1", result.getApiVersion());
        assertEquals("SelfSubjectReview", result.getKind());
    }

    //BaseRock generated method id: ${testToJson}, hash: 45F7614E90522AF330C145A32F78E670
    @Test
    void testToJson() {
        subject.setApiVersion("v1beta1");
        subject.setKind("SelfSubjectReview");
        String json = subject.toJson();
        assertTrue(json.contains("\"apiVersion\":\"v1beta1\""));
        assertTrue(json.contains("\"kind\":\"SelfSubjectReview\""));
    }
}
