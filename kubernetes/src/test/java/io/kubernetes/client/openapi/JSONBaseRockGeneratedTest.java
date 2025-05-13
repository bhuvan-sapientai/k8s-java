package io.kubernetes.client.openapi;

import org.junit.jupiter.params.provider.MethodSource;
import com.google.gson.Gson;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import com.google.gson.stream.JsonWriter;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.gson.V1MetadataExclusionStrategy;
import java.io.StringReader;
import java.sql.Date;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import java.time.LocalDate;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import java.io.IOException;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.google.gson.GsonBuilder;
import java.time.ZoneOffset;
import java.lang.reflect.Type;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import java.util.stream.Stream;
import org.junit.jupiter.api.Timeout;
import com.google.gson.stream.JsonReader;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.StringWriter;
import java.time.OffsetDateTime;
import org.junit.jupiter.params.provider.Arguments;
import io.gsonfire.GsonFireBuilder;
import static org.hamcrest.Matchers.startsWith;
import okio.ByteString;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class JSONBaseRockGeneratedTest {

    private JSON json;

    @Mock
    private GsonFireBuilder gsonFireBuilder;

    @Mock
    private GsonBuilder gsonBuilder;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        json = new JSON();
    }

    //BaseRock generated method id: ${testCreateGson}, hash: 8816034B7F7A5EF5B63C3C19FE55B231
    @Disabled()
    @Test
    void testCreateGson() {
        try (MockedStatic<JSON> mockedStatic = mockStatic(JSON.class)) {
            mockedStatic.when(JSON::createGson).thenCallRealMethod();
            GsonFireBuilder mockFireBuilder = mock(GsonFireBuilder.class);
            GsonBuilder mockBuilder = mock(GsonBuilder.class);
            when(mockFireBuilder.createGsonBuilder()).thenReturn(mockBuilder);
            when(mockBuilder.setExclusionStrategies(any(V1MetadataExclusionStrategy.class))).thenReturn(mockBuilder);
            mockedStatic.when(GsonFireBuilder::new).thenReturn(mockFireBuilder);
            GsonBuilder result = JSON.createGson();
            assertThat(result, is(notNullValue()));
            assertThat(result, is(instanceOf(GsonBuilder.class)));
            verify(mockFireBuilder).createGsonBuilder();
            verify(mockBuilder).setExclusionStrategies(any(V1MetadataExclusionStrategy.class));
        }
    }

    //BaseRock generated method id: ${testGetGson}, hash: A651CEAAB34AB7F0F54EBF8DFDA15BEA
    @Test
    void testGetGson() {
        Gson result = JSON.getGson();
        assertThat(result, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetGson}, hash: EFDB2FD81454A3262631ADC13386217F
    @Test
    void testSetGson() {
        Gson mockGson = mock(Gson.class);
        JSON.setGson(mockGson);
        assertThat(JSON.getGson(), is(equalTo(mockGson)));
    }

    //BaseRock generated method id: ${testSetLenientOnJson}, hash: 415924BCF2EF4A861A82DF77B69578E5
    @Test
    void testSetLenientOnJson() {
        assertDoesNotThrow(() -> JSON.setLenientOnJson(false));
    }

    //BaseRock generated method id: ${testSerialize}, hash: 2156E81B0BA1C6326046DC70DA78EC19
    @Test
    void testSerialize() {
        Object obj = new Object();
        String result = JSON.serialize(obj);
        assertThat(result, is(notNullValue()));
    }

    //BaseRock generated method id: ${testDeserialize}, hash: 47B2A80CB0898CE02128AF98C3EB1AC1
    @ParameterizedTest
    @MethodSource("provideDeserializeTestCases")
    void testDeserialize(String json, Type returnType, Object expected) {
        Object result = JSON.deserialize(json, returnType);
        assertThat(result, is(equalTo(expected)));
    }

    private static Stream<Arguments> provideDeserializeTestCases() {
        return Stream.of(Arguments.of("\"test\"", String.class, "test"), Arguments.of("42", Integer.class, 42), Arguments.of("true", Boolean.class, true));
    }

    //BaseRock generated method id: ${testByteArrayAdapter}, hash: D659530D5A5CA023C2D46281B2FE6520
    @Test
    void testByteArrayAdapter() throws IOException {
        JSON.ByteArrayAdapter adapter = new JSON.ByteArrayAdapter();
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        byte[] testBytes = "test".getBytes();
        adapter.write(writer, testBytes);
        String result = stringWriter.toString();
        assertThat(result, is(equalTo("\"dGVzdA==\"")));
        JsonReader reader = new JsonReader(new StringReader("\"dGVzdA==\""));
        byte[] readResult = adapter.read(reader);
        assertThat(readResult, is(equalTo(testBytes)));
    }

    //BaseRock generated method id: ${testOffsetDateTimeTypeAdapter}, hash: 1C035A2B67913F5693F77126A9EF99E0
    @Test
    void testOffsetDateTimeTypeAdapter() throws IOException {
        JSON.OffsetDateTimeTypeAdapter adapter = new JSON.OffsetDateTimeTypeAdapter();
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        OffsetDateTime testDateTime = OffsetDateTime.of(2023, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        adapter.write(writer, testDateTime);
        String result = stringWriter.toString();
        assertThat(result, is(equalTo("\"2023-01-01T12:00:00Z\"")));
        JsonReader reader = new JsonReader(new StringReader("\"2023-01-01T12:00:00Z\""));
        OffsetDateTime readResult = adapter.read(reader);
        assertThat(readResult, is(equalTo(testDateTime)));
    }

    //BaseRock generated method id: ${testLocalDateTypeAdapter}, hash: E086F0EC9F9A5F3D918AF627F6043A33
    @Test
    void testLocalDateTypeAdapter() throws IOException {
        JSON.LocalDateTypeAdapter adapter = new JSON.LocalDateTypeAdapter();
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        LocalDate testDate = LocalDate.of(2023, 1, 1);
        adapter.write(writer, testDate);
        String result = stringWriter.toString();
        assertThat(result, is(equalTo("\"2023-01-01\"")));
        JsonReader reader = new JsonReader(new StringReader("\"2023-01-01\""));
        LocalDate readResult = adapter.read(reader);
        assertThat(readResult, is(equalTo(testDate)));
    }

    //BaseRock generated method id: ${testSqlDateTypeAdapter}, hash: E914AFD95A0C699268C335D9128D09DC
    @Test
    void testSqlDateTypeAdapter() throws IOException {
        JSON.SqlDateTypeAdapter adapter = new JSON.SqlDateTypeAdapter();
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        Date testDate = Date.valueOf("2023-01-01");
        adapter.write(writer, testDate);
        String result = stringWriter.toString();
        assertThat(result, is(equalTo("\"2023-01-01\"")));
        JsonReader reader = new JsonReader(new StringReader("\"2023-01-01\""));
        Date readResult = adapter.read(reader);
        assertThat(readResult, is(equalTo(testDate)));
    }

    //BaseRock generated method id: ${testDateTypeAdapter}, hash: E005861B79D56A0D15F996086F23B382
    @Test
    void testDateTypeAdapter() throws IOException {
        JSON.DateTypeAdapter adapter = new JSON.DateTypeAdapter();
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        java.util.Date testDate = new java.util.Date(1672531200000L);
        adapter.write(writer, testDate);
        String result = stringWriter.toString();
        assertThat(result, is(equalTo("\"2023-01-01T00:00:00Z\"")));
        JsonReader reader = new JsonReader(new StringReader("\"2023-01-01T00:00:00Z\""));
        java.util.Date readResult = adapter.read(reader);
        assertThat((double) readResult.getTime(), is(closeTo((double) testDate.getTime(), 1000.0)));
    }

    //BaseRock generated method id: ${testSetDateFormat}, hash: 2FC10563DE71F7B60A90A5A45C994DAA
    @Test
    void testSetDateFormat() {
        assertDoesNotThrow(() -> JSON.setDateFormat(StdDateFormat.getInstance()));
    }

    //BaseRock generated method id: ${testSetSqlDateFormat}, hash: 35F66D7DA545C5ACB4F8CB2AD453F2CA
    @Test
    void testSetSqlDateFormat() {
        assertDoesNotThrow(() -> JSON.setSqlDateFormat(StdDateFormat.getInstance()));
    }
}
