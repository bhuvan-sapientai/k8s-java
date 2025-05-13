package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1alpha3ResourceClaimTemplateSpec;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullSource;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha3ResourceClaimTemplateBaseRockGeneratedTest {

    private V1alpha3ResourceClaimTemplate v1alpha3ResourceClaimTemplate;

    @BeforeEach
    void setUp() {
        v1alpha3ResourceClaimTemplate = new V1alpha3ResourceClaimTemplate();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 986D89296882EAE7DDDB7CE0D9CEB551
    @Test
    void testConstructor() {
        assertThat(v1alpha3ResourceClaimTemplate, is(notNullValue()));
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 7A99F4213E437C4A60367E64BC6FFC25
    @Test
    void testApiVersion() {
        String apiVersion = "v1alpha3";
        v1alpha3ResourceClaimTemplate.setApiVersion(apiVersion);
        assertThat(v1alpha3ResourceClaimTemplate.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testKind}, hash: 634795D86DA4FADC28E60AED059DE0ED
    @Test
    void testKind() {
        String kind = "ResourceClaimTemplate";
        v1alpha3ResourceClaimTemplate.setKind(kind);
        assertThat(v1alpha3ResourceClaimTemplate.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testMetadata}, hash: FCDC75474921C0E46E529CDFA12996E0
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = new V1ObjectMeta();
        v1alpha3ResourceClaimTemplate.setMetadata(metadata);
        assertThat(v1alpha3ResourceClaimTemplate.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testSpec}, hash: AA30680703360B3683C71CB9A1A348F6
    @Test
    void testSpec() {
        V1alpha3ResourceClaimTemplateSpec spec = new V1alpha3ResourceClaimTemplateSpec();
        v1alpha3ResourceClaimTemplate.setSpec(spec);
        assertThat(v1alpha3ResourceClaimTemplate.getSpec(), is(equalTo(spec)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 2901350B7E13AEC7D133E03CD2486C91
    @Test
    void testEquals() {
        V1alpha3ResourceClaimTemplate other = new V1alpha3ResourceClaimTemplate();
        other.setApiVersion("v1alpha3");
        other.setKind("ResourceClaimTemplate");
        other.setMetadata(new V1ObjectMeta());
        other.setSpec(new V1alpha3ResourceClaimTemplateSpec());
        v1alpha3ResourceClaimTemplate.setApiVersion("v1alpha3");
        v1alpha3ResourceClaimTemplate.setKind("ResourceClaimTemplate");
        v1alpha3ResourceClaimTemplate.setMetadata(new V1ObjectMeta());
        v1alpha3ResourceClaimTemplate.setSpec(new V1alpha3ResourceClaimTemplateSpec());
        assertThat(v1alpha3ResourceClaimTemplate.equals(other), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 5B52E31C0BD563A35C945CF1D3AD8E02
    @Test
    void testHashCode() {
        v1alpha3ResourceClaimTemplate.setApiVersion("v1alpha3");
        v1alpha3ResourceClaimTemplate.setKind("ResourceClaimTemplate");
        v1alpha3ResourceClaimTemplate.setMetadata(new V1ObjectMeta());
        v1alpha3ResourceClaimTemplate.setSpec(new V1alpha3ResourceClaimTemplateSpec());
        int hashCode = v1alpha3ResourceClaimTemplate.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 346246EF821566B5F2BCE63E04E80B26
    @Test
    void testToString() {
        v1alpha3ResourceClaimTemplate.setApiVersion("v1alpha3");
        v1alpha3ResourceClaimTemplate.setKind("ResourceClaimTemplate");
        v1alpha3ResourceClaimTemplate.setMetadata(new V1ObjectMeta());
        v1alpha3ResourceClaimTemplate.setSpec(new V1alpha3ResourceClaimTemplateSpec());
        String toString = v1alpha3ResourceClaimTemplate.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("spec"), is(true));
    }

    //BaseRock generated method id: ${testApiVersionWithDifferentValues}, hash: F8BC360DEF540138CB9F5765AC0AFB24
    @ParameterizedTest
    @NullSource
    @ValueSource(strings = { "v1", "v2" })
    void testApiVersionWithDifferentValues(String apiVersion) {
        v1alpha3ResourceClaimTemplate.setApiVersion(apiVersion);
        assertThat(v1alpha3ResourceClaimTemplate.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testKindWithDifferentValues}, hash: 047AE7A5B396079B698D6C0B2C3F46ED
    @ParameterizedTest
    @NullSource
    @ValueSource(strings = { "ResourceClaim", "Template" })
    void testKindWithDifferentValues(String kind) {
        v1alpha3ResourceClaimTemplate.setKind(kind);
        assertThat(v1alpha3ResourceClaimTemplate.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testSetNullMetadata}, hash: 2D96BA80273C53AC5C1DD6A5B138D4DB
    @Test
    void testSetNullMetadata() {
        v1alpha3ResourceClaimTemplate.setMetadata(null);
        assertThat(v1alpha3ResourceClaimTemplate.getMetadata(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetNullSpec}, hash: 9E1D41456A417B36CECC613C0E69E317
    @Test
    void testSetNullSpec() {
        v1alpha3ResourceClaimTemplate.setSpec(new V1alpha3ResourceClaimTemplateSpec());
        assertThat(v1alpha3ResourceClaimTemplate.getSpec(), is(notNullValue()));
        v1alpha3ResourceClaimTemplate.setSpec(null);
        assertThat(v1alpha3ResourceClaimTemplate.getSpec(), is(equalTo(null)));
    }
}
