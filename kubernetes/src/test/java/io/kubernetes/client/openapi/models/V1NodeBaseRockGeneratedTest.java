package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1NodeStatus;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1NodeSpec;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1NodeBaseRockGeneratedTest {

    private V1Node v1Node;

    @BeforeEach
    void setUp() {
        v1Node = new V1Node();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 05CFA071E31B7864F2C8008E304F1323
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1Node.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1Node.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: A14B04A3018DA2480623DFE35393D2DD
    @Test
    void testKind() {
        String kind = "Node";
        v1Node.setKind(kind);
        assertEquals(kind, v1Node.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 23591F78892F8686415E041C6B19B4FB
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1Node.setMetadata(metadata);
        assertEquals(metadata, v1Node.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: EDA8FBC17EBEDED3595F227352652C19
    @Test
    void testSpec() {
        V1NodeSpec spec = mock(V1NodeSpec.class);
        v1Node.setSpec(spec);
        assertEquals(spec, v1Node.getSpec());
    }

    //BaseRock generated method id: ${testStatus}, hash: 5318D4F873E9DF2E4531D495EE342DD5
    @Test
    void testStatus() {
        V1NodeStatus status = mock(V1NodeStatus.class);
        v1Node.setStatus(status);
        assertEquals(status, v1Node.getStatus());
    }

    //BaseRock generated method id: ${testEquals}, hash: 46993AFCA58F91537E9E059007FF3AC4
    @Test
    void testEquals() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1NodeSpec spec = mock(V1NodeSpec.class);
        V1NodeStatus status = mock(V1NodeStatus.class);
        V1Node node1 = new V1Node().apiVersion("v1").kind("Node").metadata(metadata).spec(spec).status(status);
        V1Node node2 = new V1Node().apiVersion("v1").kind("Node").metadata(metadata).spec(spec).status(status);
        assertThat(node1, is(equalTo(node2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: C07C09929DC9E9CE059E82859D81BB26
    @Test
    void testHashCode() {
        V1Node node = new V1Node().apiVersion("v1").kind("Node").metadata(mock(V1ObjectMeta.class)).spec(mock(V1NodeSpec.class)).status(mock(V1NodeStatus.class));
        assertThat(node.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: ABF87E257131E798B3CB26E5A92B689D
    @Test
    void testToString() {
        V1Node node = new V1Node().apiVersion("v1").kind("Node").metadata(mock(V1ObjectMeta.class)).spec(mock(V1NodeSpec.class)).status(mock(V1NodeStatus.class));
        String toString = node.toString();
        assertNotNull(toString);
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("spec"), is(true));
        assertThat(toString.contains("status"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 0183408F4D899CD2519B5A4C26657F3B
    @Test
    void testBuilder() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1NodeSpec spec = mock(V1NodeSpec.class);
        V1NodeStatus status = mock(V1NodeStatus.class);
        V1Node node = new V1Node().apiVersion("v1").kind("Node").metadata(metadata).spec(spec).status(status);
        assertThat(node.getApiVersion(), is("v1"));
        assertThat(node.getKind(), is("Node"));
        assertThat(node.getMetadata(), is(metadata));
        assertThat(node.getSpec(), is(spec));
        assertThat(node.getStatus(), is(status));
    }
}
