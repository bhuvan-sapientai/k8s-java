package io.kubernetes.client.openapi.models;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.V1Ingress;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.common.KubernetesListObject;
import java.util.ArrayList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1IngressListBaseRockGeneratedTest {

    private V1IngressList v1IngressList;

    @BeforeEach
    void setUp() {
        v1IngressList = new V1IngressList();
    }

    //BaseRock generated method id: ${testV1IngressListImplementsKubernetesListObject}, hash: FCE6430E8C688C18B48B465AC25F9B0C
    @Test
    void testV1IngressListImplementsKubernetesListObject() {
        assertThat(v1IngressList, is(notNullValue()));
        assertThat(v1IngressList instanceof KubernetesListObject, is(true));
    }

    //BaseRock generated method id: ${testApiVersion}, hash: EA7939B5376D7AF79F2331D380ED6B47
    @Test
    void testApiVersion() {
        String apiVersion = "networking.k8s.io/v1";
        v1IngressList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1IngressList.getApiVersion());
    }

    //BaseRock generated method id: ${testItems}, hash: 854E7B533202397B7F1BBE1DE83C1F0C
    @Test
    void testItems() {
        List<V1Ingress> ingressList = new ArrayList<>();
        V1Ingress ingress1 = mock(V1Ingress.class);
        V1Ingress ingress2 = mock(V1Ingress.class);
        ingressList.add(ingress1);
        ingressList.add(ingress2);
        v1IngressList.setItems(ingressList);
        assertThat(v1IngressList.getItems(), hasSize(2));
        assertThat(v1IngressList.getItems(), containsInAnyOrder(ingress1, ingress2));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: D5901EAC8017CCFF8199A1026E943E5F
    @Test
    void testAddItemsItem() {
        V1Ingress ingress = mock(V1Ingress.class);
        v1IngressList.addItemsItem(ingress);
        assertThat(v1IngressList.getItems(), hasSize(1));
        assertThat(v1IngressList.getItems().get(0), is(ingress));
    }

    //BaseRock generated method id: ${testKind}, hash: 36C8173ED5A881BB41D964876F7B411D
    @Test
    void testKind() {
        String kind = "IngressList";
        v1IngressList.setKind(kind);
        assertEquals(kind, v1IngressList.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 9BFF4CDCC5ED00F9911DB616DABDA477
    @Test
    void testMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1IngressList.setMetadata(metadata);
        assertEquals(metadata, v1IngressList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: FD3BDF8A1AD1B0FD2BBBB82C03E07320
    @Test
    void testEquals() {
        V1IngressList list1 = new V1IngressList();
        V1IngressList list2 = new V1IngressList();
        String apiVersion = "networking.k8s.io/v1";
        String kind = "IngressList";
        V1ListMeta metadata = mock(V1ListMeta.class);
        List<V1Ingress> items = new ArrayList<>();
        items.add(mock(V1Ingress.class));
        list1.setApiVersion(apiVersion);
        list1.setKind(kind);
        list1.setMetadata(metadata);
        list1.setItems(items);
        list2.setApiVersion(apiVersion);
        list2.setKind(kind);
        list2.setMetadata(metadata);
        list2.setItems(items);
        assertThat(list1.equals(list2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: C1FBE08551C1B0B1B7E0CF726BE3FAF0
    @Test
    void testHashCode() {
        V1IngressList list1 = new V1IngressList();
        V1IngressList list2 = new V1IngressList();
        String apiVersion = "networking.k8s.io/v1";
        String kind = "IngressList";
        V1ListMeta metadata = mock(V1ListMeta.class);
        List<V1Ingress> items = new ArrayList<>();
        items.add(mock(V1Ingress.class));
        list1.setApiVersion(apiVersion);
        list1.setKind(kind);
        list1.setMetadata(metadata);
        list1.setItems(items);
        list2.setApiVersion(apiVersion);
        list2.setKind(kind);
        list2.setMetadata(metadata);
        list2.setItems(items);
        assertThat(list1.hashCode(), is(equalTo(list2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: E55F4A9B00C8C11D438DC50D5AFE4F14
    @Test
    void testToString() {
        v1IngressList.setApiVersion("networking.k8s.io/v1");
        v1IngressList.setKind("IngressList");
        v1IngressList.setMetadata(mock(V1ListMeta.class));
        List<V1Ingress> items = new ArrayList<>();
        items.add(mock(V1Ingress.class));
        v1IngressList.setItems(items);
        String toString = v1IngressList.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("items"), is(true));
    }

    //BaseRock generated method id: ${testSetNullApiVersion}, hash: 7A048170B3A57C1A60DF14921483DB63
    @Test
    void testSetNullApiVersion() {
        v1IngressList.setApiVersion(null);
        assertThat(v1IngressList.getApiVersion(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetNullItems}, hash: 77313B072DF0C42E1826DCA2D966D872
    @Test
    void testSetNullItems() {
        v1IngressList.setItems(null);
        assertThat(v1IngressList.getItems(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetNullKind}, hash: B6ED52F481CD497D860E6BFA976B614E
    @Test
    void testSetNullKind() {
        v1IngressList.setKind(null);
        assertThat(v1IngressList.getKind(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetNullMetadata}, hash: 0F496D3FFD8A663CE9CFEB5C1D357984
    @Test
    void testSetNullMetadata() {
        v1IngressList.setMetadata(null);
        assertThat(v1IngressList.getMetadata(), is(nullValue()));
    }

    //BaseRock generated method id: ${testGetItemsAsKubernetesObjects}, hash: 3499B44A315B3EA79580F11FB6D8590A
    @Test
    void testGetItemsAsKubernetesObjects() {
        List<V1Ingress> ingressList = new ArrayList<>();
        V1Ingress ingress1 = mock(V1Ingress.class);
        V1Ingress ingress2 = mock(V1Ingress.class);
        ingressList.add(ingress1);
        ingressList.add(ingress2);
        v1IngressList.setItems(ingressList);
        List<? extends KubernetesObject> kubernetesObjects = v1IngressList.getItems();
        assertNotNull(kubernetesObjects);
        assertEquals(2, kubernetesObjects.size());
        assertThat(kubernetesObjects.get(0), is(ingress1));
        assertThat(kubernetesObjects.get(1), is(ingress2));
    }
}
