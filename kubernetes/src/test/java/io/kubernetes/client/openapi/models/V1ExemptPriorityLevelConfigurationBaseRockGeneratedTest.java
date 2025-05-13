package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1ExemptPriorityLevelConfiguration;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ExemptPriorityLevelConfigurationBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 6050F217CDE0BA9E1814BC8B4813B4BA
    @Test
    void testConstructor() {
        V1ExemptPriorityLevelConfiguration configuration = new V1ExemptPriorityLevelConfiguration();
        assertThat(configuration, is(notNullValue()));
    }

    //BaseRock generated method id: ${testLendablePercent}, hash: F1B528D73D6F0C06634FE1E1F28EDAA0
    @Test
    void testLendablePercent() {
        V1ExemptPriorityLevelConfiguration configuration = new V1ExemptPriorityLevelConfiguration();
        Integer lendablePercent = 50;
        configuration.setLendablePercent(lendablePercent);
        assertThat(configuration.getLendablePercent(), is(equalTo(lendablePercent)));
    }

    //BaseRock generated method id: ${testNominalConcurrencyShares}, hash: 79135362DB06C1F6AAE9320DEA2EAC3B
    @Test
    void testNominalConcurrencyShares() {
        V1ExemptPriorityLevelConfiguration configuration = new V1ExemptPriorityLevelConfiguration();
        Integer nominalConcurrencyShares = 100;
        configuration.setNominalConcurrencyShares(nominalConcurrencyShares);
        assertThat(configuration.getNominalConcurrencyShares(), is(equalTo(nominalConcurrencyShares)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 3E8B61D0EDA324B4FAC11FC92639B17A
    @Test
    void testEquals() {
        V1ExemptPriorityLevelConfiguration config1 = new V1ExemptPriorityLevelConfiguration().lendablePercent(50).nominalConcurrencyShares(100);
        V1ExemptPriorityLevelConfiguration config2 = new V1ExemptPriorityLevelConfiguration().lendablePercent(50).nominalConcurrencyShares(100);
        V1ExemptPriorityLevelConfiguration config3 = new V1ExemptPriorityLevelConfiguration().lendablePercent(60).nominalConcurrencyShares(200);
        assertThat(config1.equals(config2), is(true));
        assertThat(config1.equals(config3), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: CF6F89F8CD1EE2576851D71D843AECA5
    @Test
    void testHashCode() {
        V1ExemptPriorityLevelConfiguration config1 = new V1ExemptPriorityLevelConfiguration().lendablePercent(50).nominalConcurrencyShares(100);
        V1ExemptPriorityLevelConfiguration config2 = new V1ExemptPriorityLevelConfiguration().lendablePercent(50).nominalConcurrencyShares(100);
        assertThat(config1.hashCode(), is(equalTo(config2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 9838F74DE349E556B021617E76CCE9AD
    @Test
    void testToString() {
        V1ExemptPriorityLevelConfiguration configuration = new V1ExemptPriorityLevelConfiguration().lendablePercent(50).nominalConcurrencyShares(100);
        String expectedString = "class V1ExemptPriorityLevelConfiguration {\n" + "    lendablePercent: 50\n" + "    nominalConcurrencyShares: 100\n" + "}";
        assertThat(configuration.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testLendablePercentBoundaries}, hash: FA099A84417F13DF25384C4E2845426D
    @ParameterizedTest
    @ValueSource(ints = { 0, 50, 100 })
    void testLendablePercentBoundaries(int lendablePercent) {
        V1ExemptPriorityLevelConfiguration configuration = new V1ExemptPriorityLevelConfiguration().lendablePercent(lendablePercent);
        assertThat(configuration.getLendablePercent(), is(equalTo(lendablePercent)));
    }

    //BaseRock generated method id: ${testFluentInterface}, hash: 78DA3DD572E533E7DBB3E203BE78E3B8
    @Test
    void testFluentInterface() {
        V1ExemptPriorityLevelConfiguration configuration = new V1ExemptPriorityLevelConfiguration().lendablePercent(50).nominalConcurrencyShares(100);
        assertThat(configuration.getLendablePercent(), is(equalTo(50)));
        assertThat(configuration.getNominalConcurrencyShares(), is(equalTo(100)));
    }
}
