package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1NodeFeatures;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1NodeFeaturesBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1NodeFeaturesConstruction}, hash: D9380AF3B692092B44746FADD78771C3
    @Test
    void testV1NodeFeaturesConstruction() {
        V1NodeFeatures v1NodeFeatures = new V1NodeFeatures();
        assertThat(v1NodeFeatures, is(notNullValue()));
    }

    //BaseRock generated method id: ${testSupplementalGroupsPolicyGetterAndSetter}, hash: A1F301B05DD0AB5C0B8BD1B24039C10C
    @Test
    void testSupplementalGroupsPolicyGetterAndSetter() {
        V1NodeFeatures v1NodeFeatures = new V1NodeFeatures();
        v1NodeFeatures.setSupplementalGroupsPolicy(true);
        assertThat(v1NodeFeatures.getSupplementalGroupsPolicy(), is(true));
        v1NodeFeatures.setSupplementalGroupsPolicy(false);
        assertThat(v1NodeFeatures.getSupplementalGroupsPolicy(), is(false));
    }

    //BaseRock generated method id: ${testSupplementalGroupsPolicyFluentSetter}, hash: 3B702BEA0DF9DAB8019CC811D6011E0A
    @Test
    void testSupplementalGroupsPolicyFluentSetter() {
        V1NodeFeatures v1NodeFeatures = new V1NodeFeatures().supplementalGroupsPolicy(true);
        assertThat(v1NodeFeatures.getSupplementalGroupsPolicy(), is(true));
    }

    //BaseRock generated method id: ${testEqualsMethod}, hash: 4B68A6F077796EDE7F31076A9EBB273D
    @Test
    void testEqualsMethod() {
        V1NodeFeatures v1NodeFeatures1 = new V1NodeFeatures().supplementalGroupsPolicy(true);
        V1NodeFeatures v1NodeFeatures2 = new V1NodeFeatures().supplementalGroupsPolicy(true);
        V1NodeFeatures v1NodeFeatures3 = new V1NodeFeatures().supplementalGroupsPolicy(false);
        assertThat(v1NodeFeatures1.equals(v1NodeFeatures2), is(true));
        assertThat(v1NodeFeatures1.equals(v1NodeFeatures3), is(false));
    }

    //BaseRock generated method id: ${testHashCodeMethod}, hash: 1C46EFCB2E58C43A31C9CB3CFD6B9910
    @Test
    void testHashCodeMethod() {
        V1NodeFeatures v1NodeFeatures1 = new V1NodeFeatures().supplementalGroupsPolicy(true);
        V1NodeFeatures v1NodeFeatures2 = new V1NodeFeatures().supplementalGroupsPolicy(true);
        V1NodeFeatures v1NodeFeatures3 = new V1NodeFeatures().supplementalGroupsPolicy(false);
        assertThat(v1NodeFeatures1.hashCode() == v1NodeFeatures2.hashCode(), is(true));
        assertThat(v1NodeFeatures1.hashCode() == v1NodeFeatures3.hashCode(), is(false));
    }

    //BaseRock generated method id: ${testToStringMethod}, hash: EF55DD3E22D2DBEA4652C50379224624
    @Test
    void testToStringMethod() {
        V1NodeFeatures v1NodeFeatures = new V1NodeFeatures().supplementalGroupsPolicy(true);
        String expectedString = "class V1NodeFeatures {\n    supplementalGroupsPolicy: true\n}";
        assertThat(v1NodeFeatures.toString(), is(expectedString));
    }
}
