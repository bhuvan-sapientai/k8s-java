package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1beta1Variable;
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
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1VariableBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: C2A8980ED350F8E893482676C1E79F21
    @Test
    void testConstructor() {
        V1beta1Variable variable = new V1beta1Variable();
        assertThat(variable, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetExpression}, hash: 17D05062075516766D012EC0B9AA768D
    @Test
    void testSetAndGetExpression() {
        V1beta1Variable variable = new V1beta1Variable();
        String expression = "x + y";
        variable.setExpression(expression);
        assertThat(variable.getExpression(), is(equalTo(expression)));
    }

    //BaseRock generated method id: ${testSetAndGetName}, hash: 6113982907E5F29D304C16E63F59ADAB
    @Test
    void testSetAndGetName() {
        V1beta1Variable variable = new V1beta1Variable();
        String name = "myVariable";
        variable.setName(name);
        assertThat(variable.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testExpressionWithDifferentValues}, hash: 535D702727346308B08C998BEF196CEA
    @ParameterizedTest
    @ValueSource(strings = { "expression1", "expression2", "1 + 2" })
    void testExpressionWithDifferentValues(String expression) {
        V1beta1Variable variable = new V1beta1Variable();
        variable.setExpression(expression);
        assertThat(variable.getExpression(), is(equalTo(expression)));
    }

    //BaseRock generated method id: ${testNameWithDifferentValues}, hash: 6EB09064D5762C17A1B409E74F1296D4
    @ParameterizedTest
    @ValueSource(strings = { "name1", "name2", "myVar" })
    void testNameWithDifferentValues(String name) {
        V1beta1Variable variable = new V1beta1Variable();
        variable.setName(name);
        assertThat(variable.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testSetExpressionWithInvalidInput}, hash: FCEC7C74FFD56BA8CE1C6B99BF93F548
    @ParameterizedTest
    @NullAndEmptySource
    void testSetExpressionWithInvalidInput(String expression) {
        V1beta1Variable variable = new V1beta1Variable();
        variable.setExpression(expression);
        assertThat(variable.getExpression(), is(equalTo(expression)));
    }

    //BaseRock generated method id: ${testSetNameWithInvalidInput}, hash: F58648817C1366AD7AF02C0777C28C65
    @ParameterizedTest
    @NullAndEmptySource
    void testSetNameWithInvalidInput(String name) {
        V1beta1Variable variable = new V1beta1Variable();
        variable.setName(name);
        assertThat(variable.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 8F9D21D62E117676369B74D58D19ABFA
    @Test
    void testEqualsAndHashCode() {
        V1beta1Variable variable1 = new V1beta1Variable().expression("expr1").name("var1");
        V1beta1Variable variable2 = new V1beta1Variable().expression("expr1").name("var1");
        V1beta1Variable variable3 = new V1beta1Variable().expression("expr2").name("var2");
        assertThat(variable1, is(equalTo(variable2)));
        assertThat(variable1.hashCode(), is(equalTo(variable2.hashCode())));
        assertThat(variable1, is(not(equalTo(variable3))));
    }

    //BaseRock generated method id: ${testToString}, hash: 7ABCA476243596C28E76B4720E94B082
    @Test
    void testToString() {
        V1beta1Variable variable = new V1beta1Variable().expression("x + y").name("myVar");
        String expectedString = "class V1beta1Variable {\n    expression: x + y\n    name: myVar\n}";
        assertThat(variable.toString(), is(equalTo(expectedString)));
    }
}
