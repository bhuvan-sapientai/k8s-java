package io.kubernetes.client.extended.event.legacy;

import org.junit.jupiter.api.BeforeEach;
import io.kubernetes.client.util.PatchUtils;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1EventSource;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.concurrent.ExecutorService;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import java.util.concurrent.Executors;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class LegacyEventBroadcasterBaseRockGeneratedTest {

    @Mock
    private CoreV1Api coreV1Api;

    @Mock
    private EventCorrelator eventCorrelator;

    @Mock
    private EventSink eventSink;

    @Mock
    private ExecutorService executorService;

    private LegacyEventBroadcaster legacyEventBroadcaster;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        legacyEventBroadcaster = new LegacyEventBroadcaster(eventCorrelator, eventSink);
    }

    //BaseRock generated method id: ${testConstructorWithCoreV1Api}, hash: 53F9932FFB8ECC1647DDDC57D9362B64
    @Test
    void testConstructorWithCoreV1Api() {
        try (MockedStatic<PatchUtils> patchUtilsMockedStatic = mockStatic(PatchUtils.class)) {
            LegacyEventBroadcaster broadcaster = new LegacyEventBroadcaster(coreV1Api);
            assertThat(broadcaster, is(notNullValue()));
        }
    }

    //BaseRock generated method id: ${testNewRecorder}, hash: 125E92B61C8EBA13BAAA658239051EDD
    @Test
    void testNewRecorder() {
        V1EventSource eventSource = new V1EventSource();
        EventRecorder recorder = legacyEventBroadcaster.newRecorder(eventSource);
        assertThat(recorder, is(notNullValue()));
        assertThat(recorder, instanceOf(ObjectReferenceResolvingEventRecorder.class));
    }

    //BaseRock generated method id: ${testStartRecording}, hash: BCBCAFF9D425091D34C9E44A82BFF428
    @Test
    void testStartRecording() {
        try (MockedStatic<Executors> executorsMockedStatic = mockStatic(Executors.class)) {
            executorsMockedStatic.when(Executors::newSingleThreadExecutor).thenReturn(executorService);
            legacyEventBroadcaster = new LegacyEventBroadcaster(eventCorrelator, eventSink);
            legacyEventBroadcaster.startRecording();
            verify(executorService, times(1)).submit(any(Runnable.class));
        }
    }

    //BaseRock generated method id: ${testShutdown}, hash: 9EAF3008052FD5CCA06F8305DA44FD85
    @Test
    void testShutdown() {
        try (MockedStatic<Executors> executorsMockedStatic = mockStatic(Executors.class)) {
            executorsMockedStatic.when(Executors::newSingleThreadExecutor).thenReturn(executorService);
            legacyEventBroadcaster = new LegacyEventBroadcaster(eventCorrelator, eventSink);
            legacyEventBroadcaster.shutdown();
            verify(executorService, times(1)).shutdown();
        }
    }
}
