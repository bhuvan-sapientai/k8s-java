package io.kubernetes.client.gson;

import org.junit.jupiter.params.provider.MethodSource;
import com.google.gson.Gson;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import java.util.stream.Stream;
import org.mockito.MockitoAnnotations;
import io.kubernetes.client.openapi.models.V1Status;
import static org.mockito.ArgumentMatchers.anyString;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import org.junit.jupiter.params.provider.Arguments;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1StatusPreProcessorBaseRockGeneratedTest {

    @Mock
    private Gson gson;

    @Mock
    private JsonElement jsonElement;

    @Mock
    private JsonObject jsonObject;

    private V1StatusPreProcessor processor;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        processor = new V1StatusPreProcessor();
    }

    //BaseRock generated method id: ${testPreDeserialize_LegitKubernetesStatus}, hash: 6AE9476ECA706094DD3D7D9AB8A5038A
    @Test
    void testPreDeserialize_LegitKubernetesStatus() {
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        when(jsonObject.get("apiVersion")).thenReturn(jsonElement);
        when(jsonObject.get("kind")).thenReturn(jsonElement);
        when(jsonElement.getAsString()).thenReturn("v1").thenReturn("Status");
        processor.preDeserialize(V1Status.class, jsonElement, gson);
        verify(jsonObject, never()).addProperty(anyString(), (String) any());
    }

    //BaseRock generated method id: ${testPreDeserialize_NonLegitKubernetesStatus_NullStatus}, hash: 3448144FB3F77C07E8A257DAC0FA7F99
    @Test
    void testPreDeserialize_NonLegitKubernetesStatus_NullStatus() {
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        when(jsonObject.get("apiVersion")).thenReturn(null);
        when(jsonObject.get("kind")).thenReturn(null);
        when(jsonObject.get("status")).thenReturn(null);
        processor.preDeserialize(V1Status.class, jsonElement, gson);
        verify(jsonObject, never()).addProperty(anyString(), (String) any());
    }

    //BaseRock generated method id: ${testPreDeserialize_NonLegitKubernetesStatus_NonObjectStatus}, hash: 4C15F8F2D7890EB96FE83D3001C31634
    @Test
    void testPreDeserialize_NonLegitKubernetesStatus_NonObjectStatus() {
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        when(jsonObject.get("apiVersion")).thenReturn(null);
        when(jsonObject.get("kind")).thenReturn(null);
        when(jsonObject.get("status")).thenReturn(jsonElement);
        when(jsonElement.isJsonObject()).thenReturn(false);
        processor.preDeserialize(V1Status.class, jsonElement, gson);
        verify(jsonObject, never()).addProperty(anyString(), (String) any());
    }

    //BaseRock generated method id: ${testPreDeserialize_NonLegitKubernetesStatus_ObjectStatus}, hash: 4B1EFFF3E0A43B0A63BE287D2E7B2D4A
    @Test
    void testPreDeserialize_NonLegitKubernetesStatus_ObjectStatus() {
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        when(jsonObject.get("apiVersion")).thenReturn(null);
        when(jsonObject.get("kind")).thenReturn(null);
        when(jsonObject.get("status")).thenReturn(jsonElement);
        when(jsonElement.isJsonObject()).thenReturn(true);
        processor.preDeserialize(V1Status.class, jsonElement, gson);
        verify(jsonObject).addProperty("status", (String) null);
    }

    //BaseRock generated method id: ${testPreDeserialize_InvalidKubernetesStatus}, hash: 5C4421FF08D4D91937A0F441C93A6869
    @ParameterizedTest
    @MethodSource("provideInvalidKubernetesStatus")
    void testPreDeserialize_InvalidKubernetesStatus(String apiVersion, String kind) {
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        when(jsonObject.get("apiVersion")).thenReturn(jsonElement);
        when(jsonObject.get("kind")).thenReturn(jsonElement);
        when(jsonElement.getAsString()).thenReturn(apiVersion).thenReturn(kind);
        when(jsonObject.get("status")).thenReturn(jsonElement);
        when(jsonElement.isJsonObject()).thenReturn(true);
        processor.preDeserialize(V1Status.class, jsonElement, gson);
        verify(jsonObject).addProperty("status", (String) null);
    }

    private static Stream<Arguments> provideInvalidKubernetesStatus() {
        return Stream.of(Arguments.of("v2", "Status"), Arguments.of("v1", "NotStatus"), Arguments.of("v2", "NotStatus"));
    }

    //BaseRock generated method id: ${testPreDeserialize_ValidStatus}, hash: 6085CA2200AB1F7535029E105CBBFA6E
    @Test
    void testPreDeserialize_ValidStatus() {
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        when(jsonObject.get("apiVersion")).thenReturn(jsonElement);
        when(jsonObject.get("kind")).thenReturn(jsonElement);
        when(jsonElement.getAsString()).thenReturn("v1").thenReturn("Status");
        processor.preDeserialize(V1Status.class, jsonElement, gson);
        verify(jsonObject, never()).addProperty(anyString(), (String) any());
    }

    //BaseRock generated method id: ${testPreDeserialize_InvalidApiVersion}, hash: 379DFD0D3FDC59CA49DB4B9D591E521F
    @Test
    void testPreDeserialize_InvalidApiVersion() {
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        when(jsonObject.get("apiVersion")).thenReturn(jsonElement);
        when(jsonObject.get("kind")).thenReturn(jsonElement);
        when(jsonElement.getAsString()).thenReturn("v2").thenReturn("Status");
        when(jsonObject.get("status")).thenReturn(jsonElement);
        when(jsonElement.isJsonObject()).thenReturn(true);
        processor.preDeserialize(V1Status.class, jsonElement, gson);
        verify(jsonObject).addProperty("status", (String) null);
    }

    //BaseRock generated method id: ${testPreDeserialize_InvalidKind}, hash: E20EA0F58D34CB0723E9603525B772D3
    @Test
    void testPreDeserialize_InvalidKind() {
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        when(jsonObject.get("apiVersion")).thenReturn(jsonElement);
        when(jsonObject.get("kind")).thenReturn(jsonElement);
        when(jsonElement.getAsString()).thenReturn("v1").thenReturn("NotStatus");
        when(jsonObject.get("status")).thenReturn(jsonElement);
        when(jsonElement.isJsonObject()).thenReturn(true);
        processor.preDeserialize(V1Status.class, jsonElement, gson);
        verify(jsonObject).addProperty("status", (String) null);
    }

    //BaseRock generated method id: ${testPreDeserialize_NullApiVersion}, hash: 8A96CCAA4B9242E64455393492A2CB45
    @Test
    void testPreDeserialize_NullApiVersion() {
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        when(jsonObject.get("apiVersion")).thenReturn(null);
        when(jsonObject.get("kind")).thenReturn(jsonElement);
        when(jsonElement.getAsString()).thenReturn("Status");
        when(jsonObject.get("status")).thenReturn(jsonElement);
        when(jsonElement.isJsonObject()).thenReturn(true);
        processor.preDeserialize(V1Status.class, jsonElement, gson);
        verify(jsonObject).addProperty("status", (String) null);
    }

    //BaseRock generated method id: ${testPreDeserialize_NullKind}, hash: 4F5F983725F2D0634C9D30F1F72ACAF4
    @Test
    void testPreDeserialize_NullKind() {
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        when(jsonObject.get("apiVersion")).thenReturn(jsonElement);
        when(jsonObject.get("kind")).thenReturn(null);
        when(jsonElement.getAsString()).thenReturn("v1");
        when(jsonObject.get("status")).thenReturn(jsonElement);
        when(jsonElement.isJsonObject()).thenReturn(true);
        processor.preDeserialize(V1Status.class, jsonElement, gson);
        verify(jsonObject).addProperty("status", (String) null);
    }
}
