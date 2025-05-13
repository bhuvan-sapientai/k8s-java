package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1beta1ValidatingAdmissionPolicyBinding;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.mockito.Mock;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1ValidatingAdmissionPolicyBindingListBaseRockGeneratedTest {

    @Mock
    private V1ListMeta mockMetadata;

    @Mock
    private V1beta1ValidatingAdmissionPolicyBinding mockBinding;

    private V1beta1ValidatingAdmissionPolicyBindingList bindingList;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        bindingList = new V1beta1ValidatingAdmissionPolicyBindingList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 914262A05B7169C20A17BA9BD54B1D69
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1beta1";
        bindingList.setApiVersion(apiVersion);
        assertEquals(apiVersion, bindingList.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: B4575C256357CCCEED6C185F91A61112
    @Test
    void testSetApiVersion() {
        String apiVersion = "v1beta1";
        bindingList.setApiVersion(apiVersion);
        assertEquals(apiVersion, bindingList.getApiVersion());
    }

    //BaseRock generated method id: ${testGetItems}, hash: CEF4EB47B647BA8AC9BBA27C6DC0807B
    @Test
    void testGetItems() {
        List<V1beta1ValidatingAdmissionPolicyBinding> items = new ArrayList<>();
        items.add(mockBinding);
        bindingList.setItems(items);
        assertEquals(items, bindingList.getItems());
    }

    //BaseRock generated method id: ${testSetItems}, hash: ACD06C3BF34EB4B727DB37239E025761
    @Test
    void testSetItems() {
        List<V1beta1ValidatingAdmissionPolicyBinding> items = new ArrayList<>();
        items.add(mockBinding);
        bindingList.setItems(items);
        assertEquals(items, bindingList.getItems());
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 446A57E87EB3F1B40E1B166EF171EA9A
    @Test
    void testAddItemsItem() {
        bindingList.addItemsItem(mockBinding);
        List<V1beta1ValidatingAdmissionPolicyBinding> items = bindingList.getItems();
        assertEquals(1, items.size());
        assertEquals(mockBinding, items.get(0));
    }

    //BaseRock generated method id: ${testGetKind}, hash: E87E783FE709F99511BBF6AAE255647E
    @Test
    void testGetKind() {
        String kind = "ValidatingAdmissionPolicyBindingList";
        bindingList.setKind(kind);
        assertEquals(kind, bindingList.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: CF680D098F24F6079E782404FDE273C7
    @Test
    void testSetKind() {
        String kind = "ValidatingAdmissionPolicyBindingList";
        bindingList.setKind(kind);
        assertEquals(kind, bindingList.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 541FFF9869A394F95E43BBB64C6F1B78
    @Test
    void testGetMetadata() {
        bindingList.setMetadata(mockMetadata);
        assertEquals(mockMetadata, bindingList.getMetadata());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: E817EC6424EFBAB4B50A54A0A0D63120
    @Test
    void testSetMetadata() {
        bindingList.setMetadata(mockMetadata);
        assertEquals(mockMetadata, bindingList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: 9726CCE241566C98447D15D14A7B2CBF
    @Test
    void testEquals() {
        V1beta1ValidatingAdmissionPolicyBindingList list1 = new V1beta1ValidatingAdmissionPolicyBindingList();
        V1beta1ValidatingAdmissionPolicyBindingList list2 = new V1beta1ValidatingAdmissionPolicyBindingList();
        assertTrue(list1.equals(list2));
        list1.setApiVersion("v1beta1");
        list1.setKind("ValidatingAdmissionPolicyBindingList");
        list1.setMetadata(mockMetadata);
        List<V1beta1ValidatingAdmissionPolicyBinding> items = new ArrayList<>();
        items.add(mockBinding);
        list1.setItems(items);
        list2.setApiVersion("v1beta1");
        list2.setKind("ValidatingAdmissionPolicyBindingList");
        list2.setMetadata(mockMetadata);
        list2.setItems(items);
        assertTrue(list1.equals(list2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 85D566B633ACACD8AE0FCAFD425779B1
    @Test
    void testHashCode() {
        V1beta1ValidatingAdmissionPolicyBindingList list1 = new V1beta1ValidatingAdmissionPolicyBindingList();
        V1beta1ValidatingAdmissionPolicyBindingList list2 = new V1beta1ValidatingAdmissionPolicyBindingList();
        assertEquals(list1.hashCode(), list2.hashCode());
        list1.setApiVersion("v1beta1");
        list1.setKind("ValidatingAdmissionPolicyBindingList");
        list1.setMetadata(mockMetadata);
        List<V1beta1ValidatingAdmissionPolicyBinding> items = new ArrayList<>();
        items.add(mockBinding);
        list1.setItems(items);
        list2.setApiVersion("v1beta1");
        list2.setKind("ValidatingAdmissionPolicyBindingList");
        list2.setMetadata(mockMetadata);
        list2.setItems(items);
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 319EA2F9EA7D31B6A3C56AC531A72DF7
    @Test
    void testToString() {
        bindingList.setApiVersion("v1beta1");
        bindingList.setKind("ValidatingAdmissionPolicyBindingList");
        bindingList.setMetadata(mockMetadata);
        List<V1beta1ValidatingAdmissionPolicyBinding> items = new ArrayList<>();
        items.add(mockBinding);
        bindingList.setItems(items);
        String expected = "class V1beta1ValidatingAdmissionPolicyBindingList {\n" + "    apiVersion: v1beta1\n" + "    items: [" + mockBinding.toString() + "]\n" + "    kind: ValidatingAdmissionPolicyBindingList\n" + "    metadata: " + mockMetadata.toString() + "\n" + "}";
        assertEquals(expected, bindingList.toString());
    }
}
