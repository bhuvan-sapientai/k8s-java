package io.kubernetes.client.openapi;

import org.junit.jupiter.api.BeforeEach;
import okhttp3.ResponseBody;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import okio.Okio;
import okio.ForwardingSource;
import static org.mockito.ArgumentMatchers.eq;
import okio.Source;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import okhttp3.MediaType;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import okio.BufferedSource;
import static org.hamcrest.Matchers.*;
import java.nio.charset.StandardCharsets;
import okio.Buffer;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class ProgressResponseBodyBaseRockGeneratedTest {

    @Mock
    private ResponseBody mockResponseBody;

    @Mock
    private ApiCallback mockCallback;

    @Mock
    private BufferedSource mockBufferedSource;

    private ProgressResponseBody progressResponseBody;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        progressResponseBody = new ProgressResponseBody(mockResponseBody, mockCallback);
    }

    //BaseRock generated method id: ${testContentType}, hash: 19B8D8E3F1247C6958862ACF03DA1B12
    @Test
    void testContentType() {
        MediaType expectedMediaType = MediaType.parse("application/json");
        when(mockResponseBody.contentType()).thenReturn(expectedMediaType);
        MediaType result = progressResponseBody.contentType();
        assertThat(result, is(expectedMediaType));
    }

    //BaseRock generated method id: ${testContentLength}, hash: 930C68AC2EF4F43BA3613ECCB85FBBDF
    @Test
    void testContentLength() {
        long expectedLength = 1000L;
        when(mockResponseBody.contentLength()).thenReturn(expectedLength);
        long result = progressResponseBody.contentLength();
        assertThat(result, is(expectedLength));
    }

    //BaseRock generated method id: ${testSource}, hash: 53C55A9AEE4281FEC4EC1F04EB8206B3
    @Test
    void testSource() throws IOException {
        when(mockResponseBody.source()).thenReturn(mockBufferedSource);
        BufferedSource result = progressResponseBody.source();
        assertNotNull(result);
        verify(mockResponseBody).source();
    }

    //BaseRock generated method id: ${testSourceWithMultipleCalls}, hash: 4A28C78B7088FC349D841D4EFFE92B1D
    @Test
    void testSourceWithMultipleCalls() throws IOException {
        when(mockResponseBody.source()).thenReturn(mockBufferedSource);
        BufferedSource result1 = progressResponseBody.source();
        BufferedSource result2 = progressResponseBody.source();
        assertNotNull(result1);
        assertNotNull(result2);
        assertSame(result1, result2);
        verify(mockResponseBody, times(1)).source();
    }

    //BaseRock generated method id: ${testSourceRead}, hash: E379907AC875843799321F12A4059B69
    @Disabled()
    @Test
    void testSourceRead() throws IOException {
        when(mockResponseBody.source()).thenReturn(mockBufferedSource);
        when(mockResponseBody.contentLength()).thenReturn(100L);
        BufferedSource source = progressResponseBody.source();
        Buffer sink = new Buffer();
        long bytesRead = 50L;
        when(mockBufferedSource.read(any(Buffer.class), anyLong())).thenReturn(bytesRead);
        long result = source.read(sink, 100L);
        assertEquals(bytesRead, result);
        verify(mockCallback).onDownloadProgress(50L, 100L, false);
    }

    //BaseRock generated method id: ${testSourceReadEndOfStream}, hash: 0378E89DAA3DA616857D2CE96E923586
    @Test
    void testSourceReadEndOfStream() throws IOException {
        when(mockResponseBody.source()).thenReturn(mockBufferedSource);
        when(mockResponseBody.contentLength()).thenReturn(100L);
        BufferedSource source = progressResponseBody.source();
        Buffer sink = new Buffer();
        when(mockBufferedSource.read(any(Buffer.class), anyLong())).thenReturn(-1L);
        long result = source.read(sink, 100L);
        assertThat(result, is(-1L));
        verify(mockCallback).onDownloadProgress(0L, 100L, true);
    }

    //BaseRock generated method id: ${testSourceReadMultipleTimes}, hash: C334FCE3AB1236BC46513AA551962AB3
    @Test
    void testSourceReadMultipleTimes() throws IOException {
        when(mockResponseBody.source()).thenReturn(mockBufferedSource);
        when(mockResponseBody.contentLength()).thenReturn(100L);
        BufferedSource source = progressResponseBody.source();
        Buffer sink = new Buffer();
        when(mockBufferedSource.read(any(Buffer.class), anyLong())).thenReturn(30L).thenReturn(20L).thenReturn(-1L);
        source.read(sink, 100L);
        source.read(sink, 100L);
        source.read(sink, 100L);
        verify(mockCallback).onDownloadProgress(30L, 100L, false);
        verify(mockCallback).onDownloadProgress(50L, 100L, false);
        verify(mockCallback).onDownloadProgress(50L, 100L, true);
    }

    //BaseRock generated method id: ${testSourceReadWithException}, hash: C62EACD8E34532F7D38468343519FE3A
    @Test
    void testSourceReadWithException() throws IOException {
        when(mockResponseBody.source()).thenReturn(mockBufferedSource);
        when(mockResponseBody.contentLength()).thenReturn(100L);
        BufferedSource source = progressResponseBody.source();
        Buffer sink = new Buffer();
        when(mockBufferedSource.read(any(Buffer.class), anyLong())).thenThrow(new IOException("Test exception"));
        assertThrows(IOException.class, () -> source.read(sink, 100L));
    }
}
