package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import io.kubernetes.client.openapi.models.V1alpha3ResourceClaimConsumerReference;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha3ResourceClaimConsumerReferenceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 86F97265098179F24A9687D02E879BA6
    @Test
    void testConstructor() {
        V1alpha3ResourceClaimConsumerReference reference = new V1alpha3ResourceClaimConsumerReference();
        assertNotNull(reference);
    }

    //BaseRock generated method id: ${testApiGroup}, hash: 7D37EC6FC3D0A1B0A98B5C590E36B96A
    @Test
    void testApiGroup() {
        V1alpha3ResourceClaimConsumerReference reference = new V1alpha3ResourceClaimConsumerReference();
        String apiGroup = "test-api-group";
        reference.setApiGroup(apiGroup);
        assertEquals(apiGroup, reference.getApiGroup());
    }

    //BaseRock generated method id: ${testApiGroupWithVariousValues}, hash: 44A203053BB66E71DC36426958535FA3
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "test-api-group", "another-api-group" })
    void testApiGroupWithVariousValues(String apiGroup) {
        V1alpha3ResourceClaimConsumerReference reference = new V1alpha3ResourceClaimConsumerReference();
        reference.setApiGroup(apiGroup);
        assertEquals(apiGroup, reference.getApiGroup());
    }

    //BaseRock generated method id: ${testName}, hash: D8A0EBF8FA4941AE4AA4945EDEBABDB4
    @Test
    void testName() {
        V1alpha3ResourceClaimConsumerReference reference = new V1alpha3ResourceClaimConsumerReference();
        String name = "test-name";
        reference.setName(name);
        assertEquals(name, reference.getName());
    }

    //BaseRock generated method id: ${testNameWithVariousValues}, hash: 8C71E635DE7A4A20E02D73C661F93579
    @ParameterizedTest
    @ValueSource(strings = { "test-name", "another-name" })
    void testNameWithVariousValues(String name) {
        V1alpha3ResourceClaimConsumerReference reference = new V1alpha3ResourceClaimConsumerReference();
        reference.setName(name);
        assertEquals(name, reference.getName());
    }

    //BaseRock generated method id: ${testResource}, hash: 12BF4F8D29A61435C7BB0414831D9512
    @Test
    void testResource() {
        V1alpha3ResourceClaimConsumerReference reference = new V1alpha3ResourceClaimConsumerReference();
        String resource = "test-resource";
        reference.setResource(resource);
        assertEquals(resource, reference.getResource());
    }

    //BaseRock generated method id: ${testResourceWithVariousValues}, hash: 7616E8F2C4893F1C0BE886C4A32AABA2
    @ParameterizedTest
    @ValueSource(strings = { "test-resource", "another-resource" })
    void testResourceWithVariousValues(String resource) {
        V1alpha3ResourceClaimConsumerReference reference = new V1alpha3ResourceClaimConsumerReference();
        reference.setResource(resource);
        assertEquals(resource, reference.getResource());
    }

    //BaseRock generated method id: ${testUid}, hash: 6B1F98C4D7BDD50B3E21E302AD6C7D02
    @Test
    void testUid() {
        V1alpha3ResourceClaimConsumerReference reference = new V1alpha3ResourceClaimConsumerReference();
        String uid = "test-uid";
        reference.setUid(uid);
        assertEquals(uid, reference.getUid());
    }

    //BaseRock generated method id: ${testUidWithVariousValues}, hash: 2C1028D55DA2896475FFA850400B71E0
    @ParameterizedTest
    @ValueSource(strings = { "test-uid", "another-uid" })
    void testUidWithVariousValues(String uid) {
        V1alpha3ResourceClaimConsumerReference reference = new V1alpha3ResourceClaimConsumerReference();
        reference.setUid(uid);
        assertEquals(uid, reference.getUid());
    }

    //BaseRock generated method id: ${testEquals}, hash: 3C418B8DAC242BB89E6C82977D4E2D74
    @Test
    void testEquals() {
        V1alpha3ResourceClaimConsumerReference reference1 = new V1alpha3ResourceClaimConsumerReference().apiGroup("test-api-group").name("test-name").resource("test-resource").uid("test-uid");
        V1alpha3ResourceClaimConsumerReference reference2 = new V1alpha3ResourceClaimConsumerReference().apiGroup("test-api-group").name("test-name").resource("test-resource").uid("test-uid");
        assertEquals(reference1, reference2);
    }

    //BaseRock generated method id: ${testNotEquals}, hash: 96E084AF5861755A19DBBA61046D35FA
    @Test
    void testNotEquals() {
        V1alpha3ResourceClaimConsumerReference reference1 = new V1alpha3ResourceClaimConsumerReference().apiGroup("test-api-group").name("test-name").resource("test-resource").uid("test-uid");
        V1alpha3ResourceClaimConsumerReference reference2 = new V1alpha3ResourceClaimConsumerReference().apiGroup("different-api-group").name("different-name").resource("different-resource").uid("different-uid");
        assertNotEquals(reference1, reference2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 10D3D5C8D495CDFAC4AB312975175798
    @Test
    void testHashCode() {
        V1alpha3ResourceClaimConsumerReference reference1 = new V1alpha3ResourceClaimConsumerReference().apiGroup("test-api-group").name("test-name").resource("test-resource").uid("test-uid");
        V1alpha3ResourceClaimConsumerReference reference2 = new V1alpha3ResourceClaimConsumerReference().apiGroup("test-api-group").name("test-name").resource("test-resource").uid("test-uid");
        assertEquals(reference1.hashCode(), reference2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: AF698D2236FD5BB0A550761BA795A1A0
    @Test
    void testToString() {
        V1alpha3ResourceClaimConsumerReference reference = new V1alpha3ResourceClaimConsumerReference().apiGroup("test-api-group").name("test-name").resource("test-resource").uid("test-uid");
        String expectedString = "class V1alpha3ResourceClaimConsumerReference {\n" + "    apiGroup: test-api-group\n" + "    name: test-name\n" + "    resource: test-resource\n" + "    uid: test-uid\n" + "}";
        assertEquals(expectedString, reference.toString());
    }
}
