package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1NodeRuntimeHandler;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.openapi.models.V1NodeCondition;
import io.kubernetes.client.openapi.models.V1NodeDaemonEndpoints;
import io.kubernetes.client.openapi.models.V1NodeAddress;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1ContainerImage;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.containsInAnyOrder;
import io.kubernetes.client.openapi.models.V1NodeConfigStatus;
import java.util.HashMap;
import java.util.List;
import io.kubernetes.client.openapi.models.V1NodeSystemInfo;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1AttachedVolume;
import io.kubernetes.client.openapi.models.V1NodeFeatures;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.V1NodeStatus;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import java.util.ArrayList;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1NodeStatusBaseRockGeneratedTest {

    private V1NodeStatus v1NodeStatus;

    @BeforeEach
    void setUp() {
        v1NodeStatus = new V1NodeStatus();
    }

    //BaseRock generated method id: ${testAddresses}, hash: 822DF31D8EE7D266374F58676069FA96
    @Test
    void testAddresses() {
        List<V1NodeAddress> addresses = new ArrayList<>();
        V1NodeAddress address = mock(V1NodeAddress.class);
        addresses.add(address);
        v1NodeStatus.setAddresses(addresses);
        assertThat(v1NodeStatus.getAddresses(), is(addresses));
        V1NodeAddress newAddress = mock(V1NodeAddress.class);
        v1NodeStatus.addAddressesItem(newAddress);
        assertThat(v1NodeStatus.getAddresses(), hasSize(2));
        assertThat(v1NodeStatus.getAddresses(), containsInAnyOrder(address, newAddress));
    }

    //BaseRock generated method id: ${testAllocatable}, hash: 3EFA6B5EEF86A93617BE83643B85CB86
    @Test
    void testAllocatable() {
        Map<String, Quantity> allocatable = new HashMap<>();
        Quantity quantity = mock(Quantity.class);
        allocatable.put("cpu", quantity);
        v1NodeStatus.setAllocatable(allocatable);
        assertThat(v1NodeStatus.getAllocatable(), is(allocatable));
        Quantity newQuantity = mock(Quantity.class);
        v1NodeStatus.putAllocatableItem("memory", newQuantity);
        assertThat(v1NodeStatus.getAllocatable().size(), is(2));
        assertThat(v1NodeStatus.getAllocatable().get("cpu"), is(quantity));
        assertThat(v1NodeStatus.getAllocatable().get("memory"), is(newQuantity));
    }

    //BaseRock generated method id: ${testCapacity}, hash: 8EFF241B35F3182A70D80EED4DE2A1E1
    @Test
    void testCapacity() {
        Map<String, Quantity> capacity = new HashMap<>();
        Quantity quantity = mock(Quantity.class);
        capacity.put("cpu", quantity);
        v1NodeStatus.setCapacity(capacity);
        assertThat(v1NodeStatus.getCapacity(), is(capacity));
        Quantity newQuantity = mock(Quantity.class);
        v1NodeStatus.putCapacityItem("memory", newQuantity);
        assertThat(v1NodeStatus.getCapacity().size(), is(2));
        assertThat(v1NodeStatus.getCapacity().get("cpu"), is(quantity));
        assertThat(v1NodeStatus.getCapacity().get("memory"), is(newQuantity));
    }

    //BaseRock generated method id: ${testConditions}, hash: B14962B2D484979FE049C4D6DE25E71E
    @Test
    void testConditions() {
        List<V1NodeCondition> conditions = new ArrayList<>();
        V1NodeCondition condition = mock(V1NodeCondition.class);
        conditions.add(condition);
        v1NodeStatus.setConditions(conditions);
        assertThat(v1NodeStatus.getConditions(), is(conditions));
        V1NodeCondition newCondition = mock(V1NodeCondition.class);
        v1NodeStatus.addConditionsItem(newCondition);
        assertThat(v1NodeStatus.getConditions(), hasSize(2));
        assertThat(v1NodeStatus.getConditions(), containsInAnyOrder(condition, newCondition));
    }

    //BaseRock generated method id: ${testConfig}, hash: 85B25BAFD62C1144CBFD479E3BEDF340
    @Test
    void testConfig() {
        V1NodeConfigStatus config = mock(V1NodeConfigStatus.class);
        v1NodeStatus.setConfig(config);
        assertThat(v1NodeStatus.getConfig(), is(config));
    }

    //BaseRock generated method id: ${testDaemonEndpoints}, hash: 223C2200F55BAD438FABE7BB1C3E0BD1
    @Test
    void testDaemonEndpoints() {
        V1NodeDaemonEndpoints daemonEndpoints = mock(V1NodeDaemonEndpoints.class);
        v1NodeStatus.setDaemonEndpoints(daemonEndpoints);
        assertThat(v1NodeStatus.getDaemonEndpoints(), is(daemonEndpoints));
    }

    //BaseRock generated method id: ${testFeatures}, hash: 12661D7EBA0FF1966B427BAC2BDE0F3C
    @Test
    void testFeatures() {
        V1NodeFeatures features = mock(V1NodeFeatures.class);
        v1NodeStatus.setFeatures(features);
        assertThat(v1NodeStatus.getFeatures(), is(features));
    }

    //BaseRock generated method id: ${testImages}, hash: 85A25222ECBBEB085256CE5083B4C622
    @Test
    void testImages() {
        List<V1ContainerImage> images = new ArrayList<>();
        V1ContainerImage image = mock(V1ContainerImage.class);
        images.add(image);
        v1NodeStatus.setImages(images);
        assertThat(v1NodeStatus.getImages(), is(images));
        V1ContainerImage newImage = mock(V1ContainerImage.class);
        v1NodeStatus.addImagesItem(newImage);
        assertThat(v1NodeStatus.getImages(), hasSize(2));
        assertThat(v1NodeStatus.getImages(), containsInAnyOrder(image, newImage));
    }

    //BaseRock generated method id: ${testNodeInfo}, hash: 438FD857018B4C71E16A0FFE8C73AED0
    @Test
    void testNodeInfo() {
        V1NodeSystemInfo nodeInfo = mock(V1NodeSystemInfo.class);
        v1NodeStatus.setNodeInfo(nodeInfo);
        assertThat(v1NodeStatus.getNodeInfo(), is(nodeInfo));
    }

    //BaseRock generated method id: ${testPhase}, hash: D1E100D6C55E2EB242E65D01BFFDA622
    @Test
    void testPhase() {
        String phase = "Running";
        v1NodeStatus.setPhase(phase);
        assertThat(v1NodeStatus.getPhase(), is(phase));
    }

    //BaseRock generated method id: ${testRuntimeHandlers}, hash: 847C513FE7B8D27AB134AE171817CF94
    @Test
    void testRuntimeHandlers() {
        List<V1NodeRuntimeHandler> runtimeHandlers = new ArrayList<>();
        V1NodeRuntimeHandler handler = mock(V1NodeRuntimeHandler.class);
        runtimeHandlers.add(handler);
        v1NodeStatus.setRuntimeHandlers(runtimeHandlers);
        assertThat(v1NodeStatus.getRuntimeHandlers(), is(runtimeHandlers));
        V1NodeRuntimeHandler newHandler = mock(V1NodeRuntimeHandler.class);
        v1NodeStatus.addRuntimeHandlersItem(newHandler);
        assertThat(v1NodeStatus.getRuntimeHandlers(), hasSize(2));
        assertThat(v1NodeStatus.getRuntimeHandlers(), containsInAnyOrder(handler, newHandler));
    }

    //BaseRock generated method id: ${testVolumesAttached}, hash: 1E970D3AA0BEABE4EF86303A5EDB952C
    @Test
    void testVolumesAttached() {
        List<V1AttachedVolume> volumesAttached = new ArrayList<>();
        V1AttachedVolume volume = mock(V1AttachedVolume.class);
        volumesAttached.add(volume);
        v1NodeStatus.setVolumesAttached(volumesAttached);
        assertThat(v1NodeStatus.getVolumesAttached(), is(volumesAttached));
        V1AttachedVolume newVolume = mock(V1AttachedVolume.class);
        v1NodeStatus.addVolumesAttachedItem(newVolume);
        assertThat(v1NodeStatus.getVolumesAttached(), hasSize(2));
        assertThat(v1NodeStatus.getVolumesAttached(), containsInAnyOrder(volume, newVolume));
    }

    //BaseRock generated method id: ${testVolumesInUse}, hash: F39391C6337B5890F214BC4DCF86C921
    @Test
    void testVolumesInUse() {
        List<String> volumesInUse = new ArrayList<>();
        volumesInUse.add("volume1");
        v1NodeStatus.setVolumesInUse(volumesInUse);
        assertThat(v1NodeStatus.getVolumesInUse(), is(volumesInUse));
        v1NodeStatus.addVolumesInUseItem("volume2");
        assertThat(v1NodeStatus.getVolumesInUse(), hasSize(2));
        assertThat(v1NodeStatus.getVolumesInUse(), containsInAnyOrder("volume1", "volume2"));
    }

    //BaseRock generated method id: ${testToString}, hash: 26BA7FD304511495289A5CF01DDF3C01
    @Test
    void testToString() {
        v1NodeStatus.setPhase("Running");
        String result = v1NodeStatus.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("phase: Running"), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: B8822D1C446646F7B46155AB03699AE6
    @Test
    void testHashCode() {
        V1NodeStatus status1 = new V1NodeStatus().phase("Running");
        V1NodeStatus status2 = new V1NodeStatus().phase("Running");
        V1NodeStatus status3 = new V1NodeStatus().phase("Terminated");
        assertThat(status1.hashCode(), equalTo(status2.hashCode()));
        assertThat(status1.hashCode(), not(equalTo(status3.hashCode())));
    }

    //BaseRock generated method id: ${testEquals}, hash: 64FD56A0BED0B0C4938D5B2AA6B3C377
    @Test
    void testEquals() {
        V1NodeStatus status1 = new V1NodeStatus().phase("Running");
        V1NodeStatus status2 = new V1NodeStatus().phase("Running");
        V1NodeStatus status3 = new V1NodeStatus().phase("Terminated");
        assertThat(status1, equalTo(status2));
        assertThat(status1, not(equalTo(status3)));
    }
}
