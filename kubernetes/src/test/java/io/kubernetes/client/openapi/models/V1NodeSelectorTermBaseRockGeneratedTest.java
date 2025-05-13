package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import io.kubernetes.client.openapi.models.V1NodeSelectorRequirement;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.hamcrest.Matchers.empty;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1NodeSelectorTerm;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1NodeSelectorTermBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1NodeSelectorTermConstructor}, hash: 27C8C20A8E110E76D2EF9E5938A08051
    @Test
    void testV1NodeSelectorTermConstructor() {
        V1NodeSelectorTerm nodeSelectorTerm = new V1NodeSelectorTerm();
        assertThat(nodeSelectorTerm, is(notNullValue()));
        assertThat(nodeSelectorTerm.getMatchExpressions(), is(empty()));
        assertThat(nodeSelectorTerm.getMatchFields(), is(empty()));
    }

    //BaseRock generated method id: ${testMatchExpressions}, hash: FC6FE85FAF41B3AFE8DDB01FA6F77FC1
    @Test
    void testMatchExpressions() {
        V1NodeSelectorTerm nodeSelectorTerm = new V1NodeSelectorTerm();
        List<V1NodeSelectorRequirement> matchExpressions = new ArrayList<>();
        V1NodeSelectorRequirement requirement = new V1NodeSelectorRequirement();
        matchExpressions.add(requirement);
        nodeSelectorTerm.setMatchExpressions(matchExpressions);
        assertThat(nodeSelectorTerm.getMatchExpressions(), hasSize(1));
        assertThat(nodeSelectorTerm.getMatchExpressions(), contains(requirement));
        nodeSelectorTerm.addMatchExpressionsItem(new V1NodeSelectorRequirement());
        assertThat(nodeSelectorTerm.getMatchExpressions(), hasSize(2));
        nodeSelectorTerm.setMatchExpressions(null);
        assertThat(nodeSelectorTerm.getMatchExpressions(), is(nullValue()));
    }

    //BaseRock generated method id: ${testMatchFields}, hash: 002D3F353359542C8DCC56FDDDEDEBFF
    @Test
    void testMatchFields() {
        V1NodeSelectorTerm nodeSelectorTerm = new V1NodeSelectorTerm();
        List<V1NodeSelectorRequirement> matchFields = new ArrayList<>();
        V1NodeSelectorRequirement requirement = new V1NodeSelectorRequirement();
        matchFields.add(requirement);
        nodeSelectorTerm.setMatchFields(matchFields);
        assertThat(nodeSelectorTerm.getMatchFields(), hasSize(1));
        assertThat(nodeSelectorTerm.getMatchFields(), contains(requirement));
        nodeSelectorTerm.addMatchFieldsItem(new V1NodeSelectorRequirement());
        assertThat(nodeSelectorTerm.getMatchFields(), hasSize(2));
        nodeSelectorTerm.setMatchFields(null);
        assertThat(nodeSelectorTerm.getMatchFields(), is(nullValue()));
    }

    //BaseRock generated method id: ${testEquals}, hash: 38483BD47AC3B7B7EE298CB342B95D36
    @Test
    void testEquals() {
        V1NodeSelectorTerm term1 = new V1NodeSelectorTerm().matchExpressions(Arrays.asList(new V1NodeSelectorRequirement())).matchFields(Arrays.asList(new V1NodeSelectorRequirement()));
        V1NodeSelectorTerm term2 = new V1NodeSelectorTerm().matchExpressions(Arrays.asList(new V1NodeSelectorRequirement())).matchFields(Arrays.asList(new V1NodeSelectorRequirement()));
        V1NodeSelectorTerm term3 = new V1NodeSelectorTerm().matchExpressions(Arrays.asList(new V1NodeSelectorRequirement().key("key"))).matchFields(Arrays.asList(new V1NodeSelectorRequirement()));
        assertTrue(term1.equals(term2));
        assertEquals(term1.hashCode(), term2.hashCode());
        assertFalse(term1.equals(term3));
        assertNotEquals(term1.hashCode(), term3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 7D5812AED1BFF7B6583FB90D6EC76393
    @Test
    void testToString() {
        V1NodeSelectorTerm nodeSelectorTerm = new V1NodeSelectorTerm().matchExpressions(Arrays.asList(new V1NodeSelectorRequirement().key("key1"))).matchFields(Arrays.asList(new V1NodeSelectorRequirement().key("key2")));
        String toString = nodeSelectorTerm.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("matchExpressions"), is(true));
        assertThat(toString.contains("matchFields"), is(true));
        assertThat(toString.contains("key1"), is(true));
        assertThat(toString.contains("key2"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: C793DDAB1E82682E1D166C0D5FFAB9C7
    @Test
    void testBuilder() {
        V1NodeSelectorRequirement matchExpression = new V1NodeSelectorRequirement().key("exp");
        V1NodeSelectorRequirement matchField = new V1NodeSelectorRequirement().key("field");
        V1NodeSelectorTerm nodeSelectorTerm = new V1NodeSelectorTerm().addMatchExpressionsItem(matchExpression).addMatchFieldsItem(matchField);
        assertThat(nodeSelectorTerm.getMatchExpressions(), hasSize(1));
        assertThat(nodeSelectorTerm.getMatchExpressions().get(0), equalTo(matchExpression));
        assertThat(nodeSelectorTerm.getMatchFields(), hasSize(1));
        assertThat(nodeSelectorTerm.getMatchFields().get(0), equalTo(matchField));
    }
}
