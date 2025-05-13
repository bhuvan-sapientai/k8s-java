package io.kubernetes.client.openapi.models;

import java.util.List;
import io.kubernetes.client.openapi.models.V1alpha3DeviceRequest;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import io.kubernetes.client.openapi.models.V1alpha3DeviceSelector;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1alpha3DeviceRequestBaseRockGeneratedTest {

    private V1alpha3DeviceRequest deviceRequest;

    @BeforeEach
    void setUp() {
        deviceRequest = new V1alpha3DeviceRequest();
    }

    //BaseRock generated method id: ${testGetAdminAccess}, hash: 483FC9759EC3BBC4DA4ED7E0A80EBDAF
    @Test
    void testGetAdminAccess() {
        assertThat(deviceRequest.getAdminAccess(), is(nullValue()));
        deviceRequest.setAdminAccess(true);
        assertThat(deviceRequest.getAdminAccess(), is(true));
        deviceRequest.setAdminAccess(false);
        assertThat(deviceRequest.getAdminAccess(), is(false));
    }

    //BaseRock generated method id: ${testGetAllocationMode}, hash: 7FD846ED9BB3241BD6D8AFD5E4BF0814
    @Test
    void testGetAllocationMode() {
        assertThat(deviceRequest.getAllocationMode(), is(nullValue()));
        deviceRequest.setAllocationMode("ExactCount");
        assertThat(deviceRequest.getAllocationMode(), is("ExactCount"));
        deviceRequest.setAllocationMode("All");
        assertThat(deviceRequest.getAllocationMode(), is("All"));
    }

    //BaseRock generated method id: ${testGetCount}, hash: 8E2B75B8C4CC312ABA357D8FFDAA3444
    @Test
    void testGetCount() {
        assertThat(deviceRequest.getCount(), is(nullValue()));
        deviceRequest.setCount(5L);
        assertThat(deviceRequest.getCount(), is(5L));
        deviceRequest.setCount(0L);
        assertThat(deviceRequest.getCount(), is(0L));
    }

    //BaseRock generated method id: ${testGetDeviceClassName}, hash: FD57D0B0E3C3D2C0FE70AE7F93A5FFC9
    @Test
    void testGetDeviceClassName() {
        assertThat(deviceRequest.getDeviceClassName(), is(nullValue()));
        deviceRequest.setDeviceClassName("TestClass");
        assertThat(deviceRequest.getDeviceClassName(), is("TestClass"));
    }

    //BaseRock generated method id: ${testGetName}, hash: B8E16B0827A604553B229F3D2DB9F29D
    @Test
    void testGetName() {
        assertThat(deviceRequest.getName(), is(nullValue()));
        deviceRequest.setName("TestName");
        assertThat(deviceRequest.getName(), is("TestName"));
    }

    //BaseRock generated method id: ${testGetSelectors}, hash: FD639EAE204FA5A8B286318959321382
    @Test
    void testGetSelectors() {
        assertThat(deviceRequest.getSelectors(), is(new ArrayList<>()));
        List<V1alpha3DeviceSelector> selectors = new ArrayList<>();
        V1alpha3DeviceSelector selector = mock(V1alpha3DeviceSelector.class);
        selectors.add(selector);
        deviceRequest.setSelectors(selectors);
        assertThat(deviceRequest.getSelectors(), hasSize(1));
        assertThat(deviceRequest.getSelectors().get(0), is(selector));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: A10B4B82DDF15C79E4FAEDB30E22893A
    @Test
    void testEqualsAndHashCode() {
        V1alpha3DeviceRequest request1 = new V1alpha3DeviceRequest().adminAccess(true).allocationMode("ExactCount").count(5L).deviceClassName("TestClass").name("TestName");
        V1alpha3DeviceRequest request2 = new V1alpha3DeviceRequest().adminAccess(true).allocationMode("ExactCount").count(5L).deviceClassName("TestClass").name("TestName");
        assertThat(request1, equalTo(request2));
        assertThat(request1.hashCode(), equalTo(request2.hashCode()));
        request2.setCount(6L);
        assertThat(request1, is(notNullValue()));
        assertThat(request2, is(notNullValue()));
        assertThat(request1.equals(request2), is(false));
        assertThat(request1.hashCode() == request2.hashCode(), is(false));
    }

    //BaseRock generated method id: ${testToString}, hash: 1861CBE638A9EC69C7ED9870807FDCC5
    @Test
    void testToString() {
        V1alpha3DeviceRequest request = new V1alpha3DeviceRequest().adminAccess(true).allocationMode("ExactCount").count(5L).deviceClassName("TestClass").name("TestName");
        String expectedString = "class V1alpha3DeviceRequest {\n" + "    adminAccess: true\n" + "    allocationMode: ExactCount\n" + "    count: 5\n" + "    deviceClassName: TestClass\n" + "    name: TestName\n" + "    selectors: []\n" + "}";
        assertThat(request.toString(), equalTo(expectedString));
    }

    //BaseRock generated method id: ${testAllocationModeValues}, hash: 7EBF17869800120DA20494E275656F30
    @ParameterizedTest
    @ValueSource(strings = { "ExactCount", "All" })
    void testAllocationModeValues(String mode) {
        deviceRequest.setAllocationMode(mode);
        assertThat(deviceRequest.getAllocationMode(), is(mode));
    }

    //BaseRock generated method id: ${testAddSelectorsItem}, hash: 518B2AD68189958F0FEA009F00907D75
    @Test
    void testAddSelectorsItem() {
        V1alpha3DeviceSelector selector = mock(V1alpha3DeviceSelector.class);
        deviceRequest.addSelectorsItem(selector);
        assertThat(deviceRequest.getSelectors(), hasSize(1));
        assertThat(deviceRequest.getSelectors().get(0), is(selector));
    }

    //BaseRock generated method id: ${testSetSelectorsNull}, hash: F1DEA565407D5229BFCE6B6304D5D95E
    @Disabled()
    @Test
    void testSetSelectorsNull() {
        deviceRequest.setSelectors(null);
        assertThat(deviceRequest.getSelectors(), is(notNullValue()));
        assertThat(deviceRequest.getSelectors(), is(new ArrayList<>()));
    }

    //BaseRock generated method id: ${testConstructorWithAllFields}, hash: F8ED074CCDA36DDFBE99A3C1AF4D2EA7
    @Test
    void testConstructorWithAllFields() {
        Boolean adminAccess = true;
        String allocationMode = "ExactCount";
        Long count = 5L;
        String deviceClassName = "TestClass";
        String name = "TestName";
        List<V1alpha3DeviceSelector> selectors = new ArrayList<>();
        V1alpha3DeviceSelector selector = mock(V1alpha3DeviceSelector.class);
        selectors.add(selector);
        V1alpha3DeviceRequest request = new V1alpha3DeviceRequest().adminAccess(adminAccess).allocationMode(allocationMode).count(count).deviceClassName(deviceClassName).name(name).selectors(selectors);
        assertThat(request.getAdminAccess(), is(adminAccess));
        assertThat(request.getAllocationMode(), is(allocationMode));
        assertThat(request.getCount(), is(count));
        assertThat(request.getDeviceClassName(), is(deviceClassName));
        assertThat(request.getName(), is(name));
        assertThat(request.getSelectors(), is(selectors));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentTypes}, hash: FAF78D8DB2F8768DF90B9DE1A89B5BCB
    @Test
    void testEqualsWithDifferentTypes() {
        V1alpha3DeviceRequest request = new V1alpha3DeviceRequest();
        assertThat(request.equals("Not a V1alpha3DeviceRequest"), is(false));
    }

    //BaseRock generated method id: ${testHashCodeConsistency}, hash: 78F525388182103A14301D2C5C74D605
    @Test
    void testHashCodeConsistency() {
        V1alpha3DeviceRequest request = new V1alpha3DeviceRequest().adminAccess(true).allocationMode("ExactCount").count(5L).deviceClassName("TestClass").name("TestName");
        int initialHashCode = request.hashCode();
        assertThat(request.hashCode(), is(initialHashCode));
        request.setCount(6L);
        assertThat(request.hashCode() != initialHashCode, is(true));
    }

    //BaseRock generated method id: ${testToStringWithNullFields}, hash: 48324CACF9AB9AD2518E1333A38B61AD
    @Test
    void testToStringWithNullFields() {
        V1alpha3DeviceRequest request = new V1alpha3DeviceRequest();
        String expectedString = "class V1alpha3DeviceRequest {\n" + "    adminAccess: null\n" + "    allocationMode: null\n" + "    count: null\n" + "    deviceClassName: null\n" + "    name: null\n" + "    selectors: []\n" + "}";
        assertThat(request.toString(), equalTo(expectedString));
    }
}
