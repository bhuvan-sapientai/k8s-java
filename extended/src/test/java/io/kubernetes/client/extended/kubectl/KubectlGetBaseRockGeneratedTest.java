package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.common.KubernetesObject;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import org.mockito.Mock;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import org.mockito.MockitoAnnotations;
import io.kubernetes.client.common.KubernetesListObject;
import java.util.ArrayList;
import io.kubernetes.client.util.generic.options.ListOptions;
import static org.junit.jupiter.api.Assertions.*;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import static org.mockito.ArgumentMatchers.*;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class KubectlGetBaseRockGeneratedTest {

    @Mock
    private ApiClient mockApiClient;

    @Mock
    private GenericKubernetesApi<KubernetesObject, KubernetesListObject> mockGenericApi;

    @Mock
    private KubernetesApiResponse<KubernetesListObject> mockApiResponse;

    @Mock
    private KubernetesListObject mockListObject;

    private KubectlGet<KubernetesObject> kubectlGet;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        kubectlGet = new KubectlGet<>(KubernetesObject.class);
        kubectlGet.apiClient(mockApiClient);
    }

    //BaseRock generated method id: ${testExecuteNamespaced}, hash: F128FF55AD5E6EFC21E5065240FF63A7
    @Disabled
    @Test
    void testExecuteNamespaced() throws KubectlException {
        //String namespace = "test-namespace";
        //kubectlGet.namespace(namespace);
        //List<KubernetesObject> expectedItems = new ArrayList<>();
        //expectedItems.add(mock(KubernetesObject.class));
        /*try (MockedStatic<Kubectl> mockedKubectl = mockStatic(Kubectl.class)) {
    mockedKubectl.when(() -> Kubectl.get(any())).thenReturn(kubectlGet);
    when(mockGenericApi.list(eq(namespace), any(ListOptions.class))).thenReturn(mockApiResponse);
    when(mockApiResponse.throwsApiException()).thenReturn(mockApiResponse);
    when(mockApiResponse.getObject()).thenReturn(mockListObject);
    doReturn(expectedItems).when(mockListObject).getItems();
    List<KubernetesObject> result = kubectlGet.execute();
    assertNotNull(result);
    assertEquals(expectedItems, result);
    verify(mockGenericApi).list(eq(namespace), any(ListOptions.class));
}*/
    }

    //BaseRock generated method id: ${testExecuteClusterScoped}, hash: 4C01271875221EF01B9A0D09D51F1427
    @Disabled
    @Test
    void testExecuteClusterScoped() throws KubectlException {
        //List<KubernetesObject> expectedItems = new ArrayList<>();
        //expectedItems.add(mock(KubernetesObject.class));
        /*try (MockedStatic<Kubectl> mockedKubectl = mockStatic(Kubectl.class)) {
    mockedKubectl.when(() -> Kubectl.get(any())).thenReturn(kubectlGet);
    when(mockGenericApi.list(any(ListOptions.class))).thenReturn(mockApiResponse);
    when(mockApiResponse.throwsApiException()).thenReturn(mockApiResponse);
    when(mockApiResponse.getObject()).thenReturn(mockListObject);
    doReturn(expectedItems).when(mockListObject).getItems();
    List<KubernetesObject> result = kubectlGet.execute();
    assertNotNull(result);
    assertEquals(expectedItems, result);
    verify(mockGenericApi).list(any(ListOptions.class));
}*/
    }

    //BaseRock generated method id: ${testExecuteWithApiException}, hash: EF5FE870C7E51F9D5EBEE85164F55716
    @Disabled()
    @Test
    void testExecuteWithApiException() {
        try (MockedStatic<Kubectl> mockedKubectl = mockStatic(Kubectl.class)) {
            mockedKubectl.when(() -> Kubectl.get(any())).thenReturn(kubectlGet);
            when(mockGenericApi.list(any(ListOptions.class))).thenThrow(new ApiException("API Error"));
            assertThrows(KubectlException.class, () -> kubectlGet.execute());
        }
    }

    //BaseRock generated method id: ${testGetSingle}, hash: 203507F24ADDEF6B5FE3BBDDFA961971
    @Disabled
    @Test
    void testGetSingle() throws KubectlException, ApiException {
        //String name = "test-object";
        //String namespace = "test-namespace";
        //kubectlGet.namespace(namespace);
        //KubernetesObject expectedObject = mock(KubernetesObject.class);
        /*try (MockedStatic<Kubectl> mockedKubectl = mockStatic(Kubectl.class)) {
    mockedKubectl.when(() -> Kubectl.get(any())).thenReturn(kubectlGet);
    when(mockGenericApi.get(eq(namespace), eq(name))).thenReturn(mockApiResponse);
    when(mockApiResponse.throwsApiException()).thenReturn(mockApiResponse);
    doReturn(expectedObject).when(mockApiResponse).getObject();
    KubernetesObject result = kubectlGet.name(name).execute();
    assertNotNull(result);
    assertEquals(expectedObject, result);
    verify(mockGenericApi).get(eq(namespace), eq(name));
}*/
    }

    //BaseRock generated method id: ${testGetSingleClusterScoped}, hash: EFE92F7ACAB534799469269EF0881A8B
    @Disabled
    @Test
    void testGetSingleClusterScoped() throws KubectlException, ApiException {
        //String name = "test-object";
        //KubernetesObject expectedObject = mock(KubernetesObject.class);
        /*try (MockedStatic<Kubectl> mockedKubectl = mockStatic(Kubectl.class)) {
    mockedKubectl.when(() -> Kubectl.get(any())).thenReturn(kubectlGet);
    when(mockGenericApi.get(eq(name))).thenReturn(mockApiResponse);
    when(mockApiResponse.throwsApiException()).thenReturn(mockApiResponse);
    doReturn(expectedObject).when(mockApiResponse).getObject();
    KubernetesObject result = kubectlGet.name(name).execute();
    assertNotNull(result);
    assertEquals(expectedObject, result);
    verify(mockGenericApi).get(eq(name));
}*/
    }

    //BaseRock generated method id: ${testGetSingleWithApiException}, hash: B3D206FA66C493E5F0FD19E27506834C
    @Disabled()
    @Test
    void testGetSingleWithApiException() {
        String name = "test-object";
        try (MockedStatic<Kubectl> mockedKubectl = mockStatic(Kubectl.class)) {
            mockedKubectl.when(() -> Kubectl.get(any())).thenReturn(kubectlGet);
            when(mockGenericApi.get(eq(name))).thenThrow(new ApiException("API Error"));
            assertThrows(KubectlException.class, () -> kubectlGet.name(name).execute());
        }
    }

    //BaseRock generated method id: ${testApiListTypeClass}, hash: 4A58DDB3C41BBFBF64E9C6D389680222
    @Test
    void testApiListTypeClass() {
        Class<? extends KubernetesListObject> apiListTypeClass = KubernetesListObject.class;
        KubectlGet<KubernetesObject> result = kubectlGet.apiListTypeClass(apiListTypeClass);
        assertNotNull(result);
        assertSame(kubectlGet, result);
    }

    //BaseRock generated method id: ${testOptions}, hash: 0755682F17B06D241CE9B1499E5E74F2
    @Test
    void testOptions() {
        ListOptions listOptions = new ListOptions();
        KubectlGet<KubernetesObject> result = kubectlGet.options(listOptions);
        assertNotNull(result);
        assertSame(kubectlGet, result);
    }

    //BaseRock generated method id: ${testNamespace}, hash: CEF6AE9D46564C1F08EA3CA479389AD0
    @Test
    void testNamespace() {
        String namespace = "test-namespace";
        KubectlGet<KubernetesObject> result = kubectlGet.namespace(namespace);
        assertNotNull(result);
        assertSame(kubectlGet, result);
    }

    //BaseRock generated method id: ${testName}, hash: 99D1D3D26130C8410E07FC8E89C0A077
    @Test
    void testName() {
        String name = "test-object";
        KubectlGet<KubernetesObject>.KubectlGetSingle result = kubectlGet.name(name);
        assertNotNull(result);
    }
}
