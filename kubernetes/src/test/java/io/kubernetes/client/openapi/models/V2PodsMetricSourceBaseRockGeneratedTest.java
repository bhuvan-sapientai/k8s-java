package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.openapi.models.V2PodsMetricSource;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V2MetricIdentifier;
import io.kubernetes.client.openapi.models.V2MetricTarget;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V2PodsMetricSourceBaseRockGeneratedTest {

    private V2PodsMetricSource v2PodsMetricSource;

    private V2MetricIdentifier mockMetric;

    private V2MetricTarget mockTarget;

    @BeforeEach
    void setUp() {
        mockMetric = mock(V2MetricIdentifier.class);
        mockTarget = mock(V2MetricTarget.class);
        v2PodsMetricSource = new V2PodsMetricSource();
    }

    //BaseRock generated method id: ${testSetAndGetMetric}, hash: BC1FED9D23533474E2EBFFA6959CEA32
    @Test
    void testSetAndGetMetric() {
        v2PodsMetricSource.setMetric(mockMetric);
        assertThat(v2PodsMetricSource.getMetric(), is(equalTo(mockMetric)));
    }

    //BaseRock generated method id: ${testSetAndGetTarget}, hash: 32C7EADBA6CB11A7A91F801D9C9A0FAD
    @Test
    void testSetAndGetTarget() {
        v2PodsMetricSource.setTarget(mockTarget);
        assertThat(v2PodsMetricSource.getTarget(), is(equalTo(mockTarget)));
    }

    //BaseRock generated method id: ${testEquals}, hash: DDC1D3E6DE5F258CB0722219AF444463
    @Test
    void testEquals() {
        V2PodsMetricSource other = new V2PodsMetricSource();
        other.setMetric(mockMetric);
        other.setTarget(mockTarget);
        v2PodsMetricSource.setMetric(mockMetric);
        v2PodsMetricSource.setTarget(mockTarget);
        assertThat(v2PodsMetricSource, is(equalTo(other)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 108B33509BAFD28434444680FC3A819C
    @Test
    void testHashCode() {
        v2PodsMetricSource.setMetric(mockMetric);
        v2PodsMetricSource.setTarget(mockTarget);
        V2PodsMetricSource other = new V2PodsMetricSource();
        other.setMetric(mockMetric);
        other.setTarget(mockTarget);
        assertThat(v2PodsMetricSource.hashCode(), is(equalTo(other.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 43A299D793635FA70A85922F2FFD766D
    @Test
    void testToString() {
        v2PodsMetricSource.setMetric(mockMetric);
        v2PodsMetricSource.setTarget(mockTarget);
        when(mockMetric.toString()).thenReturn("MockMetric");
        when(mockTarget.toString()).thenReturn("MockTarget");
        String expected = "class V2PodsMetricSource {\n    metric: MockMetric\n    target: MockTarget\n}";
        assertThat(v2PodsMetricSource.toString(), is(equalTo(expected)));
    }

    //BaseRock generated method id: ${testConstructor}, hash: 66180E320A45B6E29D4C3476B9A4749F
    @Test
    void testConstructor() {
        assertThat(v2PodsMetricSource, is(notNullValue()));
    }

    //BaseRock generated method id: ${testMetricWithNullValue}, hash: D09AFE443693C5B7BAD854FB95871F24
    @Test
    void testMetricWithNullValue() {
        assertThat(v2PodsMetricSource.metric(null), is(notNullValue()));
    }

    //BaseRock generated method id: ${testTargetWithNullValue}, hash: D6AF0E3AF99CDDA7C6C2C02B46B382B0
    @Test
    void testTargetWithNullValue() {
        assertThat(v2PodsMetricSource.target(null), is(notNullValue()));
    }
}
