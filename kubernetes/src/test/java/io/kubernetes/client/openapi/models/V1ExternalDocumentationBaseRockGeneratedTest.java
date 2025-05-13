package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import com.google.gson.JsonParser;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ExternalDocumentationBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: D1F0FCAAC9D99B927AECDD296137A011
    @Test
    void testConstructor() {
        V1ExternalDocumentation externalDoc = new V1ExternalDocumentation();
        assertNotNull(externalDoc);
    }

    //BaseRock generated method id: ${testDescriptionSetter}, hash: F4913BF592EEE40DB1E3ACDEE2D337A4
    @Test
    void testDescriptionSetter() {
        V1ExternalDocumentation externalDoc = new V1ExternalDocumentation();
        externalDoc.setDescription("Test Description");
        assertEquals("Test Description", externalDoc.getDescription());
    }

    //BaseRock generated method id: ${testUrlSetter}, hash: B78A3F2BB42D9B2B8178C01505B13A8E
    @Test
    void testUrlSetter() {
        V1ExternalDocumentation externalDoc = new V1ExternalDocumentation();
        externalDoc.setUrl("https://test.com");
        assertEquals("https://test.com", externalDoc.getUrl());
    }

    //BaseRock generated method id: ${testDescriptionFluentSetter}, hash: 6C456FBF0AD67E856E2FF6563E6000A3
    @Test
    void testDescriptionFluentSetter() {
        V1ExternalDocumentation externalDoc = new V1ExternalDocumentation().description("Test Description");
        assertEquals("Test Description", externalDoc.getDescription());
    }

    //BaseRock generated method id: ${testUrlFluentSetter}, hash: 99CDC7902648C8E85F474BE4118B65CC
    @Test
    void testUrlFluentSetter() {
        V1ExternalDocumentation externalDoc = new V1ExternalDocumentation().url("https://test.com");
        assertEquals("https://test.com", externalDoc.getUrl());
    }

    //BaseRock generated method id: ${testDescriptionWithVariousInputs}, hash: A93826E3C36753A21B6160CE0A2F8F01
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "Test", "Another Test" })
    void testDescriptionWithVariousInputs(String input) {
        V1ExternalDocumentation externalDoc = new V1ExternalDocumentation();
        externalDoc.setDescription(input);
        assertEquals(input, externalDoc.getDescription());
    }

    //BaseRock generated method id: ${testUrlWithVariousInputs}, hash: 7F111F445AB9F0C6E8846A5DAA1D38B8
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "https://test.com", "http://example.org" })
    void testUrlWithVariousInputs(String input) {
        V1ExternalDocumentation externalDoc = new V1ExternalDocumentation();
        externalDoc.setUrl(input);
        assertEquals(input, externalDoc.getUrl());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 65DE2A6C2E6B1690DBBB3C80128E8AF1
    @Test
    void testEqualsWithSameObject() {
        V1ExternalDocumentation externalDoc = new V1ExternalDocumentation().description("Test").url("https://test.com");
        assertTrue(externalDoc.equals(externalDoc));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: 98C77DDAFD3A66D584D5E701B158DA10
    @Test
    void testEqualsWithDifferentObject() {
        V1ExternalDocumentation externalDoc1 = new V1ExternalDocumentation().description("Test").url("https://test.com");
        V1ExternalDocumentation externalDoc2 = new V1ExternalDocumentation().description("Test").url("https://test.com");
        assertTrue(externalDoc1.equals(externalDoc2));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 4885FBC20B82F1EA62EDDCEE139059CA
    @Test
    void testEqualsWithDifferentClass() {
        V1ExternalDocumentation externalDoc = new V1ExternalDocumentation();
        assertFalse(externalDoc.equals("Not an ExternalDocumentation"));
    }

    //BaseRock generated method id: ${testHashCode}, hash: CC5D2FC6891A11084883D96F3465B8E3
    @Test
    void testHashCode() {
        V1ExternalDocumentation externalDoc1 = new V1ExternalDocumentation().description("Test").url("https://test.com");
        V1ExternalDocumentation externalDoc2 = new V1ExternalDocumentation().description("Test").url("https://test.com");
        assertEquals(externalDoc1.hashCode(), externalDoc2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 28D90306C2A963CEAD47917D84487BD9
    @Test
    void testToString() {
        V1ExternalDocumentation externalDoc = new V1ExternalDocumentation().description("Test Description").url("https://test.com");
        String expected = "class V1ExternalDocumentation {\n    description: Test Description\n    url: https://test.com\n}";
        assertEquals(expected, externalDoc.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 9E8268EA16B629A6CC3E131DC6C42625
    @Test
    void testValidateJsonElement() throws IOException {
        String json = "{\"description\":\"Test\",\"url\":\"https://test.com\"}";
        JsonElement jsonElement = JsonParser.parseString(json);
        assertDoesNotThrow(() -> V1ExternalDocumentation.validateJsonElement(jsonElement));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidField}, hash: 590C6175ABB70D54598CDFDCB966D360
    @Test
    void testValidateJsonElementWithInvalidField() {
        String json = "{\"invalid\":\"field\"}";
        JsonElement jsonElement = JsonParser.parseString(json);
        assertThrows(IllegalArgumentException.class, () -> V1ExternalDocumentation.validateJsonElement(jsonElement));
    }

    //BaseRock generated method id: ${testFromJson}, hash: A14D3A6808F87E4FB19FC2249096A428
    @Test
    void testFromJson() throws IOException {
        String json = "{\"description\":\"Test\",\"url\":\"https://test.com\"}";
        V1ExternalDocumentation externalDoc = V1ExternalDocumentation.fromJson(json);
        assertEquals("Test", externalDoc.getDescription());
        assertEquals("https://test.com", externalDoc.getUrl());
    }

    //BaseRock generated method id: ${testToJson}, hash: 516FB932FEAAB5412C9C4B6EB50F01AE
    @Test
    void testToJson() {
        V1ExternalDocumentation externalDoc = new V1ExternalDocumentation().description("Test").url("https://test.com");
        String json = externalDoc.toJson();
        assertTrue(json.contains("\"description\":\"Test\""));
        assertTrue(json.contains("\"url\":\"https://test.com\""));
    }
}
