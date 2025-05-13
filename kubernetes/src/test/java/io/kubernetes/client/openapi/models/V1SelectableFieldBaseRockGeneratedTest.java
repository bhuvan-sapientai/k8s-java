package io.kubernetes.client.openapi.models;

import com.google.gson.Gson;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import com.google.gson.JsonObject;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
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
class V1SelectableFieldBaseRockGeneratedTest {

    // Existing test methods remain unchanged
    //BaseRock generated method id: ${testFromJsonWithValidJson}, hash: CC571AFE35F0FB76E0006540302CC51F
    @Test
    void testFromJsonWithValidJson() throws IOException {
        String json = "{\"jsonPath\":\"$.test.path\"}";
        try (MockedStatic<JSON> mockedJson = mockStatic(JSON.class)) {
            Gson mockGson = mock(Gson.class);
            when(JSON.getGson()).thenReturn(mockGson);
            when(mockGson.fromJson(eq(json), eq(V1SelectableField.class))).thenReturn(new V1SelectableField().jsonPath("$.test.path"));
            V1SelectableField result = V1SelectableField.fromJson(json);
            assertEquals("$.test.path", result.getJsonPath());
        }
    }

    //BaseRock generated method id: ${testToJson}, hash: 1C09BF612085921C7773A709FE73A4F6
    @Test
    void testToJson() {
        V1SelectableField field = new V1SelectableField().jsonPath("$.test.path");
        try (MockedStatic<JSON> mockedJson = mockStatic(JSON.class)) {
            Gson mockGson = mock(Gson.class);
            when(JSON.getGson()).thenReturn(mockGson);
            when(mockGson.toJson(field)).thenReturn("{\"jsonPath\":\"$.test.path\"}");
            String result = field.toJson();
            assertEquals("{\"jsonPath\":\"$.test.path\"}", result);
        }
    }
}
