package io.kubernetes.client.openapi.models;

import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import java.util.stream.Stream;
import io.kubernetes.client.openapi.ApiException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.Arguments;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class AbstractOpenApiSchemaBaseRockGeneratedTest {

    private TestAbstractOpenApiSchema schema;

    @BeforeEach
    void setUp() {
        schema = new TestAbstractOpenApiSchema("testType", true);
    }

    //BaseRock generated method id: ${testConstructor}, hash: E93D25ED9EA478FC14F27513B9691714
    @Test
    void testConstructor() {
        assertNotNull(schema);
        assertEquals("testType", schema.getSchemaType());
        assertTrue(schema.isNullable());
    }

    //BaseRock generated method id: ${testGetSchemas}, hash: 77CB59820373DBBFB6D8A30F5C2DB4DA
    @Test
    void testGetSchemas() {
        Map<String, Class<?>> schemas = schema.getSchemas();
        assertNotNull(schemas);
        assertTrue(schemas.isEmpty());
    }

    //BaseRock generated method id: ${testGetAndSetActualInstance}, hash: A66365AA873B67EE332D577728CB7C1E
    @Test
    void testGetAndSetActualInstance() {
        Object testInstance = new Object();
        schema.setActualInstance(testInstance);
        assertEquals(testInstance, schema.getActualInstance());
    }

    //BaseRock generated method id: ${testGetActualInstanceRecursively}, hash: 43586157A247E19BE972ED77BAD2A0F3
    @Test
    void testGetActualInstanceRecursively() {
        Object testInstance = new Object();
        schema.setActualInstance(testInstance);
        assertEquals(testInstance, schema.getActualInstanceRecursively());
    }

    //BaseRock generated method id: ${testGetActualInstanceRecursivelyWithNullInstance}, hash: CA06E8228F6C347E68000C7E94248CAF
    @Test
    void testGetActualInstanceRecursivelyWithNullInstance() {
        assertNull(schema.getActualInstanceRecursively());
    }

    //BaseRock generated method id: ${testGetActualInstanceRecursivelyWithNestedSchema}, hash: 381FF7D6E2C71E64EB1293E2206F55C2
    @Test
    void testGetActualInstanceRecursivelyWithNestedSchema() {
        TestAbstractOpenApiSchema nestedSchema = new TestAbstractOpenApiSchema("nestedType", false);
        Object testInstance = new Object();
        nestedSchema.setActualInstance(testInstance);
        schema.setActualInstance(nestedSchema);
        assertEquals(testInstance, schema.getActualInstanceRecursively());
    }

    //BaseRock generated method id: ${testToString}, hash: CAA84D5E713B7ADCF10969E4C200DC76
    @Disabled()
    @Test
    void testToString() {
        String result = schema.toString();
        assertThat(result, startsWith("class io.kubernetes.client.openapi.models.AbstractOpenApiSchemaBaseRockGeneratedTest$TestAbstractOpenApiSchema {"));
        assertThat(result, containsString("instance: null"));
        assertThat(result, containsString("isNullable: true"));
        assertThat(result, containsString("schemaType: testType"));
    }

    //BaseRock generated method id: ${testEquals}, hash: 85E736C1BEA49879C1C9BF545A6CF5DF
    @Test
    void testEquals() {
        TestAbstractOpenApiSchema schema1 = new TestAbstractOpenApiSchema("type", true);
        TestAbstractOpenApiSchema schema2 = new TestAbstractOpenApiSchema("type", true);
        TestAbstractOpenApiSchema schema3 = new TestAbstractOpenApiSchema("differentType", false);
        assertEquals(schema1, schema2);
        assertNotEquals(schema1, schema3);
        assertNotEquals(schema1, null);
        assertNotEquals(schema1, new Object());
    }

    //BaseRock generated method id: ${testHashCode}, hash: EFAE869A02ACB8D902226EC8F8B472AB
    @Test
    void testHashCode() {
        TestAbstractOpenApiSchema schema1 = new TestAbstractOpenApiSchema("type", true);
        TestAbstractOpenApiSchema schema2 = new TestAbstractOpenApiSchema("type", true);
        TestAbstractOpenApiSchema schema3 = new TestAbstractOpenApiSchema("differentType", false);
        assertEquals(schema1.hashCode(), schema2.hashCode());
        assertNotEquals(schema1.hashCode(), schema3.hashCode());
    }

    //BaseRock generated method id: ${testIsNullable}, hash: CA9327B3BABB3FFFE6160927F75DFAC9
    @ParameterizedTest
    @MethodSource("provideIsNullableTestCases")
    void testIsNullable(Boolean isNullable, boolean expected) {
        TestAbstractOpenApiSchema testSchema = new TestAbstractOpenApiSchema("testType", isNullable);
        assertEquals(expected, testSchema.isNullable());
    }

    private static Stream<Arguments> provideIsNullableTestCases() {
        return Stream.of(Arguments.of(true, true), Arguments.of(false, false), Arguments.of(null, false));
    }

    private static class TestAbstractOpenApiSchema extends AbstractOpenApiSchema {

        public TestAbstractOpenApiSchema(String schemaType, Boolean isNullable) {
            super(schemaType, isNullable);
        }

        @Override
        public Map<String, Class<?>> getSchemas() {
            return new HashMap<>();
        }
    }
}
