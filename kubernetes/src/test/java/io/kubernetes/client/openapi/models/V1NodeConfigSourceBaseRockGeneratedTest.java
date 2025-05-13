package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1NodeConfigSource;
import io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1NodeConfigSourceBaseRockGeneratedTest {

    private V1NodeConfigSource v1NodeConfigSource;

    @BeforeEach
    void setUp() {
        v1NodeConfigSource = new V1NodeConfigSource();
    }

    //BaseRock generated method id: ${testConfigMap}, hash: 74A11304B319C936DD43874BF2289F83
    @Test
    void testConfigMap() {
        V1ConfigMapNodeConfigSource configMap = mock(V1ConfigMapNodeConfigSource.class);
        v1NodeConfigSource.setConfigMap(configMap);
        assertEquals(configMap, v1NodeConfigSource.getConfigMap());
    }

    //BaseRock generated method id: ${testEquals}, hash: 81FBFFE18D8823584151790BD56C3F19
    @Test
    void testEquals() {
        V1NodeConfigSource other = new V1NodeConfigSource();
        V1ConfigMapNodeConfigSource configMap = mock(V1ConfigMapNodeConfigSource.class);
        v1NodeConfigSource.setConfigMap(configMap);
        other.setConfigMap(configMap);
        assertThat(v1NodeConfigSource, is(equalTo(other)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: D1C28760EEBB45D44ACBC9AD16D6C3CB
    @Test
    void testHashCode() {
        V1ConfigMapNodeConfigSource configMap = mock(V1ConfigMapNodeConfigSource.class);
        v1NodeConfigSource.setConfigMap(configMap);
        assertNotNull(v1NodeConfigSource.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 1C9E5521BA37F55DBC06DFC016FBC3EA
    @Test
    void testToString() {
        V1ConfigMapNodeConfigSource configMap = mock(V1ConfigMapNodeConfigSource.class);
        when(configMap.toString()).thenReturn("mockConfigMap");
        v1NodeConfigSource.setConfigMap(configMap);
        String result = v1NodeConfigSource.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result.contains("mockConfigMap"), is(true));
    }

    //BaseRock generated method id: ${testConstructor}, hash: 1E0C149E2ECA423C2471F12B63742327
    @Test
    void testConstructor() {
        assertNotNull(new V1NodeConfigSource());
    }
}
