package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import com.google.gson.Gson;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonObject;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import io.kubernetes.client.openapi.JSON;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1ContainerStateWaitingBaseRockGeneratedTest {

    private V1ContainerStateWaiting containerStateWaiting;

    @BeforeEach
    void setUp() {
        containerStateWaiting = new V1ContainerStateWaiting();
    }

    //BaseRock generated method id: ${testConstructor}, hash: F3D6470476CA3B0F19F4A7251626E713
    @Test
    void testConstructor() {
        assertNotNull(containerStateWaiting);
    }

    //BaseRock generated method id: ${testMessageSetter}, hash: 29E921ACE85E4A22A544734ECB7D4AD0
    @ParameterizedTest
    @ValueSource(strings = { "Test message", "Another message" })
    void testMessageSetter(String message) {
        V1ContainerStateWaiting result = containerStateWaiting.message(message);
        assertEquals(message, result.getMessage());
        assertSame(containerStateWaiting, result);
    }

    //BaseRock generated method id: ${testMessageGetter}, hash: CC20D33C06E379C99150E8E0CE04DD1C
    @Test
    void testMessageGetter() {
        String message = "Test message";
        containerStateWaiting.setMessage(message);
        assertEquals(message, containerStateWaiting.getMessage());
    }

    //BaseRock generated method id: ${testReasonSetter}, hash: 52357EE486FF1C67F2DEED765F73C591
    @ParameterizedTest
    @ValueSource(strings = { "Test reason", "Another reason" })
    void testReasonSetter(String reason) {
        V1ContainerStateWaiting result = containerStateWaiting.reason(reason);
        assertEquals(reason, result.getReason());
        assertSame(containerStateWaiting, result);
    }

    //BaseRock generated method id: ${testReasonGetter}, hash: 605E4C90A3A2911A39DB115727985099
    @Test
    void testReasonGetter() {
        String reason = "Test reason";
        containerStateWaiting.setReason(reason);
        assertEquals(reason, containerStateWaiting.getReason());
    }

    //BaseRock generated method id: ${testEquals}, hash: 7EEAF3F5A0BE240737668910C0FCD6E5
    @Test
    void testEquals() {
        V1ContainerStateWaiting obj1 = new V1ContainerStateWaiting().message("msg1").reason("reason1");
        V1ContainerStateWaiting obj2 = new V1ContainerStateWaiting().message("msg1").reason("reason1");
        V1ContainerStateWaiting obj3 = new V1ContainerStateWaiting().message("msg2").reason("reason2");
        assertEquals(obj1, obj2);
        assertNotEquals(obj1, obj3);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 351532CB0030B0F790A16DC2F320F221
    @Test
    void testHashCode() {
        V1ContainerStateWaiting obj1 = new V1ContainerStateWaiting().message("msg1").reason("reason1");
        V1ContainerStateWaiting obj2 = new V1ContainerStateWaiting().message("msg1").reason("reason1");
        V1ContainerStateWaiting obj3 = new V1ContainerStateWaiting().message("msg2").reason("reason2");
        assertEquals(obj1.hashCode(), obj2.hashCode());
        assertNotEquals(obj1.hashCode(), obj3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: F8B12B050DDAEE597A764DE878C73BEC
    @Test
    void testToString() {
        containerStateWaiting.setMessage("Test message");
        containerStateWaiting.setReason("Test reason");
        String expected = "class V1ContainerStateWaiting {\n    message: Test message\n    reason: Test reason\n}";
        assertEquals(expected, containerStateWaiting.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidInput}, hash: E924B624F66401B3765337DD3C1434A2
    @Disabled()
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "  ", "\t", "\n" })
    void testValidateJsonElementWithInvalidInput(String json) {
        JsonElement jsonElement = json == null ? null : new JsonPrimitive(json);
        assertThrows(IllegalArgumentException.class, () -> V1ContainerStateWaiting.validateJsonElement(jsonElement));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithValidInput}, hash: 6F846936C4713C2ADED674A135F5B8D4
    @Test
    void testValidateJsonElementWithValidInput() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("message", new JsonPrimitive("Test message"));
        jsonObject.add("reason", new JsonPrimitive("Test reason"));
        assertDoesNotThrow(() -> V1ContainerStateWaiting.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithExtraField}, hash: AD67A2D4E1F8A86DE8D3B1D57B01005F
    @Test
    void testValidateJsonElementWithExtraField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("message", new JsonPrimitive("Test message"));
        jsonObject.add("reason", new JsonPrimitive("Test reason"));
        jsonObject.add("extraField", new JsonPrimitive("Extra value"));
        assertThrows(IllegalArgumentException.class, () -> V1ContainerStateWaiting.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidFieldType}, hash: 0F75F3BF321A3706137EEBD255FB672B
    @Test
    void testValidateJsonElementWithInvalidFieldType() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("message", new JsonObject());
        assertThrows(IllegalArgumentException.class, () -> V1ContainerStateWaiting.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 0BB7672AF151566036726CD74707C716
    @Test
    void testFromJson() throws IOException {
        String json = "{\"message\":\"Test message\",\"reason\":\"Test reason\"}";
        try (MockedStatic<JSON> jsonMock = mockStatic(JSON.class)) {
            Gson mockGson = mock(Gson.class);
            when(JSON.getGson()).thenReturn(mockGson);
            when(mockGson.fromJson(eq(json), eq(V1ContainerStateWaiting.class))).thenReturn(new V1ContainerStateWaiting().message("Test message").reason("Test reason"));
            V1ContainerStateWaiting result = V1ContainerStateWaiting.fromJson(json);
            assertEquals("Test message", result.getMessage());
            assertEquals("Test reason", result.getReason());
        }
    }

    //BaseRock generated method id: ${testToJson}, hash: E78467604AECC9FAE7C4EB6BFE79DCCD
    @Test
    void testToJson() {
        containerStateWaiting.setMessage("Test message");
        containerStateWaiting.setReason("Test reason");
        try (MockedStatic<JSON> jsonMock = mockStatic(JSON.class)) {
            Gson mockGson = mock(Gson.class);
            when(JSON.getGson()).thenReturn(mockGson);
            when(mockGson.toJson(eq(containerStateWaiting))).thenReturn("{\"message\":\"Test message\",\"reason\":\"Test reason\"}");
            String result = containerStateWaiting.toJson();
            assertEquals("{\"message\":\"Test message\",\"reason\":\"Test reason\"}", result);
        }
    }
}
