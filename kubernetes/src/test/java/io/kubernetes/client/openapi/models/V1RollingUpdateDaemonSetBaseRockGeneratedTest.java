package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.custom.IntOrString;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1RollingUpdateDaemonSetBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: D82C1E05A507708FE49F07031853D53F
    @Test
    void testConstructor() {
        V1RollingUpdateDaemonSet rollingUpdateDaemonSet = new V1RollingUpdateDaemonSet();
        assertThat(rollingUpdateDaemonSet, is(notNullValue()));
    }

    //BaseRock generated method id: ${testMaxSurge}, hash: A970F38B26A32DC1CA7ECFD9A78199A6
    @Test
    void testMaxSurge() {
        V1RollingUpdateDaemonSet rollingUpdateDaemonSet = new V1RollingUpdateDaemonSet();
        IntOrString maxSurge = new IntOrString(5);
        rollingUpdateDaemonSet.setMaxSurge(maxSurge);
        assertEquals(maxSurge, rollingUpdateDaemonSet.getMaxSurge());
    }

    //BaseRock generated method id: ${testMaxUnavailable}, hash: F2306702902C07CE3A497DC510D2771C
    @Test
    void testMaxUnavailable() {
        V1RollingUpdateDaemonSet rollingUpdateDaemonSet = new V1RollingUpdateDaemonSet();
        IntOrString maxUnavailable = new IntOrString(3);
        rollingUpdateDaemonSet.setMaxUnavailable(maxUnavailable);
        assertEquals(maxUnavailable, rollingUpdateDaemonSet.getMaxUnavailable());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 67F6F242DA29A110FEEC3D6273B34612
    @Test
    void testEqualsWithSameObject() {
        V1RollingUpdateDaemonSet rollingUpdateDaemonSet = new V1RollingUpdateDaemonSet();
        assertEquals(rollingUpdateDaemonSet, rollingUpdateDaemonSet);
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 7E467C2C203B778BE0629D5DB0FE187F
    @Test
    void testEqualsWithDifferentObject() {
        V1RollingUpdateDaemonSet rollingUpdateDaemonSet1 = new V1RollingUpdateDaemonSet().maxSurge(new IntOrString(1)).maxUnavailable(new IntOrString(2));
        V1RollingUpdateDaemonSet rollingUpdateDaemonSet2 = new V1RollingUpdateDaemonSet().maxSurge(new IntOrString(3)).maxUnavailable(new IntOrString(4));
        assertNotEquals(rollingUpdateDaemonSet1, rollingUpdateDaemonSet2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: D6E082A0522BD1190067E7EBDDF235E9
    @Test
    void testHashCode() {
        V1RollingUpdateDaemonSet rollingUpdateDaemonSet1 = new V1RollingUpdateDaemonSet().maxSurge(new IntOrString(1)).maxUnavailable(new IntOrString(2));
        V1RollingUpdateDaemonSet rollingUpdateDaemonSet2 = new V1RollingUpdateDaemonSet().maxSurge(new IntOrString(1)).maxUnavailable(new IntOrString(2));
        assertEquals(rollingUpdateDaemonSet1.hashCode(), rollingUpdateDaemonSet2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: BAD2943D74B539716996B9211AAD4745
    @Test
    void testToString() {
        V1RollingUpdateDaemonSet rollingUpdateDaemonSet = new V1RollingUpdateDaemonSet().maxSurge(new IntOrString(1)).maxUnavailable(new IntOrString(2));
        String expectedString = "class V1RollingUpdateDaemonSet {\n    maxSurge: 1\n    maxUnavailable: 2\n}";
        assertEquals(expectedString, rollingUpdateDaemonSet.toString());
    }

    //BaseRock generated method id: ${testMaxSurgeWithIntegerValues}, hash: A7849312EFB0F8CA3D2A96C0E3819D33
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 5, 10 })
    void testMaxSurgeWithIntegerValues(int value) {
        V1RollingUpdateDaemonSet rollingUpdateDaemonSet = new V1RollingUpdateDaemonSet();
        IntOrString maxSurge = new IntOrString(value);
        rollingUpdateDaemonSet.setMaxSurge(maxSurge);
        assertEquals(maxSurge, rollingUpdateDaemonSet.getMaxSurge());
    }

    //BaseRock generated method id: ${testMaxSurgeWithPercentageValues}, hash: F8A53EBE129407A9842C93BA6F847948
    @ParameterizedTest
    @ValueSource(strings = { "10%", "25%", "50%", "100%" })
    void testMaxSurgeWithPercentageValues(String value) {
        V1RollingUpdateDaemonSet rollingUpdateDaemonSet = new V1RollingUpdateDaemonSet();
        IntOrString maxSurge = new IntOrString(value);
        rollingUpdateDaemonSet.setMaxSurge(maxSurge);
        assertEquals(maxSurge, rollingUpdateDaemonSet.getMaxSurge());
    }

    //BaseRock generated method id: ${testMaxUnavailableWithIntegerValues}, hash: CCF98D97C25B02D3C6EA46813DD0899B
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 5, 10 })
    void testMaxUnavailableWithIntegerValues(int value) {
        V1RollingUpdateDaemonSet rollingUpdateDaemonSet = new V1RollingUpdateDaemonSet();
        IntOrString maxUnavailable = new IntOrString(value);
        rollingUpdateDaemonSet.setMaxUnavailable(maxUnavailable);
        assertEquals(maxUnavailable, rollingUpdateDaemonSet.getMaxUnavailable());
    }

    //BaseRock generated method id: ${testMaxUnavailableWithPercentageValues}, hash: 31AC862BED23D1808148DB1123F760C1
    @ParameterizedTest
    @ValueSource(strings = { "10%", "25%", "50%", "100%" })
    void testMaxUnavailableWithPercentageValues(String value) {
        V1RollingUpdateDaemonSet rollingUpdateDaemonSet = new V1RollingUpdateDaemonSet();
        IntOrString maxUnavailable = new IntOrString(value);
        rollingUpdateDaemonSet.setMaxUnavailable(maxUnavailable);
        assertEquals(maxUnavailable, rollingUpdateDaemonSet.getMaxUnavailable());
    }
}
