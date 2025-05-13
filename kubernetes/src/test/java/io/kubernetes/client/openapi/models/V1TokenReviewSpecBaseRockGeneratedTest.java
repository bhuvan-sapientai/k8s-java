package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.containsInAnyOrder;
import io.kubernetes.client.openapi.models.V1TokenReviewSpec;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1TokenReviewSpecBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1TokenReviewSpecConstructor}, hash: F3A3457DA89D8788DA116282FB446139
    @Test
    void testV1TokenReviewSpecConstructor() {
        V1TokenReviewSpec spec = new V1TokenReviewSpec();
        assertThat(spec, is(notNullValue()));
        assertThat(spec.getAudiences(), is(empty()));
        assertThat(spec.getToken(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetAudiences}, hash: C81C83FA2A7E2A4C7C42256E22A6F90A
    @Test
    void testSetAndGetAudiences() {
        V1TokenReviewSpec spec = new V1TokenReviewSpec();
        List<String> audiences = Arrays.asList("audience1", "audience2");
        spec.setAudiences(audiences);
        assertThat(spec.getAudiences(), is(equalTo(audiences)));
    }

    //BaseRock generated method id: ${testAddAudiencesItem}, hash: B36AC2341375E0A594BA8FD1D03DC888
    @Test
    void testAddAudiencesItem() {
        V1TokenReviewSpec spec = new V1TokenReviewSpec();
        spec.addAudiencesItem("audience1");
        spec.addAudiencesItem("audience2");
        assertThat(spec.getAudiences(), hasSize(2));
        assertThat(spec.getAudiences(), containsInAnyOrder("audience1", "audience2"));
    }

    //BaseRock generated method id: ${testSetAndGetToken}, hash: 44506BC9489DEB0BC62E54D78955436A
    @Test
    void testSetAndGetToken() {
        V1TokenReviewSpec spec = new V1TokenReviewSpec();
        String token = "testToken";
        spec.setToken(token);
        assertThat(spec.getToken(), is(equalTo(token)));
    }

    //BaseRock generated method id: ${testSetAndGetTokenWithDifferentValues}, hash: F77F0A985A0B8224DE3042863CB2D55F
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "token1", "token2" })
    void testSetAndGetTokenWithDifferentValues(String token) {
        V1TokenReviewSpec spec = new V1TokenReviewSpec();
        spec.setToken(token);
        assertEquals(token, spec.getToken());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: B84EF23E35B0F033B563C3B17C59FD96
    @Test
    void testEqualsAndHashCode() {
        V1TokenReviewSpec spec1 = new V1TokenReviewSpec().audiences(Arrays.asList("audience1", "audience2")).token("token1");
        V1TokenReviewSpec spec2 = new V1TokenReviewSpec().audiences(Arrays.asList("audience1", "audience2")).token("token1");
        V1TokenReviewSpec spec3 = new V1TokenReviewSpec().audiences(Arrays.asList("audience3")).token("token2");
        assertEquals(spec1, spec2);
        assertEquals(spec1.hashCode(), spec2.hashCode());
        assertNotEquals(spec1, spec3);
        assertNotEquals(spec1.hashCode(), spec3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 3F80CD72D6900B7CABE354FBCDED1985
    @Test
    void testToString() {
        V1TokenReviewSpec spec = new V1TokenReviewSpec().audiences(Arrays.asList("audience1", "audience2")).token("testToken");
        String toString = spec.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("class V1TokenReviewSpec"), is(true));
        assertThat(toString.contains("audiences"), is(true));
        assertThat(toString.contains("token"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 01156676874D0EFF290026AFACA547AA
    @Test
    void testBuilder() {
        List<String> audiences = Arrays.asList("audience1", "audience2");
        String token = "testToken";
        V1TokenReviewSpec spec = new V1TokenReviewSpec().audiences(audiences).token(token);
        assertThat(spec.getAudiences(), is(equalTo(audiences)));
        assertThat(spec.getToken(), is(equalTo(token)));
    }

    //BaseRock generated method id: ${testAudiencesWithNull}, hash: B3753E5811A319951230DFA72C6EBF38
    @Test
    void testAudiencesWithNull() {
        V1TokenReviewSpec spec = new V1TokenReviewSpec();
        spec.setAudiences(null);
        assertThat(spec.getAudiences(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAddAudiencesItemWithNull}, hash: 9923CC4C8E41A21DA62F78DDF35B0698
    @Test
    void testAddAudiencesItemWithNull() {
        V1TokenReviewSpec spec = new V1TokenReviewSpec();
        spec.addAudiencesItem(null);
        assertThat(spec.getAudiences(), hasSize(1));
        assertThat(spec.getAudiences().get(0), is(nullValue()));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: A0784D6E122EC7D91006AA1C64647841
    @Test
    void testEqualsWithNull() {
        V1TokenReviewSpec spec = new V1TokenReviewSpec();
        assertNotEquals(null, spec);
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 03B652640F1A17B3044F62EF173844C1
    @Test
    void testEqualsWithDifferentClass() {
        V1TokenReviewSpec spec = new V1TokenReviewSpec();
        assertNotEquals(spec, new Object());
    }

    //BaseRock generated method id: ${testHashCodeConsistency}, hash: 378743C671D2F1944AFAF970B93810CB
    @Test
    void testHashCodeConsistency() {
        V1TokenReviewSpec spec = new V1TokenReviewSpec().audiences(Arrays.asList("audience1", "audience2")).token("token");
        int initialHashCode = spec.hashCode();
        int secondHashCode = spec.hashCode();
        assertEquals(initialHashCode, secondHashCode);
    }

    //BaseRock generated method id: ${testAudiencesImmutability}, hash: 05CDAA3FF8FA858CAA0BEA00B8072208
    @Disabled()
    @Test
    void testAudiencesImmutability() {
        V1TokenReviewSpec spec = new V1TokenReviewSpec();
        List<String> audiences = new ArrayList<>(Arrays.asList("audience1", "audience2"));
        spec.setAudiences(audiences);
        audiences.add("audience3");
        assertThat(spec.getAudiences(), hasSize(2));
        assertThat(spec.getAudiences(), containsInAnyOrder("audience1", "audience2"));
    }
}
