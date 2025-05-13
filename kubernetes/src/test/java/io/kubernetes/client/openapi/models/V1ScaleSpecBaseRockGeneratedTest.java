package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1ScaleSpec;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ScaleSpecBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1ScaleSpecConstructor}, hash: CBA4339AFE5F56478CE87335D3072DD4
    @Test
    void testV1ScaleSpecConstructor() {
        V1ScaleSpec scaleSpec = new V1ScaleSpec();
        assertNotNull(scaleSpec);
    }

    //BaseRock generated method id: ${testSetAndGetReplicas}, hash: 4EB9874FAB0A8C2652AE6244D8FFF538
    @Test
    void testSetAndGetReplicas() {
        V1ScaleSpec scaleSpec = new V1ScaleSpec();
        Integer replicas = 3;
        scaleSpec.setReplicas(replicas);
        assertEquals(replicas, scaleSpec.getReplicas());
    }

    //BaseRock generated method id: ${testSetAndGetReplicasWithDifferentValues}, hash: 822C6254D9F4804E55BB31161F4EA470
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 5, 10 })
    void testSetAndGetReplicasWithDifferentValues(int replicaCount) {
        V1ScaleSpec scaleSpec = new V1ScaleSpec();
        scaleSpec.setReplicas(replicaCount);
        assertEquals(replicaCount, scaleSpec.getReplicas());
    }

    //BaseRock generated method id: ${testReplicasChaining}, hash: 29C28FBA2A02E8BF673D192D2517C63F
    @Test
    void testReplicasChaining() {
        V1ScaleSpec scaleSpec = new V1ScaleSpec().replicas(5);
        assertEquals(5, scaleSpec.getReplicas());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 7295E057B6C46702F1FC47F7E757062D
    @Test
    void testEqualsWithSameObject() {
        V1ScaleSpec scaleSpec = new V1ScaleSpec().replicas(3);
        assertThat(scaleSpec.equals(scaleSpec), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: E610D719452273D645C44B5842A2A174
    @Test
    void testEqualsWithDifferentObject() {
        V1ScaleSpec scaleSpec1 = new V1ScaleSpec().replicas(3);
        V1ScaleSpec scaleSpec2 = new V1ScaleSpec().replicas(3);
        assertThat(scaleSpec1.equals(scaleSpec2), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentValues}, hash: 621811C77DB9E87823CA1A1985469FD3
    @Test
    void testEqualsWithDifferentValues() {
        V1ScaleSpec scaleSpec1 = new V1ScaleSpec().replicas(3);
        V1ScaleSpec scaleSpec2 = new V1ScaleSpec().replicas(5);
        assertThat(scaleSpec1.equals(scaleSpec2), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: CD0E6C945740CCA95023064CA00B4047
    @Test
    void testHashCode() {
        V1ScaleSpec scaleSpec1 = new V1ScaleSpec().replicas(3);
        V1ScaleSpec scaleSpec2 = new V1ScaleSpec().replicas(3);
        assertEquals(scaleSpec1.hashCode(), scaleSpec2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: C4755F5D4D6449F7F86F39D471F15348
    @Test
    void testToString() {
        V1ScaleSpec scaleSpec = new V1ScaleSpec().replicas(3);
        String expectedString = "class V1ScaleSpec {\n    replicas: 3\n}";
        assertEquals(expectedString, scaleSpec.toString());
    }

    //BaseRock generated method id: ${testV1ScaleSpecBuilder}, hash: 2F23F5B997087988837C0FA62775450E
    @Test
    void testV1ScaleSpecBuilder() {
        V1ScaleSpec scaleSpec = new V1ScaleSpec().replicas(5);
        assertThat(scaleSpec, is(notNullValue()));
        assertThat(scaleSpec.getReplicas(), is(equalTo(5)));
    }
}
