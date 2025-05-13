package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1EventSource;
import io.kubernetes.client.openapi.models.V1ObjectReference;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.time.OffsetDateTime;
import io.kubernetes.client.openapi.models.CoreV1EventSeries;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class CoreV1EventBaseRockGeneratedTest {

    private CoreV1Event coreV1Event;

    @BeforeEach
    void setUp() {
        coreV1Event = new CoreV1Event();
    }

    //BaseRock generated method id: ${testSetAndGetAction}, hash: 39628C5144C423376BAED9C11B9EDA8D
    @Test
    void testSetAndGetAction() {
        String action = "test-action";
        coreV1Event.setAction(action);
        assertEquals(action, coreV1Event.getAction());
    }

    //BaseRock generated method id: ${testSetAndGetApiVersion}, hash: 1DF220D431F43E25560411C17DD465EF
    @Test
    void testSetAndGetApiVersion() {
        String apiVersion = "v1";
        coreV1Event.setApiVersion(apiVersion);
        assertEquals(apiVersion, coreV1Event.getApiVersion());
    }

    //BaseRock generated method id: ${testSetAndGetCount}, hash: 01F411800A3C20E21949209A55ADB5CD
    @Test
    void testSetAndGetCount() {
        Integer count = 5;
        coreV1Event.setCount(count);
        assertEquals(count, coreV1Event.getCount());
    }

    //BaseRock generated method id: ${testSetAndGetEventTime}, hash: 3DDAD61530CE3FAD2AA4820737DC3F2A
    @Test
    void testSetAndGetEventTime() {
        OffsetDateTime eventTime = OffsetDateTime.now();
        coreV1Event.setEventTime(eventTime);
        assertEquals(eventTime, coreV1Event.getEventTime());
    }

    //BaseRock generated method id: ${testSetAndGetFirstTimestamp}, hash: A8251A90CECA9E0C2ED1933C1850BCA9
    @Test
    void testSetAndGetFirstTimestamp() {
        OffsetDateTime firstTimestamp = OffsetDateTime.now();
        coreV1Event.setFirstTimestamp(firstTimestamp);
        assertEquals(firstTimestamp, coreV1Event.getFirstTimestamp());
    }

    //BaseRock generated method id: ${testSetAndGetInvolvedObject}, hash: EB84AD1B85CB34027E47F538E8943D62
    @Test
    void testSetAndGetInvolvedObject() {
        V1ObjectReference involvedObject = mock(V1ObjectReference.class);
        coreV1Event.setInvolvedObject(involvedObject);
        assertEquals(involvedObject, coreV1Event.getInvolvedObject());
    }

    //BaseRock generated method id: ${testSetAndGetKind}, hash: 17072F3CB962BD76D3D4D47AAFB5F78D
    @Test
    void testSetAndGetKind() {
        String kind = "Event";
        coreV1Event.setKind(kind);
        assertEquals(kind, coreV1Event.getKind());
    }

    //BaseRock generated method id: ${testSetAndGetLastTimestamp}, hash: EDF905D030BC45AC87E5A6A593E122D4
    @Test
    void testSetAndGetLastTimestamp() {
        OffsetDateTime lastTimestamp = OffsetDateTime.now();
        coreV1Event.setLastTimestamp(lastTimestamp);
        assertEquals(lastTimestamp, coreV1Event.getLastTimestamp());
    }

    //BaseRock generated method id: ${testSetAndGetMessage}, hash: 0A4A1B1D7F67419A4E68478CF7BFB276
    @Test
    void testSetAndGetMessage() {
        String message = "Test message";
        coreV1Event.setMessage(message);
        assertEquals(message, coreV1Event.getMessage());
    }

    //BaseRock generated method id: ${testSetAndGetMetadata}, hash: 97E7A440C300E65229908E45321529E0
    @Test
    void testSetAndGetMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        coreV1Event.setMetadata(metadata);
        assertEquals(metadata, coreV1Event.getMetadata());
    }

    //BaseRock generated method id: ${testSetAndGetReason}, hash: F828D87152CB85F1AB4B69EBD4B331D0
    @Test
    void testSetAndGetReason() {
        String reason = "Test reason";
        coreV1Event.setReason(reason);
        assertEquals(reason, coreV1Event.getReason());
    }

    //BaseRock generated method id: ${testSetAndGetRelated}, hash: B847294CE1A43B378C61FBBDCCE7894F
    @Test
    void testSetAndGetRelated() {
        V1ObjectReference related = mock(V1ObjectReference.class);
        coreV1Event.setRelated(related);
        assertEquals(related, coreV1Event.getRelated());
    }

    //BaseRock generated method id: ${testSetAndGetReportingComponent}, hash: 038DFA389E7386BBB885E347245A007F
    @Test
    void testSetAndGetReportingComponent() {
        String reportingComponent = "Test component";
        coreV1Event.setReportingComponent(reportingComponent);
        assertEquals(reportingComponent, coreV1Event.getReportingComponent());
    }

    //BaseRock generated method id: ${testSetAndGetReportingInstance}, hash: E26102B4046718A7C5CECC75C5063140
    @Test
    void testSetAndGetReportingInstance() {
        String reportingInstance = "Test instance";
        coreV1Event.setReportingInstance(reportingInstance);
        assertEquals(reportingInstance, coreV1Event.getReportingInstance());
    }

    //BaseRock generated method id: ${testSetAndGetSeries}, hash: 66A63D650D1222F1D9C3DEED1D8ABDE5
    @Test
    void testSetAndGetSeries() {
        CoreV1EventSeries series = mock(CoreV1EventSeries.class);
        coreV1Event.setSeries(series);
        assertEquals(series, coreV1Event.getSeries());
    }

    //BaseRock generated method id: ${testSetAndGetSource}, hash: 663A27D143E545E0DC4F61DF40850367
    @Test
    void testSetAndGetSource() {
        V1EventSource source = mock(V1EventSource.class);
        coreV1Event.setSource(source);
        assertEquals(source, coreV1Event.getSource());
    }

    //BaseRock generated method id: ${testSetAndGetType}, hash: EBD38A59E5C3C59EB52421556D9C8144
    @Test
    void testSetAndGetType() {
        String type = "Normal";
        coreV1Event.setType(type);
        assertEquals(type, coreV1Event.getType());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 5E73C9A63175E756611C81AB80AB8A80
    @Test
    void testEqualsAndHashCode() {
        CoreV1Event event1 = new CoreV1Event();
        CoreV1Event event2 = new CoreV1Event();
        assertThat(event1, is(equalTo(event2)));
        assertThat(event1.hashCode(), is(equalTo(event2.hashCode())));
        event1.setAction("action");
        assertThat(event1, is(notNullValue()));
        assertThat(event1, is(notNullValue(CoreV1Event.class)));
    }

    //BaseRock generated method id: ${testToString}, hash: 2A9A0632D606970BF4B4684F2C0E965A
    @Test
    void testToString() {
        String result = coreV1Event.toString();
        assertNotNull(result);
        assertThat(result.contains("CoreV1Event"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: AED6A7C5DA7C841B98804EBC470AA916
    @Test
    void testBuilder() {
        String action = "test-action";
        String apiVersion = "v1";
        Integer count = 5;
        OffsetDateTime eventTime = OffsetDateTime.now();
        OffsetDateTime firstTimestamp = OffsetDateTime.now();
        V1ObjectReference involvedObject = mock(V1ObjectReference.class);
        String kind = "Event";
        OffsetDateTime lastTimestamp = OffsetDateTime.now();
        String message = "Test message";
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        String reason = "Test reason";
        V1ObjectReference related = mock(V1ObjectReference.class);
        String reportingComponent = "Test component";
        String reportingInstance = "Test instance";
        CoreV1EventSeries series = mock(CoreV1EventSeries.class);
        V1EventSource source = mock(V1EventSource.class);
        String type = "Normal";
        CoreV1Event event = new CoreV1Event().action(action).apiVersion(apiVersion).count(count).eventTime(eventTime).firstTimestamp(firstTimestamp).involvedObject(involvedObject).kind(kind).lastTimestamp(lastTimestamp).message(message).metadata(metadata).reason(reason).related(related).reportingComponent(reportingComponent).reportingInstance(reportingInstance).series(series).source(source).type(type);
        assertEquals(action, event.getAction());
        assertEquals(apiVersion, event.getApiVersion());
        assertEquals(count, event.getCount());
        assertEquals(eventTime, event.getEventTime());
        assertEquals(firstTimestamp, event.getFirstTimestamp());
        assertEquals(involvedObject, event.getInvolvedObject());
        assertEquals(kind, event.getKind());
        assertEquals(lastTimestamp, event.getLastTimestamp());
        assertEquals(message, event.getMessage());
        assertEquals(metadata, event.getMetadata());
        assertEquals(reason, event.getReason());
        assertEquals(related, event.getRelated());
        assertEquals(reportingComponent, event.getReportingComponent());
        assertEquals(reportingInstance, event.getReportingInstance());
        assertEquals(series, event.getSeries());
        assertEquals(source, event.getSource());
        assertEquals(type, event.getType());
    }
}
