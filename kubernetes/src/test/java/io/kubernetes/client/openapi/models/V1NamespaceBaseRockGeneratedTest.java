package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1NamespaceSpec;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1NamespaceStatus;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1NamespaceBaseRockGeneratedTest {

    private V1Namespace v1Namespace;

    @BeforeEach
    void setUp() {
        v1Namespace = new V1Namespace();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: A3FDEE6740069F62CED36E7D23B1F2E0
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1Namespace.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1Namespace.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 95386709982585B3585833150D4B13CA
    @Test
    void testKind() {
        String kind = "Namespace";
        v1Namespace.setKind(kind);
        assertEquals(kind, v1Namespace.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 57831072B73D5F85C225BC170FA67962
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1Namespace.setMetadata(metadata);
        assertEquals(metadata, v1Namespace.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: 9BE07D8AB2AC72D91157C9F3958EE275
    @Test
    void testSpec() {
        V1NamespaceSpec spec = mock(V1NamespaceSpec.class);
        v1Namespace.setSpec(spec);
        assertEquals(spec, v1Namespace.getSpec());
    }

    //BaseRock generated method id: ${testStatus}, hash: D144F3E9FCFF3070CAD7F40931C70C11
    @Test
    void testStatus() {
        V1NamespaceStatus status = mock(V1NamespaceStatus.class);
        v1Namespace.setStatus(status);
        assertEquals(status, v1Namespace.getStatus());
    }

    //BaseRock generated method id: ${testEquals}, hash: 8E92698864C90C34CD2D2FC1C0D319CC
    @Disabled()
    @Test
    void testEquals() {
        V1ObjectMeta metadata1 = mock(V1ObjectMeta.class);
        V1NamespaceSpec spec1 = mock(V1NamespaceSpec.class);
        V1NamespaceStatus status1 = mock(V1NamespaceStatus.class);
        V1Namespace namespace1 = new V1Namespace().apiVersion("v1").kind("Namespace").metadata(metadata1).spec(spec1).status(status1);
        V1ObjectMeta metadata2 = mock(V1ObjectMeta.class);
        V1NamespaceSpec spec2 = mock(V1NamespaceSpec.class);
        V1NamespaceStatus status2 = mock(V1NamespaceStatus.class);
        V1Namespace namespace2 = new V1Namespace().apiVersion("v1").kind("Namespace").metadata(metadata2).spec(spec2).status(status2);
        when(metadata1.equals(metadata2)).thenReturn(true);
        when(spec1.equals(spec2)).thenReturn(true);
        when(status1.equals(status2)).thenReturn(true);
        assertThat(namespace1.equals(namespace2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 1CF0AAA0B65F71189BC4D4DAC187E0A8
    @Test
    void testHashCode() {
        V1Namespace namespace = new V1Namespace().apiVersion("v1").kind("Namespace").metadata(mock(V1ObjectMeta.class)).spec(mock(V1NamespaceSpec.class)).status(mock(V1NamespaceStatus.class));
        int hashCode = namespace.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: D01B12707F90FCFC4F8DDA319957AA77
    @Test
    void testToString() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        when(metadata.toString()).thenReturn("metadata");
        V1NamespaceSpec spec = mock(V1NamespaceSpec.class);
        when(spec.toString()).thenReturn("spec");
        V1NamespaceStatus status = mock(V1NamespaceStatus.class);
        when(status.toString()).thenReturn("status");
        V1Namespace namespace = new V1Namespace().apiVersion("v1").kind("Namespace").metadata(metadata).spec(spec).status(status);
        String expected = "class V1Namespace {\n    apiVersion: v1\n    kind: Namespace\n    metadata: metadata\n    spec: spec\n    status: status\n}";
        assertThat(namespace.toString(), is(equalTo(expected)));
    }

    //BaseRock generated method id: ${testBuilder}, hash: F3E901272FF495ED601E8E1C2C8927B1
    @Test
    void testBuilder() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1NamespaceSpec spec = mock(V1NamespaceSpec.class);
        V1NamespaceStatus status = mock(V1NamespaceStatus.class);
        V1Namespace namespace = new V1Namespace().apiVersion("v1").kind("Namespace").metadata(metadata).spec(spec).status(status);
        assertThat(namespace.getApiVersion(), is(equalTo("v1")));
        assertThat(namespace.getKind(), is(equalTo("Namespace")));
        assertThat(namespace.getMetadata(), is(equalTo(metadata)));
        assertThat(namespace.getSpec(), is(equalTo(spec)));
        assertThat(namespace.getStatus(), is(equalTo(status)));
    }

    //BaseRock generated method id: ${testNullValues}, hash: 3B71828F98B3A0E7BA7202CA972D3BAA
    @Test
    void testNullValues() {
        V1Namespace namespace = new V1Namespace();
        assertNull(namespace.getApiVersion());
        assertNull(namespace.getKind());
        assertNull(namespace.getMetadata());
        assertNull(namespace.getSpec());
        assertNull(namespace.getStatus());
    }
}
