package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import com.google.gson.JsonObject;
import static org.junit.jupiter.api.Assertions.*;
import java.time.OffsetDateTime;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import io.kubernetes.client.openapi.models.V1ReplicationControllerCondition;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1ReplicationControllerConditionBaseRockGeneratedTest {

    @Mock
    private JsonObject mockJsonObject;

    @Mock
    private JsonElement mockJsonElement;

    private V1ReplicationControllerCondition condition;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        condition = new V1ReplicationControllerCondition();
    }

    //BaseRock generated method id: ${testConstructor}, hash: D39BC8A8A311EB7E60BA6D327EE7175F
    @Test
    void testConstructor() {
        assertNotNull(condition);
    }

    //BaseRock generated method id: ${testLastTransitionTime}, hash: 681B7C71A805C9BB2C6281F0E22196F5
    @Test
    void testLastTransitionTime() {
        OffsetDateTime now = OffsetDateTime.now();
        condition.setLastTransitionTime(now);
        assertEquals(now, condition.getLastTransitionTime());
    }

    //BaseRock generated method id: ${testMessage}, hash: 783E71C7A26DF26B3F9CD4C1DF52A9F9
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Test message" })
    void testMessage(String message) {
        condition.setMessage(message);
        assertEquals(message, condition.getMessage());
    }

    //BaseRock generated method id: ${testReason}, hash: 141AB44EA862E9204076D2510EB3693B
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Test reason" })
    void testReason(String reason) {
        condition.setReason(reason);
        assertEquals(reason, condition.getReason());
    }

    //BaseRock generated method id: ${testStatus}, hash: C1455F88B6E11EAA3CAB57AD35FD5751
    @Test
    void testStatus() {
        String status = "True";
        condition.setStatus(status);
        assertEquals(status, condition.getStatus());
    }

    //BaseRock generated method id: ${testType}, hash: 7F4B0976B06B544C74694C30A3A13656
    @Test
    void testType() {
        String type = "Available";
        condition.setType(type);
        assertEquals(type, condition.getType());
    }

    //BaseRock generated method id: ${testEquals}, hash: 51A2CBC1742FD23DAFD0E74C9ABEE336
    @Test
    void testEquals() {
        V1ReplicationControllerCondition condition1 = new V1ReplicationControllerCondition().lastTransitionTime(OffsetDateTime.now()).message("message").reason("reason").status("True").type("Available");
        V1ReplicationControllerCondition condition2 = new V1ReplicationControllerCondition().lastTransitionTime(condition1.getLastTransitionTime()).message("message").reason("reason").status("True").type("Available");
        assertEquals(condition1, condition2);
        assertNotEquals(condition1, new V1ReplicationControllerCondition());
    }

    //BaseRock generated method id: ${testHashCode}, hash: CEB4F3DAFF70AE262A94203CD9F54D99
    @Test
    void testHashCode() {
        V1ReplicationControllerCondition condition1 = new V1ReplicationControllerCondition().lastTransitionTime(OffsetDateTime.now()).message("message").reason("reason").status("True").type("Available");
        V1ReplicationControllerCondition condition2 = new V1ReplicationControllerCondition().lastTransitionTime(condition1.getLastTransitionTime()).message("message").reason("reason").status("True").type("Available");
        assertEquals(condition1.hashCode(), condition2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 34EDED431259F36728173F2C7CCE79A9
    @Test
    void testToString() {
        V1ReplicationControllerCondition condition = new V1ReplicationControllerCondition().lastTransitionTime(OffsetDateTime.now()).message("message").reason("reason").status("True").type("Available");
        String result = condition.toString();
        assertTrue(result.contains("lastTransitionTime"));
        assertTrue(result.contains("message"));
        assertTrue(result.contains("reason"));
        assertTrue(result.contains("status"));
        assertTrue(result.contains("type"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: E7F033176118E74E4FB7EB30ED48DD2E
    @Disabled()
    @Test
    void testValidateJsonElement() throws IOException {
        when(mockJsonObject.entrySet()).thenReturn(new JsonObject().entrySet());
        when(mockJsonObject.get("status")).thenReturn(mockJsonElement);
        when(mockJsonObject.get("type")).thenReturn(mockJsonElement);
        when(mockJsonElement.isJsonPrimitive()).thenReturn(true);
        V1ReplicationControllerCondition.validateJsonElement(mockJsonObject);
        verify(mockJsonObject).entrySet();
        verify(mockJsonObject).get("status");
        verify(mockJsonObject).get("type");
        verify(mockJsonElement, times(2)).isJsonPrimitive();
    }

    //BaseRock generated method id: ${testValidateJsonElementThrowsIOException}, hash: A6CE17C619D57FCAA72F4E3DF2A070C5
    @Disabled()
    @Test
    void testValidateJsonElementThrowsIOException() {
        when(mockJsonObject.entrySet()).thenReturn(new JsonObject().entrySet());
        when(mockJsonObject.get("status")).thenReturn(null);
        when(mockJsonObject.get("type")).thenReturn(null);
        assertThrows(IOException.class, () -> V1ReplicationControllerCondition.validateJsonElement(mockJsonObject));
    }

    //BaseRock generated method id: ${testFromJson}, hash: B538D2125D687E6BF4EF37C0D338588D
    @Test
    void testFromJson() throws IOException {
        String json = "{\"status\":\"True\",\"type\":\"Available\"}";
        V1ReplicationControllerCondition result = V1ReplicationControllerCondition.fromJson(json);
        assertNotNull(result);
        assertEquals("True", result.getStatus());
        assertEquals("Available", result.getType());
    }

    //BaseRock generated method id: ${testToJson}, hash: A897C2FB7A9D1C5979609D9156CEC5F7
    @Test
    void testToJson() {
        V1ReplicationControllerCondition condition = new V1ReplicationControllerCondition().status("True").type("Available");
        String json = condition.toJson();
        assertTrue(json.contains("\"status\":\"True\""));
        assertTrue(json.contains("\"type\":\"Available\""));
    }
}
