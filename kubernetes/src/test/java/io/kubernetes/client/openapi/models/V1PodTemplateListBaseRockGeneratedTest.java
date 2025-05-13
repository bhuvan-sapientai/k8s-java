package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
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
import io.kubernetes.client.openapi.models.V1PodTemplate;
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

@Timeout(10)
class V1PodTemplateListBaseRockGeneratedTest {

    @Mock
    private V1ListMeta mockMetadata;

    @Mock
    private V1PodTemplate mockPodTemplate;

    private V1PodTemplateList v1PodTemplateList;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        v1PodTemplateList = new V1PodTemplateList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: E9D1372125FE2F1C445A624CCBA068B0
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1";
        v1PodTemplateList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1PodTemplateList.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: AE012DDC50871BE5F1B07D20E46E3135
    @Test
    void testSetApiVersion() {
        String apiVersion = "v1";
        v1PodTemplateList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1PodTemplateList.getApiVersion());
    }

    //BaseRock generated method id: ${testGetItems}, hash: EF8AAC6B4670B4665FDF536A1A268111
    @Test
    void testGetItems() {
        List<V1PodTemplate> items = new ArrayList<>();
        items.add(mockPodTemplate);
        v1PodTemplateList.setItems(items);
        assertEquals(items, v1PodTemplateList.getItems());
    }

    //BaseRock generated method id: ${testSetItems}, hash: 457BFA2022AF2DFC429D4116DD5189B1
    @Test
    void testSetItems() {
        List<V1PodTemplate> items = new ArrayList<>();
        items.add(mockPodTemplate);
        v1PodTemplateList.setItems(items);
        assertEquals(items, v1PodTemplateList.getItems());
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: D02FC3A74000FA4E9A41748A53D561E0
    @Test
    void testAddItemsItem() {
        v1PodTemplateList.addItemsItem(mockPodTemplate);
        List<V1PodTemplate> items = v1PodTemplateList.getItems();
        assertEquals(1, items.size());
        assertEquals(mockPodTemplate, items.get(0));
    }

    //BaseRock generated method id: ${testGetKind}, hash: D175C94306E46532BC5BF172B1803179
    @Test
    void testGetKind() {
        String kind = "PodTemplateList";
        v1PodTemplateList.setKind(kind);
        assertEquals(kind, v1PodTemplateList.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: 0177747924095EAF0EBE351A74003E08
    @Test
    void testSetKind() {
        String kind = "PodTemplateList";
        v1PodTemplateList.setKind(kind);
        assertEquals(kind, v1PodTemplateList.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: FFDB6A380CE6EA172FCE680C918FAFF3
    @Test
    void testGetMetadata() {
        v1PodTemplateList.setMetadata(mockMetadata);
        assertEquals(mockMetadata, v1PodTemplateList.getMetadata());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: C3937744486503CD9D09CB579AFAA8B2
    @Test
    void testSetMetadata() {
        v1PodTemplateList.setMetadata(mockMetadata);
        assertEquals(mockMetadata, v1PodTemplateList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: B480760C2C4EC517B4A2CEDB59587F70
    @Test
    void testEquals() {
        V1PodTemplateList list1 = new V1PodTemplateList().apiVersion("v1").kind("PodTemplateList").metadata(mockMetadata);
        List<V1PodTemplate> items = new ArrayList<>();
        items.add(mockPodTemplate);
        list1.setItems(items);
        V1PodTemplateList list2 = new V1PodTemplateList().apiVersion("v1").kind("PodTemplateList").metadata(mockMetadata);
        list2.setItems(items);
        assertEquals(list1, list2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: BCBCC5EDD6BE1AE944ABBB6BF0667DAA
    @Test
    void testHashCode() {
        V1PodTemplateList list1 = new V1PodTemplateList().apiVersion("v1").kind("PodTemplateList").metadata(mockMetadata);
        List<V1PodTemplate> items = new ArrayList<>();
        items.add(mockPodTemplate);
        list1.setItems(items);
        V1PodTemplateList list2 = new V1PodTemplateList().apiVersion("v1").kind("PodTemplateList").metadata(mockMetadata);
        list2.setItems(items);
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: A5DBD1602DEC76952014AAA16DF990D0
    @Test
    void testToString() {
        v1PodTemplateList.setApiVersion("v1");
        v1PodTemplateList.setKind("PodTemplateList");
        v1PodTemplateList.setMetadata(mockMetadata);
        List<V1PodTemplate> items = new ArrayList<>();
        items.add(mockPodTemplate);
        v1PodTemplateList.setItems(items);
        String expectedString = "class V1PodTemplateList {\n" + "    apiVersion: v1\n" + "    items: [" + mockPodTemplate.toString() + "]\n" + "    kind: PodTemplateList\n" + "    metadata: " + mockMetadata.toString() + "\n" + "}";
        assertEquals(expectedString, v1PodTemplateList.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: CC5B4EF55E2C23F9BDE8A43EDA60B05F
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiVersion", "v1");
        jsonObject.addProperty("kind", "PodTemplateList");
        JsonObject metadataObject = new JsonObject();
        jsonObject.add("metadata", metadataObject);
        JsonArray itemsArray = new JsonArray();
        jsonObject.add("items", itemsArray);
        V1PodTemplateList.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testValidateJsonElementThrowsException}, hash: 7356848B77C83F0606787ADEECF4B73D
    @Test
    void testValidateJsonElementThrowsException() {
        JsonObject jsonObject = new JsonObject();
        assertThrows(IllegalArgumentException.class, () -> V1PodTemplateList.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 46C5C7A0513F011D8E9716AFDD6D47EA
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"PodTemplateList\",\"metadata\":{},\"items\":[]}";
        V1PodTemplateList result = V1PodTemplateList.fromJson(json);
        assertNotNull(result);
        assertEquals("v1", result.getApiVersion());
        assertEquals("PodTemplateList", result.getKind());
        assertNotNull(result.getMetadata());
        assertNotNull(result.getItems());
    }

    //BaseRock generated method id: ${testToJson}, hash: B94EACF38D79231FD92893854640FC4D
    @Test
    void testToJson() {
        v1PodTemplateList.setApiVersion("v1");
        v1PodTemplateList.setKind("PodTemplateList");
        v1PodTemplateList.setMetadata(new V1ListMeta());
        v1PodTemplateList.setItems(new ArrayList<>());
        String json = v1PodTemplateList.toJson();
        assertNotNull(json);
        assertTrue(json.contains("\"apiVersion\":\"v1\""));
        assertTrue(json.contains("\"kind\":\"PodTemplateList\""));
        assertTrue(json.contains("\"metadata\":"));
        assertTrue(json.contains("\"items\":"));
    }
}
