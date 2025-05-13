package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import com.google.gson.Gson;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import com.google.gson.JsonObject;
import static org.junit.jupiter.api.Assertions.*;
import com.google.gson.JsonElement;
import io.kubernetes.client.openapi.JSON;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ParamKindBaseRockGeneratedTest {

    private V1ParamKind v1ParamKind;

    @Mock
    private JSON mockJson;

    @Mock
    private Gson mockGson;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        v1ParamKind = new V1ParamKind();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 2465CF5BEA47550B4FFE645632BE0A1A
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1ParamKind.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1ParamKind.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: C3E984E1CE551EBEEB146959ACAEF5F5
    @Test
    void testKind() {
        String kind = "Pod";
        v1ParamKind.setKind(kind);
        assertEquals(kind, v1ParamKind.getKind());
    }

    //BaseRock generated method id: ${testEquals}, hash: 39DEBA711307BBF48B9C6E6A2C2F562B
    @Test
    void testEquals() {
        V1ParamKind v1ParamKind1 = new V1ParamKind().apiVersion("v1").kind("Pod");
        V1ParamKind v1ParamKind2 = new V1ParamKind().apiVersion("v1").kind("Pod");
        V1ParamKind v1ParamKind3 = new V1ParamKind().apiVersion("v2").kind("Deployment");
        assertTrue(v1ParamKind1.equals(v1ParamKind2));
        assertFalse(v1ParamKind1.equals(v1ParamKind3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 22C4F6056BE8AF35F1CC2B60C177E700
    @Test
    void testHashCode() {
        V1ParamKind v1ParamKind1 = new V1ParamKind().apiVersion("v1").kind("Pod");
        V1ParamKind v1ParamKind2 = new V1ParamKind().apiVersion("v1").kind("Pod");
        assertEquals(v1ParamKind1.hashCode(), v1ParamKind2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 79AC2E2FAAE4ECD3307C7AAC32DA3FB0
    @Test
    void testToString() {
        v1ParamKind.setApiVersion("v1");
        v1ParamKind.setKind("Pod");
        String expected = "class V1ParamKind {\n    apiVersion: v1\n    kind: Pod\n}";
        assertEquals(expected, v1ParamKind.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: B827B8ADE77740C17A4FC8C982AF99A4
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiVersion", "v1");
        jsonObject.addProperty("kind", "Pod");
        V1ParamKind.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidField}, hash: FBAF815F76C8E1F2B41E54477043EB35
    @Test
    void testValidateJsonElementWithInvalidField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("invalidField", "value");
        assertThrows(IllegalArgumentException.class, () -> V1ParamKind.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithNonPrimitiveApiVersion}, hash: A85D8ECD17C172B93117886F0AF7344E
    @Test
    void testValidateJsonElementWithNonPrimitiveApiVersion() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("apiVersion", new JsonObject());
        assertThrows(IllegalArgumentException.class, () -> V1ParamKind.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithNonPrimitiveKind}, hash: 3B802D6D3DEDE95EA5174FE2220356A5
    @Test
    void testValidateJsonElementWithNonPrimitiveKind() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("kind", new JsonObject());
        assertThrows(IllegalArgumentException.class, () -> V1ParamKind.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 9AFF8CEB9F9157461B19F300512C2A71
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"Pod\"}";
        try (MockedStatic<JSON> jsonMock = mockStatic(JSON.class)) {
            jsonMock.when(JSON::getGson).thenReturn(mockGson);
            when(mockGson.fromJson(json, V1ParamKind.class)).thenReturn(new V1ParamKind().apiVersion("v1").kind("Pod"));
            V1ParamKind result = V1ParamKind.fromJson(json);
            assertEquals("v1", result.getApiVersion());
            assertEquals("Pod", result.getKind());
        }
    }

    //BaseRock generated method id: ${testToJson}, hash: 6B7F491D1FFD1EA711EB407BAB14ADD9
    @Test
    void testToJson() {
        v1ParamKind.setApiVersion("v1");
        v1ParamKind.setKind("Pod");
        try (MockedStatic<JSON> jsonMock = mockStatic(JSON.class)) {
            jsonMock.when(JSON::getGson).thenReturn(mockGson);
            when(mockGson.toJson(v1ParamKind)).thenReturn("{\"apiVersion\":\"v1\",\"kind\":\"Pod\"}");
            String result = v1ParamKind.toJson();
            assertEquals("{\"apiVersion\":\"v1\",\"kind\":\"Pod\"}", result);
        }
    }
}
