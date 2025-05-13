package io.kubernetes.client.openapi.models;

import com.google.gson.Gson;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.openapi.models.V1alpha1StorageVersionMigration;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.io.IOException;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.common.KubernetesListObject;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonArray;
import org.junit.jupiter.params.provider.NullSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1alpha1StorageVersionMigrationListBaseRockGeneratedTest {

    @Mock
    private V1ListMeta mockMetadata;

    @Mock
    private V1alpha1StorageVersionMigration mockMigration;

    private V1alpha1StorageVersionMigrationList migrationList;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        migrationList = new V1alpha1StorageVersionMigrationList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: E4D37DAB33D94C5C99C7432D6CDA8462
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1alpha1";
        migrationList.setApiVersion(apiVersion);
        assertEquals(apiVersion, migrationList.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: 87422A1C8A693CF784F5FF247CD16498
    @ParameterizedTest
    @ValueSource(strings = { "v1", "v2", "v1beta1" })
    void testSetApiVersion(String apiVersion) {
        migrationList.setApiVersion(apiVersion);
        assertEquals(apiVersion, migrationList.getApiVersion());
    }

    //BaseRock generated method id: ${testGetItems}, hash: 7540D228B70A3A896C241CE2B33DA660
    @Test
    void testGetItems() {
        List<V1alpha1StorageVersionMigration> items = new ArrayList<>();
        items.add(mockMigration);
        migrationList.setItems(items);
        assertEquals(items, migrationList.getItems());
    }

    //BaseRock generated method id: ${testSetItems}, hash: 3FFAF6532C50206BD8A749B77A0F831E
    @Test
    void testSetItems() {
        List<V1alpha1StorageVersionMigration> items = new ArrayList<>();
        items.add(mockMigration);
        migrationList.setItems(items);
        assertEquals(items, migrationList.getItems());
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 619FF4349C0EE761DCDE66CFDABC5A6C
    @Test
    void testAddItemsItem() {
        migrationList.addItemsItem(mockMigration);
        assertEquals(1, migrationList.getItems().size());
        assertEquals(mockMigration, migrationList.getItems().get(0));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 6169CDF3ECA1264AA37D26D179D9FE7A
    @Test
    void testGetKind() {
        String kind = "StorageVersionMigrationList";
        migrationList.setKind(kind);
        assertEquals(kind, migrationList.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: 1414CFC1E16979DC04BD6A42C1081019
    @ParameterizedTest
    @ValueSource(strings = { "List", "MigrationList", "VersionMigrationList" })
    void testSetKind(String kind) {
        migrationList.setKind(kind);
        assertEquals(kind, migrationList.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: A9C7D2160E053D357F3F67DEDCE35C96
    @Test
    void testGetMetadata() {
        migrationList.setMetadata(mockMetadata);
        assertEquals(mockMetadata, migrationList.getMetadata());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: FD64156E9CD0729912F2FE26441EDC79
    @Test
    void testSetMetadata() {
        migrationList.setMetadata(mockMetadata);
        assertEquals(mockMetadata, migrationList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: E24127F38F7D1A1382169504A6D552BE
    @Test
    void testEquals() {
        V1alpha1StorageVersionMigrationList list1 = new V1alpha1StorageVersionMigrationList().apiVersion("v1").kind("List").metadata(mockMetadata);
        list1.addItemsItem(mockMigration);
        V1alpha1StorageVersionMigrationList list2 = new V1alpha1StorageVersionMigrationList().apiVersion("v1").kind("List").metadata(mockMetadata);
        list2.addItemsItem(mockMigration);
        assertThat(list1, is(equalTo(list2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: FF3327758268DCB6AF797DA922D9D416
    @Test
    void testHashCode() {
        V1alpha1StorageVersionMigrationList list1 = new V1alpha1StorageVersionMigrationList().apiVersion("v1").kind("List").metadata(mockMetadata);
        list1.addItemsItem(mockMigration);
        V1alpha1StorageVersionMigrationList list2 = new V1alpha1StorageVersionMigrationList().apiVersion("v1").kind("List").metadata(mockMetadata);
        list2.addItemsItem(mockMigration);
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: CB2F59978EB4922CFA3096BCA854737D
    @Test
    void testToString() {
        V1alpha1StorageVersionMigrationList list = new V1alpha1StorageVersionMigrationList().apiVersion("v1").kind("List").metadata(mockMetadata);
        list.addItemsItem(mockMigration);
        String toString = list.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("items"), is(true));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 930DA743A756CACE3A50B487B7D83CCC
    @Disabled()
    @Test
    void testValidateJsonElement() throws IOException {
        JsonElement jsonElement = mock(JsonElement.class);
        JsonObject jsonObject = mock(JsonObject.class);
        JsonElement itemsElement = mock(JsonElement.class);
        JsonArray jsonArray = mock(JsonArray.class);
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        when(jsonObject.entrySet()).thenReturn(new java.util.HashSet<>());
        when(jsonObject.get("items")).thenReturn(itemsElement);
        when(itemsElement.isJsonArray()).thenReturn(true);
        when(itemsElement.getAsJsonArray()).thenReturn(jsonArray);
        when(jsonArray.size()).thenReturn(0);
        V1alpha1StorageVersionMigrationList.validateJsonElement(jsonElement);
    }

    //BaseRock generated method id: ${testValidateJsonElementWithNull}, hash: 11C4E40D2B0964E9685F089C4C4E12E4
    @ParameterizedTest
    @NullSource
    void testValidateJsonElementWithNull(JsonElement jsonElement) {
        assertThrows(IllegalArgumentException.class, () -> V1alpha1StorageVersionMigrationList.validateJsonElement(jsonElement));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 49987A8BA57AB41FF0845D5E5F8ACB6B
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"List\",\"items\":[]}";
        V1alpha1StorageVersionMigrationList result = V1alpha1StorageVersionMigrationList.fromJson(json);
        assertThat(result, notNullValue());
        assertEquals("v1", result.getApiVersion());
        assertEquals("List", result.getKind());
        assertThat(result.getItems(), notNullValue());
        assertEquals(0, result.getItems().size());
    }

    //BaseRock generated method id: ${testToJson}, hash: BD24A39DD1E866D3BC09440A1B575F4F
    @Test
    void testToJson() {
        V1alpha1StorageVersionMigrationList list = new V1alpha1StorageVersionMigrationList().apiVersion("v1").kind("List").metadata(mockMetadata);
        list.addItemsItem(mockMigration);
        String json = list.toJson();
        assertThat(json, notNullValue());
        assertThat(json.contains("apiVersion"), is(true));
        assertThat(json.contains("kind"), is(true));
        assertThat(json.contains("metadata"), is(true));
        assertThat(json.contains("items"), is(true));
    }

    //BaseRock generated method id: ${testImplementsKubernetesListObject}, hash: 8C4253128525F1B673C59A9D6DB200A6
    @Test
    void testImplementsKubernetesListObject() {
        assertThat(migrationList instanceof KubernetesListObject, is(true));
    }
}
