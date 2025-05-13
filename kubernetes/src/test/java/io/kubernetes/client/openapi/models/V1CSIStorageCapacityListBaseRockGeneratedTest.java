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
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1CSIStorageCapacity;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CSIStorageCapacityListBaseRockGeneratedTest {

    private V1CSIStorageCapacityList v1CSIStorageCapacityList;

    @BeforeEach
    void setUp() {
        v1CSIStorageCapacityList = new V1CSIStorageCapacityList();
    }

    //BaseRock generated method id: ${testConstructor}, hash: C63E5E3849F6CF22DE075D7BC02A3C4A
    @Test
    void testConstructor() {
        assertNotNull(v1CSIStorageCapacityList);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 242442FA666C55FCED958DAE70066451
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1CSIStorageCapacityList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1CSIStorageCapacityList.getApiVersion());
    }

    //BaseRock generated method id: ${testItems}, hash: 2E5508BAB6B8FD443DBD0B8805223E19
    @Test
    void testItems() {
        List<V1CSIStorageCapacity> items = new ArrayList<>();
        V1CSIStorageCapacity item = mock(V1CSIStorageCapacity.class);
        items.add(item);
        v1CSIStorageCapacityList.setItems(items);
        assertEquals(items, v1CSIStorageCapacityList.getItems());
    }

    //BaseRock generated method id: ${testKind}, hash: AE7FE52B6D4197AE64E8589047544827
    @Test
    void testKind() {
        String kind = "V1CSIStorageCapacityList";
        v1CSIStorageCapacityList.setKind(kind);
        assertEquals(kind, v1CSIStorageCapacityList.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: C2E99B7A288B21E9EE4E3B5D6444128A
    @Test
    void testMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1CSIStorageCapacityList.setMetadata(metadata);
        assertEquals(metadata, v1CSIStorageCapacityList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: EA1F365F8CBC3ED4EF83057CA285D188
    @Test
    void testEquals() {
        V1CSIStorageCapacityList other = new V1CSIStorageCapacityList();
        other.setApiVersion("v1");
        other.setKind("V1CSIStorageCapacityList");
        V1ListMeta metadata = mock(V1ListMeta.class);
        other.setMetadata(metadata);
        List<V1CSIStorageCapacity> items = new ArrayList<>();
        items.add(mock(V1CSIStorageCapacity.class));
        other.setItems(items);
        v1CSIStorageCapacityList.setApiVersion("v1");
        v1CSIStorageCapacityList.setKind("V1CSIStorageCapacityList");
        v1CSIStorageCapacityList.setMetadata(metadata);
        v1CSIStorageCapacityList.setItems(items);
        assertThat(v1CSIStorageCapacityList, is(equalTo(other)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 53727B661CFF5E774FCF15F93575A72E
    @Test
    void testHashCode() {
        v1CSIStorageCapacityList.setApiVersion("v1");
        v1CSIStorageCapacityList.setKind("V1CSIStorageCapacityList");
        v1CSIStorageCapacityList.setMetadata(mock(V1ListMeta.class));
        List<V1CSIStorageCapacity> items = new ArrayList<>();
        items.add(mock(V1CSIStorageCapacity.class));
        v1CSIStorageCapacityList.setItems(items);
        int hashCode = v1CSIStorageCapacityList.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 7E0B6B5DC92D22BCC348627D67862F3B
    @Test
    void testToString() {
        v1CSIStorageCapacityList.setApiVersion("v1");
        v1CSIStorageCapacityList.setKind("V1CSIStorageCapacityList");
        v1CSIStorageCapacityList.setMetadata(mock(V1ListMeta.class));
        List<V1CSIStorageCapacity> items = new ArrayList<>();
        items.add(mock(V1CSIStorageCapacity.class));
        v1CSIStorageCapacityList.setItems(items);
        String toString = v1CSIStorageCapacityList.toString();
        assertThat(toString, is(notNullValue()));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 5E095D9F77CEE666268D0CF77E451C6C
    @Test
    void testAddItemsItem() {
        V1CSIStorageCapacity item = mock(V1CSIStorageCapacity.class);
        v1CSIStorageCapacityList.addItemsItem(item);
        assertThat(v1CSIStorageCapacityList.getItems().size(), is(1));
        assertThat(v1CSIStorageCapacityList.getItems().get(0), is(equalTo(item)));
    }
}
