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
class V1ServiceAccountSubjectBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: D634BB3BD5E2A5D7D624A4F2CDE43804
    @Test
    void testConstructor() {
        V1ServiceAccountSubject subject = new V1ServiceAccountSubject();
        assertNotNull(subject);
    }

    //BaseRock generated method id: ${testNameGetter}, hash: E757C5033685C24FA072D1422FB8A81A
    @Test
    void testNameGetter() {
        V1ServiceAccountSubject subject = new V1ServiceAccountSubject();
        subject.setName("test-name");
        assertEquals("test-name", subject.getName());
    }

    //BaseRock generated method id: ${testNameSetter}, hash: 401DFF5046C1F57C89CB54F86B87CE53
    @Test
    void testNameSetter() {
        V1ServiceAccountSubject subject = new V1ServiceAccountSubject();
        subject.setName("test-name");
        assertEquals("test-name", subject.getName());
    }

    //BaseRock generated method id: ${testNameSetterWithVariousInputs}, hash: 9425661F085D77B1DEA2AADA918BFC26
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "name1", "name2", "*" })
    void testNameSetterWithVariousInputs(String name) {
        V1ServiceAccountSubject subject = new V1ServiceAccountSubject();
        subject.setName(name);
        assertEquals(name, subject.getName());
    }

    //BaseRock generated method id: ${testNamespaceGetter}, hash: 888D10428321E8D0A8791D4C3E1F3AFB
    @Test
    void testNamespaceGetter() {
        V1ServiceAccountSubject subject = new V1ServiceAccountSubject();
        subject.setNamespace("test-namespace");
        assertEquals("test-namespace", subject.getNamespace());
    }

    //BaseRock generated method id: ${testNamespaceSetter}, hash: F97DC4F02C0B6B930EC16CCF8CC4BA68
    @Test
    void testNamespaceSetter() {
        V1ServiceAccountSubject subject = new V1ServiceAccountSubject();
        subject.setNamespace("test-namespace");
        assertEquals("test-namespace", subject.getNamespace());
    }

    //BaseRock generated method id: ${testNamespaceSetterWithVariousInputs}, hash: FA2E2F997FCA0FCA686887FDF647CDBB
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "namespace1", "namespace2" })
    void testNamespaceSetterWithVariousInputs(String namespace) {
        V1ServiceAccountSubject subject = new V1ServiceAccountSubject();
        subject.setNamespace(namespace);
        assertEquals(namespace, subject.getNamespace());
    }

    //BaseRock generated method id: ${testEquals}, hash: BB915F98FB29A3D7A191DB1BEF457C3F
    @Test
    void testEquals() {
        V1ServiceAccountSubject subject1 = new V1ServiceAccountSubject().name("name1").namespace("namespace1");
        V1ServiceAccountSubject subject2 = new V1ServiceAccountSubject().name("name1").namespace("namespace1");
        V1ServiceAccountSubject subject3 = new V1ServiceAccountSubject().name("name2").namespace("namespace2");
        assertTrue(subject1.equals(subject2));
        assertFalse(subject1.equals(subject3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 427C6FDEB1886D03158CBAADD5144297
    @Test
    void testHashCode() {
        V1ServiceAccountSubject subject1 = new V1ServiceAccountSubject().name("name1").namespace("namespace1");
        V1ServiceAccountSubject subject2 = new V1ServiceAccountSubject().name("name1").namespace("namespace1");
        V1ServiceAccountSubject subject3 = new V1ServiceAccountSubject().name("name2").namespace("namespace2");
        assertEquals(subject1.hashCode(), subject2.hashCode());
        assertNotEquals(subject1.hashCode(), subject3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 826A282E4AF001A1CD5A51DC85C093DB
    @Test
    void testToString() {
        V1ServiceAccountSubject subject = new V1ServiceAccountSubject().name("test-name").namespace("test-namespace");
        String expected = "class V1ServiceAccountSubject {\n    name: test-name\n    namespace: test-namespace\n}";
        assertEquals(expected, subject.toString());
    }

    //BaseRock generated method id: ${testBuilder}, hash: F3CFD3C4C1F35AEA4062A8852E27963B
    @Test
    void testBuilder() {
        V1ServiceAccountSubject subject = new V1ServiceAccountSubject().name("test-name").namespace("test-namespace");
        assertEquals("test-name", subject.getName());
        assertEquals("test-namespace", subject.getNamespace());
    }
}
