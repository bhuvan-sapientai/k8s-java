package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V2HPAScalingPolicy;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V2HPAScalingPolicyBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 4960295454B0380078E36290C933D4F9
    @Test
    void testConstructor() {
        V2HPAScalingPolicy policy = new V2HPAScalingPolicy();
        assertThat(policy, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetPeriodSeconds}, hash: 09EA6C5F33D8F9F5562E910CEB7020C4
    @Test
    void testSetAndGetPeriodSeconds() {
        V2HPAScalingPolicy policy = new V2HPAScalingPolicy();
        policy.setPeriodSeconds(60);
        assertThat(policy.getPeriodSeconds(), is(equalTo(60)));
    }

    //BaseRock generated method id: ${testSetAndGetType}, hash: 13C53323FF2D8124F502A1804B17DEE2
    @Test
    void testSetAndGetType() {
        V2HPAScalingPolicy policy = new V2HPAScalingPolicy();
        policy.setType("Percent");
        assertThat(policy.getType(), is(equalTo("Percent")));
    }

    //BaseRock generated method id: ${testSetAndGetValue}, hash: 8F40E2CDE636F2D98486DDDF31B9E256
    @Test
    void testSetAndGetValue() {
        V2HPAScalingPolicy policy = new V2HPAScalingPolicy();
        policy.setValue(50);
        assertThat(policy.getValue(), is(equalTo(50)));
    }

    //BaseRock generated method id: ${testPeriodSecondsChaining}, hash: A9CD320E9B4544F91CA0542FF6A37516
    @Test
    void testPeriodSecondsChaining() {
        V2HPAScalingPolicy policy = new V2HPAScalingPolicy().periodSeconds(120);
        assertThat(policy.getPeriodSeconds(), is(equalTo(120)));
    }

    //BaseRock generated method id: ${testTypeChaining}, hash: C9AEAC4C1F779ABA0C68C0EEC1E6179C
    @Test
    void testTypeChaining() {
        V2HPAScalingPolicy policy = new V2HPAScalingPolicy().type("Absolute");
        assertThat(policy.getType(), is(equalTo("Absolute")));
    }

    //BaseRock generated method id: ${testValueChaining}, hash: 633F00C554DCFA69708BCEFBDD418E42
    @Test
    void testValueChaining() {
        V2HPAScalingPolicy policy = new V2HPAScalingPolicy().value(75);
        assertThat(policy.getValue(), is(equalTo(75)));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: C0B5B0086AEA46AE255155B2CD087247
    @Test
    void testEqualsWithSameObject() {
        V2HPAScalingPolicy policy = new V2HPAScalingPolicy().periodSeconds(60).type("Percent").value(50);
        assertThat(policy.equals(policy), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 205E0FC017A1D1B68828A7F613F032AB
    @Test
    void testEqualsWithDifferentObject() {
        V2HPAScalingPolicy policy1 = new V2HPAScalingPolicy().periodSeconds(60).type("Percent").value(50);
        V2HPAScalingPolicy policy2 = new V2HPAScalingPolicy().periodSeconds(60).type("Percent").value(50);
        assertThat(policy1.equals(policy2), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentValues}, hash: 7167276564BA5A1495602FD1C5AD9519
    @Test
    void testEqualsWithDifferentValues() {
        V2HPAScalingPolicy policy1 = new V2HPAScalingPolicy().periodSeconds(60).type("Percent").value(50);
        V2HPAScalingPolicy policy2 = new V2HPAScalingPolicy().periodSeconds(120).type("Absolute").value(75);
        assertThat(policy1.equals(policy2), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: EA738311E04C7F39A509FA5C51E69243
    @Test
    void testHashCode() {
        V2HPAScalingPolicy policy1 = new V2HPAScalingPolicy().periodSeconds(60).type("Percent").value(50);
        V2HPAScalingPolicy policy2 = new V2HPAScalingPolicy().periodSeconds(60).type("Percent").value(50);
        assertThat(policy1.hashCode(), is(equalTo(policy2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 5E2A0D4A23C36DFC192759551B64850C
    @Test
    void testToString() {
        V2HPAScalingPolicy policy = new V2HPAScalingPolicy().periodSeconds(60).type("Percent").value(50);
        String expectedString = "class V2HPAScalingPolicy {\n    periodSeconds: 60\n    type: Percent\n    value: 50\n}";
        assertThat(policy.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testValidPeriodSeconds}, hash: E97A906AF8C447AC3F9B4489D140AAC7
    @ParameterizedTest
    @ValueSource(ints = { 1, 900, 1800 })
    void testValidPeriodSeconds(int periodSeconds) {
        V2HPAScalingPolicy policy = new V2HPAScalingPolicy().periodSeconds(periodSeconds);
        assertThat(policy.getPeriodSeconds(), is(equalTo(periodSeconds)));
    }

    //BaseRock generated method id: ${testInvalidPeriodSeconds}, hash: 4B556DBC0FC543798DDB3414FCA76357
    @Test
    void testInvalidPeriodSeconds() {
        V2HPAScalingPolicy policy = new V2HPAScalingPolicy();
        policy.setPeriodSeconds(0);
        assertThat(policy.getPeriodSeconds(), is(equalTo(0)));
        policy.setPeriodSeconds(1801);
        assertThat(policy.getPeriodSeconds(), is(equalTo(1801)));
    }

    //BaseRock generated method id: ${testValidTypes}, hash: 73B1E3A29BAE4C4808DD727DCE81F9E5
    @ParameterizedTest
    @ValueSource(strings = { "Percent", "Absolute" })
    void testValidTypes(String type) {
        V2HPAScalingPolicy policy = new V2HPAScalingPolicy().type(type);
        assertThat(policy.getType(), is(equalTo(type)));
    }

    //BaseRock generated method id: ${testInvalidType}, hash: 04030FF0B4364A7C489683102DD92041
    @Test
    void testInvalidType() {
        V2HPAScalingPolicy policy = new V2HPAScalingPolicy();
        policy.setType("InvalidType");
        assertThat(policy.getType(), is(equalTo("InvalidType")));
    }

    //BaseRock generated method id: ${testValidValues}, hash: C5B1D49DCEA95342E40D2EE8EB6E94CE
    @ParameterizedTest
    @ValueSource(ints = { 1, 50, 100 })
    void testValidValues(int value) {
        V2HPAScalingPolicy policy = new V2HPAScalingPolicy().value(value);
        assertThat(policy.getValue(), is(equalTo(value)));
    }

    //BaseRock generated method id: ${testInvalidValue}, hash: EC5DF21A3AB334DCE507378FFC052D83
    @Test
    void testInvalidValue() {
        V2HPAScalingPolicy policy = new V2HPAScalingPolicy();
        policy.setValue(0);
        assertThat(policy.getValue(), is(equalTo(0)));
        policy.setValue(-1);
        assertThat(policy.getValue(), is(equalTo(-1)));
    }
}
