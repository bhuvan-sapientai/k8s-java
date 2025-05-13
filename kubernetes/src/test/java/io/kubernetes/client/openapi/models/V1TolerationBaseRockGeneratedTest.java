package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1Toleration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1TolerationBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1TolerationConstructor}, hash: AF63CD6BC0E310599DAA99C9C81C174F
    @Test
    void testV1TolerationConstructor() {
        V1Toleration toleration = new V1Toleration();
        assertNotNull(toleration);
    }

    //BaseRock generated method id: ${testSetAndGetEffect}, hash: E4D8EEC993A1ECBF9D8C1FC248890E60
    @ParameterizedTest
    @ValueSource(strings = { "NoSchedule", "PreferNoSchedule", "NoExecute" })
    void testSetAndGetEffect(String effect) {
        V1Toleration toleration = new V1Toleration();
        toleration.setEffect(effect);
        assertEquals(effect, toleration.getEffect());
    }

    //BaseRock generated method id: ${testSetAndGetKey}, hash: E1A4A9A783D66CD0074DC148D8A92105
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "test-key" })
    void testSetAndGetKey(String key) {
        V1Toleration toleration = new V1Toleration();
        toleration.setKey(key);
        assertEquals(key, toleration.getKey());
    }

    //BaseRock generated method id: ${testSetAndGetOperator}, hash: 6D9DB3EAB729AB5A7EA23EF7F5B29C1D
    @ParameterizedTest
    @ValueSource(strings = { "Exists", "Equal" })
    void testSetAndGetOperator(String operator) {
        V1Toleration toleration = new V1Toleration();
        toleration.setOperator(operator);
        assertEquals(operator, toleration.getOperator());
    }

    //BaseRock generated method id: ${testSetAndGetTolerationSeconds}, hash: B781761FD0D4054DA79ECD6C9B6FAD09
    @Test
    void testSetAndGetTolerationSeconds() {
        V1Toleration toleration = new V1Toleration();
        Long tolerationSeconds = 3600L;
        toleration.setTolerationSeconds(tolerationSeconds);
        assertEquals(tolerationSeconds, toleration.getTolerationSeconds());
    }

    //BaseRock generated method id: ${testSetAndGetValue}, hash: 4592BD47EE254C4E8BBFBBAD7CDB4E3B
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "test-value" })
    void testSetAndGetValue(String value) {
        V1Toleration toleration = new V1Toleration();
        toleration.setValue(value);
        assertEquals(value, toleration.getValue());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: B22026013FB6C14E5695F7300975BD88
    @Test
    void testEqualsAndHashCode() {
        V1Toleration toleration1 = new V1Toleration().effect("NoSchedule").key("test-key").operator("Equal").tolerationSeconds(3600L).value("test-value");
        V1Toleration toleration2 = new V1Toleration().effect("NoSchedule").key("test-key").operator("Equal").tolerationSeconds(3600L).value("test-value");
        assertThat(toleration1, is(equalTo(toleration2)));
        assertThat(toleration1.hashCode(), is(equalTo(toleration2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 9F1D6B286CF7D674A8E321B4339293BA
    @Test
    void testToString() {
        V1Toleration toleration = new V1Toleration().effect("NoSchedule").key("test-key").operator("Equal").tolerationSeconds(3600L).value("test-value");
        String expectedString = "class V1Toleration {\n" + "    effect: NoSchedule\n" + "    key: test-key\n" + "    operator: Equal\n" + "    tolerationSeconds: 3600\n" + "    value: test-value\n" + "}";
        assertThat(toleration.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 10A98CEF5B6B6526517294CF19FEDB0B
    @Test
    void testBuilder() {
        V1Toleration toleration = new V1Toleration().effect("NoSchedule").key("test-key").operator("Equal").tolerationSeconds(3600L).value("test-value");
        assertThat(toleration, is(notNullValue()));
        assertThat(toleration.getEffect(), is(equalTo("NoSchedule")));
        assertThat(toleration.getKey(), is(equalTo("test-key")));
        assertThat(toleration.getOperator(), is(equalTo("Equal")));
        assertThat(toleration.getTolerationSeconds(), is(equalTo(3600L)));
        assertThat(toleration.getValue(), is(equalTo("test-value")));
    }
}
