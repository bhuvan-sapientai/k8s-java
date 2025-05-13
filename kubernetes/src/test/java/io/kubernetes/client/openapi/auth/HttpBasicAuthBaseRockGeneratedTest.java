package io.kubernetes.client.openapi.auth;

import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import java.net.URI;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.ApiException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import io.kubernetes.client.openapi.Pair;
import org.mockito.MockedStatic;
import java.util.HashMap;
import java.util.List;
import okhttp3.Credentials;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import java.util.ArrayList;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class HttpBasicAuthBaseRockGeneratedTest {

    private HttpBasicAuth httpBasicAuth;

    @BeforeEach
    void setUp() {
        httpBasicAuth = new HttpBasicAuth();
    }

    //BaseRock generated method id: ${testGetUsername}, hash: 827E2CC5C68DE572B89BB7E73D3ECA35
    @Test
    void testGetUsername() {
        assertThat(httpBasicAuth.getUsername(), is(nullValue()));
        httpBasicAuth.setUsername("testUser");
        assertEquals("testUser", httpBasicAuth.getUsername());
    }

    //BaseRock generated method id: ${testSetUsername}, hash: 81A37B834C1984351B3176611954D117
    @Test
    void testSetUsername() {
        httpBasicAuth.setUsername("newUser");
        assertEquals("newUser", httpBasicAuth.getUsername());
    }

    //BaseRock generated method id: ${testGetPassword}, hash: 911237A66B368906C6B153D636F17D08
    @Test
    void testGetPassword() {
        assertThat(httpBasicAuth.getPassword(), is(nullValue()));
        httpBasicAuth.setPassword("testPass");
        assertEquals("testPass", httpBasicAuth.getPassword());
    }

    //BaseRock generated method id: ${testSetPassword}, hash: 86836480272416F72ECA1F9602D7B9B5
    @Test
    void testSetPassword() {
        httpBasicAuth.setPassword("newPass");
        assertEquals("newPass", httpBasicAuth.getPassword());
    }

    //BaseRock generated method id: ${testApplyToParamsWithNullCredentials}, hash: CDAF09439AA218CE650CC74E969CF575
    @Test
    void testApplyToParamsWithNullCredentials() throws ApiException {
        List<Pair> queryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        Map<String, String> cookieParams = new HashMap<>();
        String payload = "testPayload";
        String method = "GET";
        URI uri = URI.create("http://test.com");
        httpBasicAuth.applyToParams(queryParams, headerParams, cookieParams, payload, method, uri);
        assertThat(headerParams.size(), is(0));
    }

    //BaseRock generated method id: ${testApplyToParamsWithCredentials}, hash: 4C8AF346379D3E4C3B7AA01AE00CB455
    @Test
    void testApplyToParamsWithCredentials() throws ApiException {
        List<Pair> queryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        Map<String, String> cookieParams = new HashMap<>();
        String payload = "testPayload";
        String method = "GET";
        URI uri = URI.create("http://test.com");
        httpBasicAuth.setUsername("testUser");
        httpBasicAuth.setPassword("testPass");
        try (MockedStatic<Credentials> credentialsMockedStatic = mockStatic(Credentials.class)) {
            credentialsMockedStatic.when(() -> Credentials.basic("testUser", "testPass")).thenReturn("Basic dGVzdFVzZXI6dGVzdFBhc3M=");
            httpBasicAuth.applyToParams(queryParams, headerParams, cookieParams, payload, method, uri);
            assertThat(headerParams.size(), is(1));
            assertThat(headerParams.get("Authorization"), is("Basic dGVzdFVzZXI6dGVzdFBhc3M="));
            credentialsMockedStatic.verify(() -> Credentials.basic("testUser", "testPass"));
        }
    }

    //BaseRock generated method id: ${testApplyToParamsWithNullUsername}, hash: 910F7EA85FADFCE71BAF1D244673526B
    @Test
    void testApplyToParamsWithNullUsername() throws ApiException {
        List<Pair> queryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        Map<String, String> cookieParams = new HashMap<>();
        String payload = "testPayload";
        String method = "GET";
        URI uri = URI.create("http://test.com");
        httpBasicAuth.setPassword("testPass");
        try (MockedStatic<Credentials> credentialsMockedStatic = mockStatic(Credentials.class)) {
            credentialsMockedStatic.when(() -> Credentials.basic("", "testPass")).thenReturn("Basic OnRlc3RQYXNz");
            httpBasicAuth.applyToParams(queryParams, headerParams, cookieParams, payload, method, uri);
            assertThat(headerParams.size(), is(1));
            assertThat(headerParams.get("Authorization"), is("Basic OnRlc3RQYXNz"));
            credentialsMockedStatic.verify(() -> Credentials.basic("", "testPass"));
        }
    }

    //BaseRock generated method id: ${testApplyToParamsWithNullPassword}, hash: 4146940E4E7476E6402EA5143283CEDD
    @Test
    void testApplyToParamsWithNullPassword() throws ApiException {
        List<Pair> queryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        Map<String, String> cookieParams = new HashMap<>();
        String payload = "testPayload";
        String method = "GET";
        URI uri = URI.create("http://test.com");
        httpBasicAuth.setUsername("testUser");
        try (MockedStatic<Credentials> credentialsMockedStatic = mockStatic(Credentials.class)) {
            credentialsMockedStatic.when(() -> Credentials.basic("testUser", "")).thenReturn("Basic dGVzdFVzZXI6");
            httpBasicAuth.applyToParams(queryParams, headerParams, cookieParams, payload, method, uri);
            assertThat(headerParams.size(), is(1));
            assertThat(headerParams.get("Authorization"), is("Basic dGVzdFVzZXI6"));
            credentialsMockedStatic.verify(() -> Credentials.basic("testUser", ""));
        }
    }

    //BaseRock generated method id: ${testApplyToParamsWithApiException}, hash: D138396F020A545A087AF76938C97903
    @Test
    void testApplyToParamsWithApiException() {
        List<Pair> queryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();
        Map<String, String> cookieParams = new HashMap<>();
        String payload = "testPayload";
        String method = "GET";
        URI uri = URI.create("http://test.com");
        httpBasicAuth.setUsername("testUser");
        httpBasicAuth.setPassword("testPass");
        try (MockedStatic<Credentials> credentialsMockedStatic = mockStatic(Credentials.class)) {
            credentialsMockedStatic.when(() -> Credentials.basic(anyString(), anyString())).thenThrow(new RuntimeException("Test exception"));
            assertThrows(RuntimeException.class, () -> httpBasicAuth.applyToParams(queryParams, headerParams, cookieParams, payload, method, uri));
            credentialsMockedStatic.verify(() -> Credentials.basic("testUser", "testPass"));
        }
    }

    //BaseRock generated method id: ${testConstructor}, hash: C89B9EBA33797D6C2F8D0D2927E94572
    @Test
    void testConstructor() {
        assertDoesNotThrow(() -> new HttpBasicAuth());
    }
}
