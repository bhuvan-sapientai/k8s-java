package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import java.util.Collections;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1alpha3ResourceClaim;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha3ResourceClaimListBaseRockGeneratedTest {

    private V1alpha3ResourceClaimList v1alpha3ResourceClaimList;

    @BeforeEach
    void setUp() {
        v1alpha3ResourceClaimList = new V1alpha3ResourceClaimList();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 82462699DC6CD58947EBD035B30974C3
    @Test
    void testConstructor() {
        assertNotNull(v1alpha3ResourceClaimList);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 7812CD4F9AC1168446EC35A485FE8C9F
    @Test
    void testApiVersion() {
        String apiVersion = "v1alpha3";
        v1alpha3ResourceClaimList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1alpha3ResourceClaimList.getApiVersion());
    }

    //BaseRock generated method id: ${testItems}, hash: 0474FBFAE2FCB84A5C582FD545A4493E
    @Test
    void testItems() {
        List<V1alpha3ResourceClaim> items = new ArrayList<>();
        V1alpha3ResourceClaim claim = mock(V1alpha3ResourceClaim.class);
        items.add(claim);
        v1alpha3ResourceClaimList.setItems(items);
        assertEquals(items, v1alpha3ResourceClaimList.getItems());
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: A14C776F0775E0C38A9EAEC6E89759D9
    @Test
    void testAddItemsItem() {
        V1alpha3ResourceClaim claim = mock(V1alpha3ResourceClaim.class);
        v1alpha3ResourceClaimList.addItemsItem(claim);
        assertThat(v1alpha3ResourceClaimList.getItems(), hasSize(1));
        assertThat(v1alpha3ResourceClaimList.getItems().get(0), is(claim));
    }

    //BaseRock generated method id: ${testKind}, hash: 0F57864FE94D26C184CCA84177D7B5E0
    @Test
    void testKind() {
        String kind = "ResourceClaimList";
        v1alpha3ResourceClaimList.setKind(kind);
        assertEquals(kind, v1alpha3ResourceClaimList.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: E1C432A34AA53B1CF4F9023EB0DBFBA7
    @Test
    void testMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1alpha3ResourceClaimList.setMetadata(metadata);
        assertEquals(metadata, v1alpha3ResourceClaimList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: E644DAFC08709A417D6307DDA51BF866
    @Test
    void testEquals() {
        V1alpha3ResourceClaimList list1 = new V1alpha3ResourceClaimList().apiVersion("v1alpha3").kind("ResourceClaimList").items(Collections.singletonList(new V1alpha3ResourceClaim())).metadata(new V1ListMeta());
        V1alpha3ResourceClaimList list2 = new V1alpha3ResourceClaimList().apiVersion("v1alpha3").kind("ResourceClaimList").items(Collections.singletonList(new V1alpha3ResourceClaim())).metadata(new V1ListMeta());
        assertThat(list1.equals(list2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 7236D902371989C386F0FAB11EDD9B57
    @Test
    void testHashCode() {
        V1alpha3ResourceClaimList list = new V1alpha3ResourceClaimList().apiVersion("v1alpha3").kind("ResourceClaimList").items(Collections.singletonList(mock(V1alpha3ResourceClaim.class))).metadata(mock(V1ListMeta.class));
        int hashCode = list.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 78CFE45FE6737D83997E12468DDEF449
    @Test
    void testToString() {
        V1alpha3ResourceClaimList list = new V1alpha3ResourceClaimList().apiVersion("v1alpha3").kind("ResourceClaimList").items(Collections.singletonList(mock(V1alpha3ResourceClaim.class))).metadata(mock(V1ListMeta.class));
        String toString = list.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("items"), is(true));
        assertThat(toString.contains("metadata"), is(true));
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: 21373EEAC20F9DA9B88E8F3CEBA03C47
    @Test
    void testSetApiVersion() {
        String apiVersion = "v1alpha3";
        V1alpha3ResourceClaimList result = v1alpha3ResourceClaimList.apiVersion(apiVersion);
        assertThat(result, is(v1alpha3ResourceClaimList));
        assertThat(result.getApiVersion(), is(apiVersion));
    }

    //BaseRock generated method id: ${testSetItems}, hash: A2BC108D5900F138DE878FFD375C7DE0
    @Test
    void testSetItems() {
        List<V1alpha3ResourceClaim> items = new ArrayList<>();
        V1alpha3ResourceClaim claim = mock(V1alpha3ResourceClaim.class);
        items.add(claim);
        V1alpha3ResourceClaimList result = v1alpha3ResourceClaimList.items(items);
        assertThat(result, is(v1alpha3ResourceClaimList));
        assertThat(result.getItems(), is(items));
    }

    //BaseRock generated method id: ${testSetKind}, hash: 2B744C07D17CD4676513406CC4271D91
    @Test
    void testSetKind() {
        String kind = "ResourceClaimList";
        V1alpha3ResourceClaimList result = v1alpha3ResourceClaimList.kind(kind);
        assertThat(result, is(v1alpha3ResourceClaimList));
        assertThat(result.getKind(), is(kind));
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: 66A8F2A26799DCFC1905BC2E719C3381
    @Test
    void testSetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        V1alpha3ResourceClaimList result = v1alpha3ResourceClaimList.metadata(metadata);
        assertThat(result, is(v1alpha3ResourceClaimList));
        assertThat(result.getMetadata(), is(metadata));
    }

    //BaseRock generated method id: ${testGetApiVersionWhenNull}, hash: D4DF493533782C12D747C3917E38A42E
    @Test
    void testGetApiVersionWhenNull() {
        assertThat(v1alpha3ResourceClaimList.getApiVersion(), is(nullValue()));
    }

    //BaseRock generated method id: ${testGetItemsWhenNull}, hash: 8ABD30514AE12D8AE09E91077329AF6D
    @Test
    void testGetItemsWhenNull() {
        assertThat(v1alpha3ResourceClaimList.getItems(), is(notNullValue()));
        assertThat(v1alpha3ResourceClaimList.getItems(), hasSize(0));
    }

    //BaseRock generated method id: ${testGetKindWhenNull}, hash: BA0C43FC9C2C1515A43EF5FD30E5A495
    @Test
    void testGetKindWhenNull() {
        assertThat(v1alpha3ResourceClaimList.getKind(), is(nullValue()));
    }

    //BaseRock generated method id: ${testGetMetadataWhenNull}, hash: 791C81B4BA73C2D00453BA02BC5FD4E1
    @Test
    void testGetMetadataWhenNull() {
        assertThat(v1alpha3ResourceClaimList.getMetadata(), is(nullValue()));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: AD2D7E6C9A9ED1509457F3D41480FFBE
    @Test
    void testEqualsWithNull() {
        assertThat(v1alpha3ResourceClaimList.equals(null), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 94CC0D22AC7B45F94B2E5274484E2363
    @Test
    void testEqualsWithDifferentClass() {
        assertThat(v1alpha3ResourceClaimList.equals(new Object()), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentApiVersion}, hash: 33D29BB75D5CA74053823F0641F5F415
    @Test
    void testEqualsWithDifferentApiVersion() {
        V1alpha3ResourceClaimList list1 = new V1alpha3ResourceClaimList().apiVersion("v1");
        V1alpha3ResourceClaimList list2 = new V1alpha3ResourceClaimList().apiVersion("v2");
        assertThat(list1.equals(list2), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentItems}, hash: 05AFD69F2964500076330B2CC4747AD2
    @Test
    void testEqualsWithDifferentItems() {
        V1alpha3ResourceClaimList list1 = new V1alpha3ResourceClaimList().items(Collections.singletonList(new V1alpha3ResourceClaim().apiVersion("v1")));
        V1alpha3ResourceClaimList list2 = new V1alpha3ResourceClaimList().items(Collections.singletonList(new V1alpha3ResourceClaim().apiVersion("v2")));
        assertThat(list1.equals(list2), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentKind}, hash: 4E6330E0E24F422F2C522C8B434771CF
    @Test
    void testEqualsWithDifferentKind() {
        V1alpha3ResourceClaimList list1 = new V1alpha3ResourceClaimList().kind("Kind1");
        V1alpha3ResourceClaimList list2 = new V1alpha3ResourceClaimList().kind("Kind2");
        assertThat(list1.equals(list2), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentMetadata}, hash: D334D57FFEAE1975F11E11C11FABC7B4
    @Test
    void testEqualsWithDifferentMetadata() {
        V1alpha3ResourceClaimList list1 = new V1alpha3ResourceClaimList().metadata(new V1ListMeta().resourceVersion("1"));
        V1alpha3ResourceClaimList list2 = new V1alpha3ResourceClaimList().metadata(new V1ListMeta().resourceVersion("2"));
        assertThat(list1.equals(list2), is(false));
    }
}
