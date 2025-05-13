package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1beta1DeviceClaimConfiguration;
import java.util.List;
import io.kubernetes.client.openapi.models.V1beta1DeviceRequest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1beta1DeviceConstraint;
import java.util.ArrayList;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1DeviceClaimBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1beta1DeviceClaimConstructor}, hash: EEE93FE3974EF97B87935817E2AB71DC
    @Test
    void testV1beta1DeviceClaimConstructor() {
        V1beta1DeviceClaim deviceClaim = new V1beta1DeviceClaim();
        assertNotNull(deviceClaim);
    }

    //BaseRock generated method id: ${testConfigSetter}, hash: FDEE4EB26C863A943107DC1CBB2A54EB
    @Test
    void testConfigSetter() {
        V1beta1DeviceClaim deviceClaim = new V1beta1DeviceClaim();
        List<V1beta1DeviceClaimConfiguration> config = new ArrayList<>();
        config.add(mock(V1beta1DeviceClaimConfiguration.class));
        V1beta1DeviceClaim result = deviceClaim.config(config);
        assertThat(result, is(deviceClaim));
        assertThat(deviceClaim.getConfig(), is(config));
    }

    //BaseRock generated method id: ${testAddConfigItem}, hash: 0FAAFD695158079A06D7B4ED2E159E2A
    @Test
    void testAddConfigItem() {
        V1beta1DeviceClaim deviceClaim = new V1beta1DeviceClaim();
        V1beta1DeviceClaimConfiguration configItem = mock(V1beta1DeviceClaimConfiguration.class);
        V1beta1DeviceClaim result = deviceClaim.addConfigItem(configItem);
        assertThat(result, is(deviceClaim));
        assertThat(deviceClaim.getConfig(), hasSize(1));
        assertThat(deviceClaim.getConfig().get(0), is(configItem));
    }

    //BaseRock generated method id: ${testGetConfig}, hash: 92D2023471961A42881E326F54DD6EB0
    @Test
    void testGetConfig() {
        V1beta1DeviceClaim deviceClaim = new V1beta1DeviceClaim();
        List<V1beta1DeviceClaimConfiguration> config = new ArrayList<>();
        config.add(mock(V1beta1DeviceClaimConfiguration.class));
        deviceClaim.setConfig(config);
        List<V1beta1DeviceClaimConfiguration> result = deviceClaim.getConfig();
        assertThat(result, is(config));
    }

    //BaseRock generated method id: ${testSetConfig}, hash: 7B0E41ECBEDD2D6AEE3FE382A944231F
    @Test
    void testSetConfig() {
        V1beta1DeviceClaim deviceClaim = new V1beta1DeviceClaim();
        List<V1beta1DeviceClaimConfiguration> config = new ArrayList<>();
        config.add(mock(V1beta1DeviceClaimConfiguration.class));
        deviceClaim.setConfig(config);
        assertThat(deviceClaim.getConfig(), is(config));
    }

    //BaseRock generated method id: ${testConstraintsSetter}, hash: AD55C7C91310D415A115C6FFDD6B1F2A
    @Test
    void testConstraintsSetter() {
        V1beta1DeviceClaim deviceClaim = new V1beta1DeviceClaim();
        List<V1beta1DeviceConstraint> constraints = new ArrayList<>();
        constraints.add(mock(V1beta1DeviceConstraint.class));
        V1beta1DeviceClaim result = deviceClaim.constraints(constraints);
        assertThat(result, is(deviceClaim));
        assertThat(deviceClaim.getConstraints(), is(constraints));
    }

    //BaseRock generated method id: ${testAddConstraintsItem}, hash: 02477F2D522B9F5E3437EED7F1E2FAED
    @Test
    void testAddConstraintsItem() {
        V1beta1DeviceClaim deviceClaim = new V1beta1DeviceClaim();
        V1beta1DeviceConstraint constraintsItem = mock(V1beta1DeviceConstraint.class);
        V1beta1DeviceClaim result = deviceClaim.addConstraintsItem(constraintsItem);
        assertThat(result, is(deviceClaim));
        assertThat(deviceClaim.getConstraints(), hasSize(1));
        assertThat(deviceClaim.getConstraints().get(0), is(constraintsItem));
    }

    //BaseRock generated method id: ${testGetConstraints}, hash: 4F27D1FB2D9827CF25BED59BC3DAAB32
    @Test
    void testGetConstraints() {
        V1beta1DeviceClaim deviceClaim = new V1beta1DeviceClaim();
        List<V1beta1DeviceConstraint> constraints = new ArrayList<>();
        constraints.add(mock(V1beta1DeviceConstraint.class));
        deviceClaim.setConstraints(constraints);
        List<V1beta1DeviceConstraint> result = deviceClaim.getConstraints();
        assertThat(result, is(constraints));
    }

    //BaseRock generated method id: ${testSetConstraints}, hash: 157B64E1E323BCC257A70389D966FFB4
    @Test
    void testSetConstraints() {
        V1beta1DeviceClaim deviceClaim = new V1beta1DeviceClaim();
        List<V1beta1DeviceConstraint> constraints = new ArrayList<>();
        constraints.add(mock(V1beta1DeviceConstraint.class));
        deviceClaim.setConstraints(constraints);
        assertThat(deviceClaim.getConstraints(), is(constraints));
    }

    //BaseRock generated method id: ${testRequestsSetter}, hash: 4E98D92F19A6D0856AA5F468C2DFDE25
    @Test
    void testRequestsSetter() {
        V1beta1DeviceClaim deviceClaim = new V1beta1DeviceClaim();
        List<V1beta1DeviceRequest> requests = new ArrayList<>();
        requests.add(mock(V1beta1DeviceRequest.class));
        V1beta1DeviceClaim result = deviceClaim.requests(requests);
        assertThat(result, is(deviceClaim));
        assertThat(deviceClaim.getRequests(), is(requests));
    }

    //BaseRock generated method id: ${testAddRequestsItem}, hash: E6549F18A0C957DE5DAD42845D416F92
    @Test
    void testAddRequestsItem() {
        V1beta1DeviceClaim deviceClaim = new V1beta1DeviceClaim();
        V1beta1DeviceRequest requestsItem = mock(V1beta1DeviceRequest.class);
        V1beta1DeviceClaim result = deviceClaim.addRequestsItem(requestsItem);
        assertThat(result, is(deviceClaim));
        assertThat(deviceClaim.getRequests(), hasSize(1));
        assertThat(deviceClaim.getRequests().get(0), is(requestsItem));
    }

    //BaseRock generated method id: ${testGetRequests}, hash: F84B586DEAA87373B0B3E0D15C70C667
    @Test
    void testGetRequests() {
        V1beta1DeviceClaim deviceClaim = new V1beta1DeviceClaim();
        List<V1beta1DeviceRequest> requests = new ArrayList<>();
        requests.add(mock(V1beta1DeviceRequest.class));
        deviceClaim.setRequests(requests);
        List<V1beta1DeviceRequest> result = deviceClaim.getRequests();
        assertThat(result, is(requests));
    }

    //BaseRock generated method id: ${testSetRequests}, hash: F358181AF88EE70313FE8CE39D56BE82
    @Test
    void testSetRequests() {
        V1beta1DeviceClaim deviceClaim = new V1beta1DeviceClaim();
        List<V1beta1DeviceRequest> requests = new ArrayList<>();
        requests.add(mock(V1beta1DeviceRequest.class));
        deviceClaim.setRequests(requests);
        assertThat(deviceClaim.getRequests(), is(requests));
    }

    //BaseRock generated method id: ${testEquals}, hash: 89808A329BB2331C24CFE84AC66A581B
    @Test
    void testEquals() {
        V1beta1DeviceClaim deviceClaim1 = new V1beta1DeviceClaim().config(new ArrayList<>()).constraints(new ArrayList<>()).requests(new ArrayList<>());
        V1beta1DeviceClaim deviceClaim2 = new V1beta1DeviceClaim().config(new ArrayList<>()).constraints(new ArrayList<>()).requests(new ArrayList<>());
        assertThat(deviceClaim1.equals(deviceClaim2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 2633989B396524E8453F5E12297CCD5D
    @Test
    void testHashCode() {
        V1beta1DeviceClaim deviceClaim = new V1beta1DeviceClaim().config(new ArrayList<>()).constraints(new ArrayList<>()).requests(new ArrayList<>());
        int hashCode = deviceClaim.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 99608AAF9C6A50DB256079161110F72F
    @Test
    void testToString() {
        V1beta1DeviceClaim deviceClaim = new V1beta1DeviceClaim().config(new ArrayList<>()).constraints(new ArrayList<>()).requests(new ArrayList<>());
        String result = deviceClaim.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result.contains("class V1beta1DeviceClaim"), is(true));
        assertThat(result.contains("config"), is(true));
        assertThat(result.contains("constraints"), is(true));
        assertThat(result.contains("requests"), is(true));
    }
}
