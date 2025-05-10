package io.kubernetes.client.extended.event.legacy;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.*;
import com.github.benmanes.caffeine.cache.Caffeine;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.function.Function;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.OffsetDateTime;
import org.apache.commons.lang3.tuple.MutablePair;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class EventAggregatorBaseRockGeneratedTest {

    private EventAggregator eventAggregator;

    private Function<CoreV1Event, MutablePair<String, String>> mockKeyFunc;

    private Function<CoreV1Event, String> mockMessageFunc;

    @BeforeEach
    void setUp() {
        mockKeyFunc = mock(Function.class);
        mockMessageFunc = mock(Function.class);
        eventAggregator = new EventAggregator(100, mockKeyFunc, mockMessageFunc);
    }

    //BaseRock generated method id: ${testConstructor}, hash: EEB33272C30732C71901694270D9EF48
    @Test
    void testConstructor() {
        assertNotNull(eventAggregator);
        assertEquals(EventAggregator.DEFAULT_MAX_EVENT_LOCAL_KEYS, eventAggregator.getMaxEvents());
    }

    //BaseRock generated method id: ${testAggregate}, hash: B0A19BD093B3BBA1902FDBC5B2E8AB1E
    @Disabled()
    @Test
    void testAggregate() {
        CoreV1Event mockEvent = mock(CoreV1Event.class);
        V1ObjectReference mockInvolvedObject = mock(V1ObjectReference.class);
        when(mockEvent.getInvolvedObject()).thenReturn(mockInvolvedObject);
        when(mockInvolvedObject.getName()).thenReturn("testObject");
        when(mockInvolvedObject.getNamespace()).thenReturn("testNamespace");
        MutablePair<String, String> mockPair = new MutablePair<>("aggregatedKey", "localKey");
        doReturn(mockPair).when(mockKeyFunc).apply(any(CoreV1Event.class));
        doReturn("testMessage").when(mockMessageFunc).apply(any(CoreV1Event.class));
        try (MockedStatic<EventUtils> mockedEventUtils = mockStatic(EventUtils.class)) {
            mockedEventUtils.when(() -> EventUtils.generateName(any(), any())).thenReturn("generatedName");
            mockedEventUtils.when(() -> EventUtils.getEventKey(any())).thenReturn("eventKey");
            MutablePair<CoreV1Event, String> result = eventAggregator.aggregate(mockEvent);
            assertNotNull(result);
            assertEquals("eventKey", result.getRight());
            CoreV1Event aggregatedEvent = result.getLeft();
            assertNotNull(aggregatedEvent);
            assertEquals(1, aggregatedEvent.getCount());
            assertEquals("testMessage", aggregatedEvent.getMessage());
            verify(mockKeyFunc, times(1)).apply(mockEvent);
            verify(mockMessageFunc, times(1)).apply(mockEvent);
        }
    }

    //BaseRock generated method id: ${testAggregateWithMaxEventsReached}, hash: 69EA452994B3AC3F5E5E251557FE735D
    @Disabled()
    @Test
    void testAggregateWithMaxEventsReached() {
        EventAggregator eventAggregator = new EventAggregator(1, mockKeyFunc, mockMessageFunc);
        CoreV1Event mockEvent = mock(CoreV1Event.class);
        V1ObjectReference mockInvolvedObject = mock(V1ObjectReference.class);
        when(mockEvent.getInvolvedObject()).thenReturn(mockInvolvedObject);
        when(mockInvolvedObject.getName()).thenReturn("testObject");
        when(mockInvolvedObject.getNamespace()).thenReturn("testNamespace");
        MutablePair<String, String> mockPair = new MutablePair<>("aggregatedKey", "localKey");
        doReturn(mockPair).when(mockKeyFunc).apply(any(CoreV1Event.class));
        doReturn("testMessage").when(mockMessageFunc).apply(any(CoreV1Event.class));
        try (MockedStatic<EventUtils> mockedEventUtils = mockStatic(EventUtils.class)) {
            mockedEventUtils.when(() -> EventUtils.generateName(any(), any())).thenReturn("generatedName");
            mockedEventUtils.when(() -> EventUtils.getEventKey(any())).thenReturn("eventKey");
            // First call to fill the cache
            eventAggregator.aggregate(mockEvent);
            // Second call to trigger aggregation
            MutablePair<CoreV1Event, String> result = eventAggregator.aggregate(mockEvent);
            assertNotNull(result);
            assertEquals("eventKey", result.getRight());
            CoreV1Event aggregatedEvent = result.getLeft();
            assertNotNull(aggregatedEvent);
            assertEquals(1, aggregatedEvent.getCount());
            assertEquals("testMessage", aggregatedEvent.getMessage());
            verify(mockKeyFunc, times(2)).apply(mockEvent);
            verify(mockMessageFunc, times(2)).apply(mockEvent);
        }
    }

    //BaseRock generated method id: ${testGetMaxEvents}, hash: 1491F280D8EC3E36EBA6C0818B1C1227
    @Test
    void testGetMaxEvents() {
        assertEquals(EventAggregator.DEFAULT_MAX_EVENT_LOCAL_KEYS, eventAggregator.getMaxEvents());
    }

    //BaseRock generated method id: ${testCacheExpiration}, hash: 53381005E42979105818DD0D7A8925AB
    @Disabled()
    @Test
    void testCacheExpiration() {
        EventAggregator eventAggregator = new EventAggregator(100, mockKeyFunc, mockMessageFunc);
        CoreV1Event mockEvent = new CoreV1EventBuilder().withInvolvedObject(new V1ObjectReference()).withMetadata(new V1ObjectMeta()).build();
        MutablePair<String, String> mockPair = new MutablePair<>("aggregatedKey", "localKey");
        doReturn(mockPair).when(mockKeyFunc).apply(any(CoreV1Event.class));
        try (MockedStatic<EventUtils> mockedEventUtils = mockStatic(EventUtils.class)) {
            mockedEventUtils.when(() -> EventUtils.generateName(any(), any())).thenReturn("generatedName");
            mockedEventUtils.when(() -> EventUtils.getEventKey(any())).thenReturn("eventKey");
            eventAggregator.aggregate(mockEvent);
            // Wait for cache expiration
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            MutablePair<CoreV1Event, String> result = eventAggregator.aggregate(mockEvent);
            assertNotNull(result);
            assertEquals("eventKey", result.getRight());
            CoreV1Event aggregatedEvent = result.getLeft();
            assertNotNull(aggregatedEvent);
            assertEquals(1, aggregatedEvent.getCount());
        }
    }

    //BaseRock generated method id: ${testAggregateWithNullEvent}, hash: 9D276925BF556AF6223B2B0BA3499BE2
    @Test
    void testAggregateWithNullEvent() {
        try (MockedStatic<EventUtils> mockedEventUtils = mockStatic(EventUtils.class)) {
            mockedEventUtils.when(() -> EventUtils.generateName(any(), any())).thenReturn("generatedName");
            mockedEventUtils.when(() -> EventUtils.getEventKey(any())).thenReturn("eventKey");
            assertThrows(NullPointerException.class, () -> eventAggregator.aggregate(null));
        }
    }

    //BaseRock generated method id: ${testAggregateWithEmptyEvent}, hash: 049AEE3EDAA8EC94473DDAC681097C8A
    @Test
    void testAggregateWithEmptyEvent() {
        CoreV1Event emptyEvent = new CoreV1Event();
        MutablePair<String, String> mockPair = new MutablePair<>("aggregatedKey", "localKey");
        doReturn(mockPair).when(mockKeyFunc).apply(any(CoreV1Event.class));
        try (MockedStatic<EventUtils> mockedEventUtils = mockStatic(EventUtils.class)) {
            mockedEventUtils.when(() -> EventUtils.generateName(any(), any())).thenReturn("generatedName");
            mockedEventUtils.when(() -> EventUtils.getEventKey(any())).thenReturn("eventKey");
            MutablePair<CoreV1Event, String> result = eventAggregator.aggregate(emptyEvent);
            assertNotNull(result);
            assertNotNull(result.getLeft());
            assertEquals("eventKey", result.getRight());
        }
    }
}
