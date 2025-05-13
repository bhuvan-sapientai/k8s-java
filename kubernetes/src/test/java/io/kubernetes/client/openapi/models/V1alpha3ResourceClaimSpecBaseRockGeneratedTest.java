package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1alpha3DeviceClaim;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import io.kubernetes.client.openapi.models.V1alpha3ResourceClaimSpec;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha3ResourceClaimSpecBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1alpha3ResourceClaimSpecConstructor}, hash: B9DBF7B66C07FEE24E04B89FEC53412F
    @Test
    void testV1alpha3ResourceClaimSpecConstructor() {
        V1alpha3ResourceClaimSpec resourceClaimSpec = new V1alpha3ResourceClaimSpec();
        assertNotNull(resourceClaimSpec);
    }

    //BaseRock generated method id: ${testSetAndGetDevices}, hash: 0754AAB3DF57F8773D344519CCA746F0
    @Test
    void testSetAndGetDevices() {
        V1alpha3ResourceClaimSpec resourceClaimSpec = new V1alpha3ResourceClaimSpec();
        V1alpha3DeviceClaim deviceClaim = mock(V1alpha3DeviceClaim.class);
        resourceClaimSpec.setDevices(deviceClaim);
        assertEquals(deviceClaim, resourceClaimSpec.getDevices());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 88F715687AF9B7B2EC6F940072C026D5
    @Test
    void testEqualsWithSameObject() {
        V1alpha3ResourceClaimSpec resourceClaimSpec = new V1alpha3ResourceClaimSpec();
        assertThat(resourceClaimSpec.equals(resourceClaimSpec), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 1EE68C7C49B894B96D152DF183B66BDD
    @Test
    void testEqualsWithDifferentObject() {
        V1alpha3ResourceClaimSpec resourceClaimSpec1 = new V1alpha3ResourceClaimSpec();
        V1alpha3ResourceClaimSpec resourceClaimSpec2 = new V1alpha3ResourceClaimSpec();
        V1alpha3DeviceClaim deviceClaim = mock(V1alpha3DeviceClaim.class);
        resourceClaimSpec1.setDevices(deviceClaim);
        resourceClaimSpec2.setDevices(deviceClaim);
        assertThat(resourceClaimSpec1.equals(resourceClaimSpec2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 097E71C1090328E18E0F6ED814B89C57
    @Test
    void testHashCode() {
        V1alpha3ResourceClaimSpec resourceClaimSpec = new V1alpha3ResourceClaimSpec();
        V1alpha3DeviceClaim deviceClaim = mock(V1alpha3DeviceClaim.class);
        resourceClaimSpec.setDevices(deviceClaim);
        int expectedHashCode = resourceClaimSpec.hashCode();
        assertThat(resourceClaimSpec.hashCode(), is(equalTo(expectedHashCode)));
    }

    //BaseRock generated method id: ${testToString}, hash: 9D2A684994F60BC3E235C9EE8BAA347D
    @Test
    void testToString() {
        V1alpha3ResourceClaimSpec resourceClaimSpec = new V1alpha3ResourceClaimSpec();
        V1alpha3DeviceClaim deviceClaim = mock(V1alpha3DeviceClaim.class);
        when(deviceClaim.toString()).thenReturn("MockedDeviceClaim");
        resourceClaimSpec.setDevices(deviceClaim);
        String expectedString = "class V1alpha3ResourceClaimSpec {\n    devices: MockedDeviceClaim\n}";
        assertThat(resourceClaimSpec.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testDevicesIsNullByDefault}, hash: 974703C3BC063000669C5F0641F00169
    @Test
    void testDevicesIsNullByDefault() {
        V1alpha3ResourceClaimSpec resourceClaimSpec = new V1alpha3ResourceClaimSpec();
        assertThat(resourceClaimSpec.getDevices(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetDevicesToNull}, hash: 3909E4588F9F78BE756BA4A8E660106B
    @Test
    void testSetDevicesToNull() {
        V1alpha3ResourceClaimSpec resourceClaimSpec = new V1alpha3ResourceClaimSpec();
        resourceClaimSpec.setDevices(null);
        assertThat(resourceClaimSpec.getDevices(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: 4656AE86030D1E25577481585113836C
    @Test
    void testEqualsWithNull() {
        V1alpha3ResourceClaimSpec resourceClaimSpec = new V1alpha3ResourceClaimSpec();
        assertThat(resourceClaimSpec.equals(null), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: D0FD635B10B5CBF042BF55472FC1CE1D
    @Test
    void testEqualsWithDifferentClass() {
        V1alpha3ResourceClaimSpec resourceClaimSpec = new V1alpha3ResourceClaimSpec();
        Object otherObject = new Object();
        assertThat(resourceClaimSpec.equals(otherObject), is(false));
    }

    //BaseRock generated method id: ${testHashCodeConsistency}, hash: 177164375C158CC9BDC3A3B6ED8CF48F
    @Test
    void testHashCodeConsistency() {
        V1alpha3ResourceClaimSpec resourceClaimSpec = new V1alpha3ResourceClaimSpec();
        V1alpha3DeviceClaim deviceClaim = mock(V1alpha3DeviceClaim.class);
        resourceClaimSpec.setDevices(deviceClaim);
        int initialHashCode = resourceClaimSpec.hashCode();
        int secondHashCode = resourceClaimSpec.hashCode();
        assertThat(initialHashCode, is(equalTo(secondHashCode)));
    }

    //BaseRock generated method id: ${testToStringWithNullDevices}, hash: 493F8FA6202381303879D949A35E9B23
    @Test
    void testToStringWithNullDevices() {
        V1alpha3ResourceClaimSpec resourceClaimSpec = new V1alpha3ResourceClaimSpec();
        String expectedString = "class V1alpha3ResourceClaimSpec {\n    devices: null\n}";
        assertThat(resourceClaimSpec.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testV1alpha3ResourceClaimSpecNotNull}, hash: 76CBC3D59B0E42968B5DA784E39EFF14
    @Test
    void testV1alpha3ResourceClaimSpecNotNull() {
        V1alpha3ResourceClaimSpec resourceClaimSpec = new V1alpha3ResourceClaimSpec();
        assertThat(resourceClaimSpec, is(notNullValue()));
    }
}
