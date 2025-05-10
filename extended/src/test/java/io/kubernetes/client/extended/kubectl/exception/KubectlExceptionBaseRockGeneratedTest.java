package io.kubernetes.client.extended.kubectl.exception;

import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1Status;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class KubectlExceptionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructorWithMessage}, hash: 9850315015775F1EE913556D1810F1DB
    @Test
    void testConstructorWithMessage() {
        String message = "Test exception message";
        KubectlException exception = new KubectlException(message);
        assertThat(exception, is(notNullValue()));
        assertThat(exception, is(instanceOf(Exception.class)));
        assertEquals(message, exception.getMessage());
    }

    //BaseRock generated method id: ${testConstructorWithVariousMessages}, hash: 0DAF69ADF88C0E68FBBD60F40CFC284B
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Error", "Custom message" })
    void testConstructorWithVariousMessages(String message) {
        KubectlException exception = new KubectlException(message);
        assertThat(exception, is(notNullValue()));
        assertThat(exception.getMessage(), is(equalTo(message)));
    }

    //BaseRock generated method id: ${testConstructorWithV1Status}, hash: 0BFDC6E9E5E332B0181B3BF8011A9C96
    @Test
    void testConstructorWithV1Status() {
        V1Status status = mock(V1Status.class);
        KubectlException exception = new KubectlException(status);
        assertThat(exception, is(notNullValue()));
        assertThat(exception, is(instanceOf(Exception.class)));
        assertEquals(status.toString(), exception.getMessage());
    }

    //BaseRock generated method id: ${testConstructorWithNullV1Status}, hash: 33B737173ED91F86788867F13E9DC2A2
    @Test
    void testConstructorWithNullV1Status() {
        assertThrows(NullPointerException.class, () -> new KubectlException((V1Status) null));
    }

    //BaseRock generated method id: ${testConstructorWithCause}, hash: 48250AC3A7E83E549BAA314785F7F18E
    @Test
    void testConstructorWithCause() {
        Throwable cause = new RuntimeException("Test cause");
        KubectlException exception = new KubectlException(cause);
        assertThat(exception, is(notNullValue()));
        assertThat(exception, is(instanceOf(Exception.class)));
        assertEquals(cause, exception.getCause());
        assertEquals(cause.toString(), exception.getMessage());
    }

    //BaseRock generated method id: ${testConstructorWithNullCause}, hash: 62F9D22FD703720E1B4F3F69F396E0E2
    @Test
    void testConstructorWithNullCause() {
        KubectlException exception = new KubectlException((Throwable) null);
        assertThat(exception, is(notNullValue()));
        assertThat(exception.getCause(), is(equalTo(null)));
        assertThat(exception.getMessage(), is(equalTo(null)));
    }
}
