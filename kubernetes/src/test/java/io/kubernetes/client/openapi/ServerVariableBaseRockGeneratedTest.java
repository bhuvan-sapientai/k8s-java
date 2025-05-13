package io.kubernetes.client.openapi;

import io.kubernetes.client.openapi.ServerVariable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class ServerVariableBaseRockGeneratedTest {

    //BaseRock generated method id: ${testServerVariableConstruction}, hash: 39918A51DFAA9CDF63C03A89E4A317BE
    @Test
    void testServerVariableConstruction() {
        String description = "Test Description";
        String defaultValue = "Test Default";
        HashSet<String> enumValues = new HashSet<>();
        enumValues.add("Value1");
        enumValues.add("Value2");
        ServerVariable serverVariable = new ServerVariable(description, defaultValue, enumValues);
        assertNotNull(serverVariable);
        assertEquals(description, serverVariable.description);
        assertEquals(defaultValue, serverVariable.defaultValue);
        assertEquals(enumValues, serverVariable.enumValues);
    }

    //BaseRock generated method id: ${testServerVariableWithDifferentDescriptions}, hash: 6D4BE5612B7A3387B9E29B5BE8678EA2
    @ParameterizedTest
    @ValueSource(strings = { "Description1", "Description2", "Long description with spaces" })
    void testServerVariableWithDifferentDescriptions(String description) {
        String defaultValue = "Default";
        HashSet<String> enumValues = new HashSet<>();
        ServerVariable serverVariable = new ServerVariable(description, defaultValue, enumValues);
        assertThat(serverVariable.description, is(equalTo(description)));
    }

    //BaseRock generated method id: ${testServerVariableWithDifferentDefaultValues}, hash: 089907459E52CCF8F36036D1AC13BFC8
    @ParameterizedTest
    @ValueSource(strings = { "Default1", "Default2", "Long default value with spaces" })
    void testServerVariableWithDifferentDefaultValues(String defaultValue) {
        String description = "Description";
        HashSet<String> enumValues = new HashSet<>();
        ServerVariable serverVariable = new ServerVariable(description, defaultValue, enumValues);
        assertThat(serverVariable.defaultValue, is(equalTo(defaultValue)));
    }

    //BaseRock generated method id: ${testServerVariableWithNullEnumValues}, hash: 089A172F488E303B0EDC332EDC2F14D6
    @Test
    void testServerVariableWithNullEnumValues() {
        String description = "Description";
        String defaultValue = "Default";
        ServerVariable serverVariable = new ServerVariable(description, defaultValue, null);
        assertThat(serverVariable.enumValues, is(equalTo(null)));
    }

    //BaseRock generated method id: ${testServerVariableWithEmptyEnumValues}, hash: BD1DD9410325A2251E185E435489E74E
    @Test
    void testServerVariableWithEmptyEnumValues() {
        String description = "Description";
        String defaultValue = "Default";
        HashSet<String> enumValues = new HashSet<>();
        ServerVariable serverVariable = new ServerVariable(description, defaultValue, enumValues);
        assertThat(serverVariable.enumValues, is(notNullValue()));
        assertTrue(serverVariable.enumValues.isEmpty());
    }

    //BaseRock generated method id: ${testServerVariableWithDifferentEnumValues}, hash: F7C0EA59AEAB60FF6000A26F5D60E60E
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Value1", "Value2", "Long enum value with spaces" })
    void testServerVariableWithDifferentEnumValues(String enumValue) {
        String description = "Description";
        String defaultValue = "Default";
        HashSet<String> enumValues = new HashSet<>();
        if (enumValue != null) {
            enumValues.add(enumValue);
        }
        ServerVariable serverVariable = new ServerVariable(description, defaultValue, enumValues);
        if (enumValue == null) {
            assertThat(serverVariable.enumValues, is(notNullValue()));
            assertTrue(serverVariable.enumValues.isEmpty());
        } else {
            assertThat(serverVariable.enumValues, is(notNullValue()));
            assertTrue(serverVariable.enumValues.contains(enumValue));
        }
    }

    //BaseRock generated method id: ${testServerVariableWithMultipleEnumValues}, hash: F41888E3DDEA2F3E10F3E6F2715C164D
    @Test
    void testServerVariableWithMultipleEnumValues() {
        String description = "Description";
        String defaultValue = "Default";
        HashSet<String> enumValues = new HashSet<>();
        enumValues.add("Value1");
        enumValues.add("Value2");
        enumValues.add("Value3");
        ServerVariable serverVariable = new ServerVariable(description, defaultValue, enumValues);
        assertThat(serverVariable.enumValues, is(notNullValue()));
        assertEquals(3, serverVariable.enumValues.size());
        assertTrue(serverVariable.enumValues.containsAll(Set.of("Value1", "Value2", "Value3")));
    }
}
