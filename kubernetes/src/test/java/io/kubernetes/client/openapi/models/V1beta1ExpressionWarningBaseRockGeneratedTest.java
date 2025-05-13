package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1ExpressionWarningBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 5E5243768BFD1FCC127B60E77F05E5AD
    @Test
    void testConstructor() {
        V1beta1ExpressionWarning warning = new V1beta1ExpressionWarning();
        assertNotNull(warning);
    }

    //BaseRock generated method id: ${testFieldRef}, hash: 0F52E9F5A9C96EFCDF01D72EA67EF47E
    @Test
    void testFieldRef() {
        V1beta1ExpressionWarning warning = new V1beta1ExpressionWarning();
        String fieldRef = "spec.validations[0].expression";
        warning.setFieldRef(fieldRef);
        assertEquals(fieldRef, warning.getFieldRef());
    }

    //BaseRock generated method id: ${testWarning}, hash: 80D9E96FF659849E28F0174AA6BC7089
    @Test
    void testWarning() {
        V1beta1ExpressionWarning warning = new V1beta1ExpressionWarning();
        String warningMessage = "Type mismatch: expected int, got string";
        warning.setWarning(warningMessage);
        assertEquals(warningMessage, warning.getWarning());
    }

    //BaseRock generated method id: ${testEquals}, hash: 3F0D079433A60408C888DF337306B437
    @Test
    void testEquals() {
        V1beta1ExpressionWarning warning1 = new V1beta1ExpressionWarning().fieldRef("spec.validations[0].expression").warning("Type mismatch");
        V1beta1ExpressionWarning warning2 = new V1beta1ExpressionWarning().fieldRef("spec.validations[0].expression").warning("Type mismatch");
        V1beta1ExpressionWarning warning3 = new V1beta1ExpressionWarning().fieldRef("spec.validations[1].expression").warning("Undefined variable");
        assertTrue(warning1.equals(warning2));
        assertFalse(warning1.equals(warning3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: DF5974CD25D0010988115CAAEE120758
    @Test
    void testHashCode() {
        V1beta1ExpressionWarning warning1 = new V1beta1ExpressionWarning().fieldRef("spec.validations[0].expression").warning("Type mismatch");
        V1beta1ExpressionWarning warning2 = new V1beta1ExpressionWarning().fieldRef("spec.validations[0].expression").warning("Type mismatch");
        assertEquals(warning1.hashCode(), warning2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: A84825CE7358EACE8719A0A5AC5A8A84
    @Test
    void testToString() {
        V1beta1ExpressionWarning warning = new V1beta1ExpressionWarning().fieldRef("spec.validations[0].expression").warning("Type mismatch");
        String expected = "class V1beta1ExpressionWarning {\n    fieldRef: spec.validations[0].expression\n    warning: Type mismatch\n}";
        assertEquals(expected, warning.toString());
    }

    //BaseRock generated method id: ${testFieldRefParameterized}, hash: 5A90059392174313C14511A0C727728E
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "spec.validations[0].expression", "spec.validations[1].condition" })
    void testFieldRefParameterized(String fieldRef) {
        V1beta1ExpressionWarning warning = new V1beta1ExpressionWarning().fieldRef(fieldRef);
        assertEquals(fieldRef, warning.getFieldRef());
    }

    //BaseRock generated method id: ${testWarningParameterized}, hash: CCAD39DA0339DBF9BCFB736B8C13E48A
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Type mismatch", "Undefined variable", "Invalid syntax" })
    void testWarningParameterized(String warningMessage) {
        V1beta1ExpressionWarning warning = new V1beta1ExpressionWarning().warning(warningMessage);
        assertEquals(warningMessage, warning.getWarning());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 7DE05A27D86A254A59D957C92725B845
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("fieldRef", "spec.validations[0].expression");
        jsonObject.addProperty("warning", "Type mismatch");
        try (MockedStatic<V1beta1ExpressionWarning> mockedStatic = mockStatic(V1beta1ExpressionWarning.class)) {
            V1beta1ExpressionWarning.validateJsonElement(jsonObject);
            mockedStatic.verify(() -> V1beta1ExpressionWarning.validateJsonElement(any(JsonElement.class)));
        }
    }

    //BaseRock generated method id: ${testValidateJsonElementMissingRequiredField}, hash: C2B9D08C9A25B6893AB27017126AFA40
    @Test
    void testValidateJsonElementMissingRequiredField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("fieldRef", "spec.validations[0].expression");
        assertThrows(IllegalArgumentException.class, () -> V1beta1ExpressionWarning.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 6DC2ECD11C3A2AFFA7C5D8A2F71E7493
    @Test
    void testFromJson() throws IOException {
        String json = "{\"fieldRef\":\"spec.validations[0].expression\",\"warning\":\"Type mismatch\"}";
        try (MockedStatic<V1beta1ExpressionWarning> mockedStatic = mockStatic(V1beta1ExpressionWarning.class)) {
            V1beta1ExpressionWarning.fromJson(json);
            mockedStatic.verify(() -> V1beta1ExpressionWarning.fromJson(anyString()));
        }
    }

    //BaseRock generated method id: ${testToJson}, hash: 914B423D6639E69871C82EC191309E4A
    @Test
    void testToJson() {
        V1beta1ExpressionWarning warning = new V1beta1ExpressionWarning().fieldRef("spec.validations[0].expression").warning("Type mismatch");
        String json = warning.toJson();
        assertTrue(json.contains("\"fieldRef\":\"spec.validations[0].expression\""));
        assertTrue(json.contains("\"warning\":\"Type mismatch\""));
    }
}
