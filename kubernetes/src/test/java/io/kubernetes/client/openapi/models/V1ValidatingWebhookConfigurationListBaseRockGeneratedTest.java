package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1ValidatingWebhookConfiguration;
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
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1ValidatingWebhookConfigurationListBaseRockGeneratedTest {

    private V1ValidatingWebhookConfigurationList v1ValidatingWebhookConfigurationList;

    @BeforeEach
    void setUp() {
        v1ValidatingWebhookConfigurationList = new V1ValidatingWebhookConfigurationList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 60FB168BC3A60E9837613691279F2B2F
    @Test
    void testGetApiVersion() {
        assertThat(v1ValidatingWebhookConfigurationList.getApiVersion(), is(nullValue()));
        String apiVersion = "v1";
        v1ValidatingWebhookConfigurationList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1ValidatingWebhookConfigurationList.getApiVersion());
    }

    //BaseRock generated method id: ${testGetItems}, hash: C00A8FB98F6F359652E858109CC2CD5F
    @Test
    void testGetItems() {
        assertThat(v1ValidatingWebhookConfigurationList.getItems(), is(notNullValue()));
        assertThat(v1ValidatingWebhookConfigurationList.getItems(), hasSize(0));
        List<V1ValidatingWebhookConfiguration> items = new ArrayList<>();
        items.add(new V1ValidatingWebhookConfiguration());
        v1ValidatingWebhookConfigurationList.setItems(items);
        assertEquals(items, v1ValidatingWebhookConfigurationList.getItems());
    }

    //BaseRock generated method id: ${testGetKind}, hash: 19D776687F5DA2E2313ACB5AA3ABD5F3
    @Test
    void testGetKind() {
        assertThat(v1ValidatingWebhookConfigurationList.getKind(), is(nullValue()));
        String kind = "ValidatingWebhookConfigurationList";
        v1ValidatingWebhookConfigurationList.setKind(kind);
        assertEquals(kind, v1ValidatingWebhookConfigurationList.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 2B9EDB97E333F6B7B7400CFDF01E0515
    @Test
    void testGetMetadata() {
        assertThat(v1ValidatingWebhookConfigurationList.getMetadata(), is(nullValue()));
        V1ListMeta metadata = new V1ListMeta();
        v1ValidatingWebhookConfigurationList.setMetadata(metadata);
        assertEquals(metadata, v1ValidatingWebhookConfigurationList.getMetadata());
    }

    //BaseRock generated method id: ${testToString}, hash: C727AA1F132F79094E83FC340CC236E7
    @Test
    void testToString() {
        assertNotNull(v1ValidatingWebhookConfigurationList.toString());
        assertThat(v1ValidatingWebhookConfigurationList.toString(), containsString("V1ValidatingWebhookConfigurationList"));
    }

    //BaseRock generated method id: ${testEquals}, hash: 27035B7AC3F32886073C56D46AEB80BF
    @Test
    void testEquals() {
        V1ValidatingWebhookConfigurationList list1 = new V1ValidatingWebhookConfigurationList();
        V1ValidatingWebhookConfigurationList list2 = new V1ValidatingWebhookConfigurationList();
        assertEquals(list1, list2);
        list1.setApiVersion("v1");
        assertThat(list1.equals(list2), is(false));
        list2.setApiVersion("v1");
        assertEquals(list1, list2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: D0529F7073DFC7C1AF4194C87E67AB64
    @Test
    void testHashCode() {
        V1ValidatingWebhookConfigurationList list1 = new V1ValidatingWebhookConfigurationList();
        V1ValidatingWebhookConfigurationList list2 = new V1ValidatingWebhookConfigurationList();
        assertEquals(list1.hashCode(), list2.hashCode());
        list1.setApiVersion("v1");
        assertThat(list1.hashCode() == list2.hashCode(), is(false));
        list2.setApiVersion("v1");
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: CBF32EB3E94FC97E790525C21DE5C0B7
    @Test
    void testAddItemsItem() {
        V1ValidatingWebhookConfiguration item = new V1ValidatingWebhookConfiguration();
        v1ValidatingWebhookConfigurationList.addItemsItem(item);
        assertThat(v1ValidatingWebhookConfigurationList.getItems(), hasSize(1));
        assertEquals(item, v1ValidatingWebhookConfigurationList.getItems().get(0));
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 830B1B68E1640FA59CA65CB35AB1966B
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        V1ValidatingWebhookConfigurationList result = v1ValidatingWebhookConfigurationList.apiVersion(apiVersion);
        assertThat(result, is(v1ValidatingWebhookConfigurationList));
        assertEquals(apiVersion, v1ValidatingWebhookConfigurationList.getApiVersion());
    }

    //BaseRock generated method id: ${testItems}, hash: 7218778C520D69B415F7BE60D821EEC3
    @Test
    void testItems() {
        List<V1ValidatingWebhookConfiguration> items = new ArrayList<>();
        items.add(new V1ValidatingWebhookConfiguration());
        V1ValidatingWebhookConfigurationList result = v1ValidatingWebhookConfigurationList.items(items);
        assertThat(result, is(v1ValidatingWebhookConfigurationList));
        assertEquals(items, v1ValidatingWebhookConfigurationList.getItems());
    }

    //BaseRock generated method id: ${testKind}, hash: 7544C60DD54AAE80CE249FA8D0F535FC
    @Test
    void testKind() {
        String kind = "ValidatingWebhookConfigurationList";
        V1ValidatingWebhookConfigurationList result = v1ValidatingWebhookConfigurationList.kind(kind);
        assertThat(result, is(v1ValidatingWebhookConfigurationList));
        assertEquals(kind, v1ValidatingWebhookConfigurationList.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 728EC18411FA2774F1CCFCD19FEB725D
    @Test
    void testMetadata() {
        V1ListMeta metadata = new V1ListMeta();
        V1ValidatingWebhookConfigurationList result = v1ValidatingWebhookConfigurationList.metadata(metadata);
        assertThat(result, is(v1ValidatingWebhookConfigurationList));
        assertEquals(metadata, v1ValidatingWebhookConfigurationList.getMetadata());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 7001A7414E76088BAD247F0AB13E65E1
    @Disabled()
    @Test
    void testValidateJsonElement() throws IOException {
        JsonElement jsonElement = mock(JsonElement.class);
        JsonObject jsonObject = mock(JsonObject.class);
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        when(jsonObject.entrySet()).thenReturn(new java.util.HashSet<>());
        V1ValidatingWebhookConfigurationList.validateJsonElement(jsonElement);
    }

    //BaseRock generated method id: ${testFromJson}, hash: 318B615391B92668B3187997B7EFC061
    @Test
    void testFromJson() {
        String json = "{}";
        assertThrows(IllegalArgumentException.class, () -> V1ValidatingWebhookConfigurationList.fromJson(json));
    }

    //BaseRock generated method id: ${testToJson}, hash: E8AC447341DD1805F11D776F17D0FD73
    @Test
    void testToJson() {
        String json = v1ValidatingWebhookConfigurationList.toJson();
        assertNotNull(json);
        assertThat(json, startsWith("{"));
        assertThat(json, endsWith("}"));
    }
}
