package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1PriorityLevelConfigurationReference;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import java.util.HashSet;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(value = 10, unit = TimeUnit.SECONDS)
public class V1PriorityLevelConfigurationReferenceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1PriorityLevelConfigurationReferenceConstructor}, hash: DFD86BFB8F5E8D8BCEE2C4A738A816F8
    @Test
    public void testV1PriorityLevelConfigurationReferenceConstructor() {
        V1PriorityLevelConfigurationReference reference = new V1PriorityLevelConfigurationReference();
        assertThat(reference, notNullValue());
        assertThat(reference.getName(), nullValue());
    }

    //BaseRock generated method id: ${testNameSetter}, hash: 8B113740E2E4AC38A105EE9651F9A0A0
    @Test
    public void testNameSetter() {
        V1PriorityLevelConfigurationReference reference = new V1PriorityLevelConfigurationReference();
        reference.setName("priority-level-1");
        assertThat(reference.getName(), equalTo("priority-level-1"));
    }

    //BaseRock generated method id: ${testNameGetter}, hash: 824C839B782FE6C5F84968723E0682C5
    @Test
    public void testNameGetter() {
        V1PriorityLevelConfigurationReference reference = new V1PriorityLevelConfigurationReference();
        reference.setName("priority-level-2");
        assertThat(reference.getName(), equalTo("priority-level-2"));
    }

    //BaseRock generated method id: ${testNameFluentSetter}, hash: F7B6DABDBD14922845017F282A899E00
    @Test
    public void testNameFluentSetter() {
        V1PriorityLevelConfigurationReference reference = new V1PriorityLevelConfigurationReference().name("priority-level-3");
        assertThat(reference.getName(), equalTo("priority-level-3"));
    }

    //BaseRock generated method id: ${testWithDifferentNameValues}, hash: CF645DE6A3FECEA562D272ED74A2ECB2
    @ParameterizedTest
    @ValueSource(strings = { "priority-high", "priority-medium", "priority-low" })
    public void testWithDifferentNameValues(String name) {
        V1PriorityLevelConfigurationReference reference = new V1PriorityLevelConfigurationReference().name(name);
        assertThat(reference.getName(), equalTo(name));
    }

    //BaseRock generated method id: ${testEquals}, hash: 828391F011004F9A6FB3B4B6019A29BE
    @Test
    public void testEquals() {
        V1PriorityLevelConfigurationReference reference1 = new V1PriorityLevelConfigurationReference().name("priority-level-1");
        V1PriorityLevelConfigurationReference reference2 = new V1PriorityLevelConfigurationReference().name("priority-level-1");
        V1PriorityLevelConfigurationReference reference3 = new V1PriorityLevelConfigurationReference().name("priority-level-2");
        assertThat(reference1.equals(reference1), equalTo(true));
        assertThat(reference1.equals(reference2), equalTo(true));
        assertThat(reference1.equals(reference3), equalTo(false));
        assertThat(reference1.equals(null), equalTo(false));
        assertThat(reference1.equals("not a reference"), equalTo(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 0F60003E05EC328F8DD444F92ACC26A2
    @Test
    public void testHashCode() {
        V1PriorityLevelConfigurationReference reference1 = new V1PriorityLevelConfigurationReference().name("priority-level-1");
        V1PriorityLevelConfigurationReference reference2 = new V1PriorityLevelConfigurationReference().name("priority-level-1");
        V1PriorityLevelConfigurationReference reference3 = new V1PriorityLevelConfigurationReference().name("priority-level-2");
        assertThat(reference1.hashCode() == reference2.hashCode(), equalTo(true));
        assertThat(reference1.hashCode() == reference3.hashCode(), equalTo(false));
    }

    //BaseRock generated method id: ${testToString}, hash: 5909C715D1120FFE6881263410E29D05
    @Test
    public void testToString() {
        V1PriorityLevelConfigurationReference reference = new V1PriorityLevelConfigurationReference().name("priority-level-1");
        String toString = reference.toString();
        assertThat(toString.contains("class V1PriorityLevelConfigurationReference"), equalTo(true));
        assertThat(toString.contains("name: priority-level-1"), equalTo(true));
    }

    //BaseRock generated method id: ${testOpenApiFields}, hash: 6EB45DD0C2DEC40CBCF7D2B4C608ECC3
    @Test
    public void testOpenApiFields() {
        HashSet<String> fields = V1PriorityLevelConfigurationReference.openapiFields;
        assertThat(fields, notNullValue());
        assertThat(fields.contains("name"), equalTo(true));
    }

    //BaseRock generated method id: ${testOpenApiRequiredFields}, hash: 50D8B38F388A5321C4A809A3D35016AD
    @Test
    public void testOpenApiRequiredFields() {
        HashSet<String> requiredFields = V1PriorityLevelConfigurationReference.openapiRequiredFields;
        assertThat(requiredFields, notNullValue());
        assertThat(requiredFields.contains("name"), equalTo(true));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 4A1F50D27B4252FFBDEFDDB369E5C3C6
    @Test
    public void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "priority-level-1");
        V1PriorityLevelConfigurationReference.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testValidateJsonElementMissingRequiredField}, hash: BCEEFF6628081A7B1E1278428AFD25A4
    @Test
    public void testValidateJsonElementMissingRequiredField() {
        JsonObject jsonObject = new JsonObject();
        try {
            V1PriorityLevelConfigurationReference.validateJsonElement(jsonObject);
            assertThat("Expected an IllegalArgumentException to be thrown", false);
        } catch (IllegalArgumentException | IOException e) {
            assertThat(e.getMessage().contains("name"), equalTo(true));
        }
    }

    //BaseRock generated method id: ${testFromJson}, hash: FACC0F3FFB9477A1FA177018CD2D12BA
    @Test
    public void testFromJson() throws IOException {
        String json = "{\"name\":\"priority-level-1\"}";
        V1PriorityLevelConfigurationReference reference = V1PriorityLevelConfigurationReference.fromJson(json);
        assertThat(reference, notNullValue());
        assertThat(reference.getName(), equalTo("priority-level-1"));
    }

    //BaseRock generated method id: ${testToJson}, hash: E7D6C40D49C457E862A20C591304D025
    @Test
    public void testToJson() {
        V1PriorityLevelConfigurationReference reference = new V1PriorityLevelConfigurationReference().name("priority-level-1");
        String json = reference.toJson();
        assertThat(json, notNullValue());
        assertThat(json.contains("\"name\":\"priority-level-1\""), equalTo(true));
    }

    //BaseRock generated method id: ${testWithNullAndEmptyName}, hash: 8F2E318F29BDDB0FFB0FC4318CD60592
    @ParameterizedTest
    @NullAndEmptySource
    public void testWithNullAndEmptyName(String name) {
        V1PriorityLevelConfigurationReference reference = new V1PriorityLevelConfigurationReference().name(name);
        assertThat(reference.getName(), equalTo(name));
    }
}
