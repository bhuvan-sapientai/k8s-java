package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import io.kubernetes.client.openapi.JSON;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PreferredSchedulingTermBaseRockGeneratedTest {

    @Mock
    private V1NodeSelectorTerm mockPreference;

    private V1PreferredSchedulingTerm schedulingTerm;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        schedulingTerm = new V1PreferredSchedulingTerm();
    }

    //BaseRock generated method id: ${testPreference}, hash: 0581F35993FBFE2F0E9918D515B42AD3
    @Test
    void testPreference() {
        schedulingTerm.setPreference(mockPreference);
        assertEquals(mockPreference, schedulingTerm.getPreference());
    }

    //BaseRock generated method id: ${testWeight}, hash: 6B6174AAB5B54F82F0C51FE02EB8BD59
    @ParameterizedTest
    @ValueSource(ints = { 1, 50, 100 })
    void testWeight(int weight) {
        schedulingTerm.setWeight(weight);
        assertEquals(weight, schedulingTerm.getWeight());
    }

    //BaseRock generated method id: ${testEquals}, hash: A7FDC7D8FFB36E2461EC0B6EF2633169
    @Test
    void testEquals() {
        V1PreferredSchedulingTerm term1 = new V1PreferredSchedulingTerm().preference(mockPreference).weight(50);
        V1PreferredSchedulingTerm term2 = new V1PreferredSchedulingTerm().preference(mockPreference).weight(50);
        assertEquals(term1, term2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 9F2A0537B1B5D8CBC902A53BE4AA817E
    @Test
    void testHashCode() {
        V1PreferredSchedulingTerm term1 = new V1PreferredSchedulingTerm().preference(mockPreference).weight(50);
        V1PreferredSchedulingTerm term2 = new V1PreferredSchedulingTerm().preference(mockPreference).weight(50);
        assertEquals(term1.hashCode(), term2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 80F0E259BF024AE7FAEF06D4BA3FBE22
    @Test
    void testToString() {
        when(mockPreference.toString()).thenReturn("MockPreference");
        schedulingTerm.setPreference(mockPreference);
        schedulingTerm.setWeight(75);
        String expected = "class V1PreferredSchedulingTerm {\n    preference: MockPreference\n    weight: 75\n}";
        assertEquals(expected, schedulingTerm.toString());
    }

    //BaseRock generated method id: ${testToJson}, hash: F2B7796489878459A27000B351F52AFF
    @Test
    void testToJson() throws IOException {
        when(mockPreference.toString()).thenReturn("MockPreference");
        schedulingTerm.setPreference(mockPreference);
        schedulingTerm.setWeight(75);
        String json = schedulingTerm.toJson();
        assertNotNull(json);
        assertTrue(json.contains("\"preference\":"));
        assertTrue(json.contains("\"weight\":75"));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 9A50DA05E65D95CED2E35F77B1DB6295
    @Test
    void testFromJson() throws IOException {
        String json = "{\"preference\":{},\"weight\":60}";
        V1PreferredSchedulingTerm fromJson = JSON.getGson().fromJson(json, V1PreferredSchedulingTerm.class);
        assertNotNull(fromJson);
        assertNotNull(fromJson.getPreference());
        assertEquals(60, fromJson.getWeight());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 478FB7B27E17681760A886BF7DB8D283
    @Test
    void testValidateJsonElement() {
        assertDoesNotThrow(() -> {
            JsonElement jsonElement = JSON.getGson().toJsonTree(new V1PreferredSchedulingTerm().preference(new V1NodeSelectorTerm()).weight(50));
            V1PreferredSchedulingTerm.validateJsonElement(jsonElement);
        });
    }

    //BaseRock generated method id: ${testValidateJsonElementThrowsIOException}, hash: 19AC44E77A512805A27ADAD933E290B9
    @Test
    void testValidateJsonElementThrowsIOException() {
        assertThrows(IllegalArgumentException.class, () -> {
            JsonElement jsonElement = JSON.getGson().toJsonTree(new V1PreferredSchedulingTerm());
            V1PreferredSchedulingTerm.validateJsonElement(jsonElement);
        });
    }
}
