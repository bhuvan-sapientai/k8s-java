package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1CrossVersionObjectReference;
import static org.mockito.Mockito.when;
import com.google.gson.JsonObject;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import io.kubernetes.client.openapi.JSON;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1HorizontalPodAutoscalerSpecBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: E344F9276516D15D740B5BC9BF5FF1E6
    @Test
    void testConstructor() {
        V1HorizontalPodAutoscalerSpec spec = new V1HorizontalPodAutoscalerSpec();
        assertThat(spec, is(notNullValue()));
    }

    //BaseRock generated method id: ${testMaxReplicas}, hash: 50A14D80D75866C412268C524A370879
    @Test
    void testMaxReplicas() {
        V1HorizontalPodAutoscalerSpec spec = new V1HorizontalPodAutoscalerSpec();
        spec.setMaxReplicas(5);
        assertThat(spec.getMaxReplicas(), is(equalTo(5)));
    }

    //BaseRock generated method id: ${testMinReplicas}, hash: 5E9E9B60A3DC9BDCCD6CDCE7E8F8F881
    @Test
    void testMinReplicas() {
        V1HorizontalPodAutoscalerSpec spec = new V1HorizontalPodAutoscalerSpec();
        spec.setMinReplicas(2);
        assertThat(spec.getMinReplicas(), is(equalTo(2)));
    }

    //BaseRock generated method id: ${testScaleTargetRef}, hash: 572BFF416215D0FEC389821CB537C345
    @Test
    void testScaleTargetRef() {
        V1HorizontalPodAutoscalerSpec spec = new V1HorizontalPodAutoscalerSpec();
        V1CrossVersionObjectReference scaleTargetRef = mock(V1CrossVersionObjectReference.class);
        spec.setScaleTargetRef(scaleTargetRef);
        assertThat(spec.getScaleTargetRef(), is(equalTo(scaleTargetRef)));
    }

    //BaseRock generated method id: ${testTargetCPUUtilizationPercentage}, hash: 1AA83134C7BB6B5EEDED49DE93A6E955
    @Test
    void testTargetCPUUtilizationPercentage() {
        V1HorizontalPodAutoscalerSpec spec = new V1HorizontalPodAutoscalerSpec();
        spec.setTargetCPUUtilizationPercentage(80);
        assertThat(spec.getTargetCPUUtilizationPercentage(), is(equalTo(80)));
    }

    //BaseRock generated method id: ${testMaxReplicasWithDifferentValues}, hash: ACC1DA44DE37C290C047DD73D974AFA4
    @ParameterizedTest
    @ValueSource(ints = { 1, 5, 10 })
    void testMaxReplicasWithDifferentValues(int maxReplicas) {
        V1HorizontalPodAutoscalerSpec spec = new V1HorizontalPodAutoscalerSpec();
        spec.setMaxReplicas(maxReplicas);
        assertThat(spec.getMaxReplicas(), is(equalTo(maxReplicas)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 64735404DCB301F46D4747430E4F5E69
    @Test
    void testEqualsAndHashCode() {
        V1HorizontalPodAutoscalerSpec spec1 = new V1HorizontalPodAutoscalerSpec().maxReplicas(5).minReplicas(2).scaleTargetRef(new V1CrossVersionObjectReference()).targetCPUUtilizationPercentage(80);
        V1HorizontalPodAutoscalerSpec spec2 = new V1HorizontalPodAutoscalerSpec().maxReplicas(5).minReplicas(2).scaleTargetRef(new V1CrossVersionObjectReference()).targetCPUUtilizationPercentage(80);
        assertThat(spec1, is(equalTo(spec2)));
        assertThat(spec1.hashCode(), is(equalTo(spec2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 2959893F0D118BB79955E5293FF8695A
    @Test
    void testToString() {
        V1HorizontalPodAutoscalerSpec spec = new V1HorizontalPodAutoscalerSpec().maxReplicas(5).minReplicas(2).scaleTargetRef(new V1CrossVersionObjectReference()).targetCPUUtilizationPercentage(80);
        String expectedString = "class V1HorizontalPodAutoscalerSpec {\n" + "    maxReplicas: 5\n" + "    minReplicas: 2\n" + "    scaleTargetRef: class V1CrossVersionObjectReference {\n" + "        apiVersion: null\n" + "        kind: null\n" + "        name: null\n" + "    }\n" + "    targetCPUUtilizationPercentage: 80\n" + "}";
        assertThat(spec.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testSetMaxReplicasWithNegativeValue}, hash: CD04BC032B30A4FB6E4DCD5FBA1647D5
    @Test
    void testSetMaxReplicasWithNegativeValue() {
        V1HorizontalPodAutoscalerSpec spec = new V1HorizontalPodAutoscalerSpec();
        spec.setMaxReplicas(-1);
        assertThat(spec.getMaxReplicas(), is(equalTo(-1)));
    }

    //BaseRock generated method id: ${testSetMinReplicasWithNegativeValue}, hash: 72F4043B6C33F6CF3DCA94FF73D89D2A
    @Test
    void testSetMinReplicasWithNegativeValue() {
        V1HorizontalPodAutoscalerSpec spec = new V1HorizontalPodAutoscalerSpec();
        spec.setMinReplicas(-1);
        assertThat(spec.getMinReplicas(), is(equalTo(-1)));
    }

    //BaseRock generated method id: ${testSetTargetCPUUtilizationPercentageWithInvalidValue}, hash: C6DC1A00706E6A0FF6AFF598B6008234
    @Test
    void testSetTargetCPUUtilizationPercentageWithInvalidValue() {
        V1HorizontalPodAutoscalerSpec spec = new V1HorizontalPodAutoscalerSpec();
        spec.setTargetCPUUtilizationPercentage(101);
        assertThat(spec.getTargetCPUUtilizationPercentage(), is(equalTo(101)));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: FBA4EFE26CC26EBC6E4A28A712C85210
    @Test
    void testValidateJsonElement() throws Exception {
        V1HorizontalPodAutoscalerSpec spec = new V1HorizontalPodAutoscalerSpec().maxReplicas(5).minReplicas(2).scaleTargetRef(new V1CrossVersionObjectReference().kind("Deployment").name("test-deployment")).targetCPUUtilizationPercentage(80);
        String json = spec.toJson();
        JsonElement jsonElement = JSON.getGson().fromJson(json, JsonElement.class);
        V1HorizontalPodAutoscalerSpec.validateJsonElement(jsonElement);
    }
}
