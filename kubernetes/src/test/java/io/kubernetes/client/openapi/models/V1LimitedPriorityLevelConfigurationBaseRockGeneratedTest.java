package io.kubernetes.client.openapi.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import io.kubernetes.client.openapi.models.V1LimitResponse;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1LimitedPriorityLevelConfigurationBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 418FC4C75D7B72633B84C5F326211202
    @Test
    void testConstructor() {
        V1LimitedPriorityLevelConfiguration configuration = new V1LimitedPriorityLevelConfiguration();
        assertNotNull(configuration);
    }

    //BaseRock generated method id: ${testBorrowingLimitPercent}, hash: 65BCCDD6E7738F281804A0333AC8873F
    @Test
    void testBorrowingLimitPercent() {
        V1LimitedPriorityLevelConfiguration configuration = new V1LimitedPriorityLevelConfiguration();
        Integer borrowingLimitPercent = 50;
        configuration.setBorrowingLimitPercent(borrowingLimitPercent);
        assertEquals(borrowingLimitPercent, configuration.getBorrowingLimitPercent());
    }

    //BaseRock generated method id: ${testLendablePercent}, hash: 9ACC4D49FD35369CA5CC14BC662E1092
    @Test
    void testLendablePercent() {
        V1LimitedPriorityLevelConfiguration configuration = new V1LimitedPriorityLevelConfiguration();
        Integer lendablePercent = 75;
        configuration.setLendablePercent(lendablePercent);
        assertEquals(lendablePercent, configuration.getLendablePercent());
    }

    //BaseRock generated method id: ${testLimitResponse}, hash: AFEDEF3C0CE9470A15DEF4A821D5D6F4
    @Test
    void testLimitResponse() {
        V1LimitedPriorityLevelConfiguration configuration = new V1LimitedPriorityLevelConfiguration();
        V1LimitResponse limitResponse = mock(V1LimitResponse.class);
        configuration.setLimitResponse(limitResponse);
        assertEquals(limitResponse, configuration.getLimitResponse());
    }

    //BaseRock generated method id: ${testNominalConcurrencyShares}, hash: 57B680033CA2A2CD206EFD878F545AFE
    @Test
    void testNominalConcurrencyShares() {
        V1LimitedPriorityLevelConfiguration configuration = new V1LimitedPriorityLevelConfiguration();
        Integer nominalConcurrencyShares = 100;
        configuration.setNominalConcurrencyShares(nominalConcurrencyShares);
        assertEquals(nominalConcurrencyShares, configuration.getNominalConcurrencyShares());
    }

    //BaseRock generated method id: ${testEquals}, hash: 38CFFD46A95954CA5188C22C32087FDF
    @Test
    void testEquals() {
        V1LimitedPriorityLevelConfiguration config1 = new V1LimitedPriorityLevelConfiguration().borrowingLimitPercent(50).lendablePercent(75).nominalConcurrencyShares(100);
        V1LimitedPriorityLevelConfiguration config2 = new V1LimitedPriorityLevelConfiguration().borrowingLimitPercent(50).lendablePercent(75).nominalConcurrencyShares(100);
        assertThat(config1, is(equalTo(config2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 6DF924253764000033E678533B45603E
    @Test
    void testHashCode() {
        V1LimitedPriorityLevelConfiguration config = new V1LimitedPriorityLevelConfiguration().borrowingLimitPercent(50).lendablePercent(75).nominalConcurrencyShares(100);
        assertThat(config.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 8AEA166E5F7AF9D0D472D2B9A97A314F
    @Test
    void testToString() {
        V1LimitedPriorityLevelConfiguration config = new V1LimitedPriorityLevelConfiguration().borrowingLimitPercent(50).lendablePercent(75).nominalConcurrencyShares(100);
        String result = config.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result.contains("borrowingLimitPercent"), is(true));
        assertThat(result.contains("lendablePercent"), is(true));
        assertThat(result.contains("nominalConcurrencyShares"), is(true));
    }

    //BaseRock generated method id: ${testBorrowingLimitPercentBoundaries}, hash: 15EE19663DEFD0C67477237678F22C55
    @ParameterizedTest
    @ValueSource(ints = { 0, 50, 100 })
    void testBorrowingLimitPercentBoundaries(int value) {
        V1LimitedPriorityLevelConfiguration config = new V1LimitedPriorityLevelConfiguration().borrowingLimitPercent(value);
        assertEquals(value, config.getBorrowingLimitPercent());
    }

    //BaseRock generated method id: ${testLendablePercentBoundaries}, hash: 65D41E65A30A07B265DA63A5DC2E6EC3
    @ParameterizedTest
    @ValueSource(ints = { 0, 50, 100 })
    void testLendablePercentBoundaries(int value) {
        V1LimitedPriorityLevelConfiguration config = new V1LimitedPriorityLevelConfiguration().lendablePercent(value);
        assertEquals(value, config.getLendablePercent());
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 0CAD06C5FFEE8D319ECCBD16AEF088B3
    @Test
    void testBuilderPattern() {
        V1LimitResponse mockLimitResponse = mock(V1LimitResponse.class);
        V1LimitedPriorityLevelConfiguration config = new V1LimitedPriorityLevelConfiguration().borrowingLimitPercent(50).lendablePercent(75).limitResponse(mockLimitResponse).nominalConcurrencyShares(100);
        assertEquals(50, config.getBorrowingLimitPercent());
        assertEquals(75, config.getLendablePercent());
        assertEquals(mockLimitResponse, config.getLimitResponse());
        assertEquals(100, config.getNominalConcurrencyShares());
    }
}
