package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.openapi.ApiClient;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.PodLogs;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import java.io.InputStream;
import static org.mockito.Mockito.mockStatic;
import io.kubernetes.client.util.Strings;
import static org.mockito.Mockito.when;
import java.io.ByteArrayInputStream;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class KubectlLogBaseRockGeneratedTest {

    @Mock
    private ApiClient apiClient;

    @Mock
    private PodLogs podLogs;

    private KubectlLog kubectlLog;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        kubectlLog = new KubectlLog();
        kubectlLog.apiClient(apiClient);
    }

    //BaseRock generated method id: ${testExecute_Success}, hash: 72710CEB282C06DD8A1144AD73189B38
    @Disabled
    @Test
    void testExecute_Success() throws KubectlException, ApiException, IOException {
        // Arrange
        //String namespace = "default";
        //String name = "pod-name";
        //String container = "container-name";
        //InputStream expectedInputStream = new ByteArrayInputStream("log content".getBytes());
        //kubectlLog.namespace(namespace).name(name).container(container);
        /*try (MockedStatic<PodLogs> mockedPodLogs = mockStatic(PodLogs.class)) {
    mockedPodLogs.when(() -> new PodLogs(apiClient)).thenReturn(podLogs);
    when(podLogs.streamNamespacedPodLog(eq(namespace), eq(name), eq(container))).thenReturn(expectedInputStream);
    // Act
    InputStream result = kubectlLog.execute();
    // Assert
    assertNotNull(result);
    assertEquals(expectedInputStream, result);
    verify(podLogs).streamNamespacedPodLog(eq(namespace), eq(name), eq(container));
}*/
    }

    //BaseRock generated method id: ${testExecute_ApiException}, hash: 6E8AEA6892A82DF8F49D67C7A83FDED6
    @Disabled
    @Test
    void testExecute_ApiException() throws ApiException, IOException {
        // Arrange
        //String namespace = "default";
        //String name = "pod-name";
        //String container = "container-name";
        //ApiException apiException = new ApiException("API error");
        //kubectlLog.namespace(namespace).name(name).container(container);
        /*try (MockedStatic<PodLogs> mockedPodLogs = mockStatic(PodLogs.class)) {
    mockedPodLogs.when(() -> new PodLogs(apiClient)).thenReturn(podLogs);
    when(podLogs.streamNamespacedPodLog(eq(namespace), eq(name), eq(container))).thenThrow(apiException);
    // Act & Assert
    KubectlException exception = assertThrows(KubectlException.class, () -> kubectlLog.execute());
    assertEquals(apiException, exception.getCause());
}*/
    }

    //BaseRock generated method id: ${testExecute_IOException}, hash: 1716D7EFF123C8A8DBDEC79CA161CD94
    @Disabled
    @Test
    void testExecute_IOException() throws ApiException, IOException {
        // Arrange
        //String namespace = "default";
        //String name = "pod-name";
        //String container = "container-name";
        //IOException ioException = new IOException("IO error");
        //kubectlLog.namespace(namespace).name(name).container(container);
        /*try (MockedStatic<PodLogs> mockedPodLogs = mockStatic(PodLogs.class)) {
    mockedPodLogs.when(() -> new PodLogs(apiClient)).thenReturn(podLogs);
    when(podLogs.streamNamespacedPodLog(eq(namespace), eq(name), eq(container))).thenThrow(ioException);
    // Act & Assert
    KubectlException exception = assertThrows(KubectlException.class, () -> kubectlLog.execute());
    assertEquals(ioException, exception.getCause());
}*/
    }

    //BaseRock generated method id: ${testExecute_MissingName}, hash: 1CA2746CEF5792B161A9AF6FB62D7CDC
    @Test
    void testExecute_MissingName() {
        // Arrange
        kubectlLog.namespace("default").container("container-name");
        // Act & Assert
        KubectlException exception = assertThrows(KubectlException.class, () -> kubectlLog.execute());
        assertTrue(exception.getMessage().contains("missing name!"));
    }

    //BaseRock generated method id: ${testExecute_MissingContainer}, hash: 226CA5ACE240E5858C872FC8BE00025B
    @Test
    void testExecute_MissingContainer() {
        // Arrange
        kubectlLog.namespace("default").name("pod-name");
        // Act & Assert
        KubectlException exception = assertThrows(KubectlException.class, () -> kubectlLog.execute());
        assertTrue(exception.getMessage().contains("missing container!"));
    }

    //BaseRock generated method id: ${testExecute_MissingNameAndContainer}, hash: FD5FF284B71BD23090122F686D92DFA0
    @Test
    void testExecute_MissingNameAndContainer() {
        // Arrange
        kubectlLog.namespace("default");
        // Act & Assert
        KubectlException exception = assertThrows(KubectlException.class, () -> kubectlLog.execute());
        assertTrue(exception.getMessage().contains("missing name!"));
        assertTrue(exception.getMessage().contains("missing container!"));
    }

    //BaseRock generated method id: ${testConstructor}, hash: 3795D5C08E65AF675E6E46B20045DF66
    @Test
    void testConstructor() {
        // Act
        KubectlLog kubectlLog = new KubectlLog();
        // Assert
        assertNotNull(kubectlLog);
        assertEquals(V1Pod.class, kubectlLog.apiTypeClass);
    }

    //BaseRock generated method id: ${testIsNullOrEmpty}, hash: 26F6291CEBEA3E0698DC9DFCC4FD98A4
    @Test
    void testIsNullOrEmpty() {
        // Test cases for Strings.isNullOrEmpty method
        assertTrue(Strings.isNullOrEmpty(null));
        assertTrue(Strings.isNullOrEmpty(""));
        assertFalse(Strings.isNullOrEmpty("not empty"));
    }
}