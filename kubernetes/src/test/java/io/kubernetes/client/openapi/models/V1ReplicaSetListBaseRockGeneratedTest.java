package io.kubernetes.client.openapi.models;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1ReplicaSet;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1ReplicaSetList;
import static org.mockito.Mockito.when;
import io.kubernetes.client.common.KubernetesListObject;
import java.util.ArrayList;
import static org.hamcrest.Matchers.sameInstance;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ReplicaSetListBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1ReplicaSetListConstructor}, hash: C98622457E358A82C57BB15E4227D07B
    @Test
    void testV1ReplicaSetListConstructor() {
        V1ReplicaSetList replicaSetList = new V1ReplicaSetList();
        assertNotNull(replicaSetList);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 5915E6B83888A3CDBEBD844CAB2C27B8
    @Test
    void testApiVersion() {
        V1ReplicaSetList replicaSetList = new V1ReplicaSetList();
        String apiVersion = "v1";
        replicaSetList.setApiVersion(apiVersion);
        assertEquals(apiVersion, replicaSetList.getApiVersion());
    }

    //BaseRock generated method id: ${testItems}, hash: DBEB884FAECD2BBDD7F1FD826A9B9559
    @Test
    void testItems() {
        V1ReplicaSetList replicaSetList = new V1ReplicaSetList();
        List<V1ReplicaSet> items = new ArrayList<>();
        items.add(new V1ReplicaSet());
        items.add(new V1ReplicaSet());
        replicaSetList.setItems(items);
        assertThat(replicaSetList.getItems(), is(sameInstance(items)));
        assertThat(replicaSetList.getItems(), hasSize(2));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: DB9C0D238CCC54EA67AEBB6078538DB0
    @Test
    void testAddItemsItem() {
        V1ReplicaSetList replicaSetList = new V1ReplicaSetList();
        V1ReplicaSet replicaSet = new V1ReplicaSet();
        replicaSetList.addItemsItem(replicaSet);
        assertThat(replicaSetList.getItems(), hasSize(1));
        assertThat(replicaSetList.getItems().get(0), is(sameInstance(replicaSet)));
    }

    //BaseRock generated method id: ${testKind}, hash: E2B5AD1740ADC802517A538EB3DBF305
    @Test
    void testKind() {
        V1ReplicaSetList replicaSetList = new V1ReplicaSetList();
        String kind = "ReplicaSetList";
        replicaSetList.setKind(kind);
        assertEquals(kind, replicaSetList.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 57FEFD4C514ECB92394D0DDAB2698B43
    @Test
    void testMetadata() {
        V1ReplicaSetList replicaSetList = new V1ReplicaSetList();
        V1ListMeta metadata = new V1ListMeta();
        replicaSetList.setMetadata(metadata);
        assertThat(replicaSetList.getMetadata(), is(sameInstance(metadata)));
    }

    //BaseRock generated method id: ${testEquals}, hash: B1883DBF2E482AB9823D13EA9A8B324D
    @Test
    void testEquals() {
        V1ReplicaSetList replicaSetList1 = new V1ReplicaSetList().apiVersion("v1").kind("ReplicaSetList").metadata(new V1ListMeta()).items(new ArrayList<>());
        V1ReplicaSetList replicaSetList2 = new V1ReplicaSetList().apiVersion("v1").kind("ReplicaSetList").metadata(new V1ListMeta()).items(new ArrayList<>());
        assertThat(replicaSetList1.equals(replicaSetList2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 6E06D43E91AE2CB037282BDDD6146831
    @Test
    void testHashCode() {
        V1ReplicaSetList replicaSetList1 = new V1ReplicaSetList().apiVersion("v1").kind("ReplicaSetList").metadata(new V1ListMeta()).items(new ArrayList<>());
        V1ReplicaSetList replicaSetList2 = new V1ReplicaSetList().apiVersion("v1").kind("ReplicaSetList").metadata(new V1ListMeta()).items(new ArrayList<>());
        assertThat(replicaSetList1.hashCode(), is(equalTo(replicaSetList2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: C45EF921E50516434B9B37413835C7DF
    @Test
    void testToString() {
        V1ReplicaSetList replicaSetList = new V1ReplicaSetList().apiVersion("v1").kind("ReplicaSetList").metadata(new V1ListMeta()).items(new ArrayList<>());
        String toString = replicaSetList.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("items"), is(true));
    }

    //BaseRock generated method id: ${testImplementsKubernetesListObject}, hash: C86DBD5BF9D1F9923C93F1D9624A20BA
    @Test
    void testImplementsKubernetesListObject() {
        V1ReplicaSetList replicaSetList = new V1ReplicaSetList();
        assertThat(replicaSetList instanceof KubernetesListObject, is(true));
    }

    //BaseRock generated method id: ${testGetMetadataAsKubernetesListObject}, hash: 5EC81BA61FC56EA04EEB1018235CC27A
    @Test
    void testGetMetadataAsKubernetesListObject() {
        V1ReplicaSetList replicaSetList = new V1ReplicaSetList();
        V1ListMeta metadata = new V1ListMeta();
        replicaSetList.setMetadata(metadata);
        KubernetesListObject kubernetesListObject = replicaSetList;
        assertThat(kubernetesListObject.getMetadata(), is(sameInstance(metadata)));
    }

    //BaseRock generated method id: ${testGetItemsAsKubernetesListObject}, hash: 3A3A8777BC7D2AA5AB19F085AEEE75A1
    @Test
    void testGetItemsAsKubernetesListObject() {
        V1ReplicaSetList replicaSetList = new V1ReplicaSetList();
        List<V1ReplicaSet> items = new ArrayList<>();
        items.add(new V1ReplicaSet());
        replicaSetList.setItems(items);
        KubernetesListObject kubernetesListObject = replicaSetList;
        List<? extends KubernetesObject> kubernetesItems = kubernetesListObject.getItems();
        assertThat(kubernetesItems, is(sameInstance(items)));
        assertThat(kubernetesItems.get(0) instanceof KubernetesObject, is(true));
    }
}
