package io.kubernetes.client.openapi.models;

import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1beta1DeviceAttribute;
import io.kubernetes.client.openapi.models.V1beta1DeviceCapacity;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1beta1BasicDevice;
import static org.hamcrest.Matchers.hasEntry;
import java.util.HashMap;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1BasicDeviceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1beta1BasicDeviceConstructor}, hash: 0561CAC8F29D9B591F456DEA7D772DBE
    @Test
    void testV1beta1BasicDeviceConstructor() {
        V1beta1BasicDevice device = new V1beta1BasicDevice();
        assertNotNull(device);
    }

    //BaseRock generated method id: ${testAttributesGetterAndSetter}, hash: 638D87835C86E3FB29B77C20ED85E2F2
    @Test
    void testAttributesGetterAndSetter() {
        V1beta1BasicDevice device = new V1beta1BasicDevice();
        Map<String, V1beta1DeviceAttribute> attributes = new HashMap<>();
        attributes.put("test", new V1beta1DeviceAttribute());
        device.setAttributes(attributes);
        assertEquals(attributes, device.getAttributes());
    }

    //BaseRock generated method id: ${testCapacityGetterAndSetter}, hash: 5A22E915EF45D61FFB5D3D1A64D817E9
    @Test
    void testCapacityGetterAndSetter() {
        V1beta1BasicDevice device = new V1beta1BasicDevice();
        Map<String, V1beta1DeviceCapacity> capacity = new HashMap<>();
        capacity.put("test", new V1beta1DeviceCapacity());
        device.setCapacity(capacity);
        assertEquals(capacity, device.getCapacity());
    }

    //BaseRock generated method id: ${testPutAttributesItem}, hash: 2F86BEAB5BA4706332B5DA6FCAEEB935
    @Test
    void testPutAttributesItem() {
        V1beta1BasicDevice device = new V1beta1BasicDevice();
        String key = "testKey";
        V1beta1DeviceAttribute value = new V1beta1DeviceAttribute();
        device.putAttributesItem(key, value);
        assertThat(device.getAttributes(), hasEntry(key, value));
    }

    //BaseRock generated method id: ${testPutCapacityItem}, hash: C8955A3C82424E0440F04C7EE594C4B1
    @Test
    void testPutCapacityItem() {
        V1beta1BasicDevice device = new V1beta1BasicDevice();
        String key = "testKey";
        V1beta1DeviceCapacity value = new V1beta1DeviceCapacity();
        device.putCapacityItem(key, value);
        assertThat(device.getCapacity(), hasEntry(key, value));
    }

    //BaseRock generated method id: ${testEquals}, hash: 5983E44C4C5E8B6B55D45D4363DE1BC6
    @Test
    void testEquals() {
        V1beta1BasicDevice device1 = new V1beta1BasicDevice();
        V1beta1BasicDevice device2 = new V1beta1BasicDevice();
        Map<String, V1beta1DeviceAttribute> attributes = new HashMap<>();
        attributes.put("test", new V1beta1DeviceAttribute());
        device1.setAttributes(attributes);
        device2.setAttributes(attributes);
        Map<String, V1beta1DeviceCapacity> capacity = new HashMap<>();
        capacity.put("test", new V1beta1DeviceCapacity());
        device1.setCapacity(capacity);
        device2.setCapacity(capacity);
        assertThat(device1, is(equalTo(device2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: C78A4D974F7D06C29246BEFBEE40F0E1
    @Test
    void testHashCode() {
        V1beta1BasicDevice device = new V1beta1BasicDevice();
        Map<String, V1beta1DeviceAttribute> attributes = new HashMap<>();
        attributes.put("test", new V1beta1DeviceAttribute());
        device.setAttributes(attributes);
        Map<String, V1beta1DeviceCapacity> capacity = new HashMap<>();
        capacity.put("test", new V1beta1DeviceCapacity());
        device.setCapacity(capacity);
        int hashCode = device.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: BF69609DCBD837974118FF31FEFBDC88
    @Test
    void testToString() {
        V1beta1BasicDevice device = new V1beta1BasicDevice();
        Map<String, V1beta1DeviceAttribute> attributes = new HashMap<>();
        attributes.put("test", new V1beta1DeviceAttribute());
        device.setAttributes(attributes);
        Map<String, V1beta1DeviceCapacity> capacity = new HashMap<>();
        capacity.put("test", new V1beta1DeviceCapacity());
        device.setCapacity(capacity);
        String toString = device.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("attributes"), is(true));
        assertThat(toString.contains("capacity"), is(true));
    }
}
