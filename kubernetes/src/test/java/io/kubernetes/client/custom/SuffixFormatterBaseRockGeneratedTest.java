package io.kubernetes.client.custom;

import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import java.util.stream.Stream;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class SuffixFormatterBaseRockGeneratedTest {

    private SuffixFormatter suffixFormatter;

    @BeforeEach
    void setUp() {
        suffixFormatter = new SuffixFormatter();
    }

    //BaseRock generated method id: ${testParse}, hash: D9A771D7D694F57A8A3444BE62077CED
    @ParameterizedTest
    @CsvSource({ "Ki, 2, 10, BINARY_SI", "Mi, 2, 20, BINARY_SI", "Gi, 2, 30, BINARY_SI", "Ti, 2, 40, BINARY_SI", "Pi, 2, 50, BINARY_SI", "Ei, 2, 60, BINARY_SI", "n, 10, -9, DECIMAL_SI", "u, 10, -6, DECIMAL_SI", "m, 10, -3, DECIMAL_SI", "k, 10, 3, DECIMAL_SI", "M, 10, 6, DECIMAL_SI", "G, 10, 9, DECIMAL_SI", "T, 10, 12, DECIMAL_SI", "P, 10, 15, DECIMAL_SI", "E, 10, 18, DECIMAL_SI" })
    void testParse(String suffix, int expectedBase, int expectedExponent, Quantity.Format expectedFormat) {
        BaseExponent result = suffixFormatter.parse(suffix);
        assertEquals(expectedBase, result.getBase());
        assertEquals(expectedExponent, result.getExponent());
        assertEquals(expectedFormat, result.getFormat());
    }

    //BaseRock generated method id: ${testParseEmptySuffix}, hash: A5A30C74C666FC1BC3F7B157C7DB3EFD
    @Test
    void testParseEmptySuffix() {
        BaseExponent result = suffixFormatter.parse("");
        assertEquals(10, result.getBase());
        assertEquals(0, result.getExponent());
        assertEquals(Quantity.Format.DECIMAL_SI, result.getFormat());
    }

    //BaseRock generated method id: ${testParseExponentSuffix}, hash: DACB55100F91676DC931A35C8A786C56
    @ParameterizedTest
    @MethodSource("provideExponentSuffixes")
    void testParseExponentSuffix(String suffix, int expectedExponent) {
        BaseExponent result = suffixFormatter.parse(suffix);
        assertEquals(10, result.getBase());
        assertEquals(expectedExponent, result.getExponent());
        assertEquals(Quantity.Format.DECIMAL_EXPONENT, result.getFormat());
    }

    private static Stream<Arguments> provideExponentSuffixes() {
        return Stream.of(Arguments.of("e3", 3), Arguments.of("E-6", -6), Arguments.of("e10", 10));
    }

    //BaseRock generated method id: ${testParseInvalidSuffix}, hash: CAE6505FAD878978981B4A575473A377
    @Test
    void testParseInvalidSuffix() {
        assertThrows(QuantityFormatException.class, () -> suffixFormatter.parse("invalid"));
    }

    //BaseRock generated method id: ${testFormat}, hash: 43AF6AFECBE72A175889963FC2983AF9
    @ParameterizedTest
    @CsvSource({ "DECIMAL_SI, -9, n", "DECIMAL_SI, -6, u", "DECIMAL_SI, -3, m", "DECIMAL_SI, 0, ''", "DECIMAL_SI, 3, k", "DECIMAL_SI, 6, M", "DECIMAL_SI, 9, G", "DECIMAL_SI, 12, T", "DECIMAL_SI, 15, P", "DECIMAL_SI, 18, E", "BINARY_SI, 0, ''", "BINARY_SI, 10, Ki", "BINARY_SI, 20, Mi", "BINARY_SI, 30, Gi", "BINARY_SI, 40, Ti", "BINARY_SI, 50, Pi", "BINARY_SI, 60, Ei" })
    void testFormat(Quantity.Format format, int exponent, String expectedSuffix) {
        String result = suffixFormatter.format(format, exponent);
        assertThat(result, is(equalTo(expectedSuffix)));
    }

    //BaseRock generated method id: ${testFormatDecimalExponent}, hash: E3061B3FC26DE92E4416DE6756B4CDE5
    @ParameterizedTest
    @CsvSource({ "DECIMAL_EXPONENT, 0, ''", "DECIMAL_EXPONENT, 3, e3", "DECIMAL_EXPONENT, -6, e-6" })
    void testFormatDecimalExponent(Quantity.Format format, int exponent, String expectedSuffix) {
        String result = suffixFormatter.format(format, exponent);
        assertThat(result, is(equalTo(expectedSuffix)));
    }

    //BaseRock generated method id: ${testFormatInvalidDecimalSiExponent}, hash: FFDF41CFCF9B318AA0C5040FC3801278
    @Test
    void testFormatInvalidDecimalSiExponent() {
        assertThrows(IllegalArgumentException.class, () -> suffixFormatter.format(Quantity.Format.DECIMAL_SI, 1));
    }

    //BaseRock generated method id: ${testFormatInvalidBinarySiExponent}, hash: 6CE057F1D7755710ADE16E9A0A81E9D6
    @Test
    void testFormatInvalidBinarySiExponent() {
        assertThrows(IllegalArgumentException.class, () -> suffixFormatter.format(Quantity.Format.BINARY_SI, 1));
    }
}
