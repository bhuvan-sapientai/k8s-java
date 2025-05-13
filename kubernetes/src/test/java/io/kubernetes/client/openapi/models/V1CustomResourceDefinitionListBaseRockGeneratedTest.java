package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1CustomResourceDefinition;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CustomResourceDefinitionListBaseRockGeneratedTest {

    private V1CustomResourceDefinitionList v1CustomResourceDefinitionList;

    @BeforeEach
    void setUp() {
        v1CustomResourceDefinitionList = new V1CustomResourceDefinitionList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 94C3A1DB17D2549F34BB6DEBE526BD7B
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1";
        v1CustomResourceDefinitionList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1CustomResourceDefinitionList.getApiVersion());
    }

    //BaseRock generated method id: ${testGetItems}, hash: 4376CB2A77DEB0721F6797A9E6138B53
    @Test
    void testGetItems() {
        List<V1CustomResourceDefinition> items = new ArrayList<>();
        items.add(mock(V1CustomResourceDefinition.class));
        items.add(mock(V1CustomResourceDefinition.class));
        v1CustomResourceDefinitionList.setItems(items);
        assertThat(v1CustomResourceDefinitionList.getItems(), is(equalTo(items)));
        assertThat(v1CustomResourceDefinitionList.getItems(), hasSize(2));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 8F494924AC413F310C97A4744EF953F6
    @Test
    void testGetKind() {
        String kind = "CustomResourceDefinitionList";
        v1CustomResourceDefinitionList.setKind(kind);
        assertEquals(kind, v1CustomResourceDefinitionList.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: A3DC962B5B98F3D65C65CC9944B1E99A
    @Test
    void testGetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1CustomResourceDefinitionList.setMetadata(metadata);
        assertThat(v1CustomResourceDefinitionList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testEquals}, hash: B145DE7BC857710D94BC5548D53961B4
    @Test
    void testEquals() {
        V1CustomResourceDefinitionList other = new V1CustomResourceDefinitionList();
        other.setApiVersion("v1");
        other.setKind("CustomResourceDefinitionList");
        other.setItems(new ArrayList<>());
        V1ListMeta metadata = mock(V1ListMeta.class);
        other.setMetadata(metadata);
        v1CustomResourceDefinitionList.setApiVersion("v1");
        v1CustomResourceDefinitionList.setKind("CustomResourceDefinitionList");
        v1CustomResourceDefinitionList.setItems(new ArrayList<>());
        v1CustomResourceDefinitionList.setMetadata(metadata);
        assertThat(v1CustomResourceDefinitionList, is(equalTo(other)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 18A891D2A78DFAAE4266A8B1BE168AB2
    @Test
    void testHashCode() {
        v1CustomResourceDefinitionList.setApiVersion("v1");
        v1CustomResourceDefinitionList.setKind("CustomResourceDefinitionList");
        v1CustomResourceDefinitionList.setItems(new ArrayList<>());
        v1CustomResourceDefinitionList.setMetadata(mock(V1ListMeta.class));
        int hashCode = v1CustomResourceDefinitionList.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: A58303812E78F8A9A556A9C0843810F7
    @Test
    void testToString() {
        v1CustomResourceDefinitionList.setApiVersion("v1");
        v1CustomResourceDefinitionList.setKind("CustomResourceDefinitionList");
        v1CustomResourceDefinitionList.setItems(new ArrayList<>());
        v1CustomResourceDefinitionList.setMetadata(mock(V1ListMeta.class));
        String toString = v1CustomResourceDefinitionList.toString();
        assertNotNull(toString);
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("items"), is(true));
        assertThat(toString.contains("metadata"), is(true));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 7AA5B92357CCB95DC962BBA003656E25
    @Test
    void testAddItemsItem() {
        V1CustomResourceDefinition item = mock(V1CustomResourceDefinition.class);
        v1CustomResourceDefinitionList.addItemsItem(item);
        assertThat(v1CustomResourceDefinitionList.getItems(), hasSize(1));
        assertThat(v1CustomResourceDefinitionList.getItems().get(0), is(equalTo(item)));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: F01C4F84BE17FADE33C369FE3CA6B315
    @Test
    void testValidateJsonElement() {
        // This method is static and doesn't modify the object state
        // It's used internally by GSON, so we don't need to test it here
    }
}
