package io.kubernetes.client.custom;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import com.google.gson.stream.JsonWriter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import java.io.StringReader;
import org.junit.jupiter.api.Timeout;
import java.math.BigDecimal;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.stream.JsonReader;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import java.io.StringWriter;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class QuantityBaseRockGeneratedTest {

    //BaseRock generated method id: ${testQuantityConstructorWithBigDecimalAndFormat}, hash: 1D11383603090AE3C7FC97C5DE81843C
    @Test
    void testQuantityConstructorWithBigDecimalAndFormat() {
        BigDecimal number = new BigDecimal("1.5");
        Quantity quantity = new Quantity(number, Quantity.Format.DECIMAL_SI);
        assertEquals(number, quantity.getNumber());
        assertEquals(Quantity.Format.DECIMAL_SI, quantity.getFormat());
    }

    //BaseRock generated method id: ${testQuantityConstructorWithString}, hash: 5337657C4A943410D6908EB90194AA01
    @ParameterizedTest
    @CsvSource({ "1.5, DECIMAL_SI", "2.0, DECIMAL_SI", "3.5, DECIMAL_SI" })
    void testQuantityConstructorWithString(String value, Quantity.Format expectedFormat) {
        Quantity quantity = new Quantity(value);
        assertThat(quantity.getNumber(), is(notNullValue()));
        assertEquals(expectedFormat, quantity.getFormat());
    }

    //BaseRock generated method id: ${testQuantityConstructorWithInvalidString}, hash: 2B91F37EF94DC02223274488A603050B
    @Test
    void testQuantityConstructorWithInvalidString() {
        assertThrows(QuantityFormatException.class, () -> new Quantity("invalid"));
    }

    //BaseRock generated method id: ${testFromString}, hash: 7F6AF075E1034741D6F0A2107AF21478
    @Test
    void testFromString() {
        Quantity quantity = Quantity.fromString("1.5k");
        assertEquals(new BigDecimal("1500.0"), quantity.getNumber());
        assertEquals(Quantity.Format.DECIMAL_SI, quantity.getFormat());
    }

    //BaseRock generated method id: ${testToSuffixedString}, hash: 76F45E7422BB1E1265EDF186FAA4166F
    @Test
    void testToSuffixedString() {
        Quantity quantity = new Quantity(new BigDecimal("1500"), Quantity.Format.DECIMAL_SI);
        assertEquals("1500", quantity.toSuffixedString());
    }

    //BaseRock generated method id: ${testToString}, hash: 57C8B6A95E605371743786350235D876
    @Test
    void testToString() {
        Quantity quantity = new Quantity(new BigDecimal("1.5"), Quantity.Format.DECIMAL_SI);
        assertEquals("Quantity{number=1.5, format=DECIMAL_SI}", quantity.toString());
    }

    //BaseRock generated method id: ${testEquals}, hash: 9D1BF23FD242CD882BA1D8B82F6DAABE
    @Test
    void testEquals() {
        Quantity quantity1 = new Quantity(new BigDecimal("1.5"), Quantity.Format.DECIMAL_SI);
        Quantity quantity2 = new Quantity(new BigDecimal("1.5"), Quantity.Format.BINARY_SI);
        Quantity quantity3 = new Quantity(new BigDecimal("2.0"), Quantity.Format.DECIMAL_SI);
        assertEquals(quantity1, quantity2);
        assertNotEquals(quantity1, quantity3);
    }

    //BaseRock generated method id: ${testHashCode}, hash: B711CACCD163FB02474D166575C5A795
    @Test
    void testHashCode() {
        Quantity quantity1 = new Quantity(new BigDecimal("1.5"), Quantity.Format.DECIMAL_SI);
        Quantity quantity2 = new Quantity(new BigDecimal("1.5"), Quantity.Format.BINARY_SI);
        assertEquals(quantity1.hashCode(), quantity2.hashCode());
    }

    //BaseRock generated method id: ${testQuantityAdapterWrite}, hash: 71B3EA425F1239ED8AFE1E27DFAD8C33
    @Test
    void testQuantityAdapterWrite() throws IOException {
        Quantity quantity = new Quantity(new BigDecimal("1.5"), Quantity.Format.DECIMAL_SI);
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        new Quantity.QuantityAdapter().write(jsonWriter, quantity);
        assertEquals("\"1500m\"", stringWriter.toString());
    }

    //BaseRock generated method id: ${testQuantityAdapterRead}, hash: 7AF05D06DACD8E928BDC27BD8B4E8F2A
    @Test
    void testQuantityAdapterRead() throws IOException {
        String json = "\"1.5k\"";
        JsonReader jsonReader = new JsonReader(new StringReader(json));
        Quantity quantity = new Quantity.QuantityAdapter().read(jsonReader);
        assertEquals(new BigDecimal("1500.0"), quantity.getNumber());
        assertEquals(Quantity.Format.DECIMAL_SI, quantity.getFormat());
    }

    //BaseRock generated method id: ${testFormatBase}, hash: F9542901BB22A646ACF0A47935D2EAF6
    @Test
    void testFormatBase() {
        assertEquals(10, Quantity.Format.DECIMAL_EXPONENT.getBase());
        assertEquals(10, Quantity.Format.DECIMAL_SI.getBase());
        assertEquals(2, Quantity.Format.BINARY_SI.getBase());
    }

    //BaseRock generated method id: ${testQuantityFormatterFormat}, hash: 74C2D46167BCED73FE3384D111663A44
    @ParameterizedTest
    @CsvSource({ "1.5, 1500m", "1000, 1k", "1500, 1500", "1000000, 1M" })
    void testQuantityFormatterFormat(String input, String expected) {
        Quantity quantity = new Quantity(input);
        String formatted = new QuantityFormatter().format(quantity);
        assertEquals(expected, formatted);
    }

    //BaseRock generated method id: ${testQuantityFormatterParse}, hash: A8574DED85AD9148E1FEC4696F59F27C
    @ParameterizedTest
    @CsvSource({ "1.5, 1.5", "1k, 1000", "1.5k, 1500", "1M, 1000000" })
    void testQuantityFormatterParse(String input, String expected) {
        Quantity quantity = new QuantityFormatter().parse(input);
        assertThat(quantity.getNumber(), is(closeTo(new BigDecimal(expected), new BigDecimal("0.00001"))));
    }

    //BaseRock generated method id: ${testQuantityFormatterParseInvalid}, hash: 790DD2744945280B45714BC4AB7C6657
    @Test
    void testQuantityFormatterParseInvalid() {
        assertThrows(QuantityFormatException.class, () -> new QuantityFormatter().parse("invalid"));
    }

    //BaseRock generated method id: ${testQuantityAdapterWriteNull}, hash: F112310055EFDC8160169EAD35462C17
    @Test
    void testQuantityAdapterWriteNull() throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        new Quantity.QuantityAdapter().write(jsonWriter, null);
        assertEquals("null", stringWriter.toString());
    }

    //BaseRock generated method id: ${testQuantityAdapterReadNull}, hash: F5AC96FAAFEF45696E38256945702142
    @Test
    void testQuantityAdapterReadNull() throws IOException {
        JsonReader jsonReader = mock(JsonReader.class);
        when(jsonReader.nextString()).thenReturn(null);
        assertThrows(QuantityFormatException.class, () -> new Quantity.QuantityAdapter().read(jsonReader));
    }

    //BaseRock generated method id: ${testQuantityConstructorWithNullNumber}, hash: E81D2289C825EEDA3E73DC5228B74E72
    @Disabled()
    @Test
    void testQuantityConstructorWithNullNumber() {
        assertThrows(NullPointerException.class, () -> new Quantity(null, Quantity.Format.DECIMAL_SI));
    }

    //BaseRock generated method id: ${testQuantityConstructorWithNullFormat}, hash: AE74845D2CA4F413A77C89EF43EA29DA
    @Disabled()
    @Test
    void testQuantityConstructorWithNullFormat() {
        assertThrows(NullPointerException.class, () -> new Quantity(BigDecimal.ONE, null));
    }

    //BaseRock generated method id: ${testQuantityConstructorWithNullString}, hash: 8DC00A7CB516E0DF493119BDC6C6044D
    @Test
    void testQuantityConstructorWithNullString() {
        assertThrows(QuantityFormatException.class, () -> new Quantity((String) null));
    }

    //BaseRock generated method id: ${testFromStringWithNullInput}, hash: 083EBA28D4C4EB7DF82375462075101F
    @Test
    void testFromStringWithNullInput() {
        assertThrows(QuantityFormatException.class, () -> Quantity.fromString(null));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: 023A3F10995FCBA4474AC28F65618F8F
    @Test
    void testEqualsWithNull() {
        Quantity quantity = new Quantity(BigDecimal.ONE, Quantity.Format.DECIMAL_SI);
        assertNotEquals(quantity, null);
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: FDB87B394FAFFAA802066A5046DFA1F9
    @Test
    void testEqualsWithDifferentClass() {
        Quantity quantity = new Quantity(BigDecimal.ONE, Quantity.Format.DECIMAL_SI);
        assertNotEquals(quantity, new Object());
    }
}
