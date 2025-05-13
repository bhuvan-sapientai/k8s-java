package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.containsString;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import static org.mockito.ArgumentMatchers.anyInt;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import static org.mockito.Mockito.*;
import java.io.IOException;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1JSONSchemaPropsBaseRockGeneratedTest {

    @Mock
    private JsonObject mockJsonObject;

    @Mock
    private JsonElement mockJsonElement;

    private V1JSONSchemaProps v1JSONSchemaProps;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        v1JSONSchemaProps = new V1JSONSchemaProps();
    }

    //BaseRock generated method id: ${testToString}, hash: 0E4D6BE7829D16309316BFD41591E64B
    @Test
    void testToString() {
        v1JSONSchemaProps.set$Ref("test-ref");
        v1JSONSchemaProps.set$Schema("test-schema");
        String toString = v1JSONSchemaProps.toString();
        assertThat(toString, containsString("$ref: test-ref"));
        assertThat(toString, containsString("$schema: test-schema"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: EAC380949D8F07153EB00CAE76E66CA4
    @Disabled()
    @Test
    void testValidateJsonElement() throws IOException {
        when(mockJsonElement.getAsJsonObject()).thenReturn(mockJsonObject);
        when(mockJsonObject.entrySet()).thenReturn(new HashMap<String, JsonElement>().entrySet());
        V1JSONSchemaProps.validateJsonElement(mockJsonElement);
        verify(mockJsonElement, times(1)).getAsJsonObject();
        verify(mockJsonObject, times(1)).entrySet();
    }

    //BaseRock generated method id: ${testValidateJsonElementWithAllFields}, hash: 493DD4E531BC0636BE8E0ABEA8B8C0B3
    @Disabled()
    @Test
    void testValidateJsonElementWithAllFields() throws IOException {
        when(mockJsonElement.getAsJsonObject()).thenReturn(mockJsonObject);
        when(mockJsonObject.entrySet()).thenReturn(new HashMap<String, JsonElement>().entrySet());
        JsonElement mockPrimitiveElement = mock(JsonElement.class);
        when(mockPrimitiveElement.isJsonPrimitive()).thenReturn(true);
        JsonArray mockJsonArray = mock(JsonArray.class);
        when(mockJsonArray.get(anyInt())).thenReturn(mock(JsonElement.class));
        when(mockJsonArray.size()).thenReturn(1);
        when(mockJsonObject.get("$ref")).thenReturn(mockPrimitiveElement);
        when(mockJsonObject.get("$schema")).thenReturn(mockPrimitiveElement);
        when(mockJsonObject.get("allOf")).thenReturn(mockJsonArray);
        when(mockJsonObject.get("anyOf")).thenReturn(mockJsonArray);
        when(mockJsonObject.get("enum")).thenReturn(mockJsonArray);
        when(mockJsonObject.get("externalDocs")).thenReturn(mockJsonElement);
        when(mockJsonObject.get("not")).thenReturn(mockJsonElement);
        when(mockJsonObject.get("oneOf")).thenReturn(mockJsonArray);
        when(mockJsonObject.get("x-kubernetes-validations")).thenReturn(mockJsonArray);
        when(mockJsonArray.isJsonArray()).thenReturn(true);
        assertDoesNotThrow(() -> V1JSONSchemaProps.validateJsonElement(mockJsonElement));
    }
}
