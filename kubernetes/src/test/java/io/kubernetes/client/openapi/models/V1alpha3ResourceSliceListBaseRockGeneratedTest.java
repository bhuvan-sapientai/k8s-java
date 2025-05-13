package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import java.util.Set;
import java.util.HashSet;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.Matchers.closeTo;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import io.kubernetes.client.openapi.models.V1alpha3ResourceSlice;
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
class V1alpha3ResourceSliceListBaseRockGeneratedTest {

    @Mock
    private V1ListMeta mockMetadata;

    @Mock
    private V1alpha3ResourceSlice mockResourceSlice;

    private V1alpha3ResourceSliceList resourceSliceList;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        resourceSliceList = new V1alpha3ResourceSliceList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 3FFD519DC6FB97E3DB96674EF12781A5
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1alpha3";
        resourceSliceList.setApiVersion(apiVersion);
        assertEquals(apiVersion, resourceSliceList.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: 57DB7FA897CB7DDCEA0EDD8A88114524
    @Test
    void testSetApiVersion() {
        String apiVersion = "v1alpha3";
        resourceSliceList.setApiVersion(apiVersion);
        assertEquals(apiVersion, resourceSliceList.getApiVersion());
    }

    //BaseRock generated method id: ${testGetItems}, hash: A075E218AD562894774FFD7FC66D62CF
    @Test
    void testGetItems() {
        List<V1alpha3ResourceSlice> items = new ArrayList<>();
        items.add(mockResourceSlice);
        resourceSliceList.setItems(items);
        assertEquals(items, resourceSliceList.getItems());
    }

    //BaseRock generated method id: ${testSetItems}, hash: 82131F2FA77DEFAFB712B5F8948D5A7B
    @Test
    void testSetItems() {
        List<V1alpha3ResourceSlice> items = new ArrayList<>();
        items.add(mockResourceSlice);
        resourceSliceList.setItems(items);
        assertEquals(items, resourceSliceList.getItems());
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 9D4AD2F471F17CE8D26A2BED20A4EB92
    @Test
    void testAddItemsItem() {
        resourceSliceList.addItemsItem(mockResourceSlice);
        assertEquals(1, resourceSliceList.getItems().size());
        assertEquals(mockResourceSlice, resourceSliceList.getItems().get(0));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 6693ED1DB1A5D8609B074FBFB45E9D2C
    @Test
    void testGetKind() {
        String kind = "ResourceSliceList";
        resourceSliceList.setKind(kind);
        assertEquals(kind, resourceSliceList.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: 46FB1090EB1545FE476F586476350317
    @Test
    void testSetKind() {
        String kind = "ResourceSliceList";
        resourceSliceList.setKind(kind);
        assertEquals(kind, resourceSliceList.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: D3B5769E1F5BF26D51E4F6E7C23D75DF
    @Test
    void testGetMetadata() {
        resourceSliceList.setMetadata(mockMetadata);
        assertEquals(mockMetadata, resourceSliceList.getMetadata());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: E23D1E823E40A084B84CF516A834EE00
    @Test
    void testSetMetadata() {
        resourceSliceList.setMetadata(mockMetadata);
        assertEquals(mockMetadata, resourceSliceList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: DA916E7BC8AD1C2DD2B28A1916951305
    @Disabled()
    @Test
    void testEquals() {
        V1alpha3ResourceSliceList other = new V1alpha3ResourceSliceList();
        assertTrue(resourceSliceList.equals(resourceSliceList));
        assertTrue(resourceSliceList.equals(other));
        other.setApiVersion("v1alpha3");
        assertFalse(resourceSliceList.equals(other));
        resourceSliceList.setApiVersion("v1alpha3");
        assertTrue(resourceSliceList.equals(other));
        List<V1alpha3ResourceSlice> items = new ArrayList<>();
        other.setItems(items);
        assertFalse(resourceSliceList.equals(other));
        resourceSliceList.setItems(items);
        assertTrue(resourceSliceList.equals(other));
        other.setKind("ResourceSliceList");
        assertFalse(resourceSliceList.equals(other));
        resourceSliceList.setKind("ResourceSliceList");
        assertTrue(resourceSliceList.equals(other));
        other.setMetadata(mockMetadata);
        assertFalse(resourceSliceList.equals(other));
        resourceSliceList.setMetadata(mockMetadata);
        assertTrue(resourceSliceList.equals(other));
        assertFalse(resourceSliceList.equals(null));
        assertFalse(resourceSliceList.equals(new Object()));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 87DADB4786F3E721261731C133907533
    @Test
    void testHashCode() {
        V1alpha3ResourceSliceList other = new V1alpha3ResourceSliceList();
        assertEquals(resourceSliceList.hashCode(), other.hashCode());
        resourceSliceList.setApiVersion("v1alpha3");
        resourceSliceList.setItems(new ArrayList<>());
        resourceSliceList.setKind("ResourceSliceList");
        resourceSliceList.setMetadata(mockMetadata);
        other.setApiVersion("v1alpha3");
        other.setItems(new ArrayList<>());
        other.setKind("ResourceSliceList");
        other.setMetadata(mockMetadata);
        assertEquals(resourceSliceList.hashCode(), other.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: AB9F2FEFE09D0F185054D076A0F5F194
    @Test
    void testToString() {
        resourceSliceList.setApiVersion("v1alpha3");
        resourceSliceList.setItems(new ArrayList<>());
        resourceSliceList.setKind("ResourceSliceList");
        resourceSliceList.setMetadata(mockMetadata);
        String expected = "class V1alpha3ResourceSliceList {\n    apiVersion: v1alpha3\n    items: []\n    kind: ResourceSliceList\n    metadata: " + mockMetadata + "\n}";
        assertEquals(expected, resourceSliceList.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 675E21F30214CDD7BA507487AB32D51B
    @Disabled()
    @Test
    void testValidateJsonElement() throws IOException {
        JsonElement jsonElement = mock(JsonElement.class);
        JsonObject jsonObject = mock(JsonObject.class);
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        Set<Map.Entry<String, JsonElement>> entrySet = new HashSet<>();
        when(jsonObject.entrySet()).thenReturn(entrySet);
        JsonElement itemsElement = mock(JsonElement.class);
        when(jsonObject.get("items")).thenReturn(itemsElement);
        when(itemsElement.isJsonArray()).thenReturn(true);
        JsonArray jsonArrayItems = mock(JsonArray.class);
        when(itemsElement.getAsJsonArray()).thenReturn(jsonArrayItems);
        when(jsonArrayItems.size()).thenReturn(0);
        assertDoesNotThrow(() -> V1alpha3ResourceSliceList.validateJsonElement(jsonElement));
    }

    //BaseRock generated method id: ${testFromJson}, hash: EB341B7071D8EEC5E630EA5178F14808
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1alpha3\",\"kind\":\"ResourceSliceList\",\"items\":[],\"metadata\":{}}";
        V1alpha3ResourceSliceList result = V1alpha3ResourceSliceList.fromJson(json);
        assertNotNull(result);
        assertEquals("v1alpha3", result.getApiVersion());
        assertEquals("ResourceSliceList", result.getKind());
        assertTrue(result.getItems().isEmpty());
        assertNotNull(result.getMetadata());
    }

    //BaseRock generated method id: ${testToJson}, hash: 9265AE727BB98A92ABFB5ABD1822400E
    @Test
    void testToJson() {
        resourceSliceList.setApiVersion("v1alpha3");
        resourceSliceList.setKind("ResourceSliceList");
        resourceSliceList.setItems(new ArrayList<>());
        resourceSliceList.setMetadata(new V1ListMeta());
        String json = resourceSliceList.toJson();
        assertNotNull(json);
        assertTrue(json.contains("\"apiVersion\":\"v1alpha3\""));
        assertTrue(json.contains("\"kind\":\"ResourceSliceList\""));
        assertTrue(json.contains("\"items\":[]"));
        assertTrue(json.contains("\"metadata\":{}"));
    }
}
