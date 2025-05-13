package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1LabelSelector;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpec;
import io.kubernetes.client.custom.IntOrString;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PodDisruptionBudgetSpecBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 0ACD203F54ECD6541F75FE762ADC526C
    @Test
    void testConstructor() {
        V1PodDisruptionBudgetSpec spec = new V1PodDisruptionBudgetSpec();
        assertNotNull(spec);
    }

    //BaseRock generated method id: ${testMaxUnavailable}, hash: 153D0DF42439203A4C9C198EB842CF1A
    @Test
    void testMaxUnavailable() {
        V1PodDisruptionBudgetSpec spec = new V1PodDisruptionBudgetSpec();
        IntOrString maxUnavailable = new IntOrString(5);
        spec.setMaxUnavailable(maxUnavailable);
        assertEquals(maxUnavailable, spec.getMaxUnavailable());
    }

    //BaseRock generated method id: ${testMinAvailable}, hash: 550EE03E5232D86265649F5D7C2E0FF6
    @Test
    void testMinAvailable() {
        V1PodDisruptionBudgetSpec spec = new V1PodDisruptionBudgetSpec();
        IntOrString minAvailable = new IntOrString(3);
        spec.setMinAvailable(minAvailable);
        assertEquals(minAvailable, spec.getMinAvailable());
    }

    //BaseRock generated method id: ${testSelector}, hash: FA98F76F437276305D3648A5510AEC85
    @Test
    void testSelector() {
        V1PodDisruptionBudgetSpec spec = new V1PodDisruptionBudgetSpec();
        V1LabelSelector selector = mock(V1LabelSelector.class);
        spec.setSelector(selector);
        assertEquals(selector, spec.getSelector());
    }

    //BaseRock generated method id: ${testUnhealthyPodEvictionPolicy}, hash: 838EAF7A9B6D7DABB476BC72D6125C57
    @Test
    void testUnhealthyPodEvictionPolicy() {
        V1PodDisruptionBudgetSpec spec = new V1PodDisruptionBudgetSpec();
        String policy = "IfHealthyBudget";
        spec.setUnhealthyPodEvictionPolicy(policy);
        assertEquals(policy, spec.getUnhealthyPodEvictionPolicy());
    }

    //BaseRock generated method id: ${testEquals}, hash: D270E5EAC3A3317456C870ECAD2F37FE
    @Test
    void testEquals() {
        IntOrString maxUnavailable = new IntOrString(5);
        IntOrString minAvailable = new IntOrString(3);
        V1LabelSelector selector = mock(V1LabelSelector.class);
        String policy = "IfHealthyBudget";
        V1PodDisruptionBudgetSpec spec1 = new V1PodDisruptionBudgetSpec().maxUnavailable(maxUnavailable).minAvailable(minAvailable).selector(selector).unhealthyPodEvictionPolicy(policy);
        V1PodDisruptionBudgetSpec spec2 = new V1PodDisruptionBudgetSpec().maxUnavailable(maxUnavailable).minAvailable(minAvailable).selector(selector).unhealthyPodEvictionPolicy(policy);
        assertThat(spec1.equals(spec2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: D6E66D4C3C9390B31A707DCE0FF02E0D
    @Test
    void testHashCode() {
        V1PodDisruptionBudgetSpec spec = new V1PodDisruptionBudgetSpec().maxUnavailable(new IntOrString(5)).minAvailable(new IntOrString(3)).selector(mock(V1LabelSelector.class)).unhealthyPodEvictionPolicy("IfHealthyBudget");
        assertThat(spec.hashCode(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 04C07BFF278A33087BEA4961AF442773
    @Test
    void testToString() {
        V1PodDisruptionBudgetSpec spec = new V1PodDisruptionBudgetSpec().maxUnavailable(new IntOrString(5)).minAvailable(new IntOrString(3)).selector(mock(V1LabelSelector.class)).unhealthyPodEvictionPolicy("IfHealthyBudget");
        String result = spec.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result.contains("maxUnavailable"), is(true));
        assertThat(result.contains("minAvailable"), is(true));
        assertThat(result.contains("selector"), is(true));
        assertThat(result.contains("unhealthyPodEvictionPolicy"), is(true));
    }

    //BaseRock generated method id: ${testSettersAndGetters}, hash: D70998C672FE30B26E96CB3F1A62329C
    @Test
    void testSettersAndGetters() {
        V1PodDisruptionBudgetSpec spec = new V1PodDisruptionBudgetSpec();
        IntOrString maxUnavailable = new IntOrString(5);
        spec.setMaxUnavailable(maxUnavailable);
        assertThat(spec.getMaxUnavailable(), is(equalTo(maxUnavailable)));
        IntOrString minAvailable = new IntOrString(3);
        spec.setMinAvailable(minAvailable);
        assertThat(spec.getMinAvailable(), is(equalTo(minAvailable)));
        V1LabelSelector selector = mock(V1LabelSelector.class);
        spec.setSelector(selector);
        assertThat(spec.getSelector(), is(equalTo(selector)));
        String policy = "AlwaysAllow";
        spec.setUnhealthyPodEvictionPolicy(policy);
        assertThat(spec.getUnhealthyPodEvictionPolicy(), is(equalTo(policy)));
    }

    //BaseRock generated method id: ${testNullValues}, hash: 68D39B6E442C2827439560941136FFB1
    @Test
    void testNullValues() {
        V1PodDisruptionBudgetSpec spec = new V1PodDisruptionBudgetSpec();
        assertThat(spec.getMaxUnavailable(), is(nullValue()));
        assertThat(spec.getMinAvailable(), is(nullValue()));
        assertThat(spec.getSelector(), is(nullValue()));
        assertThat(spec.getUnhealthyPodEvictionPolicy(), is(nullValue()));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 720286BF20775505E3B800C389ACE3D8
    @Test
    void testBuilderPattern() {
        IntOrString maxUnavailable = new IntOrString(5);
        IntOrString minAvailable = new IntOrString(3);
        V1LabelSelector selector = mock(V1LabelSelector.class);
        String policy = "IfHealthyBudget";
        V1PodDisruptionBudgetSpec spec = new V1PodDisruptionBudgetSpec().maxUnavailable(maxUnavailable).minAvailable(minAvailable).selector(selector).unhealthyPodEvictionPolicy(policy);
        assertThat(spec.getMaxUnavailable(), is(equalTo(maxUnavailable)));
        assertThat(spec.getMinAvailable(), is(equalTo(minAvailable)));
        assertThat(spec.getSelector(), is(equalTo(selector)));
        assertThat(spec.getUnhealthyPodEvictionPolicy(), is(equalTo(policy)));
    }
}
