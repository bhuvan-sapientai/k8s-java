package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;
import java.util.AbstractMap;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.io.IOException;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.V1alpha1MutatingAdmissionPolicyBinding;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1alpha1MutatingAdmissionPolicyBindingListBaseRockGeneratedTest {

    private V1alpha1MutatingAdmissionPolicyBindingList policyBindingList;

    @BeforeEach
    void setUp() {
        policyBindingList = new V1alpha1MutatingAdmissionPolicyBindingList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: A7C6C21167252EAD8FD2D8574B676AEA
    @Test
    void testGetApiVersion() {
        assertThat(policyBindingList.getApiVersion(), is(nullValue()));
        String apiVersion = "v1alpha1";
        policyBindingList.setApiVersion(apiVersion);
        assertThat(policyBindingList.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testGetItems}, hash: 1A31E3C8FA50D427A3EE2EB686B7170D
    @Test
    void testGetItems() {
        assertThat(policyBindingList.getItems(), is(notNullValue()));
        assertThat(policyBindingList.getItems(), hasSize(0));
        List<V1alpha1MutatingAdmissionPolicyBinding> items = new ArrayList<>();
        items.add(mock(V1alpha1MutatingAdmissionPolicyBinding.class));
        policyBindingList.setItems(items);
        assertThat(policyBindingList.getItems(), is(equalTo(items)));
        assertThat(policyBindingList.getItems(), hasSize(1));
    }

    //BaseRock generated method id: ${testGetKind}, hash: D1DF5609A2B18AB1296FB33E6FCDD06F
    @Test
    void testGetKind() {
        assertThat(policyBindingList.getKind(), is(nullValue()));
        String kind = "MutatingAdmissionPolicyBindingList";
        policyBindingList.setKind(kind);
        assertThat(policyBindingList.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: E2E3D1E2632B53A38BD16AFC1BC789D8
    @Test
    void testGetMetadata() {
        assertThat(policyBindingList.getMetadata(), is(nullValue()));
        V1ListMeta metadata = mock(V1ListMeta.class);
        policyBindingList.setMetadata(metadata);
        assertThat(policyBindingList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testEquals}, hash: CEC86802939BB4EB27DD7F4B42099E95
    @Test
    void testEquals() {
        V1alpha1MutatingAdmissionPolicyBindingList other = new V1alpha1MutatingAdmissionPolicyBindingList();
        assertThat(policyBindingList, is(equalTo(other)));
        policyBindingList.setApiVersion("v1alpha1");
        assertThat(policyBindingList, is(not(equalTo(other))));
        other.setApiVersion("v1alpha1");
        assertThat(policyBindingList, is(equalTo(other)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 6FDA6FA619900CEE77ED83F397DE0F58
    @Test
    void testHashCode() {
        V1alpha1MutatingAdmissionPolicyBindingList other = new V1alpha1MutatingAdmissionPolicyBindingList();
        assertThat(policyBindingList.hashCode(), is(equalTo(other.hashCode())));
        policyBindingList.setApiVersion("v1alpha1");
        assertThat(policyBindingList.hashCode(), is(not(equalTo(other.hashCode()))));
        other.setApiVersion("v1alpha1");
        assertThat(policyBindingList.hashCode(), is(equalTo(other.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: FC468401FA3BBC70C67F1186833BE3B5
    @Test
    void testToString() {
        String expected = "class V1alpha1MutatingAdmissionPolicyBindingList {\n    apiVersion: null\n    items: []\n    kind: null\n    metadata: null\n}";
        assertThat(policyBindingList.toString(), is(equalTo(expected)));
        policyBindingList.setApiVersion("v1alpha1");
        policyBindingList.setKind("MutatingAdmissionPolicyBindingList");
        V1ListMeta metadata = mock(V1ListMeta.class);
        when(metadata.toString()).thenReturn("mockMetadata");
        policyBindingList.setMetadata(metadata);
        expected = "class V1alpha1MutatingAdmissionPolicyBindingList {\n    apiVersion: v1alpha1\n    items: []\n    kind: MutatingAdmissionPolicyBindingList\n    metadata: mockMetadata\n}";
        assertThat(policyBindingList.toString(), is(equalTo(expected)));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 0D6319082B50E9870AA4D9920E6D990F
    @Test
    void testAddItemsItem() {
        V1alpha1MutatingAdmissionPolicyBinding item = mock(V1alpha1MutatingAdmissionPolicyBinding.class);
        policyBindingList.addItemsItem(item);
        assertThat(policyBindingList.getItems(), hasSize(1));
        assertThat(policyBindingList.getItems().get(0), is(equalTo(item)));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 7AF191472CB732E465B1E32B48FA6B86
    @Disabled()
    @Test
    void testValidateJsonElement() {
        assertThrows(IllegalArgumentException.class, () -> V1alpha1MutatingAdmissionPolicyBindingList.validateJsonElement(null));
        JsonElement jsonElement = mock(JsonElement.class);
        JsonObject jsonObject = mock(JsonObject.class);
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        Set<Map.Entry<String, JsonElement>> entries = new HashSet<>();
        entries.add(new AbstractMap.SimpleEntry<>("items", mock(JsonElement.class)));
        when(jsonObject.entrySet()).thenReturn(entries);
        assertDoesNotThrow(() -> V1alpha1MutatingAdmissionPolicyBindingList.validateJsonElement(jsonElement));
        entries.add(new AbstractMap.SimpleEntry<>("invalidField", mock(JsonElement.class)));
        assertThrows(IllegalArgumentException.class, () -> V1alpha1MutatingAdmissionPolicyBindingList.validateJsonElement(jsonElement));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 1AE8A9EABBD791501D2F8BAA2A7366FF
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1alpha1\",\"kind\":\"MutatingAdmissionPolicyBindingList\",\"items\":[]}";
        V1alpha1MutatingAdmissionPolicyBindingList result = V1alpha1MutatingAdmissionPolicyBindingList.fromJson(json);
        assertThat(result, is(notNullValue()));
        assertThat(result.getApiVersion(), is(equalTo("v1alpha1")));
        assertThat(result.getKind(), is(equalTo("MutatingAdmissionPolicyBindingList")));
        assertThat(result.getItems(), is(notNullValue()));
        assertThat(result.getItems(), hasSize(0));
    }

    //BaseRock generated method id: ${testToJson}, hash: 9DC619B1082BBD7E94B174392540E7A7
    @Test
    void testToJson() {
        policyBindingList.setApiVersion("v1alpha1");
        policyBindingList.setKind("MutatingAdmissionPolicyBindingList");
        String json = policyBindingList.toJson();
        assertThat(json, is(notNullValue()));
        assertThat(json, containsString("\"apiVersion\":\"v1alpha1\""));
        assertThat(json, containsString("\"kind\":\"MutatingAdmissionPolicyBindingList\""));
        assertThat(json, containsString("\"items\":[]"));
    }
}
