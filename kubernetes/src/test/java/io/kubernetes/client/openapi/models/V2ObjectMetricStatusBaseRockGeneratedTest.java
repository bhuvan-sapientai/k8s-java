package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.openapi.models.V2MetricValueStatus;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V2MetricIdentifier;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import io.kubernetes.client.openapi.models.V2CrossVersionObjectReference;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V2ObjectMetricStatusBaseRockGeneratedTest {

    private V2ObjectMetricStatus v2ObjectMetricStatus;

    @BeforeEach
    void setUp() {
        v2ObjectMetricStatus = new V2ObjectMetricStatus();
    }

    //BaseRock generated method id: ${testConstructor}, hash: BDF2CDF6AD701834E7E075E332E3E8CC
    @Test
    void testConstructor() {
        assertThat(v2ObjectMetricStatus, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetCurrent}, hash: 6FF987E0F6E00AECB702A0E2C603D06B
    @Test
    void testSetAndGetCurrent() {
        V2MetricValueStatus current = mock(V2MetricValueStatus.class);
        v2ObjectMetricStatus.setCurrent(current);
        assertThat(v2ObjectMetricStatus.getCurrent(), is(equalTo(current)));
    }

    //BaseRock generated method id: ${testSetAndGetDescribedObject}, hash: 07D4AC293F46A884D5DB56A797F1D753
    @Test
    void testSetAndGetDescribedObject() {
        V2CrossVersionObjectReference describedObject = mock(V2CrossVersionObjectReference.class);
        v2ObjectMetricStatus.setDescribedObject(describedObject);
        assertThat(v2ObjectMetricStatus.getDescribedObject(), is(equalTo(describedObject)));
    }

    //BaseRock generated method id: ${testSetAndGetMetric}, hash: 079AA48C8DCF95AE6AEDD9DC914616EE
    @Test
    void testSetAndGetMetric() {
        V2MetricIdentifier metric = mock(V2MetricIdentifier.class);
        v2ObjectMetricStatus.setMetric(metric);
        assertThat(v2ObjectMetricStatus.getMetric(), is(equalTo(metric)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 491EEBDC7B2905FE0D2C7AE528EF9C33
    @Test
    void testEquals() {
        V2ObjectMetricStatus status1 = new V2ObjectMetricStatus().current(mock(V2MetricValueStatus.class)).describedObject(mock(V2CrossVersionObjectReference.class)).metric(mock(V2MetricIdentifier.class));
        V2ObjectMetricStatus status2 = new V2ObjectMetricStatus().current(status1.getCurrent()).describedObject(status1.getDescribedObject()).metric(status1.getMetric());
        assertThat(status1, is(equalTo(status2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: E9A49E936CB0BBDF511DD6139FD6744A
    @Test
    void testHashCode() {
        V2ObjectMetricStatus status1 = new V2ObjectMetricStatus().current(mock(V2MetricValueStatus.class)).describedObject(mock(V2CrossVersionObjectReference.class)).metric(mock(V2MetricIdentifier.class));
        V2ObjectMetricStatus status2 = new V2ObjectMetricStatus().current(status1.getCurrent()).describedObject(status1.getDescribedObject()).metric(status1.getMetric());
        assertThat(status1.hashCode(), is(equalTo(status2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 6220EAF7A20641C0BAD08A03F1618BFC
    @Test
    void testToString() {
        V2MetricValueStatus current = mock(V2MetricValueStatus.class);
        V2CrossVersionObjectReference describedObject = mock(V2CrossVersionObjectReference.class);
        V2MetricIdentifier metric = mock(V2MetricIdentifier.class);
        when(current.toString()).thenReturn("Current");
        when(describedObject.toString()).thenReturn("DescribedObject");
        when(metric.toString()).thenReturn("Metric");
        v2ObjectMetricStatus.setCurrent(current);
        v2ObjectMetricStatus.setDescribedObject(describedObject);
        v2ObjectMetricStatus.setMetric(metric);
        String expected = "class V2ObjectMetricStatus {\n    current: Current\n    describedObject: DescribedObject\n    metric: Metric\n}";
        assertThat(v2ObjectMetricStatus.toString(), is(equalTo(expected)));
    }

    //BaseRock generated method id: ${testSetNullCurrent}, hash: 98CC1FC3EA1F29F9F4550EBED71812C5
    @Test
    void testSetNullCurrent() {
        assertDoesNotThrow(() -> v2ObjectMetricStatus.setCurrent(null));
    }

    //BaseRock generated method id: ${testSetNullDescribedObject}, hash: E9731FE602BB60DF2EC3FEC366A4B6B0
    @Test
    void testSetNullDescribedObject() {
        assertDoesNotThrow(() -> v2ObjectMetricStatus.setDescribedObject(null));
    }

    //BaseRock generated method id: ${testSetNullMetric}, hash: AAE6FE8F95B97C57BC6C2E1583543185
    @Test
    void testSetNullMetric() {
        assertDoesNotThrow(() -> v2ObjectMetricStatus.setMetric(null));
    }
}
