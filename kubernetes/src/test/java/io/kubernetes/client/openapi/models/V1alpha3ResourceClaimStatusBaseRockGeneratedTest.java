package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1alpha3AllocatedDeviceStatus;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1alpha3AllocationResult;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1alpha3ResourceClaimConsumerReference;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha3ResourceClaimStatusBaseRockGeneratedTest {

    private V1alpha3ResourceClaimStatus resourceClaimStatus;

    @BeforeEach
    void setUp() {
        resourceClaimStatus = new V1alpha3ResourceClaimStatus();
    }

    //BaseRock generated method id: ${testAllocation}, hash: F79DB7C4F8C5756F695CBBDE6F3614FD
    @Test
    void testAllocation() {
        V1alpha3AllocationResult mockAllocation = mock(V1alpha3AllocationResult.class);
        resourceClaimStatus.setAllocation(mockAllocation);
        assertEquals(mockAllocation, resourceClaimStatus.getAllocation());
    }

    //BaseRock generated method id: ${testDevices}, hash: 3DAC3F917E1F00B34F9703593889B2CA
    @Test
    void testDevices() {
        List<V1alpha3AllocatedDeviceStatus> devices = new ArrayList<>();
        V1alpha3AllocatedDeviceStatus mockDevice = mock(V1alpha3AllocatedDeviceStatus.class);
        devices.add(mockDevice);
        resourceClaimStatus.setDevices(devices);
        assertEquals(devices, resourceClaimStatus.getDevices());
        assertThat(resourceClaimStatus.getDevices(), hasSize(1));
    }

    //BaseRock generated method id: ${testReservedFor}, hash: 72D3721B7FF03C0B5324AAEA12863FB1
    @Test
    void testReservedFor() {
        List<V1alpha3ResourceClaimConsumerReference> reservedFor = new ArrayList<>();
        V1alpha3ResourceClaimConsumerReference mockConsumer = mock(V1alpha3ResourceClaimConsumerReference.class);
        reservedFor.add(mockConsumer);
        resourceClaimStatus.setReservedFor(reservedFor);
        assertEquals(reservedFor, resourceClaimStatus.getReservedFor());
        assertThat(resourceClaimStatus.getReservedFor(), hasSize(1));
    }

    //BaseRock generated method id: ${testAddDevicesItem}, hash: 442DAFE6A5D365BD5E7843281C1C6332
    @Test
    void testAddDevicesItem() {
        V1alpha3AllocatedDeviceStatus mockDevice = mock(V1alpha3AllocatedDeviceStatus.class);
        resourceClaimStatus.addDevicesItem(mockDevice);
        assertThat(resourceClaimStatus.getDevices(), hasSize(1));
        assertEquals(mockDevice, resourceClaimStatus.getDevices().get(0));
    }

    //BaseRock generated method id: ${testAddReservedForItem}, hash: 00289DE4D4C69F9B3DD5323CD6F479D6
    @Test
    void testAddReservedForItem() {
        V1alpha3ResourceClaimConsumerReference mockConsumer = mock(V1alpha3ResourceClaimConsumerReference.class);
        resourceClaimStatus.addReservedForItem(mockConsumer);
        assertThat(resourceClaimStatus.getReservedFor(), hasSize(1));
        assertEquals(mockConsumer, resourceClaimStatus.getReservedFor().get(0));
    }

    //BaseRock generated method id: ${testEquals}, hash: 0EBBF1EDD56573D3662077B89AEEB7E4
    @Test
    void testEquals() {
        V1alpha3ResourceClaimStatus status1 = new V1alpha3ResourceClaimStatus();
        V1alpha3ResourceClaimStatus status2 = new V1alpha3ResourceClaimStatus();
        assertThat(status1.equals(status2), is(true));
        V1alpha3AllocationResult mockAllocation = mock(V1alpha3AllocationResult.class);
        status1.setAllocation(mockAllocation);
        assertThat(status1.equals(status2), is(false));
        status2.setAllocation(mockAllocation);
        assertThat(status1.equals(status2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: A1279D117AB34441B2BF7763D8DBAEC6
    @Test
    void testHashCode() {
        V1alpha3ResourceClaimStatus status1 = new V1alpha3ResourceClaimStatus();
        V1alpha3ResourceClaimStatus status2 = new V1alpha3ResourceClaimStatus();
        assertThat(status1.hashCode(), equalTo(status2.hashCode()));
        V1alpha3AllocationResult mockAllocation = mock(V1alpha3AllocationResult.class);
        status1.setAllocation(mockAllocation);
        assertThat(status1.hashCode(), is(not(equalTo(status2.hashCode()))));
        status2.setAllocation(mockAllocation);
        assertThat(status1.hashCode(), equalTo(status2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 88390B61744C48F72F7137EABBEEFB90
    @Test
    void testToString() {
        V1alpha3ResourceClaimStatus status = new V1alpha3ResourceClaimStatus();
        V1alpha3AllocationResult mockAllocation = mock(V1alpha3AllocationResult.class);
        status.setAllocation(mockAllocation);
        String result = status.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("allocation"), is(true));
        assertThat(result.contains("devices"), is(true));
        assertThat(result.contains("reservedFor"), is(true));
    }

    //BaseRock generated method id: ${testConstructor}, hash: DB115CC298F1AF980763A863010A68A8
    @Test
    void testConstructor() {
        V1alpha3ResourceClaimStatus status = new V1alpha3ResourceClaimStatus();
        assertNotNull(status);
        assertThat(status.getAllocation(), is(nullValue()));
        assertThat(status.getDevices(), is(notNullValue()));
        assertThat(status.getDevices(), hasSize(0));
        assertThat(status.getReservedFor(), is(notNullValue()));
        assertThat(status.getReservedFor(), hasSize(0));
    }
}
