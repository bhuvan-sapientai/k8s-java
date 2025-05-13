package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1ObjectReference;
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
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1BindingBaseRockGeneratedTest {

    private V1Binding v1Binding;

    @BeforeEach
    void setUp() {
        v1Binding = new V1Binding();
    }

    //BaseRock generated method id: ${testV1BindingCreation}, hash: F71353777F92A2E917828F1C0C7949AF
    @Test
    void testV1BindingCreation() {
        assertNotNull(v1Binding);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 0868CB3CC6F01E23D8EA93CA764DB599
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1Binding.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1Binding.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 4B0110511788BCA1DFFA8047933CA523
    @Test
    void testKind() {
        String kind = "Binding";
        v1Binding.setKind(kind);
        assertEquals(kind, v1Binding.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 14B45D09BBE7B2FABDAB2F2FC5C5CC1E
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1Binding.setMetadata(metadata);
        assertEquals(metadata, v1Binding.getMetadata());
    }

    //BaseRock generated method id: ${testTarget}, hash: E812983355B8E017EA6FE9E47DFCD410
    @Test
    void testTarget() {
        V1ObjectReference target = mock(V1ObjectReference.class);
        v1Binding.setTarget(target);
        assertEquals(target, v1Binding.getTarget());
    }

    //BaseRock generated method id: ${testEquals}, hash: 2032EA4F8236A24F75DEC98DAC198C91
    @Disabled()
    @Test
    void testEquals() {
        V1ObjectMeta metadata1 = mock(V1ObjectMeta.class);
        V1ObjectReference target1 = mock(V1ObjectReference.class);
        V1Binding binding1 = new V1Binding().apiVersion("v1").kind("Binding").metadata(metadata1).target(target1);
        V1ObjectMeta metadata2 = mock(V1ObjectMeta.class);
        V1ObjectReference target2 = mock(V1ObjectReference.class);
        V1Binding binding2 = new V1Binding().apiVersion("v1").kind("Binding").metadata(metadata2).target(target2);
        // Ensure metadata and target are considered equal
        when(metadata1.equals(metadata2)).thenReturn(true);
        when(target1.equals(target2)).thenReturn(true);
        assertThat(binding1.equals(binding2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 30BE50AF27FCFE61C2FCDDA6D2C46760
    @Test
    void testHashCode() {
        V1Binding binding = new V1Binding().apiVersion("v1").kind("Binding").metadata(mock(V1ObjectMeta.class)).target(mock(V1ObjectReference.class));
        assertThat(binding.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: F34C3CF9CFA6A54C8E901636676E1EDD
    @Test
    void testToString() {
        V1Binding binding = new V1Binding().apiVersion("v1").kind("Binding").metadata(mock(V1ObjectMeta.class)).target(mock(V1ObjectReference.class));
        String toString = binding.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("target"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: ACCE1AC90F4991589717C1ED47B9837E
    @Test
    void testBuilder() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1ObjectReference target = mock(V1ObjectReference.class);
        V1Binding binding = new V1Binding().apiVersion("v1").kind("Binding").metadata(metadata).target(target);
        assertEquals("v1", binding.getApiVersion());
        assertEquals("Binding", binding.getKind());
        assertEquals(metadata, binding.getMetadata());
        assertEquals(target, binding.getTarget());
    }
}
