package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1beta1Device;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1beta1BasicDevice;
import static org.mockito.Mockito.when;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1DeviceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1beta1DeviceConstructor}, hash: 2C016FE9F154A94BD5EB1FCAFACA591D
    @Test
    void testV1beta1DeviceConstructor() {
        V1beta1Device device = new V1beta1Device();
        assertNotNull(device);
    }

    //BaseRock generated method id: ${testSetAndGetBasic}, hash: DA8F6D2245DA6D6A62039237762D6717
    @Test
    void testSetAndGetBasic() {
        V1beta1Device device = new V1beta1Device();
        V1beta1BasicDevice basicDevice = mock(V1beta1BasicDevice.class);
        device.setBasic(basicDevice);
        assertEquals(basicDevice, device.getBasic());
    }

    //BaseRock generated method id: ${testSetAndGetName}, hash: D0CD5511159CDC44034565436D981D9C
    @ParameterizedTest
    @ValueSource(strings = { "device1", "device2", "device3" })
    void testSetAndGetName(String name) {
        V1beta1Device device = new V1beta1Device();
        device.setName(name);
        assertEquals(name, device.getName());
    }

    //BaseRock generated method id: ${testSetNameWithInvalidInput}, hash: BC12CC0AF2BA015C2163F9662B46C386
    @ParameterizedTest
    @NullAndEmptySource
    void testSetNameWithInvalidInput(String name) {
        V1beta1Device device = new V1beta1Device();
        device.setName(name);
        assertEquals(name, device.getName());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 718B5DA0CF3F49B91ACB314E159E7564
    @Test
    void testEqualsAndHashCode() {
        V1beta1BasicDevice basicDevice = mock(V1beta1BasicDevice.class);
        V1beta1Device device1 = new V1beta1Device().name("device1").basic(basicDevice);
        V1beta1Device device2 = new V1beta1Device().name("device1").basic(basicDevice);
        V1beta1Device device3 = new V1beta1Device().name("device2").basic(mock(V1beta1BasicDevice.class));
        assertThat(device1, is(equalTo(device2)));
        assertThat(device1.hashCode(), is(equalTo(device2.hashCode())));
        assertThat(device1, is(notNullValue()));
        assertThat(device1, is(equalTo(device1)));
        assertThat(device1, is(notNullValue()));
        assertThat(device2, is(notNullValue()));
        assertThat(device3, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 6E23A770E617250D101CD47089C0B3EF
    @Test
    void testToString() {
        V1beta1Device device = new V1beta1Device().name("testDevice").basic(mock(V1beta1BasicDevice.class));
        String toString = device.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("name"), is(true));
        assertThat(toString.contains("testDevice"), is(true));
        assertThat(toString.contains("basic"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: CE0418EBF7AF4A4E006BF19038405EB5
    @Test
    void testBuilder() {
        V1beta1BasicDevice basicDevice = mock(V1beta1BasicDevice.class);
        V1beta1Device device = new V1beta1Device().name("testDevice").basic(basicDevice);
        assertThat(device, is(notNullValue()));
        assertThat(device.getName(), is(equalTo("testDevice")));
        assertThat(device.getBasic(), is(equalTo(basicDevice)));
    }
}
