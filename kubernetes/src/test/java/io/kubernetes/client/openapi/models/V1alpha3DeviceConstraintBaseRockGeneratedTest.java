package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1alpha3DeviceConstraint;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha3DeviceConstraintBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: F225934929CE0DF73DD7FB5128198748
    @Test
    void testConstructor() {
        V1alpha3DeviceConstraint constraint = new V1alpha3DeviceConstraint();
        assertThat(constraint, is(notNullValue()));
    }

    //BaseRock generated method id: ${testMatchAttribute}, hash: E36982C4A6E7116C434CB557C2DE8505
    @Test
    void testMatchAttribute() {
        V1alpha3DeviceConstraint constraint = new V1alpha3DeviceConstraint();
        String matchAttribute = "dra.example.com/numa";
        constraint.setMatchAttribute(matchAttribute);
        assertEquals(matchAttribute, constraint.getMatchAttribute());
    }

    //BaseRock generated method id: ${testMatchAttributeChaining}, hash: 095830B5A6239785571B56B66F571A72
    @Test
    void testMatchAttributeChaining() {
        V1alpha3DeviceConstraint constraint = new V1alpha3DeviceConstraint();
        String matchAttribute = "dra.example.com/numa";
        V1alpha3DeviceConstraint result = constraint.matchAttribute(matchAttribute);
        assertThat(result, is(constraint));
        assertEquals(matchAttribute, constraint.getMatchAttribute());
    }

    //BaseRock generated method id: ${testRequests}, hash: 42A79223EC7AEA82AD0F5517212A2D86
    @Test
    void testRequests() {
        V1alpha3DeviceConstraint constraint = new V1alpha3DeviceConstraint();
        List<String> requests = Arrays.asList("request1", "request2");
        constraint.setRequests(requests);
        assertEquals(requests, constraint.getRequests());
    }

    //BaseRock generated method id: ${testRequestsChaining}, hash: AF4EEB3872D801CBF944F154195BD5E6
    @Test
    void testRequestsChaining() {
        V1alpha3DeviceConstraint constraint = new V1alpha3DeviceConstraint();
        List<String> requests = Arrays.asList("request1", "request2");
        V1alpha3DeviceConstraint result = constraint.requests(requests);
        assertThat(result, is(constraint));
        assertEquals(requests, constraint.getRequests());
    }

    //BaseRock generated method id: ${testAddRequestsItem}, hash: 27C5968B2D1CA0BDED27C084B06B7FDF
    @Test
    void testAddRequestsItem() {
        V1alpha3DeviceConstraint constraint = new V1alpha3DeviceConstraint();
        String request = "request1";
        V1alpha3DeviceConstraint result = constraint.addRequestsItem(request);
        assertThat(result, is(constraint));
        assertThat(constraint.getRequests(), contains(request));
    }

    //BaseRock generated method id: ${testAddRequestsItemToExistingList}, hash: 4AFA87555585F9C030DAFADFF47BB0A2
    @Test
    void testAddRequestsItemToExistingList() {
        V1alpha3DeviceConstraint constraint = new V1alpha3DeviceConstraint();
        constraint.setRequests(new ArrayList<>(Arrays.asList("request1")));
        String newRequest = "request2";
        constraint.addRequestsItem(newRequest);
        assertThat(constraint.getRequests(), contains("request1", newRequest));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: FC6720880608CB33209A6290C25DF05F
    @Test
    void testEqualsWithSameObject() {
        V1alpha3DeviceConstraint constraint = new V1alpha3DeviceConstraint();
        assertTrue(constraint.equals(constraint));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 98BC30CD7C2C44C78EB1F40B2752B0EF
    @Test
    void testEqualsWithDifferentClass() {
        V1alpha3DeviceConstraint constraint = new V1alpha3DeviceConstraint();
        assertFalse(constraint.equals(new Object()));
    }

    //BaseRock generated method id: ${testEqualsWithNullObject}, hash: 74B57A9BAFE950D7D3DE34C1EC7D0BCA
    @Test
    void testEqualsWithNullObject() {
        V1alpha3DeviceConstraint constraint = new V1alpha3DeviceConstraint();
        assertFalse(constraint.equals(null));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObjects}, hash: 0822E232D01C4C9865E81EFD91265939
    @Test
    void testEqualsWithDifferentObjects() {
        V1alpha3DeviceConstraint constraint1 = new V1alpha3DeviceConstraint().matchAttribute("attr1").addRequestsItem("request1");
        V1alpha3DeviceConstraint constraint2 = new V1alpha3DeviceConstraint().matchAttribute("attr2").addRequestsItem("request2");
        assertFalse(constraint1.equals(constraint2));
    }

    //BaseRock generated method id: ${testEqualsWithSameValues}, hash: 480962A0B14007D0797BFE7E7495BA7E
    @Test
    void testEqualsWithSameValues() {
        V1alpha3DeviceConstraint constraint1 = new V1alpha3DeviceConstraint().matchAttribute("attr1").addRequestsItem("request1");
        V1alpha3DeviceConstraint constraint2 = new V1alpha3DeviceConstraint().matchAttribute("attr1").addRequestsItem("request1");
        assertTrue(constraint1.equals(constraint2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 821113C670206ED548F1429B43524E00
    @Test
    void testHashCode() {
        V1alpha3DeviceConstraint constraint1 = new V1alpha3DeviceConstraint().matchAttribute("attr1").addRequestsItem("request1");
        V1alpha3DeviceConstraint constraint2 = new V1alpha3DeviceConstraint().matchAttribute("attr1").addRequestsItem("request1");
        assertEquals(constraint1.hashCode(), constraint2.hashCode());
        V1alpha3DeviceConstraint constraint3 = new V1alpha3DeviceConstraint().matchAttribute("attr2").addRequestsItem("request2");
        assertNotEquals(constraint1.hashCode(), constraint3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: FA64410577B3F2DBC0C8F060EBFA5145
    @Test
    void testToString() {
        V1alpha3DeviceConstraint constraint = new V1alpha3DeviceConstraint().matchAttribute("dra.example.com/numa").addRequestsItem("request1").addRequestsItem("request2");
        String expected = "class V1alpha3DeviceConstraint {\n" + "    matchAttribute: dra.example.com/numa\n" + "    requests: [request1, request2]\n" + "}";
        assertEquals(expected, constraint.toString());
    }

    //BaseRock generated method id: ${testParameterizedMatchAttribute}, hash: 2E8E6AFC2ED3A0533A8951AC1CF9CC61
    @ParameterizedTest
    @ValueSource(strings = { "attr1", "attr2", "attr3" })
    void testParameterizedMatchAttribute(String attribute) {
        V1alpha3DeviceConstraint constraint = new V1alpha3DeviceConstraint();
        constraint.setMatchAttribute(attribute);
        assertEquals(attribute, constraint.getMatchAttribute());
    }

    //BaseRock generated method id: ${testSetAndGetRequests}, hash: 401E7F0278B2F002F18C3E5CD37D45C0
    @Test
    void testSetAndGetRequests() {
        V1alpha3DeviceConstraint constraint = new V1alpha3DeviceConstraint();
        List<String> requests = Arrays.asList("request1", "request2", "request3");
        constraint.setRequests(requests);
        assertThat(constraint.getRequests(), is(requests));
        assertThat(constraint.getRequests(), hasSize(3));
    }

    //BaseRock generated method id: ${testAddMultipleRequestsItems}, hash: 7B2A11F6F54D4B28E7108AB98C3F795A
    @Test
    void testAddMultipleRequestsItems() {
        V1alpha3DeviceConstraint constraint = new V1alpha3DeviceConstraint();
        constraint.addRequestsItem("request1").addRequestsItem("request2").addRequestsItem("request3");
        assertThat(constraint.getRequests(), contains("request1", "request2", "request3"));
    }
}
