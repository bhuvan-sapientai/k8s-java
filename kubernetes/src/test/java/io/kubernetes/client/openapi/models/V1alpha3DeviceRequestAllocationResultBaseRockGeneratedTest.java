package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1alpha3DeviceRequestAllocationResult;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1alpha3DeviceRequestAllocationResultBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructorAndGetters}, hash: 4F9D23867EF02C77758E96CF63B351AE
    @Test
    void testConstructorAndGetters() {
        V1alpha3DeviceRequestAllocationResult result = new V1alpha3DeviceRequestAllocationResult().adminAccess(true).device("device1").driver("driver1").pool("pool1").request("request1");
        assertThat(result.getAdminAccess(), is(true));
        assertThat(result.getDevice(), equalTo("device1"));
        assertThat(result.getDriver(), equalTo("driver1"));
        assertThat(result.getPool(), equalTo("pool1"));
        assertThat(result.getRequest(), equalTo("request1"));
    }

    //BaseRock generated method id: ${testSetters}, hash: 715D0C341BA50A53CD8C5AADCC158633
    @Test
    void testSetters() {
        V1alpha3DeviceRequestAllocationResult result = new V1alpha3DeviceRequestAllocationResult();
        result.setAdminAccess(false);
        result.setDevice("device2");
        result.setDriver("driver2");
        result.setPool("pool2");
        result.setRequest("request2");
        assertThat(result.getAdminAccess(), is(false));
        assertThat(result.getDevice(), equalTo("device2"));
        assertThat(result.getDriver(), equalTo("driver2"));
        assertThat(result.getPool(), equalTo("pool2"));
        assertThat(result.getRequest(), equalTo("request2"));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 4A3349A153235C9E6BD9ED7CAD1A77E3
    @Test
    void testEqualsAndHashCode() {
        V1alpha3DeviceRequestAllocationResult result1 = new V1alpha3DeviceRequestAllocationResult().adminAccess(true).device("device1").driver("driver1").pool("pool1").request("request1");
        V1alpha3DeviceRequestAllocationResult result2 = new V1alpha3DeviceRequestAllocationResult().adminAccess(true).device("device1").driver("driver1").pool("pool1").request("request1");
        assertThat(result1, equalTo(result2));
        assertThat(result1.hashCode(), equalTo(result2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 09669E8FEC61317AF55D5946C5AA7E61
    @Test
    void testToString() {
        V1alpha3DeviceRequestAllocationResult result = new V1alpha3DeviceRequestAllocationResult().adminAccess(true).device("device1").driver("driver1").pool("pool1").request("request1");
        String expectedString = "class V1alpha3DeviceRequestAllocationResult {\n" + "    adminAccess: true\n" + "    device: device1\n" + "    driver: driver1\n" + "    pool: pool1\n" + "    request: request1\n" + "}";
        assertThat(result.toString(), equalTo(expectedString));
    }

    //BaseRock generated method id: ${testDeviceValidValues}, hash: 94672DA72B802FDFC0E81AA9406AC6AD
    @ParameterizedTest
    @ValueSource(strings = { "device1", "device2", "" })
    void testDeviceValidValues(String device) {
        V1alpha3DeviceRequestAllocationResult result = new V1alpha3DeviceRequestAllocationResult().device(device);
        assertThat(result.getDevice(), equalTo(device));
    }

    //BaseRock generated method id: ${testDeviceNullValue}, hash: 9E709963FDBF121545551E9A943EE439
    @Disabled
    @Test
    void testDeviceNullValue() {
        //V1alpha3DeviceRequestAllocationResult result = new V1alpha3DeviceRequestAllocationResult().device(null);
        //assertThat(result.getDevice(), is(nullValue()));
    }

    //BaseRock generated method id: ${testDriverValidValues}, hash: 5843EE8CE607DAFBBFE032AD76F1F893
    @ParameterizedTest
    @ValueSource(strings = { "driver1", "driver2", "" })
    void testDriverValidValues(String driver) {
        V1alpha3DeviceRequestAllocationResult result = new V1alpha3DeviceRequestAllocationResult().driver(driver);
        assertThat(result.getDriver(), equalTo(driver));
    }

    //BaseRock generated method id: ${testDriverNullValue}, hash: C68B289757269655FE1880038933D954
    @Disabled
    @Test
    void testDriverNullValue() {
        //V1alpha3DeviceRequestAllocationResult result = new V1alpha3DeviceRequestAllocationResult().driver(null);
        //assertThat(result.getDriver(), is(nullValue()));
    }

    //BaseRock generated method id: ${testPoolValidValues}, hash: 882DEE0D5FFE1F03FF6CB193543C0679
    @ParameterizedTest
    @ValueSource(strings = { "pool1", "pool2", "" })
    void testPoolValidValues(String pool) {
        V1alpha3DeviceRequestAllocationResult result = new V1alpha3DeviceRequestAllocationResult().pool(pool);
        assertThat(result.getPool(), equalTo(pool));
    }

    //BaseRock generated method id: ${testPoolNullValue}, hash: FD12481E8CFE485ACFA3CC24D327240F
    @Disabled
    @Test
    void testPoolNullValue() {
        //V1alpha3DeviceRequestAllocationResult result = new V1alpha3DeviceRequestAllocationResult().pool(null);
        //assertThat(result.getPool(), is(nullValue()));
    }

    //BaseRock generated method id: ${testRequestValidValues}, hash: 45BF9797565460E2D25455B78D304FF6
    @ParameterizedTest
    @ValueSource(strings = { "request1", "request2", "" })
    void testRequestValidValues(String request) {
        V1alpha3DeviceRequestAllocationResult result = new V1alpha3DeviceRequestAllocationResult().request(request);
        assertThat(result.getRequest(), equalTo(request));
    }

    //BaseRock generated method id: ${testRequestNullValue}, hash: 3EDB72392FC6CD8A1BB946B3B841ACB1
    @Disabled
    @Test
    void testRequestNullValue() {
        //V1alpha3DeviceRequestAllocationResult result = new V1alpha3DeviceRequestAllocationResult().request(null);
        //assertThat(result.getRequest(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAdminAccessDefaultValue}, hash: 650B25F258A7372CF0FF2777667CFD0C
    @Disabled
    @Test
    void testAdminAccessDefaultValue() {
        //V1alpha3DeviceRequestAllocationResult result = new V1alpha3DeviceRequestAllocationResult();
        //assertThat(result.getAdminAccess(), is(nullValue()));
    }
}