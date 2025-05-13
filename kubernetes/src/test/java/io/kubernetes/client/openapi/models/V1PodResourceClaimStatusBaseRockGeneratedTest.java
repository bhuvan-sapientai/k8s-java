package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1PodResourceClaimStatusBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 241CFD3D5BBECD180469BDADAB192B0B
    @Test
    void testConstructor() {
        V1PodResourceClaimStatus status = new V1PodResourceClaimStatus();
        assertNotNull(status);
    }

    //BaseRock generated method id: ${testNameSetter}, hash: C47CF98398D5BA54D74BB53E1A290E91
    @Test
    void testNameSetter() {
        V1PodResourceClaimStatus status = new V1PodResourceClaimStatus();
        status.setName("test-name");
        assertEquals("test-name", status.getName());
    }

    //BaseRock generated method id: ${testNameSetterWithMultipleValues}, hash: C66814D5D1251F6E4229132D47C6C1DB
    @ParameterizedTest
    @ValueSource(strings = { "name1", "name2", "name3" })
    void testNameSetterWithMultipleValues(String name) {
        V1PodResourceClaimStatus status = new V1PodResourceClaimStatus();
        status.setName(name);
        assertEquals(name, status.getName());
    }

    //BaseRock generated method id: ${testResourceClaimNameSetter}, hash: 9116292D013EC30D9FDCAC39E6495AE3
    @Test
    void testResourceClaimNameSetter() {
        V1PodResourceClaimStatus status = new V1PodResourceClaimStatus();
        status.setResourceClaimName("test-resource-claim");
        assertEquals("test-resource-claim", status.getResourceClaimName());
    }

    //BaseRock generated method id: ${testResourceClaimNameSetterWithMultipleValues}, hash: A557F65B7FD49C89C7E534B8A5E42619
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "claim1", "claim2" })
    void testResourceClaimNameSetterWithMultipleValues(String claimName) {
        V1PodResourceClaimStatus status = new V1PodResourceClaimStatus();
        status.setResourceClaimName(claimName);
        assertEquals(claimName, status.getResourceClaimName());
    }

    //BaseRock generated method id: ${testEqualsWithEqualObjects}, hash: B709337E42E058C1E8D0A30F405AAB13
    @Test
    void testEqualsWithEqualObjects() {
        V1PodResourceClaimStatus status1 = new V1PodResourceClaimStatus().name("test-name").resourceClaimName("test-claim");
        V1PodResourceClaimStatus status2 = new V1PodResourceClaimStatus().name("test-name").resourceClaimName("test-claim");
        assertTrue(status1.equals(status2));
        assertTrue(status2.equals(status1));
    }

    //BaseRock generated method id: ${testEqualsWithDifferentObjects}, hash: 8819B02FB7678F8C80C94770A0AECFC7
    @Test
    void testEqualsWithDifferentObjects() {
        V1PodResourceClaimStatus status1 = new V1PodResourceClaimStatus().name("test-name-1").resourceClaimName("test-claim-1");
        V1PodResourceClaimStatus status2 = new V1PodResourceClaimStatus().name("test-name-2").resourceClaimName("test-claim-2");
        assertFalse(status1.equals(status2));
        assertFalse(status2.equals(status1));
    }

    //BaseRock generated method id: ${testHashCodeConsistency}, hash: 56C6255976A206BABEA90021B7886C5E
    @Test
    void testHashCodeConsistency() {
        V1PodResourceClaimStatus status = new V1PodResourceClaimStatus().name("test-name").resourceClaimName("test-claim");
        int initialHashCode = status.hashCode();
        assertEquals(initialHashCode, status.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: 1E5628A11EF5053B53F6FE36EFD9E463
    @Test
    void testToString() {
        V1PodResourceClaimStatus status = new V1PodResourceClaimStatus().name("test-name").resourceClaimName("test-claim");
        String toString = status.toString();
        assertTrue(toString.contains("test-name"));
        assertTrue(toString.contains("test-claim"));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: CFD9A1BA313DEA6DF841530C532F4747
    @Test
    void testBuilderPattern() {
        V1PodResourceClaimStatus status = new V1PodResourceClaimStatus().name("test-name").resourceClaimName("test-claim");
        assertEquals("test-name", status.getName());
        assertEquals("test-claim", status.getResourceClaimName());
    }
}
