package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1CertificateSigningRequest;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CertificateSigningRequestListBaseRockGeneratedTest {

    private V1CertificateSigningRequestList v1CertificateSigningRequestList;

    @BeforeEach
    void setUp() {
        v1CertificateSigningRequestList = new V1CertificateSigningRequestList();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 8C9BC7A327AC01E0770AD7DF28915D04
    @Test
    void testConstructor() {
        assertNotNull(v1CertificateSigningRequestList);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 6E73B105D7E37D0A8E66F34DA1405B0F
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1CertificateSigningRequestList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1CertificateSigningRequestList.getApiVersion());
    }

    //BaseRock generated method id: ${testItems}, hash: AA7770AC445914FAF263F012A29DF072
    @Test
    void testItems() {
        List<V1CertificateSigningRequest> items = new ArrayList<>();
        V1CertificateSigningRequest item = mock(V1CertificateSigningRequest.class);
        items.add(item);
        v1CertificateSigningRequestList.setItems(items);
        assertEquals(items, v1CertificateSigningRequestList.getItems());
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 9B4BF4C273FC9C59F0A846F43D3F6305
    @Test
    void testAddItemsItem() {
        V1CertificateSigningRequest item = mock(V1CertificateSigningRequest.class);
        v1CertificateSigningRequestList.addItemsItem(item);
        assertThat(v1CertificateSigningRequestList.getItems(), hasSize(1));
        assertThat(v1CertificateSigningRequestList.getItems().get(0), is(item));
    }

    //BaseRock generated method id: ${testKind}, hash: BE55C609C3089DF0654ED0802E5B0D43
    @Test
    void testKind() {
        String kind = "CertificateSigningRequestList";
        v1CertificateSigningRequestList.setKind(kind);
        assertEquals(kind, v1CertificateSigningRequestList.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 85468ACCBB76BE316A28161CF467BC2D
    @Test
    void testMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1CertificateSigningRequestList.setMetadata(metadata);
        assertEquals(metadata, v1CertificateSigningRequestList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: F938EC22BC4F630437A6155C85583DAA
    @Test
    void testEquals() {
        V1CertificateSigningRequestList list1 = new V1CertificateSigningRequestList().apiVersion("v1").kind("CertificateSigningRequestList");
        V1CertificateSigningRequestList list2 = new V1CertificateSigningRequestList().apiVersion("v1").kind("CertificateSigningRequestList");
        assertThat(list1.equals(list2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 5DF4342376A99FA7073D18955BC916E7
    @Test
    void testHashCode() {
        V1CertificateSigningRequestList list1 = new V1CertificateSigningRequestList().apiVersion("v1").kind("CertificateSigningRequestList");
        V1CertificateSigningRequestList list2 = new V1CertificateSigningRequestList().apiVersion("v1").kind("CertificateSigningRequestList");
        assertThat(list1.hashCode(), equalTo(list2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 23A1E5614D1FC0BD72ECCA64BEA34AD1
    @Test
    void testToString() {
        v1CertificateSigningRequestList.apiVersion("v1").kind("CertificateSigningRequestList");
        String toString = v1CertificateSigningRequestList.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: EDFE70DAF41BC2E8479C593C397BB553
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1";
        v1CertificateSigningRequestList.setApiVersion(apiVersion);
        assertThat(v1CertificateSigningRequestList.getApiVersion(), equalTo(apiVersion));
    }

    //BaseRock generated method id: ${testGetItems}, hash: D462FE0897735A6D0BF9F63FF00449C7
    @Test
    void testGetItems() {
        List<V1CertificateSigningRequest> items = new ArrayList<>();
        V1CertificateSigningRequest item = mock(V1CertificateSigningRequest.class);
        items.add(item);
        v1CertificateSigningRequestList.setItems(items);
        assertThat(v1CertificateSigningRequestList.getItems(), equalTo(items));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 16F62C3B525173E7E2FEC2A9D1FE51C5
    @Test
    void testGetKind() {
        String kind = "CertificateSigningRequestList";
        v1CertificateSigningRequestList.setKind(kind);
        assertThat(v1CertificateSigningRequestList.getKind(), equalTo(kind));
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 4FF8B35E12209477C6E6A5D92D5153C6
    @Test
    void testGetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1CertificateSigningRequestList.setMetadata(metadata);
        assertThat(v1CertificateSigningRequestList.getMetadata(), equalTo(metadata));
    }
}
