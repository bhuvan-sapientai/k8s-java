package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1CSINodeSpec;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CSINodeBaseRockGeneratedTest {

    private V1CSINode v1CSINode;

    @BeforeEach
    void setUp() {
        v1CSINode = new V1CSINode();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: CC65B07FD6CEF07ACFF0E97D670CD38C
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1CSINode.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1CSINode.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 82F04B0C867F4A925AEBC2238F802508
    @Test
    void testKind() {
        String kind = "CSINode";
        v1CSINode.setKind(kind);
        assertEquals(kind, v1CSINode.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: BE6318066753808C56CAC0ED3CF28F76
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1CSINode.setMetadata(metadata);
        assertEquals(metadata, v1CSINode.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: 92499E181AA97512AB968935F11A2BA1
    @Test
    void testSpec() {
        V1CSINodeSpec spec = mock(V1CSINodeSpec.class);
        v1CSINode.setSpec(spec);
        assertEquals(spec, v1CSINode.getSpec());
    }

    //BaseRock generated method id: ${testEquals}, hash: 563672B7BB9DF9301AFC1D1729F7FC15
    @Test
    void testEquals() {
        V1CSINode other = new V1CSINode();
        String apiVersion = "v1";
        String kind = "CSINode";
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1CSINodeSpec spec = mock(V1CSINodeSpec.class);
        other.setApiVersion(apiVersion);
        other.setKind(kind);
        other.setMetadata(metadata);
        other.setSpec(spec);
        v1CSINode.setApiVersion(apiVersion);
        v1CSINode.setKind(kind);
        v1CSINode.setMetadata(metadata);
        v1CSINode.setSpec(spec);
        assertThat(v1CSINode, is(equalTo(other)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 8648310F613204E86A82FF8C100EEB69
    @Test
    void testHashCode() {
        v1CSINode.setApiVersion("v1");
        v1CSINode.setKind("CSINode");
        v1CSINode.setMetadata(mock(V1ObjectMeta.class));
        v1CSINode.setSpec(mock(V1CSINodeSpec.class));
        int hashCode = v1CSINode.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 3F235614593F67642207D236323F2FB1
    @Test
    void testToString() {
        v1CSINode.setApiVersion("v1");
        v1CSINode.setKind("CSINode");
        v1CSINode.setMetadata(mock(V1ObjectMeta.class));
        v1CSINode.setSpec(mock(V1CSINodeSpec.class));
        String toString = v1CSINode.toString();
        assertNotNull(toString);
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("spec"), is(true));
    }

    //BaseRock generated method id: ${testConstructor}, hash: BEC3ACC0968FA15C4DA7E2EF3E55D03B
    @Test
    void testConstructor() {
        assertNotNull(new V1CSINode());
    }

    //BaseRock generated method id: ${testApiVersionBuilder}, hash: 6EBDF3ED8A01C70802EF7A17B397A6AD
    @Test
    void testApiVersionBuilder() {
        String apiVersion = "v1";
        V1CSINode result = v1CSINode.apiVersion(apiVersion);
        assertEquals(apiVersion, result.getApiVersion());
        assertEquals(v1CSINode, result);
    }

    //BaseRock generated method id: ${testKindBuilder}, hash: 3C8E6E16F51EBA2B9C3DC47271514FED
    @Test
    void testKindBuilder() {
        String kind = "CSINode";
        V1CSINode result = v1CSINode.kind(kind);
        assertEquals(kind, result.getKind());
        assertEquals(v1CSINode, result);
    }

    //BaseRock generated method id: ${testMetadataBuilder}, hash: CA7059406D50772BBEC561992CC318DB
    @Test
    void testMetadataBuilder() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1CSINode result = v1CSINode.metadata(metadata);
        assertEquals(metadata, result.getMetadata());
        assertEquals(v1CSINode, result);
    }

    //BaseRock generated method id: ${testSpecBuilder}, hash: 7B935166C428739458C9812A937ECD40
    @Test
    void testSpecBuilder() {
        V1CSINodeSpec spec = mock(V1CSINodeSpec.class);
        V1CSINode result = v1CSINode.spec(spec);
        assertEquals(spec, result.getSpec());
        assertEquals(v1CSINode, result);
    }
}
