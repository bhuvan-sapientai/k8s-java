package io.kubernetes.client.openapi.models;

import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import java.util.Objects;
import io.kubernetes.client.openapi.models.V1PodStatus;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1PodSpec;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1PodBaseRockGeneratedTest {

    private V1Pod v1Pod;

    @BeforeEach
    void setUp() {
        v1Pod = new V1Pod();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 886FCF9C486670C64687AD1435F27F6E
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1Pod.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1Pod.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: F2F836AE3B0E3D528CF8AF440CDEAE8F
    @Test
    void testKind() {
        String kind = "Pod";
        v1Pod.setKind(kind);
        assertEquals(kind, v1Pod.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 844B774919FA726096C306097B3976BE
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1Pod.setMetadata(metadata);
        assertEquals(metadata, v1Pod.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: 5223356B72047AD5D4A0FBC80DA73E25
    @Test
    void testSpec() {
        V1PodSpec spec = mock(V1PodSpec.class);
        v1Pod.setSpec(spec);
        assertEquals(spec, v1Pod.getSpec());
    }

    //BaseRock generated method id: ${testStatus}, hash: 2EF6B0DEEA6AFBA32556D801D3FF4A0D
    @Test
    void testStatus() {
        V1PodStatus status = mock(V1PodStatus.class);
        v1Pod.setStatus(status);
        assertEquals(status, v1Pod.getStatus());
    }

    //BaseRock generated method id: ${testEquals}, hash: 416A13446597D4AC678F812B73FBD312
    @Disabled()
    @Test
    void testEquals() {
        V1ObjectMeta metadata1 = mock(V1ObjectMeta.class);
        V1PodSpec spec1 = mock(V1PodSpec.class);
        V1PodStatus status1 = mock(V1PodStatus.class);
        V1Pod pod1 = new V1Pod().apiVersion("v1").kind("Pod").metadata(metadata1).spec(spec1).status(status1);
        V1ObjectMeta metadata2 = mock(V1ObjectMeta.class);
        V1PodSpec spec2 = mock(V1PodSpec.class);
        V1PodStatus status2 = mock(V1PodStatus.class);
        V1Pod pod2 = new V1Pod().apiVersion("v1").kind("Pod").metadata(metadata2).spec(spec2).status(status2);
        doReturn(true).when(metadata1).equals(metadata2);
        doReturn(true).when(spec1).equals(spec2);
        doReturn(true).when(status1).equals(status2);
        assertThat(pod1.equals(pod2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: ECB9BB4CA24BD50065789952597E342B
    @Test
    void testHashCode() {
        V1Pod pod = new V1Pod().apiVersion("v1").kind("Pod").metadata(mock(V1ObjectMeta.class)).spec(mock(V1PodSpec.class)).status(mock(V1PodStatus.class));
        int expectedHashCode = Objects.hash(pod.getApiVersion(), pod.getKind(), pod.getMetadata(), pod.getSpec(), pod.getStatus());
        assertEquals(expectedHashCode, pod.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 714D1652D27DDBF364740AE55DF4B136
    @Test
    void testToString() {
        V1Pod pod = new V1Pod().apiVersion("v1").kind("Pod").metadata(mock(V1ObjectMeta.class)).spec(mock(V1PodSpec.class)).status(mock(V1PodStatus.class));
        String result = pod.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("apiVersion"), is(true));
        assertThat(result.contains("kind"), is(true));
        assertThat(result.contains("metadata"), is(true));
        assertThat(result.contains("spec"), is(true));
        assertThat(result.contains("status"), is(true));
    }

    //BaseRock generated method id: ${testFromJson}, hash: C0D1D16FEDC3F09D09A27A9B04444520
    @Test
    void testFromJson() throws Exception {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"Pod\"}";
        V1Pod pod = V1Pod.fromJson(json);
        assertNotNull(pod);
        assertEquals("v1", pod.getApiVersion());
        assertEquals("Pod", pod.getKind());
    }

    //BaseRock generated method id: ${testToJson}, hash: AB1A96B3F246BCDC4FB47770607680CF
    @Test
    void testToJson() {
        V1Pod pod = new V1Pod().apiVersion("v1").kind("Pod");
        String json = pod.toJson();
        assertNotNull(json);
        assertThat(json.contains("\"apiVersion\":\"v1\""), is(true));
        assertThat(json.contains("\"kind\":\"Pod\""), is(true));
    }
}
