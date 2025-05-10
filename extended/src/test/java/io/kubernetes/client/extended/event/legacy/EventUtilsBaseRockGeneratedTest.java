package io.kubernetes.client.extended.event.legacy;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1EventSource;
import io.kubernetes.client.openapi.models.V1ObjectReference;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.CoreV1Event;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.time.OffsetDateTime;
import org.apache.commons.lang3.tuple.MutablePair;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class EventUtilsBaseRockGeneratedTest {

    private CoreV1Event mockEvent;

    private V1ObjectReference mockInvolvedObject;

    private V1EventSource mockSource;

    @BeforeEach
    void setUp() {
        mockEvent = mock(CoreV1Event.class);
        mockInvolvedObject = mock(V1ObjectReference.class);
        mockSource = mock(V1EventSource.class);
        when(mockEvent.getInvolvedObject()).thenReturn(mockInvolvedObject);
        when(mockEvent.getSource()).thenReturn(mockSource);
    }

    //BaseRock generated method id: ${testGenerateName}, hash: F45E0B27A139B449ACB04B85AD4D8007
    @Test
    void testGenerateName() {
        String referencedObjectName = "testObject";
        OffsetDateTime timestamp = OffsetDateTime.now();
        try (MockedStatic<RandomStringUtils> mockedRandomStringUtils = Mockito.mockStatic(RandomStringUtils.class)) {
            mockedRandomStringUtils.when(() -> RandomStringUtils.randomAlphanumeric(12)).thenReturn("abcdef123456");
            String result = EventUtils.generateName(referencedObjectName, timestamp);
            assertThat(result, equalTo("testObject.abcdef123456"));
        }
    }

    //BaseRock generated method id: ${testGetAggregatedMessageByReason}, hash: C2B80BAC7F7AD2EB543F556D8423FBDC
    @Test
    void testGetAggregatedMessageByReason() {
        when(mockEvent.getMessage()).thenReturn("Test message");
        String result = EventUtils.getAggregatedMessageByReason(mockEvent);
        assertThat(result, equalTo("(combined from similar events): Test message"));
    }

    //BaseRock generated method id: ${testGetAggregatedAndLocalKeyByReason}, hash: 5C505FC63FFA8CFC3C545F1A6B76A836
    @Test
    void testGetAggregatedAndLocalKeyByReason() {
        when(mockSource.getComponent()).thenReturn("testComponent");
        when(mockSource.getHost()).thenReturn("testHost");
        when(mockInvolvedObject.getKind()).thenReturn("testKind");
        when(mockInvolvedObject.getNamespace()).thenReturn("testNamespace");
        when(mockInvolvedObject.getName()).thenReturn("testName");
        when(mockInvolvedObject.getUid()).thenReturn("testUid");
        when(mockInvolvedObject.getApiVersion()).thenReturn("testApiVersion");
        when(mockEvent.getType()).thenReturn("testType");
        when(mockEvent.getReason()).thenReturn("testReason");
        when(mockEvent.getMessage()).thenReturn("testMessage");
        MutablePair<String, String> result = EventUtils.getAggregatedAndLocalKeyByReason(mockEvent);
        assertThat(result, notNullValue());
        assertThat(result.getLeft(), equalTo("testComponenttestHosttestKindtestNamespacetestNametestUidtestApiVersiontestTypetestReason"));
        assertThat(result.getRight(), equalTo("testMessage"));
    }

    //BaseRock generated method id: ${testGetEventKey}, hash: 588CDAFAA8365031208AE40FEA78695A
    @Test
    void testGetEventKey() {
        when(mockSource.getComponent()).thenReturn("testComponent");
        when(mockSource.getHost()).thenReturn("testHost");
        when(mockInvolvedObject.getKind()).thenReturn("testKind");
        when(mockInvolvedObject.getNamespace()).thenReturn("testNamespace");
        when(mockInvolvedObject.getName()).thenReturn("testName");
        when(mockInvolvedObject.getFieldPath()).thenReturn("testFieldPath");
        when(mockInvolvedObject.getUid()).thenReturn("testUid");
        when(mockInvolvedObject.getApiVersion()).thenReturn("testApiVersion");
        when(mockEvent.getType()).thenReturn("testType");
        when(mockEvent.getReason()).thenReturn("testReason");
        when(mockEvent.getMessage()).thenReturn("testMessage");
        String result = EventUtils.getEventKey(mockEvent);
        assertThat(result, equalTo("testComponenttestHosttestKindtestNamespacetestNametestFieldPathtestUidtestApiVersiontestTypetestReasontestMessage"));
    }

    //BaseRock generated method id: ${testGetSpamKey}, hash: 3BF49BBBF7C782DE2120D4512097C9AD
    @Test
    void testGetSpamKey() {
        when(mockSource.getComponent()).thenReturn("testComponent");
        when(mockSource.getHost()).thenReturn("testHost");
        when(mockInvolvedObject.getKind()).thenReturn("testKind");
        when(mockInvolvedObject.getNamespace()).thenReturn("testNamespace");
        when(mockInvolvedObject.getName()).thenReturn("testName");
        when(mockInvolvedObject.getUid()).thenReturn("testUid");
        when(mockEvent.getApiVersion()).thenReturn("testApiVersion");
        String result = EventUtils.getSpamKey(mockEvent);
        assertThat(result, equalTo("testComponenttestHosttestKindtestNamespacetestNametestUidtestApiVersion"));
    }
}
