package io.kubernetes.client.openapi.models;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.params.provider.ValueSource;
import java.io.IOException;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1beta1ResourceClaimConsumerReferenceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructorAndGetters}, hash: 8A13EB53F7F3B688B87E36D43E5C76C3
    @Test
    void testConstructorAndGetters() {
        V1beta1ResourceClaimConsumerReference reference = new V1beta1ResourceClaimConsumerReference().apiGroup("test-api-group").name("test-name").resource("test-resource").uid("test-uid");
        assertAll(() -> assertEquals("test-api-group", reference.getApiGroup()), () -> assertEquals("test-name", reference.getName()), () -> assertEquals("test-resource", reference.getResource()), () -> assertEquals("test-uid", reference.getUid()));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 457A0BEB3FC2EA04FCEC49A517DAE135
    @Test
    void testBuilderPattern() {
        V1beta1ResourceClaimConsumerReference reference = new V1beta1ResourceClaimConsumerReference().apiGroup("test-api-group").name("test-name").resource("test-resource").uid("test-uid");
        assertAll(() -> assertEquals("test-api-group", reference.getApiGroup()), () -> assertEquals("test-name", reference.getName()), () -> assertEquals("test-resource", reference.getResource()), () -> assertEquals("test-uid", reference.getUid()));
    }

    //BaseRock generated method id: ${testSetApiGroup}, hash: D8656D8E466AC593C4F7C266AF76FFBD
    @ParameterizedTest
    @ValueSource(strings = { "group1", "group2", "" })
    void testSetApiGroup(String apiGroup) {
        V1beta1ResourceClaimConsumerReference reference = new V1beta1ResourceClaimConsumerReference().apiGroup(apiGroup);
        assertEquals(apiGroup, reference.getApiGroup());
    }

    //BaseRock generated method id: ${testSetApiGroupNull}, hash: 5B7091A3C06C6C89FC08C5BCD03B6F1A
    @Test
    void testSetApiGroupNull() {
        V1beta1ResourceClaimConsumerReference reference = new V1beta1ResourceClaimConsumerReference().apiGroup(null);
        assertThat(reference.getApiGroup(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetName}, hash: 641B954D488232189974DEC8DF91E7AD
    @ParameterizedTest
    @ValueSource(strings = { "name1", "name2" })
    void testSetName(String name) {
        V1beta1ResourceClaimConsumerReference reference = new V1beta1ResourceClaimConsumerReference().name(name);
        assertEquals(name, reference.getName());
    }

    //BaseRock generated method id: ${testSetNameNull}, hash: D090F618C1AFEEA7345386E488DFF9FE
    @Test
    void testSetNameNull() {
        V1beta1ResourceClaimConsumerReference reference = new V1beta1ResourceClaimConsumerReference();
        reference.name(null);
        assertThat(reference.getName(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetResource}, hash: FB0427C914F6548CD74623FB760AD10F
    @ParameterizedTest
    @ValueSource(strings = { "resource1", "resource2" })
    void testSetResource(String resource) {
        V1beta1ResourceClaimConsumerReference reference = new V1beta1ResourceClaimConsumerReference().resource(resource);
        assertEquals(resource, reference.getResource());
    }

    //BaseRock generated method id: ${testSetResourceNull}, hash: 6D672C1B9F7C630ECD1275D1FB0499B2
    @Test
    void testSetResourceNull() {
        V1beta1ResourceClaimConsumerReference reference = new V1beta1ResourceClaimConsumerReference();
        reference.resource(null);
        assertThat(reference.getResource(), is(nullValue()));
    }

    //BaseRock generated method id: ${testSetUid}, hash: 60518A63B64FBFA019DB6EF795451EA3
    @ParameterizedTest
    @ValueSource(strings = { "uid1", "uid2" })
    void testSetUid(String uid) {
        V1beta1ResourceClaimConsumerReference reference = new V1beta1ResourceClaimConsumerReference().uid(uid);
        assertEquals(uid, reference.getUid());
    }

    //BaseRock generated method id: ${testSetUidNull}, hash: 53884069A5944850F2483E98B54E7B27
    @Test
    void testSetUidNull() {
        V1beta1ResourceClaimConsumerReference reference = new V1beta1ResourceClaimConsumerReference();
        reference.uid(null);
        assertThat(reference.getUid(), is(nullValue()));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 27C12967C5300533FC3BBB8AEDAB9B10
    @Test
    void testEqualsAndHashCode() {
        V1beta1ResourceClaimConsumerReference reference1 = new V1beta1ResourceClaimConsumerReference().apiGroup("group").name("name").resource("resource").uid("uid");
        V1beta1ResourceClaimConsumerReference reference2 = new V1beta1ResourceClaimConsumerReference().apiGroup("group").name("name").resource("resource").uid("uid");
        V1beta1ResourceClaimConsumerReference reference3 = new V1beta1ResourceClaimConsumerReference().apiGroup("different").name("different").resource("different").uid("different");
        assertAll(() -> assertEquals(reference1, reference2), () -> assertEquals(reference1.hashCode(), reference2.hashCode()), () -> assertNotEquals(reference1, reference3), () -> assertNotEquals(reference1.hashCode(), reference3.hashCode()));
    }

    //BaseRock generated method id: ${testToString}, hash: F6C99C94D304CEB50A6112986557AFDD
    @Test
    void testToString() {
        V1beta1ResourceClaimConsumerReference reference = new V1beta1ResourceClaimConsumerReference().apiGroup("test-api-group").name("test-name").resource("test-resource").uid("test-uid");
        String expectedString = "class V1beta1ResourceClaimConsumerReference {\n" + "    apiGroup: test-api-group\n" + "    name: test-name\n" + "    resource: test-resource\n" + "    uid: test-uid\n" + "}";
        assertEquals(expectedString, reference.toString());
    }

    //BaseRock generated method id: ${testToJsonAndFromJson}, hash: 824E6F5E1C1C9D47889F31032154DD28
    @Test
    void testToJsonAndFromJson() throws IOException {
        V1beta1ResourceClaimConsumerReference reference = new V1beta1ResourceClaimConsumerReference().apiGroup("test-api-group").name("test-name").resource("test-resource").uid("test-uid");
        String json = reference.toJson();
        V1beta1ResourceClaimConsumerReference fromJson = V1beta1ResourceClaimConsumerReference.fromJson(json);
        assertEquals(reference, fromJson);
    }
}
