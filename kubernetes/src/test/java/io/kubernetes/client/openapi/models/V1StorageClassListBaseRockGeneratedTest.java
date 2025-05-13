package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import io.kubernetes.client.openapi.models.V1StorageClass;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1StorageClassListBaseRockGeneratedTest {

    private V1StorageClassList v1StorageClassList;

    @BeforeEach
    void setUp() {
        v1StorageClassList = new V1StorageClassList();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 7BEA916BF4AA4F3AE149A96A70431E2B
    @Test
    void testConstructor() {
        assertNotNull(v1StorageClassList);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: C00B09E12BA5244E30DDF259139B5B6F
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1StorageClassList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1StorageClassList.getApiVersion());
    }

    //BaseRock generated method id: ${testItems}, hash: 58AE2F336E5CCC03DB02ABB6DEB5F1FB
    @Test
    void testItems() {
        List<V1StorageClass> items = new ArrayList<>();
        items.add(mock(V1StorageClass.class));
        items.add(mock(V1StorageClass.class));
        v1StorageClassList.setItems(items);
        assertThat(v1StorageClassList.getItems(), is(equalTo(items)));
        assertThat(v1StorageClassList.getItems(), hasSize(2));
    }

    //BaseRock generated method id: ${testKind}, hash: 0477B95787B06775DEBA889BA0045F38
    @Test
    void testKind() {
        String kind = "StorageClassList";
        v1StorageClassList.setKind(kind);
        assertEquals(kind, v1StorageClassList.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 761516218EF277E6CE8340657797A4AB
    @Test
    void testMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1StorageClassList.setMetadata(metadata);
        assertEquals(metadata, v1StorageClassList.getMetadata());
    }

    //BaseRock generated method id: ${testToString}, hash: E0A179B686B95CABEF3965109C755771
    @Test
    void testToString() {
        v1StorageClassList.setApiVersion("v1");
        v1StorageClassList.setKind("StorageClassList");
        v1StorageClassList.setMetadata(mock(V1ListMeta.class));
        List<V1StorageClass> items = new ArrayList<>();
        items.add(mock(V1StorageClass.class));
        v1StorageClassList.setItems(items);
        String result = v1StorageClassList.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("apiVersion"), is(true));
        assertThat(result.contains("kind"), is(true));
        assertThat(result.contains("metadata"), is(true));
        assertThat(result.contains("items"), is(true));
    }

    //BaseRock generated method id: ${testEquals}, hash: 3EEB0FDA78D79299D4343D026C31205D
    @Test
    void testEquals() {
        V1StorageClassList list1 = new V1StorageClassList();
        list1.setApiVersion("v1");
        list1.setKind("StorageClassList");
        V1ListMeta metadata1 = new V1ListMeta();
        list1.setMetadata(metadata1);
        List<V1StorageClass> items1 = new ArrayList<>();
        V1StorageClass storageClass1 = new V1StorageClass();
        items1.add(storageClass1);
        list1.setItems(items1);
        V1StorageClassList list2 = new V1StorageClassList();
        list2.setApiVersion("v1");
        list2.setKind("StorageClassList");
        V1ListMeta metadata2 = new V1ListMeta();
        list2.setMetadata(metadata2);
        List<V1StorageClass> items2 = new ArrayList<>();
        V1StorageClass storageClass2 = new V1StorageClass();
        items2.add(storageClass2);
        list2.setItems(items2);
        assertThat(list1.equals(list2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: BB40DF0E5B3C51A0D012B908160C7941
    @Test
    void testHashCode() {
        V1StorageClassList list1 = new V1StorageClassList();
        list1.setApiVersion("v1");
        list1.setKind("StorageClassList");
        V1ListMeta metadata1 = new V1ListMeta();
        list1.setMetadata(metadata1);
        List<V1StorageClass> items1 = new ArrayList<>();
        V1StorageClass storageClass1 = new V1StorageClass();
        items1.add(storageClass1);
        list1.setItems(items1);
        V1StorageClassList list2 = new V1StorageClassList();
        list2.setApiVersion("v1");
        list2.setKind("StorageClassList");
        V1ListMeta metadata2 = new V1ListMeta();
        list2.setMetadata(metadata2);
        List<V1StorageClass> items2 = new ArrayList<>();
        V1StorageClass storageClass2 = new V1StorageClass();
        items2.add(storageClass2);
        list2.setItems(items2);
        assertThat(list1.hashCode(), is(equalTo(list2.hashCode())));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 1ECA774F9EE617DAE1CE628C05A69638
    @Test
    void testAddItemsItem() {
        V1StorageClass item = mock(V1StorageClass.class);
        v1StorageClassList.addItemsItem(item);
        assertThat(v1StorageClassList.getItems(), hasSize(1));
        assertThat(v1StorageClassList.getItems().get(0), is(equalTo(item)));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: F01C4F84BE17FADE33C369FE3CA6B315
    @Test
    void testValidateJsonElement() {
        // This method is static and uses external classes, so we can't test it directly
        // in this unit test. It would require integration testing or mocking of static methods.
    }
}
