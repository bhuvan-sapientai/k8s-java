package io.kubernetes.client.openapi.models;

import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.custom.Quantity;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1VolumeResourceRequirements;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.hamcrest.Matchers.hasEntry;
import java.util.HashMap;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1VolumeResourceRequirementsBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 6DF477340865CEF5064D357660D2EA6E
    @Test
    void testConstructor() {
        V1VolumeResourceRequirements requirements = new V1VolumeResourceRequirements();
        assertThat(requirements, is(notNullValue()));
        assertThat(requirements.getLimits(), is(notNullValue()));
        assertThat(requirements.getRequests(), is(notNullValue()));
    }

    //BaseRock generated method id: ${testLimits}, hash: 4D58661A8ED0592ECBCD1F9BB92B8FC1
    @Test
    void testLimits() {
        V1VolumeResourceRequirements requirements = new V1VolumeResourceRequirements();
        Map<String, Quantity> limits = new HashMap<>();
        limits.put("cpu", new Quantity("1"));
        limits.put("memory", new Quantity("1Gi"));
        requirements.setLimits(limits);
        assertEquals(limits, requirements.getLimits());
        requirements.putLimitsItem("storage", new Quantity("10Gi"));
        assertThat(requirements.getLimits(), hasEntry("storage", new Quantity("10Gi")));
    }

    //BaseRock generated method id: ${testRequests}, hash: 93D0D71F5D7EDF01079ED7A26EEB8313
    @Test
    void testRequests() {
        V1VolumeResourceRequirements requirements = new V1VolumeResourceRequirements();
        Map<String, Quantity> requests = new HashMap<>();
        requests.put("cpu", new Quantity("500m"));
        requests.put("memory", new Quantity("512Mi"));
        requirements.setRequests(requests);
        assertEquals(requests, requirements.getRequests());
        requirements.putRequestsItem("storage", new Quantity("5Gi"));
        assertThat(requirements.getRequests(), hasEntry("storage", new Quantity("5Gi")));
    }

    //BaseRock generated method id: ${testEquals}, hash: 8CA4596C5F38753CE9D58866FD210DF5
    @Test
    void testEquals() {
        V1VolumeResourceRequirements req1 = new V1VolumeResourceRequirements().putLimitsItem("cpu", new Quantity("1")).putRequestsItem("memory", new Quantity("1Gi"));
        V1VolumeResourceRequirements req2 = new V1VolumeResourceRequirements().putLimitsItem("cpu", new Quantity("1")).putRequestsItem("memory", new Quantity("1Gi"));
        V1VolumeResourceRequirements req3 = new V1VolumeResourceRequirements().putLimitsItem("cpu", new Quantity("2")).putRequestsItem("memory", new Quantity("2Gi"));
        assertTrue(req1.equals(req2));
        assertTrue(req2.equals(req1));
        assertFalse(req1.equals(req3));
        assertFalse(req1.equals(null));
        assertFalse(req1.equals(new Object()));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 7604777225D58F778068EBB002BB9EA0
    @Test
    void testHashCode() {
        V1VolumeResourceRequirements req1 = new V1VolumeResourceRequirements().putLimitsItem("cpu", new Quantity("1")).putRequestsItem("memory", new Quantity("1Gi"));
        V1VolumeResourceRequirements req2 = new V1VolumeResourceRequirements().putLimitsItem("cpu", new Quantity("1")).putRequestsItem("memory", new Quantity("1Gi"));
        V1VolumeResourceRequirements req3 = new V1VolumeResourceRequirements().putLimitsItem("cpu", new Quantity("2")).putRequestsItem("memory", new Quantity("2Gi"));
        assertEquals(req1.hashCode(), req2.hashCode());
        assertNotEquals(req1.hashCode(), req3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 6EB8DD25660B6C4C116E9C86BAC86066
    @Test
    void testToString() {
        V1VolumeResourceRequirements requirements = new V1VolumeResourceRequirements().putLimitsItem("cpu", new Quantity("1")).putRequestsItem("memory", new Quantity("1Gi"));
        String toString = requirements.toString();
        assertThat(toString, notNullValue());
        assertThat(toString.contains("limits"), is(true));
        assertThat(toString.contains("requests"), is(true));
    }

    //BaseRock generated method id: ${testToIndentedString}, hash: E773D3B633360E231ABF39958FB8B929
    @Test
    void testToIndentedString() {
        V1VolumeResourceRequirements requirements = new V1VolumeResourceRequirements().putLimitsItem("cpu", new Quantity("1")).putRequestsItem("memory", new Quantity("1Gi"));
        String indentedString = requirements.toString();
        assertThat(indentedString, notNullValue());
        assertThat(indentedString.contains("    limits"), is(true));
        assertThat(indentedString.contains("    requests"), is(true));
    }

    //BaseRock generated method id: ${testGetOpenApiFields}, hash: 113E85EA5DD6F4844271D4AD5129D289
    @Test
    void testGetOpenApiFields() {
        V1VolumeResourceRequirements requirements = new V1VolumeResourceRequirements();
        assertThat(V1VolumeResourceRequirements.openapiFields, notNullValue());
        assertThat(V1VolumeResourceRequirements.openapiFields.size(), equalTo(2));
        assertTrue(V1VolumeResourceRequirements.openapiFields.contains("limits"));
        assertTrue(V1VolumeResourceRequirements.openapiFields.contains("requests"));
    }

    //BaseRock generated method id: ${testGetOpenApiRequiredFields}, hash: E2EF3F5F5FAEEB04C39E571AE9E0AF5F
    @Test
    void testGetOpenApiRequiredFields() {
        V1VolumeResourceRequirements requirements = new V1VolumeResourceRequirements();
        assertThat(V1VolumeResourceRequirements.openapiRequiredFields, notNullValue());
        assertTrue(V1VolumeResourceRequirements.openapiRequiredFields.isEmpty());
    }
}
