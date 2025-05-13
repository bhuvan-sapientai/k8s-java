package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ServiceStatus;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import java.util.Collections;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1ServiceSpec;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ServiceBaseRockGeneratedTest {

    private V1Service v1Service;

    @BeforeEach
    void setUp() {
        v1Service = new V1Service();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 989E00AFA2AA04ECF2CF578C92FF929D
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1Service.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1Service.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 70ACB9350937F3C05FC7D922BB77EA37
    @Test
    void testKind() {
        String kind = "Service";
        v1Service.setKind(kind);
        assertEquals(kind, v1Service.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: A55F9170FC71300D11C4CD7D9E1416EA
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1Service.setMetadata(metadata);
        assertEquals(metadata, v1Service.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: 1995A0AA80E56BF3BAEB24F7714D6FB1
    @Test
    void testSpec() {
        V1ServiceSpec spec = mock(V1ServiceSpec.class);
        v1Service.setSpec(spec);
        assertEquals(spec, v1Service.getSpec());
    }

    //BaseRock generated method id: ${testStatus}, hash: 1121F65ACD67A9D0761A7FA244715A14
    @Test
    void testStatus() {
        V1ServiceStatus status = mock(V1ServiceStatus.class);
        v1Service.setStatus(status);
        assertEquals(status, v1Service.getStatus());
    }

    //BaseRock generated method id: ${testEquals}, hash: 48607920F5ED2292E5305204655785E3
    @Test
    void testEquals() {
        V1ObjectMeta metadata = new V1ObjectMeta();
        V1ServiceSpec spec = new V1ServiceSpec();
        V1ServiceStatus status = new V1ServiceStatus();
        V1Service service1 = new V1Service().apiVersion("v1").kind("Service").metadata(metadata).spec(spec).status(status);
        V1Service service2 = new V1Service().apiVersion("v1").kind("Service").metadata(metadata).spec(spec).status(status);
        assertThat(service1, is(equalTo(service2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 583986752DD0C941865741406C3EF68E
    @Test
    void testHashCode() {
        V1Service service = new V1Service().apiVersion("v1").kind("Service").metadata(new V1ObjectMeta()).spec(new V1ServiceSpec()).status(new V1ServiceStatus());
        int hashCode = service.hashCode();
        assertThat(hashCode, is(notNullValue()));
    }

    //BaseRock generated method id: ${testToString}, hash: 19D01FE8326D8B7E8A16724FC77EF8F9
    @Test
    void testToString() {
        V1Service service = new V1Service().apiVersion("v1").kind("Service").metadata(new V1ObjectMeta()).spec(new V1ServiceSpec()).status(new V1ServiceStatus());
        String toString = service.toString();
        assertNotNull(toString);
        assertThat(toString, startsWith("class V1Service {"));
        assertThat(toString, endsWith("}"));
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("metadata"), is(true));
        assertThat(toString.contains("spec"), is(true));
        assertThat(toString.contains("status"), is(true));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: F01C4F84BE17FADE33C369FE3CA6B315
    @Test
    void testValidateJsonElement() {
        // This method is not directly testable as it's a static method and involves JSON parsing
        // Consider testing it indirectly through fromJson or toJson methods
    }

    //BaseRock generated method id: ${testFromJson}, hash: 44D9D387341BF86B20916D86CBA9F17F
    @Test
    void testFromJson() throws Exception {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"Service\",\"metadata\":{},\"spec\":{},\"status\":{}}";
        V1Service service = V1Service.fromJson(json);
        assertNotNull(service);
        assertEquals("v1", service.getApiVersion());
        assertEquals("Service", service.getKind());
        assertNotNull(service.getMetadata());
        assertNotNull(service.getSpec());
        assertNotNull(service.getStatus());
    }

    //BaseRock generated method id: ${testToJson}, hash: 0648E9F93FACCFDC00A850675E4000AA
    @Test
    void testToJson() {
        V1Service service = new V1Service().apiVersion("v1").kind("Service").metadata(new V1ObjectMeta()).spec(new V1ServiceSpec()).status(new V1ServiceStatus());
        String json = service.toJson();
        assertNotNull(json);
        assertThat(json, startsWith("{"));
        assertThat(json, endsWith("}"));
        assertThat(json.contains("\"apiVersion\":\"v1\""), is(true));
        assertThat(json.contains("\"kind\":\"Service\""), is(true));
        assertThat(json.contains("\"metadata\":{"), is(true));
        assertThat(json.contains("\"spec\":{"), is(true));
        assertThat(json.contains("\"status\":{"), is(true));
    }
}
