package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.mockito.Mock;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CSIDriverBaseRockGeneratedTest {

    @Mock
    private V1ObjectMeta mockMetadata;

    @Mock
    private V1CSIDriverSpec mockSpec;

    private V1CSIDriver v1CSIDriver;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        v1CSIDriver = new V1CSIDriver();
    }

    //BaseRock generated method id: ${testApiVersion}, hash: A76A12F85641873E465601510CE37347
    @Test
    void testApiVersion() {
        String apiVersion = "v1";
        v1CSIDriver.setApiVersion(apiVersion);
        assertEquals(apiVersion, v1CSIDriver.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 0167E5CFE9F03F2F5BE1613D57829838
    @Test
    void testKind() {
        String kind = "CSIDriver";
        v1CSIDriver.setKind(kind);
        assertEquals(kind, v1CSIDriver.getKind());
    }

    //BaseRock generated method id: ${testMetadata}, hash: 6F859E7C3084142AA951053FF36021BC
    @Test
    void testMetadata() {
        v1CSIDriver.setMetadata(mockMetadata);
        assertEquals(mockMetadata, v1CSIDriver.getMetadata());
    }

    //BaseRock generated method id: ${testSpec}, hash: B8CB51729272990F10A2BB131D5B7C9C
    @Test
    void testSpec() {
        v1CSIDriver.setSpec(mockSpec);
        assertEquals(mockSpec, v1CSIDriver.getSpec());
    }

    //BaseRock generated method id: ${testEquals}, hash: 0409AF4A479B7E86F2179DA2AF026900
    @Test
    void testEquals() {
        V1CSIDriver driver1 = new V1CSIDriver().apiVersion("v1").kind("CSIDriver").metadata(mockMetadata).spec(mockSpec);
        V1CSIDriver driver2 = new V1CSIDriver().apiVersion("v1").kind("CSIDriver").metadata(mockMetadata).spec(mockSpec);
        assertEquals(driver1, driver2);
    }

    //BaseRock generated method id: ${testNotEquals}, hash: CA67ACCDA52EE7B2FC613056DB3C3675
    @Test
    void testNotEquals() {
        V1CSIDriver driver1 = new V1CSIDriver().apiVersion("v1").kind("CSIDriver").metadata(mockMetadata).spec(mockSpec);
        V1CSIDriver driver2 = new V1CSIDriver().apiVersion("v2").kind("CSIDriver").metadata(mockMetadata).spec(mockSpec);
        assertNotEquals(driver1, driver2);
    }

    //BaseRock generated method id: ${testHashCode}, hash: 4C48C8354270EAE8E4CF1C8ED170F8A2
    @Test
    void testHashCode() {
        V1CSIDriver driver1 = new V1CSIDriver().apiVersion("v1").kind("CSIDriver").metadata(mockMetadata).spec(mockSpec);
        V1CSIDriver driver2 = new V1CSIDriver().apiVersion("v1").kind("CSIDriver").metadata(mockMetadata).spec(mockSpec);
        assertEquals(driver1.hashCode(), driver2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 3F1B80BE19DCDC8B22E84D6070631426
    @Test
    void testToString() {
        v1CSIDriver.setApiVersion("v1");
        v1CSIDriver.setKind("CSIDriver");
        v1CSIDriver.setMetadata(mockMetadata);
        v1CSIDriver.setSpec(mockSpec);
        String expectedString = "class V1CSIDriver {\n" + "    apiVersion: v1\n" + "    kind: CSIDriver\n" + "    metadata: " + mockMetadata + "\n" + "    spec: " + mockSpec + "\n" + "}";
        assertEquals(expectedString, v1CSIDriver.toString());
    }
}
