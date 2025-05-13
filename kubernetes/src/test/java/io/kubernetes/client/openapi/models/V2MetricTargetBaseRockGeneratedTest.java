package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.openapi.models.V2MetricTarget;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V2MetricTargetBaseRockGeneratedTest {

    private V2MetricTarget metricTarget;

    @BeforeEach
    void setUp() {
        metricTarget = new V2MetricTarget();
    }

    //BaseRock generated method id: ${testConstructor}, hash: AC54828DE62B15B2B6346703AF911A9B
    @Test
    void testConstructor() {
        assertThat(metricTarget, is(notNullValue()));
    }

    //BaseRock generated method id: ${testAverageUtilization}, hash: 4136DDBFCD659A9D2809DE5233E663C9
    @Test
    void testAverageUtilization() {
        Integer averageUtilization = 80;
        metricTarget.setAverageUtilization(averageUtilization);
        assertEquals(averageUtilization, metricTarget.getAverageUtilization());
    }

    //BaseRock generated method id: ${testAverageValue}, hash: 932191A65D9348777FA68A4C4F5DF878
    @Test
    void testAverageValue() {
        Quantity averageValue = mock(Quantity.class);
        metricTarget.setAverageValue(averageValue);
        assertEquals(averageValue, metricTarget.getAverageValue());
    }

    //BaseRock generated method id: ${testType}, hash: 74785F5D0E66777FECBF030085C409EA
    @Test
    void testType() {
        String type = "Utilization";
        metricTarget.setType(type);
        assertEquals(type, metricTarget.getType());
    }

    //BaseRock generated method id: ${testValue}, hash: F1C29560619A1FD9E30999745F50DF15
    @Test
    void testValue() {
        Quantity value = mock(Quantity.class);
        metricTarget.setValue(value);
        assertEquals(value, metricTarget.getValue());
    }

    //BaseRock generated method id: ${testEquals}, hash: DF4DD82565E39DCD5E3F0531E3B1D4F0
    @Test
    void testEquals() {
        V2MetricTarget other = new V2MetricTarget();
        other.setAverageUtilization(80);
        other.setAverageValue(mock(Quantity.class));
        other.setType("Utilization");
        other.setValue(mock(Quantity.class));
        metricTarget.setAverageUtilization(80);
        metricTarget.setAverageValue(other.getAverageValue());
        metricTarget.setType("Utilization");
        metricTarget.setValue(other.getValue());
        assertThat(metricTarget, is(equalTo(other)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: F1167994B5683A5E7E4AAFB1A9A52A76
    @Test
    void testHashCode() {
        V2MetricTarget other = new V2MetricTarget();
        other.setAverageUtilization(80);
        other.setAverageValue(mock(Quantity.class));
        other.setType("Utilization");
        other.setValue(mock(Quantity.class));
        metricTarget.setAverageUtilization(80);
        metricTarget.setAverageValue(other.getAverageValue());
        metricTarget.setType("Utilization");
        metricTarget.setValue(other.getValue());
        assertEquals(other.hashCode(), metricTarget.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 286F2E3DC2D2C50F31470C32FBF25FCE
    @Test
    void testToString() {
        metricTarget.setAverageUtilization(80);
        Quantity mockQuantity = mock(Quantity.class);
        when(mockQuantity.toString()).thenReturn("1Gi");
        metricTarget.setAverageValue(mockQuantity);
        metricTarget.setType("Utilization");
        metricTarget.setValue(mockQuantity);
        String expected = "class V2MetricTarget {\n    averageUtilization: 80\n    averageValue: 1Gi\n    type: Utilization\n    value: 1Gi\n}";
        assertEquals(expected, metricTarget.toString());
    }

    //BaseRock generated method id: ${testAverageUtilizationRange}, hash: FF904430B4A9012046BAB1ACEDEFEB75
    @ParameterizedTest
    @ValueSource(ints = { 0, 50, 100 })
    void testAverageUtilizationRange(int averageUtilization) {
        metricTarget.setAverageUtilization(averageUtilization);
        assertEquals(averageUtilization, metricTarget.getAverageUtilization());
    }

    //BaseRock generated method id: ${testNullValues}, hash: 0F9C721FB8135599FB33FC0C09C78FD7
    @Test
    void testNullValues() {
        assertNull(metricTarget.getAverageUtilization());
        assertNull(metricTarget.getAverageValue());
        assertNull(metricTarget.getValue());
    }
}
