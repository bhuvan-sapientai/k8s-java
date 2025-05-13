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
import io.kubernetes.client.openapi.models.V1alpha3CELDeviceSelector;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha3CELDeviceSelectorBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: BEB588A2D32B5A8CB0D2254BCBE1DFA1
    @Test
    void testConstructor() {
        V1alpha3CELDeviceSelector selector = new V1alpha3CELDeviceSelector();
        assertThat(selector, is(notNullValue()));
    }

    //BaseRock generated method id: ${testExpressionSetter}, hash: 79E2BF8F1A1973926A4F30BAC3866F97
    @Test
    void testExpressionSetter() {
        V1alpha3CELDeviceSelector selector = new V1alpha3CELDeviceSelector();
        selector.setExpression("device.driver == 'example'");
        assertThat(selector.getExpression(), is(equalTo("device.driver == 'example'")));
    }

    //BaseRock generated method id: ${testExpressionGetter}, hash: 5E955A4032841190BEF67E315CB462FE
    @Test
    void testExpressionGetter() {
        V1alpha3CELDeviceSelector selector = new V1alpha3CELDeviceSelector();
        selector.setExpression("device.attributes['example'].value > 10");
        assertThat(selector.getExpression(), is(equalTo("device.attributes['example'].value > 10")));
    }

    //BaseRock generated method id: ${testExpressionWithValidValues}, hash: EAA4CE50D67300A5AF4471B74608CFEA
    @ParameterizedTest
    @ValueSource(strings = { "device.driver == 'example'", "device.attributes['example'].value > 10", "device.capacity['example'].modules >= 5" })
    void testExpressionWithValidValues(String expression) {
        V1alpha3CELDeviceSelector selector = new V1alpha3CELDeviceSelector();
        selector.setExpression(expression);
        assertThat(selector.getExpression(), is(equalTo(expression)));
    }

    //BaseRock generated method id: ${testExpressionWithInvalidValues}, hash: 2D7C4200BC641C0FCC9452BDC3D87697
    @ParameterizedTest
    @NullAndEmptySource
    void testExpressionWithInvalidValues(String expression) {
        V1alpha3CELDeviceSelector selector = new V1alpha3CELDeviceSelector();
        selector.setExpression(expression);
        assertThat(selector.getExpression(), is(equalTo(expression)));
    }

    //BaseRock generated method id: ${testEquals}, hash: D2AF0F643577670FD33D90646F7F9000
    @Test
    void testEquals() {
        V1alpha3CELDeviceSelector selector1 = new V1alpha3CELDeviceSelector().expression("device.driver == 'example'");
        V1alpha3CELDeviceSelector selector2 = new V1alpha3CELDeviceSelector().expression("device.driver == 'example'");
        V1alpha3CELDeviceSelector selector3 = new V1alpha3CELDeviceSelector().expression("device.driver == 'different'");
        assertThat(selector1.equals(selector2), is(true));
        assertThat(selector1.equals(selector3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 9D111CA35093D4797EC669667B0A0AE5
    @Test
    void testHashCode() {
        V1alpha3CELDeviceSelector selector1 = new V1alpha3CELDeviceSelector().expression("device.driver == 'example'");
        V1alpha3CELDeviceSelector selector2 = new V1alpha3CELDeviceSelector().expression("device.driver == 'example'");
        assertThat(selector1.hashCode(), is(equalTo(selector2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: CB11BE191E49CBAF9F50397BEA575BBB
    @Test
    void testToString() {
        V1alpha3CELDeviceSelector selector = new V1alpha3CELDeviceSelector().expression("device.driver == 'example'");
        String expected = "class V1alpha3CELDeviceSelector {\n    expression: device.driver == 'example'\n}";
        assertThat(selector.toString(), is(equalTo(expected)));
    }
}
