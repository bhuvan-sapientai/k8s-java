package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.openapi.models.V1beta1DeviceCapacity;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.custom.Quantity;
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
class V1beta1DeviceCapacityBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 7325D43508456246E4AA96F55B78D1EB
    @Test
    void testConstructor() {
        V1beta1DeviceCapacity deviceCapacity = new V1beta1DeviceCapacity();
        assertThat(deviceCapacity, is(notNullValue()));
    }

    //BaseRock generated method id: ${testValueSetter}, hash: 7992059EE700973835226CFE7DD0715A
    @Test
    void testValueSetter() {
        V1beta1DeviceCapacity deviceCapacity = new V1beta1DeviceCapacity();
        Quantity quantity = new Quantity("10");
        deviceCapacity.setValue(quantity);
        assertThat(deviceCapacity.getValue(), is(equalTo(quantity)));
    }

    //BaseRock generated method id: ${testValueGetter}, hash: 24825ECFD887A39086B9D86F0A9B7AFA
    @Test
    void testValueGetter() {
        V1beta1DeviceCapacity deviceCapacity = new V1beta1DeviceCapacity();
        Quantity quantity = new Quantity("10");
        deviceCapacity.setValue(quantity);
        assertThat(deviceCapacity.getValue(), is(equalTo(quantity)));
    }

    //BaseRock generated method id: ${testEquals}, hash: A2851C6403C4EC8343FD1A43E1FF11FC
    @Test
    void testEquals() {
        V1beta1DeviceCapacity deviceCapacity1 = new V1beta1DeviceCapacity().value(new Quantity("10"));
        V1beta1DeviceCapacity deviceCapacity2 = new V1beta1DeviceCapacity().value(new Quantity("10"));
        V1beta1DeviceCapacity deviceCapacity3 = new V1beta1DeviceCapacity().value(new Quantity("20"));
        assertThat(deviceCapacity1.equals(deviceCapacity2), is(true));
        assertThat(deviceCapacity1.equals(deviceCapacity3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 4DE4805E34A574E14D148983ADF619C9
    @Test
    void testHashCode() {
        V1beta1DeviceCapacity deviceCapacity1 = new V1beta1DeviceCapacity().value(new Quantity("10"));
        V1beta1DeviceCapacity deviceCapacity2 = new V1beta1DeviceCapacity().value(new Quantity("10"));
        assertThat(deviceCapacity1.hashCode(), is(equalTo(deviceCapacity2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: E930D41DBD70151F792E4101F43BCA98
    @Test
    void testToString() {
        V1beta1DeviceCapacity deviceCapacity = new V1beta1DeviceCapacity().value(new Quantity("10"));
        String expectedString = "class V1beta1DeviceCapacity {\n    value: Quantity{number=10, format=DECIMAL_SI}\n}";
        assertThat(deviceCapacity.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testSetNullValue}, hash: 801D7CFA4E2D04074CD7C3FF26849306
    @Test
    void testSetNullValue() {
        V1beta1DeviceCapacity deviceCapacity = new V1beta1DeviceCapacity();
        deviceCapacity.setValue(null);
        assertThat(deviceCapacity.getValue(), is(equalTo(null)));
    }
}
