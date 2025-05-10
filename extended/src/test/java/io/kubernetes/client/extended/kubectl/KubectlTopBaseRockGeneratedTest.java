package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.Metrics;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.custom.NodeMetrics;
import io.kubernetes.client.openapi.models.V1Node;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1PodList;
import org.mockito.Mock;
import io.kubernetes.client.custom.PodMetrics;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import java.io.IOException;
import java.util.HashMap;
import io.kubernetes.client.common.KubernetesObject;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import io.kubernetes.client.custom.ContainerMetrics;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.models.V1NodeList;
import io.kubernetes.client.openapi.models.V1NodeStatus;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.custom.NodeMetricsList;
import java.math.BigDecimal;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import io.kubernetes.client.custom.PodMetricsList;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class KubectlTopBaseRockGeneratedTest {

    @Mock
    private ApiClient apiClient;

    @Mock
    private CoreV1Api coreV1Api;

    @Mock
    private Metrics metrics;

    private KubectlTop<V1Node, NodeMetrics> kubectlTopNode;

    private KubectlTop<V1Pod, PodMetrics> kubectlTopPod;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        kubectlTopNode = new KubectlTop<>(V1Node.class);
        kubectlTopNode.apiClient(apiClient);
        kubectlTopPod = new KubectlTop<>(V1Pod.class);
        kubectlTopPod.apiClient(apiClient);
    }

    //BaseRock generated method id: ${testMetric}, hash: 06400C5B6681F2137781DDCB54EA2610
    @Test
    void testMetric() {
        KubectlTop<V1Node, NodeMetrics> result = kubectlTopNode.metric("memory");
        assertEquals("memory", result.metricName);
    }

    //BaseRock generated method id: ${testExecuteWithUnknownMetric}, hash: 1D32C498C7A02F27AC9AFB593B64D06C
    @Test
    void testExecuteWithUnknownMetric() {
        kubectlTopNode.metric("unknown");
        assertThrows(KubectlException.class, () -> kubectlTopNode.execute());
    }

    //BaseRock generated method id: ${testExecuteForNodes}, hash: 861D350002E54EDC852E0A6E574087C5
    @Disabled
    @Test
    void testExecuteForNodes() throws Exception {
        /*try (MockedStatic<Metrics> metricsMockedStatic = mockStatic(Metrics.class)) {
    metricsMockedStatic.when(() -> new Metrics(any(ApiClient.class))).thenReturn(metrics);
    V1NodeList nodeList = new V1NodeList();
    List<V1Node> nodes = new ArrayList<>();
    V1Node node1 = createMockNode("node1", "100Mi", "50Mi");
    V1Node node2 = createMockNode("node2", "200Mi", "100Mi");
    nodes.add(node1);
    nodes.add(node2);
    nodeList.setItems(nodes);
    NodeMetricsList nodeMetricsList = new NodeMetricsList();
    List<NodeMetrics> nodeMetrics = new ArrayList<>();
    nodeMetrics.add(createMockNodeMetrics("node1", "50Mi"));
    nodeMetrics.add(createMockNodeMetrics("node2", "100Mi"));
    nodeMetricsList.setItems(nodeMetrics);
    when(coreV1Api.listNode()).thenReturn(mock(CoreV1Api.APIlistNodeRequest.class));
    when(coreV1Api.listNode().execute()).thenReturn(nodeList);
    when(metrics.getNodeMetrics()).thenReturn(nodeMetricsList);
    when(apiClient.createCoreV1Api()).thenReturn(coreV1Api);
    kubectlTopNode.metric("memory");
    List<Pair<V1Node, NodeMetrics>> result = kubectlTopNode.execute();
    assertNotNull(result);
    assertEquals(2, result.size());
    assertEquals("node2", result.get(0).getLeft().getMetadata().getName());
    assertEquals("node1", result.get(1).getLeft().getMetadata().getName());
}*/
    }

    //BaseRock generated method id: ${testExecuteForPods}, hash: C169C98DC145521CFCF05FD497AE0E5E
    @Disabled
    @Test
    void testExecuteForPods() throws Exception {
        /*try (MockedStatic<Metrics> metricsMockedStatic = mockStatic(Metrics.class)) {
    metricsMockedStatic.when(() -> new Metrics(any(ApiClient.class))).thenReturn(metrics);
    V1PodList podList = new V1PodList();
    List<V1Pod> pods = new ArrayList<>();
    V1Pod pod1 = createMockPod("pod1");
    V1Pod pod2 = createMockPod("pod2");
    pods.add(pod1);
    pods.add(pod2);
    podList.setItems(pods);
    PodMetricsList podMetricsList = new PodMetricsList();
    List<PodMetrics> podMetrics = new ArrayList<>();
    podMetrics.add(createMockPodMetrics("pod1", "100Mi"));
    podMetrics.add(createMockPodMetrics("pod2", "200Mi"));
    podMetricsList.setItems(podMetrics);
    when(coreV1Api.listNamespacedPod(anyString())).thenReturn(mock(CoreV1Api.APIlistNamespacedPodRequest.class));
    when(coreV1Api.listNamespacedPod(anyString()).execute()).thenReturn(podList);
    when(metrics.getPodMetrics(anyString())).thenReturn(podMetricsList);
    when(apiClient.createCoreV1Api()).thenReturn(coreV1Api);
    kubectlTopPod.metric("memory");
    List<Pair<V1Pod, PodMetrics>> result = kubectlTopPod.execute();
    assertNotNull(result);
    assertEquals(2, result.size());
    assertEquals("pod2", result.get(0).getLeft().getMetadata().getName());
    assertEquals("pod1", result.get(1).getLeft().getMetadata().getName());
}*/
    }

    //BaseRock generated method id: ${testExecuteWithApiException}, hash: 254D5235055BD4728BDB740E9A1D3D06
    @Disabled
    @Test
    void testExecuteWithApiException() {
        /*try (MockedStatic<Metrics> metricsMockedStatic = mockStatic(Metrics.class)) {
    metricsMockedStatic.when(() -> new Metrics(any(ApiClient.class))).thenReturn(metrics);
    when(coreV1Api.listNode()).thenReturn(mock(CoreV1Api.APIlistNodeRequest.class));
    when(coreV1Api.listNode().execute()).thenThrow(new ApiException());
    when(apiClient.createCoreV1Api()).thenReturn(coreV1Api);
    kubectlTopNode.metric("cpu");
    assertThrows(KubectlException.class, () -> kubectlTopNode.execute());
}*/
    }

    //BaseRock generated method id: ${testExecuteWithIOException}, hash: 648C59190104F605718E17D31108859C
    @Disabled
    @Test
    void testExecuteWithIOException() {
        /*try (MockedStatic<Metrics> metricsMockedStatic = mockStatic(Metrics.class)) {
    metricsMockedStatic.when(() -> new Metrics(any(ApiClient.class))).thenReturn(metrics);
    when(coreV1Api.listNode()).thenReturn(mock(CoreV1Api.APIlistNodeRequest.class));
    when(coreV1Api.listNode().execute()).thenThrow(new IOException());
    when(apiClient.createCoreV1Api()).thenReturn(coreV1Api);
    kubectlTopNode.metric("cpu");
    assertThrows(KubectlException.class, () -> kubectlTopNode.execute());
}*/
    }

    //BaseRock generated method id: ${testExecuteWithUnsupportedType}, hash: F33C31D89D422FBD14DD5FE19B765C16
    @Test
    void testExecuteWithUnsupportedType() {
        KubectlTop<KubernetesObject, NodeMetrics> unsupportedKubectlTop = new KubectlTop<>(KubernetesObject.class);
        unsupportedKubectlTop.apiClient(apiClient);
        unsupportedKubectlTop.metric("cpu");
        assertThrows(KubectlException.class, () -> unsupportedKubectlTop.execute());
    }

    private V1Node createMockNode(String name, String memoryCapacity, String memoryAllocatable) {
        V1Node node = new V1Node();
        V1ObjectMeta metadata = new V1ObjectMeta();
        metadata.setName(name);
        node.setMetadata(metadata);
        V1NodeStatus status = new V1NodeStatus();
        Map<String, Quantity> capacity = new HashMap<>();
        capacity.put("memory", new Quantity(memoryCapacity));
        status.setCapacity(capacity);
        Map<String, Quantity> allocatable = new HashMap<>();
        allocatable.put("memory", new Quantity(memoryAllocatable));
        status.setAllocatable(allocatable);
        node.setStatus(status);
        return node;
    }

    private NodeMetrics createMockNodeMetrics(String name, String memoryUsage) {
        NodeMetrics nodeMetrics = new NodeMetrics();
        V1ObjectMeta metadata = new V1ObjectMeta();
        metadata.setName(name);
        nodeMetrics.setMetadata(metadata);
        Map<String, Quantity> usage = new HashMap<>();
        usage.put("memory", new Quantity(memoryUsage));
        nodeMetrics.setUsage(usage);
        return nodeMetrics;
    }

    private V1Pod createMockPod(String name) {
        V1Pod pod = new V1Pod();
        V1ObjectMeta metadata = new V1ObjectMeta();
        metadata.setName(name);
        pod.setMetadata(metadata);
        return pod;
    }

    private PodMetrics createMockPodMetrics(String name, String memoryUsage) {
        PodMetrics podMetrics = new PodMetrics();
        V1ObjectMeta metadata = new V1ObjectMeta();
        metadata.setName(name);
        podMetrics.setMetadata(metadata);
        List<ContainerMetrics> containers = new ArrayList<>();
        ContainerMetrics containerMetrics = new ContainerMetrics();
        Map<String, Quantity> usage = new HashMap<>();
        usage.put("memory", new Quantity(memoryUsage));
        containerMetrics.setUsage(usage);
        containers.add(containerMetrics);
        podMetrics.setContainers(containers);
        return podMetrics;
    }
}