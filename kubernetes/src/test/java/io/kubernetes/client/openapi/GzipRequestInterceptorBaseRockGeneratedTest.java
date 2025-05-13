package io.kubernetes.client.openapi;

import okio.BufferedSink;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import okio.Okio;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import okhttp3.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import okio.Buffer;
import okio.GzipSink;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class GzipRequestInterceptorBaseRockGeneratedTest {

    @Mock
    private Interceptor.Chain chain;

    @Mock
    private Request originalRequest;

    @Mock
    private RequestBody originalBody;

    @Mock
    private Response response;

    private GzipRequestInterceptor interceptor;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        interceptor = new GzipRequestInterceptor();
    }

    //BaseRock generated method id: ${testInterceptWithNullBody}, hash: D1B47FE600B47E1CE909B178628F4E0A
    @Test
    void testInterceptWithNullBody() throws IOException {
        when(chain.request()).thenReturn(originalRequest);
        when(originalRequest.body()).thenReturn(null);
        when(chain.proceed(originalRequest)).thenReturn(response);
        Response result = interceptor.intercept(chain);
        assertThat(result, is(response));
        verify(chain).proceed(originalRequest);
    }

    //BaseRock generated method id: ${testInterceptWithContentEncodingHeader}, hash: 04B07B8C7A48E3BE052F87A3FA18204A
    @Test
    void testInterceptWithContentEncodingHeader() throws IOException {
        when(chain.request()).thenReturn(originalRequest);
        when(originalRequest.body()).thenReturn(originalBody);
        when(originalRequest.header("Content-Encoding")).thenReturn("gzip");
        when(chain.proceed(originalRequest)).thenReturn(response);
        Response result = interceptor.intercept(chain);
        assertThat(result, is(response));
        verify(chain).proceed(originalRequest);
    }

    //BaseRock generated method id: ${testInterceptWithCompression}, hash: A2B24E8AC28FFCED4104287DB9CA1DCC
    @Disabled()
    @Test
    void testInterceptWithCompression() throws IOException {
        Request.Builder builder = new Request.Builder();
        when(chain.request()).thenReturn(originalRequest);
        when(originalRequest.body()).thenReturn(originalBody);
        when(originalRequest.header("Content-Encoding")).thenReturn(null);
        when(originalRequest.newBuilder()).thenReturn(builder);
        when(originalRequest.method()).thenReturn("POST");
        when(chain.proceed(any(Request.class))).thenReturn(response);
        when(originalBody.contentType()).thenReturn(MediaType.parse("application/json"));
        doReturn(10L).when(originalBody).contentLength();
        HttpUrl url = HttpUrl.parse("https://example.com");
        when(originalRequest.url()).thenReturn(url);
        Response result = interceptor.intercept(chain);
        assertThat(result, is(response));
        verify(chain).proceed(any(Request.class));
    }

    //BaseRock generated method id: ${testInterceptWithIOException}, hash: CABB50E958C5184017A12F22F50FEA51
    @Test
    void testInterceptWithIOException() throws IOException {
        when(chain.request()).thenReturn(originalRequest);
        when(originalRequest.body()).thenReturn(originalBody);
        when(originalRequest.header("Content-Encoding")).thenReturn(null);
        when(originalRequest.newBuilder()).thenReturn(new Request.Builder());
        when(originalRequest.method()).thenReturn("POST");
        when(originalBody.contentType()).thenReturn(MediaType.parse("application/json"));
        doReturn(10L).when(originalBody).contentLength();
        HttpUrl url = HttpUrl.parse("https://example.com");
        when(originalRequest.url()).thenReturn(url);
        doThrow(new IOException("Test exception")).when(originalBody).writeTo(any(BufferedSink.class));
        assertThrows(IOException.class, () -> interceptor.intercept(chain));
    }

    //BaseRock generated method id: ${testInterceptWithNullMethod}, hash: E18495BFE06F81E9DEFD3CCC6BDFEFAF
    @Test
    void testInterceptWithNullMethod() throws IOException {
        Request.Builder builder = new Request.Builder();
        when(chain.request()).thenReturn(originalRequest);
        when(originalRequest.body()).thenReturn(originalBody);
        when(originalRequest.header("Content-Encoding")).thenReturn(null);
        when(originalRequest.newBuilder()).thenReturn(builder);
        when(originalRequest.method()).thenReturn(null);
        assertThrows(NullPointerException.class, () -> interceptor.intercept(chain));
    }

    //BaseRock generated method id: ${testInterceptWithResponseModification}, hash: 46C975D12A3D61EB9A2208AFB48CE01F
    @Disabled()
    @Test
    void testInterceptWithResponseModification() throws IOException {
        Request.Builder builder = new Request.Builder();
        when(chain.request()).thenReturn(originalRequest);
        when(originalRequest.body()).thenReturn(originalBody);
        when(originalRequest.header("Content-Encoding")).thenReturn(null);
        when(originalRequest.newBuilder()).thenReturn(builder);
        when(originalRequest.method()).thenReturn("POST");
        HttpUrl url = HttpUrl.parse("https://example.com");
        when(originalRequest.url()).thenReturn(url);
        Response originalResponse = new Response.Builder().request(originalRequest).protocol(Protocol.HTTP_1_1).code(200).message("OK").body(ResponseBody.create("Original response", MediaType.parse("text/plain"))).build();
        when(chain.proceed(any(Request.class))).thenReturn(originalResponse);
        Response result = interceptor.intercept(chain);
        assertThat(result.body(), is(notNullValue()));
        assertThat(result.code(), is(equalTo(200)));
        assertThat(result.message(), is(equalTo("OK")));
    }
}
