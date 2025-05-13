package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import io.kubernetes.client.openapi.models.V1beta1ResourceClaimTemplateSpec;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1ResourceClaimTemplateBaseRockGeneratedTest {

    private V1beta1ResourceClaimTemplate resourceClaimTemplate;

    @BeforeEach
    void setUp() {
        resourceClaimTemplate = new V1beta1ResourceClaimTemplate();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 06C01048333BC4192C3313E61C9E17F1
    @Test
    void testApiVersion() {
        String apiVersion = "v1beta1";
        resourceClaimTemplate.setApiVersion(apiVersion);
        assertThat(resourceClaimTemplate.getApiVersion(), is(equalTo(apiVersion)));
    }

    //BaseRock generated method id: ${testKind}, hash: 1E8B71CB777D30A0BC5147B0FB2635A3
    @Test
    void testKind() {
        String kind = "ResourceClaimTemplate";
        resourceClaimTemplate.setKind(kind);
        assertThat(resourceClaimTemplate.getKind(), is(equalTo(kind)));
    }

    //BaseRock generated method id: ${testMetadata}, hash: 57EED7ABBF8A8A8D4FC2906D0DFF967F
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        resourceClaimTemplate.setMetadata(metadata);
        assertThat(resourceClaimTemplate.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testSpec}, hash: 2F5D10FEF049524398D838CB66F2E3AA
    @Test
    void testSpec() {
        V1beta1ResourceClaimTemplateSpec spec = mock(V1beta1ResourceClaimTemplateSpec.class);
        resourceClaimTemplate.setSpec(spec);
        assertThat(resourceClaimTemplate.getSpec(), is(equalTo(spec)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 218ABCFAD4801A7C97F3B5A685B49154
    @Test
    void testEquals() {
        V1beta1ResourceClaimTemplate other = new V1beta1ResourceClaimTemplate();
        other.setApiVersion("v1beta1");
        other.setKind("ResourceClaimTemplate");
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1beta1ResourceClaimTemplateSpec spec = mock(V1beta1ResourceClaimTemplateSpec.class);
        other.setMetadata(metadata);
        other.setSpec(spec);
        resourceClaimTemplate.setApiVersion("v1beta1");
        resourceClaimTemplate.setKind("ResourceClaimTemplate");
        resourceClaimTemplate.setMetadata(metadata);
        resourceClaimTemplate.setSpec(spec);
        assertThat(resourceClaimTemplate.equals(other), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: A53AEDF8432294320651BB26B0409845
    @Test
    void testHashCode() {
        V1beta1ResourceClaimTemplate other = new V1beta1ResourceClaimTemplate();
        other.setApiVersion("v1beta1");
        other.setKind("ResourceClaimTemplate");
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1beta1ResourceClaimTemplateSpec spec = mock(V1beta1ResourceClaimTemplateSpec.class);
        other.setMetadata(metadata);
        other.setSpec(spec);
        resourceClaimTemplate.setApiVersion("v1beta1");
        resourceClaimTemplate.setKind("ResourceClaimTemplate");
        resourceClaimTemplate.setMetadata(metadata);
        resourceClaimTemplate.setSpec(spec);
        assertThat(resourceClaimTemplate.hashCode(), is(equalTo(other.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: F6C76B0B2E128E87FE20188F0F379C34
    @Test
    void testToString() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1beta1ResourceClaimTemplateSpec spec = mock(V1beta1ResourceClaimTemplateSpec.class);
        resourceClaimTemplate.setApiVersion("v1beta1");
        resourceClaimTemplate.setKind("ResourceClaimTemplate");
        resourceClaimTemplate.setMetadata(metadata);
        resourceClaimTemplate.setSpec(spec);
        String expectedString = "class V1beta1ResourceClaimTemplate {\n    apiVersion: v1beta1\n    kind: ResourceClaimTemplate\n    metadata: " + metadata + "\n    spec: " + spec + "\n}";
        assertThat(resourceClaimTemplate.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testConstructor}, hash: A0C5D3AAEC8F42A9E45E08A2A2FDE699
    @Test
    void testConstructor() {
        assertThat(new V1beta1ResourceClaimTemplate(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testSetNullApiVersion}, hash: D1012D9E3154B6CE8B11495A1E03B30B
    @Test
    void testSetNullApiVersion() {
        resourceClaimTemplate.setApiVersion(null);
        assertThat(resourceClaimTemplate.getApiVersion(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetNullKind}, hash: 494AB738FF717558417862F3EEC4F9C6
    @Test
    void testSetNullKind() {
        resourceClaimTemplate.setKind(null);
        assertThat(resourceClaimTemplate.getKind(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetNullMetadata}, hash: 99556E45A2FA5FFDCC91E477CF68A79D
    @Test
    void testSetNullMetadata() {
        resourceClaimTemplate.setMetadata(null);
        assertThat(resourceClaimTemplate.getMetadata(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testSetNullSpec}, hash: 1E07CA1DC75A08A6608C4B7A9AE07572
    @Test
    void testSetNullSpec() {
        resourceClaimTemplate.setSpec(null);
        assertThat(resourceClaimTemplate.getSpec(), is(equalTo(null)));
    }
}
