package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import java.util.Set;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import com.google.gson.JsonObject;
import io.kubernetes.client.openapi.models.V1beta1ResourceClaimTemplate;
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
class V1beta1ResourceClaimTemplateListBaseRockGeneratedTest {

    @Mock
    private V1ListMeta mockMetadata;

    @Mock
    private V1beta1ResourceClaimTemplate mockTemplate;

    private V1beta1ResourceClaimTemplateList templateList;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        templateList = new V1beta1ResourceClaimTemplateList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 548A0578C130886A35EF92153EA346BC
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1beta1";
        templateList.setApiVersion(apiVersion);
        assertEquals(apiVersion, templateList.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: CB0B6B6E5900966BE3AB23810DCC0F0F
    @Test
    void testSetApiVersion() {
        String apiVersion = "v1beta1";
        templateList.setApiVersion(apiVersion);
        assertEquals(apiVersion, templateList.getApiVersion());
    }

    //BaseRock generated method id: ${testGetItems}, hash: 46C8DF890A3FD096975AC3334E39E32A
    @Test
    void testGetItems() {
        List<V1beta1ResourceClaimTemplate> items = new ArrayList<>();
        items.add(mockTemplate);
        templateList.setItems(items);
        assertEquals(items, templateList.getItems());
    }

    //BaseRock generated method id: ${testSetItems}, hash: 770E5B099D45758B5FD84D3ADA2DBB3E
    @Test
    void testSetItems() {
        List<V1beta1ResourceClaimTemplate> items = new ArrayList<>();
        items.add(mockTemplate);
        templateList.setItems(items);
        assertEquals(items, templateList.getItems());
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 733BF36794B53EDFA750FD0239A337BE
    @Test
    void testAddItemsItem() {
        templateList.addItemsItem(mockTemplate);
        assertEquals(1, templateList.getItems().size());
        assertEquals(mockTemplate, templateList.getItems().get(0));
    }

    //BaseRock generated method id: ${testGetKind}, hash: B5829FDC784D40ABAA66055DF11004F1
    @Test
    void testGetKind() {
        String kind = "ResourceClaimTemplateList";
        templateList.setKind(kind);
        assertEquals(kind, templateList.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: FB1129926AF15952C25B3B17A353A6BB
    @Test
    void testSetKind() {
        String kind = "ResourceClaimTemplateList";
        templateList.setKind(kind);
        assertEquals(kind, templateList.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 1D2D5A16FC8790E94B40C553FE60B9F3
    @Test
    void testGetMetadata() {
        templateList.setMetadata(mockMetadata);
        assertEquals(mockMetadata, templateList.getMetadata());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: 8165EABBB808EBEFF53491BD2E811CA1
    @Test
    void testSetMetadata() {
        templateList.setMetadata(mockMetadata);
        assertEquals(mockMetadata, templateList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: 9463875F2EAFC9F7EA523B4F303C6610
    @Test
    void testEquals() {
        V1beta1ResourceClaimTemplateList list1 = new V1beta1ResourceClaimTemplateList().apiVersion("v1beta1").kind("ResourceClaimTemplateList").metadata(mockMetadata);
        list1.addItemsItem(mockTemplate);
        V1beta1ResourceClaimTemplateList list2 = new V1beta1ResourceClaimTemplateList().apiVersion("v1beta1").kind("ResourceClaimTemplateList").metadata(mockMetadata);
        list2.addItemsItem(mockTemplate);
        assertTrue(list1.equals(list2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: BE0D77E8A6EA2D46AF03DDC22CFD6A59
    @Test
    void testHashCode() {
        V1beta1ResourceClaimTemplateList list1 = new V1beta1ResourceClaimTemplateList().apiVersion("v1beta1").kind("ResourceClaimTemplateList").metadata(mockMetadata);
        list1.addItemsItem(mockTemplate);
        V1beta1ResourceClaimTemplateList list2 = new V1beta1ResourceClaimTemplateList().apiVersion("v1beta1").kind("ResourceClaimTemplateList").metadata(mockMetadata);
        list2.addItemsItem(mockTemplate);
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 176215FE772FEEB894CE3C2B98361E7F
    @Test
    void testToString() {
        templateList.setApiVersion("v1beta1");
        templateList.setKind("ResourceClaimTemplateList");
        templateList.setMetadata(mockMetadata);
        templateList.addItemsItem(mockTemplate);
        String expectedString = "class V1beta1ResourceClaimTemplateList {\n" + "    apiVersion: v1beta1\n" + "    items: [" + mockTemplate.toString() + "]\n" + "    kind: ResourceClaimTemplateList\n" + "    metadata: " + mockMetadata.toString() + "\n" + "}";
        assertEquals(expectedString, templateList.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 24C5F7FF949F361E5027AAF3815E93D2
    @Disabled()
    @Test
    void testValidateJsonElement() throws IOException {
        JsonElement jsonElement = mock(JsonElement.class);
        JsonObject jsonObject = mock(JsonObject.class);
        JsonArray jsonArray = mock(JsonArray.class);
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        when(jsonObject.entrySet()).thenReturn(Set.of());
        when(jsonObject.get("items")).thenReturn(jsonArray);
        when(jsonArray.isJsonArray()).thenReturn(true);
        V1beta1ResourceClaimTemplateList.validateJsonElement(jsonElement);
        verify(jsonElement).getAsJsonObject();
        verify(jsonObject).entrySet();
        verify(jsonObject).get("items");
        verify(jsonArray).isJsonArray();
    }

    //BaseRock generated method id: ${testFromJson}, hash: 7C257AF3F2C10DF00F27A4B07C206E8C
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1beta1\",\"kind\":\"ResourceClaimTemplateList\",\"items\":[]}";
        V1beta1ResourceClaimTemplateList result = V1beta1ResourceClaimTemplateList.fromJson(json);
        assertNotNull(result);
        assertEquals("v1beta1", result.getApiVersion());
        assertEquals("ResourceClaimTemplateList", result.getKind());
        assertNotNull(result.getItems());
        assertTrue(result.getItems().isEmpty());
    }

    //BaseRock generated method id: ${testToJson}, hash: C6CBC89A18F61C44A4FADC3139C09C2D
    @Test
    void testToJson() {
        templateList.setApiVersion("v1beta1");
        templateList.setKind("ResourceClaimTemplateList");
        templateList.setItems(new ArrayList<>());
        String json = templateList.toJson();
        assertTrue(json.contains("\"apiVersion\":\"v1beta1\""));
        assertTrue(json.contains("\"kind\":\"ResourceClaimTemplateList\""));
        assertTrue(json.contains("\"items\":[]"));
    }
}
