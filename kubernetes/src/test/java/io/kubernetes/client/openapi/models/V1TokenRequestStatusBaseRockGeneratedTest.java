package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import com.google.gson.Gson;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import com.google.gson.stream.JsonWriter;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import com.google.gson.reflect.TypeToken;
import org.mockito.Mock;
import com.google.gson.TypeAdapter;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import com.google.gson.stream.JsonReader;
import com.google.gson.JsonObject;
import static org.junit.jupiter.api.Assertions.*;
import java.time.OffsetDateTime;
import com.google.gson.JsonElement;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1TokenRequestStatusBaseRockGeneratedTest {

    private V1TokenRequestStatus v1TokenRequestStatus;

    @Mock
    private OffsetDateTime mockOffsetDateTime;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        v1TokenRequestStatus = new V1TokenRequestStatus();
    }

    //BaseRock generated method id: ${testExpirationTimestamp}, hash: 038486793DC2F944B1288F2DC1895B2C
    @Test
    void testExpirationTimestamp() {
        v1TokenRequestStatus.setExpirationTimestamp(mockOffsetDateTime);
        assertEquals(mockOffsetDateTime, v1TokenRequestStatus.getExpirationTimestamp());
    }

    //BaseRock generated method id: ${testToken}, hash: D1264386654B77BDC6E1E342C0B56CA9
    @Test
    void testToken() {
        String token = "test-token";
        v1TokenRequestStatus.setToken(token);
        assertEquals(token, v1TokenRequestStatus.getToken());
    }

    //BaseRock generated method id: ${testEquals}, hash: A03BF70B4EE90C26AEB0E1BC9EF99DC8
    @Test
    void testEquals() {
        V1TokenRequestStatus status1 = new V1TokenRequestStatus().expirationTimestamp(mockOffsetDateTime).token("token1");
        V1TokenRequestStatus status2 = new V1TokenRequestStatus().expirationTimestamp(mockOffsetDateTime).token("token1");
        V1TokenRequestStatus status3 = new V1TokenRequestStatus().expirationTimestamp(mockOffsetDateTime).token("token2");
        assertTrue(status1.equals(status2));
        assertFalse(status1.equals(status3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 73BAC1A948AD7777F75FED9005CDBBF4
    @Test
    void testHashCode() {
        V1TokenRequestStatus status1 = new V1TokenRequestStatus().expirationTimestamp(mockOffsetDateTime).token("token1");
        V1TokenRequestStatus status2 = new V1TokenRequestStatus().expirationTimestamp(mockOffsetDateTime).token("token1");
        assertEquals(status1.hashCode(), status2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 4EC1DAF3220D5363D9DFFBF91EEB6182
    @Test
    void testToString() {
        when(mockOffsetDateTime.toString()).thenReturn("2023-01-01T00:00:00Z");
        v1TokenRequestStatus.setExpirationTimestamp(mockOffsetDateTime);
        v1TokenRequestStatus.setToken("test-token");
        String expected = "class V1TokenRequestStatus {\n    expirationTimestamp: 2023-01-01T00:00:00Z\n    token: test-token\n}";
        assertEquals(expected, v1TokenRequestStatus.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 193ADAA0D1531EC16ECACE0A81CED51F
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("expirationTimestamp", "2023-01-01T00:00:00Z");
        jsonObject.addProperty("token", "test-token");
        V1TokenRequestStatus.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testValidateJsonElementMissingRequiredField}, hash: 3887CDA373F09C9BFDE077B16F598E37
    @Test
    void testValidateJsonElementMissingRequiredField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("token", "test-token");
        assertThrows(IllegalArgumentException.class, () -> V1TokenRequestStatus.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 7D670FB103F5F20CCB28CEFFDA78CD97
    @Test
    void testFromJson() throws IOException {
        try (MockedStatic<io.kubernetes.client.openapi.JSON> jsonMock = mockStatic(io.kubernetes.client.openapi.JSON.class)) {
            Gson mockGson = mock(Gson.class);
            jsonMock.when(io.kubernetes.client.openapi.JSON::getGson).thenReturn(mockGson);
            String jsonString = "{\"expirationTimestamp\":\"2023-01-01T00:00:00Z\",\"token\":\"test-token\"}";
            V1TokenRequestStatus mockStatus = mock(V1TokenRequestStatus.class);
            doReturn(mockStatus).when(mockGson).fromJson(eq(jsonString), eq(V1TokenRequestStatus.class));
            V1TokenRequestStatus result = V1TokenRequestStatus.fromJson(jsonString);
            assertEquals(mockStatus, result);
        }
    }

    //BaseRock generated method id: ${testToJson}, hash: 12B0F9D178FD23DA404FDF2B0300E98D
    @Test
    void testToJson() {
        try (MockedStatic<io.kubernetes.client.openapi.JSON> jsonMock = mockStatic(io.kubernetes.client.openapi.JSON.class)) {
            Gson mockGson = mock(Gson.class);
            jsonMock.when(io.kubernetes.client.openapi.JSON::getGson).thenReturn(mockGson);
            String expectedJson = "{\"expirationTimestamp\":\"2023-01-01T00:00:00Z\",\"token\":\"test-token\"}";
            doReturn(expectedJson).when(mockGson).toJson(any(V1TokenRequestStatus.class));
            String result = v1TokenRequestStatus.toJson();
            assertEquals(expectedJson, result);
        }
    }

    //BaseRock generated method id: ${testCustomTypeAdapterFactory}, hash: E2D60EAD1BE60FC03B590C73E0AE6794
    @Test
    void testCustomTypeAdapterFactory() throws IOException {
        V1TokenRequestStatus.CustomTypeAdapterFactory factory = new V1TokenRequestStatus.CustomTypeAdapterFactory();
        Gson gson = new Gson();
        TypeAdapter<V1TokenRequestStatus> adapter = factory.create(gson, TypeToken.get(V1TokenRequestStatus.class));
        assertNotNull(adapter);
        JsonWriter jsonWriter = mock(JsonWriter.class);
        adapter.write(jsonWriter, v1TokenRequestStatus);
        verify(jsonWriter).beginObject();
        verify(jsonWriter).endObject();
    }

    //BaseRock generated method id: ${testCustomTypeAdapterFactoryWithDifferentType}, hash: 52508A82FF8BF497A2BC4802D77018A8
    @Test
    void testCustomTypeAdapterFactoryWithDifferentType() {
        V1TokenRequestStatus.CustomTypeAdapterFactory factory = new V1TokenRequestStatus.CustomTypeAdapterFactory();
        Gson gson = new Gson();
        TypeAdapter<?> adapter = factory.create(gson, TypeToken.get(String.class));
        assertNull(adapter);
    }
}
