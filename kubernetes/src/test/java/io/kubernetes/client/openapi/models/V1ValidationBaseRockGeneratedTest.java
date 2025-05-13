package io.kubernetes.client.openapi.models;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import io.kubernetes.client.openapi.models.V1Validation;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1ValidationBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 8A25F56233D8876E52B0303D5144DAAC
    @Test
    void testConstructor() {
        V1Validation validation = new V1Validation();
        assertThat(validation, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetExpression}, hash: 7879BB1520A1CDD960176E68A5BF840D
    @Test
    void testSetAndGetExpression() {
        V1Validation validation = new V1Validation();
        String expression = "object.value > 0";
        validation.setExpression(expression);
        assertEquals(expression, validation.getExpression());
    }

    //BaseRock generated method id: ${testExpressionWithDifferentValues}, hash: C893F3A7F4B23B24ED5A64A756E025D7
    @ParameterizedTest
    @ValueSource(strings = { "object.value < 10", "object.name == 'test'" })
    void testExpressionWithDifferentValues(String expression) {
        V1Validation validation = new V1Validation();
        validation.setExpression(expression);
        assertEquals(expression, validation.getExpression());
    }

    //BaseRock generated method id: ${testSetAndGetMessage}, hash: 8401FE5B50F2FE7543AA1A372168944D
    @Test
    void testSetAndGetMessage() {
        V1Validation validation = new V1Validation();
        String message = "Validation failed";
        validation.setMessage(message);
        assertEquals(message, validation.getMessage());
    }

    //BaseRock generated method id: ${testMessageWithDifferentValues}, hash: D80F2E01292586785CA69F68AFA2F31E
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Error message", "Warning: invalid input" })
    void testMessageWithDifferentValues(String message) {
        V1Validation validation = new V1Validation();
        validation.setMessage(message);
        assertEquals(message, validation.getMessage());
    }

    //BaseRock generated method id: ${testSetAndGetMessageExpression}, hash: 14EDD2902798C79C916C97CCA39ABE63
    @Test
    void testSetAndGetMessageExpression() {
        V1Validation validation = new V1Validation();
        String messageExpression = "object.x must be less than max (\"+string(params.max)+\")";
        validation.setMessageExpression(messageExpression);
        assertEquals(messageExpression, validation.getMessageExpression());
    }

    //BaseRock generated method id: ${testMessageExpressionWithDifferentValues}, hash: 6AC7AB3FC9F7AB2BCE64F310DAF840E3
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Error: value exceeds limit", "Warning: input not in expected format" })
    void testMessageExpressionWithDifferentValues(String messageExpression) {
        V1Validation validation = new V1Validation();
        validation.setMessageExpression(messageExpression);
        assertEquals(messageExpression, validation.getMessageExpression());
    }

    //BaseRock generated method id: ${testSetAndGetReason}, hash: C1A3F6F6FCC15A88D7930457C73A224F
    @Test
    void testSetAndGetReason() {
        V1Validation validation = new V1Validation();
        String reason = "Invalid";
        validation.setReason(reason);
        assertEquals(reason, validation.getReason());
    }

    //BaseRock generated method id: ${testReasonWithDifferentValues}, hash: 4DE27EF47652C00D7474672A6FA089EA
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Unauthorized", "Forbidden", "RequestEntityTooLarge" })
    void testReasonWithDifferentValues(String reason) {
        V1Validation validation = new V1Validation();
        validation.setReason(reason);
        assertEquals(reason, validation.getReason());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 7CC1C656871ADC2A9519FD5465792E05
    @Test
    void testEqualsAndHashCode() {
        V1Validation validation1 = new V1Validation().expression("object.value > 0").message("Value must be positive").messageExpression("'Value ' + string(object.value) + ' is not positive'").reason("Invalid");
        V1Validation validation2 = new V1Validation().expression("object.value > 0").message("Value must be positive").messageExpression("'Value ' + string(object.value) + ' is not positive'").reason("Invalid");
        V1Validation validation3 = new V1Validation().expression("object.value >= 0").message("Value must be non-negative").messageExpression("'Value ' + string(object.value) + ' is negative'").reason("Invalid");
        assertAll(() -> assertEquals(validation1, validation2), () -> assertEquals(validation1.hashCode(), validation2.hashCode()), () -> assertThat(validation1.equals(validation3), is(false)), () -> assertThat(validation1.hashCode() == validation3.hashCode(), is(false)));
    }

    //BaseRock generated method id: ${testToString}, hash: 1D9435D9911E7AA4BFC37E2F13284909
    @Test
    void testToString() {
        V1Validation validation = new V1Validation().expression("object.value > 0").message("Value must be positive").messageExpression("'Value ' + string(object.value) + ' is not positive'").reason("Invalid");
        String expectedString = "class V1Validation {\n" + "    expression: object.value > 0\n" + "    message: Value must be positive\n" + "    messageExpression: 'Value ' + string(object.value) + ' is not positive'\n" + "    reason: Invalid\n" + "}";
        assertThat(validation.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 4D890468D785B9C22DE0432D1438A7E7
    @Test
    void testBuilderPattern() {
        String expression = "object.value > 0";
        String message = "Value must be positive";
        String messageExpression = "'Value ' + string(object.value) + ' is not positive'";
        String reason = "Invalid";
        V1Validation validation = new V1Validation().expression(expression).message(message).messageExpression(messageExpression).reason(reason);
        assertAll(() -> assertEquals(expression, validation.getExpression()), () -> assertEquals(message, validation.getMessage()), () -> assertEquals(messageExpression, validation.getMessageExpression()), () -> assertEquals(reason, validation.getReason()));
    }

    //BaseRock generated method id: ${testNullExpression}, hash: 890F7483B147E61DD0E30435E7F1D0B2
    @Disabled()
    @Test
    void testNullExpression() {
        V1Validation validation = new V1Validation();
        assertThrows(NullPointerException.class, () -> validation.expression(null));
    }
}
