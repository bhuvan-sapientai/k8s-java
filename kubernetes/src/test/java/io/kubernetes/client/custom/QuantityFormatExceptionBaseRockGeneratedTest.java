package io.kubernetes.client.custom;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class QuantityFormatExceptionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructorWithMessage}, hash: 70F870F07E4CEF460D39A7DFF217E33D
    @Test
    void testConstructorWithMessage() {
        String errorMessage = "Invalid quantity format";
        QuantityFormatException exception = new QuantityFormatException(errorMessage);
        assertThat(exception, is(notNullValue()));
        assertThat(exception.getMessage(), is(errorMessage));
    }

    //BaseRock generated method id: ${testInheritanceFromRuntimeException}, hash: 94C463D12EBD4AA6031CE707ECDEC318
    @Test
    void testInheritanceFromRuntimeException() {
        QuantityFormatException exception = new QuantityFormatException("Test");
        assertThat(exception instanceof RuntimeException, is(true));
    }

    //BaseRock generated method id: ${testExceptionThrown}, hash: F4D01646E2E1091FDF497D0697F73D8D
    @Test
    void testExceptionThrown() {
        String errorMessage = "Test error message";
        try {
            throw new QuantityFormatException(errorMessage);
        } catch (QuantityFormatException e) {
            assertThat(e.getMessage(), is(errorMessage));
        }
    }

    //BaseRock generated method id: ${testConstructorWithNullMessage}, hash: BC7F189C623454D4F246F18B6B9C3569
    @Test
    void testConstructorWithNullMessage() {
        QuantityFormatException exception = new QuantityFormatException(null);
        assertThat(exception, is(notNullValue()));
        assertThat(exception.getMessage(), is(nullValue()));
    }

    //BaseRock generated method id: ${testExceptionThrownAndCaught}, hash: F56AAE7B77C6705C3B334460AAE3FBC2
    @Test
    void testExceptionThrownAndCaught() {
        assertThrows(QuantityFormatException.class, () -> {
            throw new QuantityFormatException("Test exception");
        });
    }
}
