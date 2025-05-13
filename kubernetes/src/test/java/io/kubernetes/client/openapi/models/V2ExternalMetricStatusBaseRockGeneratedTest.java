package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.openapi.models.V2MetricValueStatus;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V2MetricIdentifier;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.V2ExternalMetricStatus;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V2ExternalMetricStatusBaseRockGeneratedTest {

    private V2ExternalMetricStatus v2ExternalMetricStatus;

    private V2MetricValueStatus mockCurrent;

    private V2MetricIdentifier mockMetric;

    @BeforeEach
    void setUp() {
        mockCurrent = mock(V2MetricValueStatus.class);
        mockMetric = mock(V2MetricIdentifier.class);
        v2ExternalMetricStatus = new V2ExternalMetricStatus().current(mockCurrent).metric(mockMetric);
    }

    //BaseRock generated method id: ${testConstructor}, hash: A34397BC7AF8EBDF4E5FD4178F54612E
    @Test
    void testConstructor() {
        assertThat(v2ExternalMetricStatus, is(notNullValue()));
    }

    //BaseRock generated method id: ${testGetCurrent}, hash: 10E4C0BBDA6E5B639A7E141476D6BCF4
    @Test
    void testGetCurrent() {
        assertEquals(mockCurrent, v2ExternalMetricStatus.getCurrent());
    }

    //BaseRock generated method id: ${testSetCurrent}, hash: E0E05FCE3DD5A2569F797C689AE3AD9C
    @Test
    void testSetCurrent() {
        V2MetricValueStatus newCurrent = mock(V2MetricValueStatus.class);
        v2ExternalMetricStatus.setCurrent(newCurrent);
        assertEquals(newCurrent, v2ExternalMetricStatus.getCurrent());
    }

    //BaseRock generated method id: ${testGetMetric}, hash: 9E5A30E407B5FF75A7732C2BAA09F1FA
    @Test
    void testGetMetric() {
        assertEquals(mockMetric, v2ExternalMetricStatus.getMetric());
    }

    //BaseRock generated method id: ${testSetMetric}, hash: 705787103D2BEB146E325E86A8223569
    @Test
    void testSetMetric() {
        V2MetricIdentifier newMetric = mock(V2MetricIdentifier.class);
        v2ExternalMetricStatus.setMetric(newMetric);
        assertEquals(newMetric, v2ExternalMetricStatus.getMetric());
    }

    //BaseRock generated method id: ${testEquals}, hash: 7487A4D3996F18EB6FD97B57787EC474
    @Test
    void testEquals() {
        V2ExternalMetricStatus sameStatus = new V2ExternalMetricStatus().current(mockCurrent).metric(mockMetric);
        assertEquals(v2ExternalMetricStatus, sameStatus);
        V2ExternalMetricStatus differentStatus = new V2ExternalMetricStatus().current(mock(V2MetricValueStatus.class)).metric(mock(V2MetricIdentifier.class));
        assertThat(v2ExternalMetricStatus.equals(differentStatus), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 5BD2BFD31D14338DA62E08D4608414D6
    @Test
    void testHashCode() {
        V2ExternalMetricStatus sameStatus = new V2ExternalMetricStatus().current(mockCurrent).metric(mockMetric);
        assertEquals(v2ExternalMetricStatus.hashCode(), sameStatus.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: E75E7ACFC7B93C1DE5314BAE8D453B06
    @Test
    void testToString() {
        String expectedString = "class V2ExternalMetricStatus {\n    current: " + mockCurrent + "\n    metric: " + mockMetric + "\n}";
        assertEquals(expectedString, v2ExternalMetricStatus.toString());
    }

    //BaseRock generated method id: ${testSetNullCurrent}, hash: DB44708F470E4FCA417A7F27533B1AA5
    @Test
    void testSetNullCurrent() {
        v2ExternalMetricStatus.setCurrent(null);
        assertEquals(null, v2ExternalMetricStatus.getCurrent());
    }

    //BaseRock generated method id: ${testSetNullMetric}, hash: 1819E142611163B951DE8B806F1C6A52
    @Test
    void testSetNullMetric() {
        v2ExternalMetricStatus.setMetric(null);
        assertEquals(null, v2ExternalMetricStatus.getMetric());
    }
}
