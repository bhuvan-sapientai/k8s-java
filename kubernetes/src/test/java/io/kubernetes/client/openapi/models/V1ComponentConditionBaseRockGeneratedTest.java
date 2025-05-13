package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1ComponentCondition;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ComponentConditionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1ComponentConditionConstructor}, hash: 488BAA5F7BDC681A39947B83D16BA555
    @Test
    void testV1ComponentConditionConstructor() {
        V1ComponentCondition condition = new V1ComponentCondition();
        assertNotNull(condition);
    }

    //BaseRock generated method id: ${testError}, hash: FAE396003248A606E5F9DF299F74CCBD
    @Test
    void testError() {
        V1ComponentCondition condition = new V1ComponentCondition();
        String error = "Test Error";
        condition.setError(error);
        assertEquals(error, condition.getError());
    }

    //BaseRock generated method id: ${testMessage}, hash: 15464484A66E89EB0B652545D353ECC8
    @Test
    void testMessage() {
        V1ComponentCondition condition = new V1ComponentCondition();
        String message = "Test Message";
        condition.setMessage(message);
        assertEquals(message, condition.getMessage());
    }

    //BaseRock generated method id: ${testStatus}, hash: 10E5292213F04A141B4AA142067A5706
    @Test
    void testStatus() {
        V1ComponentCondition condition = new V1ComponentCondition();
        String status = "True";
        condition.setStatus(status);
        assertEquals(status, condition.getStatus());
    }

    //BaseRock generated method id: ${testType}, hash: C70A75DCA6C7C3F2D7A01A1ACF6C36D6
    @Test
    void testType() {
        V1ComponentCondition condition = new V1ComponentCondition();
        String type = "Healthy";
        condition.setType(type);
        assertEquals(type, condition.getType());
    }

    //BaseRock generated method id: ${testErrorFluentSetter}, hash: 84FEA28E858CE16C5BA37C92B6B459E9
    @Test
    void testErrorFluentSetter() {
        V1ComponentCondition condition = new V1ComponentCondition();
        String error = "Test Error";
        V1ComponentCondition returnedCondition = condition.error(error);
        assertThat(returnedCondition, is(condition));
        assertEquals(error, condition.getError());
    }

    //BaseRock generated method id: ${testMessageFluentSetter}, hash: CA25ED6D821ADEB6A2725D69FC0F128D
    @Test
    void testMessageFluentSetter() {
        V1ComponentCondition condition = new V1ComponentCondition();
        String message = "Test Message";
        V1ComponentCondition returnedCondition = condition.message(message);
        assertThat(returnedCondition, is(condition));
        assertEquals(message, condition.getMessage());
    }

    //BaseRock generated method id: ${testStatusFluentSetter}, hash: 791AA2EDFDA4F5E66F47C642E08BA126
    @Test
    void testStatusFluentSetter() {
        V1ComponentCondition condition = new V1ComponentCondition();
        String status = "True";
        V1ComponentCondition returnedCondition = condition.status(status);
        assertThat(returnedCondition, is(condition));
        assertEquals(status, condition.getStatus());
    }

    //BaseRock generated method id: ${testTypeFluentSetter}, hash: 9B19ABDAE52A35B50DAA182140FD9D2B
    @Test
    void testTypeFluentSetter() {
        V1ComponentCondition condition = new V1ComponentCondition();
        String type = "Healthy";
        V1ComponentCondition returnedCondition = condition.type(type);
        assertThat(returnedCondition, is(condition));
        assertEquals(type, condition.getType());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 038ABE9E6B4B5D6ABC42C500EA62CF4E
    @Test
    void testEqualsAndHashCode() {
        V1ComponentCondition condition1 = new V1ComponentCondition().error("Error").message("Message").status("True").type("Healthy");
        V1ComponentCondition condition2 = new V1ComponentCondition().error("Error").message("Message").status("True").type("Healthy");
        V1ComponentCondition condition3 = new V1ComponentCondition().error("DifferentError").message("DifferentMessage").status("False").type("Unhealthy");
        assertThat(condition1.equals(condition2), is(true));
        assertThat(condition1.equals(condition3), is(false));
        assertThat(condition1.hashCode() == condition2.hashCode(), is(true));
        assertThat(condition1.hashCode() == condition3.hashCode(), is(false));
    }

    //BaseRock generated method id: ${testToString}, hash: 70E0518030FB9BCE3EBD5D30D9E4AD3E
    @Test
    void testToString() {
        V1ComponentCondition condition = new V1ComponentCondition().error("Error").message("Message").status("True").type("Healthy");
        String expectedString = "class V1ComponentCondition {\n" + "    error: Error\n" + "    message: Message\n" + "    status: True\n" + "    type: Healthy\n" + "}";
        assertEquals(expectedString, condition.toString());
    }

    //BaseRock generated method id: ${testNullValues}, hash: 1F4908DE28C7433990378AA5553C146C
    @Test
    void testNullValues() {
        V1ComponentCondition condition = new V1ComponentCondition();
        assertThat(condition.getError(), is(nullValue()));
        assertThat(condition.getMessage(), is(nullValue()));
        assertThat(condition.getStatus(), is(nullValue()));
        assertThat(condition.getType(), is(nullValue()));
    }
}
