package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import io.kubernetes.client.openapi.models.V1VolumeNodeResources;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1VolumeNodeResourcesBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: A003C9836AC57E9387153E861FE91D8B
    @Test
    void testConstructor() {
        V1VolumeNodeResources resources = new V1VolumeNodeResources();
        assertNotNull(resources);
    }

    //BaseRock generated method id: ${testSetAndGetCount}, hash: 50355E5B1911B3FBDB014A29202DFB53
    @Test
    void testSetAndGetCount() {
        V1VolumeNodeResources resources = new V1VolumeNodeResources();
        resources.setCount(5);
        assertEquals(5, resources.getCount());
    }

    //BaseRock generated method id: ${testSetAndGetCountWithVariousValues}, hash: 110AF4753FE26962DC2BC6FAE866D5E1
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 100, Integer.MAX_VALUE })
    void testSetAndGetCountWithVariousValues(int count) {
        V1VolumeNodeResources resources = new V1VolumeNodeResources();
        resources.setCount(count);
        assertEquals(count, resources.getCount());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: 8E4A9ED3FF3FD9DD3A2DEC3474C09258
    @Test
    void testEqualsWithSameObject() {
        V1VolumeNodeResources resources = new V1VolumeNodeResources().count(10);
        assertTrue(resources.equals(resources));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObject}, hash: A989A11260E7EE410F8F84FE840C5117
    @Test
    void testEqualsWithDifferentObject() {
        V1VolumeNodeResources resources1 = new V1VolumeNodeResources().count(10);
        V1VolumeNodeResources resources2 = new V1VolumeNodeResources().count(10);
        assertTrue(resources1.equals(resources2));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentCount}, hash: D6CC43FD1A57903EB95434E976450300
    @Test
    void testEqualsWithDifferentCount() {
        V1VolumeNodeResources resources1 = new V1VolumeNodeResources().count(10);
        V1VolumeNodeResources resources2 = new V1VolumeNodeResources().count(20);
        assertFalse(resources1.equals(resources2));
    }

    //BaseRock generated method id: ${testEqualsWithNull}, hash: B2F39E344F9455CF8A61B3041BA09DE5
    @Test
    void testEqualsWithNull() {
        V1VolumeNodeResources resources = new V1VolumeNodeResources().count(10);
        assertFalse(resources.equals(null));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: EB4D5B0DE68EA9B11766584DC22118A5
    @Test
    void testEqualsWithDifferentClass() {
        V1VolumeNodeResources resources = new V1VolumeNodeResources().count(10);
        assertFalse(resources.equals("Not a V1VolumeNodeResources"));
    }

    //BaseRock generated method id: ${testHashCode}, hash: B3EC3054183932C13BB81BC1BBD4E6F0
    @Test
    void testHashCode() {
        V1VolumeNodeResources resources1 = new V1VolumeNodeResources().count(10);
        V1VolumeNodeResources resources2 = new V1VolumeNodeResources().count(10);
        assertEquals(resources1.hashCode(), resources2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: CEC01FB59FCEF576B3B7F53BBD8BFA49
    @Test
    void testToString() {
        V1VolumeNodeResources resources = new V1VolumeNodeResources().count(10);
        String expected = "class V1VolumeNodeResources {\n    count: 10\n}";
        assertEquals(expected, resources.toString());
    }

    //BaseRock generated method id: ${testBuilder}, hash: 106C089D0A608373BCA3EC5F6A6EB09C
    @Test
    void testBuilder() {
        V1VolumeNodeResources resources = new V1VolumeNodeResources().count(15);
        assertEquals(15, resources.getCount());
    }
}
