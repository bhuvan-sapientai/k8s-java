package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1beta1ResourceSlice;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1beta1ResourceSliceListBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 7D06D11D8673A3910D4663CE018FC781
    @Test
    void testConstructor() {
        V1beta1ResourceSliceList resourceSliceList = new V1beta1ResourceSliceList();
        assertThat(resourceSliceList, is(notNullValue()));
    }

    //BaseRock generated method id: ${testApiVersion}, hash: A142868EA65BA19CE7FEE1D4D778E02D
    @Test
    void testApiVersion() {
        V1beta1ResourceSliceList resourceSliceList = new V1beta1ResourceSliceList();
        String apiVersion = "v1beta1";
        resourceSliceList.setApiVersion(apiVersion);
        assertThat(resourceSliceList.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testItems}, hash: ECF89A3ABEC9C1D3DF5452F25B4B2A6B
    @Test
    void testItems() {
        V1beta1ResourceSliceList resourceSliceList = new V1beta1ResourceSliceList();
        List<V1beta1ResourceSlice> items = new ArrayList<>();
        items.add(mock(V1beta1ResourceSlice.class));
        resourceSliceList.setItems(items);
        assertThat(resourceSliceList.getItems(), is(equalTo(items)));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: D224D10BAD6CF880521A71B70F628FBB
    @Test
    void testAddItemsItem() {
        V1beta1ResourceSliceList resourceSliceList = new V1beta1ResourceSliceList();
        V1beta1ResourceSlice item = mock(V1beta1ResourceSlice.class);
        resourceSliceList.addItemsItem(item);
        assertThat(resourceSliceList.getItems(), hasSize(1));
        assertThat(resourceSliceList.getItems().get(0), is(equalTo(item)));
    }

    //BaseRock generated method id: ${testKind}, hash: 03A6BD863B6B2DE1E0407530668D6033
    @Test
    void testKind() {
        V1beta1ResourceSliceList resourceSliceList = new V1beta1ResourceSliceList();
        String kind = "ResourceSliceList";
        resourceSliceList.setKind(kind);
        assertThat(resourceSliceList.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testMetadata}, hash: E956E33D6573AF9F7708C441E740F53D
    @Test
    void testMetadata() {
        V1beta1ResourceSliceList resourceSliceList = new V1beta1ResourceSliceList();
        V1ListMeta metadata = mock(V1ListMeta.class);
        resourceSliceList.setMetadata(metadata);
        assertThat(resourceSliceList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 35DFDBFFAE4C38B03837BE30FB9B3DC5
    @Disabled()
    @Test
    void testEquals() {
        V1ListMeta metadata1 = mock(V1ListMeta.class);
        V1ListMeta metadata2 = mock(V1ListMeta.class);
        V1beta1ResourceSliceList list1 = new V1beta1ResourceSliceList().apiVersion("v1beta1").kind("ResourceSliceList").metadata(metadata1);
        V1beta1ResourceSliceList list2 = new V1beta1ResourceSliceList().apiVersion("v1beta1").kind("ResourceSliceList").metadata(metadata2);
        List<V1beta1ResourceSlice> items = new ArrayList<>();
        list1.setItems(items);
        list2.setItems(items);
        assertThat(list1.equals(list2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: DDEF47ADACD68AB845D3DD68CFD08C17
    @Test
    void testHashCode() {
        V1beta1ResourceSliceList list = new V1beta1ResourceSliceList().apiVersion("v1beta1").kind("ResourceSliceList").metadata(mock(V1ListMeta.class));
        int hashCode = list.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 8B981CAC9EF236C1AE07FF72BEA19362
    @Test
    void testToString() {
        V1beta1ResourceSliceList list = new V1beta1ResourceSliceList().apiVersion("v1beta1").kind("ResourceSliceList").metadata(mock(V1ListMeta.class));
        String toString = list.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
    }

    //BaseRock generated method id: ${testSetApiVersionNull}, hash: 6DD181275E85832CCDF97D9C9B81BAF5
    @Test
    void testSetApiVersionNull() {
        V1beta1ResourceSliceList resourceSliceList = new V1beta1ResourceSliceList();
        resourceSliceList.setApiVersion(null);
        assertThat(resourceSliceList.getApiVersion(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetKindNull}, hash: 88A9A6682839A5869068FD4758B8D27C
    @Test
    void testSetKindNull() {
        V1beta1ResourceSliceList resourceSliceList = new V1beta1ResourceSliceList();
        resourceSliceList.setKind(null);
        assertThat(resourceSliceList.getKind(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetMetadataNull}, hash: 3DD87D751532A4948DF2E52F8010A3D2
    @Test
    void testSetMetadataNull() {
        V1beta1ResourceSliceList resourceSliceList = new V1beta1ResourceSliceList();
        resourceSliceList.setMetadata(null);
        assertThat(resourceSliceList.getMetadata(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetItemsNull}, hash: E19EC0DAE8A42A007048C9B645354604
    @Test
    void testSetItemsNull() {
        V1beta1ResourceSliceList resourceSliceList = new V1beta1ResourceSliceList();
        resourceSliceList.setItems(null);
        assertThat(resourceSliceList.getItems(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAddItemsItemNull}, hash: C1F1CC19DC8F6BF18F37D537F508AF11
    @Test
    void testAddItemsItemNull() {
        V1beta1ResourceSliceList resourceSliceList = new V1beta1ResourceSliceList();
        resourceSliceList.addItemsItem(null);
        assertThat(resourceSliceList.getItems(), hasSize(1));
        assertThat(resourceSliceList.getItems().get(0), is(nullValue()));
    }
}
