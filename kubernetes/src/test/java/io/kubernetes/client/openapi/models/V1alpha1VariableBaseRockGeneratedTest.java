package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1alpha1Variable;
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
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha1VariableBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 71D5D6E2F4498E517161B45FCCCB7596
    @Test
    void testConstructor() {
        V1alpha1Variable variable = new V1alpha1Variable();
        assertThat(variable, is(notNullValue()));
    }

    //BaseRock generated method id: ${testExpressionGetterAndSetter}, hash: FC77715B2796EE0D37C8C782012180CA
    @Test
    void testExpressionGetterAndSetter() {
        V1alpha1Variable variable = new V1alpha1Variable();
        String expression = "x + y";
        variable.setExpression(expression);
        assertThat(variable.getExpression(), is(equalTo(expression)));
    }

    //BaseRock generated method id: ${testExpressionWithValidValues}, hash: CEFFC68DF7F90DB9968D24F61D75DB60
    @ParameterizedTest
    @ValueSource(strings = { "x", "y", "x + y", "func(x, y)" })
    void testExpressionWithValidValues(String expression) {
        V1alpha1Variable variable = new V1alpha1Variable();
        variable.setExpression(expression);
        assertThat(variable.getExpression(), is(equalTo(expression)));
    }

    //BaseRock generated method id: ${testExpressionWithInvalidValues}, hash: 251F38ED5627BEF46C91B8B9D1BBB334
    @ParameterizedTest
    @NullAndEmptySource
    void testExpressionWithInvalidValues(String expression) {
        V1alpha1Variable variable = new V1alpha1Variable();
        variable.setExpression(expression);
        assertThat(variable.getExpression(), is(equalTo(expression)));
    }

    //BaseRock generated method id: ${testNameGetterAndSetter}, hash: F14F8EF03779151930525801CA87A572
    @Test
    void testNameGetterAndSetter() {
        V1alpha1Variable variable = new V1alpha1Variable();
        String name = "myVariable";
        variable.setName(name);
        assertThat(variable.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testNameWithValidValues}, hash: 3F4F99F8197D86BAB5B60D7C7E147375
    @ParameterizedTest
    @ValueSource(strings = { "var1", "my_variable", "VAR_2" })
    void testNameWithValidValues(String name) {
        V1alpha1Variable variable = new V1alpha1Variable();
        variable.setName(name);
        assertThat(variable.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testNameWithInvalidValues}, hash: 2C134DF98AFA6F33DBB879FF9EA15AB4
    @ParameterizedTest
    @NullAndEmptySource
    void testNameWithInvalidValues(String name) {
        V1alpha1Variable variable = new V1alpha1Variable();
        variable.setName(name);
        assertThat(variable.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 57BCDB09E8362E057C11B1F1669DCE63
    @Test
    void testEquals() {
        V1alpha1Variable variable1 = new V1alpha1Variable().expression("x + y").name("var1");
        V1alpha1Variable variable2 = new V1alpha1Variable().expression("x + y").name("var1");
        V1alpha1Variable variable3 = new V1alpha1Variable().expression("a + b").name("var2");
        assertThat(variable1.equals(variable2), is(true));
        assertThat(variable1.equals(variable3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: B37CB6EB829B391F77C2D7EF301FF39D
    @Test
    void testHashCode() {
        V1alpha1Variable variable1 = new V1alpha1Variable().expression("x + y").name("var1");
        V1alpha1Variable variable2 = new V1alpha1Variable().expression("x + y").name("var1");
        assertThat(variable1.hashCode(), is(equalTo(variable2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 1160DA61CC73DFE0A184E471254C360C
    @Test
    void testToString() {
        V1alpha1Variable variable = new V1alpha1Variable().expression("x + y").name("var1");
        String expectedString = "class V1alpha1Variable {\n    expression: x + y\n    name: var1\n}";
        assertThat(variable.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testBuilder}, hash: F25AA873D795347BE74288FC379EACD1
    @Test
    void testBuilder() {
        V1alpha1Variable variable = new V1alpha1Variable().expression("x + y").name("var1");
        assertThat(variable.getExpression(), is(equalTo("x + y")));
        assertThat(variable.getName(), is(equalTo("var1")));
    }
}
