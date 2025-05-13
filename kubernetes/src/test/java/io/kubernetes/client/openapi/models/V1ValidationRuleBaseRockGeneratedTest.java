package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1ValidationRule;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ValidationRuleBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 93C9A6BFEFC2A1C1713FC764519BF8DA
    @Test
    void testConstructor() {
        V1ValidationRule validationRule = new V1ValidationRule();
        assertThat(validationRule, is(notNullValue()));
    }

    //BaseRock generated method id: ${testFieldPath}, hash: 8602A483918106DE86E92A665ECE4A5C
    @Test
    void testFieldPath() {
        V1ValidationRule validationRule = new V1ValidationRule();
        String fieldPath = ".testMap.foo";
        validationRule.setFieldPath(fieldPath);
        assertThat(validationRule.getFieldPath(), is(equalTo(fieldPath)));
    }

    //BaseRock generated method id: ${testMessage}, hash: 64923D1A800035285B1FC7CB93B7F48A
    @Test
    void testMessage() {
        V1ValidationRule validationRule = new V1ValidationRule();
        String message = "must be a URL with the host matching spec.host";
        validationRule.setMessage(message);
        assertThat(validationRule.getMessage(), is(equalTo(message)));
    }

    //BaseRock generated method id: ${testMessageExpression}, hash: A63D9048C044E6340B26F3BD3D492CBF
    @Test
    void testMessageExpression() {
        V1ValidationRule validationRule = new V1ValidationRule();
        String messageExpression = "x must be less than max (\" + string(self.max) + \")";
        validationRule.setMessageExpression(messageExpression);
        assertThat(validationRule.getMessageExpression(), is(equalTo(messageExpression)));
    }

    //BaseRock generated method id: ${testOptionalOldSelf}, hash: 7EECDC44A432B5D77D0748A057EDA713
    @Test
    void testOptionalOldSelf() {
        V1ValidationRule validationRule = new V1ValidationRule();
        validationRule.setOptionalOldSelf(true);
        assertThat(validationRule.getOptionalOldSelf(), is(true));
    }

    //BaseRock generated method id: ${testReason}, hash: 37EF838D401461C16D2B8E8052EED61F
    @Test
    void testReason() {
        V1ValidationRule validationRule = new V1ValidationRule();
        String reason = "FieldValueInvalid";
        validationRule.setReason(reason);
        assertThat(validationRule.getReason(), is(equalTo(reason)));
    }

    //BaseRock generated method id: ${testRule}, hash: D30FEB7F2CA7E383D5E80163F2B1ED05
    @Test
    void testRule() {
        V1ValidationRule validationRule = new V1ValidationRule();
        String rule = "self.status.actual <= self.spec.maxDesired";
        validationRule.setRule(rule);
        assertThat(validationRule.getRule(), is(equalTo(rule)));
    }

    //BaseRock generated method id: ${testSetFieldPathWithInvalidInput}, hash: 701F71FA3B0D3F5DB37901CC8042D0B9
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { " ", "  " })
    void testSetFieldPathWithInvalidInput(String input) {
        V1ValidationRule validationRule = new V1ValidationRule();
        validationRule.setFieldPath(input);
        assertThat(validationRule.getFieldPath(), is(equalTo(input)));
    }

    //BaseRock generated method id: ${testSetMessageWithInvalidInput}, hash: AD62F77089CEE3A8B10268B30E67B3F7
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { " ", "  " })
    void testSetMessageWithInvalidInput(String input) {
        V1ValidationRule validationRule = new V1ValidationRule();
        validationRule.setMessage(input);
        assertThat(validationRule.getMessage(), is(equalTo(input)));
    }

    //BaseRock generated method id: ${testSetMessageExpressionWithInvalidInput}, hash: 8F1CADD4456D080FED05C146ABD634B5
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { " ", "  " })
    void testSetMessageExpressionWithInvalidInput(String input) {
        V1ValidationRule validationRule = new V1ValidationRule();
        validationRule.setMessageExpression(input);
        assertThat(validationRule.getMessageExpression(), is(equalTo(input)));
    }

    //BaseRock generated method id: ${testSetReasonWithInvalidInput}, hash: 032DDA409A67BBB74837BF764488057F
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { " ", "  " })
    void testSetReasonWithInvalidInput(String input) {
        V1ValidationRule validationRule = new V1ValidationRule();
        validationRule.setReason(input);
        assertThat(validationRule.getReason(), is(equalTo(input)));
    }

    //BaseRock generated method id: ${testSetRuleWithNull}, hash: 7573704E211C55089C6421A839B1C667
    @Test
    void testSetRuleWithNull() {
        V1ValidationRule validationRule = new V1ValidationRule();
        assertThat(validationRule.getRule(), is(equalTo(null)));
        validationRule.setRule(null);
        assertThat(validationRule.getRule(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testEquals}, hash: C76A8CBA1AA1F6E354D0FBC999658480
    @Test
    void testEquals() {
        V1ValidationRule rule1 = new V1ValidationRule().fieldPath(".testMap.foo").message("Test message").messageExpression("Test expression").optionalOldSelf(true).reason("FieldValueInvalid").rule("self.status.actual <= self.spec.maxDesired");
        V1ValidationRule rule2 = new V1ValidationRule().fieldPath(".testMap.foo").message("Test message").messageExpression("Test expression").optionalOldSelf(true).reason("FieldValueInvalid").rule("self.status.actual <= self.spec.maxDesired");
        assertThat(rule1.equals(rule2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: D237130393B76125947E4602BBCA363E
    @Test
    void testHashCode() {
        V1ValidationRule rule1 = new V1ValidationRule().fieldPath(".testMap.foo").message("Test message").messageExpression("Test expression").optionalOldSelf(true).reason("FieldValueInvalid").rule("self.status.actual <= self.spec.maxDesired");
        V1ValidationRule rule2 = new V1ValidationRule().fieldPath(".testMap.foo").message("Test message").messageExpression("Test expression").optionalOldSelf(true).reason("FieldValueInvalid").rule("self.status.actual <= self.spec.maxDesired");
        assertThat(rule1.hashCode(), is(equalTo(rule2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 8A760A0ADC90B9B37B5943FF0B4CABB7
    @Test
    void testToString() {
        V1ValidationRule validationRule = new V1ValidationRule().fieldPath(".testMap.foo").message("Test message").messageExpression("Test expression").optionalOldSelf(true).reason("FieldValueInvalid").rule("self.status.actual <= self.spec.maxDesired");
        String expectedString = "class V1ValidationRule {\n" + "    fieldPath: .testMap.foo\n" + "    message: Test message\n" + "    messageExpression: Test expression\n" + "    optionalOldSelf: true\n" + "    reason: FieldValueInvalid\n" + "    rule: self.status.actual <= self.spec.maxDesired\n" + "}";
        assertThat(validationRule.toString(), is(equalTo(expectedString)));
    }
}
