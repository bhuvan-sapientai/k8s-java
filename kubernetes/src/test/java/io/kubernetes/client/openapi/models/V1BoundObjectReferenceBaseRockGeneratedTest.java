package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import io.kubernetes.client.openapi.models.V1BoundObjectReference;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1BoundObjectReferenceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1BoundObjectReferenceConstructor}, hash: 032578BD060FFC427A6129D4F50AC46E
    @Test
    void testV1BoundObjectReferenceConstructor() {
        V1BoundObjectReference boundObjectReference = new V1BoundObjectReference();
        assertNotNull(boundObjectReference);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: EE8F58CCD4E88C06315C81E2E7BDD8EB
    @Test
    void testApiVersion() {
        V1BoundObjectReference boundObjectReference = new V1BoundObjectReference();
        String apiVersion = "v1";
        boundObjectReference.setApiVersion(apiVersion);
        assertEquals(apiVersion, boundObjectReference.getApiVersion());
    }

    //BaseRock generated method id: ${testKind}, hash: 8C4E2C196F3995098FFB99D52EAF546F
    @Test
    void testKind() {
        V1BoundObjectReference boundObjectReference = new V1BoundObjectReference();
        String kind = "Pod";
        boundObjectReference.setKind(kind);
        assertEquals(kind, boundObjectReference.getKind());
    }

    //BaseRock generated method id: ${testName}, hash: C57AD969B6E1A2CFF10925A98B360CAE
    @Test
    void testName() {
        V1BoundObjectReference boundObjectReference = new V1BoundObjectReference();
        String name = "test-pod";
        boundObjectReference.setName(name);
        assertEquals(name, boundObjectReference.getName());
    }

    //BaseRock generated method id: ${testUid}, hash: 6A762BA960D2D3D8C7144060EF639F8A
    @Test
    void testUid() {
        V1BoundObjectReference boundObjectReference = new V1BoundObjectReference();
        String uid = "123e4567-e89b-12d3-a456-426614174000";
        boundObjectReference.setUid(uid);
        assertEquals(uid, boundObjectReference.getUid());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 79D74C8CA2005CED18CCAA715E2CD4FF
    @Test
    void testEqualsAndHashCode() {
        V1BoundObjectReference ref1 = new V1BoundObjectReference().apiVersion("v1").kind("Pod").name("test-pod").uid("123e4567-e89b-12d3-a456-426614174000");
        V1BoundObjectReference ref2 = new V1BoundObjectReference().apiVersion("v1").kind("Pod").name("test-pod").uid("123e4567-e89b-12d3-a456-426614174000");
        V1BoundObjectReference ref3 = new V1BoundObjectReference().apiVersion("v2").kind("Secret").name("test-secret").uid("987e6543-e21b-12d3-a456-426614174000");
        assertThat(ref1.equals(ref2), is(true));
        assertThat(ref1.equals(ref3), is(false));
        assertThat(ref1.hashCode() == ref2.hashCode(), is(true));
        assertThat(ref1.hashCode() == ref3.hashCode(), is(false));
    }

    //BaseRock generated method id: ${testToString}, hash: B133429A4A4DE646F2D206EDC0AFBE11
    @Test
    void testToString() {
        V1BoundObjectReference boundObjectReference = new V1BoundObjectReference().apiVersion("v1").kind("Pod").name("test-pod").uid("123e4567-e89b-12d3-a456-426614174000");
        String expectedString = "class V1BoundObjectReference {\n" + "    apiVersion: v1\n" + "    kind: Pod\n" + "    name: test-pod\n" + "    uid: 123e4567-e89b-12d3-a456-426614174000\n" + "}";
        assertEquals(expectedString, boundObjectReference.toString());
    }

    //BaseRock generated method id: ${testNullValues}, hash: 2A31FB05C7CDD8D0545723FB98F96115
    @Test
    void testNullValues() {
        V1BoundObjectReference boundObjectReference = new V1BoundObjectReference();
        assertThat(boundObjectReference.getApiVersion(), is(nullValue()));
        assertThat(boundObjectReference.getKind(), is(nullValue()));
        assertThat(boundObjectReference.getName(), is(nullValue()));
        assertThat(boundObjectReference.getUid(), is(nullValue()));
    }
}
