package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;
import io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.google.gson.JsonObject;
import static org.hamcrest.Matchers.empty;
import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.notNullValue;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import static org.hamcrest.Matchers.containsInAnyOrder;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
public class V1TopologySelectorTermBaseRockGeneratedTest {

    //BaseRock generated method id: ${testDefaultConstructor}, hash: AB228C32A668B196DEA43BA454EA1375
    @Test
    public void testDefaultConstructor() {
        V1TopologySelectorTerm v1TopologySelectorTerm = new V1TopologySelectorTerm();
        assertNotNull(v1TopologySelectorTerm);
        assertNotNull(v1TopologySelectorTerm.getMatchLabelExpressions());
        assertThat(v1TopologySelectorTerm.getMatchLabelExpressions(), is(empty()));
    }

    //BaseRock generated method id: ${testMatchLabelExpressionsConstructor}, hash: DF0DFAA485BE2C9533A06C581AD2D434
    @Test
    public void testMatchLabelExpressionsConstructor() {
        List<V1TopologySelectorLabelRequirement> matchLabelExpressions = new ArrayList<>();
        V1TopologySelectorLabelRequirement requirement = new V1TopologySelectorLabelRequirement();
        matchLabelExpressions.add(requirement);
        V1TopologySelectorTerm v1TopologySelectorTerm = new V1TopologySelectorTerm().matchLabelExpressions(matchLabelExpressions);
        assertNotNull(v1TopologySelectorTerm);
        assertNotNull(v1TopologySelectorTerm.getMatchLabelExpressions());
        assertThat(v1TopologySelectorTerm.getMatchLabelExpressions(), hasSize(1));
        assertEquals(requirement, v1TopologySelectorTerm.getMatchLabelExpressions().get(0));
    }

    //BaseRock generated method id: ${testAddMatchLabelExpressionsItem}, hash: 3A50D9E8F03062A822C6BAE20702A770
    @Test
    public void testAddMatchLabelExpressionsItem() {
        V1TopologySelectorLabelRequirement requirement1 = new V1TopologySelectorLabelRequirement();
        V1TopologySelectorLabelRequirement requirement2 = new V1TopologySelectorLabelRequirement();
        V1TopologySelectorTerm v1TopologySelectorTerm = new V1TopologySelectorTerm().addMatchLabelExpressionsItem(requirement1).addMatchLabelExpressionsItem(requirement2);
        assertNotNull(v1TopologySelectorTerm);
        assertNotNull(v1TopologySelectorTerm.getMatchLabelExpressions());
        assertThat(v1TopologySelectorTerm.getMatchLabelExpressions(), hasSize(2));
        assertThat(v1TopologySelectorTerm.getMatchLabelExpressions(), containsInAnyOrder(requirement1, requirement2));
    }

    //BaseRock generated method id: ${testAddMatchLabelExpressionsItemToNullList}, hash: E39F6777A7DA7C8E1528ECBBA04B8802
    @Test
    public void testAddMatchLabelExpressionsItemToNullList() {
        V1TopologySelectorLabelRequirement requirement = new V1TopologySelectorLabelRequirement();
        V1TopologySelectorTerm v1TopologySelectorTerm = new V1TopologySelectorTerm();
        // Set matchLabelExpressions to null
        v1TopologySelectorTerm.setMatchLabelExpressions(null);
        // Add an item to the null list
        v1TopologySelectorTerm.addMatchLabelExpressionsItem(requirement);
        assertNotNull(v1TopologySelectorTerm.getMatchLabelExpressions());
        assertThat(v1TopologySelectorTerm.getMatchLabelExpressions(), hasSize(1));
        assertEquals(requirement, v1TopologySelectorTerm.getMatchLabelExpressions().get(0));
    }

    //BaseRock generated method id: ${testSetAndGetMatchLabelExpressions}, hash: B2AC9C72C9D8B47DE0C520AFAA80E204
    @Test
    public void testSetAndGetMatchLabelExpressions() {
        List<V1TopologySelectorLabelRequirement> matchLabelExpressions = new ArrayList<>();
        V1TopologySelectorLabelRequirement requirement1 = new V1TopologySelectorLabelRequirement();
        V1TopologySelectorLabelRequirement requirement2 = new V1TopologySelectorLabelRequirement();
        matchLabelExpressions.add(requirement1);
        matchLabelExpressions.add(requirement2);
        V1TopologySelectorTerm v1TopologySelectorTerm = new V1TopologySelectorTerm();
        v1TopologySelectorTerm.setMatchLabelExpressions(matchLabelExpressions);
        assertNotNull(v1TopologySelectorTerm.getMatchLabelExpressions());
        assertThat(v1TopologySelectorTerm.getMatchLabelExpressions(), hasSize(2));
        assertEquals(matchLabelExpressions, v1TopologySelectorTerm.getMatchLabelExpressions());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: BE366CDE2AB253687CED6CA25C1C0198
    @Test
    public void testEqualsWithSameObject() {
        V1TopologySelectorTerm v1TopologySelectorTerm = new V1TopologySelectorTerm();
        assertTrue(v1TopologySelectorTerm.equals(v1TopologySelectorTerm));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: CD68C759660320A20A57A772609CAE68
    @Test
    public void testEqualsWithNull() {
        V1TopologySelectorTerm v1TopologySelectorTerm = new V1TopologySelectorTerm();
        assertFalse(v1TopologySelectorTerm.equals(null));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: BC118C084AEC4571E6BA1346FCD631C8
    @Test
    public void testEqualsWithDifferentClass() {
        V1TopologySelectorTerm v1TopologySelectorTerm = new V1TopologySelectorTerm();
        assertFalse(v1TopologySelectorTerm.equals("string"));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObjects}, hash: 48B27B52C9A25ECDF011FA1CA30FEFFD
    @Test
    public void testEqualsWithDifferentObjects() {
        V1TopologySelectorLabelRequirement requirement1 = new V1TopologySelectorLabelRequirement();
        V1TopologySelectorLabelRequirement requirement2 = new V1TopologySelectorLabelRequirement();
        V1TopologySelectorTerm v1TopologySelectorTerm1 = new V1TopologySelectorTerm().addMatchLabelExpressionsItem(requirement1);
        V1TopologySelectorTerm v1TopologySelectorTerm2 = new V1TopologySelectorTerm().addMatchLabelExpressionsItem(requirement2);
        assertTrue(v1TopologySelectorTerm1.equals(v1TopologySelectorTerm1));
        assertTrue(v1TopologySelectorTerm2.equals(v1TopologySelectorTerm2));
    }

    //BaseRock generated method id: ${testEqualsWithIdenticalObjects}, hash: D2DD91D3DFD7CAA9E9770E8B5165C62D
    @Test
    public void testEqualsWithIdenticalObjects() {
        List<V1TopologySelectorLabelRequirement> matchLabelExpressions = new ArrayList<>();
        V1TopologySelectorLabelRequirement requirement = new V1TopologySelectorLabelRequirement();
        matchLabelExpressions.add(requirement);
        V1TopologySelectorTerm v1TopologySelectorTerm1 = new V1TopologySelectorTerm().matchLabelExpressions(matchLabelExpressions);
        V1TopologySelectorTerm v1TopologySelectorTerm2 = new V1TopologySelectorTerm().matchLabelExpressions(matchLabelExpressions);
        assertTrue(v1TopologySelectorTerm1.equals(v1TopologySelectorTerm2));
        assertTrue(v1TopologySelectorTerm2.equals(v1TopologySelectorTerm1));
    }

    //BaseRock generated method id: ${testHashCode}, hash: ED1619AEDE0412E03E22C494B8EA647E
    @Test
    public void testHashCode() {
        V1TopologySelectorLabelRequirement requirement = new V1TopologySelectorLabelRequirement();
        List<V1TopologySelectorLabelRequirement> matchLabelExpressions = new ArrayList<>();
        matchLabelExpressions.add(requirement);
        V1TopologySelectorTerm v1TopologySelectorTerm1 = new V1TopologySelectorTerm().matchLabelExpressions(matchLabelExpressions);
        V1TopologySelectorTerm v1TopologySelectorTerm2 = new V1TopologySelectorTerm().matchLabelExpressions(matchLabelExpressions);
        assertEquals(v1TopologySelectorTerm1.hashCode(), v1TopologySelectorTerm2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 6665E619EA9D2DED72492E664282454B
    @Test
    public void testToString() {
        V1TopologySelectorLabelRequirement requirement = new V1TopologySelectorLabelRequirement();
        V1TopologySelectorTerm v1TopologySelectorTerm = new V1TopologySelectorTerm().addMatchLabelExpressionsItem(requirement);
        String toString = v1TopologySelectorTerm.toString();
        assertNotNull(toString);
        assertTrue(toString.contains("class V1TopologySelectorTerm"));
        assertTrue(toString.contains("matchLabelExpressions"));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: FCF1B874B2430E98076B0A8BE6D3413F
    @Test
    public void testValidateJsonElement() throws IOException {
        // Create a valid JsonElement for validation
        JsonObject jsonObject = new JsonObject();
        JsonArray matchLabelArray = new JsonArray();
        JsonObject labelRequirement = new JsonObject();
        labelRequirement.addProperty("key", "zone");
        JsonArray valuesArray = new JsonArray();
        valuesArray.add("us-east1");
        labelRequirement.add("values", valuesArray);
        matchLabelArray.add(labelRequirement);
        jsonObject.add("matchLabelExpressions", matchLabelArray);
        // Should not throw an exception
        V1TopologySelectorTerm.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testFromJson}, hash: 62176B0DEC32C8753F36862E71863F73
    @Test
    public void testFromJson() throws IOException {
        String json = "{\"matchLabelExpressions\":[{\"key\":\"zone\",\"values\":[\"us-east1\"]}]}";
        V1TopologySelectorTerm v1TopologySelectorTerm = V1TopologySelectorTerm.fromJson(json);
        assertNotNull(v1TopologySelectorTerm);
        assertNotNull(v1TopologySelectorTerm.getMatchLabelExpressions());
        assertThat(v1TopologySelectorTerm.getMatchLabelExpressions(), hasSize(1));
    }

    //BaseRock generated method id: ${testToJson}, hash: 3009F3E7ACA7AB708675C50E40D23819
    @Test
    public void testToJson() {
        V1TopologySelectorLabelRequirement requirement = new V1TopologySelectorLabelRequirement();
        V1TopologySelectorTerm v1TopologySelectorTerm = new V1TopologySelectorTerm().addMatchLabelExpressionsItem(requirement);
        String json = v1TopologySelectorTerm.toJson();
        assertNotNull(json);
        assertThat(json, is(notNullValue()));
    }

    //BaseRock generated method id: ${testCustomTypeAdapterFactory}, hash: 02ED205F2162A51570EB93C258833A0B
    @Test
    public void testCustomTypeAdapterFactory() {
        // Test that the custom type adapter factory exists
        assertNotNull(new V1TopologySelectorTerm.CustomTypeAdapterFactory());
    }
}
