package io.kubernetes.client.spring.extended.manifests.config;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.time.Duration;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class KubernetesManifestsPropertiesBaseRockGeneratedTest {

    //BaseRock generated method id: ${testDefaultRefreshInterval}, hash: FC82489286FD648C385F2A2614D7C68C
    @Test
    void testDefaultRefreshInterval() {
        KubernetesManifestsProperties properties = new KubernetesManifestsProperties();
        assertThat(properties.getRefreshInterval(), is(equalTo(Duration.ofSeconds(5))));
    }

    //BaseRock generated method id: ${testSetRefreshInterval}, hash: E367F38E4F9676A3529CF84601F47BB8
    @ParameterizedTest
    @ValueSource(longs = { 1, 10, 60, 300 })
    void testSetRefreshInterval(long seconds) {
        KubernetesManifestsProperties properties = new KubernetesManifestsProperties();
        Duration duration = Duration.ofSeconds(seconds);
        KubernetesManifestsProperties result = properties.setRefreshInterval(duration);
        assertThat(result, is(notNullValue()));
        assertThat(result, is(equalTo(properties)));
        assertThat(properties.getRefreshInterval(), is(equalTo(duration)));
    }

    //BaseRock generated method id: ${testSetRefreshIntervalWithZeroDuration}, hash: 7F119AD5D8C7E2D1D78C3D8F1123EFE6
    @Test
    void testSetRefreshIntervalWithZeroDuration() {
        KubernetesManifestsProperties properties = new KubernetesManifestsProperties();
        Duration zeroDuration = Duration.ZERO;
        KubernetesManifestsProperties result = properties.setRefreshInterval(zeroDuration);
        assertThat(result, is(notNullValue()));
        assertThat(result, is(equalTo(properties)));
        assertThat(properties.getRefreshInterval(), is(equalTo(zeroDuration)));
    }

    //BaseRock generated method id: ${testSetRefreshIntervalWithNegativeDuration}, hash: DB7C011813CCC43AF8840948D1D64E4C
    @Test
    void testSetRefreshIntervalWithNegativeDuration() {
        KubernetesManifestsProperties properties = new KubernetesManifestsProperties();
        Duration negativeDuration = Duration.ofSeconds(-10);
        KubernetesManifestsProperties result = properties.setRefreshInterval(negativeDuration);
        assertThat(result, is(notNullValue()));
        assertThat(result, is(equalTo(properties)));
        assertThat(properties.getRefreshInterval(), is(equalTo(negativeDuration)));
    }

    //BaseRock generated method id: ${testConstructor}, hash: C6AE091278A552133E0D779C82DB6D85
    @Test
    void testConstructor() {
        KubernetesManifestsProperties properties = new KubernetesManifestsProperties();
        assertThat(properties, is(notNullValue()));
    }
}
