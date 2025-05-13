package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1ContainerStateWaiting;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import io.kubernetes.client.openapi.models.V1ContainerStateRunning;
import io.kubernetes.client.openapi.models.V1ContainerState;
import static org.hamcrest.Matchers.is;
import io.kubernetes.client.openapi.models.V1ContainerStateTerminated;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ContainerStateBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 16FF8D3A239CA758AE00B2ACCB25B636
    @Test
    void testConstructor() {
        V1ContainerState containerState = new V1ContainerState();
        assertThat(containerState, is(notNullValue()));
    }

    //BaseRock generated method id: ${testRunning}, hash: 248FFE68490633F39697785CD7AAFD0E
    @Test
    void testRunning() {
        V1ContainerState containerState = new V1ContainerState();
        V1ContainerStateRunning running = new V1ContainerStateRunning();
        containerState.setRunning(running);
        assertEquals(running, containerState.getRunning());
    }

    //BaseRock generated method id: ${testTerminated}, hash: 1224C9527C86DAA05E6A77D7707472AB
    @Test
    void testTerminated() {
        V1ContainerState containerState = new V1ContainerState();
        V1ContainerStateTerminated terminated = new V1ContainerStateTerminated();
        containerState.setTerminated(terminated);
        assertEquals(terminated, containerState.getTerminated());
    }

    //BaseRock generated method id: ${testWaiting}, hash: B28EE287FD40D731CED1A96BFBF4F2C5
    @Test
    void testWaiting() {
        V1ContainerState containerState = new V1ContainerState();
        V1ContainerStateWaiting waiting = new V1ContainerStateWaiting();
        containerState.setWaiting(waiting);
        assertEquals(waiting, containerState.getWaiting());
    }

    //BaseRock generated method id: ${testEquals}, hash: FF4DF1126ECE7AA29816794BF015228B
    @Test
    void testEquals() {
        V1ContainerState state1 = new V1ContainerState().running(new V1ContainerStateRunning()).terminated(new V1ContainerStateTerminated()).waiting(new V1ContainerStateWaiting());
        V1ContainerState state2 = new V1ContainerState().running(new V1ContainerStateRunning()).terminated(new V1ContainerStateTerminated()).waiting(new V1ContainerStateWaiting());
        V1ContainerState state3 = new V1ContainerState().running(new V1ContainerStateRunning()).terminated(null).waiting(new V1ContainerStateWaiting());
        assertTrue(state1.equals(state2));
        assertFalse(state1.equals(state3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 74FB266ECC1168125E2FF3C39941965B
    @Test
    void testHashCode() {
        V1ContainerState state1 = new V1ContainerState().running(new V1ContainerStateRunning()).terminated(new V1ContainerStateTerminated()).waiting(new V1ContainerStateWaiting());
        V1ContainerState state2 = new V1ContainerState().running(new V1ContainerStateRunning()).terminated(new V1ContainerStateTerminated()).waiting(new V1ContainerStateWaiting());
        V1ContainerState state3 = new V1ContainerState().running(new V1ContainerStateRunning()).terminated(null).waiting(new V1ContainerStateWaiting());
        assertEquals(state1.hashCode(), state2.hashCode());
        assertNotEquals(state1.hashCode(), state3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: CFF6D3D86C53823A562762B41703D408
    @Test
    void testToString() {
        V1ContainerState containerState = new V1ContainerState().running(new V1ContainerStateRunning()).terminated(new V1ContainerStateTerminated()).waiting(new V1ContainerStateWaiting());
        String expectedString = "class V1ContainerState {\n" + "    running: class V1ContainerStateRunning {\n" + "        startedAt: null\n" + "    }\n" + "    terminated: class V1ContainerStateTerminated {\n" + "        containerID: null\n" + "        exitCode: null\n" + "        finishedAt: null\n" + "        message: null\n" + "        reason: null\n" + "        signal: null\n" + "        startedAt: null\n" + "    }\n" + "    waiting: class V1ContainerStateWaiting {\n" + "        message: null\n" + "        reason: null\n" + "    }\n" + "}";
        assertEquals(expectedString, containerState.toString());
    }

    //BaseRock generated method id: ${testRunningMethod}, hash: 03E3DA10889680DD522FA52F9579FD28
    @Test
    void testRunningMethod() {
        V1ContainerState containerState = new V1ContainerState();
        V1ContainerStateRunning running = new V1ContainerStateRunning();
        V1ContainerState result = containerState.running(running);
        assertThat(result, is(equalTo(containerState)));
        assertThat(containerState.getRunning(), is(equalTo(running)));
    }

    //BaseRock generated method id: ${testTerminatedMethod}, hash: A322484F4160578D6F459256B9790A7D
    @Test
    void testTerminatedMethod() {
        V1ContainerState containerState = new V1ContainerState();
        V1ContainerStateTerminated terminated = new V1ContainerStateTerminated();
        V1ContainerState result = containerState.terminated(terminated);
        assertThat(result, is(equalTo(containerState)));
        assertThat(containerState.getTerminated(), is(equalTo(terminated)));
    }

    //BaseRock generated method id: ${testWaitingMethod}, hash: 794D205677D9BB32357F7036BBC38D61
    @Test
    void testWaitingMethod() {
        V1ContainerState containerState = new V1ContainerState();
        V1ContainerStateWaiting waiting = new V1ContainerStateWaiting();
        V1ContainerState result = containerState.waiting(waiting);
        assertThat(result, is(equalTo(containerState)));
        assertThat(containerState.getWaiting(), is(equalTo(waiting)));
    }

    //BaseRock generated method id: ${testNullValues}, hash: 688D6401FC142A04696375B63DE507B8
    @Test
    void testNullValues() {
        V1ContainerState containerState = new V1ContainerState();
        assertThat(containerState.getRunning(), is(nullValue()));
        assertThat(containerState.getTerminated(), is(nullValue()));
        assertThat(containerState.getWaiting(), is(nullValue()));
    }
}
