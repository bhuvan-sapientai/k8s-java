package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import io.kubernetes.client.openapi.models.V1PriorityLevelConfigurationCondition;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PriorityLevelConfigurationConditionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 93FA139373149BE79EB3C33AC58FAC19
    @Test
    void testConstructor() {
        V1PriorityLevelConfigurationCondition condition = new V1PriorityLevelConfigurationCondition();
        assertNotNull(condition);
    }

    //BaseRock generated method id: ${testLastTransitionTime}, hash: EFA78DC09B480349BB68D073DCAB51EC
    @Test
    void testLastTransitionTime() {
        OffsetDateTime now = OffsetDateTime.now();
        V1PriorityLevelConfigurationCondition condition = new V1PriorityLevelConfigurationCondition().lastTransitionTime(now);
        assertEquals(now, condition.getLastTransitionTime());
    }

    //BaseRock generated method id: ${testMessage}, hash: 17C3BB6A47A90FE26222F06CFECC9C68
    @Test
    void testMessage() {
        String testMessage = "Test message";
        V1PriorityLevelConfigurationCondition condition = new V1PriorityLevelConfigurationCondition().message(testMessage);
        assertEquals(testMessage, condition.getMessage());
    }

    //BaseRock generated method id: ${testReason}, hash: 8501FB912EC8B5B340415B31475E9359
    @Test
    void testReason() {
        String testReason = "TestReason";
        V1PriorityLevelConfigurationCondition condition = new V1PriorityLevelConfigurationCondition().reason(testReason);
        assertEquals(testReason, condition.getReason());
    }

    //BaseRock generated method id: ${testStatus}, hash: 8CA86CA5DB1711C10B7F0A4CA3BA4926
    @Test
    void testStatus() {
        String testStatus = "True";
        V1PriorityLevelConfigurationCondition condition = new V1PriorityLevelConfigurationCondition().status(testStatus);
        assertEquals(testStatus, condition.getStatus());
    }

    //BaseRock generated method id: ${testType}, hash: 417D1063515CA5CBDFF9920CF9A0D336
    @Test
    void testType() {
        String testType = "TestType";
        V1PriorityLevelConfigurationCondition condition = new V1PriorityLevelConfigurationCondition().type(testType);
        assertEquals(testType, condition.getType());
    }

    //BaseRock generated method id: ${testEquals}, hash: B7C94EA3CAE5A6DB1FC4A2EC47BC052C
    @Test
    void testEquals() {
        OffsetDateTime now = OffsetDateTime.now();
        V1PriorityLevelConfigurationCondition condition1 = new V1PriorityLevelConfigurationCondition().lastTransitionTime(now).message("Test message").reason("TestReason").status("True").type("TestType");
        V1PriorityLevelConfigurationCondition condition2 = new V1PriorityLevelConfigurationCondition().lastTransitionTime(now).message("Test message").reason("TestReason").status("True").type("TestType");
        assertEquals(condition1, condition2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: A7B7965F625F721896ECAA0D1D5014F5
    @Test
    void testHashCode() {
        OffsetDateTime now = OffsetDateTime.now();
        V1PriorityLevelConfigurationCondition condition1 = new V1PriorityLevelConfigurationCondition().lastTransitionTime(now).message("Test message").reason("TestReason").status("True").type("TestType");
        V1PriorityLevelConfigurationCondition condition2 = new V1PriorityLevelConfigurationCondition().lastTransitionTime(now).message("Test message").reason("TestReason").status("True").type("TestType");
        assertEquals(condition1.hashCode(), condition2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 72D6717D7C918E42C218E44589C6C3DD
    @Test
    void testToString() {
        OffsetDateTime now = OffsetDateTime.now();
        V1PriorityLevelConfigurationCondition condition = new V1PriorityLevelConfigurationCondition().lastTransitionTime(now).message("Test message").reason("TestReason").status("True").type("TestType");
        String expectedString = "class V1PriorityLevelConfigurationCondition {\n" + "    lastTransitionTime: " + now + "\n" + "    message: Test message\n" + "    reason: TestReason\n" + "    status: True\n" + "    type: TestType\n" + "}";
        assertEquals(expectedString, condition.toString());
    }
}
