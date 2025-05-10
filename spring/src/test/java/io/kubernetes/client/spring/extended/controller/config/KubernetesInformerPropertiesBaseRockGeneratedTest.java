package io.kubernetes.client.spring.extended.controller.config;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.spring.extended.controller.config.KubernetesInformerProperties;
import io.kubernetes.client.informer.cache.ReflectorRunnable;
import java.time.Duration;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class KubernetesInformerPropertiesBaseRockGeneratedTest {

    private KubernetesInformerProperties kubernetesInformerProperties;

    @BeforeEach
    void setUp() {
        kubernetesInformerProperties = new KubernetesInformerProperties();
    }

    //BaseRock generated method id: ${testGetClientReadTimeout}, hash: 319BD906C4C3AE84CA9E5191ACEF1726
    @Test
    void testGetClientReadTimeout() {
        Duration expectedTimeout = ReflectorRunnable.REFLECTOR_WATCH_CLIENTSIDE_MAX_TIMEOUT;
        assertThat(kubernetesInformerProperties.getClientReadTimeout(), is(equalTo(expectedTimeout)));
    }

    //BaseRock generated method id: ${testSetClientReadTimeout}, hash: F76B5E968472A26F0F390DFBEC101999
    @Test
    void testSetClientReadTimeout() {
        Duration newTimeout = Duration.ofSeconds(30);
        KubernetesInformerProperties result = kubernetesInformerProperties.setClientReadTimeout(newTimeout);
        assertThat(result, is(notNullValue()));
        assertThat(result, is(equalTo(kubernetesInformerProperties)));
        assertThat(kubernetesInformerProperties.getClientReadTimeout(), is(equalTo(newTimeout)));
    }

    //BaseRock generated method id: ${testInstantiation}, hash: 0D81D373DDED1C8E0D0AF1B05DBBCDCA
    @Test
    void testInstantiation() {
        assertThat(kubernetesInformerProperties, is(notNullValue()));
    }
}
