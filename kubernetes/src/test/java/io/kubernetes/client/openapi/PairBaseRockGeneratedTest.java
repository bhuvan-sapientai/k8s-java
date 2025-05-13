package io.kubernetes.client.openapi;

import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class PairBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructorWithValidStrings}, hash: D1F89034514EF9F4E4E3BCF14065621E
    @Test
    void testConstructorWithValidStrings() {
        Pair pair = new Pair("name", "value");
        assertNotNull(pair);
        assertEquals("name", pair.getName());
        assertEquals("value", pair.getValue());
    }

    //BaseRock generated method id: ${testConstructorWithVariousValidInputs}, hash: 4A04A002297F8EEAC66B1496DFCFD70C
    @ParameterizedTest
    @CsvSource({ "name, value", "key, data", "1, 2", " , notEmpty" })
    void testConstructorWithVariousValidInputs(String name, String value) {
        Pair pair = new Pair(name, value);
        assertThat(pair, is(notNullValue()));
        assertThat(pair.getName(), is(equalTo(name != null ? name.trim() : "")));
        assertThat(pair.getValue(), is(equalTo(value != null ? value : "")));
    }

    //BaseRock generated method id: ${testConstructorWithNullName}, hash: 520CB5168A098CA47D46A5F8913ABE1F
    @ParameterizedTest
    @NullSource
    void testConstructorWithNullName(String nullName) {
        Pair pair = new Pair(nullName, "value");
        assertThat(pair, is(notNullValue()));
        assertThat(pair.getName(), is(equalTo("")));
        assertThat(pair.getValue(), is(equalTo("value")));
    }

    //BaseRock generated method id: ${testConstructorWithNullValue}, hash: F62D4C624D3F3A95FA6EC1B419ACBC43
    @ParameterizedTest
    @NullSource
    void testConstructorWithNullValue(String nullValue) {
        Pair pair = new Pair("name", nullValue);
        assertThat(pair, is(notNullValue()));
        assertThat(pair.getName(), is(equalTo("name")));
        assertThat(pair.getValue(), is(equalTo("")));
    }

    //BaseRock generated method id: ${testConstructorWithBothNullInputs}, hash: FEEBAA0F68A4FEC5CF7E9573DEA11B11
    @Test
    void testConstructorWithBothNullInputs() {
        Pair pair = new Pair(null, null);
        assertThat(pair, is(notNullValue()));
        assertThat(pair.getName(), is(equalTo("")));
        assertThat(pair.getValue(), is(equalTo("")));
    }

    //BaseRock generated method id: ${testGetName}, hash: AC5EF3E1AA24D9CEEEBDED797E29C03F
    @Test
    void testGetName() {
        Pair pair = new Pair("testName", "testValue");
        assertThat(pair.getName(), is(equalTo("testName")));
    }

    //BaseRock generated method id: ${testGetValue}, hash: B5A0F6F3F799B42D3FF897B71CD85A90
    @Test
    void testGetValue() {
        Pair pair = new Pair("testName", "testValue");
        assertThat(pair.getValue(), is(equalTo("testValue")));
    }
}
