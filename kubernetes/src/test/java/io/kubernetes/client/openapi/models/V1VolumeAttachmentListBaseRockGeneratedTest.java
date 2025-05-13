package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import io.kubernetes.client.openapi.models.V1VolumeAttachment;
import static org.hamcrest.Matchers.containsInAnyOrder;
import java.util.Arrays;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.openapi.models.V1VolumeAttachmentList;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1VolumeAttachmentListBaseRockGeneratedTest {

    private V1VolumeAttachmentList volumeAttachmentList;

    @BeforeEach
    void setUp() {
        volumeAttachmentList = new V1VolumeAttachmentList();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 7814A125D8876880732F2B6260199A50
    @Test
    void testConstructor() {
        assertThat(volumeAttachmentList, is(notNullValue()));
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 74FA38A3D947308F310022B1D5EFA06F
    @Test
    void testGetApiVersion() {
        assertThat(volumeAttachmentList.getApiVersion(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: DB36D1C16F20EB72DC7DCC5FBAFAE58A
    @Test
    void testSetApiVersion() {
        String apiVersion = "v1";
        volumeAttachmentList.setApiVersion(apiVersion);
        assertEquals(apiVersion, volumeAttachmentList.getApiVersion());
    }

    //BaseRock generated method id: ${testGetItems}, hash: E6F5DAB1B8F41CBBA8D66B27E2671836
    @Test
    void testGetItems() {
        assertThat(volumeAttachmentList.getItems(), is(notNullValue()));
        assertThat(volumeAttachmentList.getItems(), hasSize(0));
    }

    //BaseRock generated method id: ${testSetItems}, hash: 293E0938F4B02CB653EFCDA134D1C00A
    @Test
    void testSetItems() {
        List<V1VolumeAttachment> items = Arrays.asList(new V1VolumeAttachment(), new V1VolumeAttachment());
        volumeAttachmentList.setItems(items);
        assertThat(volumeAttachmentList.getItems(), hasSize(2));
        assertThat(volumeAttachmentList.getItems(), is(equalTo(items)));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 0BBCEA0EDDBD5CDE8C86F3D4595CC72C
    @Test
    void testGetKind() {
        assertThat(volumeAttachmentList.getKind(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetKind}, hash: E3128BCEBEFF37BD34B10CE9D4F98F15
    @Test
    void testSetKind() {
        String kind = "VolumeAttachmentList";
        volumeAttachmentList.setKind(kind);
        assertEquals(kind, volumeAttachmentList.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 46A6EF9E5E4792725CA8320A1DC106E3
    @Test
    void testGetMetadata() {
        assertThat(volumeAttachmentList.getMetadata(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: 9CE4E23DDA85D848D0BBC848BDE1CA4D
    @Test
    void testSetMetadata() {
        V1ListMeta metadata = new V1ListMeta();
        volumeAttachmentList.setMetadata(metadata);
        assertEquals(metadata, volumeAttachmentList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: 325155707F272CA87BBD66FBF0A9D7F2
    @Test
    void testEquals() {
        V1VolumeAttachmentList list1 = new V1VolumeAttachmentList().apiVersion("v1").kind("VolumeAttachmentList").metadata(new V1ListMeta()).items(new ArrayList<>());
        V1VolumeAttachmentList list2 = new V1VolumeAttachmentList().apiVersion("v1").kind("VolumeAttachmentList").metadata(new V1ListMeta()).items(new ArrayList<>());
        assertTrue(list1.equals(list2));
        assertTrue(list2.equals(list1));
    }

    //BaseRock generated method id: ${testNotEquals}, hash: DA29B7C18501995761D75D2FEEF2F34D
    @Test
    void testNotEquals() {
        V1VolumeAttachmentList list1 = new V1VolumeAttachmentList().apiVersion("v1").kind("VolumeAttachmentList").metadata(new V1ListMeta()).items(new ArrayList<>());
        V1VolumeAttachmentList list2 = new V1VolumeAttachmentList().apiVersion("v2").kind("VolumeAttachmentList").metadata(new V1ListMeta()).items(new ArrayList<>());
        assertFalse(list1.equals(list2));
        assertFalse(list2.equals(list1));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 3AE7EA0AC25FF4C4EE3374FCE5986C2B
    @Test
    void testHashCode() {
        V1VolumeAttachmentList list1 = new V1VolumeAttachmentList().apiVersion("v1").kind("VolumeAttachmentList").metadata(new V1ListMeta()).items(new ArrayList<>());
        V1VolumeAttachmentList list2 = new V1VolumeAttachmentList().apiVersion("v1").kind("VolumeAttachmentList").metadata(new V1ListMeta()).items(new ArrayList<>());
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: F773C6C4AB06C4ED76F20E0BF2B987B4
    @Test
    void testToString() {
        V1VolumeAttachmentList list = new V1VolumeAttachmentList().apiVersion("v1").kind("VolumeAttachmentList").metadata(new V1ListMeta()).items(new ArrayList<>());
        String expectedString = "class V1VolumeAttachmentList {\n" + "    apiVersion: v1\n" + "    items: []\n" + "    kind: VolumeAttachmentList\n" + "    metadata: class V1ListMeta {\n" + "        _continue: null\n" + "        remainingItemCount: null\n" + "        resourceVersion: null\n" + "        selfLink: null\n" + "    }\n" + "}";
        assertEquals(expectedString, list.toString());
    }

    //BaseRock generated method id: ${testApiVersionWithDifferentValues}, hash: 55602AF609EEC893DA71DC46A1D7CEFF
    @ParameterizedTest
    @ValueSource(strings = { "v1", "v2", "v3" })
    void testApiVersionWithDifferentValues(String apiVersion) {
        volumeAttachmentList.setApiVersion(apiVersion);
        assertEquals(apiVersion, volumeAttachmentList.getApiVersion());
    }

    //BaseRock generated method id: ${testApiVersionWithNullAndEmptyValues}, hash: F24A863191D3090FCDB1E398E8FD08B1
    @ParameterizedTest
    @NullAndEmptySource
    void testApiVersionWithNullAndEmptyValues(String apiVersion) {
        volumeAttachmentList.setApiVersion(apiVersion);
        assertEquals(apiVersion, volumeAttachmentList.getApiVersion());
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 28246887354C66D0183AE665BAB666CE
    @Test
    void testAddItemsItem() {
        V1VolumeAttachment item1 = new V1VolumeAttachment();
        V1VolumeAttachment item2 = new V1VolumeAttachment();
        volumeAttachmentList.addItemsItem(item1);
        volumeAttachmentList.addItemsItem(item2);
        assertThat(volumeAttachmentList.getItems(), hasSize(2));
        assertThat(volumeAttachmentList.getItems(), containsInAnyOrder(item1, item2));
    }

    //BaseRock generated method id: ${testApiVersionFluentInterface}, hash: 1ECEDF9678D28F92CED3B3F84A7FA0ED
    @Test
    void testApiVersionFluentInterface() {
        V1VolumeAttachmentList result = volumeAttachmentList.apiVersion("v1");
        assertThat(result, is(volumeAttachmentList));
        assertEquals("v1", volumeAttachmentList.getApiVersion());
    }

    //BaseRock generated method id: ${testItemsFluentInterface}, hash: 918EEA10D106A8AB0FF5C73C40512D3E
    @Test
    void testItemsFluentInterface() {
        List<V1VolumeAttachment> items = Arrays.asList(new V1VolumeAttachment(), new V1VolumeAttachment());
        V1VolumeAttachmentList result = volumeAttachmentList.items(items);
        assertThat(result, is(volumeAttachmentList));
        assertEquals(items, volumeAttachmentList.getItems());
    }

    //BaseRock generated method id: ${testKindFluentInterface}, hash: 8D26D91D33CFEB091F36EF60E11ADD77
    @Test
    void testKindFluentInterface() {
        V1VolumeAttachmentList result = volumeAttachmentList.kind("VolumeAttachmentList");
        assertThat(result, is(volumeAttachmentList));
        assertEquals("VolumeAttachmentList", volumeAttachmentList.getKind());
    }

    //BaseRock generated method id: ${testMetadataFluentInterface}, hash: 3BA424E77FDAC31921933CEF1DF0F6E9
    @Test
    void testMetadataFluentInterface() {
        V1ListMeta metadata = new V1ListMeta();
        V1VolumeAttachmentList result = volumeAttachmentList.metadata(metadata);
        assertThat(result, is(volumeAttachmentList));
        assertEquals(metadata, volumeAttachmentList.getMetadata());
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: 987B1DFD40EF22813A34586448FE02CE
    @Test
    void testEqualsWithNull() {
        assertNotEquals(null, volumeAttachmentList);
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 38E7D5A4F579F125D22FBA1607090B02
    @Test
    void testEqualsWithDifferentClass() {
        assertNotEquals("Not a V1VolumeAttachmentList", volumeAttachmentList);
    }

    //BaseRock generated method id: ${testEqualsWithDifferentApiVersion}, hash: ECB3266DB13EDDA279A57D21FEE96E4A
    @Test
    void testEqualsWithDifferentApiVersion() {
        V1VolumeAttachmentList list1 = new V1VolumeAttachmentList().apiVersion("v1");
        V1VolumeAttachmentList list2 = new V1VolumeAttachmentList().apiVersion("v2");
        assertNotEquals(list1, list2);
    }

    //BaseRock generated method id: ${testEqualsWithDifferentItems}, hash: 737739B2A8658DC554B37D66D677B268
    @Test
    void testEqualsWithDifferentItems() {
        V1VolumeAttachmentList list1 = new V1VolumeAttachmentList().items(Arrays.asList(new V1VolumeAttachment()));
        V1VolumeAttachmentList list2 = new V1VolumeAttachmentList().items(Arrays.asList(new V1VolumeAttachment(), new V1VolumeAttachment()));
        assertNotEquals(list1, list2);
    }

    //BaseRock generated method id: ${testEqualsWithDifferentKind}, hash: AC60705F144B82070E8665B31244CBA4
    @Test
    void testEqualsWithDifferentKind() {
        V1VolumeAttachmentList list1 = new V1VolumeAttachmentList().kind("VolumeAttachmentList");
        V1VolumeAttachmentList list2 = new V1VolumeAttachmentList().kind("OtherKind");
        assertNotEquals(list1, list2);
    }

    //BaseRock generated method id: ${testEqualsWithDifferentMetadata}, hash: 8047604D715BA720D2407365193B9EFA
    @Test
    void testEqualsWithDifferentMetadata() {
        V1VolumeAttachmentList list1 = new V1VolumeAttachmentList().metadata(new V1ListMeta().resourceVersion("1"));
        V1VolumeAttachmentList list2 = new V1VolumeAttachmentList().metadata(new V1ListMeta().resourceVersion("2"));
        assertNotEquals(list1, list2);
    }
}
