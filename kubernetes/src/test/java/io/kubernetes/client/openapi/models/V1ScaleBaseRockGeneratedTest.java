package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1ScaleStatus;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1ScaleSpec;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ScaleBaseRockGeneratedTest {

    private V1Scale v1Scale;

    @BeforeEach
    void setUp() {
        v1Scale = new V1Scale();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: E605D055BA4D3F92E0D5F3E039F699B7
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1Scale.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1Scale.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 8BE6D2CAB29DE07AADB5BC00901FCEE9
    @Test
    void testKind() {
        String kind = "Scale";
        v1Scale.setKind(kind);
        assertEquals(kind, v1Scale.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 545DE3F0A231BC758A9DC8C934DAA1FD
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1Scale.setMetadata(metadata);
        assertEquals(metadata, v1Scale.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: 6648ED239521642B25230F568EF5152F
    @Test
    void testSpec() {
        V1ScaleSpec spec = mock(V1ScaleSpec.class);
        v1Scale.setSpec(spec);
        assertEquals(spec, v1Scale.getSpec());
    }

    //BaseRock generated method id: ${testStatus}, hash: 5642F1770CC627C06D9E0379DCB17B40
    @Test
    void testStatus() {
        V1ScaleStatus status = mock(V1ScaleStatus.class);
        v1Scale.setStatus(status);
        assertEquals(status, v1Scale.getStatus());
    }

    //BaseRock generated method id: ${testEquals}, hash: C0728904E3CBFA06D1B611FC688EE133
    @Test
    void testEquals() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1ScaleSpec spec = mock(V1ScaleSpec.class);
        V1ScaleStatus status = mock(V1ScaleStatus.class);
        V1Scale v1Scale1 = new V1Scale().apiVersion("v1").kind("Scale").metadata(metadata).spec(spec).status(status);
        V1Scale v1Scale2 = new V1Scale().apiVersion("v1").kind("Scale").metadata(metadata).spec(spec).status(status);
        assertThat(v1Scale1.equals(v1Scale2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: C66694E72A015B6D99F86FF3A015C1AA
    @Test
    void testHashCode() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1ScaleSpec spec = mock(V1ScaleSpec.class);
        V1ScaleStatus status = mock(V1ScaleStatus.class);
        V1Scale v1Scale1 = new V1Scale().apiVersion("v1").kind("Scale").metadata(metadata).spec(spec).status(status);
        V1Scale v1Scale2 = new V1Scale().apiVersion("v1").kind("Scale").metadata(metadata).spec(spec).status(status);
        assertEquals(v1Scale1.hashCode(), v1Scale2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 1DD1D6B8C135390DF865FA6344C2CE5F
    @Test
    void testToString() {
        V1Scale v1Scale = new V1Scale().apiVersion("v1").kind("Scale").metadata(mock(V1ObjectMeta.class)).spec(mock(V1ScaleSpec.class)).status(mock(V1ScaleStatus.class));
        String toString = v1Scale.toString();
        assertNotNull(toString);
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("spec"), is(true));
        assertThat(toString.contains("status"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 6350886E585AF9669908B44BE2E7A3E7
    @Test
    void testBuilder() {
        V1Scale v1Scale = new V1Scale().apiVersion("v1").kind("Scale").metadata(mock(V1ObjectMeta.class)).spec(mock(V1ScaleSpec.class)).status(mock(V1ScaleStatus.class));
        assertThat(v1Scale, is(notNullValue()));
        assertThat(v1Scale.getApiVersion(), is(equalTo("v1")));
        assertThat(v1Scale.getKind(), is(equalTo("Scale")));
        assertThat(v1Scale.getMetadata(), is(notNullValue()));
        assertThat(v1Scale.getSpec(), is(notNullValue()));
        assertThat(v1Scale.getStatus(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: F01C4F84BE17FADE33C369FE3CA6B315
    @Test
    void testValidateJsonElement() {
        // This method is not implemented in the source code, so we cannot test it
    }

    //BaseRock generated method id: ${testFromJson}, hash: 18FB0B45EF5098EB7A1FAD8702954CBF
    @Test
    void testFromJson() {
        // This method requires additional context that is not provided in the source code
    }

    //BaseRock generated method id: ${testToJson}, hash: 9A4B48EE9E4AFE1716E9CCE769F3D644
    @Test
    void testToJson() {
        // This method requires additional context that is not provided in the source code
    }
}
