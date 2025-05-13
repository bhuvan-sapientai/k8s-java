package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1Node;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1NodeListBaseRockGeneratedTest {

    private V1NodeList v1NodeList;

    @BeforeEach
    void setUp() {
        v1NodeList = new V1NodeList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 154B30726525EBD96A3B31164066BD31
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1";
        v1NodeList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1NodeList.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: 6CE6487781776600E8B6597646BF95D8
    @Test
    void testSetApiVersion() {
        String apiVersion = "v1";
        v1NodeList.setApiVersion(apiVersion);
        assertThat(v1NodeList.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testGetItems}, hash: BCC8733F1EF30CC7D260176A11691068
    @Test
    void testGetItems() {
        List<V1Node> items = new ArrayList<>();
        items.add(mock(V1Node.class));
        v1NodeList.setItems(items);
        assertThat(v1NodeList.getItems(), is(equalTo(items)));
    }

    //BaseRock generated method id: ${testSetItems}, hash: ACD16B750F76AB577C06B54EDC228BC4
    @Test
    void testSetItems() {
        List<V1Node> items = new ArrayList<>();
        items.add(mock(V1Node.class));
        v1NodeList.setItems(items);
        assertThat(v1NodeList.getItems(), hasSize(1));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: D84235701740622F53BE2A029F3FA4DE
    @Test
    void testAddItemsItem() {
        V1Node node = mock(V1Node.class);
        v1NodeList.addItemsItem(node);
        assertThat(v1NodeList.getItems(), hasSize(1));
        assertThat(v1NodeList.getItems().get(0), is(equalTo(node)));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 2878DCE6B068976FA0EA1FB4DBD16F93
    @Test
    void testGetKind() {
        String kind = "NodeList";
        v1NodeList.setKind(kind);
        assertEquals(kind, v1NodeList.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: 3B06545D4805C9E8DF9DD115C3E063F8
    @Test
    void testSetKind() {
        String kind = "NodeList";
        v1NodeList.setKind(kind);
        assertThat(v1NodeList.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 1CDCD1C66776C02FB30E19F1FCCF4125
    @Test
    void testGetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1NodeList.setMetadata(metadata);
        assertEquals(metadata, v1NodeList.getMetadata());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: 065D557D707DF689FBA3CEAE94707232
    @Test
    void testSetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1NodeList.setMetadata(metadata);
        assertThat(v1NodeList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testEquals}, hash: EDDD595C0D7F707A1EFA0D3024B2D783
    @Test
    void testEquals() {
        V1NodeList otherV1NodeList = new V1NodeList();
        String apiVersion = "v1";
        v1NodeList.setApiVersion(apiVersion);
        otherV1NodeList.setApiVersion(apiVersion);
        List<V1Node> items = new ArrayList<>();
        items.add(mock(V1Node.class));
        v1NodeList.setItems(items);
        otherV1NodeList.setItems(items);
        String kind = "NodeList";
        v1NodeList.setKind(kind);
        otherV1NodeList.setKind(kind);
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1NodeList.setMetadata(metadata);
        otherV1NodeList.setMetadata(metadata);
        assertThat(v1NodeList.equals(otherV1NodeList), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: F048743AA5A1207ABC6E4A66C0D5BF0B
    @Test
    void testHashCode() {
        String apiVersion = "v1";
        v1NodeList.setApiVersion(apiVersion);
        List<V1Node> items = new ArrayList<>();
        items.add(mock(V1Node.class));
        v1NodeList.setItems(items);
        String kind = "NodeList";
        v1NodeList.setKind(kind);
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1NodeList.setMetadata(metadata);
        int hashCode = v1NodeList.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 75EAC212A2AF2CD50F22A19332410FE6
    @Test
    void testToString() {
        String apiVersion = "v1";
        v1NodeList.setApiVersion(apiVersion);
        List<V1Node> items = new ArrayList<>();
        V1Node mockNode = mock(V1Node.class);
        when(mockNode.toString()).thenReturn("MockNode");
        items.add(mockNode);
        v1NodeList.setItems(items);
        String kind = "NodeList";
        v1NodeList.setKind(kind);
        V1ListMeta metadata = mock(V1ListMeta.class);
        when(metadata.toString()).thenReturn("MockMetadata");
        v1NodeList.setMetadata(metadata);
        String result = v1NodeList.toString();
        assertNotNull(result);
        assertThat(result.contains("apiVersion"), is(true));
        assertThat(result.contains("items"), is(true));
        assertThat(result.contains("kind"), is(true));
        assertThat(result.contains("metadata"), is(true));
    }
}
