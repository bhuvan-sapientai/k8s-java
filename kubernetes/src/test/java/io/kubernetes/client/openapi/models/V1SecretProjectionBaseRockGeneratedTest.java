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
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import io.kubernetes.client.openapi.models.V1KeyToPath;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1SecretProjectionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1SecretProjectionConstructor}, hash: 7247B5CE4A4209B95EA7A849E0BB9C52
    @Test
    void testV1SecretProjectionConstructor() {
        V1SecretProjection v1SecretProjection = new V1SecretProjection();
        assertThat(v1SecretProjection, is(notNullValue()));
    }

    //BaseRock generated method id: ${testItemsGetterAndSetter}, hash: B3A28349842878FA12F5B822E2CA0F9A
    @Test
    void testItemsGetterAndSetter() {
        V1SecretProjection v1SecretProjection = new V1SecretProjection();
        List<V1KeyToPath> items = new ArrayList<>();
        items.add(new V1KeyToPath());
        v1SecretProjection.setItems(items);
        assertThat(v1SecretProjection.getItems(), is(equalTo(items)));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: DB8ECBFE7CB9ED2F67C830DEB79259A1
    @Test
    void testAddItemsItem() {
        V1SecretProjection v1SecretProjection = new V1SecretProjection();
        V1KeyToPath item = new V1KeyToPath();
        v1SecretProjection.addItemsItem(item);
        assertThat(v1SecretProjection.getItems(), hasSize(1));
        assertThat(v1SecretProjection.getItems().get(0), is(equalTo(item)));
    }

    //BaseRock generated method id: ${testNameGetterAndSetter}, hash: 4A0195745EC7EE821FEE2E76C90D6C4B
    @Test
    void testNameGetterAndSetter() {
        V1SecretProjection v1SecretProjection = new V1SecretProjection();
        String name = "test-name";
        v1SecretProjection.setName(name);
        assertThat(v1SecretProjection.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testOptionalGetterAndSetter}, hash: A056D304E511DFDA06298F27101601BD
    @Test
    void testOptionalGetterAndSetter() {
        V1SecretProjection v1SecretProjection = new V1SecretProjection();
        Boolean optional = true;
        v1SecretProjection.setOptional(optional);
        assertThat(v1SecretProjection.getOptional(), is(equalTo(optional)));
    }

    //BaseRock generated method id: ${testEquals}, hash: E89B4B2822E106F722C7F91FCED824A4
    @Test
    void testEquals() {
        V1SecretProjection v1SecretProjection1 = new V1SecretProjection().items(new ArrayList<>()).name("test-name").optional(true);
        V1SecretProjection v1SecretProjection2 = new V1SecretProjection().items(new ArrayList<>()).name("test-name").optional(true);
        assertThat(v1SecretProjection1.equals(v1SecretProjection2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 7E6282311413CC880C5BDF2150D16131
    @Test
    void testHashCode() {
        V1SecretProjection v1SecretProjection = new V1SecretProjection().items(new ArrayList<>()).name("test-name").optional(true);
        assertThat(v1SecretProjection.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 4CCFA21CACABA9A09D32B7230993472C
    @Test
    void testToString() {
        V1SecretProjection v1SecretProjection = new V1SecretProjection().items(new ArrayList<>()).name("test-name").optional(true);
        String toString = v1SecretProjection.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("class V1SecretProjection"), is(true));
        assertThat(toString.contains("items"), is(true));
        assertThat(toString.contains("name"), is(true));
        assertThat(toString.contains("optional"), is(true));
    }

    //BaseRock generated method id: ${testOpenApiFields}, hash: B6E706D3D66DE6DBA2E1626FD5514612
    @ParameterizedTest
    @ValueSource(strings = { "items", "name", "optional" })
    void testOpenApiFields(String field) {
        assertThat(V1SecretProjection.openapiFields.contains(field), is(true));
    }

    //BaseRock generated method id: ${testOpenApiRequiredFields}, hash: 5A698D94980DA42DABC763D0E2F6E958
    @Test
    void testOpenApiRequiredFields() {
        assertThat(V1SecretProjection.openapiRequiredFields.isEmpty(), is(true));
    }

    //BaseRock generated method id: ${testValidateJsonElementValid}, hash: A8F83D7CDB54A18BCCCB8A680E578163
    @Test
    void testValidateJsonElementValid() {
        V1SecretProjection v1SecretProjection = new V1SecretProjection().items(new ArrayList<>()).name("test-name").optional(true);
        assertThat(v1SecretProjection, is(notNullValue()));
    }

    //BaseRock generated method id: ${testValidateJsonElementInvalid}, hash: 69013D51FEDAF4306936E99A4218C121
    @Test
    void testValidateJsonElementInvalid() {
        assertThrows(IllegalArgumentException.class, () -> {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("invalidField", "invalidValue");
            JsonElement jsonElement = jsonObject;
            V1SecretProjection.validateJsonElement(jsonElement);
        });
    }

    //BaseRock generated method id: ${testFromJson}, hash: F1B9B62AE249E1F2464B92193C914538
    @Test
    void testFromJson() throws Exception {
        String json = "{\"items\":[],\"name\":\"test-name\",\"optional\":true}";
        V1SecretProjection v1SecretProjection = V1SecretProjection.fromJson(json);
        assertThat(v1SecretProjection, is(notNullValue()));
        assertThat(v1SecretProjection.getName(), is(equalTo("test-name")));
        assertThat(v1SecretProjection.getOptional(), is(true));
    }

    //BaseRock generated method id: ${testToJson}, hash: AA4056C935B1211C47CA36C51E06FE3E
    @Test
    void testToJson() {
        V1SecretProjection v1SecretProjection = new V1SecretProjection().items(new ArrayList<>()).name("test-name").optional(true);
        String json = v1SecretProjection.toJson();
        assertThat(json, is(notNullValue()));
        assertThat(json.contains("\"name\":\"test-name\""), is(true));
        assertThat(json.contains("\"optional\":true"), is(true));
    }
}
