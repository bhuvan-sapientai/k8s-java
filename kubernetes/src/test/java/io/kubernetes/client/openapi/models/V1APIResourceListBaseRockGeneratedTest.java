package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1APIResource;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import static org.hamcrest.Matchers.containsInAnyOrder;
import java.io.IOException;
import java.util.List;
import static org.hamcrest.Matchers.emptyIterable;
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
import static org.hamcrest.Matchers.not;
import com.google.gson.JsonArray;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1APIResourceListBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 9FC726B5F0FD2118AEB28FCCC481E284
    @Test
    void testConstructor() {
        V1APIResourceList resourceList = new V1APIResourceList();
        assertThat(resourceList, is(notNullValue()));
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 650E595B0953EC1962DF9A99586B5CF8
    @Test
    void testApiVersion() {
        V1APIResourceList resourceList = new V1APIResourceList();
        String apiVersion = "v1";
        resourceList.setApiVersion(apiVersion);
        assertThat(resourceList.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testGroupVersion}, hash: D75EA0142EF6080C3EC413B0D27EF534
    @Test
    void testGroupVersion() {
        V1APIResourceList resourceList = new V1APIResourceList();
        String groupVersion = "apps/v1";
        resourceList.setGroupVersion(groupVersion);
        assertThat(resourceList.getGroupVersion(), is(equalTo(groupVersion)));
    }

    //BaseRock generated method id: ${testKind}, hash: EFF7FB6C749114922E4BF118E8C09895
    @Test
    void testKind() {
        V1APIResourceList resourceList = new V1APIResourceList();
        String kind = "APIResourceList";
        resourceList.setKind(kind);
        assertThat(resourceList.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testResources}, hash: B4048051E4EE8766706236EF00B68D70
    @Test
    void testResources() {
        V1APIResourceList resourceList = new V1APIResourceList();
        List<V1APIResource> resources = new ArrayList<>();
        V1APIResource resource1 = mock(V1APIResource.class);
        V1APIResource resource2 = mock(V1APIResource.class);
        resources.add(resource1);
        resources.add(resource2);
        resourceList.setResources(resources);
        assertThat(resourceList.getResources(), hasSize(2));
        assertThat(resourceList.getResources(), containsInAnyOrder(resource1, resource2));
    }

    //BaseRock generated method id: ${testAddResourcesItem}, hash: AE6AA7F0098BD9ACFCD91C568FAF9912
    @Test
    void testAddResourcesItem() {
        V1APIResourceList resourceList = new V1APIResourceList();
        V1APIResource resource = mock(V1APIResource.class);
        resourceList.addResourcesItem(resource);
        assertThat(resourceList.getResources(), hasSize(1));
        assertThat(resourceList.getResources().get(0), is(equalTo(resource)));
    }

    //BaseRock generated method id: ${testApiVersionWithDifferentValues}, hash: 1C7771D551C9B6954AD810D31A9F91BF
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "v1", "apps/v1", "batch/v1" })
    void testApiVersionWithDifferentValues(String apiVersion) {
        V1APIResourceList resourceList = new V1APIResourceList();
        resourceList.setApiVersion(apiVersion);
        assertThat(resourceList.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: EF2076BCDDC60C578DF05BA08E30FD1D
    @Test
    void testEqualsAndHashCode() {
        V1APIResourceList resourceList1 = new V1APIResourceList().apiVersion("v1").groupVersion("apps/v1").kind("APIResourceList");
        V1APIResourceList resourceList2 = new V1APIResourceList().apiVersion("v1").groupVersion("apps/v1").kind("APIResourceList");
        V1APIResourceList resourceList3 = new V1APIResourceList().apiVersion("v2").groupVersion("apps/v2").kind("DifferentKind");
        assertThat(resourceList1, is(equalTo(resourceList2)));
        assertThat(resourceList1.hashCode(), is(equalTo(resourceList2.hashCode())));
        assertThat(resourceList1, is(not(equalTo(resourceList3))));
        assertThat(resourceList1.hashCode(), is(not(equalTo(resourceList3.hashCode()))));
    }

    //BaseRock generated method id: ${testToString}, hash: 7496223E1E1137E1FB93139241F3F9DE
    @Test
    void testToString() {
        V1APIResourceList resourceList = new V1APIResourceList().apiVersion("v1").groupVersion("apps/v1").kind("APIResourceList");
        String expectedString = "class V1APIResourceList {\n    apiVersion: v1\n    groupVersion: apps/v1\n    kind: APIResourceList\n    resources: []\n}";
        assertThat(resourceList.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: CFF64CCEDAE7ED9DA671D663385C3C51
    @Test
    void testValidateJsonElement() {
        JsonElement validJsonElement = new JsonObject();
        validJsonElement.getAsJsonObject().addProperty("groupVersion", "apps/v1");
        validJsonElement.getAsJsonObject().add("resources", new JsonArray());
        assertDoesNotThrow(() -> V1APIResourceList.validateJsonElement(validJsonElement));
        JsonElement invalidJsonElement = new JsonObject();
        assertThrows(IllegalArgumentException.class, () -> V1APIResourceList.validateJsonElement(invalidJsonElement));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 38932F61C9C55588149323EBAF75D044
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1\",\"groupVersion\":\"apps/v1\",\"kind\":\"APIResourceList\",\"resources\":[]}";
        V1APIResourceList resourceList = V1APIResourceList.fromJson(json);
        assertThat(resourceList, is(notNullValue()));
        assertThat(resourceList.getApiVersion(), is(equalTo("v1")));
        assertThat(resourceList.getGroupVersion(), is(equalTo("apps/v1")));
        assertThat(resourceList.getKind(), is(equalTo("APIResourceList")));
        assertThat(resourceList.getResources(), is(notNullValue()));
        assertThat(resourceList.getResources(), is(emptyIterable()));
    }

    //BaseRock generated method id: ${testToJson}, hash: B205CAA91EA6FEB249DD6087F16F0F7F
    @Test
    void testToJson() {
        V1APIResourceList resourceList = new V1APIResourceList().apiVersion("v1").groupVersion("apps/v1").kind("APIResourceList");
        String json = resourceList.toJson();
        assertThat(json, is(notNullValue()));
        assertThat(json, containsString("\"apiVersion\":\"v1\""));
        assertThat(json, containsString("\"groupVersion\":\"apps/v1\""));
        assertThat(json, containsString("\"kind\":\"APIResourceList\""));
    }
}
