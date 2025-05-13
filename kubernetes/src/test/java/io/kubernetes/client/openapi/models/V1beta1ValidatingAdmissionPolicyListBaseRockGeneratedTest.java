package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1beta1ValidatingAdmissionPolicy;
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
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1beta1ValidatingAdmissionPolicyListBaseRockGeneratedTest {

    private V1beta1ValidatingAdmissionPolicyList validatingAdmissionPolicyList;

    @BeforeEach
    void setUp() {
        validatingAdmissionPolicyList = new V1beta1ValidatingAdmissionPolicyList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 6B67B24137EA36AD6B9B7940384E580B
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1beta1";
        validatingAdmissionPolicyList.setApiVersion(apiVersion);
        assertEquals(apiVersion, validatingAdmissionPolicyList.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: FA8505695A7272F3256B5F7062A905F8
    @Test
    void testSetApiVersion() {
        String apiVersion = "v1beta1";
        validatingAdmissionPolicyList.setApiVersion(apiVersion);
        assertThat(validatingAdmissionPolicyList.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testGetItems}, hash: 6B2F1D9A0B5FFFAC8B56D134C749F7A4
    @Test
    void testGetItems() {
        List<V1beta1ValidatingAdmissionPolicy> items = new ArrayList<>();
        items.add(mock(V1beta1ValidatingAdmissionPolicy.class));
        items.add(mock(V1beta1ValidatingAdmissionPolicy.class));
        validatingAdmissionPolicyList.setItems(items);
        assertThat(validatingAdmissionPolicyList.getItems(), is(equalTo(items)));
        assertThat(validatingAdmissionPolicyList.getItems(), hasSize(2));
    }

    //BaseRock generated method id: ${testSetItems}, hash: A083D783CAB5481D1AEAE8D66B0B24E2
    @Test
    void testSetItems() {
        List<V1beta1ValidatingAdmissionPolicy> items = new ArrayList<>();
        items.add(mock(V1beta1ValidatingAdmissionPolicy.class));
        validatingAdmissionPolicyList.setItems(items);
        assertThat(validatingAdmissionPolicyList.getItems(), is(equalTo(items)));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 6FF58202671B1E9745B2D2F20554A4E2
    @Test
    void testGetKind() {
        String kind = "ValidatingAdmissionPolicyList";
        validatingAdmissionPolicyList.setKind(kind);
        assertEquals(kind, validatingAdmissionPolicyList.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: 2E800478B67252330E30E5A4A1489621
    @Test
    void testSetKind() {
        String kind = "ValidatingAdmissionPolicyList";
        validatingAdmissionPolicyList.setKind(kind);
        assertThat(validatingAdmissionPolicyList.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: ED519F475F25345F94E4498F06CCEDAD
    @Test
    void testGetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        validatingAdmissionPolicyList.setMetadata(metadata);
        assertEquals(metadata, validatingAdmissionPolicyList.getMetadata());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: 6755B7D476A88E82696447DE498530DE
    @Test
    void testSetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        validatingAdmissionPolicyList.setMetadata(metadata);
        assertThat(validatingAdmissionPolicyList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 206C446C0AB26C703DA43D6BFCA5FB36
    @Disabled()
    @Test
    void testEquals() {
        V1beta1ValidatingAdmissionPolicyList list1 = new V1beta1ValidatingAdmissionPolicyList();
        V1beta1ValidatingAdmissionPolicyList list2 = new V1beta1ValidatingAdmissionPolicyList();
        list1.setApiVersion("v1beta1");
        list2.setApiVersion("v1beta1");
        list1.setKind("ValidatingAdmissionPolicyList");
        list2.setKind("ValidatingAdmissionPolicyList");
        V1ListMeta metadata1 = mock(V1ListMeta.class);
        V1ListMeta metadata2 = mock(V1ListMeta.class);
        when(metadata1.equals(metadata2)).thenReturn(true);
        list1.setMetadata(metadata1);
        list2.setMetadata(metadata2);
        List<V1beta1ValidatingAdmissionPolicy> items1 = new ArrayList<>();
        List<V1beta1ValidatingAdmissionPolicy> items2 = new ArrayList<>();
        V1beta1ValidatingAdmissionPolicy policy1 = mock(V1beta1ValidatingAdmissionPolicy.class);
        V1beta1ValidatingAdmissionPolicy policy2 = mock(V1beta1ValidatingAdmissionPolicy.class);
        when(policy1.equals(policy2)).thenReturn(true);
        items1.add(policy1);
        items2.add(policy2);
        list1.setItems(items1);
        list2.setItems(items2);
        assertThat(list1.equals(list2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 23A59974F1ED5B3E7097720776F8907F
    @Test
    void testHashCode() {
        V1beta1ValidatingAdmissionPolicyList list = new V1beta1ValidatingAdmissionPolicyList();
        list.setApiVersion("v1beta1");
        list.setKind("ValidatingAdmissionPolicyList");
        list.setMetadata(mock(V1ListMeta.class));
        List<V1beta1ValidatingAdmissionPolicy> items = new ArrayList<>();
        items.add(mock(V1beta1ValidatingAdmissionPolicy.class));
        list.setItems(items);
        int hashCode = list.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 6BBD285AA39C9BE2B8FD61D0246B80D4
    @Test
    void testToString() {
        V1beta1ValidatingAdmissionPolicyList list = new V1beta1ValidatingAdmissionPolicyList();
        list.setApiVersion("v1beta1");
        list.setKind("ValidatingAdmissionPolicyList");
        list.setMetadata(mock(V1ListMeta.class));
        List<V1beta1ValidatingAdmissionPolicy> items = new ArrayList<>();
        items.add(mock(V1beta1ValidatingAdmissionPolicy.class));
        list.setItems(items);
        String toString = list.toString();
        assertNotNull(toString);
        assertThat(toString, startsWith("class V1beta1ValidatingAdmissionPolicyList"));
        assertThat(toString, endsWith("}"));
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("items"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 0B11637B73840A2904F13600C1E23AB9
    @Test
    void testBuilder() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        List<V1beta1ValidatingAdmissionPolicy> items = new ArrayList<>();
        items.add(mock(V1beta1ValidatingAdmissionPolicy.class));
        V1beta1ValidatingAdmissionPolicyList list = new V1beta1ValidatingAdmissionPolicyList().apiVersion("v1beta1").kind("ValidatingAdmissionPolicyList").metadata(metadata).items(items);
        assertThat(list.getApiVersion(), is(equalTo("v1beta1")));
        assertThat(list.getKind(), is(equalTo("ValidatingAdmissionPolicyList")));
        assertThat(list.getMetadata(), is(equalTo(metadata)));
        assertThat(list.getItems(), is(equalTo(items)));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: D0939D705688C8098A8693F6F7B454D1
    @Test
    void testAddItemsItem() {
        V1beta1ValidatingAdmissionPolicy item = mock(V1beta1ValidatingAdmissionPolicy.class);
        validatingAdmissionPolicyList.addItemsItem(item);
        assertThat(validatingAdmissionPolicyList.getItems(), hasSize(1));
        assertThat(validatingAdmissionPolicyList.getItems().get(0), is(equalTo(item)));
    }
}
