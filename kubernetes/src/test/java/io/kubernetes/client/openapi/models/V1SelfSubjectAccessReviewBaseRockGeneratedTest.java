package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatus;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpec;
import com.google.gson.JsonObject;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1SelfSubjectAccessReviewBaseRockGeneratedTest {

    @Mock
    private V1SelfSubjectAccessReviewSpec mockSpec;

    @Mock
    private V1SubjectAccessReviewStatus mockStatus;

    @Mock
    private V1ObjectMeta mockMetadata;

    private V1SelfSubjectAccessReview subjectAccessReview;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        subjectAccessReview = new V1SelfSubjectAccessReview();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: E44CD592D983E937ED84F992BD0B39F0
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1";
        subjectAccessReview.setApiVersion(apiVersion);
        assertEquals(apiVersion, subjectAccessReview.getApiVersion());
    }

    //BaseRock generated method id: ${testGetKind}, hash: C79FA51566CBC4C5D151431E9A31E043
    @Test
    void testGetKind() {
        String kind = "SelfSubjectAccessReview";
        subjectAccessReview.setKind(kind);
        assertEquals(kind, subjectAccessReview.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 2529B69D0632734765A4C3ED70465C47
    @Test
    void testGetMetadata() {
        subjectAccessReview.setMetadata(mockMetadata);
        assertEquals(mockMetadata, subjectAccessReview.getMetadata());
    }

    //BaseRock generated method id: ${testGetSpec}, hash: 3DCEF5CBCC5D1699B29E42BFBEF22CBB
    @Test
    void testGetSpec() {
        subjectAccessReview.setSpec(mockSpec);
        assertEquals(mockSpec, subjectAccessReview.getSpec());
    }

    //BaseRock generated method id: ${testGetStatus}, hash: B937A8E31A0CEAD60E27C27DB4D2AC92
    @Test
    void testGetStatus() {
        subjectAccessReview.setStatus(mockStatus);
        assertEquals(mockStatus, subjectAccessReview.getStatus());
    }

    //BaseRock generated method id: ${testEquals}, hash: 7EBC3E62574918F8AD40BD1C9272F963
    @Test
    void testEquals() {
        V1SelfSubjectAccessReview review1 = new V1SelfSubjectAccessReview().apiVersion("v1").kind("SelfSubjectAccessReview").metadata(mockMetadata).spec(mockSpec).status(mockStatus);
        V1SelfSubjectAccessReview review2 = new V1SelfSubjectAccessReview().apiVersion("v1").kind("SelfSubjectAccessReview").metadata(mockMetadata).spec(mockSpec).status(mockStatus);
        assertThat(review1, is(equalTo(review2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: A61393437BEB2437FEFE9E9433B4706F
    @Test
    void testHashCode() {
        V1SelfSubjectAccessReview review = new V1SelfSubjectAccessReview().apiVersion("v1").kind("SelfSubjectAccessReview").metadata(mockMetadata).spec(mockSpec).status(mockStatus);
        int hashCode = review.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 57FCB3F756A41CFE1CAADF315E6FEB80
    @Test
    void testToString() {
        V1SelfSubjectAccessReview review = new V1SelfSubjectAccessReview().apiVersion("v1").kind("SelfSubjectAccessReview").metadata(mockMetadata).spec(mockSpec).status(mockStatus);
        String toString = review.toString();
        assertNotNull(toString);
        assertThat(toString, containsString("apiVersion"));
        assertThat(toString, containsString("kind"));
        assertThat(toString, containsString("metadata"));
        assertThat(toString, containsString("spec"));
        assertThat(toString, containsString("status"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 846CB91A99B8E196DF74C76CC259CC88
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiVersion", "v1");
        jsonObject.addProperty("kind", "SelfSubjectAccessReview");
        jsonObject.add("metadata", new JsonObject());
        jsonObject.add("spec", new JsonObject());
        JsonObject statusObject = new JsonObject();
        statusObject.addProperty("allowed", true);
        jsonObject.add("status", statusObject);
        V1SelfSubjectAccessReview.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testFromJson}, hash: 2D13034A32CCCD728868A191154426E0
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"SelfSubjectAccessReview\",\"metadata\":{},\"spec\":{},\"status\":{\"allowed\":true}}";
        V1SelfSubjectAccessReview review = V1SelfSubjectAccessReview.fromJson(json);
        assertNotNull(review);
        assertEquals("v1", review.getApiVersion());
        assertEquals("SelfSubjectAccessReview", review.getKind());
        assertNotNull(review.getMetadata());
        assertNotNull(review.getSpec());
        assertNotNull(review.getStatus());
    }

    //BaseRock generated method id: ${testToJson}, hash: 088E6075E454732F12294F7659B9DEC7
    @Disabled()
    @Test
    void testToJson() {
        V1SubjectAccessReviewStatus status = new V1SubjectAccessReviewStatus();
        status.setAllowed(true);
        V1SelfSubjectAccessReview review = new V1SelfSubjectAccessReview().apiVersion("v1").kind("SelfSubjectAccessReview").metadata(new V1ObjectMeta()).spec(new V1SelfSubjectAccessReviewSpec()).status(status);
        String json = review.toJson();
        assertNotNull(json);
        assertThat(json, containsString("\"apiVersion\":\"v1\""));
        assertThat(json, containsString("\"kind\":\"SelfSubjectAccessReview\""));
        assertThat(json, containsString("\"metadata\":{}"));
        assertThat(json, containsString("\"spec\":{}"));
        assertThat(json, containsString("\"status\":{\"allowed\":true}"));
    }
}
