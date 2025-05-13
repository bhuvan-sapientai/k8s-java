package io.kubernetes.client.openapi.auth;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import java.net.URI;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import java.util.function.Supplier;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.ApiException;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.Mockito.*;
import io.kubernetes.client.openapi.Pair;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class HttpBearerAuthBaseRockGeneratedTest {

    private HttpBearerAuth httpBearerAuth;

    @BeforeEach
    void setUp() {
        httpBearerAuth = new HttpBearerAuth("Bearer");
    }

    //BaseRock generated method id: ${testConstructor}, hash: FF866046F043EEB896D20BC6AA420EC6
    @Test
    void testConstructor() {
        assertNotNull(httpBearerAuth);
    }

    //BaseRock generated method id: ${testGetBearerToken}, hash: 0003BC7A0B613F68A43D1FA60E58B284
    @Test
    void testGetBearerToken() {
        String expectedToken = "testToken";
        httpBearerAuth.setBearerToken(expectedToken);
        assertEquals(expectedToken, httpBearerAuth.getBearerToken());
    }

    //BaseRock generated method id: ${testSetBearerToken}, hash: 5D4A12749F80DB9FE18CEFEB8A6992C4
    @Test
    void testSetBearerToken() {
        String expectedToken = "newToken";
        httpBearerAuth.setBearerToken(expectedToken);
        assertEquals(expectedToken, httpBearerAuth.getBearerToken());
    }

    //BaseRock generated method id: ${testSetBearerTokenSupplier}, hash: 031CFE65B85B8CDDAE45F5839CBA4BE0
    @Test
    void testSetBearerTokenSupplier() {
        String expectedToken = "suppliedToken";
        Supplier<String> tokenSupplier = () -> expectedToken;
        httpBearerAuth.setBearerToken(tokenSupplier);
        assertEquals(expectedToken, httpBearerAuth.getBearerToken());
    }

    //BaseRock generated method id: ${testApplyToParamsWithDifferentSchemes}, hash: 1B29DCF0B023E8B83C209FEEDEB94D0C
    @ParameterizedTest
    @ValueSource(strings = { "Bearer", "Token", "Auth" })
    void testApplyToParamsWithDifferentSchemes(String scheme) throws ApiException {
        HttpBearerAuth auth = new HttpBearerAuth(scheme);
        String token = "testToken";
        auth.setBearerToken(token);
        List<Pair> queryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        Map<String, String> cookieParams = new HashMap<>();
        String payload = "testPayload";
        String method = "GET";
        URI uri = URI.create("http://example.com");
        auth.applyToParams(queryParams, headerParams, cookieParams, payload, method, uri);
        assertEquals(1, headerParams.size());
        String expectedHeaderValue = scheme.equalsIgnoreCase("bearer") ? "Bearer " + token : scheme + " " + token;
        assertEquals(expectedHeaderValue, headerParams.get("Authorization"));
    }

    //BaseRock generated method id: ${testApplyToParamsWithNullToken}, hash: C1413668FFE89F4774A9A74B8A0774C9
    @Test
    void testApplyToParamsWithNullToken() throws ApiException {
        httpBearerAuth.setBearerToken((String) null);
        List<Pair> queryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        Map<String, String> cookieParams = new HashMap<>();
        String payload = "testPayload";
        String method = "GET";
        URI uri = URI.create("http://example.com");
        httpBearerAuth.applyToParams(queryParams, headerParams, cookieParams, payload, method, uri);
        assertTrue(headerParams.isEmpty());
    }

    //BaseRock generated method id: ${testApplyToParamsWithNullScheme}, hash: 24554674C77F3115DA269B3CA7871814
    @Test
    void testApplyToParamsWithNullScheme() throws ApiException {
        HttpBearerAuth auth = new HttpBearerAuth(null);
        String token = "testToken";
        auth.setBearerToken(token);
        List<Pair> queryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        Map<String, String> cookieParams = new HashMap<>();
        String payload = "testPayload";
        String method = "GET";
        URI uri = URI.create("http://example.com");
        auth.applyToParams(queryParams, headerParams, cookieParams, payload, method, uri);
        assertEquals(1, headerParams.size());
        assertEquals(token, headerParams.get("Authorization"));
    }

    //BaseRock generated method id: ${testApplyToParamsWithNullTokenSupplier}, hash: 321D7DB4CC5E48E4D7C04B2C6818556B
    @Test
    void testApplyToParamsWithNullTokenSupplier() throws ApiException {
        httpBearerAuth.setBearerToken((Supplier<String>) null);
        List<Pair> queryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        Map<String, String> cookieParams = new HashMap<>();
        String payload = "testPayload";
        String method = "GET";
        URI uri = URI.create("http://example.com");
        httpBearerAuth.applyToParams(queryParams, headerParams, cookieParams, payload, method, uri);
        assertTrue(headerParams.isEmpty());
    }

    //BaseRock generated method id: ${testApplyToParamsWithEmptyToken}, hash: F65197C81D9704F49CAD99A624EA947D
    @Test
    void testApplyToParamsWithEmptyToken() throws ApiException {
        httpBearerAuth.setBearerToken("");
        List<Pair> queryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        Map<String, String> cookieParams = new HashMap<>();
        String payload = "testPayload";
        String method = "GET";
        URI uri = URI.create("http://example.com");
        httpBearerAuth.applyToParams(queryParams, headerParams, cookieParams, payload, method, uri);
        assertEquals(1, headerParams.size());
        assertEquals("Bearer ", headerParams.get("Authorization"));
    }
}
