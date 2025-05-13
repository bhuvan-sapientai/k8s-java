package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1alpha3ResourcePool;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha3ResourcePoolBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 6E7E1C1CEE451671558C536E23DD4571
    @Test
    void testConstructor() {
        V1alpha3ResourcePool resourcePool = new V1alpha3ResourcePool();
        assertThat(resourcePool, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetGeneration}, hash: A383E5551DC76AA2204F45391C0F6333
    @Test
    void testSetAndGetGeneration() {
        V1alpha3ResourcePool resourcePool = new V1alpha3ResourcePool();
        Long generation = 1L;
        resourcePool.setGeneration(generation);
        assertThat(resourcePool.getGeneration(), is(equalTo(generation)));
    }

    //BaseRock generated method id: ${testSetAndGetName}, hash: 3CB69E1AE013219BFBE909B3FEE7B5CD
    @Test
    void testSetAndGetName() {
        V1alpha3ResourcePool resourcePool = new V1alpha3ResourcePool();
        String name = "test-pool";
        resourcePool.setName(name);
        assertThat(resourcePool.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testSetAndGetResourceSliceCount}, hash: 23AC7F8A5BB8B1A017C28D1B0B51B99C
    @Test
    void testSetAndGetResourceSliceCount() {
        V1alpha3ResourcePool resourcePool = new V1alpha3ResourcePool();
        Long resourceSliceCount = 5L;
        resourcePool.setResourceSliceCount(resourceSliceCount);
        assertThat(resourcePool.getResourceSliceCount(), is(equalTo(resourceSliceCount)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 40374F8FC5F2951483B887CC18149030
    @Test
    void testEquals() {
        V1alpha3ResourcePool pool1 = new V1alpha3ResourcePool().generation(1L).name("pool1").resourceSliceCount(5L);
        V1alpha3ResourcePool pool2 = new V1alpha3ResourcePool().generation(1L).name("pool1").resourceSliceCount(5L);
        assertThat(pool1.equals(pool2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: D99D0A2684CF4D69AC2E1947134010B1
    @Test
    void testHashCode() {
        V1alpha3ResourcePool pool1 = new V1alpha3ResourcePool().generation(1L).name("pool1").resourceSliceCount(5L);
        V1alpha3ResourcePool pool2 = new V1alpha3ResourcePool().generation(1L).name("pool1").resourceSliceCount(5L);
        assertThat(pool1.hashCode(), is(equalTo(pool2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 82C4B0AFAB4B52CECB9BB86550505AE3
    @Test
    void testToString() {
        V1alpha3ResourcePool pool = new V1alpha3ResourcePool().generation(1L).name("pool1").resourceSliceCount(5L);
        String expected = "class V1alpha3ResourcePool {\n    generation: 1\n    name: pool1\n    resourceSliceCount: 5\n}";
        assertThat(pool.toString(), is(equalTo(expected)));
    }

    //BaseRock generated method id: ${testGenerationBoundaryValues}, hash: ABD60D418E55B9153BACF21DB26AF89E
    @ParameterizedTest
    @ValueSource(longs = { 0L, 1L, Long.MAX_VALUE })
    void testGenerationBoundaryValues(Long generation) {
        V1alpha3ResourcePool resourcePool = new V1alpha3ResourcePool();
        resourcePool.setGeneration(generation);
        assertThat(resourcePool.getGeneration(), is(equalTo(generation)));
    }

    //BaseRock generated method id: ${testNameMaxLength}, hash: BD8BD2A3990C4B7013B29195338A0485
    @Test
    void testNameMaxLength() {
        V1alpha3ResourcePool resourcePool = new V1alpha3ResourcePool();
        String maxLengthName = "a".repeat(253);
        resourcePool.setName(maxLengthName);
        assertThat(resourcePool.getName(), is(equalTo(maxLengthName)));
    }

    //BaseRock generated method id: ${testNameExceedsMaxLength}, hash: 8090613BBE025C7CEF817317582D529B
    @Test
    void testNameExceedsMaxLength() {
        V1alpha3ResourcePool resourcePool = new V1alpha3ResourcePool();
        String exceedingName = "a".repeat(254);
        resourcePool.setName(exceedingName);
        assertThat(resourcePool.getName().length(), is(equalTo(254)));
    }

    //BaseRock generated method id: ${testResourceSliceCountBoundaryValues}, hash: 7C6A5B21D874BCCB1C3B066EFAED0003
    @ParameterizedTest
    @ValueSource(longs = { 1L, 2L, Long.MAX_VALUE })
    void testResourceSliceCountBoundaryValues(Long resourceSliceCount) {
        V1alpha3ResourcePool resourcePool = new V1alpha3ResourcePool();
        resourcePool.setResourceSliceCount(resourceSliceCount);
        assertThat(resourcePool.getResourceSliceCount(), is(equalTo(resourceSliceCount)));
    }

    //BaseRock generated method id: ${testResourceSliceCountZero}, hash: 4CB1CDEF61A48B69AE9BA8B6965FFD24
    @Test
    void testResourceSliceCountZero() {
        V1alpha3ResourcePool resourcePool = new V1alpha3ResourcePool();
        resourcePool.setResourceSliceCount(0L);
        assertThat(resourcePool.getResourceSliceCount(), is(equalTo(0L)));
    }

    //BaseRock generated method id: ${testResourceSliceCountNegative}, hash: 64EA84C35A987650C680DD45FF1A0693
    @Test
    void testResourceSliceCountNegative() {
        V1alpha3ResourcePool resourcePool = new V1alpha3ResourcePool();
        resourcePool.setResourceSliceCount(-1L);
        assertThat(resourcePool.getResourceSliceCount(), is(equalTo(-1L)));
    }
}
