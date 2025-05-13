package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1CertificateSigningRequestSpec;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatus;
import static org.mockito.Mockito.when;
import com.google.gson.JsonObject;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import io.kubernetes.client.openapi.models.V1CertificateSigningRequest;
import java.util.HashMap;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CertificateSigningRequestBaseRockGeneratedTest {

    private V1CertificateSigningRequest certificateSigningRequest;

    @BeforeEach
    void setUp() {
        certificateSigningRequest = new V1CertificateSigningRequest();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: BB11572DCB59E3749F5DBFA1528AFC24
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        certificateSigningRequest.setApiVersion(apiVersion);
        assertEquals(apiVersion, certificateSigningRequest.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: D235290ED39C25750A1851C88C8F2C92
    @Test
    void testKind() {
        String kind = "CertificateSigningRequest";
        certificateSigningRequest.setKind(kind);
        assertEquals(kind, certificateSigningRequest.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: A7ED78371CC71AE18837B4575C992E77
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = new V1ObjectMeta();
        certificateSigningRequest.setMetadata(metadata);
        assertEquals(metadata, certificateSigningRequest.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: A32809CACEC7EEDB1FD6D65D3B75FF51
    @Test
    void testSpec() {
        V1CertificateSigningRequestSpec spec = new V1CertificateSigningRequestSpec();
        certificateSigningRequest.setSpec(spec);
        assertEquals(spec, certificateSigningRequest.getSpec());
    }

    //BaseRock generated method id: ${testStatus}, hash: 9B6985080BE86055E05E96F2002F9ACF
    @Test
    void testStatus() {
        V1CertificateSigningRequestStatus status = new V1CertificateSigningRequestStatus();
        certificateSigningRequest.setStatus(status);
        assertEquals(status, certificateSigningRequest.getStatus());
    }

    //BaseRock generated method id: ${testEquals}, hash: 555244CEAF42D62F1E835FE39B58DD17
    @Test
    void testEquals() {
        V1CertificateSigningRequest csr1 = new V1CertificateSigningRequest().apiVersion("v1").kind("CertificateSigningRequest").metadata(new V1ObjectMeta()).spec(new V1CertificateSigningRequestSpec()).status(new V1CertificateSigningRequestStatus());
        V1CertificateSigningRequest csr2 = new V1CertificateSigningRequest().apiVersion("v1").kind("CertificateSigningRequest").metadata(new V1ObjectMeta()).spec(new V1CertificateSigningRequestSpec()).status(new V1CertificateSigningRequestStatus());
        assertThat(csr1, is(equalTo(csr2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 979897D32076C35710551BA5A44B83EB
    @Test
    void testHashCode() {
        V1CertificateSigningRequest csr1 = new V1CertificateSigningRequest().apiVersion("v1").kind("CertificateSigningRequest").metadata(new V1ObjectMeta()).spec(new V1CertificateSigningRequestSpec()).status(new V1CertificateSigningRequestStatus());
        V1CertificateSigningRequest csr2 = new V1CertificateSigningRequest().apiVersion("v1").kind("CertificateSigningRequest").metadata(new V1ObjectMeta()).spec(new V1CertificateSigningRequestSpec()).status(new V1CertificateSigningRequestStatus());
        assertEquals(csr1.hashCode(), csr2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 48BFBDF35304B2E76BFAC7DDA017F4E7
    @Test
    void testToString() {
        V1CertificateSigningRequest csr = new V1CertificateSigningRequest().apiVersion("v1").kind("CertificateSigningRequest").metadata(new V1ObjectMeta()).spec(new V1CertificateSigningRequestSpec()).status(new V1CertificateSigningRequestStatus());
        String toString = csr.toString();
        assertNotNull(toString);
        assertThat(toString, is(notNullValue()));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 1DD6FD318490B21621DF4AC63A650334
    @Test
    void testBuilder() {
        V1CertificateSigningRequest csr = new V1CertificateSigningRequest().apiVersion("v1").kind("CertificateSigningRequest").metadata(new V1ObjectMeta()).spec(new V1CertificateSigningRequestSpec()).status(new V1CertificateSigningRequestStatus());
        assertNotNull(csr);
        assertEquals("v1", csr.getApiVersion());
        assertEquals("CertificateSigningRequest", csr.getKind());
        assertNotNull(csr.getMetadata());
        assertNotNull(csr.getSpec());
        assertNotNull(csr.getStatus());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 6383E758D247B8FEAE470B998B4A6352
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        JsonObject specObject = new JsonObject();
        specObject.addProperty("request", "test-request");
        specObject.addProperty("signerName", "test-signer");
        jsonObject.add("spec", specObject);
        V1CertificateSigningRequest.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testFromJson}, hash: C5A0ED0C724169AC2648FF9E7A658485
    @Test
    void testFromJson() throws NoSuchMethodException {
        assertNotNull(V1CertificateSigningRequest.class.getDeclaredMethod("fromJson", String.class));
    }

    //BaseRock generated method id: ${testToJson}, hash: 20275DB70536C112806605BB4E632307
    @Test
    void testToJson() {
        V1CertificateSigningRequest csr = new V1CertificateSigningRequest().apiVersion("v1").kind("CertificateSigningRequest").metadata(new V1ObjectMeta()).spec(new V1CertificateSigningRequestSpec()).status(new V1CertificateSigningRequestStatus());
        String json = csr.toJson();
        assertNotNull(json);
        assertThat(json, is(notNullValue()));
    }
}
