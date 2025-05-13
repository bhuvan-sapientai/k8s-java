package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import io.kubernetes.client.openapi.models.V1beta1DeviceClaimConfiguration;
import java.util.List;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import io.kubernetes.client.openapi.models.V1beta1OpaqueDeviceConfiguration;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.ArrayList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1DeviceClaimConfigurationBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 5C9C5F6E4118A57211DD17D9F954AE10
    @Test
    void testConstructor() {
        V1beta1DeviceClaimConfiguration configuration = new V1beta1DeviceClaimConfiguration();
        assertThat(configuration, is(notNullValue()));
        assertThat(configuration.getOpaque(), is(nullValue()));
        assertThat(configuration.getRequests(), is(notNullValue()));
        assertThat(configuration.getRequests(), hasSize(0));
    }

    //BaseRock generated method id: ${testSetAndGetOpaque}, hash: D7AD906DDD9602D2D3728B3C717A7458
    @Test
    void testSetAndGetOpaque() {
        V1beta1DeviceClaimConfiguration configuration = new V1beta1DeviceClaimConfiguration();
        V1beta1OpaqueDeviceConfiguration opaque = new V1beta1OpaqueDeviceConfiguration();
        configuration.setOpaque(opaque);
        assertThat(configuration.getOpaque(), is(equalTo(opaque)));
    }

    //BaseRock generated method id: ${testSetAndGetRequests}, hash: E9F4D75E678AA687069D2F526545FB95
    @Test
    void testSetAndGetRequests() {
        V1beta1DeviceClaimConfiguration configuration = new V1beta1DeviceClaimConfiguration();
        List<String> requests = Arrays.asList("request1", "request2");
        configuration.setRequests(requests);
        assertThat(configuration.getRequests(), is(equalTo(requests)));
    }

    //BaseRock generated method id: ${testAddRequestsItem}, hash: E545F46C44AAD6400BFADFE2B1EC098C
    @Test
    void testAddRequestsItem() {
        V1beta1DeviceClaimConfiguration configuration = new V1beta1DeviceClaimConfiguration();
        configuration.addRequestsItem("request1");
        configuration.addRequestsItem("request2");
        assertThat(configuration.getRequests(), hasSize(2));
        assertThat(configuration.getRequests(), containsInAnyOrder("request1", "request2"));
    }

    //BaseRock generated method id: ${testEquals}, hash: 995FAEA93D834264D67C9E9AA9DC8475
    @Test
    void testEquals() {
        V1beta1DeviceClaimConfiguration config1 = new V1beta1DeviceClaimConfiguration().opaque(new V1beta1OpaqueDeviceConfiguration()).requests(Arrays.asList("request1", "request2"));
        V1beta1DeviceClaimConfiguration config2 = new V1beta1DeviceClaimConfiguration().opaque(new V1beta1OpaqueDeviceConfiguration()).requests(Arrays.asList("request1", "request2"));
        V1beta1DeviceClaimConfiguration config3 = new V1beta1DeviceClaimConfiguration().opaque(new V1beta1OpaqueDeviceConfiguration()).requests(Arrays.asList("request3"));
        assertTrue(config1.equals(config2));
        assertFalse(config1.equals(config3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 8DF40F1FDD5F6E642287369B532C42D2
    @Test
    void testHashCode() {
        V1beta1DeviceClaimConfiguration config1 = new V1beta1DeviceClaimConfiguration().opaque(new V1beta1OpaqueDeviceConfiguration()).requests(Arrays.asList("request1", "request2"));
        V1beta1DeviceClaimConfiguration config2 = new V1beta1DeviceClaimConfiguration().opaque(new V1beta1OpaqueDeviceConfiguration()).requests(Arrays.asList("request1", "request2"));
        assertEquals(config1.hashCode(), config2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: F9C3D9363D0201A7A3C68602AF235AA3
    @Test
    void testToString() {
        V1beta1DeviceClaimConfiguration configuration = new V1beta1DeviceClaimConfiguration().opaque(new V1beta1OpaqueDeviceConfiguration()).requests(Arrays.asList("request1", "request2"));
        String toString = configuration.toString();
        assertThat(toString, is(notNullValue()));
        assertTrue(toString.contains("opaque"));
        assertTrue(toString.contains("requests"));
        assertTrue(toString.contains("request1"));
        assertTrue(toString.contains("request2"));
    }

    //BaseRock generated method id: ${testBuilder}, hash: E951ECC2685348A6CD05B0BB63C18ED3
    @Test
    void testBuilder() {
        V1beta1OpaqueDeviceConfiguration opaque = new V1beta1OpaqueDeviceConfiguration();
        List<String> requests = Arrays.asList("request1", "request2");
        V1beta1DeviceClaimConfiguration configuration = new V1beta1DeviceClaimConfiguration().opaque(opaque).requests(requests);
        assertThat(configuration.getOpaque(), is(equalTo(opaque)));
        assertThat(configuration.getRequests(), is(equalTo(requests)));
    }

    //BaseRock generated method id: ${testSetNullOpaque}, hash: 112E239D0F709048CEE738F036AF188F
    @Test
    void testSetNullOpaque() {
        V1beta1DeviceClaimConfiguration configuration = new V1beta1DeviceClaimConfiguration();
        configuration.setOpaque(null);
        assertThat(configuration.getOpaque(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetNullRequests}, hash: B0BC016629C98A8098E7841C4CF172C3
    @Test
    void testSetNullRequests() {
        V1beta1DeviceClaimConfiguration configuration = new V1beta1DeviceClaimConfiguration();
        configuration.setRequests(null);
        assertThat(configuration.getRequests(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAddRequestsItemToNullList}, hash: B8624E85922E7D46B30B753AEB630E61
    @Test
    void testAddRequestsItemToNullList() {
        V1beta1DeviceClaimConfiguration configuration = new V1beta1DeviceClaimConfiguration();
        configuration.setRequests(null);
        configuration.addRequestsItem("request1");
        assertThat(configuration.getRequests(), hasSize(1));
        assertThat(configuration.getRequests().get(0), is(equalTo("request1")));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: D14CBBF0F6487B4DEEAB10B7FF3031BD
    @Test
    void testEqualsWithNull() {
        V1beta1DeviceClaimConfiguration configuration = new V1beta1DeviceClaimConfiguration();
        assertFalse(configuration.equals(null));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: FF99437A026782D1DDFA41F8C4096887
    @Test
    void testEqualsWithDifferentClass() {
        V1beta1DeviceClaimConfiguration configuration = new V1beta1DeviceClaimConfiguration();
        assertFalse(configuration.equals("Not a V1beta1DeviceClaimConfiguration"));
    }

    //BaseRock generated method id: ${testHashCodeConsistency}, hash: 9237C0F2610CE592A4039D2827BAA1BB
    @Test
    void testHashCodeConsistency() {
        V1beta1DeviceClaimConfiguration configuration = new V1beta1DeviceClaimConfiguration().opaque(new V1beta1OpaqueDeviceConfiguration()).requests(Arrays.asList("request1", "request2"));
        int initialHashCode = configuration.hashCode();
        int secondHashCode = configuration.hashCode();
        assertEquals(initialHashCode, secondHashCode);
    }
}
