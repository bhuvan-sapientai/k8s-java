package io.kubernetes.client.openapi;

import static org.junit.jupiter.api.Assertions.assertAll;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import java.util.Map;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.ArrayList;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.sameInstance;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class ApiExceptionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testDefaultConstructor}, hash: B41DB2B4500B2ECEBCDF3EF83F49274F
    @Test
    void testDefaultConstructor() {
        ApiException exception = new ApiException();
        assertAll(() -> assertEquals("Message: null\nHTTP response code: 0\nHTTP response body: null\nHTTP response headers: null", exception.getMessage()), () -> assertEquals(null, exception.getCause()), () -> assertEquals(0, exception.getCode()), () -> assertEquals(null, exception.getResponseHeaders()), () -> assertEquals(null, exception.getResponseBody()));
    }

    //BaseRock generated method id: ${testConstructorWithThrowable}, hash: 76BB07BCBA23DB90ACD7E2252555966A
    @Test
    void testConstructorWithThrowable() {
        Throwable cause = new RuntimeException("Test cause");
        ApiException exception = new ApiException(cause);
        assertAll(() -> assertEquals("java.lang.RuntimeException: Test cause", exception.getCause().toString()), () -> assertThat(exception.getCause(), is(sameInstance(cause))), () -> assertEquals(0, exception.getCode()), () -> assertEquals(null, exception.getResponseHeaders()), () -> assertEquals(null, exception.getResponseBody()));
    }

    //BaseRock generated method id: ${testConstructorWithMessage}, hash: 7B50AB23CD7E68505E9B5C4EBC6A95CB
    @Test
    void testConstructorWithMessage() {
        String message = "Test message";
        ApiException exception = new ApiException(message);
        assertAll(() -> assertEquals("Message: Test message\nHTTP response code: 0\nHTTP response body: null\nHTTP response headers: null", exception.getMessage()), () -> assertEquals(null, exception.getCause()), () -> assertEquals(0, exception.getCode()), () -> assertEquals(null, exception.getResponseHeaders()), () -> assertEquals(null, exception.getResponseBody()));
    }

    //BaseRock generated method id: ${testConstructorWithMessageAndThrowable}, hash: CE31A17C7FFFB20F96AE01835DA98CB1
    @Test
    void testConstructorWithMessageAndThrowable() {
        String message = "Test message";
        Throwable cause = new RuntimeException("Test cause");
        ApiException exception = new ApiException(message, cause, 400, null, "Response body");
        assertAll(() -> assertEquals("Message: Test message\nHTTP response code: 400\nHTTP response body: Response body\nHTTP response headers: null", exception.getMessage()), () -> assertThat(exception.getCause(), is(sameInstance(cause))), () -> assertEquals(400, exception.getCode()), () -> assertEquals(null, exception.getResponseHeaders()), () -> assertEquals("Response body", exception.getResponseBody()));
    }

    //BaseRock generated method id: ${testConstructorWithMessageAndCode}, hash: E0250582A995C001AE217BCAD745E1F2
    @Test
    void testConstructorWithMessageAndCode() {
        String message = "Test message";
        int code = 404;
        ApiException exception = new ApiException(code, message);
        assertAll(() -> assertEquals("Message: Test message\nHTTP response code: 404\nHTTP response body: null\nHTTP response headers: null", exception.getMessage()), () -> assertEquals(null, exception.getCause()), () -> assertEquals(code, exception.getCode()), () -> assertEquals(null, exception.getResponseHeaders()), () -> assertEquals(null, exception.getResponseBody()));
    }

    //BaseRock generated method id: ${testConstructorWithCodeAndResponseHeaders}, hash: 30BBCDC804C665432F1A86E75F7771CF
    @Test
    void testConstructorWithCodeAndResponseHeaders() {
        int code = 500;
        Map<String, List<String>> responseHeaders = new HashMap<>();
        responseHeaders.put("Content-Type", new ArrayList<>(List.of("application/json")));
        String responseBody = "Internal Server Error";
        ApiException exception = new ApiException(code, responseHeaders, responseBody);
        assertAll(() -> assertThat(exception.getMessage(), containsString("Response Code: 500")), () -> assertThat(exception.getMessage(), containsString("Response Body: Internal Server Error")), () -> assertEquals(null, exception.getCause()), () -> assertEquals(code, exception.getCode()), () -> assertEquals(responseHeaders, exception.getResponseHeaders()), () -> assertEquals(responseBody, exception.getResponseBody()));
    }

    //BaseRock generated method id: ${testGetCode}, hash: 94C618145B2A3F0471FF50AF1C85AADA
    @ParameterizedTest
    @ValueSource(ints = { 200, 400, 500 })
    void testGetCode(int code) {
        ApiException exception = new ApiException(code, "Test message");
        assertEquals(code, exception.getCode());
    }

    //BaseRock generated method id: ${testGetResponseHeaders}, hash: 2674C8B46C5874D19522523D767BBD45
    @Test
    void testGetResponseHeaders() {
        Map<String, List<String>> responseHeaders = new HashMap<>();
        responseHeaders.put("Content-Type", new ArrayList<>(List.of("application/json")));
        ApiException exception = new ApiException("Test message", null, 200, responseHeaders, null);
        assertEquals(responseHeaders, exception.getResponseHeaders());
    }

    //BaseRock generated method id: ${testGetResponseBody}, hash: 9AF33692203E866DC67136232D8C9B62
    @Test
    void testGetResponseBody() {
        String responseBody = "Test response body";
        ApiException exception = new ApiException("Test message", null, 200, null, responseBody);
        assertEquals(responseBody, exception.getResponseBody());
    }

    //BaseRock generated method id: ${testGetMessageWithAllFields}, hash: 332F744A8F3B998A24BCAE85FD6FB7F4
    @Test
    void testGetMessageWithAllFields() {
        String message = "Test message";
        int code = 404;
        Map<String, List<String>> responseHeaders = new HashMap<>();
        responseHeaders.put("Content-Type", new ArrayList<>(List.of("application/json")));
        String responseBody = "Not Found";
        ApiException exception = new ApiException(message, null, code, responseHeaders, responseBody);
        String expectedMessage = String.format("Message: %s%nHTTP response code: %s%nHTTP response body: %s%nHTTP response headers: %s", message, code, responseBody, responseHeaders);
        assertEquals(expectedMessage, exception.getMessage());
    }

    //BaseRock generated method id: ${testExceptionChaining}, hash: 3F76F3FF631D0BD7B4BB9B81D8C15DA9
    @Test
    void testExceptionChaining() {
        Exception cause = new RuntimeException("Root cause");
        ApiException wrapper = new ApiException("Wrapper", cause, 500, null, null);
        ApiException topLevel = new ApiException("Top level", wrapper, 500, null, null);
        assertAll(() -> assertEquals("Message: Top level\nHTTP response code: 500\nHTTP response body: null\nHTTP response headers: null", topLevel.getMessage()), () -> assertThat(topLevel.getCause(), is(sameInstance(wrapper))), () -> assertEquals("Message: Wrapper\nHTTP response code: 500\nHTTP response body: null\nHTTP response headers: null", wrapper.getMessage()), () -> assertThat(wrapper.getCause(), is(sameInstance(cause))), () -> assertEquals("Root cause", cause.getMessage()));
    }

    //BaseRock generated method id: ${testNullResponseHeaders}, hash: FBC0D9307F251F58402B27673F7E2054
    @Test
    void testNullResponseHeaders() {
        ApiException exception = new ApiException("Test message", null, 200, null, "Test body");
        assertEquals(null, exception.getResponseHeaders());
    }

    //BaseRock generated method id: ${testEmptyResponseHeaders}, hash: F60F6090BCD7AEB1DCD3435B9984DC23
    @Test
    void testEmptyResponseHeaders() {
        Map<String, List<String>> emptyHeaders = new HashMap<>();
        ApiException exception = new ApiException("Test message", null, 200, emptyHeaders, "Test body");
        assertEquals(emptyHeaders, exception.getResponseHeaders());
    }

    //BaseRock generated method id: ${testMultipleResponseHeaders}, hash: A1ED78FDA7EA2B34D0C393018A380B19
    @Test
    void testMultipleResponseHeaders() {
        Map<String, List<String>> headers = new HashMap<>();
        headers.put("Content-Type", new ArrayList<>(List.of("application/json")));
        headers.put("Authorization", new ArrayList<>(List.of("Bearer token123")));
        ApiException exception = new ApiException("Test message", null, 200, headers, "Test body");
        assertAll(() -> assertEquals(List.of("application/json"), exception.getResponseHeaders().get("Content-Type")), () -> assertEquals(List.of("Bearer token123"), exception.getResponseHeaders().get("Authorization")));
    }

    //BaseRock generated method id: ${testNullResponseBody}, hash: 94B659C6E4D40EF650F7DDF0E869D93A
    @Test
    void testNullResponseBody() {
        ApiException exception = new ApiException("Test message", null, 200, null, null);
        assertEquals(null, exception.getResponseBody());
    }

    //BaseRock generated method id: ${testEmptyResponseBody}, hash: 84B628041D7AAFB247DA4C52BDC5682A
    @Test
    void testEmptyResponseBody() {
        ApiException exception = new ApiException("Test message", null, 200, null, "");
        assertEquals("", exception.getResponseBody());
    }

    //BaseRock generated method id: ${testLongResponseBody}, hash: 7BD7A1CCF23901BA64B53528B787527F
    @Test
    void testLongResponseBody() {
        String longBody = "A".repeat(1000);
        ApiException exception = new ApiException("Test message", null, 200, null, longBody);
        assertEquals(longBody, exception.getResponseBody());
    }

    //BaseRock generated method id: ${testNegativeStatusCode}, hash: 6232B67F3A8A39CB72DF2A5358466E0D
    @Test
    void testNegativeStatusCode() {
        ApiException exception = new ApiException(-1, "Negative status code");
        assertEquals(-1, exception.getCode());
    }

    //BaseRock generated method id: ${testZeroStatusCode}, hash: D1116F181BB4BB31DC81F88568BB97FA
    @Test
    void testZeroStatusCode() {
        ApiException exception = new ApiException(0, "Zero status code");
        assertEquals(0, exception.getCode());
    }

    //BaseRock generated method id: ${testHighStatusCode}, hash: B3413D7C065BE0EC9C68C2381CD1C2B1
    @Test
    void testHighStatusCode() {
        ApiException exception = new ApiException(999, "High status code");
        assertEquals(999, exception.getCode());
    }
}
