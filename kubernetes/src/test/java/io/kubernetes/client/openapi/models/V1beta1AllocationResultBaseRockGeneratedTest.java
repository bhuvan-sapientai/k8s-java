package io.kubernetes.client.openapi.models;

import static org.junit.jupiter.api.Assertions.assertAll;
import io.kubernetes.client.openapi.models.V1NodeSelector;
import io.kubernetes.client.openapi.models.V1beta1DeviceAllocationResult;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import io.kubernetes.client.openapi.models.V1beta1AllocationResult;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1AllocationResultBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: DFA97A403E92073E4133C171969DEC5D
    @Test
    void testConstructor() {
        V1beta1AllocationResult result = new V1beta1AllocationResult();
        assertThat(result, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetDevices}, hash: A03E3ABFA60ADB6264AC4DD9E400F63A
    @Test
    void testSetAndGetDevices() {
        V1beta1AllocationResult result = new V1beta1AllocationResult();
        V1beta1DeviceAllocationResult devices = mock(V1beta1DeviceAllocationResult.class);
        result.setDevices(devices);
        assertThat(result.getDevices(), is(equalTo(devices)));
    }

    //BaseRock generated method id: ${testSetDevicesWithDifferentValues}, hash: 246F0E87E0BFF878B070446D272BDD37
    @ParameterizedTest
    @NullSource
    @ValueSource(strings = { "device1", "device2" })
    void testSetDevicesWithDifferentValues(String deviceName) {
        V1beta1AllocationResult result = new V1beta1AllocationResult();
        V1beta1DeviceAllocationResult devices = mock(V1beta1DeviceAllocationResult.class);
        result.setDevices(devices);
        assertThat(result.getDevices(), is(equalTo(devices)));
    }

    //BaseRock generated method id: ${testSetAndGetNodeSelector}, hash: 8A14D98FA68B2A0CB9F84D500077F412
    @Test
    void testSetAndGetNodeSelector() {
        V1beta1AllocationResult result = new V1beta1AllocationResult();
        V1NodeSelector nodeSelector = mock(V1NodeSelector.class);
        result.setNodeSelector(nodeSelector);
        assertThat(result.getNodeSelector(), is(equalTo(nodeSelector)));
    }

    //BaseRock generated method id: ${testSetNodeSelectorWithDifferentValues}, hash: 0D4A12845E535B7F0070BC9E9ED61D99
    @ParameterizedTest
    @NullSource
    @ValueSource(strings = { "selector1", "selector2" })
    void testSetNodeSelectorWithDifferentValues(String selectorName) {
        V1beta1AllocationResult result = new V1beta1AllocationResult();
        V1NodeSelector nodeSelector = mock(V1NodeSelector.class);
        result.setNodeSelector(nodeSelector);
        assertThat(result.getNodeSelector(), is(equalTo(nodeSelector)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 4FED327502B3065759AC8AA6EC3CC8AC
    @Test
    void testEqualsAndHashCode() {
        V1beta1AllocationResult result1 = new V1beta1AllocationResult();
        V1beta1AllocationResult result2 = new V1beta1AllocationResult();
        V1beta1DeviceAllocationResult devices = mock(V1beta1DeviceAllocationResult.class);
        V1NodeSelector nodeSelector = mock(V1NodeSelector.class);
        result1.setDevices(devices);
        result1.setNodeSelector(nodeSelector);
        result2.setDevices(devices);
        result2.setNodeSelector(nodeSelector);
        assertAll(() -> assertThat(result1, is(equalTo(result2))), () -> assertThat(result1.hashCode(), is(equalTo(result2.hashCode()))));
    }

    //BaseRock generated method id: ${testToString}, hash: 46C327F247133BF24D2ED3F1310117A6
    @Test
    void testToString() {
        V1beta1AllocationResult result = new V1beta1AllocationResult();
        V1beta1DeviceAllocationResult devices = mock(V1beta1DeviceAllocationResult.class);
        V1NodeSelector nodeSelector = mock(V1NodeSelector.class);
        result.setDevices(devices);
        result.setNodeSelector(nodeSelector);
        String toString = result.toString();
        assertAll(() -> assertThat(toString, is(notNullValue())), () -> assertThat(toString.contains("devices"), is(true)), () -> assertThat(toString.contains("nodeSelector"), is(true)));
    }
}
