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
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1DaemonSet;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1DaemonSetListBaseRockGeneratedTest {

    private V1DaemonSetList v1DaemonSetList;

    @BeforeEach
    void setUp() {
        v1DaemonSetList = new V1DaemonSetList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 3402A7A62CAD74CF14FD751A0264000D
    @Test
    void testGetApiVersion() {
        String apiVersion = "apps/v1";
        v1DaemonSetList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1DaemonSetList.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: CD5B20A03333ADCCC9519EFC7CFB6C87
    @Test
    void testSetApiVersion() {
        String apiVersion = "apps/v1";
        v1DaemonSetList.setApiVersion(apiVersion);
        assertThat(v1DaemonSetList.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testGetItems}, hash: ABEC1144A667C4C6EDB5515975989F73
    @Test
    void testGetItems() {
        List<V1DaemonSet> items = new ArrayList<>();
        items.add(mock(V1DaemonSet.class));
        v1DaemonSetList.setItems(items);
        assertThat(v1DaemonSetList.getItems(), is(equalTo(items)));
    }

    //BaseRock generated method id: ${testSetItems}, hash: 31B3CBF50F19C74ECAA44B47B1F8BD2D
    @Test
    void testSetItems() {
        List<V1DaemonSet> items = new ArrayList<>();
        items.add(mock(V1DaemonSet.class));
        v1DaemonSetList.setItems(items);
        assertThat(v1DaemonSetList.getItems(), hasSize(1));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 2C8CA8308D5C82A15E4828608365FCDE
    @Test
    void testAddItemsItem() {
        V1DaemonSet item = mock(V1DaemonSet.class);
        v1DaemonSetList.addItemsItem(item);
        assertThat(v1DaemonSetList.getItems(), hasSize(1));
        assertThat(v1DaemonSetList.getItems().get(0), is(equalTo(item)));
    }

    //BaseRock generated method id: ${testGetKind}, hash: E4B0D031F9FDE5761CD8DE40597F40C3
    @Test
    void testGetKind() {
        String kind = "DaemonSetList";
        v1DaemonSetList.setKind(kind);
        assertEquals(kind, v1DaemonSetList.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: 735DBED4E016E1B9569EDFCB39B8389E
    @Test
    void testSetKind() {
        String kind = "DaemonSetList";
        v1DaemonSetList.setKind(kind);
        assertThat(v1DaemonSetList.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: A504400CF1D7434ED6C7AD865522C301
    @Test
    void testGetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1DaemonSetList.setMetadata(metadata);
        assertEquals(metadata, v1DaemonSetList.getMetadata());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: 6810585603DD112C635DDC6AB98738C0
    @Test
    void testSetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1DaemonSetList.setMetadata(metadata);
        assertThat(v1DaemonSetList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 23CD0DBF21DDDE0DBE26E9709C62B758
    @Test
    void testEquals() {
        V1DaemonSetList list1 = new V1DaemonSetList();
        list1.setApiVersion("apps/v1");
        list1.setKind("DaemonSetList");
        List<V1DaemonSet> items1 = new ArrayList<>();
        items1.add(new V1DaemonSet());
        list1.setItems(items1);
        list1.setMetadata(new V1ListMeta());
        V1DaemonSetList list2 = new V1DaemonSetList();
        list2.setApiVersion("apps/v1");
        list2.setKind("DaemonSetList");
        List<V1DaemonSet> items2 = new ArrayList<>();
        items2.add(new V1DaemonSet());
        list2.setItems(items2);
        list2.setMetadata(new V1ListMeta());
        assertThat(list1.equals(list2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 3E31455A369814433344BC6052EB7842
    @Test
    void testHashCode() {
        V1DaemonSetList list = new V1DaemonSetList();
        list.setApiVersion("apps/v1");
        list.setKind("DaemonSetList");
        list.setItems(new ArrayList<>());
        list.setMetadata(mock(V1ListMeta.class));
        assertThat(list.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: C95BE5466BF7187B0162E2F05893D6BA
    @Test
    void testToString() {
        V1DaemonSetList list = new V1DaemonSetList();
        list.setApiVersion("apps/v1");
        list.setKind("DaemonSetList");
        list.setItems(new ArrayList<>());
        list.setMetadata(mock(V1ListMeta.class));
        String toString = list.toString();
        assertNotNull(toString);
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("items"), is(true));
        assertThat(toString.contains("metadata"), is(true));
    }

    //BaseRock generated method id: ${testV1DaemonSetListConstructor}, hash: 959D434D0D61C1062CB2935B1EE5A9DE
    @Test
    void testV1DaemonSetListConstructor() {
        V1DaemonSetList list = new V1DaemonSetList();
        assertNotNull(list);
    }

    //BaseRock generated method id: ${testV1DaemonSetListApiVersion}, hash: 5D0E43C86A038F9B030FEF8BA50B9712
    @Test
    void testV1DaemonSetListApiVersion() {
        String apiVersion = "apps/v1";
        V1DaemonSetList list = new V1DaemonSetList().apiVersion(apiVersion);
        assertEquals(apiVersion, list.getApiVersion());
    }

    //BaseRock generated method id: ${testV1DaemonSetListItems}, hash: 800026E3DCF6D8F3487106045027DB91
    @Test
    void testV1DaemonSetListItems() {
        List<V1DaemonSet> items = new ArrayList<>();
        items.add(mock(V1DaemonSet.class));
        V1DaemonSetList list = new V1DaemonSetList().items(items);
        assertEquals(items, list.getItems());
    }

    //BaseRock generated method id: ${testV1DaemonSetListKind}, hash: BEA3CC21E5009A571C4E2CF411CB8ECA
    @Test
    void testV1DaemonSetListKind() {
        String kind = "DaemonSetList";
        V1DaemonSetList list = new V1DaemonSetList().kind(kind);
        assertEquals(kind, list.getKind());
    }

    //BaseRock generated method id: ${testV1DaemonSetListMetadata}, hash: B69BB2D512FC83B2BA75D46319DE4A1D
    @Test
    void testV1DaemonSetListMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        V1DaemonSetList list = new V1DaemonSetList().metadata(metadata);
        assertEquals(metadata, list.getMetadata());
    }
}
