package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1SecretKeySelectorBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: BAC025AA4CF0182276BB35A4B5901FC7
    @Test
    void testConstructor() {
        V1SecretKeySelector selector = new V1SecretKeySelector();
        assertThat(selector, is(notNullValue()));
    }

    //BaseRock generated method id: ${testKey}, hash: E6A67CDBB705091ADCF77629E265A68C
    @Test
    void testKey() {
        V1SecretKeySelector selector = new V1SecretKeySelector();
        String key = "testKey";
        selector.setKey(key);
        assertThat(selector.getKey(), is(equalTo(key)));
    }

    //BaseRock generated method id: ${testKeyWithDifferentValues}, hash: 66D3BFA631676604DF276D5BF38A5E13
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "testKey", "anotherKey" })
    void testKeyWithDifferentValues(String key) {
        V1SecretKeySelector selector = new V1SecretKeySelector();
        selector.setKey(key);
        assertThat(selector.getKey(), is(equalTo(key)));
    }

    //BaseRock generated method id: ${testName}, hash: 3BE91746DD8CEC15E17E23FCEDB2A470
    @Test
    void testName() {
        V1SecretKeySelector selector = new V1SecretKeySelector();
        String name = "testName";
        selector.setName(name);
        assertThat(selector.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testNameWithDifferentValues}, hash: 1F44FBA688122A7034175D65D113949E
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "testName", "anotherName" })
    void testNameWithDifferentValues(String name) {
        V1SecretKeySelector selector = new V1SecretKeySelector();
        selector.setName(name);
        assertThat(selector.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testOptional}, hash: 3E50D8DF1B6FACF42ABF0CFFE8E2F97A
    @Test
    void testOptional() {
        V1SecretKeySelector selector = new V1SecretKeySelector();
        Boolean optional = true;
        selector.setOptional(optional);
        assertThat(selector.getOptional(), is(equalTo(optional)));
    }

    //BaseRock generated method id: ${testOptionalWithDifferentValues}, hash: 69026DBFC71809B789B491E235595B54
    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    void testOptionalWithDifferentValues(Boolean optional) {
        V1SecretKeySelector selector = new V1SecretKeySelector();
        selector.setOptional(optional);
        assertThat(selector.getOptional(), is(equalTo(optional)));
    }

    //BaseRock generated method id: ${testKeyRequiredField}, hash: B7019185DC1BA86441F5512B88D98F6A
    @Disabled()
    @Test
    void testKeyRequiredField() {
        V1SecretKeySelector selector = new V1SecretKeySelector();
        assertThrows(NullPointerException.class, () -> selector.key(null));
    }

    //BaseRock generated method id: ${testEquals}, hash: 9C7DB8F333B4684EF1109FA6D7C266BF
    @Test
    void testEquals() {
        V1SecretKeySelector selector1 = new V1SecretKeySelector().key("key1").name("name1").optional(true);
        V1SecretKeySelector selector2 = new V1SecretKeySelector().key("key1").name("name1").optional(true);
        V1SecretKeySelector selector3 = new V1SecretKeySelector().key("key2").name("name2").optional(false);
        assertThat(selector1.equals(selector2), is(true));
        assertThat(selector1.equals(selector3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 0CAC7A529CE3D80155DAB52684E3B6C4
    @Test
    void testHashCode() {
        V1SecretKeySelector selector1 = new V1SecretKeySelector().key("key1").name("name1").optional(true);
        V1SecretKeySelector selector2 = new V1SecretKeySelector().key("key1").name("name1").optional(true);
        assertThat(selector1.hashCode(), is(equalTo(selector2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: B23FB13DB6EF03FF019EB993FF7FC721
    @Test
    void testToString() {
        V1SecretKeySelector selector = new V1SecretKeySelector().key("testKey").name("testName").optional(true);
        String expected = "class V1SecretKeySelector {\n    key: testKey\n    name: testName\n    optional: true\n}";
        assertThat(selector.toString(), is(equalTo(expected)));
    }
}
