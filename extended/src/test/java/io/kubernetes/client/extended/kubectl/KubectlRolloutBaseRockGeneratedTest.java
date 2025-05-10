package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.openapi.ApiClient;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.util.labels.LabelSelector;
import org.mockito.Mock;
import org.junit.jupiter.api.Disabled;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import io.kubernetes.client.openapi.apis.AppsV1Api;
import io.kubernetes.client.extended.kubectl.util.deployment.DeploymentHelper;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import java.util.HashMap;
import io.kubernetes.client.common.KubernetesObject;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import io.kubernetes.client.util.PatchUtils;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import io.kubernetes.client.openapi.JSON;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class KubectlRolloutBaseRockGeneratedTest {

    @Mock
    private ApiClient mockApiClient;

    @Mock
    private AppsV1Api mockAppsV1Api;

    private KubectlRollout<V1Deployment> kubectlRollout;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        kubectlRollout = new KubectlRollout<>(V1Deployment.class);
    }

    //BaseRock generated method id: ${testHistory}, hash: 175F85D9023DDD8CC5CF3926D774C963
    @Test
    void testHistory() {
        KubectlRollout<V1Deployment>.KubectlRolloutHistory history = kubectlRollout.history();
        assertNotNull(history);
    }

    //BaseRock generated method id: ${testExecuteDeployment}, hash: 12F9124E1EFFAC7B38E13FF931186635
    @Disabled
    @Test
    void testExecuteDeployment() throws KubectlException, ApiException {
    }

    //BaseRock generated method id: ${testExecuteDaemonSet}, hash: FE578C7A0802B753B687AF7B35148180
    @Disabled
    @Test
    void testExecuteDaemonSet() throws KubectlException, ApiException {
    }

    //BaseRock generated method id: ${testExecuteStatefulSet}, hash: 741FFE42B964F84F3AC1E378CEE9A268
    @Disabled
    @Test
    void testExecuteStatefulSet() throws KubectlException, ApiException {
    }

    //BaseRock generated method id: ${testExecuteUnsupportedType}, hash: 158C2434FCDF3ABECA7706E3A8860062
    @Disabled
    @Test
    void testExecuteUnsupportedType() {
        //KubectlRollout<KubernetesObject> unsupportedRollout = new KubectlRollout<>(KubernetesObject.class);
        //KubectlRollout<KubernetesObject>.KubectlRolloutHistory history = unsupportedRollout.history();
        //history.name("test-unsupported").namespace("default").apiClient(mockApiClient);
        //AppsV1Api mockAppsV1Api = mock(AppsV1Api.class);
        //when(mockApiClient.getJSON()).thenReturn(new JSON());
        /*try (MockedStatic<PatchUtils> patchUtilsMockedStatic = mockStatic(PatchUtils.class)) {
    patchUtilsMockedStatic.when(() -> PatchUtils.getApiClient(any())).thenReturn(mockApiClient);
    assertThrows(KubectlException.class, history::execute);
}*/
    }

    //BaseRock generated method id: ${testRevision}, hash: 68D10F420FDBA0EF47764C6C913E077A
    @Disabled
    @Test
    void testRevision() throws KubectlException, ApiException {
    }

    //BaseRock generated method id: ${testRevisionNotFound}, hash: 96783F9E73ABBC3C57E4127CC0B2BBB1
    @Disabled
    @Test
    void testRevisionNotFound() {
    }

    //BaseRock generated method id: ${testValidate}, hash: BAA3027FB1B0C04970C7DF7C2043F5AA
    @Test
    void testValidate() {
        KubectlRollout<V1Deployment>.KubectlRolloutHistory history = kubectlRollout.history();
        KubectlException exception = assertThrows(KubectlException.class, () -> history.execute());
        assertTrue(exception.getMessage().contains("Missing name"));
        assertTrue(exception.getMessage().contains("Missing namespace"));
        history.name("test-deployment");
        exception = assertThrows(KubectlException.class, () -> history.execute());
        assertTrue(exception.getMessage().contains("Missing namespace"));
        history.namespace("default");
        history.revision(-1);
        exception = assertThrows(KubectlException.class, () -> history.execute());
        assertTrue(exception.getMessage().contains("revision must be a positive integer"));
    }
}