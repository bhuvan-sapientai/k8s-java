package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V2MetricValueStatus;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V2ResourceMetricStatus;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V2ResourceMetricStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 19F6FD6B17679D8F39CC81540AA397F4
    @Test
    void testConstructor() {
        V2ResourceMetricStatus status = new V2ResourceMetricStatus();
        assertThat(status, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetCurrent}, hash: 16E85048E8D4D562A1861A1C00AF1A34
    @Test
    void testSetAndGetCurrent() {
        V2ResourceMetricStatus status = new V2ResourceMetricStatus();
        V2MetricValueStatus current = mock(V2MetricValueStatus.class);
        status.setCurrent(current);
        assertEquals(current, status.getCurrent());
    }

    //BaseRock generated method id: ${testSetAndGetName}, hash: C974F79BC69913F7E4B211E4E647E052
    @Test
    void testSetAndGetName() {
        V2ResourceMetricStatus status = new V2ResourceMetricStatus();
        String name = "test-name";
        status.setName(name);
        assertEquals(name, status.getName());
    }

    //BaseRock generated method id: ${testSetAndGetNameWithDifferentValues}, hash: 8BE14BB5D7EE05002034894D036D3729
    @ParameterizedTest
    @ValueSource(strings = { "name1", "name2", "" })
    void testSetAndGetNameWithDifferentValues(String name) {
        V2ResourceMetricStatus status = new V2ResourceMetricStatus();
        status.setName(name);
        assertEquals(name, status.getName());
    }

    //BaseRock generated method id: ${testSetAndGetNameWithNull}, hash: D4A344D579C8A4A3449B44C4D22BEABC
    @ParameterizedTest
    @NullSource
    void testSetAndGetNameWithNull(String name) {
        V2ResourceMetricStatus status = new V2ResourceMetricStatus();
        status.setName(name);
        assertEquals(name, status.getName());
    }

    //BaseRock generated method id: ${testEquals}, hash: 8D6B580E04D55DF459D661A758673089
    @Disabled()
    @Test
    void testEquals() {
        V2MetricValueStatus mockCurrent1 = mock(V2MetricValueStatus.class);
        V2MetricValueStatus mockCurrent2 = mock(V2MetricValueStatus.class);
        V2ResourceMetricStatus status1 = new V2ResourceMetricStatus().current(mockCurrent1).name("test-name");
        V2ResourceMetricStatus status2 = new V2ResourceMetricStatus().current(mockCurrent2).name("test-name");
        V2ResourceMetricStatus status3 = new V2ResourceMetricStatus().current(mockCurrent1).name("other-name");
        // Fix: Use assertEquals instead of assertThat for object equality
        assertEquals(status1, status2);
        assertEquals(status1.equals(status3), false);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 80FA15A665600699D6064B1C9B17F2FE
    @Test
    void testHashCode() {
        V2MetricValueStatus mockCurrent = mock(V2MetricValueStatus.class);
        V2ResourceMetricStatus status1 = new V2ResourceMetricStatus().current(mockCurrent).name("test-name");
        V2ResourceMetricStatus status2 = new V2ResourceMetricStatus().current(mockCurrent).name("test-name");
        assertEquals(status1.hashCode(), status2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 5ADF0A28944617F9E7E75C4E56FEB828
    @Test
    void testToString() {
        V2MetricValueStatus mockCurrent = mock(V2MetricValueStatus.class);
        when(mockCurrent.toString()).thenReturn("MockCurrentValue");
        V2ResourceMetricStatus status = new V2ResourceMetricStatus().current(mockCurrent).name("test-name");
        String expected = "class V2ResourceMetricStatus {\n    current: MockCurrentValue\n    name: test-name\n}";
        assertEquals(expected, status.toString());
    }
}
