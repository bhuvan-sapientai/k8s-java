package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import com.google.gson.JsonNull;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import io.kubernetes.client.common.KubernetesListObject;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import io.kubernetes.client.openapi.JSON;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1IPAddressListBaseRockGeneratedTest {

    private V1beta1IPAddressList ipAddressList;

    @Mock
    private V1ListMeta mockMetadata;

    @Mock
    private V1beta1IPAddress mockIPAddress;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        ipAddressList = new V1beta1IPAddressList();
    }

    //BaseRock generated method id: ${testV1beta1IPAddressList}, hash: A83292C42D115F43C4EE71D5411C1C32
    @Test
    void testV1beta1IPAddressList() {
        assertNotNull(ipAddressList);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 841EFFAC6102C819234FE42843B15CFF
    @Test
    void testApiVersion() {
        String apiVersion = "v1beta1";
        ipAddressList.setApiVersion(apiVersion);
        assertEquals(apiVersion, ipAddressList.getApiVersion());
    }

    //BaseRock generated method id: ${testItems}, hash: E5F45A9B054FE279E7DE276701359222
    @Test
    void testItems() {
        List<V1beta1IPAddress> items = new ArrayList<>();
        items.add(mockIPAddress);
        ipAddressList.setItems(items);
        assertEquals(items, ipAddressList.getItems());
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 56CE8914BB8B35495F33D87C31110E2B
    @Test
    void testAddItemsItem() {
        ipAddressList.addItemsItem(mockIPAddress);
        assertEquals(1, ipAddressList.getItems().size());
        assertEquals(mockIPAddress, ipAddressList.getItems().get(0));
    }

    //BaseRock generated method id: ${testKind}, hash: BEA1DF3E73A99CFBF94BC433B3C81456
    @Test
    void testKind() {
        String kind = "IPAddressList";
        ipAddressList.setKind(kind);
        assertEquals(kind, ipAddressList.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 09B893ACBBAAC626F5ED91FC6B31A5F8
    @Test
    void testMetadata() {
        ipAddressList.setMetadata(mockMetadata);
        assertEquals(mockMetadata, ipAddressList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: C77EC8D8FFE98B8E06F133760610F898
    @Test
    void testEquals() {
        V1beta1IPAddressList ipAddressList2 = new V1beta1IPAddressList();
        assertTrue(ipAddressList.equals(ipAddressList2));
        ipAddressList.setApiVersion("v1beta1");
        assertFalse(ipAddressList.equals(ipAddressList2));
        ipAddressList2.setApiVersion("v1beta1");
        assertTrue(ipAddressList.equals(ipAddressList2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 3E0A3BF8A3DA773A3F8FEDCF2D8C4517
    @Test
    void testHashCode() {
        V1beta1IPAddressList ipAddressList2 = new V1beta1IPAddressList();
        assertEquals(ipAddressList.hashCode(), ipAddressList2.hashCode());
        ipAddressList.setApiVersion("v1beta1");
        assertNotEquals(ipAddressList.hashCode(), ipAddressList2.hashCode());
        ipAddressList2.setApiVersion("v1beta1");
        assertEquals(ipAddressList.hashCode(), ipAddressList2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: B983E88BD9A7FB99F6592378EEDF194C
    @Test
    void testToString() {
        String toString = ipAddressList.toString();
        assertThat(toString, containsString("class V1beta1IPAddressList"));
        assertThat(toString, containsString("apiVersion"));
        assertThat(toString, containsString("items"));
        assertThat(toString, containsString("kind"));
        assertThat(toString, containsString("metadata"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: AB6E0E20E19595D3C20F8C36B90049B6
    @Test
    void testValidateJsonElement() throws IOException {
        assertThrows(IllegalStateException.class, () -> V1beta1IPAddressList.validateJsonElement(JsonNull.INSTANCE));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 83BDCE8C6E0D812E3217C272DB1A4179
    @Test
    void testFromJson() throws IOException {
        String json = "{\"apiVersion\":\"v1beta1\",\"kind\":\"IPAddressList\",\"items\":[]}";
        V1beta1IPAddressList fromJson = V1beta1IPAddressList.fromJson(json);
        assertNotNull(fromJson);
        assertEquals("v1beta1", fromJson.getApiVersion());
        assertEquals("IPAddressList", fromJson.getKind());
        assertNotNull(fromJson.getItems());
        assertTrue(fromJson.getItems().isEmpty());
    }

    //BaseRock generated method id: ${testToJson}, hash: 8ECEA8EB3C12C19CA002044174477822
    @Test
    void testToJson() {
        ipAddressList.setApiVersion("v1beta1");
        ipAddressList.setKind("IPAddressList");
        ipAddressList.setItems(new ArrayList<>());
        String json = ipAddressList.toJson();
        assertNotNull(json);
        assertThat(json, containsString("\"apiVersion\":\"v1beta1\""));
        assertThat(json, containsString("\"kind\":\"IPAddressList\""));
        assertThat(json, containsString("\"items\":[]"));
    }

    //BaseRock generated method id: ${testImplementsKubernetesListObject}, hash: F0CEB9D11C0EE9A66539A2F2530EDE87
    @Test
    void testImplementsKubernetesListObject() {
        assertTrue(ipAddressList instanceof KubernetesListObject);
    }
}
