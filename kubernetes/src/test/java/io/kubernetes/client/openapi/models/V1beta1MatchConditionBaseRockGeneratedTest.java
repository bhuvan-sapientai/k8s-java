package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1beta1MatchCondition;
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
class V1beta1MatchConditionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 17F666E4C4AA828ECD39B65156ED9F14
    @Test
    void testConstructor() {
        V1beta1MatchCondition matchCondition = new V1beta1MatchCondition();
        assertThat(matchCondition, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetExpression}, hash: C653703F4B04EE0307496EFC876B3E63
    @Test
    void testSetAndGetExpression() {
        V1beta1MatchCondition matchCondition = new V1beta1MatchCondition();
        String expression = "object.metadata.name == 'example'";
        matchCondition.setExpression(expression);
        assertThat(matchCondition.getExpression(), is(equalTo(expression)));
    }

    //BaseRock generated method id: ${testSetAndGetName}, hash: C7F4BD369079C451B40501B8D9C6CE93
    @Test
    void testSetAndGetName() {
        V1beta1MatchCondition matchCondition = new V1beta1MatchCondition();
        String name = "example-condition";
        matchCondition.setName(name);
        assertThat(matchCondition.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testSetExpressionWithInvalidInput}, hash: DA0D12310D1B9F4B5EF080E102FB5D51
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "  ", "\t", "\n" })
    void testSetExpressionWithInvalidInput(String invalidExpression) {
        V1beta1MatchCondition matchCondition = new V1beta1MatchCondition();
        matchCondition.setExpression(invalidExpression);
        assertThat(matchCondition.getExpression(), is(equalTo(invalidExpression)));
    }

    //BaseRock generated method id: ${testSetNameWithInvalidInput}, hash: 376682E103F5DC8788448C21EA029090
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "  ", "\t", "\n" })
    void testSetNameWithInvalidInput(String invalidName) {
        V1beta1MatchCondition matchCondition = new V1beta1MatchCondition();
        matchCondition.setName(invalidName);
        assertThat(matchCondition.getName(), is(equalTo(invalidName)));
    }

    //BaseRock generated method id: ${testExpressionMethod}, hash: E63092DF7E17A845C8ED94C1D335A6A6
    @Test
    void testExpressionMethod() {
        String expression = "object.metadata.name == 'example'";
        V1beta1MatchCondition matchCondition = new V1beta1MatchCondition().expression(expression);
        assertThat(matchCondition.getExpression(), is(equalTo(expression)));
    }

    //BaseRock generated method id: ${testNameMethod}, hash: D8782BEE213B7BFB49711281CCBA85CE
    @Test
    void testNameMethod() {
        String name = "example-condition";
        V1beta1MatchCondition matchCondition = new V1beta1MatchCondition().name(name);
        assertThat(matchCondition.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: EA1B8F05A0FC8726DFB36F7D3197DAEB
    @Test
    void testEqualsAndHashCode() {
        V1beta1MatchCondition condition1 = new V1beta1MatchCondition().expression("object.metadata.name == 'example'").name("example-condition");
        V1beta1MatchCondition condition2 = new V1beta1MatchCondition().expression("object.metadata.name == 'example'").name("example-condition");
        V1beta1MatchCondition condition3 = new V1beta1MatchCondition().expression("object.metadata.name != 'example'").name("different-condition");
        assertThat(condition1.equals(condition2), is(true));
        assertThat(condition1.equals(condition3), is(false));
        assertThat(condition1.hashCode(), is(equalTo(condition2.hashCode())));
        assertThat(condition1.hashCode(), is(not(equalTo(condition3.hashCode()))));
    }

    //BaseRock generated method id: ${testToString}, hash: 4D141BE29AEE65F17051F0D56185D6E6
    @Test
    void testToString() {
        V1beta1MatchCondition matchCondition = new V1beta1MatchCondition().expression("object.metadata.name == 'example'").name("example-condition");
        String expectedString = "class V1beta1MatchCondition {\n" + "    expression: object.metadata.name == 'example'\n" + "    name: example-condition\n" + "}";
        assertThat(matchCondition.toString(), is(equalTo(expectedString)));
    }
}
