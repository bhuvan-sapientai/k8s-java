package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1alpha3OpaqueDeviceConfiguration;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1alpha3DeviceClaimConfiguration;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1alpha3DeviceClaimConfigurationBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 22C3EBD8C257D855E975605A01135152
    @Test
    void testConstructor() {
        V1alpha3DeviceClaimConfiguration configuration = new V1alpha3DeviceClaimConfiguration();
        assertNotNull(configuration);
    }

    //BaseRock generated method id: ${testOpaqueGetterAndSetter}, hash: E1D832897907085ABAE91C8133DA9054
    @Test
    void testOpaqueGetterAndSetter() {
        V1alpha3DeviceClaimConfiguration configuration = new V1alpha3DeviceClaimConfiguration();
        V1alpha3OpaqueDeviceConfiguration opaqueConfig = mock(V1alpha3OpaqueDeviceConfiguration.class);
        configuration.setOpaque(opaqueConfig);
        assertEquals(opaqueConfig, configuration.getOpaque());
    }

    //BaseRock generated method id: ${testRequestsGetterAndSetter}, hash: EE63A93979EE143C7CA30A9880C8B4DE
    @Test
    void testRequestsGetterAndSetter() {
        V1alpha3DeviceClaimConfiguration configuration = new V1alpha3DeviceClaimConfiguration();
        List<String> requests = Arrays.asList("request1", "request2");
        configuration.setRequests(requests);
        assertEquals(requests, configuration.getRequests());
    }

    //BaseRock generated method id: ${testAddRequestsItem}, hash: D7CC6F86B9BC50F93D5E1FA297068EBB
    @Test
    void testAddRequestsItem() {
        V1alpha3DeviceClaimConfiguration configuration = new V1alpha3DeviceClaimConfiguration();
        String request = "newRequest";
        configuration.addRequestsItem(request);
        assertThat(configuration.getRequests(), hasSize(1));
        assertThat(configuration.getRequests().get(0), is(equalTo(request)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 93BECCA556376C05AF2FF97C23270DC0
    @Disabled()
    @Test
    void testEquals() {
        V1alpha3OpaqueDeviceConfiguration opaqueConfig1 = mock(V1alpha3OpaqueDeviceConfiguration.class);
        V1alpha3OpaqueDeviceConfiguration opaqueConfig2 = mock(V1alpha3OpaqueDeviceConfiguration.class);
        V1alpha3DeviceClaimConfiguration config1 = new V1alpha3DeviceClaimConfiguration().opaque(opaqueConfig1).requests(Arrays.asList("request1", "request2"));
        V1alpha3DeviceClaimConfiguration config2 = new V1alpha3DeviceClaimConfiguration().opaque(opaqueConfig2).requests(Arrays.asList("request1", "request2"));
        V1alpha3DeviceClaimConfiguration config3 = new V1alpha3DeviceClaimConfiguration().opaque(mock(V1alpha3OpaqueDeviceConfiguration.class)).requests(Arrays.asList("request3"));
        assertThat(config1.equals(config2), is(true));
        assertThat(config1.equals(config3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: FAC064493B856B72CAB5B4F63E125065
    @Test
    void testHashCode() {
        V1alpha3OpaqueDeviceConfiguration opaqueConfig = mock(V1alpha3OpaqueDeviceConfiguration.class);
        V1alpha3DeviceClaimConfiguration config1 = new V1alpha3DeviceClaimConfiguration().opaque(opaqueConfig).requests(Arrays.asList("request1", "request2"));
        V1alpha3DeviceClaimConfiguration config2 = new V1alpha3DeviceClaimConfiguration().opaque(opaqueConfig).requests(Arrays.asList("request1", "request2"));
        assertThat(config1.hashCode(), is(equalTo(config2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 613E41B2DA892481E680752F7819908F
    @Test
    void testToString() {
        V1alpha3DeviceClaimConfiguration configuration = new V1alpha3DeviceClaimConfiguration().opaque(mock(V1alpha3OpaqueDeviceConfiguration.class)).requests(Arrays.asList("request1", "request2"));
        String result = configuration.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("opaque"), is(true));
        assertThat(result.contains("requests"), is(true));
    }

    //BaseRock generated method id: ${testSetNullOpaque}, hash: 61240987B1C17D93AEBFB661293E2C7B
    @Test
    void testSetNullOpaque() {
        V1alpha3DeviceClaimConfiguration configuration = new V1alpha3DeviceClaimConfiguration();
        configuration.setOpaque(null);
        assertThat(configuration.getOpaque(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetNullRequests}, hash: 381CA4A17FAB1C21CEB4DA07FAF09F72
    @Test
    void testSetNullRequests() {
        V1alpha3DeviceClaimConfiguration configuration = new V1alpha3DeviceClaimConfiguration();
        configuration.setRequests(null);
        assertThat(configuration.getRequests(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAddRequestsItemToNullList}, hash: 5458728510E35AB2578E7096E0F03554
    @Test
    void testAddRequestsItemToNullList() {
        V1alpha3DeviceClaimConfiguration configuration = new V1alpha3DeviceClaimConfiguration();
        configuration.setRequests(null);
        configuration.addRequestsItem("newRequest");
        assertThat(configuration.getRequests(), hasSize(1));
        assertThat(configuration.getRequests().get(0), is(equalTo("newRequest")));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: 5A4F364D530CE31B282F595CD6D7B81E
    @Test
    void testEqualsWithNull() {
        V1alpha3DeviceClaimConfiguration configuration = new V1alpha3DeviceClaimConfiguration();
        assertThat(configuration.equals(null), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: D95A20ED992415C1B8A6933B493A539B
    @Test
    void testEqualsWithDifferentClass() {
        V1alpha3DeviceClaimConfiguration configuration = new V1alpha3DeviceClaimConfiguration();
        assertThat(configuration.equals(new Object()), is(false));
    }

    //BaseRock generated method id: ${testHashCodeConsistency}, hash: 84CCCFE85084B15C52A37100429F6973
    @Test
    void testHashCodeConsistency() {
        V1alpha3DeviceClaimConfiguration configuration = new V1alpha3DeviceClaimConfiguration().opaque(mock(V1alpha3OpaqueDeviceConfiguration.class)).requests(Arrays.asList("request1", "request2"));
        int initialHashCode = configuration.hashCode();
        int secondHashCode = configuration.hashCode();
        assertThat(initialHashCode, is(equalTo(secondHashCode)));
    }
}
