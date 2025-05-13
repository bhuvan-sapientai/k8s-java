package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1IngressLoadBalancerStatus;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.not;
import io.kubernetes.client.openapi.models.V1IngressStatus;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1IngressStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 3B2374A3D60E30050F72761781EA0F91
    @Test
    void testConstructor() {
        V1IngressStatus status = new V1IngressStatus();
        assertThat(status, is(notNullValue()));
    }

    //BaseRock generated method id: ${testLoadBalancerSetter}, hash: 5424B1C7FFAEF23DCB6CA8B969E93B2C
    @Test
    void testLoadBalancerSetter() {
        V1IngressStatus status = new V1IngressStatus();
        V1IngressLoadBalancerStatus loadBalancer = mock(V1IngressLoadBalancerStatus.class);
        status.setLoadBalancer(loadBalancer);
        assertThat(status.getLoadBalancer(), is(equalTo(loadBalancer)));
    }

    //BaseRock generated method id: ${testLoadBalancerGetter}, hash: 1965770E8893CF9F2C9DD1148326D2AD
    @Test
    void testLoadBalancerGetter() {
        V1IngressStatus status = new V1IngressStatus();
        assertThat(status.getLoadBalancer(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testEquals}, hash: F20ED3BEDD64F2FC57114BDB2B56863F
    @Test
    void testEquals() {
        V1IngressStatus status1 = new V1IngressStatus();
        V1IngressStatus status2 = new V1IngressStatus();
        assertThat(status1.equals(status2), is(true));
        V1IngressLoadBalancerStatus loadBalancer = mock(V1IngressLoadBalancerStatus.class);
        status1.setLoadBalancer(loadBalancer);
        assertThat(status1.equals(status2), is(false));
        status2.setLoadBalancer(loadBalancer);
        assertThat(status1.equals(status2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 2AE79B8E88656573E7C29B49DB59CA53
    @Test
    void testHashCode() {
        V1IngressStatus status1 = new V1IngressStatus();
        V1IngressStatus status2 = new V1IngressStatus();
        assertThat(status1.hashCode(), is(equalTo(status2.hashCode())));
        V1IngressLoadBalancerStatus loadBalancer = mock(V1IngressLoadBalancerStatus.class);
        status1.setLoadBalancer(loadBalancer);
        assertThat(status1.hashCode(), is(not(equalTo(status2.hashCode()))));
        status2.setLoadBalancer(loadBalancer);
        assertThat(status1.hashCode(), is(equalTo(status2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 8C873E73BC2F9F17AD5658ABE7A0B735
    @Test
    void testToString() {
        V1IngressStatus status = new V1IngressStatus();
        V1IngressLoadBalancerStatus loadBalancer = mock(V1IngressLoadBalancerStatus.class);
        when(loadBalancer.toString()).thenReturn("MockLoadBalancer");
        status.setLoadBalancer(loadBalancer);
        String expected = "class V1IngressStatus {\n    loadBalancer: MockLoadBalancer\n}";
        assertThat(status.toString(), is(equalTo(expected)));
    }

    //BaseRock generated method id: ${testLoadBalancerChain}, hash: 7464D72FCDFD82D75D90B17DDD388265
    @Test
    void testLoadBalancerChain() {
        V1IngressLoadBalancerStatus loadBalancer = mock(V1IngressLoadBalancerStatus.class);
        V1IngressStatus status = new V1IngressStatus().loadBalancer(loadBalancer);
        assertThat(status.getLoadBalancer(), is(equalTo(loadBalancer)));
    }
}
