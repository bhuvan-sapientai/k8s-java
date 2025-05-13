package io.kubernetes.client.openapi.models;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import com.google.gson.JsonElement;
import io.kubernetes.client.openapi.JSON;
import com.google.gson.JsonArray;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Disabled;

@Timeout(10)
class V1LoadBalancerStatusBaseRockGeneratedTest {

    private V1LoadBalancerStatus v1LoadBalancerStatus;

    @Mock
    private V1LoadBalancerIngress mockIngress;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        v1LoadBalancerStatus = new V1LoadBalancerStatus();
    }

    //BaseRock generated method id: ${testV1LoadBalancerStatus}, hash: ECC037606AD19BC07BA093894B826A6D
    @Test
    void testV1LoadBalancerStatus() {
        assertNotNull(v1LoadBalancerStatus);
        assertNotNull(v1LoadBalancerStatus.getIngress());
        assertTrue(v1LoadBalancerStatus.getIngress().isEmpty());
    }

    //BaseRock generated method id: ${testIngressMethod}, hash: 2C53C73124A5E1A3FB4B7AF20226474B
    @Test
    void testIngressMethod() {
        List<V1LoadBalancerIngress> ingressList = new ArrayList<>();
        ingressList.add(mockIngress);
        V1LoadBalancerStatus result = v1LoadBalancerStatus.ingress(ingressList);
        assertSame(v1LoadBalancerStatus, result);
        assertEquals(ingressList, v1LoadBalancerStatus.getIngress());
    }

    //BaseRock generated method id: ${testAddIngressItem}, hash: 23FFE86F8D32FC771BE699BC944301C8
    @Test
    void testAddIngressItem() {
        V1LoadBalancerStatus result = v1LoadBalancerStatus.addIngressItem(mockIngress);
        assertSame(v1LoadBalancerStatus, result);
        assertTrue(v1LoadBalancerStatus.getIngress().contains(mockIngress));
    }

    //BaseRock generated method id: ${testSetIngress}, hash: 0B6D9879E07081AF2FDD8F4461C3501F
    @Test
    void testSetIngress() {
        List<V1LoadBalancerIngress> ingressList = new ArrayList<>();
        ingressList.add(mockIngress);
        v1LoadBalancerStatus.setIngress(ingressList);
        assertEquals(ingressList, v1LoadBalancerStatus.getIngress());
    }

    //BaseRock generated method id: ${testEquals}, hash: 387C793D59BB1EB5BEA5D4794DB57849
    @Test
    void testEquals() {
        V1LoadBalancerStatus status1 = new V1LoadBalancerStatus().ingress(new ArrayList<>());
        V1LoadBalancerStatus status2 = new V1LoadBalancerStatus().ingress(new ArrayList<>());
        V1LoadBalancerStatus status3 = new V1LoadBalancerStatus().addIngressItem(mockIngress);
        assertTrue(status1.equals(status2));
        assertTrue(status1.equals(status1));
        assertFalse(status1.equals(status3));
        assertFalse(status1.equals(null));
        assertFalse(status1.equals(new Object()));
    }

    //BaseRock generated method id: ${testHashCode}, hash: CC49D3A70E4A86C63954A436C45D5CD7
    @Test
    void testHashCode() {
        V1LoadBalancerStatus status1 = new V1LoadBalancerStatus().ingress(new ArrayList<>());
        V1LoadBalancerStatus status2 = new V1LoadBalancerStatus().ingress(new ArrayList<>());
        assertEquals(status1.hashCode(), status2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 0B96C5BB104037A410F01A8A2DEB0599
    @Test
    void testToString() {
        String result = v1LoadBalancerStatus.toString();
        assertTrue(result.contains("class V1LoadBalancerStatus"));
        assertTrue(result.contains("ingress"));
    }

    //BaseRock generated method id: ${testToIndentedString}, hash: 74F51709DD9C241766B79CACFEF13A0D
    @Test
    void testToIndentedString() {
        v1LoadBalancerStatus.addIngressItem(mockIngress);
        String result = v1LoadBalancerStatus.toString();
        assertTrue(result.contains("ingress"));
        assertTrue(result.contains(mockIngress.toString()));
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 63E0020987013191B4B594804A493597
    @Test
    void testValidateJsonElement() throws IOException {
        JsonObject jsonObj = new JsonObject();
        JsonArray ingressArray = new JsonArray();
        ingressArray.add(new JsonObject());
        jsonObj.add("ingress", ingressArray);
        assertDoesNotThrow(() -> V1LoadBalancerStatus.validateJsonElement(jsonObj));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidField}, hash: D7E3C7D24E4BB92768BF78E818F87ADE
    @Test
    void testValidateJsonElementWithInvalidField() {
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty("invalidField", "value");
        assertThrows(IllegalArgumentException.class, () -> V1LoadBalancerStatus.validateJsonElement(jsonObj));
    }

    //BaseRock generated method id: ${testValidateJsonElementWithInvalidIngress}, hash: EA4E7359F8FA9B7C70106BC839B94533
    @Disabled()
    @Test
    void testValidateJsonElementWithInvalidIngress() {
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty("ingress", "invalid");
        assertThrows(IllegalArgumentException.class, () -> V1LoadBalancerStatus.validateJsonElement(jsonObj));
    }

    //BaseRock generated method id: ${testFromJson}, hash: A134B2CD465EA9BCB1A97367EA61CDEC
    @Test
    void testFromJson() throws IOException {
        String json = "{\"ingress\":[{\"hostname\":\"test.com\"}]}";
        V1LoadBalancerStatus result = V1LoadBalancerStatus.fromJson(json);
        assertNotNull(result);
        assertEquals(1, result.getIngress().size());
        assertEquals("test.com", result.getIngress().get(0).getHostname());
    }

    //BaseRock generated method id: ${testToJson}, hash: 751AB5BF74BA2553685C133A825361DF
    @Test
    void testToJson() {
        v1LoadBalancerStatus.addIngressItem(new V1LoadBalancerIngress().hostname("test.com"));
        String json = v1LoadBalancerStatus.toJson();
        assertTrue(json.contains("\"ingress\""));
        assertTrue(json.contains("\"hostname\":\"test.com\""));
    }
}
