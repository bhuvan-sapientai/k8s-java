package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.mockito.Mock;
import io.kubernetes.client.openapi.models.V1Condition;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.OffsetDateTime;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatus;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import java.util.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PodDisruptionBudgetStatusBaseRockGeneratedTest {

    private V1PodDisruptionBudgetStatus status;

    @Mock
    private V1Condition mockCondition;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        status = new V1PodDisruptionBudgetStatus();
    }

    //BaseRock generated method id: ${testConstructor}, hash: C0515577F4B36C8507B14B7386258FF8
    @Test
    void testConstructor() {
        assertNotNull(status);
    }

    //BaseRock generated method id: ${testConditions}, hash: 60DF5B45FDD6D1AD45512E13859935EB
    @Test
    void testConditions() {
        List<V1Condition> conditions = Arrays.asList(mockCondition);
        status.setConditions(conditions);
        assertEquals(conditions, status.getConditions());
    }

    //BaseRock generated method id: ${testAddConditionsItem}, hash: AA1489A056E06ED60C033E39922B7231
    @Test
    void testAddConditionsItem() {
        status.addConditionsItem(mockCondition);
        assertThat(status.getConditions(), hasItem(mockCondition));
    }

    //BaseRock generated method id: ${testCurrentHealthy}, hash: 38ADD018FB737ACE1C598A116879DEEB
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 10 })
    void testCurrentHealthy(int value) {
        status.setCurrentHealthy(value);
        assertEquals(value, status.getCurrentHealthy());
    }

    //BaseRock generated method id: ${testDesiredHealthy}, hash: F944ABEE6734116DE556AAE30F65C7B1
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 10 })
    void testDesiredHealthy(int value) {
        status.setDesiredHealthy(value);
        assertEquals(value, status.getDesiredHealthy());
    }

    //BaseRock generated method id: ${testDisruptedPods}, hash: 6549FA83A90D2FC0437E345DFC5B195A
    @Test
    void testDisruptedPods() {
        Map<String, OffsetDateTime> disruptedPods = new HashMap<>();
        disruptedPods.put("pod1", OffsetDateTime.now());
        status.setDisruptedPods(disruptedPods);
        assertEquals(disruptedPods, status.getDisruptedPods());
    }

    //BaseRock generated method id: ${testPutDisruptedPodsItem}, hash: 776C813D369EECC1BAB64FD763FB98DE
    @Test
    void testPutDisruptedPodsItem() {
        String key = "pod1";
        OffsetDateTime value = OffsetDateTime.now();
        status.putDisruptedPodsItem(key, value);
        assertEquals(value, status.getDisruptedPods().get(key));
    }

    //BaseRock generated method id: ${testDisruptionsAllowed}, hash: 141894337A5BEB456A9B5CE16F364ABD
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 10 })
    void testDisruptionsAllowed(int value) {
        status.setDisruptionsAllowed(value);
        assertEquals(value, status.getDisruptionsAllowed());
    }

    //BaseRock generated method id: ${testExpectedPods}, hash: 4B556675C62EE420F15B15332F824AED
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 10 })
    void testExpectedPods(int value) {
        status.setExpectedPods(value);
        assertEquals(value, status.getExpectedPods());
    }

    //BaseRock generated method id: ${testObservedGeneration}, hash: 798B5302E808059923F9E2C5E302F2A4
    @ParameterizedTest
    @ValueSource(longs = { 0L, 1L, 10L })
    void testObservedGeneration(long value) {
        status.setObservedGeneration(value);
        assertEquals(value, status.getObservedGeneration());
    }

    //BaseRock generated method id: ${testEquals}, hash: AC75FD63D18BC23F7D3703B8703B2093
    @Test
    void testEquals() {
        V1PodDisruptionBudgetStatus status1 = new V1PodDisruptionBudgetStatus().currentHealthy(1).desiredHealthy(2).disruptionsAllowed(3).expectedPods(4);
        V1PodDisruptionBudgetStatus status2 = new V1PodDisruptionBudgetStatus().currentHealthy(1).desiredHealthy(2).disruptionsAllowed(3).expectedPods(4);
        assertEquals(status1, status2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 53ED278517D56FFDF4DDABADEC50296F
    @Test
    void testHashCode() {
        V1PodDisruptionBudgetStatus status1 = new V1PodDisruptionBudgetStatus().currentHealthy(1).desiredHealthy(2).disruptionsAllowed(3).expectedPods(4);
        V1PodDisruptionBudgetStatus status2 = new V1PodDisruptionBudgetStatus().currentHealthy(1).desiredHealthy(2).disruptionsAllowed(3).expectedPods(4);
        assertEquals(status1.hashCode(), status2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 67FE388E1064D2F4DB3999BD9FDB375C
    @Test
    void testToString() {
        V1PodDisruptionBudgetStatus status = new V1PodDisruptionBudgetStatus().currentHealthy(1).desiredHealthy(2).disruptionsAllowed(3).expectedPods(4);
        String expected = "class V1PodDisruptionBudgetStatus {\n" + "    conditions: []\n" + "    currentHealthy: 1\n" + "    desiredHealthy: 2\n" + "    disruptedPods: {}\n" + "    disruptionsAllowed: 3\n" + "    expectedPods: 4\n" + "    observedGeneration: null\n" + "}";
        assertEquals(expected, status.toString());
    }

    //BaseRock generated method id: ${testConditionsWithNullAndEmptyList}, hash: 2544A1A0E071D45FA12EAEAB9946E52C
    @ParameterizedTest
    @NullAndEmptySource
    void testConditionsWithNullAndEmptyList(List<V1Condition> conditions) {
        status.setConditions(conditions);
        assertEquals(conditions, status.getConditions());
    }

    //BaseRock generated method id: ${testConditionsWithNonEmptyList}, hash: 6BBAEE67A14D12CF6514CDC3E891CECE
    @Test
    void testConditionsWithNonEmptyList() {
        List<V1Condition> conditions = Arrays.asList(mockCondition);
        status.setConditions(conditions);
        assertEquals(conditions, status.getConditions());
    }

    //BaseRock generated method id: ${testDisruptedPodsWithNullAndEmptyMap}, hash: D7523B8BFB03D5595116580C06065A1B
    @ParameterizedTest
    @NullAndEmptySource
    void testDisruptedPodsWithNullAndEmptyMap(Map<String, OffsetDateTime> disruptedPods) {
        status.setDisruptedPods(disruptedPods);
        assertEquals(disruptedPods, status.getDisruptedPods());
    }

    //BaseRock generated method id: ${testDisruptedPodsWithNonEmptyMap}, hash: 65D272CFBB21C648F934DB9C3FDC6C54
    @Test
    void testDisruptedPodsWithNonEmptyMap() {
        Map<String, OffsetDateTime> disruptedPods = new HashMap<>();
        disruptedPods.put("pod1", OffsetDateTime.now());
        status.setDisruptedPods(disruptedPods);
        assertEquals(disruptedPods, status.getDisruptedPods());
    }
}
