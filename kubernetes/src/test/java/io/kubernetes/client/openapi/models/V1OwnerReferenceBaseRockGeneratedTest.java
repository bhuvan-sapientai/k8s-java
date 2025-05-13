package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1OwnerReferenceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 3025146802CE483E0B154D40E5E457FA
    @Test
    void testConstructor() {
        V1OwnerReference ownerReference = new V1OwnerReference();
        assertNotNull(ownerReference);
    }

    //BaseRock generated method id: ${testApiVersion}, hash: 17D86C65A7CF60146699BEEDE9E9EDD1
    @Test
    void testApiVersion() {
        V1OwnerReference ownerReference = new V1OwnerReference().apiVersion("v1");
        assertEquals("v1", ownerReference.getApiVersion());
    }

    //BaseRock generated method id: ${testBlockOwnerDeletion}, hash: 39087B25EF8E8C5627E598620EC87D4E
    @Test
    void testBlockOwnerDeletion() {
        V1OwnerReference ownerReference = new V1OwnerReference().blockOwnerDeletion(true);
        assertTrue(ownerReference.getBlockOwnerDeletion());
        ownerReference.setBlockOwnerDeletion(false);
        assertFalse(ownerReference.getBlockOwnerDeletion());
    }

    //BaseRock generated method id: ${testController}, hash: 81DA401D8086CFDCBBE37B390E8D7C02
    @Test
    void testController() {
        V1OwnerReference ownerReference = new V1OwnerReference().controller(true);
        assertTrue(ownerReference.getController());
        ownerReference.setController(false);
        assertFalse(ownerReference.getController());
    }

    //BaseRock generated method id: ${testKind}, hash: 4D82586F0FC85E0C4EFD929CB323487B
    @Test
    void testKind() {
        V1OwnerReference ownerReference = new V1OwnerReference().kind("Pod");
        assertEquals("Pod", ownerReference.getKind());
    }

    //BaseRock generated method id: ${testName}, hash: E5AC75C79A81244010DBECD43C919E5F
    @Test
    void testName() {
        V1OwnerReference ownerReference = new V1OwnerReference().name("test-pod");
        assertEquals("test-pod", ownerReference.getName());
    }

    //BaseRock generated method id: ${testUid}, hash: 2D2F8C169D71EE8ACB509913B2A4E4E9
    @Test
    void testUid() {
        V1OwnerReference ownerReference = new V1OwnerReference().uid("123e4567-e89b-12d3-a456-426614174000");
        assertEquals("123e4567-e89b-12d3-a456-426614174000", ownerReference.getUid());
    }

    //BaseRock generated method id: ${testEquals}, hash: 3BCBDE4D84CCAE17007FAD4E4251DAC8
    @Test
    void testEquals() {
        V1OwnerReference ref1 = new V1OwnerReference().apiVersion("v1").kind("Pod").name("test-pod").uid("123e4567-e89b-12d3-a456-426614174000").blockOwnerDeletion(true).controller(true);
        V1OwnerReference ref2 = new V1OwnerReference().apiVersion("v1").kind("Pod").name("test-pod").uid("123e4567-e89b-12d3-a456-426614174000").blockOwnerDeletion(true).controller(true);
        assertTrue(ref1.equals(ref2));
        assertTrue(ref2.equals(ref1));
    }

    //BaseRock generated method id: ${testHashCode}, hash: B4579B4BBCA14DC9B43688B55111E573
    @Test
    void testHashCode() {
        V1OwnerReference ref1 = new V1OwnerReference().apiVersion("v1").kind("Pod").name("test-pod").uid("123e4567-e89b-12d3-a456-426614174000").blockOwnerDeletion(true).controller(true);
        V1OwnerReference ref2 = new V1OwnerReference().apiVersion("v1").kind("Pod").name("test-pod").uid("123e4567-e89b-12d3-a456-426614174000").blockOwnerDeletion(true).controller(true);
        assertEquals(ref1.hashCode(), ref2.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: F50712874B7440D599EE41C32DAF0143
    @Test
    void testToString() {
        V1OwnerReference ownerReference = new V1OwnerReference().apiVersion("v1").kind("Pod").name("test-pod").uid("123e4567-e89b-12d3-a456-426614174000").blockOwnerDeletion(true).controller(true);
        String expected = "class V1OwnerReference {\n" + "    apiVersion: v1\n" + "    blockOwnerDeletion: true\n" + "    controller: true\n" + "    kind: Pod\n" + "    name: test-pod\n" + "    uid: 123e4567-e89b-12d3-a456-426614174000\n" + "}";
        assertEquals(expected, ownerReference.toString());
    }

    //BaseRock generated method id: ${testDifferentApiVersions}, hash: EBD60CFB9802FE6E806227156EBD238D
    @ParameterizedTest
    @ValueSource(strings = { "v1", "v2", "apps/v1" })
    void testDifferentApiVersions(String apiVersion) {
        V1OwnerReference ownerReference = new V1OwnerReference().apiVersion(apiVersion);
        assertEquals(apiVersion, ownerReference.getApiVersion());
    }

    //BaseRock generated method id: ${testDifferentKinds}, hash: 5A758F14F61AF179221DDA2E94C22A8B
    @ParameterizedTest
    @ValueSource(strings = { "Pod", "Deployment", "Service" })
    void testDifferentKinds(String kind) {
        V1OwnerReference ownerReference = new V1OwnerReference().kind(kind);
        assertEquals(kind, ownerReference.getKind());
    }

    //BaseRock generated method id: ${testNullValues}, hash: 64FB775F4C0BA9CF97D48F1EB7A0DBD3
    @Test
    void testNullValues() {
        V1OwnerReference ownerReference = new V1OwnerReference();
        assertThat(ownerReference.getApiVersion(), is(equalTo(null)));
        assertThat(ownerReference.getBlockOwnerDeletion(), is(equalTo(null)));
        assertThat(ownerReference.getController(), is(equalTo(null)));
        assertThat(ownerReference.getKind(), is(equalTo(null)));
        assertThat(ownerReference.getName(), is(equalTo(null)));
        assertThat(ownerReference.getUid(), is(equalTo(null)));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 2798407151BB90A7DE2107A42036825B
    @Test
    void testBuilderPattern() {
        V1OwnerReference ownerReference = new V1OwnerReference().apiVersion("v1").kind("Pod").name("test-pod").uid("123e4567-e89b-12d3-a456-426614174000").blockOwnerDeletion(true).controller(true);
        assertThat(ownerReference, is(notNullValue()));
        assertThat(ownerReference.getApiVersion(), is(equalTo("v1")));
        assertThat(ownerReference.getKind(), is(equalTo("Pod")));
        assertThat(ownerReference.getName(), is(equalTo("test-pod")));
        assertThat(ownerReference.getUid(), is(equalTo("123e4567-e89b-12d3-a456-426614174000")));
        assertThat(ownerReference.getBlockOwnerDeletion(), is(equalTo(true)));
        assertThat(ownerReference.getController(), is(equalTo(true)));
    }
}
