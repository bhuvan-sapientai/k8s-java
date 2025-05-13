package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1ConfigMapVolumeSource;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.containsInAnyOrder;
import io.kubernetes.client.openapi.models.V1KeyToPath;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ConfigMapVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1ConfigMapVolumeSourceConstructor}, hash: C26F420384BBB82CA619EF81D3A1CDB2
    @Test
    void testV1ConfigMapVolumeSourceConstructor() {
        V1ConfigMapVolumeSource volumeSource = new V1ConfigMapVolumeSource();
        assertThat(volumeSource, is(notNullValue()));
    }

    //BaseRock generated method id: ${testDefaultMode}, hash: 139C6E99104982C359768A6DF13A27BD
    @Test
    void testDefaultMode() {
        V1ConfigMapVolumeSource volumeSource = new V1ConfigMapVolumeSource();
        volumeSource.setDefaultMode(420);
        assertThat(volumeSource.getDefaultMode(), is(equalTo(420)));
    }

    //BaseRock generated method id: ${testItems}, hash: 3BB6C2027D6701F85B8D2773933CD456
    @Test
    void testItems() {
        V1ConfigMapVolumeSource volumeSource = new V1ConfigMapVolumeSource();
        List<V1KeyToPath> items = new ArrayList<>();
        items.add(new V1KeyToPath());
        volumeSource.setItems(items);
        assertThat(volumeSource.getItems(), hasSize(1));
    }

    //BaseRock generated method id: ${testName}, hash: EC3924E922F340D55B752F9FEDA52443
    @Test
    void testName() {
        V1ConfigMapVolumeSource volumeSource = new V1ConfigMapVolumeSource();
        volumeSource.setName("test-name");
        assertThat(volumeSource.getName(), is(equalTo("test-name")));
    }

    //BaseRock generated method id: ${testOptional}, hash: B43E180429A790BE9D678229809161C3
    @Test
    void testOptional() {
        V1ConfigMapVolumeSource volumeSource = new V1ConfigMapVolumeSource();
        volumeSource.setOptional(true);
        assertThat(volumeSource.getOptional(), is(true));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: E7E1B1E843BB570428600567F93D062A
    @Test
    void testEqualsAndHashCode() {
        V1ConfigMapVolumeSource volumeSource1 = new V1ConfigMapVolumeSource().defaultMode(420).name("test-name").optional(true);
        V1ConfigMapVolumeSource volumeSource2 = new V1ConfigMapVolumeSource().defaultMode(420).name("test-name").optional(true);
        assertThat(volumeSource1, is(equalTo(volumeSource2)));
        assertThat(volumeSource1.hashCode(), is(equalTo(volumeSource2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: ED3E9AD853F4BC8309C3960AA155A750
    @Test
    void testToString() {
        V1ConfigMapVolumeSource volumeSource = new V1ConfigMapVolumeSource().defaultMode(420).name("test-name").optional(true);
        String expectedString = "class V1ConfigMapVolumeSource {\n    defaultMode: 420\n    items: []\n    name: test-name\n    optional: true\n}";
        assertThat(volumeSource.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testValidDefaultModes}, hash: 7079405E66078CB6A90E13A646A822F3
    @ParameterizedTest
    @ValueSource(ints = { 0, 420, 511 })
    void testValidDefaultModes(int mode) {
        V1ConfigMapVolumeSource volumeSource = new V1ConfigMapVolumeSource().defaultMode(mode);
        assertThat(volumeSource.getDefaultMode(), is(equalTo(mode)));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: E26AE7AA5DC7E4A63D1CA89538B26C74
    @Test
    void testAddItemsItem() {
        V1ConfigMapVolumeSource volumeSource = new V1ConfigMapVolumeSource();
        V1KeyToPath item = new V1KeyToPath();
        volumeSource.addItemsItem(item);
        assertThat(volumeSource.getItems(), hasSize(1));
        assertThat(volumeSource.getItems(), containsInAnyOrder(item));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 8884E4964F3D5DA944E2A0FBECAA3601
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("defaultMode", 420);
        jsonObject.addProperty("name", "test-name");
        jsonObject.addProperty("optional", true);
        V1ConfigMapVolumeSource.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidField}, hash: 782F4066AE36D556EC1B413F7808B4EC
    @Test
    void testValidateJsonElementWithInvalidField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("invalidField", "value");
        assertThrows(IllegalArgumentException.class, () -> V1ConfigMapVolumeSource.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithNullJsonElement}, hash: 49A9124EC7AF3DA56FB0527A69885A17
    @Test
    void testValidateJsonElementWithNullJsonElement() {
        assertThrows(NullPointerException.class, () -> V1ConfigMapVolumeSource.validateJsonElement(null));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 2BCDF7179825D6303D741FF9E6232D91
    @Test
    void testFromJson() throws IOException {
        String json = "{\"defaultMode\":420,\"name\":\"test-name\",\"optional\":true}";
        V1ConfigMapVolumeSource volumeSource = V1ConfigMapVolumeSource.fromJson(json);
        assertThat(volumeSource.getDefaultMode(), is(equalTo(420)));
        assertThat(volumeSource.getName(), is(equalTo("test-name")));
        assertThat(volumeSource.getOptional(), is(true));
    }

    //BaseRock generated method id: ${testToJson}, hash: 5F5EA81F58444F5D2B04C782599CA02B
    @Test
    void testToJson() {
        V1ConfigMapVolumeSource volumeSource = new V1ConfigMapVolumeSource().defaultMode(420).name("test-name").optional(true);
        String expectedJson = "{\"defaultMode\":420,\"items\":[],\"name\":\"test-name\",\"optional\":true}";
        assertThat(volumeSource.toJson(), is(equalTo(expectedJson)));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: D961E0EEBD795749B1D51A5C78829B9F
    @Test
    void testBuilderPattern() {
        V1ConfigMapVolumeSource volumeSource = new V1ConfigMapVolumeSource().defaultMode(420).name("test-name").optional(true);
        assertThat(volumeSource.getDefaultMode(), is(equalTo(420)));
        assertThat(volumeSource.getName(), is(equalTo("test-name")));
        assertThat(volumeSource.getOptional(), is(true));
    }

    //BaseRock generated method id: ${testNullValues}, hash: 30BA0A1F3EEBF235F2A8F8DAAE303736
    @Test
    void testNullValues() {
        V1ConfigMapVolumeSource volumeSource = new V1ConfigMapVolumeSource();
        assertThat(volumeSource.getDefaultMode(), is(nullValue()));
        assertThat(volumeSource.getName(), is(nullValue()));
        assertThat(volumeSource.getOptional(), is(nullValue()));
    }
}
