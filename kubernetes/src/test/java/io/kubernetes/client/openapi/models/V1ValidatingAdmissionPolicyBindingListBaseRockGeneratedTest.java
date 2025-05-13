package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1ValidatingAdmissionPolicyBinding;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class V1ValidatingAdmissionPolicyBindingListBaseRockGeneratedTest {

    @Mock
    private V1ListMeta mockMetadata;

    @Mock
    private V1ValidatingAdmissionPolicyBinding mockBinding;

    //BaseRock generated method id: ${testConstructor}, hash: EE893A5ACD1B6B0688F4F7FABB748524
    @Test
    void testConstructor() {
        V1ValidatingAdmissionPolicyBindingList list = new V1ValidatingAdmissionPolicyBindingList();
        assertNotNull(list);
        assertNull(list.getApiVersion());
        assertNotNull(list.getItems());
        assertTrue(list.getItems().isEmpty());
        assertNull(list.getKind());
        assertNull(list.getMetadata());
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 6FE46BC09BF5111A2B18DACEED387ADF
    @Test
    void testApiVersion() {
        V1ValidatingAdmissionPolicyBindingList list = new V1ValidatingAdmissionPolicyBindingList();
        String apiVersion = "v1";
        list.setApiVersion(apiVersion);
        assertEquals(apiVersion, list.getApiVersion());
    }

    //BaseRock generated method id: ${testApiVersionWithDifferentValues}, hash: 3B317B44139193102F00A5D12B395712
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "v1", "v2" })
    void testApiVersionWithDifferentValues(String apiVersion) {
        V1ValidatingAdmissionPolicyBindingList list = new V1ValidatingAdmissionPolicyBindingList();
        list.setApiVersion(apiVersion);
        assertEquals(apiVersion, list.getApiVersion());
    }

    //BaseRock generated method id: ${testItems}, hash: ECDB82006F6F40FB67C162507AF89886
    @Test
    void testItems() {
        V1ValidatingAdmissionPolicyBindingList list = new V1ValidatingAdmissionPolicyBindingList();
        List<V1ValidatingAdmissionPolicyBinding> items = new ArrayList<>();
        items.add(mockBinding);
        list.setItems(items);
        assertEquals(items, list.getItems());
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: 6DCAF8EA7EFB8F3BCBA427D2D1ED753C
    @Test
    void testAddItemsItem() {
        V1ValidatingAdmissionPolicyBindingList list = new V1ValidatingAdmissionPolicyBindingList();
        list.addItemsItem(mockBinding);
        assertEquals(1, list.getItems().size());
        assertTrue(list.getItems().contains(mockBinding));
    }

    //BaseRock generated method id: ${testKind}, hash: D0FA6E9819E512676924C379B423752B
    @Test
    void testKind() {
        V1ValidatingAdmissionPolicyBindingList list = new V1ValidatingAdmissionPolicyBindingList();
        String kind = "ValidatingAdmissionPolicyBindingList";
        list.setKind(kind);
        assertEquals(kind, list.getKind());
    }

    //BaseRock generated method id: ${testKindWithDifferentValues}, hash: E1DB108C5FE465DBF833606B5995FB3A
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "ValidatingAdmissionPolicyBindingList", "OtherKind" })
    void testKindWithDifferentValues(String kind) {
        V1ValidatingAdmissionPolicyBindingList list = new V1ValidatingAdmissionPolicyBindingList();
        list.setKind(kind);
        assertEquals(kind, list.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: BA5659770A3E7E5336B3B5B2D418B024
    @Test
    void testMetadata() {
        V1ValidatingAdmissionPolicyBindingList list = new V1ValidatingAdmissionPolicyBindingList();
        list.setMetadata(mockMetadata);
        assertEquals(mockMetadata, list.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: 9C18F1589D36634812A2439034EA6EB2
    @Test
    void testEquals() {
        V1ValidatingAdmissionPolicyBindingList list1 = new V1ValidatingAdmissionPolicyBindingList().apiVersion("v1").kind("ValidatingAdmissionPolicyBindingList").metadata(mockMetadata);
        list1.addItemsItem(mockBinding);
        V1ValidatingAdmissionPolicyBindingList list2 = new V1ValidatingAdmissionPolicyBindingList().apiVersion("v1").kind("ValidatingAdmissionPolicyBindingList").metadata(mockMetadata);
        list2.addItemsItem(mockBinding);
        assertEquals(list1, list2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 7659A6B320C1AF1153E2D17F3D6ECB56
    @Test
    void testHashCode() {
        V1ValidatingAdmissionPolicyBindingList list1 = new V1ValidatingAdmissionPolicyBindingList().apiVersion("v1").kind("ValidatingAdmissionPolicyBindingList").metadata(mockMetadata);
        list1.addItemsItem(mockBinding);
        V1ValidatingAdmissionPolicyBindingList list2 = new V1ValidatingAdmissionPolicyBindingList().apiVersion("v1").kind("ValidatingAdmissionPolicyBindingList").metadata(mockMetadata);
        list2.addItemsItem(mockBinding);
        assertEquals(list1.hashCode(), list2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 5BAC19F150222848477F83DE16FABA64
    @Test
    void testToString() {
        V1ValidatingAdmissionPolicyBindingList list = new V1ValidatingAdmissionPolicyBindingList().apiVersion("v1").kind("ValidatingAdmissionPolicyBindingList").metadata(mockMetadata);
        list.addItemsItem(mockBinding);
        String toString = list.toString();
        assertTrue(toString.contains("apiVersion"));
        assertTrue(toString.contains("kind"));
        assertTrue(toString.contains("metadata"));
        assertTrue(toString.contains("items"));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 3A4ECF6BE3B5A4D0CD9BDEFF23D8AC91
    @Test
    void testBuilderPattern() {
        V1ValidatingAdmissionPolicyBindingList list = new V1ValidatingAdmissionPolicyBindingList().apiVersion("v1").kind("ValidatingAdmissionPolicyBindingList").metadata(mockMetadata).addItemsItem(mockBinding);
        assertEquals("v1", list.getApiVersion());
        assertEquals("ValidatingAdmissionPolicyBindingList", list.getKind());
        assertEquals(mockMetadata, list.getMetadata());
        assertEquals(1, list.getItems().size());
        assertTrue(list.getItems().contains(mockBinding));
    }
}
