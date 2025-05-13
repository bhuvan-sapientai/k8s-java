package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1CSIDriver;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import static org.hamcrest.Matchers.*;
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
class V1CSIDriverListBaseRockGeneratedTest {

    @Mock
    private V1ListMeta mockMetadata;

    @Mock
    private V1CSIDriver mockCSIDriver;

    private V1CSIDriverList v1CSIDriverList;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        v1CSIDriverList = new V1CSIDriverList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: B025DA6C2B2DD54921C40C1EDD1CFCB4
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1";
        v1CSIDriverList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1CSIDriverList.getApiVersion());
    }

    //BaseRock generated method id: ${testGetItems}, hash: 77FC48E365136679A107C398E4610B7C
    @Test
    void testGetItems() {
        List<V1CSIDriver> items = new ArrayList<>();
        items.add(mockCSIDriver);
        v1CSIDriverList.setItems(items);
        assertEquals(items, v1CSIDriverList.getItems());
    }

    //BaseRock generated method id: ${testGetKind}, hash: 9C65E4C2BCACED3C33730DC7CFF76B65
    @Test
    void testGetKind() {
        String kind = "CSIDriverList";
        v1CSIDriverList.setKind(kind);
        assertEquals(kind, v1CSIDriverList.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: AF2FE519185DB4A1D870CB13E6F55B0C
    @Test
    void testGetMetadata() {
        v1CSIDriverList.setMetadata(mockMetadata);
        assertEquals(mockMetadata, v1CSIDriverList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: 897547F9B609973F3795C750187137F1
    @Test
    void testEquals() {
        V1CSIDriverList list1 = new V1CSIDriverList().apiVersion("v1").kind("CSIDriverList").metadata(mockMetadata);
        List<V1CSIDriver> items = new ArrayList<>();
        items.add(mockCSIDriver);
        list1.setItems(items);
        V1CSIDriverList list2 = new V1CSIDriverList().apiVersion("v1").kind("CSIDriverList").metadata(mockMetadata);
        list2.setItems(items);
        assertTrue(list1.equals(list2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 5C12216441F108EFFD9AC03D6097E368
    @Test
    void testHashCode() {
        V1CSIDriverList list1 = new V1CSIDriverList().apiVersion("v1").kind("CSIDriverList").metadata(mockMetadata);
        List<V1CSIDriver> items = new ArrayList<>();
        items.add(mockCSIDriver);
        list1.setItems(items);
        V1CSIDriverList list2 = new V1CSIDriverList().apiVersion("v1").kind("CSIDriverList").metadata(mockMetadata);
        list2.setItems(items);
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 896E4E024790EF73E43AD830786059B8
    @Test
    void testToString() {
        v1CSIDriverList.setApiVersion("v1");
        v1CSIDriverList.setKind("CSIDriverList");
        v1CSIDriverList.setMetadata(mockMetadata);
        List<V1CSIDriver> items = new ArrayList<>();
        items.add(mockCSIDriver);
        v1CSIDriverList.setItems(items);
        String expectedString = "class V1CSIDriverList {\n" + "    apiVersion: v1\n" + "    items: " + items + "\n" + "    kind: CSIDriverList\n" + "    metadata: " + mockMetadata + "\n" + "}";
        assertEquals(expectedString, v1CSIDriverList.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: F988A64CB1A917E9D1C9E374F3123581
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiVersion", "v1");
        jsonObject.addProperty("kind", "CSIDriverList");
        JsonArray itemsArray = new JsonArray();
        JsonObject csiDriverObject = new JsonObject();
        JsonObject specObject = new JsonObject();
        specObject.addProperty("attachRequired", true);
        csiDriverObject.add("spec", specObject);
        itemsArray.add(csiDriverObject);
        jsonObject.add("items", itemsArray);
        assertDoesNotThrow(() -> V1CSIDriverList.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementMissingRequiredField}, hash: 58C11A936EB72D2ADB5502A612ECD065
    @Test
    void testValidateJsonElementMissingRequiredField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiVersion", "v1");
        jsonObject.addProperty("kind", "CSIDriverList");
        assertThrows(IllegalArgumentException.class, () -> V1CSIDriverList.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementInvalidFieldType}, hash: 22E0C85120685AA13CDF03F9FA8C5665
    @Test
    void testValidateJsonElementInvalidFieldType() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiVersion", "v1");
        jsonObject.addProperty("kind", "CSIDriverList");
        jsonObject.addProperty("items", "not an array");
        assertThrows(IllegalArgumentException.class, () -> V1CSIDriverList.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testFromJson}, hash: D7CAD659D1283EB7E1266F836260471E
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"CSIDriverList\",\"items\":[{\"spec\":{\"attachRequired\":true}}]}";
        V1CSIDriverList result = V1CSIDriverList.fromJson(json);
        assertNotNull(result);
        assertEquals("v1", result.getApiVersion());
        assertEquals("CSIDriverList", result.getKind());
        assertNotNull(result.getItems());
        assertEquals(1, result.getItems().size());
    }

    //BaseRock generated method id: ${testToJson}, hash: 08E4977666F9D23B1CE960EC6BAEBDE9
    @Disabled()
    @Test
    void testToJson() {
        v1CSIDriverList.setApiVersion("v1");
        v1CSIDriverList.setKind("CSIDriverList");
        List<V1CSIDriver> items = new ArrayList<>();
        V1CSIDriver csiDriver = new V1CSIDriver();
        V1CSIDriverSpec spec = new V1CSIDriverSpec();
        spec.setAttachRequired(true);
        csiDriver.setSpec(spec);
        items.add(csiDriver);
        v1CSIDriverList.setItems(items);
        String json = v1CSIDriverList.toJson();
        assertNotNull(json);
        assertTrue(json.contains("\"apiVersion\":\"v1\""));
        assertTrue(json.contains("\"kind\":\"CSIDriverList\""));
        assertTrue(json.contains("\"items\":["));
        assertTrue(json.contains("\"spec\":{\"attachRequired\":true}"));
    }
}
