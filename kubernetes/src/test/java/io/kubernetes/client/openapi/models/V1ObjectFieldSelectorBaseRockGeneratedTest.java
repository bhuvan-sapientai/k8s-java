package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1ObjectFieldSelector;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ObjectFieldSelectorBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: F2C3CE928BCB64DCEE2FD198880DDCAD
    @Test
    void testConstructor() {
        V1ObjectFieldSelector selector = new V1ObjectFieldSelector();
        assertNotNull(selector);
    }

    //BaseRock generated method id: ${testApiVersionSetter}, hash: A16752AED2B90D8970396C49C0BBD420
    @Test
    void testApiVersionSetter() {
        V1ObjectFieldSelector selector = new V1ObjectFieldSelector();
        selector.setApiVersion("v1");
        assertEquals("v1", selector.getApiVersion());
    }

    //BaseRock generated method id: ${testApiVersionSetterWithDifferentValues}, hash: 8A58259F09A394DD9074B7B5620D9A40
    @ParameterizedTest
    @ValueSource(strings = { "v1", "v2", "beta1" })
    void testApiVersionSetterWithDifferentValues(String version) {
        V1ObjectFieldSelector selector = new V1ObjectFieldSelector();
        selector.setApiVersion(version);
        assertEquals(version, selector.getApiVersion());
    }

    //BaseRock generated method id: ${testApiVersionSetterWithNullAndEmpty}, hash: 9176B913F8F58A31916E0BDA2A5B1070
    @ParameterizedTest
    @NullAndEmptySource
    void testApiVersionSetterWithNullAndEmpty(String version) {
        V1ObjectFieldSelector selector = new V1ObjectFieldSelector();
        selector.setApiVersion(version);
        assertThat(selector.getApiVersion(), is(version));
    }

    //BaseRock generated method id: ${testApiVersionFluent}, hash: 92EAD81AFEA137F15406A1E2F9D773C7
    @Test
    void testApiVersionFluent() {
        V1ObjectFieldSelector selector = new V1ObjectFieldSelector().apiVersion("v1");
        assertEquals("v1", selector.getApiVersion());
    }

    //BaseRock generated method id: ${testFieldPathSetter}, hash: FF3ACDC7B14B49D79E18651110AC7E48
    @Test
    void testFieldPathSetter() {
        V1ObjectFieldSelector selector = new V1ObjectFieldSelector();
        selector.setFieldPath("metadata.name");
        assertEquals("metadata.name", selector.getFieldPath());
    }

    //BaseRock generated method id: ${testFieldPathSetterWithDifferentValues}, hash: BED565E02E9A52A16FDA487FED4D8297
    @ParameterizedTest
    @ValueSource(strings = { "metadata.name", "spec.nodeName", "status.podIP" })
    void testFieldPathSetterWithDifferentValues(String fieldPath) {
        V1ObjectFieldSelector selector = new V1ObjectFieldSelector();
        selector.setFieldPath(fieldPath);
        assertEquals(fieldPath, selector.getFieldPath());
    }

    //BaseRock generated method id: ${testFieldPathFluent}, hash: FB0694D038D5C04E9D0E7976C4C3230C
    @Test
    void testFieldPathFluent() {
        V1ObjectFieldSelector selector = new V1ObjectFieldSelector().fieldPath("metadata.name");
        assertEquals("metadata.name", selector.getFieldPath());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: B1B52E3B80A7C0B3336EB7544CCABE8B
    @Test
    void testEqualsWithSameObject() {
        V1ObjectFieldSelector selector = new V1ObjectFieldSelector().apiVersion("v1").fieldPath("metadata.name");
        assertEquals(selector, selector);
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: FA77991D3887EEFCFAAF99656C841792
    @Test
    void testEqualsWithDifferentObject() {
        V1ObjectFieldSelector selector1 = new V1ObjectFieldSelector().apiVersion("v1").fieldPath("metadata.name");
        V1ObjectFieldSelector selector2 = new V1ObjectFieldSelector().apiVersion("v1").fieldPath("metadata.name");
        assertEquals(selector1, selector2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: B1556AC1DFB4CAE57567A304B8D66CA5
    @Test
    void testHashCode() {
        V1ObjectFieldSelector selector1 = new V1ObjectFieldSelector().apiVersion("v1").fieldPath("metadata.name");
        V1ObjectFieldSelector selector2 = new V1ObjectFieldSelector().apiVersion("v1").fieldPath("metadata.name");
        assertEquals(selector1.hashCode(), selector2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: A8121EBA8575F666393FDF912DC5368B
    @Test
    void testToString() {
        V1ObjectFieldSelector selector = new V1ObjectFieldSelector().apiVersion("v1").fieldPath("metadata.name");
        String expected = "class V1ObjectFieldSelector {\n    apiVersion: v1\n    fieldPath: metadata.name\n}";
        assertEquals(expected, selector.toString());
    }
}
