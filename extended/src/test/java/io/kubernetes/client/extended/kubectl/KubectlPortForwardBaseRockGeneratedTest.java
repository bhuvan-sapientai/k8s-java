package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.openapi.ApiClient;
import java.net.Socket;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import java.net.ServerSocket;
import org.mockito.Mock;
import java.io.OutputStream;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import java.io.InputStream;
import java.util.function.Consumer;
import static org.mockito.ArgumentMatchers.*;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.*;
import java.io.IOException;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.PortForward;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class KubectlPortForwardBaseRockGeneratedTest {

    @Mock
    private ApiClient apiClient;

    @Mock
    private PortForward portForward;

    @Mock
    private ServerSocket serverSocket;

    @Mock
    private Socket socket;

    @Mock
    private InputStream inputStream;

    @Mock
    private OutputStream outputStream;

    @Mock
    private PortForward.PortForwardResult portForwardResult;

    @Mock
    private Consumer<Throwable> mockErrorHandler;

    private KubectlPortForward kubectlPortForward;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        kubectlPortForward = spy(new KubectlPortForward().apiClient(apiClient).namespace("test-namespace").name("test-pod").ports(8080, 8080));
    }

    //BaseRock generated method id: ${testExecute}, hash: D68CAE8B999FE230A8CBE02B9A63602F
    @Disabled
    @Test
    void testExecute() throws Exception {
        /*try (MockedStatic<KubectlExec> mockedKubectlExec = mockStatic(KubectlExec.class);
    MockedStatic<PortForward> mockedPortForward = mockStatic(PortForward.class)) {
    mockedKubectlExec.when(() -> KubectlExec.copyAsync(any(InputStream.class), any(OutputStream.class), any())).thenReturn(mock(Thread.class));
    mockedPortForward.when(() -> new PortForward(any())).thenReturn(portForward);
    when(portForward.forward(anyString(), anyString(), anyList())).thenReturn(portForwardResult);
    when(portForwardResult.getInputStream(anyInt())).thenReturn(inputStream);
    when(portForwardResult.getOutboundStream(anyInt())).thenReturn(outputStream);
    doReturn(serverSocket).when(kubectlPortForward).new ServerSocket(anyInt());
    when(serverSocket.accept()).thenReturn(socket);
    when(socket.getInputStream()).thenReturn(inputStream);
    when(socket.getOutputStream()).thenReturn(outputStream);
    assertTrue(kubectlPortForward.execute());
    verify(portForward).forward(eq("test-namespace"), eq("test-pod"), eq(Arrays.asList(8080)));
}*/
    }

    //BaseRock generated method id: ${testExecuteWithException}, hash: 1BA8DBE2CD89D4E00D3F63F4AA309785
    @Disabled
    @Test
    void testExecuteWithException() {
        /*try (MockedStatic<PortForward> mockedPortForward = mockStatic(PortForward.class)) {
    mockedPortForward.when(() -> new PortForward(any())).thenReturn(portForward);
    when(portForward.forward(anyString(), anyString(), anyList())).thenThrow(new ApiException("Test exception"));
    assertThrows(KubectlException.class, () -> kubectlPortForward.execute());
}*/
    }

    //BaseRock generated method id: ${testShutdown}, hash: 3A015D2010B8E5A03B7BB6B19E27A9D9
    @Disabled()
    @Test
    void testShutdown() throws KubectlException {
        kubectlPortForward.execute();
        kubectlPortForward.shutdown();
        assertFalse(kubectlPortForward.running);
    }

    //BaseRock generated method id: ${testPortsMethod}, hash: 6E625B9E85543D2FE299864C8D0E5F5F
    @Test
    void testPortsMethod() {
        KubectlPortForward portForward = new KubectlPortForward().ports(8080, 9090);
        assertEquals(Arrays.asList(8080), portForward.localPorts);
        assertEquals(Arrays.asList(9090), portForward.targetPorts);
    }

    //BaseRock generated method id: ${testOnUnhandledError}, hash: CB4AAA9DF8F0865998D59B54C6C594F8
    @Test
    void testOnUnhandledError() {
        KubectlPortForward portForward = new KubectlPortForward().onUnhandledError(mockErrorHandler);
        assertEquals(mockErrorHandler, portForward.onUnhandledError);
    }

    //BaseRock generated method id: ${testExecuteWithIOException}, hash: 28B38153C2E62EB9B4E26723FA88BCCC
    @Disabled
    @Test
    void testExecuteWithIOException() {
        /*try (MockedStatic<PortForward> mockedPortForward = mockStatic(PortForward.class)) {
    mockedPortForward.when(() -> new PortForward(any())).thenReturn(portForward);
    when(portForward.forward(anyString(), anyString(), anyList())).thenThrow(new IOException("Test IO exception"));
    assertThrows(KubectlException.class, () -> kubectlPortForward.execute());
}*/
    }

    //BaseRock generated method id: ${testExecuteWithInterruptedException}, hash: DE3EC9C6B849BFC97EE22EBE3BF71346
    @Disabled
    @Test
    void testExecuteWithInterruptedException() {
        /*try (MockedStatic<PortForward> mockedPortForward = mockStatic(PortForward.class)) {
    mockedPortForward.when(() -> new PortForward(any())).thenReturn(portForward);
    when(portForward.forward(anyString(), anyString(), anyList())).thenAnswer(invocation -> {
        Thread.currentThread().interrupt();
        return null;
    });
    assertThrows(KubectlException.class, () -> kubectlPortForward.execute());
    assertTrue(Thread.interrupted(), "Interrupt flag should be cleared");
}*/
    }

    //BaseRock generated method id: ${testConstructor}, hash: D50F044383F8768F1CA163123C3EE17A
    @Test
    void testConstructor() {
        KubectlPortForward portForward = new KubectlPortForward();
        assertNotNull(portForward);
        assertTrue(portForward.localPorts.isEmpty());
        assertTrue(portForward.targetPorts.isEmpty());
        assertFalse(portForward.running);
        assertNotNull(portForward.onUnhandledError);
    }
}
