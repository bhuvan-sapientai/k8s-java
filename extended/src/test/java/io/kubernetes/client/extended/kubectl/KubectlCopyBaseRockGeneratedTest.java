package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.openapi.ApiClient;
import static org.mockito.Mockito.doReturn;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import io.kubernetes.client.Copy;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.ApiException;
import static org.mockito.Mockito.doThrow;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import java.nio.file.Paths;
import org.mockito.MockedStatic;
import java.io.IOException;
import io.kubernetes.client.util.exception.CopyNotSupportedException;
import org.junit.jupiter.api.BeforeEach;
import java.nio.file.Path;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import org.junit.jupiter.api.Timeout;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class KubectlCopyBaseRockGeneratedTest {

    private KubectlCopy kubectlCopy;

    private ApiClient apiClient;

    private Copy copy;

    @BeforeEach
    void setUp() {
        apiClient = mock(ApiClient.class);
        copy = mock(Copy.class);
        kubectlCopy = new KubectlCopy().apiClient(apiClient).namespace("default").name("pod-name").container("container-name");
    }

    //BaseRock generated method id: ${testExecute_CopyFromPod}, hash: 7ED0F7C12F15F182592430B0A4E7410A
    @Disabled()
    @Test
    void testExecute_CopyFromPod() throws Exception {
        kubectlCopy.from("source-file").to("destination-file");
        try (MockedStatic<Paths> mockedPaths = mockStatic(Paths.class);
            MockedStatic<Copy> mockedCopy = mockStatic(Copy.class)) {
            Path sourcePath = mock(Path.class);
            Path destPath = mock(Path.class);
            mockedPaths.when(() -> Paths.get("source-file")).thenReturn(sourcePath);
            mockedPaths.when(() -> Paths.get("destination-file")).thenReturn(destPath);
            mockedCopy.when(() -> new Copy(apiClient)).thenReturn(copy);
            assertThat(kubectlCopy.execute(), is(true));
        }
    }

    //BaseRock generated method id: ${testExecute_CopyToPod}, hash: B9182F42400C7F05AB6D481355C09396
    @Disabled()
    @Test
    void testExecute_CopyToPod() throws Exception {
        kubectlCopy.from("source-file").toPod("destination-file");
        try (MockedStatic<Paths> mockedPaths = mockStatic(Paths.class);
            MockedStatic<Copy> mockedCopy = mockStatic(Copy.class)) {
            Path sourcePath = mock(Path.class);
            Path destPath = mock(Path.class);
            mockedPaths.when(() -> Paths.get("source-file")).thenReturn(sourcePath);
            mockedPaths.when(() -> Paths.get("destination-file")).thenReturn(destPath);
            mockedCopy.when(() -> new Copy(apiClient)).thenReturn(copy);
            assertThat(kubectlCopy.execute(), is(true));
        }
    }

    //BaseRock generated method id: ${testExecute_CopyDirectory}, hash: A7000B901061929205D5EFFE6299AB5A
    @Disabled()
    @Test
    void testExecute_CopyDirectory() throws Exception {
        kubectlCopy.from("source-dir").to("destination-dir").directory();
        try (MockedStatic<Paths> mockedPaths = mockStatic(Paths.class);
            MockedStatic<Copy> mockedCopy = mockStatic(Copy.class)) {
            Path sourcePath = mock(Path.class);
            Path destPath = mock(Path.class);
            mockedPaths.when(() -> Paths.get("source-dir")).thenReturn(sourcePath);
            mockedPaths.when(() -> Paths.get("destination-dir")).thenReturn(destPath);
            mockedCopy.when(() -> new Copy(apiClient)).thenReturn(copy);
            assertThat(kubectlCopy.execute(), is(true));
        }
    }

    //BaseRock generated method id: ${testExecute_ApiException}, hash: A75436652593425A5F1F1E2293B540A1
    @Disabled()
    @Test
    void testExecute_ApiException() throws Exception {
        kubectlCopy.from("source-file").to("destination-file");
        try (MockedStatic<Paths> mockedPaths = mockStatic(Paths.class);
            MockedStatic<Copy> mockedCopy = mockStatic(Copy.class)) {
            Path sourcePath = mock(Path.class);
            Path destPath = mock(Path.class);
            mockedPaths.when(() -> Paths.get("source-file")).thenReturn(sourcePath);
            mockedPaths.when(() -> Paths.get("destination-file")).thenReturn(destPath);
            mockedCopy.when(() -> new Copy(apiClient)).thenReturn(copy);
            doThrow(new ApiException()).when(copy).copyFileFromPod(anyString(), anyString(), anyString(), anyString(), any(Path.class));
            assertThrows(KubectlException.class, () -> kubectlCopy.execute());
        }
    }

    //BaseRock generated method id: ${testExecute_IOException}, hash: 418A08AAF06663D485B05C2A70DD1DB9
    @Disabled()
    @Test
    void testExecute_IOException() throws Exception {
        kubectlCopy.from("source-file").to("destination-file");
        try (MockedStatic<Paths> mockedPaths = mockStatic(Paths.class);
            MockedStatic<Copy> mockedCopy = mockStatic(Copy.class)) {
            Path sourcePath = mock(Path.class);
            Path destPath = mock(Path.class);
            mockedPaths.when(() -> Paths.get("source-file")).thenReturn(sourcePath);
            mockedPaths.when(() -> Paths.get("destination-file")).thenReturn(destPath);
            mockedCopy.when(() -> new Copy(apiClient)).thenReturn(copy);
            doThrow(new IOException()).when(copy).copyFileFromPod(anyString(), anyString(), anyString(), anyString(), any(Path.class));
            assertThrows(KubectlException.class, () -> kubectlCopy.execute());
        }
    }

    //BaseRock generated method id: ${testExecute_CopyNotSupportedException}, hash: E2C05727613576AA8D8DAEEE9FF03E55
    @Disabled()
    @Test
    void testExecute_CopyNotSupportedException() throws Exception {
        kubectlCopy.from("source-file").to("destination-file");
        try (MockedStatic<Paths> mockedPaths = mockStatic(Paths.class);
            MockedStatic<Copy> mockedCopy = mockStatic(Copy.class)) {
            Path sourcePath = mock(Path.class);
            Path destPath = mock(Path.class);
            mockedPaths.when(() -> Paths.get("source-file")).thenReturn(sourcePath);
            mockedPaths.when(() -> Paths.get("destination-file")).thenReturn(destPath);
            mockedCopy.when(() -> new Copy(apiClient)).thenReturn(copy);
            doThrow(new CopyNotSupportedException("Copy not supported")).when(copy).copyFileFromPod(anyString(), anyString(), anyString(), anyString(), any(Path.class));
            assertThrows(KubectlException.class, () -> kubectlCopy.execute());
        }
    }

    //BaseRock generated method id: ${testValidate_MissingFromOrTo}, hash: D09C3C1D1097E9C180C19A30031C792C
    @Test
    void testValidate_MissingFromOrTo() {
        assertThrows(KubectlException.class, () -> kubectlCopy.execute());
    }

    //BaseRock generated method id: ${testValidate_MissingFrom}, hash: 2F8499172B3A34D982408C3A01D42BFB
    @Test
    void testValidate_MissingFrom() {
        kubectlCopy.to("destination-file");
        assertThrows(KubectlException.class, () -> kubectlCopy.execute());
    }

    //BaseRock generated method id: ${testValidate_MissingTo}, hash: 36904BA66E9CAA6214F819833884B910
    @Test
    void testValidate_MissingTo() {
        kubectlCopy.from("source-file");
        assertThrows(KubectlException.class, () -> kubectlCopy.execute());
    }

    //BaseRock generated method id: ${testConstructor}, hash: 1B5942B8933510323948128DFE78728C
    @Test
    void testConstructor() {
        KubectlCopy copy = new KubectlCopy();
        assertThat(copy instanceof Kubectl.ResourceAndContainerBuilder, is(true));
    }
}
