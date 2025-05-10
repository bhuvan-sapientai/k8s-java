package io.kubernetes.client.extended.kubectl;

import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.openapi.models.V1Node;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import org.mockito.Mock;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class KubectlCordonBaseRockGeneratedTest {

    @Mock
    private GenericKubernetesApi<V1Node, ?> genericApi;

    @Mock
    private KubernetesApiResponse<V1Node> apiResponse;

    private KubectlCordon kubectlCordon;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        kubectlCordon = spy(new KubectlCordon(true));
    }

    //BaseRock generated method id: ${testExecute}, hash: 15055DB66AA0654F59085B60086024AB
    @Disabled
    @Test
    void testExecute() throws KubectlException {
        //V1Node expectedNode = new V1Node();
        //doReturn(genericApi).when(kubectlCordon).getGenericApi();
        //doReturn(apiResponse).when(genericApi).patch(anyString(), eq(V1Patch.PATCH_FORMAT_JSON_PATCH), any(V1Patch.class));
        //doReturn(apiResponse).when(apiResponse).throwsApiException();
        //doReturn(expectedNode).when(apiResponse).getObject();
        //V1Node result = kubectlCordon.execute();
        //assertEquals(expectedNode, result);
        //verify(genericApi).patch(eq(""), eq(V1Patch.PATCH_FORMAT_JSON_PATCH), any(V1Patch.class));
    }

    //BaseRock generated method id: ${testExecuteWithApiException}, hash: A03CEA4DA8F774A93CE8EC99758F7416
    @Disabled
    @Test
    void testExecuteWithApiException() throws KubectlException {
        //ApiException apiException = new ApiException("API Error");
        //doReturn(genericApi).when(kubectlCordon).getGenericApi();
        //when(genericApi.patch(anyString(), eq(V1Patch.PATCH_FORMAT_JSON_PATCH), any(V1Patch.class))).thenReturn(apiResponse);
        //when(apiResponse.throwsApiException()).thenThrow(apiException);
        //assertThrows(KubectlException.class, () -> kubectlCordon.execute());
    }

    //BaseRock generated method id: ${testExecuteUncordon}, hash: 3FA547BD3D0D1AEC95F30E9B74786B70
    @Disabled
    @Test
    void testExecuteUncordon() throws KubectlException {
        //kubectlCordon = spy(new KubectlCordon(false));
        //V1Node expectedNode = new V1Node();
        //doReturn(genericApi).when(kubectlCordon).getGenericApi();
        //doReturn(apiResponse).when(genericApi).patch(anyString(), eq(V1Patch.PATCH_FORMAT_JSON_PATCH), any(V1Patch.class));
        //doReturn(apiResponse).when(apiResponse).throwsApiException();
        //doReturn(expectedNode).when(apiResponse).getObject();
        //V1Node result = kubectlCordon.execute();
        //assertEquals(expectedNode, result);
        //verify(genericApi).patch(eq(""), eq(V1Patch.PATCH_FORMAT_JSON_PATCH), any(V1Patch.class));
    }

    //BaseRock generated method id: ${testExecuteWithName}, hash: D14E3D02582415B661A66D3EAD75BEA6
    @Disabled
    @Test
    void testExecuteWithName() throws KubectlException {
        //kubectlCordon.name("test-node");
        //V1Node expectedNode = new V1Node();
        //doReturn(genericApi).when(kubectlCordon).getGenericApi();
        //doReturn(apiResponse).when(genericApi).patch(eq("test-node"), eq(V1Patch.PATCH_FORMAT_JSON_PATCH), any(V1Patch.class));
        //doReturn(apiResponse).when(apiResponse).throwsApiException();
        //doReturn(expectedNode).when(apiResponse).getObject();
        //V1Node result = kubectlCordon.execute();
        //assertEquals(expectedNode, result);
        //verify(genericApi).patch(eq("test-node"), eq(V1Patch.PATCH_FORMAT_JSON_PATCH), any(V1Patch.class));
    }

    //BaseRock generated method id: ${testExecuteWithKubectlException}, hash: 97779A64483877A802E6AD757FAB3A09
    @Disabled
    @Test
    void testExecuteWithKubectlException() {
        //KubectlException kubectlException = new KubectlException("Kubectl Error");
        //doThrow(kubectlException).when(kubectlCordon).getGenericApi();
        //assertThrows(KubectlException.class, () -> kubectlCordon.execute());
    }
}