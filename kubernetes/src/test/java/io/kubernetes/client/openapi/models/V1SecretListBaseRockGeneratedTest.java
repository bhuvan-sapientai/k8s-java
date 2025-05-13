package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import io.kubernetes.client.openapi.models.V1Secret;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import java.util.HashSet;
import java.util.Set;
import org.mockito.MockitoAnnotations;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1SecretListBaseRockGeneratedTest {

    @Mock
    private V1ListMeta mockMetadata;

    @Mock
    private V1Secret mockSecret;

    private V1SecretList v1SecretList;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        v1SecretList = new V1SecretList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: CE063C5FF9FA7894BA2BFF38ED20D3D9
    @Test
    void testGetApiVersion() {
        assertNull(v1SecretList.getApiVersion());
        v1SecretList.setApiVersion("v1");
        assertEquals("v1", v1SecretList.getApiVersion());
    }

    //BaseRock generated method id: ${testGetItems}, hash: 11AD013BBF20341B5A773C4ED7E7718F
    @Test
    void testGetItems() {
        assertTrue(v1SecretList.getItems().isEmpty());
        List<V1Secret> secrets = new ArrayList<>();
        secrets.add(mockSecret);
        v1SecretList.setItems(secrets);
        assertEquals(1, v1SecretList.getItems().size());
        assertSame(mockSecret, v1SecretList.getItems().get(0));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 31643D0CC622B17E6931A4CB690AB425
    @Test
    void testGetKind() {
        assertNull(v1SecretList.getKind());
        v1SecretList.setKind("SecretList");
        assertEquals("SecretList", v1SecretList.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: B5D50EEC0E6A67CE88DCA737BB32355A
    @Test
    void testGetMetadata() {
        assertNull(v1SecretList.getMetadata());
        v1SecretList.setMetadata(mockMetadata);
        assertSame(mockMetadata, v1SecretList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: 58DA4AE1BDFFA38F9D9B7E070F24CF22
    @Test
    void testEquals() {
        V1SecretList list1 = new V1SecretList();
        V1SecretList list2 = new V1SecretList();
        assertTrue(list1.equals(list2));
        list1.setApiVersion("v1");
        assertFalse(list1.equals(list2));
        list2.setApiVersion("v1");
        assertTrue(list1.equals(list2));
        List<V1Secret> secrets = new ArrayList<>();
        secrets.add(mockSecret);
        list1.setItems(secrets);
        assertFalse(list1.equals(list2));
        list2.setItems(secrets);
        assertTrue(list1.equals(list2));
        list1.setKind("SecretList");
        assertFalse(list1.equals(list2));
        list2.setKind("SecretList");
        assertTrue(list1.equals(list2));
        list1.setMetadata(mockMetadata);
        assertFalse(list1.equals(list2));
        list2.setMetadata(mockMetadata);
        assertTrue(list1.equals(list2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 987FA86CC33D09DDB3205E06810461FC
    @Test
    void testHashCode() {
        V1SecretList list1 = new V1SecretList();
        V1SecretList list2 = new V1SecretList();
        assertEquals(list1.hashCode(), list2.hashCode());
        list1.setApiVersion("v1");
        list1.setKind("SecretList");
        list1.setMetadata(mockMetadata);
        List<V1Secret> secrets = new ArrayList<>();
        secrets.add(mockSecret);
        list1.setItems(secrets);
        list2.setApiVersion("v1");
        list2.setKind("SecretList");
        list2.setMetadata(mockMetadata);
        list2.setItems(secrets);
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 8796EAEFF98A7CC0D09ED2337B8435C0
    @Test
    void testToString() {
        v1SecretList.setApiVersion("v1");
        v1SecretList.setKind("SecretList");
        v1SecretList.setMetadata(mockMetadata);
        List<V1Secret> secrets = new ArrayList<>();
        secrets.add(mockSecret);
        v1SecretList.setItems(secrets);
        String toString = v1SecretList.toString();
        assertTrue(toString.contains("apiVersion: v1"));
        assertTrue(toString.contains("kind: SecretList"));
        assertTrue(toString.contains("metadata:"));
        assertTrue(toString.contains("items:"));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 19EBFF4B8C4985FA78C201D4205E58A8
    @Test
    void testAddItemsItem() {
        assertTrue(v1SecretList.getItems().isEmpty());
        v1SecretList.addItemsItem(mockSecret);
        assertEquals(1, v1SecretList.getItems().size());
        assertSame(mockSecret, v1SecretList.getItems().get(0));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: A1DA203DB8D3597380154541489F0735
    @Disabled()
    @Test
    void testValidateJsonElement() throws Exception {
        JsonElement jsonElement = mock(JsonElement.class);
        JsonObject jsonObject = mock(JsonObject.class);
        JsonElement apiVersionElement = mock(JsonElement.class);
        JsonElement itemsElement = mock(JsonElement.class);
        JsonArray itemsArray = mock(JsonArray.class);
        JsonElement kindElement = mock(JsonElement.class);
        JsonElement metadataElement = mock(JsonElement.class);
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        when(jsonObject.entrySet()).thenReturn(new HashSet<Map.Entry<String, JsonElement>>());
        when(jsonObject.get("apiVersion")).thenReturn(apiVersionElement);
        when(jsonObject.get("items")).thenReturn(itemsElement);
        when(jsonObject.get("kind")).thenReturn(kindElement);
        when(jsonObject.get("metadata")).thenReturn(metadataElement);
        when(apiVersionElement.isJsonNull()).thenReturn(false);
        when(apiVersionElement.isJsonPrimitive()).thenReturn(true);
        when(itemsElement.isJsonArray()).thenReturn(true);
        when(itemsElement.getAsJsonArray()).thenReturn(itemsArray);
        when(itemsArray.size()).thenReturn(0);
        when(kindElement.isJsonNull()).thenReturn(false);
        when(kindElement.isJsonPrimitive()).thenReturn(true);
        when(metadataElement.isJsonNull()).thenReturn(true);
        V1SecretList.validateJsonElement(jsonElement);
        verify(jsonElement).getAsJsonObject();
        verify(jsonObject).entrySet();
        verify(jsonObject).get("apiVersion");
        verify(jsonObject).get("items");
        verify(jsonObject).get("kind");
        verify(jsonObject).get("metadata");
        verify(apiVersionElement).isJsonNull();
        verify(apiVersionElement).isJsonPrimitive();
        verify(itemsElement).isJsonArray();
        verify(itemsArray).size();
        verify(kindElement).isJsonNull();
        verify(kindElement).isJsonPrimitive();
        verify(metadataElement).isJsonNull();
    }

    //BaseRock generated method id: ${testFromJson}, hash: B511CFED389EBA3B28B6D4EF3621C7E9
    @Test
    void testFromJson() throws Exception {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"SecretList\",\"metadata\":{},\"items\":[]}";
        V1SecretList secretList = V1SecretList.fromJson(json);
        assertNotNull(secretList);
        assertEquals("v1", secretList.getApiVersion());
        assertEquals("SecretList", secretList.getKind());
        assertNotNull(secretList.getMetadata());
        assertTrue(secretList.getItems().isEmpty());
    }

    //BaseRock generated method id: ${testToJson}, hash: C0BB2B61327080D24A99E6A0BD290D7E
    @Test
    void testToJson() {
        v1SecretList.setApiVersion("v1");
        v1SecretList.setKind("SecretList");
        v1SecretList.setMetadata(new V1ListMeta());
        v1SecretList.setItems(new ArrayList<>());
        String json = v1SecretList.toJson();
        assertTrue(json.contains("\"apiVersion\":\"v1\""));
        assertTrue(json.contains("\"kind\":\"SecretList\""));
        assertTrue(json.contains("\"metadata\":{}"));
        assertTrue(json.contains("\"items\":[]"));
    }
}
