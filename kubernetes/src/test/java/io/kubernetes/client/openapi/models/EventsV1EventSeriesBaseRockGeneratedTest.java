package io.kubernetes.client.openapi.models;

import com.google.gson.Gson;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import java.time.OffsetDateTime;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class EventsV1EventSeriesBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructorAndGetters}, hash: DAB780B23099BE7DA9D910094C88532D
    @Test
    void testConstructorAndGetters() {
        Integer count = 5;
        OffsetDateTime lastObservedTime = OffsetDateTime.now();
        EventsV1EventSeries eventSeries = new EventsV1EventSeries().count(count).lastObservedTime(lastObservedTime);
        assertThat(eventSeries.getCount(), is(equalTo(count)));
        assertThat(eventSeries.getLastObservedTime(), is(equalTo(lastObservedTime)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 63396E7010EC55D41BBD2079BE1083CC
    @Test
    void testEquals() {
        OffsetDateTime time = OffsetDateTime.now();
        EventsV1EventSeries series1 = new EventsV1EventSeries().count(1).lastObservedTime(time);
        EventsV1EventSeries series2 = new EventsV1EventSeries().count(1).lastObservedTime(time);
        EventsV1EventSeries series3 = new EventsV1EventSeries().count(2).lastObservedTime(time);
        assertThat(series1.equals(series2), is(true));
        assertThat(series1.equals(series3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 958024AA4EE955A5AFEA920EB1AABFA0
    @Test
    void testHashCode() {
        OffsetDateTime time = OffsetDateTime.now();
        EventsV1EventSeries series1 = new EventsV1EventSeries().count(1).lastObservedTime(time);
        EventsV1EventSeries series2 = new EventsV1EventSeries().count(1).lastObservedTime(time);
        assertThat(series1.hashCode(), is(equalTo(series2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: C0FCF25864965E35CA04098D12B8707E
    @Test
    void testToString() {
        OffsetDateTime time = OffsetDateTime.now();
        EventsV1EventSeries series = new EventsV1EventSeries().count(1).lastObservedTime(time);
        String expectedString = "class EventsV1EventSeries {\n    count: 1\n    lastObservedTime: " + time + "\n}";
        assertThat(series.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testSetCount}, hash: BD284FBBB44799E2DF99680A12DD42ED
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 100 })
    void testSetCount(int count) {
        EventsV1EventSeries series = new EventsV1EventSeries().count(count);
        assertThat(series.getCount(), is(equalTo(count)));
    }

    //BaseRock generated method id: ${testSetLastObservedTime}, hash: F5C22D733E07863B0D46FD918ABF6561
    @Test
    void testSetLastObservedTime() {
        OffsetDateTime time = OffsetDateTime.now();
        EventsV1EventSeries series = new EventsV1EventSeries().lastObservedTime(time);
        assertThat(series.getLastObservedTime(), is(equalTo(time)));
    }

    //BaseRock generated method id: ${testNullCount}, hash: FFB0264793820FE727C79FBD27C0924C
    @Test
    void testNullCount() {
        EventsV1EventSeries series = new EventsV1EventSeries();
        assertThat(series.count(null).getCount(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testNullLastObservedTime}, hash: A1B0A5D78E3A9DA9AE8E5BC17CB15B9E
    @Test
    void testNullLastObservedTime() {
        EventsV1EventSeries series = new EventsV1EventSeries();
        assertThat(series.lastObservedTime(null).getLastObservedTime(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentTypes}, hash: E60508433190B3F9305EB3B516EB8781
    @Test
    void testEqualsWithDifferentTypes() {
        EventsV1EventSeries series = new EventsV1EventSeries().count(1).lastObservedTime(OffsetDateTime.now());
        assertThat(series.equals("Not an EventsV1EventSeries"), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: B713DED7D68D517FD2006F59DD2D11C2
    @Test
    void testEqualsWithNull() {
        EventsV1EventSeries series = new EventsV1EventSeries().count(1).lastObservedTime(OffsetDateTime.now());
        assertThat(series.equals(null), is(false));
    }

    //BaseRock generated method id: ${testHashCodeConsistency}, hash: C71016F3BB5100693DA87FB47041D175
    @Test
    void testHashCodeConsistency() {
        EventsV1EventSeries series = new EventsV1EventSeries().count(1).lastObservedTime(OffsetDateTime.now());
        int initialHashCode = series.hashCode();
        assertThat(series.hashCode(), is(equalTo(initialHashCode)));
        assertThat(series.hashCode(), is(equalTo(initialHashCode)));
    }

    //BaseRock generated method id: ${testToStringNullValues}, hash: 9D6D06625A2CDC11DC24A6163B82EA39
    @Test
    void testToStringNullValues() {
        EventsV1EventSeries series = new EventsV1EventSeries();
        String expectedString = "class EventsV1EventSeries {\n    count: null\n    lastObservedTime: null\n}";
        assertThat(series.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testValidation}, hash: 3EAA638E02BF8DB322B1D010DB9412E6
    @Test
    void testValidation() throws Exception {
        EventsV1EventSeries series = new EventsV1EventSeries();
        JsonElement jsonElement = new Gson().toJsonTree(series);
        assertThrows(IllegalArgumentException.class, () -> EventsV1EventSeries.validateJsonElement(jsonElement));
    }

    //BaseRock generated method id: ${testValidJsonElement}, hash: 362B1D5242AF5CE47D2E7D767928D728
    @Test
    void testValidJsonElement() throws Exception {
        EventsV1EventSeries series = new EventsV1EventSeries().count(1).lastObservedTime(OffsetDateTime.now());
        JsonElement jsonElement = new Gson().toJsonTree(series);
        EventsV1EventSeries.validateJsonElement(jsonElement);
    }

    //BaseRock generated method id: ${testFromJson}, hash: 0B830DF3B63B3BCBBB66F98C6DAF7937
    @Test
    void testFromJson() throws Exception {
        String json = "{\"count\":1,\"lastObservedTime\":\"2023-01-01T00:00:00Z\"}";
        EventsV1EventSeries series = EventsV1EventSeries.fromJson(json);
        assertThat(series, is(notNullValue()));
        assertThat(series.getCount(), is(equalTo(1)));
        assertThat(series.getLastObservedTime(), is(equalTo(OffsetDateTime.parse("2023-01-01T00:00:00Z"))));
    }

    //BaseRock generated method id: ${testToJson}, hash: 4288338EF071F9F0AFEE6D797DE85904
    @Disabled()
    @Test
    void testToJson() throws Exception {
        EventsV1EventSeries series = new EventsV1EventSeries().count(1).lastObservedTime(OffsetDateTime.parse("2023-01-01T00:00:00Z"));
        String json = series.toJson();
        assertThat(json, is(equalTo("{\"count\":1,\"lastObservedTime\":\"2023-01-01T00:00:00Z\"}")));
    }
}
