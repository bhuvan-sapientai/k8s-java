package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import io.kubernetes.client.openapi.models.V1ListMeta;
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
import io.kubernetes.client.openapi.models.V1FlowSchema;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import java.util.ArrayList;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1FlowSchemaListBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1FlowSchemaListConstructor}, hash: 8FD7104417FCDA15C381E95B88DED5A0
    @Test
    void testV1FlowSchemaListConstructor() {
        V1FlowSchemaList flowSchemaList = new V1FlowSchemaList();
        assertThat(flowSchemaList, is(notNullValue()));
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 85492273A88995EAE02C1ACAC13466EC
    @Test
    void testApiVersion() {
        V1FlowSchemaList flowSchemaList = new V1FlowSchemaList();
        String apiVersion = "v1";
        flowSchemaList.setApiVersion(apiVersion);
        assertEquals(apiVersion, flowSchemaList.getApiVersion());
    }

    //BaseRock generated method id: ${testItems}, hash: E4ACF46846C4D90C80C036A780BCCE01
    @Test
    void testItems() {
        V1FlowSchemaList flowSchemaList = new V1FlowSchemaList();
        List<V1FlowSchema> items = new ArrayList<>();
        items.add(new V1FlowSchema());
        items.add(new V1FlowSchema());
        flowSchemaList.setItems(items);
        assertThat(flowSchemaList.getItems(), hasSize(2));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: C99B8922CAAC9AC907E1BE859D1E4F2F
    @Test
    void testAddItemsItem() {
        V1FlowSchemaList flowSchemaList = new V1FlowSchemaList();
        V1FlowSchema item = new V1FlowSchema();
        flowSchemaList.addItemsItem(item);
        assertThat(flowSchemaList.getItems(), hasSize(1));
        assertEquals(item, flowSchemaList.getItems().get(0));
    }

    //BaseRock generated method id: ${testKind}, hash: C47BBC55A8E83F333F0A72497D86E358
    @Test
    void testKind() {
        V1FlowSchemaList flowSchemaList = new V1FlowSchemaList();
        String kind = "FlowSchemaList";
        flowSchemaList.setKind(kind);
        assertEquals(kind, flowSchemaList.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 972015E7DCC821FB0217EF0889AA6AE0
    @Test
    void testMetadata() {
        V1FlowSchemaList flowSchemaList = new V1FlowSchemaList();
        V1ListMeta metadata = new V1ListMeta();
        flowSchemaList.setMetadata(metadata);
        assertEquals(metadata, flowSchemaList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: 18E1E99431DC6F8773EB086BE5C06998
    @Test
    void testEquals() {
        V1FlowSchemaList list1 = new V1FlowSchemaList().apiVersion("v1").kind("FlowSchemaList").items(Arrays.asList(new V1FlowSchema(), new V1FlowSchema())).metadata(new V1ListMeta());
        V1FlowSchemaList list2 = new V1FlowSchemaList().apiVersion("v1").kind("FlowSchemaList").items(Arrays.asList(new V1FlowSchema(), new V1FlowSchema())).metadata(new V1ListMeta());
        V1FlowSchemaList list3 = new V1FlowSchemaList().apiVersion("v2").kind("OtherKind").items(Arrays.asList(new V1FlowSchema())).metadata(new V1ListMeta());
        assertThat(list1.equals(list2), is(true));
        assertThat(list1.equals(list3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 6E9B072B05448EF2CA03642A2EDBDC4E
    @Test
    void testHashCode() {
        V1FlowSchemaList list1 = new V1FlowSchemaList().apiVersion("v1").kind("FlowSchemaList").items(Arrays.asList(new V1FlowSchema(), new V1FlowSchema())).metadata(new V1ListMeta());
        V1FlowSchemaList list2 = new V1FlowSchemaList().apiVersion("v1").kind("FlowSchemaList").items(Arrays.asList(new V1FlowSchema(), new V1FlowSchema())).metadata(new V1ListMeta());
        assertThat(list1.hashCode(), equalTo(list2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 839CD02D3A4AA5892FB55457BA0A38BB
    @Test
    void testToString() {
        V1FlowSchemaList flowSchemaList = new V1FlowSchemaList().apiVersion("v1").kind("FlowSchemaList").items(Arrays.asList(new V1FlowSchema(), new V1FlowSchema())).metadata(new V1ListMeta());
        String expectedString = "class V1FlowSchemaList {\n" + "    apiVersion: v1\n" + "    items: [class V1FlowSchema {\n" + "        apiVersion: null\n" + "        kind: null\n" + "        metadata: null\n" + "        spec: null\n" + "        status: null\n" + "    }, class V1FlowSchema {\n" + "        apiVersion: null\n" + "        kind: null\n" + "        metadata: null\n" + "        spec: null\n" + "        status: null\n" + "    }]\n" + "    kind: FlowSchemaList\n" + "    metadata: class V1ListMeta {\n" + "        _continue: null\n" + "        remainingItemCount: null\n" + "        resourceVersion: null\n" + "        selfLink: null\n" + "    }\n" + "}";
        assertEquals(expectedString, flowSchemaList.toString());
    }

    //BaseRock generated method id: ${testSetNullApiVersion}, hash: 85645335A923979CBA39E1AFD6882F5A
    @Test
    void testSetNullApiVersion() {
        V1FlowSchemaList flowSchemaList = new V1FlowSchemaList();
        flowSchemaList.setApiVersion(null);
        assertThat(flowSchemaList.getApiVersion(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetNullItems}, hash: 6340711E98D140A038DB3B62845148D1
    @Test
    void testSetNullItems() {
        V1FlowSchemaList flowSchemaList = new V1FlowSchemaList();
        flowSchemaList.setItems(null);
        assertNull(flowSchemaList.getItems());
    }

    //BaseRock generated method id: ${testSetNullKind}, hash: 843D40AAE0F5ABE6EAE4D51064E4B4B2
    @Test
    void testSetNullKind() {
        V1FlowSchemaList flowSchemaList = new V1FlowSchemaList();
        flowSchemaList.setKind(null);
        assertThat(flowSchemaList.getKind(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetNullMetadata}, hash: 3E22D7456CDFFF9182B250AD01545197
    @Test
    void testSetNullMetadata() {
        V1FlowSchemaList flowSchemaList = new V1FlowSchemaList();
        flowSchemaList.setMetadata(null);
        assertThat(flowSchemaList.getMetadata(), is(nullValue()));
    }
}
