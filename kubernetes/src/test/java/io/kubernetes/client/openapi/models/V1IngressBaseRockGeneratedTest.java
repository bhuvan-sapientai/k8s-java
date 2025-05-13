package io.kubernetes.client.openapi.models;

import io.kubernetes.client.common.KubernetesObject;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import java.util.Collections;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import com.google.gson.JsonElement;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1IngressBaseRockGeneratedTest {

    @Mock
    private V1ObjectMeta mockMetadata;

    @Mock
    private V1IngressSpec mockSpec;

    @Mock
    private V1IngressStatus mockStatus;

    private V1Ingress v1Ingress;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        v1Ingress = new V1Ingress();
    }

    //BaseRock generated method id: ${testV1IngressImplementsKubernetesObject}, hash: 1A4E37F1F42FF321D86CB42C748E1D7A
    @Test
    void testV1IngressImplementsKubernetesObject() {
        assertThat(v1Ingress, is(instanceOf(KubernetesObject.class)));
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 3906374EA321379A22AF2E9DD2D68042
    @Test
    void testApiVersion() {
        String apiVersion = "networking.k8s.io/v1";
        v1Ingress.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1Ingress.getApiVersion());
    }

    //BaseRock generated method id: ${testApiVersionWithDifferentValues}, hash: 2E798805917F4639E1A52089589644BC
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "networking.k8s.io/v1beta1", "extensions/v1beta1" })
    void testApiVersionWithDifferentValues(String apiVersion) {
        v1Ingress.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1Ingress.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 0D3F5125E641F2F232C7E917BE77F4AD
    @Test
    void testKind() {
        String kind = "Ingress";
        v1Ingress.setKind(kind);
        assertEquals(kind, v1Ingress.getKind());
    }

    //BaseRock generated method id: ${testKindWithDifferentValues}, hash: 48CD9899AA3CFD71EC6AF12AFE00463F
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "ingress", "INGRESS" })
    void testKindWithDifferentValues(String kind) {
        v1Ingress.setKind(kind);
        assertEquals(kind, v1Ingress.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 5319F840A222382F91D285C99D4E2530
    @Test
    void testMetadata() {
        v1Ingress.setMetadata(mockMetadata);
        assertEquals(mockMetadata, v1Ingress.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: 2F53918624FA8A7A6F6BB45410DE252E
    @Test
    void testSpec() {
        v1Ingress.setSpec(mockSpec);
        assertEquals(mockSpec, v1Ingress.getSpec());
    }

    //BaseRock generated method id: ${testStatus}, hash: 82E8A5BC4DD0BB751CF927E27691F098
    @Test
    void testStatus() {
        v1Ingress.setStatus(mockStatus);
        assertEquals(mockStatus, v1Ingress.getStatus());
    }

    //BaseRock generated method id: ${testEquals}, hash: DACFD15C63D1D0F4EAD32D04522566AB
    @Test
    void testEquals() {
        V1Ingress ingress1 = new V1Ingress().apiVersion("networking.k8s.io/v1").kind("Ingress").metadata(mockMetadata).spec(mockSpec).status(mockStatus);
        V1Ingress ingress2 = new V1Ingress().apiVersion("networking.k8s.io/v1").kind("Ingress").metadata(mockMetadata).spec(mockSpec).status(mockStatus);
        assertEquals(ingress1, ingress2);
    }

    //BaseRock generated method id: ${testNotEquals}, hash: 8306B444F26B988AA51295098EC970FD
    @Test
    void testNotEquals() {
        V1Ingress ingress1 = new V1Ingress().apiVersion("networking.k8s.io/v1").kind("Ingress").metadata(mockMetadata).spec(mockSpec).status(mockStatus);
        V1Ingress ingress2 = new V1Ingress().apiVersion("networking.k8s.io/v1beta1").kind("Ingress").metadata(mock(V1ObjectMeta.class)).spec(mock(V1IngressSpec.class)).status(mock(V1IngressStatus.class));
        assertNotEquals(ingress1, ingress2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 4A51345D6953A8F504230B06BC6199B6
    @Test
    void testHashCode() {
        V1Ingress ingress1 = new V1Ingress().apiVersion("networking.k8s.io/v1").kind("Ingress").metadata(mockMetadata).spec(mockSpec).status(mockStatus);
        V1Ingress ingress2 = new V1Ingress().apiVersion("networking.k8s.io/v1").kind("Ingress").metadata(mockMetadata).spec(mockSpec).status(mockStatus);
        assertEquals(ingress1.hashCode(), ingress2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 9CF053440F09B5F9C0B5133D91F25832
    @Test
    void testToString() {
        v1Ingress.setApiVersion("networking.k8s.io/v1");
        v1Ingress.setKind("Ingress");
        v1Ingress.setMetadata(mockMetadata);
        v1Ingress.setSpec(mockSpec);
        v1Ingress.setStatus(mockStatus);
        String expectedString = "class V1Ingress {\n" + "    apiVersion: networking.k8s.io/v1\n" + "    kind: Ingress\n" + "    metadata: " + mockMetadata + "\n" + "    spec: " + mockSpec + "\n" + "    status: " + mockStatus + "\n" + "}";
        assertEquals(expectedString, v1Ingress.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 1210FE87C0B445C3A17DAF3807FC41EA
    @Test
    void testValidateJsonElement() throws Exception {
        JsonElement jsonElement = mock(JsonElement.class);
        JsonObject jsonObject = mock(JsonObject.class);
        when(jsonElement.getAsJsonObject()).thenReturn(jsonObject);
        when(jsonObject.entrySet()).thenReturn(Collections.emptySet());
        assertDoesNotThrow(() -> V1Ingress.validateJsonElement(jsonElement));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidElement}, hash: D00F36595E3590D00EF20A6F68EDDCBB
    @Test
    void testValidateJsonElementWithInvalidElement() {
        JsonElement jsonElement = mock(JsonElement.class);
        when(jsonElement.getAsJsonObject()).thenThrow(new IllegalStateException());
        assertThrows(IllegalStateException.class, () -> V1Ingress.validateJsonElement(jsonElement));
    }

    //BaseRock generated method id: ${testFromJson}, hash: D1E7D669BC0A03BCABBF96FF478BC875
    @Test
    void testFromJson() throws Exception {
        String json = "{\"apiVersion\":\"networking.k8s.io/v1\",\"kind\":\"Ingress\"}";
        V1Ingress result = V1Ingress.fromJson(json);
        assertNotNull(result);
        assertEquals("networking.k8s.io/v1", result.getApiVersion());
        assertEquals("Ingress", result.getKind());
    }

    //BaseRock generated method id: ${testToJson}, hash: CA4056895DBFD1D612A4FCE91DE95B18
    @Test
    void testToJson() {
        v1Ingress.setApiVersion("networking.k8s.io/v1");
        v1Ingress.setKind("Ingress");
        String json = v1Ingress.toJson();
        assertNotNull(json);
        assertTrue(json.contains("\"apiVersion\":\"networking.k8s.io/v1\""));
        assertTrue(json.contains("\"kind\":\"Ingress\""));
    }
}
