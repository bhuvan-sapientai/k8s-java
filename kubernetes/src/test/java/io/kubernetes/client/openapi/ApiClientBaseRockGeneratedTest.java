package io.kubernetes.client.openapi;

import java.security.SecureRandom;
import okhttp3.Request;
import io.kubernetes.client.openapi.auth.HttpBasicAuth;
import okhttp3.ResponseBody;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import java.net.URI;
import org.junit.jupiter.api.Test;
import javax.net.ssl.TrustManager;
import java.io.File;
import org.mockito.Mock;
import io.kubernetes.client.openapi.StringUtil;
import javax.net.ssl.SSLContext;
import okhttp3.MediaType;
import io.kubernetes.client.openapi.ApiException;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import java.io.InputStream;
import okhttp3.OkHttpClient;
import okio.Buffer;
import static org.mockito.Mockito.*;
import io.kubernetes.client.openapi.Pair;
import org.mockito.MockedStatic;
import java.io.IOException;
import java.util.HashMap;
import okhttp3.Call;
import java.util.Arrays;
import java.util.List;
import java.lang.reflect.Type;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import okhttp3.RequestBody;
import javax.net.ssl.X509TrustManager;
import java.util.Collections;
import static org.mockito.ArgumentMatchers.eq;
import javax.net.ssl.KeyManager;
import java.security.KeyStore;
import io.kubernetes.client.openapi.ServerConfiguration;
import okhttp3.Protocol;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.*;
import io.kubernetes.client.openapi.auth.Authentication;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import io.kubernetes.client.openapi.JSON;
import okhttp3.Response;
import io.kubernetes.client.openapi.auth.ApiKeyAuth;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class ApiClientBaseRockGeneratedTest {

    private ApiClient apiClient;

    @Mock
    private OkHttpClient httpClient;

    @Mock
    private JSON json;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        apiClient = new ApiClient(httpClient);
        apiClient.setJSON(json);
    }

    //BaseRock generated method id: ${testSerialize}, hash: 1099B6617E77B5F6A68877ABEA0941B7
    @Disabled()
    @Test
    void testSerialize() throws ApiException {
        Map<String, String> obj = Collections.singletonMap("key", "value");
        String contentType = "application/json";
        String serializedJson = "{\"key\":\"value\"}";
        when(json.serialize(obj)).thenReturn(serializedJson);
        RequestBody result = apiClient.serialize(obj, contentType);
        assertNotNull(result);
        assertEquals(MediaType.parse(contentType), result.contentType());
        try {
            Buffer buffer = new Buffer();
            result.writeTo(buffer);
            assertEquals(serializedJson, buffer.readUtf8());
        } catch (IOException e) {
            fail("Failed to read RequestBody content", e);
        }
    }

    //BaseRock generated method id: ${testBuildRequestBodyFormEncoding}, hash: BD73F306DDCA3F693D5A415B877B4F1E
    @Test
    void testBuildRequestBodyFormEncoding() {
        Map<String, Object> formParams = new HashMap<>();
        formParams.put("key1", "value1");
        formParams.put("key2", "value2");
        RequestBody requestBody = apiClient.buildRequestBodyFormEncoding(formParams);
        assertNotNull(requestBody);
        assertEquals(MediaType.parse("application/x-www-form-urlencoded"), requestBody.contentType());
    }

    //BaseRock generated method id: ${testBuildRequestBodyMultipart}, hash: C98F491DD8D2C118B5FCA0039A7E6E65
    @Test
    void testBuildRequestBodyMultipart() {
        Map<String, Object> formParams = new HashMap<>();
        formParams.put("key1", "value1");
        formParams.put("file", new File("test.txt"));
        RequestBody requestBody = apiClient.buildRequestBodyMultipart(formParams);
        assertNotNull(requestBody);
        assertTrue(requestBody.contentType().toString().startsWith("multipart/form-data"));
    }
}
