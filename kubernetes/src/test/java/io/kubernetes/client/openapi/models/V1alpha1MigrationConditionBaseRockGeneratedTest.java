package io.kubernetes.client.openapi.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import io.kubernetes.client.openapi.models.V1alpha1MigrationCondition;
import java.time.OffsetDateTime;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha1MigrationConditionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: D54139F85E9DBD6DB9059A525EA13BCB
    @Test
    void testConstructor() {
        V1alpha1MigrationCondition condition = new V1alpha1MigrationCondition();
        assertNotNull(condition);
    }

    //BaseRock generated method id: ${testLastUpdateTime}, hash: 960E85745E4E86B9639AF42917A9443B
    @Test
    void testLastUpdateTime() {
        OffsetDateTime now = OffsetDateTime.now();
        V1alpha1MigrationCondition condition = new V1alpha1MigrationCondition().lastUpdateTime(now);
        assertEquals(now, condition.getLastUpdateTime());
    }

    //BaseRock generated method id: ${testMessage}, hash: 3CBCDF26B5612BE27529EDDB288EEAF6
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Test message", "Another message" })
    void testMessage(String message) {
        V1alpha1MigrationCondition condition = new V1alpha1MigrationCondition().message(message);
        assertEquals(message, condition.getMessage());
    }

    //BaseRock generated method id: ${testReason}, hash: C2EE0AAB1D89D2FB70C8E8B8DA8AB0B2
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Test reason", "Another reason" })
    void testReason(String reason) {
        V1alpha1MigrationCondition condition = new V1alpha1MigrationCondition().reason(reason);
        assertEquals(reason, condition.getReason());
    }

    //BaseRock generated method id: ${testStatus}, hash: 9668DC6F4ACAB94390F357F483DF98D6
    @ParameterizedTest
    @ValueSource(strings = { "True", "False", "Unknown" })
    void testStatus(String status) {
        V1alpha1MigrationCondition condition = new V1alpha1MigrationCondition().status(status);
        assertEquals(status, condition.getStatus());
    }

    //BaseRock generated method id: ${testType}, hash: 4897B9E572CC70B3C8837F137A8DA404
    @ParameterizedTest
    @ValueSource(strings = { "Type1", "Type2" })
    void testType(String type) {
        V1alpha1MigrationCondition condition = new V1alpha1MigrationCondition().type(type);
        assertEquals(type, condition.getType());
    }

    //BaseRock generated method id: ${testEquals}, hash: C26624D505C8D1FC59D2DCD3034B6F0D
    @Test
    void testEquals() {
        V1alpha1MigrationCondition condition1 = new V1alpha1MigrationCondition().lastUpdateTime(OffsetDateTime.now()).message("Test message").reason("Test reason").status("True").type("Test type");
        V1alpha1MigrationCondition condition2 = new V1alpha1MigrationCondition().lastUpdateTime(condition1.getLastUpdateTime()).message("Test message").reason("Test reason").status("True").type("Test type");
        assertThat(condition1, is(equalTo(condition2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 8F18C2DFDC98614F728C2BFBA81FB522
    @Test
    void testHashCode() {
        V1alpha1MigrationCondition condition = new V1alpha1MigrationCondition().lastUpdateTime(OffsetDateTime.now()).message("Test message").reason("Test reason").status("True").type("Test type");
        assertThat(condition.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 5062276E66CFF75A16CEA39952D7F64A
    @Test
    void testToString() {
        V1alpha1MigrationCondition condition = new V1alpha1MigrationCondition().lastUpdateTime(OffsetDateTime.now()).message("Test message").reason("Test reason").status("True").type("Test type");
        String toString = condition.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("lastUpdateTime"), is(true));
        assertThat(toString.contains("message"), is(true));
        assertThat(toString.contains("reason"), is(true));
        assertThat(toString.contains("status"), is(true));
        assertThat(toString.contains("type"), is(true));
    }
}
