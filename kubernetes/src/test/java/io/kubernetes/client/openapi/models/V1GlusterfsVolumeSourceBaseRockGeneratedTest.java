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
class V1GlusterfsVolumeSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 4FF6E5CC436F116270E4A018E8205000
    @Test
    void testConstructor() {
        V1GlusterfsVolumeSource source = new V1GlusterfsVolumeSource();
        assertNotNull(source);
    }

    //BaseRock generated method id: ${testEndpointsGetterSetter}, hash: 9C42968493012B61EFEA9C5765AE524E
    @Test
    void testEndpointsGetterSetter() {
        V1GlusterfsVolumeSource source = new V1GlusterfsVolumeSource();
        String endpoints = "test-endpoints";
        source.setEndpoints(endpoints);
        assertEquals(endpoints, source.getEndpoints());
    }

    //BaseRock generated method id: ${testPathGetterSetter}, hash: DE482AA8581A1E0E111EE407ABA1FA10
    @Test
    void testPathGetterSetter() {
        V1GlusterfsVolumeSource source = new V1GlusterfsVolumeSource();
        String path = "/test/path";
        source.setPath(path);
        assertEquals(path, source.getPath());
    }

    //BaseRock generated method id: ${testReadOnlyGetterSetter}, hash: 7FC0D0B7979D5150701C2E2E1F693E45
    @Test
    void testReadOnlyGetterSetter() {
        V1GlusterfsVolumeSource source = new V1GlusterfsVolumeSource();
        source.setReadOnly(true);
        assertTrue(source.getReadOnly());
        source.setReadOnly(false);
        assertFalse(source.getReadOnly());
    }

    //BaseRock generated method id: ${testEndpointsMethod}, hash: C668134F50FA3A9DD53D13F8F31315CE
    @Test
    void testEndpointsMethod() {
        V1GlusterfsVolumeSource source = new V1GlusterfsVolumeSource();
        String endpoints = "test-endpoints";
        V1GlusterfsVolumeSource result = source.endpoints(endpoints);
        assertEquals(endpoints, result.getEndpoints());
        assertSame(source, result);
    }

    //BaseRock generated method id: ${testPathMethod}, hash: E5DCAC61A04FA9D82D1C4623B85A52EE
    @Test
    void testPathMethod() {
        V1GlusterfsVolumeSource source = new V1GlusterfsVolumeSource();
        String path = "/test/path";
        V1GlusterfsVolumeSource result = source.path(path);
        assertEquals(path, result.getPath());
        assertSame(source, result);
    }

    //BaseRock generated method id: ${testReadOnlyMethod}, hash: 300F12AAA4B3ACFA3910377D0D8A3C9F
    @Test
    void testReadOnlyMethod() {
        V1GlusterfsVolumeSource source = new V1GlusterfsVolumeSource();
        V1GlusterfsVolumeSource result = source.readOnly(true);
        assertTrue(result.getReadOnly());
        assertSame(source, result);
    }

    //BaseRock generated method id: ${testEquals}, hash: BD54C4A7E488750C56ADB1230C6DEF7A
    @Test
    void testEquals() {
        V1GlusterfsVolumeSource source1 = new V1GlusterfsVolumeSource().endpoints("test-endpoints").path("/test/path").readOnly(true);
        V1GlusterfsVolumeSource source2 = new V1GlusterfsVolumeSource().endpoints("test-endpoints").path("/test/path").readOnly(true);
        V1GlusterfsVolumeSource source3 = new V1GlusterfsVolumeSource().endpoints("other-endpoints").path("/other/path").readOnly(false);
        assertEquals(source1, source2);
        assertNotEquals(source1, source3);
    }

    //BaseRock generated method id: ${testHashCode}, hash: A08BF147936C685EDC9346661103F3AC
    @Test
    void testHashCode() {
        V1GlusterfsVolumeSource source1 = new V1GlusterfsVolumeSource().endpoints("test-endpoints").path("/test/path").readOnly(true);
        V1GlusterfsVolumeSource source2 = new V1GlusterfsVolumeSource().endpoints("test-endpoints").path("/test/path").readOnly(true);
        V1GlusterfsVolumeSource source3 = new V1GlusterfsVolumeSource().endpoints("other-endpoints").path("/other/path").readOnly(false);
        assertEquals(source1.hashCode(), source2.hashCode());
        assertNotEquals(source1.hashCode(), source3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 7F79444A542C1B9EF3BAD5F0817C6D32
    @Test
    void testToString() {
        V1GlusterfsVolumeSource source = new V1GlusterfsVolumeSource().endpoints("test-endpoints").path("/test/path").readOnly(true);
        String expected = "class V1GlusterfsVolumeSource {\n" + "    endpoints: test-endpoints\n" + "    path: /test/path\n" + "    readOnly: true\n" + "}";
        assertEquals(expected, source.toString());
    }

    //BaseRock generated method id: ${testEndpointsWithVariousValues}, hash: 8ABD01642E52E68B986DAB5167CCC177
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "test-endpoints", "other-endpoints" })
    void testEndpointsWithVariousValues(String endpoints) {
        V1GlusterfsVolumeSource source = new V1GlusterfsVolumeSource();
        source.setEndpoints(endpoints);
        assertEquals(endpoints, source.getEndpoints());
    }

    //BaseRock generated method id: ${testPathWithVariousValues}, hash: 68A0C53CD360D984ADBC9156EF9069FA
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "/test/path", "/other/path" })
    void testPathWithVariousValues(String path) {
        V1GlusterfsVolumeSource source = new V1GlusterfsVolumeSource();
        source.setPath(path);
        assertEquals(path, source.getPath());
    }

    //BaseRock generated method id: ${testReadOnlyDefaultValue}, hash: 31BD1ABF65903558E34A56C9483EE07B
    @Test
    void testReadOnlyDefaultValue() {
        V1GlusterfsVolumeSource source = new V1GlusterfsVolumeSource();
        assertNull(source.getReadOnly());
    }
}
