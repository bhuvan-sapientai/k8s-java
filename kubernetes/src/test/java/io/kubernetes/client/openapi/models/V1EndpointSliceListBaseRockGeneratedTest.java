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
import io.kubernetes.client.openapi.models.V1EndpointSlice;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1EndpointSliceListBaseRockGeneratedTest {

    private V1EndpointSliceList v1EndpointSliceList;

    @BeforeEach
    void setUp() {
        v1EndpointSliceList = new V1EndpointSliceList();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 2A115BB5394A6752E384788937AE3BAD
    @Test
    void testConstructor() {
        assertNotNull(v1EndpointSliceList);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 9591235466DEBB939690AA33D761D930
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1EndpointSliceList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1EndpointSliceList.getApiVersion());
    }

    //BaseRock generated method id: ${testItems}, hash: 821B21AF1DAA9D9AE0B45A179B67BD21
    @Test
    void testItems() {
        List<V1EndpointSlice> items = new ArrayList<>();
        V1EndpointSlice mockEndpointSlice = mock(V1EndpointSlice.class);
        items.add(mockEndpointSlice);
        v1EndpointSliceList.setItems(items);
        assertEquals(items, v1EndpointSliceList.getItems());
        assertThat(v1EndpointSliceList.getItems(), hasSize(1));
    }

    //BaseRock generated method id: ${testKind}, hash: 7A646FB5A63D09641EC9D7752614A4A3
    @Test
    void testKind() {
        String kind = "EndpointSliceList";
        v1EndpointSliceList.setKind(kind);
        assertEquals(kind, v1EndpointSliceList.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 0ED145AE74E6BBDECF7A4AFFE1E50B46
    @Test
    void testMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1EndpointSliceList.setMetadata(metadata);
        assertEquals(metadata, v1EndpointSliceList.getMetadata());
    }

    //BaseRock generated method id: ${testToString}, hash: 3F16FBA040D8F9C579F2C2736F236E4C
    @Test
    void testToString() {
        v1EndpointSliceList.setApiVersion("v1");
        v1EndpointSliceList.setKind("EndpointSliceList");
        v1EndpointSliceList.setMetadata(mock(V1ListMeta.class));
        String result = v1EndpointSliceList.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("apiVersion"), is(true));
        assertThat(result.contains("kind"), is(true));
        assertThat(result.contains("metadata"), is(true));
    }

    //BaseRock generated method id: ${testEquals}, hash: EDCF9D4A5E66E4453F304669766D8BB6
    @Test
    void testEquals() {
        V1EndpointSliceList list1 = new V1EndpointSliceList().apiVersion("v1").kind("EndpointSliceList").metadata(new V1ListMeta());
        V1EndpointSliceList list2 = new V1EndpointSliceList().apiVersion("v1").kind("EndpointSliceList").metadata(new V1ListMeta());
        assertThat(list1.equals(list2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 877EAED14DFBA599E8A6D6B64EAF2DB8
    @Test
    void testHashCode() {
        V1EndpointSliceList list1 = new V1EndpointSliceList().apiVersion("v1").kind("EndpointSliceList").metadata(new V1ListMeta());
        V1EndpointSliceList list2 = new V1EndpointSliceList().apiVersion("v1").kind("EndpointSliceList").metadata(new V1ListMeta());
        assertThat(list1.hashCode(), equalTo(list2.hashCode()));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: E213217DC6B3159B27C8E091D5D1E55D
    @Test
    void testAddItemsItem() {
        V1EndpointSlice endpointSlice = mock(V1EndpointSlice.class);
        v1EndpointSliceList.addItemsItem(endpointSlice);
        assertThat(v1EndpointSliceList.getItems(), hasSize(1));
        assertThat(v1EndpointSliceList.getItems().get(0), equalTo(endpointSlice));
    }
}
