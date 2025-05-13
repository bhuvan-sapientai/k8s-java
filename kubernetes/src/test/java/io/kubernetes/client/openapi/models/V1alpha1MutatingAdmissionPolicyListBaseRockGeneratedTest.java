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
import io.kubernetes.client.openapi.models.V1alpha1MutatingAdmissionPolicy;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha1MutatingAdmissionPolicyListBaseRockGeneratedTest {

    private V1alpha1MutatingAdmissionPolicyList v1alpha1MutatingAdmissionPolicyList;

    @BeforeEach
    void setUp() {
        v1alpha1MutatingAdmissionPolicyList = new V1alpha1MutatingAdmissionPolicyList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: FF6EADBB204F52A28598CCE6D7E3ED32
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1alpha1";
        v1alpha1MutatingAdmissionPolicyList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1alpha1MutatingAdmissionPolicyList.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: 80A8C35514EC19EBBE8E045FC5E1A1D2
    @Test
    void testSetApiVersion() {
        String apiVersion = "v1alpha1";
        v1alpha1MutatingAdmissionPolicyList.setApiVersion(apiVersion);
        assertThat(v1alpha1MutatingAdmissionPolicyList.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testGetItems}, hash: 6CE2CB4BFE23F3D3B7F8ED7A043CAC61
    @Test
    void testGetItems() {
        List<V1alpha1MutatingAdmissionPolicy> items = new ArrayList<>();
        items.add(mock(V1alpha1MutatingAdmissionPolicy.class));
        v1alpha1MutatingAdmissionPolicyList.setItems(items);
        assertThat(v1alpha1MutatingAdmissionPolicyList.getItems(), is(equalTo(items)));
    }

    //BaseRock generated method id: ${testSetItems}, hash: CCEB7519C620DE1A1620C129DB3734C6
    @Test
    void testSetItems() {
        List<V1alpha1MutatingAdmissionPolicy> items = new ArrayList<>();
        items.add(mock(V1alpha1MutatingAdmissionPolicy.class));
        v1alpha1MutatingAdmissionPolicyList.setItems(items);
        assertThat(v1alpha1MutatingAdmissionPolicyList.getItems(), hasSize(1));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: C9F300D093C338FE65973C184C1F8EFC
    @Test
    void testAddItemsItem() {
        V1alpha1MutatingAdmissionPolicy item = mock(V1alpha1MutatingAdmissionPolicy.class);
        v1alpha1MutatingAdmissionPolicyList.addItemsItem(item);
        assertThat(v1alpha1MutatingAdmissionPolicyList.getItems(), hasSize(1));
        assertThat(v1alpha1MutatingAdmissionPolicyList.getItems().get(0), is(equalTo(item)));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 7C8DC3CF520D9249B26913F4D5E0AC55
    @Test
    void testGetKind() {
        String kind = "MutatingAdmissionPolicyList";
        v1alpha1MutatingAdmissionPolicyList.setKind(kind);
        assertEquals(kind, v1alpha1MutatingAdmissionPolicyList.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: 739EF884F6C68F96F4C6AC1F1E3693D5
    @Test
    void testSetKind() {
        String kind = "MutatingAdmissionPolicyList";
        v1alpha1MutatingAdmissionPolicyList.setKind(kind);
        assertThat(v1alpha1MutatingAdmissionPolicyList.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 5EF41D2B3E8FE48F5A4C6EBB8E8E3932
    @Test
    void testGetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1alpha1MutatingAdmissionPolicyList.setMetadata(metadata);
        assertEquals(metadata, v1alpha1MutatingAdmissionPolicyList.getMetadata());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: 4EC18194E451D449BADD93177325ECF7
    @Test
    void testSetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1alpha1MutatingAdmissionPolicyList.setMetadata(metadata);
        assertThat(v1alpha1MutatingAdmissionPolicyList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 117B955F5CF66B88B5F28D6751712C1B
    @Test
    void testEquals() {
        V1alpha1MutatingAdmissionPolicyList list1 = new V1alpha1MutatingAdmissionPolicyList();
        V1alpha1MutatingAdmissionPolicyList list2 = new V1alpha1MutatingAdmissionPolicyList();
        list1.setApiVersion("v1alpha1");
        list2.setApiVersion("v1alpha1");
        List<V1alpha1MutatingAdmissionPolicy> items = new ArrayList<>();
        items.add(mock(V1alpha1MutatingAdmissionPolicy.class));
        list1.setItems(items);
        list2.setItems(items);
        list1.setKind("MutatingAdmissionPolicyList");
        list2.setKind("MutatingAdmissionPolicyList");
        V1ListMeta metadata = mock(V1ListMeta.class);
        list1.setMetadata(metadata);
        list2.setMetadata(metadata);
        assertThat(list1, is(equalTo(list2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 6DA7712ED877CC964CD0299431205293
    @Test
    void testHashCode() {
        V1alpha1MutatingAdmissionPolicyList list = new V1alpha1MutatingAdmissionPolicyList();
        list.setApiVersion("v1alpha1");
        List<V1alpha1MutatingAdmissionPolicy> items = new ArrayList<>();
        items.add(mock(V1alpha1MutatingAdmissionPolicy.class));
        list.setItems(items);
        list.setKind("MutatingAdmissionPolicyList");
        list.setMetadata(mock(V1ListMeta.class));
        int hashCode = list.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 91B8B1B3136DC6978B10E1291FFF2F84
    @Test
    void testToString() {
        V1alpha1MutatingAdmissionPolicyList list = new V1alpha1MutatingAdmissionPolicyList();
        list.setApiVersion("v1alpha1");
        List<V1alpha1MutatingAdmissionPolicy> items = new ArrayList<>();
        V1alpha1MutatingAdmissionPolicy mockPolicy = mock(V1alpha1MutatingAdmissionPolicy.class);
        when(mockPolicy.toString()).thenReturn("MockPolicy");
        items.add(mockPolicy);
        list.setItems(items);
        list.setKind("MutatingAdmissionPolicyList");
        V1ListMeta mockMetadata = mock(V1ListMeta.class);
        when(mockMetadata.toString()).thenReturn("MockMetadata");
        list.setMetadata(mockMetadata);
        String result = list.toString();
        assertNotNull(result);
        assertThat(result.contains("apiVersion"), is(true));
        assertThat(result.contains("items"), is(true));
        assertThat(result.contains("kind"), is(true));
        assertThat(result.contains("metadata"), is(true));
    }
}
