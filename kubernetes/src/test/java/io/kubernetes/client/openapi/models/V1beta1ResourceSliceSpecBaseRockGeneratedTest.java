package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1beta1ResourcePool;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.containsInAnyOrder;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.openapi.models.V1beta1Device;
import io.kubernetes.client.openapi.models.V1NodeSelector;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1ResourceSliceSpecBaseRockGeneratedTest {

    private V1beta1ResourceSliceSpec resourceSliceSpec;

    @BeforeEach
    void setUp() {
        resourceSliceSpec = new V1beta1ResourceSliceSpec();
    }

    //BaseRock generated method id: ${testAllNodesGetterAndSetter}, hash: 20CE29C215FE4E076A467815FE155551
    @Test
    void testAllNodesGetterAndSetter() {
        resourceSliceSpec.setAllNodes(true);
        assertThat(resourceSliceSpec.getAllNodes(), is(true));
        resourceSliceSpec.setAllNodes(false);
        assertThat(resourceSliceSpec.getAllNodes(), is(false));
    }

    //BaseRock generated method id: ${testDevicesGetterAndSetter}, hash: 5429498735602FF9D971900587C66379
    @Test
    void testDevicesGetterAndSetter() {
        List<V1beta1Device> devices = new ArrayList<>();
        V1beta1Device device1 = mock(V1beta1Device.class);
        V1beta1Device device2 = mock(V1beta1Device.class);
        devices.add(device1);
        devices.add(device2);
        resourceSliceSpec.setDevices(devices);
        assertThat(resourceSliceSpec.getDevices(), hasSize(2));
        assertThat(resourceSliceSpec.getDevices(), containsInAnyOrder(device1, device2));
    }

    //BaseRock generated method id: ${testAddDevicesItem}, hash: 921AA5C567737D6FED8DA59F27C879DA
    @Test
    void testAddDevicesItem() {
        V1beta1Device device = mock(V1beta1Device.class);
        resourceSliceSpec.addDevicesItem(device);
        assertThat(resourceSliceSpec.getDevices(), hasSize(1));
        assertThat(resourceSliceSpec.getDevices().get(0), is(device));
    }

    //BaseRock generated method id: ${testDriverGetterAndSetter}, hash: 90F7C5A6077ADC6C9C6BBAACB6899871
    @ParameterizedTest
    @ValueSource(strings = { "driver1", "driver2" })
    void testDriverGetterAndSetter(String driverValue) {
        resourceSliceSpec.setDriver(driverValue);
        assertThat(resourceSliceSpec.getDriver(), is(driverValue));
    }

    //BaseRock generated method id: ${testNodeNameGetterAndSetter}, hash: B9DB384DEB55E5AFD7F34B728440AD87
    @ParameterizedTest
    @ValueSource(strings = { "node1", "node2" })
    void testNodeNameGetterAndSetter(String nodeNameValue) {
        resourceSliceSpec.setNodeName(nodeNameValue);
        assertThat(resourceSliceSpec.getNodeName(), is(nodeNameValue));
    }

    //BaseRock generated method id: ${testNodeSelectorGetterAndSetter}, hash: A9C047E36C79CEE0565431E287469C0D
    @Test
    void testNodeSelectorGetterAndSetter() {
        V1NodeSelector nodeSelector = mock(V1NodeSelector.class);
        resourceSliceSpec.setNodeSelector(nodeSelector);
        assertThat(resourceSliceSpec.getNodeSelector(), is(nodeSelector));
    }

    //BaseRock generated method id: ${testPoolGetterAndSetter}, hash: FE22AB5529B536FCA3292C871DE90E6C
    @Test
    void testPoolGetterAndSetter() {
        V1beta1ResourcePool pool = mock(V1beta1ResourcePool.class);
        resourceSliceSpec.setPool(pool);
        assertThat(resourceSliceSpec.getPool(), is(pool));
    }

    //BaseRock generated method id: ${testEquals}, hash: 11F2279747BF8D7D18F25E4E44EF3E9B
    @Test
    void testEquals() {
        V1beta1ResourceSliceSpec spec1 = new V1beta1ResourceSliceSpec().allNodes(true).driver("driver1").nodeName("node1").pool(new V1beta1ResourcePool().name("pool1"));
        V1beta1ResourceSliceSpec spec2 = new V1beta1ResourceSliceSpec().allNodes(true).driver("driver1").nodeName("node1").pool(new V1beta1ResourcePool().name("pool1"));
        assertThat(spec1.equals(spec2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 0FCB5A18C69D3C28291ADB66979E88FA
    @Test
    void testHashCode() {
        V1beta1ResourceSliceSpec spec1 = new V1beta1ResourceSliceSpec().allNodes(true).driver("driver1").nodeName("node1").pool(new V1beta1ResourcePool().name("pool1"));
        V1beta1ResourceSliceSpec spec2 = new V1beta1ResourceSliceSpec().allNodes(true).driver("driver1").nodeName("node1").pool(new V1beta1ResourcePool().name("pool1"));
        assertThat(spec1.hashCode(), is(spec2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 6B69CF6FBE88B85973112003FA72C8E6
    @Test
    void testToString() {
        V1beta1ResourceSliceSpec spec = new V1beta1ResourceSliceSpec().allNodes(true).driver("driver1").nodeName("node1").pool(new V1beta1ResourcePool().name("pool1"));
        String result = spec.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("allNodes"), is(true));
        assertThat(result.contains("driver"), is(true));
        assertThat(result.contains("nodeName"), is(true));
        assertThat(result.contains("pool"), is(true));
    }

    //BaseRock generated method id: ${testSetDriverWithInvalidInput}, hash: D3E8C5A5CE520F5DBB1E1855CB22860E
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "  " })
    void testSetDriverWithInvalidInput(String invalidInput) {
        resourceSliceSpec.setDriver(invalidInput);
        assertThat(resourceSliceSpec.getDriver(), is(invalidInput));
    }

    //BaseRock generated method id: ${testSetPoolWithNull}, hash: 5BDF40B783141ABC18FB35BD36840675
    @Test
    void testSetPoolWithNull() {
        resourceSliceSpec.setPool(null);
        assertThat(resourceSliceSpec.getPool(), is(nullValue()));
    }

    //BaseRock generated method id: ${testConstructorWithAllFields}, hash: A9804CF52873FD0CB946580F34770EA6
    @Test
    void testConstructorWithAllFields() {
        Boolean allNodes = true;
        List<V1beta1Device> devices = new ArrayList<>();
        devices.add(mock(V1beta1Device.class));
        String driver = "testDriver";
        String nodeName = "testNode";
        V1NodeSelector nodeSelector = mock(V1NodeSelector.class);
        V1beta1ResourcePool pool = new V1beta1ResourcePool().name("testPool");
        V1beta1ResourceSliceSpec spec = new V1beta1ResourceSliceSpec().allNodes(allNodes).devices(devices).driver(driver).nodeName(nodeName).nodeSelector(nodeSelector).pool(pool);
        assertThat(spec.getAllNodes(), is(allNodes));
        assertThat(spec.getDevices(), is(devices));
        assertThat(spec.getDriver(), is(driver));
        assertThat(spec.getNodeName(), is(nodeName));
        assertThat(spec.getNodeSelector(), is(nodeSelector));
        assertThat(spec.getPool(), is(pool));
    }

    //BaseRock generated method id: ${testSetDevicesWithNull}, hash: CCBF00CBFEF05A44E02A58B0DF5C4831
    @Test
    void testSetDevicesWithNull() {
        resourceSliceSpec.setDevices(null);
        assertThat(resourceSliceSpec.getDevices(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAddDevicesItemWithNull}, hash: 1B9E2ED291E03C3A13D2F5E31752F2E5
    @Test
    void testAddDevicesItemWithNull() {
        resourceSliceSpec.addDevicesItem(null);
        assertThat(resourceSliceSpec.getDevices(), hasSize(1));
        assertThat(resourceSliceSpec.getDevices().get(0), is(nullValue()));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObjects}, hash: 97985224A0ADCB72B06AD778535B31B7
    @Test
    void testEqualsWithDifferentObjects() {
        V1beta1ResourceSliceSpec spec1 = new V1beta1ResourceSliceSpec().allNodes(true).driver("driver1").nodeName("node1").pool(new V1beta1ResourcePool().name("pool1"));
        V1beta1ResourceSliceSpec spec2 = new V1beta1ResourceSliceSpec().allNodes(false).driver("driver2").nodeName("node2").pool(new V1beta1ResourcePool().name("pool2"));
        assertThat(spec1.equals(spec2), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: 7D9A069B20BF2F8EDBA9BD09F6C7D25F
    @Test
    void testEqualsWithNull() {
        V1beta1ResourceSliceSpec spec = new V1beta1ResourceSliceSpec().allNodes(true).driver("driver1").nodeName("node1").pool(new V1beta1ResourcePool().name("pool1"));
        assertThat(spec.equals(null), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 88AD80E8119AA155C514D092EB611778
    @Test
    void testEqualsWithSameObject() {
        V1beta1ResourceSliceSpec spec = new V1beta1ResourceSliceSpec().allNodes(true).driver("driver1").nodeName("node1").pool(new V1beta1ResourcePool().name("pool1"));
        assertThat(spec.equals(spec), is(true));
    }

    //BaseRock generated method id: ${testHashCodeConsistency}, hash: D28663736D62A74E87438773657FC945
    @Test
    void testHashCodeConsistency() {
        V1beta1ResourceSliceSpec spec = new V1beta1ResourceSliceSpec().allNodes(true).driver("driver1").nodeName("node1").pool(new V1beta1ResourcePool().name("pool1"));
        int hashCode1 = spec.hashCode();
        int hashCode2 = spec.hashCode();
        assertThat(hashCode1, is(equalTo(hashCode2)));
    }
}
