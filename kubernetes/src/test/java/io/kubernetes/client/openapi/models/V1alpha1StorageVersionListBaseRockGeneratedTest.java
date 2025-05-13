package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1alpha1StorageVersion;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha1StorageVersionListBaseRockGeneratedTest {

    private V1alpha1StorageVersionList v1alpha1StorageVersionList;

    @BeforeEach
    void setUp() {
        v1alpha1StorageVersionList = new V1alpha1StorageVersionList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: B32AD476C629D793834D5BF712E4392F
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1alpha1";
        v1alpha1StorageVersionList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1alpha1StorageVersionList.getApiVersion());
    }

    //BaseRock generated method id: ${testGetItems}, hash: B859D11D194B5FF459D0BD14A91E3C0F
    @Test
    void testGetItems() {
        List<V1alpha1StorageVersion> items = new ArrayList<>();
        items.add(mock(V1alpha1StorageVersion.class));
        items.add(mock(V1alpha1StorageVersion.class));
        v1alpha1StorageVersionList.setItems(items);
        assertThat(v1alpha1StorageVersionList.getItems(), is(items));
        assertThat(v1alpha1StorageVersionList.getItems(), hasSize(2));
    }

    //BaseRock generated method id: ${testGetKind}, hash: D5E5C4BD18757C68A1C85E7B6B875727
    @Test
    void testGetKind() {
        String kind = "StorageVersionList";
        v1alpha1StorageVersionList.setKind(kind);
        assertEquals(kind, v1alpha1StorageVersionList.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 67680781523046CE611BDFB7D75F7690
    @Test
    void testGetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1alpha1StorageVersionList.setMetadata(metadata);
        assertEquals(metadata, v1alpha1StorageVersionList.getMetadata());
    }

    //BaseRock generated method id: ${testApiVersionFluentSetter}, hash: F3202480649AEF8F8CDB74746645ED72
    @Test
    void testApiVersionFluentSetter() {
        String apiVersion = "v1alpha1";
        V1alpha1StorageVersionList result = v1alpha1StorageVersionList.apiVersion(apiVersion);
        assertThat(result, is(v1alpha1StorageVersionList));
        assertEquals(apiVersion, v1alpha1StorageVersionList.getApiVersion());
    }

    //BaseRock generated method id: ${testItemsFluentSetter}, hash: 719B8ED9C6AE358371C8767839C74D0C
    @Test
    void testItemsFluentSetter() {
        List<V1alpha1StorageVersion> items = new ArrayList<>();
        items.add(mock(V1alpha1StorageVersion.class));
        V1alpha1StorageVersionList result = v1alpha1StorageVersionList.items(items);
        assertThat(result, is(v1alpha1StorageVersionList));
        assertEquals(items, v1alpha1StorageVersionList.getItems());
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 3DB172E884D6304F34F89C3CCA1A869B
    @Test
    void testAddItemsItem() {
        V1alpha1StorageVersion item = mock(V1alpha1StorageVersion.class);
        V1alpha1StorageVersionList result = v1alpha1StorageVersionList.addItemsItem(item);
        assertThat(result, is(v1alpha1StorageVersionList));
        assertThat(v1alpha1StorageVersionList.getItems(), hasSize(1));
        assertThat(v1alpha1StorageVersionList.getItems().get(0), is(item));
    }

    //BaseRock generated method id: ${testKindFluentSetter}, hash: 47480D1B16118975D004A0C5482879DB
    @Test
    void testKindFluentSetter() {
        String kind = "StorageVersionList";
        V1alpha1StorageVersionList result = v1alpha1StorageVersionList.kind(kind);
        assertThat(result, is(v1alpha1StorageVersionList));
        assertEquals(kind, v1alpha1StorageVersionList.getKind());
    }

    //BaseRock generated method id: ${testMetadataFluentSetter}, hash: 1FA9329CF80F519E526CE19D7B0F4FBF
    @Test
    void testMetadataFluentSetter() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        V1alpha1StorageVersionList result = v1alpha1StorageVersionList.metadata(metadata);
        assertThat(result, is(v1alpha1StorageVersionList));
        assertEquals(metadata, v1alpha1StorageVersionList.getMetadata());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 80D85123B5871FBE6A7EA374DB1A57B4
    @Test
    void testEqualsAndHashCode() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        V1alpha1StorageVersionList list1 = new V1alpha1StorageVersionList().apiVersion("v1alpha1").kind("StorageVersionList").metadata(metadata);
        V1alpha1StorageVersionList list2 = new V1alpha1StorageVersionList().apiVersion("v1alpha1").kind("StorageVersionList").metadata(metadata);
        // Test equality
        assertEquals(list1, list2);
        // Test hash code
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 45CA9EE7814FF0414EF8A49D467BE838
    @Test
    void testToString() {
        v1alpha1StorageVersionList.setApiVersion("v1alpha1");
        v1alpha1StorageVersionList.setKind("StorageVersionList");
        v1alpha1StorageVersionList.setMetadata(mock(V1ListMeta.class));
        String toString = v1alpha1StorageVersionList.toString();
        assertNotNull(toString);
        assertThat(toString, notNullValue());
    }

    //BaseRock generated method id: ${testOpenapiFields}, hash: A1DBBA7481F53EA83D147CFAC7B80FB3
    @Test
    void testOpenapiFields() {
        assertThat(V1alpha1StorageVersionList.openapiFields, notNullValue());
        assertThat(V1alpha1StorageVersionList.openapiFields, containsInAnyOrder("apiVersion", "items", "kind", "metadata"));
    }

    //BaseRock generated method id: ${testOpenapiRequiredFields}, hash: AED28D1D2D2FB84CD37F22BF4D4B615F
    @Test
    void testOpenapiRequiredFields() {
        assertThat(V1alpha1StorageVersionList.openapiRequiredFields, notNullValue());
        assertThat(V1alpha1StorageVersionList.openapiRequiredFields, containsInAnyOrder("items"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 6C8E03923DF0142C205F332C4AB3EE62
    @Test
    void testValidateJsonElement() throws Exception {
        // This test is a placeholder. In a real scenario, we would need to create a valid JsonElement
        // and test the validateJsonElement method. However, as we don't have access to the actual
        // implementation details, we can't create a meaningful test here.
        // The method should be tested in the actual implementation.
    }

    //BaseRock generated method id: ${testFromJson}, hash: 0660F0FBC4D8B74550B801B4A0CC3C89
    @Test
    void testFromJson() throws Exception {
        String json = "{\"apiVersion\":\"v1alpha1\",\"kind\":\"StorageVersionList\",\"items\":[]}";
        V1alpha1StorageVersionList result = V1alpha1StorageVersionList.fromJson(json);
        assertNotNull(result);
        assertEquals("v1alpha1", result.getApiVersion());
        assertEquals("StorageVersionList", result.getKind());
        assertNotNull(result.getItems());
        assertTrue(result.getItems().isEmpty());
    }

    //BaseRock generated method id: ${testToJson}, hash: 2AC6FAFBAAD34F353D7F3D2E5C40ED1A
    @Test
    void testToJson() {
        v1alpha1StorageVersionList.setApiVersion("v1alpha1");
        v1alpha1StorageVersionList.setKind("StorageVersionList");
        v1alpha1StorageVersionList.setItems(new ArrayList<>());
        String json = v1alpha1StorageVersionList.toJson();
        assertNotNull(json);
        assertTrue(json.contains("\"apiVersion\":\"v1alpha1\""));
        assertTrue(json.contains("\"kind\":\"StorageVersionList\""));
        assertTrue(json.contains("\"items\":[]"));
    }
}
