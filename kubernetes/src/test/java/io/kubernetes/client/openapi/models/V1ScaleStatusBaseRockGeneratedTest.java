package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1ScaleStatus;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ScaleStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1ScaleStatusConstructor}, hash: 952D0ECB65AA53DC3616CBEADE210F6E
    @Test
    void testV1ScaleStatusConstructor() {
        V1ScaleStatus scaleStatus = new V1ScaleStatus();
        assertNotNull(scaleStatus);
    }

    //BaseRock generated method id: ${testSetAndGetReplicas}, hash: E20E37389F8988B73A34DDC8D2949D08
    @Test
    void testSetAndGetReplicas() {
        V1ScaleStatus scaleStatus = new V1ScaleStatus();
        scaleStatus.setReplicas(5);
        assertEquals(5, scaleStatus.getReplicas());
    }

    //BaseRock generated method id: ${testSetAndGetSelector}, hash: E388ED343CCEE090C6FDA9398012995E
    @Test
    void testSetAndGetSelector() {
        V1ScaleStatus scaleStatus = new V1ScaleStatus();
        String selector = "app=myapp";
        scaleStatus.setSelector(selector);
        assertEquals(selector, scaleStatus.getSelector());
    }

    //BaseRock generated method id: ${testReplicasMethod}, hash: F9C63752864EB47D28F7196805002C6F
    @Test
    void testReplicasMethod() {
        V1ScaleStatus scaleStatus = new V1ScaleStatus();
        V1ScaleStatus result = scaleStatus.replicas(3);
        assertThat(result, is(scaleStatus));
        assertEquals(3, result.getReplicas());
    }

    //BaseRock generated method id: ${testSelectorMethod}, hash: A9D152C9A0DDC19EE6CA1F7EFA4675A1
    @Test
    void testSelectorMethod() {
        V1ScaleStatus scaleStatus = new V1ScaleStatus();
        String selector = "env=prod";
        V1ScaleStatus result = scaleStatus.selector(selector);
        assertThat(result, is(scaleStatus));
        assertEquals(selector, result.getSelector());
    }

    //BaseRock generated method id: ${testReplicasWithDifferentValues}, hash: B5D836FA18888CFF87BE501E99ADDFF6
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 10, 100 })
    void testReplicasWithDifferentValues(int replicaCount) {
        V1ScaleStatus scaleStatus = new V1ScaleStatus();
        scaleStatus.setReplicas(replicaCount);
        assertEquals(replicaCount, scaleStatus.getReplicas());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 84DAB17EDCFE79D138343AD75BB8D8F3
    @Test
    void testEqualsAndHashCode() {
        V1ScaleStatus status1 = new V1ScaleStatus().replicas(3).selector("app=web");
        V1ScaleStatus status2 = new V1ScaleStatus().replicas(3).selector("app=web");
        V1ScaleStatus status3 = new V1ScaleStatus().replicas(5).selector("app=api");
        assertThat(status1, equalTo(status2));
        assertThat(status1.hashCode(), equalTo(status2.hashCode()));
        assertThat(status1, is(notNullValue()));
        assertThat(status1.equals(status3), is(false));
    }

    //BaseRock generated method id: ${testToString}, hash: 64AC6C458187B5191C12A3D4BF13E1D9
    @Test
    void testToString() {
        V1ScaleStatus scaleStatus = new V1ScaleStatus().replicas(2).selector("app=frontend");
        String result = scaleStatus.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("replicas"), is(true));
        assertThat(result.contains("selector"), is(true));
    }

    //BaseRock generated method id: ${testSetReplicasWithNull}, hash: 67C2600EB7FE42441AE9992EE46BA2E7
    @Test
    void testSetReplicasWithNull() {
        V1ScaleStatus scaleStatus = new V1ScaleStatus();
        scaleStatus.setReplicas(null);
        assertThat(scaleStatus.getReplicas(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetSelectorWithNull}, hash: 355BAF7002BFECD64F952FBD1C273684
    @Test
    void testSetSelectorWithNull() {
        V1ScaleStatus scaleStatus = new V1ScaleStatus();
        scaleStatus.setSelector(null);
        assertThat(scaleStatus.getSelector(), is(equalTo(null)));
    }
}
