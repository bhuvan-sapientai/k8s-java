package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1StatefulSetOrdinals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1StatefulSetOrdinalsBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: F9B3CB3A7BE581856379B1751D6E6206
    @Test
    void testConstructor() {
        V1StatefulSetOrdinals ordinals = new V1StatefulSetOrdinals();
        assertNotNull(ordinals);
    }

    //BaseRock generated method id: ${testSetAndGetStart}, hash: 97E8B069A4B083A0FD943BED138D8326
    @Test
    void testSetAndGetStart() {
        V1StatefulSetOrdinals ordinals = new V1StatefulSetOrdinals();
        Integer start = 5;
        ordinals.setStart(start);
        assertEquals(start, ordinals.getStart());
    }

    //BaseRock generated method id: ${testSetAndGetStartWithDifferentValues}, hash: 0193EEF624089087B682579286D139AD
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 10, 100 })
    void testSetAndGetStartWithDifferentValues(int start) {
        V1StatefulSetOrdinals ordinals = new V1StatefulSetOrdinals();
        ordinals.setStart(start);
        assertEquals(start, ordinals.getStart());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: C20EC276B51D2A47EBA9F8B3B93777EF
    @Test
    void testEqualsWithSameObject() {
        V1StatefulSetOrdinals ordinals = new V1StatefulSetOrdinals().start(5);
        assertThat(ordinals.equals(ordinals), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 60053376854B9BAF98CB160C45D9FC1F
    @Test
    void testEqualsWithDifferentObject() {
        V1StatefulSetOrdinals ordinals1 = new V1StatefulSetOrdinals().start(5);
        V1StatefulSetOrdinals ordinals2 = new V1StatefulSetOrdinals().start(5);
        assertThat(ordinals1.equals(ordinals2), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentValues}, hash: 8345F4403FD8916A9BD6A587726846E1
    @Test
    void testEqualsWithDifferentValues() {
        V1StatefulSetOrdinals ordinals1 = new V1StatefulSetOrdinals().start(5);
        V1StatefulSetOrdinals ordinals2 = new V1StatefulSetOrdinals().start(10);
        assertThat(ordinals1.equals(ordinals2), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 387C36C88B18D7D73459A545CCB76169
    @Test
    void testHashCode() {
        V1StatefulSetOrdinals ordinals1 = new V1StatefulSetOrdinals().start(5);
        V1StatefulSetOrdinals ordinals2 = new V1StatefulSetOrdinals().start(5);
        assertEquals(ordinals1.hashCode(), ordinals2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 19267BD02B08D8EEE2A0232300EC26E3
    @Test
    void testToString() {
        V1StatefulSetOrdinals ordinals = new V1StatefulSetOrdinals().start(5);
        String expected = "class V1StatefulSetOrdinals {\n    start: 5\n}";
        assertEquals(expected, ordinals.toString());
    }

    //BaseRock generated method id: ${testBuilder}, hash: 4358D25A7344B3BACA302C6E7938463A
    @Test
    void testBuilder() {
        Integer start = 5;
        V1StatefulSetOrdinals ordinals = new V1StatefulSetOrdinals().start(start);
        assertThat(ordinals, is(notNullValue()));
        assertThat(ordinals.getStart(), is(equalTo(start)));
    }
}
