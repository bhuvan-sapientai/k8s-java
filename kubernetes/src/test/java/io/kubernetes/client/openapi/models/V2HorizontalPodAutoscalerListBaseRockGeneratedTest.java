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
import io.kubernetes.client.openapi.models.V2HorizontalPodAutoscaler;
import static org.mockito.Mockito.when;
import io.kubernetes.client.common.KubernetesListObject;
import java.util.ArrayList;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V2HorizontalPodAutoscalerListBaseRockGeneratedTest {

    private V2HorizontalPodAutoscalerList v2HorizontalPodAutoscalerList;

    @BeforeEach
    void setUp() {
        v2HorizontalPodAutoscalerList = new V2HorizontalPodAutoscalerList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 9AB4C6BC0E887E6B76B54D0C9C6FB9B6
    @Test
    void testGetApiVersion() {
        String apiVersion = "testApiVersion";
        v2HorizontalPodAutoscalerList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v2HorizontalPodAutoscalerList.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: 874CB107D4D27A21C4964951D845361E
    @Test
    void testSetApiVersion() {
        String apiVersion = "testApiVersion";
        v2HorizontalPodAutoscalerList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v2HorizontalPodAutoscalerList.getApiVersion());
    }

    //BaseRock generated method id: ${testGetItems}, hash: DEB931C10E90B1A400C68D96CBF568B3
    @Test
    void testGetItems() {
        List<V2HorizontalPodAutoscaler> items = new ArrayList<>();
        items.add(new V2HorizontalPodAutoscaler());
        v2HorizontalPodAutoscalerList.setItems(items);
        assertThat(v2HorizontalPodAutoscalerList.getItems(), is(equalTo(items)));
    }

    //BaseRock generated method id: ${testSetItems}, hash: F74A2C5CC2AD80BF8A1FE2DCEC225BF6
    @Test
    void testSetItems() {
        List<V2HorizontalPodAutoscaler> items = new ArrayList<>();
        items.add(new V2HorizontalPodAutoscaler());
        v2HorizontalPodAutoscalerList.setItems(items);
        assertThat(v2HorizontalPodAutoscalerList.getItems(), is(equalTo(items)));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 0D59DADB057860EA3411F2EBD06EAB56
    @Test
    void testAddItemsItem() {
        V2HorizontalPodAutoscaler item = new V2HorizontalPodAutoscaler();
        v2HorizontalPodAutoscalerList.addItemsItem(item);
        assertThat(v2HorizontalPodAutoscalerList.getItems(), hasSize(1));
        assertThat(v2HorizontalPodAutoscalerList.getItems().get(0), is(equalTo(item)));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 6EF52123828D5A6109C79A6498EEECDD
    @Test
    void testGetKind() {
        String kind = "testKind";
        v2HorizontalPodAutoscalerList.setKind(kind);
        assertEquals(kind, v2HorizontalPodAutoscalerList.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: 18D2D95545B7B59AF4C5AE71BE765899
    @Test
    void testSetKind() {
        String kind = "testKind";
        v2HorizontalPodAutoscalerList.setKind(kind);
        assertEquals(kind, v2HorizontalPodAutoscalerList.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: A3B3394B07C08FA69875BE1444C1C78B
    @Test
    void testGetMetadata() {
        V1ListMeta metadata = new V1ListMeta();
        v2HorizontalPodAutoscalerList.setMetadata(metadata);
        assertEquals(metadata, v2HorizontalPodAutoscalerList.getMetadata());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: F799AAB3C18E283EF42B1A78071EAA84
    @Test
    void testSetMetadata() {
        V1ListMeta metadata = new V1ListMeta();
        v2HorizontalPodAutoscalerList.setMetadata(metadata);
        assertEquals(metadata, v2HorizontalPodAutoscalerList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: EDC4E7601FBCA64A15BEC76D963B45D6
    @Test
    void testEquals() {
        V2HorizontalPodAutoscalerList list1 = new V2HorizontalPodAutoscalerList();
        V2HorizontalPodAutoscalerList list2 = new V2HorizontalPodAutoscalerList();
        list1.setApiVersion("v1");
        list1.setKind("HorizontalPodAutoscalerList");
        list1.setMetadata(new V1ListMeta());
        List<V2HorizontalPodAutoscaler> items1 = new ArrayList<>();
        items1.add(new V2HorizontalPodAutoscaler());
        list1.setItems(items1);
        list2.setApiVersion("v1");
        list2.setKind("HorizontalPodAutoscalerList");
        list2.setMetadata(new V1ListMeta());
        List<V2HorizontalPodAutoscaler> items2 = new ArrayList<>();
        items2.add(new V2HorizontalPodAutoscaler());
        list2.setItems(items2);
        assertThat(list1, is(equalTo(list2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 329A1B0D17E2D0C9BFBCB786B33D08EC
    @Test
    void testHashCode() {
        V2HorizontalPodAutoscalerList list = new V2HorizontalPodAutoscalerList();
        list.setApiVersion("v1");
        list.setKind("HorizontalPodAutoscalerList");
        list.setMetadata(new V1ListMeta());
        List<V2HorizontalPodAutoscaler> items = new ArrayList<>();
        items.add(new V2HorizontalPodAutoscaler());
        list.setItems(items);
        int hashCode = list.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 766ECD716F4AA9B4648525B5DA5C737A
    @Test
    void testToString() {
        V2HorizontalPodAutoscalerList list = new V2HorizontalPodAutoscalerList();
        list.setApiVersion("v1");
        list.setKind("HorizontalPodAutoscalerList");
        list.setMetadata(new V1ListMeta());
        List<V2HorizontalPodAutoscaler> items = new ArrayList<>();
        items.add(new V2HorizontalPodAutoscaler());
        list.setItems(items);
        String toString = list.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("items"), is(true));
    }

    //BaseRock generated method id: ${testImplementsKubernetesListObject}, hash: 57186C15D87F68B0CB78B3E78F850799
    @Test
    void testImplementsKubernetesListObject() {
        assertThat(v2HorizontalPodAutoscalerList instanceof KubernetesListObject, is(true));
    }

    //BaseRock generated method id: ${testGetMetadataAsKubernetesListObject}, hash: E5E1B627F1FCC6814382FEF6EB4E39DF
    @Test
    void testGetMetadataAsKubernetesListObject() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v2HorizontalPodAutoscalerList.setMetadata(metadata);
        KubernetesListObject kubernetesListObject = v2HorizontalPodAutoscalerList;
        assertEquals(metadata, kubernetesListObject.getMetadata());
    }

    //BaseRock generated method id: ${testGetItemsAsKubernetesListObject}, hash: 94EE6092DF5339806A2E5504838B4CE1
    @Test
    void testGetItemsAsKubernetesListObject() {
        List<V2HorizontalPodAutoscaler> items = new ArrayList<>();
        items.add(new V2HorizontalPodAutoscaler());
        v2HorizontalPodAutoscalerList.setItems(items);
        KubernetesListObject kubernetesListObject = v2HorizontalPodAutoscalerList;
        assertEquals(items, kubernetesListObject.getItems());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 34565E66E7BF86E277A4451ABDB0F2DA
    @Test
    void testValidateJsonElement() {
        // This test is a placeholder and should be implemented if the validateJsonElement method is public
        // and needs to be tested separately.
        assertNotNull(v2HorizontalPodAutoscalerList);
    }

    //BaseRock generated method id: ${testCustomTypeAdapterFactory}, hash: 25A16F5A254524519D156D867BCA55D6
    @Test
    void testCustomTypeAdapterFactory() {
        // This test is a placeholder and should be implemented if the CustomTypeAdapterFactory is public
        // and needs to be tested separately.
        assertNotNull(v2HorizontalPodAutoscalerList);
    }

    //BaseRock generated method id: ${testFromJson}, hash: FF0863D3B5C4E852D572EF03C4AB8B0D
    @Test
    void testFromJson() {
        // This test is a placeholder and should be implemented if the fromJson method is public
        // and needs to be tested separately.
        assertNotNull(v2HorizontalPodAutoscalerList);
    }

    //BaseRock generated method id: ${testToJson}, hash: 9EB722371B2EDE3B0D42BA45C263AF91
    @Test
    void testToJson() {
        // This test is a placeholder and should be implemented if the toJson method is public
        // and needs to be tested separately.
        assertNotNull(v2HorizontalPodAutoscalerList);
    }
}
