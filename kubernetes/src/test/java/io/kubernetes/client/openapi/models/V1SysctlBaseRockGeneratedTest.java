package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import java.util.HashSet;
import java.util.Set;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1SysctlBaseRockGeneratedTest {

    private V1Sysctl v1Sysctl;

    @BeforeEach
    void setUp() {
        v1Sysctl = new V1Sysctl();
    }

    //BaseRock generated method id: ${testConstructor}, hash: AB39C88507D147389FCE29C9A3936CD5
    @Test
    void testConstructor() {
        assertNotNull(v1Sysctl);
    }

    //BaseRock generated method id: ${testNameSetter}, hash: 52AE9C5D36489359720E4CF5ED883F4E
    @ParameterizedTest
    @ValueSource(strings = { "test", "example", "sysctl" })
    void testNameSetter(String name) {
        V1Sysctl result = v1Sysctl.name(name);
        assertEquals(name, result.getName());
        assertSame(v1Sysctl, result);
    }

    //BaseRock generated method id: ${testNameGetter}, hash: 8DDBD7A96AA51448D39A7CAACBFBDE82
    @Test
    void testNameGetter() {
        String name = "test-name";
        v1Sysctl.setName(name);
        assertEquals(name, v1Sysctl.getName());
    }

    //BaseRock generated method id: ${testValueSetter}, hash: F8DF2799891AB3DBB6DE067FF5FF7CCE
    @ParameterizedTest
    @ValueSource(strings = { "value1", "value2", "value3" })
    void testValueSetter(String value) {
        V1Sysctl result = v1Sysctl.value(value);
        assertEquals(value, result.getValue());
        assertSame(v1Sysctl, result);
    }

    //BaseRock generated method id: ${testValueGetter}, hash: 5CA94AC9819D95C01451DDC406742FE3
    @Test
    void testValueGetter() {
        String value = "test-value";
        v1Sysctl.setValue(value);
        assertEquals(value, v1Sysctl.getValue());
    }

    //BaseRock generated method id: ${testEquals}, hash: D28710AC570EB2B53FE3644D4980C705
    @Test
    void testEquals() {
        V1Sysctl sysctl1 = new V1Sysctl().name("test").value("value");
        V1Sysctl sysctl2 = new V1Sysctl().name("test").value("value");
        V1Sysctl sysctl3 = new V1Sysctl().name("different").value("value");
        assertTrue(sysctl1.equals(sysctl2));
        assertTrue(sysctl2.equals(sysctl1));
        assertFalse(sysctl1.equals(sysctl3));
        assertFalse(sysctl1.equals(null));
        assertFalse(sysctl1.equals(new Object()));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 132028BD6796B6A02C7B89B2F766690B
    @Test
    void testHashCode() {
        V1Sysctl sysctl1 = new V1Sysctl().name("test").value("value");
        V1Sysctl sysctl2 = new V1Sysctl().name("test").value("value");
        V1Sysctl sysctl3 = new V1Sysctl().name("different").value("value");
        assertEquals(sysctl1.hashCode(), sysctl2.hashCode());
        assertNotEquals(sysctl1.hashCode(), sysctl3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 25905150F0722C92CF3EA305ECFBD2F9
    @Test
    void testToString() {
        v1Sysctl.setName("test-name");
        v1Sysctl.setValue("test-value");
        String toString = v1Sysctl.toString();
        assertThat(toString, containsString("class V1Sysctl"));
        assertThat(toString, containsString("name: test-name"));
        assertThat(toString, containsString("value: test-value"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 8576AC24E9AF37E8C63B471768F0B553
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "test-name");
        jsonObject.addProperty("value", "test-value");
        V1Sysctl.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testValidateJsonElementMissingRequiredField}, hash: B7B3BCE50100221AD20B9AF2281BFC84
    @Test
    void testValidateJsonElementMissingRequiredField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "test-name");
        assertThrows(IllegalArgumentException.class, () -> V1Sysctl.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidField}, hash: 77D6F428AE4EE516DB82C2AA70AF43FE
    @Test
    void testValidateJsonElementWithInvalidField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "test-name");
        jsonObject.addProperty("value", "test-value");
        jsonObject.addProperty("invalid-field", "invalid-value");
        assertThrows(IllegalArgumentException.class, () -> V1Sysctl.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testFromJson}, hash: F28209C931806493944BDB795A19C25F
    @Test
    void testFromJson() throws IOException {
        String json = "{\"name\":\"test-name\",\"value\":\"test-value\"}";
        V1Sysctl result = V1Sysctl.fromJson(json);
        assertEquals("test-name", result.getName());
        assertEquals("test-value", result.getValue());
    }

    //BaseRock generated method id: ${testToJson}, hash: 2E039193701D0EB428A0FA108A273508
    @Test
    void testToJson() {
        v1Sysctl.setName("test-name");
        v1Sysctl.setValue("test-value");
        String json = v1Sysctl.toJson();
        assertThat(json, containsString("\"name\":\"test-name\""));
        assertThat(json, containsString("\"value\":\"test-value\""));
    }

    //BaseRock generated method id: ${testOpenapiFields}, hash: 233DA35327DB32F534DC71D94167E662
    @Test
    void testOpenapiFields() {
        Set<String> openapiFields = V1Sysctl.openapiFields;
        assertThat(openapiFields, containsInAnyOrder("name", "value"));
        assertEquals(2, openapiFields.size());
    }

    //BaseRock generated method id: ${testOpenapiRequiredFields}, hash: E57FDD38E27EF80ADC8CAD846404355D
    @Test
    void testOpenapiRequiredFields() {
        Set<String> openapiRequiredFields = V1Sysctl.openapiRequiredFields;
        assertThat(openapiRequiredFields, containsInAnyOrder("name", "value"));
        assertEquals(2, openapiRequiredFields.size());
    }
}
