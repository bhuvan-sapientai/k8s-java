package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import io.kubernetes.client.openapi.models.V1VolumeNodeResources;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.openapi.models.V1CSINodeDriver;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1CSINodeDriverBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: C5775765D64D72E6F7CB0339A3EF6EE8
    @Test
    void testConstructor() {
        V1CSINodeDriver driver = new V1CSINodeDriver();
        assertNotNull(driver);
    }

    //BaseRock generated method id: ${testSetAndGetAllocatable}, hash: CEBD253EBFDCD05365BF8BA4BD24BC19
    @Test
    void testSetAndGetAllocatable() {
        V1CSINodeDriver driver = new V1CSINodeDriver();
        V1VolumeNodeResources allocatable = new V1VolumeNodeResources();
        driver.setAllocatable(allocatable);
        assertEquals(allocatable, driver.getAllocatable());
    }

    //BaseRock generated method id: ${testSetAndGetName}, hash: C135AD0AA2071EB1E20B78ADECE13A57
    @Test
    void testSetAndGetName() {
        V1CSINodeDriver driver = new V1CSINodeDriver();
        String name = "test-driver";
        driver.setName(name);
        assertEquals(name, driver.getName());
    }

    //BaseRock generated method id: ${testSetAndGetNodeID}, hash: AFB21DB11FD965E8E8FE5155E5FC5BC2
    @Test
    void testSetAndGetNodeID() {
        V1CSINodeDriver driver = new V1CSINodeDriver();
        String nodeID = "node-1";
        driver.setNodeID(nodeID);
        assertEquals(nodeID, driver.getNodeID());
    }

    //BaseRock generated method id: ${testSetAndGetTopologyKeys}, hash: 8ADB1D190FE4ACB6E35001F5E683ADDD
    @Test
    void testSetAndGetTopologyKeys() {
        V1CSINodeDriver driver = new V1CSINodeDriver();
        List<String> topologyKeys = Arrays.asList("key1", "key2");
        driver.setTopologyKeys(topologyKeys);
        assertEquals(topologyKeys, driver.getTopologyKeys());
    }

    //BaseRock generated method id: ${testAddTopologyKeysItem}, hash: EA3A6021C430D9BD8DFE143FBF94CF58
    @Test
    void testAddTopologyKeysItem() {
        V1CSINodeDriver driver = new V1CSINodeDriver();
        String topologyKey = "key1";
        driver.addTopologyKeysItem(topologyKey);
        assertThat(driver.getTopologyKeys(), is(notNullValue()));
        assertEquals(1, driver.getTopologyKeys().size());
        assertEquals(topologyKey, driver.getTopologyKeys().get(0));
    }

    //BaseRock generated method id: ${testBuilderName}, hash: B18E3302A306A7353D486E3AA41351FC
    @ParameterizedTest
    @ValueSource(strings = { "name1", "name2" })
    void testBuilderName(String name) {
        V1CSINodeDriver driver = new V1CSINodeDriver().name(name);
        assertEquals(name, driver.getName());
    }

    //BaseRock generated method id: ${testBuilderNodeID}, hash: 1AB01ABF6E3AF13E1CB3EB29A28C35FA
    @ParameterizedTest
    @ValueSource(strings = { "nodeID1", "nodeID2" })
    void testBuilderNodeID(String nodeID) {
        V1CSINodeDriver driver = new V1CSINodeDriver().nodeID(nodeID);
        assertEquals(nodeID, driver.getNodeID());
    }

    //BaseRock generated method id: ${testBuilderAllocatable}, hash: 7D90E8DD6D006C854036D3631B9101B1
    @Test
    void testBuilderAllocatable() {
        V1VolumeNodeResources allocatable = new V1VolumeNodeResources();
        V1CSINodeDriver driver = new V1CSINodeDriver().allocatable(allocatable);
        assertEquals(allocatable, driver.getAllocatable());
    }

    //BaseRock generated method id: ${testBuilderTopologyKeys}, hash: 4EBDB1330BC42918E438F1C7B8EDCA4C
    @Test
    void testBuilderTopologyKeys() {
        List<String> topologyKeys = Arrays.asList("key1", "key2");
        V1CSINodeDriver driver = new V1CSINodeDriver().topologyKeys(topologyKeys);
        assertEquals(topologyKeys, driver.getTopologyKeys());
    }

    //BaseRock generated method id: ${testEquals}, hash: C824A596110293DA1E1B0F5FAAC223CE
    @Test
    void testEquals() {
        V1CSINodeDriver driver1 = new V1CSINodeDriver().name("driver1").nodeID("node1").allocatable(new V1VolumeNodeResources()).topologyKeys(Arrays.asList("key1", "key2"));
        V1CSINodeDriver driver2 = new V1CSINodeDriver().name("driver1").nodeID("node1").allocatable(new V1VolumeNodeResources()).topologyKeys(Arrays.asList("key1", "key2"));
        assertEquals(driver1, driver2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 197B83709A6305958D668AE91289F96C
    @Test
    void testHashCode() {
        V1CSINodeDriver driver1 = new V1CSINodeDriver().name("driver1").nodeID("node1").allocatable(new V1VolumeNodeResources()).topologyKeys(Arrays.asList("key1", "key2"));
        V1CSINodeDriver driver2 = new V1CSINodeDriver().name("driver1").nodeID("node1").allocatable(new V1VolumeNodeResources()).topologyKeys(Arrays.asList("key1", "key2"));
        assertEquals(driver1.hashCode(), driver2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: B417EDEAE142A56646C2A074C88531D0
    @Test
    void testToString() {
        V1CSINodeDriver driver = new V1CSINodeDriver().name("driver1").nodeID("node1").allocatable(new V1VolumeNodeResources()).topologyKeys(Arrays.asList("key1", "key2"));
        String expected = "class V1CSINodeDriver {\n    allocatable: class V1VolumeNodeResources {\n        count: null\n    }\n    name: driver1\n    nodeID: node1\n    topologyKeys: [key1, key2]\n}";
        assertEquals(expected, driver.toString());
    }

    //BaseRock generated method id: ${testSetNameWithInvalidInput}, hash: 4303D8DAE8C63AB633082519A3E245AF
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "  ", "\t", "\n" })
    void testSetNameWithInvalidInput(String name) {
        V1CSINodeDriver driver = new V1CSINodeDriver();
        driver.setName(name);
        assertEquals(name, driver.getName());
    }

    //BaseRock generated method id: ${testSetNodeIDWithInvalidInput}, hash: 15204AF6BE81D90A9891783BB16A872F
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "  ", "\t", "\n" })
    void testSetNodeIDWithInvalidInput(String nodeID) {
        V1CSINodeDriver driver = new V1CSINodeDriver();
        driver.setNodeID(nodeID);
        assertEquals(nodeID, driver.getNodeID());
    }

    //BaseRock generated method id: ${testSetTopologyKeysWithNull}, hash: 180C65ABBC9A3F6A0F374CCDC5872ECA
    @Disabled()
    @Test
    void testSetTopologyKeysWithNull() {
        V1CSINodeDriver driver = new V1CSINodeDriver();
        driver.setTopologyKeys(null);
        assertNotNull(driver.getTopologyKeys());
        assertEquals(0, driver.getTopologyKeys().size());
    }

    //BaseRock generated method id: ${testAddTopologyKeysItemWithNull}, hash: 41CEF3249CE5A6A261080009A4EE3BCF
    @Disabled()
    @Test
    void testAddTopologyKeysItemWithNull() {
        V1CSINodeDriver driver = new V1CSINodeDriver();
        driver.addTopologyKeysItem(null);
        assertNotNull(driver.getTopologyKeys());
        assertEquals(1, driver.getTopologyKeys().size());
        assertThat(driver.getTopologyKeys().get(0), is(notNullValue()));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 1B57AD85770032D1D9D7427B675A35A7
    @Test
    void testValidateJsonElement() throws Exception {
        V1CSINodeDriver driver = new V1CSINodeDriver().name("driver1").nodeID("node1").allocatable(new V1VolumeNodeResources()).topologyKeys(Arrays.asList("key1", "key2"));
        String json = driver.toJson();
        V1CSINodeDriver.validateJsonElement(io.kubernetes.client.openapi.JSON.getGson().fromJson(json, com.google.gson.JsonElement.class));
    }
}
