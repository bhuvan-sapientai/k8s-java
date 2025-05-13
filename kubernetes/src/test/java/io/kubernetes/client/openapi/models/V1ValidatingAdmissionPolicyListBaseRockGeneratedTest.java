package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1ValidatingAdmissionPolicy;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ValidatingAdmissionPolicyListBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1ValidatingAdmissionPolicyListConstructor}, hash: E052F605C51ABDAFBABBB3697DADA053
    @Test
    void testV1ValidatingAdmissionPolicyListConstructor() {
        V1ValidatingAdmissionPolicyList policyList = new V1ValidatingAdmissionPolicyList();
        assertNotNull(policyList);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: CC4D48CB96243A96CEE585BC96DB6A37
    @Test
    void testApiVersion() {
        V1ValidatingAdmissionPolicyList policyList = new V1ValidatingAdmissionPolicyList();
        String apiVersion = "v1";
        policyList.setApiVersion(apiVersion);
        assertEquals(apiVersion, policyList.getApiVersion());
    }

    //BaseRock generated method id: ${testItems}, hash: 6470B4664DA859E1963FE75F0FBCA56B
    @Test
    void testItems() {
        V1ValidatingAdmissionPolicyList policyList = new V1ValidatingAdmissionPolicyList();
        List<V1ValidatingAdmissionPolicy> items = new ArrayList<>();
        V1ValidatingAdmissionPolicy policy = mock(V1ValidatingAdmissionPolicy.class);
        items.add(policy);
        policyList.setItems(items);
        assertEquals(items, policyList.getItems());
    }

    //BaseRock generated method id: ${testKind}, hash: BAB873A72633B2F646CBF9029E45D0D7
    @Test
    void testKind() {
        V1ValidatingAdmissionPolicyList policyList = new V1ValidatingAdmissionPolicyList();
        String kind = "ValidatingAdmissionPolicyList";
        policyList.setKind(kind);
        assertEquals(kind, policyList.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 47E4004D194234C56D45FE06DAB775B6
    @Test
    void testMetadata() {
        V1ValidatingAdmissionPolicyList policyList = new V1ValidatingAdmissionPolicyList();
        V1ListMeta metadata = mock(V1ListMeta.class);
        policyList.setMetadata(metadata);
        assertEquals(metadata, policyList.getMetadata());
    }

    //BaseRock generated method id: ${testEquals}, hash: 5410A70F201865E6F97E3455A95628C3
    @Test
    void testEquals() {
        V1ValidatingAdmissionPolicyList policyList1 = new V1ValidatingAdmissionPolicyList().apiVersion("v1").kind("ValidatingAdmissionPolicyList");
        V1ValidatingAdmissionPolicyList policyList2 = new V1ValidatingAdmissionPolicyList().apiVersion("v1").kind("ValidatingAdmissionPolicyList");
        assertThat(policyList1, is(equalTo(policyList2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: E29EFD14A6F028631E511F5FBB1CC088
    @Test
    void testHashCode() {
        V1ValidatingAdmissionPolicyList policyList = new V1ValidatingAdmissionPolicyList().apiVersion("v1").kind("ValidatingAdmissionPolicyList");
        assertThat(policyList.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 68C67C3436C34714BF47639C094A322A
    @Test
    void testToString() {
        V1ValidatingAdmissionPolicyList policyList = new V1ValidatingAdmissionPolicyList().apiVersion("v1").kind("ValidatingAdmissionPolicyList");
        String toString = policyList.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
    }

    //BaseRock generated method id: ${testAddItemsItem}, hash: AFD2406418D6C5BE8DE40BD9789C5A8B
    @Test
    void testAddItemsItem() {
        V1ValidatingAdmissionPolicyList policyList = new V1ValidatingAdmissionPolicyList();
        V1ValidatingAdmissionPolicy policy = mock(V1ValidatingAdmissionPolicy.class);
        policyList.addItemsItem(policy);
        assertThat(policyList.getItems().size(), is(1));
        assertThat(policyList.getItems().get(0), is(equalTo(policy)));
    }
}
