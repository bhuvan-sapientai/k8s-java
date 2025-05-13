package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.OffsetDateTime;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1TaintBaseRockGeneratedTest {

    private V1Taint taint;

    @BeforeEach
    void setUp() {
        taint = new V1Taint();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 830834D32A26F77F76FF19E26B07FA8F
    @Test
    void testConstructor() {
        assertNotNull(taint);
    }

    //BaseRock generated method id: ${testEffectGetterAndSetter}, hash: 5B607F740DCB3139A172CC1C7006F85F
    @Test
    void testEffectGetterAndSetter() {
        String effect = "NoSchedule";
        taint.setEffect(effect);
        assertEquals(effect, taint.getEffect());
    }

    //BaseRock generated method id: ${testEffectWithValidValues}, hash: E33B66372E5389A5655B836820BAAD5B
    @ParameterizedTest
    @ValueSource(strings = { "NoSchedule", "PreferNoSchedule", "NoExecute" })
    void testEffectWithValidValues(String effect) {
        taint.setEffect(effect);
        assertEquals(effect, taint.getEffect());
    }

    //BaseRock generated method id: ${testKeyGetterAndSetter}, hash: 3ADC78BA789293A3309A212128CF55C1
    @Test
    void testKeyGetterAndSetter() {
        String key = "node-role.kubernetes.io/master";
        taint.setKey(key);
        assertEquals(key, taint.getKey());
    }

    //BaseRock generated method id: ${testTimeAddedGetterAndSetter}, hash: CBC2C44CB3BE8E430E753CA89EAECB68
    @Test
    void testTimeAddedGetterAndSetter() {
        OffsetDateTime now = OffsetDateTime.now();
        taint.setTimeAdded(now);
        assertEquals(now, taint.getTimeAdded());
    }

    //BaseRock generated method id: ${testValueGetterAndSetter}, hash: 14135C6E964FADE4D164DD46907B1734
    @Test
    void testValueGetterAndSetter() {
        String value = "true";
        taint.setValue(value);
        assertEquals(value, taint.getValue());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: CB469408A07D22FBFCA4C0C609C5A202
    @Test
    void testEqualsWithSameObject() {
        assertTrue(taint.equals(taint));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: DFAF1B6CF7465264F1261BC795159B8B
    @Test
    void testEqualsWithNull() {
        assertFalse(taint.equals(null));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 9C4A81A6331D68300D48431F90F3E984
    @Test
    void testEqualsWithDifferentClass() {
        assertFalse(taint.equals(new Object()));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: FF100780944B8A94D6F13C3B3DFFDB40
    @Test
    void testEqualsWithDifferentObject() {
        V1Taint taint1 = new V1Taint().effect("NoSchedule").key("key1").timeAdded(OffsetDateTime.now()).value("value1");
        V1Taint taint2 = new V1Taint().effect("NoSchedule").key("key2").timeAdded(OffsetDateTime.now()).value("value2");
        assertFalse(taint1.equals(taint2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: FF0309F5A7FF6D99185ACA3AD5B9FE3A
    @Test
    void testHashCode() {
        V1Taint taint1 = new V1Taint().effect("NoSchedule").key("key").timeAdded(OffsetDateTime.now()).value("value");
        V1Taint taint2 = new V1Taint().effect("NoSchedule").key("key").timeAdded(taint1.getTimeAdded()).value("value");
        assertEquals(taint1.hashCode(), taint2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: DE12C2727AAC9E42B01BBC57F1660015
    @Test
    void testToString() {
        V1Taint taint = new V1Taint().effect("NoSchedule").key("key").timeAdded(OffsetDateTime.now()).value("value");
        String toString = taint.toString();
        assertTrue(toString.contains("effect"));
        assertTrue(toString.contains("key"));
        assertTrue(toString.contains("timeAdded"));
        assertTrue(toString.contains("value"));
    }

    //BaseRock generated method id: ${testSetEffectWithInvalidInput}, hash: E88CEDA124AB84586866D27D44DEFB45
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { " " })
    void testSetEffectWithInvalidInput(String effect) {
        taint.setEffect(effect);
        assertEquals(effect, taint.getEffect());
    }

    //BaseRock generated method id: ${testSetKeyWithInvalidInput}, hash: FC7D405C1A44FD449848E9451FA2BE8F
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { " " })
    void testSetKeyWithInvalidInput(String key) {
        taint.setKey(key);
        assertEquals(key, taint.getKey());
    }

    //BaseRock generated method id: ${testSetTimeAddedWithNull}, hash: 5BEFCA66AF519D9E67513D110CA489A9
    @Test
    void testSetTimeAddedWithNull() {
        taint.setTimeAdded(null);
        assertNull(taint.getTimeAdded());
    }

    //BaseRock generated method id: ${testSetValueWithInvalidInput}, hash: 1A852A3E74D0B3F3AE87A26890F706C8
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { " " })
    void testSetValueWithInvalidInput(String value) {
        taint.setValue(value);
        assertEquals(value, taint.getValue());
    }
}
