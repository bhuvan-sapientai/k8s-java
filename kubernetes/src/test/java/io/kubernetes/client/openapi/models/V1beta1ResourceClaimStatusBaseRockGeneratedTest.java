package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1beta1AllocatedDeviceStatus;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1beta1AllocationResult;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.empty;
import java.util.ArrayList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import io.kubernetes.client.openapi.models.V1beta1ResourceClaimConsumerReference;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1ResourceClaimStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: D92C007A0C8A6477592B2537330751AC
    @Test
    void testConstructor() {
        V1beta1ResourceClaimStatus status = new V1beta1ResourceClaimStatus();
        assertNotNull(status);
        assertThat(status.getAllocation(), is(nullValue()));
        assertThat(status.getDevices(), is(empty()));
        assertThat(status.getReservedFor(), is(empty()));
    }

    //BaseRock generated method id: ${testSetAndGetAllocation}, hash: 0350598D37D89433A309C59F8443BE82
    @Test
    void testSetAndGetAllocation() {
        V1beta1ResourceClaimStatus status = new V1beta1ResourceClaimStatus();
        V1beta1AllocationResult allocation = mock(V1beta1AllocationResult.class);
        status.setAllocation(allocation);
        assertEquals(allocation, status.getAllocation());
    }

    //BaseRock generated method id: ${testSetAndGetDevices}, hash: CCDDB02A38FFD87DC41E586F96E5A7E9
    @Test
    void testSetAndGetDevices() {
        V1beta1ResourceClaimStatus status = new V1beta1ResourceClaimStatus();
        List<V1beta1AllocatedDeviceStatus> devices = new ArrayList<>();
        V1beta1AllocatedDeviceStatus device = mock(V1beta1AllocatedDeviceStatus.class);
        devices.add(device);
        status.setDevices(devices);
        assertEquals(devices, status.getDevices());
    }

    //BaseRock generated method id: ${testAddDevicesItem}, hash: C978F89C1583C7D08278A997BC65707D
    @Test
    void testAddDevicesItem() {
        V1beta1ResourceClaimStatus status = new V1beta1ResourceClaimStatus();
        V1beta1AllocatedDeviceStatus device = mock(V1beta1AllocatedDeviceStatus.class);
        status.addDevicesItem(device);
        assertThat(status.getDevices(), hasSize(1));
        assertThat(status.getDevices().get(0), is(equalTo(device)));
    }

    //BaseRock generated method id: ${testSetAndGetReservedFor}, hash: 2B31C33C5C9E1AB5D7096A73F5AA3E8F
    @Test
    void testSetAndGetReservedFor() {
        V1beta1ResourceClaimStatus status = new V1beta1ResourceClaimStatus();
        List<V1beta1ResourceClaimConsumerReference> reservedFor = new ArrayList<>();
        V1beta1ResourceClaimConsumerReference reference = mock(V1beta1ResourceClaimConsumerReference.class);
        reservedFor.add(reference);
        status.setReservedFor(reservedFor);
        assertEquals(reservedFor, status.getReservedFor());
    }

    //BaseRock generated method id: ${testAddReservedForItem}, hash: 4CD1C52A46C78A5CA4AA2530E495DD11
    @Test
    void testAddReservedForItem() {
        V1beta1ResourceClaimStatus status = new V1beta1ResourceClaimStatus();
        V1beta1ResourceClaimConsumerReference reference = mock(V1beta1ResourceClaimConsumerReference.class);
        status.addReservedForItem(reference);
        assertThat(status.getReservedFor(), hasSize(1));
        assertThat(status.getReservedFor().get(0), is(equalTo(reference)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 2717C3CCEB7E1659E201B5D594A3ED54
    @Test
    void testEquals() {
        V1beta1ResourceClaimStatus status1 = new V1beta1ResourceClaimStatus();
        V1beta1ResourceClaimStatus status2 = new V1beta1ResourceClaimStatus();
        V1beta1AllocationResult allocation = mock(V1beta1AllocationResult.class);
        status1.setAllocation(allocation);
        status2.setAllocation(allocation);
        List<V1beta1AllocatedDeviceStatus> devices = new ArrayList<>();
        V1beta1AllocatedDeviceStatus device = mock(V1beta1AllocatedDeviceStatus.class);
        devices.add(device);
        status1.setDevices(devices);
        status2.setDevices(devices);
        List<V1beta1ResourceClaimConsumerReference> reservedFor = new ArrayList<>();
        V1beta1ResourceClaimConsumerReference reference = mock(V1beta1ResourceClaimConsumerReference.class);
        reservedFor.add(reference);
        status1.setReservedFor(reservedFor);
        status2.setReservedFor(reservedFor);
        assertThat(status1, is(equalTo(status2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 78D3E55991F9443C93A9723A59140FA3
    @Test
    void testHashCode() {
        V1beta1ResourceClaimStatus status1 = new V1beta1ResourceClaimStatus();
        V1beta1ResourceClaimStatus status2 = new V1beta1ResourceClaimStatus();
        V1beta1AllocationResult allocation = mock(V1beta1AllocationResult.class);
        status1.setAllocation(allocation);
        status2.setAllocation(allocation);
        List<V1beta1AllocatedDeviceStatus> devices = new ArrayList<>();
        V1beta1AllocatedDeviceStatus device = mock(V1beta1AllocatedDeviceStatus.class);
        devices.add(device);
        status1.setDevices(devices);
        status2.setDevices(devices);
        List<V1beta1ResourceClaimConsumerReference> reservedFor = new ArrayList<>();
        V1beta1ResourceClaimConsumerReference reference = mock(V1beta1ResourceClaimConsumerReference.class);
        reservedFor.add(reference);
        status1.setReservedFor(reservedFor);
        status2.setReservedFor(reservedFor);
        assertEquals(status1.hashCode(), status2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 9B56383FE3B2C6311586FA972B3865BD
    @Test
    void testToString() {
        V1beta1ResourceClaimStatus status = new V1beta1ResourceClaimStatus();
        V1beta1AllocationResult allocation = mock(V1beta1AllocationResult.class);
        when(allocation.toString()).thenReturn("AllocationResult");
        status.setAllocation(allocation);
        List<V1beta1AllocatedDeviceStatus> devices = new ArrayList<>();
        V1beta1AllocatedDeviceStatus device = mock(V1beta1AllocatedDeviceStatus.class);
        when(device.toString()).thenReturn("DeviceStatus");
        devices.add(device);
        status.setDevices(devices);
        List<V1beta1ResourceClaimConsumerReference> reservedFor = new ArrayList<>();
        V1beta1ResourceClaimConsumerReference reference = mock(V1beta1ResourceClaimConsumerReference.class);
        when(reference.toString()).thenReturn("ConsumerReference");
        reservedFor.add(reference);
        status.setReservedFor(reservedFor);
        String result = status.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result, containsString("allocation: AllocationResult"));
        assertThat(result, containsString("devices: [DeviceStatus]"));
        assertThat(result, containsString("reservedFor: [ConsumerReference]"));
    }
}
