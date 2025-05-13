package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1UncountedTerminatedPods;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.hamcrest.Matchers.empty;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1UncountedTerminatedPodsBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: D33076C38B060C9528E00CA66F281C0D
    @Test
    void testConstructor() {
        V1UncountedTerminatedPods pods = new V1UncountedTerminatedPods();
        assertThat(pods, is(notNullValue()));
        assertThat(pods.getFailed(), is(empty()));
        assertThat(pods.getSucceeded(), is(empty()));
    }

    //BaseRock generated method id: ${testFailedSetter}, hash: 56CBA69D2238C23A3B2476E2E32AC3EC
    @Test
    void testFailedSetter() {
        V1UncountedTerminatedPods pods = new V1UncountedTerminatedPods();
        List<String> failed = Arrays.asList("pod1", "pod2");
        pods.setFailed(failed);
        assertEquals(failed, pods.getFailed());
    }

    //BaseRock generated method id: ${testSucceededSetter}, hash: 8CE43A876C099B9DEC60BAC8CBFAA95F
    @Test
    void testSucceededSetter() {
        V1UncountedTerminatedPods pods = new V1UncountedTerminatedPods();
        List<String> succeeded = Arrays.asList("pod3", "pod4");
        pods.setSucceeded(succeeded);
        assertEquals(succeeded, pods.getSucceeded());
    }

    //BaseRock generated method id: ${testAddFailedItem}, hash: 8C481B4DB9F5B70ED80B2F44B5EE0AD9
    @Test
    void testAddFailedItem() {
        V1UncountedTerminatedPods pods = new V1UncountedTerminatedPods();
        pods.addFailedItem("pod1");
        assertThat(pods.getFailed(), hasSize(1));
        assertThat(pods.getFailed(), containsInAnyOrder("pod1"));
    }

    //BaseRock generated method id: ${testAddSucceededItem}, hash: 03D25B20CBACA58A1586E49DB5260E38
    @Test
    void testAddSucceededItem() {
        V1UncountedTerminatedPods pods = new V1UncountedTerminatedPods();
        pods.addSucceededItem("pod2");
        assertThat(pods.getSucceeded(), hasSize(1));
        assertThat(pods.getSucceeded(), containsInAnyOrder("pod2"));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 554E8FE1E559EC5F3A16D996588DB3A1
    @Test
    void testEqualsWithSameObject() {
        V1UncountedTerminatedPods pods = new V1UncountedTerminatedPods();
        assertTrue(pods.equals(pods));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 7213D92F56122F70A394E823CC883F91
    @Test
    void testEqualsWithDifferentObject() {
        V1UncountedTerminatedPods pods1 = new V1UncountedTerminatedPods();
        V1UncountedTerminatedPods pods2 = new V1UncountedTerminatedPods();
        assertTrue(pods1.equals(pods2));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentValues}, hash: 590E57880E36F36FCC90500A7C358927
    @Test
    void testEqualsWithDifferentValues() {
        V1UncountedTerminatedPods pods1 = new V1UncountedTerminatedPods().failed(Arrays.asList("pod1"));
        V1UncountedTerminatedPods pods2 = new V1UncountedTerminatedPods().failed(Arrays.asList("pod2"));
        assertFalse(pods1.equals(pods2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 486DD50BBD04F111FE5F550358F970E4
    @Test
    void testHashCode() {
        V1UncountedTerminatedPods pods1 = new V1UncountedTerminatedPods().failed(Arrays.asList("pod1")).succeeded(Arrays.asList("pod2"));
        V1UncountedTerminatedPods pods2 = new V1UncountedTerminatedPods().failed(Arrays.asList("pod1")).succeeded(Arrays.asList("pod2"));
        V1UncountedTerminatedPods pods3 = new V1UncountedTerminatedPods().failed(Arrays.asList("pod3")).succeeded(Arrays.asList("pod4"));
        assertEquals(pods1.hashCode(), pods2.hashCode());
        assertNotEquals(pods1.hashCode(), pods3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 73F32A58CCF88C1AA71EFB9FC4EC345B
    @Test
    void testToString() {
        V1UncountedTerminatedPods pods = new V1UncountedTerminatedPods().failed(Arrays.asList("pod1", "pod2")).succeeded(Arrays.asList("pod3", "pod4"));
        String expected = "class V1UncountedTerminatedPods {\n    failed: [pod1, pod2]\n    succeeded: [pod3, pod4]\n}";
        assertEquals(expected, pods.toString());
    }

    //BaseRock generated method id: ${testAddMultipleFailedItems}, hash: BA311E946B4CDB95C1D794733DE7D0AA
    @ParameterizedTest
    @ValueSource(strings = { "pod1", "pod2", "pod3" })
    void testAddMultipleFailedItems(String podName) {
        V1UncountedTerminatedPods pods = new V1UncountedTerminatedPods();
        pods.addFailedItem(podName);
        assertTrue(pods.getFailed().contains(podName));
    }

    //BaseRock generated method id: ${testAddMultipleSucceededItems}, hash: 42FC051BE517BAB64A2BC3D88A4CAE50
    @ParameterizedTest
    @ValueSource(strings = { "pod4", "pod5", "pod6" })
    void testAddMultipleSucceededItems(String podName) {
        V1UncountedTerminatedPods pods = new V1UncountedTerminatedPods();
        pods.addSucceededItem(podName);
        assertTrue(pods.getSucceeded().contains(podName));
    }

    //BaseRock generated method id: ${testFailedWithNullList}, hash: 09303D884F7F0435528E284DEF805C3C
    @Disabled()
    @Test
    void testFailedWithNullList() {
        V1UncountedTerminatedPods pods = new V1UncountedTerminatedPods();
        pods.setFailed(null);
        assertThat(pods.getFailed(), is(notNullValue()));
        assertThat(pods.getFailed(), is(empty()));
    }

    //BaseRock generated method id: ${testSucceededWithNullList}, hash: 6E18E0AEC3BF1739F395E55672B53694
    @Disabled()
    @Test
    void testSucceededWithNullList() {
        V1UncountedTerminatedPods pods = new V1UncountedTerminatedPods();
        pods.setSucceeded(null);
        assertThat(pods.getSucceeded(), is(notNullValue()));
        assertThat(pods.getSucceeded(), is(empty()));
    }

    //BaseRock generated method id: ${testAddFailedItemToNullList}, hash: E5F71EF172CE8B9EF33CF6CE42BEDB87
    @Test
    void testAddFailedItemToNullList() {
        V1UncountedTerminatedPods pods = new V1UncountedTerminatedPods();
        pods.setFailed(null);
        pods.addFailedItem("pod1");
        assertThat(pods.getFailed(), hasSize(1));
        assertThat(pods.getFailed(), containsInAnyOrder("pod1"));
    }

    //BaseRock generated method id: ${testAddSucceededItemToNullList}, hash: AFDE90E9521806A2C38D5A755474FFBE
    @Test
    void testAddSucceededItemToNullList() {
        V1UncountedTerminatedPods pods = new V1UncountedTerminatedPods();
        pods.setSucceeded(null);
        pods.addSucceededItem("pod1");
        assertThat(pods.getSucceeded(), hasSize(1));
        assertThat(pods.getSucceeded(), containsInAnyOrder("pod1"));
    }

    //BaseRock generated method id: ${testFailedWithEmptyList}, hash: CB38BACE0A71B7278FB3D757672FD75E
    @Test
    void testFailedWithEmptyList() {
        V1UncountedTerminatedPods pods = new V1UncountedTerminatedPods();
        pods.setFailed(new ArrayList<>());
        assertThat(pods.getFailed(), is(empty()));
    }

    //BaseRock generated method id: ${testSucceededWithEmptyList}, hash: A9D7AF549D376FA338BDAE2E3A511651
    @Test
    void testSucceededWithEmptyList() {
        V1UncountedTerminatedPods pods = new V1UncountedTerminatedPods();
        pods.setSucceeded(new ArrayList<>());
        assertThat(pods.getSucceeded(), is(empty()));
    }
}
