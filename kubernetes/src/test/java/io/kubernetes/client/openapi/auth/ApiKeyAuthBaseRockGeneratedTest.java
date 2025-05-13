package io.kubernetes.client.openapi.auth;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import java.net.URI;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.ApiException;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import io.kubernetes.client.openapi.Pair;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class ApiKeyAuthBaseRockGeneratedTest {

    private ApiKeyAuth apiKeyAuth;

    @BeforeEach
    void setUp() {
        apiKeyAuth = new ApiKeyAuth("query", "api_key");
    }

    //BaseRock generated method id: ${testConstructor}, hash: 2E1437C747143BDB2047008068340640
    @Test
    void testConstructor() {
        assertEquals("query", apiKeyAuth.getLocation());
        assertEquals("api_key", apiKeyAuth.getParamName());
    }

    //BaseRock generated method id: ${testGetSetApiKey}, hash: B9584E205924DC0866B00FE2736A920D
    @Test
    void testGetSetApiKey() {
        apiKeyAuth.setApiKey("test_api_key");
        assertEquals("test_api_key", apiKeyAuth.getApiKey());
    }

    //BaseRock generated method id: ${testGetSetApiKeyPrefix}, hash: ADECA596774A1905888176FC202AB1C9
    @Test
    void testGetSetApiKeyPrefix() {
        apiKeyAuth.setApiKeyPrefix("Bearer");
        assertEquals("Bearer", apiKeyAuth.getApiKeyPrefix());
    }

    //BaseRock generated method id: ${testApplyToParams}, hash: 181B82FF7EAB8BA99732E0C07112B25E
    @ParameterizedTest
    @CsvSource({ "query,api_key,test_key,", "header,X-API-Key,test_key,", "cookie,session_key,test_key,", "query,api_key,test_key,Bearer" })
    void testApplyToParams(String location, String paramName, String apiKey, String apiKeyPrefix) throws ApiException {
        ApiKeyAuth auth = new ApiKeyAuth(location, paramName);
        auth.setApiKey(apiKey);
        auth.setApiKeyPrefix(apiKeyPrefix);
        List<Pair> queryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        Map<String, String> cookieParams = new HashMap<>();
        auth.applyToParams(queryParams, headerParams, cookieParams, null, "GET", URI.create("http://example.com"));
        String expectedValue = (apiKeyPrefix != null) ? apiKeyPrefix + " " + apiKey : apiKey;
        switch(location) {
            case "query":
                assertEquals(1, queryParams.size());
                assertEquals(paramName, queryParams.get(0).getName());
                assertEquals(expectedValue, queryParams.get(0).getValue());
                break;
            case "header":
                assertEquals(1, headerParams.size());
                assertTrue(headerParams.containsKey(paramName));
                assertEquals(expectedValue, headerParams.get(paramName));
                break;
            case "cookie":
                assertEquals(1, cookieParams.size());
                assertTrue(cookieParams.containsKey(paramName));
                assertEquals(expectedValue, cookieParams.get(paramName));
                break;
        }
    }

    //BaseRock generated method id: ${testApplyToParamsWithNullApiKey}, hash: AFF3F5420606DE1561D5C03C5E5EB234
    @Test
    void testApplyToParamsWithNullApiKey() throws ApiException {
        List<Pair> queryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        Map<String, String> cookieParams = new HashMap<>();
        apiKeyAuth.applyToParams(queryParams, headerParams, cookieParams, null, "GET", URI.create("http://example.com"));
        assertTrue(queryParams.isEmpty());
        assertTrue(headerParams.isEmpty());
        assertTrue(cookieParams.isEmpty());
    }

    //BaseRock generated method id: ${testApplyToParamsWithEmptyApiKey}, hash: AFA02A81674F9E1E3255D2E1F089B88E
    @Test
    void testApplyToParamsWithEmptyApiKey() throws ApiException {
        apiKeyAuth.setApiKey("");
        List<Pair> queryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        Map<String, String> cookieParams = new HashMap<>();
        apiKeyAuth.applyToParams(queryParams, headerParams, cookieParams, null, "GET", URI.create("http://example.com"));
        assertEquals(1, queryParams.size());
        assertEquals("api_key", queryParams.get(0).getName());
        assertEquals("", queryParams.get(0).getValue());
    }

    //BaseRock generated method id: ${testApplyToParamsWithDifferentHttpMethods}, hash: 74923C3878B0CDB4AD8094726BC3B93B
    @Test
    void testApplyToParamsWithDifferentHttpMethods() throws ApiException {
        apiKeyAuth.setApiKey("test_key");
        List<Pair> queryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        Map<String, String> cookieParams = new HashMap<>();
        String[] methods = { "GET", "POST", "PUT", "DELETE", "PATCH" };
        for (String method : methods) {
            apiKeyAuth.applyToParams(queryParams, headerParams, cookieParams, null, method, URI.create("http://example.com"));
        }
        assertEquals(5, queryParams.size());
        for (Pair pair : queryParams) {
            assertEquals("api_key", pair.getName());
            assertEquals("test_key", pair.getValue());
        }
    }

    //BaseRock generated method id: ${testApplyToParamsWithPayload}, hash: 988241F992C9A956E259BF6AC28E4D54
    @Test
    void testApplyToParamsWithPayload() throws ApiException {
        apiKeyAuth.setApiKey("test_key");
        List<Pair> queryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        Map<String, String> cookieParams = new HashMap<>();
        String payload = "{\"key\": \"value\"}";
        apiKeyAuth.applyToParams(queryParams, headerParams, cookieParams, payload, "POST", URI.create("http://example.com"));
        assertEquals(1, queryParams.size());
        assertEquals("api_key", queryParams.get(0).getName());
        assertEquals("test_key", queryParams.get(0).getValue());
    }

    //BaseRock generated method id: ${testApplyToParamsWithDifferentURIs}, hash: 1E56654C6EAEACB57E92E8E7C5EE0D5C
    @Test
    void testApplyToParamsWithDifferentURIs() throws ApiException {
        apiKeyAuth.setApiKey("test_key");
        List<Pair> queryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        Map<String, String> cookieParams = new HashMap<>();
        URI[] uris = { URI.create("http://example.com"), URI.create("https://api.example.com"), URI.create("http://localhost:8080"), URI.create("https://test.com/api/v1") };
        for (URI uri : uris) {
            apiKeyAuth.applyToParams(queryParams, headerParams, cookieParams, null, "GET", uri);
        }
        assertEquals(4, queryParams.size());
        for (Pair pair : queryParams) {
            assertEquals("api_key", pair.getName());
            assertEquals("test_key", pair.getValue());
        }
    }
}
