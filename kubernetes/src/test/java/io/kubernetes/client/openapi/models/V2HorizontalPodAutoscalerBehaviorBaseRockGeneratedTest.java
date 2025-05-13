package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehavior;
import io.kubernetes.client.openapi.models.V2HPAScalingRules;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V2HorizontalPodAutoscalerBehaviorBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 08B260D7E884FCA58562ED9877834191
    @Test
    void testConstructor() {
        V2HorizontalPodAutoscalerBehavior behavior = new V2HorizontalPodAutoscalerBehavior();
        assertNotNull(behavior);
    }

    //BaseRock generated method id: ${testScaleDown}, hash: C1803EE4AF0BB5BB66C7A67125266059
    @Test
    void testScaleDown() {
        V2HorizontalPodAutoscalerBehavior behavior = new V2HorizontalPodAutoscalerBehavior();
        V2HPAScalingRules scaleDown = new V2HPAScalingRules();
        behavior.setScaleDown(scaleDown);
        assertEquals(scaleDown, behavior.getScaleDown());
    }

    //BaseRock generated method id: ${testScaleUp}, hash: 444CCA10EE77FF0978A914EDF1476ECE
    @Test
    void testScaleUp() {
        V2HorizontalPodAutoscalerBehavior behavior = new V2HorizontalPodAutoscalerBehavior();
        V2HPAScalingRules scaleUp = new V2HPAScalingRules();
        behavior.setScaleUp(scaleUp);
        assertEquals(scaleUp, behavior.getScaleUp());
    }

    //BaseRock generated method id: ${testScaleDownNull}, hash: 371EC125E9DBD38AC40EA4D70FE81BBF
    @Test
    void testScaleDownNull() {
        V2HorizontalPodAutoscalerBehavior behavior = new V2HorizontalPodAutoscalerBehavior();
        assertThat(behavior.getScaleDown(), is(nullValue()));
    }

    //BaseRock generated method id: ${testScaleUpNull}, hash: 56F6B447C9DFE7C8CBF8E9604E39687E
    @Test
    void testScaleUpNull() {
        V2HorizontalPodAutoscalerBehavior behavior = new V2HorizontalPodAutoscalerBehavior();
        assertThat(behavior.getScaleUp(), is(nullValue()));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 457C3ED4799CBA08C98F67091A9FF30F
    @Test
    void testEqualsAndHashCode() {
        V2HorizontalPodAutoscalerBehavior behavior1 = new V2HorizontalPodAutoscalerBehavior().scaleDown(new V2HPAScalingRules()).scaleUp(new V2HPAScalingRules());
        V2HorizontalPodAutoscalerBehavior behavior2 = new V2HorizontalPodAutoscalerBehavior().scaleDown(new V2HPAScalingRules()).scaleUp(new V2HPAScalingRules());
        assertEquals(behavior1, behavior2);
        assertEquals(behavior1.hashCode(), behavior2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 47D9C8AFED998399F40260F9889D9FE3
    @Test
    void testToString() {
        V2HorizontalPodAutoscalerBehavior behavior = new V2HorizontalPodAutoscalerBehavior().scaleDown(new V2HPAScalingRules()).scaleUp(new V2HPAScalingRules());
        String toString = behavior.toString();
        assertNotNull(toString);
        assertTrue(toString.contains("scaleDown"));
        assertTrue(toString.contains("scaleUp"));
    }
}
