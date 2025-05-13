package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import io.kubernetes.client.openapi.models.V1SuccessPolicyRule;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
class V1SuccessPolicyRuleBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1SuccessPolicyRuleConstructor}, hash: 2A780A4BE81878AC5D857FA10C073AAE
    @Test
    void testV1SuccessPolicyRuleConstructor() {
        V1SuccessPolicyRule rule = new V1SuccessPolicyRule();
        assertNotNull(rule);
    }

    //BaseRock generated method id: ${testSetAndGetSucceededCount}, hash: 87F0B1FC1D476B89BCC98210E5CFFF6F
    @Test
    void testSetAndGetSucceededCount() {
        V1SuccessPolicyRule rule = new V1SuccessPolicyRule();
        Integer succeededCount = 5;
        rule.setSucceededCount(succeededCount);
        assertEquals(succeededCount, rule.getSucceededCount());
    }

    //BaseRock generated method id: ${testSetAndGetSucceededIndexes}, hash: 336838A45E3101ABB55302DC3BD790FB
    @Test
    void testSetAndGetSucceededIndexes() {
        V1SuccessPolicyRule rule = new V1SuccessPolicyRule();
        String succeededIndexes = "1-4,6,8-10";
        rule.setSucceededIndexes(succeededIndexes);
        assertEquals(succeededIndexes, rule.getSucceededIndexes());
    }

    //BaseRock generated method id: ${testSucceededCountBuilder}, hash: C9724192B39997F251FD16C15772E087
    @Test
    void testSucceededCountBuilder() {
        Integer succeededCount = 3;
        V1SuccessPolicyRule rule = new V1SuccessPolicyRule().succeededCount(succeededCount);
        assertEquals(succeededCount, rule.getSucceededCount());
    }

    //BaseRock generated method id: ${testSucceededIndexesBuilder}, hash: 79A1ED099E35550A239F7822DD20448B
    @Test
    void testSucceededIndexesBuilder() {
        String succeededIndexes = "1,3-5,7";
        V1SuccessPolicyRule rule = new V1SuccessPolicyRule().succeededIndexes(succeededIndexes);
        assertEquals(succeededIndexes, rule.getSucceededIndexes());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: D1A989CE70506FDC9007C1B91C4E7FD2
    @Test
    void testEqualsWithSameObject() {
        V1SuccessPolicyRule rule = new V1SuccessPolicyRule().succeededCount(3).succeededIndexes("1-3");
        assertThat(rule.equals(rule), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: AC192C44AE3BD83C6F7EE90790060419
    @Test
    void testEqualsWithDifferentObject() {
        V1SuccessPolicyRule rule1 = new V1SuccessPolicyRule().succeededCount(3).succeededIndexes("1-3");
        V1SuccessPolicyRule rule2 = new V1SuccessPolicyRule().succeededCount(3).succeededIndexes("1-3");
        assertThat(rule1.equals(rule2), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentValues}, hash: 33967198410EDEE55A0CC3151B3E5AAB
    @Test
    void testEqualsWithDifferentValues() {
        V1SuccessPolicyRule rule1 = new V1SuccessPolicyRule().succeededCount(3).succeededIndexes("1-3");
        V1SuccessPolicyRule rule2 = new V1SuccessPolicyRule().succeededCount(4).succeededIndexes("1-4");
        assertThat(rule1.equals(rule2), is(false));
    }

    //BaseRock generated method id: ${testHashCode}, hash: EE2A21949BD55AA7F0896E476A2CB886
    @Test
    void testHashCode() {
        V1SuccessPolicyRule rule1 = new V1SuccessPolicyRule().succeededCount(3).succeededIndexes("1-3");
        V1SuccessPolicyRule rule2 = new V1SuccessPolicyRule().succeededCount(3).succeededIndexes("1-3");
        assertThat(rule1.hashCode(), equalTo(rule2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 86B49145D693A958345A34BA1041BD20
    @Test
    void testToString() {
        V1SuccessPolicyRule rule = new V1SuccessPolicyRule().succeededCount(3).succeededIndexes("1-3");
        String expected = "class V1SuccessPolicyRule {\n    succeededCount: 3\n    succeededIndexes: 1-3\n}";
        assertThat(rule.toString(), equalTo(expected));
    }

    //BaseRock generated method id: ${testSucceededCountWithValidValues}, hash: 0D27C91E333169A45E751F5D1B06D485
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 10, 100 })
    void testSucceededCountWithValidValues(int count) {
        V1SuccessPolicyRule rule = new V1SuccessPolicyRule().succeededCount(count);
        assertThat(rule.getSucceededCount(), equalTo(count));
    }

    //BaseRock generated method id: ${testSucceededIndexesWithValidValues}, hash: CDD23BA49CA20D7F260A8BCAE48FA2DA
    @ParameterizedTest
    @ValueSource(strings = { "1", "1-5", "1,3,5-7", "1-3,5,7-9" })
    void testSucceededIndexesWithValidValues(String indexes) {
        V1SuccessPolicyRule rule = new V1SuccessPolicyRule().succeededIndexes(indexes);
        assertThat(rule.getSucceededIndexes(), equalTo(indexes));
    }
}
