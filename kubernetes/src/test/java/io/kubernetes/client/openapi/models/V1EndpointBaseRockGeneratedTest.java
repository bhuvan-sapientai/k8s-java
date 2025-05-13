package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import io.kubernetes.client.openapi.models.V1EndpointConditions;
import static org.mockito.Mockito.*;
import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1ObjectReference;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.V1EndpointHints;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonArray;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1EndpointBaseRockGeneratedTest {

    @Mock
    private V1EndpointConditions mockConditions;

    @Mock
    private V1EndpointHints mockHints;

    @Mock
    private V1ObjectReference mockTargetRef;

    private V1Endpoint endpoint;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        endpoint = new V1Endpoint();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 899EC8D763673359E7400F3D69548542
    @Test
    void testConstructor() {
        assertNotNull(endpoint);
        assertNotNull(endpoint.getAddresses());
        assertTrue(endpoint.getAddresses().isEmpty());
        assertNotNull(endpoint.getDeprecatedTopology());
        assertTrue(endpoint.getDeprecatedTopology().isEmpty());
    }

    //BaseRock generated method id: ${testAddresses}, hash: F21F125CFE6D0A855D402EA24E3F965A
    @Test
    void testAddresses() {
        List<String> addresses = new ArrayList<>();
        addresses.add("192.168.1.1");
        addresses.add("192.168.1.2");
        endpoint.setAddresses(addresses);
        assertEquals(addresses, endpoint.getAddresses());
        endpoint.addAddressesItem("192.168.1.3");
        assertTrue(endpoint.getAddresses().contains("192.168.1.3"));
    }

    //BaseRock generated method id: ${testConditions}, hash: 0123BF08B4061F0199374DD008D21DAD
    @Test
    void testConditions() {
        endpoint.setConditions(mockConditions);
        assertEquals(mockConditions, endpoint.getConditions());
    }

    //BaseRock generated method id: ${testDeprecatedTopology}, hash: 97B5BF313011573BB5A03DF913580644
    @Test
    void testDeprecatedTopology() {
        Map<String, String> topology = new HashMap<>();
        topology.put("key1", "value1");
        topology.put("key2", "value2");
        endpoint.setDeprecatedTopology(topology);
        assertEquals(topology, endpoint.getDeprecatedTopology());
        endpoint.putDeprecatedTopologyItem("key3", "value3");
        assertTrue(endpoint.getDeprecatedTopology().containsKey("key3"));
        assertEquals("value3", endpoint.getDeprecatedTopology().get("key3"));
    }

    //BaseRock generated method id: ${testHints}, hash: 5A0753D25F96AF20E2D6B26C5D02EF91
    @Test
    void testHints() {
        endpoint.setHints(mockHints);
        assertEquals(mockHints, endpoint.getHints());
    }

    //BaseRock generated method id: ${testHostname}, hash: E27783E716E127B025920EBE938F2915
    @ParameterizedTest
    @ValueSource(strings = { "hostname1", "hostname2" })
    void testHostname(String hostname) {
        endpoint.setHostname(hostname);
        assertEquals(hostname, endpoint.getHostname());
    }

    //BaseRock generated method id: ${testNodeName}, hash: 2CDBA151BA476786D63CC35047720E83
    @ParameterizedTest
    @ValueSource(strings = { "node1", "node2" })
    void testNodeName(String nodeName) {
        endpoint.setNodeName(nodeName);
        assertEquals(nodeName, endpoint.getNodeName());
    }

    //BaseRock generated method id: ${testTargetRef}, hash: 6741C813447E8F51FD629566AC48805D
    @Test
    void testTargetRef() {
        endpoint.setTargetRef(mockTargetRef);
        assertEquals(mockTargetRef, endpoint.getTargetRef());
    }

    //BaseRock generated method id: ${testZone}, hash: D372CD18615508CD78833428B5A63182
    @ParameterizedTest
    @ValueSource(strings = { "zone1", "zone2" })
    void testZone(String zone) {
        endpoint.setZone(zone);
        assertEquals(zone, endpoint.getZone());
    }

    //BaseRock generated method id: ${testEquals}, hash: 6BBB9D43D6D97D4871763AE86E659CED
    @Test
    void testEquals() {
        V1Endpoint endpoint1 = new V1Endpoint();
        V1Endpoint endpoint2 = new V1Endpoint();
        assertTrue(endpoint1.equals(endpoint2));
        assertEquals(endpoint1.hashCode(), endpoint2.hashCode());
        endpoint1.setHostname("host1");
        assertFalse(endpoint1.equals(endpoint2));
        endpoint2.setHostname("host1");
        assertTrue(endpoint1.equals(endpoint2));
    }

    //BaseRock generated method id: ${testToString}, hash: 2AF90FF5F3012033DC3713D580684AB9
    @Test
    void testToString() {
        endpoint.setHostname("testHost");
        endpoint.setNodeName("testNode");
        String result = endpoint.toString();
        assertTrue(result.contains("hostname: testHost"));
        assertTrue(result.contains("nodeName: testNode"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 5D759F3EB5A707FB415B545C163F5845
    @Test
    void testValidateJsonElement() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("addresses", new JsonArray());
        jsonObject.addProperty("hostname", "testHost");
        jsonObject.addProperty("nodeName", "testNode");
        assertDoesNotThrow(() -> V1Endpoint.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidField}, hash: 611805237762A57FA8B4D11E2AE51D2F
    @Test
    void testValidateJsonElementWithInvalidField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("addresses", new JsonArray());
        jsonObject.addProperty("invalidField", "value");
        assertThrows(IllegalArgumentException.class, () -> V1Endpoint.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithMissingRequiredField}, hash: BA14866D2A9690E42F1019DD94E65FE1
    @Test
    void testValidateJsonElementWithMissingRequiredField() {
        JsonObject jsonObject = new JsonObject();
        assertThrows(IllegalArgumentException.class, () -> V1Endpoint.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithNullAndEmptyJson}, hash: 167B41393262D6CF7B5E211D69E60C0D
    @Test
    void testValidateJsonElementWithNullAndEmptyJson() {
        assertThrows(IllegalArgumentException.class, () -> V1Endpoint.validateJsonElement(null));
        JsonObject emptyJsonObject = new JsonObject();
        assertThrows(IllegalArgumentException.class, () -> V1Endpoint.validateJsonElement(emptyJsonObject));
    }
}
