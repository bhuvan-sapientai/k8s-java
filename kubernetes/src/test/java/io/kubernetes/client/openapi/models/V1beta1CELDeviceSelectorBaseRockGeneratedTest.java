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
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.not;
import io.kubernetes.client.openapi.models.V1beta1CELDeviceSelector;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1CELDeviceSelectorBaseRockGeneratedTest {

    private V1beta1CELDeviceSelector selector;

    @BeforeEach
    void setUp() {
        selector = new V1beta1CELDeviceSelector();
    }

    //BaseRock generated method id: ${testConstructor}, hash: C80D80D522451CB388408CA70FF18F07
    @Test
    void testConstructor() {
        assertThat(selector, is(notNullValue()));
    }

    //BaseRock generated method id: ${testExpressionGetterAndSetter}, hash: 212DBD4A641F5300275B8D5C529E2BDC
    @Test
    void testExpressionGetterAndSetter() {
        String testExpression = "device.driver == 'test-driver'";
        selector.setExpression(testExpression);
        assertThat(selector.getExpression(), is(equalTo(testExpression)));
    }

    //BaseRock generated method id: ${testSetValidExpressions}, hash: 1A680C275FA8AD7ED97403C2E17CC11F
    @ParameterizedTest
    @ValueSource(strings = { "device.attributes['dra.example.com'].model == 'XYZ'", "device.capacity['dra.example.com'].modules > 5" })
    void testSetValidExpressions(String expression) {
        selector.setExpression(expression);
        assertThat(selector.getExpression(), is(equalTo(expression)));
    }

    //BaseRock generated method id: ${testSetInvalidExpressions}, hash: 8323479C544EFEE5A6C29A65375C17D0
    @ParameterizedTest
    @NullAndEmptySource
    void testSetInvalidExpressions(String expression) {
        selector.setExpression(expression);
        assertThat(selector.getExpression(), is(equalTo(expression)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 22F8B433A4050C63152370ADE3DF66D1
    @Test
    void testEqualsAndHashCode() {
        V1beta1CELDeviceSelector selector1 = new V1beta1CELDeviceSelector().expression("test");
        V1beta1CELDeviceSelector selector2 = new V1beta1CELDeviceSelector().expression("test");
        V1beta1CELDeviceSelector selector3 = new V1beta1CELDeviceSelector().expression("different");
        assertThat(selector1.equals(selector2), is(true));
        assertThat(selector1.equals(selector3), is(false));
        assertThat(selector1.hashCode(), is(equalTo(selector2.hashCode())));
        assertThat(selector1.hashCode(), is(not(equalTo(selector3.hashCode()))));
    }

    //BaseRock generated method id: ${testToString}, hash: E7F5D3FE6B5BB96BB36AD2ED9FC1D940
    @Test
    void testToString() {
        String expression = "device.driver == 'test-driver'";
        selector.setExpression(expression);
        String expectedString = "class V1beta1CELDeviceSelector {\n    expression: " + expression + "\n}";
        assertThat(selector.toString(), is(equalTo(expectedString)));
    }
}
