package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import io.kubernetes.client.openapi.models.V1PolicyRulesWithSubjects;
import io.kubernetes.client.openapi.models.V1FlowSchemaSpec;
import io.kubernetes.client.openapi.models.V1PriorityLevelConfigurationReference;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import static org.hamcrest.Matchers.not;
import io.kubernetes.client.openapi.models.V1FlowDistinguisherMethod;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1FlowSchemaSpecBaseRockGeneratedTest {

    private V1FlowSchemaSpec flowSchemaSpec;

    @BeforeEach
    void setUp() {
        flowSchemaSpec = new V1FlowSchemaSpec();
    }

    //BaseRock generated method id: ${testGetDistinguisherMethod}, hash: 61964C9EEF53566E8C61F9C57A96F4CE
    @Test
    void testGetDistinguisherMethod() {
        assertThat(flowSchemaSpec.getDistinguisherMethod(), is(nullValue()));
        V1FlowDistinguisherMethod distinguisherMethod = mock(V1FlowDistinguisherMethod.class);
        flowSchemaSpec.setDistinguisherMethod(distinguisherMethod);
        assertThat(flowSchemaSpec.getDistinguisherMethod(), is(equalTo(distinguisherMethod)));
    }

    //BaseRock generated method id: ${testGetMatchingPrecedence}, hash: FB33672F9C59C587DCF4821BF06E7FE3
    @Test
    void testGetMatchingPrecedence() {
        assertThat(flowSchemaSpec.getMatchingPrecedence(), is(nullValue()));
        Integer precedence = 1000;
        flowSchemaSpec.setMatchingPrecedence(precedence);
        assertThat(flowSchemaSpec.getMatchingPrecedence(), is(equalTo(precedence)));
    }

    //BaseRock generated method id: ${testGetPriorityLevelConfiguration}, hash: E12BC589088837ACA2178EABD3EFD48C
    @Test
    void testGetPriorityLevelConfiguration() {
        assertThat(flowSchemaSpec.getPriorityLevelConfiguration(), is(nullValue()));
        V1PriorityLevelConfigurationReference priorityLevelConfig = mock(V1PriorityLevelConfigurationReference.class);
        flowSchemaSpec.setPriorityLevelConfiguration(priorityLevelConfig);
        assertThat(flowSchemaSpec.getPriorityLevelConfiguration(), is(equalTo(priorityLevelConfig)));
    }

    //BaseRock generated method id: ${testGetRules}, hash: 9A092C38005164442FA47C59EEC83793
    @Test
    void testGetRules() {
        assertThat(flowSchemaSpec.getRules(), is(notNullValue()));
        assertThat(flowSchemaSpec.getRules(), hasSize(0));
        List<V1PolicyRulesWithSubjects> rules = new ArrayList<>();
        V1PolicyRulesWithSubjects rule = mock(V1PolicyRulesWithSubjects.class);
        rules.add(rule);
        flowSchemaSpec.setRules(rules);
        assertThat(flowSchemaSpec.getRules(), is(equalTo(rules)));
        assertThat(flowSchemaSpec.getRules(), hasSize(1));
    }

    //BaseRock generated method id: ${testAddRulesItem}, hash: 3B56280EEFDF2694216594928C682EC8
    @Test
    void testAddRulesItem() {
        assertThat(flowSchemaSpec.getRules(), is(notNullValue()));
        assertThat(flowSchemaSpec.getRules(), hasSize(0));
        V1PolicyRulesWithSubjects rule = mock(V1PolicyRulesWithSubjects.class);
        flowSchemaSpec.addRulesItem(rule);
        assertThat(flowSchemaSpec.getRules(), is(notNullValue()));
        assertThat(flowSchemaSpec.getRules(), hasSize(1));
        assertThat(flowSchemaSpec.getRules().get(0), is(equalTo(rule)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 0489836D7C9BF49810E281C9E3EDDE97
    @Test
    void testEquals() {
        V1FlowSchemaSpec spec1 = new V1FlowSchemaSpec();
        V1FlowSchemaSpec spec2 = new V1FlowSchemaSpec();
        assertThat(spec1.equals(spec2), is(true));
        V1FlowDistinguisherMethod distinguisherMethod = mock(V1FlowDistinguisherMethod.class);
        spec1.setDistinguisherMethod(distinguisherMethod);
        assertThat(spec1.equals(spec2), is(false));
        spec2.setDistinguisherMethod(distinguisherMethod);
        assertThat(spec1.equals(spec2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: DED30ACF2B0DC91E70E5E713F8771CD7
    @Test
    void testHashCode() {
        V1FlowSchemaSpec spec1 = new V1FlowSchemaSpec();
        V1FlowSchemaSpec spec2 = new V1FlowSchemaSpec();
        assertThat(spec1.hashCode(), is(equalTo(spec2.hashCode())));
        V1FlowDistinguisherMethod distinguisherMethod = mock(V1FlowDistinguisherMethod.class);
        spec1.setDistinguisherMethod(distinguisherMethod);
        assertThat(spec1.hashCode(), is(not(equalTo(spec2.hashCode()))));
        spec2.setDistinguisherMethod(distinguisherMethod);
        assertThat(spec1.hashCode(), is(equalTo(spec2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 17C22BF263E304B8D141A820CDD2DEE1
    @Test
    void testToString() {
        V1FlowSchemaSpec spec = new V1FlowSchemaSpec();
        V1FlowDistinguisherMethod distinguisherMethod = mock(V1FlowDistinguisherMethod.class);
        V1PriorityLevelConfigurationReference priorityLevelConfig = mock(V1PriorityLevelConfigurationReference.class);
        List<V1PolicyRulesWithSubjects> rules = new ArrayList<>();
        spec.setDistinguisherMethod(distinguisherMethod);
        spec.setMatchingPrecedence(1000);
        spec.setPriorityLevelConfiguration(priorityLevelConfig);
        spec.setRules(rules);
        String result = spec.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result.contains("distinguisherMethod"), is(true));
        assertThat(result.contains("matchingPrecedence"), is(true));
        assertThat(result.contains("priorityLevelConfiguration"), is(true));
        assertThat(result.contains("rules"), is(true));
    }

    //BaseRock generated method id: ${testToIndentedString}, hash: 60F1CBCB693A8E9E1E107C966ACC68FE
    @Test
    void testToIndentedString() {
        V1FlowSchemaSpec spec = new V1FlowSchemaSpec();
        V1FlowDistinguisherMethod distinguisherMethod = mock(V1FlowDistinguisherMethod.class);
        spec.setDistinguisherMethod(distinguisherMethod);
        String result = spec.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result.contains("    distinguisherMethod:"), is(true));
    }
}
