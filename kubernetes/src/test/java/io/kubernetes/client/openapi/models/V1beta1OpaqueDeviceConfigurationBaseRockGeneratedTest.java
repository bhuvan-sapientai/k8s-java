package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.V1beta1OpaqueDeviceConfiguration;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1OpaqueDeviceConfigurationBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 00D511C65A5590CADC7E9CDA2AEF9AF8
    @Test
    void testConstructor() {
        V1beta1OpaqueDeviceConfiguration config = new V1beta1OpaqueDeviceConfiguration();
        assertNotNull(config);
    }

    //BaseRock generated method id: ${testDriverSetter}, hash: 441972A5E845E1494F144FB4472F6C30
    @Test
    void testDriverSetter() {
        V1beta1OpaqueDeviceConfiguration config = new V1beta1OpaqueDeviceConfiguration();
        config.setDriver("test-driver");
        assertEquals("test-driver", config.getDriver());
    }

    //BaseRock generated method id: ${testParametersSetter}, hash: E51FF987F3CF4E6364655ACC8CABAC91
    @Test
    void testParametersSetter() {
        V1beta1OpaqueDeviceConfiguration config = new V1beta1OpaqueDeviceConfiguration();
        Object params = new Object();
        config.setParameters(params);
        assertEquals(params, config.getParameters());
    }

    //BaseRock generated method id: ${testEquals}, hash: 96E01BB333B468573C424A2F6D9EF1AB
    @Test
    void testEquals() {
        Object params1 = new Object();
        Object params2 = new Object();
        V1beta1OpaqueDeviceConfiguration config1 = new V1beta1OpaqueDeviceConfiguration().driver("driver1").parameters(params1);
        V1beta1OpaqueDeviceConfiguration config2 = new V1beta1OpaqueDeviceConfiguration().driver("driver1").parameters(params1);
        V1beta1OpaqueDeviceConfiguration config3 = new V1beta1OpaqueDeviceConfiguration().driver("driver2").parameters(params2);
        assertTrue(config1.equals(config2));
        assertFalse(config1.equals(config3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: C5BD11FE482A143D3F9A9313EB48F9C8
    @Test
    void testHashCode() {
        Object params = new Object();
        V1beta1OpaqueDeviceConfiguration config1 = new V1beta1OpaqueDeviceConfiguration().driver("driver1").parameters(params);
        V1beta1OpaqueDeviceConfiguration config2 = new V1beta1OpaqueDeviceConfiguration().driver("driver1").parameters(params);
        assertEquals(config1.hashCode(), config2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 92B48CDA4463F1B238B0EC25AB441895
    @Test
    void testToString() {
        V1beta1OpaqueDeviceConfiguration config = new V1beta1OpaqueDeviceConfiguration().driver("test-driver").parameters(new Object());
        String result = config.toString();
        assertTrue(result.contains("driver"));
        assertTrue(result.contains("test-driver"));
        assertTrue(result.contains("parameters"));
    }

    //BaseRock generated method id: ${testDriverWithMultipleValues}, hash: 46E322C81F14BA1DD266F32B5F85F2BC
    @ParameterizedTest
    @ValueSource(strings = { "driver1", "driver2", "driver3" })
    void testDriverWithMultipleValues(String driverValue) {
        V1beta1OpaqueDeviceConfiguration config = new V1beta1OpaqueDeviceConfiguration();
        config.setDriver(driverValue);
        assertEquals(driverValue, config.getDriver());
    }

    //BaseRock generated method id: ${testNullDriver}, hash: 40A1DBA7D5FEC74197C06597EDDA60BA
    @Test
    void testNullDriver() {
        V1beta1OpaqueDeviceConfiguration config = new V1beta1OpaqueDeviceConfiguration();
        config.setDriver(null);
        assertNull(config.getDriver());
    }

    //BaseRock generated method id: ${testNullParameters}, hash: A0E39ED64E5379A0AA4020D0A4504E36
    @Test
    void testNullParameters() {
        V1beta1OpaqueDeviceConfiguration config = new V1beta1OpaqueDeviceConfiguration();
        config.setParameters(null);
        assertNull(config.getParameters());
    }
}
