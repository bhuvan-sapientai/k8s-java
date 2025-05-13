package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ResourceRequirements;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1SecurityContext;
import static org.hamcrest.Matchers.contains;
import io.kubernetes.client.openapi.models.V1VolumeMount;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.empty;
import io.kubernetes.client.openapi.models.V1ContainerResizePolicy;
import static org.hamcrest.Matchers.containsInAnyOrder;
import io.kubernetes.client.openapi.models.V1EnvFromSource;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.openapi.models.V1ContainerPort;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.V1Probe;
import io.kubernetes.client.openapi.models.V1VolumeDevice;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1Lifecycle;
import io.kubernetes.client.openapi.models.V1EnvVar;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1ContainerBaseRockGeneratedTest {

    private V1Container container;

    @BeforeEach
    void setUp() {
        container = new V1Container();
    }

    // Other test methods remain unchanged
    //BaseRock generated method id: ${testToString}, hash: 75965FDE63D437D9AFAF67BB4BE625BA
    @Disabled()
    @Test
    void testToString() {
        V1Container container = new V1Container().name("myContainer").image("nginx:latest");
        String toString = container.toString();
        assertTrue(toString.contains("name=myContainer"));
        assertTrue(toString.contains("image=nginx:latest"));
        assertTrue(toString.startsWith("class V1Container {"));
        assertTrue(toString.endsWith("}"));
    }
}
