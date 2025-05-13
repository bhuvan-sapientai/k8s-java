package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1CustomResourceDefinitionConditionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1CustomResourceDefinitionConditionConstructor}, hash: C094C8707E62B19A7B63B8D1D7966D74
    @Test
    void testV1CustomResourceDefinitionConditionConstructor() {
        V1CustomResourceDefinitionCondition condition = new V1CustomResourceDefinitionCondition();
        assertNotNull(condition);
    }

    //BaseRock generated method id: ${testLastTransitionTime}, hash: 5B1EDBB1B2045782BACDFA31293EE73E
    @Test
    void testLastTransitionTime() {
        V1CustomResourceDefinitionCondition condition = new V1CustomResourceDefinitionCondition();
        OffsetDateTime now = OffsetDateTime.now();
        condition.setLastTransitionTime(now);
        assertEquals(now, condition.getLastTransitionTime());
    }

    //BaseRock generated method id: ${testMessage}, hash: 0C9DB2D170FBCDFE7E20F98A659AF76E
    @Test
    void testMessage() {
        V1CustomResourceDefinitionCondition condition = new V1CustomResourceDefinitionCondition();
        String message = "Test message";
        condition.setMessage(message);
        assertEquals(message, condition.getMessage());
    }

    //BaseRock generated method id: ${testReason}, hash: ABE33C978196465BFF375A3F699B8ADD
    @Test
    void testReason() {
        V1CustomResourceDefinitionCondition condition = new V1CustomResourceDefinitionCondition();
        String reason = "TestReason";
        condition.setReason(reason);
        assertEquals(reason, condition.getReason());
    }

    //BaseRock generated method id: ${testStatus}, hash: 146335AB84075FFC5604DA28CAD9BFA5
    @Test
    void testStatus() {
        V1CustomResourceDefinitionCondition condition = new V1CustomResourceDefinitionCondition();
        String status = "True";
        condition.setStatus(status);
        assertEquals(status, condition.getStatus());
    }

    //BaseRock generated method id: ${testType}, hash: 91796F175525F92DAE5E9C93A08E8B9B
    @Test
    void testType() {
        V1CustomResourceDefinitionCondition condition = new V1CustomResourceDefinitionCondition();
        String type = "Established";
        condition.setType(type);
        assertEquals(type, condition.getType());
    }

    //BaseRock generated method id: ${testEquals}, hash: 115651253E15937A291DF451219E1405
    @Test
    void testEquals() {
        V1CustomResourceDefinitionCondition condition1 = new V1CustomResourceDefinitionCondition().lastTransitionTime(OffsetDateTime.now()).message("Test message").reason("TestReason").status("True").type("Established");
        V1CustomResourceDefinitionCondition condition2 = new V1CustomResourceDefinitionCondition().lastTransitionTime(condition1.getLastTransitionTime()).message("Test message").reason("TestReason").status("True").type("Established");
        assertThat(condition1, is(equalTo(condition2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 2C07F0E64FD94C3BA9C6310E481BED11
    @Test
    void testHashCode() {
        V1CustomResourceDefinitionCondition condition1 = new V1CustomResourceDefinitionCondition().lastTransitionTime(OffsetDateTime.now()).message("Test message").reason("TestReason").status("True").type("Established");
        V1CustomResourceDefinitionCondition condition2 = new V1CustomResourceDefinitionCondition().lastTransitionTime(condition1.getLastTransitionTime()).message("Test message").reason("TestReason").status("True").type("Established");
        assertEquals(condition1.hashCode(), condition2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: E6389423918ADD47A3D03221AC4A53DC
    @Test
    void testToString() {
        V1CustomResourceDefinitionCondition condition = new V1CustomResourceDefinitionCondition().lastTransitionTime(OffsetDateTime.now()).message("Test message").reason("TestReason").status("True").type("Established");
        String toString = condition.toString();
        assertThat(toString, notNullValue());
        assertThat(toString, containsString("lastTransitionTime"));
        assertThat(toString, containsString("message"));
        assertThat(toString, containsString("reason"));
        assertThat(toString, containsString("status"));
        assertThat(toString, containsString("type"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 7B844F849D15BF6E9A206D7F11A22AA9
    @Test
    void testValidateJsonElement() throws IOException {
        V1CustomResourceDefinitionCondition condition = new V1CustomResourceDefinitionCondition().lastTransitionTime(OffsetDateTime.now()).message("Test message").reason("TestReason").status("True").type("Established");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("lastTransitionTime", condition.getLastTransitionTime().toString());
        jsonObject.addProperty("message", condition.getMessage());
        jsonObject.addProperty("reason", condition.getReason());
        jsonObject.addProperty("status", condition.getStatus());
        jsonObject.addProperty("type", condition.getType());
        V1CustomResourceDefinitionCondition.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testFromJson}, hash: 2F360E179180A35EA985FEC5C69CA05B
    @Test
    void testFromJson() throws IOException {
        String json = "{\"lastTransitionTime\":\"2023-01-01T00:00:00Z\",\"message\":\"Test message\",\"reason\":\"TestReason\",\"status\":\"True\",\"type\":\"Established\"}";
        V1CustomResourceDefinitionCondition condition = V1CustomResourceDefinitionCondition.fromJson(json);
        assertNotNull(condition);
        assertEquals(OffsetDateTime.parse("2023-01-01T00:00:00Z"), condition.getLastTransitionTime());
        assertEquals("Test message", condition.getMessage());
        assertEquals("TestReason", condition.getReason());
        assertEquals("True", condition.getStatus());
        assertEquals("Established", condition.getType());
    }

    //BaseRock generated method id: ${testToJson}, hash: B2120BEE8A5B52E0878CA9D8CE797D66
    @Disabled()
    @Test
    void testToJson() {
        V1CustomResourceDefinitionCondition condition = new V1CustomResourceDefinitionCondition().lastTransitionTime(OffsetDateTime.parse("2023-01-01T00:00:00Z")).message("Test message").reason("TestReason").status("True").type("Established");
        String json = condition.toJson();
        assertNotNull(json);
        assertThat(json, containsString("\"lastTransitionTime\":\"2023-01-01T00:00:00Z\""));
        assertThat(json, containsString("\"message\":\"Test message\""));
        assertThat(json, containsString("\"reason\":\"TestReason\""));
        assertThat(json, containsString("\"status\":\"True\""));
        assertThat(json, containsString("\"type\":\"Established\""));
    }
}
