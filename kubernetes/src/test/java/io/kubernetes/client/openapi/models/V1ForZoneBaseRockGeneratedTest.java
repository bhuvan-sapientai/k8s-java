package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.openapi.models.V1ForZone;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ForZoneBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 5B38906216CF0BC9ECEF0F5CA6829BEB
    @Test
    void testConstructor() {
        V1ForZone forZone = new V1ForZone();
        assertThat(forZone, is(notNullValue()));
    }

    //BaseRock generated method id: ${testNameGetter}, hash: 25668B90B274A601BE3D84D046823168
    @Test
    void testNameGetter() {
        V1ForZone forZone = new V1ForZone().name("test-zone");
        assertThat(forZone.getName(), is(equalTo("test-zone")));
    }

    //BaseRock generated method id: ${testNameSetter}, hash: B886462822CE1A0180B84C2BB8693D0F
    @Test
    void testNameSetter() {
        V1ForZone forZone = new V1ForZone();
        forZone.setName("new-zone");
        assertThat(forZone.getName(), is(equalTo("new-zone")));
    }

    //BaseRock generated method id: ${testNameSetterWithMultipleValues}, hash: 04CCD798B36AF2ADA44981FF82CBC492
    @ParameterizedTest
    @ValueSource(strings = { "zone1", "zone2", "zone3" })
    void testNameSetterWithMultipleValues(String zoneName) {
        V1ForZone forZone = new V1ForZone();
        forZone.setName(zoneName);
        assertThat(forZone.getName(), is(equalTo(zoneName)));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 1F82830DC5362202DF581EF46560DE1C
    @Test
    void testEqualsWithSameObject() {
        V1ForZone forZone = new V1ForZone().name("test-zone");
        assertThat(forZone.equals(forZone), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: E08C64DE88A0161C97DCC61AFEDE4349
    @Test
    void testEqualsWithDifferentObject() {
        V1ForZone forZone1 = new V1ForZone().name("zone1");
        V1ForZone forZone2 = new V1ForZone().name("zone2");
        assertThat(forZone1.equals(forZone2), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: 1657F20D506EE9295082CF04E6F87FFD
    @Test
    void testEqualsWithNull() {
        V1ForZone forZone = new V1ForZone().name("test-zone");
        assertThat(forZone.equals(null), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 120DDC420F676FFB4BF59A512FE4F5DB
    @Test
    void testHashCode() {
        V1ForZone forZone1 = new V1ForZone().name("test-zone");
        V1ForZone forZone2 = new V1ForZone().name("test-zone");
        assertThat(forZone1.hashCode(), is(equalTo(forZone2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 86D680A4E39E4B07FE24920449899381
    @Test
    void testToString() {
        V1ForZone forZone = new V1ForZone().name("test-zone");
        String expected = "class V1ForZone {\n    name: test-zone\n}";
        assertThat(forZone.toString(), is(equalTo(expected)));
    }

    //BaseRock generated method id: ${testSetNullName}, hash: 70093DFC608B3FEB5EF0657A8813C9C3
    @Test
    void testSetNullName() {
        V1ForZone forZone = new V1ForZone();
        forZone.setName(null);
        assertThat(forZone.getName(), is(equalTo(null)));
    }
}
