package io.kubernetes.client.openapi.models;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import static org.mockito.Mockito.*;
import java.io.IOException;
import io.kubernetes.client.common.KubernetesObject;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import java.util.HashSet;
import java.util.Set;
import static org.hamcrest.Matchers.*;
import io.kubernetes.client.common.KubernetesListObject;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonArray;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1ServiceListBaseRockGeneratedTest {

    @Mock
    private V1ListMeta mockMetadata;

    @Mock
    private V1Service mockService;

    private V1ServiceList serviceList;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        serviceList = new V1ServiceList();
    }

    //BaseRock generated method id: ${testV1ServiceListImplementsKubernetesListObject}, hash: B7E453FA92A7E76C04E232AC50DA98E7
    @Test
    void testV1ServiceListImplementsKubernetesListObject() {
        assertThat(serviceList, is(instanceOf(KubernetesListObject.class)));
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: E34B30CB3416D43981BB72512F2E62AE
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1";
        serviceList.setApiVersion(apiVersion);
        assertEquals(apiVersion, serviceList.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: C510D71F35C6387B444264117455B096
    @Test
    void testSetApiVersion() {
        String apiVersion = "v1";
        serviceList.setApiVersion(apiVersion);
        assertEquals(apiVersion, serviceList.getApiVersion());
    }

    //BaseRock generated method id: ${testGetItems}, hash: BCDA29664D7E4471D820BB7C13D1B3A6
    @Test
    void testGetItems() {
        List<V1Service> items = new ArrayList<>();
        items.add(mockService);
        serviceList.setItems(items);
        assertEquals(items, serviceList.getItems());
    }

    //BaseRock generated method id: ${testSetItems}, hash: E05CEB837A91EA7644FD4A1BAA7194A8
    @Test
    void testSetItems() {
        List<V1Service> items = new ArrayList<>();
        items.add(mockService);
        serviceList.setItems(items);
        assertEquals(items, serviceList.getItems());
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 860B0F23813CF63E7D0CF3F6DD2BFCAE
    @Test
    void testAddItemsItem() {
        serviceList.addItemsItem(mockService);
        assertThat(serviceList.getItems(), hasItem(mockService));
    }

    //BaseRock generated method id: ${testGetKind}, hash: DD1CF8EF3ABEE6FF1BCB132147E3A398
    @Test
    void testGetKind() {
        String kind = "ServiceList";
        serviceList.setKind(kind);
        assertEquals(kind, serviceList.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: 9D81847E16C46D77FDF9CA7A895132CD
    @Test
    void testSetKind() {
        String kind = "ServiceList";
        serviceList.setKind(kind);
        assertEquals(kind, serviceList.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: D66E65794D706E963ECA1F3FFE9A37F9
    @Test
    void testGetMetadata() {
        serviceList.setMetadata(mockMetadata);
        assertEquals(mockMetadata, serviceList.getMetadata());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: 4501FDDFD463949BEF9D8C7F7FE576C5
    @Test
    void testSetMetadata() {
        serviceList.setMetadata(mockMetadata);
        assertEquals(mockMetadata, serviceList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: FCDB3F568E96BF61925C2B11FC5E3756
    @Test
    void testEquals() {
        V1ServiceList serviceList1 = new V1ServiceList().apiVersion("v1").items(new ArrayList<>()).kind("ServiceList").metadata(mockMetadata);
        V1ServiceList serviceList2 = new V1ServiceList().apiVersion("v1").items(new ArrayList<>()).kind("ServiceList").metadata(mockMetadata);
        assertEquals(serviceList1, serviceList2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 2B06E6750970BC971F0BEB21C9AD270F
    @Test
    void testHashCode() {
        V1ServiceList serviceList1 = new V1ServiceList().apiVersion("v1").items(new ArrayList<>()).kind("ServiceList").metadata(mockMetadata);
        V1ServiceList serviceList2 = new V1ServiceList().apiVersion("v1").items(new ArrayList<>()).kind("ServiceList").metadata(mockMetadata);
        assertEquals(serviceList1.hashCode(), serviceList2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: DD39C643E5EDD273AAE9B49F080FBC3F
    @Test
    void testToString() {
        V1ServiceList serviceList = new V1ServiceList().apiVersion("v1").items(new ArrayList<>()).kind("ServiceList").metadata(mockMetadata);
        String expected = "class V1ServiceList {\n" + "    apiVersion: v1\n" + "    items: []\n" + "    kind: ServiceList\n" + "    metadata: " + mockMetadata + "\n" + "}";
        assertEquals(expected, serviceList.toString());
    }

    //BaseRock generated method id: ${testApiVersionWithDifferentValues}, hash: 2621A1A9EC81571865F1A39B2C2ACF48
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "v1", "v2" })
    void testApiVersionWithDifferentValues(String apiVersion) {
        serviceList.setApiVersion(apiVersion);
        assertEquals(apiVersion, serviceList.getApiVersion());
    }

    //BaseRock generated method id: ${testItemsWithMultipleServices}, hash: A0CA78DF80540B39792E7B90A2E684BC
    @Test
    void testItemsWithMultipleServices() {
        List<V1Service> items = new ArrayList<>();
        items.add(mockService);
        items.add(mock(V1Service.class));
        serviceList.setItems(items);
        assertEquals(2, serviceList.getItems().size());
        assertTrue(serviceList.getItems().contains(mockService));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: D9F6BCE027FAF762FF3D01E924DEFF2C
    @Disabled()
    @Test
    void testValidateJsonElement() throws IOException {
        JsonElement mockJsonElement = mock(JsonElement.class);
        JsonObject mockJsonObject = mock(JsonObject.class);
        when(mockJsonElement.getAsJsonObject()).thenReturn(mockJsonObject);
        Set<Map.Entry<String, JsonElement>> entrySet = new HashSet<>();
        when(mockJsonObject.entrySet()).thenReturn(entrySet);
        JsonElement mockItemsElement = mock(JsonElement.class);
        when(mockJsonObject.get("items")).thenReturn(mockItemsElement);
        when(mockItemsElement.isJsonArray()).thenReturn(true);
        JsonArray mockJsonArray = mock(JsonArray.class);
        when(mockItemsElement.getAsJsonArray()).thenReturn(mockJsonArray);
        when(mockJsonArray.size()).thenReturn(0);
        assertDoesNotThrow(() -> V1ServiceList.validateJsonElement(mockJsonElement));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidField}, hash: EFECAE5FDA9A09F177BBD2E2E4A6AFC1
    @Test
    void testValidateJsonElementWithInvalidField() {
        JsonElement mockJsonElement = mock(JsonElement.class);
        JsonObject mockJsonObject = mock(JsonObject.class);
        when(mockJsonElement.getAsJsonObject()).thenReturn(mockJsonObject);
        Set<Map.Entry<String, JsonElement>> entrySet = new HashSet<>();
        Map.Entry<String, JsonElement> mockEntry = mock(Map.Entry.class);
        when(mockEntry.getKey()).thenReturn("invalidField");
        entrySet.add(mockEntry);
        when(mockJsonObject.entrySet()).thenReturn(entrySet);
        assertThrows(IllegalArgumentException.class, () -> V1ServiceList.validateJsonElement(mockJsonElement));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 5BC52BCC970374A0D705BB3334C5EA97
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"ServiceList\",\"items\":[]}";
        V1ServiceList result = V1ServiceList.fromJson(json);
        assertNotNull(result);
        assertEquals("v1", result.getApiVersion());
        assertEquals("ServiceList", result.getKind());
        assertNotNull(result.getItems());
        assertTrue(result.getItems().isEmpty());
    }

    //BaseRock generated method id: ${testToJson}, hash: 6D51FFBE47C2A454929EE48890591A8E
    @Test
    void testToJson() {
        V1ServiceList serviceList = new V1ServiceList().apiVersion("v1").kind("ServiceList").items(new ArrayList<>());
        String json = serviceList.toJson();
        assertNotNull(json);
        assertTrue(json.contains("\"apiVersion\":\"v1\""));
        assertTrue(json.contains("\"kind\":\"ServiceList\""));
        assertTrue(json.contains("\"items\":[]"));
    }
}
