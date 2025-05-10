package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.util.version.Version;
import static org.mockito.Mockito.doReturn;
import io.kubernetes.client.openapi.models.VersionInfo;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.ApiException;
import static org.mockito.Mockito.doThrow;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.mockStatic;
import org.mockito.MockedStatic;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class KubectlVersionBaseRockGeneratedTest {

    @Mock
    private ApiClient mockApiClient;

    @Mock
    private Version mockVersion;

    private KubectlVersion kubectlVersion;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        kubectlVersion = new KubectlVersion().apiClient(mockApiClient);
    }

    //BaseRock generated method id: ${testExecute_Success}, hash: 06405F1FD068C33505038D2A05ABDB8E
    @Disabled()
    @Test
    void testExecute_Success() throws KubectlException, ApiException, IOException {
        VersionInfo expectedVersionInfo = new VersionInfo();
        try (MockedStatic<Version> versionMockedStatic = mockStatic(Version.class)) {
            versionMockedStatic.when(() -> new Version(mockApiClient)).thenReturn(mockVersion);
            doReturn(expectedVersionInfo).when(mockVersion).getVersion();
            VersionInfo result = kubectlVersion.execute();
            assertEquals(expectedVersionInfo, result);
        }
    }

    //BaseRock generated method id: ${testExecute_ApiExceptionThrown}, hash: D938BC0DBD533AFA52B7E9BA133A2D3B
    @Disabled()
    @Test
    void testExecute_ApiExceptionThrown() throws ApiException, IOException {
        ApiException apiException = new ApiException("API Error");
        try (MockedStatic<Version> versionMockedStatic = mockStatic(Version.class)) {
            versionMockedStatic.when(() -> new Version(mockApiClient)).thenReturn(mockVersion);
            doThrow(apiException).when(mockVersion).getVersion();
            KubectlException exception = assertThrows(KubectlException.class, () -> kubectlVersion.execute());
            assertEquals(apiException, exception.getCause());
        }
    }

    //BaseRock generated method id: ${testExecute_IOExceptionThrown}, hash: 9AE4A02AEC4EC52B56172BF584C846A1
    @Disabled()
    @Test
    void testExecute_IOExceptionThrown() throws ApiException, IOException {
        IOException ioException = new IOException("IO Error");
        try (MockedStatic<Version> versionMockedStatic = mockStatic(Version.class)) {
            versionMockedStatic.when(() -> new Version(mockApiClient)).thenReturn(mockVersion);
            doThrow(ioException).when(mockVersion).getVersion();
            KubectlException exception = assertThrows(KubectlException.class, () -> kubectlVersion.execute());
            assertEquals(ioException, exception.getCause());
        }
    }

    //BaseRock generated method id: ${testApiClient}, hash: 9EEC52D4B007C06F829353B07BFE1AC0
    @Test
    void testApiClient() {
        ApiClient newApiClient = mock(ApiClient.class);
        KubectlVersion result = kubectlVersion.apiClient(newApiClient);
        assertEquals(kubectlVersion, result);
    }

    //BaseRock generated method id: ${testSkipDiscovery}, hash: D9952B46B6C6EACE3131ECAA09587419
    @Test
    void testSkipDiscovery() {
        KubectlVersion result = kubectlVersion.skipDiscovery();
        assertEquals(kubectlVersion, result);
    }
}
