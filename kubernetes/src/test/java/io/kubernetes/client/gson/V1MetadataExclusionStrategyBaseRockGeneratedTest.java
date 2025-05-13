package io.kubernetes.client.gson;

import org.junit.jupiter.api.BeforeEach;
import com.google.gson.FieldAttributes;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1MetadataExclusionStrategyBaseRockGeneratedTest {

    private V1MetadataExclusionStrategy strategy;

    @BeforeEach
    void setUp() {
        strategy = new V1MetadataExclusionStrategy();
    }

    //BaseRock generated method id: ${shouldSkipField_whenFieldIsManagedFieldsInV1ObjectMeta_returnsTrue}, hash: 135D5530D3806BF4B710B1DFFA084FA9
    @Test
    void shouldSkipField_whenFieldIsManagedFieldsInV1ObjectMeta_returnsTrue() {
        FieldAttributes fieldAttributes = mock(FieldAttributes.class);
        when(fieldAttributes.getDeclaringClass()).thenReturn((Class) V1ObjectMeta.class);
        when(fieldAttributes.getName()).thenReturn("managedFields");
        boolean result = strategy.shouldSkipField(fieldAttributes);
        assertTrue(result);
    }

    //BaseRock generated method id: ${shouldSkipField_whenFieldIsNotManagedFieldsInV1ObjectMeta_returnsFalse}, hash: CAE581205D818A10068CBC9F7680D69E
    @ParameterizedTest
    @ValueSource(strings = { "name", "namespace", "labels", "annotations" })
    void shouldSkipField_whenFieldIsNotManagedFieldsInV1ObjectMeta_returnsFalse(String fieldName) {
        FieldAttributes fieldAttributes = mock(FieldAttributes.class);
        when(fieldAttributes.getDeclaringClass()).thenReturn((Class) V1ObjectMeta.class);
        when(fieldAttributes.getName()).thenReturn(fieldName);
        boolean result = strategy.shouldSkipField(fieldAttributes);
        assertFalse(result);
    }

    //BaseRock generated method id: ${shouldSkipField_whenDeclaringClassIsNotV1ObjectMeta_returnsFalse}, hash: 03C34261BD8637F652AC0855B230896E
    @Test
    void shouldSkipField_whenDeclaringClassIsNotV1ObjectMeta_returnsFalse() {
        FieldAttributes fieldAttributes = mock(FieldAttributes.class);
        when(fieldAttributes.getDeclaringClass()).thenReturn((Class) String.class);
        when(fieldAttributes.getName()).thenReturn("managedFields");
        boolean result = strategy.shouldSkipField(fieldAttributes);
        assertFalse(result);
    }

    //BaseRock generated method id: ${shouldSkipClass_alwaysReturnsFalse}, hash: FE596F33EFD079B919F9B264C4B58A8D
    @Test
    void shouldSkipClass_alwaysReturnsFalse() {
        boolean result = strategy.shouldSkipClass(String.class);
        assertFalse(result);
    }

    //BaseRock generated method id: ${shouldSkipClass_withNullClass_returnsFalse}, hash: 56EACFAFF7471C21E99F264F7EF64F76
    @Test
    void shouldSkipClass_withNullClass_returnsFalse() {
        boolean result = strategy.shouldSkipClass(null);
        assertFalse(result);
    }

    //BaseRock generated method id: ${testConstructor}, hash: 2EAE58BEC89FE6621015B03827F89AC0
    @Test
    void testConstructor() {
        V1MetadataExclusionStrategy instance = new V1MetadataExclusionStrategy();
        assertNotNull(instance);
    }
}
