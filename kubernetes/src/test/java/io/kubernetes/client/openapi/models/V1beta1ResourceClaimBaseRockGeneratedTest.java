package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.openapi.models.V1beta1ResourceClaimSpec;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import io.kubernetes.client.openapi.models.V1beta1ResourceClaimStatus;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1ResourceClaimBaseRockGeneratedTest {

    private V1beta1ResourceClaim resourceClaim;

    @BeforeEach
    void setUp() {
        resourceClaim = new V1beta1ResourceClaim();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 946810CAFC95CC002F37A36448A6AE9E
    @Test
    void testApiVersion() {
        String apiVersion = "v1beta1";
        resourceClaim.setApiVersion(apiVersion);
        assertEquals(apiVersion, resourceClaim.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 6DB4505EF07CF6554B1EAFEE0A977657
    @Test
    void testKind() {
        String kind = "ResourceClaim";
        resourceClaim.setKind(kind);
        assertEquals(kind, resourceClaim.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 330163161DDAB9603C830E60CCDB4087
    @Test
    void testMetadata() {
        V1ObjectMeta metadata = new V1ObjectMeta();
        resourceClaim.setMetadata(metadata);
        assertEquals(metadata, resourceClaim.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: 80FA4774C097E5B515916E5E7D066ECD
    @Test
    void testSpec() {
        V1beta1ResourceClaimSpec spec = new V1beta1ResourceClaimSpec();
        resourceClaim.setSpec(spec);
        assertEquals(spec, resourceClaim.getSpec());
    }

    //BaseRock generated method id: ${testStatus}, hash: 8E470889FCB8654A083682615478229E
    @Test
    void testStatus() {
        V1beta1ResourceClaimStatus status = new V1beta1ResourceClaimStatus();
        resourceClaim.setStatus(status);
        assertEquals(status, resourceClaim.getStatus());
    }

    //BaseRock generated method id: ${testEquals}, hash: 1EBAE8F3553709A81F4DC30ABCCE8BAD
    @Test
    void testEquals() {
        V1beta1ResourceClaim claim1 = new V1beta1ResourceClaim().apiVersion("v1beta1").kind("ResourceClaim").metadata(new V1ObjectMeta()).spec(new V1beta1ResourceClaimSpec()).status(new V1beta1ResourceClaimStatus());
        V1beta1ResourceClaim claim2 = new V1beta1ResourceClaim().apiVersion("v1beta1").kind("ResourceClaim").metadata(new V1ObjectMeta()).spec(new V1beta1ResourceClaimSpec()).status(new V1beta1ResourceClaimStatus());
        assertThat(claim1, is(equalTo(claim2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 611454D3B52CA559DAB5B7BD4A83ADC3
    @Test
    void testHashCode() {
        V1beta1ResourceClaim claim1 = new V1beta1ResourceClaim().apiVersion("v1beta1").kind("ResourceClaim").metadata(new V1ObjectMeta()).spec(new V1beta1ResourceClaimSpec()).status(new V1beta1ResourceClaimStatus());
        V1beta1ResourceClaim claim2 = new V1beta1ResourceClaim().apiVersion("v1beta1").kind("ResourceClaim").metadata(new V1ObjectMeta()).spec(new V1beta1ResourceClaimSpec()).status(new V1beta1ResourceClaimStatus());
        assertEquals(claim1.hashCode(), claim2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: B63B78E6D40CAAADBA8F00AB9685ABBD
    @Test
    void testToString() {
        V1beta1ResourceClaim claim = new V1beta1ResourceClaim().apiVersion("v1beta1").kind("ResourceClaim").metadata(new V1ObjectMeta()).spec(new V1beta1ResourceClaimSpec()).status(new V1beta1ResourceClaimStatus());
        String expectedString = "class V1beta1ResourceClaim {\n" + "    apiVersion: v1beta1\n" + "    kind: ResourceClaim\n" + "    metadata: class V1ObjectMeta {\n" + "        annotations: {}\n" + "        creationTimestamp: null\n" + "        deletionGracePeriodSeconds: null\n" + "        deletionTimestamp: null\n" + "        finalizers: []\n" + "        generateName: null\n" + "        generation: null\n" + "        labels: {}\n" + "        managedFields: []\n" + "        name: null\n" + "        namespace: null\n" + "        ownerReferences: []\n" + "        resourceVersion: null\n" + "        selfLink: null\n" + "        uid: null\n" + "    }\n" + "    spec: class V1beta1ResourceClaimSpec {\n" + "        devices: null\n" + "    }\n" + "    status: class V1beta1ResourceClaimStatus {\n" + "        allocation: null\n" + "        devices: []\n" + "        reservedFor: []\n" + "    }\n" + "}";
        assertEquals(expectedString, claim.toString());
    }

    //BaseRock generated method id: ${testBuilder}, hash: 0C73D2193A74D6E10C9CB335BE22FA4E
    @Test
    void testBuilder() {
        V1beta1ResourceClaim claim = new V1beta1ResourceClaim().apiVersion("v1beta1").kind("ResourceClaim").metadata(new V1ObjectMeta()).spec(new V1beta1ResourceClaimSpec()).status(new V1beta1ResourceClaimStatus());
        assertNotNull(claim);
        assertEquals("v1beta1", claim.getApiVersion());
        assertEquals("ResourceClaim", claim.getKind());
        assertNotNull(claim.getMetadata());
        assertNotNull(claim.getSpec());
        assertNotNull(claim.getStatus());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: F01C4F84BE17FADE33C369FE3CA6B315
    @Test
    void testValidateJsonElement() {
        // This test is not applicable as the method is static and package-private
    }
}
