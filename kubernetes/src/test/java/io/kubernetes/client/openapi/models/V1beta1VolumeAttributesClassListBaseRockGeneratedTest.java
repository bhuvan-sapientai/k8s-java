package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.mockito.MockitoAnnotations;
import io.kubernetes.client.openapi.models.V1beta1VolumeAttributesClass;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.mockito.Mock;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1VolumeAttributesClassListBaseRockGeneratedTest {

    @Mock
    private V1ListMeta mockMetadata;

    @Mock
    private V1beta1VolumeAttributesClass mockVolumeAttributesClass;

    private V1beta1VolumeAttributesClassList volumeAttributesClassList;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        volumeAttributesClassList = new V1beta1VolumeAttributesClassList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: BE6A2EEF599BE9F415248804D91655CA
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1beta1";
        volumeAttributesClassList.setApiVersion(apiVersion);
        assertEquals(apiVersion, volumeAttributesClassList.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: 87767A6E3F76148C8E76D97AC0320439
    @Test
    void testSetApiVersion() {
        String apiVersion = "v1beta1";
        volumeAttributesClassList.setApiVersion(apiVersion);
        assertEquals(apiVersion, volumeAttributesClassList.getApiVersion());
    }

    //BaseRock generated method id: ${testGetItems}, hash: 181408ED807B52BA4727551B0E8E3046
    @Test
    void testGetItems() {
        List<V1beta1VolumeAttributesClass> items = new ArrayList<>();
        items.add(mockVolumeAttributesClass);
        volumeAttributesClassList.setItems(items);
        assertEquals(items, volumeAttributesClassList.getItems());
    }

    //BaseRock generated method id: ${testSetItems}, hash: 94FEA78BF76DB2D0EE501363D67F677D
    @Test
    void testSetItems() {
        List<V1beta1VolumeAttributesClass> items = new ArrayList<>();
        items.add(mockVolumeAttributesClass);
        volumeAttributesClassList.setItems(items);
        assertEquals(items, volumeAttributesClassList.getItems());
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 5C48B54243AA437FC914D00DCD48F832
    @Test
    void testAddItemsItem() {
        volumeAttributesClassList.addItemsItem(mockVolumeAttributesClass);
        assertEquals(1, volumeAttributesClassList.getItems().size());
        assertEquals(mockVolumeAttributesClass, volumeAttributesClassList.getItems().get(0));
    }

    //BaseRock generated method id: ${testGetKind}, hash: BE6C268C5DAD493F95EBE156DB3EBF47
    @Test
    void testGetKind() {
        String kind = "VolumeAttributesClassList";
        volumeAttributesClassList.setKind(kind);
        assertEquals(kind, volumeAttributesClassList.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: F98DBFDF998D070BEE0D3BC95B0FACDF
    @Test
    void testSetKind() {
        String kind = "VolumeAttributesClassList";
        volumeAttributesClassList.setKind(kind);
        assertEquals(kind, volumeAttributesClassList.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 69CB9115E3B11E2DD66F9D1A046340EC
    @Test
    void testGetMetadata() {
        volumeAttributesClassList.setMetadata(mockMetadata);
        assertEquals(mockMetadata, volumeAttributesClassList.getMetadata());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: 9578838153C2B9B2B3D25A2D450D6845
    @Test
    void testSetMetadata() {
        volumeAttributesClassList.setMetadata(mockMetadata);
        assertEquals(mockMetadata, volumeAttributesClassList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: 9C1A620B2C6D25DD2A6D84FB14E33416
    @Test
    void testEquals() {
        V1beta1VolumeAttributesClassList list1 = new V1beta1VolumeAttributesClassList();
        V1beta1VolumeAttributesClassList list2 = new V1beta1VolumeAttributesClassList();
        assertTrue(list1.equals(list2));
        list1.setApiVersion("v1beta1");
        list1.setKind("VolumeAttributesClassList");
        list1.setMetadata(mockMetadata);
        List<V1beta1VolumeAttributesClass> items = new ArrayList<>();
        items.add(mockVolumeAttributesClass);
        list1.setItems(items);
        list2.setApiVersion("v1beta1");
        list2.setKind("VolumeAttributesClassList");
        list2.setMetadata(mockMetadata);
        list2.setItems(items);
        assertTrue(list1.equals(list2));
        list2.setApiVersion("v1");
        assertFalse(list1.equals(list2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: C5408119FFE98D54564EAC73B4D62844
    @Test
    void testHashCode() {
        V1beta1VolumeAttributesClassList list1 = new V1beta1VolumeAttributesClassList();
        V1beta1VolumeAttributesClassList list2 = new V1beta1VolumeAttributesClassList();
        assertEquals(list1.hashCode(), list2.hashCode());
        list1.setApiVersion("v1beta1");
        list1.setKind("VolumeAttributesClassList");
        list1.setMetadata(mockMetadata);
        List<V1beta1VolumeAttributesClass> items = new ArrayList<>();
        items.add(mockVolumeAttributesClass);
        list1.setItems(items);
        list2.setApiVersion("v1beta1");
        list2.setKind("VolumeAttributesClassList");
        list2.setMetadata(mockMetadata);
        list2.setItems(items);
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: A33323144BD28A1B7B2075793ED3B0F7
    @Test
    void testToString() {
        volumeAttributesClassList.setApiVersion("v1beta1");
        volumeAttributesClassList.setKind("VolumeAttributesClassList");
        volumeAttributesClassList.setMetadata(mockMetadata);
        List<V1beta1VolumeAttributesClass> items = new ArrayList<>();
        items.add(mockVolumeAttributesClass);
        volumeAttributesClassList.setItems(items);
        String toString = volumeAttributesClassList.toString();
        assertTrue(toString.contains("apiVersion"));
        assertTrue(toString.contains("v1beta1"));
        assertTrue(toString.contains("kind"));
        assertTrue(toString.contains("VolumeAttributesClassList"));
        assertTrue(toString.contains("metadata"));
        assertTrue(toString.contains("items"));
    }
}
