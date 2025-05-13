package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ClusterRoleBindingList;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1ClusterRoleBinding;
import java.util.ArrayList;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class V1ClusterRoleBindingListBaseRockGeneratedTest {

    private V1ClusterRoleBindingList clusterRoleBindingList;

    @BeforeEach
    void setUp() {
        clusterRoleBindingList = new V1ClusterRoleBindingList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: A8D768A2A8267984FF0C4779033F7F6C
    @Test
    void testGetApiVersion() {
        assertNull(clusterRoleBindingList.getApiVersion());
        String apiVersion = "v1";
        clusterRoleBindingList.setApiVersion(apiVersion);
        assertEquals(apiVersion, clusterRoleBindingList.getApiVersion());
    }

    //BaseRock generated method id: ${testGetItems}, hash: B3547746430F76F15D56417606E1F03C
    @Test
    void testGetItems() {
        List<V1ClusterRoleBinding> items = clusterRoleBindingList.getItems();
        assertNotNull(items);
        assertTrue(items.isEmpty());
    }

    //BaseRock generated method id: ${testSetItems}, hash: 0CC0A19A6286C924BF24EFC90D87549A
    @Test
    void testSetItems() {
        List<V1ClusterRoleBinding> newItems = new ArrayList<>();
        newItems.add(new V1ClusterRoleBinding());
        newItems.add(new V1ClusterRoleBinding());
        clusterRoleBindingList.setItems(newItems);
        assertEquals(newItems, clusterRoleBindingList.getItems());
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 34D0DB7DBE92342CE2A44ABBE717D06F
    @Test
    void testAddItemsItem() {
        V1ClusterRoleBinding item = new V1ClusterRoleBinding();
        clusterRoleBindingList.addItemsItem(item);
        List<V1ClusterRoleBinding> items = clusterRoleBindingList.getItems();
        assertEquals(1, items.size());
        assertSame(item, items.get(0));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 270B0A093BF99A4FCA0F266BC5376D87
    @Test
    void testGetKind() {
        assertNull(clusterRoleBindingList.getKind());
        String kind = "ClusterRoleBindingList";
        clusterRoleBindingList.setKind(kind);
        assertEquals(kind, clusterRoleBindingList.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 86166E7BB54A9993142701577090B560
    @Test
    void testGetMetadata() {
        assertNull(clusterRoleBindingList.getMetadata());
        V1ListMeta metadata = new V1ListMeta();
        clusterRoleBindingList.setMetadata(metadata);
        assertSame(metadata, clusterRoleBindingList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: 4FBA9DFE4860BE86203EDEC178B7D23E
    @Test
    void testEquals() {
        V1ClusterRoleBindingList list1 = new V1ClusterRoleBindingList();
        V1ClusterRoleBindingList list2 = new V1ClusterRoleBindingList();
        assertTrue(list1.equals(list2));
        assertEquals(list1.hashCode(), list2.hashCode());
        list1.setApiVersion("v1");
        assertFalse(list1.equals(list2));
        list2.setApiVersion("v1");
        assertTrue(list1.equals(list2));
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 5D39A7419D1A91C81F5844B5EBD7951A
    @Test
    void testToString() {
        String toString = clusterRoleBindingList.toString();
        assertThat(toString, containsString("class V1ClusterRoleBindingList"));
        assertThat(toString, containsString("apiVersion"));
        assertThat(toString, containsString("items"));
        assertThat(toString, containsString("kind"));
        assertThat(toString, containsString("metadata"));
    }

    //BaseRock generated method id: ${testApiVersionSetterAndGetter}, hash: 57A355DCF42E00F56117FD61D88BDCFC
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "v1", "v2" })
    void testApiVersionSetterAndGetter(String apiVersion) {
        clusterRoleBindingList.setApiVersion(apiVersion);
        assertEquals(apiVersion, clusterRoleBindingList.getApiVersion());
    }

    //BaseRock generated method id: ${testKindSetterAndGetter}, hash: EEE776DEBF31261ABA5B9838F029F76A
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "ClusterRoleBindingList", "CustomKind" })
    void testKindSetterAndGetter(String kind) {
        clusterRoleBindingList.setKind(kind);
        assertEquals(kind, clusterRoleBindingList.getKind());
    }

    //BaseRock generated method id: ${testMetadataSetterAndGetter}, hash: 08B445A7DF053665B37907A078D591BB
    @Test
    void testMetadataSetterAndGetter() {
        V1ListMeta metadata = new V1ListMeta();
        clusterRoleBindingList.setMetadata(metadata);
        assertSame(metadata, clusterRoleBindingList.getMetadata());
    }

    //BaseRock generated method id: ${testItemsListModification}, hash: 541BB4680A41C42371D659AE7126C0C8
    @Test
    void testItemsListModification() {
        List<V1ClusterRoleBinding> initialItems = new ArrayList<>();
        initialItems.add(new V1ClusterRoleBinding());
        clusterRoleBindingList.setItems(initialItems);
        List<V1ClusterRoleBinding> items = clusterRoleBindingList.getItems();
        items.add(new V1ClusterRoleBinding());
        assertEquals(2, clusterRoleBindingList.getItems().size());
    }

    //BaseRock generated method id: ${testHashCodeConsistency}, hash: 3AB0873454F66579362DF641CCAB525F
    @Test
    void testHashCodeConsistency() {
        int initialHashCode = clusterRoleBindingList.hashCode();
        clusterRoleBindingList.setApiVersion("v1");
        assertNotEquals(initialHashCode, clusterRoleBindingList.hashCode());
    }

    //BaseRock generated method id: ${testEqualsWithDifferentTypes}, hash: 64148A0752DB95E1082861F201AD968A
    @Test
    void testEqualsWithDifferentTypes() {
        assertFalse(clusterRoleBindingList.equals(new Object()));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: DB89E29E573D06EA96171AC4AE5BEBE8
    @Test
    void testEqualsWithNull() {
        assertFalse(clusterRoleBindingList.equals(null));
    }

    //BaseRock generated method id: ${testDeepEquality}, hash: 1C1F7D5E33120A2C066D723221D91CBB
    @Test
    void testDeepEquality() {
        V1ClusterRoleBindingList list1 = new V1ClusterRoleBindingList().apiVersion("v1").kind("ClusterRoleBindingList").metadata(new V1ListMeta().resourceVersion("1"));
        V1ClusterRoleBindingList list2 = new V1ClusterRoleBindingList().apiVersion("v1").kind("ClusterRoleBindingList").metadata(new V1ListMeta().resourceVersion("1"));
        assertEquals(list1, list2);
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    //BaseRock generated method id: ${testDeepInequality}, hash: 0CD8CDD9393FFB92AC1346B18DF53346
    @Test
    void testDeepInequality() {
        V1ClusterRoleBindingList list1 = new V1ClusterRoleBindingList().apiVersion("v1").kind("ClusterRoleBindingList").metadata(new V1ListMeta().resourceVersion("1"));
        V1ClusterRoleBindingList list2 = new V1ClusterRoleBindingList().apiVersion("v2").kind("ClusterRoleBindingList").metadata(new V1ListMeta().resourceVersion("2"));
        assertNotEquals(list1, list2);
        assertNotEquals(list1.hashCode(), list2.hashCode());
    }
}
