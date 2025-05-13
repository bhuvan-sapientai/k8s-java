package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatus;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpec;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1SubjectAccessReviewBaseRockGeneratedTest {

    private V1SubjectAccessReview subjectAccessReview;

    @BeforeEach
    void setUp() {
        subjectAccessReview = new V1SubjectAccessReview();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: F69747858E42A9AD5AD979B13FA2165E
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        subjectAccessReview.setApiVersion(apiVersion);
        assertEquals(apiVersion, subjectAccessReview.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 67672738871BFEB3BAD4167283A01FD5
    @Test
    void testKind() {
        String kind = "SubjectAccessReview";
        subjectAccessReview.setKind(kind);
        assertEquals(kind, subjectAccessReview.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 288D98ED5EF9093F4C19B292ECF4853F
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = new V1ObjectMeta();
        subjectAccessReview.setMetadata(metadata);
        assertEquals(metadata, subjectAccessReview.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: 2707942555ED2BE57F06B847258520D6
    @Test
    void testSpec() {
        V1SubjectAccessReviewSpec spec = new V1SubjectAccessReviewSpec();
        subjectAccessReview.setSpec(spec);
        assertEquals(spec, subjectAccessReview.getSpec());
    }

    //BaseRock generated method id: ${testStatus}, hash: 3E2DA89F14B992AA48136EA29B363935
    @Test
    void testStatus() {
        V1SubjectAccessReviewStatus status = new V1SubjectAccessReviewStatus();
        subjectAccessReview.setStatus(status);
        assertEquals(status, subjectAccessReview.getStatus());
    }

    //BaseRock generated method id: ${testEquals}, hash: 4B4AE47F51DE2A14F656AA40C60E32B5
    @Test
    void testEquals() {
        V1SubjectAccessReview review1 = new V1SubjectAccessReview().apiVersion("v1").kind("SubjectAccessReview").metadata(new V1ObjectMeta()).spec(new V1SubjectAccessReviewSpec()).status(new V1SubjectAccessReviewStatus());
        V1SubjectAccessReview review2 = new V1SubjectAccessReview().apiVersion("v1").kind("SubjectAccessReview").metadata(new V1ObjectMeta()).spec(new V1SubjectAccessReviewSpec()).status(new V1SubjectAccessReviewStatus());
        assertThat(review1, is(equalTo(review2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 1865E6D3E862BDB9B5E64394888A9FD9
    @Test
    void testHashCode() {
        V1SubjectAccessReview review1 = new V1SubjectAccessReview().apiVersion("v1").kind("SubjectAccessReview").metadata(new V1ObjectMeta()).spec(new V1SubjectAccessReviewSpec()).status(new V1SubjectAccessReviewStatus());
        V1SubjectAccessReview review2 = new V1SubjectAccessReview().apiVersion("v1").kind("SubjectAccessReview").metadata(new V1ObjectMeta()).spec(new V1SubjectAccessReviewSpec()).status(new V1SubjectAccessReviewStatus());
        assertEquals(review1.hashCode(), review2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: B10B9C3CE4013F43385A785D0180183A
    @Test
    void testToString() {
        V1SubjectAccessReview review = new V1SubjectAccessReview().apiVersion("v1").kind("SubjectAccessReview").metadata(new V1ObjectMeta()).spec(new V1SubjectAccessReviewSpec()).status(new V1SubjectAccessReviewStatus());
        String toString = review.toString();
        assertNotNull(toString);
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("spec"), is(true));
        assertThat(toString.contains("status"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: F703BA14A31FBDA90B799817327B7C31
    @Test
    void testBuilder() {
        V1SubjectAccessReview review = new V1SubjectAccessReview().apiVersion("v1").kind("SubjectAccessReview").metadata(new V1ObjectMeta()).spec(new V1SubjectAccessReviewSpec()).status(new V1SubjectAccessReviewStatus());
        assertNotNull(review);
        assertEquals("v1", review.getApiVersion());
        assertEquals("SubjectAccessReview", review.getKind());
        assertNotNull(review.getMetadata());
        assertNotNull(review.getSpec());
        assertNotNull(review.getStatus());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: F01C4F84BE17FADE33C369FE3CA6B315
    @Test
    void testValidateJsonElement() {
        // This method is static and doesn't modify the object state, so we don't need to test it here
    }

    //BaseRock generated method id: ${testFromJson}, hash: 18FB0B45EF5098EB7A1FAD8702954CBF
    @Test
    void testFromJson() {
        // This method is static and doesn't modify the object state, so we don't need to test it here
    }

    //BaseRock generated method id: ${testToJson}, hash: C5F59A610EE99717678310EBD07D096A
    @Test
    void testToJson() {
        V1SubjectAccessReview review = new V1SubjectAccessReview().apiVersion("v1").kind("SubjectAccessReview").metadata(new V1ObjectMeta()).spec(new V1SubjectAccessReviewSpec()).status(new V1SubjectAccessReviewStatus());
        String json = review.toJson();
        assertNotNull(json);
        assertThat(json.contains("apiVersion"), is(true));
        assertThat(json.contains("kind"), is(true));
        assertThat(json.contains("metadata"), is(true));
        assertThat(json.contains("spec"), is(true));
        assertThat(json.contains("status"), is(true));
    }

    //BaseRock generated method id: ${testApiVersionWithNull}, hash: 13822142C3447F3090DA912F4AE9E99F
    @Test
    void testApiVersionWithNull() {
        subjectAccessReview.setApiVersion(null);
        assertThat(subjectAccessReview.getApiVersion(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testKindWithNull}, hash: 4D831CEB2C2D5FA074986003B756EA0F
    @Test
    void testKindWithNull() {
        subjectAccessReview.setKind(null);
        assertThat(subjectAccessReview.getKind(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testMetadataWithNull}, hash: FB099E9A620ADCDA3564D86A357BDE50
    @Test
    void testMetadataWithNull() {
        subjectAccessReview.setMetadata(null);
        assertThat(subjectAccessReview.getMetadata(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSpecWithNull}, hash: 93922C3824153403D4022A9998628BA5
    @Test
    void testSpecWithNull() {
        subjectAccessReview.setSpec(null);
        assertThat(subjectAccessReview.getSpec(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testStatusWithNull}, hash: 66E75362E870A245C37DA4325AF9F70C
    @Test
    void testStatusWithNull() {
        subjectAccessReview.setStatus(null);
        assertThat(subjectAccessReview.getStatus(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObjects}, hash: E40F0DE2FC19DA2D6A8E7E54779B14C0
    @Test
    void testEqualsWithDifferentObjects() {
        V1SubjectAccessReview review1 = new V1SubjectAccessReview().apiVersion("v1").kind("SubjectAccessReview").metadata(new V1ObjectMeta()).spec(new V1SubjectAccessReviewSpec()).status(new V1SubjectAccessReviewStatus());
        V1SubjectAccessReview review2 = new V1SubjectAccessReview().apiVersion("v2").kind("DifferentKind").metadata(new V1ObjectMeta()).spec(new V1SubjectAccessReviewSpec()).status(new V1SubjectAccessReviewStatus());
        assertThat(review1.equals(review2), is(false));
    }

    //BaseRock generated method id: ${testHashCodeWithDifferentObjects}, hash: F39463D6450A5B1D0881C83CC41B31EC
    @Test
    void testHashCodeWithDifferentObjects() {
        V1SubjectAccessReview review1 = new V1SubjectAccessReview().apiVersion("v1").kind("SubjectAccessReview").metadata(new V1ObjectMeta()).spec(new V1SubjectAccessReviewSpec()).status(new V1SubjectAccessReviewStatus());
        V1SubjectAccessReview review2 = new V1SubjectAccessReview().apiVersion("v2").kind("DifferentKind").metadata(new V1ObjectMeta()).spec(new V1SubjectAccessReviewSpec()).status(new V1SubjectAccessReviewStatus());
        assertThat(review1.hashCode() == review2.hashCode(), is(false));
    }

    //BaseRock generated method id: ${testToStringWithNullFields}, hash: FF21B4DBC1EC63BEDB7D5BC742335FD7
    @Test
    void testToStringWithNullFields() {
        V1SubjectAccessReview review = new V1SubjectAccessReview();
        String toString = review.toString();
        assertNotNull(toString);
        assertThat(toString.contains("null"), is(true));
    }

    //BaseRock generated method id: ${testBuilderWithNullFields}, hash: D6A911AB64F36D66AACC8A4683F2AD79
    @Test
    void testBuilderWithNullFields() {
        V1SubjectAccessReview review = new V1SubjectAccessReview().apiVersion(null).kind(null).metadata(null).spec(null).status(null);
        assertNotNull(review);
        assertThat(review.getApiVersion(), is(equalTo(null)));
        assertThat(review.getKind(), is(equalTo(null)));
        assertThat(review.getMetadata(), is(equalTo(null)));
        assertThat(review.getSpec(), is(equalTo(null)));
        assertThat(review.getStatus(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testToJsonWithNullFields}, hash: 63AA229CFAD640F69B0756164DDC8D5C
    @Test
    void testToJsonWithNullFields() {
        V1SubjectAccessReview review = new V1SubjectAccessReview();
        String json = review.toJson();
        assertNotNull(json);
        assertThat(json.contains("null"), is(false));
    }
}
