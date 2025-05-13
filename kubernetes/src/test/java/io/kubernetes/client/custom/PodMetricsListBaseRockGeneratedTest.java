package io.kubernetes.client.custom;

import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.custom.PodMetrics;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.common.KubernetesListObject;
import java.util.ArrayList;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class PodMetricsListBaseRockGeneratedTest {

    private PodMetricsList podMetricsList;

    @BeforeEach
    void setUp() {
        podMetricsList = new PodMetricsList();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 04FB8EF0F3913FFE6DA6F72322EA0EC5
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1";
        podMetricsList.setApiVersion(apiVersion);
        assertEquals(apiVersion, podMetricsList.getApiVersion());
    }

    //BaseRock generated method id: ${testGetKind}, hash: 049D733377AAF2CAD8E108CE11FF29B7
    @Test
    void testGetKind() {
        String kind = "PodMetricsList";
        podMetricsList.setKind(kind);
        assertEquals(kind, podMetricsList.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: B137179A754752FA2D837E95B70705F4
    @Test
    void testGetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        podMetricsList.setMetadata(metadata);
        assertThat(podMetricsList.getMetadata(), is(metadata));
    }

    //BaseRock generated method id: ${testGetItems}, hash: D7CC18BC1A0B04D4818997F0A9816473
    @Test
    void testGetItems() {
        List<PodMetrics> items = new ArrayList<>();
        items.add(mock(PodMetrics.class));
        items.add(mock(PodMetrics.class));
        podMetricsList.setItems(items);
        assertThat(podMetricsList.getItems(), is(items));
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: AD45D341EE63C01FE17622F5DAB80F46
    @Test
    void testSetApiVersion() {
        String apiVersion = "v1beta1";
        podMetricsList.setApiVersion(apiVersion);
        assertEquals(apiVersion, podMetricsList.getApiVersion());
    }

    //BaseRock generated method id: ${testSetKind}, hash: BF66D3022FE5F7ED3DC3CBF0B42A6B2F
    @Test
    void testSetKind() {
        String kind = "PodMetricsList";
        podMetricsList.setKind(kind);
        assertEquals(kind, podMetricsList.getKind());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: 63731740946CC4C9119C9569E8D1AF6A
    @Test
    void testSetMetadata() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        podMetricsList.setMetadata(metadata);
        assertThat(podMetricsList.getMetadata(), is(metadata));
    }

    //BaseRock generated method id: ${testSetItems}, hash: 5F39C66FE8DB15C450631C136ABD1AFC
    @Test
    void testSetItems() {
        List<PodMetrics> items = new ArrayList<>();
        items.add(mock(PodMetrics.class));
        items.add(mock(PodMetrics.class));
        podMetricsList.setItems(items);
        assertThat(podMetricsList.getItems(), is(items));
    }

    //BaseRock generated method id: ${testImplementsKubernetesListObject}, hash: 524B01731AB11E368D592AA5BFAF5DB5
    @Test
    void testImplementsKubernetesListObject() {
        assertThat(podMetricsList, is(notNullValue()));
        assertThat(podMetricsList instanceof KubernetesListObject, is(true));
    }

    //BaseRock generated method id: ${testGetMetadataFromKubernetesListObject}, hash: 8FB7F535362691450CA237A237D85E27
    @Test
    void testGetMetadataFromKubernetesListObject() {
        V1ListMeta metadata = mock(V1ListMeta.class);
        podMetricsList.setMetadata(metadata);
        KubernetesListObject kubernetesListObject = podMetricsList;
        assertThat(kubernetesListObject.getMetadata(), is(metadata));
    }

    //BaseRock generated method id: ${testGetItemsFromKubernetesListObject}, hash: 58475F1B916D8DA3B4AC750454AF67D4
    @Test
    void testGetItemsFromKubernetesListObject() {
        List<PodMetrics> items = new ArrayList<>();
        items.add(mock(PodMetrics.class));
        items.add(mock(PodMetrics.class));
        podMetricsList.setItems(items);
        KubernetesListObject kubernetesListObject = podMetricsList;
        assertThat(kubernetesListObject.getItems(), is(equalTo(items)));
    }
}
