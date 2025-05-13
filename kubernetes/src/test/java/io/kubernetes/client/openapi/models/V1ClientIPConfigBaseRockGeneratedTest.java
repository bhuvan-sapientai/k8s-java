package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.openapi.models.V1ClientIPConfig;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ClientIPConfigBaseRockGeneratedTest {

    //BaseRock generated method id: ${testDefaultConstructor}, hash: 62D828711844465323DD075C638096ED
    @Test
    void testDefaultConstructor() {
        V1ClientIPConfig config = new V1ClientIPConfig();
        assertNotNull(config);
        assertThat(config.getTimeoutSeconds(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testTimeoutSecondsConstructor}, hash: 43B0DCF74B8D5A12591AE54DF4DCE848
    @Test
    void testTimeoutSecondsConstructor() {
        Integer timeoutSeconds = 3600;
        V1ClientIPConfig config = new V1ClientIPConfig().timeoutSeconds(timeoutSeconds);
        assertNotNull(config);
        assertEquals(timeoutSeconds, config.getTimeoutSeconds());
    }

    //BaseRock generated method id: ${testSetTimeoutSeconds}, hash: E7B838034D0A3428343FE0FDF8AB34FC
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 86400 })
    void testSetTimeoutSeconds(int timeoutSeconds) {
        V1ClientIPConfig config = new V1ClientIPConfig();
        config.setTimeoutSeconds(timeoutSeconds);
        assertEquals(timeoutSeconds, config.getTimeoutSeconds());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 29F7B62846034A1890D054D699E3B507
    @Test
    void testEqualsWithSameObject() {
        V1ClientIPConfig config = new V1ClientIPConfig().timeoutSeconds(3600);
        assertThat(config.equals(config), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: BF713954C1CE4262AF49889D96EF8A50
    @Test
    void testEqualsWithDifferentObject() {
        V1ClientIPConfig config1 = new V1ClientIPConfig().timeoutSeconds(3600);
        V1ClientIPConfig config2 = new V1ClientIPConfig().timeoutSeconds(7200);
        assertThat(config1.equals(config2), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: A5B571BBFB2B35E8BCE6952D16F79756
    @Test
    void testHashCode() {
        V1ClientIPConfig config1 = new V1ClientIPConfig().timeoutSeconds(3600);
        V1ClientIPConfig config2 = new V1ClientIPConfig().timeoutSeconds(3600);
        assertThat(config1.hashCode(), is(equalTo(config2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 8696B495A6782B36E1A360B8AE5A2D2B
    @Test
    void testToString() {
        V1ClientIPConfig config = new V1ClientIPConfig().timeoutSeconds(3600);
        String expected = "class V1ClientIPConfig {\n    timeoutSeconds: 3600\n}";
        assertThat(config.toString(), is(equalTo(expected)));
    }
}
