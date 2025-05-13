package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import io.kubernetes.client.openapi.models.V1PersistentVolume;
import java.util.List;
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
import io.kubernetes.client.common.KubernetesListObject;
import java.util.ArrayList;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PersistentVolumeListBaseRockGeneratedTest {

    private V1PersistentVolumeList v1PersistentVolumeList;

    @BeforeEach
    void setUp() {
        v1PersistentVolumeList = new V1PersistentVolumeList();
    }

    //BaseRock generated method id: ${testV1PersistentVolumeListImplementsKubernetesListObject}, hash: F587C6130517C8F4B87EA41C6A240060
    @Test
    void testV1PersistentVolumeListImplementsKubernetesListObject() {
        assertThat(v1PersistentVolumeList, is(notNullValue()));
        assertThat(v1PersistentVolumeList instanceof KubernetesListObject, is(true));
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: BA882B7B28C31C8B40E0C4DD661239A8
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1";
        v1PersistentVolumeList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1PersistentVolumeList.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: F416E7F8B2B9EF4151EC88BB583DE71D
    @Test
    void testSetApiVersion() {
        String apiVersion = "v1";
        v1PersistentVolumeList.setApiVersion(apiVersion);
        assertThat(v1PersistentVolumeList.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testGetItems}, hash: 96BF3A4D8BE0F996D66A0C34BA388746
    @Test
    void testGetItems() {
        List<V1PersistentVolume> items = new ArrayList<>();
        items.add(mock(V1PersistentVolume.class));
        v1PersistentVolumeList.setItems(items);
        assertThat(v1PersistentVolumeList.getItems(), is(equalTo(items)));
    }

    //BaseRock generated method id: ${testSetItems}, hash: 22E0CA1C310AC5B2E21B0B4C7F00595D
    @Test
    void testSetItems() {
        List<V1PersistentVolume> items = new ArrayList<>();
        items.add(mock(V1PersistentVolume.class));
        v1PersistentVolumeList.setItems(items);
        assertThat(v1PersistentVolumeList.getItems(), hasSize(1));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 10301D546C1AF5CB0272BF550D5233EB
    @Test
    void testAddItemsItem() {
        V1PersistentVolume item = mock(V1PersistentVolume.class);
        v1PersistentVolumeList.addItemsItem(item);
        assertThat(v1PersistentVolumeList.getItems(), hasSize(1));
        assertThat(v1PersistentVolumeList.getItems().get(0), is(equalTo(item)));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 428D60FA1E11B746EBF848C3A0DD5CE7
    @Test
    void testGetKind() {
        String kind = "PersistentVolumeList";
        v1PersistentVolumeList.setKind(kind);
        assertEquals(kind, v1PersistentVolumeList.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: C24F9F0BF74DBD90713D11642C6813AB
    @Test
    void testSetKind() {
        String kind = "PersistentVolumeList";
        v1PersistentVolumeList.setKind(kind);
        assertThat(v1PersistentVolumeList.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 9181A55C618D7F5AE285630837A1E04C
    @Test
    void testGetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1PersistentVolumeList.setMetadata(metadata);
        assertEquals(metadata, v1PersistentVolumeList.getMetadata());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: D887F26646A4B7A8CDBBFB6FA251CE83
    @Test
    void testSetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1PersistentVolumeList.setMetadata(metadata);
        assertThat(v1PersistentVolumeList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testEquals}, hash: A8774405283B31360B546C8C45D4E07D
    @Test
    void testEquals() {
        V1PersistentVolumeList list1 = new V1PersistentVolumeList();
        V1PersistentVolumeList list2 = new V1PersistentVolumeList();
        list1.setApiVersion("v1");
        list1.setKind("PersistentVolumeList");
        list2.setApiVersion("v1");
        list2.setKind("PersistentVolumeList");
        V1ListMeta metadata = mock(V1ListMeta.class);
        list1.setMetadata(metadata);
        list2.setMetadata(metadata);
        List<V1PersistentVolume> items = new ArrayList<>();
        items.add(mock(V1PersistentVolume.class));
        list1.setItems(items);
        list2.setItems(items);
        assertThat(list1, is(equalTo(list2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: D7DC40CB9F6367B0CD85AF630F212C78
    @Test
    void testHashCode() {
        V1PersistentVolumeList list = new V1PersistentVolumeList();
        list.setApiVersion("v1");
        list.setKind("PersistentVolumeList");
        V1ListMeta metadata = mock(V1ListMeta.class);
        list.setMetadata(metadata);
        List<V1PersistentVolume> items = new ArrayList<>();
        items.add(mock(V1PersistentVolume.class));
        list.setItems(items);
        int hashCode = list.hashCode();
        assertNotNull(hashCode);
    }

    //BaseRock generated method id: ${testToString}, hash: 47C539E2B82098CDEFB585E038FB08E0
    @Test
    void testToString() {
        V1PersistentVolumeList list = new V1PersistentVolumeList();
        list.setApiVersion("v1");
        list.setKind("PersistentVolumeList");
        V1ListMeta metadata = mock(V1ListMeta.class);
        when(metadata.toString()).thenReturn("MetadataString");
        list.setMetadata(metadata);
        List<V1PersistentVolume> items = new ArrayList<>();
        V1PersistentVolume item = mock(V1PersistentVolume.class);
        when(item.toString()).thenReturn("ItemString");
        items.add(item);
        list.setItems(items);
        String result = list.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result.contains("apiVersion"), is(true));
        assertThat(result.contains("kind"), is(true));
        assertThat(result.contains("metadata"), is(true));
        assertThat(result.contains("items"), is(true));
    }
}
