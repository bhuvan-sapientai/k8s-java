package io.kubernetes.client.custom;

import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import org.mockito.MockedConstruction;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.MockedStatic;
import java.math.BigInteger;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.math.MathContext;
import static org.mockito.Mockito.mockConstruction;
import org.junit.jupiter.api.Timeout;
import static org.mockito.Mockito.mock;
import java.math.BigDecimal;
import static org.hamcrest.Matchers.closeTo;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class QuantityFormatterBaseRockGeneratedTest {

    private QuantityFormatter quantityFormatter;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        quantityFormatter = new QuantityFormatter();
    }

    //BaseRock generated method id: ${testParseValidQuantity}, hash: 1A8EB0C426A63155B6A31404F9FD77A5
    @Test
    void testParseValidQuantity() {
        String value = "10Ki";
        Quantity result = quantityFormatter.parse(value);
        assertThat(result.getNumber(), is(equalTo(new BigDecimal("10240"))));
        assertThat(result.getFormat(), is(equalTo(Quantity.Format.BINARY_SI)));
    }

    //BaseRock generated method id: ${testParseEmptyString}, hash: DFBFF8219D0E84BFD5F7E58A28739614
    @Test
    void testParseEmptyString() {
        assertThrows(QuantityFormatException.class, () -> quantityFormatter.parse(""));
    }

    //BaseRock generated method id: ${testParseNullValue}, hash: 882E305B042182C5555FD024B14B6663
    @Test
    void testParseNullValue() {
        assertThrows(QuantityFormatException.class, () -> quantityFormatter.parse(null));
    }

    //BaseRock generated method id: ${testParseInvalidNumericPart}, hash: BB34D5EF26C748775A1E85E1E519C1BF
    @Test
    void testParseInvalidNumericPart() {
        assertThrows(QuantityFormatException.class, () -> quantityFormatter.parse("abc123"));
    }

    //BaseRock generated method id: ${testParseWithDifferentSuffixes}, hash: EAD88696497556A14F70F08DB8718A81
    @Disabled()
    @ParameterizedTest
    @CsvSource({ "10, '',    10, DECIMAL_SI", "10, 'K',   10000, DECIMAL_SI", "10, 'M',   10000000, DECIMAL_SI", "10, 'G',   10000000000, DECIMAL_SI", "10, 'T',   10000000000000, DECIMAL_SI", "10, 'P',   10000000000000000, DECIMAL_SI", "10, 'Ki',  10240, BINARY_SI", "10, 'Mi',  10485760, BINARY_SI", "10, 'Gi',  10737418240, BINARY_SI", "10, 'Ti',  10995116277760, BINARY_SI", "10, 'Pi',  11258999068426240, BINARY_SI", "10, 'E',   10, DECIMAL_EXPONENT", "10, 'e3',  10000, DECIMAL_EXPONENT" })
    void testParseWithDifferentSuffixes(String value, String suffix, String expected, Quantity.Format expectedFormat) {
        Quantity result = quantityFormatter.parse(value + suffix);
        assertThat(result.getNumber(), is(closeTo(new BigDecimal(expected), new BigDecimal("0.000001"))));
        assertThat(result.getFormat(), is(equalTo(expectedFormat)));
    }

    //BaseRock generated method id: ${testFormatDecimalSI}, hash: 9DD778A306BD487685F27F7FFC2C57CC
    @Test
    void testFormatDecimalSI() {
        Quantity quantity = new Quantity(new BigDecimal("10000"), Quantity.Format.DECIMAL_SI);
        String result = quantityFormatter.format(quantity);
        assertThat(result, is(equalTo("10k")));
    }

    //BaseRock generated method id: ${testFormatDecimalExponent}, hash: 4F4BFB329F74592192D3217DDC05ADFF
    @Test
    void testFormatDecimalExponent() {
        Quantity quantity = new Quantity(new BigDecimal("1000000"), Quantity.Format.DECIMAL_EXPONENT);
        String result = quantityFormatter.format(quantity);
        assertThat(result, is(equalTo("1e6")));
    }

    //BaseRock generated method id: ${testFormatBinarySINonFractional}, hash: C121AA766A25083B58246104C66FF579
    @Test
    void testFormatBinarySINonFractional() {
        Quantity quantity = new Quantity(new BigDecimal("1024"), Quantity.Format.BINARY_SI);
        String result = quantityFormatter.format(quantity);
        assertThat(result, is(equalTo("1Ki")));
    }

    //BaseRock generated method id: ${testFormatBinarySIFractional}, hash: 13FEFF05F9F968A11560A5E17886E6FE
    @Disabled()
    @Test
    void testFormatBinarySIFractional() {
        Quantity quantity = new Quantity(new BigDecimal("1024.5"), Quantity.Format.BINARY_SI);
        String result = quantityFormatter.format(quantity);
        assertThat(result, is(equalTo("1.0245k")));
    }

    //BaseRock generated method id: ${testFormatInvalidFormat}, hash: FC4F2C4D96456DA414F2DDE8799032AD
    @Disabled()
    @Test
    void testFormatInvalidFormat() {
        Quantity quantity = mock(Quantity.class);
        when(quantity.getFormat()).thenReturn(null);
        when(quantity.getNumber()).thenReturn(BigDecimal.ONE);
        assertThrows(IllegalArgumentException.class, () -> quantityFormatter.format(quantity));
    }

    //BaseRock generated method id: ${testQuantityFormatterInstantiation}, hash: 035A6E3381771215BC63F01F80117719
    @Test
    void testQuantityFormatterInstantiation() {
        QuantityFormatter formatter = new QuantityFormatter();
        assertThat(formatter, is(equalTo(formatter)));
    }
}
