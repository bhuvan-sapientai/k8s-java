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
import io.kubernetes.client.openapi.models.V1beta1ServiceCIDR;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1ServiceCIDRListBaseRockGeneratedTest {

    private V1beta1ServiceCIDRList serviceCIDRList;

    @BeforeEach
    void setUp() {
        serviceCIDRList = new V1beta1ServiceCIDRList();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 756023D614290EDA698EF143862B532B
    @Test
    void testConstructor() {
        assertNotNull(serviceCIDRList);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: C5D38F6809669ABF9883974DCD4757F8
    @Test
    void testApiVersion() {
        String apiVersion = "v1beta1";
        serviceCIDRList.setApiVersion(apiVersion);
        assertEquals(apiVersion, serviceCIDRList.getApiVersion());
    }

    //BaseRock generated method id: ${testItems}, hash: 0C3BF1EC8E300E486B23AC7F2B43697C
    @Test
    void testItems() {
        List<V1beta1ServiceCIDR> items = new ArrayList<>();
        V1beta1ServiceCIDR item1 = mock(V1beta1ServiceCIDR.class);
        V1beta1ServiceCIDR item2 = mock(V1beta1ServiceCIDR.class);
        items.add(item1);
        items.add(item2);
        serviceCIDRList.setItems(items);
        assertEquals(items, serviceCIDRList.getItems());
        assertThat(serviceCIDRList.getItems(), hasSize(2));
    }

    //BaseRock generated method id: ${testKind}, hash: C63F65B468E90A2EE26479F14DD78975
    @Test
    void testKind() {
        String kind = "ServiceCIDRList";
        serviceCIDRList.setKind(kind);
        assertEquals(kind, serviceCIDRList.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: A925606982CB075DBB607D7CCB795ACC
    @Test
    void testMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        serviceCIDRList.setMetadata(metadata);
        assertEquals(metadata, serviceCIDRList.getMetadata());
    }

    //BaseRock generated method id: ${testToString}, hash: F0917D19C97A801BDE09D2EE82597F37
    @Test
    void testToString() {
        serviceCIDRList.setApiVersion("v1beta1");
        serviceCIDRList.setKind("ServiceCIDRList");
        V1ListMeta metadata = mock(V1ListMeta.class);
        when(metadata.toString()).thenReturn("V1ListMeta(resourceVersion=1)");
        serviceCIDRList.setMetadata(metadata);
        List<V1beta1ServiceCIDR> items = new ArrayList<>();
        V1beta1ServiceCIDR item = mock(V1beta1ServiceCIDR.class);
        when(item.toString()).thenReturn("V1beta1ServiceCIDR(metadata=V1ObjectMeta(name=test-cidr))");
        items.add(item);
        serviceCIDRList.setItems(items);
        String expected = "class V1beta1ServiceCIDRList {\n    apiVersion: v1beta1\n    items: [V1beta1ServiceCIDR(metadata=V1ObjectMeta(name=test-cidr))]\n    kind: ServiceCIDRList\n    metadata: V1ListMeta(resourceVersion=1)\n}";
        assertEquals(expected, serviceCIDRList.toString());
    }

    //BaseRock generated method id: ${testEquals}, hash: 988AB9F18350F5DE907029BB0C6F8E15
    @Test
    void testEquals() {
        V1beta1ServiceCIDRList list1 = new V1beta1ServiceCIDRList().apiVersion("v1beta1").kind("ServiceCIDRList");
        V1beta1ServiceCIDRList list2 = new V1beta1ServiceCIDRList().apiVersion("v1beta1").kind("ServiceCIDRList");
        assertThat(list1, is(equalTo(list2)));
        list1.setMetadata(mock(V1ListMeta.class));
        assertThat(list1, is(notNullValue()));
        assertThat(list1.equals(list2), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: FE66069936A3E1F01EC5AF89FAD797BC
    @Test
    void testHashCode() {
        V1beta1ServiceCIDRList list1 = new V1beta1ServiceCIDRList().apiVersion("v1beta1").kind("ServiceCIDRList");
        V1beta1ServiceCIDRList list2 = new V1beta1ServiceCIDRList().apiVersion("v1beta1").kind("ServiceCIDRList");
        assertEquals(list1.hashCode(), list2.hashCode());
        list1.setMetadata(mock(V1ListMeta.class));
        assertThat(list1.hashCode(), is(notNullValue()));
        assertThat(list1.hashCode() == list2.hashCode(), is(false));
    }
}
