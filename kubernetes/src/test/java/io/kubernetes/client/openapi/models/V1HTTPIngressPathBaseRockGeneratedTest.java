package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import io.kubernetes.client.openapi.models.V1IngressBackend;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1HTTPIngressPathBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 591C4E463BA28F092CC89BCCCAFBC01B
    @Test
    void testConstructor() {
        V1HTTPIngressPath path = new V1HTTPIngressPath();
        assertNotNull(path);
    }

    //BaseRock generated method id: ${testBackend}, hash: E9350532E11BCEA9A32050BAEDA34CEF
    @Test
    void testBackend() {
        V1HTTPIngressPath path = new V1HTTPIngressPath();
        V1IngressBackend backend = mock(V1IngressBackend.class);
        path.setBackend(backend);
        assertEquals(backend, path.getBackend());
    }

    //BaseRock generated method id: ${testPath}, hash: 3D14F70BACE310AAD93DAB949A443806
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "/", "/test", "/api/v1" })
    void testPath(String pathValue) {
        V1HTTPIngressPath path = new V1HTTPIngressPath();
        path.setPath(pathValue);
        assertEquals(pathValue, path.getPath());
    }

    //BaseRock generated method id: ${testPathType}, hash: C47158C7CAFCC80D14E31B79EF628E2F
    @ParameterizedTest
    @ValueSource(strings = { "Exact", "Prefix", "ImplementationSpecific" })
    void testPathType(String pathType) {
        V1HTTPIngressPath path = new V1HTTPIngressPath();
        path.setPathType(pathType);
        assertEquals(pathType, path.getPathType());
    }

    //BaseRock generated method id: ${testEquals}, hash: 82F7E38648DACAB977ECD1A1E49B7702
    @Disabled()
    @Test
    void testEquals() {
        V1IngressBackend mockBackend1 = mock(V1IngressBackend.class);
        V1IngressBackend mockBackend2 = mock(V1IngressBackend.class);
        V1HTTPIngressPath path1 = new V1HTTPIngressPath().backend(mockBackend1).path("/test").pathType("Exact");
        V1HTTPIngressPath path2 = new V1HTTPIngressPath().backend(mockBackend2).path("/test").pathType("Exact");
        V1HTTPIngressPath path3 = new V1HTTPIngressPath().backend(mock(V1IngressBackend.class)).path("/different").pathType("Prefix");
        doReturn(true).when(mockBackend1).equals(any());
        doReturn(true).when(mockBackend2).equals(any());
        assertEquals(path1, path2);
        assertNotEquals(path1, path3);
        assertNotEquals(path1, null);
        assertNotEquals(path1, new Object());
    }

    //BaseRock generated method id: ${testHashCode}, hash: 4A416C197E5991EAEC7BA0C180E62D2F
    @Disabled()
    @Test
    void testHashCode() {
        V1IngressBackend mockBackend1 = mock(V1IngressBackend.class);
        V1IngressBackend mockBackend2 = mock(V1IngressBackend.class);
        V1HTTPIngressPath path1 = new V1HTTPIngressPath().backend(mockBackend1).path("/test").pathType("Exact");
        V1HTTPIngressPath path2 = new V1HTTPIngressPath().backend(mockBackend2).path("/test").pathType("Exact");
        doReturn(42).when(mockBackend1).hashCode();
        doReturn(42).when(mockBackend2).hashCode();
        assertEquals(path1.hashCode(), path2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: EBC48D60EC512D354BAE1A28B03D326B
    @Test
    void testToString() {
        V1HTTPIngressPath path = new V1HTTPIngressPath().backend(mock(V1IngressBackend.class)).path("/test").pathType("Exact");
        String result = path.toString();
        assertTrue(result.contains("backend"));
        assertTrue(result.contains("path"));
        assertTrue(result.contains("pathType"));
    }
}
