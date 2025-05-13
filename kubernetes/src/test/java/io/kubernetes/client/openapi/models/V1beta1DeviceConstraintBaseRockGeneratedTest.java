package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1DeviceConstraintBaseRockGeneratedTest {

    private V1beta1DeviceConstraint deviceConstraint;

    @BeforeEach
    void setUp() {
        deviceConstraint = new V1beta1DeviceConstraint();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 1889338D288B183F40D8FC276E0FD938
    @Test
    void testConstructor() {
        assertNotNull(deviceConstraint);
    }

    //BaseRock generated method id: ${testSetAndGetMatchAttribute}, hash: 10267595E0284CC6A555B268DD794864
    @Test
    void testSetAndGetMatchAttribute() {
        String matchAttribute = "test.attribute";
        deviceConstraint.setMatchAttribute(matchAttribute);
        assertEquals(matchAttribute, deviceConstraint.getMatchAttribute());
    }

    //BaseRock generated method id: ${testSetMatchAttributeWithVariousValues}, hash: 5129429CD36CA1F5D932A18EF99BF666
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "attribute1", "attribute.test", "test.attribute.example" })
    void testSetMatchAttributeWithVariousValues(String matchAttribute) {
        deviceConstraint.setMatchAttribute(matchAttribute);
        assertEquals(matchAttribute, deviceConstraint.getMatchAttribute());
    }

    //BaseRock generated method id: ${testSetAndGetRequests}, hash: 1C0C6F93A4B7FEA4961D051DB65C5ECE
    @Test
    void testSetAndGetRequests() {
        List<String> requests = new ArrayList<>();
        requests.add("request1");
        requests.add("request2");
        deviceConstraint.setRequests(requests);
        assertEquals(requests, deviceConstraint.getRequests());
    }

    //BaseRock generated method id: ${testAddRequestsItem}, hash: C137A11C9C0C4425BCA4A315CBEE9D10
    @Test
    void testAddRequestsItem() {
        String request = "newRequest";
        deviceConstraint.addRequestsItem(request);
        assertTrue(deviceConstraint.getRequests().contains(request));
        assertEquals(1, deviceConstraint.getRequests().size());
    }

    //BaseRock generated method id: ${testAddMultipleRequestsItems}, hash: DB3125FBA003D791BA2A38E14FDC9583
    @Test
    void testAddMultipleRequestsItems() {
        deviceConstraint.addRequestsItem("request1");
        deviceConstraint.addRequestsItem("request2");
        deviceConstraint.addRequestsItem("request3");
        assertEquals(3, deviceConstraint.getRequests().size());
        assertTrue(deviceConstraint.getRequests().containsAll(List.of("request1", "request2", "request3")));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: B3A92BE0D34C303B284A0DA56504BBE6
    @Test
    void testEqualsWithSameObject() {
        assertTrue(deviceConstraint.equals(deviceConstraint));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: CF3E6D6666A7777BFB16A751AD3F09F7
    @Test
    void testEqualsWithDifferentObject() {
        V1beta1DeviceConstraint other = new V1beta1DeviceConstraint();
        assertTrue(deviceConstraint.equals(other));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentValues}, hash: 947C6EED93577806C38679517B154560
    @Test
    void testEqualsWithDifferentValues() {
        V1beta1DeviceConstraint other = new V1beta1DeviceConstraint().matchAttribute("differentAttribute").addRequestsItem("differentRequest");
        assertFalse(deviceConstraint.equals(other));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 0BE52D77A057B29A99D6FC0DFA437312
    @Test
    void testHashCode() {
        V1beta1DeviceConstraint other = new V1beta1DeviceConstraint();
        assertEquals(deviceConstraint.hashCode(), other.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: E7AD9839AB5956B1222116B3C8585474
    @Test
    void testToString() {
        String expectedString = "class V1beta1DeviceConstraint {\n    matchAttribute: null\n    requests: []\n}";
        assertEquals(expectedString, deviceConstraint.toString());
    }

    //BaseRock generated method id: ${testToStringWithValues}, hash: 0A48CF60AF707B050C188CAF4897249B
    @Test
    void testToStringWithValues() {
        deviceConstraint.setMatchAttribute("testAttribute");
        deviceConstraint.addRequestsItem("testRequest");
        String expectedString = "class V1beta1DeviceConstraint {\n    matchAttribute: testAttribute\n    requests: [testRequest]\n}";
        assertEquals(expectedString, deviceConstraint.toString());
    }
}
