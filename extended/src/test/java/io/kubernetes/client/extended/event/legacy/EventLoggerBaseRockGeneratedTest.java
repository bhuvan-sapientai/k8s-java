package io.kubernetes.client.extended.event.legacy;

import io.kubernetes.client.openapi.ApiClient;
import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.CoreV1Event;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.function.Function;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.OffsetDateTime;
import org.apache.commons.lang3.tuple.MutablePair;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.openapi.JSON;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class EventLoggerBaseRockGeneratedTest {

    @Mock
    private Function<CoreV1Event, String> eventKeyFunc;

    private EventLogger eventLogger;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        eventLogger = new EventLogger(100, eventKeyFunc);
    }

    //BaseRock generated method id: ${testObserveWithNewEvent}, hash: 63F00B969D18F96611377C18C7E5AF8D
    @Disabled()
    @Test
    void testObserveWithNewEvent() {
        CoreV1Event event = new CoreV1Event();
        V1ObjectMeta metadata = new V1ObjectMeta();
        metadata.setName("testEvent");
        metadata.setResourceVersion("1");
        event.setMetadata(metadata);
        event.setFirstTimestamp(OffsetDateTime.now());
        event.setCount(1);
        event.setMessage("Test message");
        String key = "testKey";
        when(eventKeyFunc.apply(event)).thenReturn(key);
        try (MockedStatic<Configuration> configurationMockedStatic = mockStatic(Configuration.class)) {
            ApiClient apiClient = mock(ApiClient.class);
            JSON json = mock(JSON.class);
            when(apiClient.getJSON()).thenReturn(json);
            when(json.serialize(any(OffsetDateTime.class))).thenReturn("\"2023-05-24T10:15:30Z\"");
            configurationMockedStatic.when(Configuration::getDefaultApiClient).thenReturn(apiClient);
            MutablePair<CoreV1Event, V1Patch> result = eventLogger.observe(event, key);
            assertNotNull(result);
            assertEquals(event, result.getLeft());
            assertNull(result.getRight());
        }
    }

    //BaseRock generated method id: ${testObserveWithExistingEvent}, hash: 3FB068DA3D7F97D79B063CFE91A618DD
    @Disabled()
    @Test
    void testObserveWithExistingEvent() {
        CoreV1Event event = new CoreV1Event();
        V1ObjectMeta metadata = new V1ObjectMeta();
        metadata.setName("testEvent");
        metadata.setResourceVersion("1");
        event.setMetadata(metadata);
        event.setFirstTimestamp(OffsetDateTime.now());
        event.setCount(1);
        event.setMessage("Test message");
        String key = "testKey";
        when(eventKeyFunc.apply(event)).thenReturn(key);
        try (MockedStatic<Configuration> configurationMockedStatic = mockStatic(Configuration.class)) {
            ApiClient apiClient = mock(ApiClient.class);
            JSON json = mock(JSON.class);
            when(apiClient.getJSON()).thenReturn(json);
            when(json.serialize(any(OffsetDateTime.class))).thenReturn("\"2023-05-24T10:15:30Z\"");
            configurationMockedStatic.when(Configuration::getDefaultApiClient).thenReturn(apiClient);
            // First observe to create the event in cache
            eventLogger.observe(event, key);
            // Second observe to trigger the existing event path
            MutablePair<CoreV1Event, V1Patch> result = eventLogger.observe(event, key);
            assertNotNull(result);
            assertEquals(event, result.getLeft());
            assertNotNull(result.getRight());
            assertEquals("{\"message\":\"Test message\",\"count\":2,\"lastTimestamp\":\"2023-05-24T10:15:30Z\"}", result.getRight().getValue());
        }
    }

    //BaseRock generated method id: ${testUpdateState}, hash: 947B9ACD4E67D33252FCE745996FCECA
    @Test
    void testUpdateState() {
        CoreV1Event event = new CoreV1Event();
        V1ObjectMeta metadata = new V1ObjectMeta();
        metadata.setName("testEvent");
        metadata.setResourceVersion("1");
        event.setMetadata(metadata);
        event.setFirstTimestamp(OffsetDateTime.now());
        event.setCount(1);
        String key = "testKey";
        when(eventKeyFunc.apply(event)).thenReturn(key);
        eventLogger.updateState(event);
        // We can't directly verify the cache update due to private access,
        // but we can indirectly test it by observing the event again
        MutablePair<CoreV1Event, V1Patch> result = eventLogger.observe(event, key);
        assertNotNull(result);
        assertEquals(event, result.getLeft());
        assertNotNull(result.getRight());
    }

    //BaseRock generated method id: ${testBuildEventPatch}, hash: D6918D280F81754018A54FD88844B731
    @Disabled()
    @Test
    void testBuildEventPatch() {
        int count = 2;
        String message = "Test message";
        OffsetDateTime now = OffsetDateTime.now();
        try (MockedStatic<Configuration> configurationMockedStatic = mockStatic(Configuration.class)) {
            ApiClient apiClient = mock(ApiClient.class);
            JSON json = mock(JSON.class);
            when(apiClient.getJSON()).thenReturn(json);
            when(json.serialize(any(OffsetDateTime.class))).thenReturn("\"2023-05-24T10:15:30Z\"");
            configurationMockedStatic.when(Configuration::getDefaultApiClient).thenReturn(apiClient);
            V1Patch patch = EventLogger.buildEventPatch(count, message, now);
            assertNotNull(patch);
            assertEquals("{\"message\":\"Test message\",\"count\":2,\"lastTimestamp\":\"2023-05-24T10:15:30Z\"}", patch.getValue());
        }
    }
}
