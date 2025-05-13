package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V2ContainerResourceMetricStatusBaseRockGeneratedTest {

    private V2ContainerResourceMetricStatus v2ContainerResourceMetricStatus;

    @BeforeEach
    void setUp() {
        v2ContainerResourceMetricStatus = new V2ContainerResourceMetricStatus();
    }

    //BaseRock generated method id: ${testConstructor}, hash: C63827FBD0AEEA0DC6651132DF4E4D31
    @Test
    void testConstructor() {
        assertThat(v2ContainerResourceMetricStatus, is(notNullValue()));
    }

    //BaseRock generated method id: ${testGetSetContainer}, hash: 5AFF4D659C217E99548543B3FC252548
    @Test
    void testGetSetContainer() {
        String container = "testContainer";
        v2ContainerResourceMetricStatus.setContainer(container);
        assertEquals(container, v2ContainerResourceMetricStatus.getContainer());
    }

    //BaseRock generated method id: ${testSetContainerWithDifferentValues}, hash: 0E9E81F2F360DF2729B15283CDED53E0
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "container1", "container2" })
    void testSetContainerWithDifferentValues(String container) {
        v2ContainerResourceMetricStatus.setContainer(container);
        assertEquals(container, v2ContainerResourceMetricStatus.getContainer());
    }

    //BaseRock generated method id: ${testGetSetCurrent}, hash: 32F0207F24980C3985E0D343D6DB8C7B
    @Test
    void testGetSetCurrent() {
        V2MetricValueStatus current = mock(V2MetricValueStatus.class);
        v2ContainerResourceMetricStatus.setCurrent(current);
        assertEquals(current, v2ContainerResourceMetricStatus.getCurrent());
    }

    //BaseRock generated method id: ${testGetSetName}, hash: C6F55317B52290BC36372D241FC22A2C
    @Test
    void testGetSetName() {
        String name = "testName";
        v2ContainerResourceMetricStatus.setName(name);
        assertEquals(name, v2ContainerResourceMetricStatus.getName());
    }

    //BaseRock generated method id: ${testSetNameWithDifferentValues}, hash: 12013BEA62C55BE3FB28C63DEFCD260C
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "name1", "name2" })
    void testSetNameWithDifferentValues(String name) {
        v2ContainerResourceMetricStatus.setName(name);
        assertEquals(name, v2ContainerResourceMetricStatus.getName());
    }

    //BaseRock generated method id: ${testEquals}, hash: BE2E67217EDECDBF45E9856E66DD8334
    @Test
    void testEquals() {
        V2ContainerResourceMetricStatus status1 = new V2ContainerResourceMetricStatus().container("container1").current(new V2MetricValueStatus()).name("name1");
        V2ContainerResourceMetricStatus status2 = new V2ContainerResourceMetricStatus().container("container1").current(new V2MetricValueStatus()).name("name1");
        V2ContainerResourceMetricStatus status3 = new V2ContainerResourceMetricStatus().container("container2").current(new V2MetricValueStatus()).name("name2");
        assertThat(status1.equals(status2), is(true));
        assertThat(status1.equals(status3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: AA1D8C571F5C7692EEF4B4DA94140B98
    @Test
    void testHashCode() {
        V2ContainerResourceMetricStatus status1 = new V2ContainerResourceMetricStatus().container("container1").current(new V2MetricValueStatus()).name("name1");
        V2ContainerResourceMetricStatus status2 = new V2ContainerResourceMetricStatus().container("container1").current(new V2MetricValueStatus()).name("name1");
        assertThat(status1.hashCode(), equalTo(status2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: F42E1F25C0D87DD4E05FA5C10364C970
    @Test
    void testToString() {
        V2ContainerResourceMetricStatus status = new V2ContainerResourceMetricStatus().container("testContainer").current(new V2MetricValueStatus()).name("testName");
        String expectedString = "class V2ContainerResourceMetricStatus {\n" + "    container: testContainer\n" + "    current: class V2MetricValueStatus {\n" + "        averageUtilization: null\n" + "        averageValue: null\n" + "        value: null\n" + "    }\n" + "    name: testName\n" + "}";
        assertEquals(expectedString, status.toString());
    }

    //BaseRock generated method id: ${testSetNullContainer}, hash: F44FBA65EF9661F477B063217715D3D4
    @Test
    void testSetNullContainer() {
        v2ContainerResourceMetricStatus.setContainer(null);
        assertEquals(null, v2ContainerResourceMetricStatus.getContainer());
    }

    //BaseRock generated method id: ${testSetNullCurrent}, hash: 00298221DE087E83F55C90D1ACF2C03A
    @Test
    void testSetNullCurrent() {
        v2ContainerResourceMetricStatus.setCurrent(null);
        assertEquals(null, v2ContainerResourceMetricStatus.getCurrent());
    }

    //BaseRock generated method id: ${testSetNullName}, hash: C70DF13A79FCDECDB9A9B713ED49AF51
    @Test
    void testSetNullName() {
        v2ContainerResourceMetricStatus.setName(null);
        assertEquals(null, v2ContainerResourceMetricStatus.getName());
    }
}
