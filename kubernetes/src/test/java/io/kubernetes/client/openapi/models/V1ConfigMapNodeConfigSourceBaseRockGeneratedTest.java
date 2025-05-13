package io.kubernetes.client.openapi.models;

import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.endsWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(10)
class V1ConfigMapNodeConfigSourceBaseRockGeneratedTest {

    //BaseRock generated method id: ${testConstructor}, hash: BB022EBA3863064D0301D98494092A8C
    @Test
    void testConstructor() {
        V1ConfigMapNodeConfigSource configSource = new V1ConfigMapNodeConfigSource();
        assertThat(configSource, is(notNullValue()));
    }

    //BaseRock generated method id: ${testKubeletConfigKey}, hash: 84E0C352B456A7415474E0704F8AF02A
    @Test
    void testKubeletConfigKey() {
        V1ConfigMapNodeConfigSource configSource = new V1ConfigMapNodeConfigSource();
        String kubeletConfigKey = "test-key";
        configSource.setKubeletConfigKey(kubeletConfigKey);
        assertThat(configSource.getKubeletConfigKey(), is(equalTo(kubeletConfigKey)));
    }

    //BaseRock generated method id: ${testName}, hash: CB1F34BC748FC8DF48D1EB78115EEB39
    @Test
    void testName() {
        V1ConfigMapNodeConfigSource configSource = new V1ConfigMapNodeConfigSource();
        String name = "test-name";
        configSource.setName(name);
        assertThat(configSource.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testNamespace}, hash: EA43BC146202B5BB6989BCE4D1FB938E
    @Test
    void testNamespace() {
        V1ConfigMapNodeConfigSource configSource = new V1ConfigMapNodeConfigSource();
        String namespace = "test-namespace";
        configSource.setNamespace(namespace);
        assertThat(configSource.getNamespace(), is(equalTo(namespace)));
    }

    //BaseRock generated method id: ${testResourceVersion}, hash: 775690E69E5C54404ECF0F28D0C5C3E4
    @Test
    void testResourceVersion() {
        V1ConfigMapNodeConfigSource configSource = new V1ConfigMapNodeConfigSource();
        String resourceVersion = "test-resource-version";
        configSource.setResourceVersion(resourceVersion);
        assertThat(configSource.getResourceVersion(), is(equalTo(resourceVersion)));
    }

    //BaseRock generated method id: ${testUid}, hash: 7D467A5C7000E613B523E54692AC7AB7
    @Test
    void testUid() {
        V1ConfigMapNodeConfigSource configSource = new V1ConfigMapNodeConfigSource();
        String uid = "test-uid";
        configSource.setUid(uid);
        assertThat(configSource.getUid(), is(equalTo(uid)));
    }

    //BaseRock generated method id: ${testEqualsAndHashCode}, hash: 1DCA7A402CC74EBFE9A7F427E442321B
    @Test
    void testEqualsAndHashCode() {
        V1ConfigMapNodeConfigSource configSource1 = new V1ConfigMapNodeConfigSource().kubeletConfigKey("key1").name("name1").namespace("namespace1").resourceVersion("rv1").uid("uid1");
        V1ConfigMapNodeConfigSource configSource2 = new V1ConfigMapNodeConfigSource().kubeletConfigKey("key1").name("name1").namespace("namespace1").resourceVersion("rv1").uid("uid1");
        assertThat(configSource1, is(equalTo(configSource2)));
        assertThat(configSource1.hashCode(), is(equalTo(configSource2.hashCode())));
    }

    //BaseRock generated method id: ${testToString}, hash: 08F36F234763EBEAD0EF749D645487D6
    @Test
    void testToString() {
        V1ConfigMapNodeConfigSource configSource = new V1ConfigMapNodeConfigSource().kubeletConfigKey("key1").name("name1").namespace("namespace1").resourceVersion("rv1").uid("uid1");
        String expectedString = "class V1ConfigMapNodeConfigSource {\n" + "    kubeletConfigKey: key1\n" + "    name: name1\n" + "    namespace: namespace1\n" + "    resourceVersion: rv1\n" + "    uid: uid1\n" + "}";
        assertThat(configSource.toString(), is(equalTo(expectedString)));
    }

    //BaseRock generated method id: ${testKubeletConfigKeyWithDifferentValues}, hash: 14E85E88772640C1A17B400E07ECBFD0
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "key", "test-key" })
    void testKubeletConfigKeyWithDifferentValues(String key) {
        V1ConfigMapNodeConfigSource configSource = new V1ConfigMapNodeConfigSource();
        configSource.setKubeletConfigKey(key);
        assertThat(configSource.getKubeletConfigKey(), is(equalTo(key)));
    }

    //BaseRock generated method id: ${testNameWithDifferentValues}, hash: 97B6B21EAC67130787DA45C7C33EF6FC
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "name", "test-name" })
    void testNameWithDifferentValues(String name) {
        V1ConfigMapNodeConfigSource configSource = new V1ConfigMapNodeConfigSource();
        configSource.setName(name);
        assertThat(configSource.getName(), is(equalTo(name)));
    }

    //BaseRock generated method id: ${testNamespaceWithDifferentValues}, hash: B7C5AB873FDF686776EFFDC665369EA7
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "namespace", "test-namespace" })
    void testNamespaceWithDifferentValues(String namespace) {
        V1ConfigMapNodeConfigSource configSource = new V1ConfigMapNodeConfigSource();
        configSource.setNamespace(namespace);
        assertThat(configSource.getNamespace(), is(equalTo(namespace)));
    }

    //BaseRock generated method id: ${testResourceVersionWithDifferentValues}, hash: C8E519C5C615534F9984DA5225B3EDFD
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "resourceVersion", "test-resourceVersion" })
    void testResourceVersionWithDifferentValues(String resourceVersion) {
        V1ConfigMapNodeConfigSource configSource = new V1ConfigMapNodeConfigSource();
        configSource.setResourceVersion(resourceVersion);
        assertThat(configSource.getResourceVersion(), is(equalTo(resourceVersion)));
    }

    //BaseRock generated method id: ${testUidWithDifferentValues}, hash: D4DE049C7B46262C947C2C79C9080662
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "uid", "test-uid" })
    void testUidWithDifferentValues(String uid) {
        V1ConfigMapNodeConfigSource configSource = new V1ConfigMapNodeConfigSource();
        configSource.setUid(uid);
        assertThat(configSource.getUid(), is(equalTo(uid)));
    }

    //BaseRock generated method id: ${testBuilder}, hash: 84B1F828AAC98B6BE7EA25258D99ABB2
    @Test
    void testBuilder() {
        V1ConfigMapNodeConfigSource configSource = new V1ConfigMapNodeConfigSource().kubeletConfigKey("key1").name("name1").namespace("namespace1").resourceVersion("rv1").uid("uid1");
        assertThat(configSource.getKubeletConfigKey(), is(equalTo("key1")));
        assertThat(configSource.getName(), is(equalTo("name1")));
        assertThat(configSource.getNamespace(), is(equalTo("namespace1")));
        assertThat(configSource.getResourceVersion(), is(equalTo("rv1")));
        assertThat(configSource.getUid(), is(equalTo("uid1")));
    }
}
