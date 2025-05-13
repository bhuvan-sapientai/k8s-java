package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import io.kubernetes.client.openapi.models.V1alpha1JSONPatch;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha1JSONPatchBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 64D79D49E9A519F0C6D14AF93B7D274A
    @Test
    void testConstructor() {
        V1alpha1JSONPatch jsonPatch = new V1alpha1JSONPatch();
        assertThat(jsonPatch, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetExpression}, hash: E0BEADD11677744E0D49A511BE992625
    @Test
    void testSetAndGetExpression() {
        V1alpha1JSONPatch jsonPatch = new V1alpha1JSONPatch();
        String expression = "test expression";
        jsonPatch.setExpression(expression);
        assertThat(jsonPatch.getExpression(), is(equalTo(expression)));
    }

    //BaseRock generated method id: ${testExpressionWithVariousValues}, hash: 076A5302F9470BE5D5B137EE4F32A632
    @ParameterizedTest
    @ValueSource(strings = { "expression1", "expression2", "expression3" })
    void testExpressionWithVariousValues(String expression) {
        V1alpha1JSONPatch jsonPatch = new V1alpha1JSONPatch();
        jsonPatch.setExpression(expression);
        assertThat(jsonPatch.getExpression(), is(equalTo(expression)));
    }

    //BaseRock generated method id: ${testExpressionWithNullAndEmptyValues}, hash: 0F687E7DEF5C93E09CA46F2CDFEDE33B
    @ParameterizedTest
    @NullAndEmptySource
    void testExpressionWithNullAndEmptyValues(String expression) {
        V1alpha1JSONPatch jsonPatch = new V1alpha1JSONPatch();
        jsonPatch.setExpression(expression);
        assertThat(jsonPatch.getExpression(), is(equalTo(expression)));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 237CD5D006E5A985F4DDE35F25AB3AD6
    @Test
    void testEqualsWithSameObject() {
        V1alpha1JSONPatch jsonPatch = new V1alpha1JSONPatch().expression("test");
        assertThat(jsonPatch.equals(jsonPatch), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 24C141D4025BAF9E6CFE201C4808A74E
    @Test
    void testEqualsWithDifferentObject() {
        V1alpha1JSONPatch jsonPatch1 = new V1alpha1JSONPatch().expression("test1");
        V1alpha1JSONPatch jsonPatch2 = new V1alpha1JSONPatch().expression("test2");
        assertThat(jsonPatch1.equals(jsonPatch2), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: EFBB87507F757BB470EA8AFB8771B786
    @Test
    void testEqualsWithNull() {
        V1alpha1JSONPatch jsonPatch = new V1alpha1JSONPatch().expression("test");
        assertThat(jsonPatch.equals(null), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: AAEE0250993E347E5862D7D2BDE5103B
    @Test
    void testHashCode() {
        V1alpha1JSONPatch jsonPatch1 = new V1alpha1JSONPatch().expression("test");
        V1alpha1JSONPatch jsonPatch2 = new V1alpha1JSONPatch().expression("test");
        assertThat(jsonPatch1.hashCode(), is(equalTo(jsonPatch2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: F5CF3EDACE2816088EEB988C0EAABB27
    @Test
    void testToString() {
        V1alpha1JSONPatch jsonPatch = new V1alpha1JSONPatch().expression("test");
        String expected = "class V1alpha1JSONPatch {\n    expression: test\n}";
        assertThat(jsonPatch.toString(), is(equalTo(expected)));
    }

    //BaseRock generated method id: ${testExpressionChaining}, hash: 10C08CD76AAFAF6EA73BEDBB16E88692
    @Test
    void testExpressionChaining() {
        V1alpha1JSONPatch jsonPatch = new V1alpha1JSONPatch().expression("test1").expression("test2");
        assertThat(jsonPatch.getExpression(), is(equalTo("test2")));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithNullJsonElement}, hash: D6004227528DCEEAD36AEC725D308745
    @Test
    void testValidateJsonElementWithNullJsonElement() {
        assertThrows(NullPointerException.class, () -> V1alpha1JSONPatch.validateJsonElement(null));
    }
}
