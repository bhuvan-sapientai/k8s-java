package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.Exec;
import io.kubernetes.client.openapi.ApiClient;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import java.io.OutputStream;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.doThrow;
import java.io.InputStream;
import java.util.function.Consumer;
import static org.mockito.Mockito.when;
import java.io.ByteArrayInputStream;
import static org.mockito.ArgumentMatchers.anyBoolean;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.mockito.Mockito.mock;
import java.util.concurrent.TimeUnit;
import java.io.ByteArrayOutputStream;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class KubectlExecBaseRockGeneratedTest {

    @Mock
    private ApiClient apiClient;

    @Mock
    private Exec exec;

    @Mock
    private Process process;

    private KubectlExec kubectlExec;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        kubectlExec = new KubectlExec();
        kubectlExec.apiClient(apiClient);
    }

    //BaseRock generated method id: ${testExecute}, hash: 3753D5011CBFAB6BF92BD3944A3610EB
    @Disabled
    @Test
    void testExecute() throws Exception {
        //String[] command = { "ls", "-l" };
        //kubectlExec.command(command).name("pod-name").namespace("default").container("container-name");
        //when(apiClient.getExec()).thenReturn(exec);
        //when(exec.exec(any(V1Pod.class), eq(command), eq("container-name"), eq(false), eq(false))).thenReturn(process);
        //when(process.getInputStream()).thenReturn(new ByteArrayInputStream(new byte[0]));
        //when(process.getErrorStream()).thenReturn(new ByteArrayInputStream(new byte[0]));
        //when(process.waitFor()).thenReturn(0);
        //int result = kubectlExec.execute();
        //assertEquals(0, result);
        //verify(exec).exec(any(V1Pod.class), eq(command), eq("container-name"), eq(false), eq(false));
        //verify(process).waitFor();
    }

    //BaseRock generated method id: ${testExecuteWithStdin}, hash: C823464BAE9FC6B9741BC75899739A35
    @Disabled
    @Test
    void testExecuteWithStdin() throws Exception {
        //String[] command = { "cat" };
        //kubectlExec.command(command).name("pod-name").namespace("default").container("container-name").stdin(true);
        //when(apiClient.getExec()).thenReturn(exec);
        //when(exec.exec(any(V1Pod.class), eq(command), eq("container-name"), eq(true), eq(false))).thenReturn(process);
        //when(process.getInputStream()).thenReturn(new ByteArrayInputStream(new byte[0]));
        //when(process.getErrorStream()).thenReturn(new ByteArrayInputStream(new byte[0]));
        //when(process.getOutputStream()).thenReturn(new ByteArrayOutputStream());
        //when(process.waitFor()).thenReturn(0);
        //int result = kubectlExec.execute();
        //assertEquals(0, result);
        //verify(exec).exec(any(V1Pod.class), eq(command), eq("container-name"), eq(true), eq(false));
        //verify(process).waitFor();
    }

    //BaseRock generated method id: ${testExecuteWithTty}, hash: 991ECBE37B162653FD87652CF5BAC2FD
    @Disabled
    @Test
    void testExecuteWithTty() throws Exception {
        //String[] command = { "bash" };
        //kubectlExec.command(command).name("pod-name").namespace("default").container("container-name").tty(true);
        //when(apiClient.getExec()).thenReturn(exec);
        //when(exec.exec(any(V1Pod.class), eq(command), eq("container-name"), eq(false), eq(true))).thenReturn(process);
        //when(process.getInputStream()).thenReturn(new ByteArrayInputStream(new byte[0]));
        //when(process.getErrorStream()).thenReturn(new ByteArrayInputStream(new byte[0]));
        //when(process.waitFor()).thenReturn(0);
        //int result = kubectlExec.execute();
        //assertEquals(0, result);
        //verify(exec).exec(any(V1Pod.class), eq(command), eq("container-name"), eq(false), eq(true));
        //verify(process).waitFor();
    }

    //BaseRock generated method id: ${testExecuteWithCustomErrorHandler}, hash: 4A726DF9546C61A452BFF674AB548EE9
    @Disabled
    @Test
    void testExecuteWithCustomErrorHandler() throws Exception {
        //String[] command = { "ls", "-l" };
        //Consumer<Throwable> errorHandler = mock(Consumer.class);
        //kubectlExec.command(command).name("pod-name").namespace("default").container("container-name").onUnhandledError(errorHandler);
        //when(apiClient.getExec()).thenReturn(exec);
        //when(exec.exec(any(V1Pod.class), eq(command), eq("container-name"), eq(false), eq(false))).thenReturn(process);
        //when(process.getInputStream()).thenReturn(new ByteArrayInputStream(new byte[0]));
        //when(process.getErrorStream()).thenReturn(new ByteArrayInputStream(new byte[0]));
        //when(process.waitFor()).thenReturn(0);
        //int result = kubectlExec.execute();
        //assertEquals(0, result);
        //verify(exec).setOnUnhandledError(errorHandler);
        //verify(exec).exec(any(V1Pod.class), eq(command), eq("container-name"), eq(false), eq(false));
        //verify(process).waitFor();
    }

    //BaseRock generated method id: ${testExecuteThrowsKubectlExceptionOnApiException}, hash: 1C6F11F179EAA2F20911C66EE0A4A4D7
    @Disabled
    @Test
    void testExecuteThrowsKubectlExceptionOnApiException() throws Exception {
        //String[] command = { "ls", "-l" };
        //kubectlExec.command(command).name("pod-name").namespace("default").container("container-name");
        //when(apiClient.getExec()).thenReturn(exec);
        //when(exec.exec(any(V1Pod.class), any(String[].class), any(String.class), anyBoolean(), anyBoolean())).thenThrow(new ApiException("API error"));
        //assertThrows(KubectlException.class, () -> kubectlExec.execute());
    }

    //BaseRock generated method id: ${testExecuteThrowsKubectlExceptionOnIOException}, hash: 88C5CF652D8BF0FE05A441EE4CE117C1
    @Disabled
    @Test
    void testExecuteThrowsKubectlExceptionOnIOException() throws Exception {
        //String[] command = { "ls", "-l" };
        //kubectlExec.command(command).name("pod-name").namespace("default").container("container-name");
        //when(apiClient.getExec()).thenReturn(exec);
        //when(exec.exec(any(V1Pod.class), eq(command), eq("container-name"), eq(false), eq(false))).thenReturn(process);
        //when(process.getInputStream()).thenReturn(new ByteArrayInputStream(new byte[0]));
        //when(process.getErrorStream()).thenReturn(new ByteArrayInputStream(new byte[0]));
        //doThrow(new IOException("IO error")).when(process).waitFor();
        //assertThrows(KubectlException.class, () -> kubectlExec.execute());
    }

    //BaseRock generated method id: ${testExecuteThrowsKubectlExceptionOnInterruptedException}, hash: 3044E6BFF701D4D0FA1E3DDE3DA183FF
    @Disabled
    @Test
    void testExecuteThrowsKubectlExceptionOnInterruptedException() throws Exception {
        //String[] command = { "ls", "-l" };
        //kubectlExec.command(command).name("pod-name").namespace("default").container("container-name");
        //when(apiClient.getExec()).thenReturn(exec);
        //when(exec.exec(any(V1Pod.class), eq(command), eq("container-name"), eq(false), eq(false))).thenReturn(process);
        //when(process.getInputStream()).thenReturn(new ByteArrayInputStream(new byte[0]));
        //when(process.getErrorStream()).thenReturn(new ByteArrayInputStream(new byte[0]));
        //doThrow(new InterruptedException("Interrupted")).when(process).waitFor();
        //assertThrows(KubectlException.class, () -> kubectlExec.execute());
    }

    //BaseRock generated method id: ${testCopyAsync}, hash: C5F13428F5C18AD24EB10CC765776570
    @Test
    void testCopyAsync() throws Exception {
        InputStream inputStream = new ByteArrayInputStream("test data".getBytes());
        OutputStream outputStream = new ByteArrayOutputStream();
        Consumer<Throwable> errorHandler = mock(Consumer.class);
        Thread thread = KubectlExec.copyAsync(inputStream, outputStream, errorHandler);
        thread.join();
    }

    //BaseRock generated method id: ${testCopyAsyncWithIOException}, hash: 94BF5D263A90BE187C92A03889585520
    @Test
    void testCopyAsyncWithIOException() throws Exception {
        InputStream inputStream = mock(InputStream.class);
        OutputStream outputStream = mock(OutputStream.class);
        Consumer<Throwable> errorHandler = mock(Consumer.class);
        IOException ioException = new IOException("IO error");
        when(inputStream.read(any(byte[].class))).thenThrow(ioException);
        Thread thread = KubectlExec.copyAsync(inputStream, outputStream, errorHandler);
        thread.join();
        verify(errorHandler).accept(eq(ioException));
    }
}