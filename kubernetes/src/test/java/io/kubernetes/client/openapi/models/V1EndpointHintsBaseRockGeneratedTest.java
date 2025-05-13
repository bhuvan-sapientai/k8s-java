package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1EndpointHintsBaseRockGeneratedTest {

    private V1EndpointHints v1EndpointHints;

    @Mock
    private V1ForZone mockForZone;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        v1EndpointHints = new V1EndpointHints();
    }

    //BaseRock generated method id: ${testForZones}, hash: EE2B3FA9AA452372016BA31BB2D87B23
    @Test
    void testForZones() {
        List<V1ForZone> forZones = new ArrayList<>();
        forZones.add(mockForZone);
        v1EndpointHints.forZones(forZones);
        assertEquals(forZones, v1EndpointHints.getForZones());
    }

    //BaseRock generated method id: ${testAddForZonesItem}, hash: 79485097E4CADF3099648EDF777343EF
    @Test
    void testAddForZonesItem() {
        v1EndpointHints.addForZonesItem(mockForZone);
        List<V1ForZone> result = v1EndpointHints.getForZones();
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(mockForZone, result.get(0));
    }

    //BaseRock generated method id: ${testGetForZones}, hash: B35DD8147C8037D2AD377DD9A13ABCEC
    @Test
    void testGetForZones() {
        List<V1ForZone> forZones = new ArrayList<>();
        forZones.add(mockForZone);
        v1EndpointHints.setForZones(forZones);
        assertEquals(forZones, v1EndpointHints.getForZones());
    }

    //BaseRock generated method id: ${testSetForZones}, hash: 965E15AC20F44BF46D4DC6EA04ADB913
    @Test
    void testSetForZones() {
        List<V1ForZone> forZones = new ArrayList<>();
        forZones.add(mockForZone);
        v1EndpointHints.setForZones(forZones);
        assertEquals(forZones, v1EndpointHints.getForZones());
    }

    //BaseRock generated method id: ${testEquals}, hash: F68A0618AD36F100DB551959D999557D
    @Test
    void testEquals() {
        V1EndpointHints other = new V1EndpointHints();
        assertTrue(v1EndpointHints.equals(v1EndpointHints));
        assertTrue(v1EndpointHints.equals(other));
        other.addForZonesItem(mockForZone);
        assertFalse(v1EndpointHints.equals(other));
        v1EndpointHints.addForZonesItem(mockForZone);
        assertTrue(v1EndpointHints.equals(other));
        assertFalse(v1EndpointHints.equals(null));
        assertFalse(v1EndpointHints.equals(new Object()));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 0CCE4B58B5D864267FF25F8FF801BFEB
    @Test
    void testHashCode() {
        V1EndpointHints other = new V1EndpointHints();
        assertEquals(v1EndpointHints.hashCode(), other.hashCode());
        v1EndpointHints.addForZonesItem(mockForZone);
        assertNotEquals(v1EndpointHints.hashCode(), other.hashCode());
        other.addForZonesItem(mockForZone);
        assertEquals(v1EndpointHints.hashCode(), other.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 5C27E4F52E97276CC34B97DC36906B33
    @Test
    void testToString() {
        String result = v1EndpointHints.toString();
        assertTrue(result.contains("class V1EndpointHints"));
        assertTrue(result.contains("forZones"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: FA6539976FAE65852A36908FF2DFDEF9
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        JsonArray forZonesArray = new JsonArray();
        JsonObject forZoneObject = new JsonObject();
        forZoneObject.addProperty("name", "testZone");
        forZonesArray.add(forZoneObject);
        jsonObject.add("forZones", forZonesArray);
        assertDoesNotThrow(() -> V1EndpointHints.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidField}, hash: 377D04F7417B093104B464B589A118D1
    @Test
    void testValidateJsonElementWithInvalidField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("invalidField", "value");
        assertThrows(IllegalArgumentException.class, () -> V1EndpointHints.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithNullJsonElement}, hash: CCF4F8763EF4A60990F7950D693D7DEF
    @Disabled()
    @Test
    void testValidateJsonElementWithNullJsonElement() {
        assertDoesNotThrow(() -> V1EndpointHints.validateJsonElement(null));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 54FF814072FF20AE613EF3261C4D37AE
    @Test
    void testFromJson() throws IOException {
        String json = "{\"forZones\":[]}";
        V1EndpointHints result = V1EndpointHints.fromJson(json);
        assertNotNull(result);
        assertNotNull(result.getForZones());
        assertTrue(result.getForZones().isEmpty());
    }

    //BaseRock generated method id: ${testToJson}, hash: 31D9C21A84B2A921624D4A60A17C632C
    @Test
    void testToJson() {
        v1EndpointHints.addForZonesItem(mockForZone);
        String json = v1EndpointHints.toJson();
        assertTrue(json.contains("\"forZones\":"));
    }
}
