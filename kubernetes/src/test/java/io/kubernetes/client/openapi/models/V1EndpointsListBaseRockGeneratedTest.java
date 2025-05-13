package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1Endpoints;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import com.google.gson.JsonElement;
import io.kubernetes.client.openapi.JSON;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1EndpointsListBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1EndpointsListConstructor}, hash: 6A7837F8EC887C4E4FD22B5C4E0B28B1
    @Test
    void testV1EndpointsListConstructor() {
        V1EndpointsList endpointsList = new V1EndpointsList();
        assertNotNull(endpointsList);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 8D527462BE3AFA69143A650269F52228
    @Test
    void testApiVersion() {
        V1EndpointsList endpointsList = new V1EndpointsList();
        String apiVersion = "v1";
        endpointsList.setApiVersion(apiVersion);
        assertEquals(apiVersion, endpointsList.getApiVersion());
    }

    //BaseRock generated method id: ${testItems}, hash: EB47F54B97A82153F4B6D09E74BDD818
    @Test
    void testItems() {
        V1EndpointsList endpointsList = new V1EndpointsList();
        List<V1Endpoints> items = new ArrayList<>();
        items.add(mock(V1Endpoints.class));
        items.add(mock(V1Endpoints.class));
        endpointsList.setItems(items);
        assertThat(endpointsList.getItems(), hasSize(2));
    }

    //BaseRock generated method id: ${testKind}, hash: 4E197595F8378C50F16EFDC33AFDB336
    @Test
    void testKind() {
        V1EndpointsList endpointsList = new V1EndpointsList();
        String kind = "EndpointsList";
        endpointsList.setKind(kind);
        assertEquals(kind, endpointsList.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 4247667D814C7ADD97DC01EDB52BE6A7
    @Test
    void testMetadata() {
        V1EndpointsList endpointsList = new V1EndpointsList();
        V1ListMeta metadata = mock(V1ListMeta.class);
        endpointsList.setMetadata(metadata);
        assertThat(endpointsList.getMetadata(), is(metadata));
    }

    //BaseRock generated method id: ${testEquals}, hash: 9A32E5C8694DCC6C9DC6FB6D7C360886
    @Disabled()
    @Test
    void testEquals() {
        V1ListMeta metadata1 = mock(V1ListMeta.class);
        V1ListMeta metadata2 = mock(V1ListMeta.class);
        V1EndpointsList endpointsList1 = new V1EndpointsList().apiVersion("v1").kind("EndpointsList").metadata(metadata1);
        V1EndpointsList endpointsList2 = new V1EndpointsList().apiVersion("v1").kind("EndpointsList").metadata(metadata2);
        List<V1Endpoints> items = new ArrayList<>();
        endpointsList1.setItems(items);
        endpointsList2.setItems(items);
        assertThat(endpointsList1.equals(endpointsList2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: BCE47C777E7F0BA7F9CD67C9C302EF17
    @Test
    void testHashCode() {
        V1EndpointsList endpointsList = new V1EndpointsList().apiVersion("v1").kind("EndpointsList").metadata(mock(V1ListMeta.class));
        assertThat(endpointsList.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: DE1395D7DEB097FCD1F269ED9F345E5C
    @Test
    void testToString() {
        V1EndpointsList endpointsList = new V1EndpointsList().apiVersion("v1").kind("EndpointsList").metadata(mock(V1ListMeta.class));
        String toString = endpointsList.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: B45AC847D98C9ECC1035FAB18070D200
    @Test
    void testAddItemsItem() {
        V1EndpointsList endpointsList = new V1EndpointsList();
        V1Endpoints endpoints = mock(V1Endpoints.class);
        endpointsList.addItemsItem(endpoints);
        assertThat(endpointsList.getItems(), hasSize(1));
        assertThat(endpointsList.getItems().get(0), is(endpoints));
    }

    //BaseRock generated method id: ${testApiVersionFluentSetter}, hash: 3F0A33B4B420648D18A45D8A95D963B5
    @Test
    void testApiVersionFluentSetter() {
        V1EndpointsList endpointsList = new V1EndpointsList();
        V1EndpointsList returnedEndpointsList = endpointsList.apiVersion("v1");
        assertThat(returnedEndpointsList, is(endpointsList));
        assertThat(endpointsList.getApiVersion(), is("v1"));
    }

    //BaseRock generated method id: ${testItemsFluentSetter}, hash: C4750B12F5769CCE9E0E9FC5B6A1852A
    @Test
    void testItemsFluentSetter() {
        V1EndpointsList endpointsList = new V1EndpointsList();
        List<V1Endpoints> items = new ArrayList<>();
        items.add(mock(V1Endpoints.class));
        V1EndpointsList returnedEndpointsList = endpointsList.items(items);
        assertThat(returnedEndpointsList, is(endpointsList));
        assertThat(endpointsList.getItems(), is(items));
    }

    //BaseRock generated method id: ${testKindFluentSetter}, hash: 74F61058FFBA1FF99628F90B545A2E1D
    @Test
    void testKindFluentSetter() {
        V1EndpointsList endpointsList = new V1EndpointsList();
        V1EndpointsList returnedEndpointsList = endpointsList.kind("EndpointsList");
        assertThat(returnedEndpointsList, is(endpointsList));
        assertThat(endpointsList.getKind(), is("EndpointsList"));
    }

    //BaseRock generated method id: ${testMetadataFluentSetter}, hash: A07BC2A65610279EAFA0E44C62D99083
    @Test
    void testMetadataFluentSetter() {
        V1EndpointsList endpointsList = new V1EndpointsList();
        V1ListMeta metadata = mock(V1ListMeta.class);
        V1EndpointsList returnedEndpointsList = endpointsList.metadata(metadata);
        assertThat(returnedEndpointsList, is(endpointsList));
        assertThat(endpointsList.getMetadata(), is(metadata));
    }

    //BaseRock generated method id: ${testToJsonString}, hash: F0E85CFDE4F746AB8524F4AD12A1FBA4
    @Test
    void testToJsonString() throws IOException {
        V1EndpointsList endpointsList = new V1EndpointsList().apiVersion("v1").kind("EndpointsList").metadata(mock(V1ListMeta.class));
        String jsonString = endpointsList.toJson();
        assertNotNull(jsonString);
        assertThat(jsonString.contains("\"apiVersion\":\"v1\""), is(true));
        assertThat(jsonString.contains("\"kind\":\"EndpointsList\""), is(true));
    }

    //BaseRock generated method id: ${testFromJsonString}, hash: EC4197888608F3946DE7748CD9666FD4
    @Test
    void testFromJsonString() throws IOException {
        String jsonString = "{\"apiVersion\":\"v1\",\"kind\":\"EndpointsList\",\"metadata\":{},\"items\":[]}";
        V1EndpointsList endpointsList = V1EndpointsList.fromJson(jsonString);
        assertNotNull(endpointsList);
        assertEquals("v1", endpointsList.getApiVersion());
        assertEquals("EndpointsList", endpointsList.getKind());
        assertNotNull(endpointsList.getMetadata());
        assertNotNull(endpointsList.getItems());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: BDAF4BDA26A9362332AC8E837509DD45
    @Test
    void testValidateJsonElement() throws IOException {
        V1EndpointsList endpointsList = new V1EndpointsList().apiVersion("v1").kind("EndpointsList").metadata(mock(V1ListMeta.class));
        endpointsList.setItems(new ArrayList<>());
        JsonElement jsonElement = JSON.getGson().toJsonTree(endpointsList);
        V1EndpointsList.validateJsonElement(jsonElement);
    }
}
