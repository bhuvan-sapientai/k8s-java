package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.mockito.ArgumentMatchers.any;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import io.kubernetes.client.openapi.models.V1APIServiceSpec;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import com.google.gson.JsonObject;
import static org.junit.jupiter.api.Assertions.*;
import com.google.gson.JsonElement;
import static org.mockito.Mockito.*;
import io.kubernetes.client.openapi.models.V1APIServiceStatus;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1APIServiceBaseRockGeneratedTest {

    @Mock
    private V1ObjectMeta mockMetadata;

    @Mock
    private V1APIServiceSpec mockSpec;

    @Mock
    private V1APIServiceStatus mockStatus;

    private V1APIService v1APIService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        v1APIService = new V1APIService();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: C2D5B3418D758E71CD6E7A1B8F079D55
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1APIService.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1APIService.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 9FD7D06CDF7FC9B694475DE488D55208
    @Test
    void testKind() {
        String kind = "APIService";
        v1APIService.setKind(kind);
        assertEquals(kind, v1APIService.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 4F8FE253621F7DFBFD6759A27BFFBC3B
    @Test
    void testMetadata() {
        v1APIService.setMetadata(mockMetadata);
        assertEquals(mockMetadata, v1APIService.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: 15404A3A1DBB010F6F8BC12B19609B54
    @Test
    void testSpec() {
        v1APIService.setSpec(mockSpec);
        assertEquals(mockSpec, v1APIService.getSpec());
    }

    //BaseRock generated method id: ${testStatus}, hash: FA1A83A1244B7016A7C4AB8680162621
    @Test
    void testStatus() {
        v1APIService.setStatus(mockStatus);
        assertEquals(mockStatus, v1APIService.getStatus());
    }

    //BaseRock generated method id: ${testEquals}, hash: B539FCF93993BF279E99E368E82628C6
    @Test
    void testEquals() {
        V1APIService service1 = new V1APIService().apiVersion("v1").kind("APIService").metadata(mockMetadata).spec(mockSpec).status(mockStatus);
        V1APIService service2 = new V1APIService().apiVersion("v1").kind("APIService").metadata(mockMetadata).spec(mockSpec).status(mockStatus);
        assertEquals(service1, service2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: CDA8EFF73BE78ED68DBB35273A64E7AD
    @Test
    void testHashCode() {
        V1APIService service1 = new V1APIService().apiVersion("v1").kind("APIService").metadata(mockMetadata).spec(mockSpec).status(mockStatus);
        V1APIService service2 = new V1APIService().apiVersion("v1").kind("APIService").metadata(mockMetadata).spec(mockSpec).status(mockStatus);
        assertEquals(service1.hashCode(), service2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 5499A8E2D4454CDDB4E1EF74F4E422E7
    @Test
    void testToString() {
        v1APIService.setApiVersion("v1");
        v1APIService.setKind("APIService");
        v1APIService.setMetadata(mockMetadata);
        v1APIService.setSpec(mockSpec);
        v1APIService.setStatus(mockStatus);
        String expected = "class V1APIService {\n    apiVersion: v1\n    kind: APIService\n    metadata: " + mockMetadata + "\n    spec: " + mockSpec + "\n    status: " + mockStatus + "\n}";
        assertEquals(expected, v1APIService.toString());
    }

    //BaseRock generated method id: ${testValidateJsonElement}, hash: 09BA69D049B06B000D121F6549C92471
    @Test
    void testValidateJsonElement() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiVersion", "v1");
        jsonObject.addProperty("kind", "APIService");
        JsonElement jsonElement = jsonObject;
        assertDoesNotThrow(() -> V1APIService.validateJsonElement(jsonElement));
    }

    //BaseRock generated method id: ${testFromJson}, hash: 4C7F6A3375B2650C7EEDB66FDAE42E29
    @Test
    void testFromJson() {
        assertDoesNotThrow(() -> V1APIService.fromJson("{}"));
    }

    //BaseRock generated method id: ${testToJson}, hash: 3D6D12A47D486CD83BE990602E33D89B
    @Test
    void testToJson() {
        assertNotNull(v1APIService.toJson());
    }
}
