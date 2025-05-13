package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.kubernetes.client.openapi.models.V1beta1DeviceAttribute;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1DeviceAttributeBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: A10F01F9351666C0FFECEC80386403BB
    @Test
    void testConstructor() {
        V1beta1DeviceAttribute attribute = new V1beta1DeviceAttribute();
        assertNotNull(attribute);
    }

    //BaseRock generated method id: ${testBoolAttribute}, hash: 02C6C0422CAD8A18FEA68EF1A59BF3B5
    @Test
    void testBoolAttribute() {
        V1beta1DeviceAttribute attribute = new V1beta1DeviceAttribute().bool(true);
        assertTrue(attribute.getBool());
        attribute.setBool(false);
        assertFalse(attribute.getBool());
    }

    //BaseRock generated method id: ${testIntAttribute}, hash: 6551FF49C8D0E145241D9BC7EE8DDF98
    @Test
    void testIntAttribute() {
        Long testValue = 123L;
        V1beta1DeviceAttribute attribute = new V1beta1DeviceAttribute()._int(testValue);
        assertEquals(testValue, attribute.getInt());
        Long newValue = 456L;
        attribute.setInt(newValue);
        assertEquals(newValue, attribute.getInt());
    }

    //BaseRock generated method id: ${testStringAttribute}, hash: 938C740B8CB32056198610F25E8C4CD8
    @Test
    void testStringAttribute() {
        String testValue = "test";
        V1beta1DeviceAttribute attribute = new V1beta1DeviceAttribute().string(testValue);
        assertEquals(testValue, attribute.getString());
        String newValue = "newTest";
        attribute.setString(newValue);
        assertEquals(newValue, attribute.getString());
    }

    //BaseRock generated method id: ${testVersionAttribute}, hash: 8DB768CEC6FF402AA2DB10323F73FB2F
    @Test
    void testVersionAttribute() {
        String testValue = "1.0.0";
        V1beta1DeviceAttribute attribute = new V1beta1DeviceAttribute().version(testValue);
        assertEquals(testValue, attribute.getVersion());
        String newValue = "2.0.0";
        attribute.setVersion(newValue);
        assertEquals(newValue, attribute.getVersion());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 142241A5D5E9A3F4471F2504362809B9
    @Test
    void testEqualsAndHashCode() {
        V1beta1DeviceAttribute attribute1 = new V1beta1DeviceAttribute().bool(true)._int(123L).string("test").version("1.0.0");
        V1beta1DeviceAttribute attribute2 = new V1beta1DeviceAttribute().bool(true)._int(123L).string("test").version("1.0.0");
        V1beta1DeviceAttribute attribute3 = new V1beta1DeviceAttribute().bool(false)._int(456L).string("different").version("2.0.0");
        assertTrue(attribute1.equals(attribute2) && attribute2.equals(attribute1));
        assertEquals(attribute1.hashCode(), attribute2.hashCode());
        assertFalse(attribute1.equals(attribute3) || attribute3.equals(attribute1));
        assertFalse(attribute1.hashCode() == attribute3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: D9E14540711EB44D9B9E4D23257A3117
    @Test
    void testToString() {
        V1beta1DeviceAttribute attribute = new V1beta1DeviceAttribute().bool(true)._int(123L).string("test").version("1.0.0");
        String expected = "class V1beta1DeviceAttribute {\n    bool: true\n    _int: 123\n    string: test\n    version: 1.0.0\n}";
        assertEquals(expected, attribute.toString());
    }

    //BaseRock generated method id: ${testBoolAttributeWithDifferentValues}, hash: AADDCEEC1097FBF81D1E7AD857DB32DA
    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    void testBoolAttributeWithDifferentValues(boolean testValue) {
        V1beta1DeviceAttribute attribute = new V1beta1DeviceAttribute().bool(testValue);
        assertEquals(testValue, attribute.getBool());
    }

    //BaseRock generated method id: ${testIntAttributeWithDifferentValues}, hash: 15E1FCF2555643977945F8BD3414226F
    @ParameterizedTest
    @ValueSource(longs = { Long.MIN_VALUE, -1L, 0L, 1L, Long.MAX_VALUE })
    void testIntAttributeWithDifferentValues(long testValue) {
        V1beta1DeviceAttribute attribute = new V1beta1DeviceAttribute()._int(testValue);
        assertEquals(testValue, attribute.getInt());
    }

    //BaseRock generated method id: ${testStringAttributeWithDifferentValues}, hash: F718D0FFE5A7ADC433EB054D1AB8E23E
    @ParameterizedTest
    @ValueSource(strings = { "", "short", "exactly-64-characters-long-string-used-for-testing-purposes-only!" })
    void testStringAttributeWithDifferentValues(String testValue) {
        V1beta1DeviceAttribute attribute = new V1beta1DeviceAttribute().string(testValue);
        assertEquals(testValue, attribute.getString());
    }

    //BaseRock generated method id: ${testVersionAttributeWithDifferentValues}, hash: DB33079F1300C52C740430DC4B5438BC
    @ParameterizedTest
    @ValueSource(strings = { "0.0.1", "1.0.0", "999.999.999" })
    void testVersionAttributeWithDifferentValues(String testValue) {
        V1beta1DeviceAttribute attribute = new V1beta1DeviceAttribute().version(testValue);
        assertEquals(testValue, attribute.getVersion());
    }

    //BaseRock generated method id: ${testNullValues}, hash: 77F8ECB23F93F3485FE13EA85E971F7B
    @Test
    void testNullValues() {
        V1beta1DeviceAttribute attribute = new V1beta1DeviceAttribute();
        assertThat(attribute.getBool(), is(nullValue()));
        assertThat(attribute.getInt(), is(nullValue()));
        assertThat(attribute.getString(), is(nullValue()));
        assertThat(attribute.getVersion(), is(nullValue()));
    }
}
