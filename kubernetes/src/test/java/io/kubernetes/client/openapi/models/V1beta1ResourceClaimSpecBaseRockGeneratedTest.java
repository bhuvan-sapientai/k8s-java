package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.mockito.Mock;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1ResourceClaimSpecBaseRockGeneratedTest {

    private V1beta1ResourceClaimSpec resourceClaimSpec;

    @Mock
    private V1beta1DeviceClaim mockDeviceClaim;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        resourceClaimSpec = new V1beta1ResourceClaimSpec();
    }

    //BaseRock generated method id: ${testSetAndGetDevices}, hash: 679B674C7786B87AFE45992C10AEDFA2
    @Test
    void testSetAndGetDevices() {
        resourceClaimSpec.setDevices(mockDeviceClaim);
        assertEquals(mockDeviceClaim, resourceClaimSpec.getDevices());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: EB0B38897AC3CA5BAD06441E470A0E06
    @Test
    void testEqualsWithSameObject() {
        assertTrue(resourceClaimSpec.equals(resourceClaimSpec));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 37A2AE95AAA107AF279641F0F642A668
    @Test
    void testEqualsWithDifferentObject() {
        V1beta1ResourceClaimSpec otherSpec = new V1beta1ResourceClaimSpec();
        otherSpec.setDevices(mockDeviceClaim);
        resourceClaimSpec.setDevices(mockDeviceClaim);
        assertTrue(resourceClaimSpec.equals(otherSpec));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 29AAB5DBDEF44131F8F8930A5E19C99D
    @Test
    void testEqualsWithDifferentClass() {
        assertFalse(resourceClaimSpec.equals(new Object()));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 08EC3EE3F4A048313EADFA19B7F176B3
    @Test
    void testHashCode() {
        resourceClaimSpec.setDevices(mockDeviceClaim);
        V1beta1ResourceClaimSpec otherSpec = new V1beta1ResourceClaimSpec();
        otherSpec.setDevices(mockDeviceClaim);
        assertEquals(resourceClaimSpec.hashCode(), otherSpec.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 3EB038893F2300D5A4F95B4A983ED716
    @Test
    void testToString() {
        resourceClaimSpec.setDevices(mockDeviceClaim);
        String result = resourceClaimSpec.toString();
        assertTrue(result.contains("class V1beta1ResourceClaimSpec"));
        assertTrue(result.contains("devices"));
    }

    //BaseRock generated method id: ${testBuilder}, hash: ACB4E733B83576B1CCF7F8803720DD70
    @Test
    void testBuilder() {
        V1beta1ResourceClaimSpec builtSpec = new V1beta1ResourceClaimSpec().devices(mockDeviceClaim);
        assertEquals(mockDeviceClaim, builtSpec.getDevices());
    }

    //BaseRock generated method id: ${testConstructor}, hash: 233508D0F7D0B0C9471B6F6B570B56C4
    @Test
    void testConstructor() {
        assertNotNull(new V1beta1ResourceClaimSpec());
    }
}
