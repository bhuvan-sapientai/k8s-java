package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import io.kubernetes.client.openapi.models.V1MutatingWebhookConfiguration;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1MutatingWebhookConfigurationListBaseRockGeneratedTest {

    private V1MutatingWebhookConfigurationList v1MutatingWebhookConfigurationList;

    @BeforeEach
    void setUp() {
        v1MutatingWebhookConfigurationList = new V1MutatingWebhookConfigurationList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: C99B9902AB51D51966A92CF02791A479
    @Test
    void testGetApiVersion() {
        assertNull(v1MutatingWebhookConfigurationList.getApiVersion());
        String apiVersion = "v1";
        v1MutatingWebhookConfigurationList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1MutatingWebhookConfigurationList.getApiVersion());
    }

    //BaseRock generated method id: ${testGetItems}, hash: F88421401133BA4F36268159E58DB1E5
    @Test
    void testGetItems() {
        List<V1MutatingWebhookConfiguration> items = v1MutatingWebhookConfigurationList.getItems();
        assertNotNull(items);
        assertTrue(items.isEmpty());
    }

    //BaseRock generated method id: ${testSetItems}, hash: 7419AA01CAC0FF3E2F42A1E54D2B158D
    @Test
    void testSetItems() {
        List<V1MutatingWebhookConfiguration> items = new ArrayList<>();
        items.add(new V1MutatingWebhookConfiguration());
        v1MutatingWebhookConfigurationList.setItems(items);
        assertEquals(items, v1MutatingWebhookConfigurationList.getItems());
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 2FE56AA5FE5959D104FD9DBFE539AF2C
    @Test
    void testAddItemsItem() {
        V1MutatingWebhookConfiguration item = new V1MutatingWebhookConfiguration();
        v1MutatingWebhookConfigurationList.addItemsItem(item);
        List<V1MutatingWebhookConfiguration> items = v1MutatingWebhookConfigurationList.getItems();
        assertEquals(1, items.size());
        assertTrue(items.contains(item));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 17146CEF22F456D35E45D7540EC9B678
    @Test
    void testGetKind() {
        assertNull(v1MutatingWebhookConfigurationList.getKind());
        String kind = "MutatingWebhookConfigurationList";
        v1MutatingWebhookConfigurationList.setKind(kind);
        assertEquals(kind, v1MutatingWebhookConfigurationList.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: EB6ED06FAE797189524FC8C02A4C29DE
    @Test
    void testGetMetadata() {
        assertNull(v1MutatingWebhookConfigurationList.getMetadata());
        V1ListMeta metadata = new V1ListMeta();
        v1MutatingWebhookConfigurationList.setMetadata(metadata);
        assertEquals(metadata, v1MutatingWebhookConfigurationList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: BB7DC6A6F1E6CE257FE6966BC141F28C
    @Test
    void testEquals() {
        V1MutatingWebhookConfigurationList list1 = new V1MutatingWebhookConfigurationList();
        V1MutatingWebhookConfigurationList list2 = new V1MutatingWebhookConfigurationList();
        assertTrue(list1.equals(list2));
        assertEquals(list1.hashCode(), list2.hashCode());
        list1.setApiVersion("v1");
        assertFalse(list1.equals(list2));
        list2.setApiVersion("v1");
        assertTrue(list1.equals(list2));
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 0CFEE0E6BC66901ED97DC789BAE2D8EB
    @Test
    void testToString() {
        String toString = v1MutatingWebhookConfigurationList.toString();
        assertNotNull(toString);
        assertTrue(toString.contains("V1MutatingWebhookConfigurationList"));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 3FF6F9F30A9D17BA9F6799871B591150
    @Test
    void testBuilder() {
        V1MutatingWebhookConfigurationList list = new V1MutatingWebhookConfigurationList().apiVersion("v1").kind("MutatingWebhookConfigurationList").metadata(new V1ListMeta()).addItemsItem(new V1MutatingWebhookConfiguration());
        assertEquals("v1", list.getApiVersion());
        assertEquals("MutatingWebhookConfigurationList", list.getKind());
        assertNotNull(list.getMetadata());
        assertEquals(1, list.getItems().size());
    }
}
