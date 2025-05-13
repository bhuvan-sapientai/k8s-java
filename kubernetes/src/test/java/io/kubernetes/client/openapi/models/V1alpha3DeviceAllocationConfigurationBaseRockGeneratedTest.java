package io.kubernetes.client.openapi.models;

import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1alpha3OpaqueDeviceConfiguration;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.V1alpha3DeviceAllocationConfiguration;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha3DeviceAllocationConfigurationBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 9B7890F79ACAF4396E901A65A0B38274
    @Test
    void testConstructor() {
        V1alpha3DeviceAllocationConfiguration config = new V1alpha3DeviceAllocationConfiguration();
        assertThat(config, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetOpaque}, hash: E80434D69AF94E352E1CDBF3556CBDA8
    @Test
    void testSetAndGetOpaque() {
        V1alpha3DeviceAllocationConfiguration config = new V1alpha3DeviceAllocationConfiguration();
        V1alpha3OpaqueDeviceConfiguration opaqueConfig = mock(V1alpha3OpaqueDeviceConfiguration.class);
        config.setOpaque(opaqueConfig);
        assertEquals(opaqueConfig, config.getOpaque());
    }

    //BaseRock generated method id: ${testSetAndGetRequests}, hash: 669C2DA930B53A0D3B77754B69FC7E98
    @Test
    void testSetAndGetRequests() {
        V1alpha3DeviceAllocationConfiguration config = new V1alpha3DeviceAllocationConfiguration();
        List<String> requests = new ArrayList<>();
        requests.add("request1");
        requests.add("request2");
        config.setRequests(requests);
        assertThat(config.getRequests(), is(equalTo(requests)));
    }

    //BaseRock generated method id: ${testAddRequestsItem}, hash: 9CF885378270E29390E5A63883C137A9
    @Test
    void testAddRequestsItem() {
        V1alpha3DeviceAllocationConfiguration config = new V1alpha3DeviceAllocationConfiguration();
        config.addRequestsItem("request1");
        assertThat(config.getRequests(), hasSize(1));
        assertThat(config.getRequests().get(0), is(equalTo("request1")));
    }

    //BaseRock generated method id: ${testSetAndGetSource}, hash: 08D69194DE3F4688105BC6AAFD644690
    @Test
    void testSetAndGetSource() {
        V1alpha3DeviceAllocationConfiguration config = new V1alpha3DeviceAllocationConfiguration();
        config.setSource("testSource");
        assertEquals("testSource", config.getSource());
    }

    //BaseRock generated method id: ${testSetAndGetSourceWithValidValues}, hash: 28343F73E6568503E8BC62630CC99277
    @ParameterizedTest
    @ValueSource(strings = { "class", "claim" })
    void testSetAndGetSourceWithValidValues(String source) {
        V1alpha3DeviceAllocationConfiguration config = new V1alpha3DeviceAllocationConfiguration();
        config.setSource(source);
        assertEquals(source, config.getSource());
    }

    //BaseRock generated method id: ${testEquals}, hash: 78E4ACF8AB4E25ABAECD2085367CCCF3
    @Test
    void testEquals() {
        V1alpha3DeviceAllocationConfiguration config1 = new V1alpha3DeviceAllocationConfiguration().opaque(new V1alpha3OpaqueDeviceConfiguration()).requests(new ArrayList<>()).source("testSource");
        V1alpha3DeviceAllocationConfiguration config2 = new V1alpha3DeviceAllocationConfiguration().opaque(new V1alpha3OpaqueDeviceConfiguration()).requests(new ArrayList<>()).source("testSource");
        assertThat(config1.equals(config2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 6C3FA52EFE5AE7994FE4F828DBDAED23
    @Test
    void testHashCode() {
        V1alpha3DeviceAllocationConfiguration config = new V1alpha3DeviceAllocationConfiguration().opaque(mock(V1alpha3OpaqueDeviceConfiguration.class)).requests(new ArrayList<>()).source("testSource");
        assertThat(config.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 41977C0716DE42AA89B839784BEEAFD4
    @Test
    void testToString() {
        V1alpha3DeviceAllocationConfiguration config = new V1alpha3DeviceAllocationConfiguration().opaque(mock(V1alpha3OpaqueDeviceConfiguration.class)).requests(new ArrayList<>()).source("testSource");
        String result = config.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result, startsWith("class V1alpha3DeviceAllocationConfiguration"));
    }

    //BaseRock generated method id: ${testSetNullOpaque}, hash: A59F3E3C4A4CC9101737B96E78FC6915
    @Test
    void testSetNullOpaque() {
        V1alpha3DeviceAllocationConfiguration config = new V1alpha3DeviceAllocationConfiguration();
        config.setOpaque(null);
        assertThat(config.getOpaque(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetNullRequests}, hash: 516A59E96771CF59505A02815446A90E
    @Test
    void testSetNullRequests() {
        V1alpha3DeviceAllocationConfiguration config = new V1alpha3DeviceAllocationConfiguration();
        config.setRequests(null);
        assertThat(config.getRequests(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetNullSource}, hash: EF2F01F977A694031B32AB7C18CA7D7B
    @Test
    void testSetNullSource() {
        V1alpha3DeviceAllocationConfiguration config = new V1alpha3DeviceAllocationConfiguration();
        config.setSource("initialSource");
        config.setSource(null);
        assertThat(config.getSource(), is(equalTo(null)));
    }
}
