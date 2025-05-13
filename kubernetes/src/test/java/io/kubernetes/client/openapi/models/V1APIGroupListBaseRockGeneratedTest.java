package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.V1APIGroup;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1APIGroupList;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1APIGroupListBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1APIGroupListConstructor}, hash: A8167B6E9CAAB1EB44D4A61AD5FBCD20
    @Test
    void testV1APIGroupListConstructor() {
        V1APIGroupList apiGroupList = new V1APIGroupList();
        assertThat(apiGroupList, is(notNullValue()));
    }

    //BaseRock generated method id: ${testApiVersion}, hash: EC25BCEEF6FB90BF940DE3D9D34AAFC2
    @Test
    void testApiVersion() {
        V1APIGroupList apiGroupList = new V1APIGroupList();
        String apiVersion = "v1";
        apiGroupList.setApiVersion(apiVersion);
        assertEquals(apiVersion, apiGroupList.getApiVersion());
    }

    //BaseRock generated method id: ${testApiVersionWithDifferentValues}, hash: 4E240E4F301B0700F32CA5FB37A79738
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "v1", "v2", "beta" })
    void testApiVersionWithDifferentValues(String apiVersion) {
        V1APIGroupList apiGroupList = new V1APIGroupList();
        apiGroupList.setApiVersion(apiVersion);
        assertEquals(apiVersion, apiGroupList.getApiVersion());
    }

    //BaseRock generated method id: ${testGroups}, hash: C944E9A2920818197DBED90B044A40A7
    @Test
    void testGroups() {
        V1APIGroupList apiGroupList = new V1APIGroupList();
        List<V1APIGroup> groups = new ArrayList<>();
        groups.add(new V1APIGroup());
        groups.add(new V1APIGroup());
        apiGroupList.setGroups(groups);
        assertThat(apiGroupList.getGroups(), hasSize(2));
    }

    //BaseRock generated method id: ${testAddGroupsItem}, hash: 1318639F1CC50F8BA8E3C021024ABC31
    @Test
    void testAddGroupsItem() {
        V1APIGroupList apiGroupList = new V1APIGroupList();
        V1APIGroup group = new V1APIGroup();
        apiGroupList.addGroupsItem(group);
        assertThat(apiGroupList.getGroups(), hasSize(1));
        assertThat(apiGroupList.getGroups().get(0), is(equalTo(group)));
    }

    //BaseRock generated method id: ${testKind}, hash: 9BB02666C5329B839FEA096E04404982
    @Test
    void testKind() {
        V1APIGroupList apiGroupList = new V1APIGroupList();
        String kind = "APIGroupList";
        apiGroupList.setKind(kind);
        assertEquals(kind, apiGroupList.getKind());
    }

    //BaseRock generated method id: ${testKindWithDifferentValues}, hash: F2515C002561AB11FC91677E43E2AAE3
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "APIGroupList", "CustomKind" })
    void testKindWithDifferentValues(String kind) {
        V1APIGroupList apiGroupList = new V1APIGroupList();
        apiGroupList.setKind(kind);
        assertEquals(kind, apiGroupList.getKind());
    }

    //BaseRock generated method id: ${testEquals}, hash: A83704F37F4435F65F05BACABBCAD31D
    @Test
    void testEquals() {
        V1APIGroupList apiGroupList1 = new V1APIGroupList().apiVersion("v1").kind("APIGroupList");
        V1APIGroupList apiGroupList2 = new V1APIGroupList().apiVersion("v1").kind("APIGroupList");
        V1APIGroupList apiGroupList3 = new V1APIGroupList().apiVersion("v2").kind("CustomKind");
        assertThat(apiGroupList1.equals(apiGroupList2), is(true));
        assertThat(apiGroupList1.equals(apiGroupList3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 7427DC5E310443111EB1861F18EDDDD6
    @Test
    void testHashCode() {
        V1APIGroupList apiGroupList1 = new V1APIGroupList().apiVersion("v1").kind("APIGroupList");
        V1APIGroupList apiGroupList2 = new V1APIGroupList().apiVersion("v1").kind("APIGroupList");
        assertThat(apiGroupList1.hashCode(), is(equalTo(apiGroupList2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: CCA6C7BACBF14FB9621C2BAB4E34707F
    @Test
    void testToString() {
        V1APIGroupList apiGroupList = new V1APIGroupList().apiVersion("v1").kind("APIGroupList");
        String expectedString = "class V1APIGroupList {\n    apiVersion: v1\n    groups: []\n    kind: APIGroupList\n}";
        assertEquals(expectedString, apiGroupList.toString());
    }

    //BaseRock generated method id: ${testApiVersionFluentInterface}, hash: C5846125AA83359355827F78508FD2A9
    @Test
    void testApiVersionFluentInterface() {
        V1APIGroupList apiGroupList = new V1APIGroupList().apiVersion("v1");
        assertEquals("v1", apiGroupList.getApiVersion());
    }

    //BaseRock generated method id: ${testGroupsFluentInterface}, hash: FC5B4E5423E9D81AA7E776D837193598
    @Test
    void testGroupsFluentInterface() {
        List<V1APIGroup> groups = new ArrayList<>();
        groups.add(new V1APIGroup());
        V1APIGroupList apiGroupList = new V1APIGroupList().groups(groups);
        assertThat(apiGroupList.getGroups(), hasSize(1));
    }

    //BaseRock generated method id: ${testKindFluentInterface}, hash: 652EC9F4966357F88A9AFDA8A60CDA35
    @Test
    void testKindFluentInterface() {
        V1APIGroupList apiGroupList = new V1APIGroupList().kind("APIGroupList");
        assertEquals("APIGroupList", apiGroupList.getKind());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: F742475D6FD3BCAAFA0C04C8A142CA47
    @Test
    void testValidateJsonElement() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiVersion", "v1");
        jsonObject.addProperty("kind", "APIGroupList");
        jsonObject.add("groups", new JsonObject());
        assertThrows(IllegalArgumentException.class, () -> V1APIGroupList.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 7FAB4B75FDF81497C025F3945D37DFE9
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"APIGroupList\",\"groups\":[]}";
        V1APIGroupList apiGroupList = V1APIGroupList.fromJson(json);
        assertThat(apiGroupList, is(notNullValue()));
        assertEquals("v1", apiGroupList.getApiVersion());
        assertEquals("APIGroupList", apiGroupList.getKind());
        assertThat(apiGroupList.getGroups(), hasSize(0));
    }

    //BaseRock generated method id: ${testToJson}, hash: 12A6A93C249C1B79764CBC0C0DB03BB0
    @Test
    void testToJson() {
        V1APIGroupList apiGroupList = new V1APIGroupList().apiVersion("v1").kind("APIGroupList");
        String json = apiGroupList.toJson();
        assertThat(json, startsWith("{"));
        assertThat(json, endsWith("}"));
        assertThat(json, is(notNullValue()));
    }
}
