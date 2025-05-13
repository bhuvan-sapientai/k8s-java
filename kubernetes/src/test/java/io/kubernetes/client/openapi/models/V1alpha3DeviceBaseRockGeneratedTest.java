package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1alpha3Device;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1alpha3BasicDevice;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha3DeviceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: F09CD35F4ECC1D9B3F8E3D30CE5CD897
    @Test
    void testConstructor() {
        V1alpha3Device device = new V1alpha3Device();
        assertThat(device, is(notNullValue()));
    }

    //BaseRock generated method id: ${testBasicGetterAndSetter}, hash: F40F08D992205B21DB88CE4E759E8892
    @Test
    void testBasicGetterAndSetter() {
        V1alpha3Device device = new V1alpha3Device();
        V1alpha3BasicDevice basicDevice = new V1alpha3BasicDevice();
        device.setBasic(basicDevice);
        assertThat(device.getBasic(), is(equalTo(basicDevice)));
    }

    //BaseRock generated method id: ${testNameGetterAndSetter}, hash: 56A552D0E4C7E0FA011453C8F16B437E
    @Test
    void testNameGetterAndSetter() {
        V1alpha3Device device = new V1alpha3Device();
        String name = "testDevice";
        device.setName(name);
        assertThat(device.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 1CC4909732672A62703CC9A70E560231
    @Test
    void testEqualsWithSameObject() {
        V1alpha3Device device = new V1alpha3Device();
        assertThat(device.equals(device), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: F3AF6010A8D847BD263B50B0B6FF6504
    @Test
    void testEqualsWithDifferentObject() {
        V1alpha3Device device1 = new V1alpha3Device();
        V1alpha3Device device2 = new V1alpha3Device();
        assertThat(device1.equals(device2), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 6CBA3444130AC3577BD7C9ACF0720B66
    @Test
    void testEqualsWithDifferentClass() {
        V1alpha3Device device = new V1alpha3Device();
        assertThat(device.equals(new Object()), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 158455EC17DABCE4B201491E13CB51B8
    @Test
    void testHashCode() {
        V1alpha3Device device1 = new V1alpha3Device();
        V1alpha3Device device2 = new V1alpha3Device();
        assertThat(device1.hashCode(), is(equalTo(device2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 87A83909EEEA28D76DA92DC121DEEABD
    @Test
    void testToString() {
        V1alpha3Device device = new V1alpha3Device();
        device.setName("testDevice");
        V1alpha3BasicDevice basicDevice = new V1alpha3BasicDevice();
        device.setBasic(basicDevice);
        String expectedString = "class V1alpha3Device {\n    basic: class V1alpha3BasicDevice {\n        attributes: {}\n        capacity: {}\n    }\n    name: testDevice\n}";
        assertThat(device.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testBasicWithNullValue}, hash: D43F1315FC6C1C95530EA32D91344A45
    @Test
    void testBasicWithNullValue() {
        V1alpha3Device device = new V1alpha3Device();
        device.setBasic(null);
        assertThat(device.getBasic(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testNameWithNullValue}, hash: FD863D0B0B45D323EFF8AA7BEF63FE3D
    @Test
    void testNameWithNullValue() {
        V1alpha3Device device = new V1alpha3Device();
        device.setName(null);
        assertThat(device.getName(), is(equalTo(null)));
    }
}
