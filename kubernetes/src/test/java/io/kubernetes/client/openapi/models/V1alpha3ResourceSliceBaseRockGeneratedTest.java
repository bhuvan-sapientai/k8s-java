package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1alpha3ResourceSliceSpec;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha3ResourceSliceBaseRockGeneratedTest {

    private V1alpha3ResourceSlice resourceSlice;

    @BeforeEach
    void setUp() {
        resourceSlice = new V1alpha3ResourceSlice();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 3F32C7FA0B6FBD213BBD2C2C34EA2D64
    @Test
    void testApiVersion() {
        String apiVersion = "v1alpha3";
        resourceSlice.setApiVersion(apiVersion);
        assertEquals(apiVersion, resourceSlice.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 1E3ECEB42F67075A99641BA5139ACDCB
    @Test
    void testKind() {
        String kind = "ResourceSlice";
        resourceSlice.setKind(kind);
        assertEquals(kind, resourceSlice.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 859486CB0B6B84016B5A379AF0358C94
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        resourceSlice.setMetadata(metadata);
        assertEquals(metadata, resourceSlice.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: 93046B60D3A1F5C8A6ED875BE6D0D7AE
    @Test
    void testSpec() {
        V1alpha3ResourceSliceSpec spec = mock(V1alpha3ResourceSliceSpec.class);
        resourceSlice.setSpec(spec);
        assertEquals(spec, resourceSlice.getSpec());
    }

    //BaseRock generated method id: ${testEquals}, hash: 56DEFDBF0D3159A8156A4F12516B67CE
    @Test
    void testEquals() {
        V1alpha3ResourceSlice otherResourceSlice = new V1alpha3ResourceSlice();
        String apiVersion = "v1alpha3";
        String kind = "ResourceSlice";
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1alpha3ResourceSliceSpec spec = mock(V1alpha3ResourceSliceSpec.class);
        resourceSlice.setApiVersion(apiVersion);
        resourceSlice.setKind(kind);
        resourceSlice.setMetadata(metadata);
        resourceSlice.setSpec(spec);
        otherResourceSlice.setApiVersion(apiVersion);
        otherResourceSlice.setKind(kind);
        otherResourceSlice.setMetadata(metadata);
        otherResourceSlice.setSpec(spec);
        assertThat(resourceSlice, is(equalTo(otherResourceSlice)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 5BFF1B6278249AB126C90F9A04F3A89C
    @Test
    void testHashCode() {
        V1alpha3ResourceSlice otherResourceSlice = new V1alpha3ResourceSlice();
        String apiVersion = "v1alpha3";
        String kind = "ResourceSlice";
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1alpha3ResourceSliceSpec spec = mock(V1alpha3ResourceSliceSpec.class);
        resourceSlice.setApiVersion(apiVersion);
        resourceSlice.setKind(kind);
        resourceSlice.setMetadata(metadata);
        resourceSlice.setSpec(spec);
        otherResourceSlice.setApiVersion(apiVersion);
        otherResourceSlice.setKind(kind);
        otherResourceSlice.setMetadata(metadata);
        otherResourceSlice.setSpec(spec);
        assertEquals(resourceSlice.hashCode(), otherResourceSlice.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 912878C8AB743E58E32FBF36889DD738
    @Test
    void testToString() {
        String apiVersion = "v1alpha3";
        String kind = "ResourceSlice";
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1alpha3ResourceSliceSpec spec = mock(V1alpha3ResourceSliceSpec.class);
        when(metadata.toString()).thenReturn("MockMetadata");
        when(spec.toString()).thenReturn("MockSpec");
        resourceSlice.setApiVersion(apiVersion);
        resourceSlice.setKind(kind);
        resourceSlice.setMetadata(metadata);
        resourceSlice.setSpec(spec);
        String expectedString = "class V1alpha3ResourceSlice {\n" + "    apiVersion: v1alpha3\n" + "    kind: ResourceSlice\n" + "    metadata: MockMetadata\n" + "    spec: MockSpec\n" + "}";
        assertEquals(expectedString, resourceSlice.toString());
    }

    //BaseRock generated method id: ${testConstructor}, hash: D7E99008BF8EC90CCBE5858E0750E978
    @Test
    void testConstructor() {
        assertNotNull(new V1alpha3ResourceSlice());
    }

    //BaseRock generated method id: ${testApiVersionBuilder}, hash: 321CD7D02B0A06B210F9B82EC0DC1717
    @Test
    void testApiVersionBuilder() {
        String apiVersion = "v1alpha3";
        V1alpha3ResourceSlice builtResourceSlice = new V1alpha3ResourceSlice().apiVersion(apiVersion);
        assertEquals(apiVersion, builtResourceSlice.getApiVersion());
    }

    //BaseRock generated method id: ${testKindBuilder}, hash: B0D3803AC700083710F7D5E881A37C86
    @Test
    void testKindBuilder() {
        String kind = "ResourceSlice";
        V1alpha3ResourceSlice builtResourceSlice = new V1alpha3ResourceSlice().kind(kind);
        assertEquals(kind, builtResourceSlice.getKind());
    }

    //BaseRock generated method id: ${testMetadataBuilder}, hash: AC00A9A8494328B27DE087F462A43C95
    @Test
    void testMetadataBuilder() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1alpha3ResourceSlice builtResourceSlice = new V1alpha3ResourceSlice().metadata(metadata);
        assertEquals(metadata, builtResourceSlice.getMetadata());
    }

    //BaseRock generated method id: ${testSpecBuilder}, hash: D525EEC5C215E59ED6DEB2C0BE74A610
    @Test
    void testSpecBuilder() {
        V1alpha3ResourceSliceSpec spec = mock(V1alpha3ResourceSliceSpec.class);
        V1alpha3ResourceSlice builtResourceSlice = new V1alpha3ResourceSlice().spec(spec);
        assertEquals(spec, builtResourceSlice.getSpec());
    }

    //BaseRock generated method id: ${testImplementsKubernetesObject}, hash: 22508CB69BC377DCFF733B67ED05B33C
    @Test
    void testImplementsKubernetesObject() {
        assertThat(resourceSlice, is(notNullValue()));
        assertThat(resourceSlice instanceof io.kubernetes.client.common.KubernetesObject, is(true));
    }
}
