package io.kubernetes.client.openapi.models;

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
import org.junit.jupiter.params.provider.CsvSource;
import io.kubernetes.client.openapi.models.V1ContainerResizePolicy;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ContainerResizePolicyBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: BEA1C3A4CAA6B8B7D9E9CDDF98AE0EF2
    @Test
    void testConstructor() {
        V1ContainerResizePolicy policy = new V1ContainerResizePolicy();
        assertThat(policy, is(notNullValue()));
    }

    //BaseRock generated method id: ${testResourceName}, hash: BA86EDF836769B37AB27953686C6008D
    @Test
    void testResourceName() {
        V1ContainerResizePolicy policy = new V1ContainerResizePolicy();
        policy.setResourceName("cpu");
        assertThat(policy.getResourceName(), is(equalTo("cpu")));
    }

    //BaseRock generated method id: ${testRestartPolicy}, hash: F64C0D67C1FCA76166B9AE719F6DD543
    @Test
    void testRestartPolicy() {
        V1ContainerResizePolicy policy = new V1ContainerResizePolicy();
        policy.setRestartPolicy("NotRequired");
        assertThat(policy.getRestartPolicy(), is(equalTo("NotRequired")));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 5A3CC5F39DDA60D0379315599477AA03
    @ParameterizedTest
    @CsvSource({ "cpu, NotRequired", "memory, Required" })
    void testBuilderPattern(String resourceName, String restartPolicy) {
        V1ContainerResizePolicy policy = new V1ContainerResizePolicy().resourceName(resourceName).restartPolicy(restartPolicy);
        assertThat(policy.getResourceName(), is(equalTo(resourceName)));
        assertThat(policy.getRestartPolicy(), is(equalTo(restartPolicy)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 148A754A7853693E24BE3B1C3F26CCE6
    @Test
    void testEqualsAndHashCode() {
        V1ContainerResizePolicy policy1 = new V1ContainerResizePolicy().resourceName("cpu").restartPolicy("NotRequired");
        V1ContainerResizePolicy policy2 = new V1ContainerResizePolicy().resourceName("cpu").restartPolicy("NotRequired");
        V1ContainerResizePolicy policy3 = new V1ContainerResizePolicy().resourceName("memory").restartPolicy("Required");
        assertThat(policy1.equals(policy2), is(true));
        assertThat(policy1.equals(policy3), is(false));
        assertThat(policy1.hashCode(), is(equalTo(policy2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 31A284902209296394A91EAA7CF17795
    @Test
    void testToString() {
        V1ContainerResizePolicy policy = new V1ContainerResizePolicy().resourceName("cpu").restartPolicy("NotRequired");
        String expected = "class V1ContainerResizePolicy {\n    resourceName: cpu\n    restartPolicy: NotRequired\n}";
        assertThat(policy.toString(), is(equalTo(expected)));
    }

    //BaseRock generated method id: ${testSetNullResourceName}, hash: 96AF7B311D8FDA8DD6D28DE08EC59954
    @Test
    void testSetNullResourceName() {
        V1ContainerResizePolicy policy = new V1ContainerResizePolicy();
        policy.setResourceName(null);
        assertThat(policy.getResourceName(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetNullRestartPolicy}, hash: FE9B2F8AFA85F68DCCE16F6FA49E7C93
    @Test
    void testSetNullRestartPolicy() {
        V1ContainerResizePolicy policy = new V1ContainerResizePolicy();
        policy.setRestartPolicy(null);
        assertThat(policy.getRestartPolicy(), is(equalTo(null)));
    }
}
