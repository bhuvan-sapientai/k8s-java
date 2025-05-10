package io.kubernetes.client.extended.event.legacy;

import org.junit.jupiter.api.BeforeEach;
import java.util.Optional;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import java.util.function.Predicate;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.CoreV1Event;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.lang3.tuple.MutablePair;
import io.kubernetes.client.custom.V1Patch;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class EventCorrelatorBaseRockGeneratedTest {

    @Mock
    private EventAggregator mockAggregator;

    @Mock
    private EventLogger mockLogger;

    @Mock
    private Predicate<CoreV1Event> mockFilter;

    private EventCorrelator eventCorrelator;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        eventCorrelator = new EventCorrelator();
        eventCorrelator.aggregator = mockAggregator;
        eventCorrelator.logger = mockLogger;
        eventCorrelator.filter = mockFilter;
    }

    //BaseRock generated method id: ${testCorrelateWhenFilterReturnsTrue}, hash: 687C56921DEB35674A416592C4160379
    @Test
    void testCorrelateWhenFilterReturnsTrue() {
        CoreV1Event event = new CoreV1Event();
        MutablePair<CoreV1Event, String> aggregatorResult = new MutablePair<>(event, "cacheKey");
        MutablePair<CoreV1Event, V1Patch> loggerResult = new MutablePair<>(event, new V1Patch(""));
        when(mockAggregator.aggregate(event)).thenReturn(aggregatorResult);
        when(mockLogger.observe(event, "cacheKey")).thenReturn(loggerResult);
        when(mockFilter.test(event)).thenReturn(true);
        Optional<MutablePair<CoreV1Event, V1Patch>> result = eventCorrelator.correlate(event);
        assertTrue(result.isPresent());
        assertEquals(loggerResult, result.get());
        verify(mockAggregator).aggregate(event);
        verify(mockLogger).observe(event, "cacheKey");
        verify(mockFilter).test(event);
    }

    //BaseRock generated method id: ${testCorrelateWhenFilterReturnsFalse}, hash: 1B8BE3F94529A9B3FFF45BF5EFE874BA
    @Test
    void testCorrelateWhenFilterReturnsFalse() {
        CoreV1Event event = new CoreV1Event();
        MutablePair<CoreV1Event, String> aggregatorResult = new MutablePair<>(event, "cacheKey");
        when(mockAggregator.aggregate(event)).thenReturn(aggregatorResult);
        when(mockFilter.test(event)).thenReturn(false);
        Optional<MutablePair<CoreV1Event, V1Patch>> result = eventCorrelator.correlate(event);
        assertFalse(result.isPresent());
        verify(mockAggregator).aggregate(event);
        verify(mockLogger).observe(event, "cacheKey");
        verify(mockFilter).test(event);
    }

    //BaseRock generated method id: ${testUpdateState}, hash: 97BE4CCA49684509285C042F86EE9747
    @Test
    void testUpdateState() {
        CoreV1Event event = new CoreV1Event();
        eventCorrelator.updateState(event);
        verify(mockLogger).updateState(event);
    }

    //BaseRock generated method id: ${testConstructor}, hash: 514BA5263B41DFF8CEDED5C5827269E5
    @Test
    void testConstructor() {
        EventCorrelator correlator = new EventCorrelator();
        assertNotNull(correlator.aggregator);
        assertNotNull(correlator.filter);
        assertNotNull(correlator.logger);
    }
}
