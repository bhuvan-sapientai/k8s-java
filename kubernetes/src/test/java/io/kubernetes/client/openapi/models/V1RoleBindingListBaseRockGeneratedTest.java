package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1RoleBinding;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
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
class V1RoleBindingListBaseRockGeneratedTest {

    private V1RoleBindingList v1RoleBindingList;

    @BeforeEach
    void setUp() {
        v1RoleBindingList = new V1RoleBindingList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 6CF510E52FA818662E256BF7D9030EA7
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1";
        v1RoleBindingList.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1RoleBindingList.getApiVersion());
    }

    //BaseRock generated method id: ${testGetItems}, hash: 7B6AFA9660440C286050CE2BD9A36C6E
    @Test
    void testGetItems() {
        List<V1RoleBinding> items = new ArrayList<>();
        items.add(mock(V1RoleBinding.class));
        items.add(mock(V1RoleBinding.class));
        v1RoleBindingList.setItems(items);
        assertThat(v1RoleBindingList.getItems(), is(equalTo(items)));
        assertThat(v1RoleBindingList.getItems(), hasSize(2));
    }

    //BaseRock generated method id: ${testGetKind}, hash: CF6D551E1F75C1EC17896F8B8D7F4107
    @Test
    void testGetKind() {
        String kind = "RoleBindingList";
        v1RoleBindingList.setKind(kind);
        assertEquals(kind, v1RoleBindingList.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 76A5B766A8255473AF87E820778F0ED6
    @Test
    void testGetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        v1RoleBindingList.setMetadata(metadata);
        assertThat(v1RoleBindingList.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 12AED3D7CDF897AA900B58BB89476EB9
    @Test
    void testEquals() {
        V1RoleBindingList list1 = new V1RoleBindingList();
        V1RoleBindingList list2 = new V1RoleBindingList();
        String apiVersion = "v1";
        String kind = "RoleBindingList";
        V1ListMeta metadata = mock(V1ListMeta.class);
        List<V1RoleBinding> items = new ArrayList<>();
        V1RoleBinding roleBinding = mock(V1RoleBinding.class);
        items.add(roleBinding);
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

    //BaseRock generated method id: ${testHashCode}, hash: 5A3ACD3A2EBFD0FACA272DA31EC8229E
    @Test
    void testHashCode() {
        V1RoleBindingList list = new V1RoleBindingList();
        list.setApiVersion("v1");
        list.setKind("RoleBindingList");
        list.setMetadata(mock(V1ListMeta.class));
        List<V1RoleBinding> items = new ArrayList<>();
        items.add(mock(V1RoleBinding.class));
        list.setItems(items);
        int hashCode = list.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 8E3BCA2805FD762FDEB0062FFB8ADD98
    @Test
    void testToString() {
        V1RoleBindingList list = new V1RoleBindingList();
        list.setApiVersion("v1");
        list.setKind("RoleBindingList");
        list.setMetadata(mock(V1ListMeta.class));
        List<V1RoleBinding> items = new ArrayList<>();
        items.add(mock(V1RoleBinding.class));
        list.setItems(items);
        String toString = list.toString();
        assertNotNull(toString);
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("items"), is(true));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 434E2D09F48D0DB856ED00979114FD86
    @Test
    void testAddItemsItem() {
        V1RoleBinding roleBinding = mock(V1RoleBinding.class);
        v1RoleBindingList.addItemsItem(roleBinding);
        assertThat(v1RoleBindingList.getItems(), hasSize(1));
        assertThat(v1RoleBindingList.getItems().get(0), is(equalTo(roleBinding)));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: F01C4F84BE17FADE33C369FE3CA6B315
    @Test
    void testValidateJsonElement() {
        // This method is static and its implementation is not visible in the provided code.
        // Therefore, we cannot test it directly. Consider testing it through its usage in other methods if applicable.
    }
}
