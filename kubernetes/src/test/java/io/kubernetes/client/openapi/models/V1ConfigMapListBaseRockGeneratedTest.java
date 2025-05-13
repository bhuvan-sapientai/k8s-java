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
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1ConfigMap;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.Matchers;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ConfigMapListBaseRockGeneratedTest {

    private V1ConfigMapList v1ConfigMapList;

    @BeforeEach
    void setUp() {
        v1ConfigMapList = new V1ConfigMapList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: E345978C6447C5F61335160344D07C96
    @Test
    void testGetApiVersion() {
        assertThat(v1ConfigMapList.getApiVersion(), is(nullValue()));
        v1ConfigMapList.setApiVersion("v1");
        assertThat(v1ConfigMapList.getApiVersion(), is("v1"));
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: AB467007322472C77ABC5096E880313C
    @Test
    void testSetApiVersion() {
        v1ConfigMapList.setApiVersion("v1");
        assertThat(v1ConfigMapList.getApiVersion(), is("v1"));
    }

    //BaseRock generated method id: ${testGetItems}, hash: 6A453DC733F450D41D0B8FBD254ACCC5
    @Test
    void testGetItems() {
        assertThat(v1ConfigMapList.getItems(), is(notNullValue()));
        assertThat(v1ConfigMapList.getItems(), hasSize(0));
        List<V1ConfigMap> items = new ArrayList<>();
        items.add(new V1ConfigMap());
        v1ConfigMapList.setItems(items);
        assertThat(v1ConfigMapList.getItems(), is(items));
        assertThat(v1ConfigMapList.getItems(), hasSize(1));
    }

    //BaseRock generated method id: ${testSetItems}, hash: 0070CCA7B7E2BA413996F7A086740392
    @Test
    void testSetItems() {
        List<V1ConfigMap> items = new ArrayList<>();
        items.add(new V1ConfigMap());
        v1ConfigMapList.setItems(items);
        assertThat(v1ConfigMapList.getItems(), is(items));
        assertThat(v1ConfigMapList.getItems(), hasSize(1));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 1898697232AFC15F05146DA200F97E3A
    @Test
    void testAddItemsItem() {
        V1ConfigMap configMap = new V1ConfigMap();
        v1ConfigMapList.addItemsItem(configMap);
        assertThat(v1ConfigMapList.getItems(), hasSize(1));
        assertThat(v1ConfigMapList.getItems().get(0), is(configMap));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 1F3397D9864D21ED9B4E3ED6D6A4C555
    @Test
    void testGetKind() {
        assertThat(v1ConfigMapList.getKind(), is(nullValue()));
        v1ConfigMapList.setKind("ConfigMapList");
        assertThat(v1ConfigMapList.getKind(), is("ConfigMapList"));
    }

    //BaseRock generated method id: ${testSetKind}, hash: 4926247CE3B1EDF8036DE9CA9B992316
    @Test
    void testSetKind() {
        v1ConfigMapList.setKind("ConfigMapList");
        assertThat(v1ConfigMapList.getKind(), is("ConfigMapList"));
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 3BA4F363C261501DBE17754A212C5191
    @Test
    void testGetMetadata() {
        assertThat(v1ConfigMapList.getMetadata(), is(nullValue()));
        V1ListMeta metadata = new V1ListMeta();
        v1ConfigMapList.setMetadata(metadata);
        assertThat(v1ConfigMapList.getMetadata(), is(metadata));
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: ABF29CDA4407C6C8081B3971B6D10DC1
    @Test
    void testSetMetadata() {
        V1ListMeta metadata = new V1ListMeta();
        v1ConfigMapList.setMetadata(metadata);
        assertThat(v1ConfigMapList.getMetadata(), is(metadata));
    }

    //BaseRock generated method id: ${testEquals}, hash: 0E25541B95F495109B066DC7332DE343
    @Test
    void testEquals() {
        V1ConfigMapList list1 = new V1ConfigMapList().apiVersion("v1").kind("ConfigMapList").metadata(new V1ListMeta()).items(new ArrayList<>());
        V1ConfigMapList list2 = new V1ConfigMapList().apiVersion("v1").kind("ConfigMapList").metadata(new V1ListMeta()).items(new ArrayList<>());
        assertThat(list1.equals(list2), is(true));
        list2.setApiVersion("v2");
        assertThat(list1.equals(list2), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 46CA254EA81DF7383EE6CF1FE68F5BDF
    @Test
    void testHashCode() {
        V1ConfigMapList list1 = new V1ConfigMapList().apiVersion("v1").kind("ConfigMapList").metadata(new V1ListMeta()).items(new ArrayList<>());
        V1ConfigMapList list2 = new V1ConfigMapList().apiVersion("v1").kind("ConfigMapList").metadata(new V1ListMeta()).items(new ArrayList<>());
        assertThat(list1.hashCode(), is(equalTo(list2.hashCode())));
        list2.setApiVersion("v2");
        assertThat(list1.hashCode(), is(Matchers.not(equalTo(list2.hashCode()))));
    }

    //BaseRock generated method id: ${testToString}, hash: B305475CDF404D51DD9CABF8DE54429F
    @Test
    void testToString() {
        V1ConfigMapList list = new V1ConfigMapList().apiVersion("v1").kind("ConfigMapList").metadata(new V1ListMeta()).items(new ArrayList<>());
        String expectedString = "class V1ConfigMapList {\n" + "    apiVersion: v1\n" + "    items: []\n" + "    kind: ConfigMapList\n" + "    metadata: class V1ListMeta {\n" + "        _continue: null\n" + "        remainingItemCount: null\n" + "        resourceVersion: null\n" + "        selfLink: null\n" + "    }\n" + "}";
        assertThat(list.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 53A7D4BE86775819B72417E2C410EA44
    @Test
    void testValidateJsonElement() {
        String invalidJson = "{\"apiVersion\":\"v1\",\"kind\":\"ConfigMapList\",\"metadata\":{},\"items\":[{\"invalidField\":\"value\"}]}";
        assertThrows(IllegalArgumentException.class, () -> {
            V1ConfigMapList.validateJsonElement(com.google.gson.JsonParser.parseString(invalidJson));
        });
    }

    //BaseRock generated method id: ${testFromJson}, hash: 9CC9EC4262CFD6BD3EDD00803AE051F1
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"ConfigMapList\",\"metadata\":{},\"items\":[]}";
        V1ConfigMapList list = V1ConfigMapList.fromJson(json);
        assertThat(list, is(notNullValue()));
        assertThat(list.getApiVersion(), is("v1"));
        assertThat(list.getKind(), is("ConfigMapList"));
        assertThat(list.getMetadata(), is(notNullValue()));
        assertThat(list.getItems(), is(notNullValue()));
        assertThat(list.getItems(), hasSize(0));
    }

    //BaseRock generated method id: ${testToJson}, hash: 573D05D327F9AB7AE7C182D1AB82F1A7
    @Test
    void testToJson() {
        V1ConfigMapList list = new V1ConfigMapList().apiVersion("v1").kind("ConfigMapList").metadata(new V1ListMeta()).items(new ArrayList<>());
        String json = list.toJson();
        assertThat(json, is(notNullValue()));
        assertThat(json, Matchers.containsString("\"apiVersion\":\"v1\""));
        assertThat(json, Matchers.containsString("\"kind\":\"ConfigMapList\""));
        assertThat(json, Matchers.containsString("\"metadata\":{}"));
        assertThat(json, Matchers.containsString("\"items\":[]"));
    }
}
