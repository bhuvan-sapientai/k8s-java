package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import static org.mockito.Mockito.doReturn;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.V1alpha3ResourceClaimTemplate;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1alpha3ResourceClaimTemplateListBaseRockGeneratedTest {

    private V1alpha3ResourceClaimTemplateList v1alpha3ResourceClaimTemplateList;

    @BeforeEach
    void setUp() {
        v1alpha3ResourceClaimTemplateList = new V1alpha3ResourceClaimTemplateList();
    }

    //BaseRock generated method id: ${testConstructor}, hash: CF169F7D18E92B16E5E1EBF7DCA40142
    @Test
    void testConstructor() {
        assertThat(v1alpha3ResourceClaimTemplateList, is(notNullValue()));
    }

    //BaseRock generated method id: ${testApiVersion}, hash: CD0A8DF0BCCB264B3E1CC9FB74B41139
    @Test
    void testApiVersion() {
        String apiVersion = "v1alpha3";
        v1alpha3ResourceClaimTemplateList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1alpha3ResourceClaimTemplateList.getApiVersion());
    }

    //BaseRock generated method id: ${testItems}, hash: 54E01DE6704EB9ACA028EE605EF895BC
    @Test
    void testItems() {
        List<V1alpha3ResourceClaimTemplate> items = new ArrayList<>();
        V1alpha3ResourceClaimTemplate item1 = mock(V1alpha3ResourceClaimTemplate.class);
        V1alpha3ResourceClaimTemplate item2 = mock(V1alpha3ResourceClaimTemplate.class);
        items.add(item1);
        items.add(item2);
        v1alpha3ResourceClaimTemplateList.setItems(items);
        assertThat(v1alpha3ResourceClaimTemplateList.getItems(), is(equalTo(items)));
        assertThat(v1alpha3ResourceClaimTemplateList.getItems(), hasSize(2));
    }

    //BaseRock generated method id: ${testKind}, hash: DFF92BE4A64DA7AC2C2F912D984E7690
    @Test
    void testKind() {
        String kind = "ResourceClaimTemplateList";
        v1alpha3ResourceClaimTemplateList.setKind(kind);
        assertEquals(kind, v1alpha3ResourceClaimTemplateList.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 0D0FCC8C1E0B3EFCA3F78A2D488BC14A
    @Test
    void testMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1alpha3ResourceClaimTemplateList.setMetadata(metadata);
        assertEquals(metadata, v1alpha3ResourceClaimTemplateList.getMetadata());
    }

    //BaseRock generated method id: ${testToString}, hash: 8A375E746DE35732CAD0AE573361F142
    @Test
    void testToString() {
        v1alpha3ResourceClaimTemplateList.setApiVersion("v1alpha3");
        v1alpha3ResourceClaimTemplateList.setKind("ResourceClaimTemplateList");
        v1alpha3ResourceClaimTemplateList.setMetadata(mock(V1ListMeta.class));
        List<V1alpha3ResourceClaimTemplate> items = new ArrayList<>();
        items.add(mock(V1alpha3ResourceClaimTemplate.class));
        v1alpha3ResourceClaimTemplateList.setItems(items);
        String toString = v1alpha3ResourceClaimTemplateList.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("items"), is(true));
    }

    //BaseRock generated method id: ${testEquals}, hash: 7096A04309B6FD29A2523CCFC61D38F7
    @Disabled()
    @Test
    void testEquals() {
        V1alpha3ResourceClaimTemplateList list1 = new V1alpha3ResourceClaimTemplateList();
        list1.setApiVersion("v1alpha3");
        list1.setKind("ResourceClaimTemplateList");
        V1ListMeta metadata1 = mock(V1ListMeta.class);
        list1.setMetadata(metadata1);
        List<V1alpha3ResourceClaimTemplate> items1 = new ArrayList<>();
        V1alpha3ResourceClaimTemplate item1 = mock(V1alpha3ResourceClaimTemplate.class);
        items1.add(item1);
        list1.setItems(items1);
        V1alpha3ResourceClaimTemplateList list2 = new V1alpha3ResourceClaimTemplateList();
        list2.setApiVersion("v1alpha3");
        list2.setKind("ResourceClaimTemplateList");
        V1ListMeta metadata2 = mock(V1ListMeta.class);
        list2.setMetadata(metadata2);
        List<V1alpha3ResourceClaimTemplate> items2 = new ArrayList<>();
        V1alpha3ResourceClaimTemplate item2 = mock(V1alpha3ResourceClaimTemplate.class);
        items2.add(item2);
        list2.setItems(items2);
        doReturn(true).when(metadata1).equals(metadata2);
        doReturn(true).when(item1).equals(item2);
        assertThat(list1.equals(list2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: A893F0D94E807BA071412187B4B70B07
    @Disabled()
    @Test
    void testHashCode() {
        V1alpha3ResourceClaimTemplateList list1 = new V1alpha3ResourceClaimTemplateList();
        list1.setApiVersion("v1alpha3");
        list1.setKind("ResourceClaimTemplateList");
        V1ListMeta metadata1 = mock(V1ListMeta.class);
        list1.setMetadata(metadata1);
        List<V1alpha3ResourceClaimTemplate> items1 = new ArrayList<>();
        V1alpha3ResourceClaimTemplate item1 = mock(V1alpha3ResourceClaimTemplate.class);
        items1.add(item1);
        list1.setItems(items1);
        V1alpha3ResourceClaimTemplateList list2 = new V1alpha3ResourceClaimTemplateList();
        list2.setApiVersion("v1alpha3");
        list2.setKind("ResourceClaimTemplateList");
        V1ListMeta metadata2 = mock(V1ListMeta.class);
        list2.setMetadata(metadata2);
        List<V1alpha3ResourceClaimTemplate> items2 = new ArrayList<>();
        V1alpha3ResourceClaimTemplate item2 = mock(V1alpha3ResourceClaimTemplate.class);
        items2.add(item2);
        list2.setItems(items2);
        doReturn(1).when(metadata1).hashCode();
        doReturn(1).when(metadata2).hashCode();
        doReturn(2).when(item1).hashCode();
        doReturn(2).when(item2).hashCode();
        assertThat(list1.hashCode(), is(equalTo(list2.hashCode())));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: FC93B2F76DB8E33378F4FB4FFE67A4E3
    @Test
    void testAddItemsItem() {
        V1alpha3ResourceClaimTemplate item = mock(V1alpha3ResourceClaimTemplate.class);
        v1alpha3ResourceClaimTemplateList.addItemsItem(item);
        assertThat(v1alpha3ResourceClaimTemplateList.getItems(), hasSize(1));
        assertThat(v1alpha3ResourceClaimTemplateList.getItems().get(0), is(equalTo(item)));
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 42AEA1C248787500AC7946CA3B65A1BE
    @Test
    void testGetApiVersion() {
        assertNull(v1alpha3ResourceClaimTemplateList.getApiVersion());
    }

    //BaseRock generated method id: ${testGetItems}, hash: FA7B94CCC89DDEFF69EBD660611BA88C
    @Test
    void testGetItems() {
        assertThat(v1alpha3ResourceClaimTemplateList.getItems(), is(notNullValue()));
        assertThat(v1alpha3ResourceClaimTemplateList.getItems(), hasSize(0));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 7C4CD59EAA7071DFE6BD2EEB0B4F4120
    @Test
    void testGetKind() {
        assertNull(v1alpha3ResourceClaimTemplateList.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: B776A2D9133871397ECFCB52A59881C9
    @Test
    void testGetMetadata() {
        assertNull(v1alpha3ResourceClaimTemplateList.getMetadata());
    }
}
