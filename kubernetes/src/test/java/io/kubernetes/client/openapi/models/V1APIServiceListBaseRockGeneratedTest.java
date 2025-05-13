package io.kubernetes.client.openapi.models;

import com.google.gson.Gson;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.closeTo;
import io.kubernetes.client.common.KubernetesListObject;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.openapi.JSON;
import com.google.gson.JsonArray;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1APIServiceListBaseRockGeneratedTest {

    @Mock
    private V1ListMeta mockMetadata;

    @Mock
    private V1APIService mockApiService;

    private V1APIServiceList v1APIServiceList;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        v1APIServiceList = new V1APIServiceList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 672F99A2B6BACE96F9DC4F69DAAA35A2
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1";
        v1APIServiceList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1APIServiceList.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: AE45CCA090D1FDBFF03F2F56709C8664
    @Test
    void testSetApiVersion() {
        String apiVersion = "v1";
        v1APIServiceList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1APIServiceList.getApiVersion());
    }

    //BaseRock generated method id: ${testGetItems}, hash: 7A90ACA07187A87534A11466216B72D3
    @Test
    void testGetItems() {
        List<V1APIService> items = new ArrayList<>();
        items.add(mockApiService);
        v1APIServiceList.setItems(items);
        assertEquals(items, v1APIServiceList.getItems());
    }

    //BaseRock generated method id: ${testSetItems}, hash: 552BCE97567364B929D1E17D3FB3E0B5
    @Test
    void testSetItems() {
        List<V1APIService> items = new ArrayList<>();
        items.add(mockApiService);
        v1APIServiceList.setItems(items);
        assertEquals(items, v1APIServiceList.getItems());
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 5ABE42914AEA96D2F633F434D6FD6FFE
    @Test
    void testAddItemsItem() {
        v1APIServiceList.addItemsItem(mockApiService);
        assertEquals(1, v1APIServiceList.getItems().size());
        assertEquals(mockApiService, v1APIServiceList.getItems().get(0));
    }

    //BaseRock generated method id: ${testGetKind}, hash: EF455A57D39096406ECA7BC4DD3D1261
    @Test
    void testGetKind() {
        String kind = "APIServiceList";
        v1APIServiceList.setKind(kind);
        assertEquals(kind, v1APIServiceList.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: E578CE42CC1C1DD4C3E7D7AFABCB23A1
    @Test
    void testSetKind() {
        String kind = "APIServiceList";
        v1APIServiceList.setKind(kind);
        assertEquals(kind, v1APIServiceList.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: BAE58E890481B05F96D99D3CA988C58E
    @Test
    void testGetMetadata() {
        v1APIServiceList.setMetadata(mockMetadata);
        assertEquals(mockMetadata, v1APIServiceList.getMetadata());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: 06D2B615452A18599C58E80F7BA7361F
    @Test
    void testSetMetadata() {
        v1APIServiceList.setMetadata(mockMetadata);
        assertEquals(mockMetadata, v1APIServiceList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: BBE912B089A9D21C711A284E7142435C
    @Test
    void testEquals() {
        V1APIServiceList list1 = new V1APIServiceList().apiVersion("v1").kind("APIServiceList").metadata(mockMetadata);
        list1.addItemsItem(mockApiService);
        V1APIServiceList list2 = new V1APIServiceList().apiVersion("v1").kind("APIServiceList").metadata(mockMetadata);
        list2.addItemsItem(mockApiService);
        assertEquals(list1, list2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: CFDE7B81872AAE774C3AAF102B0BEF50
    @Test
    void testHashCode() {
        V1APIServiceList list1 = new V1APIServiceList().apiVersion("v1").kind("APIServiceList").metadata(mockMetadata);
        list1.addItemsItem(mockApiService);
        V1APIServiceList list2 = new V1APIServiceList().apiVersion("v1").kind("APIServiceList").metadata(mockMetadata);
        list2.addItemsItem(mockApiService);
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 460BF90200EDB62700B4095D0C55A4EC
    @Test
    void testToString() {
        v1APIServiceList.setApiVersion("v1");
        v1APIServiceList.setKind("APIServiceList");
        v1APIServiceList.setMetadata(mockMetadata);
        v1APIServiceList.addItemsItem(mockApiService);
        String expectedString = "class V1APIServiceList {\n" + "    apiVersion: v1\n" + "    items: [" + mockApiService + "]\n" + "    kind: APIServiceList\n" + "    metadata: " + mockMetadata + "\n" + "}";
        assertEquals(expectedString, v1APIServiceList.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: EB51C150A394FB993C0C2870FB05B579
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiVersion", "v1");
        jsonObject.addProperty("kind", "APIServiceList");
        JsonObject metadataObject = new JsonObject();
        jsonObject.add("metadata", metadataObject);
        JsonArray itemsArray = new JsonArray();
        jsonObject.add("items", itemsArray);
        assertDoesNotThrow(() -> V1APIServiceList.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testFromJsonInvalidInput}, hash: F256ABB3D21413FFEB2148C280B965A5
    @Disabled()
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { " ", "  " })
    void testFromJsonInvalidInput(String json) {
        assertThrows(IllegalArgumentException.class, () -> V1APIServiceList.fromJson(json));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 139BD26CFC82284C7872702273BA5F63
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"APIServiceList\",\"metadata\":{},\"items\":[]}";
        V1APIServiceList result = V1APIServiceList.fromJson(json);
        assertNotNull(result);
        assertEquals("v1", result.getApiVersion());
        assertEquals("APIServiceList", result.getKind());
        assertNotNull(result.getMetadata());
        assertNotNull(result.getItems());
    }

    //BaseRock generated method id: ${testToJson}, hash: 7D1C1CBB3041B66612C9D3AE7538CFC1
    @Test
    void testToJson() {
        v1APIServiceList.setApiVersion("v1");
        v1APIServiceList.setKind("APIServiceList");
        v1APIServiceList.setMetadata(new V1ListMeta());
        v1APIServiceList.setItems(new ArrayList<>());
        String json = v1APIServiceList.toJson();
        assertNotNull(json);
        assertTrue(json.contains("\"apiVersion\":\"v1\""));
        assertTrue(json.contains("\"kind\":\"APIServiceList\""));
        assertTrue(json.contains("\"metadata\":{}"));
        assertTrue(json.contains("\"items\":[]"));
    }

    //BaseRock generated method id: ${testImplementsKubernetesListObject}, hash: 2A64B854ADB7A7D5A77A3D6EDC45C0DC
    @Test
    void testImplementsKubernetesListObject() {
        assertTrue(v1APIServiceList instanceof KubernetesListObject);
    }

    //BaseRock generated method id: ${testJsonSerialization}, hash: B082C6726BEB65071BD85846F2A9FA75
    @Test
    void testJsonSerialization() throws IOException {
        try (MockedStatic<JSON> jsonMock = mockStatic(JSON.class)) {
            Gson mockGson = mock(Gson.class);
            jsonMock.when(JSON::getGson).thenReturn(mockGson);
            v1APIServiceList.setApiVersion("v1");
            v1APIServiceList.setKind("APIServiceList");
            v1APIServiceList.setMetadata(new V1ListMeta());
            v1APIServiceList.setItems(new ArrayList<>());
            when(mockGson.toJson(any(V1APIServiceList.class))).thenReturn("{\"mockedJson\":true}");
            String json = v1APIServiceList.toJson();
            assertEquals("{\"mockedJson\":true}", json);
            verify(mockGson).toJson(v1APIServiceList);
        }
    }
}
