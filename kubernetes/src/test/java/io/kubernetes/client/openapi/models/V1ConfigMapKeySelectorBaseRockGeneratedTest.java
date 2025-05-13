package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ConfigMapKeySelector;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ConfigMapKeySelectorBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: E59E8B94914864DBFA7201B45285F079
    @Test
    void testConstructor() {
        V1ConfigMapKeySelector selector = new V1ConfigMapKeySelector();
        assertThat(selector, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetKey}, hash: 5222B4446C43A207C2FC1538A3460494
    @Test
    void testSetAndGetKey() {
        V1ConfigMapKeySelector selector = new V1ConfigMapKeySelector();
        selector.setKey("testKey");
        assertThat(selector.getKey(), is(equalTo("testKey")));
    }

    //BaseRock generated method id: ${testSetAndGetKeyWithDifferentValues}, hash: C62B4C60173519012D20A7F96D32C2A2
    @ParameterizedTest
    @ValueSource(strings = { "key1", "key2", "key3" })
    void testSetAndGetKeyWithDifferentValues(String key) {
        V1ConfigMapKeySelector selector = new V1ConfigMapKeySelector();
        selector.setKey(key);
        assertThat(selector.getKey(), is(equalTo(key)));
    }

    //BaseRock generated method id: ${testSetAndGetName}, hash: E235763E9612FD66A4BC30D9BA9A5630
    @Test
    void testSetAndGetName() {
        V1ConfigMapKeySelector selector = new V1ConfigMapKeySelector();
        selector.setName("testName");
        assertThat(selector.getName(), is(equalTo("testName")));
    }

    //BaseRock generated method id: ${testSetAndGetNameWithDifferentValues}, hash: DEBB80E29D4AB96651FCD8F83BCCB2BA
    @ParameterizedTest
    @ValueSource(strings = { "name1", "name2", "name3" })
    void testSetAndGetNameWithDifferentValues(String name) {
        V1ConfigMapKeySelector selector = new V1ConfigMapKeySelector();
        selector.setName(name);
        assertThat(selector.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testSetAndGetOptional}, hash: 02C2E09680E35648DE7EE440833EE19E
    @Test
    void testSetAndGetOptional() {
        V1ConfigMapKeySelector selector = new V1ConfigMapKeySelector();
        selector.setOptional(true);
        assertThat(selector.getOptional(), is(equalTo(true)));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 003B464BFA309EDA5D1A114646BA419C
    @Test
    void testEqualsWithSameObject() {
        V1ConfigMapKeySelector selector = new V1ConfigMapKeySelector().key("testKey").name("testName").optional(true);
        assertThat(selector.equals(selector), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: D25190EFA8C077F1C81BE702FF73C5AC
    @Test
    void testEqualsWithDifferentObject() {
        V1ConfigMapKeySelector selector1 = new V1ConfigMapKeySelector().key("testKey").name("testName").optional(true);
        V1ConfigMapKeySelector selector2 = new V1ConfigMapKeySelector().key("testKey").name("testName").optional(true);
        assertThat(selector1.equals(selector2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: F9BB49AF354E5A7B5878C8C05E9B57FD
    @Test
    void testHashCode() {
        V1ConfigMapKeySelector selector1 = new V1ConfigMapKeySelector().key("testKey").name("testName").optional(true);
        V1ConfigMapKeySelector selector2 = new V1ConfigMapKeySelector().key("testKey").name("testName").optional(true);
        assertThat(selector1.hashCode(), is(equalTo(selector2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: AC64BB05F29ADE03280E10E6C63B124E
    @Test
    void testToString() {
        V1ConfigMapKeySelector selector = new V1ConfigMapKeySelector().key("testKey").name("testName").optional(true);
        String expected = "class V1ConfigMapKeySelector {\n    key: testKey\n    name: testName\n    optional: true\n}";
        assertThat(selector.toString(), is(equalTo(expected)));
    }

    //BaseRock generated method id: ${testSetKeyWithInvalidInput}, hash: 90BBC5359D0F28C8D1DA2B4A787D34C1
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "  ", "\t", "\n" })
    void testSetKeyWithInvalidInput(String key) {
        V1ConfigMapKeySelector selector = new V1ConfigMapKeySelector();
        selector.setKey(key);
        assertThat(selector.getKey(), is(equalTo(key)));
    }

    //BaseRock generated method id: ${testSetOptionalWithNull}, hash: 8E1CC440582DBD656AA5C4DD092FF2B9
    @Test
    void testSetOptionalWithNull() {
        V1ConfigMapKeySelector selector = new V1ConfigMapKeySelector();
        selector.setOptional(null);
        assertThat(selector.getOptional(), is(equalTo(null)));
    }
}
