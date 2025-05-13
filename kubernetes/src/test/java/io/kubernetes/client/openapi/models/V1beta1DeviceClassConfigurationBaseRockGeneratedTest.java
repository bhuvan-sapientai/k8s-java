package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.V1beta1OpaqueDeviceConfiguration;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1beta1DeviceClassConfiguration;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1DeviceClassConfigurationBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 43802BF6351E7DC5334469337AFF6470
    @Test
    void testConstructor() {
        V1beta1DeviceClassConfiguration configuration = new V1beta1DeviceClassConfiguration();
        assertThat(configuration, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetOpaque}, hash: ABE16A402D911176FA9AE75D3B315ACC
    @Test
    void testSetAndGetOpaque() {
        V1beta1DeviceClassConfiguration configuration = new V1beta1DeviceClassConfiguration();
        V1beta1OpaqueDeviceConfiguration opaqueConfig = mock(V1beta1OpaqueDeviceConfiguration.class);
        configuration.setOpaque(opaqueConfig);
        assertThat(configuration.getOpaque(), is(equalTo(opaqueConfig)));
    }

    //BaseRock generated method id: ${testEquals}, hash: E43FC5DF7165552E0A9992604BC83DA8
    @Test
    void testEquals() {
        V1beta1DeviceClassConfiguration config1 = new V1beta1DeviceClassConfiguration();
        V1beta1DeviceClassConfiguration config2 = new V1beta1DeviceClassConfiguration();
        V1beta1OpaqueDeviceConfiguration opaqueConfig = mock(V1beta1OpaqueDeviceConfiguration.class);
        config1.setOpaque(opaqueConfig);
        config2.setOpaque(opaqueConfig);
        assertThat(config1, is(equalTo(config2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: FCA393582C396600BB894AA5E2CE5846
    @Test
    void testHashCode() {
        V1beta1DeviceClassConfiguration config = new V1beta1DeviceClassConfiguration();
        V1beta1OpaqueDeviceConfiguration opaqueConfig = mock(V1beta1OpaqueDeviceConfiguration.class);
        config.setOpaque(opaqueConfig);
        assertThat(config.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 2187A2E56F514D5EE8B520378C0AA962
    @Test
    void testToString() {
        V1beta1DeviceClassConfiguration config = new V1beta1DeviceClassConfiguration();
        V1beta1OpaqueDeviceConfiguration opaqueConfig = mock(V1beta1OpaqueDeviceConfiguration.class);
        when(opaqueConfig.toString()).thenReturn("MockOpaqueConfig");
        config.setOpaque(opaqueConfig);
        String result = config.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result.contains("opaque"), is(true));
        assertThat(result.contains("MockOpaqueConfig"), is(true));
    }

    //BaseRock generated method id: ${testOpaqueField}, hash: A453BBFC9DB5DFD6E6BDE67C5923F58A
    @Test
    void testOpaqueField() {
        V1beta1DeviceClassConfiguration config = new V1beta1DeviceClassConfiguration();
        assertThat(config.getOpaque(), is(equalTo(null)));
        V1beta1OpaqueDeviceConfiguration opaqueConfig = mock(V1beta1OpaqueDeviceConfiguration.class);
        config.opaque(opaqueConfig);
        assertThat(config.getOpaque(), is(equalTo(opaqueConfig)));
    }
}
