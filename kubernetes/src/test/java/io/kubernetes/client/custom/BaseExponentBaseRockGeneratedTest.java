package io.kubernetes.client.custom;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class BaseExponentBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructorAndGetters}, hash: 482CFDC0730BE1566316A54E71A11F63
    @Test
    void testConstructorAndGetters() {
        BaseExponent baseExponent = new BaseExponent(2, 3, Quantity.Format.BINARY_SI);
        assertEquals(2, baseExponent.getBase());
        assertEquals(3, baseExponent.getExponent());
        assertEquals(Quantity.Format.BINARY_SI, baseExponent.getFormat());
    }

    //BaseRock generated method id: ${testConstructorAndGettersWithDifferentValues}, hash: 56C76EFA34C84EC09E8376E5A8E7F443
    @ParameterizedTest
    @CsvSource({ "2, 3, BINARY_SI", "10, 6, DECIMAL_SI", "10, -3, DECIMAL_EXPONENT" })
    void testConstructorAndGettersWithDifferentValues(int base, int exponent, Quantity.Format format) {
        BaseExponent baseExponent = new BaseExponent(base, exponent, format);
        assertEquals(base, baseExponent.getBase());
        assertEquals(exponent, baseExponent.getExponent());
        assertEquals(format, baseExponent.getFormat());
    }

    //BaseRock generated method id: ${testToString}, hash: E0916485C78188963AEF724B48B2AD89
    @Test
    void testToString() {
        BaseExponent baseExponent = new BaseExponent(2, 3, Quantity.Format.BINARY_SI);
        String expected = "BaseExponent{base=2, exponent=3, format=BINARY_SI}";
        assertEquals(expected, baseExponent.toString());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 4EAF71B03705627070491D253753A01A
    @Test
    void testEqualsWithSameObject() {
        BaseExponent baseExponent = new BaseExponent(2, 3, Quantity.Format.BINARY_SI);
        assertTrue(baseExponent.equals(baseExponent));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: CCD93BDFED41A1DE918AB09C5F866B1E
    @Test
    void testEqualsWithDifferentObject() {
        BaseExponent baseExponent1 = new BaseExponent(2, 3, Quantity.Format.BINARY_SI);
        BaseExponent baseExponent2 = new BaseExponent(2, 3, Quantity.Format.BINARY_SI);
        assertTrue(baseExponent1.equals(baseExponent2));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentValues}, hash: 9D0225CCBDF2A135F2E9317CE43C3A7D
    @Test
    void testEqualsWithDifferentValues() {
        BaseExponent baseExponent1 = new BaseExponent(2, 3, Quantity.Format.BINARY_SI);
        BaseExponent baseExponent2 = new BaseExponent(3, 2, Quantity.Format.DECIMAL_SI);
        assertFalse(baseExponent1.equals(baseExponent2));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: 424C2EC1AD44687D336113F48AE76279
    @Test
    void testEqualsWithNull() {
        BaseExponent baseExponent = new BaseExponent(2, 3, Quantity.Format.BINARY_SI);
        assertFalse(baseExponent.equals(null));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 88A8754F3ACB44181A8448CFFA69B03F
    @Test
    void testEqualsWithDifferentClass() {
        BaseExponent baseExponent = new BaseExponent(2, 3, Quantity.Format.BINARY_SI);
        assertFalse(baseExponent.equals("Not a BaseExponent"));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 6688AB7E5314E1BBA46A604548473C5E
    @Test
    void testHashCode() {
        BaseExponent baseExponent1 = new BaseExponent(2, 3, Quantity.Format.BINARY_SI);
        BaseExponent baseExponent2 = new BaseExponent(2, 3, Quantity.Format.BINARY_SI);
        assertEquals(baseExponent1.hashCode(), baseExponent2.hashCode());
    }

    //BaseRock generated method id: ${testHashCodeWithDifferentValues}, hash: C15957C706BBCD4B95E30362A72E52C3
    @Test
    void testHashCodeWithDifferentValues() {
        BaseExponent baseExponent1 = new BaseExponent(2, 3, Quantity.Format.BINARY_SI);
        BaseExponent baseExponent2 = new BaseExponent(3, 2, Quantity.Format.DECIMAL_SI);
        assertNotEquals(baseExponent1.hashCode(), baseExponent2.hashCode());
    }
}
