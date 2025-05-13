package io.kubernetes.client.openapi.models;

import com.google.gson.Gson;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.openapi.models.V1Pod;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import static org.hamcrest.Matchers.containsInAnyOrder;
import java.io.IOException;
import java.util.Arrays;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import io.kubernetes.client.common.KubernetesListObject;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.openapi.JSON;
import com.google.gson.JsonArray;
import org.junit.jupiter.params.provider.NullSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
public class V1PodListBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1PodListDefaultConstructor}, hash: 062FB18EB8F64378F819183A21B26E2C
    @Test
    public void testV1PodListDefaultConstructor() {
        V1PodList podList = new V1PodList();
        assertThat(podList, is(notNullValue()));
        assertThat(podList.getApiVersion(), is(nullValue()));
        assertThat(podList.getKind(), is(nullValue()));
        assertThat(podList.getMetadata(), is(nullValue()));
        assertThat(podList.getItems(), is(notNullValue()));
        assertThat(podList.getItems(), hasSize(0));
    }

    //BaseRock generated method id: ${testApiVersionGetterAndSetter}, hash: D1134AA530C00360E9D9DDBEEA9BA08D
    @Test
    public void testApiVersionGetterAndSetter() {
        V1PodList podList = new V1PodList();
        String apiVersion = "v1";
        podList.setApiVersion(apiVersion);
        assertThat(podList.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testApiVersionFluentSetter}, hash: 475DA72B7E1CA13959BA45B63E205D42
    @Test
    public void testApiVersionFluentSetter() {
        String apiVersion = "v1";
        V1PodList podList = new V1PodList().apiVersion(apiVersion);
        assertThat(podList.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testApiVersionWithVariousValues}, hash: 35B145BFCEF781CC9EEA8BE303660134
    @ParameterizedTest
    @NullSource
    @ValueSource(strings = { "v1", "v2", "apps/v1" })
    public void testApiVersionWithVariousValues(String apiVersion) {
        V1PodList podList = new V1PodList();
        podList.setApiVersion(apiVersion);
        assertThat(podList.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testItemsGetterAndSetter}, hash: 7F30D894C085672C1C1A4CDFC2F0ABFB
    @Test
    public void testItemsGetterAndSetter() {
        V1PodList podList = new V1PodList();
        List<V1Pod> items = new ArrayList<>();
        items.add(new V1Pod());
        items.add(new V1Pod());
        podList.setItems(items);
        assertThat(podList.getItems(), is(equalTo(items)));
        assertThat(podList.getItems(), hasSize(2));
    }

    //BaseRock generated method id: ${testItemsFluentSetter}, hash: F3BFDF0629D5D49E670B4C9C48FA671C
    @Test
    public void testItemsFluentSetter() {
        List<V1Pod> items = new ArrayList<>();
        items.add(new V1Pod());
        items.add(new V1Pod());
        V1PodList podList = new V1PodList().items(items);
        assertThat(podList.getItems(), is(equalTo(items)));
        assertThat(podList.getItems(), hasSize(2));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 3451C73EBEB0F971C41586DF99EDF3D3
    @Test
    public void testAddItemsItem() {
        V1PodList podList = new V1PodList();
        V1Pod pod1 = new V1Pod();
        V1Pod pod2 = new V1Pod();
        podList.addItemsItem(pod1);
        podList.addItemsItem(pod2);
        assertThat(podList.getItems(), hasSize(2));
        assertThat(podList.getItems(), contains(pod1, pod2));
    }

    //BaseRock generated method id: ${testAddItemsItemWhenItemsIsNull}, hash: C109FC0C3C86742471332B39093339FC
    @Test
    public void testAddItemsItemWhenItemsIsNull() {
        V1PodList podList = new V1PodList();
        podList.setItems(null);
        V1Pod pod = new V1Pod();
        podList.addItemsItem(pod);
        assertThat(podList.getItems(), hasSize(1));
        assertThat(podList.getItems(), contains(pod));
    }

    //BaseRock generated method id: ${testKindGetterAndSetter}, hash: C0B34253A4436E8F767C5F66CD7A8509
    @Test
    public void testKindGetterAndSetter() {
        V1PodList podList = new V1PodList();
        String kind = "PodList";
        podList.setKind(kind);
        assertThat(podList.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testKindFluentSetter}, hash: 38FDDF8FADE2FCD09678D7DA92894AB1
    @Test
    public void testKindFluentSetter() {
        String kind = "PodList";
        V1PodList podList = new V1PodList().kind(kind);
        assertThat(podList.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testKindWithVariousValues}, hash: 2837C72A243FD7585CA8B6EE7537801D
    @ParameterizedTest
    @NullSource
    @ValueSource(strings = { "PodList", "NodeList", "ServiceList" })
    public void testKindWithVariousValues(String kind) {
        V1PodList podList = new V1PodList();
        podList.setKind(kind);
        assertThat(podList.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testMetadataGetterAndSetter}, hash: F81B9D326325BA55DE19BE8BFA53868E
    @Test
    public void testMetadataGetterAndSetter() {
        V1PodList podList = new V1PodList();
        V1ListMeta metadata = new V1ListMeta();
        podList.setMetadata(metadata);
        assertThat(podList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testMetadataFluentSetter}, hash: A35682A4265ADEEA016F90B6B8B8F474
    @Test
    public void testMetadataFluentSetter() {
        V1ListMeta metadata = new V1ListMeta();
        V1PodList podList = new V1PodList().metadata(metadata);
        assertThat(podList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 2DE3D4729ADF070E6E1571204C3C9CDC
    @Test
    public void testEquals() {
        V1PodList podList1 = new V1PodList().apiVersion("v1").kind("PodList").metadata(new V1ListMeta());
        V1PodList podList2 = new V1PodList().apiVersion("v1").kind("PodList").metadata(new V1ListMeta());
        // Same instance
        assertTrue(podList1.equals(podList1));
        // Equal objects
        assertTrue(podList1.equals(podList2));
        // Null comparison
        assertFalse(podList1.equals(null));
        // Different class
        assertFalse(podList1.equals(new Object()));
        // Different apiVersion
        V1PodList podList3 = new V1PodList().apiVersion("v2").kind("PodList").metadata(new V1ListMeta());
        assertFalse(podList1.equals(podList3));
        // Different kind
        V1PodList podList4 = new V1PodList().apiVersion("v1").kind("DifferentKind").metadata(new V1ListMeta());
        assertFalse(podList1.equals(podList4));
        // Different items
        List<V1Pod> items = new ArrayList<>();
        items.add(new V1Pod());
        V1PodList podList5 = new V1PodList().apiVersion("v1").kind("PodList").metadata(new V1ListMeta()).items(items);
        assertFalse(podList1.equals(podList5));
        // Different metadata
        V1PodList podList6 = new V1PodList().apiVersion("v1").kind("PodList");
        assertFalse(podList1.equals(podList6));
    }

    //BaseRock generated method id: ${testHashCode}, hash: E1B1F7E9D8AD06F82B8C89BBEAD7ECCE
    @Test
    public void testHashCode() {
        V1PodList podList1 = new V1PodList().apiVersion("v1").kind("PodList").metadata(new V1ListMeta());
        V1PodList podList2 = new V1PodList().apiVersion("v1").kind("PodList").metadata(new V1ListMeta());
        // Equal objects should have the same hashCode
        assertEquals(podList1.hashCode(), podList2.hashCode());
        // Different objects should have different hashCodes
        V1PodList podList3 = new V1PodList().apiVersion("v2").kind("PodList").metadata(new V1ListMeta());
        assertNotEquals(podList1.hashCode(), podList3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 33A3050352B90A0BC5B78192AA31252B
    @Test
    public void testToString() {
        V1PodList podList = new V1PodList().apiVersion("v1").kind("PodList").metadata(new V1ListMeta());
        String toString = podList.toString();
        assertThat(toString, is(notNullValue()));
        assertTrue(toString.contains("apiVersion: v1"));
        assertTrue(toString.contains("kind: PodList"));
        assertTrue(toString.contains("metadata:"));
        assertTrue(toString.contains("items:"));
    }

    //BaseRock generated method id: ${testToIndentedString}, hash: 30AB3A3558C06560652BAEEAB337ED64
    @Test
    public void testToIndentedString() {
        V1PodList podList = new V1PodList();
        // Test with non-null value
        String indentedString = podList.toString();
        assertThat(indentedString, is(notNullValue()));
        // Test with null value (implicitly testing toIndentedString via toString)
        podList.setApiVersion(null);
        String indentedStringWithNull = podList.toString();
        assertThat(indentedStringWithNull, is(notNullValue()));
        assertTrue(indentedStringWithNull.contains("apiVersion: null"));
    }

    //BaseRock generated method id: ${testImplementsKubernetesListObject}, hash: 88B19FB34135F38A21BEC0CD47E9771E
    @Test
    public void testImplementsKubernetesListObject() {
        V1PodList podList = new V1PodList();
        assertTrue(podList instanceof KubernetesListObject);
    }

    //BaseRock generated method id: ${testValidateJsonElementValid}, hash: 1178999C9472EBA9F660E78D301A148A
    @Test
    public void testValidateJsonElementValid() throws IOException {
        // Creating a valid JsonObject
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiVersion", "v1");
        jsonObject.addProperty("kind", "PodList");
        JsonArray items = new JsonArray();
        JsonObject podJson = new JsonObject();
        items.add(podJson);
        jsonObject.add("items", items);
        JsonObject metadataJson = new JsonObject();
        jsonObject.add("metadata", metadataJson);
        // This should not throw an exception
        V1PodList.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testValidateJsonElementNullWithRequiredFields}, hash: 4411B9848BDC0713C4EA54A7B83B96EA
    @Test
    public void testValidateJsonElementNullWithRequiredFields() {
        JsonElement jsonElement = null;
        // This should throw an exception since 'items' is required
        assertThrows(IllegalArgumentException.class, () -> {
            V1PodList.validateJsonElement(jsonElement);
        });
    }

    //BaseRock generated method id: ${testValidateJsonElementMissingRequiredField}, hash: D4EA41E67CE2BB65178DC3EE6AEFE434
    @Test
    public void testValidateJsonElementMissingRequiredField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiVersion", "v1");
        jsonObject.addProperty("kind", "PodList");
        // Missing required 'items' field
        assertThrows(IllegalArgumentException.class, () -> {
            V1PodList.validateJsonElement(jsonObject);
        });
    }

    //BaseRock generated method id: ${testValidateJsonElementUnknownField}, hash: 13D8B727AD3F4635EDD4098C3B61068F
    @Test
    public void testValidateJsonElementUnknownField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiVersion", "v1");
        jsonObject.addProperty("kind", "PodList");
        JsonArray items = new JsonArray();
        JsonObject podJson = new JsonObject();
        items.add(podJson);
        jsonObject.add("items", items);
        // Adding unknown field
        jsonObject.addProperty("unknownField", "value");
        assertThrows(IllegalArgumentException.class, () -> {
            V1PodList.validateJsonElement(jsonObject);
        });
    }

    //BaseRock generated method id: ${testValidateJsonElementInvalidApiVersionType}, hash: B26D05B00E76337291657DADF4863756
    @Test
    public void testValidateJsonElementInvalidApiVersionType() {
        JsonObject jsonObject = new JsonObject();
        // Not a primitive
        jsonObject.add("apiVersion", new JsonObject());
        jsonObject.addProperty("kind", "PodList");
        JsonArray items = new JsonArray();
        JsonObject podJson = new JsonObject();
        items.add(podJson);
        jsonObject.add("items", items);
        assertThrows(IllegalArgumentException.class, () -> {
            V1PodList.validateJsonElement(jsonObject);
        });
    }

    //BaseRock generated method id: ${testValidateJsonElementInvalidKindType}, hash: 1AE6526348BFD06B6F10BA010CF5F206
    @Test
    public void testValidateJsonElementInvalidKindType() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiVersion", "v1");
        // Not a primitive
        jsonObject.add("kind", new JsonObject());
        JsonArray items = new JsonArray();
        JsonObject podJson = new JsonObject();
        items.add(podJson);
        jsonObject.add("items", items);
        assertThrows(IllegalArgumentException.class, () -> {
            V1PodList.validateJsonElement(jsonObject);
        });
    }

    //BaseRock generated method id: ${testValidateJsonElementInvalidItemsType}, hash: 5DAECD8E87B107D2BBC003430459F94F
    @Test
    public void testValidateJsonElementInvalidItemsType() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiVersion", "v1");
        jsonObject.addProperty("kind", "PodList");
        // 'items' should be an array, not an object
        jsonObject.add("items", new JsonObject());
        assertThrows(IllegalArgumentException.class, () -> {
            V1PodList.validateJsonElement(jsonObject);
        });
    }

    //BaseRock generated method id: ${testFromJson}, hash: E5D4F32128860E44A0BE5D29CC57C408
    @Test
    public void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"PodList\",\"items\":[{}]}";
        V1PodList podList = V1PodList.fromJson(json);
        assertThat(podList, is(notNullValue()));
        assertThat(podList.getApiVersion(), is(equalTo("v1")));
        assertThat(podList.getKind(), is(equalTo("PodList")));
        assertThat(podList.getItems(), hasSize(1));
    }

    //BaseRock generated method id: ${testToJson}, hash: 6EF73908C74FFE96252D07C09897C6D0
    @Test
    public void testToJson() {
        V1PodList podList = new V1PodList().apiVersion("v1").kind("PodList");
        List<V1Pod> pods = new ArrayList<>();
        pods.add(new V1Pod());
        podList.setItems(pods);
        String json = podList.toJson();
        assertThat(json, is(notNullValue()));
        assertTrue(json.contains("\"apiVersion\":\"v1\""));
        assertTrue(json.contains("\"kind\":\"PodList\""));
        assertTrue(json.contains("\"items\":[{"));
    }

    //BaseRock generated method id: ${testOpenapiFields}, hash: EA105D6E277A786FCC2FB21E7DB808BF
    @Test
    public void testOpenapiFields() {
        // Verify that openapiFields contains all expected fields
        assertTrue(V1PodList.openapiFields.contains("apiVersion"));
        assertTrue(V1PodList.openapiFields.contains("items"));
        assertTrue(V1PodList.openapiFields.contains("kind"));
        assertTrue(V1PodList.openapiFields.contains("metadata"));
        // Verify size (should match number of fields)
        assertEquals(4, V1PodList.openapiFields.size());
    }

    //BaseRock generated method id: ${testOpenapiRequiredFields}, hash: 1C8D3277B48A7C4A9462765F27C4A5AD
    @Test
    public void testOpenapiRequiredFields() {
        // Verify that openapiRequiredFields contains only required fields
        assertTrue(V1PodList.openapiRequiredFields.contains("items"));
        // Verify size (should match number of required fields)
        assertEquals(1, V1PodList.openapiRequiredFields.size());
    }
}
