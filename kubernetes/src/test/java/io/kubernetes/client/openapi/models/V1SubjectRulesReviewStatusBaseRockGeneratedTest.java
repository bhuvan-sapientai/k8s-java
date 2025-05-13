package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatus;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1NonResourceRule;
import io.kubernetes.client.openapi.models.V1ResourceRule;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1SubjectRulesReviewStatusBaseRockGeneratedTest {

    private V1SubjectRulesReviewStatus status;

    @BeforeEach
    void setUp() {
        status = new V1SubjectRulesReviewStatus();
    }

    //BaseRock generated method id: ${testConstructor}, hash: C0515577F4B36C8507B14B7386258FF8
    @Test
    void testConstructor() {
        assertNotNull(status);
    }

    //BaseRock generated method id: ${testEvaluationError}, hash: F6A2AAEED18FFCE2D8C51270E1E51EEE
    @Test
    void testEvaluationError() {
        String error = "Test error";
        status.setEvaluationError(error);
        assertEquals(error, status.getEvaluationError());
    }

    //BaseRock generated method id: ${testIncomplete}, hash: CD05EFAB3D52099F8DEF863D5A24CDED
    @Test
    void testIncomplete() {
        status.setIncomplete(true);
        assertTrue(status.getIncomplete());
        status.setIncomplete(false);
        assertFalse(status.getIncomplete());
    }

    //BaseRock generated method id: ${testNonResourceRules}, hash: F9DEB91787EB63DF7F86136A84A7AF80
    @Test
    void testNonResourceRules() {
        List<V1NonResourceRule> rules = new ArrayList<>();
        V1NonResourceRule rule = mock(V1NonResourceRule.class);
        rules.add(rule);
        status.setNonResourceRules(rules);
        assertThat(status.getNonResourceRules(), hasSize(1));
        assertThat(status.getNonResourceRules().get(0), is(rule));
    }

    //BaseRock generated method id: ${testResourceRules}, hash: 736E09CF2D3C28E72BFB2D9B0784AD36
    @Test
    void testResourceRules() {
        List<V1ResourceRule> rules = new ArrayList<>();
        V1ResourceRule rule = mock(V1ResourceRule.class);
        rules.add(rule);
        status.setResourceRules(rules);
        assertThat(status.getResourceRules(), hasSize(1));
        assertThat(status.getResourceRules().get(0), is(rule));
    }

    //BaseRock generated method id: ${testEquals}, hash: D23643A139EC4D454B845EB24426E367
    @Test
    void testEquals() {
        V1SubjectRulesReviewStatus status1 = new V1SubjectRulesReviewStatus().evaluationError("error").incomplete(true).nonResourceRules(new ArrayList<>()).resourceRules(new ArrayList<>());
        V1SubjectRulesReviewStatus status2 = new V1SubjectRulesReviewStatus().evaluationError("error").incomplete(true).nonResourceRules(new ArrayList<>()).resourceRules(new ArrayList<>());
        assertTrue(status1.equals(status2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 442714E27FDCDE8B2934CDA86475DAE1
    @Test
    void testHashCode() {
        V1SubjectRulesReviewStatus status1 = new V1SubjectRulesReviewStatus().evaluationError("error").incomplete(true).nonResourceRules(new ArrayList<>()).resourceRules(new ArrayList<>());
        V1SubjectRulesReviewStatus status2 = new V1SubjectRulesReviewStatus().evaluationError("error").incomplete(true).nonResourceRules(new ArrayList<>()).resourceRules(new ArrayList<>());
        assertEquals(status1.hashCode(), status2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 0F02A813CB64972C17815142DB04AA55
    @Test
    void testToString() {
        V1SubjectRulesReviewStatus status = new V1SubjectRulesReviewStatus().evaluationError("error").incomplete(true).nonResourceRules(new ArrayList<>()).resourceRules(new ArrayList<>());
        String toString = status.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("evaluationError"), is(true));
        assertThat(toString.contains("incomplete"), is(true));
        assertThat(toString.contains("nonResourceRules"), is(true));
        assertThat(toString.contains("resourceRules"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: FA6C99F5F9B46FEC76F72FEA3DDE0FBC
    @Test
    void testBuilder() {
        List<V1NonResourceRule> nonResourceRules = new ArrayList<>();
        List<V1ResourceRule> resourceRules = new ArrayList<>();
        V1SubjectRulesReviewStatus status = new V1SubjectRulesReviewStatus().evaluationError("error").incomplete(true).nonResourceRules(nonResourceRules).resourceRules(resourceRules);
        assertThat(status.getEvaluationError(), equalTo("error"));
        assertThat(status.getIncomplete(), is(true));
        assertThat(status.getNonResourceRules(), equalTo(nonResourceRules));
        assertThat(status.getResourceRules(), equalTo(resourceRules));
    }

    //BaseRock generated method id: ${testAddNonResourceRulesItem}, hash: 8AB4538293EFEAFA13FEDB867C547BC1
    @Test
    void testAddNonResourceRulesItem() {
        V1NonResourceRule rule = mock(V1NonResourceRule.class);
        status.addNonResourceRulesItem(rule);
        assertThat(status.getNonResourceRules(), hasSize(1));
        assertThat(status.getNonResourceRules().get(0), is(rule));
    }

    //BaseRock generated method id: ${testAddResourceRulesItem}, hash: 1A9ABCF5B450BB02123A8385DA3C3AE8
    @Test
    void testAddResourceRulesItem() {
        V1ResourceRule rule = mock(V1ResourceRule.class);
        status.addResourceRulesItem(rule);
        assertThat(status.getResourceRules(), hasSize(1));
        assertThat(status.getResourceRules().get(0), is(rule));
    }
}
