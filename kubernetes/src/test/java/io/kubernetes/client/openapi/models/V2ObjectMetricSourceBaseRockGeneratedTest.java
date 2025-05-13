package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V2ObjectMetricSource;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V2MetricIdentifier;
import io.kubernetes.client.openapi.models.V2MetricTarget;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.is;
import io.kubernetes.client.openapi.models.V2CrossVersionObjectReference;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V2ObjectMetricSourceBaseRockGeneratedTest {

    private V2ObjectMetricSource v2ObjectMetricSource;

    private V2CrossVersionObjectReference mockDescribedObject;

    private V2MetricIdentifier mockMetric;

    private V2MetricTarget mockTarget;

    @BeforeEach
    void setUp() {
        mockDescribedObject = mock(V2CrossVersionObjectReference.class);
        mockMetric = mock(V2MetricIdentifier.class);
        mockTarget = mock(V2MetricTarget.class);
        v2ObjectMetricSource = new V2ObjectMetricSource().describedObject(mockDescribedObject).metric(mockMetric).target(mockTarget);
    }

    //BaseRock generated method id: ${testGetDescribedObject}, hash: 90757FB8B5019D3932748BAA2554ABBB
    @Test
    void testGetDescribedObject() {
        assertThat(v2ObjectMetricSource.getDescribedObject(), is(mockDescribedObject));
    }

    //BaseRock generated method id: ${testSetDescribedObject}, hash: 83B251D2128076E09551E8FABB5795A2
    @Test
    void testSetDescribedObject() {
        V2CrossVersionObjectReference newDescribedObject = mock(V2CrossVersionObjectReference.class);
        v2ObjectMetricSource.setDescribedObject(newDescribedObject);
        assertThat(v2ObjectMetricSource.getDescribedObject(), is(newDescribedObject));
    }

    //BaseRock generated method id: ${testGetMetric}, hash: A16EC101250EE88DB99519B2A78B1BE2
    @Test
    void testGetMetric() {
        assertThat(v2ObjectMetricSource.getMetric(), is(mockMetric));
    }

    //BaseRock generated method id: ${testSetMetric}, hash: C12CBD01876D99BBBF8EDB2DDEB76702
    @Test
    void testSetMetric() {
        V2MetricIdentifier newMetric = mock(V2MetricIdentifier.class);
        v2ObjectMetricSource.setMetric(newMetric);
        assertThat(v2ObjectMetricSource.getMetric(), is(newMetric));
    }

    //BaseRock generated method id: ${testGetTarget}, hash: 33C775DC66FDEC7C09674C3945E677DE
    @Test
    void testGetTarget() {
        assertThat(v2ObjectMetricSource.getTarget(), is(mockTarget));
    }

    //BaseRock generated method id: ${testSetTarget}, hash: FE11145D2CA7C36A22E50FDCD428E264
    @Test
    void testSetTarget() {
        V2MetricTarget newTarget = mock(V2MetricTarget.class);
        v2ObjectMetricSource.setTarget(newTarget);
        assertThat(v2ObjectMetricSource.getTarget(), is(newTarget));
    }

    //BaseRock generated method id: ${testEquals}, hash: D1E4A2A0E5852277FDD646A996669644
    @Test
    void testEquals() {
        V2ObjectMetricSource sameObject = new V2ObjectMetricSource().describedObject(mockDescribedObject).metric(mockMetric).target(mockTarget);
        assertThat(v2ObjectMetricSource.equals(sameObject), is(true));
        V2ObjectMetricSource differentObject = new V2ObjectMetricSource().describedObject(mock(V2CrossVersionObjectReference.class)).metric(mock(V2MetricIdentifier.class)).target(mock(V2MetricTarget.class));
        assertThat(v2ObjectMetricSource.equals(differentObject), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 95A700F725BE0CA562ADC0D5D7FF7567
    @Test
    void testHashCode() {
        V2ObjectMetricSource sameObject = new V2ObjectMetricSource().describedObject(mockDescribedObject).metric(mockMetric).target(mockTarget);
        assertThat(v2ObjectMetricSource.hashCode(), is(sameObject.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: B96B8C98D5E39E427BEEEA99F5DFD589
    @Test
    void testToString() {
        String expectedString = "class V2ObjectMetricSource {\n" + "    describedObject: " + mockDescribedObject + "\n" + "    metric: " + mockMetric + "\n" + "    target: " + mockTarget + "\n" + "}";
        assertThat(v2ObjectMetricSource.toString(), is(expectedString));
    }

    //BaseRock generated method id: ${testConstructor}, hash: 00FAE7DE66F8CEBA1FF2B835DE2200B7
    @Test
    void testConstructor() {
        V2ObjectMetricSource emptyObject = new V2ObjectMetricSource();
        assertThat(emptyObject, is(notNullValue()));
    }

    //BaseRock generated method id: ${testDescribedObjectMethod}, hash: 894263271B1510D88278BDB280FED345
    @Test
    void testDescribedObjectMethod() {
        V2CrossVersionObjectReference newDescribedObject = mock(V2CrossVersionObjectReference.class);
        V2ObjectMetricSource result = v2ObjectMetricSource.describedObject(newDescribedObject);
        assertThat(result, is(v2ObjectMetricSource));
        assertThat(result.getDescribedObject(), is(newDescribedObject));
    }

    //BaseRock generated method id: ${testMetricMethod}, hash: A6C737EF92E65062F2C8A84EF1485F46
    @Test
    void testMetricMethod() {
        V2MetricIdentifier newMetric = mock(V2MetricIdentifier.class);
        V2ObjectMetricSource result = v2ObjectMetricSource.metric(newMetric);
        assertThat(result, is(v2ObjectMetricSource));
        assertThat(result.getMetric(), is(newMetric));
    }

    //BaseRock generated method id: ${testTargetMethod}, hash: BB50792119E8BD46BBF4746A7531775C
    @Test
    void testTargetMethod() {
        V2MetricTarget newTarget = mock(V2MetricTarget.class);
        V2ObjectMetricSource result = v2ObjectMetricSource.target(newTarget);
        assertThat(result, is(v2ObjectMetricSource));
        assertThat(result.getTarget(), is(newTarget));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 6C8E03923DF0142C205F332C4AB3EE62
    @Test
    void testValidateJsonElement() throws Exception {
        // This test is a placeholder. The actual implementation would depend on the
        // validateJsonElement method, which is not visible in the provided source code.
        // In a real scenario, you would need to test various JSON inputs and verify
        // that they are correctly validated or rejected.
    }
}
