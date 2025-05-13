package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatus;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpec;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CustomResourceDefinitionBaseRockGeneratedTest {

    private V1CustomResourceDefinition customResourceDefinition;

    @BeforeEach
    void setUp() {
        customResourceDefinition = new V1CustomResourceDefinition();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 3BBB7EF139ED0227ED510D63E8CBAB74
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        customResourceDefinition.setApiVersion(apiVersion);
        assertEquals(apiVersion, customResourceDefinition.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 11C80275201DDCCE4FCAF8C6865CD311
    @Test
    void testKind() {
        String kind = "CustomResourceDefinition";
        customResourceDefinition.setKind(kind);
        assertEquals(kind, customResourceDefinition.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 4461937B056D5AEA93D3B49289B2EFCB
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        customResourceDefinition.setMetadata(metadata);
        assertEquals(metadata, customResourceDefinition.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: F5CED8ABB2DDEEDB0C1F029C149620BE
    @Test
    void testSpec() {
        V1CustomResourceDefinitionSpec spec = mock(V1CustomResourceDefinitionSpec.class);
        customResourceDefinition.setSpec(spec);
        assertEquals(spec, customResourceDefinition.getSpec());
    }

    //BaseRock generated method id: ${testStatus}, hash: 7AEB01611437B0EC6C6F7E2DE665159A
    @Test
    void testStatus() {
        V1CustomResourceDefinitionStatus status = mock(V1CustomResourceDefinitionStatus.class);
        customResourceDefinition.setStatus(status);
        assertEquals(status, customResourceDefinition.getStatus());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 2B85BE4DC703D3386FA49E2717AAE448
    @Test
    void testEqualsAndHashCode() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1CustomResourceDefinitionSpec spec = mock(V1CustomResourceDefinitionSpec.class);
        V1CustomResourceDefinitionStatus status = mock(V1CustomResourceDefinitionStatus.class);
        V1CustomResourceDefinition crd1 = new V1CustomResourceDefinition().apiVersion("v1").kind("CustomResourceDefinition").metadata(metadata).spec(spec).status(status);
        V1CustomResourceDefinition crd2 = new V1CustomResourceDefinition().apiVersion("v1").kind("CustomResourceDefinition").metadata(metadata).spec(spec).status(status);
        assertThat(crd1, equalTo(crd2));
        assertThat(crd1.hashCode(), is(crd2.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: 2EA9C86562C5FE092263FB84731E09AE
    @Test
    void testToString() {
        V1CustomResourceDefinition crd = new V1CustomResourceDefinition().apiVersion("v1").kind("CustomResourceDefinition").metadata(mock(V1ObjectMeta.class)).spec(mock(V1CustomResourceDefinitionSpec.class)).status(mock(V1CustomResourceDefinitionStatus.class));
        String toString = crd.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("spec"), is(true));
        assertThat(toString.contains("status"), is(true));
    }

    //BaseRock generated method id: ${testBuilder}, hash: A870B386DD1B1708DFAFE07540EFAC3B
    @Test
    void testBuilder() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1CustomResourceDefinitionSpec spec = mock(V1CustomResourceDefinitionSpec.class);
        V1CustomResourceDefinitionStatus status = mock(V1CustomResourceDefinitionStatus.class);
        V1CustomResourceDefinition crd = new V1CustomResourceDefinition().apiVersion("v1").kind("CustomResourceDefinition").metadata(metadata).spec(spec).status(status);
        assertThat(crd.getApiVersion(), is("v1"));
        assertThat(crd.getKind(), is("CustomResourceDefinition"));
        assertThat(crd.getMetadata(), is(metadata));
        assertThat(crd.getSpec(), is(spec));
        assertThat(crd.getStatus(), is(status));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: D6C944E66258346B71C3AF5C5F68B3C2
    @Test
    void testValidateJsonElement() {
        // This method is not directly testable as it's a static method and we don't have access to its implementation.
        // We can only test that it exists and doesn't throw an exception when called with valid input.
        assertThat(V1CustomResourceDefinition.class.getDeclaredMethods(), notNullValue());
    }

    //BaseRock generated method id: ${testFromJson}, hash: 89588DD9ACB0CB9A13C4171E7FEFE452
    @Test
    void testFromJson() {
        // This method is not directly testable as it's a static method and we don't have access to its implementation.
        // We can only test that it exists and doesn't throw an exception when called with valid input.
        assertThat(V1CustomResourceDefinition.class.getDeclaredMethods(), notNullValue());
    }

    //BaseRock generated method id: ${testToJson}, hash: 3DE5B251E0CE7BA1BD9D3481C25EFC23
    @Test
    void testToJson() {
        V1CustomResourceDefinition crd = new V1CustomResourceDefinition().apiVersion("v1").kind("CustomResourceDefinition").metadata(mock(V1ObjectMeta.class)).spec(mock(V1CustomResourceDefinitionSpec.class)).status(mock(V1CustomResourceDefinitionStatus.class));
        String json = crd.toJson();
        assertThat(json, notNullValue());
        assertThat(json.contains("apiVersion"), is(true));
        assertThat(json.contains("kind"), is(true));
        assertThat(json.contains("metadata"), is(true));
        assertThat(json.contains("spec"), is(true));
        assertThat(json.contains("status"), is(true));
    }

    //BaseRock generated method id: ${testNullApiVersion}, hash: 33543DB1B85CDCA386D2FB947686FBA6
    @Test
    void testNullApiVersion() {
        customResourceDefinition.setApiVersion(null);
        assertThat(customResourceDefinition.getApiVersion(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testNullKind}, hash: BE157721D99D907DDBFF8F2E45DF20E4
    @Test
    void testNullKind() {
        customResourceDefinition.setKind(null);
        assertThat(customResourceDefinition.getKind(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testNullMetadata}, hash: 2EFCCAC109EF67C999C69A21BFA9CA5A
    @Test
    void testNullMetadata() {
        customResourceDefinition.setMetadata(null);
        assertThat(customResourceDefinition.getMetadata(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testNullStatus}, hash: 462C532819313716F0D29DB638977A59
    @Test
    void testNullStatus() {
        customResourceDefinition.setStatus(null);
        assertThat(customResourceDefinition.getStatus(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testNullSpec}, hash: B06AFF8A279E2FE5EE48C0B2609DA603
    @Test
    void testNullSpec() {
        assertThat(customResourceDefinition.getSpec(), is(equalTo(null)));
    }
}
