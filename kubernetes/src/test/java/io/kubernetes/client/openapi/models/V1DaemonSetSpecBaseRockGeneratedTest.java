package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1LabelSelector;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1DaemonSetSpec;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1DaemonSetSpecBaseRockGeneratedTest {

    private V1DaemonSetSpec v1DaemonSetSpec;

    private V1LabelSelector mockSelector;

    private V1PodTemplateSpec mockTemplate;

    @BeforeEach
    void setUp() {
        mockSelector = mock(V1LabelSelector.class);
        mockTemplate = mock(V1PodTemplateSpec.class);
        v1DaemonSetSpec = new V1DaemonSetSpec().selector(mockSelector).template(mockTemplate);
    }

    //BaseRock generated method id: ${testConstructor}, hash: D1E41F7FA86D49CE7ACFA01DF624E1B8
    @Test
    void testConstructor() {
        assertThat(v1DaemonSetSpec, is(notNullValue()));
    }

    //BaseRock generated method id: ${testGetMinReadySeconds}, hash: FED36C4D66E2C2D6D846224A732C8A57
    @Test
    void testGetMinReadySeconds() {
        Integer minReadySeconds = 30;
        v1DaemonSetSpec.setMinReadySeconds(minReadySeconds);
        assertEquals(minReadySeconds, v1DaemonSetSpec.getMinReadySeconds());
    }

    //BaseRock generated method id: ${testGetRevisionHistoryLimit}, hash: E448F147DAA38AA14055D0ACF12349DF
    @Test
    void testGetRevisionHistoryLimit() {
        Integer revisionHistoryLimit = 5;
        v1DaemonSetSpec.setRevisionHistoryLimit(revisionHistoryLimit);
        assertEquals(revisionHistoryLimit, v1DaemonSetSpec.getRevisionHistoryLimit());
    }

    //BaseRock generated method id: ${testGetSelector}, hash: AA76B5468EBF03EA28AF47FC6118D01B
    @Test
    void testGetSelector() {
        assertThat(v1DaemonSetSpec.getSelector(), is(equalTo(mockSelector)));
    }

    //BaseRock generated method id: ${testGetTemplate}, hash: B8D73B0DD9D038689A0BF5E50DC745CB
    @Test
    void testGetTemplate() {
        assertThat(v1DaemonSetSpec.getTemplate(), is(equalTo(mockTemplate)));
    }

    //BaseRock generated method id: ${testGetUpdateStrategy}, hash: F42B64C8F721E9B0EEAC9E103E8B704A
    @Test
    void testGetUpdateStrategy() {
        V1DaemonSetUpdateStrategy updateStrategy = new V1DaemonSetUpdateStrategy();
        v1DaemonSetSpec.setUpdateStrategy(updateStrategy);
        assertThat(v1DaemonSetSpec.getUpdateStrategy(), is(equalTo(updateStrategy)));
    }

    //BaseRock generated method id: ${testSetMinReadySeconds}, hash: BBC8AEE2210987ED020BC12A0C80498E
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 10, 100 })
    void testSetMinReadySeconds(int minReadySeconds) {
        v1DaemonSetSpec.setMinReadySeconds(minReadySeconds);
        assertEquals(minReadySeconds, v1DaemonSetSpec.getMinReadySeconds());
    }

    //BaseRock generated method id: ${testSetRevisionHistoryLimit}, hash: DB42B700EAB349C178FCF652A651BDF1
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 5, 20 })
    void testSetRevisionHistoryLimit(int revisionHistoryLimit) {
        v1DaemonSetSpec.setRevisionHistoryLimit(revisionHistoryLimit);
        assertEquals(revisionHistoryLimit, v1DaemonSetSpec.getRevisionHistoryLimit());
    }

    //BaseRock generated method id: ${testSetSelector}, hash: 6D8F332CA56FAF8A12860A3D7C2B7E1B
    @Test
    void testSetSelector() {
        V1LabelSelector newSelector = new V1LabelSelector();
        v1DaemonSetSpec.setSelector(newSelector);
        assertThat(v1DaemonSetSpec.getSelector(), is(equalTo(newSelector)));
    }

    //BaseRock generated method id: ${testSetTemplate}, hash: 3D5A9178BD5E03F78F120AC8A3C091E4
    @Test
    void testSetTemplate() {
        V1PodTemplateSpec newTemplate = new V1PodTemplateSpec();
        v1DaemonSetSpec.setTemplate(newTemplate);
        assertThat(v1DaemonSetSpec.getTemplate(), is(equalTo(newTemplate)));
    }

    //BaseRock generated method id: ${testSetUpdateStrategy}, hash: A682DC70F1A4A6B0C8ACF2E94102F205
    @Test
    void testSetUpdateStrategy() {
        V1DaemonSetUpdateStrategy updateStrategy = new V1DaemonSetUpdateStrategy();
        v1DaemonSetSpec.setUpdateStrategy(updateStrategy);
        assertThat(v1DaemonSetSpec.getUpdateStrategy(), is(equalTo(updateStrategy)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: FB958336516155698F2E58D79555E4DC
    @Test
    void testEqualsAndHashCode() {
        V1DaemonSetSpec spec1 = new V1DaemonSetSpec().minReadySeconds(30).revisionHistoryLimit(5).selector(mockSelector).template(mockTemplate).updateStrategy(new V1DaemonSetUpdateStrategy());
        V1DaemonSetSpec spec2 = new V1DaemonSetSpec().minReadySeconds(30).revisionHistoryLimit(5).selector(mockSelector).template(mockTemplate).updateStrategy(new V1DaemonSetUpdateStrategy());
        assertThat(spec1, is(equalTo(spec2)));
        assertThat(spec1.hashCode(), is(equalTo(spec2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 18AE1E19F904751B2F1235EB66D949D3
    @Test
    void testToString() {
        v1DaemonSetSpec.setMinReadySeconds(30);
        v1DaemonSetSpec.setRevisionHistoryLimit(5);
        v1DaemonSetSpec.setUpdateStrategy(new V1DaemonSetUpdateStrategy());
        String expected = "class V1DaemonSetSpec {\n" + "    minReadySeconds: 30\n" + "    revisionHistoryLimit: 5\n" + "    selector: " + mockSelector + "\n" + "    template: " + mockTemplate + "\n" + "    updateStrategy: class V1DaemonSetUpdateStrategy {\n" + "        rollingUpdate: null\n" + "        type: null\n" + "    }\n" + "}";
        assertThat(v1DaemonSetSpec.toString(), is(equalTo(expected)));
    }

    //BaseRock generated method id: ${testSetNullSelector}, hash: C7BBBF72952FF28688A2B474D5CBC702
    @Test
    void testSetNullSelector() {
        v1DaemonSetSpec.setSelector(null);
        assertThat(v1DaemonSetSpec.getSelector(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetNullTemplate}, hash: 5753CEBEA90640C5F9638815E93FE853
    @Test
    void testSetNullTemplate() {
        v1DaemonSetSpec.setTemplate(null);
        assertThat(v1DaemonSetSpec.getTemplate(), is(equalTo(null)));
    }
}
