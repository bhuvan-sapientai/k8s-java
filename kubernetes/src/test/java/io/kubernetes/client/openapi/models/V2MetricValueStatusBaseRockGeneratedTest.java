package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V2MetricValueStatus;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.custom.Quantity;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V2MetricValueStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 40C6B76A1E8780A1AFB5E95854BD017E
    @Test
    void testConstructor() {
        V2MetricValueStatus metricValueStatus = new V2MetricValueStatus();
        assertNotNull(metricValueStatus);
    }

    //BaseRock generated method id: ${testSetAndGetAverageUtilization}, hash: BAC305F70CD9312E585C9E7AEAEFA0DB
    @Test
    void testSetAndGetAverageUtilization() {
        V2MetricValueStatus metricValueStatus = new V2MetricValueStatus();
        Integer averageUtilization = 75;
        metricValueStatus.setAverageUtilization(averageUtilization);
        assertEquals(averageUtilization, metricValueStatus.getAverageUtilization());
    }

    //BaseRock generated method id: ${testSetAndGetAverageValue}, hash: F6B91AC35CEB5F654C8288284B77190E
    @Test
    void testSetAndGetAverageValue() {
        V2MetricValueStatus metricValueStatus = new V2MetricValueStatus();
        Quantity averageValue = new Quantity("10");
        metricValueStatus.setAverageValue(averageValue);
        assertEquals(averageValue, metricValueStatus.getAverageValue());
    }

    //BaseRock generated method id: ${testSetAndGetValue}, hash: CB3044BD1D2C225650E57941724F3A8A
    @Test
    void testSetAndGetValue() {
        V2MetricValueStatus metricValueStatus = new V2MetricValueStatus();
        Quantity value = new Quantity("20");
        metricValueStatus.setValue(value);
        assertEquals(value, metricValueStatus.getValue());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: B8BC7784FE50D817FC2884E022274B77
    @Test
    void testEqualsWithSameObject() {
        V2MetricValueStatus metricValueStatus = new V2MetricValueStatus();
        assertThat(metricValueStatus.equals(metricValueStatus), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 4306BCD424246BE6D0488D06469C9F2C
    @Test
    void testEqualsWithDifferentObject() {
        V2MetricValueStatus metricValueStatus1 = new V2MetricValueStatus().averageUtilization(50).averageValue(new Quantity("10")).value(new Quantity("20"));
        V2MetricValueStatus metricValueStatus2 = new V2MetricValueStatus().averageUtilization(50).averageValue(new Quantity("10")).value(new Quantity("20"));
        assertThat(metricValueStatus1.equals(metricValueStatus2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 09F99AF1798F8B62B59495F22ECA3FD2
    @Test
    void testHashCode() {
        V2MetricValueStatus metricValueStatus1 = new V2MetricValueStatus().averageUtilization(50).averageValue(new Quantity("10")).value(new Quantity("20"));
        V2MetricValueStatus metricValueStatus2 = new V2MetricValueStatus().averageUtilization(50).averageValue(new Quantity("10")).value(new Quantity("20"));
        assertThat(metricValueStatus1.hashCode(), equalTo(metricValueStatus2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: A8DD100D438BC27D7114414AF3A9BA64
    @Test
    void testToString() {
        V2MetricValueStatus metricValueStatus = new V2MetricValueStatus().averageUtilization(50).averageValue(new Quantity("10")).value(new Quantity("20"));
        String expectedString = "class V2MetricValueStatus {\n" + "    averageUtilization: 50\n" + "    averageValue: Quantity{number=10, format=DECIMAL_SI}\n" + "    value: Quantity{number=20, format=DECIMAL_SI}\n" + "}";
        assertThat(metricValueStatus.toString(), equalTo(expectedString));
    }

    //BaseRock generated method id: ${testBuilder}, hash: C60906C83DD9F0ACC28C56B79C8D7597
    @Test
    void testBuilder() {
        V2MetricValueStatus metricValueStatus = new V2MetricValueStatus().averageUtilization(75).averageValue(new Quantity("15")).value(new Quantity("30"));
        assertThat(metricValueStatus.getAverageUtilization(), equalTo(75));
        assertThat(metricValueStatus.getAverageValue(), equalTo(new Quantity("15")));
        assertThat(metricValueStatus.getValue(), equalTo(new Quantity("30")));
    }

    //BaseRock generated method id: ${testNullValues}, hash: 0BF970E8D0AD462AC210465B47A09F88
    @Test
    void testNullValues() {
        V2MetricValueStatus metricValueStatus = new V2MetricValueStatus();
        assertNull(metricValueStatus.getAverageUtilization());
        assertNull(metricValueStatus.getAverageValue());
        assertNull(metricValueStatus.getValue());
    }
}
