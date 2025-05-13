package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1QueuingConfiguration;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import io.kubernetes.client.openapi.models.V1LimitResponse;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1LimitResponseBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1LimitResponseConstructor}, hash: 6D8B8232176DB3B168C0D5E4D3FF9856
    @Test
    void testV1LimitResponseConstructor() {
        V1LimitResponse limitResponse = new V1LimitResponse();
        assertThat(limitResponse, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetQueuing}, hash: 58A96380B09D7F28000B80FBC6043E79
    @Test
    void testSetAndGetQueuing() {
        V1LimitResponse limitResponse = new V1LimitResponse();
        V1QueuingConfiguration queuingConfig = mock(V1QueuingConfiguration.class);
        limitResponse.setQueuing(queuingConfig);
        assertThat(limitResponse.getQueuing(), is(equalTo(queuingConfig)));
    }

    //BaseRock generated method id: ${testSetAndGetType}, hash: 2F6445C524072BB9A29BBEA2FA2350D8
    @ParameterizedTest
    @ValueSource(strings = { "Queue", "Reject" })
    void testSetAndGetType(String type) {
        V1LimitResponse limitResponse = new V1LimitResponse();
        limitResponse.setType(type);
        assertThat(limitResponse.getType(), is(equalTo(type)));
    }

    //BaseRock generated method id: ${testSetTypeWithInvalidInput}, hash: BEB6B671B21FCC0B4A4F240B75E6BBD5
    @ParameterizedTest
    @NullAndEmptySource
    void testSetTypeWithInvalidInput(String type) {
        V1LimitResponse limitResponse = new V1LimitResponse();
        limitResponse.setType(type);
        assertThat(limitResponse.getType(), is(equalTo(type)));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: B26BB7023FAB64A4B6C0C9EDF0A560E3
    @Test
    void testEqualsWithSameObject() {
        V1LimitResponse limitResponse = new V1LimitResponse();
        assertThat(limitResponse.equals(limitResponse), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 58FAB5CA2F5441E66FE84549591AEDE6
    @Test
    void testEqualsWithDifferentObject() {
        V1LimitResponse limitResponse1 = new V1LimitResponse().type("Queue");
        V1LimitResponse limitResponse2 = new V1LimitResponse().type("Reject");
        assertThat(limitResponse1.equals(limitResponse2), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: ED68636885B7CF55549FE7C773122BD9
    @Test
    void testHashCode() {
        V1LimitResponse limitResponse1 = new V1LimitResponse().type("Queue");
        V1LimitResponse limitResponse2 = new V1LimitResponse().type("Queue");
        assertThat(limitResponse1.hashCode(), is(equalTo(limitResponse2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: C8156094F8189947BDE5C682AA5E70B7
    @Test
    void testToString() {
        V1LimitResponse limitResponse = new V1LimitResponse().type("Queue").queuing(new V1QueuingConfiguration());
        String toString = limitResponse.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("type"), is(true));
        assertThat(toString.contains("queuing"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: EDC637B74425F25CFFBBA8D679F67872
    @Test
    void testBuilder() {
        V1QueuingConfiguration queuingConfig = mock(V1QueuingConfiguration.class);
        V1LimitResponse limitResponse = new V1LimitResponse().type("Queue").queuing(queuingConfig);
        assertThat(limitResponse.getType(), is(equalTo("Queue")));
        assertThat(limitResponse.getQueuing(), is(equalTo(queuingConfig)));
    }
}
