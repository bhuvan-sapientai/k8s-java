package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
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
class V1ResourceHealthBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 903EB49DFBD6E5450DA11656A5BE75C7
    @Test
    void testConstructor() {
        V1ResourceHealth resourceHealth = new V1ResourceHealth();
        assertNotNull(resourceHealth);
    }

    //BaseRock generated method id: ${testHealthSetter}, hash: A9061DFE1D229997D4405FCB8EE7F356
    @Test
    void testHealthSetter() {
        V1ResourceHealth resourceHealth = new V1ResourceHealth();
        resourceHealth.setHealth("Healthy");
        assertEquals("Healthy", resourceHealth.getHealth());
    }

    //BaseRock generated method id: ${testResourceIDSetter}, hash: 3B9334D4C92D750BD5721E7A96579FB5
    @Test
    void testResourceIDSetter() {
        V1ResourceHealth resourceHealth = new V1ResourceHealth();
        resourceHealth.setResourceID("resource-001");
        assertEquals("resource-001", resourceHealth.getResourceID());
    }

    //BaseRock generated method id: ${testHealthGetter}, hash: 381C870B8D71D2A90EC9339CFAEEA666
    @Test
    void testHealthGetter() {
        V1ResourceHealth resourceHealth = new V1ResourceHealth();
        resourceHealth.setHealth("Unhealthy");
        assertEquals("Unhealthy", resourceHealth.getHealth());
    }

    //BaseRock generated method id: ${testResourceIDGetter}, hash: 0901B8E39FF141F2AB1039D1A33E0D46
    @Test
    void testResourceIDGetter() {
        V1ResourceHealth resourceHealth = new V1ResourceHealth();
        resourceHealth.setResourceID("resource-002");
        assertEquals("resource-002", resourceHealth.getResourceID());
    }

    //BaseRock generated method id: ${testHealthSetterWithValidValues}, hash: 42D8D7F7990A9AC041F9D9EDF0829FC3
    @ParameterizedTest
    @ValueSource(strings = { "Healthy", "Unhealthy", "Unknown" })
    void testHealthSetterWithValidValues(String health) {
        V1ResourceHealth resourceHealth = new V1ResourceHealth();
        resourceHealth.setHealth(health);
        assertEquals(health, resourceHealth.getHealth());
    }

    //BaseRock generated method id: ${testHealthSetterWithNullAndEmptyValues}, hash: 6A64EDA5ACCB5D790147D4F4BFA2B58C
    @ParameterizedTest
    @NullAndEmptySource
    void testHealthSetterWithNullAndEmptyValues(String health) {
        V1ResourceHealth resourceHealth = new V1ResourceHealth();
        resourceHealth.setHealth(health);
        assertEquals(health, resourceHealth.getHealth());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 327D0722DA92876D7A9730CB6F025F14
    @Test
    void testEqualsWithSameObject() {
        V1ResourceHealth resourceHealth = new V1ResourceHealth().health("Healthy").resourceID("resource-001");
        assertTrue(resourceHealth.equals(resourceHealth));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 9A96FA40C2245B3415D23D15F73925C5
    @Test
    void testEqualsWithDifferentObject() {
        V1ResourceHealth resourceHealth1 = new V1ResourceHealth().health("Healthy").resourceID("resource-001");
        V1ResourceHealth resourceHealth2 = new V1ResourceHealth().health("Healthy").resourceID("resource-001");
        assertTrue(resourceHealth1.equals(resourceHealth2));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentValues}, hash: 481BB8BF1C15C9836368077ECBAF7566
    @Test
    void testEqualsWithDifferentValues() {
        V1ResourceHealth resourceHealth1 = new V1ResourceHealth().health("Healthy").resourceID("resource-001");
        V1ResourceHealth resourceHealth2 = new V1ResourceHealth().health("Unhealthy").resourceID("resource-002");
        assertFalse(resourceHealth1.equals(resourceHealth2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 7E1634E12C9358D4F24D043C264EDA9E
    @Test
    void testHashCode() {
        V1ResourceHealth resourceHealth1 = new V1ResourceHealth().health("Healthy").resourceID("resource-001");
        V1ResourceHealth resourceHealth2 = new V1ResourceHealth().health("Healthy").resourceID("resource-001");
        assertEquals(resourceHealth1.hashCode(), resourceHealth2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: D78A65F4A97046C1C210C81E6989FBF1
    @Test
    void testToString() {
        V1ResourceHealth resourceHealth = new V1ResourceHealth().health("Healthy").resourceID("resource-001");
        String expected = "class V1ResourceHealth {\n    health: Healthy\n    resourceID: resource-001\n}";
        assertEquals(expected, resourceHealth.toString());
    }

    //BaseRock generated method id: ${testToJson}, hash: 2B584467C853C65F5DD29B6F4CEC77B1
    @Test
    void testToJson() throws Exception {
        V1ResourceHealth resourceHealth = new V1ResourceHealth().health("Healthy").resourceID("resource-001");
        String json = resourceHealth.toJson();
        assertNotNull(json);
        assertTrue(json.contains("\"health\":\"Healthy\""));
        assertTrue(json.contains("\"resourceID\":\"resource-001\""));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 8DD18FD64A430C615B1EBDBF04B906F2
    @Test
    void testFromJson() throws Exception {
        String json = "{\"health\":\"Unhealthy\",\"resourceID\":\"resource-002\"}";
        V1ResourceHealth resourceHealth = V1ResourceHealth.fromJson(json);
        assertNotNull(resourceHealth);
        assertEquals("Unhealthy", resourceHealth.getHealth());
        assertEquals("resource-002", resourceHealth.getResourceID());
    }
}
