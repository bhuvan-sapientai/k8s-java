package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import io.kubernetes.client.openapi.models.V1IngressClass;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1IngressClassListBaseRockGeneratedTest {

    private V1IngressClassList v1IngressClassList;

    @BeforeEach
    void setUp() {
        v1IngressClassList = new V1IngressClassList();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 0402352E5D5A216A0771A23DABC3F2D3
    @Test
    void testConstructor() {
        assertNotNull(v1IngressClassList);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 2C15528D0A6DF0833BEDA3822C5D3153
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1IngressClassList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1IngressClassList.getApiVersion());
    }

    //BaseRock generated method id: ${testItems}, hash: A5354EC141FB7E8C88B7E8A940D728CE
    @Test
    void testItems() {
        List<V1IngressClass> items = new ArrayList<>();
        items.add(mock(V1IngressClass.class));
        items.add(mock(V1IngressClass.class));
        v1IngressClassList.setItems(items);
        assertEquals(items, v1IngressClassList.getItems());
        assertThat(v1IngressClassList.getItems(), hasSize(2));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 22090B8B1B6B14094F7BF59CD6C2F0D1
    @Test
    void testAddItemsItem() {
        V1IngressClass item = mock(V1IngressClass.class);
        v1IngressClassList.addItemsItem(item);
        assertThat(v1IngressClassList.getItems(), hasSize(1));
        assertEquals(item, v1IngressClassList.getItems().get(0));
    }

    //BaseRock generated method id: ${testKind}, hash: 1A8FEF3F5C55625655207C7B2AA9AC3A
    @Test
    void testKind() {
        String kind = "IngressClassList";
        v1IngressClassList.setKind(kind);
        assertEquals(kind, v1IngressClassList.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 151BCCA33C230FC216AD25B173CF223B
    @Test
    void testMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1IngressClassList.setMetadata(metadata);
        assertEquals(metadata, v1IngressClassList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: 48AAD379FBBC510D519505274E6293B3
    @Test
    void testEquals() {
        V1IngressClassList other = new V1IngressClassList();
        assertThat(v1IngressClassList.equals(other), is(true));
        other.setApiVersion("v1");
        assertThat(v1IngressClassList.equals(other), is(false));
        v1IngressClassList.setApiVersion("v1");
        assertThat(v1IngressClassList.equals(other), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 646009D2504DD1744BCD209FB252D9F6
    @Test
    void testHashCode() {
        V1IngressClassList other = new V1IngressClassList();
        assertThat(v1IngressClassList.hashCode(), equalTo(other.hashCode()));
        other.setApiVersion("v1");
        assertThat(v1IngressClassList.hashCode(), is(not(equalTo(other.hashCode()))));
        v1IngressClassList.setApiVersion("v1");
        assertThat(v1IngressClassList.hashCode(), equalTo(other.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: A440F06D18F95DE87EA5B00D4AEF0707
    @Test
    void testToString() {
        String expectedString = "class V1IngressClassList {\n    apiVersion: null\n    items: []\n    kind: null\n    metadata: null\n}";
        assertEquals(expectedString, v1IngressClassList.toString());
        v1IngressClassList.setApiVersion("v1");
        v1IngressClassList.setKind("IngressClassList");
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1IngressClassList.setMetadata(metadata);
        List<V1IngressClass> items = Arrays.asList(mock(V1IngressClass.class), mock(V1IngressClass.class));
        v1IngressClassList.setItems(items);
        String expectedUpdatedString = "class V1IngressClassList {\n    apiVersion: v1\n    items: [" + items.get(0) + ", " + items.get(1) + "]\n    kind: IngressClassList\n    metadata: " + metadata + "\n}";
        assertEquals(expectedUpdatedString, v1IngressClassList.toString());
    }
}
