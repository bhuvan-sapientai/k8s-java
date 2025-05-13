package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import io.kubernetes.client.openapi.models.V1ConfigMapEnvSource;
import java.util.Objects;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.V1SecretEnvSource;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1EnvFromSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 35C7070A952F9485136DC5AFE3811369
    @Test
    void testConstructor() {
        V1EnvFromSource envFromSource = new V1EnvFromSource();
        assertThat(envFromSource, is(notNullValue()));
    }

    //BaseRock generated method id: ${testConfigMapRef}, hash: CEF41B23504D9945F0B1CB17E17F157B
    @Test
    void testConfigMapRef() {
        V1ConfigMapEnvSource configMapRef = mock(V1ConfigMapEnvSource.class);
        V1EnvFromSource envFromSource = new V1EnvFromSource().configMapRef(configMapRef);
        assertThat(envFromSource.getConfigMapRef(), is(equalTo(configMapRef)));
    }

    //BaseRock generated method id: ${testPrefix}, hash: 8CD9928C5244289CA2B172691583B25C
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "test", "another-test" })
    void testPrefix(String prefix) {
        V1EnvFromSource envFromSource = new V1EnvFromSource().prefix(prefix);
        assertThat(envFromSource.getPrefix(), is(equalTo(prefix)));
    }

    //BaseRock generated method id: ${testSecretRef}, hash: FEB25028560B422F13AF45FDD461636B
    @Test
    void testSecretRef() {
        V1SecretEnvSource secretRef = mock(V1SecretEnvSource.class);
        V1EnvFromSource envFromSource = new V1EnvFromSource().secretRef(secretRef);
        assertThat(envFromSource.getSecretRef(), is(equalTo(secretRef)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 1A8A5134A42D05657EBE6AFC7ACDBC05
    @Test
    void testEquals() {
        V1ConfigMapEnvSource configMapRef = mock(V1ConfigMapEnvSource.class);
        V1SecretEnvSource secretRef = mock(V1SecretEnvSource.class);
        V1EnvFromSource envFromSource1 = new V1EnvFromSource().configMapRef(configMapRef).prefix("test").secretRef(secretRef);
        V1EnvFromSource envFromSource2 = new V1EnvFromSource().configMapRef(configMapRef).prefix("test").secretRef(secretRef);
        assertThat(envFromSource1.equals(envFromSource2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 02D4BBBAA7BEF102F79649AC3BA93422
    @Test
    void testHashCode() {
        V1ConfigMapEnvSource configMapRef = mock(V1ConfigMapEnvSource.class);
        V1SecretEnvSource secretRef = mock(V1SecretEnvSource.class);
        V1EnvFromSource envFromSource = new V1EnvFromSource().configMapRef(configMapRef).prefix("test").secretRef(secretRef);
        int expectedHashCode = Objects.hash(configMapRef, "test", secretRef);
        assertThat(envFromSource.hashCode(), is(equalTo(expectedHashCode)));
    }

    //BaseRock generated method id: ${testToString}, hash: A933F8DE6811CD8398AC038A4D9C94AC
    @Test
    void testToString() {
        V1ConfigMapEnvSource configMapRef = mock(V1ConfigMapEnvSource.class);
        V1SecretEnvSource secretRef = mock(V1SecretEnvSource.class);
        when(configMapRef.toString()).thenReturn("ConfigMapEnvSource");
        when(secretRef.toString()).thenReturn("SecretEnvSource");
        V1EnvFromSource envFromSource = new V1EnvFromSource().configMapRef(configMapRef).prefix("test").secretRef(secretRef);
        String expectedString = "class V1EnvFromSource {\n    configMapRef: ConfigMapEnvSource\n    prefix: test\n    secretRef: SecretEnvSource\n}";
        assertThat(envFromSource.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testSetConfigMapRef}, hash: ED7493B9092F92330CEC7F05E4780FB3
    @Test
    void testSetConfigMapRef() {
        V1ConfigMapEnvSource configMapRef = mock(V1ConfigMapEnvSource.class);
        V1EnvFromSource envFromSource = new V1EnvFromSource();
        envFromSource.setConfigMapRef(configMapRef);
        assertThat(envFromSource.getConfigMapRef(), is(equalTo(configMapRef)));
    }

    //BaseRock generated method id: ${testSetPrefix}, hash: C62F4A3FB580E629B59B9692EAA5D20C
    @Test
    void testSetPrefix() {
        V1EnvFromSource envFromSource = new V1EnvFromSource();
        envFromSource.setPrefix("test");
        assertThat(envFromSource.getPrefix(), is(equalTo("test")));
    }

    //BaseRock generated method id: ${testSetSecretRef}, hash: 988E70529234C56AE50F425E53EC80A9
    @Test
    void testSetSecretRef() {
        V1SecretEnvSource secretRef = mock(V1SecretEnvSource.class);
        V1EnvFromSource envFromSource = new V1EnvFromSource();
        envFromSource.setSecretRef(secretRef);
        assertThat(envFromSource.getSecretRef(), is(equalTo(secretRef)));
    }
}
