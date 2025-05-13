package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1MatchCondition;
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
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1MatchConditionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 0106C9E874D39A927454E5FE001E83EF
    @Test
    void testConstructor() {
        V1MatchCondition matchCondition = new V1MatchCondition();
        assertThat(matchCondition, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetExpression}, hash: 62BBA2585991699C194788A4C307A5D6
    @Test
    void testSetAndGetExpression() {
        V1MatchCondition matchCondition = new V1MatchCondition();
        String expression = "object.metadata.name == 'example'";
        matchCondition.setExpression(expression);
        assertThat(matchCondition.getExpression(), is(equalTo(expression)));
    }

    //BaseRock generated method id: ${testSetAndGetName}, hash: B875E9665D3F359734F1F74A7337C830
    @Test
    void testSetAndGetName() {
        V1MatchCondition matchCondition = new V1MatchCondition();
        String name = "example-condition";
        matchCondition.setName(name);
        assertThat(matchCondition.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testSetValidNames}, hash: AE74CC4290B15F18CD48419577410499
    @ParameterizedTest
    @ValueSource(strings = { "condition1", "condition2", "123-abc", "my.condition", "example.com/MyCondition" })
    void testSetValidNames(String validName) {
        V1MatchCondition matchCondition = new V1MatchCondition();
        matchCondition.setName(validName);
        assertThat(matchCondition.getName(), is(equalTo(validName)));
    }

    //BaseRock generated method id: ${testSetInvalidNames}, hash: 6747120E2B0FCE2D89F35E2AA950C471
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { " ", "  " })
    void testSetInvalidNames(String invalidName) {
        V1MatchCondition matchCondition = new V1MatchCondition();
        assertDoesNotThrow(() -> matchCondition.setName(invalidName));
    }

    //BaseRock generated method id: ${testExpressionChaining}, hash: 1E68F3590AE5C0C3E582F27EC75F3E9E
    @Test
    void testExpressionChaining() {
        V1MatchCondition matchCondition = new V1MatchCondition().expression("object.metadata.name == 'example'").name("example-condition");
        assertThat(matchCondition.getExpression(), is(equalTo("object.metadata.name == 'example'")));
        assertThat(matchCondition.getName(), is(equalTo("example-condition")));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 743F8C8E69E13FEFD9513BF098F4BA2B
    @Test
    void testEqualsAndHashCode() {
        V1MatchCondition condition1 = new V1MatchCondition().expression("object.metadata.name == 'example'").name("example-condition");
        V1MatchCondition condition2 = new V1MatchCondition().expression("object.metadata.name == 'example'").name("example-condition");
        V1MatchCondition condition3 = new V1MatchCondition().expression("object.metadata.name != 'example'").name("different-condition");
        assertThat(condition1, is(equalTo(condition2)));
        assertThat(condition1.hashCode(), is(equalTo(condition2.hashCode())));
        assertThat(condition1, is(notNullValue()));
        assertThat(condition1.equals(condition3), is(false));
    }

    //BaseRock generated method id: ${testToString}, hash: AA185DD69D3046D08AC0F393179FF75E
    @Test
    void testToString() {
        V1MatchCondition matchCondition = new V1MatchCondition().expression("object.metadata.name == 'example'").name("example-condition");
        String expectedString = "class V1MatchCondition {\n    expression: object.metadata.name == 'example'\n    name: example-condition\n}";
        assertThat(matchCondition.toString().replaceAll("\\s+", " ").trim(), is(equalTo(expectedString.replaceAll("\\s+", " ").trim())));
    }
}
