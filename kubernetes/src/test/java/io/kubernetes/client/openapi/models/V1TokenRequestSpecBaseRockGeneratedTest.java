package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1TokenRequestSpec;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.V1BoundObjectReference;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1TokenRequestSpecBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1TokenRequestSpecConstructor}, hash: 62836B59DBA45A00660610792624A754
    @Test
    void testV1TokenRequestSpecConstructor() {
        V1TokenRequestSpec spec = new V1TokenRequestSpec();
        assertThat(spec, is(notNullValue()));
        assertThat(spec.getAudiences(), is(notNullValue()));
        assertThat(spec.getAudiences(), hasSize(0));
        assertThat(spec.getBoundObjectRef(), is(nullValue()));
        assertThat(spec.getExpirationSeconds(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetAndGetAudiences}, hash: 737F216F372F764B696112EB4CAA7257
    @Test
    void testSetAndGetAudiences() {
        V1TokenRequestSpec spec = new V1TokenRequestSpec();
        List<String> audiences = Arrays.asList("audience1", "audience2");
        spec.setAudiences(audiences);
        assertThat(spec.getAudiences(), is(equalTo(audiences)));
    }

    //BaseRock generated method id: ${testAddAudiencesItem}, hash: 02736825D507A4E035DF90C231EF22C5
    @Test
    void testAddAudiencesItem() {
        V1TokenRequestSpec spec = new V1TokenRequestSpec();
        spec.addAudiencesItem("audience1");
        spec.addAudiencesItem("audience2");
        assertThat(spec.getAudiences(), containsInAnyOrder("audience1", "audience2"));
    }

    //BaseRock generated method id: ${testSetAndGetBoundObjectRef}, hash: D7BB677F2FEF1B785AF4E496A72902FB
    @Test
    void testSetAndGetBoundObjectRef() {
        V1TokenRequestSpec spec = new V1TokenRequestSpec();
        V1BoundObjectReference boundObjectRef = new V1BoundObjectReference();
        spec.setBoundObjectRef(boundObjectRef);
        assertThat(spec.getBoundObjectRef(), is(equalTo(boundObjectRef)));
    }

    //BaseRock generated method id: ${testSetAndGetExpirationSeconds}, hash: 17EF7BA8A5422CEC718E6762F12564B0
    @Test
    void testSetAndGetExpirationSeconds() {
        V1TokenRequestSpec spec = new V1TokenRequestSpec();
        Long expirationSeconds = 3600L;
        spec.setExpirationSeconds(expirationSeconds);
        assertThat(spec.getExpirationSeconds(), is(equalTo(expirationSeconds)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 403971151C6DDE57F7DE52BB2DD68BE5
    @Test
    void testEqualsAndHashCode() {
        V1TokenRequestSpec spec1 = new V1TokenRequestSpec().audiences(Arrays.asList("audience1", "audience2")).boundObjectRef(new V1BoundObjectReference()).expirationSeconds(3600L);
        V1TokenRequestSpec spec2 = new V1TokenRequestSpec().audiences(Arrays.asList("audience1", "audience2")).boundObjectRef(new V1BoundObjectReference()).expirationSeconds(3600L);
        V1TokenRequestSpec spec3 = new V1TokenRequestSpec().audiences(Arrays.asList("audience3")).boundObjectRef(new V1BoundObjectReference()).expirationSeconds(7200L);
        assertThat(spec1.equals(spec2), is(true));
        assertThat(spec1.equals(spec3), is(false));
        assertThat(spec1.hashCode(), is(equalTo(spec2.hashCode())));
        assertThat(spec1.hashCode(), is(not(equalTo(spec3.hashCode()))));
    }

    //BaseRock generated method id: ${testToString}, hash: B094AD1B7E2D26B14339BB96A4631849
    @Test
    void testToString() {
        V1TokenRequestSpec spec = new V1TokenRequestSpec().audiences(Arrays.asList("audience1", "audience2")).boundObjectRef(new V1BoundObjectReference()).expirationSeconds(3600L);
        String expectedString = "class V1TokenRequestSpec {\n" + "    audiences: [audience1, audience2]\n" + "    boundObjectRef: class V1BoundObjectReference {\n" + "        apiVersion: null\n" + "        kind: null\n" + "        name: null\n" + "        uid: null\n" + "    }\n" + "    expirationSeconds: 3600\n" + "}";
        assertThat(spec.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testExpirationSecondsValidValues}, hash: 5BFA05BFD1A81047F319C331E8523BDE
    @ParameterizedTest
    @ValueSource(longs = { 0L, 1L, 100L, Long.MAX_VALUE })
    void testExpirationSecondsValidValues(long value) {
        V1TokenRequestSpec spec = new V1TokenRequestSpec().expirationSeconds(value);
        assertThat(spec.getExpirationSeconds(), is(equalTo(value)));
    }

    //BaseRock generated method id: ${testExpirationSecondsNegativeValue}, hash: 48B020872226BB4E94EDAC0B343B85D2
    @Test
    void testExpirationSecondsNegativeValue() {
        V1TokenRequestSpec spec = new V1TokenRequestSpec();
        spec.setExpirationSeconds(-1L);
        assertThat(spec.getExpirationSeconds(), is(equalTo(-1L)));
    }

    //BaseRock generated method id: ${testAudiencesNull}, hash: EF6B98CCD9580E086857A4A0672AC694
    @Test
    void testAudiencesNull() {
        V1TokenRequestSpec spec = new V1TokenRequestSpec();
        spec.setAudiences(null);
        assertThat(spec.getAudiences(), is(nullValue()));
    }

    //BaseRock generated method id: ${testAudiencesEmptyList}, hash: B549E14D50346F4D3000BBA6CF336665
    @Test
    void testAudiencesEmptyList() {
        V1TokenRequestSpec spec = new V1TokenRequestSpec().audiences(new ArrayList<>());
        assertThat(spec.getAudiences(), is(notNullValue()));
        assertThat(spec.getAudiences(), hasSize(0));
    }

    //BaseRock generated method id: ${testAddAudiencesItemNull}, hash: 58654E8ED764FCAFE5CFD8B3F19381B7
    @Test
    void testAddAudiencesItemNull() {
        V1TokenRequestSpec spec = new V1TokenRequestSpec();
        spec.addAudiencesItem(null);
        assertThat(spec.getAudiences(), contains(nullValue()));
    }

    //BaseRock generated method id: ${testBoundObjectRefNull}, hash: 255730E02D1A372EA7D218B7B7282DD3
    @Test
    void testBoundObjectRefNull() {
        V1TokenRequestSpec spec = new V1TokenRequestSpec().boundObjectRef(null);
        assertThat(spec.getBoundObjectRef(), is(nullValue()));
    }
}
