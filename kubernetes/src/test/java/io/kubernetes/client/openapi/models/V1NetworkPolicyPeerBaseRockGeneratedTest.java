package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import com.google.gson.JsonObject;
import static org.junit.jupiter.api.Assertions.*;
import com.google.gson.JsonElement;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1NetworkPolicyPeerBaseRockGeneratedTest {

    @Mock
    private V1IPBlock mockIpBlock;

    @Mock
    private V1LabelSelector mockNamespaceSelector;

    @Mock
    private V1LabelSelector mockPodSelector;

    private V1NetworkPolicyPeer networkPolicyPeer;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        networkPolicyPeer = new V1NetworkPolicyPeer();
    }

    //BaseRock generated method id: ${testSetAndGetIpBlock}, hash: 95A6E04DD9D94F6BB1EFF7E09986ADA4
    @Test
    void testSetAndGetIpBlock() {
        networkPolicyPeer.setIpBlock(mockIpBlock);
        assertEquals(mockIpBlock, networkPolicyPeer.getIpBlock());
    }

    //BaseRock generated method id: ${testSetAndGetNamespaceSelector}, hash: 6A4149C9D937C01D1CAEB76B3B1C8543
    @Test
    void testSetAndGetNamespaceSelector() {
        networkPolicyPeer.setNamespaceSelector(mockNamespaceSelector);
        assertEquals(mockNamespaceSelector, networkPolicyPeer.getNamespaceSelector());
    }

    //BaseRock generated method id: ${testSetAndGetPodSelector}, hash: BBD198C02B4CC638B3F867955D01AA3C
    @Test
    void testSetAndGetPodSelector() {
        networkPolicyPeer.setPodSelector(mockPodSelector);
        assertEquals(mockPodSelector, networkPolicyPeer.getPodSelector());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: C514F19272BB4798D58997C340AC656D
    @Test
    void testEqualsWithSameObject() {
        assertTrue(networkPolicyPeer.equals(networkPolicyPeer));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 230C6D60C9872C3D086721C39C6E172A
    @Test
    void testEqualsWithDifferentObject() {
        V1NetworkPolicyPeer otherPeer = new V1NetworkPolicyPeer();
        otherPeer.setIpBlock(mockIpBlock);
        assertFalse(networkPolicyPeer.equals(otherPeer));
    }

    //BaseRock generated method id: ${testHashCode}, hash: BE20BD35B9B16EB45B897D5C748C21D0
    @Test
    void testHashCode() {
        networkPolicyPeer.setIpBlock(mockIpBlock);
        networkPolicyPeer.setNamespaceSelector(mockNamespaceSelector);
        networkPolicyPeer.setPodSelector(mockPodSelector);
        int expectedHashCode = java.util.Objects.hash(mockIpBlock, mockNamespaceSelector, mockPodSelector);
        assertEquals(expectedHashCode, networkPolicyPeer.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: E8143BBF9AB7981FD1B07AC737417807
    @Test
    void testToString() {
        networkPolicyPeer.setIpBlock(mockIpBlock);
        networkPolicyPeer.setNamespaceSelector(mockNamespaceSelector);
        networkPolicyPeer.setPodSelector(mockPodSelector);
        String expectedString = "class V1NetworkPolicyPeer {\n    ipBlock: " + mockIpBlock + "\n    namespaceSelector: " + mockNamespaceSelector + "\n    podSelector: " + mockPodSelector + "\n}";
        assertEquals(expectedString, networkPolicyPeer.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 7241F492EDE6EC71E56A745E07F0BE2D
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        JsonObject ipBlockObject = new JsonObject();
        ipBlockObject.addProperty("cidr", "10.0.0.0/24");
        jsonObject.add("ipBlock", ipBlockObject);
        jsonObject.add("namespaceSelector", new JsonObject());
        jsonObject.add("podSelector", new JsonObject());
        V1NetworkPolicyPeer.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidField}, hash: 70ED874E77ED48B3717559855DA1D52C
    @Test
    void testValidateJsonElementWithInvalidField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("invalidField", "value");
        assertThrows(IllegalArgumentException.class, () -> V1NetworkPolicyPeer.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testFromJson}, hash: A79C5C999A33674024CEB3A0DBA73CF4
    @Test
    void testFromJson() throws IOException {
        String json = "{\"ipBlock\":{\"cidr\":\"10.0.0.0/24\"},\"namespaceSelector\":{},\"podSelector\":{}}";
        V1NetworkPolicyPeer result = V1NetworkPolicyPeer.fromJson(json);
        assertNotNull(result);
        assertNotNull(result.getIpBlock());
        assertNotNull(result.getNamespaceSelector());
        assertNotNull(result.getPodSelector());
    }

    //BaseRock generated method id: ${testToJson}, hash: 79AD3416B355E2EF808643E94D0936DC
    @Test
    void testToJson() {
        V1IPBlock ipBlock = new V1IPBlock();
        ipBlock.setCidr("10.0.0.0/24");
        networkPolicyPeer.setIpBlock(ipBlock);
        networkPolicyPeer.setNamespaceSelector(new V1LabelSelector());
        networkPolicyPeer.setPodSelector(new V1LabelSelector());
        String json = networkPolicyPeer.toJson();
        assertTrue(json.contains("\"ipBlock\":"));
        assertTrue(json.contains("\"cidr\":\"10.0.0.0/24\""));
        assertTrue(json.contains("\"namespaceSelector\":"));
        assertTrue(json.contains("\"podSelector\":"));
    }
}
