package io.kubernetes.client.extended.event;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class EventTypeBaseRockGeneratedTest {

    //BaseRock generated method id: ${testEnumValues}, hash: 2D98900A011E26B3A60B0F10B05F1DA2
    @Test
    void testEnumValues() {
        EventType[] values = EventType.values();
        assertEquals(2, values.length);
        assertEquals(EventType.Normal, values[0]);
        assertEquals(EventType.Warning, values[1]);
    }

    //BaseRock generated method id: ${testEnumValueOf}, hash: D449E97493E20CA38B70DEB1FFCD6445
    @Test
    void testEnumValueOf() {
        assertEquals(EventType.Normal, EventType.valueOf("Normal"));
        assertEquals(EventType.Warning, EventType.valueOf("Warning"));
    }

    //BaseRock generated method id: ${testEnumOrdinal}, hash: F78674663F1844C6149879AF1116A44C
    @Test
    void testEnumOrdinal() {
        assertEquals(0, EventType.Normal.ordinal());
        assertEquals(1, EventType.Warning.ordinal());
    }

    //BaseRock generated method id: ${testEnumName}, hash: 4105A381FDA14E922480D4ABA445F644
    @Test
    void testEnumName() {
        assertEquals("Normal", EventType.Normal.name());
        assertEquals("Warning", EventType.Warning.name());
    }

    //BaseRock generated method id: ${testEnumToString}, hash: 0468073F0F8FA7EA1B6982AF1A7EC33A
    @Test
    void testEnumToString() {
        assertEquals("Normal", EventType.Normal.toString());
        assertEquals("Warning", EventType.Warning.toString());
    }

    //BaseRock generated method id: ${testEnumEquality}, hash: 9DDC222CD078658962A3034E80A39B6E
    @Test
    void testEnumEquality() {
        assertNotEquals(EventType.Normal, EventType.Warning);
        assertEquals(EventType.Normal, EventType.Normal);
        assertEquals(EventType.Warning, EventType.Warning);
    }

    //BaseRock generated method id: ${testEnumValueOfIllegalArgument}, hash: 7CA0CBFF626E196D521A00BF8B9CC701
    @Test
    void testEnumValueOfIllegalArgument() {
        assertThrows(IllegalArgumentException.class, () -> EventType.valueOf("InvalidType"));
    }

    //BaseRock generated method id: ${testEnumValueOfNullPointer}, hash: 1422CE6F8C95D6A309A6B25FF8BB0259
    @Test
    void testEnumValueOfNullPointer() {
        assertThrows(NullPointerException.class, () -> EventType.valueOf(null));
    }

    //BaseRock generated method id: ${testEnumClassInstance}, hash: 3BE267CEE036092EE55A76D48BE77C1C
    @Test
    void testEnumClassInstance() {
        assertNotNull(EventType.Normal);
        assertNotNull(EventType.Warning);
    }
}
