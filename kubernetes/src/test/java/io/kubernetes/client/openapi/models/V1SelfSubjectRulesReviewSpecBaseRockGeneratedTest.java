package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1SelfSubjectRulesReviewSpec;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1SelfSubjectRulesReviewSpecBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: AB850895A94BBFDD1744E1EAEC18EC57
    @Test
    void testConstructor() {
        V1SelfSubjectRulesReviewSpec spec = new V1SelfSubjectRulesReviewSpec();
        assertThat(spec, is(notNullValue()));
    }

    //BaseRock generated method id: ${testNamespaceGetter}, hash: 420ECFC363808B2F73FE34F0D426EC7E
    @Test
    void testNamespaceGetter() {
        V1SelfSubjectRulesReviewSpec spec = new V1SelfSubjectRulesReviewSpec();
        assertThat(spec.getNamespace(), is((String) null));
    }

    //BaseRock generated method id: ${testNamespaceSetter}, hash: D0764347A5C56F98973B7F208B0169EE
    @ParameterizedTest
    @ValueSource(strings = { "default", "kube-system", "test-namespace" })
    void testNamespaceSetter(String namespace) {
        V1SelfSubjectRulesReviewSpec spec = new V1SelfSubjectRulesReviewSpec();
        spec.setNamespace(namespace);
        assertThat(spec.getNamespace(), is(namespace));
    }

    //BaseRock generated method id: ${testNamespaceSetterWithNullAndEmpty}, hash: 3D77E6101149879879DF18437312B1F0
    @ParameterizedTest
    @NullAndEmptySource
    void testNamespaceSetterWithNullAndEmpty(String namespace) {
        V1SelfSubjectRulesReviewSpec spec = new V1SelfSubjectRulesReviewSpec();
        spec.setNamespace(namespace);
        assertThat(spec.getNamespace(), is(namespace));
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: BB8FDB8317FB00867FC36C93A46D93D5
    @Test
    void testEqualsWithSameObject() {
        V1SelfSubjectRulesReviewSpec spec = new V1SelfSubjectRulesReviewSpec();
        assertThat(spec.equals(spec), is(true));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 24340291270A21BBBCE97C29A354C70B
    @Test
    void testEqualsWithDifferentClass() {
        V1SelfSubjectRulesReviewSpec spec = new V1SelfSubjectRulesReviewSpec();
        assertThat(spec.equals(new Object()), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: 01018E5A04017413636627802B41B8A2
    @Test
    void testEqualsWithNull() {
        V1SelfSubjectRulesReviewSpec spec = new V1SelfSubjectRulesReviewSpec();
        assertThat(spec.equals(null), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentNamespace}, hash: 88F5B5A5FE2FDCF4BB4D4907329B65BB
    @Test
    void testEqualsWithDifferentNamespace() {
        V1SelfSubjectRulesReviewSpec spec1 = new V1SelfSubjectRulesReviewSpec().namespace("namespace1");
        V1SelfSubjectRulesReviewSpec spec2 = new V1SelfSubjectRulesReviewSpec().namespace("namespace2");
        assertThat(spec1.equals(spec2), is(false));
    }

    //BaseRock generated method id: ${testEqualsWithSameNamespace}, hash: 6FB0444F173ECAB5CE086EDF4F73C1AD
    @Test
    void testEqualsWithSameNamespace() {
        V1SelfSubjectRulesReviewSpec spec1 = new V1SelfSubjectRulesReviewSpec().namespace("namespace");
        V1SelfSubjectRulesReviewSpec spec2 = new V1SelfSubjectRulesReviewSpec().namespace("namespace");
        assertThat(spec1.equals(spec2), is(true));
    }

    //BaseRock generated method id: ${testHashCodeConsistency}, hash: 9D8FDA28DF74261F71358AFF23227A4D
    @Test
    void testHashCodeConsistency() {
        V1SelfSubjectRulesReviewSpec spec = new V1SelfSubjectRulesReviewSpec().namespace("test");
        int initialHashCode = spec.hashCode();
        assertThat(spec.hashCode(), is(initialHashCode));
    }

    //BaseRock generated method id: ${testHashCodeWithDifferentNamespaces}, hash: A5F6808CB7F4DCD436F3713B0B96C828
    @Test
    void testHashCodeWithDifferentNamespaces() {
        V1SelfSubjectRulesReviewSpec spec1 = new V1SelfSubjectRulesReviewSpec().namespace("namespace1");
        V1SelfSubjectRulesReviewSpec spec2 = new V1SelfSubjectRulesReviewSpec().namespace("namespace2");
        assertThat(spec1.hashCode() == spec2.hashCode(), is(false));
    }

    //BaseRock generated method id: ${testToString}, hash: CCD85D51DBB48C00933BFABAA66B0281
    @Test
    void testToString() {
        V1SelfSubjectRulesReviewSpec spec = new V1SelfSubjectRulesReviewSpec().namespace("test-namespace");
        String result = spec.toString();
        assertThat(result.contains("class V1SelfSubjectRulesReviewSpec"), is(true));
        assertThat(result.contains("namespace: test-namespace"), is(true));
    }

    //BaseRock generated method id: ${testToStringWithNullNamespace}, hash: 4A613A1ED5A003E06B4F7EFBE1D31855
    @Test
    void testToStringWithNullNamespace() {
        V1SelfSubjectRulesReviewSpec spec = new V1SelfSubjectRulesReviewSpec();
        String result = spec.toString();
        assertThat(result.contains("class V1SelfSubjectRulesReviewSpec"), is(true));
        assertThat(result.contains("namespace: null"), is(true));
    }
}
