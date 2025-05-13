package io.kubernetes.client.openapi.models;

import java.util.List;
import io.kubernetes.client.openapi.models.V1beta1DeviceRequest;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.openapi.models.V1beta1DeviceSelector;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1DeviceRequestBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1beta1DeviceRequestConstructor}, hash: E8B1B8EB351AE96EB6E9C06ED66F45FC
    @Test
    void testV1beta1DeviceRequestConstructor() {
        V1beta1DeviceRequest deviceRequest = new V1beta1DeviceRequest();
        assertThat(deviceRequest, is(notNullValue()));
    }

    //BaseRock generated method id: ${testAdminAccess}, hash: 512DEE0D84A63C2C2128E7FA3F8DC7BC
    @Test
    void testAdminAccess() {
        V1beta1DeviceRequest deviceRequest = new V1beta1DeviceRequest();
        assertNull(deviceRequest.getAdminAccess());
        deviceRequest.setAdminAccess(true);
        assertTrue(deviceRequest.getAdminAccess());
        deviceRequest.setAdminAccess(false);
        assertFalse(deviceRequest.getAdminAccess());
    }

    //BaseRock generated method id: ${testAllocationMode}, hash: 3C7A1692742CFAF2C631194B9B0AAA77
    @Test
    void testAllocationMode() {
        V1beta1DeviceRequest deviceRequest = new V1beta1DeviceRequest();
        assertNull(deviceRequest.getAllocationMode());
        String allocationMode = "ExactCount";
        deviceRequest.setAllocationMode(allocationMode);
        assertEquals(allocationMode, deviceRequest.getAllocationMode());
    }

    //BaseRock generated method id: ${testCount}, hash: F3E59D79388C4658B15DFC4BBDB12A04
    @Test
    void testCount() {
        V1beta1DeviceRequest deviceRequest = new V1beta1DeviceRequest();
        assertNull(deviceRequest.getCount());
        Long count = 5L;
        deviceRequest.setCount(count);
        assertEquals(count, deviceRequest.getCount());
    }

    //BaseRock generated method id: ${testDeviceClassName}, hash: A5D77664F75C305531598E588A8EBFC4
    @Test
    void testDeviceClassName() {
        V1beta1DeviceRequest deviceRequest = new V1beta1DeviceRequest();
        assertNull(deviceRequest.getDeviceClassName());
        String deviceClassName = "TestDeviceClass";
        deviceRequest.setDeviceClassName(deviceClassName);
        assertEquals(deviceClassName, deviceRequest.getDeviceClassName());
    }

    //BaseRock generated method id: ${testName}, hash: 269D2B46AAF0043609CD8B643F718F09
    @Test
    void testName() {
        V1beta1DeviceRequest deviceRequest = new V1beta1DeviceRequest();
        assertNull(deviceRequest.getName());
        String name = "TestDeviceRequest";
        deviceRequest.setName(name);
        assertEquals(name, deviceRequest.getName());
    }

    //BaseRock generated method id: ${testSelectors}, hash: 7B1DF0777672A59DE215BCFA2BF0088D
    @Test
    void testSelectors() {
        V1beta1DeviceRequest deviceRequest = new V1beta1DeviceRequest();
        assertThat(deviceRequest.getSelectors(), is(empty()));
        List<V1beta1DeviceSelector> selectors = new ArrayList<>();
        V1beta1DeviceSelector selector = mock(V1beta1DeviceSelector.class);
        selectors.add(selector);
        deviceRequest.setSelectors(selectors);
        assertThat(deviceRequest.getSelectors(), hasSize(1));
        assertEquals(selectors, deviceRequest.getSelectors());
    }

    //BaseRock generated method id: ${testAddSelectorsItem}, hash: C2FE419F1CA9CF8DFECC89DF840228A0
    @Test
    void testAddSelectorsItem() {
        V1beta1DeviceRequest deviceRequest = new V1beta1DeviceRequest();
        V1beta1DeviceSelector selector = mock(V1beta1DeviceSelector.class);
        deviceRequest.addSelectorsItem(selector);
        assertThat(deviceRequest.getSelectors(), hasSize(1));
        assertEquals(selector, deviceRequest.getSelectors().get(0));
    }

    //BaseRock generated method id: ${testAdminAccessFluent}, hash: C3C56BC4E33FA497E30665443A0116B3
    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    void testAdminAccessFluent(boolean adminAccess) {
        V1beta1DeviceRequest deviceRequest = new V1beta1DeviceRequest().adminAccess(adminAccess);
        assertEquals(adminAccess, deviceRequest.getAdminAccess());
    }

    //BaseRock generated method id: ${testAllocationModeFluent}, hash: 81B7ABE5C42AF059F9C8EE02DA7A30E9
    @Test
    void testAllocationModeFluent() {
        String allocationMode = "All";
        V1beta1DeviceRequest deviceRequest = new V1beta1DeviceRequest().allocationMode(allocationMode);
        assertEquals(allocationMode, deviceRequest.getAllocationMode());
    }

    //BaseRock generated method id: ${testCountFluent}, hash: 78A671ABB39EFC35F0884B3A77CD45B6
    @Test
    void testCountFluent() {
        Long count = 10L;
        V1beta1DeviceRequest deviceRequest = new V1beta1DeviceRequest().count(count);
        assertEquals(count, deviceRequest.getCount());
    }

    //BaseRock generated method id: ${testDeviceClassNameFluent}, hash: EF70D1536D910BEBA159E0E05BACCB8C
    @Test
    void testDeviceClassNameFluent() {
        String deviceClassName = "FluentDeviceClass";
        V1beta1DeviceRequest deviceRequest = new V1beta1DeviceRequest().deviceClassName(deviceClassName);
        assertEquals(deviceClassName, deviceRequest.getDeviceClassName());
    }

    //BaseRock generated method id: ${testNameFluent}, hash: 20826FA6D1820EE0BF58E0BFB19B1492
    @Test
    void testNameFluent() {
        String name = "FluentDeviceRequest";
        V1beta1DeviceRequest deviceRequest = new V1beta1DeviceRequest().name(name);
        assertEquals(name, deviceRequest.getName());
    }

    //BaseRock generated method id: ${testSelectorsFluent}, hash: 0725F8431CDA41DD7B8088D9B8337099
    @Test
    void testSelectorsFluent() {
        List<V1beta1DeviceSelector> selectors = new ArrayList<>();
        V1beta1DeviceSelector selector = mock(V1beta1DeviceSelector.class);
        selectors.add(selector);
        V1beta1DeviceRequest deviceRequest = new V1beta1DeviceRequest().selectors(selectors);
        assertThat(deviceRequest.getSelectors(), hasSize(1));
        assertEquals(selectors, deviceRequest.getSelectors());
    }

    //BaseRock generated method id: ${testEquals}, hash: 0A542289A00691D1D29BE0EBB16D0E01
    @Test
    void testEquals() {
        V1beta1DeviceRequest request1 = new V1beta1DeviceRequest().adminAccess(true).allocationMode("ExactCount").count(5L).deviceClassName("TestClass").name("Request1");
        V1beta1DeviceRequest request2 = new V1beta1DeviceRequest().adminAccess(true).allocationMode("ExactCount").count(5L).deviceClassName("TestClass").name("Request1");
        V1beta1DeviceRequest request3 = new V1beta1DeviceRequest().adminAccess(false).allocationMode("All").count(10L).deviceClassName("AnotherClass").name("Request2");
        assertAll(() -> assertTrue(request1.equals(request2)), () -> assertTrue(request2.equals(request1)), () -> assertFalse(request1.equals(request3)), () -> assertFalse(request3.equals(request1)), () -> assertFalse(request1.equals(null)), () -> assertFalse(request1.equals(new Object())));
    }

    //BaseRock generated method id: ${testHashCode}, hash: EDA73BA071136C71DC00027D4BDDAC82
    @Test
    void testHashCode() {
        V1beta1DeviceRequest request1 = new V1beta1DeviceRequest().adminAccess(true).allocationMode("ExactCount").count(5L).deviceClassName("TestClass").name("Request1");
        V1beta1DeviceRequest request2 = new V1beta1DeviceRequest().adminAccess(true).allocationMode("ExactCount").count(5L).deviceClassName("TestClass").name("Request1");
        V1beta1DeviceRequest request3 = new V1beta1DeviceRequest().adminAccess(false).allocationMode("All").count(10L).deviceClassName("AnotherClass").name("Request2");
        assertAll(() -> assertEquals(request1.hashCode(), request2.hashCode()), () -> assertNotEquals(request1.hashCode(), request3.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 4B8F2D5A7FE40B3787486035080F4FB2
    @Test
    void testToString() {
        V1beta1DeviceRequest deviceRequest = new V1beta1DeviceRequest().adminAccess(true).allocationMode("ExactCount").count(5L).deviceClassName("TestClass").name("TestRequest");
        String expectedString = "class V1beta1DeviceRequest {\n" + "    adminAccess: true\n" + "    allocationMode: ExactCount\n" + "    count: 5\n" + "    deviceClassName: TestClass\n" + "    name: TestRequest\n" + "    selectors: []\n" + "}";
        assertEquals(expectedString, deviceRequest.toString());
    }
}
