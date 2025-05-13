package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import static org.hamcrest.Matchers.not;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import static org.hamcrest.Matchers.startsWith;
import java.io.IOException;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ExpressionWarningBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 549FF283E37025DEEAD88FA7CAF7E812
    @Test
    void testConstructor() {
        V1ExpressionWarning warning = new V1ExpressionWarning();
        assertThat(warning, is(not(nullValue())));
    }

    //BaseRock generated method id: ${testFieldRefGetterAndSetter}, hash: 9AE56565CC6740A7DE52248D39D9BD42
    @Test
    void testFieldRefGetterAndSetter() {
        V1ExpressionWarning warning = new V1ExpressionWarning();
        String fieldRef = "spec.validations[0].expression";
        warning.setFieldRef(fieldRef);
        assertEquals(fieldRef, warning.getFieldRef());
    }

    //BaseRock generated method id: ${testWarningGetterAndSetter}, hash: FFF75B54DF7ED3C78DC6FB231B29C3D6
    @Test
    void testWarningGetterAndSetter() {
        V1ExpressionWarning warning = new V1ExpressionWarning();
        String warningMessage = "Type mismatch: expected int, got string";
        warning.setWarning(warningMessage);
        assertEquals(warningMessage, warning.getWarning());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 99E580D27DC07658B47A3F7383F44C44
    @Test
    void testEqualsWithSameObject() {
        V1ExpressionWarning warning = new V1ExpressionWarning().fieldRef("spec.validations[0].expression").warning("Type mismatch");
        assertEquals(warning, warning);
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: ABDFFCE2C5E858B29C1429CD7CDED254
    @Test
    void testEqualsWithDifferentObject() {
        V1ExpressionWarning warning1 = new V1ExpressionWarning().fieldRef("spec.validations[0].expression").warning("Type mismatch");
        V1ExpressionWarning warning2 = new V1ExpressionWarning().fieldRef("spec.validations[1].expression").warning("Undefined variable");
        assertNotEquals(warning1, warning2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 19DF959A3EF537D700469B404F006F9E
    @Test
    void testHashCode() {
        V1ExpressionWarning warning1 = new V1ExpressionWarning().fieldRef("spec.validations[0].expression").warning("Type mismatch");
        V1ExpressionWarning warning2 = new V1ExpressionWarning().fieldRef("spec.validations[0].expression").warning("Type mismatch");
        assertEquals(warning1.hashCode(), warning2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 4591700C90349FA15D74D085C5B6AC52
    @Test
    void testToString() {
        V1ExpressionWarning warning = new V1ExpressionWarning().fieldRef("spec.validations[0].expression").warning("Type mismatch");
        String expectedString = "class V1ExpressionWarning {\n    fieldRef: spec.validations[0].expression\n    warning: Type mismatch\n}";
        assertEquals(expectedString, warning.toString());
    }

    //BaseRock generated method id: ${testFieldRefWithVariousInputs}, hash: AEB40A520A37512BC0BED252A0672134
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "spec.validations[0].expression", "spec.rules[1].condition" })
    void testFieldRefWithVariousInputs(String fieldRef) {
        V1ExpressionWarning warning = new V1ExpressionWarning().fieldRef(fieldRef);
        assertEquals(fieldRef, warning.getFieldRef());
    }

    //BaseRock generated method id: ${testWarningWithVariousInputs}, hash: 780547960FBEE2159B0050F96E4FC227
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Type mismatch", "Undefined variable", "Invalid syntax" })
    void testWarningWithVariousInputs(String warningMessage) {
        V1ExpressionWarning warning = new V1ExpressionWarning().warning(warningMessage);
        assertEquals(warningMessage, warning.getWarning());
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: 69AA24BEF5298D57DB121FFDEB6470B4
    @Test
    void testEqualsWithNull() {
        V1ExpressionWarning warning = new V1ExpressionWarning().fieldRef("spec.validations[0].expression").warning("Type mismatch");
        assertNotEquals(null, warning);
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 3105C42EA52AC4814C856075F73698DF
    @Test
    void testEqualsWithDifferentClass() {
        V1ExpressionWarning warning = new V1ExpressionWarning().fieldRef("spec.validations[0].expression").warning("Type mismatch");
        assertNotEquals(warning, new Object());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 0FEE1A2636A48B8CAD2AECDD1A0BA883
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("fieldRef", "spec.validations[0].expression");
        jsonObject.addProperty("warning", "Type mismatch");
        // This should not throw an exception
        V1ExpressionWarning.validateJsonElement(jsonObject);
        // Test with missing required field
        JsonObject invalidJson = new JsonObject();
        invalidJson.addProperty("warning", "Type mismatch");
        assertThrows(IllegalArgumentException.class, () -> {
            V1ExpressionWarning.validateJsonElement(invalidJson);
        });
    }

    //BaseRock generated method id: ${testFromJson}, hash: 9D3C2E86657558DA44B556029F2B9677
    @Test
    void testFromJson() throws IOException {
        String json = "{\"fieldRef\":\"spec.validations[0].expression\",\"warning\":\"Type mismatch\"}";
        V1ExpressionWarning warning = V1ExpressionWarning.fromJson(json);
        assertEquals("spec.validations[0].expression", warning.getFieldRef());
        assertEquals("Type mismatch", warning.getWarning());
    }

    //BaseRock generated method id: ${testToJson}, hash: 2B636ADAE2FFEDFA5729269F9EB57ADB
    @Test
    void testToJson() {
        V1ExpressionWarning warning = new V1ExpressionWarning().fieldRef("spec.validations[0].expression").warning("Type mismatch");
        String json = warning.toJson();
        assertThat(json, is(not(nullValue())));
        assertThat(json, startsWith("{"));
        assertThat(json, endsWith("}"));
        assertThat(json, is(equalTo("{\"fieldRef\":\"spec.validations[0].expression\",\"warning\":\"Type mismatch\"}")));
    }
}
