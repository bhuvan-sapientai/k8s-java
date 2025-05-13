package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1IngressClassParametersReferenceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 4A00C1959BFEA1780027C5F80B7F3461
    @Test
    void testConstructor() {
        V1IngressClassParametersReference reference = new V1IngressClassParametersReference();
        assertNotNull(reference);
    }

    //BaseRock generated method id: ${testApiGroup}, hash: CDD4CEDBCCB28811ABC5020AAE79418C
    @Test
    void testApiGroup() {
        V1IngressClassParametersReference reference = new V1IngressClassParametersReference();
        String apiGroup = "test-api-group";
        reference.setApiGroup(apiGroup);
        assertEquals(apiGroup, reference.getApiGroup());
    }

    //BaseRock generated method id: ${testApiGroupWithVariousValues}, hash: A6DAA0E88D21715BE802C0E33F33E0F1
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "test-api-group", "another-api-group" })
    void testApiGroupWithVariousValues(String apiGroup) {
        V1IngressClassParametersReference reference = new V1IngressClassParametersReference();
        reference.setApiGroup(apiGroup);
        assertEquals(apiGroup, reference.getApiGroup());
    }

    //BaseRock generated method id: ${testKind}, hash: 56B3C338AE9E69440EFD6A7D25A3B793
    @Test
    void testKind() {
        V1IngressClassParametersReference reference = new V1IngressClassParametersReference();
        String kind = "test-kind";
        reference.setKind(kind);
        assertEquals(kind, reference.getKind());
    }

    //BaseRock generated method id: ${testKindWithVariousValues}, hash: 68B5FE294B61B85B64444EA07D06F12F
    @ParameterizedTest
    @ValueSource(strings = { "test-kind", "another-kind" })
    void testKindWithVariousValues(String kind) {
        V1IngressClassParametersReference reference = new V1IngressClassParametersReference();
        reference.setKind(kind);
        assertEquals(kind, reference.getKind());
    }

    //BaseRock generated method id: ${testName}, hash: 88C5EA19E788BED105A6024B544F83FB
    @Test
    void testName() {
        V1IngressClassParametersReference reference = new V1IngressClassParametersReference();
        String name = "test-name";
        reference.setName(name);
        assertEquals(name, reference.getName());
    }

    //BaseRock generated method id: ${testNameWithVariousValues}, hash: 27DAC351577C9B9F01B27FFC8E11EBA6
    @ParameterizedTest
    @ValueSource(strings = { "test-name", "another-name" })
    void testNameWithVariousValues(String name) {
        V1IngressClassParametersReference reference = new V1IngressClassParametersReference();
        reference.setName(name);
        assertEquals(name, reference.getName());
    }

    //BaseRock generated method id: ${testNamespace}, hash: 9EF5D18CA6B96729076E7610594160AD
    @Test
    void testNamespace() {
        V1IngressClassParametersReference reference = new V1IngressClassParametersReference();
        String namespace = "test-namespace";
        reference.setNamespace(namespace);
        assertEquals(namespace, reference.getNamespace());
    }

    //BaseRock generated method id: ${testNamespaceWithVariousValues}, hash: DAA37C18ED4CC3717B589767CCA1F994
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "test-namespace", "another-namespace" })
    void testNamespaceWithVariousValues(String namespace) {
        V1IngressClassParametersReference reference = new V1IngressClassParametersReference();
        reference.setNamespace(namespace);
        assertEquals(namespace, reference.getNamespace());
    }

    //BaseRock generated method id: ${testScope}, hash: 15AEA35670C445609D3DAE73A55FC49F
    @Test
    void testScope() {
        V1IngressClassParametersReference reference = new V1IngressClassParametersReference();
        String scope = "test-scope";
        reference.setScope(scope);
        assertEquals(scope, reference.getScope());
    }

    //BaseRock generated method id: ${testScopeWithVariousValues}, hash: 6C1C4CB480F0F200EF8D78FE6501F2AC
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Cluster", "Namespace" })
    void testScopeWithVariousValues(String scope) {
        V1IngressClassParametersReference reference = new V1IngressClassParametersReference();
        reference.setScope(scope);
        assertEquals(scope, reference.getScope());
    }

    //BaseRock generated method id: ${testEquals}, hash: 5BF7B0E416A6686A7B550F0CB8080394
    @Test
    void testEquals() {
        V1IngressClassParametersReference reference1 = new V1IngressClassParametersReference().apiGroup("test-api-group").kind("test-kind").name("test-name").namespace("test-namespace").scope("Cluster");
        V1IngressClassParametersReference reference2 = new V1IngressClassParametersReference().apiGroup("test-api-group").kind("test-kind").name("test-name").namespace("test-namespace").scope("Cluster");
        assertEquals(reference1, reference2);
    }

    //BaseRock generated method id: ${testNotEquals}, hash: E862C22F032D9CA2E3D2A75B7473C9D3
    @Test
    void testNotEquals() {
        V1IngressClassParametersReference reference1 = new V1IngressClassParametersReference().apiGroup("test-api-group").kind("test-kind").name("test-name").namespace("test-namespace").scope("Cluster");
        V1IngressClassParametersReference reference2 = new V1IngressClassParametersReference().apiGroup("different-api-group").kind("test-kind").name("test-name").namespace("test-namespace").scope("Cluster");
        assertNotEquals(reference1, reference2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: DFAB641E76CA92F3D2C161E56958E238
    @Test
    void testHashCode() {
        V1IngressClassParametersReference reference1 = new V1IngressClassParametersReference().apiGroup("test-api-group").kind("test-kind").name("test-name").namespace("test-namespace").scope("Cluster");
        V1IngressClassParametersReference reference2 = new V1IngressClassParametersReference().apiGroup("test-api-group").kind("test-kind").name("test-name").namespace("test-namespace").scope("Cluster");
        assertEquals(reference1.hashCode(), reference2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 050B04BC4A729F524FF4386485CDD91D
    @Test
    void testToString() {
        V1IngressClassParametersReference reference = new V1IngressClassParametersReference().apiGroup("test-api-group").kind("test-kind").name("test-name").namespace("test-namespace").scope("Cluster");
        String expectedString = "class V1IngressClassParametersReference {\n" + "    apiGroup: test-api-group\n" + "    kind: test-kind\n" + "    name: test-name\n" + "    namespace: test-namespace\n" + "    scope: Cluster\n" + "}";
        assertEquals(expectedString, reference.toString());
    }
}
