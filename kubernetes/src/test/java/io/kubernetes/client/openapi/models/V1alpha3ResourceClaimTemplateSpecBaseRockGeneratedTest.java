package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import io.kubernetes.client.openapi.models.V1alpha3ResourceClaimSpec;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha3ResourceClaimTemplateSpecBaseRockGeneratedTest {

    private V1alpha3ResourceClaimTemplateSpec templateSpec;

    private V1ObjectMeta metadata;

    private V1alpha3ResourceClaimSpec spec;

    @BeforeEach
    void setUp() {
        metadata = mock(V1ObjectMeta.class);
        spec = mock(V1alpha3ResourceClaimSpec.class);
        templateSpec = new V1alpha3ResourceClaimTemplateSpec();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 0B52C214CE831813BC02438354C4B6E2
    @Test
    void testConstructor() {
        assertNotNull(templateSpec);
    }

    //BaseRock generated method id: ${testMetadataSetter}, hash: 5EC6524567C9325A17F3E8A5AC4978EE
    @Test
    void testMetadataSetter() {
        templateSpec.setMetadata(metadata);
        assertThat(templateSpec.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testMetadataGetter}, hash: EF85F0DE63CC95A717BC8A61138E6772
    @Test
    void testMetadataGetter() {
        templateSpec.setMetadata(metadata);
        assertThat(templateSpec.getMetadata(), is(notNullValue()));
        assertThat(templateSpec.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testSpecSetter}, hash: 27606529F8A5A7977A7D5F229E9F0CCF
    @Test
    void testSpecSetter() {
        templateSpec.setSpec(spec);
        assertThat(templateSpec.getSpec(), is(equalTo(spec)));
    }

    //BaseRock generated method id: ${testSpecGetter}, hash: 5E87FCB363EBA42D0F67EEDA6F66DB8B
    @Test
    void testSpecGetter() {
        templateSpec.setSpec(spec);
        assertThat(templateSpec.getSpec(), is(notNullValue()));
        assertThat(templateSpec.getSpec(), is(equalTo(spec)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 401739DAD3B3B44762E3526052248C34
    @Test
    void testEquals() {
        V1alpha3ResourceClaimTemplateSpec spec1 = new V1alpha3ResourceClaimTemplateSpec().metadata(metadata).spec(spec);
        V1alpha3ResourceClaimTemplateSpec spec2 = new V1alpha3ResourceClaimTemplateSpec().metadata(metadata).spec(spec);
        assertThat(spec1.equals(spec2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 2192BD1E771E8A53C10A7E1D74E7905D
    @Test
    void testHashCode() {
        V1alpha3ResourceClaimTemplateSpec spec1 = new V1alpha3ResourceClaimTemplateSpec().metadata(metadata).spec(spec);
        V1alpha3ResourceClaimTemplateSpec spec2 = new V1alpha3ResourceClaimTemplateSpec().metadata(metadata).spec(spec);
        assertThat(spec1.hashCode(), is(equalTo(spec2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: A8745114F05FB41E63FC566E42B28000
    @Test
    void testToString() {
        when(metadata.toString()).thenReturn("MetadataString");
        when(spec.toString()).thenReturn("SpecString");
        V1alpha3ResourceClaimTemplateSpec spec = new V1alpha3ResourceClaimTemplateSpec().metadata(metadata).spec(this.spec);
        String expectedString = "class V1alpha3ResourceClaimTemplateSpec {\n    metadata: MetadataString\n    spec: SpecString\n}";
        assertThat(spec.toString(), is(equalTo(expectedString)));
    }
}
