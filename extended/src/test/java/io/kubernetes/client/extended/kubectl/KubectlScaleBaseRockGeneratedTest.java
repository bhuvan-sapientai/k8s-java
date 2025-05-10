package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.openapi.ApiClient;
import static org.mockito.Mockito.doReturn;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import io.kubernetes.client.openapi.models.V1ReplicaSet;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.apis.AppsV1Api;
import static org.mockito.Mockito.times;
import org.mockito.MockedStatic;
import io.kubernetes.client.common.KubernetesObject;
import static org.hamcrest.Matchers.instanceOf;
import io.kubernetes.client.openapi.models.V1StatefulSet;
import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.util.PatchUtils;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import io.kubernetes.client.custom.V1Patch;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class KubectlScaleBaseRockGeneratedTest {

    @Mock
    private ApiClient apiClient;

    @Mock
    private AppsV1Api appsV1Api;

    private KubectlScale<V1Deployment> kubectlScale;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        kubectlScale = new KubectlScale<>(V1Deployment.class);
        kubectlScale.apiClient(apiClient);
    }

    //BaseRock generated method id: ${testExecute_withValidDeployment}, hash: C6626CF9815A5DADBF9F6C551C121EFA
    @Disabled
    @Test
    void testExecute_withValidDeployment() throws Exception {
        // Arrange
        //kubectlScale.name("test-deployment").namespace("test-namespace").replicas(3);
        //V1Deployment mockDeployment = mock(V1Deployment.class);
        /*try (MockedStatic<PatchUtils> mockedPatchUtils = mockStatic(PatchUtils.class)) {
    mockedPatchUtils.when(() -> PatchUtils.patch(eq(V1Deployment.class), any(), eq(V1Patch.PATCH_FORMAT_JSON_PATCH), eq(apiClient))).thenReturn(mockDeployment);
    when(apiClient.getHttpClient()).thenReturn(mock(okhttp3.OkHttpClient.class));
    AppsV1Api.APIpatchNamespacedDeploymentRequest mockRequest = mock(AppsV1Api.APIpatchNamespacedDeploymentRequest.class);
    when(appsV1Api.patchNamespacedDeployment(anyString(), anyString(), any())).thenReturn(mockRequest);
    when(mockRequest.buildCall(any())).thenReturn(null);
    doReturn(appsV1Api).when(apiClient).adapt(AppsV1Api.class);
    // Act
    V1Deployment result = kubectlScale.execute();
    // Assert
    assertThat(result, is(notNullValue()));
    assertThat(result, is(equalTo(mockDeployment)));
    verify(appsV1Api, times(1)).patchNamespacedDeployment(eq("test-deployment"), eq("test-namespace"), any());
}*/
    }

    //BaseRock generated method id: ${testExecute_withValidReplicaSet}, hash: 4442C050C8F7603FBD0A8073B213544B
    @Disabled
    @Test
    void testExecute_withValidReplicaSet() throws Exception {
        // Arrange
        //KubectlScale<V1ReplicaSet> kubectlScaleReplicaSet = new KubectlScale<>(V1ReplicaSet.class);
        //kubectlScaleReplicaSet.apiClient(apiClient).name("test-replicaset").namespace("test-namespace").replicas(3);
        //V1ReplicaSet mockReplicaSet = mock(V1ReplicaSet.class);
        /*try (MockedStatic<PatchUtils> mockedPatchUtils = mockStatic(PatchUtils.class)) {
    mockedPatchUtils.when(() -> PatchUtils.patch(eq(V1ReplicaSet.class), any(), eq(V1Patch.PATCH_FORMAT_JSON_PATCH), eq(apiClient))).thenReturn(mockReplicaSet);
    when(apiClient.getHttpClient()).thenReturn(mock(okhttp3.OkHttpClient.class));
    AppsV1Api.APIpatchNamespacedReplicaSetRequest mockRequest = mock(AppsV1Api.APIpatchNamespacedReplicaSetRequest.class);
    when(appsV1Api.patchNamespacedReplicaSet(anyString(), anyString(), any())).thenReturn(mockRequest);
    when(mockRequest.buildCall(any())).thenReturn(null);
    doReturn(appsV1Api).when(apiClient).adapt(AppsV1Api.class);
    // Act
    V1ReplicaSet result = kubectlScaleReplicaSet.execute();
    // Assert
    assertThat(result, is(notNullValue()));
    assertThat(result, is(equalTo(mockReplicaSet)));
    verify(appsV1Api, times(1)).patchNamespacedReplicaSet(eq("test-replicaset"), eq("test-namespace"), any());
}*/
    }

    //BaseRock generated method id: ${testExecute_withValidStatefulSet}, hash: FEA190EB61F3FCD9DF1D04BC2BA5A5FF
    @Disabled
    @Test
    void testExecute_withValidStatefulSet() throws Exception {
        // Arrange
        //KubectlScale<V1StatefulSet> kubectlScaleStatefulSet = new KubectlScale<>(V1StatefulSet.class);
        //kubectlScaleStatefulSet.apiClient(apiClient).name("test-statefulset").namespace("test-namespace").replicas(3);
        //V1StatefulSet mockStatefulSet = mock(V1StatefulSet.class);
        /*try (MockedStatic<PatchUtils> mockedPatchUtils = mockStatic(PatchUtils.class)) {
    mockedPatchUtils.when(() -> PatchUtils.patch(eq(V1StatefulSet.class), any(), eq(V1Patch.PATCH_FORMAT_JSON_PATCH), eq(apiClient))).thenReturn(mockStatefulSet);
    when(apiClient.getHttpClient()).thenReturn(mock(okhttp3.OkHttpClient.class));
    AppsV1Api.APIpatchNamespacedStatefulSetRequest mockRequest = mock(AppsV1Api.APIpatchNamespacedStatefulSetRequest.class);
    when(appsV1Api.patchNamespacedStatefulSet(anyString(), anyString(), any())).thenReturn(mockRequest);
    when(mockRequest.buildCall(any())).thenReturn(null);
    doReturn(appsV1Api).when(apiClient).adapt(AppsV1Api.class);
    // Act
    V1StatefulSet result = kubectlScaleStatefulSet.execute();
    // Assert
    assertThat(result, is(notNullValue()));
    assertThat(result, is(equalTo(mockStatefulSet)));
    verify(appsV1Api, times(1)).patchNamespacedStatefulSet(eq("test-statefulset"), eq("test-namespace"), any());
}*/
    }

    //BaseRock generated method id: ${testExecute_withUnsupportedType}, hash: 37A799611570614FB5046A6644BEC7FC
    @Test
    void testExecute_withUnsupportedType() {
        // Arrange
        KubectlScale<KubernetesObject> kubectlScaleUnsupported = new KubectlScale<>(KubernetesObject.class);
        kubectlScaleUnsupported.apiClient(apiClient).name("test-unsupported").namespace("test-namespace").replicas(3);
        // Act & Assert
        KubectlException exception = assertThrows(KubectlException.class, kubectlScaleUnsupported::execute);
        assertThat(exception.getMessage(), is(equalTo("Unsupported class for scale: interface io.kubernetes.client.common.KubernetesObject")));
    }

    //BaseRock generated method id: ${testExecute_withApiException}, hash: 785B73D9065A20AB2A1783A12D9294AF
    @Test
    void testExecute_withApiException() throws Exception {
        // Arrange
        kubectlScale.name("test-deployment").namespace("test-namespace").replicas(3);
        ApiException apiException = new ApiException("API error");
        try (MockedStatic<PatchUtils> mockedPatchUtils = mockStatic(PatchUtils.class)) {
            mockedPatchUtils.when(() -> PatchUtils.patch(eq(V1Deployment.class), any(), eq(V1Patch.PATCH_FORMAT_JSON_PATCH), eq(apiClient))).thenThrow(apiException);
            // Act & Assert
            KubectlException exception = assertThrows(KubectlException.class, () -> kubectlScale.execute());
            assertThat(exception.getCause(), is(instanceOf(ApiException.class)));
        }
    }

    //BaseRock generated method id: ${testValidate_withMissingName}, hash: 8A6CE29F8864CCCB9B8F285A31EF36D3
    @Test
    void testValidate_withMissingName() {
        // Arrange
        kubectlScale.namespace("test-namespace").replicas(3);
        // Act & Assert
        KubectlException exception = assertThrows(KubectlException.class, () -> kubectlScale.execute());
        assertThat(exception.getMessage(), is(equalTo("Missing name, ")));
    }

    //BaseRock generated method id: ${testValidate_withMissingNamespace}, hash: F742F764CE9784DF44AE57CABE8458EF
    @Test
    void testValidate_withMissingNamespace() {
        // Arrange
        kubectlScale.name("test-deployment").replicas(3);
        // Act & Assert
        KubectlException exception = assertThrows(KubectlException.class, () -> kubectlScale.execute());
        assertThat(exception.getMessage(), is(equalTo("Missing namespace, ")));
    }

    //BaseRock generated method id: ${testValidate_withInvalidReplicas}, hash: 3271B3D6A68DD1CD132C257DB459EEA3
    @Test
    void testValidate_withInvalidReplicas() {
        // Arrange
        kubectlScale.name("test-deployment").namespace("test-namespace").replicas(-1);
        // Act & Assert
        KubectlException exception = assertThrows(KubectlException.class, () -> kubectlScale.execute());
        assertThat(exception.getMessage(), is(equalTo("Invalid replicas")));
    }

    //BaseRock generated method id: ${testValidate_withAllMissingParameters}, hash: 7B126FF8389E207BAA3458613ECEA490
    @Test
    void testValidate_withAllMissingParameters() {
        // Act & Assert
        KubectlException exception = assertThrows(KubectlException.class, () -> kubectlScale.execute());
        assertThat(exception.getMessage(), is(equalTo("Missing name, Missing namespace, Invalid replicas")));
    }

    //BaseRock generated method id: ${testReplicas}, hash: F286932623FFEEED2DDC1A250794169D
    @Test
    void testReplicas() {
        // Arrange & Act
        KubectlScale<V1Deployment> result = kubectlScale.replicas(5);
        // Assert
        assertThat(result, is(notNullValue()));
        assertThat(result, is(equalTo(kubectlScale)));
    }
}