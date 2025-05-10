package io.kubernetes.client.extended.kubectl.util.deployment;

import org.junit.jupiter.api.BeforeEach;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.util.Yaml;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.*;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import io.kubernetes.client.openapi.apis.AppsV1Api;
import static org.junit.jupiter.api.Assertions.*;
import java.time.OffsetDateTime;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import static org.hamcrest.Matchers.startsWith;
import java.util.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class DeploymentHelperBaseRockGeneratedTest {

    @Mock
    private AppsV1Api appsV1Api;

    @Mock
    private AppsV1Api.APIlistNamespacedReplicaSetRequest listRequest;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    //BaseRock generated method id: ${testGetAllReplicaSets}, hash: 0426FAC86575EF6F22E20AE3829D8FBB
    @Disabled()
    @Test
    void testGetAllReplicaSets() throws ApiException {
        V1Deployment deployment = new V1Deployment();
        V1ObjectMeta metadata = new V1ObjectMeta();
        metadata.setNamespace("default");
        metadata.setUid("deployment-uid");
        deployment.setMetadata(metadata);
        V1DeploymentSpec spec = new V1DeploymentSpec();
        V1LabelSelector selector = new V1LabelSelector();
        selector.setMatchLabels(Collections.singletonMap("app", "test"));
        spec.setSelector(selector);
        V1PodTemplateSpec podTemplateSpec = new V1PodTemplateSpec();
        V1ObjectMeta podTemplateMetadata = new V1ObjectMeta();
        podTemplateMetadata.setLabels(Collections.singletonMap("app", "test"));
        podTemplateSpec.setMetadata(podTemplateMetadata);
        podTemplateSpec.setSpec(new V1PodSpec());
        spec.setTemplate(podTemplateSpec);
        deployment.setSpec(spec);
        V1ReplicaSetList replicaSetList = new V1ReplicaSetList();
        List<V1ReplicaSet> replicaSets = new ArrayList<>();
        V1ReplicaSet newRs = createReplicaSet("new-rs", true, 3);
        V1ReplicaSet oldRs1 = createReplicaSet("old-rs-1", false, 0);
        V1ReplicaSet oldRs2 = createReplicaSet("old-rs-2", false, 2);
        replicaSets.add(newRs);
        replicaSets.add(oldRs1);
        replicaSets.add(oldRs2);
        replicaSetList.setItems(replicaSets);
        when(appsV1Api.listNamespacedReplicaSet(anyString())).thenReturn(listRequest);
        when(listRequest.labelSelector(anyString())).thenReturn(listRequest);
        when(listRequest.execute()).thenReturn(replicaSetList);
        List<V1ReplicaSet> oldRSes = new ArrayList<>();
        List<V1ReplicaSet> allOldRSes = new ArrayList<>();
        V1ReplicaSet result = DeploymentHelper.getAllReplicaSets(deployment, appsV1Api, oldRSes, allOldRSes);
        assertNotNull(result);
        assertEquals("new-rs", result.getMetadata().getName());
        assertEquals(1, oldRSes.size());
        assertEquals(2, allOldRSes.size());
        assertTrue(oldRSes.stream().anyMatch(rs -> rs.getMetadata().getName().equals("old-rs-2")));
        assertTrue(allOldRSes.stream().anyMatch(rs -> rs.getMetadata().getName().equals("old-rs-1")));
        assertTrue(allOldRSes.stream().anyMatch(rs -> rs.getMetadata().getName().equals("old-rs-2")));
    }

    //BaseRock generated method id: ${testRevision}, hash: A57E5D94339AC36B6BADED253F562700
    @Test
    void testRevision() {
        V1ObjectMeta meta = new V1ObjectMeta();
        meta.setAnnotations(new HashMap<>());
        meta.getAnnotations().put(DeploymentHelper.REVISION_ANNOTATION, "5");
        long revision = DeploymentHelper.revision(meta);
        assertEquals(5L, revision);
    }

    //BaseRock generated method id: ${testRevisionWithNoAnnotation}, hash: B72913E3A63BDFBB81AE020093086843
    @Test
    void testRevisionWithNoAnnotation() {
        V1ObjectMeta meta = new V1ObjectMeta();
        long revision = DeploymentHelper.revision(meta);
        assertEquals(0L, revision);
    }

    private V1ReplicaSet createReplicaSet(String name, boolean isNewRs, int replicas) {
        V1ReplicaSet rs = new V1ReplicaSet();
        V1ObjectMeta metadata = new V1ObjectMeta();
        metadata.setName(name);
        metadata.setCreationTimestamp(OffsetDateTime.now());
        List<V1OwnerReference> ownerReferences = new ArrayList<>();
        V1OwnerReference ownerReference = new V1OwnerReference();
        ownerReference.setUid("deployment-uid");
        ownerReference.setController(true);
        ownerReferences.add(ownerReference);
        metadata.setOwnerReferences(ownerReferences);
        rs.setMetadata(metadata);
        V1ReplicaSetSpec spec = new V1ReplicaSetSpec();
        spec.setReplicas(replicas);
        if (isNewRs) {
            V1PodTemplateSpec template = new V1PodTemplateSpec();
            V1ObjectMeta templateMeta = new V1ObjectMeta();
            templateMeta.setLabels(new HashMap<>());
            templateMeta.getLabels().put("app", "test");
            template.setMetadata(templateMeta);
            template.setSpec(new V1PodSpec());
            spec.setTemplate(template);
        }
        rs.setSpec(spec);
        return rs;
    }
}
