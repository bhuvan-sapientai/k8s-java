package io.kubernetes.client.openapi.models;

import static org.mockito.Mockito.doReturn;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.io.IOException;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.hamcrest.Matchers;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1NetworkPolicy;
import static org.hamcrest.Matchers.not;
import com.google.gson.JsonArray;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1NetworkPolicyListBaseRockGeneratedTest {

    private V1NetworkPolicyList v1NetworkPolicyList;

    @BeforeEach
    void setUp() {
        v1NetworkPolicyList = new V1NetworkPolicyList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: CDFA7351BB5456A6A53E6B95575377BF
    @Test
    void testGetApiVersion() {
        assertThat(v1NetworkPolicyList.getApiVersion(), is(nullValue()));
        String apiVersion = "networking.k8s.io/v1";
        v1NetworkPolicyList.setApiVersion(apiVersion);
        assertThat(v1NetworkPolicyList.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testGetItems}, hash: 5CCBD709226E6B9EBE8136419ADCF0C4
    @Test
    void testGetItems() {
        assertThat(v1NetworkPolicyList.getItems(), is(notNullValue()));
        assertThat(v1NetworkPolicyList.getItems(), hasSize(0));
        List<V1NetworkPolicy> items = new ArrayList<>();
        items.add(mock(V1NetworkPolicy.class));
        items.add(mock(V1NetworkPolicy.class));
        v1NetworkPolicyList.setItems(items);
        assertThat(v1NetworkPolicyList.getItems(), is(equalTo(items)));
        assertThat(v1NetworkPolicyList.getItems(), hasSize(2));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 189E7916B6221A721AE6E05D625591D7
    @Test
    void testGetKind() {
        assertThat(v1NetworkPolicyList.getKind(), is(nullValue()));
        String kind = "NetworkPolicyList";
        v1NetworkPolicyList.setKind(kind);
        assertThat(v1NetworkPolicyList.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 70A47698BC6D70DF9E2F58F88DDC700D
    @Test
    void testGetMetadata() {
        assertThat(v1NetworkPolicyList.getMetadata(), is(nullValue()));
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1NetworkPolicyList.setMetadata(metadata);
        assertThat(v1NetworkPolicyList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 6E4C93B5E4173D38059F5D766B2BDB84
    @Test
    void testEquals() {
        V1NetworkPolicyList other = new V1NetworkPolicyList();
        assertThat(v1NetworkPolicyList.equals(other), is(true));
        v1NetworkPolicyList.setApiVersion("networking.k8s.io/v1");
        assertThat(v1NetworkPolicyList.equals(other), is(false));
        other.setApiVersion("networking.k8s.io/v1");
        assertThat(v1NetworkPolicyList.equals(other), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 833A3ABCDBC621831BF1A4D640AF646A
    @Test
    void testHashCode() {
        V1NetworkPolicyList other = new V1NetworkPolicyList();
        assertThat(v1NetworkPolicyList.hashCode(), is(equalTo(other.hashCode())));
        v1NetworkPolicyList.setApiVersion("networking.k8s.io/v1");
        assertThat(v1NetworkPolicyList.hashCode(), is(not(equalTo(other.hashCode()))));
        other.setApiVersion("networking.k8s.io/v1");
        assertThat(v1NetworkPolicyList.hashCode(), is(equalTo(other.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: D4AFE707C9A960AFB4160273BBE4A642
    @Test
    void testToString() {
        String result = v1NetworkPolicyList.toString();
        assertNotNull(result);
        assertThat(result, Matchers.containsString("V1NetworkPolicyList"));
        assertThat(result, Matchers.containsString("apiVersion"));
        assertThat(result, Matchers.containsString("items"));
        assertThat(result, Matchers.containsString("kind"));
        assertThat(result, Matchers.containsString("metadata"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 041A69BB26746083CD8998C3DF2FA29A
    @Disabled()
    @Test
    void testValidateJsonElement() throws IOException {
        JsonElement jsonElement = mock(JsonElement.class);
        JsonObject jsonObject = mock(JsonObject.class);
        JsonArray jsonArray = mock(JsonArray.class);
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        when(jsonObject.entrySet()).thenReturn(new HashSet<>());
        when(jsonObject.get("items")).thenReturn(jsonArray);
        when(jsonArray.isJsonArray()).thenReturn(true);
        when(jsonArray.size()).thenReturn(0);
        V1NetworkPolicyList.validateJsonElement(jsonElement);
        // No exception should be thrown
    }

    //BaseRock generated method id: ${testFromJson}, hash: E9626087B132A373AC00FE4F5DBBDFD0
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"networking.k8s.io/v1\",\"kind\":\"NetworkPolicyList\",\"items\":[]}";
        V1NetworkPolicyList result = V1NetworkPolicyList.fromJson(json);
        assertNotNull(result);
        assertEquals("networking.k8s.io/v1", result.getApiVersion());
        assertEquals("NetworkPolicyList", result.getKind());
        assertNotNull(result.getItems());
        assertEquals(0, result.getItems().size());
    }

    //BaseRock generated method id: ${testToJson}, hash: A1DD21EE73DC2CAFCE7477B47507EA1E
    @Test
    void testToJson() {
        v1NetworkPolicyList.setApiVersion("networking.k8s.io/v1");
        v1NetworkPolicyList.setKind("NetworkPolicyList");
        v1NetworkPolicyList.setItems(new ArrayList<>());
        String json = v1NetworkPolicyList.toJson();
        assertNotNull(json);
        assertThat(json, Matchers.containsString("\"apiVersion\":\"networking.k8s.io/v1\""));
        assertThat(json, Matchers.containsString("\"kind\":\"NetworkPolicyList\""));
        assertThat(json, Matchers.containsString("\"items\":[]"));
    }
}
