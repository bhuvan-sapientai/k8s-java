package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScale;
import static org.mockito.ArgumentMatchers.eq;
import java.util.Objects;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1CustomResourceSubresources;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1CustomResourceSubresourcesBaseRockGeneratedTest {

    private V1CustomResourceSubresources customResourceSubresources;

    @BeforeEach
    void setUp() {
        customResourceSubresources = new V1CustomResourceSubresources();
    }

    //BaseRock generated method id: ${testConstructor}, hash: DBF368FB10B75EB3F45515479BE45441
    @Test
    void testConstructor() {
        assertNotNull(customResourceSubresources);
    }

    //BaseRock generated method id: ${testSetAndGetScale}, hash: EE955DCD1EE3CDD60E8CCA2FBB3167BD
    @Test
    void testSetAndGetScale() {
        V1CustomResourceSubresourceScale scale = mock(V1CustomResourceSubresourceScale.class);
        customResourceSubresources.setScale(scale);
        assertEquals(scale, customResourceSubresources.getScale());
    }

    //BaseRock generated method id: ${testSetAndGetStatus}, hash: FB2BC51F2B8DDB0C81B6EA2CE3C14BD8
    @Test
    void testSetAndGetStatus() {
        Object status = new Object();
        customResourceSubresources.setStatus(status);
        assertEquals(status, customResourceSubresources.getStatus());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: DB42A9B155372ED91B09B19460E062AA
    @Test
    void testEqualsWithSameObject() {
        assertTrue(customResourceSubresources.equals(customResourceSubresources));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: 8952796C55ED3D86D82C98B148881365
    @Test
    void testEqualsWithDifferentClass() {
        assertFalse(customResourceSubresources.equals(new Object()));
    }

    //BaseRock generated method id: ${testEqualsWithNullObject}, hash: BA375A39E52E20BB8BA073FCBDD75BBA
    @Test
    void testEqualsWithNullObject() {
        assertFalse(customResourceSubresources.equals(null));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObjects}, hash: B8E671E13FD8FF02345ED0FF40E96230
    @Test
    void testEqualsWithDifferentObjects() {
        V1CustomResourceSubresources other = new V1CustomResourceSubresources();
        other.setScale(mock(V1CustomResourceSubresourceScale.class));
        other.setStatus(new Object());
        assertFalse(customResourceSubresources.equals(other));
    }

    //BaseRock generated method id: ${testHashCode}, hash: EC9E430A460CAC665E3EC6A6CAEE019A
    @Test
    void testHashCode() {
        V1CustomResourceSubresourceScale scale = mock(V1CustomResourceSubresourceScale.class);
        Object status = new Object();
        customResourceSubresources.setScale(scale);
        customResourceSubresources.setStatus(status);
        int expectedHashCode = Objects.hash(scale, status);
        assertEquals(expectedHashCode, customResourceSubresources.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 6CC42DE48B6F77228E9517FEECEB60BF
    @Test
    void testToString() {
        V1CustomResourceSubresourceScale scale = mock(V1CustomResourceSubresourceScale.class);
        when(scale.toString()).thenReturn("mockScale");
        Object status = "mockStatus";
        customResourceSubresources.setScale(scale);
        customResourceSubresources.setStatus(status);
        String expectedString = "class V1CustomResourceSubresources {\n    scale: mockScale\n    status: mockStatus\n}";
        assertEquals(expectedString, customResourceSubresources.toString());
    }
}
