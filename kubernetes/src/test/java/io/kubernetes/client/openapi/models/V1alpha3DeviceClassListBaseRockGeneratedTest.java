package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1alpha3DeviceClass;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha3DeviceClassListBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 52ABA70CD1DD341D34BD1C162C1DFEA6
    @Test
    void testConstructor() {
        V1alpha3DeviceClassList deviceClassList = new V1alpha3DeviceClassList();
        assertNotNull(deviceClassList);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: DD7847F312C73EFA842F6014E25C99E7
    @Test
    void testApiVersion() {
        V1alpha3DeviceClassList deviceClassList = new V1alpha3DeviceClassList();
        String apiVersion = "v1alpha3";
        deviceClassList.setApiVersion(apiVersion);
        assertEquals(apiVersion, deviceClassList.getApiVersion());
    }

    //BaseRock generated method id: ${testItems}, hash: 297E244BC2E4018D73D6E3D37FBABA3C
    @Test
    void testItems() {
        V1alpha3DeviceClassList deviceClassList = new V1alpha3DeviceClassList();
        List<V1alpha3DeviceClass> items = new ArrayList<>();
        items.add(mock(V1alpha3DeviceClass.class));
        items.add(mock(V1alpha3DeviceClass.class));
        deviceClassList.setItems(items);
        assertThat(deviceClassList.getItems(), is(equalTo(items)));
        assertThat(deviceClassList.getItems(), hasSize(2));
    }

    //BaseRock generated method id: ${testKind}, hash: F6A4B83D1F346B44A7342F34ED73F05F
    @Test
    void testKind() {
        V1alpha3DeviceClassList deviceClassList = new V1alpha3DeviceClassList();
        String kind = "DeviceClassList";
        deviceClassList.setKind(kind);
        assertEquals(kind, deviceClassList.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 9ADBE9E37A6156E083176E700F047F21
    @Test
    void testMetadata() {
        V1alpha3DeviceClassList deviceClassList = new V1alpha3DeviceClassList();
        V1ListMeta metadata = mock(V1ListMeta.class);
        deviceClassList.setMetadata(metadata);
        assertThat(deviceClassList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 97D8F1CFFB3031D4FB2BA0B5717E5357
    @Test
    void testEquals() {
        V1alpha3DeviceClassList list1 = new V1alpha3DeviceClassList();
        V1alpha3DeviceClassList list2 = new V1alpha3DeviceClassList();
        list1.setApiVersion("v1alpha3");
        list2.setApiVersion("v1alpha3");
        list1.setKind("DeviceClassList");
        list2.setKind("DeviceClassList");
        V1ListMeta metadata = mock(V1ListMeta.class);
        list1.setMetadata(metadata);
        list2.setMetadata(metadata);
        List<V1alpha3DeviceClass> items = new ArrayList<>();
        items.add(mock(V1alpha3DeviceClass.class));
        list1.setItems(items);
        list2.setItems(items);
        assertThat(list1, is(equalTo(list2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 8B644C2EC8149FC725CF8B1F5C508FB2
    @Test
    void testHashCode() {
        V1alpha3DeviceClassList list = new V1alpha3DeviceClassList();
        list.setApiVersion("v1alpha3");
        list.setKind("DeviceClassList");
        V1ListMeta metadata = mock(V1ListMeta.class);
        list.setMetadata(metadata);
        List<V1alpha3DeviceClass> items = new ArrayList<>();
        items.add(mock(V1alpha3DeviceClass.class));
        list.setItems(items);
        int hashCode = list.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 06DBB26B60E9D41879F97BB9FA1E86AC
    @Test
    void testToString() {
        V1alpha3DeviceClassList list = new V1alpha3DeviceClassList();
        list.setApiVersion("v1alpha3");
        list.setKind("DeviceClassList");
        V1ListMeta metadata = mock(V1ListMeta.class);
        when(metadata.toString()).thenReturn("MetadataString");
        list.setMetadata(metadata);
        List<V1alpha3DeviceClass> items = new ArrayList<>();
        V1alpha3DeviceClass deviceClass = mock(V1alpha3DeviceClass.class);
        when(deviceClass.toString()).thenReturn("DeviceClassString");
        items.add(deviceClass);
        list.setItems(items);
        String toString = list.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("items"), is(true));
    }
}
