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
class V1beta1AuditAnnotationBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 49758277F0E7924DBBD9C270A760A2D7
    @Test
    void testConstructor() {
        V1beta1AuditAnnotation annotation = new V1beta1AuditAnnotation();
        assertNotNull(annotation);
    }

    //BaseRock generated method id: ${testKeyGetter}, hash: 1B1AB60BAF22223ED30D1045D00C8CA6
    @Test
    void testKeyGetter() {
        V1beta1AuditAnnotation annotation = new V1beta1AuditAnnotation();
        annotation.setKey("testKey");
        assertEquals("testKey", annotation.getKey());
    }

    //BaseRock generated method id: ${testKeySetter}, hash: 2DF3E24FBCE735DECA204C52BA9B909D
    @Test
    void testKeySetter() {
        V1beta1AuditAnnotation annotation = new V1beta1AuditAnnotation();
        annotation.setKey("testKey");
        assertEquals("testKey", annotation.getKey());
    }

    //BaseRock generated method id: ${testValueExpressionGetter}, hash: AE3D83278A93BB3E2B231675545E9AA2
    @Test
    void testValueExpressionGetter() {
        V1beta1AuditAnnotation annotation = new V1beta1AuditAnnotation();
        annotation.setValueExpression("testExpression");
        assertEquals("testExpression", annotation.getValueExpression());
    }

    //BaseRock generated method id: ${testValueExpressionSetter}, hash: 3E84734A112E940245996587F97E7A96
    @Test
    void testValueExpressionSetter() {
        V1beta1AuditAnnotation annotation = new V1beta1AuditAnnotation();
        annotation.setValueExpression("testExpression");
        assertEquals("testExpression", annotation.getValueExpression());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 9A34C71D25F19D21F81E08CEDFAD5998
    @Test
    void testEqualsWithSameObject() {
        V1beta1AuditAnnotation annotation = new V1beta1AuditAnnotation();
        assertTrue(annotation.equals(annotation));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 7DAEB20E1A457F3A8CE65893D3BA507C
    @Test
    void testEqualsWithDifferentClass() {
        V1beta1AuditAnnotation annotation = new V1beta1AuditAnnotation();
        assertFalse(annotation.equals(new Object()));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 04ABC6ADFB94CA1EB101009316184BAF
    @Test
    void testEqualsWithDifferentObject() {
        V1beta1AuditAnnotation annotation1 = new V1beta1AuditAnnotation().key("key1").valueExpression("expr1");
        V1beta1AuditAnnotation annotation2 = new V1beta1AuditAnnotation().key("key2").valueExpression("expr2");
        assertFalse(annotation1.equals(annotation2));
    }

    //BaseRock generated method id: ${testEqualsWithSameValues}, hash: 5EE00F1B0EFA9D0D94E44EE21E72CE26
    @Test
    void testEqualsWithSameValues() {
        V1beta1AuditAnnotation annotation1 = new V1beta1AuditAnnotation().key("key").valueExpression("expr");
        V1beta1AuditAnnotation annotation2 = new V1beta1AuditAnnotation().key("key").valueExpression("expr");
        assertTrue(annotation1.equals(annotation2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 83577366812DB2C5AF68655D2B15B1AF
    @Test
    void testHashCode() {
        V1beta1AuditAnnotation annotation1 = new V1beta1AuditAnnotation().key("key").valueExpression("expr");
        V1beta1AuditAnnotation annotation2 = new V1beta1AuditAnnotation().key("key").valueExpression("expr");
        assertEquals(annotation1.hashCode(), annotation2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 6502BB7B965B2E11BED0EA429F929FFC
    @Test
    void testToString() {
        V1beta1AuditAnnotation annotation = new V1beta1AuditAnnotation().key("testKey").valueExpression("testExpression");
        String expected = "class V1beta1AuditAnnotation {\n    key: testKey\n    valueExpression: testExpression\n}";
        assertEquals(expected, annotation.toString());
    }

    //BaseRock generated method id: ${testKeyWithDifferentValues}, hash: 57D2298560D1DF14316ACF4DF05B13F8
    @ParameterizedTest
    @ValueSource(strings = { "key1", "key2", "key3" })
    void testKeyWithDifferentValues(String key) {
        V1beta1AuditAnnotation annotation = new V1beta1AuditAnnotation().key(key);
        assertEquals(key, annotation.getKey());
    }

    //BaseRock generated method id: ${testValueExpressionWithDifferentValues}, hash: D825F14BC31E2E788AEC72B559BF3A5A
    @ParameterizedTest
    @ValueSource(strings = { "expr1", "expr2", "expr3" })
    void testValueExpressionWithDifferentValues(String expr) {
        V1beta1AuditAnnotation annotation = new V1beta1AuditAnnotation().valueExpression(expr);
        assertEquals(expr, annotation.getValueExpression());
    }

    //BaseRock generated method id: ${testKeyWithNullAndEmptyValues}, hash: 8BB4F47A18BA39E30CEC3492FAF6DFD0
    @ParameterizedTest
    @NullAndEmptySource
    void testKeyWithNullAndEmptyValues(String key) {
        V1beta1AuditAnnotation annotation = new V1beta1AuditAnnotation().key(key);
        assertEquals(key, annotation.getKey());
    }

    //BaseRock generated method id: ${testValueExpressionWithNullAndEmptyValues}, hash: D48393244DEF2E474AFA2F2B655081E7
    @ParameterizedTest
    @NullAndEmptySource
    void testValueExpressionWithNullAndEmptyValues(String expr) {
        V1beta1AuditAnnotation annotation = new V1beta1AuditAnnotation().valueExpression(expr);
        assertEquals(expr, annotation.getValueExpression());
    }
}
