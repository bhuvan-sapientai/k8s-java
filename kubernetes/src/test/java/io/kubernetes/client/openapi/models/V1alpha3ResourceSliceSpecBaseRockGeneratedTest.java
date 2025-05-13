package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1alpha3ResourcePool;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.containsInAnyOrder;
import io.kubernetes.client.openapi.models.V1alpha3Device;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
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
class V1alpha3ResourceSliceSpecBaseRockGeneratedTest {

    private V1alpha3ResourceSliceSpec resourceSliceSpec;

    @BeforeEach
    void setUp() {
        resourceSliceSpec = new V1alpha3ResourceSliceSpec();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 4A113665E5E5D2198EE3AB2A1E5334CE
    @Test
    void testConstructor() {
        assertThat(resourceSliceSpec, is(notNullValue()));
    }

    //BaseRock generated method id: ${testAllNodes}, hash: 07885968BB51DA4F9390D47794C2C990
    @Test
    void testAllNodes() {
        resourceSliceSpec.setAllNodes(true);
        assertThat(resourceSliceSpec.getAllNodes(), is(true));
        resourceSliceSpec.setAllNodes(false);
        assertThat(resourceSliceSpec.getAllNodes(), is(false));
    }

    //BaseRock generated method id: ${testDevices}, hash: 4E07FB43D44DEB0631BC7039564D1924
    @Test
    void testDevices() {
        List<V1alpha3Device> devices = new ArrayList<>();
        V1alpha3Device device1 = mock(V1alpha3Device.class);
        V1alpha3Device device2 = mock(V1alpha3Device.class);
        devices.add(device1);
        devices.add(device2);
        resourceSliceSpec.setDevices(devices);
        assertThat(resourceSliceSpec.getDevices(), hasSize(2));
        assertThat(resourceSliceSpec.getDevices(), containsInAnyOrder(device1, device2));
    }

    //BaseRock generated method id: ${testAddDevicesItem}, hash: 81162F3975C3FDF3DDFEC72E89BDAE0B
    @Test
    void testAddDevicesItem() {
        V1alpha3Device device = mock(V1alpha3Device.class);
        resourceSliceSpec.addDevicesItem(device);
        assertThat(resourceSliceSpec.getDevices(), hasSize(1));
        assertThat(resourceSliceSpec.getDevices().get(0), is(equalTo(device)));
    }

    //BaseRock generated method id: ${testDriver}, hash: 4B3760ADBEFC8801F2D9E56B4BA75A5B
    @ParameterizedTest
    @ValueSource(strings = { "driver1", "driver2" })
    void testDriver(String driverName) {
        resourceSliceSpec.setDriver(driverName);
        assertThat(resourceSliceSpec.getDriver(), is(equalTo(driverName)));
    }

    //BaseRock generated method id: ${testDriverNull}, hash: 232AA96FE9052E8B3C6817060BED7285
    @Test
    void testDriverNull() {
        resourceSliceSpec.setDriver(null);
        assertThat(resourceSliceSpec.getDriver(), is(nullValue()));
    }

    //BaseRock generated method id: ${testNodeName}, hash: 4CF60228A42309D60320E06248C7DC68
    @ParameterizedTest
    @ValueSource(strings = { "node1", "node2" })
    void testNodeName(String nodeName) {
        resourceSliceSpec.setNodeName(nodeName);
        assertThat(resourceSliceSpec.getNodeName(), is(equalTo(nodeName)));
    }

    //BaseRock generated method id: ${testNodeNameNullAndEmpty}, hash: 1028DA8A9D97918837B3BA401FE94D71
    @ParameterizedTest
    @NullAndEmptySource
    void testNodeNameNullAndEmpty(String nodeName) {
        resourceSliceSpec.setNodeName(nodeName);
        assertThat(resourceSliceSpec.getNodeName(), is(equalTo(nodeName)));
    }

    //BaseRock generated method id: ${testNodeSelector}, hash: A085B29B83993E7E307F97AB4D82C82F
    @Test
    void testNodeSelector() {
        V1NodeSelector nodeSelector = mock(V1NodeSelector.class);
        resourceSliceSpec.setNodeSelector(nodeSelector);
        assertThat(resourceSliceSpec.getNodeSelector(), is(equalTo(nodeSelector)));
    }

    //BaseRock generated method id: ${testNodeSelectorNull}, hash: 9B2BD41DEDFBB49D29B266BB48AA0036
    @Test
    void testNodeSelectorNull() {
        resourceSliceSpec.setNodeSelector(null);
        assertThat(resourceSliceSpec.getNodeSelector(), is(nullValue()));
    }

    //BaseRock generated method id: ${testPool}, hash: 9E84615F341B4099283FE05F02907817
    @Test
    void testPool() {
        V1alpha3ResourcePool pool = mock(V1alpha3ResourcePool.class);
        resourceSliceSpec.setPool(pool);
        assertThat(resourceSliceSpec.getPool(), is(equalTo(pool)));
    }

    //BaseRock generated method id: ${testPoolNull}, hash: 5FCCAD6E803186DC303A3B287E3A5F00
    @Test
    void testPoolNull() {
        resourceSliceSpec.setPool(null);
        assertThat(resourceSliceSpec.getPool(), is(nullValue()));
    }

    //BaseRock generated method id: ${testEquals}, hash: F8ED460A1890E0C06B854FADEEBC6515
    @Test
    void testEquals() {
        V1alpha3ResourceSliceSpec spec1 = new V1alpha3ResourceSliceSpec().allNodes(true).driver("driver1").nodeName("node1").nodeSelector(mock(V1NodeSelector.class)).pool(mock(V1alpha3ResourcePool.class));
        V1alpha3ResourceSliceSpec spec2 = new V1alpha3ResourceSliceSpec().allNodes(true).driver("driver1").nodeName("node1").nodeSelector(spec1.getNodeSelector()).pool(spec1.getPool());
        assertThat(spec1, is(equalTo(spec2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 7F478E9AB6DBFCAC935507674717CC18
    @Test
    void testHashCode() {
        V1alpha3ResourceSliceSpec spec1 = new V1alpha3ResourceSliceSpec().allNodes(true).driver("driver1").nodeName("node1").nodeSelector(mock(V1NodeSelector.class)).pool(mock(V1alpha3ResourcePool.class));
        V1alpha3ResourceSliceSpec spec2 = new V1alpha3ResourceSliceSpec().allNodes(true).driver("driver1").nodeName("node1").nodeSelector(spec1.getNodeSelector()).pool(spec1.getPool());
        assertThat(spec1.hashCode(), is(equalTo(spec2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 43B983983CF0C9D3DF2F33537E42DA8A
    @Test
    void testToString() {
        V1alpha3ResourceSliceSpec spec = new V1alpha3ResourceSliceSpec().allNodes(true).driver("driver1").nodeName("node1").nodeSelector(mock(V1NodeSelector.class)).pool(mock(V1alpha3ResourcePool.class));
        String toString = spec.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("allNodes"), is(true));
        assertThat(toString.contains("driver"), is(true));
        assertThat(toString.contains("nodeName"), is(true));
        assertThat(toString.contains("nodeSelector"), is(true));
        assertThat(toString.contains("pool"), is(true));
    }
}
