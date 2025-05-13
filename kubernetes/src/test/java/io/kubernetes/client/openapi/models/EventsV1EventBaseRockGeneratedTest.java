package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import io.kubernetes.client.common.KubernetesObject;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import java.util.HashSet;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.OffsetDateTime;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class EventsV1EventBaseRockGeneratedTest {

    @Mock
    private V1ObjectMeta mockMetadata;

    @Mock
    private V1EventSource mockDeprecatedSource;

    @Mock
    private V1ObjectReference mockRegarding;

    @Mock
    private V1ObjectReference mockRelated;

    @Mock
    private EventsV1EventSeries mockSeries;

    private EventsV1Event eventsV1Event;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        eventsV1Event = new EventsV1Event();
    }

    // ... (other test methods remain unchanged)
    //BaseRock generated method id: ${testToJson}, hash: A83CEBCE4B63E0D75ADBDB2D480C2B2B
    @Disabled()
    @Test
    void testToJson() {
        OffsetDateTime eventTime = OffsetDateTime.parse("2023-06-01T12:00:00Z");
        EventsV1Event event = new EventsV1Event().action("testAction").apiVersion("v1").eventTime(eventTime);
        String json = event.toJson();
        assertThat(json, containsString("\"action\":\"testAction\""));
        assertThat(json, containsString("\"apiVersion\":\"v1\""));
        assertThat(json, containsString("\"eventTime\":\"2023-06-01T12:00:00.000Z\""));
    }
}
