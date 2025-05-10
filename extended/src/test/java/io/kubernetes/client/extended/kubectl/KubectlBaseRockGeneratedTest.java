package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.common.KubernetesObject;
import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.Discovery;
import io.kubernetes.client.openapi.Configuration;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.apimachinery.GroupVersionKind;
import org.mockito.Mock;
import io.kubernetes.client.util.generic.dynamic.DynamicKubernetesObject;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.ModelMapper;
import org.mockito.MockitoAnnotations;
import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.util.generic.options.ListOptions;
import static org.junit.jupiter.api.Assertions.*;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import java.util.concurrent.TimeUnit;
import io.kubernetes.client.apimachinery.GroupVersionResource;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
class KubectlBaseRockGeneratedTest {

    @Mock
    private ApiClient mockApiClient;

    @Mock
    private Discovery mockDiscovery;

    @Mock
    private ModelMapper mockModelMapper;

    @Mock
    private GenericKubernetesApi<KubernetesObject, KubernetesListObject> mockGenericApi;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        Configuration.setDefaultApiClient(mockApiClient);
    }

    //BaseRock generated method id: ${testGet}, hash: 8134EE71EB760EE5E720E68A050A4B2B
    @Test
    void testGet() {
        KubectlGet<KubernetesObject> kubectlGet = Kubectl.get(KubernetesObject.class);
        assertNotNull(kubectlGet);
    }

    //BaseRock generated method id: ${testCreate}, hash: 62DDED590E1DF00375FE0135B488BA47
    @Test
    void testCreate() {
        KubectlCreate<KubernetesObject> kubectlCreate = Kubectl.create(KubernetesObject.class);
        assertNotNull(kubectlCreate);
    }

    //BaseRock generated method id: ${testDelete}, hash: 77682F5BC1C0478547CE914CD83E7497
    @Test
    void testDelete() {
        KubectlDelete<KubernetesObject> kubectlDelete = Kubectl.delete(KubernetesObject.class);
        assertNotNull(kubectlDelete);
    }

    //BaseRock generated method id: ${testReplace}, hash: AC626A438BD8F4EFD0AD9F4C95D4EB09
    @Test
    void testReplace() {
        KubectlReplace<KubernetesObject> kubectlReplace = Kubectl.replace(KubernetesObject.class);
        assertNotNull(kubectlReplace);
    }

    //BaseRock generated method id: ${testApply}, hash: 4432F5B51025C5FA28249338FAE354DC
    @Test
    void testApply() {
        KubectlApply<KubernetesObject> kubectlApply = Kubectl.apply(KubernetesObject.class);
        assertNotNull(kubectlApply);
    }

    //BaseRock generated method id: ${testDrain}, hash: 9E0F4543D4F359A2B1D188D04F06F97A
    @Test
    void testDrain() {
        KubectlDrain kubectlDrain = Kubectl.drain();
        assertNotNull(kubectlDrain);
    }

    //BaseRock generated method id: ${testCordon}, hash: FD573DC802984C75C8A31A38401297CF
    @Test
    void testCordon() {
        KubectlCordon kubectlCordon = Kubectl.cordon();
        assertNotNull(kubectlCordon);
    }

    //BaseRock generated method id: ${testUncordon}, hash: 65CE211FCEF6D02344D785B53DEB8E37
    @Test
    void testUncordon() {
        KubectlCordon kubectlCordon = Kubectl.uncordon();
        assertNotNull(kubectlCordon);
    }

    //BaseRock generated method id: ${testTop}, hash: 323E46980A67D1389616C64B70AE4790
    @Test
    void testTop() {
        KubectlTop<KubernetesObject, Object> kubectlTop = Kubectl.top(KubernetesObject.class, Object.class);
        assertNotNull(kubectlTop);
    }

    //BaseRock generated method id: ${testTaint}, hash: 714ABE736AB2F7CA79ADCB72C1BB5997
    @Test
    void testTaint() {
        KubectlTaint kubectlTaint = Kubectl.taint();
        assertNotNull(kubectlTaint);
    }

    //BaseRock generated method id: ${testCopy}, hash: 0B2FCC11CDB0695A175BF93A914CF8DF
    @Test
    void testCopy() {
        KubectlCopy kubectlCopy = Kubectl.copy();
        assertNotNull(kubectlCopy);
    }

    //BaseRock generated method id: ${testLabel}, hash: 502A77F8A6AA29EB6B75B82B4E218153
    @Test
    void testLabel() {
        KubectlLabel<KubernetesObject> kubectlLabel = Kubectl.label(KubernetesObject.class);
        assertNotNull(kubectlLabel);
    }

    //BaseRock generated method id: ${testAnnotate}, hash: 6DFB6B52AD5F539921F4BADBF15BC834
    @Test
    void testAnnotate() {
        KubectlAnnotate<KubernetesObject> kubectlAnnotate = Kubectl.annotate(KubernetesObject.class);
        assertNotNull(kubectlAnnotate);
    }

    //BaseRock generated method id: ${testVersion}, hash: BE79A7AE81E7A05321DD7CD241DB91CE
    @Test
    void testVersion() {
        KubectlVersion kubectlVersion = Kubectl.version();
        assertNotNull(kubectlVersion);
    }

    //BaseRock generated method id: ${testScale}, hash: 25A6BBBAFFE037F3E5D149289CB8D85F
    @Test
    void testScale() {
        KubectlScale<KubernetesObject> kubectlScale = Kubectl.scale(KubernetesObject.class);
        assertNotNull(kubectlScale);
    }

    //BaseRock generated method id: ${testRollout}, hash: DA1D57A1C7A23F742086034E4425D6F8
    @Test
    void testRollout() {
        KubectlRollout<KubernetesObject> kubectlRollout = Kubectl.rollout(KubernetesObject.class);
        assertNotNull(kubectlRollout);
    }

    //BaseRock generated method id: ${testExec}, hash: 7666980D6D328A8CF721679E3A262910
    @Test
    void testExec() {
        KubectlExec kubectlExec = Kubectl.exec();
        assertNotNull(kubectlExec);
    }

    //BaseRock generated method id: ${testLog}, hash: 2110FAA5B679E334B20B70C9203077FB
    @Test
    void testLog() {
        KubectlLog kubectlLog = Kubectl.log();
        assertNotNull(kubectlLog);
    }

    //BaseRock generated method id: ${testPortforward}, hash: 78441108679E6F558BE01644F35C2F17
    @Test
    void testPortforward() {
        KubectlPortForward kubectlPortForward = Kubectl.portforward();
        assertNotNull(kubectlPortForward);
    }

    //BaseRock generated method id: ${testApiResources}, hash: B324DDC84AB7ACECFAF6A035B7AD3AFB
    @Test
    void testApiResources() {
        KubectlApiResources kubectlApiResources = Kubectl.apiResources();
        assertNotNull(kubectlApiResources);
    }

    //BaseRock generated method id: ${testPatch}, hash: C439C6C61FB6B500569E738830B07716
    @Test
    void testPatch() {
        KubectlPatch<KubernetesObject> kubectlPatch = Kubectl.patch(KubernetesObject.class);
        assertNotNull(kubectlPatch);
    }

    //BaseRock generated method id: ${testResourceBuilderNamespace}, hash: 717F466DEC236CE4114556B8721C02A6
    @Test
    void testResourceBuilderNamespace() {
        Kubectl.ResourceBuilder<KubernetesObject, ?> resourceBuilder = mock(Kubectl.ResourceBuilder.class);
        String namespace = "test-namespace";
        resourceBuilder.namespace(namespace);
        verify(resourceBuilder).namespace(namespace);
    }

    //BaseRock generated method id: ${testResourceBuilderName}, hash: 2EC926A063DF6DB36E2EB155C214D990
    @Test
    void testResourceBuilderName() {
        Kubectl.ResourceBuilder<KubernetesObject, ?> resourceBuilder = mock(Kubectl.ResourceBuilder.class);
        String name = "test-name";
        resourceBuilder.name(name);
        verify(resourceBuilder).name(name);
    }

    //BaseRock generated method id: ${testResourceBuilderApiClient}, hash: 4928A5198FE91AD9AC6723D30DD3AD56
    @Test
    void testResourceBuilderApiClient() {
        Kubectl.ResourceBuilder<KubernetesObject, ?> resourceBuilder = mock(Kubectl.ResourceBuilder.class);
        resourceBuilder.apiClient(mockApiClient);
        verify(resourceBuilder).apiClient(mockApiClient);
    }

    //BaseRock generated method id: ${testResourceBuilderSkipDiscovery}, hash: C9B7A3159AB357836EDA123804BAB336
    @Test
    void testResourceBuilderSkipDiscovery() {
        Kubectl.ResourceBuilder<KubernetesObject, ?> resourceBuilder = mock(Kubectl.ResourceBuilder.class);
        resourceBuilder.skipDiscovery();
        verify(resourceBuilder).skipDiscovery();
    }

    //BaseRock generated method id: ${testResourceBuilderRefreshDiscovery}, hash: 938765FC10BAD78C57CB79C66483D1AA
    @Test
    void testResourceBuilderRefreshDiscovery() throws KubectlException {
        Kubectl.ResourceBuilder<KubernetesObject, ?> resourceBuilder = mock(Kubectl.ResourceBuilder.class);
        doNothing().when(resourceBuilder).refreshDiscovery();
        resourceBuilder.refreshDiscovery();
        verify(resourceBuilder).refreshDiscovery();
    }

    //BaseRock generated method id: ${testResourceBuilderGetGenericApi}, hash: 15C3A474E3EE43051DEDA032B74E2E22
    @Disabled
    @Test
    void testResourceBuilderGetGenericApi() throws KubectlException {
        //Kubectl.ResourceBuilder<KubernetesObject, ?> resourceBuilder = mock(Kubectl.ResourceBuilder.class);
        //when(resourceBuilder.getGenericApi(any())).thenReturn(mockGenericApi);
        //GenericKubernetesApi<?, ?> result = resourceBuilder.getGenericApi(KubernetesObject.class);
        //assertNotNull(result);
        //verify(resourceBuilder).getGenericApi(KubernetesObject.class);
    }

    //BaseRock generated method id: ${testResourceBuilderIsNamespaced}, hash: 6D6F9158BA5FFD62BD29A169DBB607B5
    @Test
    void testResourceBuilderIsNamespaced() {
        Kubectl.ResourceBuilder<KubernetesObject, ?> resourceBuilder = mock(Kubectl.ResourceBuilder.class);
        KubernetesObject mockObj = mock(KubernetesObject.class);
        when(resourceBuilder.isNamespaced(mockObj)).thenReturn(true);
        boolean result = resourceBuilder.isNamespaced(mockObj);
        assertTrue(result);
        verify(resourceBuilder).isNamespaced(mockObj);
    }

    //BaseRock generated method id: ${testResourceBuilderGetGenericApiForDynamicKubernetesObject}, hash: 7624662D5212075EA3370B73832DC660
    @Disabled
    @Test
    void testResourceBuilderGetGenericApiForDynamicKubernetesObject() throws KubectlException {
        //Kubectl.ResourceBuilder<KubernetesObject, ?> resourceBuilder = mock(Kubectl.ResourceBuilder.class);
        //DynamicKubernetesObject mockObj = mock(DynamicKubernetesObject.class);
        //when(resourceBuilder.getGenericApi(any())).thenReturn(mockGenericApi);
        //GenericKubernetesApi<?, ?> result = resourceBuilder.getGenericApi(mockObj);
        //assertNotNull(result);
        //verify(resourceBuilder).getGenericApi(mockObj);
    }

    //BaseRock generated method id: ${testResourceAndContainerBuilderContainer}, hash: A65D84649614DD3A31AF80CB682E773D
    @Test
    void testResourceAndContainerBuilderContainer() {
        Kubectl.ResourceAndContainerBuilder<KubernetesObject, ?> resourceAndContainerBuilder = mock(Kubectl.ResourceAndContainerBuilder.class);
        String container = "test-container";
        resourceAndContainerBuilder.container(container);
        verify(resourceAndContainerBuilder).container(container);
    }
}