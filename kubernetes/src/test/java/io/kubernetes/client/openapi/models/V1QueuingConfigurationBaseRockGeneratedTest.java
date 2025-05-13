package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import io.kubernetes.client.openapi.models.V1QueuingConfiguration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1QueuingConfigurationBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1QueuingConfigurationConstructor}, hash: 408AEED7F08511A199078FE0FAA66B57
    @Test
    void testV1QueuingConfigurationConstructor() {
        V1QueuingConfiguration configuration = new V1QueuingConfiguration();
        assertNotNull(configuration);
    }

    //BaseRock generated method id: ${testHandSize}, hash: 894DB91A1D63189909C8D9467FE0D8F2
    @Test
    void testHandSize() {
        V1QueuingConfiguration configuration = new V1QueuingConfiguration();
        Integer handSize = 5;
        configuration.setHandSize(handSize);
        assertEquals(handSize, configuration.getHandSize());
    }

    //BaseRock generated method id: ${testQueueLengthLimit}, hash: 4725CC8AEA03C70E78B68F7FA6DFF58F
    @Test
    void testQueueLengthLimit() {
        V1QueuingConfiguration configuration = new V1QueuingConfiguration();
        Integer queueLengthLimit = 100;
        configuration.setQueueLengthLimit(queueLengthLimit);
        assertEquals(queueLengthLimit, configuration.getQueueLengthLimit());
    }

    //BaseRock generated method id: ${testQueues}, hash: 7EF236C0DD4F7474B0336A105BF37DEF
    @Test
    void testQueues() {
        V1QueuingConfiguration configuration = new V1QueuingConfiguration();
        Integer queues = 10;
        configuration.setQueues(queues);
        assertEquals(queues, configuration.getQueues());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 7293BB8E5BE5746099DDA90EFC12A31D
    @Test
    void testEqualsAndHashCode() {
        V1QueuingConfiguration config1 = new V1QueuingConfiguration().handSize(5).queueLengthLimit(100).queues(10);
        V1QueuingConfiguration config2 = new V1QueuingConfiguration().handSize(5).queueLengthLimit(100).queues(10);
        V1QueuingConfiguration config3 = new V1QueuingConfiguration().handSize(6).queueLengthLimit(101).queues(11);
        assertThat(config1, is(equalTo(config2)));
        assertThat(config1.hashCode(), is(equalTo(config2.hashCode())));
        assertThat(config1, is(notNullValue()));
        assertThat(config1, is(notNullValue()));
        assertThat(config1, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 19D484C129EDD8554A6F2022EBC20EE6
    @Test
    void testToString() {
        V1QueuingConfiguration configuration = new V1QueuingConfiguration().handSize(5).queueLengthLimit(100).queues(10);
        String toString = configuration.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("handSize"), is(true));
        assertThat(toString.contains("queueLengthLimit"), is(true));
        assertThat(toString.contains("queues"), is(true));
    }

    //BaseRock generated method id: ${testHandSizeParameterized}, hash: 7345510FABF844D210F790DD36CB1661
    @ParameterizedTest
    @ValueSource(ints = { 1, 5, 10, 100 })
    void testHandSizeParameterized(int handSize) {
        V1QueuingConfiguration configuration = new V1QueuingConfiguration();
        configuration.setHandSize(handSize);
        assertEquals(handSize, configuration.getHandSize());
    }

    //BaseRock generated method id: ${testQueueLengthLimitParameterized}, hash: 2F20B9669FACE47061E181FC88AA4270
    @ParameterizedTest
    @ValueSource(ints = { 10, 50, 100, 1000 })
    void testQueueLengthLimitParameterized(int queueLengthLimit) {
        V1QueuingConfiguration configuration = new V1QueuingConfiguration();
        configuration.setQueueLengthLimit(queueLengthLimit);
        assertEquals(queueLengthLimit, configuration.getQueueLengthLimit());
    }

    //BaseRock generated method id: ${testQueuesParameterized}, hash: E825B7FEE9E610FF9DAE652BF492C4D2
    @ParameterizedTest
    @ValueSource(ints = { 1, 10, 64, 128 })
    void testQueuesParameterized(int queues) {
        V1QueuingConfiguration configuration = new V1QueuingConfiguration();
        configuration.setQueues(queues);
        assertEquals(queues, configuration.getQueues());
    }
}
