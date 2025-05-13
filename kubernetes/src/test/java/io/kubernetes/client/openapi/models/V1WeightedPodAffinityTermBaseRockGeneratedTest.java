package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import org.junit.jupiter.params.provider.ValueSource;
import io.kubernetes.client.openapi.models.V1PodAffinityTerm;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1WeightedPodAffinityTermBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 13DFA7B1984B1F0A92B324C45A04A18C
    @Test
    void testConstructor() {
        V1WeightedPodAffinityTerm term = new V1WeightedPodAffinityTerm();
        assertThat(term, is(notNullValue()));
    }

    //BaseRock generated method id: ${testPodAffinityTermSetter}, hash: F8B1AD7DD84FF70BDD036CFB7260EDB9
    @Test
    void testPodAffinityTermSetter() {
        V1WeightedPodAffinityTerm term = new V1WeightedPodAffinityTerm();
        V1PodAffinityTerm podAffinityTerm = mock(V1PodAffinityTerm.class);
        term.setPodAffinityTerm(podAffinityTerm);
        assertThat(term.getPodAffinityTerm(), is(equalTo(podAffinityTerm)));
    }

    //BaseRock generated method id: ${testWeightSetter}, hash: 58E3B0635A7534E4CFCA2D1E9F49366C
    @Test
    void testWeightSetter() {
        V1WeightedPodAffinityTerm term = new V1WeightedPodAffinityTerm();
        term.setWeight(50);
        assertThat(term.getWeight(), is(equalTo(50)));
    }

    //BaseRock generated method id: ${testPodAffinityTermGetter}, hash: FD44B9FC442B3CC5F24C4CCB34353051
    @Test
    void testPodAffinityTermGetter() {
        V1WeightedPodAffinityTerm term = new V1WeightedPodAffinityTerm();
        V1PodAffinityTerm podAffinityTerm = mock(V1PodAffinityTerm.class);
        term.setPodAffinityTerm(podAffinityTerm);
        assertThat(term.getPodAffinityTerm(), is(equalTo(podAffinityTerm)));
    }

    //BaseRock generated method id: ${testWeightGetter}, hash: 9F7DC1254ACD486D72ED0A9425577B3B
    @Test
    void testWeightGetter() {
        V1WeightedPodAffinityTerm term = new V1WeightedPodAffinityTerm();
        term.setWeight(75);
        assertThat(term.getWeight(), is(equalTo(75)));
    }

    //BaseRock generated method id: ${testValidWeightRange}, hash: 0CA9F361AAED6A3325AAEE2F37F185DF
    @ParameterizedTest
    @ValueSource(ints = { 1, 50, 100 })
    void testValidWeightRange(int weight) {
        V1WeightedPodAffinityTerm term = new V1WeightedPodAffinityTerm();
        term.setWeight(weight);
        assertThat(term.getWeight(), is(equalTo(weight)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 3AB5A0DAA677F58FACA10DFA754C4DD7
    @Test
    void testEqualsAndHashCode() {
        V1PodAffinityTerm podAffinityTerm = mock(V1PodAffinityTerm.class);
        V1WeightedPodAffinityTerm term1 = new V1WeightedPodAffinityTerm().podAffinityTerm(podAffinityTerm).weight(50);
        V1WeightedPodAffinityTerm term2 = new V1WeightedPodAffinityTerm().podAffinityTerm(podAffinityTerm).weight(50);
        assertThat(term1, is(equalTo(term2)));
        assertThat(term1.hashCode(), is(equalTo(term2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 7265F8A1A6D7A506F9D198C0BFE1241D
    @Test
    void testToString() {
        V1WeightedPodAffinityTerm term = new V1WeightedPodAffinityTerm().podAffinityTerm(mock(V1PodAffinityTerm.class)).weight(50);
        String result = term.toString();
        assertThat(result, is(notNullValue()));
        assertThat(result.contains("podAffinityTerm"), is(true));
        assertThat(result.contains("weight"), is(true));
    }

    //BaseRock generated method id: ${testPodAffinityTermBuilderMethod}, hash: C95C8EC5262D44367F4737252277C5FB
    @Test
    void testPodAffinityTermBuilderMethod() {
        V1PodAffinityTerm podAffinityTerm = mock(V1PodAffinityTerm.class);
        V1WeightedPodAffinityTerm term = new V1WeightedPodAffinityTerm().podAffinityTerm(podAffinityTerm);
        assertThat(term.getPodAffinityTerm(), is(equalTo(podAffinityTerm)));
    }

    //BaseRock generated method id: ${testWeightBuilderMethod}, hash: 5B0EA4FB35ACDEA8598D828F71F96BAE
    @Test
    void testWeightBuilderMethod() {
        V1WeightedPodAffinityTerm term = new V1WeightedPodAffinityTerm().weight(25);
        assertThat(term.getWeight(), is(equalTo(25)));
    }

    //BaseRock generated method id: ${testNullPodAffinityTerm}, hash: C32326E4564F56953E405D7D580F27EB
    @Test
    void testNullPodAffinityTerm() {
        V1WeightedPodAffinityTerm term = new V1WeightedPodAffinityTerm();
        term.setPodAffinityTerm(null);
        assertThat(term.getPodAffinityTerm(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testNullWeight}, hash: B999F60B462EEA069B7A2CF6380EC13B
    @Test
    void testNullWeight() {
        V1WeightedPodAffinityTerm term = new V1WeightedPodAffinityTerm();
        term.setWeight(null);
        assertThat(term.getWeight(), is(equalTo(null)));
    }
}
