package io.kubernetes.client.openapi.models;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doNothing;
import io.kubernetes.client.openapi.models.V1TokenReviewStatus;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.mockito.Mockito.mock;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mockStatic;
import com.google.gson.JsonObject;
import static org.mockito.Mockito.when;
import com.google.gson.JsonElement;
import io.kubernetes.client.openapi.models.V1TokenReviewSpec;
import org.mockito.MockedStatic;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1TokenReviewBaseRockGeneratedTest {

    private V1TokenReview tokenReview;

    @BeforeEach
    void setUp() {
        tokenReview = new V1TokenReview();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: D7BA14E930D1ED0EDCB985CCDE4DDA5C
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        tokenReview.apiVersion(apiVersion);
        assertEquals(apiVersion, tokenReview.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 52C8393877AE6572A831273AC404C460
    @Test
    void testKind() {
        String kind = "TokenReview";
        tokenReview.kind(kind);
        assertEquals(kind, tokenReview.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 5EECB4D55A014D3CF17BFF14F1C63400
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = new V1ObjectMeta();
        tokenReview.metadata(metadata);
        assertThat(tokenReview.getMetadata(), is(metadata));
    }

    //BaseRock generated method id: ${testSpec}, hash: EB1A09E96AA66B2FCE47D16389683963
    @Test
    void testSpec() {
        V1TokenReviewSpec spec = new V1TokenReviewSpec();
        tokenReview.spec(spec);
        assertThat(tokenReview.getSpec(), is(spec));
    }

    //BaseRock generated method id: ${testStatus}, hash: 6B80E8D3340FB6519089D76F174BC07F
    @Test
    void testStatus() {
        V1TokenReviewStatus status = new V1TokenReviewStatus();
        tokenReview.status(status);
        assertThat(tokenReview.getStatus(), is(status));
    }

    //BaseRock generated method id: ${testEquals}, hash: C64A554B5B5BE4A3E3DB9DD7CF405569
    @Test
    void testEquals() {
        V1TokenReview tokenReview1 = new V1TokenReview().apiVersion("v1").kind("TokenReview").metadata(new V1ObjectMeta()).spec(new V1TokenReviewSpec()).status(new V1TokenReviewStatus());
        V1TokenReview tokenReview2 = new V1TokenReview().apiVersion("v1").kind("TokenReview").metadata(new V1ObjectMeta()).spec(new V1TokenReviewSpec()).status(new V1TokenReviewStatus());
        assertThat(tokenReview1.equals(tokenReview2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 4C7D4D5CEC80B090ACB26E625E74CFFB
    @Test
    void testHashCode() {
        V1TokenReview tokenReview1 = new V1TokenReview().apiVersion("v1").kind("TokenReview").metadata(new V1ObjectMeta()).spec(new V1TokenReviewSpec()).status(new V1TokenReviewStatus());
        V1TokenReview tokenReview2 = new V1TokenReview().apiVersion("v1").kind("TokenReview").metadata(new V1ObjectMeta()).spec(new V1TokenReviewSpec()).status(new V1TokenReviewStatus());
        assertEquals(tokenReview1.hashCode(), tokenReview2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 030F7DD8DD1B526AA84B67716B888395
    @Test
    void testToString() {
        V1TokenReview tokenReview = new V1TokenReview().apiVersion("v1").kind("TokenReview").metadata(new V1ObjectMeta()).spec(new V1TokenReviewSpec()).status(new V1TokenReviewStatus());
        String expectedString = "class V1TokenReview {\n" + "    apiVersion: v1\n" + "    kind: TokenReview\n" + "    metadata: class V1ObjectMeta {\n" + "        annotations: {}\n" + "        creationTimestamp: null\n" + "        deletionGracePeriodSeconds: null\n" + "        deletionTimestamp: null\n" + "        finalizers: []\n" + "        generateName: null\n" + "        generation: null\n" + "        labels: {}\n" + "        managedFields: []\n" + "        name: null\n" + "        namespace: null\n" + "        ownerReferences: []\n" + "        resourceVersion: null\n" + "        selfLink: null\n" + "        uid: null\n" + "    }\n" + "    spec: class V1TokenReviewSpec {\n" + "        audiences: []\n" + "        token: null\n" + "    }\n" + "    status: class V1TokenReviewStatus {\n" + "        audiences: []\n" + "        authenticated: null\n" + "        error: null\n" + "        user: null\n" + "    }\n" + "}";
        assertEquals(expectedString, tokenReview.toString());
    }

    //BaseRock generated method id: ${testV1TokenReviewConstructor}, hash: 8841939D07752221AF948DDA89146973
    @Test
    void testV1TokenReviewConstructor() {
        V1TokenReview tokenReview = new V1TokenReview();
        assertNotNull(tokenReview);
    }

    //BaseRock generated method id: ${testV1TokenReviewValidateJsonElement}, hash: B450F82A6D38B22482BFD559AF4E7280
    @Test
    void testV1TokenReviewValidateJsonElement() throws IOException {
        JsonElement jsonElement = mock(JsonElement.class);
        JsonObject jsonObject = mock(JsonObject.class);
        doReturn(jsonObject).when(jsonElement).getAsJsonObject();
        doReturn(new HashSet<>()).when(jsonObject).entrySet();
        doReturn(null).when(jsonObject).get("apiVersion");
        doReturn(null).when(jsonObject).get("kind");
        doReturn(null).when(jsonObject).get("metadata");
        doReturn(mock(JsonElement.class)).when(jsonObject).get("spec");
        doReturn(null).when(jsonObject).get("status");
        try (MockedStatic<V1TokenReviewSpec> mockedStatic = mockStatic(V1TokenReviewSpec.class)) {
            doNothing().when(V1TokenReviewSpec.class);
            V1TokenReviewSpec.validateJsonElement(any(JsonElement.class));
            V1TokenReview.validateJsonElement(jsonElement);
        }
    }

    //BaseRock generated method id: ${testV1TokenReviewFromJson}, hash: ED41E91181BFA238224407D8B70EC6E2
    @Test
    void testV1TokenReviewFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"TokenReview\",\"metadata\":{},\"spec\":{},\"status\":{}}";
        try (MockedStatic<V1TokenReview> mockedStatic = mockStatic(V1TokenReview.class)) {
            V1TokenReview mockTokenReview = mock(V1TokenReview.class);
            doReturn("v1").when(mockTokenReview).getApiVersion();
            doReturn("TokenReview").when(mockTokenReview).getKind();
            doReturn(new V1ObjectMeta()).when(mockTokenReview).getMetadata();
            doReturn(new V1TokenReviewSpec()).when(mockTokenReview).getSpec();
            doReturn(new V1TokenReviewStatus()).when(mockTokenReview).getStatus();
            doReturn(mockTokenReview).when(V1TokenReview.class);
            V1TokenReview.fromJson(json);
            V1TokenReview tokenReview = V1TokenReview.fromJson(json);
            assertNotNull(tokenReview);
            assertEquals("v1", tokenReview.getApiVersion());
            assertEquals("TokenReview", tokenReview.getKind());
            assertNotNull(tokenReview.getMetadata());
            assertNotNull(tokenReview.getSpec());
            assertNotNull(tokenReview.getStatus());
        }
    }

    //BaseRock generated method id: ${testV1TokenReviewToJson}, hash: D106026253486D6EEDDD8DA9ADFDD1AC
    @Test
    void testV1TokenReviewToJson() {
        V1TokenReview tokenReview = new V1TokenReview().apiVersion("v1").kind("TokenReview").metadata(new V1ObjectMeta()).spec(new V1TokenReviewSpec()).status(new V1TokenReviewStatus());
        String json = tokenReview.toJson();
        assertNotNull(json);
        assertThat(json.contains("\"apiVersion\":\"v1\""), is(true));
        assertThat(json.contains("\"kind\":\"TokenReview\""), is(true));
        assertThat(json.contains("\"metadata\":"), is(true));
        assertThat(json.contains("\"spec\":"), is(true));
        assertThat(json.contains("\"status\":"), is(true));
    }
}
