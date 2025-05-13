package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1LabelSelector;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1AggregationRule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import java.util.ArrayList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1AggregationRuleBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 8D18D6B46414F18148ACD7A306AF4632
    @Test
    void testConstructor() {
        V1AggregationRule aggregationRule = new V1AggregationRule();
        assertNotNull(aggregationRule);
    }

    //BaseRock generated method id: ${testClusterRoleSelectorsGetter}, hash: B05DF5CD7543E2285D1C23525BD56E41
    @Test
    void testClusterRoleSelectorsGetter() {
        V1AggregationRule aggregationRule = new V1AggregationRule();
        List<V1LabelSelector> clusterRoleSelectors = aggregationRule.getClusterRoleSelectors();
        assertThat(clusterRoleSelectors, is(empty()));
    }

    //BaseRock generated method id: ${testClusterRoleSelectorsSetterAndGetter}, hash: 8FB6C6A35B1A0A557CEAFBECBB472101
    @Test
    void testClusterRoleSelectorsSetterAndGetter() {
        V1AggregationRule aggregationRule = new V1AggregationRule();
        List<V1LabelSelector> clusterRoleSelectors = new ArrayList<>();
        clusterRoleSelectors.add(new V1LabelSelector());
        aggregationRule.setClusterRoleSelectors(clusterRoleSelectors);
        assertThat(aggregationRule.getClusterRoleSelectors(), is(clusterRoleSelectors));
    }

    //BaseRock generated method id: ${testClusterRoleSelectorsBuilder}, hash: FC366C774E4615D3138603350BA31236
    @Test
    void testClusterRoleSelectorsBuilder() {
        V1LabelSelector selector1 = new V1LabelSelector();
        V1LabelSelector selector2 = new V1LabelSelector();
        V1AggregationRule aggregationRule = new V1AggregationRule().clusterRoleSelectors(List.of(selector1, selector2));
        assertThat(aggregationRule.getClusterRoleSelectors(), containsInAnyOrder(selector1, selector2));
    }

    //BaseRock generated method id: ${testAddClusterRoleSelectorsItem}, hash: FF00B8FD00F2B1E2A0D5914DFB937518
    @Test
    void testAddClusterRoleSelectorsItem() {
        V1AggregationRule aggregationRule = new V1AggregationRule();
        V1LabelSelector selector = new V1LabelSelector();
        aggregationRule.addClusterRoleSelectorsItem(selector);
        assertThat(aggregationRule.getClusterRoleSelectors(), containsInAnyOrder(selector));
    }

    //BaseRock generated method id: ${testEquals}, hash: A1C037F9D13E2B22319466AA90B785A7
    @Test
    void testEquals() {
        V1AggregationRule aggregationRule1 = new V1AggregationRule().clusterRoleSelectors(List.of(new V1LabelSelector()));
        V1AggregationRule aggregationRule2 = new V1AggregationRule().clusterRoleSelectors(List.of(new V1LabelSelector()));
        V1AggregationRule aggregationRule3 = new V1AggregationRule();
        assertEquals(aggregationRule1, aggregationRule2);
        assertThat(aggregationRule1.equals(aggregationRule3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 5FFC20AB0EF6DC1547C019DFAB169259
    @Test
    void testHashCode() {
        V1AggregationRule aggregationRule1 = new V1AggregationRule().clusterRoleSelectors(List.of(new V1LabelSelector()));
        V1AggregationRule aggregationRule2 = new V1AggregationRule().clusterRoleSelectors(List.of(new V1LabelSelector()));
        assertEquals(aggregationRule1.hashCode(), aggregationRule2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: A4D9EC3262EDD000E332724230AC891A
    @Test
    void testToString() {
        V1AggregationRule aggregationRule = new V1AggregationRule().clusterRoleSelectors(List.of(new V1LabelSelector()));
        String result = aggregationRule.toString();
        assertThat(result, notNullValue());
        assertThat(result.contains("clusterRoleSelectors"), is(true));
    }
}
