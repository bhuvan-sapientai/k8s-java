package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1LabelSelector;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1DeploymentSpec;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1DeploymentStrategy;
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1DeploymentSpecBaseRockGeneratedTest {

    private V1DeploymentSpec v1DeploymentSpec;

    @BeforeEach
    void setUp() {
        v1DeploymentSpec = new V1DeploymentSpec();
    }

    //BaseRock generated method id: ${testMinReadySeconds}, hash: C0DEC7A072AFEB37EB802E23F6272B23
    @Test
    void testMinReadySeconds() {
        Integer minReadySeconds = 30;
        v1DeploymentSpec.setMinReadySeconds(minReadySeconds);
        assertThat(v1DeploymentSpec.getMinReadySeconds(), is(equalTo(minReadySeconds)));
    }

    //BaseRock generated method id: ${testPaused}, hash: 53D21D709A7872846CF8B96B7B97573C
    @Test
    void testPaused() {
        v1DeploymentSpec.setPaused(true);
        assertThat(v1DeploymentSpec.getPaused(), is(true));
    }

    //BaseRock generated method id: ${testProgressDeadlineSeconds}, hash: E87712DB299AC6D707645E14F0BF151D
    @Test
    void testProgressDeadlineSeconds() {
        Integer progressDeadlineSeconds = 600;
        v1DeploymentSpec.setProgressDeadlineSeconds(progressDeadlineSeconds);
        assertThat(v1DeploymentSpec.getProgressDeadlineSeconds(), is(equalTo(progressDeadlineSeconds)));
    }

    //BaseRock generated method id: ${testReplicas}, hash: 4AADF8A029A271C8EBC5B0EBC05DFFA9
    @Test
    void testReplicas() {
        Integer replicas = 3;
        v1DeploymentSpec.setReplicas(replicas);
        assertThat(v1DeploymentSpec.getReplicas(), is(equalTo(replicas)));
    }

    //BaseRock generated method id: ${testRevisionHistoryLimit}, hash: 5B3AEFF4A68D46E646275327E8A12563
    @Test
    void testRevisionHistoryLimit() {
        Integer revisionHistoryLimit = 10;
        v1DeploymentSpec.setRevisionHistoryLimit(revisionHistoryLimit);
        assertThat(v1DeploymentSpec.getRevisionHistoryLimit(), is(equalTo(revisionHistoryLimit)));
    }

    //BaseRock generated method id: ${testSelector}, hash: FB5CD568D5D8B40403180397373B15FF
    @Test
    void testSelector() {
        V1LabelSelector selector = mock(V1LabelSelector.class);
        v1DeploymentSpec.setSelector(selector);
        assertThat(v1DeploymentSpec.getSelector(), is(equalTo(selector)));
    }

    //BaseRock generated method id: ${testStrategy}, hash: 9805FF29154A42991A801BD729CBEC31
    @Test
    void testStrategy() {
        V1DeploymentStrategy strategy = mock(V1DeploymentStrategy.class);
        v1DeploymentSpec.setStrategy(strategy);
        assertThat(v1DeploymentSpec.getStrategy(), is(equalTo(strategy)));
    }

    //BaseRock generated method id: ${testTemplate}, hash: D5DC02318E431C81FC35097CFE7326BF
    @Test
    void testTemplate() {
        V1PodTemplateSpec template = mock(V1PodTemplateSpec.class);
        v1DeploymentSpec.setTemplate(template);
        assertThat(v1DeploymentSpec.getTemplate(), is(equalTo(template)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 93961F6502CAF03E5CA321F753017CD8
    @Test
    void testEquals() {
        V1DeploymentSpec spec1 = new V1DeploymentSpec().minReadySeconds(30).paused(true).progressDeadlineSeconds(600).replicas(3).revisionHistoryLimit(10).selector(new V1LabelSelector()).strategy(new V1DeploymentStrategy()).template(new V1PodTemplateSpec());
        V1DeploymentSpec spec2 = new V1DeploymentSpec().minReadySeconds(30).paused(true).progressDeadlineSeconds(600).replicas(3).revisionHistoryLimit(10).selector(new V1LabelSelector()).strategy(new V1DeploymentStrategy()).template(new V1PodTemplateSpec());
        assertThat(spec1.equals(spec2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 9694DDBE5A205DEEDA10ADB52DEBF960
    @Test
    void testHashCode() {
        V1DeploymentSpec spec1 = new V1DeploymentSpec().minReadySeconds(30).paused(true).progressDeadlineSeconds(600).replicas(3).revisionHistoryLimit(10).selector(new V1LabelSelector()).strategy(new V1DeploymentStrategy()).template(new V1PodTemplateSpec());
        V1DeploymentSpec spec2 = new V1DeploymentSpec().minReadySeconds(30).paused(true).progressDeadlineSeconds(600).replicas(3).revisionHistoryLimit(10).selector(new V1LabelSelector()).strategy(new V1DeploymentStrategy()).template(new V1PodTemplateSpec());
        assertThat(spec1.hashCode(), is(equalTo(spec2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 84DADF15B9208EC2FE7AE9CEACF4214E
    @Test
    void testToString() {
        V1DeploymentSpec spec = new V1DeploymentSpec().minReadySeconds(30).paused(true).progressDeadlineSeconds(600).replicas(3).revisionHistoryLimit(10).selector(new V1LabelSelector()).strategy(new V1DeploymentStrategy()).template(new V1PodTemplateSpec());
        String result = spec.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("minReadySeconds"), is(true));
        assertThat(result.contains("paused"), is(true));
        assertThat(result.contains("progressDeadlineSeconds"), is(true));
        assertThat(result.contains("replicas"), is(true));
        assertThat(result.contains("revisionHistoryLimit"), is(true));
        assertThat(result.contains("selector"), is(true));
        assertThat(result.contains("strategy"), is(true));
        assertThat(result.contains("template"), is(true));
    }

    //BaseRock generated method id: ${testMinReadySecondsWithValidValues}, hash: F2E89AC255DDA8141D1564F414C895A4
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 10, 100 })
    void testMinReadySecondsWithValidValues(int value) {
        v1DeploymentSpec.setMinReadySeconds(value);
        assertThat(v1DeploymentSpec.getMinReadySeconds(), is(equalTo(value)));
    }

    //BaseRock generated method id: ${testMinReadySecondsWithNegativeValue}, hash: F74439BF54605E00B9A219D57F3B4B7E
    @Test
    void testMinReadySecondsWithNegativeValue() {
        v1DeploymentSpec.setMinReadySeconds(-1);
        assertThat(v1DeploymentSpec.getMinReadySeconds(), is(equalTo(-1)));
    }

    //BaseRock generated method id: ${testProgressDeadlineSecondsWithValidValues}, hash: 636CEB90181C982ED20B9D43AEB79AAC
    @ParameterizedTest
    @ValueSource(ints = { 1, 10, 100, 1000 })
    void testProgressDeadlineSecondsWithValidValues(int value) {
        v1DeploymentSpec.setProgressDeadlineSeconds(value);
        assertThat(v1DeploymentSpec.getProgressDeadlineSeconds(), is(equalTo(value)));
    }

    //BaseRock generated method id: ${testProgressDeadlineSecondsWithNegativeValue}, hash: 29F454B68509FCFB719E2566BC337F6A
    @Test
    void testProgressDeadlineSecondsWithNegativeValue() {
        v1DeploymentSpec.setProgressDeadlineSeconds(-1);
        assertThat(v1DeploymentSpec.getProgressDeadlineSeconds(), is(equalTo(-1)));
    }

    //BaseRock generated method id: ${testReplicasWithValidValues}, hash: B7668889F22E5EEBFBB4369B74952DA2
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 10, 100 })
    void testReplicasWithValidValues(int value) {
        v1DeploymentSpec.setReplicas(value);
        assertThat(v1DeploymentSpec.getReplicas(), is(equalTo(value)));
    }

    //BaseRock generated method id: ${testReplicasWithNegativeValue}, hash: 6F2D013C5CD0273F48C0BDD0E77A95BA
    @Test
    void testReplicasWithNegativeValue() {
        v1DeploymentSpec.setReplicas(-1);
        assertThat(v1DeploymentSpec.getReplicas(), is(equalTo(-1)));
    }

    //BaseRock generated method id: ${testRevisionHistoryLimitWithValidValues}, hash: 9C0FC14CDEB3E6751B86A129D58CFFD5
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 10, 100 })
    void testRevisionHistoryLimitWithValidValues(int value) {
        v1DeploymentSpec.setRevisionHistoryLimit(value);
        assertThat(v1DeploymentSpec.getRevisionHistoryLimit(), is(equalTo(value)));
    }

    //BaseRock generated method id: ${testRevisionHistoryLimitWithNegativeValue}, hash: 0DD8A62655EECB5270FC65B6DA4DB0DF
    @Test
    void testRevisionHistoryLimitWithNegativeValue() {
        v1DeploymentSpec.setRevisionHistoryLimit(-1);
        assertThat(v1DeploymentSpec.getRevisionHistoryLimit(), is(equalTo(-1)));
    }

    //BaseRock generated method id: ${testNullValues}, hash: 4D5DEFF7138B9B6D740A61FBBDF8CBBA
    @Test
    void testNullValues() {
        v1DeploymentSpec.setMinReadySeconds(null);
        v1DeploymentSpec.setPaused(null);
        v1DeploymentSpec.setProgressDeadlineSeconds(null);
        v1DeploymentSpec.setReplicas(null);
        v1DeploymentSpec.setRevisionHistoryLimit(null);
        v1DeploymentSpec.setSelector(null);
        v1DeploymentSpec.setStrategy(null);
        v1DeploymentSpec.setTemplate(null);
        assertThat(v1DeploymentSpec.getMinReadySeconds(), is(equalTo(null)));
        assertThat(v1DeploymentSpec.getPaused(), is(equalTo(null)));
        assertThat(v1DeploymentSpec.getProgressDeadlineSeconds(), is(equalTo(null)));
        assertThat(v1DeploymentSpec.getReplicas(), is(equalTo(null)));
        assertThat(v1DeploymentSpec.getRevisionHistoryLimit(), is(equalTo(null)));
        assertThat(v1DeploymentSpec.getSelector(), is(equalTo(null)));
        assertThat(v1DeploymentSpec.getStrategy(), is(equalTo(null)));
        assertThat(v1DeploymentSpec.getTemplate(), is(equalTo(null)));
    }
}
