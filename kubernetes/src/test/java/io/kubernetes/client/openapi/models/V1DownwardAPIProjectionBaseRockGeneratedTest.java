package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1DownwardAPIProjection;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import java.util.ArrayList;
import static org.hamcrest.Matchers.not;
import io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1DownwardAPIProjectionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 33945E552376416BBFFE2262005961FB
    @Test
    void testConstructor() {
        V1DownwardAPIProjection projection = new V1DownwardAPIProjection();
        assertNotNull(projection);
    }

    //BaseRock generated method id: ${testSetAndGetItems}, hash: E734922E9308EDE8C65CAFF763071287
    @Test
    void testSetAndGetItems() {
        V1DownwardAPIProjection projection = new V1DownwardAPIProjection();
        List<V1DownwardAPIVolumeFile> items = new ArrayList<>();
        V1DownwardAPIVolumeFile item = mock(V1DownwardAPIVolumeFile.class);
        items.add(item);
        projection.setItems(items);
        assertEquals(items, projection.getItems());
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 9DE21C185460903315517A2A3761AAD2
    @Test
    void testAddItemsItem() {
        V1DownwardAPIProjection projection = new V1DownwardAPIProjection();
        V1DownwardAPIVolumeFile item = mock(V1DownwardAPIVolumeFile.class);
        projection.addItemsItem(item);
        assertThat(projection.getItems(), hasSize(1));
        assertThat(projection.getItems(), contains(item));
    }

    //BaseRock generated method id: ${testAddItemsItemToNullList}, hash: F988874D13CDBE4B143CFBEED5EA380C
    @Test
    void testAddItemsItemToNullList() {
        V1DownwardAPIProjection projection = new V1DownwardAPIProjection();
        V1DownwardAPIVolumeFile item = mock(V1DownwardAPIVolumeFile.class);
        projection.setItems(null);
        projection.addItemsItem(item);
        assertThat(projection.getItems(), hasSize(1));
        assertThat(projection.getItems(), contains(item));
    }

    //BaseRock generated method id: ${testEquals}, hash: 4B2AD3BEDE3C7F993591EE518AA53769
    @Test
    void testEquals() {
        V1DownwardAPIProjection projection1 = new V1DownwardAPIProjection();
        V1DownwardAPIProjection projection2 = new V1DownwardAPIProjection();
        assertThat(projection1.equals(projection2), is(true));
        List<V1DownwardAPIVolumeFile> items = new ArrayList<>();
        V1DownwardAPIVolumeFile item = mock(V1DownwardAPIVolumeFile.class);
        items.add(item);
        projection1.setItems(items);
        assertThat(projection1.equals(projection2), is(false));
        projection2.setItems(items);
        assertThat(projection1.equals(projection2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 9549318974D218622C6FD1870C723265
    @Test
    void testHashCode() {
        V1DownwardAPIProjection projection1 = new V1DownwardAPIProjection();
        V1DownwardAPIProjection projection2 = new V1DownwardAPIProjection();
        assertThat(projection1.hashCode(), equalTo(projection2.hashCode()));
        List<V1DownwardAPIVolumeFile> items = new ArrayList<>();
        V1DownwardAPIVolumeFile item = mock(V1DownwardAPIVolumeFile.class);
        items.add(item);
        projection1.setItems(items);
        assertThat(projection1.hashCode(), is(notNullValue()));
        assertThat(projection1.hashCode(), is(not(equalTo(projection2.hashCode()))));
        projection2.setItems(items);
        assertThat(projection1.hashCode(), equalTo(projection2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 15C1154A9CE41417E71BCE6C22C1932F
    @Test
    void testToString() {
        V1DownwardAPIProjection projection = new V1DownwardAPIProjection();
        assertThat(projection.toString(), is(notNullValue()));
        List<V1DownwardAPIVolumeFile> items = new ArrayList<>();
        V1DownwardAPIVolumeFile item = mock(V1DownwardAPIVolumeFile.class);
        items.add(item);
        projection.setItems(items);
        assertThat(projection.toString(), is(notNullValue()));
        assertThat(projection.toString().contains("items"), is(true));
    }

    //BaseRock generated method id: ${testSetNullItems}, hash: 12E450F1C864117BD91C7224CF5505CA
    @Test
    void testSetNullItems() {
        V1DownwardAPIProjection projection = new V1DownwardAPIProjection();
        projection.setItems(null);
        assertThat(projection.getItems(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetEmptyItems}, hash: 011CD39A0F56122047B76417345E342A
    @Test
    void testSetEmptyItems() {
        V1DownwardAPIProjection projection = new V1DownwardAPIProjection();
        projection.setItems(new ArrayList<>());
        assertThat(projection.getItems(), is(empty()));
    }
}
