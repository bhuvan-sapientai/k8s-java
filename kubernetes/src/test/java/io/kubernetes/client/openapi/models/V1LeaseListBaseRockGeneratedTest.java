package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1Lease;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import com.google.gson.JsonElement;
import static org.hamcrest.Matchers.containsInAnyOrder;
import java.io.IOException;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1LeaseListBaseRockGeneratedTest {

    private V1LeaseList v1LeaseList;

    @BeforeEach
    void setUp() {
        v1LeaseList = new V1LeaseList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 5FC4B3899B063AF1FA8B3019562557F1
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1";
        v1LeaseList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1LeaseList.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: 145999FC56951D55BEC327D13D4C9620
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "v1", "v2", "beta" })
    void testSetApiVersion(String apiVersion) {
        v1LeaseList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1LeaseList.getApiVersion());
    }

    //BaseRock generated method id: ${testGetItems}, hash: 38925029EA2D35FDD59B7AF51C4DB446
    @Test
    void testGetItems() {
        List<V1Lease> items = new ArrayList<>();
        items.add(new V1Lease());
        items.add(new V1Lease());
        v1LeaseList.setItems(items);
        assertThat(v1LeaseList.getItems(), is(equalTo(items)));
        assertThat(v1LeaseList.getItems(), hasSize(2));
    }

    //BaseRock generated method id: ${testSetItems}, hash: 9BAB429FDF067430A1D8DB2AB46942DA
    @Test
    void testSetItems() {
        List<V1Lease> items = new ArrayList<>();
        items.add(new V1Lease());
        v1LeaseList.setItems(items);
        assertThat(v1LeaseList.getItems(), is(equalTo(items)));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: EA8CB4CA738F01B6221CC6F35BC918D6
    @Test
    void testAddItemsItem() {
        V1Lease lease1 = new V1Lease();
        V1Lease lease2 = new V1Lease();
        v1LeaseList.addItemsItem(lease1);
        v1LeaseList.addItemsItem(lease2);
        assertThat(v1LeaseList.getItems(), containsInAnyOrder(lease1, lease2));
    }

    //BaseRock generated method id: ${testGetKind}, hash: BC0921678E605F9CCD3B7E81AEE884DC
    @Test
    void testGetKind() {
        String kind = "LeaseList";
        v1LeaseList.setKind(kind);
        assertEquals(kind, v1LeaseList.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: B70E4A4AE8B5F709CFBE4B9382EE4FC4
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "LeaseList", "CustomKind" })
    void testSetKind(String kind) {
        v1LeaseList.setKind(kind);
        assertEquals(kind, v1LeaseList.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 6641D068571223D18E14B56D816B6B87
    @Test
    void testGetMetadata() {
        V1ListMeta metadata = new V1ListMeta();
        v1LeaseList.setMetadata(metadata);
        assertThat(v1LeaseList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: 6E69D7101AF32D94D652C2A797935678
    @Test
    void testSetMetadata() {
        V1ListMeta metadata = new V1ListMeta();
        v1LeaseList.setMetadata(metadata);
        assertThat(v1LeaseList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 52CAF0D6262DDB248CFD3BC4CEBB932D
    @Test
    void testEquals() {
        V1LeaseList list1 = new V1LeaseList().apiVersion("v1").kind("LeaseList").metadata(new V1ListMeta()).items(new ArrayList<>());
        V1LeaseList list2 = new V1LeaseList().apiVersion("v1").kind("LeaseList").metadata(new V1ListMeta()).items(new ArrayList<>());
        assertThat(list1, is(equalTo(list2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 549A694929CF2418923C13B48F1DA1D7
    @Test
    void testHashCode() {
        V1LeaseList list1 = new V1LeaseList().apiVersion("v1").kind("LeaseList").metadata(new V1ListMeta()).items(new ArrayList<>());
        V1LeaseList list2 = new V1LeaseList().apiVersion("v1").kind("LeaseList").metadata(new V1ListMeta()).items(new ArrayList<>());
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 754624967600310E67842634A747F080
    @Test
    void testToString() {
        V1LeaseList list = new V1LeaseList().apiVersion("v1").kind("LeaseList").metadata(new V1ListMeta()).items(new ArrayList<>());
        String toString = list.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("items"), is(true));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 199D574C8074E51FA1683767E614CDAA
    @Test
    void testValidateJsonElement() {
        assertThrows(IllegalArgumentException.class, () -> V1LeaseList.validateJsonElement(null));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 1353263278502E93298CBCDC63720123
    @Test
    void testFromJson() {
        assertThrows(IllegalArgumentException.class, () -> V1LeaseList.fromJson("{}"));
    }

    //BaseRock generated method id: ${testToJson}, hash: 3930B2FAE44A689D5B2DC7EDAEB9448D
    @Test
    void testToJson() {
        V1LeaseList list = new V1LeaseList().apiVersion("v1").kind("LeaseList").metadata(new V1ListMeta()).items(new ArrayList<>());
        String json = list.toJson();
        assertThat(json, notNullValue());
        assertThat(json.contains("apiVersion"), is(true));
        assertThat(json.contains("kind"), is(true));
        assertThat(json.contains("metadata"), is(true));
        assertThat(json.contains("items"), is(true));
    }
}
