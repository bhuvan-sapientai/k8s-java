package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import io.kubernetes.client.openapi.models.V1beta1DeviceRequestAllocationResult;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1DeviceRequestAllocationResultBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 81D7FF8076B3FE549820A68D07BE8AD5
    @Test
    void testConstructor() {
        V1beta1DeviceRequestAllocationResult result = new V1beta1DeviceRequestAllocationResult();
        assertThat(result, is(notNullValue()));
    }

    //BaseRock generated method id: ${testAdminAccess}, hash: F4A9D7E5779E12EFF7884E0090BA20A9
    @Test
    void testAdminAccess() {
        V1beta1DeviceRequestAllocationResult result = new V1beta1DeviceRequestAllocationResult();
        assertNull(result.getAdminAccess());
        result.setAdminAccess(true);
        assertTrue(result.getAdminAccess());
        result.setAdminAccess(false);
        assertFalse(result.getAdminAccess());
    }

    //BaseRock generated method id: ${testDevice}, hash: 2768E3A6C014AE428B908548019B5305
    @Test
    void testDevice() {
        V1beta1DeviceRequestAllocationResult result = new V1beta1DeviceRequestAllocationResult();
        assertNull(result.getDevice());
        String device = "test-device";
        result.setDevice(device);
        assertEquals(device, result.getDevice());
    }

    //BaseRock generated method id: ${testDriver}, hash: EB6698035595A9355F4FAD10E3F8394F
    @Test
    void testDriver() {
        V1beta1DeviceRequestAllocationResult result = new V1beta1DeviceRequestAllocationResult();
        assertNull(result.getDriver());
        String driver = "test-driver";
        result.setDriver(driver);
        assertEquals(driver, result.getDriver());
    }

    //BaseRock generated method id: ${testPool}, hash: 08EA8894554FA91A6AE60617DFA059C1
    @Test
    void testPool() {
        V1beta1DeviceRequestAllocationResult result = new V1beta1DeviceRequestAllocationResult();
        assertNull(result.getPool());
        String pool = "test-pool";
        result.setPool(pool);
        assertEquals(pool, result.getPool());
    }

    //BaseRock generated method id: ${testRequest}, hash: E5A9CB3301D65B902BFBF7D400DC13C5
    @Test
    void testRequest() {
        V1beta1DeviceRequestAllocationResult result = new V1beta1DeviceRequestAllocationResult();
        assertNull(result.getRequest());
        String request = "test-request";
        result.setRequest(request);
        assertEquals(request, result.getRequest());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 306C959C6C828195C441B310E6EFD903
    @Test
    void testEqualsAndHashCode() {
        V1beta1DeviceRequestAllocationResult result1 = new V1beta1DeviceRequestAllocationResult().adminAccess(true).device("device1").driver("driver1").pool("pool1").request("request1");
        V1beta1DeviceRequestAllocationResult result2 = new V1beta1DeviceRequestAllocationResult().adminAccess(true).device("device1").driver("driver1").pool("pool1").request("request1");
        V1beta1DeviceRequestAllocationResult result3 = new V1beta1DeviceRequestAllocationResult().adminAccess(false).device("device2").driver("driver2").pool("pool2").request("request2");
        assertTrue(result1.equals(result2) && result2.equals(result1));
        assertEquals(result1.hashCode(), result2.hashCode());
        assertFalse(result1.equals(result3) || result3.equals(result1));
    }

    //BaseRock generated method id: ${testToString}, hash: BA7779FCCB6A56087251D9241366C102
    @Test
    void testToString() {
        V1beta1DeviceRequestAllocationResult result = new V1beta1DeviceRequestAllocationResult().adminAccess(true).device("testDevice").driver("testDriver").pool("testPool").request("testRequest");
        String expectedString = "class V1beta1DeviceRequestAllocationResult {\n" + "    adminAccess: true\n" + "    device: testDevice\n" + "    driver: testDriver\n" + "    pool: testPool\n" + "    request: testRequest\n" + "}";
        assertEquals(expectedString, result.toString());
    }
}
