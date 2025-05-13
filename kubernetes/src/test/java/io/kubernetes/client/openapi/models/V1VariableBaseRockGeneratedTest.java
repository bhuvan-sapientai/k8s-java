package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import io.kubernetes.client.openapi.models.V1Variable;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1VariableBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 026CDFED25C1B78643C4EAD90663FFA1
    @Test
    void testConstructor() {
        V1Variable variable = new V1Variable();
        assertThat(variable, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetExpression}, hash: C29FE16335A4F0002A84FF5190394344
    @Test
    void testSetAndGetExpression() {
        V1Variable variable = new V1Variable();
        String expression = "x + y";
        variable.setExpression(expression);
        assertThat(variable.getExpression(), is(equalTo(expression)));
    }

    //BaseRock generated method id: ${testSetAndGetName}, hash: 1572C3EBF900F9C5490EFDE5F1B35774
    @Test
    void testSetAndGetName() {
        V1Variable variable = new V1Variable();
        String name = "myVariable";
        variable.setName(name);
        assertThat(variable.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testExpressionWithDifferentValues}, hash: 29F72BE7522A3358566E9CC68433AEBC
    @ParameterizedTest
    @ValueSource(strings = { "expression1", "expression2", "x * y + z" })
    void testExpressionWithDifferentValues(String expression) {
        V1Variable variable = new V1Variable();
        variable.setExpression(expression);
        assertThat(variable.getExpression(), is(equalTo(expression)));
    }

    //BaseRock generated method id: ${testNameWithDifferentValues}, hash: 358B697A1663E01C7FE09B7F58C129EE
    @ParameterizedTest
    @ValueSource(strings = { "name1", "name2", "myComplexVariable" })
    void testNameWithDifferentValues(String name) {
        V1Variable variable = new V1Variable();
        variable.setName(name);
        assertThat(variable.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testSetExpressionWithInvalidInput}, hash: C07F8F7D8B8CCEC0F4BEF6E276FF52F5
    @ParameterizedTest
    @NullAndEmptySource
    void testSetExpressionWithInvalidInput(String invalidExpression) {
        V1Variable variable = new V1Variable();
        assertDoesNotThrow(() -> variable.setExpression(invalidExpression));
    }

    //BaseRock generated method id: ${testSetNameWithInvalidInput}, hash: 6AF61679EA16E57101756629CA2D7C60
    @ParameterizedTest
    @NullAndEmptySource
    void testSetNameWithInvalidInput(String invalidName) {
        V1Variable variable = new V1Variable();
        assertDoesNotThrow(() -> variable.setName(invalidName));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: DAB4F28499284BE1E2FE134915470553
    @Test
    void testEqualsWithSameObject() {
        V1Variable variable = new V1Variable().expression("x + y").name("myVar");
        assertThat(variable.equals(variable), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 9AC8D7E371DFA632F77A3384E3EF9FD7
    @Test
    void testEqualsWithDifferentObject() {
        V1Variable variable1 = new V1Variable().expression("x + y").name("myVar");
        V1Variable variable2 = new V1Variable().expression("x + y").name("myVar");
        assertThat(variable1.equals(variable2), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentExpression}, hash: 58BD89A1C70D17A2F8DAD60F775B905B
    @Test
    void testEqualsWithDifferentExpression() {
        V1Variable variable1 = new V1Variable().expression("x + y").name("myVar");
        V1Variable variable2 = new V1Variable().expression("x - y").name("myVar");
        assertThat(variable1.equals(variable2), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentName}, hash: 13DE44F3D6F713BADC3494CA0658BEE7
    @Test
    void testEqualsWithDifferentName() {
        V1Variable variable1 = new V1Variable().expression("x + y").name("myVar1");
        V1Variable variable2 = new V1Variable().expression("x + y").name("myVar2");
        assertThat(variable1.equals(variable2), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: EDC1DCBF8EB2397EAF663AC9113122FC
    @Test
    void testHashCode() {
        V1Variable variable1 = new V1Variable().expression("x + y").name("myVar");
        V1Variable variable2 = new V1Variable().expression("x + y").name("myVar");
        assertThat(variable1.hashCode(), is(equalTo(variable2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 870F4CE658127DF76B169924C719231A
    @Test
    void testToString() {
        V1Variable variable = new V1Variable().expression("x + y").name("myVar");
        String expectedString = "class V1Variable {\n    expression: x + y\n    name: myVar\n}";
        assertThat(variable.toString(), is(equalTo(expectedString)));
    }
}
