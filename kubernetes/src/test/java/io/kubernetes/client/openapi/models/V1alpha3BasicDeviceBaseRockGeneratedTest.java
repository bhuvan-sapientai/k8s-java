package io.kubernetes.client.openapi.models;

import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.openapi.models.V1alpha3BasicDevice;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import io.kubernetes.client.openapi.models.V1alpha3DeviceAttribute;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasEntry;
import com.google.gson.JsonElement;
import java.io.IOException;
import java.util.HashMap;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha3BasicDeviceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: DCF0B0EC2285E191C2A63E72C2CC72B8
    @Test
    void testConstructor() {
        V1alpha3BasicDevice device = new V1alpha3BasicDevice();
        assertNotNull(device);
    }

    //BaseRock generated method id: ${testSetAndGetAttributes}, hash: B6346F0735EA8A8F760EDDA6B111C0BD
    @Test
    void testSetAndGetAttributes() {
        V1alpha3BasicDevice device = new V1alpha3BasicDevice();
        Map<String, V1alpha3DeviceAttribute> attributes = new HashMap<>();
        V1alpha3DeviceAttribute attribute = new V1alpha3DeviceAttribute();
        attributes.put("test", attribute);
        device.setAttributes(attributes);
        assertEquals(attributes, device.getAttributes());
    }

    //BaseRock generated method id: ${testPutAttributesItem}, hash: B17C73E6311CB64565DC0B27CE984024
    @Test
    void testPutAttributesItem() {
        V1alpha3BasicDevice device = new V1alpha3BasicDevice();
        V1alpha3DeviceAttribute attribute = new V1alpha3DeviceAttribute();
        device.putAttributesItem("test", attribute);
        assertThat(device.getAttributes(), hasEntry("test", attribute));
    }

    //BaseRock generated method id: ${testSetAndGetCapacity}, hash: 45F23100F7FFF320AA21BBF71A525B96
    @Test
    void testSetAndGetCapacity() {
        V1alpha3BasicDevice device = new V1alpha3BasicDevice();
        Map<String, Quantity> capacity = new HashMap<>();
        Quantity quantity = new Quantity("1");
        capacity.put("test", quantity);
        device.setCapacity(capacity);
        assertEquals(capacity, device.getCapacity());
    }

    //BaseRock generated method id: ${testPutCapacityItem}, hash: C8688FE67B699ABA8251DD48F632A4BA
    @Test
    void testPutCapacityItem() {
        V1alpha3BasicDevice device = new V1alpha3BasicDevice();
        Quantity quantity = new Quantity("1");
        device.putCapacityItem("test", quantity);
        assertThat(device.getCapacity(), hasEntry("test", quantity));
    }

    //BaseRock generated method id: ${testEquals}, hash: 14BB0948D778FA74A17F2E9C93E19951
    @Test
    void testEquals() {
        V1alpha3BasicDevice device1 = new V1alpha3BasicDevice();
        V1alpha3BasicDevice device2 = new V1alpha3BasicDevice();
        assertThat(device1.equals(device2), is(true));
        Map<String, V1alpha3DeviceAttribute> attributes = new HashMap<>();
        attributes.put("test", new V1alpha3DeviceAttribute());
        device1.setAttributes(attributes);
        assertThat(device1.equals(device2), is(false));
        device2.setAttributes(attributes);
        assertThat(device1.equals(device2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 4DE63589159BC8486E0358C9B9DFD1EB
    @Test
    void testHashCode() {
        V1alpha3BasicDevice device1 = new V1alpha3BasicDevice();
        V1alpha3BasicDevice device2 = new V1alpha3BasicDevice();
        assertThat(device1.hashCode(), equalTo(device2.hashCode()));
        Map<String, V1alpha3DeviceAttribute> attributes = new HashMap<>();
        attributes.put("test", new V1alpha3DeviceAttribute());
        device1.setAttributes(attributes);
        assertThat(device1.hashCode(), is(notNullValue()));
        assertThat(device1.hashCode() == device2.hashCode(), is(false));
    }

    //BaseRock generated method id: ${testToString}, hash: 96FA270FCBFDFED77CF5F6BE6BBAE1D0
    @Test
    void testToString() {
        V1alpha3BasicDevice device = new V1alpha3BasicDevice();
        Map<String, V1alpha3DeviceAttribute> attributes = new HashMap<>();
        attributes.put("test", new V1alpha3DeviceAttribute());
        device.setAttributes(attributes);
        Map<String, Quantity> capacity = new HashMap<>();
        capacity.put("test", new Quantity("1"));
        device.setCapacity(capacity);
        String toString = device.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("attributes"), is(true));
        assertThat(toString.contains("capacity"), is(true));
    }

    //BaseRock generated method id: ${testToJson}, hash: 75CB68578F0E3555A7B45F89B2BE34F6
    @Test
    void testToJson() throws IOException {
        V1alpha3BasicDevice device = new V1alpha3BasicDevice();
        Map<String, V1alpha3DeviceAttribute> attributes = new HashMap<>();
        attributes.put("test", new V1alpha3DeviceAttribute());
        device.setAttributes(attributes);
        Map<String, Quantity> capacity = new HashMap<>();
        capacity.put("test", new Quantity("1"));
        device.setCapacity(capacity);
        String json = device.toJson();
        assertNotNull(json);
        assertThat(json.contains("attributes"), is(true));
        assertThat(json.contains("capacity"), is(true));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 1D7694AA585C36A9F99EA5C8FA778A4F
    @Test
    void testFromJson() throws IOException {
        String json = "{\"attributes\":{\"test\":{}},\"capacity\":{\"test\":\"1\"}}";
        V1alpha3BasicDevice device = V1alpha3BasicDevice.fromJson(json);
        assertNotNull(device);
        assertThat(device.getAttributes().size(), equalTo(1));
        assertThat(device.getAttributes(), hasEntry("test", new V1alpha3DeviceAttribute()));
        assertThat(device.getCapacity().size(), equalTo(1));
        assertThat(device.getCapacity(), hasEntry("test", new Quantity("1")));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: B1C8DFDA063AE9F969594DB87C391FA0
    @Test
    void testValidateJsonElement() throws IOException {
        V1alpha3BasicDevice device = new V1alpha3BasicDevice();
        Map<String, V1alpha3DeviceAttribute> attributes = new HashMap<>();
        attributes.put("test", new V1alpha3DeviceAttribute());
        device.setAttributes(attributes);
        Map<String, Quantity> capacity = new HashMap<>();
        capacity.put("test", new Quantity("1"));
        device.setCapacity(capacity);
        String json = device.toJson();
        JsonElement jsonElement = com.google.gson.JsonParser.parseString(json);
        // This should not throw an exception
        V1alpha3BasicDevice.validateJsonElement(jsonElement);
    }
}
