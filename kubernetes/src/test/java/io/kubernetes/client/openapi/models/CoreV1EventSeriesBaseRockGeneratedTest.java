package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import java.time.OffsetDateTime;
import io.kubernetes.client.openapi.models.CoreV1EventSeries;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class CoreV1EventSeriesBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: B2C77D6995C5AD90A6276FA679F996BE
    @Test
    void testConstructor() {
        CoreV1EventSeries eventSeries = new CoreV1EventSeries();
        assertNotNull(eventSeries);
    }

    //BaseRock generated method id: ${testSetAndGetCount}, hash: 65E3FB1F3D452B2C5FF009629122004B
    @Test
    void testSetAndGetCount() {
        CoreV1EventSeries eventSeries = new CoreV1EventSeries();
        Integer count = 5;
        eventSeries.setCount(count);
        assertEquals(count, eventSeries.getCount());
    }

    //BaseRock generated method id: ${testSetAndGetLastObservedTime}, hash: C42A6F1D12517326BD7941F035A5F753
    @Test
    void testSetAndGetLastObservedTime() {
        CoreV1EventSeries eventSeries = new CoreV1EventSeries();
        OffsetDateTime lastObservedTime = OffsetDateTime.now();
        eventSeries.setLastObservedTime(lastObservedTime);
        assertEquals(lastObservedTime, eventSeries.getLastObservedTime());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 98CF16D9411EFF0AF333F0B2D469AEDD
    @Test
    void testEqualsAndHashCode() {
        CoreV1EventSeries eventSeries1 = new CoreV1EventSeries().count(5).lastObservedTime(OffsetDateTime.parse("2023-01-01T12:00:00Z"));
        CoreV1EventSeries eventSeries2 = new CoreV1EventSeries().count(5).lastObservedTime(OffsetDateTime.parse("2023-01-01T12:00:00Z"));
        CoreV1EventSeries eventSeries3 = new CoreV1EventSeries().count(10).lastObservedTime(OffsetDateTime.parse("2023-02-01T12:00:00Z"));
        assertThat(eventSeries1, is(equalTo(eventSeries2)));
        assertThat(eventSeries1.hashCode(), is(equalTo(eventSeries2.hashCode())));
        assertThat(eventSeries1, is(notNullValue()));
        assertThat(eventSeries1, is(notNullValue()));
        assertThat(eventSeries1.equals(eventSeries3), is(false));
    }

    //BaseRock generated method id: ${testToString}, hash: A015DDB15CC6E404B90DD153453EEE9B
    @Test
    void testToString() {
        CoreV1EventSeries eventSeries = new CoreV1EventSeries().count(5).lastObservedTime(OffsetDateTime.parse("2023-01-01T12:00:00Z"));
        String expectedString = "class CoreV1EventSeries {\n    count: 5\n    lastObservedTime: 2023-01-01T12:00Z\n}";
        assertThat(eventSeries.toString().replaceAll("\\s+", " ").trim(), is(equalTo(expectedString.replaceAll("\\s+", " ").trim())));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 536BFF9930422F288AC15EB76ED52177
    @Test
    void testBuilder() {
        Integer count = 10;
        OffsetDateTime lastObservedTime = OffsetDateTime.parse("2023-03-01T15:30:00Z");
        CoreV1EventSeries eventSeries = new CoreV1EventSeries().count(count).lastObservedTime(lastObservedTime);
        assertThat(eventSeries.getCount(), is(equalTo(count)));
        assertThat(eventSeries.getLastObservedTime(), is(equalTo(lastObservedTime)));
    }
}
