package io.kubernetes.client.extended.event.legacy;

import io.kubernetes.client.common.KubernetesObject;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.endsWith;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.BlockingQueue;
import io.kubernetes.client.openapi.models.*;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.util.Strings;
import static org.hamcrest.Matchers.*;
import java.time.OffsetDateTime;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import io.kubernetes.client.extended.event.EventType;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class ObjectReferenceResolvingEventRecorderBaseRockGeneratedTest {

    @Mock
    private BlockingQueue<CoreV1Event> mockQueue;

    @Mock
    private V1EventSource mockEventSource;

    @Mock
    private KubernetesObject mockKubernetesObject;

    @Mock
    private V1ObjectMeta mockObjectMeta;

    private ObjectReferenceResolvingEventRecorder eventRecorder;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        eventRecorder = new ObjectReferenceResolvingEventRecorder(mockQueue, mockEventSource);
    }

    //BaseRock generated method id: ${testEventWithKubernetesObject}, hash: 83C829574E10CBF25851A5BB891CEFD9
    @Test
    void testEventWithKubernetesObject() throws InterruptedException {
        when(mockKubernetesObject.getApiVersion()).thenReturn("v1");
        when(mockKubernetesObject.getKind()).thenReturn("Pod");
        when(mockKubernetesObject.getMetadata()).thenReturn(mockObjectMeta);
        when(mockObjectMeta.getUid()).thenReturn("123");
        when(mockObjectMeta.getNamespace()).thenReturn("default");
        when(mockObjectMeta.getName()).thenReturn("test-pod");
        when(mockObjectMeta.getResourceVersion()).thenReturn("1");
        try (MockedStatic<EventUtils> eventUtilsMockedStatic = mockStatic(EventUtils.class)) {
            eventUtilsMockedStatic.when(() -> EventUtils.generateName(anyString(), any(OffsetDateTime.class))).thenReturn("generated-name");
            doReturn(true).when(mockQueue).offer(any(CoreV1Event.class), anyLong(), any(TimeUnit.class));
            eventRecorder.event(mockKubernetesObject, EventType.Normal, "TestReason", "Test message");
            verify(mockQueue, times(1)).offer(any(CoreV1Event.class), eq(100L), eq(TimeUnit.MILLISECONDS));
        }
    }

    //BaseRock generated method id: ${testEventWithKubernetesObjectAndAnnotations}, hash: 58128348EC5D235A3759DF9A74D0E41D
    @Test
    void testEventWithKubernetesObjectAndAnnotations() throws InterruptedException {
        when(mockKubernetesObject.getApiVersion()).thenReturn("v1");
        when(mockKubernetesObject.getKind()).thenReturn("Pod");
        when(mockKubernetesObject.getMetadata()).thenReturn(mockObjectMeta);
        when(mockObjectMeta.getUid()).thenReturn("123");
        when(mockObjectMeta.getNamespace()).thenReturn("default");
        when(mockObjectMeta.getName()).thenReturn("test-pod");
        when(mockObjectMeta.getResourceVersion()).thenReturn("1");
        Map<String, String> annotations = new HashMap<>();
        annotations.put("key", "value");
        try (MockedStatic<EventUtils> eventUtilsMockedStatic = mockStatic(EventUtils.class)) {
            eventUtilsMockedStatic.when(() -> EventUtils.generateName(anyString(), any(OffsetDateTime.class))).thenReturn("generated-name");
            doReturn(true).when(mockQueue).offer(any(CoreV1Event.class), anyLong(), any(TimeUnit.class));
            eventRecorder.event(mockKubernetesObject, annotations, EventType.Normal, "TestReason", "Test message");
            verify(mockQueue, times(1)).offer(any(CoreV1Event.class), eq(100L), eq(TimeUnit.MILLISECONDS));
        }
    }

    //BaseRock generated method id: ${testEventWithObjectReference}, hash: EDBF132F2B6AF99D0FE5027F9C56CD0E
    @Test
    void testEventWithObjectReference() throws InterruptedException {
        V1ObjectReference objectReference = new V1ObjectReference();
        objectReference.setApiVersion("v1");
        objectReference.setKind("Pod");
        objectReference.setUid("123");
        objectReference.setNamespace("default");
        objectReference.setName("test-pod");
        objectReference.setResourceVersion("1");
        try (MockedStatic<EventUtils> eventUtilsMockedStatic = mockStatic(EventUtils.class)) {
            eventUtilsMockedStatic.when(() -> EventUtils.generateName(anyString(), any(OffsetDateTime.class))).thenReturn("generated-name");
            doReturn(true).when(mockQueue).offer(any(CoreV1Event.class), anyLong(), any(TimeUnit.class));
            eventRecorder.event(objectReference, EventType.Normal, "TestReason", "Test message");
            verify(mockQueue, times(1)).offer(any(CoreV1Event.class), eq(100L), eq(TimeUnit.MILLISECONDS));
        }
    }

    //BaseRock generated method id: ${testEventWithObjectReferenceAndAnnotations}, hash: ECC336D4AD4DCF379961794A966169BE
    @Test
    void testEventWithObjectReferenceAndAnnotations() throws InterruptedException {
        V1ObjectReference objectReference = new V1ObjectReference();
        objectReference.setApiVersion("v1");
        objectReference.setKind("Pod");
        objectReference.setUid("123");
        objectReference.setNamespace("default");
        objectReference.setName("test-pod");
        objectReference.setResourceVersion("1");
        Map<String, String> annotations = new HashMap<>();
        annotations.put("key", "value");
        try (MockedStatic<EventUtils> eventUtilsMockedStatic = mockStatic(EventUtils.class)) {
            eventUtilsMockedStatic.when(() -> EventUtils.generateName(anyString(), any(OffsetDateTime.class))).thenReturn("generated-name");
            doReturn(true).when(mockQueue).offer(any(CoreV1Event.class), anyLong(), any(TimeUnit.class));
            eventRecorder.event(objectReference, annotations, EventType.Normal, "TestReason", "Test message");
            verify(mockQueue, times(1)).offer(any(CoreV1Event.class), eq(100L), eq(TimeUnit.MILLISECONDS));
        }
    }

    //BaseRock generated method id: ${testEventWithNullNamespace}, hash: 3F06D5E64DCB9834CCAD4903AEA7A608
    @Test
    void testEventWithNullNamespace() throws InterruptedException {
        V1ObjectReference objectReference = new V1ObjectReference();
        objectReference.setApiVersion("v1");
        objectReference.setKind("Pod");
        objectReference.setUid("123");
        objectReference.setName("test-pod");
        objectReference.setResourceVersion("1");
        try (MockedStatic<EventUtils> eventUtilsMockedStatic = mockStatic(EventUtils.class);
            MockedStatic<Strings> stringsMockedStatic = mockStatic(Strings.class)) {
            eventUtilsMockedStatic.when(() -> EventUtils.generateName(anyString(), any(OffsetDateTime.class))).thenReturn("generated-name");
            stringsMockedStatic.when(() -> Strings.isNullOrEmpty(any())).thenReturn(true);
            doReturn(true).when(mockQueue).offer(any(CoreV1Event.class), anyLong(), any(TimeUnit.class));
            eventRecorder.event(objectReference, EventType.Normal, "TestReason", "Test message");
            verify(mockQueue, times(1)).offer(any(CoreV1Event.class), eq(100L), eq(TimeUnit.MILLISECONDS));
        }
    }

    //BaseRock generated method id: ${testEventQueueOfferTimeout}, hash: 1FE71A4A541699A3532878C03A4903D6
    @Test
    void testEventQueueOfferTimeout() throws InterruptedException {
        when(mockKubernetesObject.getApiVersion()).thenReturn("v1");
        when(mockKubernetesObject.getKind()).thenReturn("Pod");
        when(mockKubernetesObject.getMetadata()).thenReturn(mockObjectMeta);
        when(mockObjectMeta.getUid()).thenReturn("123");
        when(mockObjectMeta.getNamespace()).thenReturn("default");
        when(mockObjectMeta.getName()).thenReturn("test-pod");
        when(mockObjectMeta.getResourceVersion()).thenReturn("1");
        try (MockedStatic<EventUtils> eventUtilsMockedStatic = mockStatic(EventUtils.class)) {
            eventUtilsMockedStatic.when(() -> EventUtils.generateName(anyString(), any(OffsetDateTime.class))).thenReturn("generated-name");
            doReturn(false).when(mockQueue).offer(any(CoreV1Event.class), anyLong(), any(TimeUnit.class));
            eventRecorder.event(mockKubernetesObject, EventType.Normal, "TestReason", "Test message");
            verify(mockQueue, times(1)).offer(any(CoreV1Event.class), eq(100L), eq(TimeUnit.MILLISECONDS));
        }
    }

    //BaseRock generated method id: ${testConstructObjectReference}, hash: A8B6B0F79EF556A249D779B714EC9F58
    @Test
    void testConstructObjectReference() throws InterruptedException {
        when(mockKubernetesObject.getApiVersion()).thenReturn("v1");
        when(mockKubernetesObject.getKind()).thenReturn("Pod");
        when(mockKubernetesObject.getMetadata()).thenReturn(mockObjectMeta);
        when(mockObjectMeta.getUid()).thenReturn("123");
        when(mockObjectMeta.getNamespace()).thenReturn("default");
        when(mockObjectMeta.getName()).thenReturn("test-pod");
        when(mockObjectMeta.getResourceVersion()).thenReturn("1");
        try (MockedStatic<EventUtils> eventUtilsMockedStatic = mockStatic(EventUtils.class)) {
            eventUtilsMockedStatic.when(() -> EventUtils.generateName(anyString(), any(OffsetDateTime.class))).thenReturn("generated-name");
            doReturn(true).when(mockQueue).offer(any(CoreV1Event.class), anyLong(), any(TimeUnit.class));
            eventRecorder.event(mockKubernetesObject, EventType.Normal, "TestReason", "Test message");
            verify(mockQueue, times(1)).offer(any(CoreV1Event.class), eq(100L), eq(TimeUnit.MILLISECONDS));
        }
    }

    //BaseRock generated method id: ${testGenerateEvent}, hash: 7C93755D6D985A4632ADA2F2E775990F
    @Test
    void testGenerateEvent() throws InterruptedException {
        V1ObjectReference objectReference = new V1ObjectReference();
        objectReference.setApiVersion("v1");
        objectReference.setKind("Pod");
        objectReference.setUid("123");
        objectReference.setNamespace("default");
        objectReference.setName("test-pod");
        objectReference.setResourceVersion("1");
        Map<String, String> annotations = new HashMap<>();
        annotations.put("key", "value");
        try (MockedStatic<EventUtils> eventUtilsMockedStatic = mockStatic(EventUtils.class)) {
            eventUtilsMockedStatic.when(() -> EventUtils.generateName(anyString(), any(OffsetDateTime.class))).thenReturn("generated-name");
            doReturn(true).when(mockQueue).offer(any(CoreV1Event.class), anyLong(), any(TimeUnit.class));
            eventRecorder.event(objectReference, annotations, EventType.Normal, "TestReason", "Test message");
            verify(mockQueue, times(1)).offer(any(CoreV1Event.class), eq(100L), eq(TimeUnit.MILLISECONDS));
        }
    }

    //BaseRock generated method id: ${testEventWithInterruptedException}, hash: 6F3E513B760F39F8F7A71B661E7B6E63
    @Test
    void testEventWithInterruptedException() throws InterruptedException {
        when(mockKubernetesObject.getApiVersion()).thenReturn("v1");
        when(mockKubernetesObject.getKind()).thenReturn("Pod");
        when(mockKubernetesObject.getMetadata()).thenReturn(mockObjectMeta);
        when(mockObjectMeta.getUid()).thenReturn("123");
        when(mockObjectMeta.getNamespace()).thenReturn("default");
        when(mockObjectMeta.getName()).thenReturn("test-pod");
        when(mockObjectMeta.getResourceVersion()).thenReturn("1");
        try (MockedStatic<EventUtils> eventUtilsMockedStatic = mockStatic(EventUtils.class)) {
            eventUtilsMockedStatic.when(() -> EventUtils.generateName(anyString(), any(OffsetDateTime.class))).thenReturn("generated-name");
            doReturn(false).when(mockQueue).offer(any(CoreV1Event.class), anyLong(), any(TimeUnit.class));
            eventRecorder.event(mockKubernetesObject, EventType.Normal, "TestReason", "Test message");
            verify(mockQueue, times(1)).offer(any(CoreV1Event.class), eq(100L), eq(TimeUnit.MILLISECONDS));
        }
    }

    //BaseRock generated method id: ${testEventWithFormattedMessage}, hash: B08899DCB15EFBCC2A7618697AA717E7
    @Test
    void testEventWithFormattedMessage() throws InterruptedException {
        when(mockKubernetesObject.getApiVersion()).thenReturn("v1");
        when(mockKubernetesObject.getKind()).thenReturn("Pod");
        when(mockKubernetesObject.getMetadata()).thenReturn(mockObjectMeta);
        when(mockObjectMeta.getUid()).thenReturn("123");
        when(mockObjectMeta.getNamespace()).thenReturn("default");
        when(mockObjectMeta.getName()).thenReturn("test-pod");
        when(mockObjectMeta.getResourceVersion()).thenReturn("1");
        try (MockedStatic<EventUtils> eventUtilsMockedStatic = mockStatic(EventUtils.class)) {
            eventUtilsMockedStatic.when(() -> EventUtils.generateName(anyString(), any(OffsetDateTime.class))).thenReturn("generated-name");
            doReturn(true).when(mockQueue).offer(any(CoreV1Event.class), anyLong(), any(TimeUnit.class));
            eventRecorder.event(mockKubernetesObject, EventType.Normal, "TestReason", "Test message %s", "formatted");
            verify(mockQueue, times(1)).offer(any(CoreV1Event.class), eq(100L), eq(TimeUnit.MILLISECONDS));
        }
    }

    //BaseRock generated method id: ${testConstructorWithNullParameters}, hash: 14058D8AEA41B1EF97097BA3E6923FB6
    @Disabled()
    @Test
    void testConstructorWithNullParameters() {
        assertThrows(NullPointerException.class, () -> new ObjectReferenceResolvingEventRecorder(null, null));
    }

    //BaseRock generated method id: ${testEventWithNullKubernetesObject}, hash: 6882B7B95592E99733539C388D31CA2C
    @Test
    void testEventWithNullKubernetesObject() {
        assertThrows(NullPointerException.class, () -> eventRecorder.event((KubernetesObject) null, EventType.Normal, "TestReason", "Test message"));
    }

    //BaseRock generated method id: ${testEventWithNullObjectReference}, hash: 184CBCEA5259B6DE6FCD93153BF06EE9
    @Test
    void testEventWithNullObjectReference() {
        assertThrows(NullPointerException.class, () -> eventRecorder.event((V1ObjectReference) null, EventType.Normal, "TestReason", "Test message"));
    }

    //BaseRock generated method id: ${testConstructor}, hash: A19EE6D95B4495ABB2BBC6D56C3C3A55
    @Test
    void testConstructor() {
        ObjectReferenceResolvingEventRecorder recorder = new ObjectReferenceResolvingEventRecorder(mockQueue, mockEventSource);
        assertThat(recorder, is(notNullValue()));
    }
}
