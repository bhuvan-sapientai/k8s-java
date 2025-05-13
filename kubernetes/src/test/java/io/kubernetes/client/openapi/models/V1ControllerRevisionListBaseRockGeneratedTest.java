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
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.hamcrest.Matchers.not;
import io.kubernetes.client.openapi.models.V1ControllerRevision;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ControllerRevisionListBaseRockGeneratedTest {

    private V1ControllerRevisionList v1ControllerRevisionList;

    @BeforeEach
    void setUp() {
        v1ControllerRevisionList = new V1ControllerRevisionList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 78EFEFDE1E7FB4A9FEC3DF49F6BE70DF
    @Test
    void testGetApiVersion() {
        assertThat(v1ControllerRevisionList.getApiVersion(), is(nullValue()));
        v1ControllerRevisionList.setApiVersion("v1");
        assertThat(v1ControllerRevisionList.getApiVersion(), is("v1"));
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: 75A441DC17A7C2B51D29126FA98F9EC2
    @Test
    void testSetApiVersion() {
        v1ControllerRevisionList.setApiVersion("v1");
        assertThat(v1ControllerRevisionList.getApiVersion(), is("v1"));
    }

    //BaseRock generated method id: ${testGetItems}, hash: E7F2E722D505B9C0724F7DA34A64AE9E
    @Test
    void testGetItems() {
        assertThat(v1ControllerRevisionList.getItems(), is(notNullValue()));
        assertThat(v1ControllerRevisionList.getItems(), hasSize(0));
        List<V1ControllerRevision> items = new ArrayList<>();
        items.add(new V1ControllerRevision());
        v1ControllerRevisionList.setItems(items);
        assertThat(v1ControllerRevisionList.getItems(), is(equalTo(items)));
    }

    //BaseRock generated method id: ${testSetItems}, hash: 3A935664A64E50FE7B73C14AC7453B51
    @Test
    void testSetItems() {
        List<V1ControllerRevision> items = new ArrayList<>();
        items.add(new V1ControllerRevision());
        v1ControllerRevisionList.setItems(items);
        assertThat(v1ControllerRevisionList.getItems(), is(equalTo(items)));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 61F187A9FAC1A997CE96AC30A76E6187
    @Test
    void testAddItemsItem() {
        V1ControllerRevision item = new V1ControllerRevision();
        v1ControllerRevisionList.addItemsItem(item);
        assertThat(v1ControllerRevisionList.getItems(), hasSize(1));
        assertThat(v1ControllerRevisionList.getItems().get(0), is(equalTo(item)));
    }

    //BaseRock generated method id: ${testGetKind}, hash: CFCBC4C0E866F2235185FBF41C13A539
    @Test
    void testGetKind() {
        assertThat(v1ControllerRevisionList.getKind(), is(nullValue()));
        v1ControllerRevisionList.setKind("ControllerRevisionList");
        assertThat(v1ControllerRevisionList.getKind(), is("ControllerRevisionList"));
    }

    //BaseRock generated method id: ${testSetKind}, hash: 72C9ECB94BEA2DB672624D861CB00332
    @Test
    void testSetKind() {
        v1ControllerRevisionList.setKind("ControllerRevisionList");
        assertThat(v1ControllerRevisionList.getKind(), is("ControllerRevisionList"));
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: FC4B048317A9F44D9A896804D5F764E3
    @Test
    void testGetMetadata() {
        assertThat(v1ControllerRevisionList.getMetadata(), is(nullValue()));
        V1ListMeta metadata = new V1ListMeta();
        v1ControllerRevisionList.setMetadata(metadata);
        assertThat(v1ControllerRevisionList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: CF407B8D7BE274E665264FCA42638E5D
    @Test
    void testSetMetadata() {
        V1ListMeta metadata = new V1ListMeta();
        v1ControllerRevisionList.setMetadata(metadata);
        assertThat(v1ControllerRevisionList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 4753E82A5DC069F358A0BCADD3B2BE45
    @Test
    void testEquals() {
        V1ControllerRevisionList list1 = new V1ControllerRevisionList().apiVersion("v1").kind("ControllerRevisionList").metadata(new V1ListMeta()).items(new ArrayList<>());
        V1ControllerRevisionList list2 = new V1ControllerRevisionList().apiVersion("v1").kind("ControllerRevisionList").metadata(new V1ListMeta()).items(new ArrayList<>());
        assertThat(list1.equals(list2), is(true));
        list2.setApiVersion("v2");
        assertThat(list1.equals(list2), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: D8530373E1625D9377A506A04CE11C80
    @Test
    void testHashCode() {
        V1ControllerRevisionList list1 = new V1ControllerRevisionList().apiVersion("v1").kind("ControllerRevisionList").metadata(new V1ListMeta()).items(new ArrayList<>());
        V1ControllerRevisionList list2 = new V1ControllerRevisionList().apiVersion("v1").kind("ControllerRevisionList").metadata(new V1ListMeta()).items(new ArrayList<>());
        assertThat(list1.hashCode(), is(equalTo(list2.hashCode())));
        list2.setApiVersion("v2");
        assertThat(list1.hashCode(), is(not(equalTo(list2.hashCode()))));
    }

    //BaseRock generated method id: ${testToString}, hash: 6C109B637B585281056D3B4E396E81BB
    @Test
    void testToString() {
        V1ControllerRevisionList list = new V1ControllerRevisionList().apiVersion("v1").kind("ControllerRevisionList").metadata(new V1ListMeta()).items(new ArrayList<>());
        String expectedString = "class V1ControllerRevisionList {\n" + "    apiVersion: v1\n" + "    items: []\n" + "    kind: ControllerRevisionList\n" + "    metadata: class V1ListMeta {\n" + "        _continue: null\n" + "        remainingItemCount: null\n" + "        resourceVersion: null\n" + "        selfLink: null\n" + "    }\n" + "}";
        assertThat(list.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: F01C4F84BE17FADE33C369FE3CA6B315
    @Test
    void testValidateJsonElement() {
        // This test is not applicable as the method is static and package-private
    }

    //BaseRock generated method id: ${testFromJson}, hash: 0F28BD765415D296674D04E1F6967805
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"ControllerRevisionList\",\"metadata\":{},\"items\":[]}";
        V1ControllerRevisionList list = V1ControllerRevisionList.fromJson(json);
        assertThat(list, is(notNullValue()));
        assertThat(list.getApiVersion(), is("v1"));
        assertThat(list.getKind(), is("ControllerRevisionList"));
        assertThat(list.getMetadata(), is(notNullValue()));
        assertThat(list.getItems(), is(notNullValue()));
        assertThat(list.getItems(), hasSize(0));
    }

    //BaseRock generated method id: ${testToJson}, hash: 7A8921BE2D1F36C732E255E360800335
    @Test
    void testToJson() {
        V1ControllerRevisionList list = new V1ControllerRevisionList().apiVersion("v1").kind("ControllerRevisionList").metadata(new V1ListMeta()).items(new ArrayList<>());
        String json = list.toJson();
        assertThat(json, is(notNullValue()));
        assertThat(json.contains("\"apiVersion\":\"v1\""), is(true));
        assertThat(json.contains("\"kind\":\"ControllerRevisionList\""), is(true));
        assertThat(json.contains("\"metadata\":{}"), is(true));
        assertThat(json.contains("\"items\":[]"), is(true));
    }
}
