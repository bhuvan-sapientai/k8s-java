package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.mockito.Mock;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha3AllocationResultBaseRockGeneratedTest {

    private V1alpha3AllocationResult allocationResult;

    @Mock
    private V1alpha3DeviceAllocationResult mockDevices;

    @Mock
    private V1NodeSelector mockNodeSelector;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        allocationResult = new V1alpha3AllocationResult();
    }

    //BaseRock generated method id: ${testDevices}, hash: 476AA1E0A56E8EE99D75EA79140035FB
    @Test
    void testDevices() {
        allocationResult.setDevices(mockDevices);
        assertEquals(mockDevices, allocationResult.getDevices());
    }

    //BaseRock generated method id: ${testNodeSelector}, hash: 0ADF944B4ED6DB7A43E243AE77E66C1C
    @Test
    void testNodeSelector() {
        allocationResult.setNodeSelector(mockNodeSelector);
        assertEquals(mockNodeSelector, allocationResult.getNodeSelector());
    }

    //BaseRock generated method id: ${testEquals}, hash: C278CD7C00B5736368CE72CE0B451684
    @Test
    void testEquals() {
        V1alpha3AllocationResult other = new V1alpha3AllocationResult().devices(mockDevices).nodeSelector(mockNodeSelector);
        allocationResult.setDevices(mockDevices);
        allocationResult.setNodeSelector(mockNodeSelector);
        assertTrue(allocationResult.equals(other));
        assertTrue(allocationResult.equals(allocationResult));
        assertFalse(allocationResult.equals(null));
        assertFalse(allocationResult.equals(new Object()));
    }

    //BaseRock generated method id: ${testHashCode}, hash: D1AE52531E74BD90090414BE31438EA5
    @Test
    void testHashCode() {
        allocationResult.setDevices(mockDevices);
        allocationResult.setNodeSelector(mockNodeSelector);
        V1alpha3AllocationResult other = new V1alpha3AllocationResult().devices(mockDevices).nodeSelector(mockNodeSelector);
        assertEquals(allocationResult.hashCode(), other.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 9E7B9CF9B4A8246655E9FD306114BBD1
    @Test
    void testToString() {
        allocationResult.setDevices(mockDevices);
        allocationResult.setNodeSelector(mockNodeSelector);
        String result = allocationResult.toString();
        assertTrue(result.contains("devices"));
        assertTrue(result.contains("nodeSelector"));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 6EF8DE5471A56504A440D744E8685A22
    @Test
    void testBuilder() {
        V1alpha3AllocationResult built = new V1alpha3AllocationResult().devices(mockDevices).nodeSelector(mockNodeSelector);
        assertEquals(mockDevices, built.getDevices());
        assertEquals(mockNodeSelector, built.getNodeSelector());
    }
}
