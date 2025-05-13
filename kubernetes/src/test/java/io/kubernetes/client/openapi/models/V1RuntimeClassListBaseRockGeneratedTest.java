package io.kubernetes.client.openapi.models;

import io.kubernetes.client.common.KubernetesObject;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import com.google.gson.JsonObject;
import io.kubernetes.client.common.KubernetesListObject;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import io.kubernetes.client.openapi.JSON;
import com.google.gson.JsonArray;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1RuntimeClassListBaseRockGeneratedTest {

    @Mock
    private V1ListMeta mockMetadata;

    @Mock
    private V1RuntimeClass mockRuntimeClass;

    private V1RuntimeClassList runtimeClassList;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        runtimeClassList = new V1RuntimeClassList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 213CD1F6E10595910412354F2B968016
    @Test
    void testGetApiVersion() {
        assertNull(runtimeClassList.getApiVersion());
        runtimeClassList.setApiVersion("v1");
        assertEquals("v1", runtimeClassList.getApiVersion());
    }

    //BaseRock generated method id: ${testGetItems}, hash: 0F54A2ACEE54C20D8D4B00152CEFC744
    @Test
    void testGetItems() {
        assertTrue(runtimeClassList.getItems().isEmpty());
        List<V1RuntimeClass> items = new ArrayList<>();
        items.add(mockRuntimeClass);
        runtimeClassList.setItems(items);
        assertEquals(1, runtimeClassList.getItems().size());
        assertSame(mockRuntimeClass, runtimeClassList.getItems().get(0));
    }

    //BaseRock generated method id: ${testGetKind}, hash: BB38FE71D0D387B6560E51D76AAE240E
    @Test
    void testGetKind() {
        assertNull(runtimeClassList.getKind());
        runtimeClassList.setKind("RuntimeClassList");
        assertEquals("RuntimeClassList", runtimeClassList.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 270CE1C457BA44D033096E2366A564C2
    @Test
    void testGetMetadata() {
        assertNull(runtimeClassList.getMetadata());
        runtimeClassList.setMetadata(mockMetadata);
        assertSame(mockMetadata, runtimeClassList.getMetadata());
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 5AC4223FC2468C207CE96236AD572B8E
    @Test
    void testAddItemsItem() {
        runtimeClassList.addItemsItem(mockRuntimeClass);
        assertEquals(1, runtimeClassList.getItems().size());
        assertSame(mockRuntimeClass, runtimeClassList.getItems().get(0));
    }

    //BaseRock generated method id: ${testEquals}, hash: 2DCD763D65DA54C38F6A7479859DDBE3
    @Test
    void testEquals() {
        V1RuntimeClassList other = new V1RuntimeClassList();
        assertTrue(runtimeClassList.equals(runtimeClassList));
        assertTrue(runtimeClassList.equals(other));
        runtimeClassList.setApiVersion("v1");
        assertFalse(runtimeClassList.equals(other));
        other.setApiVersion("v1");
        assertTrue(runtimeClassList.equals(other));
        runtimeClassList.addItemsItem(mockRuntimeClass);
        assertFalse(runtimeClassList.equals(other));
        other.addItemsItem(mockRuntimeClass);
        assertTrue(runtimeClassList.equals(other));
        runtimeClassList.setKind("RuntimeClassList");
        assertFalse(runtimeClassList.equals(other));
        other.setKind("RuntimeClassList");
        assertTrue(runtimeClassList.equals(other));
        runtimeClassList.setMetadata(mockMetadata);
        assertFalse(runtimeClassList.equals(other));
        other.setMetadata(mockMetadata);
        assertTrue(runtimeClassList.equals(other));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 55B5305C7BF45EEC23D1F87D055ACBAB
    @Test
    void testHashCode() {
        V1RuntimeClassList other = new V1RuntimeClassList();
        assertEquals(runtimeClassList.hashCode(), other.hashCode());
        runtimeClassList.setApiVersion("v1");
        other.setApiVersion("v1");
        assertEquals(runtimeClassList.hashCode(), other.hashCode());
        runtimeClassList.addItemsItem(mockRuntimeClass);
        other.addItemsItem(mockRuntimeClass);
        assertEquals(runtimeClassList.hashCode(), other.hashCode());
        runtimeClassList.setKind("RuntimeClassList");
        other.setKind("RuntimeClassList");
        assertEquals(runtimeClassList.hashCode(), other.hashCode());
        runtimeClassList.setMetadata(mockMetadata);
        other.setMetadata(mockMetadata);
        assertEquals(runtimeClassList.hashCode(), other.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 68F96341D14B78106B1570BF7C7A57DD
    @Test
    void testToString() {
        runtimeClassList.setApiVersion("v1");
        runtimeClassList.addItemsItem(mockRuntimeClass);
        runtimeClassList.setKind("RuntimeClassList");
        runtimeClassList.setMetadata(mockMetadata);
        String result = runtimeClassList.toString();
        assertTrue(result.contains("apiVersion"));
        assertTrue(result.contains("items"));
        assertTrue(result.contains("kind"));
        assertTrue(result.contains("metadata"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 85288EAE5807F1354C798FA336FA831A
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiVersion", "v1");
        jsonObject.add("items", new JsonArray());
        jsonObject.addProperty("kind", "RuntimeClassList");
        jsonObject.add("metadata", new JsonObject());
        V1RuntimeClassList.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidInput}, hash: 9A79D359820631BAA25A69D93225529A
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "  ", "\t", "\n" })
    void testValidateJsonElementWithInvalidInput(String invalidInput) {
        JsonElement jsonElement = invalidInput == null ? null : new JsonObject();
        assertThrows(IllegalArgumentException.class, () -> V1RuntimeClassList.validateJsonElement(jsonElement));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 8C9DD99A428BCF3F3202D1AA3951C0D4
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1\",\"items\":[],\"kind\":\"RuntimeClassList\",\"metadata\":{}}";
        V1RuntimeClassList result = V1RuntimeClassList.fromJson(json);
        assertNotNull(result);
        assertEquals("v1", result.getApiVersion());
        assertTrue(result.getItems().isEmpty());
        assertEquals("RuntimeClassList", result.getKind());
        assertNotNull(result.getMetadata());
    }

    //BaseRock generated method id: ${testToJson}, hash: 63052B747F63549B7C5D7432A9EA41D7
    @Test
    void testToJson() {
        runtimeClassList.setApiVersion("v1");
        runtimeClassList.setItems(new ArrayList<>());
        runtimeClassList.setKind("RuntimeClassList");
        runtimeClassList.setMetadata(new V1ListMeta());
        String json = runtimeClassList.toJson();
        assertTrue(json.contains("\"apiVersion\":\"v1\""));
        assertTrue(json.contains("\"items\":[]"));
        assertTrue(json.contains("\"kind\":\"RuntimeClassList\""));
        assertTrue(json.contains("\"metadata\":{}"));
    }

    //BaseRock generated method id: ${testImplementsKubernetesListObject}, hash: A92BD54102200819337EC7E44D8D7CEB
    @Test
    void testImplementsKubernetesListObject() {
        assertTrue(runtimeClassList instanceof KubernetesListObject);
    }

    //BaseRock generated method id: ${testKubernetesListObjectMethods}, hash: 81F481B9CC83F2063712D9DA8B35E85A
    @Test
    void testKubernetesListObjectMethods() {
        List<V1RuntimeClass> items = new ArrayList<>();
        items.add(mockRuntimeClass);
        runtimeClassList.setItems(items);
        runtimeClassList.setMetadata(mockMetadata);
        assertEquals(mockMetadata, ((KubernetesListObject) runtimeClassList).getMetadata());
        List<? extends KubernetesObject> kubernetesItems = ((KubernetesListObject) runtimeClassList).getItems();
        assertEquals(1, kubernetesItems.size());
        assertTrue(kubernetesItems.get(0) instanceof V1RuntimeClass);
    }
}
