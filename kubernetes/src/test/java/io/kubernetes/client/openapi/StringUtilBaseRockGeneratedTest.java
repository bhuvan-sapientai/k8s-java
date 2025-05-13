package io.kubernetes.client.openapi;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import java.util.Collections;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class StringUtilBaseRockGeneratedTest {

    //BaseRock generated method id: ${testContainsIgnoreCase}, hash: 881BA69CEA9B418E2FDCE229E76B446C
    @ParameterizedTest
    @CsvSource({ "hello,HELLO,true", "world,World,true", "foo,bar,false", "123,123,true", "'','',true" })
    void testContainsIgnoreCase(String value, String arrayElement, boolean expected) {
        String[] array = { arrayElement };
        assertEquals(expected, StringUtil.containsIgnoreCase(array, value));
    }

    //BaseRock generated method id: ${testContainsIgnoreCaseWithMultipleElements}, hash: 4A3FB7140D39C4A2E24B5910C5812FE0
    @Test
    void testContainsIgnoreCaseWithMultipleElements() {
        String[] array = { "hello", "World", "FOO" };
        assertTrue(StringUtil.containsIgnoreCase(array, "Hello"));
        assertTrue(StringUtil.containsIgnoreCase(array, "world"));
        assertTrue(StringUtil.containsIgnoreCase(array, "foo"));
        assertFalse(StringUtil.containsIgnoreCase(array, "bar"));
    }

    //BaseRock generated method id: ${testContainsIgnoreCaseWithEmptyArray}, hash: 1B8D5D81CC38B7B0FADBD0665672F0CE
    @Test
    void testContainsIgnoreCaseWithEmptyArray() {
        String[] emptyArray = {};
        assertFalse(StringUtil.containsIgnoreCase(emptyArray, "test"));
    }

    //BaseRock generated method id: ${testContainsIgnoreCaseWithNullArray}, hash: F2A0F1B09FACA956099ACEFE54637245
    @Disabled()
    @Test
    void testContainsIgnoreCaseWithNullArray() {
        assertFalse(StringUtil.containsIgnoreCase(null, "test"));
    }

    //BaseRock generated method id: ${testContainsIgnoreCaseWithNullValue}, hash: D37A2FE15AB1BF27DF05C244A4AE5BCB
    @Test
    void testContainsIgnoreCaseWithNullValue() {
        String[] array = { "test", null, "hello" };
        assertTrue(StringUtil.containsIgnoreCase(array, null));
    }

    //BaseRock generated method id: ${testJoinArrayWithSeparator}, hash: 13BB9A86F7652F933410A41E5983E876
    @ParameterizedTest
    @ValueSource(strings = { "", " ", "test" })
    void testJoinArrayWithSeparator(String separator) {
        String[] array = { "a", "b", "c" };
        String expected = "a" + separator + "b" + separator + "c";
        assertEquals(expected, StringUtil.join(array, separator));
    }

    //BaseRock generated method id: ${testJoinArrayWithEmptyArray}, hash: DA2B008C685912B07A526FE238F2CF3C
    @Test
    void testJoinArrayWithEmptyArray() {
        String[] emptyArray = {};
        assertEquals("", StringUtil.join(emptyArray, ","));
    }

    //BaseRock generated method id: ${testJoinArrayWithSingleElement}, hash: E8AC23FEFEADCE7D6EDD99D84E73BDAC
    @Test
    void testJoinArrayWithSingleElement() {
        String[] singleElementArray = { "test" };
        assertEquals("test", StringUtil.join(singleElementArray, ","));
    }

    //BaseRock generated method id: ${testJoinCollectionWithSeparator}, hash: C135E33DD0E097AC279438B580D10BB1
    @Disabled()
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { " ", "test" })
    void testJoinCollectionWithSeparator(String separator) {
        List<String> list = Arrays.asList("a", "b", "c");
        String expected = separator == null ? "abc" : "a" + separator + "b" + separator + "c";
        assertEquals(expected, StringUtil.join(list, separator));
    }

    //BaseRock generated method id: ${testJoinCollectionWithEmptyList}, hash: 2780A9F753434359DF085DC697AE1EDA
    @Test
    void testJoinCollectionWithEmptyList() {
        List<String> emptyList = Collections.emptyList();
        assertEquals("", StringUtil.join(emptyList, ","));
    }

    //BaseRock generated method id: ${testJoinCollectionWithSingleElement}, hash: D435EA78D0A080A985893A514FAD5808
    @Test
    void testJoinCollectionWithSingleElement() {
        List<String> singleElementList = Collections.singletonList("test");
        assertEquals("test", StringUtil.join(singleElementList, ","));
    }

    //BaseRock generated method id: ${testClassInstantiation}, hash: 8DEF22E5977BBBE034D10DE6A927A5DF
    @Test
    void testClassInstantiation() {
        assertThat(new StringUtil(), is(notNullValue()));
    }
}
