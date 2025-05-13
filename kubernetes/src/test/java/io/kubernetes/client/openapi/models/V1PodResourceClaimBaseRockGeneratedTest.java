package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PodResourceClaimBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: E8612A820BA3494236C82EBD664C3D44
    @Test
    void testConstructor() {
        V1PodResourceClaim claim = new V1PodResourceClaim();
        assertNotNull(claim);
    }

    //BaseRock generated method id: ${testName}, hash: 193FA49D7149293A9BE9596C89483A1D
    @Test
    void testName() {
        V1PodResourceClaim claim = new V1PodResourceClaim();
        String name = "test-name";
        claim.setName(name);
        assertEquals(name, claim.getName());
    }

    //BaseRock generated method id: ${testNameWithVariousInputs}, hash: 148391367448E9A7F5CFFD82520743A7
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "name1", "name-with-dashes", "name_with_underscores" })
    void testNameWithVariousInputs(String name) {
        V1PodResourceClaim claim = new V1PodResourceClaim();
        claim.setName(name);
        assertEquals(name, claim.getName());
    }

    //BaseRock generated method id: ${testResourceClaimName}, hash: 42FD43A6E0B955E9B246F06CD58E552C
    @Test
    void testResourceClaimName() {
        V1PodResourceClaim claim = new V1PodResourceClaim();
        String resourceClaimName = "test-resource-claim";
        claim.setResourceClaimName(resourceClaimName);
        assertEquals(resourceClaimName, claim.getResourceClaimName());
    }

    //BaseRock generated method id: ${testResourceClaimNameWithVariousInputs}, hash: 2A5012FAA0A34D39F2EC1CB6DEE3CEEB
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "claim1", "claim-with-dashes", "claim_with_underscores" })
    void testResourceClaimNameWithVariousInputs(String resourceClaimName) {
        V1PodResourceClaim claim = new V1PodResourceClaim();
        claim.setResourceClaimName(resourceClaimName);
        assertEquals(resourceClaimName, claim.getResourceClaimName());
    }

    //BaseRock generated method id: ${testResourceClaimTemplateName}, hash: B63969951B4F7B44AED46D8790C37576
    @Test
    void testResourceClaimTemplateName() {
        V1PodResourceClaim claim = new V1PodResourceClaim();
        String resourceClaimTemplateName = "test-resource-claim-template";
        claim.setResourceClaimTemplateName(resourceClaimTemplateName);
        assertEquals(resourceClaimTemplateName, claim.getResourceClaimTemplateName());
    }

    //BaseRock generated method id: ${testResourceClaimTemplateNameWithVariousInputs}, hash: 6C010828DD639C728CA2B20E70E8618D
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "template1", "template-with-dashes", "template_with_underscores" })
    void testResourceClaimTemplateNameWithVariousInputs(String resourceClaimTemplateName) {
        V1PodResourceClaim claim = new V1PodResourceClaim();
        claim.setResourceClaimTemplateName(resourceClaimTemplateName);
        assertEquals(resourceClaimTemplateName, claim.getResourceClaimTemplateName());
    }

    //BaseRock generated method id: ${testEquals}, hash: 863ACB2E42D2A25D1D7AFC0870152C08
    @Test
    void testEquals() {
        V1PodResourceClaim claim1 = new V1PodResourceClaim().name("name1").resourceClaimName("claim1").resourceClaimTemplateName("template1");
        V1PodResourceClaim claim2 = new V1PodResourceClaim().name("name1").resourceClaimName("claim1").resourceClaimTemplateName("template1");
        V1PodResourceClaim claim3 = new V1PodResourceClaim().name("name2").resourceClaimName("claim2").resourceClaimTemplateName("template2");
        assertTrue(claim1.equals(claim2));
        assertTrue(claim2.equals(claim1));
        assertFalse(claim1.equals(claim3));
        assertFalse(claim1.equals(null));
        assertFalse(claim1.equals(new Object()));
    }

    //BaseRock generated method id: ${testHashCode}, hash: E90F3F763C02E2AB9D9683CA61391F07
    @Test
    void testHashCode() {
        V1PodResourceClaim claim1 = new V1PodResourceClaim().name("name1").resourceClaimName("claim1").resourceClaimTemplateName("template1");
        V1PodResourceClaim claim2 = new V1PodResourceClaim().name("name1").resourceClaimName("claim1").resourceClaimTemplateName("template1");
        V1PodResourceClaim claim3 = new V1PodResourceClaim().name("name2").resourceClaimName("claim2").resourceClaimTemplateName("template2");
        assertEquals(claim1.hashCode(), claim2.hashCode());
        assertNotEquals(claim1.hashCode(), claim3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: E734A2A04896A5CB2F9F9AEAAE9D99C1
    @Test
    void testToString() {
        V1PodResourceClaim claim = new V1PodResourceClaim().name("test-name").resourceClaimName("test-claim").resourceClaimTemplateName("test-template");
        String expected = "class V1PodResourceClaim {\n" + "    name: test-name\n" + "    resourceClaimName: test-claim\n" + "    resourceClaimTemplateName: test-template\n" + "}";
        assertEquals(expected, claim.toString());
    }
}
