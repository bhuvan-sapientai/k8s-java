package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.containsString;
import io.kubernetes.client.openapi.models.V1alpha1VolumeAttributesClass;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha1VolumeAttributesClassListBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 427B74FE6ABC21CB3833E5143CE694AC
    @Test
    void testConstructor() {
        V1alpha1VolumeAttributesClassList list = new V1alpha1VolumeAttributesClassList();
        assertNotNull(list);
        assertNotNull(list.getItems());
        assertEquals(0, list.getItems().size());
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 7B65709EF443BFE0F8015B4FD815CE76
    @Test
    void testApiVersion() {
        V1alpha1VolumeAttributesClassList list = new V1alpha1VolumeAttributesClassList();
        list.setApiVersion("v1alpha1");
        assertEquals("v1alpha1", list.getApiVersion());
    }

    //BaseRock generated method id: ${testApiVersionWithDifferentValues}, hash: 1BA6262269DECB188E0BDF11C6BB8222
    @ParameterizedTest
    @ValueSource(strings = { "v1", "v2", "v1beta1" })
    void testApiVersionWithDifferentValues(String version) {
        V1alpha1VolumeAttributesClassList list = new V1alpha1VolumeAttributesClassList();
        list.setApiVersion(version);
        assertEquals(version, list.getApiVersion());
    }

    //BaseRock generated method id: ${testApiVersionWithNullAndEmpty}, hash: 1EDDC71D7ADE443E430D309B838D4BD8
    @ParameterizedTest
    @NullAndEmptySource
    void testApiVersionWithNullAndEmpty(String version) {
        V1alpha1VolumeAttributesClassList list = new V1alpha1VolumeAttributesClassList();
        list.setApiVersion(version);
        assertEquals(version, list.getApiVersion());
    }

    //BaseRock generated method id: ${testItems}, hash: 829824DA45A878C04B7B5F890B876F0C
    @Test
    void testItems() {
        V1alpha1VolumeAttributesClassList list = new V1alpha1VolumeAttributesClassList();
        List<V1alpha1VolumeAttributesClass> items = new ArrayList<>();
        items.add(new V1alpha1VolumeAttributesClass());
        list.setItems(items);
        assertThat(list.getItems(), is(equalTo(items)));
        assertThat(list.getItems(), hasSize(1));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: E7B0B5A4E10D8ABEBFDE94511900661E
    @Test
    void testAddItemsItem() {
        V1alpha1VolumeAttributesClassList list = new V1alpha1VolumeAttributesClassList();
        V1alpha1VolumeAttributesClass item = new V1alpha1VolumeAttributesClass();
        list.addItemsItem(item);
        assertThat(list.getItems(), hasSize(1));
        assertThat(list.getItems().get(0), is(equalTo(item)));
    }

    //BaseRock generated method id: ${testKind}, hash: 0584D9A980FE26940249B2A08AD5E096
    @Test
    void testKind() {
        V1alpha1VolumeAttributesClassList list = new V1alpha1VolumeAttributesClassList();
        list.setKind("VolumeAttributesClassList");
        assertEquals("VolumeAttributesClassList", list.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 5C30FE78126A064267BE0FEE7A3AF228
    @Test
    void testMetadata() {
        V1alpha1VolumeAttributesClassList list = new V1alpha1VolumeAttributesClassList();
        V1ListMeta metadata = new V1ListMeta();
        list.setMetadata(metadata);
        assertThat(list.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testToString}, hash: 1BC98D0290EA566B1F2CA2AB20C4981F
    @Test
    void testToString() {
        V1alpha1VolumeAttributesClassList list = new V1alpha1VolumeAttributesClassList().apiVersion("v1alpha1").kind("VolumeAttributesClassList");
        String result = list.toString();
        assertThat(result, containsString("class V1alpha1VolumeAttributesClassList"));
        assertThat(result, containsString("apiVersion: v1alpha1"));
        assertThat(result, containsString("kind: VolumeAttributesClassList"));
    }

    //BaseRock generated method id: ${testHashCode}, hash: E718EA0D77BBC335EA7B6514C1756186
    @Test
    void testHashCode() {
        V1alpha1VolumeAttributesClassList list1 = new V1alpha1VolumeAttributesClassList().apiVersion("v1alpha1").kind("VolumeAttributesClassList");
        V1alpha1VolumeAttributesClassList list2 = new V1alpha1VolumeAttributesClassList().apiVersion("v1alpha1").kind("VolumeAttributesClassList");
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    //BaseRock generated method id: ${testEquals}, hash: 204047674771D7F706EFDB629DF0F933
    @Test
    void testEquals() {
        V1alpha1VolumeAttributesClassList list1 = new V1alpha1VolumeAttributesClassList().apiVersion("v1alpha1").kind("VolumeAttributesClassList");
        V1alpha1VolumeAttributesClassList list2 = new V1alpha1VolumeAttributesClassList().apiVersion("v1alpha1").kind("VolumeAttributesClassList");
        V1alpha1VolumeAttributesClassList list3 = new V1alpha1VolumeAttributesClassList().apiVersion("v1beta1").kind("VolumeAttributesClassList");
        assertThat(list1.equals(list2), is(true));
        assertThat(list1.equals(list3), is(false));
    }

    //BaseRock generated method id: ${testToJsonAndFromJson}, hash: EA2223DC0F982A6BE941C21DEB7FD7CE
    @Test
    void testToJsonAndFromJson() throws Exception {
        V1alpha1VolumeAttributesClassList originalList = new V1alpha1VolumeAttributesClassList().apiVersion("v1alpha1").kind("VolumeAttributesClassList");
        V1alpha1VolumeAttributesClass item = new V1alpha1VolumeAttributesClass().driverName("test-driver");
        originalList.addItemsItem(item);
        String json = originalList.toJson();
        assertThat(json, is(notNullValue()));
        V1alpha1VolumeAttributesClassList deserializedList = V1alpha1VolumeAttributesClassList.fromJson(json);
        assertThat(deserializedList, is(notNullValue()));
        assertEquals(originalList.getApiVersion(), deserializedList.getApiVersion());
        assertEquals(originalList.getKind(), deserializedList.getKind());
        assertThat(deserializedList.getItems(), hasSize(1));
        assertEquals(item.getDriverName(), deserializedList.getItems().get(0).getDriverName());
    }
}
