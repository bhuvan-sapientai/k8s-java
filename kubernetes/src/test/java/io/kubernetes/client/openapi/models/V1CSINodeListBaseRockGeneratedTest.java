package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import io.kubernetes.client.openapi.models.V1CSINode;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.V1CSINodeList;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class V1CSINodeListBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1CSINodeListConstructor}, hash: F16BF526AD410D7D6F2756BF4AB60FE1
    @Test
    void testV1CSINodeListConstructor() {
        V1CSINodeList v1CSINodeList = new V1CSINodeList();
        assertNotNull(v1CSINodeList);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 5724FD5A2B541FBD85010C644BD66F93
    @Test
    void testApiVersion() {
        V1CSINodeList v1CSINodeList = new V1CSINodeList();
        String apiVersion = "v1";
        v1CSINodeList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1CSINodeList.getApiVersion());
    }

    //BaseRock generated method id: ${testApiVersionWithDifferentValues}, hash: EF81733AB5F38F9DBA264659EC89093F
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "v1", "v2" })
    void testApiVersionWithDifferentValues(String apiVersion) {
        V1CSINodeList v1CSINodeList = new V1CSINodeList();
        v1CSINodeList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1CSINodeList.getApiVersion());
    }

    //BaseRock generated method id: ${testItems}, hash: 96D8CF15BC09F51DA7677C34CBDC4655
    @Test
    void testItems() {
        V1CSINodeList v1CSINodeList = new V1CSINodeList();
        List<V1CSINode> items = new ArrayList<>();
        items.add(new V1CSINode());
        v1CSINodeList.setItems(items);
        assertEquals(items, v1CSINodeList.getItems());
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 29EC92E975E8CDF0C34B27975B4A456C
    @Test
    void testAddItemsItem() {
        V1CSINodeList v1CSINodeList = new V1CSINodeList();
        V1CSINode item = new V1CSINode();
        v1CSINodeList.addItemsItem(item);
        assertTrue(v1CSINodeList.getItems().contains(item));
    }

    //BaseRock generated method id: ${testKind}, hash: 237D0BE0266BDA63420A11B136811396
    @Test
    void testKind() {
        V1CSINodeList v1CSINodeList = new V1CSINodeList();
        String kind = "CSINodeList";
        v1CSINodeList.setKind(kind);
        assertEquals(kind, v1CSINodeList.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 792083E021146A214166909FF58BC89E
    @Test
    void testMetadata() {
        V1CSINodeList v1CSINodeList = new V1CSINodeList();
        V1ListMeta metadata = new V1ListMeta();
        v1CSINodeList.setMetadata(metadata);
        assertEquals(metadata, v1CSINodeList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: 47F406B2DADC9DFEFB3884F9CDA16FB3
    @Test
    void testEquals() {
        V1CSINodeList v1CSINodeList1 = new V1CSINodeList().apiVersion("v1").kind("CSINodeList").metadata(new V1ListMeta());
        V1CSINodeList v1CSINodeList2 = new V1CSINodeList().apiVersion("v1").kind("CSINodeList").metadata(new V1ListMeta());
        assertEquals(v1CSINodeList1, v1CSINodeList2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 0F134BDA27827DDF5DEF6F7A62B94C80
    @Test
    void testHashCode() {
        V1CSINodeList v1CSINodeList1 = new V1CSINodeList().apiVersion("v1").kind("CSINodeList").metadata(new V1ListMeta());
        V1CSINodeList v1CSINodeList2 = new V1CSINodeList().apiVersion("v1").kind("CSINodeList").metadata(new V1ListMeta());
        assertEquals(v1CSINodeList1.hashCode(), v1CSINodeList2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: BB574838AD9F02991A409A15E4D56F13
    @Test
    void testToString() {
        V1CSINodeList v1CSINodeList = new V1CSINodeList().apiVersion("v1").kind("CSINodeList").metadata(new V1ListMeta());
        String expectedString = "class V1CSINodeList {\n    apiVersion: v1\n    items: []\n    kind: CSINodeList\n    metadata: class V1ListMeta {\n        _continue: null\n        remainingItemCount: null\n        resourceVersion: null\n        selfLink: null\n    }\n}";
        assertEquals(expectedString, v1CSINodeList.toString());
    }

    //BaseRock generated method id: ${testBuilder}, hash: 078AA4F7B9B647301E85D2146B4541E1
    @Test
    void testBuilder() {
        V1ListMeta metadata = new V1ListMeta();
        List<V1CSINode> items = new ArrayList<>();
        items.add(new V1CSINode());
        V1CSINodeList v1CSINodeList = new V1CSINodeList().apiVersion("v1").kind("CSINodeList").metadata(metadata).items(items);
        assertEquals("v1", v1CSINodeList.getApiVersion());
        assertEquals("CSINodeList", v1CSINodeList.getKind());
        assertEquals(metadata, v1CSINodeList.getMetadata());
        assertEquals(items, v1CSINodeList.getItems());
    }
}
