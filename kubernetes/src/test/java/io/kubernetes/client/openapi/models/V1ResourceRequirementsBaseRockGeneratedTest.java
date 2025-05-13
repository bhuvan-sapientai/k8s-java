package io.kubernetes.client.openapi.models;

import io.kubernetes.client.openapi.models.V1ResourceRequirements;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1ResourceClaim;
import io.kubernetes.client.custom.Quantity;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasEntry;
import com.google.gson.JsonElement;
import static org.hamcrest.Matchers.containsInAnyOrder;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.hasSize;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import java.util.ArrayList;
import com.google.gson.JsonArray;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ResourceRequirementsBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: E152C7ACD6422DFECF0D6E6B64B83AC7
    @Test
    void testConstructor() {
        V1ResourceRequirements resourceRequirements = new V1ResourceRequirements();
        assertThat(resourceRequirements, is(notNullValue()));
        assertThat(resourceRequirements.getClaims(), is(empty()));
        assertEquals(0, resourceRequirements.getLimits().size());
        assertEquals(0, resourceRequirements.getRequests().size());
    }

    //BaseRock generated method id: ${testSetAndGetClaims}, hash: AB9E65016314828E906A53079B4D3034
    @Test
    void testSetAndGetClaims() {
        V1ResourceRequirements resourceRequirements = new V1ResourceRequirements();
        List<V1ResourceClaim> claims = new ArrayList<>();
        claims.add(new V1ResourceClaim());
        resourceRequirements.setClaims(claims);
        assertThat(resourceRequirements.getClaims(), is(equalTo(claims)));
    }

    //BaseRock generated method id: ${testAddClaimsItem}, hash: 1EBE3396E09248952E37FFBA801F8593
    @Test
    void testAddClaimsItem() {
        V1ResourceRequirements resourceRequirements = new V1ResourceRequirements();
        V1ResourceClaim claim = new V1ResourceClaim();
        resourceRequirements.addClaimsItem(claim);
        assertThat(resourceRequirements.getClaims(), hasSize(1));
        assertThat(resourceRequirements.getClaims().get(0), is(equalTo(claim)));
    }

    //BaseRock generated method id: ${testSetAndGetLimits}, hash: EEFEADB47795C9E8F3CF86C8719D5558
    @Test
    void testSetAndGetLimits() {
        V1ResourceRequirements resourceRequirements = new V1ResourceRequirements();
        Map<String, Quantity> limits = new HashMap<>();
        limits.put("cpu", new Quantity("1"));
        resourceRequirements.setLimits(limits);
        assertThat(resourceRequirements.getLimits(), is(equalTo(limits)));
    }

    //BaseRock generated method id: ${testPutLimitsItem}, hash: F07438D6304AB4AC5988F37C49B68CCD
    @Test
    void testPutLimitsItem() {
        V1ResourceRequirements resourceRequirements = new V1ResourceRequirements();
        Quantity cpuLimit = new Quantity("1");
        resourceRequirements.putLimitsItem("cpu", cpuLimit);
        assertThat(resourceRequirements.getLimits(), hasEntry("cpu", cpuLimit));
    }

    //BaseRock generated method id: ${testSetAndGetRequests}, hash: 5AF8F8B78F5E81DFF31A03FF7C3F621B
    @Test
    void testSetAndGetRequests() {
        V1ResourceRequirements resourceRequirements = new V1ResourceRequirements();
        Map<String, Quantity> requests = new HashMap<>();
        requests.put("memory", new Quantity("1Gi"));
        resourceRequirements.setRequests(requests);
        assertThat(resourceRequirements.getRequests(), is(equalTo(requests)));
    }

    //BaseRock generated method id: ${testPutRequestsItem}, hash: 90AA92397DDCED738FF68D05A25C73ED
    @Test
    void testPutRequestsItem() {
        V1ResourceRequirements resourceRequirements = new V1ResourceRequirements();
        Quantity memoryRequest = new Quantity("1Gi");
        resourceRequirements.putRequestsItem("memory", memoryRequest);
        assertThat(resourceRequirements.getRequests(), hasEntry("memory", memoryRequest));
    }

    //BaseRock generated method id: ${testEquals}, hash: B9508497C10E9EB90F6C4E3FF33BAD46
    @Test
    void testEquals() {
        V1ResourceRequirements requirements1 = new V1ResourceRequirements().claims(new ArrayList<>()).limits(new HashMap<>()).requests(new HashMap<>());
        V1ResourceRequirements requirements2 = new V1ResourceRequirements().claims(new ArrayList<>()).limits(new HashMap<>()).requests(new HashMap<>());
        assertThat(requirements1, is(equalTo(requirements2)));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 25C7D8A363BD72066F5B3D26F918239D
    @Test
    void testHashCode() {
        V1ResourceRequirements requirements1 = new V1ResourceRequirements().claims(new ArrayList<>()).limits(new HashMap<>()).requests(new HashMap<>());
        V1ResourceRequirements requirements2 = new V1ResourceRequirements().claims(new ArrayList<>()).limits(new HashMap<>()).requests(new HashMap<>());
        assertThat(requirements1.hashCode(), is(equalTo(requirements2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 656AE314A25B10166DFCF0E9F6177C48
    @Test
    void testToString() {
        V1ResourceRequirements resourceRequirements = new V1ResourceRequirements().claims(new ArrayList<>()).limits(new HashMap<>()).requests(new HashMap<>());
        String expectedString = "class V1ResourceRequirements {\n" + "    claims: []\n" + "    limits: {}\n" + "    requests: {}\n" + "}";
        assertThat(resourceRequirements.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 108C8D804BC9C5AA0A3F4C0C0E98688D
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("claims", new JsonArray());
        jsonObject.add("limits", new JsonObject());
        jsonObject.add("requests", new JsonObject());
        V1ResourceRequirements.validateJsonElement(jsonObject);
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidField}, hash: 85C46BB24A0B613348936C699F5D1019
    @Test
    void testValidateJsonElementWithInvalidField() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("invalidField", "value");
        assertThrows(IllegalArgumentException.class, () -> V1ResourceRequirements.validateJsonElement(jsonObject));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 4EFD3078D22A93CFC352B93794889972
    @Test
    void testFromJson() throws IOException {
        String json = "{\"claims\":[],\"limits\":{},\"requests\":{}}";
        V1ResourceRequirements resourceRequirements = V1ResourceRequirements.fromJson(json);
        assertThat(resourceRequirements, is(notNullValue()));
        assertThat(resourceRequirements.getClaims(), is(empty()));
        assertEquals(0, resourceRequirements.getLimits().size());
        assertEquals(0, resourceRequirements.getRequests().size());
    }

    //BaseRock generated method id: ${testToJson}, hash: 92489E33306F3201B2B4F2796C3927CD
    @Test
    void testToJson() {
        V1ResourceRequirements resourceRequirements = new V1ResourceRequirements().claims(new ArrayList<>()).limits(new HashMap<>()).requests(new HashMap<>());
        String expectedJson = "{\"claims\":[],\"limits\":{},\"requests\":{}}";
        assertThat(resourceRequirements.toJson(), is(equalTo(expectedJson)));
    }
}
