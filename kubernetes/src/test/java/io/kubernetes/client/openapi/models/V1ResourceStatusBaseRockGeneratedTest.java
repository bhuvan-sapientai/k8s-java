package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1ResourceStatus;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.io.IOException;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import io.kubernetes.client.openapi.models.V1ResourceHealth;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ResourceStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1ResourceStatusConstructor}, hash: BAC7D3AD823DA24FA9AEA38AAE73BE56
    @Test
    void testV1ResourceStatusConstructor() {
        V1ResourceStatus resourceStatus = new V1ResourceStatus();
        assertNotNull(resourceStatus);
    }

    //BaseRock generated method id: ${testSetAndGetName}, hash: 65A17141A7BED1300B90F93C46D9C320
    @Test
    void testSetAndGetName() {
        V1ResourceStatus resourceStatus = new V1ResourceStatus();
        String name = "test-resource";
        resourceStatus.setName(name);
        assertEquals(name, resourceStatus.getName());
    }

    //BaseRock generated method id: ${testSetAndGetNameWithDifferentValues}, hash: C935F3966772E0D0B554BF2EBAC0870D
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "resource1", "claim:test-claim/request" })
    void testSetAndGetNameWithDifferentValues(String name) {
        V1ResourceStatus resourceStatus = new V1ResourceStatus();
        resourceStatus.setName(name);
        assertEquals(name, resourceStatus.getName());
    }

    //BaseRock generated method id: ${testSetAndGetResources}, hash: 203558D75C077375350F1103F135487E
    @Test
    void testSetAndGetResources() {
        V1ResourceStatus resourceStatus = new V1ResourceStatus();
        List<V1ResourceHealth> resources = new ArrayList<>();
        V1ResourceHealth resource1 = mock(V1ResourceHealth.class);
        V1ResourceHealth resource2 = mock(V1ResourceHealth.class);
        resources.add(resource1);
        resources.add(resource2);
        resourceStatus.setResources(resources);
        assertEquals(resources, resourceStatus.getResources());
        assertThat(resourceStatus.getResources(), hasSize(2));
        assertThat(resourceStatus.getResources(), contains(resource1, resource2));
    }

    //BaseRock generated method id: ${testAddResourcesItem}, hash: 35956133A85BB31B57DD677887EB85B2
    @Test
    void testAddResourcesItem() {
        V1ResourceStatus resourceStatus = new V1ResourceStatus();
        V1ResourceHealth resource = mock(V1ResourceHealth.class);
        resourceStatus.addResourcesItem(resource);
        assertThat(resourceStatus.getResources(), hasSize(1));
        assertThat(resourceStatus.getResources().get(0), is(resource));
    }

    //BaseRock generated method id: ${testEquals}, hash: FC44E1017F97402D7E0DC8E1ED23D137
    @Test
    void testEquals() {
        V1ResourceStatus status1 = new V1ResourceStatus().name("test");
        V1ResourceStatus status2 = new V1ResourceStatus().name("test");
        V1ResourceStatus status3 = new V1ResourceStatus().name("different");
        assertThat(status1.equals(status2), is(true));
        assertThat(status1.equals(status3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 3356AD2D1B4F3CA9895ECC1A9B061726
    @Test
    void testHashCode() {
        V1ResourceStatus status1 = new V1ResourceStatus().name("test");
        V1ResourceStatus status2 = new V1ResourceStatus().name("test");
        assertThat(status1.hashCode(), equalTo(status2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: ECCFB231D65FD902C6BE351B34696291
    @Test
    void testToString() {
        V1ResourceStatus status = new V1ResourceStatus().name("test-resource").addResourcesItem(mock(V1ResourceHealth.class));
        String result = status.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("name"), is(true));
        assertThat(result.contains("resources"), is(true));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 6479E17D793765D167A16C564F661202
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "test-resource");
        JsonElement jsonElement = jsonObject;
        V1ResourceStatus.validateJsonElement(jsonElement);
    }

    //BaseRock generated method id: ${testCustomTypeAdapterFactory}, hash: E09F78A30B5B7D274BAD10561A563B23
    @Test
    void testCustomTypeAdapterFactory() {
        assertNotNull(new V1ResourceStatus.CustomTypeAdapterFactory());
    }

    //BaseRock generated method id: ${testFromJson}, hash: 703C175AD76B5124BF2A560A2E0F59DF
    @Test
    void testFromJson() throws IOException {
        String json = "{\"name\":\"test-resource\"}";
        V1ResourceStatus status = V1ResourceStatus.fromJson(json);
        assertNotNull(status);
        assertEquals("test-resource", status.getName());
    }

    //BaseRock generated method id: ${testToJson}, hash: 675CCF2D608A0DAB81E97FBBA26D4EDE
    @Test
    void testToJson() {
        V1ResourceStatus status = new V1ResourceStatus().name("test-resource");
        String json = status.toJson();
        assertNotNull(json);
        assertThat(json, startsWith("{"));
        assertThat(json, endsWith("}"));
        assertThat(json.contains("\"name\":\"test-resource\""), is(true));
    }
}
