package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PodTemplateBaseRockGeneratedTest {

    private V1PodTemplate v1PodTemplate;

    @BeforeEach
    void setUp() {
        v1PodTemplate = new V1PodTemplate();
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: DA71183BA48CB550D29006FADDC94090
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1";
        v1PodTemplate.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1PodTemplate.getApiVersion());
    }

    //BaseRock generated method id: ${testGetKind}, hash: 0CF1260EBC412AAEC44088F57A815B75
    @Test
    void testGetKind() {
        String kind = "PodTemplate";
        v1PodTemplate.setKind(kind);
        assertEquals(kind, v1PodTemplate.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: 5A089313CFE7457EAB086D1B19DB044A
    @Test
    void testGetMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1PodTemplate.setMetadata(metadata);
        assertThat(v1PodTemplate.getMetadata(), is(equalTo(metadata)));
    }

    //BaseRock generated method id: ${testGetTemplate}, hash: 1E57FA62C4EE9E638E234FC83CD45B47
    @Test
    void testGetTemplate() {
        V1PodTemplateSpec template = mock(V1PodTemplateSpec.class);
        v1PodTemplate.setTemplate(template);
        assertThat(v1PodTemplate.getTemplate(), is(equalTo(template)));
    }

    //BaseRock generated method id: ${testV1PodTemplateBuilder}, hash: 1A7296BE1F0439020F48AC6978795224
    @Test
    void testV1PodTemplateBuilder() {
        String apiVersion = "v1";
        String kind = "PodTemplate";
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1PodTemplateSpec template = mock(V1PodTemplateSpec.class);
        V1PodTemplate podTemplate = new V1PodTemplate().apiVersion(apiVersion).kind(kind).metadata(metadata).template(template);
        assertEquals(apiVersion, podTemplate.getApiVersion());
        assertEquals(kind, podTemplate.getKind());
        assertThat(podTemplate.getMetadata(), is(equalTo(metadata)));
        assertThat(podTemplate.getTemplate(), is(equalTo(template)));
    }

    //BaseRock generated method id: ${testEquals}, hash: 0D335A44098F14BF46903250A86907CB
    @Test
    void testEquals() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1PodTemplateSpec template = mock(V1PodTemplateSpec.class);
        V1PodTemplate podTemplate1 = new V1PodTemplate().apiVersion("v1").kind("PodTemplate").metadata(metadata).template(template);
        V1PodTemplate podTemplate2 = new V1PodTemplate().apiVersion("v1").kind("PodTemplate").metadata(metadata).template(template);
        assertThat(podTemplate1.equals(podTemplate2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 648C4F8D1684B0CAB17E468CBC6BBA6C
    @Test
    void testHashCode() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1PodTemplateSpec template = mock(V1PodTemplateSpec.class);
        V1PodTemplate podTemplate1 = new V1PodTemplate().apiVersion("v1").kind("PodTemplate").metadata(metadata).template(template);
        V1PodTemplate podTemplate2 = new V1PodTemplate().apiVersion("v1").kind("PodTemplate").metadata(metadata).template(template);
        assertEquals(podTemplate1.hashCode(), podTemplate2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 1237920909310D3DE6684670FB2A33E7
    @Test
    void testToString() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        when(metadata.toString()).thenReturn("MockedMetadata");
        V1PodTemplateSpec template = mock(V1PodTemplateSpec.class);
        when(template.toString()).thenReturn("MockedTemplate");
        V1PodTemplate podTemplate = new V1PodTemplate().apiVersion("v1").kind("PodTemplate").metadata(metadata).template(template);
        String expectedString = "class V1PodTemplate {\n" + "    apiVersion: v1\n" + "    kind: PodTemplate\n" + "    metadata: MockedMetadata\n" + "    template: MockedTemplate\n" + "}";
        assertEquals(expectedString, podTemplate.toString());
    }

    //BaseRock generated method id: ${testV1PodTemplateInstantiation}, hash: 50E1DED6FED4189FF13B2EE970FD3ECE
    @Test
    void testV1PodTemplateInstantiation() {
        assertNotNull(new V1PodTemplate());
    }
}
