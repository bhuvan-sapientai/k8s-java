package io.kubernetes.client.openapi.models;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1alpha1ServerStorageVersionBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 9204BC79DD4DB9D5B7C3EF3262C7916C
    @Test
    void testConstructor() {
        V1alpha1ServerStorageVersion serverStorageVersion = new V1alpha1ServerStorageVersion();
        assertThat(serverStorageVersion, is(notNullValue()));
    }

    //BaseRock generated method id: ${testApiServerID}, hash: A6ECD26711AA4546E7008E44D17AE85D
    @Test
    void testApiServerID() {
        V1alpha1ServerStorageVersion serverStorageVersion = new V1alpha1ServerStorageVersion();
        String apiServerID = "test-api-server-id";
        serverStorageVersion.setApiServerID(apiServerID);
        assertEquals(apiServerID, serverStorageVersion.getApiServerID());
    }

    //BaseRock generated method id: ${testDecodableVersions}, hash: BDDB5FF6E599D8028598220DFAE46C90
    @Test
    void testDecodableVersions() {
        V1alpha1ServerStorageVersion serverStorageVersion = new V1alpha1ServerStorageVersion();
        List<String> decodableVersions = Arrays.asList("v1", "v2", "v3");
        serverStorageVersion.setDecodableVersions(decodableVersions);
        assertEquals(decodableVersions, serverStorageVersion.getDecodableVersions());
    }

    //BaseRock generated method id: ${testAddDecodableVersionsItem}, hash: 17EFF0A0E22A14787CE92392A4D99BCD
    @Test
    void testAddDecodableVersionsItem() {
        V1alpha1ServerStorageVersion serverStorageVersion = new V1alpha1ServerStorageVersion();
        String version = "v1";
        serverStorageVersion.addDecodableVersionsItem(version);
        assertThat(serverStorageVersion.getDecodableVersions(), hasSize(1));
        assertThat(serverStorageVersion.getDecodableVersions(), containsInAnyOrder(version));
    }

    //BaseRock generated method id: ${testEncodingVersion}, hash: E2E6E4A8D13EB7AB17929E1DFD5C74E3
    @Test
    void testEncodingVersion() {
        V1alpha1ServerStorageVersion serverStorageVersion = new V1alpha1ServerStorageVersion();
        String encodingVersion = "v2";
        serverStorageVersion.setEncodingVersion(encodingVersion);
        assertEquals(encodingVersion, serverStorageVersion.getEncodingVersion());
    }

    //BaseRock generated method id: ${testServedVersions}, hash: 775C30B5F2EF09E80581F7127F6E9460
    @Test
    void testServedVersions() {
        V1alpha1ServerStorageVersion serverStorageVersion = new V1alpha1ServerStorageVersion();
        List<String> servedVersions = Arrays.asList("v1", "v2");
        serverStorageVersion.setServedVersions(servedVersions);
        assertEquals(servedVersions, serverStorageVersion.getServedVersions());
    }

    //BaseRock generated method id: ${testAddServedVersionsItem}, hash: 96AA0A5AF4A87C438FE759C69999FDA4
    @Test
    void testAddServedVersionsItem() {
        V1alpha1ServerStorageVersion serverStorageVersion = new V1alpha1ServerStorageVersion();
        String version = "v1";
        serverStorageVersion.addServedVersionsItem(version);
        assertThat(serverStorageVersion.getServedVersions(), hasSize(1));
        assertThat(serverStorageVersion.getServedVersions(), containsInAnyOrder(version));
    }

    //BaseRock generated method id: ${testEquals}, hash: AC7EF8A0C20BE300F9A2D9AFA5AFFF98
    @Test
    void testEquals() {
        V1alpha1ServerStorageVersion version1 = new V1alpha1ServerStorageVersion().apiServerID("server1").decodableVersions(Arrays.asList("v1", "v2")).encodingVersion("v2").servedVersions(Arrays.asList("v1", "v2"));
        V1alpha1ServerStorageVersion version2 = new V1alpha1ServerStorageVersion().apiServerID("server1").decodableVersions(Arrays.asList("v1", "v2")).encodingVersion("v2").servedVersions(Arrays.asList("v1", "v2"));
        assertTrue(version1.equals(version2));
        assertTrue(version2.equals(version1));
    }

    //BaseRock generated method id: ${testNotEquals}, hash: B851B4E1F8F8C456E9BE65F45D1E8E6C
    @Test
    void testNotEquals() {
        V1alpha1ServerStorageVersion version1 = new V1alpha1ServerStorageVersion().apiServerID("server1").decodableVersions(Arrays.asList("v1", "v2")).encodingVersion("v2").servedVersions(Arrays.asList("v1", "v2"));
        V1alpha1ServerStorageVersion version2 = new V1alpha1ServerStorageVersion().apiServerID("server2").decodableVersions(Arrays.asList("v1", "v2")).encodingVersion("v2").servedVersions(Arrays.asList("v1", "v2"));
        assertFalse(version1.equals(version2));
        assertFalse(version2.equals(version1));
    }

    //BaseRock generated method id: ${testHashCode}, hash: FDF83EB5FCB012BC38C84EC03B2908D1
    @Test
    void testHashCode() {
        V1alpha1ServerStorageVersion version1 = new V1alpha1ServerStorageVersion().apiServerID("server1").decodableVersions(Arrays.asList("v1", "v2")).encodingVersion("v2").servedVersions(Arrays.asList("v1", "v2"));
        V1alpha1ServerStorageVersion version2 = new V1alpha1ServerStorageVersion().apiServerID("server1").decodableVersions(Arrays.asList("v1", "v2")).encodingVersion("v2").servedVersions(Arrays.asList("v1", "v2"));
        assertEquals(version1.hashCode(), version2.hashCode());
        V1alpha1ServerStorageVersion version3 = new V1alpha1ServerStorageVersion().apiServerID("server2").decodableVersions(Arrays.asList("v1", "v2")).encodingVersion("v2").servedVersions(Arrays.asList("v1", "v2"));
        assertNotEquals(version1.hashCode(), version3.hashCode());
    }

    //BaseRock generated method id: ${testToString}, hash: F9CEA0924BEC2AE0DB270773934D556A
    @Test
    void testToString() {
        V1alpha1ServerStorageVersion serverStorageVersion = new V1alpha1ServerStorageVersion().apiServerID("test-server").decodableVersions(Arrays.asList("v1", "v2")).encodingVersion("v2").servedVersions(Arrays.asList("v1", "v2"));
        String expectedString = "class V1alpha1ServerStorageVersion {\n" + "    apiServerID: test-server\n" + "    decodableVersions: [v1, v2]\n" + "    encodingVersion: v2\n" + "    servedVersions: [v1, v2]\n" + "}";
        assertEquals(expectedString, serverStorageVersion.toString());
    }

    //BaseRock generated method id: ${testParameterizedDecodableVersions}, hash: F1630666FF487B8D1DC946F77A719254
    @ParameterizedTest
    @ValueSource(strings = { "v1", "v2", "v3" })
    void testParameterizedDecodableVersions(String version) {
        V1alpha1ServerStorageVersion serverStorageVersion = new V1alpha1ServerStorageVersion();
        serverStorageVersion.addDecodableVersionsItem(version);
        assertTrue(serverStorageVersion.getDecodableVersions().contains(version));
    }

    //BaseRock generated method id: ${testParameterizedServedVersions}, hash: AC6E8F5393251788E5EEA0E40BEF824D
    @ParameterizedTest
    @ValueSource(strings = { "v1", "v2", "v3" })
    void testParameterizedServedVersions(String version) {
        V1alpha1ServerStorageVersion serverStorageVersion = new V1alpha1ServerStorageVersion();
        serverStorageVersion.addServedVersionsItem(version);
        assertTrue(serverStorageVersion.getServedVersions().contains(version));
    }

    //BaseRock generated method id: ${testBuilderPattern}, hash: 318EA6421463E531AB5014DBE62974BD
    @Test
    void testBuilderPattern() {
        V1alpha1ServerStorageVersion serverStorageVersion = new V1alpha1ServerStorageVersion().apiServerID("test-server").decodableVersions(Arrays.asList("v1", "v2")).encodingVersion("v2").servedVersions(Arrays.asList("v1", "v2"));
        assertThat(serverStorageVersion.getApiServerID(), is(equalTo("test-server")));
        assertThat(serverStorageVersion.getDecodableVersions(), containsInAnyOrder("v1", "v2"));
        assertThat(serverStorageVersion.getEncodingVersion(), is(equalTo("v2")));
        assertThat(serverStorageVersion.getServedVersions(), containsInAnyOrder("v1", "v2"));
    }

    //BaseRock generated method id: ${testNullValues}, hash: F94531D366B6225C0AF13763E5567993
    @Test
    void testNullValues() {
        V1alpha1ServerStorageVersion serverStorageVersion = new V1alpha1ServerStorageVersion();
        assertThat(serverStorageVersion.getApiServerID(), is(equalTo(null)));
        assertThat(serverStorageVersion.getDecodableVersions(), is(equalTo(new ArrayList<>())));
        assertThat(serverStorageVersion.getEncodingVersion(), is(equalTo(null)));
        assertThat(serverStorageVersion.getServedVersions(), is(equalTo(new ArrayList<>())));
    }
}
