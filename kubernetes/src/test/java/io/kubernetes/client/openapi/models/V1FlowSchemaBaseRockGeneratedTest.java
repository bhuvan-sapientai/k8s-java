package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.V1FlowSchema;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1FlowSchemaSpec;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1FlowSchemaStatus;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1FlowSchemaBaseRockGeneratedTest {

    private V1FlowSchema flowSchema;

    @BeforeEach
    void setUp() {
        flowSchema = new V1FlowSchema();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 69427970CD791FB5F3529864C846C9CF
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        flowSchema.apiVersion(apiVersion);
        assertEquals(apiVersion, flowSchema.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 452AB8E58A0CCE95479C0730C1E721EE
    @Test
    void testKind() {
        String kind = "FlowSchema";
        flowSchema.kind(kind);
        assertEquals(kind, flowSchema.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: AAEB875142A7959000C7ED3178F4DA51
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        flowSchema.metadata(metadata);
        assertEquals(metadata, flowSchema.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: E4F6E8609DB771712C021A3EC3C156D1
    @Test
    void testSpec() {
        V1FlowSchemaSpec spec = mock(V1FlowSchemaSpec.class);
        flowSchema.spec(spec);
        assertEquals(spec, flowSchema.getSpec());
    }

    //BaseRock generated method id: ${testStatus}, hash: E53E4202A078A97BA5B66DD1D69D14B7
    @Test
    void testStatus() {
        V1FlowSchemaStatus status = mock(V1FlowSchemaStatus.class);
        flowSchema.status(status);
        assertEquals(status, flowSchema.getStatus());
    }

    //BaseRock generated method id: ${testEquals}, hash: 5FF12F83CC7112B618F3CDF4BEF4D6D3
    @Disabled()
    @Test
    void testEquals() {
        V1ObjectMeta metadata1 = mock(V1ObjectMeta.class);
        V1FlowSchemaSpec spec1 = mock(V1FlowSchemaSpec.class);
        V1FlowSchemaStatus status1 = mock(V1FlowSchemaStatus.class);
        V1FlowSchema flowSchema1 = new V1FlowSchema().apiVersion("v1").kind("FlowSchema").metadata(metadata1).spec(spec1).status(status1);
        V1ObjectMeta metadata2 = mock(V1ObjectMeta.class);
        V1FlowSchemaSpec spec2 = mock(V1FlowSchemaSpec.class);
        V1FlowSchemaStatus status2 = mock(V1FlowSchemaStatus.class);
        V1FlowSchema flowSchema2 = new V1FlowSchema().apiVersion("v1").kind("FlowSchema").metadata(metadata2).spec(spec2).status(status2);
        when(metadata1.equals(metadata2)).thenReturn(true);
        when(spec1.equals(spec2)).thenReturn(true);
        when(status1.equals(status2)).thenReturn(true);
        assertEquals(flowSchema1, flowSchema2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: C260DDD20F2F178F3A2353F4AF18192E
    @Disabled()
    @Test
    void testHashCode() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1FlowSchemaSpec spec = mock(V1FlowSchemaSpec.class);
        V1FlowSchemaStatus status = mock(V1FlowSchemaStatus.class);
        when(metadata.hashCode()).thenReturn(1);
        when(spec.hashCode()).thenReturn(2);
        when(status.hashCode()).thenReturn(3);
        V1FlowSchema flowSchema1 = new V1FlowSchema().apiVersion("v1").kind("FlowSchema").metadata(metadata).spec(spec).status(status);
        V1FlowSchema flowSchema2 = new V1FlowSchema().apiVersion("v1").kind("FlowSchema").metadata(metadata).spec(spec).status(status);
        assertEquals(flowSchema1.hashCode(), flowSchema2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 42078AA086AF7CD62B163973F0025A36
    @Test
    void testToString() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        when(metadata.toString()).thenReturn("metadata");
        V1FlowSchemaSpec spec = mock(V1FlowSchemaSpec.class);
        when(spec.toString()).thenReturn("spec");
        V1FlowSchemaStatus status = mock(V1FlowSchemaStatus.class);
        when(status.toString()).thenReturn("status");
        V1FlowSchema flowSchema = new V1FlowSchema().apiVersion("v1").kind("FlowSchema").metadata(metadata).spec(spec).status(status);
        String expected = "class V1FlowSchema {\n" + "    apiVersion: v1\n" + "    kind: FlowSchema\n" + "    metadata: metadata\n" + "    spec: spec\n" + "    status: status\n" + "}";
        assertEquals(expected, flowSchema.toString());
    }

    //BaseRock generated method id: ${testConstructor}, hash: 7F5F0936C936417B5D7687DD3112107E
    @Test
    void testConstructor() {
        assertNotNull(new V1FlowSchema());
    }
}
