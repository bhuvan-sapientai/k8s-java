package io.kubernetes.client.custom;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.custom.NodeMetrics;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import io.kubernetes.client.common.KubernetesListObject;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class NodeMetricsListBaseRockGeneratedTest {

    //BaseRock generated method id: ${testNodeMetricsListConstructor}, hash: B21BA7D049E1D3DA8DAF2A90FEF3C153
    @Test
    void testNodeMetricsListConstructor() {
        NodeMetricsList nodeMetricsList = new NodeMetricsList();
        assertNotNull(nodeMetricsList);
        assertNotNull(nodeMetricsList.getMetadata());
        assertNotNull(nodeMetricsList.getItems());
        assertTrue(nodeMetricsList.getItems().isEmpty());
    }

    //BaseRock generated method id: ${testGetSetApiVersion}, hash: FBD685A1C11C6EF4DDDECE47A1A23CD6
    @Test
    void testGetSetApiVersion() {
        NodeMetricsList nodeMetricsList = new NodeMetricsList();
        String apiVersion = "v1";
        nodeMetricsList.setApiVersion(apiVersion);
        assertEquals(apiVersion, nodeMetricsList.getApiVersion());
    }

    //BaseRock generated method id: ${testGetSetKind}, hash: A8E40277BD6220ADAB09029E5530E13D
    @Test
    void testGetSetKind() {
        NodeMetricsList nodeMetricsList = new NodeMetricsList();
        String kind = "NodeMetricsList";
        nodeMetricsList.setKind(kind);
        assertEquals(kind, nodeMetricsList.getKind());
    }

    //BaseRock generated method id: ${testGetSetMetadata}, hash: 0F3C15A16D8F7957B60995E842CBEDF0
    @Test
    void testGetSetMetadata() {
        NodeMetricsList nodeMetricsList = new NodeMetricsList();
        V1ListMeta metadata = new V1ListMeta();
        nodeMetricsList.setMetadata(metadata);
        assertThat(nodeMetricsList.getMetadata(), is(metadata));
    }

    //BaseRock generated method id: ${testGetSetItems}, hash: C588287037D506E7B804E25E7F68CD0C
    @Test
    void testGetSetItems() {
        NodeMetricsList nodeMetricsList = new NodeMetricsList();
        List<NodeMetrics> items = new ArrayList<>();
        items.add(new NodeMetrics());
        nodeMetricsList.setItems(items);
        assertThat(nodeMetricsList.getItems(), is(items));
        assertThat(nodeMetricsList.getItems(), hasSize(1));
    }

    //BaseRock generated method id: ${testImplementsKubernetesListObject}, hash: 7D4F0D44AFCF3BC165AF5D4E9D45A02F
    @Test
    void testImplementsKubernetesListObject() {
        NodeMetricsList nodeMetricsList = new NodeMetricsList();
        assertTrue(nodeMetricsList instanceof KubernetesListObject);
    }

    //BaseRock generated method id: ${testCompleteNodeMetricsList}, hash: 35F184AEFB439662C3B69FED3BE207DE
    @Test
    void testCompleteNodeMetricsList() {
        NodeMetricsList nodeMetricsList = new NodeMetricsList();
        String apiVersion = "v1";
        String kind = "NodeMetricsList";
        V1ListMeta metadata = new V1ListMeta();
        List<NodeMetrics> items = new ArrayList<>();
        items.add(new NodeMetrics());
        nodeMetricsList.setApiVersion(apiVersion);
        nodeMetricsList.setKind(kind);
        nodeMetricsList.setMetadata(metadata);
        nodeMetricsList.setItems(items);
        assertThat(nodeMetricsList.getApiVersion(), is(equalTo(apiVersion)));
        assertThat(nodeMetricsList.getKind(), is(equalTo(kind)));
        assertThat(nodeMetricsList.getMetadata(), is(metadata));
        assertThat(nodeMetricsList.getItems(), is(items));
        assertThat(nodeMetricsList.getItems(), hasSize(1));
    }

    //BaseRock generated method id: ${testEmptyItemsList}, hash: 18CDD2099792818052AE51B784E11554
    @Test
    void testEmptyItemsList() {
        NodeMetricsList nodeMetricsList = new NodeMetricsList();
        assertThat(nodeMetricsList.getItems(), is(notNullValue()));
        assertThat(nodeMetricsList.getItems(), hasSize(0));
    }
}
