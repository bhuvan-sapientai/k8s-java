package io.kubernetes.client.extended.network;

import java.util.Arrays;
import io.kubernetes.client.openapi.models.V1Endpoints;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import java.util.Collections;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.extended.network.EndpointsLoadBalancer;
import io.kubernetes.client.extended.network.LoadBalanceStrategy;
import java.util.function.Supplier;
import org.mockito.Mock;
import io.kubernetes.client.extended.network.exception.NoAvailableAddressException;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.V1EndpointAddress;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import io.kubernetes.client.openapi.models.V1EndpointSubset;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import io.kubernetes.client.openapi.models.CoreV1EndpointPort;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class EndpointsLoadBalancerBaseRockGeneratedTest {

    @Mock
    private Supplier<V1Endpoints> endpointsSupplier;

    @Mock
    private LoadBalanceStrategy strategy;

    @Mock
    private V1Endpoints endpoints;

    private EndpointsLoadBalancer loadBalancer;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        loadBalancer = new EndpointsLoadBalancer(endpointsSupplier, strategy);
    }

    //BaseRock generated method id: ${testGetAllAvailableIPs}, hash: 0A01D586E0F4F38C4C695B541C8F9B90
    @Test
    void testGetAllAvailableIPs() throws NoAvailableAddressException {
        V1EndpointSubset subset = new V1EndpointSubset();
        V1EndpointAddress address1 = new V1EndpointAddress();
        address1.setIp("192.168.0.1");
        V1EndpointAddress address2 = new V1EndpointAddress();
        address2.setIp("192.168.0.2");
        subset.setAddresses(Arrays.asList(address1, address2));
        when(endpointsSupplier.get()).thenReturn(endpoints);
        when(endpoints.getSubsets()).thenReturn(Collections.singletonList(subset));
        List<String> result = loadBalancer.getAllAvailableIPs();
        assertEquals(2, result.size());
        assertTrue(result.contains("192.168.0.1"));
        assertTrue(result.contains("192.168.0.2"));
    }

    //BaseRock generated method id: ${testGetAllAvailableIPsNoEndpoints}, hash: FF365EC2ED5E0E73050C0D5A8FFB6475
    @Test
    void testGetAllAvailableIPsNoEndpoints() {
        when(endpointsSupplier.get()).thenReturn(null);
        assertThrows(NoAvailableAddressException.class, () -> loadBalancer.getAllAvailableIPs());
    }

    //BaseRock generated method id: ${testGetAllAvailableIPsNoSubsets}, hash: 97BCF97799DC15912163D9BF8A07A0C5
    @Test
    void testGetAllAvailableIPsNoSubsets() {
        when(endpointsSupplier.get()).thenReturn(endpoints);
        when(endpoints.getSubsets()).thenReturn(null);
        assertThrows(NoAvailableAddressException.class, () -> loadBalancer.getAllAvailableIPs());
    }

    //BaseRock generated method id: ${testGetAllAvailableIPsWithPort}, hash: 2D3E5B12D5D511F1B7D1B6E4F8DEB7C6
    @Test
    void testGetAllAvailableIPsWithPort() throws NoAvailableAddressException {
        V1EndpointSubset subset = new V1EndpointSubset();
        V1EndpointAddress address1 = new V1EndpointAddress();
        address1.setIp("192.168.0.1");
        V1EndpointAddress address2 = new V1EndpointAddress();
        address2.setIp("192.168.0.2");
        subset.setAddresses(Arrays.asList(address1, address2));
        CoreV1EndpointPort port = new CoreV1EndpointPort();
        port.setPort(8080);
        subset.setPorts(Collections.singletonList(port));
        when(endpointsSupplier.get()).thenReturn(endpoints);
        when(endpoints.getSubsets()).thenReturn(Collections.singletonList(subset));
        List<String> result = loadBalancer.getAllAvailableIPs(8080);
        assertEquals(2, result.size());
        assertTrue(result.contains("192.168.0.1"));
        assertTrue(result.contains("192.168.0.2"));
    }

    //BaseRock generated method id: ${testGetAllAvailableIPsWithPortNoMatch}, hash: 42D7C225E2ECDF4387E5679163FA21C8
    @Test
    void testGetAllAvailableIPsWithPortNoMatch() throws NoAvailableAddressException {
        V1EndpointSubset subset = new V1EndpointSubset();
        V1EndpointAddress address1 = new V1EndpointAddress();
        address1.setIp("192.168.0.1");
        subset.setAddresses(Collections.singletonList(address1));
        CoreV1EndpointPort port = new CoreV1EndpointPort();
        port.setPort(8080);
        subset.setPorts(Collections.singletonList(port));
        when(endpointsSupplier.get()).thenReturn(endpoints);
        when(endpoints.getSubsets()).thenReturn(Collections.singletonList(subset));
        List<String> result = loadBalancer.getAllAvailableIPs(9090);
        assertTrue(result.isEmpty());
    }

    //BaseRock generated method id: ${testGetTargetIP}, hash: D58E1CBDB9F0843C0B4FB4A9D0DEEB30
    @Test
    void testGetTargetIP() throws NoAvailableAddressException {
        V1EndpointSubset subset = new V1EndpointSubset();
        V1EndpointAddress address = new V1EndpointAddress();
        address.setIp("192.168.0.1");
        subset.setAddresses(Collections.singletonList(address));
        when(endpointsSupplier.get()).thenReturn(endpoints);
        when(endpoints.getSubsets()).thenReturn(Collections.singletonList(subset));
        when(strategy.chooseIP(anyList())).thenReturn("192.168.0.1");
        String result = loadBalancer.getTargetIP();
        assertEquals("192.168.0.1", result);
    }

    //BaseRock generated method id: ${testGetTargetIPNoAvailableAddresses}, hash: D551EE2B321828BCB8F6D77B862599CB
    @Test
    void testGetTargetIPNoAvailableAddresses() {
        V1EndpointSubset subset = new V1EndpointSubset();
        subset.setAddresses(Collections.emptyList());
        when(endpointsSupplier.get()).thenReturn(endpoints);
        when(endpoints.getSubsets()).thenReturn(Collections.singletonList(subset));
        assertThrows(NoAvailableAddressException.class, () -> loadBalancer.getTargetIP());
    }

    //BaseRock generated method id: ${testGetTargetIPWithPort}, hash: 3CEB153E671045C1D568F9AA93FF5A81
    @Test
    void testGetTargetIPWithPort() throws NoAvailableAddressException {
        V1EndpointSubset subset = new V1EndpointSubset();
        V1EndpointAddress address = new V1EndpointAddress();
        address.setIp("192.168.0.1");
        subset.setAddresses(Collections.singletonList(address));
        CoreV1EndpointPort port = new CoreV1EndpointPort();
        port.setPort(8080);
        subset.setPorts(Collections.singletonList(port));
        when(endpointsSupplier.get()).thenReturn(endpoints);
        when(endpoints.getSubsets()).thenReturn(Collections.singletonList(subset));
        when(strategy.chooseIP(anyList())).thenReturn("192.168.0.1");
        String result = loadBalancer.getTargetIP(8080);
        assertEquals("192.168.0.1", result);
    }

    //BaseRock generated method id: ${testGetTargetIPWithPortNoMatch}, hash: 71DA754FE338D7CA353DF9206B75C7A5
    @Test
    void testGetTargetIPWithPortNoMatch() {
        V1EndpointSubset subset = new V1EndpointSubset();
        V1EndpointAddress address = new V1EndpointAddress();
        address.setIp("192.168.0.1");
        subset.setAddresses(Collections.singletonList(address));
        CoreV1EndpointPort port = new CoreV1EndpointPort();
        port.setPort(8080);
        subset.setPorts(Collections.singletonList(port));
        when(endpointsSupplier.get()).thenReturn(endpoints);
        when(endpoints.getSubsets()).thenReturn(Collections.singletonList(subset));
        assertThrows(NoAvailableAddressException.class, () -> loadBalancer.getTargetIP(9090));
    }
}
