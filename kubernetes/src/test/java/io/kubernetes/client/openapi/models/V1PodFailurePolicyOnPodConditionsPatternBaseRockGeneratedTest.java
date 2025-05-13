package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1PodFailurePolicyOnPodConditionsPattern;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PodFailurePolicyOnPodConditionsPatternBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: E8D4250057D210BD393E053678346DA0
    @Test
    void testConstructor() {
        V1PodFailurePolicyOnPodConditionsPattern pattern = new V1PodFailurePolicyOnPodConditionsPattern();
        assertThat(pattern, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetStatus}, hash: F77FA19EF23DD90A1DA6E88DED6148FE
    @Test
    void testSetAndGetStatus() {
        V1PodFailurePolicyOnPodConditionsPattern pattern = new V1PodFailurePolicyOnPodConditionsPattern();
        pattern.setStatus("True");
        assertThat(pattern.getStatus(), is(equalTo("True")));
    }

    //BaseRock generated method id: ${testSetAndGetStatusWithDifferentValues}, hash: 1FE8C7EDA2F4A3E30078B258EA7C94D4
    @ParameterizedTest
    @ValueSource(strings = { "True", "False", "Unknown" })
    void testSetAndGetStatusWithDifferentValues(String status) {
        V1PodFailurePolicyOnPodConditionsPattern pattern = new V1PodFailurePolicyOnPodConditionsPattern();
        pattern.setStatus(status);
        assertThat(pattern.getStatus(), is(equalTo(status)));
    }

    //BaseRock generated method id: ${testSetAndGetStatusWithNullAndEmptyValues}, hash: 7C0F47500D094DD779F074A8FE6FF47F
    @ParameterizedTest
    @NullAndEmptySource
    void testSetAndGetStatusWithNullAndEmptyValues(String status) {
        V1PodFailurePolicyOnPodConditionsPattern pattern = new V1PodFailurePolicyOnPodConditionsPattern();
        pattern.setStatus(status);
        assertThat(pattern.getStatus(), is(equalTo(status)));
    }

    //BaseRock generated method id: ${testSetAndGetType}, hash: E86D4C9C5556B22D94579C5EE836CB31
    @Test
    void testSetAndGetType() {
        V1PodFailurePolicyOnPodConditionsPattern pattern = new V1PodFailurePolicyOnPodConditionsPattern();
        pattern.setType("Ready");
        assertThat(pattern.getType(), is(equalTo("Ready")));
    }

    //BaseRock generated method id: ${testSetAndGetTypeWithDifferentValues}, hash: 4592A5261294C0DB66BF4A445B19FC68
    @ParameterizedTest
    @ValueSource(strings = { "Ready", "PodScheduled", "Initialized", "Unschedulable" })
    void testSetAndGetTypeWithDifferentValues(String type) {
        V1PodFailurePolicyOnPodConditionsPattern pattern = new V1PodFailurePolicyOnPodConditionsPattern();
        pattern.setType(type);
        assertThat(pattern.getType(), is(equalTo(type)));
    }

    //BaseRock generated method id: ${testSetAndGetTypeWithNullAndEmptyValues}, hash: DA08B4041ED0D4878BDA7CD9004D8CA4
    @ParameterizedTest
    @NullAndEmptySource
    void testSetAndGetTypeWithNullAndEmptyValues(String type) {
        V1PodFailurePolicyOnPodConditionsPattern pattern = new V1PodFailurePolicyOnPodConditionsPattern();
        pattern.setType(type);
        assertThat(pattern.getType(), is(equalTo(type)));
    }

    //BaseRock generated method id: ${testEquals}, hash: AF9A561AE8D169E8E9576FEC0C6342B2
    @Test
    void testEquals() {
        V1PodFailurePolicyOnPodConditionsPattern pattern1 = new V1PodFailurePolicyOnPodConditionsPattern().status("True").type("Ready");
        V1PodFailurePolicyOnPodConditionsPattern pattern2 = new V1PodFailurePolicyOnPodConditionsPattern().status("True").type("Ready");
        V1PodFailurePolicyOnPodConditionsPattern pattern3 = new V1PodFailurePolicyOnPodConditionsPattern().status("False").type("PodScheduled");
        assertThat(pattern1.equals(pattern2), is(true));
        assertThat(pattern1.equals(pattern3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: A750228F72972416489845750A40F26E
    @Test
    void testHashCode() {
        V1PodFailurePolicyOnPodConditionsPattern pattern1 = new V1PodFailurePolicyOnPodConditionsPattern().status("True").type("Ready");
        V1PodFailurePolicyOnPodConditionsPattern pattern2 = new V1PodFailurePolicyOnPodConditionsPattern().status("True").type("Ready");
        assertThat(pattern1.hashCode(), is(equalTo(pattern2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 9CB236C650B0D3F2A640E3456B2A0FE3
    @Test
    void testToString() {
        V1PodFailurePolicyOnPodConditionsPattern pattern = new V1PodFailurePolicyOnPodConditionsPattern().status("True").type("Ready");
        String expectedString = "class V1PodFailurePolicyOnPodConditionsPattern {\n    status: True\n    type: Ready\n}";
        assertThat(pattern.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 4B38E5A1E241D2C42A5658332D05DF56
    @Test
    void testBuilderPattern() {
        V1PodFailurePolicyOnPodConditionsPattern pattern = new V1PodFailurePolicyOnPodConditionsPattern().status("True").type("Ready");
        assertThat(pattern.getStatus(), is(equalTo("True")));
        assertThat(pattern.getType(), is(equalTo("Ready")));
    }
}
