package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1TCPSocketAction;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1SleepAction;
import io.kubernetes.client.openapi.models.V1HTTPGetAction;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1LifecycleHandler;
import static org.hamcrest.Matchers.is;
import io.kubernetes.client.openapi.models.V1ExecAction;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1LifecycleHandlerBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 70C2EAFF0486EB5D0EF6C3B146E9ED8B
    @Test
    void testConstructor() {
        V1LifecycleHandler handler = new V1LifecycleHandler();
        assertNotNull(handler);
    }

    //BaseRock generated method id: ${testExec}, hash: F7FB584A5A9EF47B90F3A676E9184118
    @Test
    void testExec() {
        V1LifecycleHandler handler = new V1LifecycleHandler();
        V1ExecAction execAction = new V1ExecAction();
        handler.setExec(execAction);
        assertEquals(execAction, handler.getExec());
    }

    //BaseRock generated method id: ${testHttpGet}, hash: 77E578E6B1021136E05BED2415715528
    @Test
    void testHttpGet() {
        V1LifecycleHandler handler = new V1LifecycleHandler();
        V1HTTPGetAction httpGetAction = new V1HTTPGetAction();
        handler.setHttpGet(httpGetAction);
        assertEquals(httpGetAction, handler.getHttpGet());
    }

    //BaseRock generated method id: ${testSleep}, hash: 40CE966EC9FD829DF540E2CDF89A3BBA
    @Test
    void testSleep() {
        V1LifecycleHandler handler = new V1LifecycleHandler();
        V1SleepAction sleepAction = new V1SleepAction();
        handler.setSleep(sleepAction);
        assertEquals(sleepAction, handler.getSleep());
    }

    //BaseRock generated method id: ${testTcpSocket}, hash: DB7351B6FD414E1FD69E11B35B13DD28
    @Test
    void testTcpSocket() {
        V1LifecycleHandler handler = new V1LifecycleHandler();
        V1TCPSocketAction tcpSocketAction = new V1TCPSocketAction();
        handler.setTcpSocket(tcpSocketAction);
        assertEquals(tcpSocketAction, handler.getTcpSocket());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: F5E8835FFB2BD56C25BE42CBD43175DB
    @Test
    void testEqualsAndHashCode() {
        V1LifecycleHandler handler1 = new V1LifecycleHandler().exec(new V1ExecAction()).httpGet(new V1HTTPGetAction()).sleep(new V1SleepAction()).tcpSocket(new V1TCPSocketAction());
        V1LifecycleHandler handler2 = new V1LifecycleHandler().exec(new V1ExecAction()).httpGet(new V1HTTPGetAction()).sleep(new V1SleepAction()).tcpSocket(new V1TCPSocketAction());
        assertThat(handler1, is(equalTo(handler2)));
        assertThat(handler1.hashCode(), is(equalTo(handler2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: ADF8F11662E4CDC239ED0485E6D1692E
    @Test
    void testToString() {
        V1LifecycleHandler handler = new V1LifecycleHandler().exec(new V1ExecAction()).httpGet(new V1HTTPGetAction()).sleep(new V1SleepAction()).tcpSocket(new V1TCPSocketAction());
        String toString = handler.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("exec"), is(true));
        assertThat(toString.contains("httpGet"), is(true));
        assertThat(toString.contains("sleep"), is(true));
        assertThat(toString.contains("tcpSocket"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 7E14F861ECAE45A445708DFD55888747
    @Test
    void testBuilder() {
        V1ExecAction execAction = new V1ExecAction();
        V1HTTPGetAction httpGetAction = new V1HTTPGetAction();
        V1SleepAction sleepAction = new V1SleepAction();
        V1TCPSocketAction tcpSocketAction = new V1TCPSocketAction();
        V1LifecycleHandler handler = new V1LifecycleHandler().exec(execAction).httpGet(httpGetAction).sleep(sleepAction).tcpSocket(tcpSocketAction);
        assertThat(handler.getExec(), is(equalTo(execAction)));
        assertThat(handler.getHttpGet(), is(equalTo(httpGetAction)));
        assertThat(handler.getSleep(), is(equalTo(sleepAction)));
        assertThat(handler.getTcpSocket(), is(equalTo(tcpSocketAction)));
    }

    //BaseRock generated method id: ${testNullValues}, hash: D71FD309C4DE757D5096785A6CE32C89
    @Test
    void testNullValues() {
        V1LifecycleHandler handler = new V1LifecycleHandler();
        assertThat(handler.getExec(), is(nullValue()));
        assertThat(handler.getHttpGet(), is(nullValue()));
        assertThat(handler.getSleep(), is(nullValue()));
        assertThat(handler.getTcpSocket(), is(nullValue()));
    }
}
