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
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1ClusterRole;
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
class V1ClusterRoleListBaseRockGeneratedTest {

    @Mock
    private V1ListMeta mockMetadata;

    @Mock
    private V1ClusterRole mockClusterRole;

    private V1ClusterRoleList v1ClusterRoleList;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        v1ClusterRoleList = new V1ClusterRoleList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: BE85289E3030D265499AAA3FEB904B90
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1";
        v1ClusterRoleList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1ClusterRoleList.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: 56AC570147720EFFA5FA35261AB0BF1A
    @Test
    void testSetApiVersion() {
        String apiVersion = "v1";
        v1ClusterRoleList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1ClusterRoleList.getApiVersion());
    }

    //BaseRock generated method id: ${testGetItems}, hash: 6224174D472F518A848BC148190C36EB
    @Test
    void testGetItems() {
        List<V1ClusterRole> items = new ArrayList<>();
        items.add(mockClusterRole);
        v1ClusterRoleList.setItems(items);
        assertEquals(items, v1ClusterRoleList.getItems());
    }

    //BaseRock generated method id: ${testSetItems}, hash: E7A5E1F5AA8E9DF34D75A0CA9FEEA184
    @Test
    void testSetItems() {
        List<V1ClusterRole> items = new ArrayList<>();
        items.add(mockClusterRole);
        v1ClusterRoleList.setItems(items);
        assertEquals(items, v1ClusterRoleList.getItems());
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 06F311F033DF15BAF05907E7FBACC768
    @Test
    void testAddItemsItem() {
        v1ClusterRoleList.addItemsItem(mockClusterRole);
        assertEquals(1, v1ClusterRoleList.getItems().size());
        assertEquals(mockClusterRole, v1ClusterRoleList.getItems().get(0));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 8785DBB44436E043E32CD2F111A35F59
    @Test
    void testGetKind() {
        String kind = "ClusterRoleList";
        v1ClusterRoleList.setKind(kind);
        assertEquals(kind, v1ClusterRoleList.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: C09F1114D583B6E5447F3E641317A661
    @Test
    void testSetKind() {
        String kind = "ClusterRoleList";
        v1ClusterRoleList.setKind(kind);
        assertEquals(kind, v1ClusterRoleList.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: FBC50F7061DEB0AAB744E59EF23C8AA9
    @Test
    void testGetMetadata() {
        v1ClusterRoleList.setMetadata(mockMetadata);
        assertEquals(mockMetadata, v1ClusterRoleList.getMetadata());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: F9E5261070AD2404EAFD6E59CFA88281
    @Test
    void testSetMetadata() {
        v1ClusterRoleList.setMetadata(mockMetadata);
        assertEquals(mockMetadata, v1ClusterRoleList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: 6B248D77DACB4AFAE59625967884E360
    @Test
    void testEquals() {
        V1ClusterRoleList list1 = new V1ClusterRoleList();
        V1ClusterRoleList list2 = new V1ClusterRoleList();
        assertTrue(list1.equals(list2));
        list1.setApiVersion("v1");
        list1.setKind("ClusterRoleList");
        list1.setMetadata(mockMetadata);
        List<V1ClusterRole> items = new ArrayList<>();
        items.add(mockClusterRole);
        list1.setItems(items);
        list2.setApiVersion("v1");
        list2.setKind("ClusterRoleList");
        list2.setMetadata(mockMetadata);
        list2.setItems(items);
        assertTrue(list1.equals(list2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: D81C59AC070D84D160942E655CAEDBF1
    @Test
    void testHashCode() {
        V1ClusterRoleList list1 = new V1ClusterRoleList();
        V1ClusterRoleList list2 = new V1ClusterRoleList();
        assertEquals(list1.hashCode(), list2.hashCode());
        list1.setApiVersion("v1");
        list1.setKind("ClusterRoleList");
        list1.setMetadata(mockMetadata);
        List<V1ClusterRole> items = new ArrayList<>();
        items.add(mockClusterRole);
        list1.setItems(items);
        list2.setApiVersion("v1");
        list2.setKind("ClusterRoleList");
        list2.setMetadata(mockMetadata);
        list2.setItems(items);
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 7E4112E3DF02046FBF970ECCA579F2EE
    @Test
    void testToString() {
        v1ClusterRoleList.setApiVersion("v1");
        v1ClusterRoleList.setKind("ClusterRoleList");
        v1ClusterRoleList.setMetadata(mockMetadata);
        List<V1ClusterRole> items = new ArrayList<>();
        items.add(mockClusterRole);
        v1ClusterRoleList.setItems(items);
        String expectedString = "class V1ClusterRoleList {\n" + "    apiVersion: v1\n" + "    items: [" + mockClusterRole.toString() + "]\n" + "    kind: ClusterRoleList\n" + "    metadata: " + mockMetadata.toString() + "\n" + "}";
        assertEquals(expectedString, v1ClusterRoleList.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 0040D16A4857C470C099C42C68DAD59B
    @Disabled()
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = mock(JsonObject.class);
        JsonElement jsonElement = mock(JsonElement.class);
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        when(jsonObject.entrySet()).thenReturn(Set.of());
        when(jsonObject.get("items")).thenReturn(jsonElement);
        when(jsonElement.isJsonArray()).thenReturn(true);
        JsonArray jsonArray = mock(JsonArray.class);
        when(jsonElement.getAsJsonArray()).thenReturn(jsonArray);
        when(jsonArray.size()).thenReturn(1);
        when(jsonArray.get(0)).thenReturn(mock(JsonElement.class));
        V1ClusterRoleList.validateJsonElement(jsonElement);
        verify(jsonElement).getAsJsonObject();
        verify(jsonObject).entrySet();
        verify(jsonObject, atLeast(1)).get("items");
        verify(jsonElement).isJsonArray();
        verify(jsonElement).getAsJsonArray();
        verify(jsonArray).size();
        verify(jsonArray).get(0);
    }

    //BaseRock generated method id: ${testValidateJsonElementThrowsIOException}, hash: 30B858380E42B12F4BD52835CD012954
    @Test
    void testValidateJsonElementThrowsIOException() {
        JsonElement jsonElement = mock(JsonElement.class);
        when(jsonElement.getAsJsonObject()).thenReturn(new JsonObject());
        assertThrows(IllegalArgumentException.class, () -> V1ClusterRoleList.validateJsonElement(jsonElement));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 77EEAC56FF4CA7BCEA946777F9AE4CD1
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"ClusterRoleList\",\"items\":[]}";
        V1ClusterRoleList result = V1ClusterRoleList.fromJson(json);
        assertNotNull(result);
        assertEquals("v1", result.getApiVersion());
        assertEquals("ClusterRoleList", result.getKind());
        assertNotNull(result.getItems());
        assertTrue(result.getItems().isEmpty());
    }

    //BaseRock generated method id: ${testToJson}, hash: 618925CCD9FB3943CCE577EB1F407A8C
    @Test
    void testToJson() {
        v1ClusterRoleList.setApiVersion("v1");
        v1ClusterRoleList.setKind("ClusterRoleList");
        List<V1ClusterRole> items = new ArrayList<>();
        v1ClusterRoleList.setItems(items);
        String json = v1ClusterRoleList.toJson();
        assertTrue(json.contains("\"apiVersion\":\"v1\""));
        assertTrue(json.contains("\"kind\":\"ClusterRoleList\""));
        assertTrue(json.contains("\"items\":[]"));
    }
}
