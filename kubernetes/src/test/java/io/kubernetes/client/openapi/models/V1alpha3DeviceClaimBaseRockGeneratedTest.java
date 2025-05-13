package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1alpha3DeviceClaim;
import java.util.Arrays;
import java.util.List;
import io.kubernetes.client.openapi.models.V1alpha3DeviceRequest;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1alpha3DeviceConstraint;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1alpha3DeviceClaimConfiguration;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha3DeviceClaimBaseRockGeneratedTest {

    private V1alpha3DeviceClaim deviceClaim;

    @BeforeEach
    void setUp() {
        deviceClaim = new V1alpha3DeviceClaim();
    }

    //BaseRock generated method id: ${testConfigGetterAndSetter}, hash: C99D1C5D8BB159658B805DE8E2E89CC4
    @Test
    void testConfigGetterAndSetter() {
        List<V1alpha3DeviceClaimConfiguration> config = new ArrayList<>();
        V1alpha3DeviceClaimConfiguration configItem = mock(V1alpha3DeviceClaimConfiguration.class);
        config.add(configItem);
        deviceClaim.setConfig(config);
        assertThat(deviceClaim.getConfig(), is(notNullValue()));
        assertThat(deviceClaim.getConfig(), hasSize(1));
        assertThat(deviceClaim.getConfig(), containsInAnyOrder(configItem));
    }

    //BaseRock generated method id: ${testAddConfigItem}, hash: 202ECD2DDDAC1E31EFCC315483641806
    @Test
    void testAddConfigItem() {
        V1alpha3DeviceClaimConfiguration configItem = mock(V1alpha3DeviceClaimConfiguration.class);
        deviceClaim.addConfigItem(configItem);
        assertThat(deviceClaim.getConfig(), is(notNullValue()));
        assertThat(deviceClaim.getConfig(), hasSize(1));
        assertThat(deviceClaim.getConfig(), containsInAnyOrder(configItem));
    }

    //BaseRock generated method id: ${testConstraintsGetterAndSetter}, hash: AE57A6E33A394A07D3B163CF83DBF428
    @Test
    void testConstraintsGetterAndSetter() {
        List<V1alpha3DeviceConstraint> constraints = new ArrayList<>();
        V1alpha3DeviceConstraint constraintItem = mock(V1alpha3DeviceConstraint.class);
        constraints.add(constraintItem);
        deviceClaim.setConstraints(constraints);
        assertThat(deviceClaim.getConstraints(), is(notNullValue()));
        assertThat(deviceClaim.getConstraints(), hasSize(1));
        assertThat(deviceClaim.getConstraints(), containsInAnyOrder(constraintItem));
    }

    //BaseRock generated method id: ${testAddConstraintsItem}, hash: D19D09483F471567CF6423650EC09621
    @Test
    void testAddConstraintsItem() {
        V1alpha3DeviceConstraint constraintItem = mock(V1alpha3DeviceConstraint.class);
        deviceClaim.addConstraintsItem(constraintItem);
        assertThat(deviceClaim.getConstraints(), is(notNullValue()));
        assertThat(deviceClaim.getConstraints(), hasSize(1));
        assertThat(deviceClaim.getConstraints(), containsInAnyOrder(constraintItem));
    }

    //BaseRock generated method id: ${testRequestsGetterAndSetter}, hash: 24AC8EF85E15A3F4B1FD64959D12A155
    @Test
    void testRequestsGetterAndSetter() {
        List<V1alpha3DeviceRequest> requests = new ArrayList<>();
        V1alpha3DeviceRequest requestItem = mock(V1alpha3DeviceRequest.class);
        requests.add(requestItem);
        deviceClaim.setRequests(requests);
        assertThat(deviceClaim.getRequests(), is(notNullValue()));
        assertThat(deviceClaim.getRequests(), hasSize(1));
        assertThat(deviceClaim.getRequests(), containsInAnyOrder(requestItem));
    }

    //BaseRock generated method id: ${testAddRequestsItem}, hash: 75606E93637E01106F3A6E565E133995
    @Test
    void testAddRequestsItem() {
        V1alpha3DeviceRequest requestItem = mock(V1alpha3DeviceRequest.class);
        deviceClaim.addRequestsItem(requestItem);
        assertThat(deviceClaim.getRequests(), is(notNullValue()));
        assertThat(deviceClaim.getRequests(), hasSize(1));
        assertThat(deviceClaim.getRequests(), containsInAnyOrder(requestItem));
    }

    //BaseRock generated method id: ${testEquals}, hash: 0046A6D91BAC63F42D21A4820642B576
    @Test
    void testEquals() {
        V1alpha3DeviceClaim deviceClaim1 = new V1alpha3DeviceClaim();
        V1alpha3DeviceClaim deviceClaim2 = new V1alpha3DeviceClaim();
        List<V1alpha3DeviceClaimConfiguration> config = new ArrayList<>();
        V1alpha3DeviceClaimConfiguration configItem = mock(V1alpha3DeviceClaimConfiguration.class);
        config.add(configItem);
        List<V1alpha3DeviceConstraint> constraints = new ArrayList<>();
        V1alpha3DeviceConstraint constraintItem = mock(V1alpha3DeviceConstraint.class);
        constraints.add(constraintItem);
        List<V1alpha3DeviceRequest> requests = new ArrayList<>();
        V1alpha3DeviceRequest requestItem = mock(V1alpha3DeviceRequest.class);
        requests.add(requestItem);
        deviceClaim1.setConfig(config);
        deviceClaim1.setConstraints(constraints);
        deviceClaim1.setRequests(requests);
        deviceClaim2.setConfig(config);
        deviceClaim2.setConstraints(constraints);
        deviceClaim2.setRequests(requests);
        assertThat(deviceClaim1, is(equalTo(deviceClaim2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: E12D23940D0C37D5DDF7C69CDBFAC217
    @Test
    void testHashCode() {
        V1alpha3DeviceClaim deviceClaim1 = new V1alpha3DeviceClaim();
        V1alpha3DeviceClaim deviceClaim2 = new V1alpha3DeviceClaim();
        List<V1alpha3DeviceClaimConfiguration> config = new ArrayList<>();
        V1alpha3DeviceClaimConfiguration configItem = mock(V1alpha3DeviceClaimConfiguration.class);
        config.add(configItem);
        List<V1alpha3DeviceConstraint> constraints = new ArrayList<>();
        V1alpha3DeviceConstraint constraintItem = mock(V1alpha3DeviceConstraint.class);
        constraints.add(constraintItem);
        List<V1alpha3DeviceRequest> requests = new ArrayList<>();
        V1alpha3DeviceRequest requestItem = mock(V1alpha3DeviceRequest.class);
        requests.add(requestItem);
        deviceClaim1.setConfig(config);
        deviceClaim1.setConstraints(constraints);
        deviceClaim1.setRequests(requests);
        deviceClaim2.setConfig(config);
        deviceClaim2.setConstraints(constraints);
        deviceClaim2.setRequests(requests);
        assertEquals(deviceClaim1.hashCode(), deviceClaim2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: CD096327D7E55C145C6D6AEC6F573396
    @Test
    void testToString() {
        V1alpha3DeviceClaim deviceClaim = new V1alpha3DeviceClaim();
        List<V1alpha3DeviceClaimConfiguration> config = new ArrayList<>();
        V1alpha3DeviceClaimConfiguration configItem = mock(V1alpha3DeviceClaimConfiguration.class);
        when(configItem.toString()).thenReturn("ConfigItem");
        config.add(configItem);
        List<V1alpha3DeviceConstraint> constraints = new ArrayList<>();
        V1alpha3DeviceConstraint constraintItem = mock(V1alpha3DeviceConstraint.class);
        when(constraintItem.toString()).thenReturn("ConstraintItem");
        constraints.add(constraintItem);
        List<V1alpha3DeviceRequest> requests = new ArrayList<>();
        V1alpha3DeviceRequest requestItem = mock(V1alpha3DeviceRequest.class);
        when(requestItem.toString()).thenReturn("RequestItem");
        requests.add(requestItem);
        deviceClaim.setConfig(config);
        deviceClaim.setConstraints(constraints);
        deviceClaim.setRequests(requests);
        String expectedString = "class V1alpha3DeviceClaim {\n" + "    config: [ConfigItem]\n" + "    constraints: [ConstraintItem]\n" + "    requests: [RequestItem]\n" + "}";
        assertEquals(expectedString, deviceClaim.toString());
    }

    //BaseRock generated method id: ${testConstructor}, hash: AB3106BB6EDE9594C98DB239FA75744C
    @Test
    void testConstructor() {
        V1alpha3DeviceClaim deviceClaim = new V1alpha3DeviceClaim();
        assertNotNull(deviceClaim);
    }
}
