package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.V1ResourceQuota;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ResourceQuotaListBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 2FAC7D9A1E10D0B933CC067F7124D26A
    @Test
    void testConstructor() {
        V1ResourceQuotaList resourceQuotaList = new V1ResourceQuotaList();
        assertThat(resourceQuotaList, is(notNullValue()));
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 4287C4DF2DFECED7E5ADCA38574E8999
    @Test
    void testApiVersion() {
        V1ResourceQuotaList resourceQuotaList = new V1ResourceQuotaList();
        String apiVersion = "v1";
        resourceQuotaList.setApiVersion(apiVersion);
        assertThat(resourceQuotaList.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testApiVersionWithDifferentValues}, hash: 0EF707954C523193399FC230623FEE6B
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "v1", "v2" })
    void testApiVersionWithDifferentValues(String apiVersion) {
        V1ResourceQuotaList resourceQuotaList = new V1ResourceQuotaList();
        resourceQuotaList.setApiVersion(apiVersion);
        assertThat(resourceQuotaList.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testItems}, hash: A1C2C090C62E136EF6CE315AE0F6E219
    @Test
    void testItems() {
        V1ResourceQuotaList resourceQuotaList = new V1ResourceQuotaList();
        List<V1ResourceQuota> items = new ArrayList<>();
        items.add(new V1ResourceQuota());
        resourceQuotaList.setItems(items);
        assertThat(resourceQuotaList.getItems(), is(equalTo(items)));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 56ADB544CC77B31F42A3B8530FB2B569
    @Test
    void testAddItemsItem() {
        V1ResourceQuotaList resourceQuotaList = new V1ResourceQuotaList();
        V1ResourceQuota item = new V1ResourceQuota();
        resourceQuotaList.addItemsItem(item);
        assertThat(resourceQuotaList.getItems(), hasSize(1));
        assertThat(resourceQuotaList.getItems().get(0), is(equalTo(item)));
    }

    //BaseRock generated method id: ${testKind}, hash: F8C3328659EE88657A6D16DF69499BDD
    @Test
    void testKind() {
        V1ResourceQuotaList resourceQuotaList = new V1ResourceQuotaList();
        String kind = "ResourceQuotaList";
        resourceQuotaList.setKind(kind);
        assertThat(resourceQuotaList.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testKindWithDifferentValues}, hash: 24E5085A726A4AFFC26D1F3F6E44E2A6
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "ResourceQuotaList", "OtherKind" })
    void testKindWithDifferentValues(String kind) {
        V1ResourceQuotaList resourceQuotaList = new V1ResourceQuotaList();
        resourceQuotaList.setKind(kind);
        assertThat(resourceQuotaList.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testMetadata}, hash: 96F35955E8A0C4A44FFE5E81546A0AE7
    @Test
    void testMetadata() {
        V1ResourceQuotaList resourceQuotaList = new V1ResourceQuotaList();
        V1ListMeta metadata = new V1ListMeta();
        resourceQuotaList.setMetadata(metadata);
        assertThat(resourceQuotaList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 1C0A9CC4F410246AC033DD34EF51FC6F
    @Test
    void testEquals() {
        V1ResourceQuotaList list1 = new V1ResourceQuotaList().apiVersion("v1").kind("ResourceQuotaList").metadata(new V1ListMeta()).items(new ArrayList<>());
        V1ResourceQuotaList list2 = new V1ResourceQuotaList().apiVersion("v1").kind("ResourceQuotaList").metadata(new V1ListMeta()).items(new ArrayList<>());
        assertThat(list1, is(equalTo(list2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: D7D755576CDD6161E894E89FFE41CF0D
    @Test
    void testHashCode() {
        V1ResourceQuotaList list1 = new V1ResourceQuotaList().apiVersion("v1").kind("ResourceQuotaList").metadata(new V1ListMeta()).items(new ArrayList<>());
        V1ResourceQuotaList list2 = new V1ResourceQuotaList().apiVersion("v1").kind("ResourceQuotaList").metadata(new V1ListMeta()).items(new ArrayList<>());
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 64D9B2F82207F2200B96F781380FB84B
    @Test
    void testToString() {
        V1ResourceQuotaList resourceQuotaList = new V1ResourceQuotaList().apiVersion("v1").kind("ResourceQuotaList").metadata(new V1ListMeta()).items(new ArrayList<>());
        String expectedString = "class V1ResourceQuotaList {\n" + "    apiVersion: v1\n" + "    items: []\n" + "    kind: ResourceQuotaList\n" + "    metadata: class V1ListMeta {\n" + "        _continue: null\n" + "        remainingItemCount: null\n" + "        resourceVersion: null\n" + "        selfLink: null\n" + "    }\n" + "}";
        assertThat(resourceQuotaList.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testSetNullItems}, hash: 9CEC6DEDF59A00F164C81C0E05978C7D
    @Test
    void testSetNullItems() {
        V1ResourceQuotaList resourceQuotaList = new V1ResourceQuotaList();
        resourceQuotaList.setItems(null);
        assertThat(resourceQuotaList.getItems(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAddItemsItemToNullList}, hash: D1D2294B1AFC712C9E133B1E74561BB3
    @Test
    void testAddItemsItemToNullList() {
        V1ResourceQuotaList resourceQuotaList = new V1ResourceQuotaList();
        V1ResourceQuota item = new V1ResourceQuota();
        resourceQuotaList.addItemsItem(item);
        assertThat(resourceQuotaList.getItems(), hasSize(1));
        assertThat(resourceQuotaList.getItems().get(0), is(equalTo(item)));
    }

    //BaseRock generated method id: ${testSetNullMetadata}, hash: 0BF07F8D8614B30C50B2A14DDCC1DB30
    @Test
    void testSetNullMetadata() {
        V1ResourceQuotaList resourceQuotaList = new V1ResourceQuotaList();
        resourceQuotaList.setMetadata(null);
        assertThat(resourceQuotaList.getMetadata(), is(nullValue()));
    }
}
