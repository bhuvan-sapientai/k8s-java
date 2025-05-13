package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.empty;
import java.util.ArrayList;
import java.time.OffsetDateTime;
import io.kubernetes.client.openapi.models.V2MetricStatus;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V2HorizontalPodAutoscalerStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: EE83AF1F3F0D9F5C10622087F622D2A0
    @Test
    void testConstructor() {
        V2HorizontalPodAutoscalerStatus status = new V2HorizontalPodAutoscalerStatus();
        assertNotNull(status);
    }

    //BaseRock generated method id: ${testSetAndGetConditions}, hash: 0A0D270907A82117272DB806F9F04522
    @Test
    void testSetAndGetConditions() {
        V2HorizontalPodAutoscalerStatus status = new V2HorizontalPodAutoscalerStatus();
        List<V2HorizontalPodAutoscalerCondition> conditions = new ArrayList<>();
        V2HorizontalPodAutoscalerCondition condition = mock(V2HorizontalPodAutoscalerCondition.class);
        conditions.add(condition);
        status.setConditions(conditions);
        assertEquals(conditions, status.getConditions());
    }

    //BaseRock generated method id: ${testAddConditionsItem}, hash: 18A46D80E62092A406D0E914D6488284
    @Test
    void testAddConditionsItem() {
        V2HorizontalPodAutoscalerStatus status = new V2HorizontalPodAutoscalerStatus();
        V2HorizontalPodAutoscalerCondition condition = mock(V2HorizontalPodAutoscalerCondition.class);
        status.addConditionsItem(condition);
        assertThat(status.getConditions(), hasSize(1));
        assertEquals(condition, status.getConditions().get(0));
    }

    //BaseRock generated method id: ${testSetAndGetCurrentMetrics}, hash: D26EE41932C79971DF740ADD32624228
    @Test
    void testSetAndGetCurrentMetrics() {
        V2HorizontalPodAutoscalerStatus status = new V2HorizontalPodAutoscalerStatus();
        List<V2MetricStatus> currentMetrics = new ArrayList<>();
        V2MetricStatus metricStatus = mock(V2MetricStatus.class);
        currentMetrics.add(metricStatus);
        status.setCurrentMetrics(currentMetrics);
        assertEquals(currentMetrics, status.getCurrentMetrics());
    }

    //BaseRock generated method id: ${testAddCurrentMetricsItem}, hash: FE6A2FE66E4C145D193453C73E2C0618
    @Test
    void testAddCurrentMetricsItem() {
        V2HorizontalPodAutoscalerStatus status = new V2HorizontalPodAutoscalerStatus();
        V2MetricStatus metricStatus = mock(V2MetricStatus.class);
        status.addCurrentMetricsItem(metricStatus);
        assertThat(status.getCurrentMetrics(), hasSize(1));
        assertEquals(metricStatus, status.getCurrentMetrics().get(0));
    }

    //BaseRock generated method id: ${testSetAndGetCurrentReplicas}, hash: CC03CF44591A19B96E0F2A8FBBD25558
    @Test
    void testSetAndGetCurrentReplicas() {
        V2HorizontalPodAutoscalerStatus status = new V2HorizontalPodAutoscalerStatus();
        Integer currentReplicas = 5;
        status.setCurrentReplicas(currentReplicas);
        assertEquals(currentReplicas, status.getCurrentReplicas());
    }

    //BaseRock generated method id: ${testSetAndGetDesiredReplicas}, hash: 05A4BF8AC9CE664AF8ACDD37D81012F5
    @Test
    void testSetAndGetDesiredReplicas() {
        V2HorizontalPodAutoscalerStatus status = new V2HorizontalPodAutoscalerStatus();
        Integer desiredReplicas = 10;
        status.setDesiredReplicas(desiredReplicas);
        assertEquals(desiredReplicas, status.getDesiredReplicas());
    }

    //BaseRock generated method id: ${testSetAndGetLastScaleTime}, hash: 7AABA602118E245694E0915B85445888
    @Test
    void testSetAndGetLastScaleTime() {
        V2HorizontalPodAutoscalerStatus status = new V2HorizontalPodAutoscalerStatus();
        OffsetDateTime lastScaleTime = OffsetDateTime.now();
        status.setLastScaleTime(lastScaleTime);
        assertEquals(lastScaleTime, status.getLastScaleTime());
    }

    //BaseRock generated method id: ${testSetAndGetObservedGeneration}, hash: 913122327953F0F62AA9F74F58786FAE
    @Test
    void testSetAndGetObservedGeneration() {
        V2HorizontalPodAutoscalerStatus status = new V2HorizontalPodAutoscalerStatus();
        Long observedGeneration = 100L;
        status.setObservedGeneration(observedGeneration);
        assertEquals(observedGeneration, status.getObservedGeneration());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 76106EAFF1996E3CE0D2AFCCB62C03D8
    @Test
    void testEqualsAndHashCode() {
        V2HorizontalPodAutoscalerStatus status1 = new V2HorizontalPodAutoscalerStatus().conditions(new ArrayList<>()).currentMetrics(new ArrayList<>()).currentReplicas(5).desiredReplicas(10).lastScaleTime(OffsetDateTime.now()).observedGeneration(100L);
        V2HorizontalPodAutoscalerStatus status2 = new V2HorizontalPodAutoscalerStatus().conditions(new ArrayList<>()).currentMetrics(new ArrayList<>()).currentReplicas(5).desiredReplicas(10).lastScaleTime(status1.getLastScaleTime()).observedGeneration(100L);
        assertEquals(status1, status2);
        assertEquals(status1.hashCode(), status2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 244F988432DAA37CA485A974281E0024
    @Test
    void testToString() {
        V2HorizontalPodAutoscalerStatus status = new V2HorizontalPodAutoscalerStatus().conditions(new ArrayList<>()).currentMetrics(new ArrayList<>()).currentReplicas(5).desiredReplicas(10).lastScaleTime(OffsetDateTime.now()).observedGeneration(100L);
        String toString = status.toString();
        assertNotNull(toString);
        assertThat(toString.contains("conditions"), is(true));
        assertThat(toString.contains("currentMetrics"), is(true));
        assertThat(toString.contains("currentReplicas"), is(true));
        assertThat(toString.contains("desiredReplicas"), is(true));
        assertThat(toString.contains("lastScaleTime"), is(true));
        assertThat(toString.contains("observedGeneration"), is(true));
    }

    //BaseRock generated method id: ${testNullValues}, hash: 3EF2267CCA611C7FCEAE30EC4B6320A9
    @Disabled()
    @Test
    void testNullValues() {
        V2HorizontalPodAutoscalerStatus status = new V2HorizontalPodAutoscalerStatus();
        assertThat(status.getConditions(), is(nullValue()));
        assertThat(status.getCurrentMetrics(), is(nullValue()));
        assertThat(status.getCurrentReplicas(), is(nullValue()));
        assertThat(status.getDesiredReplicas(), is(nullValue()));
        assertThat(status.getLastScaleTime(), is(nullValue()));
        assertThat(status.getObservedGeneration(), is(nullValue()));
    }

    //BaseRock generated method id: ${testEmptyLists}, hash: F60838513173A5833B7A6B704C700010
    @Test
    void testEmptyLists() {
        V2HorizontalPodAutoscalerStatus status = new V2HorizontalPodAutoscalerStatus().conditions(new ArrayList<>()).currentMetrics(new ArrayList<>());
        assertThat(status.getConditions(), is(empty()));
        assertThat(status.getCurrentMetrics(), is(empty()));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: DBE0BAB138639CB6E9FFF6A866242FF9
    @Test
    void testBuilderPattern() {
        V2HorizontalPodAutoscalerStatus status = new V2HorizontalPodAutoscalerStatus().conditions(new ArrayList<>()).currentMetrics(new ArrayList<>()).currentReplicas(5).desiredReplicas(10).lastScaleTime(OffsetDateTime.now()).observedGeneration(100L);
        assertNotNull(status);
        assertThat(status.getConditions(), is(notNullValue()));
        assertThat(status.getCurrentMetrics(), is(notNullValue()));
        assertEquals(Integer.valueOf(5), status.getCurrentReplicas());
        assertEquals(Integer.valueOf(10), status.getDesiredReplicas());
        assertThat(status.getLastScaleTime(), is(notNullValue()));
        assertEquals(Long.valueOf(100L), status.getObservedGeneration());
    }
}
