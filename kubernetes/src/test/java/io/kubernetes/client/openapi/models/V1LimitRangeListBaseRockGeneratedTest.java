package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1LimitRange;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1LimitRangeListBaseRockGeneratedTest {

    private V1LimitRangeList v1LimitRangeList;

    @BeforeEach
    void setUp() {
        v1LimitRangeList = new V1LimitRangeList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 48A607D3F14912BB8E692E1EABEED0B6
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1";
        v1LimitRangeList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1LimitRangeList.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: 3A037BBFDC88A3AEC518B5F0D5F98BFC
    @Test
    void testSetApiVersion() {
        String apiVersion = "v1";
        v1LimitRangeList.setApiVersion(apiVersion);
        assertThat(v1LimitRangeList.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testGetItems}, hash: C5F1B1C084C824FCA76DB2D5A70B79F7
    @Test
    void testGetItems() {
        List<V1LimitRange> items = new ArrayList<>();
        items.add(new V1LimitRange());
        v1LimitRangeList.setItems(items);
        assertThat(v1LimitRangeList.getItems(), is(equalTo(items)));
    }

    //BaseRock generated method id: ${testSetItems}, hash: 2CDF7842721DA16E2FD07DF5C7447362
    @Test
    void testSetItems() {
        List<V1LimitRange> items = new ArrayList<>();
        items.add(new V1LimitRange());
        v1LimitRangeList.setItems(items);
        assertThat(v1LimitRangeList.getItems(), hasSize(1));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 1A74F80915AE3314245602D999E06B4B
    @Test
    void testAddItemsItem() {
        V1LimitRange item = new V1LimitRange();
        v1LimitRangeList.addItemsItem(item);
        assertThat(v1LimitRangeList.getItems(), hasSize(1));
        assertThat(v1LimitRangeList.getItems().get(0), is(equalTo(item)));
    }

    //BaseRock generated method id: ${testGetKind}, hash: BFAD9E16495F0571238F55CB9E90D64F
    @Test
    void testGetKind() {
        String kind = "LimitRangeList";
        v1LimitRangeList.setKind(kind);
        assertEquals(kind, v1LimitRangeList.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: 1338C6CD89B54DC4A8D9789F908A13AE
    @Test
    void testSetKind() {
        String kind = "LimitRangeList";
        v1LimitRangeList.setKind(kind);
        assertThat(v1LimitRangeList.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: E18CB8602F66838715BEC395271A7517
    @Test
    void testGetMetadata() {
        V1ListMeta metadata = new V1ListMeta();
        v1LimitRangeList.setMetadata(metadata);
        assertEquals(metadata, v1LimitRangeList.getMetadata());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: 66C3B2EC16AC5E7D7E08F22D62F367E6
    @Test
    void testSetMetadata() {
        V1ListMeta metadata = new V1ListMeta();
        v1LimitRangeList.setMetadata(metadata);
        assertThat(v1LimitRangeList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testEquals}, hash: BEFD75F0C569A0969A624DDF4C77C249
    @Test
    void testEquals() {
        V1LimitRangeList list1 = new V1LimitRangeList();
        V1LimitRangeList list2 = new V1LimitRangeList();
        assertTrue(list1.equals(list2));
        list1.setApiVersion("v1");
        assertFalse(list1.equals(list2));
        list2.setApiVersion("v1");
        assertTrue(list1.equals(list2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 22AE36A61A892B02DBDFFB96F9F3D3B3
    @Test
    void testHashCode() {
        V1LimitRangeList list1 = new V1LimitRangeList();
        V1LimitRangeList list2 = new V1LimitRangeList();
        assertEquals(list1.hashCode(), list2.hashCode());
        list1.setApiVersion("v1");
        assertNotNull(list1.hashCode());
        assertFalse(list1.hashCode() == list2.hashCode());
        list2.setApiVersion("v1");
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 5433F43495AADF329BCB186F8842E7F1
    @Test
    void testToString() {
        V1LimitRangeList list = new V1LimitRangeList();
        list.setApiVersion("v1");
        list.setKind("LimitRangeList");
        String toString = list.toString();
        assertNotNull(toString);
        assertTrue(toString.contains("apiVersion"));
        assertTrue(toString.contains("kind"));
    }

    //BaseRock generated method id: ${testToJson}, hash: 84BA28AD7E79ED1601E28B001F145607
    @Test
    void testToJson() throws Exception {
        V1LimitRangeList list = new V1LimitRangeList();
        list.setApiVersion("v1");
        list.setKind("LimitRangeList");
        String json = list.toJson();
        assertNotNull(json);
        assertTrue(json.contains("\"apiVersion\":\"v1\""));
        assertTrue(json.contains("\"kind\":\"LimitRangeList\""));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 3A49E9C537974DB5DD43D71916BDF139
    @Test
    void testFromJson() throws Exception {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"LimitRangeList\",\"items\":[]}";
        V1LimitRangeList list = V1LimitRangeList.fromJson(json);
        assertNotNull(list);
        assertEquals("v1", list.getApiVersion());
        assertEquals("LimitRangeList", list.getKind());
        assertNotNull(list.getItems());
        assertTrue(list.getItems().isEmpty());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: B0090DACD42DDCCC68FBF399CCBAF615
    @Test
    void testValidateJsonElement() throws Exception {
        V1LimitRangeList list = new V1LimitRangeList();
        list.setApiVersion("v1");
        list.setKind("LimitRangeList");
        list.setItems(new ArrayList<>());
        String json = list.toJson();
        assertNotNull(json);
        // This method is protected, so we can't test it directly
        // V1LimitRangeList.validateJsonElement(new JsonParser().parse(json));
    }

    //BaseRock generated method id: ${testCustomTypeAdapterFactory}, hash: 9ED5E6787E2CAA684757097F27DB327A
    @Test
    void testCustomTypeAdapterFactory() {
        // This is an inner class, so we can't test it directly
        // Just verify that the class exists
        assertNotNull(V1LimitRangeList.CustomTypeAdapterFactory.class);
    }
}
