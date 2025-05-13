package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerStatus;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1HorizontalPodAutoscalerStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1HorizontalPodAutoscalerStatusConstructor}, hash: A42488E02215FBE0E8EF681E6D8014D4
    @Test
    void testV1HorizontalPodAutoscalerStatusConstructor() {
        V1HorizontalPodAutoscalerStatus status = new V1HorizontalPodAutoscalerStatus();
        assertNotNull(status);
    }

    //BaseRock generated method id: ${testCurrentCPUUtilizationPercentage}, hash: 02018E3966B5FD353F478CC3FC862B89
    @Test
    void testCurrentCPUUtilizationPercentage() {
        V1HorizontalPodAutoscalerStatus status = new V1HorizontalPodAutoscalerStatus();
        Integer utilization = 75;
        status.setCurrentCPUUtilizationPercentage(utilization);
        assertEquals(utilization, status.getCurrentCPUUtilizationPercentage());
    }

    //BaseRock generated method id: ${testCurrentReplicas}, hash: 82016CC2B6CF3BF57A12598C36CB664E
    @Test
    void testCurrentReplicas() {
        V1HorizontalPodAutoscalerStatus status = new V1HorizontalPodAutoscalerStatus();
        Integer replicas = 3;
        status.setCurrentReplicas(replicas);
        assertEquals(replicas, status.getCurrentReplicas());
    }

    //BaseRock generated method id: ${testDesiredReplicas}, hash: 3BDF0788F1C25E5A05298A769784F5EA
    @Test
    void testDesiredReplicas() {
        V1HorizontalPodAutoscalerStatus status = new V1HorizontalPodAutoscalerStatus();
        Integer replicas = 5;
        status.setDesiredReplicas(replicas);
        assertEquals(replicas, status.getDesiredReplicas());
    }

    //BaseRock generated method id: ${testLastScaleTime}, hash: B00D5BA349F7FE5CB4CB5289FD67C7D0
    @Test
    void testLastScaleTime() {
        V1HorizontalPodAutoscalerStatus status = new V1HorizontalPodAutoscalerStatus();
        OffsetDateTime now = OffsetDateTime.now();
        status.setLastScaleTime(now);
        assertEquals(now, status.getLastScaleTime());
    }

    //BaseRock generated method id: ${testObservedGeneration}, hash: ABC4BF623B488E18050AA41755CA9552
    @Test
    void testObservedGeneration() {
        V1HorizontalPodAutoscalerStatus status = new V1HorizontalPodAutoscalerStatus();
        Long generation = 10L;
        status.setObservedGeneration(generation);
        assertEquals(generation, status.getObservedGeneration());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 3277834B733850FCBFC87544BF86018D
    @Test
    void testEqualsAndHashCode() {
        V1HorizontalPodAutoscalerStatus status1 = new V1HorizontalPodAutoscalerStatus().currentCPUUtilizationPercentage(80).currentReplicas(3).desiredReplicas(5).lastScaleTime(OffsetDateTime.now()).observedGeneration(10L);
        V1HorizontalPodAutoscalerStatus status2 = new V1HorizontalPodAutoscalerStatus().currentCPUUtilizationPercentage(80).currentReplicas(3).desiredReplicas(5).lastScaleTime(status1.getLastScaleTime()).observedGeneration(10L);
        assertThat(status1, equalTo(status2));
        assertThat(status1.hashCode(), equalTo(status2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 26685B7DC34FA25468065B6654D8738F
    @Test
    void testToString() {
        V1HorizontalPodAutoscalerStatus status = new V1HorizontalPodAutoscalerStatus().currentCPUUtilizationPercentage(80).currentReplicas(3).desiredReplicas(5).lastScaleTime(OffsetDateTime.now()).observedGeneration(10L);
        String toString = status.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("currentCPUUtilizationPercentage"), is(true));
        assertThat(toString.contains("currentReplicas"), is(true));
        assertThat(toString.contains("desiredReplicas"), is(true));
        assertThat(toString.contains("lastScaleTime"), is(true));
        assertThat(toString.contains("observedGeneration"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 879497F38E71BCFFB668432FF9C795DD
    @Test
    void testBuilder() {
        Integer currentCPUUtilizationPercentage = 80;
        Integer currentReplicas = 3;
        Integer desiredReplicas = 5;
        OffsetDateTime lastScaleTime = OffsetDateTime.now();
        Long observedGeneration = 10L;
        V1HorizontalPodAutoscalerStatus status = new V1HorizontalPodAutoscalerStatus().currentCPUUtilizationPercentage(currentCPUUtilizationPercentage).currentReplicas(currentReplicas).desiredReplicas(desiredReplicas).lastScaleTime(lastScaleTime).observedGeneration(observedGeneration);
        assertThat(status.getCurrentCPUUtilizationPercentage(), equalTo(currentCPUUtilizationPercentage));
        assertThat(status.getCurrentReplicas(), equalTo(currentReplicas));
        assertThat(status.getDesiredReplicas(), equalTo(desiredReplicas));
        assertThat(status.getLastScaleTime(), equalTo(lastScaleTime));
        assertThat(status.getObservedGeneration(), equalTo(observedGeneration));
    }

    //BaseRock generated method id: ${testNullValues}, hash: 4BC6BA8C630B49EECD839409BF127DA9
    @Test
    void testNullValues() {
        V1HorizontalPodAutoscalerStatus status = new V1HorizontalPodAutoscalerStatus();
        assertThat(status.getCurrentCPUUtilizationPercentage(), nullValue());
        assertThat(status.getLastScaleTime(), nullValue());
        assertThat(status.getObservedGeneration(), nullValue());
    }
}
