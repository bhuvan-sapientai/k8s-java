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
class V1beta1ParamKindBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: BC0AD913D445B760B1748CE98EDF15D7
    @Test
    void testConstructor() {
        V1beta1ParamKind paramKind = new V1beta1ParamKind();
        assertNotNull(paramKind);
    }

    //BaseRock generated method id: ${testApiVersionGetterAndSetter}, hash: 0C9DCF2DB04A96097953A9DE4AFC426B
    @Test
    void testApiVersionGetterAndSetter() {
        V1beta1ParamKind paramKind = new V1beta1ParamKind();
        String apiVersion = "v1";
        paramKind.setApiVersion(apiVersion);
        assertEquals(apiVersion, paramKind.getApiVersion());
    }

    //BaseRock generated method id: ${testKindGetterAndSetter}, hash: A85F9E2230AA6F766DF90CA55C6B224C
    @Test
    void testKindGetterAndSetter() {
        V1beta1ParamKind paramKind = new V1beta1ParamKind();
        String kind = "Pod";
        paramKind.setKind(kind);
        assertEquals(kind, paramKind.getKind());
    }

    //BaseRock generated method id: ${testApiVersionWithVariousValues}, hash: E18AEBBDDFDE50FBD45CD087AD78512C
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "v1", "apps/v1", "networking.k8s.io/v1" })
    void testApiVersionWithVariousValues(String apiVersion) {
        V1beta1ParamKind paramKind = new V1beta1ParamKind();
        paramKind.setApiVersion(apiVersion);
        assertEquals(apiVersion, paramKind.getApiVersion());
    }

    //BaseRock generated method id: ${testKindWithVariousValues}, hash: BEE0A02FF74C2D12977C568E1ECBEEB2
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Pod", "Deployment", "Service" })
    void testKindWithVariousValues(String kind) {
        V1beta1ParamKind paramKind = new V1beta1ParamKind();
        paramKind.setKind(kind);
        assertEquals(kind, paramKind.getKind());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: C48CA8F24AA4ED7789F47B19FA0F4E7A
    @Test
    void testEqualsAndHashCode() {
        V1beta1ParamKind paramKind1 = new V1beta1ParamKind().apiVersion("v1").kind("Pod");
        V1beta1ParamKind paramKind2 = new V1beta1ParamKind().apiVersion("v1").kind("Pod");
        V1beta1ParamKind paramKind3 = new V1beta1ParamKind().apiVersion("v2").kind("Deployment");
        assertEquals(paramKind1, paramKind2);
        assertNotEquals(paramKind1, paramKind3);
        assertEquals(paramKind1.hashCode(), paramKind2.hashCode());
        assertNotEquals(paramKind1.hashCode(), paramKind3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: DE1FABAE26D92A4F946B490569EC9DA9
    @Test
    void testToString() {
        V1beta1ParamKind paramKind = new V1beta1ParamKind().apiVersion("v1").kind("Pod");
        String expectedString = "class V1beta1ParamKind {\n    apiVersion: v1\n    kind: Pod\n}";
        assertEquals(expectedString, paramKind.toString());
    }

    //BaseRock generated method id: ${testBuilder}, hash: F2EEF3460804959099F9E199676D49C3
    @Test
    void testBuilder() {
        V1beta1ParamKind paramKind = new V1beta1ParamKind().apiVersion("v1").kind("Pod");
        assertEquals("v1", paramKind.getApiVersion());
        assertEquals("Pod", paramKind.getKind());
    }
}
