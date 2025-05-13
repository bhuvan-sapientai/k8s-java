package io.kubernetes.client.custom;

import static org.junit.jupiter.api.Assertions.assertAll;
import io.kubernetes.client.common.KubernetesObject;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.ArrayList;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class PodMetricsBaseRockGeneratedTest {

    private PodMetrics podMetrics;

    @BeforeEach
    void setUp() {
        podMetrics = new PodMetrics();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: A6A474557E1B4A2CD54543154C76CEDB
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1";
        podMetrics.setApiVersion(apiVersion);
        assertThat(podMetrics.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testGetKind}, hash: 5C578B49B6738D76A908834F74C89F3F
    @Test
    void testGetKind() {
        String kind = "PodMetrics";
        podMetrics.setKind(kind);
        assertThat(podMetrics.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 1943AF9E59DCF8D84285CB707BFB013F
    @Test
    void testGetMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        podMetrics.setMetadata(metadata);
        assertThat(podMetrics.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testGetTimestamp}, hash: 2356D74167722E98878CAACA8F7708C0
    @Test
    void testGetTimestamp() {
        String timestamp = "2023-05-17T10:30:00Z";
        podMetrics.setTimestamp(timestamp);
        assertThat(podMetrics.getTimestamp(), is(equalTo(timestamp)));
    }

    //BaseRock generated method id: ${testGetWindow}, hash: 20A8E2769F9B5FB49395485DE6CB9826
    @Test
    void testGetWindow() {
        String window = "5m";
        podMetrics.setWindow(window);
        assertThat(podMetrics.getWindow(), is(equalTo(window)));
    }

    //BaseRock generated method id: ${testGetContainers}, hash: 5B6AC53D6A1540C28371F150708B0E7D
    @Test
    void testGetContainers() {
        List<ContainerMetrics> containerMetrics = new ArrayList<>();
        containerMetrics.add(mock(ContainerMetrics.class));
        containerMetrics.add(mock(ContainerMetrics.class));
        podMetrics.setContainers(containerMetrics);
        assertThat(podMetrics.getContainers(), is(equalTo(containerMetrics)));
        assertThat(podMetrics.getContainers(), hasSize(2));
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: C5F372DFB5EF1C9B62FCCA6432A38C6F
    @Test
    void testSetApiVersion() {
        String apiVersion = "v2";
        podMetrics.setApiVersion(apiVersion);
        assertThat(podMetrics.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testSetKind}, hash: 1A54CF97F3496C90797B4CD97473C7B6
    @Test
    void testSetKind() {
        String kind = "CustomPodMetrics";
        podMetrics.setKind(kind);
        assertThat(podMetrics.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: 58D1A1F647E4F0C8BF59D86A602F0AB5
    @Test
    void testSetMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        podMetrics.setMetadata(metadata);
        assertThat(podMetrics.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testSetTimestamp}, hash: 4B54899605D862D1CEB7653B6DEB4E9E
    @Test
    void testSetTimestamp() {
        String timestamp = "2023-05-17T11:45:00Z";
        podMetrics.setTimestamp(timestamp);
        assertThat(podMetrics.getTimestamp(), is(equalTo(timestamp)));
    }

    //BaseRock generated method id: ${testSetWindow}, hash: FF1591394CB3553D4ADD490E8AF548A0
    @Test
    void testSetWindow() {
        String window = "10m";
        podMetrics.setWindow(window);
        assertThat(podMetrics.getWindow(), is(equalTo(window)));
    }

    //BaseRock generated method id: ${testSetContainers}, hash: C602E1B7789E0C38242AF37935ACFB25
    @Test
    void testSetContainers() {
        List<ContainerMetrics> containerMetrics = new ArrayList<>();
        containerMetrics.add(mock(ContainerMetrics.class));
        containerMetrics.add(mock(ContainerMetrics.class));
        containerMetrics.add(mock(ContainerMetrics.class));
        podMetrics.setContainers(containerMetrics);
        assertThat(podMetrics.getContainers(), is(equalTo(containerMetrics)));
        assertThat(podMetrics.getContainers(), hasSize(3));
    }

    //BaseRock generated method id: ${testPodMetricsImplementsKubernetesObject}, hash: AEB317C95C186ECA73F0B926AAFABA6D
    @Test
    void testPodMetricsImplementsKubernetesObject() {
        assertThat(podMetrics, is(notNullValue()));
        assertThat(podMetrics instanceof KubernetesObject, is(true));
    }

    //BaseRock generated method id: ${testAllFieldsSetAndGet}, hash: EC0EFB013189C68F11DA33481A10A178
    @Test
    void testAllFieldsSetAndGet() {
        String apiVersion = "v1";
        String kind = "PodMetrics";
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        String timestamp = "2023-05-17T12:00:00Z";
        String window = "15m";
        List<ContainerMetrics> containerMetrics = new ArrayList<>();
        containerMetrics.add(mock(ContainerMetrics.class));
        podMetrics.setApiVersion(apiVersion);
        podMetrics.setKind(kind);
        podMetrics.setMetadata(metadata);
        podMetrics.setTimestamp(timestamp);
        podMetrics.setWindow(window);
        podMetrics.setContainers(containerMetrics);
        assertAll(() -> assertThat(podMetrics.getApiVersion(), is(equalTo(apiVersion))), () -> assertThat(podMetrics.getKind(), is(equalTo(kind))), () -> assertThat(podMetrics.getMetadata(), is(equalTo(metadata))), () -> assertThat(podMetrics.getTimestamp(), is(equalTo(timestamp))), () -> assertThat(podMetrics.getWindow(), is(equalTo(window))), () -> assertThat(podMetrics.getContainers(), is(equalTo(containerMetrics))));
    }
}
