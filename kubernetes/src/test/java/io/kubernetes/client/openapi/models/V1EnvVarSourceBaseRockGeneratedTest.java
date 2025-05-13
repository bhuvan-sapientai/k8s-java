package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.mockito.Mock;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1EnvVarSourceBaseRockGeneratedTest {

    @Mock
    private V1ConfigMapKeySelector configMapKeyRef;

    @Mock
    private V1ObjectFieldSelector fieldRef;

    @Mock
    private V1ResourceFieldSelector resourceFieldRef;

    @Mock
    private V1SecretKeySelector secretKeyRef;

    private V1EnvVarSource envVarSource;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        envVarSource = new V1EnvVarSource();
    }

    //BaseRock generated method id: ${testConfigMapKeyRef}, hash: 1CE5D2C808EBD579C468570EA25A0B46
    @Test
    void testConfigMapKeyRef() {
        envVarSource.setConfigMapKeyRef(configMapKeyRef);
        assertEquals(configMapKeyRef, envVarSource.getConfigMapKeyRef());
    }

    //BaseRock generated method id: ${testFieldRef}, hash: A4730719B6432C3D9DB9D3457DA69701
    @Test
    void testFieldRef() {
        envVarSource.setFieldRef(fieldRef);
        assertEquals(fieldRef, envVarSource.getFieldRef());
    }

    //BaseRock generated method id: ${testResourceFieldRef}, hash: F0B8CBBEF3681F33763DB370FC4C2C79
    @Test
    void testResourceFieldRef() {
        envVarSource.setResourceFieldRef(resourceFieldRef);
        assertEquals(resourceFieldRef, envVarSource.getResourceFieldRef());
    }

    //BaseRock generated method id: ${testSecretKeyRef}, hash: 7868F7D84880F311A73D494730B9C537
    @Test
    void testSecretKeyRef() {
        envVarSource.setSecretKeyRef(secretKeyRef);
        assertEquals(secretKeyRef, envVarSource.getSecretKeyRef());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: FB6697BA2C49F907E02D88A37169C6B5
    @Test
    void testEqualsAndHashCode() {
        V1EnvVarSource envVarSource1 = new V1EnvVarSource().configMapKeyRef(configMapKeyRef).fieldRef(fieldRef).resourceFieldRef(resourceFieldRef).secretKeyRef(secretKeyRef);
        V1EnvVarSource envVarSource2 = new V1EnvVarSource().configMapKeyRef(configMapKeyRef).fieldRef(fieldRef).resourceFieldRef(resourceFieldRef).secretKeyRef(secretKeyRef);
        assertEquals(envVarSource1, envVarSource2);
        assertEquals(envVarSource1.hashCode(), envVarSource2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 35EFB15D1FDDC7EE99547C43853180FB
    @Test
    void testToString() {
        V1EnvVarSource envVarSource = new V1EnvVarSource().configMapKeyRef(configMapKeyRef).fieldRef(fieldRef).resourceFieldRef(resourceFieldRef).secretKeyRef(secretKeyRef);
        String expected = "class V1EnvVarSource {\n" + "    configMapKeyRef: " + configMapKeyRef + "\n" + "    fieldRef: " + fieldRef + "\n" + "    resourceFieldRef: " + resourceFieldRef + "\n" + "    secretKeyRef: " + secretKeyRef + "\n" + "}";
        assertEquals(expected, envVarSource.toString());
    }

    //BaseRock generated method id: ${testBuilder}, hash: 33260847FD90BA0005A710264DF22A2E
    @Test
    void testBuilder() {
        V1EnvVarSource envVarSource = new V1EnvVarSource().configMapKeyRef(configMapKeyRef).fieldRef(fieldRef).resourceFieldRef(resourceFieldRef).secretKeyRef(secretKeyRef);
        assertEquals(configMapKeyRef, envVarSource.getConfigMapKeyRef());
        assertEquals(fieldRef, envVarSource.getFieldRef());
        assertEquals(resourceFieldRef, envVarSource.getResourceFieldRef());
        assertEquals(secretKeyRef, envVarSource.getSecretKeyRef());
    }
}
