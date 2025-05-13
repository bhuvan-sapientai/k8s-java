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
class V1alpha1ParamKindBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 78921B5C523751E6E400FB63E35691C1
    @Test
    void testConstructor() {
        V1alpha1ParamKind paramKind = new V1alpha1ParamKind();
        assertNotNull(paramKind);
    }

    //BaseRock generated method id: ${testApiVersionGetter}, hash: 7505405B4D2D653462986613F1C9EB60
    @Test
    void testApiVersionGetter() {
        V1alpha1ParamKind paramKind = new V1alpha1ParamKind();
        assertNull(paramKind.getApiVersion());
    }

    //BaseRock generated method id: ${testApiVersionSetter}, hash: F7A98989B5BD9A08261D569ED0B94B49
    @Test
    void testApiVersionSetter() {
        V1alpha1ParamKind paramKind = new V1alpha1ParamKind();
        String apiVersion = "v1";
        paramKind.setApiVersion(apiVersion);
        assertEquals(apiVersion, paramKind.getApiVersion());
    }

    //BaseRock generated method id: ${testApiVersionSetterWithVariousValues}, hash: CB5506219045D4186B4F6EAD27EBE451
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "v1", "v2", "beta1" })
    void testApiVersionSetterWithVariousValues(String apiVersion) {
        V1alpha1ParamKind paramKind = new V1alpha1ParamKind();
        paramKind.setApiVersion(apiVersion);
        assertEquals(apiVersion, paramKind.getApiVersion());
    }

    //BaseRock generated method id: ${testKindGetter}, hash: F6720C875E98D61664CC390F9F0FE696
    @Test
    void testKindGetter() {
        V1alpha1ParamKind paramKind = new V1alpha1ParamKind();
        assertNull(paramKind.getKind());
    }

    //BaseRock generated method id: ${testKindSetter}, hash: 9202775D1351F1F8345DBD1C0E979E54
    @Test
    void testKindSetter() {
        V1alpha1ParamKind paramKind = new V1alpha1ParamKind();
        String kind = "ConfigMap";
        paramKind.setKind(kind);
        assertEquals(kind, paramKind.getKind());
    }

    //BaseRock generated method id: ${testKindSetterWithVariousValues}, hash: 4FF111A29516FCE20B0C9A4770BA9444
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "ConfigMap", "Secret", "Pod" })
    void testKindSetterWithVariousValues(String kind) {
        V1alpha1ParamKind paramKind = new V1alpha1ParamKind();
        paramKind.setKind(kind);
        assertEquals(kind, paramKind.getKind());
    }

    //BaseRock generated method id: ${testEquals}, hash: BB30427DC1CE3D30D4D35D84BB57BA20
    @Test
    void testEquals() {
        V1alpha1ParamKind paramKind1 = new V1alpha1ParamKind().apiVersion("v1").kind("ConfigMap");
        V1alpha1ParamKind paramKind2 = new V1alpha1ParamKind().apiVersion("v1").kind("ConfigMap");
        V1alpha1ParamKind paramKind3 = new V1alpha1ParamKind().apiVersion("v2").kind("Secret");
        assertEquals(paramKind1, paramKind2);
        assertNotEquals(paramKind1, paramKind3);
        assertNotEquals(paramKind2, paramKind3);
    }

    //BaseRock generated method id: ${testHashCode}, hash: BE5FB400A6B29D45CC4A67C593B66B85
    @Test
    void testHashCode() {
        V1alpha1ParamKind paramKind1 = new V1alpha1ParamKind().apiVersion("v1").kind("ConfigMap");
        V1alpha1ParamKind paramKind2 = new V1alpha1ParamKind().apiVersion("v1").kind("ConfigMap");
        V1alpha1ParamKind paramKind3 = new V1alpha1ParamKind().apiVersion("v2").kind("Secret");
        assertEquals(paramKind1.hashCode(), paramKind2.hashCode());
        assertNotEquals(paramKind1.hashCode(), paramKind3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 56DC7A23C2CAEC07EE618A2F3A4AF023
    @Test
    void testToString() {
        V1alpha1ParamKind paramKind = new V1alpha1ParamKind().apiVersion("v1").kind("ConfigMap");
        String expectedString = "class V1alpha1ParamKind {\n    apiVersion: v1\n    kind: ConfigMap\n}";
        assertEquals(expectedString, paramKind.toString());
    }

    //BaseRock generated method id: ${testApiVersionFluentSetter}, hash: 275E2922370329DFE4F270EC14DBB41E
    @Test
    void testApiVersionFluentSetter() {
        V1alpha1ParamKind paramKind = new V1alpha1ParamKind();
        V1alpha1ParamKind result = paramKind.apiVersion("v1");
        assertSame(paramKind, result);
        assertEquals("v1", paramKind.getApiVersion());
    }

    //BaseRock generated method id: ${testKindFluentSetter}, hash: 05539B7CFA9E27FADB14C0DCCD38619D
    @Test
    void testKindFluentSetter() {
        V1alpha1ParamKind paramKind = new V1alpha1ParamKind();
        V1alpha1ParamKind result = paramKind.kind("ConfigMap");
        assertSame(paramKind, result);
        assertEquals("ConfigMap", paramKind.getKind());
    }
}
