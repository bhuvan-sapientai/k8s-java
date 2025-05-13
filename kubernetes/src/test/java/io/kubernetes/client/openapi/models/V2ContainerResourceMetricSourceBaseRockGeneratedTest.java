package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V2ContainerResourceMetricSource;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.not;
import io.kubernetes.client.openapi.models.V2MetricTarget;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V2ContainerResourceMetricSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: E9F34E9F952EA20362780830FD85E3C4
    @Test
    void testConstructor() {
        V2ContainerResourceMetricSource metricSource = new V2ContainerResourceMetricSource();
        assertThat(metricSource, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetContainer}, hash: E94922FCEBBAC3523D8B8388D75F3CB5
    @Test
    void testSetAndGetContainer() {
        V2ContainerResourceMetricSource metricSource = new V2ContainerResourceMetricSource();
        String container = "test-container";
        metricSource.setContainer(container);
        assertThat(metricSource.getContainer(), is(equalTo(container)));
    }

    //BaseRock generated method id: ${testSetAndGetName}, hash: AA69A19246DAA968F573048CBF323B6D
    @Test
    void testSetAndGetName() {
        V2ContainerResourceMetricSource metricSource = new V2ContainerResourceMetricSource();
        String name = "test-name";
        metricSource.setName(name);
        assertThat(metricSource.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testSetAndGetTarget}, hash: 3103DCDE5D4DCC075DDC3C035FDB15AB
    @Test
    void testSetAndGetTarget() {
        V2ContainerResourceMetricSource metricSource = new V2ContainerResourceMetricSource();
        V2MetricTarget target = mock(V2MetricTarget.class);
        metricSource.setTarget(target);
        assertThat(metricSource.getTarget(), is(equalTo(target)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 821B7E3E94C1172FF883B6CF0949509C
    @Test
    void testEquals() {
        V2MetricTarget target1 = mock(V2MetricTarget.class);
        V2MetricTarget target2 = mock(V2MetricTarget.class);
        V2ContainerResourceMetricSource metricSource1 = new V2ContainerResourceMetricSource().container("container1").name("name1").target(target1);
        V2ContainerResourceMetricSource metricSource2 = new V2ContainerResourceMetricSource().container("container1").name("name1").target(target2);
        assertThat(metricSource1, is(not(equalTo(metricSource2))));
    }

    //BaseRock generated method id: ${testHashCode}, hash: A9162008A0E604247514464EBEB8344F
    @Test
    void testHashCode() {
        V2ContainerResourceMetricSource metricSource = new V2ContainerResourceMetricSource().container("container1").name("name1").target(mock(V2MetricTarget.class));
        int hashCode = metricSource.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 241B573BE0686067D83CC74A44E4ACAC
    @Test
    void testToString() {
        V2ContainerResourceMetricSource metricSource = new V2ContainerResourceMetricSource().container("container1").name("name1").target(mock(V2MetricTarget.class));
        String toString = metricSource.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("container1"), is(true));
        assertThat(toString.contains("name1"), is(true));
    }

    //BaseRock generated method id: ${testSetContainerNull}, hash: 7F36C0C3B84764E4CC438757C2D65A31
    @Test
    void testSetContainerNull() {
        V2ContainerResourceMetricSource metricSource = new V2ContainerResourceMetricSource();
        assertDoesNotThrow(() -> metricSource.setContainer(null));
    }

    //BaseRock generated method id: ${testSetNameNull}, hash: F779AD0F38C6AD5BEDDE021BCBE5701F
    @Test
    void testSetNameNull() {
        V2ContainerResourceMetricSource metricSource = new V2ContainerResourceMetricSource();
        assertDoesNotThrow(() -> metricSource.setName(null));
    }

    //BaseRock generated method id: ${testSetTargetNull}, hash: 211497725E0C545FCFA5C9D4705105DA
    @Test
    void testSetTargetNull() {
        V2ContainerResourceMetricSource metricSource = new V2ContainerResourceMetricSource();
        assertDoesNotThrow(() -> metricSource.setTarget(null));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObjects}, hash: 5C061CA646FCE637A677BE6812A2F9D4
    @Test
    void testEqualsWithDifferentObjects() {
        V2ContainerResourceMetricSource metricSource = new V2ContainerResourceMetricSource().container("container1").name("name1").target(mock(V2MetricTarget.class));
        assertThat(metricSource.equals(new Object()), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: BD04EAF7D3421CEDB69043C3A220B913
    @Test
    void testEqualsWithNull() {
        V2ContainerResourceMetricSource metricSource = new V2ContainerResourceMetricSource().container("container1").name("name1").target(mock(V2MetricTarget.class));
        assertThat(metricSource.equals(null), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentContainers}, hash: 6372E1981A7C1E1759EAD1C0281FB430
    @Test
    void testEqualsWithDifferentContainers() {
        V2ContainerResourceMetricSource metricSource1 = new V2ContainerResourceMetricSource().container("container1").name("name1").target(mock(V2MetricTarget.class));
        V2ContainerResourceMetricSource metricSource2 = new V2ContainerResourceMetricSource().container("container2").name("name1").target(mock(V2MetricTarget.class));
        assertThat(metricSource1.equals(metricSource2), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentNames}, hash: F58826835DB754E69863443E145BE5F4
    @Test
    void testEqualsWithDifferentNames() {
        V2ContainerResourceMetricSource metricSource1 = new V2ContainerResourceMetricSource().container("container1").name("name1").target(mock(V2MetricTarget.class));
        V2ContainerResourceMetricSource metricSource2 = new V2ContainerResourceMetricSource().container("container1").name("name2").target(mock(V2MetricTarget.class));
        assertThat(metricSource1.equals(metricSource2), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentTargets}, hash: 36C09545C08F1BC42A643C715BF7C5DB
    @Test
    void testEqualsWithDifferentTargets() {
        V2MetricTarget target1 = mock(V2MetricTarget.class);
        V2MetricTarget target2 = mock(V2MetricTarget.class);
        V2ContainerResourceMetricSource metricSource1 = new V2ContainerResourceMetricSource().container("container1").name("name1").target(target1);
        V2ContainerResourceMetricSource metricSource2 = new V2ContainerResourceMetricSource().container("container1").name("name1").target(target2);
        assertThat(metricSource1.equals(metricSource2), is(false));
    }
}
