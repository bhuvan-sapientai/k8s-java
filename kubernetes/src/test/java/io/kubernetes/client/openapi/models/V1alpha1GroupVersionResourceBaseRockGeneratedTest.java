package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
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
class V1alpha1GroupVersionResourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: D56DEC440D916150068E9B59D0B94165
    @Test
    void testConstructor() {
        V1alpha1GroupVersionResource resource = new V1alpha1GroupVersionResource();
        assertNotNull(resource);
    }

    //BaseRock generated method id: ${testGroupGetterAndSetter}, hash: DD1773453688DD709D58D92899DDFD97
    @Test
    void testGroupGetterAndSetter() {
        V1alpha1GroupVersionResource resource = new V1alpha1GroupVersionResource();
        String group = "testGroup";
        resource.setGroup(group);
        assertEquals(group, resource.getGroup());
    }

    //BaseRock generated method id: ${testResourceGetterAndSetter}, hash: B459226598A37CC5CD6510CD8FB8667C
    @Test
    void testResourceGetterAndSetter() {
        V1alpha1GroupVersionResource resource = new V1alpha1GroupVersionResource();
        String resourceValue = "testResource";
        resource.setResource(resourceValue);
        assertEquals(resourceValue, resource.getResource());
    }

    //BaseRock generated method id: ${testVersionGetterAndSetter}, hash: 0D1B52DEE0453E0D5909C72B1EA1852A
    @Test
    void testVersionGetterAndSetter() {
        V1alpha1GroupVersionResource resource = new V1alpha1GroupVersionResource();
        String version = "v1";
        resource.setVersion(version);
        assertEquals(version, resource.getVersion());
    }

    //BaseRock generated method id: ${testEqualsWithSameObject}, hash: CC97883B5D149252D41643DAE2E44B0D
    @Test
    void testEqualsWithSameObject() {
        V1alpha1GroupVersionResource resource = new V1alpha1GroupVersionResource();
        assertTrue(resource.equals(resource));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentClass}, hash: BCFBA8D2752FE97C1126BF1A7F40C7D2
    @Test
    void testEqualsWithDifferentClass() {
        V1alpha1GroupVersionResource resource = new V1alpha1GroupVersionResource();
        assertFalse(resource.equals(new Object()));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObjects}, hash: D0DE360617A32974A3AC516F54FEB972
    @Test
    void testEqualsWithDifferentObjects() {
        V1alpha1GroupVersionResource resource1 = new V1alpha1GroupVersionResource().group("group1").resource("resource1").version("v1");
        V1alpha1GroupVersionResource resource2 = new V1alpha1GroupVersionResource().group("group2").resource("resource2").version("v2");
        assertFalse(resource1.equals(resource2));
    }

    //BaseRock generated method id: ${testEqualsWithSameValues}, hash: B5CDDF421830232FD5A03B45D3043982
    @Test
    void testEqualsWithSameValues() {
        V1alpha1GroupVersionResource resource1 = new V1alpha1GroupVersionResource().group("group").resource("resource").version("v1");
        V1alpha1GroupVersionResource resource2 = new V1alpha1GroupVersionResource().group("group").resource("resource").version("v1");
        assertTrue(resource1.equals(resource2));
    }

    //BaseRock generated method id: ${testHashCode}, hash: E01CB06D00B543FC2DD6A2243C429596
    @Test
    void testHashCode() {
        V1alpha1GroupVersionResource resource1 = new V1alpha1GroupVersionResource().group("group").resource("resource").version("v1");
        V1alpha1GroupVersionResource resource2 = new V1alpha1GroupVersionResource().group("group").resource("resource").version("v1");
        assertEquals(resource1.hashCode(), resource2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 5B22951E15AB169CCF7C634953C1E5A7
    @Test
    void testToString() {
        V1alpha1GroupVersionResource resource = new V1alpha1GroupVersionResource().group("testGroup").resource("testResource").version("v1");
        String expected = "class V1alpha1GroupVersionResource {\n    group: testGroup\n    resource: testResource\n    version: v1\n}";
        assertEquals(expected, resource.toString());
    }

    //BaseRock generated method id: ${testNullValues}, hash: 51BCD1A601B9CE4A85C44CC8FE5DAA1B
    @ParameterizedTest
    @ValueSource(strings = { "group", "resource", "version" })
    void testNullValues(String field) {
        V1alpha1GroupVersionResource resource = new V1alpha1GroupVersionResource();
        switch(field) {
            case "group":
                resource.setGroup(null);
                assertNull(resource.getGroup());
                break;
            case "resource":
                resource.setResource(null);
                assertNull(resource.getResource());
                break;
            case "version":
                resource.setVersion(null);
                assertNull(resource.getVersion());
                break;
        }
    }
}
