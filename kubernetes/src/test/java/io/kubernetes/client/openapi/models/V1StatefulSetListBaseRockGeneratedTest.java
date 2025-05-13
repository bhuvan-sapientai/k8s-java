package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import io.kubernetes.client.openapi.models.V1StatefulSet;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
class V1StatefulSetListBaseRockGeneratedTest {

    private V1StatefulSetList v1StatefulSetList;

    @BeforeEach
    void setUp() {
        v1StatefulSetList = new V1StatefulSetList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 00C5A238CDDF116C0A1F602A90C721E6
    @Test
    void testGetApiVersion() {
        String apiVersion = "apps/v1";
        v1StatefulSetList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1StatefulSetList.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: 5DB10050A2EC4293584340C76A9E7B41
    @Test
    void testSetApiVersion() {
        String apiVersion = "apps/v1";
        v1StatefulSetList.setApiVersion(apiVersion);
        assertThat(v1StatefulSetList.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testGetItems}, hash: 287A25BCFA02D4E48D23F514D4A690EE
    @Test
    void testGetItems() {
        List<V1StatefulSet> items = new ArrayList<>();
        items.add(mock(V1StatefulSet.class));
        v1StatefulSetList.setItems(items);
        assertThat(v1StatefulSetList.getItems(), is(equalTo(items)));
    }

    //BaseRock generated method id: ${testSetItems}, hash: 5D62E9F868577E85027B66F0855EEDC9
    @Test
    void testSetItems() {
        List<V1StatefulSet> items = new ArrayList<>();
        items.add(mock(V1StatefulSet.class));
        v1StatefulSetList.setItems(items);
        assertThat(v1StatefulSetList.getItems(), hasSize(1));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: CC18289699D8394F399A16AD59295DFF
    @Test
    void testAddItemsItem() {
        V1StatefulSet item = mock(V1StatefulSet.class);
        v1StatefulSetList.addItemsItem(item);
        assertThat(v1StatefulSetList.getItems(), hasSize(1));
        assertThat(v1StatefulSetList.getItems().get(0), is(equalTo(item)));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 0285F8D47A0424E926DF11B2807ABFC2
    @Test
    void testGetKind() {
        String kind = "StatefulSetList";
        v1StatefulSetList.setKind(kind);
        assertEquals(kind, v1StatefulSetList.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: 90C8DC18D1B385DA5449E75E238A3BA8
    @Test
    void testSetKind() {
        String kind = "StatefulSetList";
        v1StatefulSetList.setKind(kind);
        assertThat(v1StatefulSetList.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 2A7431EB4768A912C744BCE38F29620D
    @Test
    void testGetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1StatefulSetList.setMetadata(metadata);
        assertEquals(metadata, v1StatefulSetList.getMetadata());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: 6BC0C75AD54BDD54FBAF1D7007F7296E
    @Test
    void testSetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1StatefulSetList.setMetadata(metadata);
        assertThat(v1StatefulSetList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 87404D47C02A45347F45008142E62147
    @Test
    void testEquals() {
        V1StatefulSetList list1 = new V1StatefulSetList();
        V1StatefulSetList list2 = new V1StatefulSetList();
        list1.setApiVersion("apps/v1");
        list2.setApiVersion("apps/v1");
        list1.setKind("StatefulSetList");
        list2.setKind("StatefulSetList");
        V1ListMeta metadata = mock(V1ListMeta.class);
        list1.setMetadata(metadata);
        list2.setMetadata(metadata);
        List<V1StatefulSet> items = new ArrayList<>();
        items.add(mock(V1StatefulSet.class));
        list1.setItems(items);
        list2.setItems(items);
        assertThat(list1, is(equalTo(list2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 80F6DC088844CAFFAC5779D1482A810F
    @Test
    void testHashCode() {
        V1StatefulSetList list1 = new V1StatefulSetList();
        V1StatefulSetList list2 = new V1StatefulSetList();
        list1.setApiVersion("apps/v1");
        list2.setApiVersion("apps/v1");
        list1.setKind("StatefulSetList");
        list2.setKind("StatefulSetList");
        V1ListMeta metadata = mock(V1ListMeta.class);
        list1.setMetadata(metadata);
        list2.setMetadata(metadata);
        List<V1StatefulSet> items = new ArrayList<>();
        items.add(mock(V1StatefulSet.class));
        list1.setItems(items);
        list2.setItems(items);
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 45E957ABFDE1AD15208D0709B90198FB
    @Test
    void testToString() {
        v1StatefulSetList.setApiVersion("apps/v1");
        v1StatefulSetList.setKind("StatefulSetList");
        v1StatefulSetList.setMetadata(mock(V1ListMeta.class));
        List<V1StatefulSet> items = new ArrayList<>();
        items.add(mock(V1StatefulSet.class));
        v1StatefulSetList.setItems(items);
        String toString = v1StatefulSetList.toString();
        assertNotNull(toString);
        assertThat(toString, notNullValue());
    }

    //BaseRock generated method id: ${testV1StatefulSetListConstructor}, hash: 796A7A3CB70C55BB743144BDE5C2F7E9
    @Test
    void testV1StatefulSetListConstructor() {
        V1StatefulSetList list = new V1StatefulSetList();
        assertNotNull(list);
        assertThat(list.getItems(), notNullValue());
        assertThat(list.getItems(), hasSize(0));
    }
}
