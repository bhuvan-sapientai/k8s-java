package io.kubernetes.client.openapi;

import okio.BufferedSink;
import static org.mockito.ArgumentMatchers.anyLong;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import okhttp3.RequestBody;
import okio.Okio;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import okhttp3.MediaType;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.ApiCallback;
import io.kubernetes.client.openapi.ProgressRequestBody;
import okio.Buffer;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class ProgressRequestBodyBaseRockGeneratedTest {

    private RequestBody mockRequestBody;

    private ApiCallback mockCallback;

    private ProgressRequestBody progressRequestBody;

    @BeforeEach
    void setUp() {
        mockRequestBody = mock(RequestBody.class);
        mockCallback = mock(ApiCallback.class);
        progressRequestBody = new ProgressRequestBody(mockRequestBody, mockCallback);
    }

    //BaseRock generated method id: ${testContentType}, hash: 4806BD1B86C968091A0B41D7EDD82EF0
    @Test
    void testContentType() {
        MediaType expectedMediaType = MediaType.parse("application/json");
        when(mockRequestBody.contentType()).thenReturn(expectedMediaType);
        MediaType actualMediaType = progressRequestBody.contentType();
        assertThat(actualMediaType, is(equalTo(expectedMediaType)));
    }

    //BaseRock generated method id: ${testContentLength}, hash: 8B17D2DC62B88C7F9FF7A123781AE533
    @Test
    void testContentLength() throws IOException {
        long expectedLength = 1000L;
        when(mockRequestBody.contentLength()).thenReturn(expectedLength);
        long actualLength = progressRequestBody.contentLength();
        assertThat(actualLength, is(equalTo(expectedLength)));
    }

    //BaseRock generated method id: ${testWriteTo}, hash: 0C21CD4B97CA2EB11882BD40FFAA2EC7
    @Test
    void testWriteTo() throws IOException {
        BufferedSink mockSink = mock(BufferedSink.class);
        Buffer mockBuffer = new Buffer();
        when(mockSink.buffer()).thenReturn(mockBuffer);
        long contentLength = 100L;
        when(mockRequestBody.contentLength()).thenReturn(contentLength);
        doAnswer(invocation -> {
            BufferedSink sink = invocation.getArgument(0);
            sink.write(new byte[(int) contentLength]);
            return null;
        }).when(mockRequestBody).writeTo(any(BufferedSink.class));
        progressRequestBody.writeTo(mockSink);
        verify(mockRequestBody, times(1)).writeTo(any(BufferedSink.class));
        verify(mockCallback, times(1)).onUploadProgress(eq(contentLength), eq(contentLength), eq(true));
    }

    //BaseRock generated method id: ${testWriteToWithMultipleWrites}, hash: 494CAEA1F3F3EC603E93537AD90A3E7A
    @Disabled()
    @Test
    void testWriteToWithMultipleWrites() throws IOException {
        BufferedSink mockSink = mock(BufferedSink.class);
        Buffer mockBuffer = new Buffer();
        when(mockSink.buffer()).thenReturn(mockBuffer);
        long contentLength = 100L;
        when(mockRequestBody.contentLength()).thenReturn(contentLength);
        doAnswer(invocation -> {
            BufferedSink sink = invocation.getArgument(0);
            sink.write(new byte[50]);
            sink.flush();
            sink.write(new byte[50]);
            sink.flush();
            return null;
        }).when(mockRequestBody).writeTo(any(BufferedSink.class));
        progressRequestBody.writeTo(mockSink);
        verify(mockRequestBody, times(1)).writeTo(any(BufferedSink.class));
        verify(mockCallback, times(3)).onUploadProgress(anyLong(), eq(contentLength), anyBoolean());
        verify(mockCallback, times(1)).onUploadProgress(eq(contentLength), eq(contentLength), eq(true));
    }

    //BaseRock generated method id: ${testWriteToWithZeroContentLength}, hash: FBC5FBF71B7B8E40546B42DCFEC90C38
    @Disabled()
    @Test
    void testWriteToWithZeroContentLength() throws IOException {
        BufferedSink mockSink = mock(BufferedSink.class);
        Buffer mockBuffer = new Buffer();
        when(mockSink.buffer()).thenReturn(mockBuffer);
        when(mockRequestBody.contentLength()).thenReturn(0L);
        doAnswer(invocation -> {
            BufferedSink sink = invocation.getArgument(0);
            sink.write(new byte[0]);
            return null;
        }).when(mockRequestBody).writeTo(any(BufferedSink.class));
        progressRequestBody.writeTo(mockSink);
        verify(mockRequestBody, times(1)).writeTo(any(BufferedSink.class));
        verify(mockCallback, times(1)).onUploadProgress(eq(0L), eq(0L), eq(true));
    }

    //BaseRock generated method id: ${testWriteToWithIOException}, hash: CB16A9B51C26E2F27BD3E269065B92E2
    @Test
    void testWriteToWithIOException() throws IOException {
        BufferedSink mockSink = mock(BufferedSink.class);
        doThrow(new IOException("Test exception")).when(mockRequestBody).writeTo(any(BufferedSink.class));
        assertThrows(IOException.class, () -> progressRequestBody.writeTo(mockSink));
    }

    //BaseRock generated method id: ${testConstructor}, hash: B28E5AFA4D476B8676C4DF68D7DDEF6A
    @Test
    void testConstructor() {
        assertThat(progressRequestBody, is(notNullValue()));
    }

    //BaseRock generated method id: ${testNullRequestBody}, hash: 33B79C871D81A3288CDA7BC39889576B
    @Disabled()
    @Test
    void testNullRequestBody() {
        assertThrows(NullPointerException.class, () -> new ProgressRequestBody(null, mockCallback));
    }

    //BaseRock generated method id: ${testNullCallback}, hash: 964DD983E5C8A551F783FB7C3760A3B6
    @Disabled()
    @Test
    void testNullCallback() {
        assertThrows(NullPointerException.class, () -> new ProgressRequestBody(mockRequestBody, null));
    }

    //BaseRock generated method id: ${testContentLengthIOException}, hash: 7F72E1D46FA31E9E6A6A8885AF8CFC7B
    @Test
    void testContentLengthIOException() throws IOException {
        when(mockRequestBody.contentLength()).thenThrow(new IOException("Test exception"));
        assertThrows(IOException.class, () -> progressRequestBody.contentLength());
    }

    //BaseRock generated method id: ${testSinkWrite}, hash: 244588E4B9E5A1F49788BBCB5A8C9F07
    @Test
    void testSinkWrite() throws IOException {
        BufferedSink mockSink = mock(BufferedSink.class);
        Buffer mockBuffer = new Buffer();
        when(mockSink.buffer()).thenReturn(mockBuffer);
        long contentLength = 100L;
        when(mockRequestBody.contentLength()).thenReturn(contentLength);
        doAnswer(invocation -> {
            BufferedSink sink = invocation.getArgument(0);
            sink.write(new byte[100]);
            sink.flush();
            return null;
        }).when(mockRequestBody).writeTo(any(BufferedSink.class));
        progressRequestBody.writeTo(mockSink);
        verify(mockCallback, times(1)).onUploadProgress(eq(contentLength), eq(contentLength), eq(true));
    }
}
