package io.kubernetes.client.openapi.models;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1ComponentStatus;
import static org.mockito.Mockito.when;
import io.kubernetes.client.common.KubernetesListObject;
import java.util.ArrayList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ComponentStatusListBaseRockGeneratedTest {

    private V1ComponentStatusList v1ComponentStatusList;

    @BeforeEach
    void setUp() {
        v1ComponentStatusList = new V1ComponentStatusList();
    }

    //BaseRock generated method id: ${testV1ComponentStatusListImplementsKubernetesListObject}, hash: D38501F356D116FC683CA8040B56B9D8
    @Test
    void testV1ComponentStatusListImplementsKubernetesListObject() {
        assertThat(v1ComponentStatusList, is(notNullValue()));
        assertThat(v1ComponentStatusList instanceof KubernetesListObject, is(true));
    }

    //BaseRock generated method id: ${testSetAndGetApiVersion}, hash: 3694C62390A9FCB6F1F86C55484EA5D5
    @Test
    void testSetAndGetApiVersion() {
        String apiVersion = "v1";
        v1ComponentStatusList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1ComponentStatusList.getApiVersion());
    }

    //BaseRock generated method id: ${testSetAndGetItems}, hash: DBA4D728072E3543274D1F9529073AAB
    @Test
    void testSetAndGetItems() {
        List<V1ComponentStatus> items = new ArrayList<>();
        V1ComponentStatus item1 = mock(V1ComponentStatus.class);
        V1ComponentStatus item2 = mock(V1ComponentStatus.class);
        items.add(item1);
        items.add(item2);
        v1ComponentStatusList.setItems(items);
        assertEquals(items, v1ComponentStatusList.getItems());
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: A9E42CCC071D6C50D88F2896499E2CF4
    @Test
    void testAddItemsItem() {
        V1ComponentStatus item = mock(V1ComponentStatus.class);
        v1ComponentStatusList.addItemsItem(item);
        assertThat(v1ComponentStatusList.getItems(), containsInAnyOrder(item));
    }

    //BaseRock generated method id: ${testSetAndGetKind}, hash: 4BD6DE596EE322DFCD728AC2B2711745
    @Test
    void testSetAndGetKind() {
        String kind = "ComponentStatusList";
        v1ComponentStatusList.setKind(kind);
        assertEquals(kind, v1ComponentStatusList.getKind());
    }

    //BaseRock generated method id: ${testSetAndGetMetadata}, hash: 40261FF90961AE3E23FEAA16FF1D5420
    @Test
    void testSetAndGetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1ComponentStatusList.setMetadata(metadata);
        assertEquals(metadata, v1ComponentStatusList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: 4F7BC7EA8274950380A33825501579AD
    @Test
    void testEquals() {
        V1ComponentStatusList list1 = new V1ComponentStatusList().apiVersion("v1").kind("ComponentStatusList").metadata(new V1ListMeta().resourceVersion("1"));
        V1ComponentStatusList list2 = new V1ComponentStatusList().apiVersion("v1").kind("ComponentStatusList").metadata(new V1ListMeta().resourceVersion("1"));
        assertThat(list1.equals(list2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 8C4746FBF1DB753CEA6F4575A0A07277
    @Test
    void testHashCode() {
        V1ComponentStatusList list1 = new V1ComponentStatusList().apiVersion("v1").kind("ComponentStatusList").metadata(new V1ListMeta().resourceVersion("1"));
        V1ComponentStatusList list2 = new V1ComponentStatusList().apiVersion("v1").kind("ComponentStatusList").metadata(new V1ListMeta().resourceVersion("1"));
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: C39EDF6B656F85F390CFE02D57C001F8
    @Test
    void testToString() {
        v1ComponentStatusList.setApiVersion("v1");
        v1ComponentStatusList.setKind("ComponentStatusList");
        v1ComponentStatusList.setMetadata(mock(V1ListMeta.class));
        String toString = v1ComponentStatusList.toString();
        assertNotNull(toString);
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
    }

    //BaseRock generated method id: ${testGetItems}, hash: C002F83A9DFF811E08309910D86D924C
    @Test
    void testGetItems() {
        List<V1ComponentStatus> items = new ArrayList<>();
        V1ComponentStatus item1 = mock(V1ComponentStatus.class);
        V1ComponentStatus item2 = mock(V1ComponentStatus.class);
        items.add(item1);
        items.add(item2);
        v1ComponentStatusList.setItems(items);
        List<? extends KubernetesObject> resultItems = v1ComponentStatusList.getItems();
        assertThat(resultItems, equalTo(items));
    }
}
