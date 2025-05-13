package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import com.google.gson.Gson;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.containsString;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import static org.junit.jupiter.api.Assertions.*;
import io.kubernetes.client.openapi.JSON;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1WatchEventBaseRockGeneratedTest {

    private V1WatchEvent v1WatchEvent;

    @Mock
    private Object mockObject;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        v1WatchEvent = new V1WatchEvent();
    }

    //BaseRock generated method id: ${testObjectSetter}, hash: 29CF9B53DEF1ABD085601251F51D4E5E
    @Test
    void testObjectSetter() {
        v1WatchEvent.setObject(mockObject);
        assertEquals(mockObject, v1WatchEvent.getObject());
    }

    //BaseRock generated method id: ${testObjectGetter}, hash: 0C3F3CF69E6B3F40EDDCE7D1DC8C9145
    @Test
    void testObjectGetter() {
        v1WatchEvent.setObject(mockObject);
        Object result = v1WatchEvent.getObject();
        assertEquals(mockObject, result);
    }

    //BaseRock generated method id: ${testTypeSetter}, hash: 79FDC36651DE6965042467EC7D710FF2
    @Test
    void testTypeSetter() {
        String type = "ADDED";
        v1WatchEvent.setType(type);
        assertEquals(type, v1WatchEvent.getType());
    }

    //BaseRock generated method id: ${testTypeGetter}, hash: DC0AF86999D878868E8B95AC0B9E9AD9
    @Test
    void testTypeGetter() {
        String type = "MODIFIED";
        v1WatchEvent.setType(type);
        String result = v1WatchEvent.getType();
        assertEquals(type, result);
    }

    //BaseRock generated method id: ${testEquals}, hash: F2CB5B6012115669864BF2D524B0DA3A
    @Test
    void testEquals() {
        V1WatchEvent event1 = new V1WatchEvent();
        event1.setObject(mockObject);
        event1.setType("ADDED");
        V1WatchEvent event2 = new V1WatchEvent();
        event2.setObject(mockObject);
        event2.setType("ADDED");
        V1WatchEvent event3 = new V1WatchEvent();
        event3.setObject(mockObject);
        event3.setType("MODIFIED");
        assertTrue(event1.equals(event2));
        assertFalse(event1.equals(event3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 49F78CE428170E1DEDD7331E5C91AD1D
    @Test
    void testHashCode() {
        V1WatchEvent event1 = new V1WatchEvent();
        event1.setObject(mockObject);
        event1.setType("ADDED");
        V1WatchEvent event2 = new V1WatchEvent();
        event2.setObject(mockObject);
        event2.setType("ADDED");
        assertEquals(event1.hashCode(), event2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 008B4890884C237EF9D229D8E02D4898
    @Test
    void testToString() {
        v1WatchEvent.setObject(mockObject);
        v1WatchEvent.setType("ADDED");
        String result = v1WatchEvent.toString();
        assertThat(result, containsString("_object"));
        assertThat(result, containsString("type"));
        assertThat(result, containsString("ADDED"));
    }

    //BaseRock generated method id: ${testToIndentedString}, hash: 2C7F9B9ACD87B734FF5A07BB112DAB6B
    @Test
    void testToIndentedString() {
        v1WatchEvent.setObject(mockObject);
        v1WatchEvent.setType("DELETED");
        String result = v1WatchEvent.toString();
        assertThat(result, containsString("_object"));
        assertThat(result, containsString("type"));
        assertThat(result, containsString("DELETED"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: AE009399CC14838207FAED49669A0186
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("object", "test");
        jsonObject.addProperty("type", "ADDED");
        assertDoesNotThrow(() -> V1WatchEvent.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementMissingRequiredField}, hash: F44A1365A85186F7D6E69A219BC9D0BE
    @Test
    void testValidateJsonElementMissingRequiredField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("object", "test");
        assertThrows(IllegalArgumentException.class, () -> V1WatchEvent.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 79633343FA801A6E40805048D87A98AD
    @Test
    void testFromJson() throws IOException {
        String json = "{\"object\":\"test\",\"type\":\"ADDED\"}";
        try (MockedStatic<JSON> jsonMock = mockStatic(JSON.class)) {
            Gson mockGson = mock(Gson.class);
            when(JSON.getGson()).thenReturn(mockGson);
            V1WatchEvent mockEvent = new V1WatchEvent();
            mockEvent.setObject("test");
            mockEvent.setType("ADDED");
            when(mockGson.fromJson(json, V1WatchEvent.class)).thenReturn(mockEvent);
            V1WatchEvent result = V1WatchEvent.fromJson(json);
            assertEquals("test", result.getObject());
            assertEquals("ADDED", result.getType());
        }
    }

    //BaseRock generated method id: ${testToJson}, hash: DE8C2FC3F7014C5EEBDEABDE9669F05E
    @Test
    void testToJson() {
        v1WatchEvent.setObject("test");
        v1WatchEvent.setType("MODIFIED");
        try (MockedStatic<JSON> jsonMock = mockStatic(JSON.class)) {
            Gson mockGson = mock(Gson.class);
            when(JSON.getGson()).thenReturn(mockGson);
            when(mockGson.toJson(v1WatchEvent)).thenReturn("{\"object\":\"test\",\"type\":\"MODIFIED\"}");
            String result = v1WatchEvent.toJson();
            assertEquals("{\"object\":\"test\",\"type\":\"MODIFIED\"}", result);
        }
    }
}
