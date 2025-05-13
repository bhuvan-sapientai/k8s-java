package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import io.kubernetes.client.openapi.models.V1alpha3DeviceAttribute;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1alpha3DeviceAttributeBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 0D9B0DF3F769B3F12117D734AD24852A
    @Test
    void testConstructor() {
        V1alpha3DeviceAttribute attribute = new V1alpha3DeviceAttribute();
        assertThat(attribute, is(notNullValue()));
    }

    //BaseRock generated method id: ${testBooleanAttribute}, hash: B7820FE4723BF781207DF7EC4A057EB1
    @Test
    void testBooleanAttribute() {
        V1alpha3DeviceAttribute attribute = new V1alpha3DeviceAttribute().bool(true);
        assertTrue(attribute.getBool());
        attribute.setBool(false);
        assertFalse(attribute.getBool());
    }

    //BaseRock generated method id: ${testIntAttribute}, hash: D8B7BF0B26CBFC832E95E9A69BA9517F
    @Test
    void testIntAttribute() {
        Long testValue = 42L;
        V1alpha3DeviceAttribute attribute = new V1alpha3DeviceAttribute()._int(testValue);
        assertEquals(testValue, attribute.getInt());
        Long newValue = 100L;
        attribute.setInt(newValue);
        assertEquals(newValue, attribute.getInt());
    }

    //BaseRock generated method id: ${testStringAttribute}, hash: 7E8F248766D7C5B6E8BF688879B82E14
    @Test
    void testStringAttribute() {
        String testString = "test";
        V1alpha3DeviceAttribute attribute = new V1alpha3DeviceAttribute().string(testString);
        assertEquals(testString, attribute.getString());
        String newString = "newTest";
        attribute.setString(newString);
        assertEquals(newString, attribute.getString());
    }

    //BaseRock generated method id: ${testVersionAttribute}, hash: FA771709BC938BC6E6F18A124517444C
    @Test
    void testVersionAttribute() {
        String testVersion = "1.0.0";
        V1alpha3DeviceAttribute attribute = new V1alpha3DeviceAttribute().version(testVersion);
        assertEquals(testVersion, attribute.getVersion());
        String newVersion = "2.0.0";
        attribute.setVersion(newVersion);
        assertEquals(newVersion, attribute.getVersion());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 210A1C31BCD3BF384781C28668DA5437
    @Test
    void testEqualsAndHashCode() {
        V1alpha3DeviceAttribute attribute1 = new V1alpha3DeviceAttribute().bool(true)._int(42L).string("test").version("1.0.0");
        V1alpha3DeviceAttribute attribute2 = new V1alpha3DeviceAttribute().bool(true)._int(42L).string("test").version("1.0.0");
        V1alpha3DeviceAttribute attribute3 = new V1alpha3DeviceAttribute().bool(false)._int(24L).string("different").version("2.0.0");
        assertTrue(attribute1.equals(attribute2));
        assertTrue(attribute2.equals(attribute1));
        assertFalse(attribute1.equals(attribute3));
        assertFalse(attribute3.equals(attribute1));
        assertEquals(attribute1.hashCode(), attribute2.hashCode());
        assertFalse(attribute1.hashCode() == attribute3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 771391175B8ADC4D8D416126FE77E731
    @Disabled()
    @Test
    void testToString() {
        V1alpha3DeviceAttribute attribute = new V1alpha3DeviceAttribute().bool(true)._int(42L).string("test").version("1.0.0");
        String toString = attribute.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString, startsWith("class V1alpha3DeviceAttribute {"));
        assertThat(toString, endsWith("}"));
        assertTrue(toString.contains("bool=true"));
        assertTrue(toString.contains("_int=42"));
        assertTrue(toString.contains("string=test"));
        assertTrue(toString.contains("version=1.0.0"));
    }

    //BaseRock generated method id: ${testNullValues}, hash: 8E9A496C9C9D855CB3287DA99C057344
    @Test
    void testNullValues() {
        V1alpha3DeviceAttribute attribute = new V1alpha3DeviceAttribute();
        assertNull(attribute.getBool());
        assertNull(attribute.getInt());
        assertNull(attribute.getString());
        assertNull(attribute.getVersion());
    }
}
