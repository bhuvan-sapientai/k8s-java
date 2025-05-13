package io.kubernetes.client.openapi.models;

import com.google.gson.Gson;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.openapi.JSON;
import com.google.gson.JsonArray;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1LabelSelectorBaseRockGeneratedTest {

    @Mock
    private V1LabelSelectorRequirement mockRequirement;

    private V1LabelSelector labelSelector;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        labelSelector = new V1LabelSelector();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 3D4DBD319B1CA6FDA5EEB242A5366CB0
    @Test
    void testConstructor() {
        assertNotNull(labelSelector);
        assertNotNull(labelSelector.getMatchExpressions());
        assertNotNull(labelSelector.getMatchLabels());
    }

    //BaseRock generated method id: ${testMatchExpressions}, hash: BCA0FFFCD8B5E22E55DD22F866B0E766
    @Test
    void testMatchExpressions() {
        List<V1LabelSelectorRequirement> expressions = new ArrayList<>();
        expressions.add(mockRequirement);
        labelSelector.setMatchExpressions(expressions);
        assertEquals(expressions, labelSelector.getMatchExpressions());
        labelSelector.addMatchExpressionsItem(mockRequirement);
        assertEquals(2, labelSelector.getMatchExpressions().size());
    }

    //BaseRock generated method id: ${testMatchLabels}, hash: DEF0720F933B0A87FC6F2DB7EB5BF6EC
    @Test
    void testMatchLabels() {
        Map<String, String> labels = new HashMap<>();
        labels.put("key", "value");
        labelSelector.setMatchLabels(labels);
        assertEquals(labels, labelSelector.getMatchLabels());
        labelSelector.putMatchLabelsItem("newKey", "newValue");
        assertEquals(2, labelSelector.getMatchLabels().size());
        assertEquals("newValue", labelSelector.getMatchLabels().get("newKey"));
    }

    //BaseRock generated method id: ${testEquals}, hash: BCCDF20284A58C1495FA51947CFE093B
    @Test
    void testEquals() {
        V1LabelSelector selector1 = new V1LabelSelector();
        V1LabelSelector selector2 = new V1LabelSelector();
        assertTrue(selector1.equals(selector2));
        selector1.addMatchExpressionsItem(mockRequirement);
        assertFalse(selector1.equals(selector2));
        selector2.addMatchExpressionsItem(mockRequirement);
        assertTrue(selector1.equals(selector2));
        selector1.putMatchLabelsItem("key", "value");
        assertFalse(selector1.equals(selector2));
        selector2.putMatchLabelsItem("key", "value");
        assertTrue(selector1.equals(selector2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: ABEEB21E83624943F626AE8E7CF9934A
    @Test
    void testHashCode() {
        V1LabelSelector selector1 = new V1LabelSelector();
        V1LabelSelector selector2 = new V1LabelSelector();
        assertEquals(selector1.hashCode(), selector2.hashCode());
        selector1.addMatchExpressionsItem(mockRequirement);
        assertNotEquals(selector1.hashCode(), selector2.hashCode());
        selector2.addMatchExpressionsItem(mockRequirement);
        assertEquals(selector1.hashCode(), selector2.hashCode());
        selector1.putMatchLabelsItem("key", "value");
        assertNotEquals(selector1.hashCode(), selector2.hashCode());
        selector2.putMatchLabelsItem("key", "value");
        assertEquals(selector1.hashCode(), selector2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 8863C394597A85CF20DBFBCB3B8B8252
    @Test
    void testToString() {
        String result = labelSelector.toString();
        assertTrue(result.contains("class V1LabelSelector"));
        assertTrue(result.contains("matchExpressions"));
        assertTrue(result.contains("matchLabels"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 16DF0E1287E98C3A0F15B1D05536C66E
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        JsonArray matchExpressionsArray = new JsonArray();
        jsonObject.add("matchExpressions", matchExpressionsArray);
        jsonObject.add("matchLabels", new JsonObject());
        try (MockedStatic<V1LabelSelectorRequirement> mockedStatic = mockStatic(V1LabelSelectorRequirement.class)) {
            V1LabelSelector.validateJsonElement(jsonObject);
            mockedStatic.verify(() -> V1LabelSelectorRequirement.validateJsonElement(any()), never());
        }
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidField}, hash: 76AF03D1173045F19E61070D0EE0D687
    @Test
    void testValidateJsonElementWithInvalidField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("invalidField", "value");
        assertThrows(IllegalArgumentException.class, () -> V1LabelSelector.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testFromJson}, hash: A7DE0808C28DE80FAD0B9286A21AE530
    @Test
    void testFromJson() throws IOException {
        String json = "{\"matchExpressions\":[],\"matchLabels\":{}}";
        try (MockedStatic<JSON> mockedStatic = mockStatic(JSON.class)) {
            Gson mockGson = mock(Gson.class);
            when(JSON.getGson()).thenReturn(mockGson);
            when(mockGson.fromJson(json, V1LabelSelector.class)).thenReturn(new V1LabelSelector());
            V1LabelSelector result = V1LabelSelector.fromJson(json);
            assertNotNull(result);
            mockedStatic.verify(() -> JSON.getGson());
            verify(mockGson).fromJson(json, V1LabelSelector.class);
        }
    }

    //BaseRock generated method id: ${testToJson}, hash: 649BEF41632B74CC42386D2FE19E4B4C
    @Test
    void testToJson() {
        try (MockedStatic<JSON> mockedStatic = mockStatic(JSON.class)) {
            Gson mockGson = mock(Gson.class);
            when(JSON.getGson()).thenReturn(mockGson);
            when(mockGson.toJson(labelSelector)).thenReturn("{}");
            String result = labelSelector.toJson();
            assertEquals("{}", result);
            mockedStatic.verify(() -> JSON.getGson());
            verify(mockGson).toJson(labelSelector);
        }
    }
}
