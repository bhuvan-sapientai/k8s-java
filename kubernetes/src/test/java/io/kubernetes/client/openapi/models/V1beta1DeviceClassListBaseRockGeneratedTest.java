package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1beta1DeviceClass;
import static org.hamcrest.Matchers.containsInAnyOrder;
import java.util.Arrays;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.common.KubernetesListObject;
import java.util.ArrayList;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1DeviceClassListBaseRockGeneratedTest {

    private V1beta1DeviceClassList deviceClassList;

    @BeforeEach
    void setUp() {
        deviceClassList = new V1beta1DeviceClassList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 1A456C29E4DB086D62CE847DEF432306
    @Test
    void testGetApiVersion() {
        assertThat(deviceClassList.getApiVersion(), is(nullValue()));
        String apiVersion = "v1beta1";
        deviceClassList.setApiVersion(apiVersion);
        assertThat(deviceClassList.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testGetItems}, hash: FA3667643BABD9AE4B2D7DF13644CF19
    @Test
    void testGetItems() {
        assertThat(deviceClassList.getItems(), is(notNullValue()));
        assertThat(deviceClassList.getItems(), hasSize(0));
        List<V1beta1DeviceClass> items = new ArrayList<>();
        V1beta1DeviceClass item1 = new V1beta1DeviceClass();
        V1beta1DeviceClass item2 = new V1beta1DeviceClass();
        items.add(item1);
        items.add(item2);
        deviceClassList.setItems(items);
        assertThat(deviceClassList.getItems(), hasSize(2));
        assertThat(deviceClassList.getItems(), containsInAnyOrder(item1, item2));
    }

    //BaseRock generated method id: ${testGetKind}, hash: E6184AD024ED56DEF15DF82CBB75A5E5
    @Test
    void testGetKind() {
        assertThat(deviceClassList.getKind(), is(nullValue()));
        String kind = "DeviceClassList";
        deviceClassList.setKind(kind);
        assertThat(deviceClassList.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 374F70DF1E600C069F5B0697C5733542
    @Test
    void testGetMetadata() {
        assertThat(deviceClassList.getMetadata(), is(nullValue()));
        V1ListMeta metadata = new V1ListMeta();
        deviceClassList.setMetadata(metadata);
        assertThat(deviceClassList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 084D564471319E71A4C187847BF07B24
    @Test
    void testEquals() {
        V1beta1DeviceClassList list1 = new V1beta1DeviceClassList();
        V1beta1DeviceClassList list2 = new V1beta1DeviceClassList();
        assertTrue(list1.equals(list2));
        assertTrue(list2.equals(list1));
        list1.setApiVersion("v1beta1");
        assertFalse(list1.equals(list2));
        assertFalse(list2.equals(list1));
        list2.setApiVersion("v1beta1");
        assertTrue(list1.equals(list2));
        assertTrue(list2.equals(list1));
    }

    //BaseRock generated method id: ${testHashCode}, hash: B64C5A20158C4B7258BF1BE480CA609B
    @Test
    void testHashCode() {
        V1beta1DeviceClassList list1 = new V1beta1DeviceClassList();
        V1beta1DeviceClassList list2 = new V1beta1DeviceClassList();
        assertEquals(list1.hashCode(), list2.hashCode());
        list1.setApiVersion("v1beta1");
        assertNotEquals(list1.hashCode(), list2.hashCode());
        list2.setApiVersion("v1beta1");
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: F560E012D97B70FB3FAAAA589D137D22
    @Test
    void testToString() {
        V1beta1DeviceClassList list = new V1beta1DeviceClassList();
        list.setApiVersion("v1beta1");
        list.setKind("DeviceClassList");
        list.setItems(Arrays.asList(new V1beta1DeviceClass(), new V1beta1DeviceClass()));
        V1ListMeta metadata = new V1ListMeta();
        metadata.setContinue("continue");
        list.setMetadata(metadata);
        String expected = "class V1beta1DeviceClassList {\n" + "    apiVersion: v1beta1\n" + "    items: [class V1beta1DeviceClass {\n" + "        apiVersion: null\n" + "        kind: null\n" + "        metadata: null\n" + "        spec: null\n" + "    }, class V1beta1DeviceClass {\n" + "        apiVersion: null\n" + "        kind: null\n" + "        metadata: null\n" + "        spec: null\n" + "    }]\n" + "    kind: DeviceClassList\n" + "    metadata: class V1ListMeta {\n" + "        _continue: continue\n" + "        remainingItemCount: null\n" + "        resourceVersion: null\n" + "        selfLink: null\n" + "    }\n" + "}";
        assertEquals(expected, list.toString());
    }

    //BaseRock generated method id: ${testImplementsKubernetesListObject}, hash: 32FA8FC96EF18AD6E952A1180572A9F8
    @Test
    void testImplementsKubernetesListObject() {
        assertTrue(deviceClassList instanceof KubernetesListObject);
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 370E6DA9D24C0C0E2A505025D4E3E4D0
    @Test
    void testAddItemsItem() {
        V1beta1DeviceClass item = new V1beta1DeviceClass();
        deviceClassList.addItemsItem(item);
        assertThat(deviceClassList.getItems(), hasSize(1));
        assertThat(deviceClassList.getItems().get(0), is(equalTo(item)));
    }
}
