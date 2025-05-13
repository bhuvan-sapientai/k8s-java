package io.kubernetes.client.openapi.models;

import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
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
import io.kubernetes.client.openapi.models.V1LeaseSpec;
import java.util.HashMap;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1LeaseBaseRockGeneratedTest {

    private V1Lease v1Lease;

    @BeforeEach
    void setUp() {
        v1Lease = new V1Lease();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 7E4A3AF606EC43B19051CACF30D354FC
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1Lease.apiVersion(apiVersion);
        assertEquals(apiVersion, v1Lease.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 717BD99190D0DB9715B50B56F1C7EA4F
    @Test
    void testKind() {
        String kind = "Lease";
        v1Lease.kind(kind);
        assertEquals(kind, v1Lease.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 26B1B7E2D88C077FBC8BAE52EE1F9EFC
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1Lease.metadata(metadata);
        assertEquals(metadata, v1Lease.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: 31B6846AD2F7C5F17FBD14F9E0676E04
    @Test
    void testSpec() {
        V1LeaseSpec spec = mock(V1LeaseSpec.class);
        v1Lease.spec(spec);
        assertEquals(spec, v1Lease.getSpec());
    }

    //BaseRock generated method id: ${testEquals}, hash: E26091988BCEDCCA0F10990F6D0164F6
    @Test
    void testEquals() {
        V1ObjectMeta metadata1 = new V1ObjectMeta();
        V1LeaseSpec spec1 = new V1LeaseSpec();
        V1Lease lease1 = new V1Lease().apiVersion("v1").kind("Lease").metadata(metadata1).spec(spec1);
        V1ObjectMeta metadata2 = new V1ObjectMeta();
        V1LeaseSpec spec2 = new V1LeaseSpec();
        V1Lease lease2 = new V1Lease().apiVersion("v1").kind("Lease").metadata(metadata2).spec(spec2);
        assertThat(lease1.equals(lease2), is(true));
    }

    //BaseRock generated method id: ${testHashCode}, hash: D95CDB32BA39D9FEA40EF7B7BE9CE7A6
    @Test
    void testHashCode() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        V1LeaseSpec spec = mock(V1LeaseSpec.class);
        V1Lease lease1 = new V1Lease().apiVersion("v1").kind("Lease").metadata(metadata).spec(spec);
        V1Lease lease2 = new V1Lease().apiVersion("v1").kind("Lease").metadata(metadata).spec(spec);
        assertEquals(lease1.hashCode(), lease2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 5930133D22D30CBF5F6893DF189D07B5
    @Test
    void testToString() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        doReturn("MockedMetadata").when(metadata).toString();
        V1LeaseSpec spec = mock(V1LeaseSpec.class);
        doReturn("MockedSpec").when(spec).toString();
        V1Lease lease = new V1Lease().apiVersion("v1").kind("Lease").metadata(metadata).spec(spec);
        String expected = "class V1Lease {\n    apiVersion: v1\n    kind: Lease\n    metadata: MockedMetadata\n    spec: MockedSpec\n}";
        assertEquals(expected, lease.toString());
    }

    //BaseRock generated method id: ${testGetApiVersion}, hash: 213BBF2E2D2EA7F48B20D7DEB037EE0F
    @Test
    void testGetApiVersion() {
        String apiVersion = "v1";
        v1Lease.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1Lease.getApiVersion());
    }

    //BaseRock generated method id: ${testSetApiVersion}, hash: 57A448972773FC871731AD0A768704CD
    @Test
    void testSetApiVersion() {
        String apiVersion = "v1";
        v1Lease.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1Lease.getApiVersion());
    }

    //BaseRock generated method id: ${testGetKind}, hash: 65B5EEB504C4612AE59F86CF94EC02A5
    @Test
    void testGetKind() {
        String kind = "Lease";
        v1Lease.setKind(kind);
        assertEquals(kind, v1Lease.getKind());
    }

    //BaseRock generated method id: ${testSetKind}, hash: 26CD2DB13BD29A05A5132E4A1EBBB8CB
    @Test
    void testSetKind() {
        String kind = "Lease";
        v1Lease.setKind(kind);
        assertEquals(kind, v1Lease.getKind());
    }

    //BaseRock generated method id: ${testGetMetadata}, hash: BC6317BC38D48457FE5E55123E6B8071
    @Test
    void testGetMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1Lease.setMetadata(metadata);
        assertEquals(metadata, v1Lease.getMetadata());
    }

    //BaseRock generated method id: ${testSetMetadata}, hash: 5ACB6C1C5222A65ED19B28CFE7C1649A
    @Test
    void testSetMetadata() {
        V1ObjectMeta metadata = mock(V1ObjectMeta.class);
        v1Lease.setMetadata(metadata);
        assertEquals(metadata, v1Lease.getMetadata());
    }

    //BaseRock generated method id: ${testGetSpec}, hash: EDEE4FF5672E2D1980A1AB81EC1898DF
    @Test
    void testGetSpec() {
        V1LeaseSpec spec = mock(V1LeaseSpec.class);
        v1Lease.setSpec(spec);
        assertEquals(spec, v1Lease.getSpec());
    }

    //BaseRock generated method id: ${testSetSpec}, hash: BB2DBAE3500CB2BE93766D282AF6207B
    @Test
    void testSetSpec() {
        V1LeaseSpec spec = mock(V1LeaseSpec.class);
        v1Lease.setSpec(spec);
        assertEquals(spec, v1Lease.getSpec());
    }

    //BaseRock generated method id: ${testConstructor}, hash: 0BC600E2937EF6920490FBCE26160E7E
    @Test
    void testConstructor() {
        assertNotNull(new V1Lease());
    }

    //BaseRock generated method id: ${testOpenapiRequiredFields}, hash: 3A3FF12DE9EEDA16401841D6FC3013F1
    @Test
    void testOpenapiRequiredFields() {
        assertThat(V1Lease.openapiRequiredFields, notNullValue());
        assertThat(V1Lease.openapiRequiredFields.isEmpty(), is(true));
    }

    //BaseRock generated method id: ${testOpenapiFields}, hash: B81EE7698455DBEF86276F3FB84D4B2C
    @Test
    void testOpenapiFields() {
        assertThat(V1Lease.openapiFields, notNullValue());
        assertThat(V1Lease.openapiFields.size(), is(4));
        assertThat(V1Lease.openapiFields.contains("apiVersion"), is(true));
        assertThat(V1Lease.openapiFields.contains("kind"), is(true));
        assertThat(V1Lease.openapiFields.contains("metadata"), is(true));
        assertThat(V1Lease.openapiFields.contains("spec"), is(true));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 782CD3E7DB9DEC4B25B97FAA29B3F6F5
    @Test
    void testValidateJsonElement() throws Exception {
        Map<String, Object> validJson = new HashMap<>();
        validJson.put("apiVersion", "v1");
        validJson.put("kind", "Lease");
        validJson.put("metadata", new HashMap<>());
        validJson.put("spec", new HashMap<>());
        V1Lease.validateJsonElement(new com.google.gson.Gson().toJsonTree(validJson));
    }

    //BaseRock generated method id: ${testFromJson}, hash: F89C4915136FD25B8D135E8BEA4977C2
    @Test
    void testFromJson() throws Exception {
        String json = "{\"apiVersion\":\"v1\",\"kind\":\"Lease\",\"metadata\":{},\"spec\":{}}";
        V1Lease lease = V1Lease.fromJson(json);
        assertThat(lease, notNullValue());
        assertThat(lease.getApiVersion(), equalTo("v1"));
        assertThat(lease.getKind(), equalTo("Lease"));
        assertThat(lease.getMetadata(), notNullValue());
        assertThat(lease.getSpec(), notNullValue());
    }

    //BaseRock generated method id: ${testToJson}, hash: C3004C80C2324463C3CCD4C01A26CE06
    @Test
    void testToJson() {
        V1ObjectMeta metadata = new V1ObjectMeta();
        V1LeaseSpec spec = new V1LeaseSpec();
        V1Lease lease = new V1Lease().apiVersion("v1").kind("Lease").metadata(metadata).spec(spec);
        String json = lease.toJson();
        assertThat(json, notNullValue());
        assertThat(json.contains("\"apiVersion\":\"v1\""), is(true));
        assertThat(json.contains("\"kind\":\"Lease\""), is(true));
        assertThat(json.contains("\"metadata\":"), is(true));
        assertThat(json.contains("\"spec\":"), is(true));
    }
}
