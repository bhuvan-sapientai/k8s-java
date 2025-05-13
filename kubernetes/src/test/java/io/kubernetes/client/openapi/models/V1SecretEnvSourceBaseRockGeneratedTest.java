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
class V1SecretEnvSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 1C90ED88B17FCE7084A8630B6AC78960
    @Test
    void testConstructor() {
        V1SecretEnvSource source = new V1SecretEnvSource();
        assertNotNull(source);
    }

    //BaseRock generated method id: ${testNameGetter}, hash: 29361D3C38D697444E0AFD1A4ACD4E35
    @Test
    void testNameGetter() {
        V1SecretEnvSource source = new V1SecretEnvSource();
        assertNull(source.getName());
    }

    //BaseRock generated method id: ${testNameSetter}, hash: AB84196A54B4B99AE368322D08CC984D
    @ParameterizedTest
    @ValueSource(strings = { "test", "another-test" })
    void testNameSetter(String name) {
        V1SecretEnvSource source = new V1SecretEnvSource();
        source.setName(name);
        assertEquals(name, source.getName());
    }

    //BaseRock generated method id: ${testOptionalGetter}, hash: 0985C534D385F2D799F30D6966092476
    @Test
    void testOptionalGetter() {
        V1SecretEnvSource source = new V1SecretEnvSource();
        assertNull(source.getOptional());
    }

    //BaseRock generated method id: ${testOptionalSetter}, hash: 7C38C27CC37A6D674C5D41BB8200BD7A
    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    void testOptionalSetter(boolean optional) {
        V1SecretEnvSource source = new V1SecretEnvSource();
        source.setOptional(optional);
        assertEquals(optional, source.getOptional());
    }

    //BaseRock generated method id: ${testEquals}, hash: 7DA01004BF71459DD3A55EB397A239A0
    @Test
    void testEquals() {
        V1SecretEnvSource source1 = new V1SecretEnvSource().name("test").optional(true);
        V1SecretEnvSource source2 = new V1SecretEnvSource().name("test").optional(true);
        V1SecretEnvSource source3 = new V1SecretEnvSource().name("different").optional(false);
        assertTrue(source1.equals(source2));
        assertTrue(source2.equals(source1));
        assertFalse(source1.equals(source3));
        assertFalse(source1.equals(null));
        assertFalse(source1.equals(new Object()));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 21DAE654E3E283CEE7C9487B08D63162
    @Test
    void testHashCode() {
        V1SecretEnvSource source1 = new V1SecretEnvSource().name("test").optional(true);
        V1SecretEnvSource source2 = new V1SecretEnvSource().name("test").optional(true);
        V1SecretEnvSource source3 = new V1SecretEnvSource().name("different").optional(false);
        assertEquals(source1.hashCode(), source2.hashCode());
        assertNotEquals(source1.hashCode(), source3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 3151FD535843172F2497F64F453A6181
    @Test
    void testToString() {
        V1SecretEnvSource source = new V1SecretEnvSource().name("test").optional(true);
        String result = source.toString();
        assertTrue(result.contains("name: test"));
        assertTrue(result.contains("optional: true"));
    }

    //BaseRock generated method id: ${testNameFluent}, hash: A84687E12008171BD53C16242F91744E
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "test", "another-test" })
    void testNameFluent(String name) {
        V1SecretEnvSource source = new V1SecretEnvSource().name(name);
        assertEquals(name, source.getName());
    }

    //BaseRock generated method id: ${testOptionalFluent}, hash: C332D131602C690280BCD35286656EA0
    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    void testOptionalFluent(boolean optional) {
        V1SecretEnvSource source = new V1SecretEnvSource().optional(optional);
        assertEquals(optional, source.getOptional());
    }
}
