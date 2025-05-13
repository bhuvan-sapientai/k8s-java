package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import io.kubernetes.client.custom.Quantity;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.mockito.Mock;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ResourceFieldSelectorBaseRockGeneratedTest {

    @Mock
    private Quantity mockQuantity;

    private V1ResourceFieldSelector resourceFieldSelector;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        resourceFieldSelector = new V1ResourceFieldSelector();
    }

    //BaseRock generated method id: ${testConstructor}, hash: 7631FBA5A1DDC3A1D631733BA74E2A0E
    @Test
    void testConstructor() {
        assertNotNull(resourceFieldSelector);
    }

    //BaseRock generated method id: ${testContainerName}, hash: B00B0BB0C45618F1F35A349D82CE5D98
    @Test
    void testContainerName() {
        String containerName = "test-container";
        resourceFieldSelector.setContainerName(containerName);
        assertEquals(containerName, resourceFieldSelector.getContainerName());
    }

    //BaseRock generated method id: ${testDivisor}, hash: 04434CBCF0E50792FBFACAA0D00D6E9B
    @Test
    void testDivisor() {
        resourceFieldSelector.setDivisor(mockQuantity);
        assertEquals(mockQuantity, resourceFieldSelector.getDivisor());
    }

    //BaseRock generated method id: ${testResource}, hash: BE50B156868CC55EECC3F4A2E33D1180
    @Test
    void testResource() {
        String resource = "cpu";
        resourceFieldSelector.setResource(resource);
        assertEquals(resource, resourceFieldSelector.getResource());
    }

    //BaseRock generated method id: ${testResourceWithVariousValues}, hash: 9BD90A2BDCE3EA8011B2F7EF85C542A4
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "cpu", "memory", "storage" })
    void testResourceWithVariousValues(String resource) {
        resourceFieldSelector.setResource(resource);
        assertEquals(resource, resourceFieldSelector.getResource());
    }

    //BaseRock generated method id: ${testEquals}, hash: 1B850E1286F1D44F9E492B851051199A
    @Test
    void testEquals() {
        V1ResourceFieldSelector selector1 = new V1ResourceFieldSelector().containerName("container1").divisor(new Quantity("1")).resource("cpu");
        V1ResourceFieldSelector selector2 = new V1ResourceFieldSelector().containerName("container1").divisor(new Quantity("1")).resource("cpu");
        V1ResourceFieldSelector selector3 = new V1ResourceFieldSelector().containerName("container2").divisor(new Quantity("2")).resource("memory");
        assertTrue(selector1.equals(selector2));
        assertFalse(selector1.equals(selector3));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 5D035548082E9367F15BB405879F89D9
    @Test
    void testHashCode() {
        V1ResourceFieldSelector selector1 = new V1ResourceFieldSelector().containerName("container1").divisor(new Quantity("1")).resource("cpu");
        V1ResourceFieldSelector selector2 = new V1ResourceFieldSelector().containerName("container1").divisor(new Quantity("1")).resource("cpu");
        assertEquals(selector1.hashCode(), selector2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 05296C42EA47069A68DEC0AF249268CB
    @Test
    void testToString() {
        V1ResourceFieldSelector selector = new V1ResourceFieldSelector().containerName("test-container").divisor(new Quantity("1")).resource("cpu");
        String expected = "class V1ResourceFieldSelector {\n" + "    containerName: test-container\n" + "    divisor: Quantity{number=1, format=DECIMAL_SI}\n" + "    resource: cpu\n" + "}";
        assertEquals(expected, selector.toString());
    }

    //BaseRock generated method id: ${testToJson}, hash: 1543C24845EBC28C3C3B2E3EBB119D42
    @Test
    void testToJson() throws IOException {
        V1ResourceFieldSelector selector = new V1ResourceFieldSelector().containerName("test-container").divisor(new Quantity("1")).resource("cpu");
        String json = selector.toJson();
        assertNotNull(json);
        assertTrue(json.contains("\"containerName\":\"test-container\""));
        assertTrue(json.contains("\"divisor\":\"1\""));
        assertTrue(json.contains("\"resource\":\"cpu\""));
    }

    //BaseRock generated method id: ${testFromJson}, hash: A8F0C094DB352BDB255257C6D626FCAE
    @Test
    void testFromJson() throws IOException {
        String json = "{\"containerName\":\"test-container\",\"divisor\":\"1\",\"resource\":\"cpu\"}";
        V1ResourceFieldSelector selector = V1ResourceFieldSelector.fromJson(json);
        assertNotNull(selector);
        assertEquals("test-container", selector.getContainerName());
        assertEquals(new Quantity("1"), selector.getDivisor());
        assertEquals("cpu", selector.getResource());
    }
}
