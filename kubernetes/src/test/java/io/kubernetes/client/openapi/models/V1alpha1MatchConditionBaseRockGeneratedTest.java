package io.kubernetes.client.openapi.models;

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
class V1alpha1MatchConditionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 0FB6F29493EC9AD4D6A970B90A32D5E6
    @Test
    void testConstructor() {
        V1alpha1MatchCondition matchCondition = new V1alpha1MatchCondition();
        assertThat(matchCondition, is(notNullValue()));
    }

    //BaseRock generated method id: ${testExpressionGetterAndSetter}, hash: BA8A0DE5B01CA2DC7597EEA19873D6FF
    @Test
    void testExpressionGetterAndSetter() {
        V1alpha1MatchCondition matchCondition = new V1alpha1MatchCondition();
        String expression = "object.metadata.name == 'example'";
        matchCondition.setExpression(expression);
        assertThat(matchCondition.getExpression(), is(equalTo(expression)));
    }

    //BaseRock generated method id: ${testNameGetterAndSetter}, hash: 73BCECF4242C4777A0BABD1151A13469
    @Test
    void testNameGetterAndSetter() {
        V1alpha1MatchCondition matchCondition = new V1alpha1MatchCondition();
        String name = "example-condition";
        matchCondition.setName(name);
        assertThat(matchCondition.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testExpressionMethod}, hash: 80FE0DF0A6A3A060BF00FBA8333CB7E4
    @Test
    void testExpressionMethod() {
        V1alpha1MatchCondition matchCondition = new V1alpha1MatchCondition();
        String expression = "object.metadata.name == 'example'";
        V1alpha1MatchCondition result = matchCondition.expression(expression);
        assertThat(result, is(equalTo(matchCondition)));
        assertThat(result.getExpression(), is(equalTo(expression)));
    }

    //BaseRock generated method id: ${testNameMethod}, hash: 2519B52B6408EAB9ECEF66081F343D1D
    @Test
    void testNameMethod() {
        V1alpha1MatchCondition matchCondition = new V1alpha1MatchCondition();
        String name = "example-condition";
        V1alpha1MatchCondition result = matchCondition.name(name);
        assertThat(result, is(equalTo(matchCondition)));
        assertThat(result.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testValidNames}, hash: D37B381E0E0C455C541458DA59056377
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "valid-name", "valid.name", "valid_name", "123-abc", "example.com/MyName" })
    void testValidNames(String name) {
        V1alpha1MatchCondition matchCondition = new V1alpha1MatchCondition();
        matchCondition.setName(name);
        assertThat(matchCondition.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 139B85D0B15F13AFCA2426F9275B8CB8
    @Test
    void testEqualsAndHashCode() {
        V1alpha1MatchCondition condition1 = new V1alpha1MatchCondition().expression("object.metadata.name == 'example'").name("example-condition");
        V1alpha1MatchCondition condition2 = new V1alpha1MatchCondition().expression("object.metadata.name == 'example'").name("example-condition");
        V1alpha1MatchCondition condition3 = new V1alpha1MatchCondition().expression("object.metadata.name != 'example'").name("different-condition");
        assertThat(condition1, is(equalTo(condition2)));
        assertThat(condition1.hashCode(), is(equalTo(condition2.hashCode())));
        assertThat(condition1, is(notNullValue()));
        assertThat(condition1.equals(condition3), is(false));
    }

    //BaseRock generated method id: ${testToString}, hash: EB5E763514DEEE46FD24B33CBEE48A7E
    @Test
    void testToString() {
        V1alpha1MatchCondition matchCondition = new V1alpha1MatchCondition().expression("object.metadata.name == 'example'").name("example-condition");
        String expectedString = "class V1alpha1MatchCondition {\n    expression: object.metadata.name == 'example'\n    name: example-condition\n}";
        assertThat(matchCondition.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testNullExpression}, hash: A5175DC2BA4509433AC886AAA3B4EC81
    @Test
    void testNullExpression() {
        V1alpha1MatchCondition matchCondition = new V1alpha1MatchCondition();
        matchCondition.expression(null);
        assertThat(matchCondition.getExpression(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testNullName}, hash: 844001FA8F11D88938B4FB217BA43544
    @Test
    void testNullName() {
        V1alpha1MatchCondition matchCondition = new V1alpha1MatchCondition();
        matchCondition.name(null);
        assertThat(matchCondition.getName(), is(equalTo(null)));
    }
}
