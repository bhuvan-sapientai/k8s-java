package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.openapi.models.V2MetricValueStatus;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V2MetricIdentifier;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V2PodsMetricStatus;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V2PodsMetricStatusBaseRockGeneratedTest {

    private V2PodsMetricStatus v2PodsMetricStatus;

    @BeforeEach
    void setUp() {
        v2PodsMetricStatus = new V2PodsMetricStatus();
    }

    //BaseRock generated method id: ${testConstructor}, hash: EE7030F02A7066094C7C393A87BF73B0
    @Test
    void testConstructor() {
        assertThat(v2PodsMetricStatus, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetCurrent}, hash: 20CCC3655CE8044FA77A4A008E690922
    @Test
    void testSetAndGetCurrent() {
        V2MetricValueStatus current = mock(V2MetricValueStatus.class);
        v2PodsMetricStatus.setCurrent(current);
        assertThat(v2PodsMetricStatus.getCurrent(), is(equalTo(current)));
    }

    //BaseRock generated method id: ${testSetAndGetMetric}, hash: A3C7399083596D18FF39E760ABAED768
    @Test
    void testSetAndGetMetric() {
        V2MetricIdentifier metric = mock(V2MetricIdentifier.class);
        v2PodsMetricStatus.setMetric(metric);
        assertThat(v2PodsMetricStatus.getMetric(), is(equalTo(metric)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 7FEF6D1B538519A845A427FFB66615E1
    @Test
    void testEquals() {
        V2PodsMetricStatus other = new V2PodsMetricStatus();
        V2MetricValueStatus current = mock(V2MetricValueStatus.class);
        V2MetricIdentifier metric = mock(V2MetricIdentifier.class);
        v2PodsMetricStatus.setCurrent(current);
        v2PodsMetricStatus.setMetric(metric);
        other.setCurrent(current);
        other.setMetric(metric);
        assertThat(v2PodsMetricStatus.equals(other), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: FC9B4703D819C719FA6CF96832CDFAB2
    @Test
    void testHashCode() {
        V2MetricValueStatus current = mock(V2MetricValueStatus.class);
        V2MetricIdentifier metric = mock(V2MetricIdentifier.class);
        v2PodsMetricStatus.setCurrent(current);
        v2PodsMetricStatus.setMetric(metric);
        assertThat(v2PodsMetricStatus.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: A2EDA1871EF2295A115E13ABD8E9C858
    @Test
    void testToString() {
        V2MetricValueStatus current = mock(V2MetricValueStatus.class);
        V2MetricIdentifier metric = mock(V2MetricIdentifier.class);
        v2PodsMetricStatus.setCurrent(current);
        v2PodsMetricStatus.setMetric(metric);
        String result = v2PodsMetricStatus.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result.contains("current"), is(true));
        assertThat(result.contains("metric"), is(true));
    }

    //BaseRock generated method id: ${testSetCurrentWithNull}, hash: 253F0296AC34A4B3949397DFE395A6AC
    @Test
    void testSetCurrentWithNull() {
        v2PodsMetricStatus.setCurrent(null);
        assertThat(v2PodsMetricStatus.getCurrent(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetMetricWithNull}, hash: 0842780A7725E6F06261ECBA1C62F9A0
    @Test
    void testSetMetricWithNull() {
        v2PodsMetricStatus.setMetric(null);
        assertThat(v2PodsMetricStatus.getMetric(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: DE8E83A3FC803A20F24877293A7EB8BA
    @Test
    void testEqualsWithDifferentObject() {
        assertThat(v2PodsMetricStatus.equals("not a V2PodsMetricStatus"), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: EEFE44CF3E204BCAC752BEE8B3B9C986
    @Test
    void testEqualsWithNull() {
        assertThat(v2PodsMetricStatus.equals(null), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentCurrentAndMetric}, hash: 651CB952036A4F33CB9225B11462D052
    @Test
    void testEqualsWithDifferentCurrentAndMetric() {
        V2PodsMetricStatus other = new V2PodsMetricStatus();
        V2MetricValueStatus current1 = mock(V2MetricValueStatus.class);
        V2MetricValueStatus current2 = mock(V2MetricValueStatus.class);
        V2MetricIdentifier metric1 = mock(V2MetricIdentifier.class);
        V2MetricIdentifier metric2 = mock(V2MetricIdentifier.class);
        v2PodsMetricStatus.setCurrent(current1);
        v2PodsMetricStatus.setMetric(metric1);
        other.setCurrent(current2);
        other.setMetric(metric2);
        assertThat(v2PodsMetricStatus.equals(other), is(false));
    }
}
