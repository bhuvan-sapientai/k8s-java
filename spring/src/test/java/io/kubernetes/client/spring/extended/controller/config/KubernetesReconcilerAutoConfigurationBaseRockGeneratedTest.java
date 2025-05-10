package io.kubernetes.client.spring.extended.controller.config;

import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import io.prometheus.client.CollectorRegistry;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class KubernetesReconcilerAutoConfigurationBaseRockGeneratedTest {

    //BaseRock generated method id: ${testPrometheusCollectorRegistry}, hash: C0BE514CF0C384B62C64E0D02F53445F
    @Disabled
    @Test
    void testPrometheusCollectorRegistry() {
        /*try (MockedStatic<CollectorRegistry> mockedStatic = mockStatic(CollectorRegistry.class)) {
    // Arrange
    CollectorRegistry mockRegistry = mock(CollectorRegistry.class);
    mockedStatic.when(CollectorRegistry::defaultRegistry).thenReturn(mockRegistry);
    // Act
    KubernetesReconcilerAutoConfiguration config = new KubernetesReconcilerAutoConfiguration();
    CollectorRegistry result = config.prometheusCollectorRegistry();
    // Assert
    assertNotNull(result);
    assertThat(result, is(mockRegistry));
}*/
    }

    //BaseRock generated method id: ${testKubernetesReconcilerAutoConfigurationInstantiation}, hash: C82469712D5B0D89EEE944E8CAE9D2C0
    @Test
    void testKubernetesReconcilerAutoConfigurationInstantiation() {
        // Act
        KubernetesReconcilerAutoConfiguration config = new KubernetesReconcilerAutoConfiguration();
        // Assert
        assertThat(config, is(notNullValue()));
    }
}