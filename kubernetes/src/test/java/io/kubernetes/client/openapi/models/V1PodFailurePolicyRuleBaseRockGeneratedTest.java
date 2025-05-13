package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.V1PodFailurePolicyOnExitCodesRequirement;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.openapi.models.V1PodFailurePolicyOnPodConditionsPattern;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PodFailurePolicyRuleBaseRockGeneratedTest {

    @Mock
    private V1PodFailurePolicyOnExitCodesRequirement mockOnExitCodes;

    @Mock
    private V1PodFailurePolicyOnPodConditionsPattern mockOnPodConditionsPattern;

    private V1PodFailurePolicyRule v1PodFailurePolicyRule;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        v1PodFailurePolicyRule = new V1PodFailurePolicyRule();
    }

    //BaseRock generated method id: ${testConstructor}, hash: AE90376BA40F9A4B74CAE2D0E342C07C
    @Test
    void testConstructor() {
        assertNotNull(v1PodFailurePolicyRule);
    }

    //BaseRock generated method id: ${testSetAndGetAction}, hash: 3DCCD74611CED8866F2F125E5B5BDE7F
    @Test
    void testSetAndGetAction() {
        String action = "FailJob";
        v1PodFailurePolicyRule.setAction(action);
        assertEquals(action, v1PodFailurePolicyRule.getAction());
    }

    //BaseRock generated method id: ${testSetAndGetOnExitCodes}, hash: B5B9DF95B8F3A4751AC6F9405DF62D4B
    @Test
    void testSetAndGetOnExitCodes() {
        v1PodFailurePolicyRule.setOnExitCodes(mockOnExitCodes);
        assertEquals(mockOnExitCodes, v1PodFailurePolicyRule.getOnExitCodes());
    }

    //BaseRock generated method id: ${testSetAndGetOnPodConditions}, hash: C822424FEB129AB79D8103664654B662
    @Test
    void testSetAndGetOnPodConditions() {
        List<V1PodFailurePolicyOnPodConditionsPattern> onPodConditions = new ArrayList<>();
        onPodConditions.add(mockOnPodConditionsPattern);
        v1PodFailurePolicyRule.setOnPodConditions(onPodConditions);
        assertEquals(onPodConditions, v1PodFailurePolicyRule.getOnPodConditions());
    }

    //BaseRock generated method id: ${testAddOnPodConditionsItem}, hash: 815BE29063DDE8108960EC692EED3575
    @Test
    void testAddOnPodConditionsItem() {
        v1PodFailurePolicyRule.addOnPodConditionsItem(mockOnPodConditionsPattern);
        List<V1PodFailurePolicyOnPodConditionsPattern> onPodConditions = v1PodFailurePolicyRule.getOnPodConditions();
        assertNotNull(onPodConditions);
        assertEquals(1, onPodConditions.size());
        assertEquals(mockOnPodConditionsPattern, onPodConditions.get(0));
    }

    //BaseRock generated method id: ${testEquals}, hash: FC045CB83758C66BA96549CFD23F4457
    @Test
    void testEquals() {
        V1PodFailurePolicyRule rule1 = new V1PodFailurePolicyRule().action("FailJob").onExitCodes(mockOnExitCodes);
        V1PodFailurePolicyRule rule2 = new V1PodFailurePolicyRule().action("FailJob").onExitCodes(mockOnExitCodes);
        assertEquals(rule1, rule2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 1B95D23CF331D39255272703CB1E29EB
    @Test
    void testHashCode() {
        V1PodFailurePolicyRule rule1 = new V1PodFailurePolicyRule().action("FailJob").onExitCodes(mockOnExitCodes);
        V1PodFailurePolicyRule rule2 = new V1PodFailurePolicyRule().action("FailJob").onExitCodes(mockOnExitCodes);
        assertEquals(rule1.hashCode(), rule2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 3BA4CB49CAFD53D0D759191B0A47FDAF
    @Test
    void testToString() {
        v1PodFailurePolicyRule.setAction("FailJob");
        v1PodFailurePolicyRule.setOnExitCodes(mockOnExitCodes);
        String expected = "class V1PodFailurePolicyRule {\n" + "    action: FailJob\n" + "    onExitCodes: " + mockOnExitCodes + "\n" + "    onPodConditions: []\n" + "}";
        assertEquals(expected, v1PodFailurePolicyRule.toString());
    }

    //BaseRock generated method id: ${testSetActionWithValidValues}, hash: D86A08643397787FE44D8626EF1575E6
    @ParameterizedTest
    @ValueSource(strings = { "FailJob", "FailIndex", "Ignore", "Count" })
    void testSetActionWithValidValues(String action) {
        v1PodFailurePolicyRule.setAction(action);
        assertEquals(action, v1PodFailurePolicyRule.getAction());
    }

    //BaseRock generated method id: ${testSetActionWithNull}, hash: EA581988C3BB85C8B413E72B3C41480E
    @Test
    void testSetActionWithNull() {
        v1PodFailurePolicyRule.setAction(null);
        assertNull(v1PodFailurePolicyRule.getAction());
    }

    //BaseRock generated method id: ${testEqualsWithDifferentAction}, hash: 57398FF2D941CB9E27AA1BB46E35FCE2
    @Test
    void testEqualsWithDifferentAction() {
        V1PodFailurePolicyRule rule1 = new V1PodFailurePolicyRule().action("FailJob");
        V1PodFailurePolicyRule rule2 = new V1PodFailurePolicyRule().action("Ignore");
        assertNotEquals(rule1, rule2);
    }

    //BaseRock generated method id: ${testEqualsWithDifferentOnExitCodes}, hash: 767CA07BEF03AA371BC3C03AFB0DA436
    @Test
    void testEqualsWithDifferentOnExitCodes() {
        V1PodFailurePolicyRule rule1 = new V1PodFailurePolicyRule().onExitCodes(mockOnExitCodes);
        V1PodFailurePolicyRule rule2 = new V1PodFailurePolicyRule().onExitCodes(mock(V1PodFailurePolicyOnExitCodesRequirement.class));
        assertNotEquals(rule1, rule2);
    }

    //BaseRock generated method id: ${testEqualsWithDifferentOnPodConditions}, hash: DEEA55B3743EAE95C60D923125C46366
    @Test
    void testEqualsWithDifferentOnPodConditions() {
        List<V1PodFailurePolicyOnPodConditionsPattern> list1 = new ArrayList<>();
        list1.add(mockOnPodConditionsPattern);
        List<V1PodFailurePolicyOnPodConditionsPattern> list2 = new ArrayList<>();
        list2.add(mock(V1PodFailurePolicyOnPodConditionsPattern.class));
        V1PodFailurePolicyRule rule1 = new V1PodFailurePolicyRule().onPodConditions(list1);
        V1PodFailurePolicyRule rule2 = new V1PodFailurePolicyRule().onPodConditions(list2);
        assertNotEquals(rule1, rule2);
    }

    //BaseRock generated method id: ${testHashCodeConsistency}, hash: 239EDF817B03F5B67F41B7A7C0CCB94E
    @Test
    void testHashCodeConsistency() {
        V1PodFailurePolicyRule rule = new V1PodFailurePolicyRule().action("FailJob").onExitCodes(mockOnExitCodes);
        int initialHashCode = rule.hashCode();
        assertEquals(initialHashCode, rule.hashCode());
        rule.setAction("Ignore");
        assertNotEquals(initialHashCode, rule.hashCode());
    }

    //BaseRock generated method id: ${testToStringWithNullFields}, hash: 47F7A5FE919C8E125FC99AE7D64AC6AC
    @Test
    void testToStringWithNullFields() {
        String expected = "class V1PodFailurePolicyRule {\n" + "    action: null\n" + "    onExitCodes: null\n" + "    onPodConditions: []\n" + "}";
        assertEquals(expected, v1PodFailurePolicyRule.toString());
    }
}
