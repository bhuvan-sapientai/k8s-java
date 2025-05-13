package io.kubernetes.client.openapi.models;

import com.google.gson.JsonParseException;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import com.google.gson.JsonElement;
import org.junit.jupiter.params.provider.NullSource;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CSINodeSpecBaseRockGeneratedTest {

    private V1CSINodeSpec v1CSINodeSpec;

    @BeforeEach
    void setUp() {
        v1CSINodeSpec = new V1CSINodeSpec();
    }

    //BaseRock generated method id: ${testV1CSINodeSpecConstructor}, hash: 1A68663C6338D8C3E116EF02CD83B2AE
    @Test
    void testV1CSINodeSpecConstructor() {
        assertNotNull(v1CSINodeSpec);
    }

    //BaseRock generated method id: ${testDriversGetter}, hash: D18F781F908BB01124704DC19B1C8E2C
    @Test
    void testDriversGetter() {
        List<V1CSINodeDriver> drivers = new ArrayList<>();
        v1CSINodeSpec.setDrivers(drivers);
        assertEquals(drivers, v1CSINodeSpec.getDrivers());
    }

    //BaseRock generated method id: ${testDriversSetter}, hash: 1F2C0526F875FB023B72C536B182BB18
    @Test
    void testDriversSetter() {
        List<V1CSINodeDriver> drivers = new ArrayList<>();
        v1CSINodeSpec.setDrivers(drivers);
        assertEquals(drivers, v1CSINodeSpec.getDrivers());
    }

    //BaseRock generated method id: ${testDriversFluentSetter}, hash: E253753390920DA43BBB22DFF605D0F0
    @Test
    void testDriversFluentSetter() {
        List<V1CSINodeDriver> drivers = new ArrayList<>();
        V1CSINodeSpec result = v1CSINodeSpec.drivers(drivers);
        assertEquals(drivers, result.getDrivers());
        assertSame(v1CSINodeSpec, result);
    }

    //BaseRock generated method id: ${testAddDriversItem}, hash: 035BEF3160A8875BFB53EDE8EB074564
    @Test
    void testAddDriversItem() {
        V1CSINodeDriver driver = new V1CSINodeDriver();
        V1CSINodeSpec result = v1CSINodeSpec.addDriversItem(driver);
        assertTrue(result.getDrivers().contains(driver));
        assertSame(v1CSINodeSpec, result);
    }

    //BaseRock generated method id: ${testAddDriversItemWhenDriversIsNull}, hash: EA4E430DA6E1CEA6E4EE3AF250C5EC72
    @Test
    void testAddDriversItemWhenDriversIsNull() {
        V1CSINodeDriver driver = new V1CSINodeDriver();
        V1CSINodeSpec result = v1CSINodeSpec.addDriversItem(driver);
        assertNotNull(result.getDrivers());
        assertTrue(result.getDrivers().contains(driver));
        assertSame(v1CSINodeSpec, result);
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 7C954BB1A1B5C416C1001297F3D2A685
    @Test
    void testEqualsWithSameObject() {
        assertTrue(v1CSINodeSpec.equals(v1CSINodeSpec));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 9354D8EBA0101CCF06B97477E0B2198D
    @Test
    void testEqualsWithDifferentClass() {
        assertFalse(v1CSINodeSpec.equals(new Object()));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: 9DCBF6487A213EC4F773C15B03458BA8
    @Test
    void testEqualsWithNull() {
        assertFalse(v1CSINodeSpec.equals(null));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: D207AE05D051D71511F53FDFCADC2441
    @Test
    void testEqualsWithDifferentObject() {
        V1CSINodeSpec other = new V1CSINodeSpec();
        other.setDrivers(new ArrayList<>());
        assertTrue(v1CSINodeSpec.equals(other));
    }

    //BaseRock generated method id: ${testHashCode}, hash: 707265E982B0E3FCCEB02D131F3C439F
    @Test
    void testHashCode() {
        List<V1CSINodeDriver> drivers = new ArrayList<>();
        v1CSINodeSpec.setDrivers(drivers);
        assertEquals(java.util.Objects.hash(drivers), v1CSINodeSpec.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: E0EF61D819DE3A47B891D7EBA4DD094C
    @Test
    void testToString() {
        List<V1CSINodeDriver> drivers = new ArrayList<>();
        v1CSINodeSpec.setDrivers(drivers);
        String expected = "class V1CSINodeSpec {\n    drivers: []\n}";
        assertEquals(expected, v1CSINodeSpec.toString());
    }

    //BaseRock generated method id: ${testFromJson}, hash: A8A9069D656F8AB8E002AD93F7B47618
    @ParameterizedTest
    @NullSource
    @ValueSource(strings = { "{\"drivers\":[]}", "{\"drivers\":[{\"name\":\"test\",\"nodeID\":\"node1\"}]}" })
    void testFromJson(String json) throws IOException {
        V1CSINodeSpec result = V1CSINodeSpec.fromJson(json);
        if (json == null) {
            assertNull(result);
        } else {
            assertNotNull(result);
            JsonObject jsonObject = com.google.gson.JsonParser.parseString(json).getAsJsonObject();
            JsonElement driversElement = jsonObject.get("drivers");
            if (driversElement.isJsonArray() && driversElement.getAsJsonArray().size() == 0) {
                assertTrue(result.getDrivers().isEmpty());
            } else {
                assertFalse(result.getDrivers().isEmpty());
                assertEquals("test", result.getDrivers().get(0).getName());
                assertEquals("node1", result.getDrivers().get(0).getNodeID());
            }
        }
    }

    //BaseRock generated method id: ${testToJson}, hash: 5E41EC82357B228BBAF6686C97DC3D60
    @Test
    void testToJson() {
        V1CSINodeDriver driver = new V1CSINodeDriver();
        driver.setName("test");
        driver.setNodeID("node1");
        v1CSINodeSpec.addDriversItem(driver);
        String json = v1CSINodeSpec.toJson();
        assertThat(json, containsString("\"drivers\":[{\"name\":\"test\",\"nodeID\":\"node1\""));
        assertThat(json, containsString("\"topologyKeys\":[]"));
    }
}
