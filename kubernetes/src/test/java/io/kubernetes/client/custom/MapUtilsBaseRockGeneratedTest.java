package io.kubernetes.client.custom;

import org.junit.jupiter.api.Timeout;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.MethodSource;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.Arguments;
import java.util.HashMap;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class MapUtilsBaseRockGeneratedTest {

    //BaseRock generated method id: ${testEqualsWithSameInstance}, hash: 2C7FD2477B0BC5D77888CC3A83FF4621
    @Test
    void testEqualsWithSameInstance() {
        Map<String, byte[]> map = new HashMap<>();
        map.put("key", "value".getBytes());
        assertTrue(MapUtils.equals(map, map));
    }

    //BaseRock generated method id: ${testEqualsWithBothNull}, hash: 0BBECEE84CB4BE884E4C259D84410360
    @Test
    void testEqualsWithBothNull() {
        assertTrue(MapUtils.equals(null, null));
    }

    //BaseRock generated method id: ${testEqualsWithOneNull}, hash: 52E0DC2CDCA4E561E1936A272301A23A
    @Test
    void testEqualsWithOneNull() {
        Map<String, byte[]> map = new HashMap<>();
        assertFalse(MapUtils.equals(map, null));
        assertFalse(MapUtils.equals(null, map));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentSizes}, hash: 23C016D4E3772C7162F7B3617F38B377
    @Test
    void testEqualsWithDifferentSizes() {
        Map<String, byte[]> map1 = new HashMap<>();
        map1.put("key1", "value1".getBytes());
        Map<String, byte[]> map2 = new HashMap<>();
        map2.put("key1", "value1".getBytes());
        map2.put("key2", "value2".getBytes());
        assertFalse(MapUtils.equals(map1, map2));
    }

    //BaseRock generated method id: ${testEqualsWithSameKeysAndValues}, hash: 915ED0DC662E44320CC182990ABF9A97
    @Test
    void testEqualsWithSameKeysAndValues() {
        Map<String, byte[]> map1 = new HashMap<>();
        map1.put("key1", "value1".getBytes());
        map1.put("key2", "value2".getBytes());
        Map<String, byte[]> map2 = new HashMap<>();
        map2.put("key1", "value1".getBytes());
        map2.put("key2", "value2".getBytes());
        assertTrue(MapUtils.equals(map1, map2));
    }

    //BaseRock generated method id: ${testEqualsWithSameKeysDifferentValues}, hash: 521871E144CD00961CF6EF2CE8D51733
    @Test
    void testEqualsWithSameKeysDifferentValues() {
        Map<String, byte[]> map1 = new HashMap<>();
        map1.put("key1", "value1".getBytes());
        map1.put("key2", "value2".getBytes());
        Map<String, byte[]> map2 = new HashMap<>();
        map2.put("key1", "value1".getBytes());
        map2.put("key2", "differentValue".getBytes());
        assertFalse(MapUtils.equals(map1, map2));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentKeys}, hash: C4F397BD418B0A285DE17DBB5708BF19
    @Test
    void testEqualsWithDifferentKeys() {
        Map<String, byte[]> map1 = new HashMap<>();
        map1.put("key1", "value1".getBytes());
        map1.put("key2", "value2".getBytes());
        Map<String, byte[]> map2 = new HashMap<>();
        map2.put("key1", "value1".getBytes());
        map2.put("differentKey", "value2".getBytes());
        assertFalse(MapUtils.equals(map1, map2));
    }

    //BaseRock generated method id: ${testEqualsWithVariousScenarios}, hash: 2218F43BFDBCB3727AE778EB417392EF
    @ParameterizedTest
    @MethodSource("provideMapPairs")
    void testEqualsWithVariousScenarios(Map<String, byte[]> map1, Map<String, byte[]> map2, boolean expected) {
        assertEquals(expected, MapUtils.equals(map1, map2));
    }

    private static Stream<Arguments> provideMapPairs() {
        return Stream.of(Arguments.of(new HashMap<String, byte[]>() {

            {
                put("key", "value".getBytes());
            }
        }, new HashMap<String, byte[]>() {

            {
                put("key", "value".getBytes());
            }
        }, true), Arguments.of(new HashMap<String, byte[]>() {

            {
                put("key", "value".getBytes());
            }
        }, new HashMap<String, byte[]>() {

            {
                put("key", "differentValue".getBytes());
            }
        }, false), Arguments.of(new HashMap<String, byte[]>() {

            {
                put("key1", "value1".getBytes());
                put("key2", "value2".getBytes());
            }
        }, new HashMap<String, byte[]>() {

            {
                put("key1", "value1".getBytes());
                put("key2", "value2".getBytes());
            }
        }, true), Arguments.of(new HashMap<String, byte[]>() {

            {
                put("key1", "value1".getBytes());
                put("key2", "value2".getBytes());
            }
        }, new HashMap<String, byte[]>() {

            {
                put("key1", "value1".getBytes());
                put("differentKey", "value2".getBytes());
            }
        }, false), Arguments.of(new HashMap<String, byte[]>(), new HashMap<String, byte[]>(), true));
    }

    //BaseRock generated method id: ${testEqualsWithEmptyMaps}, hash: ADF585E8072F5F4AFD1911695C5CEF97
    @Test
    void testEqualsWithEmptyMaps() {
        Map<String, byte[]> emptyMap1 = new HashMap<>();
        Map<String, byte[]> emptyMap2 = new HashMap<>();
        assertTrue(MapUtils.equals(emptyMap1, emptyMap2));
    }

    //BaseRock generated method id: ${testEqualsWithLargeIdenticalMaps}, hash: B1F368EBE71DA8087FC65B5A51B915BE
    @Test
    void testEqualsWithLargeIdenticalMaps() {
        Map<String, byte[]> map1 = new HashMap<>();
        Map<String, byte[]> map2 = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            String key = "key" + i;
            byte[] value = ("value" + i).getBytes();
            map1.put(key, value);
            map2.put(key, value);
        }
        assertTrue(MapUtils.equals(map1, map2));
    }

    //BaseRock generated method id: ${testEqualsWithLargeDifferentMaps}, hash: 260D0226A6A205FD3491F3A74E77E610
    @Test
    void testEqualsWithLargeDifferentMaps() {
        Map<String, byte[]> map1 = new HashMap<>();
        Map<String, byte[]> map2 = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            String key = "key" + i;
            byte[] value1 = ("value" + i).getBytes();
            byte[] value2 = ("differentValue" + i).getBytes();
            map1.put(key, value1);
            map2.put(key, value2);
        }
        assertFalse(MapUtils.equals(map1, map2));
    }

    //BaseRock generated method id: ${testEqualsWithNullValues}, hash: 360B2D323E06A50E1DBD8A5AF9A81AE3
    @Test
    void testEqualsWithNullValues() {
        Map<String, byte[]> map1 = new HashMap<>();
        Map<String, byte[]> map2 = new HashMap<>();
        map1.put("key1", null);
        map2.put("key1", null);
        assertTrue(MapUtils.equals(map1, map2));
    }

    //BaseRock generated method id: ${testEqualsWithMixedNullAndNonNullValues}, hash: FDF134FD055ADD526F4230CFB0B332BC
    @Test
    void testEqualsWithMixedNullAndNonNullValues() {
        Map<String, byte[]> map1 = new HashMap<>();
        Map<String, byte[]> map2 = new HashMap<>();
        map1.put("key1", null);
        map1.put("key2", "value".getBytes());
        map2.put("key1", null);
        map2.put("key2", "value".getBytes());
        assertTrue(MapUtils.equals(map1, map2));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentNullValues}, hash: F0A023F024453E4469750D5B63F0B053
    @Test
    void testEqualsWithDifferentNullValues() {
        Map<String, byte[]> map1 = new HashMap<>();
        Map<String, byte[]> map2 = new HashMap<>();
        map1.put("key1", null);
        map2.put("key1", "value".getBytes());
        assertFalse(MapUtils.equals(map1, map2));
    }
}
