package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.V1Namespace;
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
class V1NamespaceListBaseRockGeneratedTest {

    private V1NamespaceList v1NamespaceList;

    @BeforeEach
    void setUp() {
        v1NamespaceList = new V1NamespaceList();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 8683C1F7FBAABDE9D7D4F1D3F5308FC3
    @Test
    void testConstructor() {
        assertNotNull(v1NamespaceList);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: A260AD1315103F9161F88C41E5E1B941
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1NamespaceList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1NamespaceList.getApiVersion());
    }

    //BaseRock generated method id: ${testItems}, hash: 82A6BCF3919BF495AF6AC4F8FF7F230D
    @Test
    void testItems() {
        List<V1Namespace> items = new ArrayList<>();
        items.add(mock(V1Namespace.class));
        items.add(mock(V1Namespace.class));
        v1NamespaceList.setItems(items);
        assertThat(v1NamespaceList.getItems(), is(items));
        assertThat(v1NamespaceList.getItems(), hasSize(2));
    }

    //BaseRock generated method id: ${testKind}, hash: 72BB004BB21633F53C39D1ABA05AABA2
    @Test
    void testKind() {
        String kind = "NamespaceList";
        v1NamespaceList.setKind(kind);
        assertEquals(kind, v1NamespaceList.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 5D3D0A7B0C1DAA2C5B18B34FBDE1D9A6
    @Test
    void testMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1NamespaceList.setMetadata(metadata);
        assertThat(v1NamespaceList.getMetadata(), is(metadata));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: D3F148676764EB22B68A9DB39C9367DA
    @Test
    void testAddItemsItem() {
        V1Namespace namespace = mock(V1Namespace.class);
        v1NamespaceList.addItemsItem(namespace);
        assertThat(v1NamespaceList.getItems(), hasSize(1));
        assertThat(v1NamespaceList.getItems().get(0), is(namespace));
    }

    //BaseRock generated method id: ${testEquals}, hash: 3DDED7D77AD80F146483A667E135D83F
    @Test
    void testEquals() {
        V1NamespaceList other = new V1NamespaceList();
        other.setApiVersion("v1");
        other.setKind("NamespaceList");
        V1ListMeta metadata = mock(V1ListMeta.class);
        other.setMetadata(metadata);
        List<V1Namespace> items = new ArrayList<>();
        items.add(mock(V1Namespace.class));
        other.setItems(items);
        v1NamespaceList.setApiVersion("v1");
        v1NamespaceList.setKind("NamespaceList");
        v1NamespaceList.setMetadata(metadata);
        v1NamespaceList.setItems(items);
        assertThat(v1NamespaceList, is(equalTo(other)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 4D4BC32D8F204593144B7DEF3CB22005
    @Test
    void testHashCode() {
        v1NamespaceList.setApiVersion("v1");
        v1NamespaceList.setKind("NamespaceList");
        v1NamespaceList.setMetadata(mock(V1ListMeta.class));
        List<V1Namespace> items = new ArrayList<>();
        items.add(mock(V1Namespace.class));
        v1NamespaceList.setItems(items);
        int hashCode = v1NamespaceList.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: CEE8C6EDA21B989DD3B72631C5698A5F
    @Test
    void testToString() {
        v1NamespaceList.setApiVersion("v1");
        v1NamespaceList.setKind("NamespaceList");
        v1NamespaceList.setMetadata(mock(V1ListMeta.class));
        List<V1Namespace> items = new ArrayList<>();
        items.add(mock(V1Namespace.class));
        v1NamespaceList.setItems(items);
        String toString = v1NamespaceList.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("items"), is(true));
    }
}
