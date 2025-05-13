package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ScopeSelector;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.custom.Quantity;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import static org.mockito.Mockito.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1ResourceQuotaSpecBaseRockGeneratedTest {

    @Mock
    private V1ScopeSelector mockScopeSelector;

    private V1ResourceQuotaSpec v1ResourceQuotaSpec;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        v1ResourceQuotaSpec = new V1ResourceQuotaSpec();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 9543294B1AC97611DBACBC95B0D28673
    @Test
    void testConstructor() {
        assertNotNull(v1ResourceQuotaSpec);
        assertNotNull(v1ResourceQuotaSpec.getHard());
        assertNotNull(v1ResourceQuotaSpec.getScopes());
    }

    //BaseRock generated method id: ${testHard}, hash: DCA178A6A50105DA29509A9111C60860
    @Test
    void testHard() {
        Map<String, Quantity> hard = new HashMap<>();
        hard.put("cpu", new Quantity("1"));
        hard.put("memory", new Quantity("1Gi"));
        v1ResourceQuotaSpec.setHard(hard);
        assertEquals(hard, v1ResourceQuotaSpec.getHard());
    }

    //BaseRock generated method id: ${testPutHardItem}, hash: 66DE8B66F4FEC1AD1A6240A6F2D96571
    @Test
    void testPutHardItem() {
        String key = "cpu";
        Quantity value = new Quantity("1");
        v1ResourceQuotaSpec.putHardItem(key, value);
        assertEquals(value, v1ResourceQuotaSpec.getHard().get(key));
    }

    //BaseRock generated method id: ${testScopeSelector}, hash: 01DFCC1C94F0E6A0800D2333D116AB31
    @Test
    void testScopeSelector() {
        v1ResourceQuotaSpec.setScopeSelector(mockScopeSelector);
        assertEquals(mockScopeSelector, v1ResourceQuotaSpec.getScopeSelector());
    }

    //BaseRock generated method id: ${testScopes}, hash: 846AE5FCE1A152C3681AEF4CF36E75DA
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "BestEffort", "NotBestEffort", "Terminating", "NotTerminating" })
    void testScopes(String scope) {
        List<String> scopes = new ArrayList<>();
        if (scope != null) {
            scopes.add(scope);
        }
        v1ResourceQuotaSpec.setScopes(scopes);
        assertEquals(scopes, v1ResourceQuotaSpec.getScopes());
    }

    //BaseRock generated method id: ${testAddScopesItem}, hash: E8AC2380D1123C9CAA3545AC0035C81E
    @Test
    void testAddScopesItem() {
        String scope = "BestEffort";
        v1ResourceQuotaSpec.addScopesItem(scope);
        assertTrue(v1ResourceQuotaSpec.getScopes().contains(scope));
    }

    //BaseRock generated method id: ${testEquals}, hash: 844B15C20D09E478E74B3AE9D9171032
    @Test
    void testEquals() {
        V1ResourceQuotaSpec spec1 = new V1ResourceQuotaSpec();
        V1ResourceQuotaSpec spec2 = new V1ResourceQuotaSpec();
        assertTrue(spec1.equals(spec2));
        assertTrue(spec2.equals(spec1));
        Map<String, Quantity> hard1 = new HashMap<>();
        hard1.put("cpu", new Quantity("1"));
        spec1.setHard(hard1);
        assertFalse(spec1.equals(spec2));
        Map<String, Quantity> hard2 = new HashMap<>();
        hard2.put("cpu", new Quantity("1"));
        spec2.setHard(hard2);
        assertTrue(spec1.equals(spec2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: F058409135E5331ED508B56C300BA66C
    @Test
    void testHashCode() {
        V1ResourceQuotaSpec spec1 = new V1ResourceQuotaSpec();
        V1ResourceQuotaSpec spec2 = new V1ResourceQuotaSpec();
        assertEquals(spec1.hashCode(), spec2.hashCode());
        spec1.setScopeSelector(mockScopeSelector);
        assertNotEquals(spec1.hashCode(), spec2.hashCode());
        spec2.setScopeSelector(mockScopeSelector);
        assertEquals(spec1.hashCode(), spec2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: B133829180CF2289DE587282180B7B00
    @Test
    void testToString() {
        String result = v1ResourceQuotaSpec.toString();
        assertThat(result, containsString("class V1ResourceQuotaSpec"));
        assertThat(result, containsString("hard"));
        assertThat(result, containsString("scopeSelector"));
        assertThat(result, containsString("scopes"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: C15765FDC09259908697A8EEFA0D95E1
    @Disabled()
    @Test
    void testValidateJsonElement() throws IOException {
        JsonElement jsonElement = mock(JsonElement.class);
        JsonObject jsonObject = mock(JsonObject.class);
        JsonElement hardElement = mock(JsonElement.class);
        JsonElement scopeSelectorElement = mock(JsonElement.class);
        JsonElement scopesElement = mock(JsonElement.class);
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        when(jsonObject.entrySet()).thenReturn(new JsonObject().entrySet());
        when(jsonObject.get("hard")).thenReturn(hardElement);
        when(jsonObject.get("scopeSelector")).thenReturn(scopeSelectorElement);
        when(jsonObject.get("scopes")).thenReturn(scopesElement);
        when(scopesElement.isJsonArray()).thenReturn(true);
        V1ResourceQuotaSpec.validateJsonElement(jsonElement);
        verify(jsonElement, times(1)).getAsJsonObject();
        verify(jsonObject, times(3)).get(anyString());
        verify(scopesElement).isJsonArray();
    }

    //BaseRock generated method id: ${testFromJson}, hash: BCB7979927B0845F53998B264ED14527
    @Test
    void testFromJson() throws IOException {
        String json = "{\"hard\":{\"cpu\":\"1\",\"memory\":\"1Gi\"},\"scopes\":[\"BestEffort\"]}";
        V1ResourceQuotaSpec result = V1ResourceQuotaSpec.fromJson(json);
        assertNotNull(result);
        assertEquals(2, result.getHard().size());
        assertEquals(new Quantity("1"), result.getHard().get("cpu"));
        assertEquals(new Quantity("1Gi"), result.getHard().get("memory"));
        assertEquals(1, result.getScopes().size());
        assertEquals("BestEffort", result.getScopes().get(0));
    }

    //BaseRock generated method id: ${testToJson}, hash: E83F229E66BE5D1B319AA26BD814EA5E
    @Test
    void testToJson() {
        Map<String, Quantity> hard = new HashMap<>();
        hard.put("cpu", new Quantity("1"));
        hard.put("memory", new Quantity("1Gi"));
        v1ResourceQuotaSpec.setHard(hard);
        List<String> scopes = new ArrayList<>();
        scopes.add("BestEffort");
        v1ResourceQuotaSpec.setScopes(scopes);
        String json = v1ResourceQuotaSpec.toJson();
        assertThat(json, containsString("\"hard\":{"));
        assertThat(json, containsString("\"cpu\":\"1\""));
        assertThat(json, containsString("\"memory\":\"1Gi\""));
        assertThat(json, containsString("\"scopes\":[\"BestEffort\"]"));
    }
}
