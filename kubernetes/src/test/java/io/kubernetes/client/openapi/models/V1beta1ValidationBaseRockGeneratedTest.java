package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1beta1Validation;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1ValidationBaseRockGeneratedTest {

    private V1beta1Validation validation;

    @BeforeEach
    void setUp() {
        validation = new V1beta1Validation();
    }

    //BaseRock generated method id: ${testConstructor}, hash: D6B4711DECB57D8BECF63FFA643D7418
    @Test
    void testConstructor() {
        assertThat(validation, is(notNullValue()));
    }

    //BaseRock generated method id: ${testExpressionGetterAndSetter}, hash: 5ABC3990AD5B04AAB10B1565F4F41615
    @Test
    void testExpressionGetterAndSetter() {
        String expression = "test expression";
        validation.setExpression(expression);
        assertThat(validation.getExpression(), is(equalTo(expression)));
    }

    //BaseRock generated method id: ${testExpressionSetterWithVariousInputs}, hash: 5348775474D188D9AFB5D61C19384996
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "expression1", "expression2" })
    void testExpressionSetterWithVariousInputs(String expression) {
        validation.setExpression(expression);
        assertThat(validation.getExpression(), is(equalTo(expression)));
    }

    //BaseRock generated method id: ${testMessageGetterAndSetter}, hash: AB1971F4F0F24522627A7C4AA017C512
    @Test
    void testMessageGetterAndSetter() {
        String message = "test message";
        validation.setMessage(message);
        assertThat(validation.getMessage(), is(equalTo(message)));
    }

    //BaseRock generated method id: ${testMessageSetterWithVariousInputs}, hash: 1DE3E8F67083C6B098587212EA627B89
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "message1", "message2" })
    void testMessageSetterWithVariousInputs(String message) {
        validation.setMessage(message);
        assertThat(validation.getMessage(), is(equalTo(message)));
    }

    //BaseRock generated method id: ${testMessageExpressionGetterAndSetter}, hash: 30F27E05F4EB6BC2375FD6C2A4EC4343
    @Test
    void testMessageExpressionGetterAndSetter() {
        String messageExpression = "test message expression";
        validation.setMessageExpression(messageExpression);
        assertThat(validation.getMessageExpression(), is(equalTo(messageExpression)));
    }

    //BaseRock generated method id: ${testMessageExpressionSetterWithVariousInputs}, hash: CD326E076C07A122D73DB38DE9435AE3
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "messageExpression1", "messageExpression2" })
    void testMessageExpressionSetterWithVariousInputs(String messageExpression) {
        validation.setMessageExpression(messageExpression);
        assertThat(validation.getMessageExpression(), is(equalTo(messageExpression)));
    }

    //BaseRock generated method id: ${testReasonGetterAndSetter}, hash: 6DA342B622BB1789C1C8966956EF4691
    @Test
    void testReasonGetterAndSetter() {
        String reason = "test reason";
        validation.setReason(reason);
        assertThat(validation.getReason(), is(equalTo(reason)));
    }

    //BaseRock generated method id: ${testReasonSetterWithVariousInputs}, hash: D92E317C45F2F1A285571B4D5A0FCDF9
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "reason1", "reason2" })
    void testReasonSetterWithVariousInputs(String reason) {
        validation.setReason(reason);
        assertThat(validation.getReason(), is(equalTo(reason)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 84B55B5840896B244E332A93FC78614C
    @Test
    void testEquals() {
        V1beta1Validation validation1 = new V1beta1Validation().expression("exp1").message("msg1").messageExpression("msgExp1").reason("reason1");
        V1beta1Validation validation2 = new V1beta1Validation().expression("exp1").message("msg1").messageExpression("msgExp1").reason("reason1");
        V1beta1Validation validation3 = new V1beta1Validation().expression("exp2").message("msg2").messageExpression("msgExp2").reason("reason2");
        assertThat(validation1.equals(validation2), is(true));
        assertThat(validation1.equals(validation3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 25EC9080B674C94DF8487CCB99F86559
    @Test
    void testHashCode() {
        V1beta1Validation validation1 = new V1beta1Validation().expression("exp1").message("msg1").messageExpression("msgExp1").reason("reason1");
        V1beta1Validation validation2 = new V1beta1Validation().expression("exp1").message("msg1").messageExpression("msgExp1").reason("reason1");
        assertThat(validation1.hashCode(), is(equalTo(validation2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 97F7607828B35EFA8BF034E9883F5A16
    @Test
    void testToString() {
        V1beta1Validation validation = new V1beta1Validation().expression("exp1").message("msg1").messageExpression("msgExp1").reason("reason1");
        String expectedString = "class V1beta1Validation {\n" + "    expression: exp1\n" + "    message: msg1\n" + "    messageExpression: msgExp1\n" + "    reason: reason1\n" + "}";
        assertThat(validation.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testValidationWithNullExpression}, hash: 968A25A687A757A21BD77403A56C301E
    @Test
    void testValidationWithNullExpression() {
        V1beta1Validation validation = new V1beta1Validation();
        assertThat(validation.expression(null), is(notNullValue()));
    }
}
