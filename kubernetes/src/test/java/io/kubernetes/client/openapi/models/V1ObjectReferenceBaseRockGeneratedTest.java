package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import io.kubernetes.client.openapi.models.V1ObjectReference;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ObjectReferenceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testV1ObjectReferenceConstructor}, hash: 8745E4405BD7E451A2BE6070E6A14436
    @Test
    void testV1ObjectReferenceConstructor() {
        V1ObjectReference objectReference = new V1ObjectReference();
        assertNotNull(objectReference);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: AE651FC6B0527A7027089F426FF3A7E0
    @Test
    void testApiVersion() {
        V1ObjectReference objectReference = new V1ObjectReference();
        String apiVersion = "v1";
        objectReference.setApiVersion(apiVersion);
        assertEquals(apiVersion, objectReference.getApiVersion());
    }

    //BaseRock generated method id: ${testFieldPath}, hash: 57295D1D1307968AB40187BDF8F225B3
    @Test
    void testFieldPath() {
        V1ObjectReference objectReference = new V1ObjectReference();
        String fieldPath = "spec.containers[2]";
        objectReference.setFieldPath(fieldPath);
        assertEquals(fieldPath, objectReference.getFieldPath());
    }

    //BaseRock generated method id: ${testKind}, hash: 65F8025ABED01D981ABECC838EE8E699
    @Test
    void testKind() {
        V1ObjectReference objectReference = new V1ObjectReference();
        String kind = "Pod";
        objectReference.setKind(kind);
        assertEquals(kind, objectReference.getKind());
    }

    //BaseRock generated method id: ${testName}, hash: B3386A698526912E67770C74FB689267
    @Test
    void testName() {
        V1ObjectReference objectReference = new V1ObjectReference();
        String name = "my-pod";
        objectReference.setName(name);
        assertEquals(name, objectReference.getName());
    }

    //BaseRock generated method id: ${testNamespace}, hash: 2F8D8278901FDA451B13FD70AF213CC8
    @Test
    void testNamespace() {
        V1ObjectReference objectReference = new V1ObjectReference();
        String namespace = "default";
        objectReference.setNamespace(namespace);
        assertEquals(namespace, objectReference.getNamespace());
    }

    //BaseRock generated method id: ${testResourceVersion}, hash: 4E0A4E183D8A0818725EE0C634D28B7E
    @Test
    void testResourceVersion() {
        V1ObjectReference objectReference = new V1ObjectReference();
        String resourceVersion = "123456";
        objectReference.setResourceVersion(resourceVersion);
        assertEquals(resourceVersion, objectReference.getResourceVersion());
    }

    //BaseRock generated method id: ${testUid}, hash: 63C362EC5F12254F373314A88A033219
    @Test
    void testUid() {
        V1ObjectReference objectReference = new V1ObjectReference();
        String uid = "a1b2c3d4-e5f6-7890-a1b2-c3d4e5f67890";
        objectReference.setUid(uid);
        assertEquals(uid, objectReference.getUid());
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 042A7D706AAEC0E0F76A57786D27AF16
    @Test
    void testEqualsAndHashCode() {
        V1ObjectReference ref1 = new V1ObjectReference().apiVersion("v1").fieldPath("spec.containers[0]").kind("Pod").name("pod-1").namespace("default").resourceVersion("123456").uid("a1b2c3d4-e5f6-7890-a1b2-c3d4e5f67890");
        V1ObjectReference ref2 = new V1ObjectReference().apiVersion("v1").fieldPath("spec.containers[0]").kind("Pod").name("pod-1").namespace("default").resourceVersion("123456").uid("a1b2c3d4-e5f6-7890-a1b2-c3d4e5f67890");
        assertThat(ref1, is(equalTo(ref2)));
        assertThat(ref1.hashCode(), is(equalTo(ref2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 863A3E690B75EECF32444919CE1399D2
    @Test
    void testToString() {
        V1ObjectReference objectReference = new V1ObjectReference().apiVersion("v1").fieldPath("spec.containers[0]").kind("Pod").name("pod-1").namespace("default").resourceVersion("123456").uid("a1b2c3d4-e5f6-7890-a1b2-c3d4e5f67890");
        String toString = objectReference.toString();
        assertThat(toString, is(notNullValue()));
        assertThat(toString.contains("apiVersion"), is(true));
        assertThat(toString.contains("fieldPath"), is(true));
        assertThat(toString.contains("kind"), is(true));
        assertThat(toString.contains("name"), is(true));
        assertThat(toString.contains("namespace"), is(true));
        assertThat(toString.contains("resourceVersion"), is(true));
        assertThat(toString.contains("uid"), is(true));
    }
}
