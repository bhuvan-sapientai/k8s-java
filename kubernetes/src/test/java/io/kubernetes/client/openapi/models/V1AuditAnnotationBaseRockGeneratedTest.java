package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import io.kubernetes.client.openapi.models.V1AuditAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1AuditAnnotationBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 5D79DE8E5D266FFBFF410DAE392FE706
    @Test
    void testConstructor() {
        V1AuditAnnotation annotation = new V1AuditAnnotation();
        assertThat(annotation, is(notNullValue()));
    }

    //BaseRock generated method id: ${testGetterAndSetterForKey}, hash: AF7B0A55EDE970CF985AB290A89D4852
    @Test
    void testGetterAndSetterForKey() {
        V1AuditAnnotation annotation = new V1AuditAnnotation();
        String key = "testKey";
        annotation.setKey(key);
        assertThat(annotation.getKey(), is(equalTo(key)));
    }

    //BaseRock generated method id: ${testGetterAndSetterForValueExpression}, hash: 4795D5C910DCE5D8ED4EDFA2314FD442
    @Test
    void testGetterAndSetterForValueExpression() {
        V1AuditAnnotation annotation = new V1AuditAnnotation();
        String valueExpression = "testValueExpression";
        annotation.setValueExpression(valueExpression);
        assertThat(annotation.getValueExpression(), is(equalTo(valueExpression)));
    }

    //BaseRock generated method id: ${testKeyMethod}, hash: 09ED8BB7AFD4B6C4728D941BC1114EFE
    @Test
    void testKeyMethod() {
        V1AuditAnnotation annotation = new V1AuditAnnotation();
        String key = "testKey";
        V1AuditAnnotation result = annotation.key(key);
        assertThat(result, is(equalTo(annotation)));
        assertThat(annotation.getKey(), is(equalTo(key)));
    }

    //BaseRock generated method id: ${testValueExpressionMethod}, hash: 3193DD027126AF277380EE25E822A0A1
    @Test
    void testValueExpressionMethod() {
        V1AuditAnnotation annotation = new V1AuditAnnotation();
        String valueExpression = "testValueExpression";
        V1AuditAnnotation result = annotation.valueExpression(valueExpression);
        assertThat(result, is(equalTo(annotation)));
        assertThat(annotation.getValueExpression(), is(equalTo(valueExpression)));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: EC609E5F0814431C315CFE103511867C
    @Test
    void testEqualsWithSameObject() {
        V1AuditAnnotation annotation = new V1AuditAnnotation().key("key").valueExpression("value");
        assertThat(annotation.equals(annotation), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: C2C19B0899BD52C98720334BEFF553B0
    @Test
    void testEqualsWithDifferentClass() {
        V1AuditAnnotation annotation = new V1AuditAnnotation().key("key").valueExpression("value");
        assertThat(annotation.equals("not an annotation"), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObjects}, hash: D9FCBD559BA5B004BBE0783D5DBB5EF4
    @Test
    void testEqualsWithDifferentObjects() {
        V1AuditAnnotation annotation1 = new V1AuditAnnotation().key("key1").valueExpression("value1");
        V1AuditAnnotation annotation2 = new V1AuditAnnotation().key("key2").valueExpression("value2");
        assertThat(annotation1.equals(annotation2), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithNullObject}, hash: 1FA1E6138C532B2C2A159F5DE5A656EA
    @Test
    void testEqualsWithNullObject() {
        V1AuditAnnotation annotation = new V1AuditAnnotation().key("key").valueExpression("value");
        assertThat(annotation.equals(null), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 904A251DD4B9AD90A80C9002CE9E42C8
    @Test
    void testHashCode() {
        V1AuditAnnotation annotation1 = new V1AuditAnnotation().key("key").valueExpression("value");
        V1AuditAnnotation annotation2 = new V1AuditAnnotation().key("key").valueExpression("value");
        assertThat(annotation1.hashCode(), is(equalTo(annotation2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: C226E5E69B4AB5C4962248145704679F
    @Test
    void testToString() {
        V1AuditAnnotation annotation = new V1AuditAnnotation().key("testKey").valueExpression("testValue");
        String expected = "class V1AuditAnnotation {\n    key: testKey\n    valueExpression: testValue\n}";
        assertThat(annotation.toString(), is(equalTo(expected)));
    }

    //BaseRock generated method id: ${testSetKeyWithVariousInputs}, hash: 16FEAEB879A203BCC2241C2DD2C94D45
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "validKey", "another_valid_key", "valid-key-123" })
    void testSetKeyWithVariousInputs(String key) {
        V1AuditAnnotation annotation = new V1AuditAnnotation();
        annotation.setKey(key);
        assertThat(annotation.getKey(), is(equalTo(key)));
    }

    //BaseRock generated method id: ${testSetValueExpressionWithVariousInputs}, hash: 2C533BD52FC231519CE0811F724B77E1
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "validExpression", "another_valid_expression", "valid-expression-123" })
    void testSetValueExpressionWithVariousInputs(String valueExpression) {
        V1AuditAnnotation annotation = new V1AuditAnnotation();
        annotation.setValueExpression(valueExpression);
        assertThat(annotation.getValueExpression(), is(equalTo(valueExpression)));
    }

    //BaseRock generated method id: ${testEqualsWithEqualObjects}, hash: A8E2D15D1BD77E58CA229274CF6B6658
    @Test
    void testEqualsWithEqualObjects() {
        V1AuditAnnotation annotation1 = new V1AuditAnnotation().key("key").valueExpression("value");
        V1AuditAnnotation annotation2 = new V1AuditAnnotation().key("key").valueExpression("value");
        assertThat(annotation1.equals(annotation2), is(true));
    }

    //BaseRock generated method id: ${testHashCodeConsistency}, hash: 1B1310826B9907E01FAD7204DAA113E2
    @Test
    void testHashCodeConsistency() {
        V1AuditAnnotation annotation = new V1AuditAnnotation().key("key").valueExpression("value");
        int initialHashCode = annotation.hashCode();
        assertThat(annotation.hashCode(), is(equalTo(initialHashCode)));
        annotation.setKey("newKey");
        assertThat(annotation.hashCode(), is(not(equalTo(initialHashCode))));
    }

    //BaseRock generated method id: ${testToStringWithNullValues}, hash: F431607C4DE2553841E2FB03B2885092
    @Test
    void testToStringWithNullValues() {
        V1AuditAnnotation annotation = new V1AuditAnnotation();
        String expected = "class V1AuditAnnotation {\n    key: null\n    valueExpression: null\n}";
        assertThat(annotation.toString(), is(equalTo(expected)));
    }
}
