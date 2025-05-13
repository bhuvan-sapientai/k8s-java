package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
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
import io.kubernetes.client.openapi.models.V2ExternalMetricSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V2ExternalMetricSourceBaseRockGeneratedTest {

    private V2ExternalMetricSource v2ExternalMetricSource;

    private V2MetricIdentifier mockMetric;

    private V2MetricTarget mockTarget;

    @BeforeEach
    void setUp() {
        mockMetric = mock(V2MetricIdentifier.class);
        mockTarget = mock(V2MetricTarget.class);
        v2ExternalMetricSource = new V2ExternalMetricSource();
    }

    //BaseRock generated method id: ${testGetMetric}, hash: 097D36BF13ED9B1A0E8ED9E4072F4F1F
    @Test
    void testGetMetric() {
        v2ExternalMetricSource.setMetric(mockMetric);
        assertThat(v2ExternalMetricSource.getMetric(), is(equalTo(mockMetric)));
    }

    //BaseRock generated method id: ${testSetMetric}, hash: EF1FC1AB9F5694A559CDF83426EF1ED3
    @Test
    void testSetMetric() {
        v2ExternalMetricSource.setMetric(mockMetric);
        assertThat(v2ExternalMetricSource.getMetric(), is(equalTo(mockMetric)));
    }

    //BaseRock generated method id: ${testGetTarget}, hash: A11FA1622ADECF7ED871C0341F58192C
    @Test
    void testGetTarget() {
        v2ExternalMetricSource.setTarget(mockTarget);
        assertThat(v2ExternalMetricSource.getTarget(), is(equalTo(mockTarget)));
    }

    //BaseRock generated method id: ${testSetTarget}, hash: 28A0AEEC52ADFEEB9031D3000550CEB3
    @Test
    void testSetTarget() {
        v2ExternalMetricSource.setTarget(mockTarget);
        assertThat(v2ExternalMetricSource.getTarget(), is(equalTo(mockTarget)));
    }

    //BaseRock generated method id: ${testEquals}, hash: DEA29A8B76CA61064DA4DD36A00F45AC
    @Test
    void testEquals() {
        V2ExternalMetricSource other = new V2ExternalMetricSource();
        other.setMetric(mockMetric);
        other.setTarget(mockTarget);
        v2ExternalMetricSource.setMetric(mockMetric);
        v2ExternalMetricSource.setTarget(mockTarget);
        assertThat(v2ExternalMetricSource.equals(other), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: B877A2B0498DD0F47D5A0AF3DF87CDA9
    @Test
    void testHashCode() {
        v2ExternalMetricSource.setMetric(mockMetric);
        v2ExternalMetricSource.setTarget(mockTarget);
        int expectedHashCode = v2ExternalMetricSource.hashCode();
        assertThat(v2ExternalMetricSource.hashCode(), is(equalTo(expectedHashCode)));
    }

    //BaseRock generated method id: ${testToString}, hash: 1C870541910938BC54793AE2E548EC6C
    @Test
    void testToString() {
        v2ExternalMetricSource.setMetric(mockMetric);
        v2ExternalMetricSource.setTarget(mockTarget);
        when(mockMetric.toString()).thenReturn("MockMetric");
        when(mockTarget.toString()).thenReturn("MockTarget");
        String expectedString = "class V2ExternalMetricSource {\n    metric: MockMetric\n    target: MockTarget\n}";
        assertThat(v2ExternalMetricSource.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testConstructor}, hash: 0C5A1B73514BCF3EB9EA52D06BF2CB18
    @Test
    void testConstructor() {
        assertThat(v2ExternalMetricSource, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetNullMetric}, hash: 35631C5A8950162B5F6E231854646544
    @Test
    void testSetNullMetric() {
        v2ExternalMetricSource.setMetric(null);
        assertThat(v2ExternalMetricSource.getMetric(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetNullTarget}, hash: 7D4FB327174CA4C45F09C90976BEA00A
    @Test
    void testSetNullTarget() {
        v2ExternalMetricSource.setTarget(null);
        assertThat(v2ExternalMetricSource.getTarget(), is(equalTo(null)));
    }
}
