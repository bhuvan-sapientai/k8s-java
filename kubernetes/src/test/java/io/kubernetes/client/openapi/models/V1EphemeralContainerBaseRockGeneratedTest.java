package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ResourceRequirements;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1SecurityContext;
import io.kubernetes.client.openapi.models.V1VolumeMount;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1ContainerResizePolicy;
import io.kubernetes.client.openapi.models.V1EnvFromSource;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.openapi.models.V1ContainerPort;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.V1Probe;
import io.kubernetes.client.openapi.models.V1VolumeDevice;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1Lifecycle;
import io.kubernetes.client.openapi.models.V1EnvVar;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class // ... (all other test methods remain unchanged)
V1EphemeralContainerBaseRockGeneratedTest {

    private V1EphemeralContainer v1EphemeralContainer;

    @BeforeEach
    void setUp() {
        v1EphemeralContainer = new V1EphemeralContainer();
    }

    // ... (all other test methods remain unchanged)
    //BaseRock generated method id: ${testNullValues}, hash: 26DB9CC8BCD504DB8885566278CEFD94
    @Test
    void testNullValues() {
        v1EphemeralContainer.setArgs(null);
        v1EphemeralContainer.setCommand(null);
        v1EphemeralContainer.setEnv(null);
        v1EphemeralContainer.setEnvFrom(null);
        v1EphemeralContainer.setPorts(null);
        v1EphemeralContainer.setResizePolicy(null);
        v1EphemeralContainer.setVolumeDevices(null);
        v1EphemeralContainer.setVolumeMounts(null);
        assertThat(v1EphemeralContainer.getArgs(), is(equalTo(null)));
        assertThat(v1EphemeralContainer.getCommand(), is(equalTo(null)));
        assertThat(v1EphemeralContainer.getEnv(), is(equalTo(null)));
        assertThat(v1EphemeralContainer.getEnvFrom(), is(equalTo(null)));
        assertThat(v1EphemeralContainer.getPorts(), is(equalTo(null)));
        assertThat(v1EphemeralContainer.getResizePolicy(), is(equalTo(null)));
        assertThat(v1EphemeralContainer.getVolumeDevices(), is(equalTo(null)));
        assertThat(v1EphemeralContainer.getVolumeMounts(), is(equalTo(null)));
    }
}
