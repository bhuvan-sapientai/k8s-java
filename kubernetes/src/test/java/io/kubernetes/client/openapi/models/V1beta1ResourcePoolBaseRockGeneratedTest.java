package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1beta1ResourcePool;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1ResourcePoolBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1beta1ResourcePoolConstructor}, hash: 5C765A2C80159885ACE7EFA74697B2AE
    @Test
    void testV1beta1ResourcePoolConstructor() {
        V1beta1ResourcePool resourcePool = new V1beta1ResourcePool();
        assertThat(resourcePool, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetGeneration}, hash: 738223A31F6ED7656D300BAF5953EF54
    @Test
    void testSetAndGetGeneration() {
        V1beta1ResourcePool resourcePool = new V1beta1ResourcePool();
        Long generation = 1L;
        resourcePool.setGeneration(generation);
        assertEquals(generation, resourcePool.getGeneration());
    }

    //BaseRock generated method id: ${testSetAndGetName}, hash: C09D2634DAC27B93A74E9EB65A4B0E10
    @Test
    void testSetAndGetName() {
        V1beta1ResourcePool resourcePool = new V1beta1ResourcePool();
        String name = "test-pool";
        resourcePool.setName(name);
        assertEquals(name, resourcePool.getName());
    }

    //BaseRock generated method id: ${testSetAndGetResourceSliceCount}, hash: A6CB30735B77ED60D753826439B56FAE
    @Test
    void testSetAndGetResourceSliceCount() {
        V1beta1ResourcePool resourcePool = new V1beta1ResourcePool();
        Long resourceSliceCount = 5L;
        resourcePool.setResourceSliceCount(resourceSliceCount);
        assertEquals(resourceSliceCount, resourcePool.getResourceSliceCount());
    }

    //BaseRock generated method id: ${testGenerationWithBuilder}, hash: 98FD6617B1227AD14564C671A94FDB91
    @Test
    void testGenerationWithBuilder() {
        Long generation = 2L;
        V1beta1ResourcePool resourcePool = new V1beta1ResourcePool().generation(generation);
        assertEquals(generation, resourcePool.getGeneration());
    }

    //BaseRock generated method id: ${testNameWithBuilder}, hash: 7BDAD94DFB7B0870F30FD9C496EC7776
    @Test
    void testNameWithBuilder() {
        String name = "test-pool-2";
        V1beta1ResourcePool resourcePool = new V1beta1ResourcePool().name(name);
        assertEquals(name, resourcePool.getName());
    }

    //BaseRock generated method id: ${testResourceSliceCountWithBuilder}, hash: 59947394AA596EEA90A325DC67B11E0A
    @Test
    void testResourceSliceCountWithBuilder() {
        Long resourceSliceCount = 10L;
        V1beta1ResourcePool resourcePool = new V1beta1ResourcePool().resourceSliceCount(resourceSliceCount);
        assertEquals(resourceSliceCount, resourcePool.getResourceSliceCount());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: F9952014EBB80A06B81FF5BDAF42356C
    @Test
    void testEqualsWithSameObject() {
        V1beta1ResourcePool resourcePool = new V1beta1ResourcePool().generation(1L).name("test-pool").resourceSliceCount(5L);
        assertThat(resourcePool.equals(resourcePool), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: EF43CDAD27E64B45C4267C65BC6D16E2
    @Test
    void testEqualsWithDifferentObject() {
        V1beta1ResourcePool resourcePool1 = new V1beta1ResourcePool().generation(1L).name("test-pool-1").resourceSliceCount(5L);
        V1beta1ResourcePool resourcePool2 = new V1beta1ResourcePool().generation(2L).name("test-pool-2").resourceSliceCount(10L);
        assertThat(resourcePool1.equals(resourcePool2), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 02D01AE0E11217BD0DC44F5C1D1E658F
    @Test
    void testHashCode() {
        V1beta1ResourcePool resourcePool1 = new V1beta1ResourcePool().generation(1L).name("test-pool").resourceSliceCount(5L);
        V1beta1ResourcePool resourcePool2 = new V1beta1ResourcePool().generation(1L).name("test-pool").resourceSliceCount(5L);
        assertEquals(resourcePool1.hashCode(), resourcePool2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 990C56D5AA08D71AFBBA31E81E6D8391
    @Test
    void testToString() {
        V1beta1ResourcePool resourcePool = new V1beta1ResourcePool().generation(1L).name("test-pool").resourceSliceCount(5L);
        String expected = "class V1beta1ResourcePool {\n    generation: 1\n    name: test-pool\n    resourceSliceCount: 5\n}";
        assertEquals(expected, resourcePool.toString());
    }

    //BaseRock generated method id: ${testGenerationWithValidValues}, hash: BBE93190F1173B3EA11D58560E1AAEF7
    @ParameterizedTest
    @ValueSource(longs = { 0L, 1L, Long.MAX_VALUE })
    void testGenerationWithValidValues(long generation) {
        V1beta1ResourcePool resourcePool = new V1beta1ResourcePool().generation(generation);
        assertEquals(generation, resourcePool.getGeneration());
    }

    //BaseRock generated method id: ${testNameWithValidValues}, hash: F7E4724AA056B5811B223CEB4775C9D7
    @ParameterizedTest
    @ValueSource(strings = { "", "test", "test-pool-with-very-long-name-that-is-still-valid" })
    void testNameWithValidValues(String name) {
        V1beta1ResourcePool resourcePool = new V1beta1ResourcePool().name(name);
        assertEquals(name, resourcePool.getName());
    }

    //BaseRock generated method id: ${testResourceSliceCountWithValidValues}, hash: F1A69F770D9D16DDB25F34691D1393A3
    @ParameterizedTest
    @ValueSource(longs = { 1L, 5L, Long.MAX_VALUE })
    void testResourceSliceCountWithValidValues(long resourceSliceCount) {
        V1beta1ResourcePool resourcePool = new V1beta1ResourcePool().resourceSliceCount(resourceSliceCount);
        assertEquals(resourceSliceCount, resourcePool.getResourceSliceCount());
    }

    //BaseRock generated method id: ${testSetNullGeneration}, hash: B60DEED6ABB6161230DBD869BFB10757
    @Test
    void testSetNullGeneration() {
        V1beta1ResourcePool resourcePool = new V1beta1ResourcePool();
        resourcePool.setGeneration(null);
        assertThat(resourcePool.getGeneration(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetNullName}, hash: CDB229357822DCAEE393C40B77557861
    @Test
    void testSetNullName() {
        V1beta1ResourcePool resourcePool = new V1beta1ResourcePool();
        resourcePool.setName(null);
        assertThat(resourcePool.getName(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetNullResourceSliceCount}, hash: 2754120A827243C98A7C62A40B804565
    @Test
    void testSetNullResourceSliceCount() {
        V1beta1ResourcePool resourcePool = new V1beta1ResourcePool();
        resourcePool.setResourceSliceCount(null);
        assertThat(resourcePool.getResourceSliceCount(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testNegativeGeneration}, hash: 970EDCF6D2E827F37BFFA3B25F7A990D
    @Test
    void testNegativeGeneration() {
        V1beta1ResourcePool resourcePool = new V1beta1ResourcePool();
        resourcePool.setGeneration(-1L);
        assertEquals(-1L, resourcePool.getGeneration());
    }

    //BaseRock generated method id: ${testZeroResourceSliceCount}, hash: 7878068D52411200E1EC4AA68A54A780
    @Test
    void testZeroResourceSliceCount() {
        V1beta1ResourcePool resourcePool = new V1beta1ResourcePool();
        resourcePool.setResourceSliceCount(0L);
        assertEquals(0L, resourcePool.getResourceSliceCount());
    }

    //BaseRock generated method id: ${testNameExceedingMaxLength}, hash: 283FB7D8E08B19C3C5B94ED04E8E1AAA
    @Test
    void testNameExceedingMaxLength() {
        V1beta1ResourcePool resourcePool = new V1beta1ResourcePool();
        // 254 characters
        String longName = "a".repeat(254);
        resourcePool.setName(longName);
        assertEquals(longName, resourcePool.getName());
    }
}
