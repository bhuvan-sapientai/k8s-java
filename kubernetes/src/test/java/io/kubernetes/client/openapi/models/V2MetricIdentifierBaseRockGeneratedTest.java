package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V2MetricIdentifierBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 47A35FFB0FEFC30B26DCF1EE2F319FD8
    @Test
    void testConstructor() {
        V2MetricIdentifier metricIdentifier = new V2MetricIdentifier();
        assertThat(metricIdentifier, is(notNullValue()));
    }

    //BaseRock generated method id: ${testNameSetter}, hash: 7F5E1806F89D796016449143809EAE95
    @Test
    void testNameSetter() {
        V2MetricIdentifier metricIdentifier = new V2MetricIdentifier();
        metricIdentifier.setName("test-metric");
        assertThat(metricIdentifier.getName(), is(equalTo("test-metric")));
    }

    //BaseRock generated method id: ${testNameSetterWithDifferentValues}, hash: C04269CBAF1AEFF2A9E943AEF6A9AE67
    @ParameterizedTest
    @ValueSource(strings = { "metric1", "metric2", "metric3" })
    void testNameSetterWithDifferentValues(String metricName) {
        V2MetricIdentifier metricIdentifier = new V2MetricIdentifier();
        metricIdentifier.setName(metricName);
        assertThat(metricIdentifier.getName(), is(equalTo(metricName)));
    }

    //BaseRock generated method id: ${testNameSetterWithNullAndEmptyString}, hash: D7DA1A04F8B5EE7B4BCABD4C64E18C0C
    @ParameterizedTest
    @NullAndEmptySource
    void testNameSetterWithNullAndEmptyString(String metricName) {
        V2MetricIdentifier metricIdentifier = new V2MetricIdentifier();
        metricIdentifier.setName(metricName);
        assertThat(metricIdentifier.getName(), is(equalTo(metricName)));
    }

    //BaseRock generated method id: ${testNameGetter}, hash: EE6F1CE22B970FE3568C95048459837A
    @Test
    void testNameGetter() {
        V2MetricIdentifier metricIdentifier = new V2MetricIdentifier();
        metricIdentifier.setName("test-metric");
        assertThat(metricIdentifier.getName(), is(equalTo("test-metric")));
    }

    //BaseRock generated method id: ${testSelectorSetter}, hash: 893E66D7877ACC87CF41FD865CDC19A1
    @Test
    void testSelectorSetter() {
        V2MetricIdentifier metricIdentifier = new V2MetricIdentifier();
        V1LabelSelector labelSelector = mock(V1LabelSelector.class);
        metricIdentifier.setSelector(labelSelector);
        assertThat(metricIdentifier.getSelector(), is(equalTo(labelSelector)));
    }

    //BaseRock generated method id: ${testSelectorGetter}, hash: C073DDF3258DDE7A98BBD86F7A040160
    @Test
    void testSelectorGetter() {
        V2MetricIdentifier metricIdentifier = new V2MetricIdentifier();
        V1LabelSelector labelSelector = mock(V1LabelSelector.class);
        metricIdentifier.setSelector(labelSelector);
        assertThat(metricIdentifier.getSelector(), is(equalTo(labelSelector)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 4C80C80DF8EAAE3224BF2B9F6456B08B
    @Test
    void testEquals() {
        V2MetricIdentifier metricIdentifier1 = new V2MetricIdentifier().name("metric1");
        V2MetricIdentifier metricIdentifier2 = new V2MetricIdentifier().name("metric1");
        V2MetricIdentifier metricIdentifier3 = new V2MetricIdentifier().name("metric2");
        assertThat(metricIdentifier1.equals(metricIdentifier2), is(true));
        assertThat(metricIdentifier1.equals(metricIdentifier3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 2B8930977934DC14E29D1F6105D576CB
    @Test
    void testHashCode() {
        V2MetricIdentifier metricIdentifier1 = new V2MetricIdentifier().name("metric1");
        V2MetricIdentifier metricIdentifier2 = new V2MetricIdentifier().name("metric1");
        assertThat(metricIdentifier1.hashCode(), is(equalTo(metricIdentifier2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 3195961A5F90BA9E526C327B0C394586
    @Test
    void testToString() {
        V2MetricIdentifier metricIdentifier = new V2MetricIdentifier().name("test-metric").selector(new V1LabelSelector());
        String expectedString = "class V2MetricIdentifier {\n    name: test-metric\n    selector: class V1LabelSelector {\n        matchExpressions: []\n        matchLabels: {}\n    }\n}";
        assertThat(metricIdentifier.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testNameRequired}, hash: 1BEB7DF375F61E0A88975A7C56A920C4
    @Disabled
    @Test
    void testNameRequired() throws IOException {
        //V2MetricIdentifier metricIdentifier = new V2MetricIdentifier();
        /*assertThrows(IllegalArgumentException.class, () -> {
    JsonElement jsonElement = metricIdentifier.toJsonTree();
    V2MetricIdentifier.validateJsonElement(jsonElement);
});*/
    }
}
