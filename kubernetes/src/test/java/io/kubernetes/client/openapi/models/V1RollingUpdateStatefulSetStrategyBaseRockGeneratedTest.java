package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.custom.IntOrString;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1RollingUpdateStatefulSetStrategyBaseRockGeneratedTest {

    private V1RollingUpdateStatefulSetStrategy strategy;

    @BeforeEach
    void setUp() {
        strategy = new V1RollingUpdateStatefulSetStrategy();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 0084B988645F9882AB4E673CCB0CC341
    @Test
    void testConstructor() {
        assertNotNull(strategy);
    }

    //BaseRock generated method id: ${testSetAndGetMaxUnavailable}, hash: C37F30B0FF5F77834A7A4B66FCBF1078
    @Test
    void testSetAndGetMaxUnavailable() {
        IntOrString maxUnavailable = new IntOrString("25%");
        strategy.setMaxUnavailable(maxUnavailable);
        assertEquals(maxUnavailable, strategy.getMaxUnavailable());
    }

    //BaseRock generated method id: ${testSetAndGetPartition}, hash: 03E08F3CFB91086B9CE086842069E1A5
    @Test
    void testSetAndGetPartition() {
        Integer partition = 5;
        strategy.setPartition(partition);
        assertEquals(partition, strategy.getPartition());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: B0D8D3F5517808BC69727795AD574C87
    @Test
    void testEqualsWithSameObject() {
        assertTrue(strategy.equals(strategy));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 191AD216BD1748AA49B84C465B6FC8C3
    @Test
    void testEqualsWithDifferentClass() {
        assertFalse(strategy.equals(new Object()));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: A5F59628CD07765C511FFEBAF86FA97C
    @Test
    void testEqualsWithDifferentObject() {
        V1RollingUpdateStatefulSetStrategy other = new V1RollingUpdateStatefulSetStrategy();
        other.setMaxUnavailable(new IntOrString("50%"));
        other.setPartition(10);
        assertFalse(strategy.equals(other));
    }

    //BaseRock generated method id: ${testEqualsWithNullObject}, hash: 3D5C48CA8536C4BA35DF65DC0675E232
    @Test
    void testEqualsWithNullObject() {
        assertFalse(strategy.equals(null));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 12772E2AF269FAEC98841BFC8F4E738C
    @Test
    void testHashCode() {
        V1RollingUpdateStatefulSetStrategy strategy1 = new V1RollingUpdateStatefulSetStrategy().maxUnavailable(new IntOrString("25%")).partition(5);
        V1RollingUpdateStatefulSetStrategy strategy2 = new V1RollingUpdateStatefulSetStrategy().maxUnavailable(new IntOrString("25%")).partition(5);
        assertEquals(strategy1.hashCode(), strategy2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 57F0C6A4E7E4BABAE1B4249DF6404153
    @Test
    void testToString() {
        strategy.setMaxUnavailable(new IntOrString("25%"));
        strategy.setPartition(5);
        String expected = "class V1RollingUpdateStatefulSetStrategy {\n    maxUnavailable: 25%\n    partition: 5\n}";
        assertEquals(expected, strategy.toString());
    }

    //BaseRock generated method id: ${testMaxUnavailableWithDifferentValues}, hash: EB597085A653C6001D5EB0DEBBBD4757
    @ParameterizedTest
    @ValueSource(strings = { "10%", "5" })
    void testMaxUnavailableWithDifferentValues(String value) {
        IntOrString maxUnavailable = new IntOrString(value);
        strategy.setMaxUnavailable(maxUnavailable);
        assertEquals(maxUnavailable, strategy.getMaxUnavailable());
    }

    //BaseRock generated method id: ${testPartitionWithZero}, hash: 547654579F19626EB10BD589378B2DDC
    @Test
    void testPartitionWithZero() {
        strategy.setPartition(0);
        assertEquals(0, strategy.getPartition());
    }

    //BaseRock generated method id: ${testPartitionWithNegativeValue}, hash: 8003C40A255997A9E2CCB1B65BC17EAB
    @Test
    void testPartitionWithNegativeValue() {
        strategy.setPartition(-1);
        assertEquals(-1, strategy.getPartition());
    }

    //BaseRock generated method id: ${testMaxUnavailableFluentSetter}, hash: A16B9A1FB1323FABFE9F55BCD73F04DA
    @Test
    void testMaxUnavailableFluentSetter() {
        IntOrString maxUnavailable = new IntOrString("30%");
        V1RollingUpdateStatefulSetStrategy result = strategy.maxUnavailable(maxUnavailable);
        assertSame(strategy, result);
        assertEquals(maxUnavailable, strategy.getMaxUnavailable());
    }

    //BaseRock generated method id: ${testPartitionFluentSetter}, hash: 709F3E5CD644A17A680F09E5E1980C24
    @Test
    void testPartitionFluentSetter() {
        Integer partition = 3;
        V1RollingUpdateStatefulSetStrategy result = strategy.partition(partition);
        assertSame(strategy, result);
        assertEquals(partition, strategy.getPartition());
    }
}
