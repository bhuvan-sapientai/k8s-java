package io.kubernetes.client.custom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.junit.jupiter.params.provider.ValueSource;
import java.io.StringWriter;
import java.io.IOException;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class IntOrStringJacksonSerializerBaseRockGeneratedTest {

    private IntOrStringJacksonSerializer serializer;

    @Mock
    private JsonGenerator jsonGenerator;

    @Mock
    private SerializerProvider serializerProvider;

    private StringWriter stringWriter;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        serializer = new IntOrStringJacksonSerializer();
        stringWriter = new StringWriter();
    }

    //BaseRock generated method id: ${testConstructorWithNoArguments}, hash: 499E7C3D101808A2437496728D61AA54
    @Test
    void testConstructorWithNoArguments() {
        IntOrStringJacksonSerializer serializer = new IntOrStringJacksonSerializer();
        assertThat(serializer.handledType(), is(IntOrString.class));
    }

    //BaseRock generated method id: ${testConstructorWithClassArgument}, hash: 777711B01D5A8D5F28D9ED1A253E3360
    @Test
    void testConstructorWithClassArgument() {
        IntOrStringJacksonSerializer serializer = new IntOrStringJacksonSerializer(IntOrString.class);
        assertThat(serializer.handledType(), is(IntOrString.class));
    }

    //BaseRock generated method id: ${testSerializeWithInteger}, hash: F2C5819458D183337F70D1C41902BE38
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 100, -1, Integer.MAX_VALUE, Integer.MIN_VALUE })
    void testSerializeWithInteger(int value) throws IOException {
        IntOrString intOrString = new IntOrString(value);
        serializer.serialize(intOrString, jsonGenerator, serializerProvider);
        verify(jsonGenerator).writeNumber(value);
    }

    //BaseRock generated method id: ${testSerializeWithString}, hash: A1CF24250186E1CC991D8A76CC870ACC
    @ParameterizedTest
    @ValueSource(strings = { "", "test", "123", "!@#$%^&*()" })
    void testSerializeWithString(String value) throws IOException {
        IntOrString intOrString = new IntOrString(value);
        serializer.serialize(intOrString, jsonGenerator, serializerProvider);
        verify(jsonGenerator).writeString(value);
    }

    //BaseRock generated method id: ${testSerializeWithNullValue}, hash: EC110FE97AF4B0A6D25FB9B69AD2A59B
    @Test
    void testSerializeWithNullValue() {
        assertThat(serializer.handledType(), is(IntOrString.class));
    }
}
