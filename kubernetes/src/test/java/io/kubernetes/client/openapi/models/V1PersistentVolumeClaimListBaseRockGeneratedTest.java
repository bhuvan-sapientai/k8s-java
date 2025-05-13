package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1PersistentVolumeClaim;
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
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import java.util.ArrayList;
import static org.hamcrest.Matchers.not;
import com.google.gson.JsonArray;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PersistentVolumeClaimListBaseRockGeneratedTest {

    private V1PersistentVolumeClaimList v1PersistentVolumeClaimList;

    @BeforeEach
    void setUp() {
        v1PersistentVolumeClaimList = new V1PersistentVolumeClaimList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 187FBC7C2A719AEF571B354D9C077377
    @Test
    void testGetApiVersion() {
        assertThat(v1PersistentVolumeClaimList.getApiVersion(), nullValue());
        String apiVersion = "v1";
        v1PersistentVolumeClaimList.setApiVersion(apiVersion);
        assertThat(v1PersistentVolumeClaimList.getApiVersion(), equalTo(apiVersion));
    }

    //BaseRock generated method id: ${testGetItems}, hash: AD54F1451FE191FF8C31919A53CCBA8A
    @Test
    void testGetItems() {
        assertThat(v1PersistentVolumeClaimList.getItems(), notNullValue());
        assertThat(v1PersistentVolumeClaimList.getItems(), hasSize(0));
        List<V1PersistentVolumeClaim> items = new ArrayList<>();
        items.add(mock(V1PersistentVolumeClaim.class));
        v1PersistentVolumeClaimList.setItems(items);
        assertThat(v1PersistentVolumeClaimList.getItems(), equalTo(items));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 933D350B5D9E022551FD12CFDE71E52B
    @Test
    void testGetKind() {
        assertThat(v1PersistentVolumeClaimList.getKind(), nullValue());
        String kind = "PersistentVolumeClaimList";
        v1PersistentVolumeClaimList.setKind(kind);
        assertThat(v1PersistentVolumeClaimList.getKind(), equalTo(kind));
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 431A46FA6B3C00A1D7C7C633997F8884
    @Test
    void testGetMetadata() {
        assertThat(v1PersistentVolumeClaimList.getMetadata(), nullValue());
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1PersistentVolumeClaimList.setMetadata(metadata);
        assertThat(v1PersistentVolumeClaimList.getMetadata(), equalTo(metadata));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 0562FF33C4920DCA0C34337F31FC63A8
    @Test
    void testAddItemsItem() {
        V1PersistentVolumeClaim item = mock(V1PersistentVolumeClaim.class);
        v1PersistentVolumeClaimList.addItemsItem(item);
        assertThat(v1PersistentVolumeClaimList.getItems(), hasSize(1));
        assertThat(v1PersistentVolumeClaimList.getItems().get(0), equalTo(item));
    }

    //BaseRock generated method id: ${testEquals}, hash: 70641E4675A363098D7914DC7341FC40
    @Test
    void testEquals() {
        V1PersistentVolumeClaimList other = new V1PersistentVolumeClaimList();
        assertThat(v1PersistentVolumeClaimList.equals(other), equalTo(true));
        v1PersistentVolumeClaimList.setApiVersion("v1");
        assertThat(v1PersistentVolumeClaimList.equals(other), equalTo(false));
        other.setApiVersion("v1");
        assertThat(v1PersistentVolumeClaimList.equals(other), equalTo(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: E5127189A2F46873D6B2F01909417D72
    @Test
    void testHashCode() {
        V1PersistentVolumeClaimList other = new V1PersistentVolumeClaimList();
        assertThat(v1PersistentVolumeClaimList.hashCode(), equalTo(other.hashCode()));
        v1PersistentVolumeClaimList.setApiVersion("v1");
        assertThat(v1PersistentVolumeClaimList.hashCode(), not(equalTo(other.hashCode())));
        other.setApiVersion("v1");
        assertThat(v1PersistentVolumeClaimList.hashCode(), equalTo(other.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: FF6DF41645E2FBE1196EA4AA91FA7EE4
    @Test
    void testToString() {
        String expected = "class V1PersistentVolumeClaimList {\n    apiVersion: null\n    items: []\n    kind: null\n    metadata: null\n}";
        assertThat(v1PersistentVolumeClaimList.toString(), equalTo(expected));
        v1PersistentVolumeClaimList.setApiVersion("v1");
        v1PersistentVolumeClaimList.setKind("PersistentVolumeClaimList");
        expected = "class V1PersistentVolumeClaimList {\n    apiVersion: v1\n    items: []\n    kind: PersistentVolumeClaimList\n    metadata: null\n}";
        assertThat(v1PersistentVolumeClaimList.toString(), equalTo(expected));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 65FE46C554199A5DFDF9F25657D92AB9
    @Test
    void testValidateJsonElement() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiVersion", "v1");
        jsonObject.addProperty("kind", "PersistentVolumeClaimList");
        jsonObject.add("items", new JsonArray());
        jsonObject.add("metadata", new JsonObject());
        assertDoesNotThrow(() -> V1PersistentVolumeClaimList.validateJsonElement(jsonObject));
        JsonObject invalidJsonObject = new JsonObject();
        assertThrows(IllegalArgumentException.class, () -> V1PersistentVolumeClaimList.validateJsonElement(invalidJsonObject));
    }
}
