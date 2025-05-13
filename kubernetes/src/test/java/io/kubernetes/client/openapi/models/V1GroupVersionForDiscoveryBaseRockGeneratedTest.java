package io.kubernetes.client.openapi.models;

import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1GroupVersionForDiscoveryBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: 2E65A038B1AFEA4BE9C24DA9F6AD8521
    @Test
    void testConstructor() {
        V1GroupVersionForDiscovery groupVersion = new V1GroupVersionForDiscovery();
        assertThat(groupVersion, is(notNullValue()));
    }

    //BaseRock generated method id: ${testGetterAndSetter}, hash: 309425B03DF8FB2A949FC2D54EF15524
    @Test
    void testGetterAndSetter() {
        V1GroupVersionForDiscovery groupVersion = new V1GroupVersionForDiscovery();
        groupVersion.setGroupVersion("apps/v1");
        groupVersion.setVersion("v1");
        assertThat(groupVersion.getGroupVersion(), is(equalTo("apps/v1")));
        assertThat(groupVersion.getVersion(), is(equalTo("v1")));
    }

    //BaseRock generated method id: ${testSetGroupVersion}, hash: 637C6EF80A8677820424ED3B42FE221C
    @ParameterizedTest
    @ValueSource(strings = { "apps/v1", "networking.k8s.io/v1", "batch/v1beta1" })
    void testSetGroupVersion(String groupVersionValue) {
        V1GroupVersionForDiscovery groupVersion = new V1GroupVersionForDiscovery();
        groupVersion.setGroupVersion(groupVersionValue);
        assertThat(groupVersion.getGroupVersion(), is(equalTo(groupVersionValue)));
    }

    //BaseRock generated method id: ${testSetVersion}, hash: 723C517FEFFA4DC53F46804B3C7B44D0
    @ParameterizedTest
    @ValueSource(strings = { "v1", "v2", "v1beta1" })
    void testSetVersion(String versionValue) {
        V1GroupVersionForDiscovery groupVersion = new V1GroupVersionForDiscovery();
        groupVersion.setVersion(versionValue);
        assertThat(groupVersion.getVersion(), is(equalTo(versionValue)));
    }

    //BaseRock generated method id: ${testSetGroupVersionWithNullAndEmpty}, hash: B9645B3DF75B327D45D8419A65049F67
    @ParameterizedTest
    @NullAndEmptySource
    void testSetGroupVersionWithNullAndEmpty(String groupVersionValue) {
        V1GroupVersionForDiscovery groupVersion = new V1GroupVersionForDiscovery();
        groupVersion.setGroupVersion(groupVersionValue);
        assertThat(groupVersion.getGroupVersion(), is(equalTo(groupVersionValue)));
    }

    //BaseRock generated method id: ${testSetVersionWithNullAndEmpty}, hash: 5261C0A5D76763B4C0E76AB411E239E6
    @ParameterizedTest
    @NullAndEmptySource
    void testSetVersionWithNullAndEmpty(String versionValue) {
        V1GroupVersionForDiscovery groupVersion = new V1GroupVersionForDiscovery();
        groupVersion.setVersion(versionValue);
        assertThat(groupVersion.getVersion(), is(equalTo(versionValue)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 4E0B96CD859E257A0FEA2104425034BE
    @Test
    void testEqualsAndHashCode() {
        V1GroupVersionForDiscovery groupVersion1 = new V1GroupVersionForDiscovery().groupVersion("apps/v1").version("v1");
        V1GroupVersionForDiscovery groupVersion2 = new V1GroupVersionForDiscovery().groupVersion("apps/v1").version("v1");
        V1GroupVersionForDiscovery groupVersion3 = new V1GroupVersionForDiscovery().groupVersion("networking.k8s.io/v1").version("v1");
        assertThat(groupVersion1.equals(groupVersion2), is(true));
        assertThat(groupVersion1.equals(groupVersion3), is(false));
        assertThat(groupVersion1.hashCode(), is(equalTo(groupVersion2.hashCode())));
        assertThat(groupVersion1.hashCode(), is(not(equalTo(groupVersion3.hashCode()))));
    }

    //BaseRock generated method id: ${testToString}, hash: 3D351B3F5434DF70693E716487ADD52D
    @Test
    void testToString() {
        V1GroupVersionForDiscovery groupVersion = new V1GroupVersionForDiscovery().groupVersion("apps/v1").version("v1");
        String expectedString = "class V1GroupVersionForDiscovery {\n    groupVersion: apps/v1\n    version: v1\n}";
        assertThat(groupVersion.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 4BD790B65A319035342C1D2BA26239A3
    @Test
    void testBuilder() {
        V1GroupVersionForDiscovery groupVersion = new V1GroupVersionForDiscovery().groupVersion("apps/v1").version("v1");
        assertThat(groupVersion.getGroupVersion(), is(equalTo("apps/v1")));
        assertThat(groupVersion.getVersion(), is(equalTo("v1")));
    }
}
