package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import io.kubernetes.client.openapi.models.V1alpha3OpaqueDeviceConfiguration;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha3DeviceClassConfigurationBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: D85B20EE38E967AB16619EF5D1B3D710
    @Test
    void testConstructor() {
        V1alpha3DeviceClassConfiguration configuration = new V1alpha3DeviceClassConfiguration();
        assertNotNull(configuration);
    }

    //BaseRock generated method id: ${testOpaqueGetterAndSetter}, hash: 45D56864F580FCE45990FD61096831C6
    @Test
    void testOpaqueGetterAndSetter() {
        V1alpha3DeviceClassConfiguration configuration = new V1alpha3DeviceClassConfiguration();
        V1alpha3OpaqueDeviceConfiguration opaqueConfig = mock(V1alpha3OpaqueDeviceConfiguration.class);
        configuration.setOpaque(opaqueConfig);
        assertEquals(opaqueConfig, configuration.getOpaque());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 4033CEEDD662DDF0B6C5B463162789C6
    @Test
    void testEqualsWithSameObject() {
        V1alpha3DeviceClassConfiguration configuration = new V1alpha3DeviceClassConfiguration();
        assertTrue(configuration.equals(configuration));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 9CE0A13FF7C928B3999B0AD62F5EB9AD
    @Test
    void testEqualsWithDifferentObject() {
        V1alpha3DeviceClassConfiguration configuration1 = new V1alpha3DeviceClassConfiguration();
        V1alpha3DeviceClassConfiguration configuration2 = new V1alpha3DeviceClassConfiguration();
        V1alpha3OpaqueDeviceConfiguration opaqueConfig1 = mock(V1alpha3OpaqueDeviceConfiguration.class);
        V1alpha3OpaqueDeviceConfiguration opaqueConfig2 = mock(V1alpha3OpaqueDeviceConfiguration.class);
        configuration1.setOpaque(opaqueConfig1);
        configuration2.setOpaque(opaqueConfig2);
        assertFalse(configuration1.equals(configuration2));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: 1701DEB3E3F9AF8AFA618111B5307CA0
    @Test
    void testEqualsWithNull() {
        V1alpha3DeviceClassConfiguration configuration = new V1alpha3DeviceClassConfiguration();
        assertFalse(configuration.equals(null));
    }

    //BaseRock generated method id: ${testHashCode}, hash: B56D9C72B6A7817932CE0E82BFD340E8
    @Test
    void testHashCode() {
        V1alpha3DeviceClassConfiguration configuration1 = new V1alpha3DeviceClassConfiguration();
        V1alpha3DeviceClassConfiguration configuration2 = new V1alpha3DeviceClassConfiguration();
        assertEquals(configuration1.hashCode(), configuration2.hashCode());
        V1alpha3OpaqueDeviceConfiguration opaqueConfig = mock(V1alpha3OpaqueDeviceConfiguration.class);
        configuration1.setOpaque(opaqueConfig);
        assertNotEquals(configuration1.hashCode(), configuration2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 8F2D1DEA00BA9A35A18E0F5E2AF875A1
    @Test
    void testToString() {
        V1alpha3DeviceClassConfiguration configuration = new V1alpha3DeviceClassConfiguration();
        V1alpha3OpaqueDeviceConfiguration opaqueConfig = mock(V1alpha3OpaqueDeviceConfiguration.class);
        configuration.setOpaque(opaqueConfig);
        String result = configuration.toString();
        assertTrue(result.contains("class V1alpha3DeviceClassConfiguration"));
        assertTrue(result.contains("opaque:"));
    }
}
