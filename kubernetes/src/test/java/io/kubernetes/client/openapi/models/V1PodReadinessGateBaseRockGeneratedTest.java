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
class V1PodReadinessGateBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: C13BC62B40365BAA454498EAFCF0A41B
    @Test
    void testConstructor() {
        V1PodReadinessGate gate = new V1PodReadinessGate();
        assertNotNull(gate);
    }

    //BaseRock generated method id: ${testConditionType}, hash: E434C61169C3ABE01BD2751780B9165B
    @Test
    void testConditionType() {
        V1PodReadinessGate gate = new V1PodReadinessGate();
        String conditionType = "test-condition";
        gate.setConditionType(conditionType);
        assertEquals(conditionType, gate.getConditionType());
    }

    //BaseRock generated method id: ${testConditionTypeWithDifferentValues}, hash: 9973750D17C35FDBC7F93C8C262DDAFF
    @ParameterizedTest
    @ValueSource(strings = { "condition1", "condition2", "condition3" })
    void testConditionTypeWithDifferentValues(String conditionType) {
        V1PodReadinessGate gate = new V1PodReadinessGate();
        gate.setConditionType(conditionType);
        assertEquals(conditionType, gate.getConditionType());
    }

    //BaseRock generated method id: ${testConditionTypeWithNullAndEmpty}, hash: B41F7E69E6007CCF4A3ED7642B616612
    @ParameterizedTest
    @NullAndEmptySource
    void testConditionTypeWithNullAndEmpty(String conditionType) {
        V1PodReadinessGate gate = new V1PodReadinessGate();
        gate.setConditionType(conditionType);
        assertEquals(conditionType, gate.getConditionType());
    }

    //BaseRock generated method id: ${testEquals}, hash: 0AEC12951AF587A694DF4AE16A577C99
    @Test
    void testEquals() {
        V1PodReadinessGate gate1 = new V1PodReadinessGate().conditionType("test-condition");
        V1PodReadinessGate gate2 = new V1PodReadinessGate().conditionType("test-condition");
        V1PodReadinessGate gate3 = new V1PodReadinessGate().conditionType("different-condition");
        assertTrue(gate1.equals(gate2));
        assertFalse(gate1.equals(gate3));
        assertFalse(gate1.equals(null));
        assertFalse(gate1.equals(new Object()));
    }

    //BaseRock generated method id: ${testHashCode}, hash: E0030A255C02A55F83DFBFC8DA8D1055
    @Test
    void testHashCode() {
        V1PodReadinessGate gate1 = new V1PodReadinessGate().conditionType("test-condition");
        V1PodReadinessGate gate2 = new V1PodReadinessGate().conditionType("test-condition");
        V1PodReadinessGate gate3 = new V1PodReadinessGate().conditionType("different-condition");
        assertEquals(gate1.hashCode(), gate2.hashCode());
        assertNotEquals(gate1.hashCode(), gate3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 644DB1AEB424A57EE00848BB77E37E01
    @Test
    void testToString() {
        V1PodReadinessGate gate = new V1PodReadinessGate().conditionType("test-condition");
        String expectedString = "class V1PodReadinessGate {\n    conditionType: test-condition\n}";
        assertEquals(expectedString, gate.toString());
    }

    //BaseRock generated method id: ${testToJson}, hash: ECE31C267D600212276DFC48EB3BE103
    @Test
    void testToJson() throws IOException {
        V1PodReadinessGate gate = new V1PodReadinessGate().conditionType("test-condition");
        try (MockedStatic<JSON> jsonMock = mockStatic(JSON.class)) {
            Gson mockGson = mock(Gson.class);
            jsonMock.when(JSON::getGson).thenReturn(mockGson);
            doReturn("{\"conditionType\":\"test-condition\"}").when(mockGson).toJson(any(V1PodReadinessGate.class));
            String json = gate.toJson();
            assertEquals("{\"conditionType\":\"test-condition\"}", json);
            verify(mockGson).toJson(gate);
        }
    }

    //BaseRock generated method id: ${testFromJson}, hash: ACFE07EE5CE4C97004C950E3C23D7723
    @Test
    void testFromJson() throws IOException {
        String json = "{\"conditionType\":\"test-condition\"}";
        try (MockedStatic<JSON> jsonMock = mockStatic(JSON.class)) {
            Gson mockGson = mock(Gson.class);
            jsonMock.when(JSON::getGson).thenReturn(mockGson);
            doReturn(new V1PodReadinessGate().conditionType("test-condition")).when(mockGson).fromJson(anyString(), eq(V1PodReadinessGate.class));
            V1PodReadinessGate gate = V1PodReadinessGate.fromJson(json);
            assertNotNull(gate);
            assertEquals("test-condition", gate.getConditionType());
            verify(mockGson).fromJson(json, V1PodReadinessGate.class);
        }
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: E9083D2506B2F4362A33B5F9429C0842
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("conditionType", "test-condition");
        assertDoesNotThrow(() -> V1PodReadinessGate.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementMissingRequiredField}, hash: B61DB669AFE3EF4CE4E35E20126CF059
    @Test
    void testValidateJsonElementMissingRequiredField() {
        JsonObject jsonObject = new JsonObject();
        assertThrows(IllegalArgumentException.class, () -> V1PodReadinessGate.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithExtraField}, hash: 76541E929729714CCA08C9863936CD8F
    @Test
    void testValidateJsonElementWithExtraField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("conditionType", "test-condition");
        jsonObject.addProperty("extraField", "extra");
        assertThrows(IllegalArgumentException.class, () -> V1PodReadinessGate.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithNullJsonElement}, hash: 403469458BCA99203150407A027A411B
    @Test
    void testValidateJsonElementWithNullJsonElement() {
        assertThrows(IllegalArgumentException.class, () -> V1PodReadinessGate.validateJsonElement(null));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithNonPrimitiveConditionType}, hash: 1930B816CBE216058F04423DA2C5D1FE
    @Test
    void testValidateJsonElementWithNonPrimitiveConditionType() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("conditionType", new JsonObject());
        assertThrows(IllegalArgumentException.class, () -> V1PodReadinessGate.validateJsonElement(jsonObject));
    }
}
