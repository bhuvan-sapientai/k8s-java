package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1TCPSocketAction;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1HTTPGetAction;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.jupiter.api.Assertions.assertNull;
import io.kubernetes.client.openapi.models.V1GRPCAction;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import io.kubernetes.client.openapi.models.V1ExecAction;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ProbeBaseRockGeneratedTest {

    private V1Probe v1Probe;

    @BeforeEach
    void setUp() {
        v1Probe = new V1Probe();
    }

    //BaseRock generated method id: ${testExec}, hash: DA6DFA446B08749402F8F71F400B5754
    @Test
    void testExec() {
        V1ExecAction mockExec = mock(V1ExecAction.class);
        v1Probe.setExec(mockExec);
        assertEquals(mockExec, v1Probe.getExec());
    }

    //BaseRock generated method id: ${testFailureThreshold}, hash: 554B854099F533B562BA8BABDE427F06
    @Test
    void testFailureThreshold() {
        Integer failureThreshold = 3;
        v1Probe.setFailureThreshold(failureThreshold);
        assertEquals(failureThreshold, v1Probe.getFailureThreshold());
    }

    //BaseRock generated method id: ${testGrpc}, hash: BB85A5276FE59FEBD553ED1EFE6490DB
    @Test
    void testGrpc() {
        V1GRPCAction mockGrpc = mock(V1GRPCAction.class);
        v1Probe.setGrpc(mockGrpc);
        assertEquals(mockGrpc, v1Probe.getGrpc());
    }

    //BaseRock generated method id: ${testHttpGet}, hash: 7180960F6D4D8B85706D6170094079ED
    @Test
    void testHttpGet() {
        V1HTTPGetAction mockHttpGet = mock(V1HTTPGetAction.class);
        v1Probe.setHttpGet(mockHttpGet);
        assertEquals(mockHttpGet, v1Probe.getHttpGet());
    }

    //BaseRock generated method id: ${testInitialDelaySeconds}, hash: 56C98AAFC24154C5CEB54ED4B892F989
    @Test
    void testInitialDelaySeconds() {
        Integer initialDelaySeconds = 10;
        v1Probe.setInitialDelaySeconds(initialDelaySeconds);
        assertEquals(initialDelaySeconds, v1Probe.getInitialDelaySeconds());
    }

    //BaseRock generated method id: ${testPeriodSeconds}, hash: AFA37F5758481FB50C28B687BCFF619E
    @Test
    void testPeriodSeconds() {
        Integer periodSeconds = 30;
        v1Probe.setPeriodSeconds(periodSeconds);
        assertEquals(periodSeconds, v1Probe.getPeriodSeconds());
    }

    //BaseRock generated method id: ${testSuccessThreshold}, hash: 6E5071D6FAE242949FD9F4604C63E009
    @Test
    void testSuccessThreshold() {
        Integer successThreshold = 1;
        v1Probe.setSuccessThreshold(successThreshold);
        assertEquals(successThreshold, v1Probe.getSuccessThreshold());
    }

    //BaseRock generated method id: ${testTcpSocket}, hash: F87C51DE42C1BE2341F31D9DC6A736B9
    @Test
    void testTcpSocket() {
        V1TCPSocketAction mockTcpSocket = mock(V1TCPSocketAction.class);
        v1Probe.setTcpSocket(mockTcpSocket);
        assertEquals(mockTcpSocket, v1Probe.getTcpSocket());
    }

    //BaseRock generated method id: ${testTerminationGracePeriodSeconds}, hash: 6FC0E62CC6042DCFC207819FA3A62504
    @Test
    void testTerminationGracePeriodSeconds() {
        Long terminationGracePeriodSeconds = 60L;
        v1Probe.setTerminationGracePeriodSeconds(terminationGracePeriodSeconds);
        assertEquals(terminationGracePeriodSeconds, v1Probe.getTerminationGracePeriodSeconds());
    }

    //BaseRock generated method id: ${testTimeoutSeconds}, hash: EB233C53135D10F434A9085D98905FED
    @Test
    void testTimeoutSeconds() {
        Integer timeoutSeconds = 5;
        v1Probe.setTimeoutSeconds(timeoutSeconds);
        assertEquals(timeoutSeconds, v1Probe.getTimeoutSeconds());
    }

    //BaseRock generated method id: ${testEquals}, hash: 3E4BFD6F17D9D72F83DC3FF51EED0E6B
    @Test
    void testEquals() {
        V1Probe probe1 = new V1Probe().exec(new V1ExecAction()).failureThreshold(3).grpc(new V1GRPCAction()).httpGet(new V1HTTPGetAction()).initialDelaySeconds(10).periodSeconds(30).successThreshold(1).tcpSocket(new V1TCPSocketAction()).terminationGracePeriodSeconds(60L).timeoutSeconds(5);
        V1Probe probe2 = new V1Probe().exec(new V1ExecAction()).failureThreshold(3).grpc(new V1GRPCAction()).httpGet(new V1HTTPGetAction()).initialDelaySeconds(10).periodSeconds(30).successThreshold(1).tcpSocket(new V1TCPSocketAction()).terminationGracePeriodSeconds(60L).timeoutSeconds(5);
        assertEquals(probe1, probe2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 82D2EEC4CEE7389C1F9DF543847DCEDB
    @Test
    void testHashCode() {
        V1Probe probe1 = new V1Probe().exec(new V1ExecAction()).failureThreshold(3).grpc(new V1GRPCAction()).httpGet(new V1HTTPGetAction()).initialDelaySeconds(10).periodSeconds(30).successThreshold(1).tcpSocket(new V1TCPSocketAction()).terminationGracePeriodSeconds(60L).timeoutSeconds(5);
        V1Probe probe2 = new V1Probe().exec(new V1ExecAction()).failureThreshold(3).grpc(new V1GRPCAction()).httpGet(new V1HTTPGetAction()).initialDelaySeconds(10).periodSeconds(30).successThreshold(1).tcpSocket(new V1TCPSocketAction()).terminationGracePeriodSeconds(60L).timeoutSeconds(5);
        assertEquals(probe1.hashCode(), probe2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 0CC1FD81312864C79497F46AFC17B975
    @Test
    void testToString() {
        V1Probe probe = new V1Probe().exec(new V1ExecAction()).failureThreshold(3).grpc(new V1GRPCAction()).httpGet(new V1HTTPGetAction()).initialDelaySeconds(10).periodSeconds(30).successThreshold(1).tcpSocket(new V1TCPSocketAction()).terminationGracePeriodSeconds(60L).timeoutSeconds(5);
        String toString = probe.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("exec"), is(true));
        assertThat(toString.contains("failureThreshold"), is(true));
        assertThat(toString.contains("grpc"), is(true));
        assertThat(toString.contains("httpGet"), is(true));
        assertThat(toString.contains("initialDelaySeconds"), is(true));
        assertThat(toString.contains("periodSeconds"), is(true));
        assertThat(toString.contains("successThreshold"), is(true));
        assertThat(toString.contains("tcpSocket"), is(true));
        assertThat(toString.contains("terminationGracePeriodSeconds"), is(true));
        assertThat(toString.contains("timeoutSeconds"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 5EE8EBD9A3581C22302D9D48267CCDA9
    @Test
    void testBuilder() {
        V1ExecAction mockExec = new V1ExecAction();
        V1GRPCAction mockGrpc = new V1GRPCAction();
        V1HTTPGetAction mockHttpGet = new V1HTTPGetAction();
        V1TCPSocketAction mockTcpSocket = new V1TCPSocketAction();
        V1Probe probe = new V1Probe().exec(mockExec).failureThreshold(3).grpc(mockGrpc).httpGet(mockHttpGet).initialDelaySeconds(10).periodSeconds(30).successThreshold(1).tcpSocket(mockTcpSocket).terminationGracePeriodSeconds(60L).timeoutSeconds(5);
        assertEquals(mockExec, probe.getExec());
        assertEquals(Integer.valueOf(3), probe.getFailureThreshold());
        assertEquals(mockGrpc, probe.getGrpc());
        assertEquals(mockHttpGet, probe.getHttpGet());
        assertEquals(Integer.valueOf(10), probe.getInitialDelaySeconds());
        assertEquals(Integer.valueOf(30), probe.getPeriodSeconds());
        assertEquals(Integer.valueOf(1), probe.getSuccessThreshold());
        assertEquals(mockTcpSocket, probe.getTcpSocket());
        assertEquals(Long.valueOf(60L), probe.getTerminationGracePeriodSeconds());
        assertEquals(Integer.valueOf(5), probe.getTimeoutSeconds());
    }

    //BaseRock generated method id: ${testNullValues}, hash: 5B098C7105D6E985BC4D72403EC50C10
    @Test
    void testNullValues() {
        V1Probe probe = new V1Probe();
        assertNull(probe.getExec());
        assertNull(probe.getFailureThreshold());
        assertNull(probe.getGrpc());
        assertNull(probe.getHttpGet());
        assertNull(probe.getInitialDelaySeconds());
        assertNull(probe.getPeriodSeconds());
        assertNull(probe.getSuccessThreshold());
        assertNull(probe.getTcpSocket());
        assertNull(probe.getTerminationGracePeriodSeconds());
        assertNull(probe.getTimeoutSeconds());
    }
}
