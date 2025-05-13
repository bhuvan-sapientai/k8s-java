package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import io.kubernetes.client.openapi.models.V1beta1ResourceSliceSpec;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1ResourceSliceBaseRockGeneratedTest {

    private V1beta1ResourceSlice resourceSlice;

    @BeforeEach
    void setUp() {
        resourceSlice = new V1beta1ResourceSlice();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: FF38258B2E34CF345473AFF1E525D39D
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1beta1";
        resourceSlice.setApiVersion(apiVersion);
        assertEquals(apiVersion, resourceSlice.getApiVersion());
    }

    //BaseRock generated method id: ${testGetKind}, hash: 02592722B2B8282F555DEF589E27AB02
    @Test
    void testGetKind() {
        String kind = "ResourceSlice";
        resourceSlice.setKind(kind);
        assertEquals(kind, resourceSlice.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 588E97C5D9117F83E337D35870D8C78F
    @Test
    void testGetMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        resourceSlice.setMetadata(metadata);
        assertEquals(metadata, resourceSlice.getMetadata());
    }

    //BaseRock generated method id: ${testGetSpec}, hash: F9AFF5415216961B85FF491BD4C38C28
    @Test
    void testGetSpec() {
        V1beta1ResourceSliceSpec spec = mock(V1beta1ResourceSliceSpec.class);
        resourceSlice.setSpec(spec);
        assertEquals(spec, resourceSlice.getSpec());
    }

    //BaseRock generated method id: ${testEquals}, hash: A726A9E06D3DE0A44AAD5AF8EDD470A6
    @Test
    void testEquals() {
        V1beta1ResourceSlice other = new V1beta1ResourceSlice();
        String apiVersion = "v1beta1";
        resourceSlice.setApiVersion(apiVersion);
        other.setApiVersion(apiVersion);
        String kind = "ResourceSlice";
        resourceSlice.setKind(kind);
        other.setKind(kind);
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        resourceSlice.setMetadata(metadata);
        other.setMetadata(metadata);
        V1beta1ResourceSliceSpec spec = mock(V1beta1ResourceSliceSpec.class);
        resourceSlice.setSpec(spec);
        other.setSpec(spec);
        assertThat(resourceSlice.equals(other), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 59F30FC51033CBA31CA0AF11C3BF7D68
    @Test
    void testHashCode() {
        String apiVersion = "v1beta1";
        resourceSlice.setApiVersion(apiVersion);
        String kind = "ResourceSlice";
        resourceSlice.setKind(kind);
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        resourceSlice.setMetadata(metadata);
        V1beta1ResourceSliceSpec spec = mock(V1beta1ResourceSliceSpec.class);
        resourceSlice.setSpec(spec);
        assertThat(resourceSlice.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: F844DF9F88B0A4F5530AC69FE8F85685
    @Test
    void testToString() {
        String apiVersion = "v1beta1";
        resourceSlice.setApiVersion(apiVersion);
        String kind = "ResourceSlice";
        resourceSlice.setKind(kind);
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        when(metadata.toString()).thenReturn("MetadataString");
        resourceSlice.setMetadata(metadata);
        V1beta1ResourceSliceSpec spec = mock(V1beta1ResourceSliceSpec.class);
        when(spec.toString()).thenReturn("SpecString");
        resourceSlice.setSpec(spec);
        String expectedString = "class V1beta1ResourceSlice {\n" + "    apiVersion: v1beta1\n" + "    kind: ResourceSlice\n" + "    metadata: MetadataString\n" + "    spec: SpecString\n" + "}";
        assertEquals(expectedString, resourceSlice.toString());
    }
}
