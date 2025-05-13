package io.kubernetes.client.custom;

import java.util.function.BiConsumer;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.custom.IOTrio;
import static org.mockito.ArgumentMatchers.eq;
import java.io.OutputStream;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.sameInstance;
import java.io.ByteArrayOutputStream;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class IOTrioBaseRockGeneratedTest {

    private IOTrio ioTrio;

    @BeforeEach
    void setUp() {
        ioTrio = new IOTrio();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 93EAB5822C8C74BCC77AE720DB7736F7
    @Test
    void testConstructor() {
        assertThat(ioTrio, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetStdout}, hash: 959DA4166188C49109E2CD5AB7B95B48
    @Test
    void testSetAndGetStdout() {
        InputStream stdout = new ByteArrayInputStream(new byte[0]);
        ioTrio.setStdout(stdout);
        assertThat(ioTrio.getStdout(), is(sameInstance(stdout)));
    }

    //BaseRock generated method id: ${testSetAndGetStderr}, hash: 65483AB92377CD77146B539D3DC51374
    @Test
    void testSetAndGetStderr() {
        InputStream stderr = new ByteArrayInputStream(new byte[0]);
        ioTrio.setStderr(stderr);
        assertThat(ioTrio.getStderr(), is(sameInstance(stderr)));
    }

    //BaseRock generated method id: ${testSetAndGetStdin}, hash: 73792761F6C6DCEFBAAF378D4CDB8C35
    @Test
    void testSetAndGetStdin() {
        OutputStream stdin = new ByteArrayOutputStream();
        ioTrio.setStdin(stdin);
        assertThat(ioTrio.getStdin(), is(sameInstance(stdin)));
    }

    //BaseRock generated method id: ${testOnClose}, hash: DB8F668B9D08F5EE5C45F9BAA308759E
    @Test
    void testOnClose() {
        BiConsumer<Integer, Long> handler = mock(BiConsumer.class);
        ioTrio.onClose(handler);
        ioTrio.close(0, 1000L);
        verify(handler, times(1)).accept(0, 1000L);
    }

    //BaseRock generated method id: ${testCloseWithMultipleHandlers}, hash: 04F9564105937464A0FECCFAF5BED80D
    @Test
    void testCloseWithMultipleHandlers() {
        BiConsumer<Integer, Long> handler1 = mock(BiConsumer.class);
        BiConsumer<Integer, Long> handler2 = mock(BiConsumer.class);
        ioTrio.onClose(handler1);
        ioTrio.onClose(handler2);
        ioTrio.close(1, 2000L);
        verify(handler1, times(1)).accept(1, 2000L);
        verify(handler2, times(1)).accept(1, 2000L);
    }

    //BaseRock generated method id: ${testCloseWithNoHandlers}, hash: 6608C95E5C59688AC6DCCA409B56139E
    @Test
    void testCloseWithNoHandlers() {
        assertDoesNotThrow(() -> ioTrio.close(0, 0L));
    }

    //BaseRock generated method id: ${testCloseWithNegativeTimeout}, hash: 892A38654E9D60052BE19A347CB74B78
    @Test
    void testCloseWithNegativeTimeout() {
        BiConsumer<Integer, Long> handler = mock(BiConsumer.class);
        ioTrio.onClose(handler);
        ioTrio.close(0, -1L);
        verify(handler, times(1)).accept(0, -1L);
    }

    //BaseRock generated method id: ${testIOTrioFullLifecycle}, hash: EDC0DD5D5392E8A10070B228AA29BBFD
    @Test
    void testIOTrioFullLifecycle() {
        InputStream stdout = new ByteArrayInputStream(new byte[0]);
        InputStream stderr = new ByteArrayInputStream(new byte[0]);
        OutputStream stdin = new ByteArrayOutputStream();
        BiConsumer<Integer, Long> handler = mock(BiConsumer.class);
        ioTrio.setStdout(stdout);
        ioTrio.setStderr(stderr);
        ioTrio.setStdin(stdin);
        ioTrio.onClose(handler);
        assertThat(ioTrio.getStdout(), is(equalTo(stdout)));
        assertThat(ioTrio.getStderr(), is(equalTo(stderr)));
        assertThat(ioTrio.getStdin(), is(equalTo(stdin)));
        ioTrio.close(0, 1000L);
        verify(handler, times(1)).accept(0, 1000L);
    }
}
